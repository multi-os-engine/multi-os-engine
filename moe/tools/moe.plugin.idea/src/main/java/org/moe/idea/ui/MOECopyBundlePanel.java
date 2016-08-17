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

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.components.JBList;
import org.moe.common.constants.MOEManifestConstants.BUNDLE_RESOURCES;
import org.moe.idea.actions.MOELinkThirdpartyFramework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MOECopyBundlePanel extends MOEAbstractFrameworkPanel {

    private JToolBar toolbar;

    private AddAction addButton;
    private DeleteAction deleteButton;

    private JBList dependencyList;
    private DefaultListModel depModel;


    public MOECopyBundlePanel(boolean isSelected, Module module, MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate) {
        super(isSelected, module, delegate);
    }

    public Map<String, String> getManifestProperties() {
        Map<String, String> result = new HashMap<String, String>();

        Object[] entries = depModel.toArray();

        StringBuilder folderContent = new StringBuilder();
        StringBuilder fileContent = new StringBuilder();
        for (Object entry : entries) {
            File bundle = new File(entry.toString());
            if (bundle.exists() && bundle.isDirectory()) {
                folderContent.append(bundle.getAbsolutePath()).append(":");
            } else if (bundle.exists() && bundle.isFile()) {
                fileContent.append(bundle.getAbsolutePath()).append(":");
            }

        }

        if (folderContent.toString().length() > 0) {
            result.put(BUNDLE_RESOURCES.MOE_BUNDLE_FOLDER_RESOURCES.name(), folderContent.toString());
        }

        if (fileContent.toString().length() > 0) {
            result.put(BUNDLE_RESOURCES.MOE_BUNDLE_FILE_RESOURCES.name(), fileContent.toString());
        }

        return result;
    }

    @Override
    public void copyToResultDir(File libDir) throws IOException {
        Object[] entries = depModel.toArray();

        for (Object entry : entries) {
            String pathToFile = entry.toString();
            File bundle = new File(pathToFile);

            if (bundle.exists()) {
                if (bundle.isDirectory()) {
                    File destenation = new File(libDir, bundle.getName());
                    if (!destenation.exists()) {
                        destenation.mkdirs();
                    }
                    copyFolder(bundle, destenation);
                } else {
                    File destenation = new File(libDir, bundle.getName());
                    if (!destenation.exists()) {
                        destenation.createNewFile();
                    }
                    copyFiles(bundle, destenation);
                }
            }
        }
    }

    protected JPanel createCenterPanel() {
        JPanel result = new JPanel();
        result.setLayout(new BorderLayout());

        toolbar = new JToolBar();
        toolbar.setRollover(true);

        addButton = new AddAction("Add");
        toolbar.add(addButton);

        deleteButton = new DeleteAction("Delete");
        toolbar.add(deleteButton);
        toolbar.addSeparator();

        result.add(toolbar, BorderLayout.NORTH);

        depModel = new DefaultListModel();

        dependencyList = new JBList(depModel);
        dependencyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        result.add(dependencyList, BorderLayout.CENTER);

        return result;
    }

    @Override
    protected void setPanelEnabled(boolean isDynamic) {
        toolbar.setEnabled(isDynamic);
        addButton.setEnabled(isDynamic);
        deleteButton.setEnabled(isDynamic);
        dependencyList.setEnabled(isDynamic);
    }

    @Override
    protected String getBorderName() {
        return "Copy bundle";
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

    protected void copyFolder(File src, File dest)
            throws IOException {

        if (src.isDirectory()) {

            //if directory not exists, create it
            if (!dest.exists()) {
                dest.mkdir();
            }

            //list all the directory contents
            String files[] = src.list();
            if (files == null) {
                return;
            }

            for (String file : files) {
                //construct the src and dest file structure
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                //recursive copy
                copyFolder(srcFile, destFile);
            }

        } else {
            InputStream inStream = null;
            OutputStream outStream = null;
            try {
                //if file, then copy it
                //Use bytes stream to support all file types
                inStream = new FileInputStream(src);
                outStream = new FileOutputStream(dest);

                byte[] buffer = new byte[1024];

                int length;
                //copy the file content in bytes
                while ((length = inStream.read(buffer)) > 0) {
                    outStream.write(buffer, 0, length);
                }
            } finally {
                if (inStream != null) {
                    try {
                        inStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (outStream != null) {
                    try {
                        outStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    protected void copyFiles(File file1, File file2) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(file1);
            outStream = new FileOutputStream(file2);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File Copied..");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class AddAction extends AbstractAction {

        public AddAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {

            String user_home = System.getProperty("user.home");
            String path = user_home != null && !user_home.isEmpty() ? user_home : "/";
            File root = new File(path);

            VirtualFile vRoot = VfsUtil.findFileByIoFile(root, true);

            FileChooserDescriptor desc = new FileChooserDescriptor(true, true, false, false, false, false);
            FileChooserDialog fileDialog = FileChooserFactory.getInstance().createFileChooser(desc, null, null);
            VirtualFile[] files = fileDialog.choose(getModule().getProject(), vRoot);

            if (files.length > 0) {
                depModel.addElement(files[0].getPath());
            }
        }
    }

    class DeleteAction extends AbstractAction {

        public DeleteAction(String text) {
            super(text);
        }

        public void actionPerformed(ActionEvent e) {
            int selected = dependencyList.getSelectedIndex();
            if (selected >= 0) {
                depModel.remove(selected);
            }
        }
    }

}
