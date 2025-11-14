package org.moe.gradle.tasks;

import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SourceSet;
import org.moe.common.utils.SimCtl;
import org.moe.common.utils.SimCtl.Device;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public abstract class LaunchSimulator extends AbstractBaseTask {

    private static final String CONVENTION_JUNIT_OUTPUT_DIRECTORY = "jUnitOutputDirectory";

    private static final String MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY = "moe.launcher.simulators";

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
    private List<String> simulators;
    private LaunchOptions launchOptions;
    private XcodeBuild xcodeBuildSimulator;

    @Override
    protected void run() {
        if (!Os.isFamily(Os.FAMILY_MAC))
            throw new GradleException("Only a mac host can launch simulators");

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

        List<String> simulatorsToLaunch = new ArrayList<>(simulators);

        if (simulatorsToLaunch.isEmpty()) {
            List<Device> simDevices;
            try {
                simDevices = SimCtl.getDevices();
            } catch (Exception e) {
                throw new GradleException("Cannot get simulators list", e);
            }

            if (simDevices.isEmpty())
                throw new GradleException("Received empty simulator list");

            simulatorsToLaunch.add(simDevices.get(0).udid);
        }

        final AtomicInteger numFailedTests = new AtomicInteger();
        for (String udid : simulatorsToLaunch) {
            // Get proper Xcode settings
            final Map<String, String> settings;
            if (xcodeBuildSimulator.getDidWork()) {
                settings = xcodeBuildSimulator.getXcodeBuildSettings();
            } else {
                settings = xcodeBuildSimulator.getCachedXcodeBuildSettings();
            }

            // Get app path
            String productName = settings.get("FULL_PRODUCT_NAME");
            if (settings.get("FULL_PRODUCT_NAME").endsWith("Tests.xctest")) {
                productName = productName.replace("Tests.xctest", ".app");
            }
            final File appPath = new File(settings.get("BUILT_PRODUCTS_DIR"), productName);

            // Get app bundle identifier
            final String bundleIdentifier = settings.get("PRODUCT_BUNDLE_IDENTIFIER");

            final JUnitTestCollector testCollector;
            if (isTest && !launchOptions.isRawTestOutput()) {
                testCollector = new JUnitTestCollector();
            } else {
                testCollector = null;
            }

            try {
                SimCtl.Device selectedSim = null;
                try {
                    List<SimCtl.Device> sims = SimCtl.getDevices();
                    for (SimCtl.Device s : sims) {
                        if (Objects.equals(udid, s.udid)) {
                            selectedSim = s;
                            break;
                        }
                    }
                } catch (Exception e) {
                    throw new GradleException("Unable to find simulator (udid=" + udid + ")", e);
                }
                if (selectedSim == null) {
                    throw new GradleException("Unable to find simulator (udid=" + udid + ")");
                }

                if ("shutdown".equalsIgnoreCase(selectedSim.state)) {
                    getLogger().info("Booting simulator {}", selectedSim.udid);
                    getExecOperations().exec(exec -> {
                        exec.setExecutable("xcrun");
                        exec.args("simctl", "boot", udid);

                        execConfigOutput(exec, testCollector);
                    });
                }

                // Bring simulator window to front
                getExecOperations().exec(exec -> {
                    exec.setExecutable("open");
                    exec.args("-a", "Simulator");

                    execConfigOutput(exec, testCollector);
                });


                if (launchOptions.isInstallOnTarget()) {
                    // Install app
                    getLogger().info("Installing app {} to simulator {}", appPath, selectedSim.udid);
                    getExecOperations().exec(exec -> {
                        exec.setExecutable("xcrun");
                        exec.args("simctl", "install", udid, appPath);

                        execConfigOutput(exec, testCollector);
                    });
                }


                if (launchOptions.isLaunch()) {
                    // Launch app
                    getLogger().info("Launching app {} on simulator {}", appPath, selectedSim.udid);
                    getExecOperations().exec(exec -> {
                        exec.setExecutable("xcrun");
                        exec.args("simctl", "launch", "--console-pty", udid, bundleIdentifier);

                        if (launchOptions.getDebug() != null) {
                            exec.args("-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=" + launchOptions.getDebug().getLocal());
                        }

                        exec.args(launchOptions.getVMArgs());
                        exec.args("-args");
                        exec.args(launchOptions.getArgs());

                        // https://stackoverflow.com/a/53604237
                        Map<String, String> envs = new HashMap<>();
                        for (Map.Entry<String, String> entry : launchOptions.getEnvs().entrySet()) {
                            envs.put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
                        }
                        envs.put("SIMCTL_CHILD_NSUnbufferedIO", "YES");
                        exec.environment(envs);

                        execConfigOutput(exec, testCollector);
                    });
                }
            } finally {
                if (testCollector != null) {
                    numFailedTests.getAndAdd(testCollector.getNumFailures() + testCollector.getNumErrors());
                    testCollector.writeJUnitReport(udid == null ? "unknown-simulator" : udid, jUnitOutputDirectory);
                }
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
        this.xcodeBuildSimulator = getMoePlugin().getTaskBy(XcodeBuild.class, sourceSet, launchOptions.getMode(), getMoePlugin().getExtension().getPlatformType().simulatorPlatform);

        this.simulators = new ArrayList<>();
        if (getProject().hasProperty(MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY)) {
            Arrays.stream(((String) getProject().property(MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY)).split(Pattern.quote(",")))
                    .map(String::trim)
                    .forEach(simulators::add);
        }

        if (launchOptions.isBuild())
            dependsOn(xcodeBuildSimulator);
        mustRunAfter(xcodeBuildSimulator);

        addConvention(CONVENTION_JUNIT_OUTPUT_DIRECTORY, () -> resolvePathInBuildDir(out, "reports"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "LaunchSimulator.log"));
    }
}
