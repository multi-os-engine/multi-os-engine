package org.moe.gradle.model;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/** Returns artifacts information of a module */
public interface GradlePluginModel {
    /**
     * Returns a list of applied plugins.
     */
    @NotNull
    Collection<String> getGradlePluginList();
}
