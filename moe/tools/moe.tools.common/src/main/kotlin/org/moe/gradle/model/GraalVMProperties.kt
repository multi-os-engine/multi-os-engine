package org.moe.gradle.model

/**
 * Properties for GraalVM used by MOE 2.x
 */
interface GraalVMProperties {
    /** Path to the home of the GraalVM */
    val home: String

    /** Version of the GraalVM */
    val version: GraalVMVersion

    /** Java version the GraalVM is based on */
    val jdkVersion: JDKVersion
}

interface JDKVersion {
    val feature: Int
    val interim: Int
    val update: Int
    val patch: Int
}

interface GraalVMVersion {
    val year: Int
    val feature: Int
    val patch: Int
    val bugfix: Int
}
