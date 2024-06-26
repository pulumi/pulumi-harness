// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ManualFreezeFreezeWindowRecurrenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManualFreezeFreezeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManualFreezeFreezeWindowArgs Empty = new ManualFreezeFreezeWindowArgs();

    /**
     * Duration of the freeze
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return Duration of the freeze
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * End time of the freeze
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return End time of the freeze
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Recurrence of the freeze window
     * 
     */
    @Import(name="recurrences")
    private @Nullable Output<List<ManualFreezeFreezeWindowRecurrenceArgs>> recurrences;

    /**
     * @return Recurrence of the freeze window
     * 
     */
    public Optional<Output<List<ManualFreezeFreezeWindowRecurrenceArgs>>> recurrences() {
        return Optional.ofNullable(this.recurrences);
    }

    /**
     * Start time of the freeze
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start time of the freeze
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Timezone
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Timezone
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ManualFreezeFreezeWindowArgs() {}

    private ManualFreezeFreezeWindowArgs(ManualFreezeFreezeWindowArgs $) {
        this.duration = $.duration;
        this.endTime = $.endTime;
        this.recurrences = $.recurrences;
        this.startTime = $.startTime;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualFreezeFreezeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualFreezeFreezeWindowArgs $;

        public Builder() {
            $ = new ManualFreezeFreezeWindowArgs();
        }

        public Builder(ManualFreezeFreezeWindowArgs defaults) {
            $ = new ManualFreezeFreezeWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Duration of the freeze
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Duration of the freeze
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param endTime End time of the freeze
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime End time of the freeze
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param recurrences Recurrence of the freeze window
         * 
         * @return builder
         * 
         */
        public Builder recurrences(@Nullable Output<List<ManualFreezeFreezeWindowRecurrenceArgs>> recurrences) {
            $.recurrences = recurrences;
            return this;
        }

        /**
         * @param recurrences Recurrence of the freeze window
         * 
         * @return builder
         * 
         */
        public Builder recurrences(List<ManualFreezeFreezeWindowRecurrenceArgs> recurrences) {
            return recurrences(Output.of(recurrences));
        }

        /**
         * @param recurrences Recurrence of the freeze window
         * 
         * @return builder
         * 
         */
        public Builder recurrences(ManualFreezeFreezeWindowRecurrenceArgs... recurrences) {
            return recurrences(List.of(recurrences));
        }

        /**
         * @param startTime Start time of the freeze
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time of the freeze
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param timeZone Timezone
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Timezone
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ManualFreezeFreezeWindowArgs build() {
            return $;
        }
    }

}
