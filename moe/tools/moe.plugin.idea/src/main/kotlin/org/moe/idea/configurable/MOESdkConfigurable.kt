package org.moe.idea.configurable

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.projectRoots.AdditionalDataConfigurable
import com.intellij.openapi.projectRoots.JavaSdk
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.projectRoots.SdkModel
import com.intellij.openapi.util.io.FileUtil
import com.intellij.ui.SimpleListCellRenderer
import org.moe.idea.sdk.MOESdkAdditionalData
import org.moe.idea.sdk.MOESdkType
import javax.swing.DefaultComboBoxModel
import javax.swing.JComboBox
import javax.swing.JComponent
import javax.swing.JPanel

class MOESdkConfigurable(
    private val sdkModel: SdkModel
) : AdditionalDataConfigurable {

    private lateinit var panel: JPanel
    private lateinit var internalJdkComboBox: JComboBox<Sdk>

    private val jdksModel = DefaultComboBoxModel<Sdk>()

    private var currentSdk: Sdk? = null
    private val sdkModelListener: SdkModel.Listener

    init {
        internalJdkComboBox.model = jdksModel
        internalJdkComboBox.renderer = SimpleListCellRenderer.create("", Sdk::getName)

        sdkModelListener = object : SdkModel.Listener {
            override fun sdkAdded(sdk: Sdk) {
                if (sdk.sdkType == JavaSdk.getInstance()) {
                    jdksModel.addElement(sdk)
                }
            }

            override fun beforeSdkRemove(sdk: Sdk) {
                if (sdk.sdkType == JavaSdk.getInstance()) {
                    jdksModel.removeElement(sdk)
                }
            }

            override fun sdkChanged(sdk: Sdk, previousName: String?) {
                if (sdk.sdkType == JavaSdk.getInstance()) {
                    sdkModel.sdks.forEach {
                        if (it != null && MOESdkType.isMOESdk(it)) {
                            val data = MOESdkAdditionalData.getInstance(it)
                            val jdk = data?.javaSdk
                            if (jdk != null && jdk.name == previousName) {
                                data.javaSdk = sdk
                            }
                        }
                    }

                    updateJdks()
                }
            }

            override fun sdkHomeSelected(sdk: Sdk, newSdkHome: String) {
                if (MOESdkType.isMOESdk(sdk)) {
                    MOESdkAdditionalData.getInstance(sdk)?.let { data ->
                        val jdk = data.javaSdk
                        if (jdksModel.getIndexOf(jdk) == -1) {
                            jdksModel.addElement(jdk)
                        } else {
                            jdksModel.selectedItem = jdk
                        }
                    }
                }
            }
        }
        sdkModel.addListener(sdkModelListener)
    }

    override fun createComponent(): JComponent {
        return panel
    }

    override fun isModified(): Boolean {
        val data = MOESdkAdditionalData.getInstance(currentSdk!!)
        val jdk = data?.javaSdk
        val jdkHomePath = jdk?.homePath

        val selectedJdk = internalJdkComboBox.selectedItem as Sdk?
        val selectedJdkHomePath = selectedJdk?.homePath

        return !FileUtil.pathsEqual(jdkHomePath, selectedJdkHomePath)
    }

    override fun apply() {
        val selectedJdk = internalJdkComboBox.selectedItem as Sdk?
        val newData = MOESdkAdditionalData(currentSdk!!, selectedJdk)
        val modificator = currentSdk!!.sdkModificator
        modificator.versionString = selectedJdk?.versionString
        modificator.sdkAdditionalData = newData
        ApplicationManager.getApplication().runWriteAction(modificator::commitChanges)
    }

    override fun setSdk(sdk: Sdk?) {
        currentSdk = sdk
    }

    private fun updateJdks() {
        jdksModel.removeAllElements()
        sdkModel.sdks.filter(MOESdkType::isApplicableJdk).forEach(jdksModel::addElement)
    }

    override fun reset() {
        val sdk = currentSdk ?: return
        val data = MOESdkAdditionalData.getInstance(sdk) ?: return

        updateJdks()

        val jdkName = data.javaSdk?.name
        for (i in (0 until jdksModel.size)) {
            if (jdksModel.getElementAt(i).name == jdkName) {
                internalJdkComboBox.selectedIndex = i
                break
            }
        }
    }

    override fun disposeUIResources() {
        sdkModel.removeListener(sdkModelListener)
    }
}
