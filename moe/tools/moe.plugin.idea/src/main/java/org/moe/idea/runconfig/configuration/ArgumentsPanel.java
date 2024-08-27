/*
 * Copyright 2000-2010 JetBrains s.r.o.
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moe.idea.runconfig.configuration;

import com.google.gson.Gson;
import com.intellij.execution.configuration.EnvironmentVariablesComponent;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.ui.PanelWithAnchor;
import com.intellij.ui.RawCommandLineEditor;
import com.intellij.util.execution.ParametersListUtil;

import org.jetbrains.annotations.Nullable;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class ArgumentsPanel extends JPanel implements PanelWithAnchor {
    private LabeledComponent<RawCommandLineEditor> myProgramParametersComponent;
    private EnvironmentVariablesComponent myEnvVariablesComponent;
    private LabeledComponent<RawCommandLineEditor> myVMParametersComponent;
    protected JComponent myAnchor;

    public ArgumentsPanel() {
        this(true);
    }

    public ArgumentsPanel(boolean init) {
        super();

        setLayout(new VerticalFlowLayout(VerticalFlowLayout.MIDDLE, 0, 5, true, true));
        if (init) {
            init();
        }

    }

    protected void init() {
        initComponents();
        copyDialogCaption(myProgramParametersComponent);
        updateUI();
    }

    @Override
    public JComponent getAnchor() {
        return this.myAnchor;
    }

    @Override
    public void setAnchor(@Nullable JComponent anchor) {
        this.myAnchor = anchor;
        myProgramParametersComponent.setAnchor(anchor);
        myEnvVariablesComponent.setAnchor(anchor);
        myVMParametersComponent.setAnchor(anchor);
    }

    protected void initComponents() {
        myVMParametersComponent = LabeledComponent.create(new RawCommandLineEditor(), "VM options:");
        copyDialogCaption(myVMParametersComponent);
        myVMParametersComponent.setLabelLocation(BorderLayout.CENTER);
        myProgramParametersComponent = LabeledComponent.create(new RawCommandLineEditor(), "Program arguments:");
        myEnvVariablesComponent = new EnvironmentVariablesComponent();
        myEnvVariablesComponent.setLabelLocation(BorderLayout.CENTER);
        myProgramParametersComponent.setLabelLocation(BorderLayout.CENTER);

        copyDialogCaption(myProgramParametersComponent);

        addComponents();

        setPreferredSize(new Dimension(10, 10));

        setAnchor(myEnvVariablesComponent.getLabel());
    }

    protected void addComponents() {
        add(myEnvVariablesComponent);
        add(myVMParametersComponent);
        add(myProgramParametersComponent);
    }

    protected void copyDialogCaption(LabeledComponent<RawCommandLineEditor> component) {
        RawCommandLineEditor rawCommandLineEditor = (RawCommandLineEditor)component.getComponent();
        component.getLabel().setLabelFor(rawCommandLineEditor.getTextField());
    }

    public void setProgramParametersLabel(String textWithMnemonic) {
        this.myProgramParametersComponent.setText(textWithMnemonic);
        this.copyDialogCaption(this.myProgramParametersComponent);
    }

    public void setProgramParameters(String params) {
        ((RawCommandLineEditor)this.myProgramParametersComponent.getComponent()).setText(params);
    }

    public void applyEditorTo(MOERunConfiguration configuration) {
        final Gson gson = new Gson();

        final String argsString = myProgramParametersComponent.getComponent().getText();
        final java.util.List<String> args = ParametersListUtil.parse(argsString, false);
        configuration.setProgramArgumentsJSONString(gson.toJson(args, List.class));

        final String vmargsString = myVMParametersComponent.getComponent().getText();
        final java.util.List<String> vmargs = ParametersListUtil.parse(vmargsString, false);
        configuration.setVMArgumentsJSONString(gson.toJson(vmargs, List.class));

        configuration.setEnvironmentVariablesJSONString(gson.toJson(myEnvVariablesComponent.getEnvs(), Map.class));
    }

    public void resetEditorFrom(MOERunConfiguration configuration) {
        myProgramParametersComponent.getComponent().setText(getQuotedString(configuration.getProgramArguments()));
        myVMParametersComponent.getComponent().setText(getQuotedString(configuration.getVMArguments()));
        myEnvVariablesComponent.setEnvs(configuration.getEnvironmentVariables());
    }

    private String getQuotedString(List<String> args) {
        final ArrayList<String> copy = new ArrayList<String>();
        for (String arg : args) {
            if (arg.contains(" ")) {
                copy.add("\"" + arg + "\"");
            } else {
                copy.add(arg);
            }
        }
        return ParametersListUtil.DEFAULT_LINE_JOINER.fun(copy);
    }
}
