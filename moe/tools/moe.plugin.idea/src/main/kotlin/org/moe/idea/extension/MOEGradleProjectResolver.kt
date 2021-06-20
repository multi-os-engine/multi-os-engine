package org.moe.idea.extension

import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.project.ModuleData
import com.intellij.openapi.externalSystem.model.project.ProjectData
import org.gradle.tooling.model.idea.IdeaModule
import org.jetbrains.plugins.gradle.service.project.AbstractProjectResolverExtension
import org.moe.gradle.model.GradlePluginModel
import org.moe.idea.model.GradleModuleModel

class MOEGradleProjectResolver : AbstractProjectResolverExtension() {
    override fun createModule(gradleModule: IdeaModule, projectDataNode: DataNode<ProjectData>): DataNode<ModuleData>? {
        val moduleDataNode = nextResolver.createModule(gradleModule, projectDataNode)
        if (moduleDataNode == null) {
            return moduleDataNode
        }

        val gradlePluginModel = resolverCtx.getExtraProject(gradleModule, GradlePluginModel::class.java)
        moduleDataNode.createChild(
            GradleModuleModel.KEY,
            GradleModuleModel(
                moduleName = moduleDataNode.data.internalName,
                gradlePlugins = gradlePluginModel?.gradlePluginList?.toList() ?: emptyList(),
                taskNames = gradleModule.getTaskNames()
            )
        )

        return moduleDataNode
    }

    override fun getExtraProjectModelClasses(): MutableSet<Class<*>> {
        return mutableSetOf(
            GradlePluginModel::class.java
        )
    }

    companion object {
        private fun IdeaModule.getTaskNames(): List<String> {
            return gradleProject.tasks.mapNotNull { task ->
                task.name.takeIf { it.isNotBlank() }
            }
        }
    }
}
