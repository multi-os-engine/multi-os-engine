package org.moe.idea.facet.gradle

import com.intellij.facet.Facet
import com.intellij.facet.FacetManager
import com.intellij.facet.FacetTypeId
import com.intellij.facet.FacetTypeRegistry
import com.intellij.openapi.module.Module
import org.moe.idea.model.GradleModuleModel

class GradleFacet(
    module: Module,
    name: String,
    configuration: GradleFacetConfiguration
) : Facet<GradleFacetConfiguration>(getFacetType(), module, name, configuration, null) {

    var gradleModuleModel: GradleModuleModel? = null

    companion object {
        @JvmStatic
        val TYPE_ID = FacetTypeId<GradleFacet>("moe-gradle")
        const val FACET_ID = "moe-gradle"
        const val FACET_NAME = "MOE-Gradle"

        @JvmStatic
        fun getInstance(module: Module): GradleFacet? = FacetManager.getInstance(module).getFacetByType(TYPE_ID)

        @JvmStatic
        fun getFacetType(): GradleFacetType {
            val facetType = FacetTypeRegistry.getInstance().findFacetType(TYPE_ID)
            require(facetType is GradleFacetType)
            return facetType
        }
    }
}
