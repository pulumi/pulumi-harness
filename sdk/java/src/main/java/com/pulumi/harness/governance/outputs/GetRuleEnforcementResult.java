// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRuleEnforcementResult {
    /**
     * @return The cloud provider for the rule enforcement.
     * 
     */
    private String cloudProvider;
    /**
     * @return Description for rule enforcement.
     * 
     */
    private String description;
    /**
     * @return Id of rule enforcement.
     * 
     */
    private String enforcementId;
    /**
     * @return Execution schedule in cron format.
     * 
     */
    private String executionSchedule;
    /**
     * @return Timezone for the execution schedule.
     * 
     */
    private String executionTimezone;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Indicates if the rule enforcement is a dry run.
     * 
     */
    private Boolean isDryRun;
    /**
     * @return Indicates if the rule enforcement is enabled.
     * 
     */
    private Boolean isEnabled;
    /**
     * @return Name of the rule enforcement.
     * 
     */
    private String name;
    /**
     * @return List of rule IDs.
     * 
     */
    private Map<String,String> ruleIds;
    /**
     * @return List of rule set IDs.
     * 
     */
    private Map<String,String> ruleSetIds;
    /**
     * @return List of target accounts.
     * 
     */
    private List<String> targetAccounts;
    /**
     * @return List of target regions.
     * 
     */
    private List<String> targetRegions;

    private GetRuleEnforcementResult() {}
    /**
     * @return The cloud provider for the rule enforcement.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return Description for rule enforcement.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Id of rule enforcement.
     * 
     */
    public String enforcementId() {
        return this.enforcementId;
    }
    /**
     * @return Execution schedule in cron format.
     * 
     */
    public String executionSchedule() {
        return this.executionSchedule;
    }
    /**
     * @return Timezone for the execution schedule.
     * 
     */
    public String executionTimezone() {
        return this.executionTimezone;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates if the rule enforcement is a dry run.
     * 
     */
    public Boolean isDryRun() {
        return this.isDryRun;
    }
    /**
     * @return Indicates if the rule enforcement is enabled.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return Name of the rule enforcement.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of rule IDs.
     * 
     */
    public Map<String,String> ruleIds() {
        return this.ruleIds;
    }
    /**
     * @return List of rule set IDs.
     * 
     */
    public Map<String,String> ruleSetIds() {
        return this.ruleSetIds;
    }
    /**
     * @return List of target accounts.
     * 
     */
    public List<String> targetAccounts() {
        return this.targetAccounts;
    }
    /**
     * @return List of target regions.
     * 
     */
    public List<String> targetRegions() {
        return this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleEnforcementResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String description;
        private String enforcementId;
        private String executionSchedule;
        private String executionTimezone;
        private String id;
        private Boolean isDryRun;
        private Boolean isEnabled;
        private String name;
        private Map<String,String> ruleIds;
        private Map<String,String> ruleSetIds;
        private List<String> targetAccounts;
        private List<String> targetRegions;
        public Builder() {}
        public Builder(GetRuleEnforcementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.description = defaults.description;
    	      this.enforcementId = defaults.enforcementId;
    	      this.executionSchedule = defaults.executionSchedule;
    	      this.executionTimezone = defaults.executionTimezone;
    	      this.id = defaults.id;
    	      this.isDryRun = defaults.isDryRun;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.ruleIds = defaults.ruleIds;
    	      this.ruleSetIds = defaults.ruleSetIds;
    	      this.targetAccounts = defaults.targetAccounts;
    	      this.targetRegions = defaults.targetRegions;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            if (cloudProvider == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "cloudProvider");
            }
            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enforcementId(String enforcementId) {
            if (enforcementId == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "enforcementId");
            }
            this.enforcementId = enforcementId;
            return this;
        }
        @CustomType.Setter
        public Builder executionSchedule(String executionSchedule) {
            if (executionSchedule == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "executionSchedule");
            }
            this.executionSchedule = executionSchedule;
            return this;
        }
        @CustomType.Setter
        public Builder executionTimezone(String executionTimezone) {
            if (executionTimezone == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "executionTimezone");
            }
            this.executionTimezone = executionTimezone;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isDryRun(Boolean isDryRun) {
            if (isDryRun == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "isDryRun");
            }
            this.isDryRun = isDryRun;
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(Boolean isEnabled) {
            if (isEnabled == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "isEnabled");
            }
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ruleIds(Map<String,String> ruleIds) {
            if (ruleIds == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "ruleIds");
            }
            this.ruleIds = ruleIds;
            return this;
        }
        @CustomType.Setter
        public Builder ruleSetIds(Map<String,String> ruleSetIds) {
            if (ruleSetIds == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "ruleSetIds");
            }
            this.ruleSetIds = ruleSetIds;
            return this;
        }
        @CustomType.Setter
        public Builder targetAccounts(List<String> targetAccounts) {
            if (targetAccounts == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "targetAccounts");
            }
            this.targetAccounts = targetAccounts;
            return this;
        }
        public Builder targetAccounts(String... targetAccounts) {
            return targetAccounts(List.of(targetAccounts));
        }
        @CustomType.Setter
        public Builder targetRegions(List<String> targetRegions) {
            if (targetRegions == null) {
              throw new MissingRequiredPropertyException("GetRuleEnforcementResult", "targetRegions");
            }
            this.targetRegions = targetRegions;
            return this;
        }
        public Builder targetRegions(String... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }
        public GetRuleEnforcementResult build() {
            final var _resultValue = new GetRuleEnforcementResult();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.description = description;
            _resultValue.enforcementId = enforcementId;
            _resultValue.executionSchedule = executionSchedule;
            _resultValue.executionTimezone = executionTimezone;
            _resultValue.id = id;
            _resultValue.isDryRun = isDryRun;
            _resultValue.isEnabled = isEnabled;
            _resultValue.name = name;
            _resultValue.ruleIds = ruleIds;
            _resultValue.ruleSetIds = ruleSetIds;
            _resultValue.targetAccounts = targetAccounts;
            _resultValue.targetRegions = targetRegions;
            return _resultValue;
        }
    }
}
