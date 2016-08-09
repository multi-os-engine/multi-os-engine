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

import org.moe.idea.actions.MOELinkThirdpartyFramework;
import org.moe.common.constants.MOEManifestConstants;
import org.moe.common.constants.MOEManifestConstants.LIBRARIES_PATHS;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MOEUniversalFrameworkPanel extends MOEAbstractFrameworkPanel {

    private final int LIMIT_ARCH = 5;
    private List<JTextField> universalTextFieldList;
    private List<JPanel> frameworkPanelList;

    private JCheckBox forceLoad;
    private JPanel frameworkEditorPanel;
    private JLabel currentArches;
    private JLabel jLabel;

    private Set<CPU_TYPE> archList;

    private Map<String, Set<CPU_TYPE>> archFileMapping;

    private Boolean type;

    private MOEFrameworkDependencyPanel.DependencyTabListener dependencyTabListener;

    public MOEUniversalFrameworkPanel(boolean isDynamic, Module module, MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate) {
        super(isDynamic, module, delegate);

        type = null;

        archList = new HashSet<CPU_TYPE>();
        universalTextFieldList = new ArrayList<JTextField>();
        frameworkPanelList = new ArrayList<JPanel>();
        archFileMapping = new HashMap<String, Set<CPU_TYPE>>();

        frameworkEditorPanel = new JPanel(new GridBagLayout());
    }

    public void setDependencyTabListener(MOEFrameworkDependencyPanel.DependencyTabListener dependencyTabListener) {
        this.dependencyTabListener = dependencyTabListener;
    }

    public boolean isForceLoad() {
        return forceLoad.isSelected();
    }

    public Map<String, String> getManifestProperties() {
        Map<String, String> result = new HashMap<String, String>();

        for (JTextField field : universalTextFieldList) {
            String value = field.getText();
            File frameworkFile = new File(value);
            if (value != null && !value.isEmpty() && frameworkFile.exists()) {

                Set<CPU_TYPE> archs = archFileMapping.get(value);
                if (archs == null) {
                    throw new NullPointerException("Failed to get manifest properties!");
                }

                if (archs.size() >= 4) {
                    result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_universal.name(), "./lib/" + frameworkFile.getName());
                    result.put(MOEManifestConstants.MOE_TYPE, jLabel.getText());
                    return result;
                } else if (archs.size() >= 2) {
                    boolean isArm = false;
                    for (CPU_TYPE arch : archs) {
                        isArm |= arch.isArm();
                    }

                    if (isArm) {
                        result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_device.name(), "./lib/device/" + frameworkFile.getName());
                    } else {
                        result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_simulator.name(), "./lib/simulator/" + frameworkFile.getName());
                    }
                } else if (archs.size() == 1) {
                    CPU_TYPE arch = archs.iterator().next();
                    result.put(arch.getManifestConst(), String.format("./lib/%s/", arch.getName()) + frameworkFile.getName());
                }
            }
        }
        result.put(MOEManifestConstants.MOE_TYPE, jLabel.getText());
        return result;
    }

    @Override
    public void copyToResultDir(File libDir) throws IOException {

        for (JTextField field : universalTextFieldList) {
            String value = field.getText();
            File frameworkFile = new File(value);
            if (value != null && !value.isEmpty() && frameworkFile.exists()) {
                Set<CPU_TYPE> archs = archFileMapping.get(value);

                if (archs == null) {
                    throw new NullPointerException("Failed to get archs for framework: " + frameworkFile.getAbsolutePath());
                }

                if (archs.size() >= 4) {
                    File destinationFr = new File(libDir, frameworkFile.getName());
                    if (!destinationFr.exists()) {
                        destinationFr.mkdir();
                    }
                    copyFolder(frameworkFile, destinationFr);
                } else if (archs.size() >= 2) {
                    boolean isArm = false;
                    for (CPU_TYPE arch : archs) {
                        isArm |= arch.isArm();
                    }

                    File destinationFr = null;
                    if (isArm) {
                        destinationFr = new File(libDir, "device");
                    } else {
                        destinationFr = new File(libDir, "simulator");
                    }

                    destinationFr = new File(destinationFr, frameworkFile.getName());
                    if (!destinationFr.exists()) {
                        destinationFr.mkdirs();
                    }
                    copyFolder(frameworkFile, destinationFr);
                } else if (archs.size() == 1) {
                    CPU_TYPE arch = archs.iterator().next();
                    File destinationFr = new File(libDir, String.format("%s/%s", arch.getName(), frameworkFile.getName()));
                    if (!destinationFr.exists()) {
                        destinationFr.mkdirs();
                    }
                    copyFolder(frameworkFile, destinationFr);
                }
            }
        }
    }

    protected JPanel createCenterPanel() {
        JPanel result = new JPanel();
        result.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JTextField textField = new JTextField(20);
        textField.setEnabled(false);
        universalTextFieldList.add(textField);

        textField.getDocument().addDocumentListener(new CustomDocumentListener());

        JPanel frameworkPanel = new JPanel();
        frameworkPanel.setLayout(new GridBagLayout());
        frameworkPanelList.add(frameworkPanel);

        createFileBrowser(c, frameworkPanel, textField, "Select framework: ", 0, new AddPanelButton(frameworkPanel, textField), new DeletePanelButton(frameworkPanel, textField));

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridwidth = 4;
        c.gridy = 0;
        frameworkEditorPanel.add(frameworkPanel);

        result.add(frameworkEditorPanel, c);

        //add force load
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridy = 1;
        forceLoad = new JCheckBox("Force load: ");
        result.add(forceLoad, c);


        //add arch status string
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridy = 2;
        result.add(new JLabel("Available architectures: "), c);

        currentArches = new JLabel();

        c.gridx = 1;
        result.add(currentArches, c);

        //add static/dynamic status string
        c.gridx = 0;
        c.gridheight = 1;
        c.gridy = 3;
        result.add(new JLabel("Type: "), c);

        jLabel = new JLabel();

        c.gridx = 1;
        result.add(jLabel, c);

        return result;
    }

    @Override
    protected void setPanelEnabled(boolean isDynamic) {

    }

    @Override
    protected String getBorderName() {
        return "Framework";
    }

    @Override
    protected void updateType(Boolean isStatic) {
        String staticFramework = "";
        if (isStatic != null) {
            staticFramework = isStatic ? "static" : "dynamic";
        }

        jLabel.setText(staticFramework);
    }

    @Override
    protected void updateArchs(String statInfo) {
        currentArches.setText(statInfo);
    }

    @Override
    protected boolean isTheSameNameFramework(VirtualFile file) {
        String frameworkName = file.getName();

        boolean isTheSameName = true;
        for (JTextField field : universalTextFieldList) {
//            if(!field.equals(_textField)){
//
//            }
            if (field.getText() != null && !field.getText().isEmpty() && !field.getText().endsWith("/" + frameworkName)) {
                isTheSameName = false;
                break;
            }

            if (field.getText() != null && !field.getText().isEmpty() && field.getText().equals(file.getPath())) {
                isTheSameName = false;
                break;
            }
        }
        return isTheSameName;
    }

    @Override
    protected List<String> getFiles() {
        List<String> result = new ArrayList<String>();
        for (JTextField field : universalTextFieldList) {
            result.add(field.getText());
        }

        return result;
    }

    @Override
    protected boolean isFileCorrect(VirtualFile[] files) {
        return files.length == 1 && files[0].getName().endsWith(".framework") && isTheSameNameFramework(files[0]);
    }

    private void updateStatus() {
        String archs = "";
        type = null;

        archList.clear();
        for (JTextField textField : universalTextFieldList) {
            File framework = new File(textField.getText());
            if (framework.exists()) {
                File file = new File(framework.getPath(), framework.getName().replace(".framework", ""));
                Set<CPU_TYPE> setArch = new HashSet<CPU_TYPE>(checkArchitectures(file));
                archFileMapping.put(framework.getPath(), setArch);
                archList.addAll(setArch);
            }
        }

        if (archList.size() > 0) {
            StringBuilder content = new StringBuilder();
            type = false;
            for (CPU_TYPE typeArch : archList) {
                content.append(typeArch.getName()).append(", ");
                type |= typeArch.isStatic();
            }
            archs = content.toString();
            archs = archs.substring(0, archs.length() - 2);
        }

        updateArchs(archs);
        updateType(type);
    }

    private void updateDependency() {
        dependencyTabListener.clearDependency();

        File frameworkFile = null;
        for (JTextField textField : universalTextFieldList) {
            File framework = new File(textField.getText());
            if (framework.exists()) {
                frameworkFile = framework;
                break;
            }
        }

        if (frameworkFile != null) {
            Map<String, String> frameworkMap = getFrameworkMap();

            File headerFolder = new File(frameworkFile, "Headers");
            if (headerFolder.exists()) {
                Set<String> dependencyList = new HashSet<String>();

                List<File> headerList = getAllSubFiles(headerFolder);

                File privateHeadersFile = new File(frameworkFile, "PrivateHeaders");
                if (privateHeadersFile.exists()) {
                    headerList.addAll(getAllSubFiles(privateHeadersFile));
                }


                Pattern includePattern = Pattern.compile(".*((import)|(include)).*<\\s*\\w+/\\w+.*\\s*>.*");

                for (File header : headerList) {
                    BufferedReader reader = null;
                    try {
                        reader = new BufferedReader(new FileReader(header));

                        String line;
                        StringBuilder contentHeader = new StringBuilder();
                        while ((line = reader.readLine()) != null) {
                            Matcher includeMatcher = includePattern.matcher(line);
                            if (includeMatcher.find()) {
                                int bracketIdx = line.indexOf("<");
                                int slashIdx = line.indexOf("/");
                                String framework = line.substring(bracketIdx + 1, slashIdx).trim();
                                if (frameworkMap.containsKey(framework)) {
                                    dependencyList.add(framework);
                                }

                            }


                        }
                    } catch (Exception e) {

                    } finally {
                        if (reader != null) {
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

    protected Map<String, String> getFrameworkMap() {
        BufferedReader reader = null;
        Map<String, String> result = new HashMap<String, String>();
        try {
            InputStream headerStream = MOEUniversalFrameworkPanel.class.getResourceAsStream("/template/bindings/frameworks");
            reader = new BufferedReader(new InputStreamReader(headerStream));

            String line;
            StringBuilder contentHeader = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("#")) {
                    String key = line.split("\\.")[0];
                    String value = String.format("-framework %s", key);
                    result.put(key, value);
                }

            }

        } catch (Exception e) {

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {

                }
            }
        }
        return result;
    }

    protected List<File> getAllSubFiles(File folder) {
        List<File> result = new ArrayList<File>();

        File[] listFiles = folder.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    result.addAll(getAllSubFiles(file));
                } else {
                    result.add(file);
                }
            }
        } else {
        }

        return result;
    }

    protected class CustomDocumentListener implements DocumentListener {

        public void changedUpdate(DocumentEvent e) {
            updateStatus();

            if (type != null && type) {
                updateDependency();
            } else {
                dependencyTabListener.clearDependency();
            }

        }

        public void removeUpdate(DocumentEvent e) {
            updateStatus();

            if (type != null && type) {
                updateDependency();
            } else {
                dependencyTabListener.clearDependency();
            }
        }

        public void insertUpdate(DocumentEvent e) {
            updateStatus();

            if (type != null && type) {
                updateDependency();
            } else {
                dependencyTabListener.clearDependency();
            }
        }
    }

    protected class AddPanelButton extends MouseAdapter {
        JPanel currentPanel;

        public AddPanelButton(JPanel currentPanel, JTextField textField) {
            this.currentPanel = currentPanel;
        }

        public void mousePressed(MouseEvent var1) {
            if (frameworkPanelList.size() < LIMIT_ARCH) {
                GridBagConstraints c = new GridBagConstraints();

                JTextField textField = new JTextField(20);
                textField.setEnabled(false);
                universalTextFieldList.add(textField);

                textField.getDocument().addDocumentListener(new CustomDocumentListener());

                JPanel frameworkPanel = new JPanel();
                frameworkPanel.setLayout(new GridBagLayout());
                frameworkPanelList.add(frameworkPanel);

                createFileBrowser(c, frameworkPanel, textField, "Select framework: ", 0, new AddPanelButton(frameworkPanel, textField), new DeletePanelButton(frameworkPanel, textField));

                frameworkEditorPanel.removeAll();
                for (int i = 0; i < frameworkPanelList.size(); ++i) {
                    c.fill = GridBagConstraints.HORIZONTAL;
                    c.gridx = 0;
                    c.gridwidth = 4;
                    c.gridy = i;
                    frameworkEditorPanel.add(frameworkPanelList.get(i), c);
                }
                revalidate();
            }
        }
    }

    protected class DeletePanelButton extends MouseAdapter {
        private JPanel currentPanel;
        private JTextField textField;

        public DeletePanelButton(JPanel currentPanel, JTextField textField) {
            this.currentPanel = currentPanel;
            this.textField = textField;
        }

        public void mousePressed(MouseEvent var1) {
            if (frameworkPanelList.size() > 1) {
                frameworkPanelList.remove(currentPanel);
                universalTextFieldList.remove(textField);

                archFileMapping.remove(textField.getText());

                frameworkEditorPanel.remove(currentPanel);
                revalidate();
                updateStatus();
            }
        }
    }
}
