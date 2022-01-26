package org.moe.gradle.model

/** Returns artifacts information of a module  */
interface GradlePluginModel {
    /**
     * Returns a list of applied plugins.
     */
    val gradlePluginList: Collection<String>

    /**
     * Returns SDK properties
     */
    val sdkProperties: MOESdkProperties?
}
