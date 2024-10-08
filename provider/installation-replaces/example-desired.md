Configure the Harness provider for First Gen resources
```terraform
provider "harness" {
  endpoint   = "https://app.harness.io/gateway"
  account_id = "...."
  api_key    = "......"
}
```

Configure the Harness provider for Next Gen resources
```terraform
provider "harness" {
  endpoint         = "https://app.harness.io/gateway"
  account_id       = "...."
  platform_api_key = "......"
}
```