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
import org.moe.common.constants.MOEManifestConstants;
import org.moe.common.constants.MOEManifestConstants.LIBRARIES_PATHS;
import org.moe.common.constants.MOEManifestConstants.LINKER_FLAGS;
import org.moe.idea.actions.MOELinkThirdpartyFramework;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MOEUniversalLibraryPanel extends MOEUniversalFrameworkPanel {

    private JPanel centralPanel;
    private JTextField headersTextField;
    private JTextField libraryTextField;
    private JLabel archs;
    private JLabel fileType;

    private Boolean type;


    private MOEFrameworkDependencyPanel.DependencyTabListener dependencyTabListener;

    public MOEUniversalLibraryPanel(boolean isDynamic, Module module, MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate) {
        super(isDynamic, module, delegate);

        centralPanel = new JPanel();

        headersTextField = new JTextField(20);
        headersTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                if(type != null && type){
                    updateDependency();
                }
                else{
                    dependencyTabListener.clearDependency();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                if(type != null && type){
                    updateDependency();
                }
                else{
                    dependencyTabListener.clearDependency();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                if(type != null && type){
                    updateDependency();
                }
                else{
                    dependencyTabListener.clearDependency();
                }
            }
        });

        libraryTextField = new JTextField(20);
        libraryTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                updateArch();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                updateArch();
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                updateArch();
            }

            private void updateArch(){
                File framework = new File(libraryTextField.getText());
                if(framework.exists()) {
                    List<CPU_TYPE> result = checkArchitectures(framework);

                    if(result.size() > 0){
                        StringBuilder content = new StringBuilder();
                        type = false;
                        for(CPU_TYPE typeArch : result){
                            content.append(typeArch.getName()).append(", ");
                            type |= typeArch.isStatic();
                        }

                        if(fileType != null){
                            fileType.setText(type ? "static" : "dynamic");
                        }

                        if(archs != null){
                            String archContent = content.toString();
                            archs.setText(archContent.substring(0, archContent.length() - 2));
                        }
                    }
                    else{
                        fileType.setText("");
                        archs.setText("");
                    }

                }


            }

        });

        archs = new JLabel();
        fileType = new JLabel();
    }

    public void setDependencyTabListener(MOEFrameworkDependencyPanel.DependencyTabListener dependencyTabListener) {
        this.dependencyTabListener = dependencyTabListener;
    }

    @Override
    protected JPanel createCenterPanel() {
        centralPanel.setLayout(new GridBagLayout());

        GridBagConstraints c =  new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        centralPanel.add(new JLabel("Headers: "), c);

        c.gridx = 1;
        centralPanel.add(headersTextField, c);

        c.gridx = 2;
        JButton headerButton = new JButton("...");
        ButtonMouseListener headerListener = new ButtonMouseListener(headersTextField);
        headerButton.addMouseListener(headerListener);
        centralPanel.add(headerButton, c);

        c.gridx = 0;
        c.gridy = 1;
        centralPanel.add(new JLabel("Library: "), c);

        c.gridx = 1;
        centralPanel.add(libraryTextField, c);

        c.gridx = 2;
        JButton libButton = new JButton("...");
        ButtonMouseListener libListener = new ButtonMouseListener(libraryTextField);
        libButton.addMouseListener(libListener);
        centralPanel.add(libButton, c);

        //add statistic lines
        c.gridx = 0;
        c.gridy = 2;
        centralPanel.add(new JLabel("Architectures: "), c);
        c.gridx = 1;
        centralPanel.add(archs, c);

        c.gridx = 0;
        c.gridy = 3;
        centralPanel.add(new JLabel("Type: "), c);
        c.gridx = 1;
        centralPanel.add(fileType, c);

        return centralPanel;
    }

    public Map<String, String> getManifestProperties(){
        Map<String, String> result = new HashMap<String, String>();

        String value = libraryTextField.getText();
        File frameworkFile = new File(value);
        if(value != null && !value.isEmpty() && frameworkFile.exists()){
            result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_universal.name(), "./lib/" + frameworkFile.getName());
            result.put(MOEManifestConstants.MOE_TYPE, fileType.getText());
        }

        String libName = libraryTextField.getText();
        if(libName != null && !libName.isEmpty()){
            File libFile = new File(libName);
            if(libFile.exists()){

                String libTmpName = libFile.getName();
                int extIdx = libTmpName.lastIndexOf(".");
                libTmpName = libTmpName.substring(0, extIdx);
                if(libTmpName.startsWith("lib")){
                    libTmpName = libTmpName.substring(3);
                }

                result.put(LINKER_FLAGS.MOE_CUSTOM_LINKER_FLAGS.name(), "-l" + libTmpName);
            }
        }

        return result;
    }

    @Override
    public void copyToResultDir(File libDir) throws IOException {
        String value = libraryTextField.getText();
        File frameworkFile = new File(value);
        if(value != null && !value.isEmpty() && frameworkFile.exists()) {
            File destinationFr = new File(libDir, frameworkFile.getName());
            if(!destinationFr.exists()){
                destinationFr.createNewFile();
            }
            copyFiles(frameworkFile, destinationFr);
        }
    }

    @Override
    protected boolean isFileCorrect(VirtualFile[] files) {
        return true;
    }

    @Override
    protected List<String> getFiles() {
        List<String> result = new ArrayList<String>();
        result.add(headersTextField.getText());
        result.add(libraryTextField.getText());

        return result;
    }

    private void updateDependency(){
        dependencyTabListener.clearDependency();

        File frameworkFile = new File(headersTextField.getText());

        if (frameworkFile.exists()) {
            Map<String, String> frameworkMap = getFrameworkMap();

            File headerFolder = new File(headersTextField.getText());
            if(headerFolder.exists()){
                Set<String> dependencyList = new HashSet<String>();

                List<File> headerList = getAllSubFiles(headerFolder);

                Pattern includePattern = Pattern.compile(".*((import)|(include)).*<\\s*\\w+/\\w+.*\\s*>.*");

                for(File header : headerList){
                    BufferedReader reader = null;
                    try{
                        reader = new BufferedReader(new FileReader(header));

                        String line;
                        StringBuilder contentHeader = new StringBuilder();
                        while ((line = reader.readLine()) != null){
                            Matcher includeMatcher = includePattern.matcher(line);
                            if(includeMatcher.find()){
                                int bracketIdx = line.indexOf("<");
                                int slashIdx = line.indexOf("/");
                                String framework = line.substring(bracketIdx + 1, slashIdx).trim();
                                if(frameworkMap.containsKey(framework)){
                                    dependencyList.add(framework);
                                }

                            }
                        }
                    }
                    catch (Exception e){

                    }
                    finally {
                        if(reader != null){
                            try {
                                reader.close();
                            } catch (IOException e) {

                            }
                        }
                    }
                }

                //add all dependency in list;
                dependencyTabListener.addDependency(dependencyList);
            }
        }


    }
}
