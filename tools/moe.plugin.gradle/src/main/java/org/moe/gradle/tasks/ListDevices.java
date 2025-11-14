package org.moe.gradle.tasks;

import org.apache.commons.io.output.NullOutputStream;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.utils.DeviceLauncherBuilder;

import java.io.ByteArrayOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ListDevices extends AbstractBaseTask {

    @Override
    protected void run() {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        getExecOperations().javaexec(exec -> {
            new DeviceLauncherBuilder().setList(true).build(getMoeSDK(), exec);

            exec.setIgnoreExitValue(true);
            exec.setStandardOutput(baos);
            exec.setErrorOutput(new NullOutputStream());
        });

        getLogger().quiet("\n" + baos.toString().trim() + "\n");
    }

    protected void setupMoeTask() {
        getOutputs().upToDateWhen(t -> false);
        setSupportsRemoteBuild(false);

        final Path out = Paths.get(MoePlugin.MOE);

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "ListDevices.log"));
    }
}
