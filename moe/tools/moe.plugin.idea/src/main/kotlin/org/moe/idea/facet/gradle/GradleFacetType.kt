package org.moe.idea.facet.gradle

import com.intellij.facet.Facet
import com.intellij.facet.FacetType
import com.intellij.openapi.module.JavaModuleType
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import res.MOEIcons
import javax.swing.Icon

class GradleFacetType : FacetType<GradleFacet, GradleFacetConfiguration>(
    GradleFacet.TYPE_ID, GradleFacet.FACET_ID, GradleFacet.FACET_NAME
) {
    override fun createDefaultConfiguration(): GradleFacetConfiguration {
        return GradleFacetConfiguration()
    }

    override fun createFacet(
        module: Module,
        name: String,
        configuration: GradleFacetConfiguration,
        underlyingFacet: Facet<*>?
    ): GradleFacet {
        return GradleFacet(module, name, configuration)
    }

    override fun isSuitableModuleType(moduleType: ModuleType<*>?): Boolean {
        return moduleType is JavaModuleType
    }

    override fun getIcon(): Icon? {
        return MOEIcons.MOESmall
    }
}
