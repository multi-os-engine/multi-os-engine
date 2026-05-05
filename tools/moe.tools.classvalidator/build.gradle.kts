import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.moe.java-conventions")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":moe.tools.common"))

    implementation(libs.asm)
    implementation(libs.asm.tree)
    implementation(libs.asm.commons)

    implementation(libs.gson)

    testImplementation("org.moe:natj")
    testImplementation(libs.junit)
    testImplementation(libs.asm.util)
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
    }
}
