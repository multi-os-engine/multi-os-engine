package org.moe.gradle.tasks;

import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.moe.common.utils.SimCtl;
import org.moe.gradle.MoePlugin;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public abstract class ListSimulators extends AbstractBaseTask {

    @Override
    protected void run() {
        if (!Os.isFamily(Os.FAMILY_MAC))
        {
            getLogger().quiet("\nAvailable Simulators:\n\n");
        }
        else
        {
            final String list;
            getLogger().info("Initializing");
            try {
                list = SimCtl.getDevices().stream()
                        .map(d -> "- " + d)
                        .collect(Collectors.joining("\n"));
            } catch (Throwable t) {
                throw new GradleException("Failed to get list of simulators", t);
            }

            getLogger().quiet("\nAvailable Simulators:\n" + list.trim() + "\n");
        }
    }

    protected void setupMoeTask() {
        getOutputs().upToDateWhen(t -> false);
        setSupportsRemoteBuild(false);

        final Path out = Paths.get(MoePlugin.MOE);

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "ListSimulators.log"));

    }
}
