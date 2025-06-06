// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
func GetAccountId(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:accountId")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "HARNESS_ACCOUNT_ID"); d != nil {
		value = d.(string)
	}
	return value
}

// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
// create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
func GetApiKey(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:apiKey")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "HARNESS_API_KEY"); d != nil {
		value = d.(string)
	}
	return value
}

// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
// `HARNESS_ENDPOINT` environment variable.
func GetEndpoint(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:endpoint")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "HARNESS_ENDPOINT"); d != nil {
		value = d.(string)
	}
	return value
}

// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
// variable. For more information to create an API key in NextGen, see
// https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
func GetPlatformApiKey(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:platformApiKey")
	if err == nil {
		return v
	}
	var value string
	if d := internal.GetEnvOrDefault(nil, nil, "HARNESS_PLATFORM_API_KEY"); d != nil {
		value = d.(string)
	}
	return value
}
