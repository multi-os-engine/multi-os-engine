package org.moe.prebuilts;

import org.gradle.api.JavaVersion;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.compile.JavaCompile;

public class JavaConventions implements Plugin<Project> {
    public static final int DEFAULT_RELEASE = 8;

    @Override
    public void apply(Project project) {
        project.getPluginManager().apply(JavaPlugin.class);
        Extension ext = project.getExtensions().create("javaConventions", Extension.class, project);
        ext.setRelease(DEFAULT_RELEASE);
    }

    public static class Extension {
        private final Project project;
        private int release;

        public Extension(Project project) {
            this.project = project;
        }

        public int getRelease() {
            return release;
        }

        // Single source of truth: writing `release` updates --release, sourceCompatibility,
        // and targetCompatibility together. The latter two must be set explicitly so the
        // Gradle `idea` plugin reports a language level to IntelliJ (otherwise the IDE
        // falls back to LanguageLevel.JDK_1_6).
        public void setRelease(int release) {
            this.release = release;
            JavaVersion v = JavaVersion.toVersion(release);
            JavaPluginExtension je = project.getExtensions().getByType(JavaPluginExtension.class);
            je.setSourceCompatibility(v);
            je.setTargetCompatibility(v);
            project.getTasks().withType(JavaCompile.class).configureEach(task ->
                task.getOptions().getRelease().set(release));
        }
    }
}
