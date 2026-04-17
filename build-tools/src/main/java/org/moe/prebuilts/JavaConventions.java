package org.moe.prebuilts;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.compile.JavaCompile;

public class JavaConventions implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getPluginManager().apply(JavaPlugin.class);
        project.getTasks().withType(JavaCompile.class).configureEach(task -> {
            task.getOptions().getRelease().convention(8);
        });
    }
}
