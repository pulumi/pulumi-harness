// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.TemplateArgs;
import com.pulumi.harness.platform.inputs.TemplateState;
import com.pulumi.harness.platform.outputs.TemplateGitDetails;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Template.
 * 
 * ## Remote Pipeline template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;pipeline_template_remote&#34; {
 *   identifier = &#34;identifier&#34;
 *   org_id     = harness_platform_project.test.org_id
 *   project_id = harness_platform_project.test.id
 *   name       = &#34;name&#34;
 *   comments   = &#34;comments&#34;
 *   version    = &#34;ab&#34;
 *   is_stable  = true
 *   git_details {
 *     branch_name    = &#34;main&#34;
 *     commit_message = &#34;Commit&#34;
 *     file_path      = &#34;file_path&#34;
 *     connector_ref  = &#34;account.connector_ref&#34;
 *     store_type     = &#34;REMOTE&#34;
 *     repo_name      = &#34;repo_name&#34;
 *   }
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Pipeline
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     stages:
 *       - stage:
 *           identifier: dvvdvd
 *           name: dvvdvd
 *           description: &#34;&#34;
 *           type: Deployment
 *           spec:
 *             deploymentType: Kubernetes
 *             service:
 *               serviceRef: &lt;+input&gt;
 *               serviceInputs: &lt;+input&gt;
 *             environment:
 *               environmentRef: &lt;+input&gt;
 *               deployToAll: false
 *               environmentInputs: &lt;+input&gt;
 *               serviceOverrideInputs: &lt;+input&gt;
 *               infrastructureDefinitions: &lt;+input&gt;
 *             execution:
 *               steps:
 *                 - step:
 *                     name: Rollout Deployment
 *                     identifier: rolloutDeployment
 *                     type: K8sRollingDeploy
 *                     timeout: 10m
 *                     spec:
 *                       skipDryRun: false
 *                       pruningEnabled: false
 *               rollbackSteps:
 *                 - step:
 *                     name: Rollback Rollout Deployment
 *                     identifier: rollbackRolloutDeployment
 *                     type: K8sRollingRollback
 *                     timeout: 10m
 *                     spec:
 *                       pruningEnabled: false
 *           tags: {}
 *           failureStrategies:
 *             - onFailure:
 *                 errors:
 *                   - AllErrors
 *                 action:
 *                   type: StageRollback
 * 
 *   EOT
 * }
 * 
 * ## Inline Pipeline template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;pipeline_template_inline&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Pipeline
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     stages:
 *       - stage:
 *           identifier: dvvdvd
 *           name: dvvdvd
 *           description: &#34;&#34;
 *           type: Deployment
 *           spec:
 *             deploymentType: Kubernetes
 *             service:
 *               serviceRef: &lt;+input&gt;
 *               serviceInputs: &lt;+input&gt;
 *             environment:
 *               environmentRef: &lt;+input&gt;
 *               deployToAll: false
 *               environmentInputs: &lt;+input&gt;
 *               serviceOverrideInputs: &lt;+input&gt;
 *               infrastructureDefinitions: &lt;+input&gt;
 *             execution:
 *               steps:
 *                 - step:
 *                     name: Rollout Deployment
 *                     identifier: rolloutDeployment
 *                     type: K8sRollingDeploy
 *                     timeout: 10m
 *                     spec:
 *                       skipDryRun: false
 *                       pruningEnabled: false
 *               rollbackSteps:
 *                 - step:
 *                     name: Rollback Rollout Deployment
 *                     identifier: rollbackRolloutDeployment
 *                     type: K8sRollingRollback
 *                     timeout: 10m
 *                     spec:
 *                       pruningEnabled: false
 *           tags: {}
 *           failureStrategies:
 *             - onFailure:
 *                 errors:
 *                   - AllErrors
 *                 action:
 *                   type: StageRollback
 * 
 *   EOT
 * }
 * 
 * ## Inline Step template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;step_template_inline&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Step
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     timeout: 10m
 *     type: ShellScript
 *     spec:
 *       shell: Bash
 *       onDelegate: true
 *       source:
 *         type: Inline
 *         spec:
 *           script: &lt;+input&gt;
 *       environmentVariables: []
 *       outputVariables: []
 * 
 *   EOT
 * }
 * 
 * ## Remote Step template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;step_template_remote&#34; {
 *   identifier = &#34;identifier&#34;
 *   org_id     = harness_platform_project.test.org_id
 *   project_id = harness_platform_project.test.id
 *   name       = &#34;name&#34;
 *   comments   = &#34;comments&#34;
 *   version    = &#34;ab&#34;
 *   is_stable  = true
 *   git_details {
 *     branch_name    = &#34;main&#34;
 *     commit_message = &#34;Commit&#34;
 *     file_path      = &#34;file_path&#34;
 *     connector_ref  = &#34;account.connector_ref&#34;
 *     store_type     = &#34;REMOTE&#34;
 *     repo_name      = &#34;repo_name&#34;
 *   }
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Step
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     timeout: 10m
 *     type: ShellScript
 *     spec:
 *       shell: Bash
 *       onDelegate: true
 *       source:
 *         type: Inline
 *         spec:
 *           script: &lt;+input&gt;
 *       environmentVariables: []
 *       outputVariables: []
 * 
 *   EOT
 * }
 * 
 * ## Inline Stage template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;stage_template_inline&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Stage
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     type: Deployment
 *     spec:
 *       deploymentType: Kubernetes
 *       service:
 *         serviceRef: &lt;+input&gt;
 *         serviceInputs: &lt;+input&gt;
 *       environment:
 *         environmentRef: &lt;+input&gt;
 *         deployToAll: false
 *         environmentInputs: &lt;+input&gt;
 *         infrastructureDefinitions: &lt;+input&gt;
 *       execution:
 *         steps:
 *           - step:
 *               type: ShellScript
 *               name: Shell Script_1
 *               identifier: ShellScript_1
 *               spec:
 *                 shell: Bash
 *                 onDelegate: true
 *                 source:
 *                   type: Inline
 *                   spec:
 *                     script: &lt;+input&gt;
 *                 environmentVariables: []
 *                 outputVariables: []
 *               timeout: &lt;+input&gt;
 *         rollbackSteps: []
 *     failureStrategies:
 *       - onFailure:
 *           errors:
 *             - AllErrors
 *           action:
 *             type: StageRollback
 * 
 *   EOT
 * }
 * 
 * ## Remote Stage template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;stage_template_remote&#34; {
 *   identifier = &#34;identifier&#34;
 *   org_id     = harness_platform_project.test.org_id
 *   project_id = harness_platform_project.test.id
 *   name       = &#34;name&#34;
 *   comments   = &#34;comments&#34;
 *   version    = &#34;ab&#34;
 *   is_stable  = true
 *   git_details {
 *     branch_name    = &#34;main&#34;
 *     commit_message = &#34;Commit&#34;
 *     file_path      = &#34;file_path&#34;
 *     connector_ref  = &#34;account.connector_ref&#34;
 *     store_type     = &#34;REMOTE&#34;
 *     repo_name      = &#34;repo_name&#34;
 *   }
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: Stage
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     type: Deployment
 *     spec:
 *       deploymentType: Kubernetes
 *       service:
 *         serviceRef: &lt;+input&gt;
 *         serviceInputs: &lt;+input&gt;
 *       environment:
 *         environmentRef: &lt;+input&gt;
 *         deployToAll: false
 *         environmentInputs: &lt;+input&gt;
 *         infrastructureDefinitions: &lt;+input&gt;
 *       execution:
 *         steps:
 *           - step:
 *               type: ShellScript
 *               name: Shell Script_1
 *               identifier: ShellScript_1
 *               spec:
 *                 shell: Bash
 *                 onDelegate: true
 *                 source:
 *                   type: Inline
 *                   spec:
 *                     script: &lt;+input&gt;
 *                 environmentVariables: []
 *                 outputVariables: []
 *               timeout: &lt;+input&gt;
 *         rollbackSteps: []
 *     failureStrategies:
 *       - onFailure:
 *           errors:
 *             - AllErrors
 *           action:
 *             type: StageRollback
 * 
 *   EOT
 * }
 * 
 * ## Inline StepGroup template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;stepgroup_template_inline&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: StepGroup
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     stageType: Deployment
 *     steps:
 *       - step:
 *           type: ShellScript
 *           name: Shell Script_1
 *           identifier: ShellScript_1
 *           spec:
 *             shell: Bash
 *             onDelegate: true
 *             source:
 *               type: Inline
 *               spec:
 *                 script: &lt;+input&gt;
 *             environmentVariables: []
 *             outputVariables: []
 *           timeout: 10m
 * 
 *   EOT
 * }
 * 
 * ## Remote StepGroup template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;stepgroup_template_remote&#34; {
 *   identifier = &#34;identifier&#34;
 *   org_id     = harness_platform_project.test.org_id
 *   project_id = harness_platform_project.test.id
 *   name       = &#34;name&#34;
 *   comments   = &#34;comments&#34;
 *   version    = &#34;ab&#34;
 *   is_stable  = true
 *   git_details {
 *     branch_name    = &#34;main&#34;
 *     commit_message = &#34;Commit&#34;
 *     file_path      = &#34;file_path&#34;
 *     connector_ref  = &#34;account.connector_ref&#34;
 *     store_type     = &#34;REMOTE&#34;
 *     repo_name      = &#34;repo_name&#34;
 *   }
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: StepGroup
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     stageType: Deployment
 *     steps:
 *       - step:
 *           type: ShellScript
 *           name: Shell Script_1
 *           identifier: ShellScript_1
 *           spec:
 *             shell: Bash
 *             onDelegate: true
 *             source:
 *               type: Inline
 *               spec:
 *                 script: &lt;+input&gt;
 *             environmentVariables: []
 *             outputVariables: []
 *           timeout: 10m
 * 
 *   EOT
 * }
 * 
 * ## Inline Monitered Service template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;monitered_service_template_inline&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: MonitoredService
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     serviceRef: &lt;+input&gt;
 *     environmentRef: &lt;+input&gt;
 *     type: Application
 *     sources:
 *       changeSources:
 *         - name: Harness CD Next Gen
 *           identifier: harness_cd_next_gen
 *           type: HarnessCDNextGen
 *           enabled: true
 *           category: Deployment
 *           spec: {}
 *       healthSources:
 *         - name: health
 *           identifier: health
 *           type: AppDynamics
 *           spec:
 *             applicationName: &lt;+input&gt;
 *             tierName: &lt;+input&gt;
 *             metricData:
 *               Errors: true
 *               Performance: true
 *             metricDefinitions: []
 *             feature: Application Monitoring
 *             connectorRef: &lt;+input&gt;
 *             metricPacks:
 *               - identifier: Errors
 *               - identifier: Performance
 * 
 *   EOT
 * }
 * 
 * ## Artifact Source template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;artifact_source_template&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: ArtifactSource
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     type: DockerRegistry
 *     spec:
 *       imagePath: library/nginx
 *       tag: &lt;+input&gt;
 *       connectorRef: account.Harness_DockerHub
 * 
 *   EOT
 * }
 * 
 * ## Deployment template
 * 
 * resource &#34;harness.platform.Template&#34; &#34;deployment_template&#34; {
 *   identifier    = &#34;identifier&#34;
 *   org_id        = harness_platform_project.test.org_id
 *   project_id    = harness_platform_project.test.id
 *   name          = &#34;name&#34;
 *   comments      = &#34;comments&#34;
 *   version       = &#34;ab&#34;
 *   is_stable     = true
 *   template_yaml = &lt;&lt;-EOT
 * template:
 *   name: &#34;name&#34;
 *   identifier: &#34;identifier&#34;
 *   versionLabel: &#34;ab&#34;
 *   type: CustomDeployment
 *   projectIdentifier: ${harness_platform_project.test.id}
 *   orgIdentifier: ${harness_platform_project.test.org_id}
 *   tags: {}
 *   spec:
 *     infrastructure:
 *       variables:
 *         - name: kubeConnector
 *           type: Connector
 *           value: &lt;+input&gt;
 *           description: &#34;&#34;
 *       fetchInstancesScript:
 *         store:
 *           type: Inline
 *           spec:
 *             content: |
 *               #
 *               # Script is expected to query Infrastructure and dump json
 *               # in $INSTANCE_OUTPUT_PATH file path
 *               #
 *               # Harness is expected to initialize ${INSTANCE_OUTPUT_PATH}
 *               # environment variable - a random unique file path on delegate,
 *               # so script execution can save the result.
 *               #
 *               /opt/harness-delegate/client-tools/kubectl/v1.19.2/kubectl get pods --namespace=harness-delegate-ng -o json &gt; $INSTANCE_OUTPUT_PATH
 *       instanceAttributes:
 *         - name: instancename
 *           jsonPath: metadata.name
 *           description: &#34;&#34;
 *       instancesListPath: items
 *     execution:
 *       stepTemplateRefs: []
 * 
 *   EOT
 * }
 * 
 * ## Import
 * 
 * Import account level template
 * 
 * ```sh
 *  $ pulumi import harness:platform/template:Template example &lt;template_id&gt;
 * ```
 * 
 *  Import org level template
 * 
 * ```sh
 *  $ pulumi import harness:platform/template:Template example &lt;ord_id&gt;/&lt;template_id&gt;
 * ```
 * 
 *  Import project level template
 * 
 * ```sh
 *  $ pulumi import harness:platform/template:Template example &lt;org_id&gt;/&lt;project_id&gt;/&lt;template_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/template:Template")
public class Template extends com.pulumi.resources.CustomResource {
    /**
     * Specify comment with respect to changes.
     * 
     */
    @Export(name="comments", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comments;

    /**
     * @return Specify comment with respect to changes.
     * 
     */
    public Output<Optional<String>> comments() {
        return Codegen.optional(this.comments);
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable this flag for force deletion of template
     * 
     */
    @Export(name="forceDelete", refs={String.class}, tree="[0]")
    private Output<String> forceDelete;

    /**
     * @return Enable this flag for force deletion of template
     * 
     */
    public Output<String> forceDelete() {
        return this.forceDelete;
    }
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    @Export(name="gitDetails", refs={TemplateGitDetails.class}, tree="[0]")
    private Output<TemplateGitDetails> gitDetails;

    /**
     * @return Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    public Output<TemplateGitDetails> gitDetails() {
        return this.gitDetails;
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * True if given version for template to be set as stable.
     * 
     */
    @Export(name="isStable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isStable;

    /**
     * @return True if given version for template to be set as stable.
     * 
     */
    public Output<Optional<Boolean>> isStable() {
        return Codegen.optional(this.isStable);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Yaml for creating new Template. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="templateYaml", refs={String.class}, tree="[0]")
    private Output<String> templateYaml;

    /**
     * @return Yaml for creating new Template. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> templateYaml() {
        return this.templateYaml;
    }
    /**
     * Version Label for Template.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> version;

    /**
     * @return Version Label for Template.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Template(String name) {
        this(name, TemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Template(String name, TemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Template(String name, TemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/template:Template", name, args == null ? TemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Template(String name, Output<String> id, @Nullable TemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/template:Template", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Template get(String name, Output<String> id, @Nullable TemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Template(name, id, state, options);
    }
}