package org.moe.idea.model.impl

import org.moe.gradle.model.MOESdkProperties
import java.io.Serializable

data class MOESdkPropertiesImpl(
    override val home: String,
    override val coreJar: String,
    override val platformJar: String?,
    override val junitJar: String
) : MOESdkProperties, Serializable {
    constructor(input: MOESdkProperties) : this(
        home = input.home,
        coreJar = input.coreJar,
        platformJar = input.platformJar,
        junitJar = input.junitJar
    )
}
