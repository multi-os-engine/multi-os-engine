package org.moe.prebuilts;

import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.provider.Provider;

import java.io.File;
import java.util.Arrays;

public class BuildTools implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.allprojects(BuildTools::configure);
    }

    private static void configure(Project project) {
        final Project root = project.getRootProject();
        Provider<Boolean> verbose = project.getProviders().gradleProperty("moe.verbose").map(v -> true).orElse(false);

        project.getTasks().withType(BaseTask.class).configureEach(task -> {
            MOEExternal external = project.getExtensions().getByType(MOEExternal.class);

            task.getVerbose().convention(verbose);
            task.getRootProjectDirectory().set(root.getLayout().getProjectDirectory());
            task.getRepoRootDirectory().set(new File(external.root));
            task.getProjectName().set(project.getName());
        });

        project.getTasks().withType(XcodeBuild.class).configureEach(task -> {
            task.getXcodeProject().convention(project.getLayout().getProjectDirectory().dir(project.getName() + ".xcodeproj"));
            String xcodeprojPath = task.getXcodeProject().get().getAsFile().getAbsolutePath();
            Provider<XcodeBuildLockService> xcodeLock = project.getGradle().getSharedServices()
                    .registerIfAbsent(
                            XcodeBuildLockService.NAME + ":" + xcodeprojPath,
                            XcodeBuildLockService.class,
                            spec -> spec.getMaxParallelUsages().set(1)
                    );
            task.usesService(xcodeLock);
        });

        project.getTasks().withType(Script.class).configureEach(task -> {
            MOEExternal external = project.getExtensions().getByType(MOEExternal.class);
            task.registerRoot("ROOT", new File(external.moe));
            task.registerRoot("SVM", new File(external.svm.root));
            task.registerRoot("EXTERNAL", new File(external.external));
        });

        registerBuildFilter(project, root);
        registerMOEExternal(project, root);
    }

    private static void registerBuildFilter(Project project, Project root) {
        if (project.getExtensions().findByName("buildfilter") != null) {
            return;
        }
        BuildFilter buildFilter = project.getExtensions().create("buildfilter", BuildFilter.class);
        if (root.hasProperty("moe.buildfilter.ios.config")) {
            buildFilter.ios.config = root.property("moe.buildfilter.ios.config").toString();
        }
        if (root.hasProperty("moe.buildfilter.ios.sdk")) {
            buildFilter.ios.sdk = root.property("moe.buildfilter.ios.sdk").toString();
        }
        if (root.hasProperty("moe.buildfilter.ios.archs")) {
            buildFilter.ios.archs = root.property("moe.buildfilter.ios.archs").toString();
        }
        if (buildFilter.ios.archs != null && buildFilter.ios.sdk == null) {
            throw new GradleException("Specifying 'moe.buildfilter.ios.archs' requires 'moe.buildfilter.ios.sdk'");
        }
        if (root.hasProperty("moe.buildfilter.macos.config")) {
            buildFilter.macos.config = root.property("moe.buildfilter.macos.config").toString();
        }
    }

    private static void registerMOEExternal(Project project, Project root) {
        if (project.getExtensions().findByName("moeExternal") != null) {
            return;
        }
        MOEExternal external = project.getExtensions().create("moeExternal", MOEExternal.class);
        external.root = root.file("../vendor").getAbsolutePath();
        external.moe = root.file("../").getAbsolutePath();

        external.prebuilts = new File(external.moe, "prebuilts").getAbsolutePath();

        File externalRoot = new File(external.root, "external");
        external.external = externalRoot.getAbsolutePath();
        external.javasqlite = new File(externalRoot, "javasqlite").getAbsolutePath();

        File svmRoot = new File(external.root, "svm");
        external.svm.root = svmRoot.getAbsolutePath();
        external.svm.mx = new File(svmRoot, "mx").getAbsolutePath();
        external.svm.graal = new File(svmRoot, "graal").getAbsolutePath();
        external.svm.openjdk = new File(svmRoot, "labs-openjdk").getAbsolutePath();

        File natjRoot = new File(external.moe, "natj");
        external.natJ.root = natjRoot.getAbsolutePath();
        external.natJ.sources = new File(natjRoot, "src/main/java");
        external.natJ.jnipath = new File(natjRoot, "natj-mac/build/xcode/Release");
        external.natJ.ios = Arrays.asList(
                new File(natjRoot, "natj-ios/build/xcode/Release-iphoneos/libnatj.a"),
                new File(natjRoot, "natj-ios/build/xcode/Release-iphonesimulator/libnatj.a")
        );
        external.natJ.mac = Arrays.asList(new File(natjRoot, "natj-mac/build/xcode/Release/libnatj.dylib"));
        external.natJ.win = Arrays.asList(new File(natjRoot, "natj-win/build/Release-Win64/natj.dll"));
        external.natJ.linux = Arrays.asList(new File(natjRoot, "natj-linux/build/Release/libnatj.so"));

        // LLVM (within prebuilts)
        File llvmRoot = new File(external.prebuilts, "llvm/macos");
        external.llvm.source = new File(externalRoot, "llvm").getAbsolutePath();
        external.llvm.root = llvmRoot.getAbsolutePath();
        external.llvm.jnipath = new File(llvmRoot, "lib");
        external.llvm.macos = new File(llvmRoot, "lib/libclang.dylib");

        File moeCoreRoot = new File(external.moe, "moe-core");
        external.moeCore.root = moeCoreRoot.getAbsolutePath();

        String sdkConfig = root.hasProperty("moe.moe_core.sdk.debug") ? "Debug" : "Release";
        MOEExternal.MOECore.Out out = external.moeCore.out;
        out.moeIosJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios/build/libs/moe-ios.jar");
        out.moeIosJavadocJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios/build/libs/moe-ios-javadoc.jar");
        out.moeIosSourcesJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios/build/libs/moe-ios-sources.jar");
        out.moeIosJunitJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit.jar");
        out.moeIosJunitJavadocJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit-javadoc.jar");
        out.moeIosJunitSourcesJar = new File(moeCoreRoot, "moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit-sources.jar");
        out.moeCoreJar = new File(moeCoreRoot, "moe.apple/moe.core.java/build/libs/moe-core.jar");
        out.moeCoreJavadocJar = new File(moeCoreRoot, "moe.apple/moe.core.java/build/libs/moe-core-javadoc.jar");
        out.moeCoreSourcesJar = new File(moeCoreRoot, "moe.apple/moe.core.java/build/libs/moe-core-sources.jar");
        out.jniConfigBaseJson = new File(moeCoreRoot, "moe.apple/tools/jni-config-base.json");
        out.reflectionConfigBaseJson = new File(moeCoreRoot, "moe.apple/tools/reflection-config-base.json");
        out.proguardFullCfg = new File(moeCoreRoot, "moe.apple/tools/proguard-full.cfg");
        out.proguardCfg = new File(moeCoreRoot, "moe.apple/tools/proguard.cfg");
        out.iphoneosLibmoe = new File(moeCoreRoot, "moe.apple/moe.core.native/moe.sdk/build/xcode/" + sdkConfig + "-ios-iphoneos/libmoe.a");
        out.iphoneosLibmoeHeaders = new File(moeCoreRoot, "moe.apple/moe.core.native/moe.sdk/build/xcode/" + sdkConfig + "-ios-iphoneos/include");
        out.iphonesimulatorLibmoe = new File(moeCoreRoot, "moe.apple/moe.core.native/moe.sdk/build/xcode/" + sdkConfig + "-ios-iphonesimulator/libmoe.a");
        out.iphonesimulatorLibmoeHeaders = new File(moeCoreRoot, "moe.apple/moe.core.native/moe.sdk/build/xcode/" + sdkConfig + "-ios-iphonesimulator/include");
        out.iphoneosSvmjdwp = new File(moeCoreRoot, "moe.apple/moe.core.native/svm.jdwp/build/xcode/" + sdkConfig + "-ios-iphoneos/svmjdwp.framework");
        out.iphonesimulatorSvmjdwp = new File(moeCoreRoot, "moe.apple/moe.core.native/svm.jdwp/build/xcode/" + sdkConfig + "-ios-iphonesimulator/svmjdwp.framework");

        if (project == root && !external.llvm.macos.exists()) {
            project.getLogger().warn("WARNING: libclang is missing from " + external.llvm.macos.getAbsolutePath());
        }
    }
}
