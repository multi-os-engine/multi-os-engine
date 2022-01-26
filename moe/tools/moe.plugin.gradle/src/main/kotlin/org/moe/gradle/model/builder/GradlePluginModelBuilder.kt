package org.moe.gradle.model.builder

import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.moe.gradle.AbstractMoeExtension
import org.moe.gradle.model.GradlePluginModel
import org.moe.gradle.model.impl.GradlePluginModelImpl
import org.moe.gradle.model.impl.MOESdkPropertiesImpl

class GradlePluginModelBuilder : ToolingModelBuilder {
    override fun canBuild(modelName: String): Boolean {
        return modelName == GradlePluginModel::class.java.name
    }

    override fun buildAll(modelName: String, project: Project): Any {
        return GradlePluginModelImpl(
            gradlePluginList = project.plugins.map { it.javaClass.name },
            sdkProperties = AbstractMoeExtension.getInstance(project).let { ext ->
                val sdk = ext.getSDK()
                MOESdkPropertiesImpl(
                    home = sdk.root.absolutePath,
                    coreJar = sdk.coreJar.absolutePath,
                    platformJar = ext.platformJar?.absolutePath,
                    junitJar = sdk.getiOSJUnitJar().absolutePath,
                )
            }
        )
    }
}
