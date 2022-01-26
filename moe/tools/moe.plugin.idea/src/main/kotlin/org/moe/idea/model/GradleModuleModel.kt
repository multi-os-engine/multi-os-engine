package org.moe.idea.model

import com.intellij.openapi.externalSystem.model.Key
import com.intellij.openapi.externalSystem.model.ProjectKeys.LIBRARY_DEPENDENCY
import com.intellij.openapi.module.Module
import org.moe.gradle.model.MOESdkProperties
import org.moe.gradle.model.MOEXcodeProperties
import org.moe.idea.facet.gradle.GradleFacet
import java.io.Serializable

/**
 * Module-level Gradle information
 */
data class GradleModuleModel(
    override val moduleName: String,
    val gradlePlugins: List<String>,
    val taskNames: List<String>,
    val sdkProperties: MOESdkProperties?,
    val xcodeProperties: MOEXcodeProperties?,
) : ModuleModel, Serializable {
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
