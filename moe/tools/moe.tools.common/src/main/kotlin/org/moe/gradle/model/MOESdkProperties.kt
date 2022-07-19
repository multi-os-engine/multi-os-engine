package org.moe.gradle.model

interface MOESdkProperties {
    val home: String

    /**
     * The MOE SDK version
     */
    val version: String?

    val coreJar: String
    val platformJar: String?
    val junitJar: String
    val graalHome: String?
}
