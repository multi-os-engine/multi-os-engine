@file:JvmName("PropertiesUtil")

package org.moe.gradle.utils


import groovy.lang.MissingPropertyException
import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.internal.project.DefaultProject
import java.util.Properties

private const val LOCAL_PROPERTIES: String = "local.properties"

private fun Project.tryLocalProperty(key: String): String? {
    val f = file(LOCAL_PROPERTIES)
    if (f.exists()) {
        val propFile = Properties()
        propFile.load(f.inputStream())

        return propFile.getProperty(key)
    }

    return null
}

fun Project.tryGetProperty(key: String): String? {
    val localProp = tryLocalProperty(key)
    if (localProp != null) {
        return localProp
    }

    if (hasProperty(key)) {
        val result = property(key)
        if (result != null && result !is String) {
            throw GradleException("Value of $key property is not a String")
        }

        return result as String?
    }

    return null
}

@Throws(MissingPropertyException::class)
fun Project.getProperty(key: String): String {
    val localProp = tryLocalProperty(key)
    if (localProp != null) {
        return localProp
    }

    val result = property(key) ?: throw (this as DefaultProject).asDynamicObject.getMissingProperty(key)

    if (result !is String) {
        throw GradleException("Value of $key property is not a String")
    }

    return result
}
