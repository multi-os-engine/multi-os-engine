package org.moe.prebuilts;

import org.gradle.api.JavaVersion;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.compile.JavaCompile;

import javax.inject.Inject;

public abstract class JavaConventions implements Plugin<Project> {
    public static final int DEFAULT_RELEASE = 8;

    @Override
    public void apply(Project project) {
        project.getPluginManager().apply(JavaPlugin.class);
        Extension ext = project.getExtensions().create("javaConventions", Extension.class);

        JavaPluginExtension je = project.getExtensions().getByType(JavaPluginExtension.class);
        JavaVersion def = JavaVersion.toVersion(DEFAULT_RELEASE);
        je.setSourceCompatibility(def);
        je.setTargetCompatibility(def);

        project.getTasks().withType(JavaCompile.class).configureEach(t -> t.getOptions().getRelease().set(ext.getRelease()));
    }

    public static class Extension {
        private final Property<Integer> release;
        private final JavaPluginExtension je;

        @Inject
        public Extension(ObjectFactory objects, Project project) {
            this.je = project.getExtensions().getByType(JavaPluginExtension.class);
            this.release = objects.property(Integer.class).convention(DEFAULT_RELEASE);
        }

        public Property<Integer> getRelease() {
            return release;
        }

        public void setRelease(int value) {
            release.set(value);
            JavaVersion v = JavaVersion.toVersion(value);
            je.setSourceCompatibility(v);
            je.setTargetCompatibility(v);
        }
    }
}
