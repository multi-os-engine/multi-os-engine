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
import org.moe.common.constants.MOEManifestConstants.LIBRARIES_PATHS;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import org.apache.sanselan.util.IOUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class MOEAbstractFrameworkPanel extends JPanel implements MOEFrameworkPanel {

    private JPanel northPanel;
    private JPanel centerPanel;
    private boolean isDynamic;
    private Module module;
    private MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate;

    public MOEAbstractFrameworkPanel(boolean isDynamic, Module module, MOELinkThirdpartyFramework.FrameworkChooseDialog.SelectorDelegate delegate) {
        this.isDynamic = isDynamic;
        this.module = module;
        this.delegate = delegate;
    }

    public void init() {
        setLayout(new BorderLayout());

        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(northPanel, BorderLayout.NORTH);

        centerPanel = createCenterPanel();

        Border centerBorder = BorderFactory.createTitledBorder(getBorderName());
        centerPanel.setBorder(centerBorder);

        centerPanel.setEnabled(isDynamic);
        setPanelEnabled(isDynamic);

        add(centerPanel, BorderLayout.CENTER);
    }

    public boolean isDynamic() {
        return isDynamic;
    }

    public java.util.List<VirtualFile> getVirtualFiles() {
        List<String> properties = getFiles();

        java.util.List<VirtualFile> result = new ArrayList<VirtualFile>();
        for (String fileName : properties) {
            File file = new File(fileName);
            if (file.exists()) {
                VirtualFile vFile = VfsUtil.findFileByIoFile(file, true);
                result.add(vFile);
            }
        }

        return result;
    }

    protected Module getModule() {
        return module;
    }

    protected void deleteComponentFromCenter(Component component) {
        centerPanel.remove(component);
        centerPanel.revalidate();
    }

    protected void addComponentFromCenter(Component component, GridBagConstraints c) {
        centerPanel.add(component, c);
        centerPanel.revalidate();
    }

    protected void revalidateCenterPanel() {
        centerPanel.revalidate();
        repaint();
        revalidate();

    }

    public abstract Map<String, String> getManifestProperties();

    protected abstract JPanel createCenterPanel();

    protected abstract void setPanelEnabled(boolean isDynamic);

    protected abstract String getBorderName();

    protected abstract void updateType(Boolean isStatic);

    protected abstract void updateArchs(String statInfo);

    protected abstract boolean isTheSameNameFramework(VirtualFile file);

    protected abstract List<String> getFiles();

    protected abstract boolean isFileCorrect(VirtualFile[] files);

    protected void createFileBrowser(GridBagConstraints c, JPanel panel, JTextField textField, String label, int row, MOEUniversalFrameworkPanel.AddPanelButton addPanelButton, MOEUniversalFrameworkPanel.DeletePanelButton deletePanelButton) {

//        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
//        c.gridheight = 1;
        c.gridy = row;
        panel.add(new JLabel(label), c);

        c.gridx = 1;
        panel.add(textField, c);

        c.gridx = 2;
        JButton button = new JButton("...");

        ButtonMouseListener listener = new ButtonMouseListener(textField);
        button.addMouseListener(listener);
        panel.add(button, c);

        JPanel buttonsPanel = new JPanel(new BorderLayout());

        JButton buttonPlus = new JButton("+");
        buttonPlus.addMouseListener(addPanelButton);
        buttonPlus.setMargin(new Insets(0, 0, 0, 0));
        buttonsPanel.add(buttonPlus, BorderLayout.CENTER);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setMargin(new Insets(0, 0, 0, 0));
        buttonMinus.addMouseListener(deletePanelButton);
        buttonsPanel.add(buttonMinus, BorderLayout.LINE_END);

        c.gridx = 3;
        panel.add(buttonsPanel, c);

    }

    protected void copyFolder(File source, File destination) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            if (source.isDirectory()) {

                if (!destination.exists()) {
                    destination.mkdirs();
                }

                String fileArray[] = source.list();
                if (fileArray != null) {
                    for (String file : fileArray) {
                        File sourceFile = new File(source, file);
                        File destinationFile = new File(destination, file);

                        copyFolder(sourceFile, destinationFile);
                    }
                }
            }
            else {
                inputStream = new FileInputStream(source);
                outputStream = new FileOutputStream(destination);

                byte[] buf = new byte[1024];

                int length;
                while ((length = inputStream.read(buf)) > 0) {
                    outputStream.write(buf, 0, length);
                }
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
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

    protected List<CPU_TYPE> checkArchitectures(File framework) {
        List<CPU_TYPE> archList = new ArrayList<CPU_TYPE>();
        try {
            byte[] filedata = IOUtils.getFileBytes(framework);

            //read arch data
            //fat_header - 4kB
            //fat_arch - 20kB
            //fat_header + (5 * fat_arch) = 108
            int maxArchIdx = 108;

            for (int i = 8; i < maxArchIdx; i += 20) {

                if (filedata[i] != 0 || filedata[i + 1] != 0 || filedata[i + 2] != 0 || filedata[i + 3] != 0) {
                    ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                    int cputype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                    int cpusubtype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                    int offset = wrapped.getInt();

                    if (offset < maxArchIdx) {
                        maxArchIdx = offset;
                    }
                    //check if static: A static archive library begins with the file identifier string !<arch>
                    if (offset + 6 < filedata.length) {
                        StringBuilder builder = new StringBuilder();
                        builder.append((char) filedata[offset])
                                .append((char) filedata[offset + 1])
                                .append((char) filedata[offset + 2])
                                .append((char) filedata[offset + 3])
                                .append((char) filedata[offset + 4])
                                .append((char) filedata[offset + 5])
                                .append((char) filedata[offset + 6]);
                        CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                        if (type != null) {
                            type.setStatic(builder.toString().equals("!<arch>"));
                            archList.add(type);
                        }
                    }
                } else {
                    break;
                }
            }

            if (archList.size() == 0) {
                int i = 4;
                ByteBuffer wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                int cputype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                int cpusubtype = wrapped.getInt();

                wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                int offset = wrapped.getInt();

                CPU_TYPE type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                if (type == null) {
                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i], filedata[i + 1], filedata[i + 2], filedata[i + 3]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    cputype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 4], filedata[i + 5], filedata[i + 6], filedata[i + 7]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    cpusubtype = wrapped.getInt();

                    wrapped = ByteBuffer.wrap(new byte[]{filedata[i + 8], filedata[i + 9], filedata[i + 10], filedata[i + 11]}); // big-endian by default
                    wrapped.order(ByteOrder.LITTLE_ENDIAN);
                    offset = wrapped.getInt();

                }

                //check if static: A static archive library begins with the file identifier string !<arch>
                if (offset + 6 < filedata.length) {
                    StringBuilder builder = new StringBuilder();
                    builder.append((char) filedata[offset])
                            .append((char) filedata[offset + 1])
                            .append((char) filedata[offset + 2])
                            .append((char) filedata[offset + 3])
                            .append((char) filedata[offset + 4])
                            .append((char) filedata[offset + 5])
                            .append((char) filedata[offset + 6]);

                    type = CPU_TYPE.getArchByCPUType(cputype, cpusubtype);
                    if (type != null) {
                        type.setStatic(builder.toString().equals("!<arch>"));
                        archList.add(type);
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return archList;
    }

    public enum CPU_TYPE {
        ARMV7("armv7", LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7.name(), 12, 9, true),
        ARMV7S("armv7s", LIBRARIES_PATHS.MOE_ThirdpartyFramework_armv7s.name(), 12, 11, true),
        I386("i386", LIBRARIES_PATHS.MOE_ThirdpartyFramework_i386.name(), 7, 3, false),
        X86_64("x86_64", LIBRARIES_PATHS.MOE_ThirdpartyFramework_x86_64.name(), 16777223, 3, false),
        ARM64("arm64", LIBRARIES_PATHS.MOE_ThirdpartyFramework_arm64.name(), 16777228, 0, false);

        private String _arch_name;
        private String _manifest_const;
        private int _cpu_type;
        private int _cpu_subtype;
        private boolean _isArm;
        private boolean _isStatic;

        CPU_TYPE(String arch_name, String manifest_const, int cpu_type, int cpu_subtype, boolean isArm) {
            _arch_name = arch_name;
            _manifest_const = manifest_const;
            _cpu_type = cpu_type;
            _cpu_subtype = cpu_subtype;
            _isArm = isArm;
        }

        public static CPU_TYPE getArchByCPUType(int cpu_type, int cpu_subtype) {
            for (CPU_TYPE type : CPU_TYPE.values()) {
                if (type._cpu_type == cpu_type && type._cpu_subtype == cpu_subtype) {
                    return type;
                }
            }
            return null;
        }

        public boolean isStatic() {
            return _isStatic;
        }

        public void setStatic(boolean isStatic) {
            _isStatic = isStatic;
        }

        public boolean isArm() {
            return _isArm;
        }

        public String getName() {
            return _arch_name;
        }

        public String getManifestConst() {
            return _manifest_const;
        }

    }

    class ButtonMouseListener extends MouseAdapter {
        private JTextField _textField;

        public ButtonMouseListener(JTextField _textField) {
            this._textField = _textField;
        }

        @Override
        public void mousePressed(MouseEvent event) {
            JButton button = (JButton) event.getSource();

            if (button.isEnabled()) {
                String user_home = System.getProperty("user.home");
                String path = user_home != null && !user_home.isEmpty() ? user_home : "/";
                File root = new File(path);

                VirtualFile vRoot = VfsUtil.findFileByIoFile(root, true);

                FileChooserDescriptor desc = new FileChooserDescriptor(true, true, false, false, false, false);
                FileChooserDialog fileDialog = FileChooserFactory.getInstance().createFileChooser(desc, null, null);
                VirtualFile[] files = fileDialog.choose(module.getProject(), vRoot);

                if (isFileCorrect(files)) {
                    _textField.setText(files[0].getPath());
                }
            }
        }
    }
}
