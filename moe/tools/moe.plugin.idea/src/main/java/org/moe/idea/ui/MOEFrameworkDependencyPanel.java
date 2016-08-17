/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea.ui;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.components.JBList;
import org.moe.common.constants.MOEManifestConstants.LINKER_FLAGS;
import org.moe.idea.actions.MOELinkThirdpartyFramework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MOEFrameworkDependencyPanel extends MOEAbstractFrameworkPanel {
    private JToolBar toolbar;

    private AddAction addButton;
    private DeleteAction deleteButton;

    private JBList dependencyList;
    private JTextField dependencyTextField;
    private DefaultListModel depModel;

    private JBList flagList;
    private JTextField flagTextField;
    private DefaultListModel flagModel;

    public MOEFrameworkDependencyPanel(boolean isDynamic, Module module, MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate) {
        super(isDynamic, module, delegate);
    }

    public Map<String, String> getManifestProperties(){
        Map<String, String> result = new HashMap<String, String>();

        StringBuilder framework = new StringBuilder();
        for(Object element : depModel.toArray()){
            framework.append(String.format("-framework %s;", element.toString()));

        }
        if(framework.toString().length() > 0){
            result.put(LINKER_FLAGS.MOE_FRAMEWORKS.name(), framework.toString());
        }


        StringBuilder flags = new StringBuilder();
        for(Object element : flagModel.toArray()){
            flags.append(element.toString()).append(";");
        }
        if(flags.toString().length() > 0){
            result.put(LINKER_FLAGS.MOE_CUSTOM_LINKER_FLAGS.name(), flags.toString());
        }

        return result;
    }

    @Override
    public void copyToResultDir(File libDir) throws IOException {

    }

    public DependencyTabListener getListener(){
        return new DependencyTabListener();
    }

    protected JPanel createCenterPanel(){
        JPanel result = new JPanel();
        result.setLayout(new BoxLayout(result, BoxLayout.Y_AXIS));

        //dependency
        JPanel dependencyPanel = new JPanel(new BorderLayout());
        toolbar = new JToolBar();
        toolbar.setRollover(true);

        addButton = new AddAction("Add");
        toolbar.add(addButton);

        deleteButton = new DeleteAction("Delete");
        toolbar.add(deleteButton);
        toolbar.addSeparator();

        dependencyTextField = new JTextField(20);
        toolbar.add(new JLabel("Framework: "));
        toolbar.add(dependencyTextField);
        dependencyPanel.add(toolbar, BorderLayout.NORTH);

        depModel = new DefaultListModel();

        dependencyList = new JBList(depModel);
        dependencyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        dependencyPanel.add(dependencyList, BorderLayout.CENTER);

        //flags
        JPanel flagPanel = new JPanel(new BorderLayout());
        JToolBar flagToolbar = new JToolBar();
        flagToolbar.setRollover(true);

        AddFlagAction addFlagButton = new AddFlagAction("Add");
        flagToolbar.add(addFlagButton);

        DeleteFlagAction deleteFlagButton = new DeleteFlagAction("Delete");
        flagToolbar.add(deleteFlagButton);
        flagToolbar.addSeparator();

        flagTextField = new JTextField(20);
        flagToolbar.add(new JLabel("Linker flags: "));
        flagToolbar.add(flagTextField);

        flagPanel.add(flagToolbar, BorderLayout.NORTH);

        flagModel = new DefaultListModel();
        flagList = new JBList(flagModel);
        flagList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        flagPanel.add(flagList, BorderLayout.CENTER);

        //add panels to result
        result.add(dependencyPanel);
        result.add(flagPanel);

        return result;
    }

    @Override
    protected void setPanelEnabled(boolean isDynamic) {
        toolbar.setEnabled(isDynamic);
        addButton.setEnabled(isDynamic);
        deleteButton.setEnabled(isDynamic);
        dependencyList.setEnabled(isDynamic);
        dependencyTextField.setEnabled(isDynamic);
    }

    @Override
    protected String getBorderName() {
        return "Dependency";
    }

    @Override
    protected void updateType(Boolean isStatic) {

    }

    @Override
    protected void updateArchs(String statInfo) {

    }

    @Override
    protected boolean isTheSameNameFramework(VirtualFile file) {
        return false;
    }

    @Override
    protected List<String> getFiles() {
        return null;
    }

    @Override
    protected boolean isFileCorrect(VirtualFile[] files) {
        return false;
    }

    private class AddAction extends AbstractAction {

        AddAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {
            String dependencyFramework = dependencyTextField.getText();

            if(dependencyFramework != null && !dependencyFramework.isEmpty()){
                depModel.addElement(dependencyFramework);
                dependencyTextField.setText("");
            }
        }
    }

    private class DeleteAction extends AbstractAction {

        DeleteAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {
            int selected = dependencyList.getSelectedIndex();
            if(selected >= 0){
                depModel.remove(selected);
            }
        }
    }

    class DependencyTabListener {

        void addDependency(Set<String> dependencyList) {
            for(String dependency : dependencyList){
                depModel.addElement(dependency);
            }
            setPanelEnabled(true);
        }

        void clearDependency(){
            depModel.clear();
            setPanelEnabled(false);
        }
    }


    private class AddFlagAction extends AbstractAction {

        AddFlagAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {
            String dependencyFramework = flagTextField.getText();

            if(dependencyFramework != null && !dependencyFramework.isEmpty()){
                flagModel.addElement(dependencyFramework);
                flagTextField.setText("");
            }
        }
    }

    private class DeleteFlagAction extends AbstractAction {

        DeleteFlagAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {
            int selected = flagList.getSelectedIndex();
            if(selected >= 0){
                flagModel.remove(selected);
            }
        }
    }

}
