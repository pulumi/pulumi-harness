// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getAccountId(t *testing.T) string {
	name := os.Getenv("HARNESS_ACCOUNT_ID")
	if name == "" {
		t.Skipf("Skipping test due to missing HARNESS_ACCOUNT_ID environment variable")
	}

	return name
}

func getPlatformApiKey(t *testing.T) string {
	name := os.Getenv("HARNESS_PLATFORM_API_KEY")
	if name == "" {
		t.Skipf("Skipping test due to missing HARNESS_PLATFORM_API_KEY environment variable")
	}

	return name
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	account_id := getAccountId(t)
	platform_api_key := getPlatformApiKey(t)
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"account_id": account_id,
			"platform_api_ket": platform_api_key,
		},
	}
}