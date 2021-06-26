package org.moe.idea.gradle

import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.project.Project
import org.jetbrains.plugins.gradle.settings.DistributionType
import org.jetbrains.plugins.gradle.settings.GradleExecutionSettings
import org.jetbrains.plugins.gradle.settings.GradleProjectSettings
import org.jetbrains.plugins.gradle.settings.GradleSettings
import org.jetbrains.plugins.gradle.util.GradleConstants
import org.moe.idea.utils.logger.LoggerFactory

object Utils

private val logger = LoggerFactory.getLogger(Utils::class.java)

fun Project.getGradleProjectSettings(): GradleProjectSettings? {
    val settings = ExternalSystemApiUtil.getSettings(this, GradleConstants.SYSTEM_ID) as GradleSettings
    val state = settings.state!!
    return state.linkedExternalProjectsSettings?.firstOrNull { it != null }
}

fun Project.getGradleExecutionSettings(): GradleExecutionSettings? {
    val projectSettings = getGradleProjectSettings()
    if (projectSettings == null) {
        logger.info("Unable to obtain Gradle project settings for project $name")
        return null
    }

    return try {
        ExternalSystemApiUtil
                .getExecutionSettings(this, projectSettings.externalProjectPath, GradleConstants.SYSTEM_ID)
    } catch (e: IllegalArgumentException) {
        logger.warn("Failed to obtain Gradle execution settings", e)
        null
    }
}

fun Project.getOrCreateGradleExecutionSettings(): GradleExecutionSettings {
    return getGradleExecutionSettings()
            ?: GradleExecutionSettings(null, null, DistributionType.BUNDLED, false)
}

fun Throwable.hasCause(causeClass: Class<*>): Boolean {
    // We want to ignore class loader difference
    val causeClassName = causeClass.name
    var ex: Throwable? = this
    while (ex != null) {
        if (causeClassName == ex.javaClass.name) {
            return true
        }
        ex = ex.cause
    }

    return false
}
