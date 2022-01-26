package org.moe.gradle.model

interface MOEXcodeProperties {
    val project: String?
    val workspace: String?
    val mainTarget: String?
    val testTarget: String?
    val mainScheme: String?
    val testScheme: String?
}
