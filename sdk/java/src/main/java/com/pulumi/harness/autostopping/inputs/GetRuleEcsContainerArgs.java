// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.autostopping.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuleEcsContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRuleEcsContainerArgs Empty = new GetRuleEcsContainerArgs();

    /**
     * Name of cluster in which service belong to
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return Name of cluster in which service belong to
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * Region of cluster
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Region of cluster
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Name of service to be onboarded
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Name of service to be onboarded
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * Desired number of tasks on warming up a rule
     * 
     */
    @Import(name="taskCount")
    private @Nullable Output<Integer> taskCount;

    /**
     * @return Desired number of tasks on warming up a rule
     * 
     */
    public Optional<Output<Integer>> taskCount() {
        return Optional.ofNullable(this.taskCount);
    }

    private GetRuleEcsContainerArgs() {}

    private GetRuleEcsContainerArgs(GetRuleEcsContainerArgs $) {
        this.cluster = $.cluster;
        this.region = $.region;
        this.service = $.service;
        this.taskCount = $.taskCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleEcsContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleEcsContainerArgs $;

        public Builder() {
            $ = new GetRuleEcsContainerArgs();
        }

        public Builder(GetRuleEcsContainerArgs defaults) {
            $ = new GetRuleEcsContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster Name of cluster in which service belong to
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster Name of cluster in which service belong to
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param region Region of cluster
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region of cluster
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param service Name of service to be onboarded
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Name of service to be onboarded
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param taskCount Desired number of tasks on warming up a rule
         * 
         * @return builder
         * 
         */
        public Builder taskCount(@Nullable Output<Integer> taskCount) {
            $.taskCount = taskCount;
            return this;
        }

        /**
         * @param taskCount Desired number of tasks on warming up a rule
         * 
         * @return builder
         * 
         */
        public Builder taskCount(Integer taskCount) {
            return taskCount(Output.of(taskCount));
        }

        public GetRuleEcsContainerArgs build() {
            if ($.cluster == null) {
                throw new MissingRequiredPropertyException("GetRuleEcsContainerArgs", "cluster");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetRuleEcsContainerArgs", "region");
            }
            if ($.service == null) {
                throw new MissingRequiredPropertyException("GetRuleEcsContainerArgs", "service");
            }
            return $;
        }
    }

}
