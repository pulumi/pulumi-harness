// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsCCConnectorCrossAccountAccessArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsCCConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final AwsCCConnectorState Empty = new AwsCCConnectorState();

    /**
     * The AWS account id.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The AWS account id.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    @Import(name="crossAccountAccess")
    private @Nullable Output<AwsCCConnectorCrossAccountAccessArgs> crossAccountAccess;

    /**
     * @return Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     * 
     */
    public Optional<Output<AwsCCConnectorCrossAccountAccessArgs>> crossAccountAccess() {
        return Optional.ofNullable(this.crossAccountAccess);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    @Import(name="featuresEnableds")
    private @Nullable Output<List<String>> featuresEnableds;

    /**
     * @return The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     * 
     */
    public Optional<Output<List<String>>> featuresEnableds() {
        return Optional.ofNullable(this.featuresEnableds);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    @Import(name="reportName")
    private @Nullable Output<String> reportName;

    /**
     * @return The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     * 
     */
    public Optional<Output<String>> reportName() {
        return Optional.ofNullable(this.reportName);
    }

    /**
     * The name of s3 bucket.
     * 
     */
    @Import(name="s3Bucket")
    private @Nullable Output<String> s3Bucket;

    /**
     * @return The name of s3 bucket.
     * 
     */
    public Optional<Output<String>> s3Bucket() {
        return Optional.ofNullable(this.s3Bucket);
    }

    /**
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AwsCCConnectorState() {}

    private AwsCCConnectorState(AwsCCConnectorState $) {
        this.accountId = $.accountId;
        this.crossAccountAccess = $.crossAccountAccess;
        this.description = $.description;
        this.featuresEnableds = $.featuresEnableds;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.reportName = $.reportName;
        this.s3Bucket = $.s3Bucket;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsCCConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsCCConnectorState $;

        public Builder() {
            $ = new AwsCCConnectorState();
        }

        public Builder(AwsCCConnectorState defaults) {
            $ = new AwsCCConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The AWS account id.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The AWS account id.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param crossAccountAccess Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(@Nullable Output<AwsCCConnectorCrossAccountAccessArgs> crossAccountAccess) {
            $.crossAccountAccess = crossAccountAccess;
            return this;
        }

        /**
         * @param crossAccountAccess Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(AwsCCConnectorCrossAccountAccessArgs crossAccountAccess) {
            return crossAccountAccess(Output.of(crossAccountAccess));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featuresEnableds The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(@Nullable Output<List<String>> featuresEnableds) {
            $.featuresEnableds = featuresEnableds;
            return this;
        }

        /**
         * @param featuresEnableds The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(List<String> featuresEnableds) {
            return featuresEnableds(Output.of(featuresEnableds));
        }

        /**
         * @param featuresEnableds The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
         * 
         * @return builder
         * 
         */
        public Builder featuresEnableds(String... featuresEnableds) {
            return featuresEnableds(List.of(featuresEnableds));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param reportName The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder reportName(@Nullable Output<String> reportName) {
            $.reportName = reportName;
            return this;
        }

        /**
         * @param reportName The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            return reportName(Output.of(reportName));
        }

        /**
         * @param s3Bucket The name of s3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * @param s3Bucket The name of s3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public AwsCCConnectorState build() {
            return $;
        }
    }

}