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

package org.moe.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.buildship.core.CorePlugin;
import org.eclipse.buildship.core.workspace.GradleBuild;
import org.eclipse.buildship.core.workspace.NewProjectHandler;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.moe.generator.project.MOEProjectComposer;
import org.moe.generator.project.MOEProjectComposer.MOEProjectComposerException;
import org.moe.generator.project.MOEProjectComposer.Template;
import org.moe.utils.MessageFactory;

import com.gradleware.tooling.toolingclient.GradleDistribution;
import com.gradleware.tooling.toolingmodel.repository.FixedRequestAttributes;

public abstract class AbstractProjectWizard extends Wizard implements INewWizard {

	private XcodeWizardPage xcodeWizardPage;
	private ProjecrSettingsPage projectSettingsPage;
	private String error = null;

	public enum TemplateType {
		MasterDetail, PageBased, SingleView, Tabbed, Game
	}

	protected abstract Template getTemplateType();

	public AbstractProjectWizard() {
		super();
		setWindowTitle("New Project");
		setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {

		error = null;
		
		final MOEProjectComposer projectComposer = new MOEProjectComposer();
		
		String organizationName = xcodeWizardPage.getOrganizationName();

		String packageName = xcodeWizardPage.getPackageName();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath projectPath = projectSettingsPage.getProjectLocationPath();
		IPath path = projectPath == null ? workspace.getRoot().getLocation() : projectPath;
		final String projectName = projectSettingsPage.getProjectName();
		final File projectFile = projectSettingsPage.isUseDefault() ? new File(path.toOSString() , projectName) : new File(path.toOSString());
		
		projectComposer.setTargetDirectory(projectFile)
        .setMoeVersion("1.4.+")
        .setProjectName(projectName)
        .setOrganizationName(organizationName)
        .setOrganizationID(xcodeWizardPage.getCompanyIdentifier())
        .setPackageName(packageName)
        .setSubproject(false)
        .setTemplate(getTemplateType());

		WorkspaceModifyOperation workspaceModifiy = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {

				monitor.worked(1);

				monitor.beginTask("Create project...", 4);

				try {
					projectComposer.compose();
				} catch (MOEProjectComposerException e) {
					throw new CoreException(MessageFactory.getError("Generator error", e));
				}
				
				monitor.worked(1);
				
				performImportProject(NewProjectHandler.IMPORT_AND_MERGE, projectFile);
				monitor.worked(1);
			}
		};

		try {
			getContainer().run(true, true, workspaceModifiy);
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			if (t instanceof CoreException) {
				error = "Unable generate project: " + ((CoreException)t).getStatus().getMessage();
			} else {
				error = "Unable generate project: " + e.getMessage();
			}
		} catch (InterruptedException e) {
			error = "Unable generate project: " + e.getMessage();
		}

		if (error != null) {
			MessageFactory.showErrorDialog(error);
			return false;
		}

		return true;
	}

	@Override
	public void init(IWorkbench iWorkbench, IStructuredSelection iStructuredSelection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPages() {
		super.addPages();

		xcodeWizardPage = new XcodeWizardPage("Xcode Settings");
		projectSettingsPage = new ProjecrSettingsPage("Project Settings");
		addPage(xcodeWizardPage);
		addPage(projectSettingsPage);
	}
	
	public boolean performImportProject(NewProjectHandler newProjectHandler, File projectDir) {
        FixedRequestAttributes rootRequestAttributes = toFixedAttributes(projectDir);
        GradleBuild build = CorePlugin.gradleWorkspaceManager().getGradleBuild(rootRequestAttributes);
        build.synchronize(newProjectHandler);
        return true;
    }
	
	public FixedRequestAttributes toFixedAttributes(File projectDir) {
        return new FixedRequestAttributes(projectDir, null, GradleDistribution.fromBuild(), null, new ArrayList<String>(), new ArrayList<String>());
    }

}
