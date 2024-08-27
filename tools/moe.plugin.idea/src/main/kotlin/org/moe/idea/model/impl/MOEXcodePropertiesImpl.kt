package org.moe.idea.model.impl

import org.moe.gradle.model.MOEXcodeProperties
import java.io.Serializable

data class MOEXcodePropertiesImpl(
    override val project: String?,
    override val workspace: String?,
    override val mainTarget: String?,
    override val testTarget: String?,
    override val mainScheme: String?,
    override val testScheme: String?
) : MOEXcodeProperties, Serializable {
    constructor(input: MOEXcodeProperties) : this(
        project = input.project,
        workspace = input.workspace,
        mainTarget = input.mainTarget,
        testTarget = input.testTarget,
        mainScheme = input.mainScheme,
        testScheme = input.testScheme,
    )
}
