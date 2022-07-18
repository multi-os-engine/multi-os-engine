package org.moe.idea.model.impl

import org.gradle.tooling.model.UnsupportedMethodException
import org.moe.gradle.model.MOESdkProperties
import java.io.Serializable
import java.lang.UnsupportedOperationException

data class MOESdkPropertiesImpl(
    override val home: String,
    override val coreJar: String,
    override val platformJar: String?,
    override val junitJar: String,
    override val graalHome: String?
) : MOESdkProperties, Serializable {
    constructor(input: MOESdkProperties) : this(
        home = input.home,
        coreJar = input.coreJar,
        platformJar = input.platformJar,
        junitJar = input.junitJar,
        graalHome = try {
            input.graalHome
        } catch (_: UnsupportedMethodException) {
            null
        }
    )
}
