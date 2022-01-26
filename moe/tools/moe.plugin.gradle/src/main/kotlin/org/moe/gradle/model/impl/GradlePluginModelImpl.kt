package org.moe.gradle.model.impl

import org.moe.gradle.model.GradlePluginModel
import org.moe.gradle.model.MOESdkProperties
import org.moe.gradle.model.MOEXcodeProperties
import java.io.Serializable

data class GradlePluginModelImpl(
    override val gradlePluginList: Collection<String>,
    override val sdkProperties: MOESdkProperties,
    override val xcodeProperties: MOEXcodeProperties?,
) : GradlePluginModel, Serializable
