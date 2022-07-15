package org.moe.idea.sdk

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.projectRoots.ProjectJdkTable
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.projectRoots.SdkModel
import com.intellij.openapi.projectRoots.ValidatableSdkAdditionalData
import org.jdom.Element

class MOESdkAdditionalData: ValidatableSdkAdditionalData {
    val sdk: Sdk
    private var jdk: Sdk? = null
    private var jdkName: String? = null

    constructor(sdk: Sdk, jdk: Sdk?) {
        this.sdk = sdk
        this.jdk = jdk
    }

    constructor(sdk: Sdk, element: Element) {
        this.sdk = sdk
        jdkName = element.getAttributeValue(JDK)
    }

    override fun checkValid(sdkModel: SdkModel) {
        if (javaSdk == null) {
            throw ConfigurationException("No JDK configured")
        }
    }

    var javaSdk: Sdk?
    get() {
        val jdkTable = ProjectJdkTable.getInstance()
        if (jdk == null) {
            if (jdkName != null) {
                jdk = jdkTable.findJdk(jdkName!!)
                jdkName = null
            } else {
                jdk = jdkTable.allJdks.firstOrNull(MOESdkType::isApplicableJdk)
            }
        }

        return jdk
    }
    set(value) {
        jdk = value
    }

    fun save(element: Element) {
        javaSdk?.let {
            element.setAttribute(JDK, it.name)
        }
    }

    companion object {
        private const val JDK = "jdk"

        @JvmStatic
        fun getInstance(sdk: Sdk): MOESdkAdditionalData? = sdk.sdkAdditionalData as? MOESdkAdditionalData
    }
}
