/*
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.popup.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.jar.JarOutputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moe.common.utils.ProjectUtil;
import org.moe.runconfig.MOEProjectBuildConsole;
import org.moe.tools.natjgen.binding.IConsole;
import org.moe.tools.natjgen.binding.IMonitor;
import org.moe.tools.natjgen.binding.MOEWrapNatjgenLibGenerator;
import org.moe.ui.CopyBundlePanel;
import org.moe.ui.FrameworkDependencyPanel;
import org.moe.ui.FrameworkPanel;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

public class LinkThirdpartyFrameworkActionHandler extends AbstractHandler {

	private static final Logger LOG = LoggerFactory.getLogger(LinkThirdpartyFrameworkActionHandler.class);

	private FrameworkPanel frameworkPanel;
	private FrameworkDependencyPanel frameworkdependencyPanel;
	private CopyBundlePanel copyBundlePanel;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LOG.debug("Link third party framework to Xcode action");
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());

		if (project != null) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			FrameworkChooseDialog dialog = new FrameworkChooseDialog(window.getShell(),
					"Link third party framework to Xcode");
			if (dialog.open() == Window.OK) {
				doAction();
			}
		}

		return null;
	}

	private class FrameworkChooseDialog extends Dialog {

		private String title;

		protected FrameworkChooseDialog(Shell shell, String title) {
			super(shell);
			this.title = title;
		}

		@Override
		protected void configureShell(Shell shell) {
			super.configureShell(shell);
			if (title != null) {
				shell.setText(title);
			}
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite)super.createDialogArea(parent);

			TabFolder tabFolder = new TabFolder(composite, SWT.BORDER);

			createFrameworkTab(tabFolder);

			createDependencyTab(tabFolder);

			createCopyBundleResourcesTab(tabFolder);

			return composite;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {
			createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
			createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		}

		private void createFrameworkTab(TabFolder tabFolder) {
			frameworkPanel = new FrameworkPanel(getShell(), tabFolder);
		}

		private void createDependencyTab(TabFolder tabFolder) {
			frameworkdependencyPanel = new FrameworkDependencyPanel(tabFolder);
			frameworkPanel.setDependencyTabListener(frameworkdependencyPanel.getListener());
		}

		private void createCopyBundleResourcesTab(TabFolder tabFolder) {
			copyBundlePanel = new CopyBundlePanel(getShell(), tabFolder);
			frameworkPanel.setCopyBundleTabListener(copyBundlePanel.getListener());
		}

	}

	private void doAction() {
		final IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return;
		}
		Job job = new Job("Link third party framework to Xcode") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				JarOutputStream target = null;
				FileOutputStream jarFos = null;

				try {
					monitor.beginTask("Start generation binding process...", 4);

					File file = frameworkPanel.getFile();

					// prepare --framework
					StringBuilder frameworkContent = new StringBuilder();
					frameworkContent.append(file.getPath());

					monitor.worked(1);

					// prepare --ld-flags
					Map<String, String> flags = frameworkdependencyPanel.getManifestProperties();
					StringBuilder ldFlagsContent = new StringBuilder();
					File ldFlagsFile = null;
					if (flags != null && flags.size() > 0) {

						for (String key : flags.keySet()) {
							ldFlagsContent.append(flags.get(key));
						}

					}
					ldFlagsContent.append("-framework ").append(getNameWithoutExtension(file));

					File tmDir = createTempDirectory();
					ldFlagsFile = new File(tmDir, "ldFlags");

					PrintWriter ldFlagsWriter = null;
					try {
						ldFlagsWriter = new PrintWriter(ldFlagsFile);
						ldFlagsWriter.print(ldFlagsContent.toString());
					} finally {
						if (ldFlagsWriter != null) {
							ldFlagsWriter.close();
						}
					}

					// prepare --bundle
					Map<String, String> props = copyBundlePanel.getManifestProperties();
					StringBuilder bundleContent = null;
					if (props != null && props.size() > 0) {
						bundleContent = new StringBuilder();
						for (String key : props.keySet()) {
							bundleContent.append(props.get(key));
						}
					}

					monitor.worked(1);

					// prepare --output-file-path
					File libFolder = createOrUpdateLibs(project);
					File outFile = new File(libFolder, getNameWithoutExtension(file) + ".jar");
					File projectFile = new File(project.getLocation().toOSString());

					IMonitor progressMonitor = new IMonitor() {

						@Override
						public void setText(String text) {
							monitor.subTask(text);
						}

						@Override
						public boolean isCanceled() {
							return monitor.isCanceled();
						}
					};

					final MessageConsole console = MOEProjectBuildConsole.getBuildConsole();
					console.activate();

					IConsole messageConsole = new IConsole() {

						@Override
						public void write(String message) {
							console.newMessageStream().println(message);
						}
					};

					MOEWrapNatjgenLibGenerator generator = new MOEWrapNatjgenLibGenerator(frameworkContent.toString(),
							null, ldFlagsFile == null ? null : ldFlagsFile.getPath(),
							bundleContent == null ? null : bundleContent.toString(), outFile.getPath(), projectFile,
							messageConsole, progressMonitor);

					File sdkToolsDir = new File(ProjectUtil.retrieveSDKPathFromGradle(project.getLocation().toFile()),
							"tools");
					if (sdkToolsDir == null || !sdkToolsDir.exists()) {
						return MessageFactory.getError("Unable find MOE sdk");
					}
					generator.generate(sdkToolsDir, "--framework");

					monitor.worked(1);

					// Refresh project
					try {
						project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					} catch (CoreException ignore) {

					}

					monitor.worked(1);

				} catch (Exception e) {
					return MessageFactory.getError("Error occured", e);
				} finally {
					if (target != null) {
						try {
							target.close();
						} catch (IOException ioe) {
							ioe.printStackTrace();
						}
					}
					if (jarFos != null) {
						try {
							jarFos.close();
						} catch (IOException ioe) {
							ioe.printStackTrace();
						}
					}
				}

				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.LONG);
		job.setRule(project);
		job.schedule();
	}

	private String getNameWithoutExtension(File f) {
		String name = f.getName();
		return name.substring(0, name.lastIndexOf("."));
	}

	private File createOrUpdateLibs(IProject project) {
		File libFolder = null;
		String projectPath = project.getLocation().toOSString();
		if ((projectPath != null) && !projectPath.isEmpty()) {
			libFolder = new File(projectPath, "lib");
			if (!libFolder.exists()) {
				libFolder.mkdirs();
			}
		}
		return libFolder;
	}

	public File createTempDirectory() throws IOException {
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

}
