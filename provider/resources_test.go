package harness

import (
	"testing"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/schema"
)

func TestTokenStrategyInfersUnknownModules(t *testing.T) {
	t.Parallel()

	prov := tfbridge.ProviderInfo{
		P: (&schema.Provider{
			ResourcesMap: schema.ResourceMap{
				"harness_platform_connector_aws": nil,
				"harness_newprefix_widget":       nil,
			},
			DataSourcesMap: schema.ResourceMap{
				"harness_platform_connector_aws": nil,
				"harness_newprefix_widget":       nil,
			},
		}).Shim(),
	}

	strategy, err := tokenStrategy(&prov)
	if err != nil {
		t.Fatalf("tokenStrategy() error = %v", err)
	}
	if err := prov.ComputeTokens(strategy); err != nil {
		t.Fatalf("ComputeTokens() error = %v", err)
	}

	if got := prov.Resources["harness_platform_connector_aws"]; got == nil ||
		got.Tok != "harness:platform/connectorAws:ConnectorAws" {
		t.Fatalf("known-module resource token mismatch: got %#v", got)
	}
	if got := prov.Resources["harness_newprefix_widget"]; got == nil ||
		got.Tok != "harness:index/newprefixWidget:NewprefixWidget" {
		t.Fatalf("expected inferred fallback resource token, got %#v", got)
	}

	if got := prov.DataSources["harness_platform_connector_aws"]; got == nil ||
		got.Tok != "harness:platform/getConnectorAws:getConnectorAws" {
		t.Fatalf("known-module data source token mismatch: got %#v", got)
	}
	if got := prov.DataSources["harness_newprefix_widget"]; got == nil ||
		got.Tok != "harness:index/newprefixWidget:NewprefixWidget" {
		t.Fatalf("expected inferred fallback data source token, got %#v", got)
	}
}
