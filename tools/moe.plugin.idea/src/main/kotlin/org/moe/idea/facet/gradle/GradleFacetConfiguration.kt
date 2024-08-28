package org.moe.idea.facet.gradle

import com.intellij.facet.FacetConfiguration
import com.intellij.facet.ui.FacetEditorContext
import com.intellij.facet.ui.FacetEditorTab
import com.intellij.facet.ui.FacetValidatorsManager

class GradleFacetConfiguration : FacetConfiguration {
    override fun createEditorTabs(p0: FacetEditorContext?, p1: FacetValidatorsManager?): Array<FacetEditorTab> {
        return emptyArray()
    }
}
