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

package org.moe.editors;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.ILocationProvider;
import org.eclipse.ui.forms.editor.FormEditor;
import org.moe.document.pbxproj.ProjectException;
import org.moe.ui.AbstractEditiorPage;
import org.moe.ui.ProjectEditorPage;
import org.moe.ui.TargetEditorPage;
import org.moe.utils.logger.LoggerFactory;

public class XCodeEditor extends FormEditor {
	
	private static final Logger LOG = LoggerFactory.getLogger(XCodeEditor.class);
	
	private XcodeEditorManager xcodeEditorManager;
	private InfoPlistManager mainInfoPlistManager;
	private InfoPlistManager testInfoPlistManager;
	private AbstractEditiorPage projectForm;
	private AbstractEditiorPage mainForm;
	private AbstractEditiorPage testForm;
	private boolean xcodeProjectChaned = false;
	private boolean mainInfoChaned = false;
	private boolean testInfoChaned = false;

	public XCodeEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		initManagers();
		setPartName(xcodeEditorManager.getProjectName());
		this.projectForm = new ProjectEditorPage(this, "moe.editors.form.project", "Project", false);
		this.mainForm = new TargetEditorPage(this, "moe.editors.form.main", xcodeEditorManager.getMainTargetName(), true);
		this.testForm = new TargetEditorPage(this, "moe.editors.form.test", xcodeEditorManager.getTestTargetName(), false);
		projectForm.setXcodeEditorManager(xcodeEditorManager);
		mainForm.setXcodeEditorManager(xcodeEditorManager);
		mainForm.setInfoPlistManager(mainInfoPlistManager);
		testForm.setXcodeEditorManager(xcodeEditorManager);
		testForm.setInfoPlistManager(testInfoPlistManager);
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	@Override
	protected void addPages() {
		try {
			addPage(projectForm);
			addPage(mainForm);
			addPage(testForm);
		} catch (PartInitException e) {
			LOG.error("Unable added page", e);;
		}
	}
	@Override
	public void doSave(IProgressMonitor arg0) {
		if (xcodeProjectChaned) {
			try {
				xcodeEditorManager.save();
				xcodeProjectChaned = false;
				projectForm.documentSaved();
				mainForm.documentSaved();
				testForm.documentSaved();
			} catch (IOException e) {
				LOG.error("Unable save project.pbxproj", e);
			}
		}
		
		if (mainInfoChaned) {
			try {
				mainInfoPlistManager.save();
				mainInfoChaned = false;
				mainForm.documentSaved();
			} catch (IOException e) {
				LOG.error("Unable save main info.plist", e);
			}
		}
		
		if (testInfoChaned) {
			try {
				testInfoPlistManager.save();
				testInfoChaned = false;
				testForm.documentSaved();
			} catch (IOException e) {
				LOG.error("Unable save test info.plist", e);
			}
		}
		
		editorDirtyStateChanged();
	}
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private File getFile() {
		IEditorInput input = this.getEditorInput();
		ILocationProvider lprovider = (ILocationProvider) input.getAdapter(ILocationProvider.class);
		IPath path = lprovider.getPath(input);
		return path.toFile();
	}
	
	private void initManagers() {
		File file = getFile();
		try {
            this.xcodeEditorManager = new XcodeEditorManager(file);
        } catch (ProjectException e) {
            LOG.debug("Unable read xcode.pbxproj file", e);
        }
		
		xcodeEditorManager.setListener(new XcodeDocumentChangeListener());
		
		String root = new File(file.getParent()).getParent();
        File mainInfoPlist = new File(root +
                File.separator + xcodeEditorManager.getInfoMainPlist());
        
        try {
            this.mainInfoPlistManager = new InfoPlistManager(mainInfoPlist);
        } catch (Exception e) {
            LOG.debug("Unable read main Info.plist", e);
        }
        
        mainInfoPlistManager.setListener(new MainInfoPlistDocumentChangeListener());
        
        File testInfoPlist = new File(root +
                File.separator + xcodeEditorManager.getInfoTestPlist());
        
        try {
            this.testInfoPlistManager = new InfoPlistManager(testInfoPlist);
        } catch (Exception e) {
            LOG.debug("Unable read test Info.plist", e);
        }
        
        testInfoPlistManager.setListener(new TestInfoPlistDocumentChangeListener());
	}
	
	private class XcodeDocumentChangeListener implements DocumentChangeListener {

		@Override
		public void documentChanged() {
			projectForm.documentChanged();
			mainForm.documentChanged();
			testForm.documentChanged();
			xcodeProjectChaned = true;
		}
	}
	
	private class MainInfoPlistDocumentChangeListener implements DocumentChangeListener {

		@Override
		public void documentChanged() {
			mainForm.documentChanged();
			mainInfoChaned = true;
		}
	}
	
	private class TestInfoPlistDocumentChangeListener implements DocumentChangeListener {

		@Override
		public void documentChanged() {
			testForm.documentChanged();
			testInfoChaned = true;
		}
	}

}
