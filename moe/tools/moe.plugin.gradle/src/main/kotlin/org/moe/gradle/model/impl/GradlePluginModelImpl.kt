package org.moe.gradle.model.impl

import org.moe.gradle.model.GradlePluginModel
import java.io.Serializable

data class GradlePluginModelImpl(
    private val myGradlePluginList: Collection<String>
): GradlePluginModel, Serializable {
    override fun getGradlePluginList(): Collection<String> = myGradlePluginList

    companion object {
        private const val serialVersionUID = 1L
    }
}
