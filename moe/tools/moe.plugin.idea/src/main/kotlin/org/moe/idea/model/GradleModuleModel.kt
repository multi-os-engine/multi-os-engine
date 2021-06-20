package org.moe.idea.model

import com.intellij.openapi.externalSystem.model.Key
import com.intellij.openapi.externalSystem.model.ProjectKeys.LIBRARY_DEPENDENCY
import java.io.Serializable

/**
 * Module-level Gradle information
 */
data class GradleModuleModel(
    override val moduleName: String,
    val gradlePlugins: List<String>,
    val taskNames: List<String>
) : ModuleModel, Serializable {
    companion object {
        private const val serialVersionUID = 1L

        val KEY = Key.create(GradleModuleModel::class.java, LIBRARY_DEPENDENCY.processingWeight + 1)
    }
}
