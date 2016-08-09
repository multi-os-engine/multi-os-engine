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

package org.moe.idea.actions;

import org.moe.common.utils.OsUtils;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.natjgen.WrapNatJGenExec;
import com.intellij.ide.IdeView;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LinkPodThirdPartyLibraries extends AnAction {

    private Module module;

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = e.getPresentation();

        if (OsUtils.isWindows()) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

        VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(e.getDataContext());

        if (file == null) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

        Project project = e.getProject();

        if (project == null) {
            return;
        }

        this.module = null;
        for (Module module : ModuleManager.getInstance(project).getModules()) {
            if (ModuleRootManager.getInstance(module).getFileIndex().isInContent(file)) {
                if (MOESdkPlugin.isValidMoeModule(module)) {
                    this.module = module;
                }
                break;
            }
        }

        if (module == null) {
            presentation.setEnabled(false);
            presentation.setVisible(false);
        } else {
            presentation.setEnabled(true);
            presentation.setVisible(true);
        }
    }


    @Override
    public void actionPerformed(AnActionEvent e) {
        module = LangDataKeys.MODULE.getData(e.getDataContext());
        final IdeView view = LangDataKeys.IDE_VIEW.getData(e.getDataContext());
        if (view != null) {
            CocoaPodsChooseDialog dialog = new CocoaPodsChooseDialog(e.getProject());
            dialog.show();
        }

    }

    public class CocoaPodsChooseDialog extends DialogWrapper{
        private JPanel myPanel;
        private JTextField podNameField;
        private JTextField subspecNameField;

        protected CocoaPodsChooseDialog(@Nullable Project project) {
            super(project);

            myPanel = new JPanel();
            myPanel.setLayout(new GridBagLayout());

            GridBagConstraints c = new GridBagConstraints();

            //add pod name line
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.gridy = 0;
            myPanel.add(new JLabel("Pod name: "), c);

            c.gridx = 1;
            podNameField = new JTextField(20);
            myPanel.add(podNameField, c);

            //add subspec line
            c.gridx = 0;
            c.gridy = 1;
            myPanel.add(new JLabel("Subspec name: "), c);

            c.gridx = 1;
            subspecNameField = new JTextField(20);
            myPanel.add(subspecNameField, c);

            init();
        }

        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            return myPanel;
        }

        @Override
        protected void doOKAction() {

            ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
                @Override
                public void run() {
                    ProgressIndicator progressIndicator = ProgressManager.getInstance().getProgressIndicator();
                    if (progressIndicator == null) {
                        progressIndicator = new EmptyProgressIndicator();
                        progressIndicator.start();
                        progressIndicator.popState();
                    }

                    PrintWriter podFileWriter = null;
                    try{
                        //prepare --pod
                        File tmDir = createTempDirectory();
                        File podFile = new File(tmDir, "PodFile");

                        podFileWriter = new PrintWriter(podFile);
                        podFileWriter.println("pod:" + podNameField.getText().trim());
                        podFileWriter.println("version:");
                        podFileWriter.println("subspec:" + subspecNameField.getText().trim());
                        podFileWriter.close();

                        //prepare --output-file-path
                        File libFolder = createOrUpdateLibs();
                        File outFile = new File(libFolder, podNameField.getText().trim() + ".jar");

                        progressIndicator.setText("Generate...");

                        GeneratePods generator = new GeneratePods(podFile.getPath(), outFile.getPath(), module, progressIndicator);
                        generator.generate();

                        progressIndicator.stop();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    finally {
                        if(podFileWriter != null){
                            podFileWriter.close();
                        }
                    }
                    progressIndicator.cancel();
                }
            }, "Link CocoaPods to Xcode", false, module.getProject());







            super.doOKAction();
        }
    }

    private File createOrUpdateLibs() {
        File libFolder = null;
        String modulePath = ModuleUtils.getModulePath(module);
        if ((modulePath != null) && !modulePath.isEmpty()) {
            libFolder = new File(modulePath, "lib");
            if (!libFolder.exists()) {
                libFolder.mkdirs();
            }
        }
        return libFolder;
    }


    private File createTempDirectory() throws IOException {
        final File temp;

        temp = File.createTempFile("temp", Long.toString(System.nanoTime()));

        if (!(temp.delete())) {
            throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
        }

        if (!(temp.mkdir())) {
            throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
        }

        return (temp);
    }

    private class GeneratePods {
        @NotNull
        private final String podFile;
        @NotNull
        private final String outputFile;
        @NotNull
        private final Module module;
        @NotNull
        private final ProgressIndicator progressIndicator;

        public GeneratePods(@NotNull final String podFile, @NotNull final String outputFile, @NotNull final Module module, @NotNull ProgressIndicator progressIndicator) {
            this.podFile = podFile;
            this.outputFile = outputFile;
            this.module = module;
            this.progressIndicator = progressIndicator;
        }

        public void generate() throws Exception {

            progressIndicator.setText("Generating...");

            final long start_time = System.nanoTime();

            int MAX_ATTEMPTS = 3;
            int currentAttempt = 0;
            while(currentAttempt < MAX_ATTEMPTS){
                // Prepare NatJGen
                WrapNatJGenExec exec = new WrapNatJGenExec();
                ArrayList<String> args = exec.getArguments();

                args.add("--pod");
                args.add(podFile);
                args.add("--output-file-path");
                args.add(outputFile);
                String out;
                try {
                    out = ExecOutputCollector.collect(exec);
                } catch (IOException e) {
                    out = "NatJGen execution failed. I/O error. " + e.getMessage();
                } catch (InterruptedException e) {
                    out = "NatJGen was interrupted. " + e.getMessage();
                }

                MOEToolWindow.getInstance(module.getProject()).log(out);
                if (exec.getReturnCode() == 0) {
                    break;
                }
                currentAttempt++;
            }
            module.getProject().getBaseDir().refresh(false, true);
        }
    }
}
