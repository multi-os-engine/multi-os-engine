package org.moe.gradle.model

/** Returns artifacts information of a module  */
interface GradlePluginModel {

    /**
     * The MOE gradle plugin version
     */
    val version: String?

    /**
     * Returns a list of applied plugins.
     */
    val gradlePluginList: Collection<String>

    /**
     * Returns SDK properties
     */
    val sdkProperties: MOESdkProperties?

    /**
     * Returns Xcode properties
     */
    val xcodeProperties: MOEXcodeProperties?
}
