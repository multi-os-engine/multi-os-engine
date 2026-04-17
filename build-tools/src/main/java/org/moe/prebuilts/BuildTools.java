package org.moe.prebuilts;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.provider.Provider;

public class BuildTools implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.allprojects(BuildTools::configure);
    }

    private static void configure(Project project) {
        final Project root = project.getRootProject();
        Provider<Boolean> verbose = project.getProviders().gradleProperty("moe.verbose")
                .map(v -> Boolean.TRUE).orElse(Boolean.FALSE);

        project.getTasks().withType(BaseTask.class).configureEach(task -> {
            task.getVerbose().convention(verbose);
            task.getRootProjectDirectory().convention(
                    root.getLayout().getProjectDirectory());
            task.getRepoRootDirectory().convention(
                    root.getLayout().getProjectDirectory().dir("../.."));
            task.getProjectName().convention(project.getName());
        });

        project.getTasks().withType(XcodeBuild.class).configureEach(task -> {
            task.getXcodeProject().convention(
                    project.getLayout().getProjectDirectory().dir(project.getName() + ".xcodeproj"));
            String xcodeprojPath = task.getXcodeProject().get().getAsFile().getAbsolutePath();
            Provider<XcodeBuildLockService> xcodeLock = project.getGradle().getSharedServices()
                    .registerIfAbsent(
                            XcodeBuildLockService.NAME + ":" + xcodeprojPath,
                            XcodeBuildLockService.class,
                            spec -> spec.getMaxParallelUsages().set(1)
                    );
            task.usesService(xcodeLock);
        });
    }
}
