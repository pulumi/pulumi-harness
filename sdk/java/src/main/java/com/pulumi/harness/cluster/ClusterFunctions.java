// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cluster;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.cluster.inputs.GetOrchestratorArgs;
import com.pulumi.harness.cluster.inputs.GetOrchestratorPlainArgs;
import com.pulumi.harness.cluster.outputs.GetOrchestratorResult;
import java.util.concurrent.CompletableFuture;

public final class ClusterFunctions {
    /**
     * Data source for retrieving a Harness ClusterOrchestrator.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.harness.cluster.ClusterFunctions;
     * import com.pulumi.harness.cluster.inputs.GetOrchestratorArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = ClusterFunctions.getOrchestrator(GetOrchestratorArgs.builder()
     *             .identifier("identifier")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOrchestratorResult> getOrchestrator(GetOrchestratorArgs args) {
        return getOrchestrator(args, InvokeOptions.Empty);
    }
    /**
     * Data source for retrieving a Harness ClusterOrchestrator.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.harness.cluster.ClusterFunctions;
     * import com.pulumi.harness.cluster.inputs.GetOrchestratorArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = ClusterFunctions.getOrchestrator(GetOrchestratorArgs.builder()
     *             .identifier("identifier")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOrchestratorResult> getOrchestratorPlain(GetOrchestratorPlainArgs args) {
        return getOrchestratorPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for retrieving a Harness ClusterOrchestrator.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.harness.cluster.ClusterFunctions;
     * import com.pulumi.harness.cluster.inputs.GetOrchestratorArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = ClusterFunctions.getOrchestrator(GetOrchestratorArgs.builder()
     *             .identifier("identifier")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetOrchestratorResult> getOrchestrator(GetOrchestratorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("harness:cluster/getOrchestrator:getOrchestrator", TypeShape.of(GetOrchestratorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for retrieving a Harness ClusterOrchestrator.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.harness.cluster.ClusterFunctions;
     * import com.pulumi.harness.cluster.inputs.GetOrchestratorArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = ClusterFunctions.getOrchestrator(GetOrchestratorArgs.builder()
     *             .identifier("identifier")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetOrchestratorResult> getOrchestratorPlain(GetOrchestratorPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("harness:cluster/getOrchestrator:getOrchestrator", TypeShape.of(GetOrchestratorResult.class), args, Utilities.withVersion(options));
    }
}