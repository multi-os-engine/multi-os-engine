package org.moe.idea.model

import com.intellij.openapi.externalSystem.model.Key
import com.intellij.openapi.externalSystem.model.ProjectKeys.LIBRARY_DEPENDENCY
import com.intellij.openapi.module.Module
import org.moe.gradle.model.GradlePluginModel
import org.moe.gradle.model.MOESdkProperties
import org.moe.gradle.model.MOEXcodeProperties
import org.moe.idea.facet.gradle.GradleFacet
import java.io.Serializable

/**
 * Module-level Gradle information
 */
data class GradleModuleModel(
    override val moduleName: String,
    override val version: String?,
    override val gradlePluginList: List<String>,
    val taskNames: List<String>,
    override val sdkProperties: MOESdkProperties?,
    override val xcodeProperties: MOEXcodeProperties?,
) : ModuleModel, GradlePluginModel, Serializable {
    companion object {
        private const val serialVersionUID = 1L

        val KEY = Key.create(GradleModuleModel::class.java, LIBRARY_DEPENDENCY.processingWeight + 1)

        @JvmStatic
        fun getInstance(module: Module): GradleModuleModel? = GradleFacet.getInstance(module)?.gradleModuleModel

        @JvmStatic
        fun getSdkProperties(module: Module): MOESdkProperties? = getInstance(module)?.sdkProperties

        @JvmStatic
        fun getXcodeProperties(module: Module): MOEXcodeProperties? = getInstance(module)?.xcodeProperties
    }
}
