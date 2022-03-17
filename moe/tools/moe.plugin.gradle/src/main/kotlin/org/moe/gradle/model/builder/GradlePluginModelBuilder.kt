package org.moe.gradle.model.builder

import org.gradle.api.Project
import org.gradle.tooling.provider.model.ToolingModelBuilder
import org.moe.gradle.AbstractMoeExtension
import org.moe.gradle.MoeExtension
import org.moe.gradle.MoePlugin
import org.moe.gradle.model.GradlePluginModel
import org.moe.gradle.model.impl.GradlePluginModelImpl
import org.moe.gradle.model.impl.MOESdkPropertiesImpl
import org.moe.gradle.model.impl.MOEXcodePropertiesImpl

class GradlePluginModelBuilder : ToolingModelBuilder {
    override fun canBuild(modelName: String): Boolean {
        return modelName == GradlePluginModel::class.java.name
    }

    override fun buildAll(modelName: String, project: Project): Any {
        val ext = AbstractMoeExtension.getInstance(project)
        val sdk = ext.getSDK()

        return GradlePluginModelImpl(
            gradlePluginList = project.plugins.map { it.javaClass.name },
            sdkProperties = MOESdkPropertiesImpl(
                home = sdk.root.absolutePath,
                coreJar = sdk.coreJar.absolutePath,
                platformJar = ext.platformJar?.absolutePath,
                junitJar = sdk.getiOSJUnitJar().absolutePath,
                graalHome = if (ext.plugin is MoePlugin) {
                    ext.plugin.graalVM.home.toAbsolutePath().toString()
                } else {
                    null
                }
            ),
            xcodeProperties = if (ext is MoeExtension) {
                val xcode = ext.xcode
                MOEXcodePropertiesImpl(
                    project = xcode.project?.let { project.file(it).absolutePath },
                    workspace = xcode.workspace?.let { project.file(it).absolutePath },
                    mainTarget = xcode.mainTarget,
                    testTarget = xcode.testTarget,
                    mainScheme = xcode.mainScheme,
                    testScheme = xcode.testScheme,
                )
            } else {
                null
            },
        )
    }
}
