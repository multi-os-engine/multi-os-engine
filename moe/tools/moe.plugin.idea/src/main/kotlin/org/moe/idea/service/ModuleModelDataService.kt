package org.moe.idea.service

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.project.ModuleData
import com.intellij.openapi.externalSystem.model.project.ProjectData
import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider
import com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Computable
import com.intellij.util.SmartList
import org.jetbrains.plugins.gradle.model.data.GradleSourceSetData
import org.moe.idea.model.ModuleModel

abstract class ModuleModelDataService<T : ModuleModel> : AbstractProjectDataService<T, Module>() {
    override fun importData(
        toImport: MutableCollection<out DataNode<T>>,
        projectData: ProjectData?,
        project: Project,
        modelsProvider: IdeModifiableModelsProvider
    ) {
        WriteCommandAction.runWriteCommandAction(project) {
            if (project.isDisposed) {
                return@runWriteCommandAction
            }
            val modelsByModuleName = groupByModuleName(toImport, modelsProvider)
            importData(toImport, project, modelsProvider, modelsByModuleName)
        }
    }

    protected abstract fun importData(
        toImport: MutableCollection<out DataNode<T>>,
        project: Project,
        modelsProvider: IdeModifiableModelsProvider,
        modelsByModuleName: Map<String, T>
    )

    override fun computeOrphanData(
        toImport: MutableCollection<out DataNode<T>>,
        projectData: ProjectData,
        project: Project,
        modelsProvider: IdeModifiableModelsProvider
    ): Computable<MutableCollection<Module>> {
        val modelsByModuleName = groupByModuleName(toImport, modelsProvider)
        return Computable {
            val orphanIdeModules = SmartList<Module>()

            for (module in modelsProvider.modules) {
                if (!ExternalSystemApiUtil.isExternalSystemAwareModule(projectData.owner, module)) {
                    continue
                }
                if (ExternalSystemApiUtil.getExternalModuleType(module) != null) {
                    continue
                }

                val rootProjectPath = ExternalSystemApiUtil.getExternalRootProjectPath(module)
                if (projectData.linkedExternalProjectPath == rootProjectPath) {
                    if (modelsByModuleName[module.name] == null) {
                        orphanIdeModules.add(module)
                    }
                }
            }

            return@Computable orphanIdeModules
        }
    }

    private fun groupByModuleName(
        dataNodes: Collection<DataNode<T>>,
        modelsProvider: IdeModifiableModelsProvider
    ): Map<String, T> {
        val index = mutableMapOf<String, T>()

        dataNodes.forEach { dataNode ->
            val model = dataNode.data
            var moduleName = model.moduleName
            dataNode.parent?.let { parent ->
                val moduleData = parent.data as ModuleData
                val module = modelsProvider.findIdeModule(moduleData)
                if (module != null && module.name != moduleName) {
                    moduleName = module.name
                }

                groupModulesForSourceSetsByModuleName(index, dataNode, model)
            }
            index[moduleName] = model
        }

        return index
    }

    private fun groupModulesForSourceSetsByModuleName(
        index: MutableMap<String, T>,
        dataNode: DataNode<T>,
        model: T
    ) {
        dataNode.parent?.children?.forEach { node ->
            if (node.key == GradleSourceSetData.KEY) {
                val sourceSetData = node.data as GradleSourceSetData
                index[sourceSetData.internalName] = model
            }
        }
    }
}
