/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package org.moe.idea

import com.intellij.ProjectTopics
import com.intellij.facet.Facet
import com.intellij.facet.FacetManager
import com.intellij.openapi.application.ApplicationInfo
import com.intellij.openapi.externalSystem.model.Key
import com.intellij.openapi.externalSystem.model.ProjectKeys
import com.intellij.openapi.externalSystem.service.project.ProjectDataManager
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.fileEditor.FileEditorManagerListener
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import org.jetbrains.plugins.gradle.model.data.GradleSourceSetData
import org.jetbrains.plugins.gradle.settings.GradleSettings
import org.jetbrains.plugins.gradle.util.GradleConstants
import org.moe.idea.facet.gradle.GradleFacet
import org.moe.idea.model.GradleModuleModel
import org.moe.idea.utils.FileEditorListener
import org.moe.idea.utils.ModuleObserver
import org.moe.idea.utils.logger.LoggerFactory

/**
 * This is our StartupActivity used to execute code on project open.
 */
class Startup : StartupActivity {
    override fun runActivity(project: Project) {
        LOG.info(
            "Plugin started " + ApplicationInfo.getInstance().build.asString()
                + " (" + ApplicationInfo.getInstance().versionName
                + " " + ApplicationInfo.getInstance().fullVersion + ")"
        )

        // Find MOE modules
        readCache(project)

        // Register listeners
        val messageBusConnection = project.messageBus.connect()
        messageBusConnection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, FileEditorListener())
        messageBusConnection.subscribe(ProjectTopics.MODULES, ModuleObserver())
    }

    private fun readCache(project: Project) {
        val projectDataManager = ProjectDataManager.getInstance()
        val projectDataNodes = GradleSettings.getInstance(project)
            .linkedProjectsSettings
            .mapNotNull { it.externalProjectPath }
            .toSet()
            .map {
                projectDataManager.getExternalProjectData(
                    project,
                    GradleConstants.SYSTEM_ID,
                    it
                )?.externalProjectStructure
            }

        val moduleManager = ModuleManager.getInstance(project)
        val gradleModules = moduleManager
            .modules
            .filter { ExternalSystemApiUtil.isExternalSystemAwareModule(GradleConstants.SYSTEM_ID, it) }

        val facets = gradleModules.flatMap { module ->
            FacetManager.getInstance(module).let {
                it.getFacetsByType(GradleFacet.TYPE_ID)
            }
        }.toMutableList()

        val modulesById = gradleModules
            .mapNotNull { module ->
                val externalId = ExternalSystemApiUtil.getExternalProjectId(module) ?: return@mapNotNull null
                externalId to module
            }
            .toMap()

        val moduleToModelPairs = projectDataNodes
            .flatMap { projectData ->
                ExternalSystemApiUtil
                    .findAllRecursively(projectData, ProjectKeys.MODULE)
                    .flatMap { node ->
                        val externalId = node.data.id
                        // Get ids for different source sets
                        val sourceSetModuleIds = node
                            .children
                            .filter { it.key == GradleSourceSetData.KEY }
                            .map { (it.data as GradleSourceSetData).id }

                        val allModuleIds = sourceSetModuleIds + externalId

                        allModuleIds
                            .mapNotNull { modulesById[it] }
                            .map { it to node }
                    }
            }

        moduleToModelPairs.forEach { (module, moduleDataNode) ->
            fun <T, V : Facet<*>> attach(
                dataKey: Key<T>,
                getFacet: Module.() -> V?,
                attach: V.(T) -> Unit,
                configure: T.(Module) -> Unit = { _ -> }
            ) {
                val model = ExternalSystemApiUtil
                    .getChildren(moduleDataNode, dataKey)
                    .singleOrNull()
                    ?.data
                    ?: return
                val facet = module.getFacet() ?: return
                facets.remove(facet)
                model.configure(module)
                facet.attach(model)
            }

            attach(GradleModuleModel.KEY, GradleFacet::getInstance, GradleFacet::gradleModuleModel.setter)
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(Startup::class.java)
    }
}
