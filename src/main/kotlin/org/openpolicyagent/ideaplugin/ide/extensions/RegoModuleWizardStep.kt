package org.openpolicyagent.ideaplugin.ide.extensions

import com.intellij.ide.util.projectWizard.ModuleWizardStep
import javax.swing.JComponent
import javax.swing.JLabel

class RegoModuleWizardStep : ModuleWizardStep() {
    override fun updateDataModel() {

    }

    override fun getComponent(): JComponent {
        return JLabel("A Rego project is empty. Create a new Rego File to add.")
    }
}