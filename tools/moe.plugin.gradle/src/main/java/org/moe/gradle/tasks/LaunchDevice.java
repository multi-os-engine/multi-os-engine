package org.moe.gradle.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.DeviceLauncherBuilder;
import org.moe.gradle.utils.DeviceLauncherBuilder.InstallMode;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.JUnitTestCollector;
import org.moe.gradle.utils.LaunchOptions;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public abstract class LaunchDevice extends AbstractBaseTask {

    private static final String CONVENTION_JUNIT_OUTPUT_DIRECTORY = "jUnitOutputDirectory";

    private static final String MOE_LAUNCHER_DEVICE_UDID_PROPERTY = "moe.launcher.devices";

    @Nullable
    private Object jUnitOutputDirectory;

    @OutputDirectory
    public File getJUnitOutputDirectory() {
        return getProject().file(getOrConvention(jUnitOutputDirectory, CONVENTION_JUNIT_OUTPUT_DIRECTORY));
    }

    @IgnoreUnused
    public void setJUnitOutputDirectory(@Nullable Object jUnitOutputDirectory) {
        this.jUnitOutputDirectory = jUnitOutputDirectory;
    }

    private boolean isTest;
    private List<String> devices;
    private LaunchOptions launchOptions;
    private XcodeBuild xcodeBuildDevice;

    @Override
    protected void run() {
        if (!launchOptions.isLaunch() && !launchOptions.isInstallOnTarget())
            throw new GradleException("Nothing to do - neither launch nor install on target");

        File jUnitOutputDirectory = getJUnitOutputDirectory();
        try {
            FileUtils.deleteFileOrFolder(jUnitOutputDirectory);

            if (!jUnitOutputDirectory.exists() && !jUnitOutputDirectory.mkdirs())
                throw new GradleException("Failed to create directory " + jUnitOutputDirectory);
            if (jUnitOutputDirectory.exists() && !jUnitOutputDirectory.isDirectory())
                throw new GradleException("Expected directory at " + jUnitOutputDirectory);

        } catch (IOException e) {
            throw new GradleException("an IOException occurred", e);
        }

        List<String> devicesToLaunch = new ArrayList<>(devices);

        if (devicesToLaunch.isEmpty())
            devicesToLaunch.add(null);
        final AtomicInteger numFailedTests = new AtomicInteger();

        for (String udid : devicesToLaunch) {
            // Get proper Xcode settings
            final Map<String, String> settings;
            if (xcodeBuildDevice.getDidWork()) {
                settings = xcodeBuildDevice.getXcodeBuildSettings();
            } else {
                settings = xcodeBuildDevice.getCachedXcodeBuildSettings();
            }

            // Get app path
            String productName = settings.get("FULL_PRODUCT_NAME");
            if (settings.get("FULL_PRODUCT_NAME").endsWith("Tests.xctest")) {
                productName = productName.replace("Tests.xctest", ".app");
            }
            final File appPath = new File(settings.get("BUILT_PRODUCTS_DIR"), productName);

            final JUnitTestCollector testCollector;
            if (isTest && !launchOptions.isRawTestOutput() && launchOptions.isLaunch()) {
                testCollector = new JUnitTestCollector();
            } else {
                testCollector = null;
            }

            getExecOperations().javaexec(exec -> {
                // Create device launcher
                final DeviceLauncherBuilder builder = new DeviceLauncherBuilder().setWaitForDevice(launchOptions.isWaitForDevice());
                if (udid != null) {
                    builder.setUDID(udid);
                }
                if (launchOptions.getDebug() != null) {
                    builder.setDebug(launchOptions.getDebug().getLocal(), launchOptions.getDebug().getRemote());
                }
                if (launchOptions.isInstallOnTarget() && !launchOptions.isLaunch()) {
                    builder.setInstallMode(InstallMode.UPGRADE_ONLY);
                } else if (!launchOptions.isInstallOnTarget() && launchOptions.isLaunch()) {
                    builder.setInstallMode(InstallMode.RUN_ONLY);
                }
                launchOptions.getEnvs().forEach(builder::putEnvVar);
                launchOptions.getVMArgs().forEach(builder::addLaunchArgs);
                builder.addLaunchArgs("-args");
                launchOptions.getArgs().forEach(builder::addLaunchArgs);
                launchOptions.getProxies().forEach(p -> builder.addProxyPort(p.getLocal(), p.getRemote()));
                builder.setAppPath(appPath)
                        .build(getMoeSDK(), exec);

                execConfigOutput(exec, testCollector);
            });

            if (testCollector != null) {
                numFailedTests.getAndAdd(testCollector.getNumFailures() + testCollector.getNumErrors());
                testCollector.writeJUnitReport(udid == null ? "unknown-device" : udid, jUnitOutputDirectory);
            }
        }

        if (isTest) {
            if (numFailedTests.get() > 0) {
                throw new GradleException(numFailedTests.get() + " tests failed on all targets combined, reports can be found here: " + jUnitOutputDirectory);
            }
        }
    }

    protected void setupMoeTask(@NotNull SourceSet sourceSet) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        getOutputs().upToDateWhen(t -> false);

        final Path out = Paths.get(MoePlugin.MOE);

        this.isTest = sourceSet.getName().equals(SourceSet.TEST_SOURCE_SET_NAME);
        this.launchOptions = new LaunchOptions();
        this.launchOptions.read(getProject());
        this.xcodeBuildDevice = getMoePlugin().getTaskBy(XcodeBuild.class, sourceSet, launchOptions.getMode(), getMoePlugin().getExtension().getPlatformType());


        this.devices = new ArrayList<>();
        if (getProject().hasProperty(MOE_LAUNCHER_DEVICE_UDID_PROPERTY)) {
            Arrays.stream(((String) getProject().property(MOE_LAUNCHER_DEVICE_UDID_PROPERTY)).split(Pattern.quote(",")))
                    .map(String::trim)
                    .forEach(devices::add);
        }

        if (launchOptions.isBuild())
            dependsOn(xcodeBuildDevice);
        mustRunAfter(xcodeBuildDevice);

        addConvention(CONVENTION_JUNIT_OUTPUT_DIRECTORY, () -> resolvePathInBuildDir(out, "reports"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "LaunchDevice.log"));
    }
}
