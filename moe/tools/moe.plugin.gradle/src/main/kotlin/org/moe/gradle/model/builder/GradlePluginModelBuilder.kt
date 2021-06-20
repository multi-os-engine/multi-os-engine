package org.moe.gradle.model.builder

import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.moe.gradle.model.GradlePluginModel
import org.moe.gradle.model.impl.GradlePluginModelImpl

class GradlePluginModelBuilder: ToolingModelBuilder {
    override fun canBuild(modelName: String): Boolean {
        return modelName == GradlePluginModel::class.java.name
    }

    override fun buildAll(modelName: String, project: Project): Any {
        return GradlePluginModelImpl(project.plugins.map { it.javaClass.name })
    }
}
