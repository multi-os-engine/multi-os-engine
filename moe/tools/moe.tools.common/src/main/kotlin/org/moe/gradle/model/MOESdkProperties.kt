package org.moe.gradle.model

interface MOESdkProperties {
    val home: String
    val coreJar: String
    val platformJar: String?
    val junitJar: String
}
