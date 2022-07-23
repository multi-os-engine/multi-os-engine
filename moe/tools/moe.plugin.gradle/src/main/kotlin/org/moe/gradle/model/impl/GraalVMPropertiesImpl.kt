package org.moe.gradle.model.impl

import org.moe.gradle.model.GraalVMProperties
import org.moe.gradle.model.GraalVMVersion
import org.moe.gradle.model.JDKVersion
import org.moe.tools.substrate.GraalVM
import java.io.Serializable

data class GraalVMPropertiesImpl(
    override val home: String,
    override val version: GraalVMVersion,
    override val jdkVersion: JDKVersion
) : GraalVMProperties, Serializable {
    constructor(graalVM: GraalVM) : this(
        home = graalVM.home.toAbsolutePath().toString(),
        version = graalVM.version.vmVersion,
        jdkVersion = graalVM.version.jdkVersion,
    )
}
