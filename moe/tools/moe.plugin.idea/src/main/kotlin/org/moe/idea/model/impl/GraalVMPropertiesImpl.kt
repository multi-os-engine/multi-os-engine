package org.moe.idea.model.impl

import org.moe.gradle.model.GraalVMProperties
import org.moe.gradle.model.GraalVMVersion
import org.moe.gradle.model.JDKVersion
import java.io.Serializable

data class GraalVMPropertiesImpl(
    override val home: String,
    override val version: GraalVMVersion,
    override val jdkVersion: JDKVersion
) : GraalVMProperties, Serializable {
    constructor(input: GraalVMProperties) : this(
        home = input.home,
        version = GraalVMVersionImpl(input.version),
        jdkVersion = JDKVersionImpl(input.jdkVersion),
    )
}

data class GraalVMVersionImpl(
    override val year: Int,
    override val feature: Int,
    override val patch: Int,
    override val bugfix: Int
) : GraalVMVersion, Serializable {
    constructor(input: GraalVMVersion) : this(
        year = input.year,
        feature = input.feature,
        patch = input.patch,
        bugfix = input.bugfix,
    )

    override fun toString(): String {
        val base = "$year.$feature.$patch"
        return if (bugfix > 0) {
            return "$base.$bugfix"
        } else {
            base
        }
    }
}

data class JDKVersionImpl(
    override val feature: Int,
    override val interim: Int,
    override val update: Int,
    override val patch: Int
) : JDKVersion, Serializable {
    constructor(input: JDKVersion) : this(
        feature = input.feature,
        interim = input.interim,
        update = input.update,
        patch = input.patch,
    )

    override fun toString(): String {
        return if (feature <= 8) {
            if (update == 0) {
                "1.$feature.$interim".trimTrailingZero()
            } else {
                "1.$feature.${interim}_$update"
            }
        } else {
            "$feature.$interim.$update.$patch".trimTrailingZero()
        }
    }

    companion object {
        private fun String.trimTrailingZero(): String {
            var v = this
            while (v.endsWith(".0")) {
                v = v.substring(0, v.length - 2)
            }
            return v
        }
    }
}
