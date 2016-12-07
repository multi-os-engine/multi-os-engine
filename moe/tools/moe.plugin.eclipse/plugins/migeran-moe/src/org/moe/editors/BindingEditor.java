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

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.ILocationProvider;
import org.eclipse.ui.forms.editor.FormEditor;
import org.moe.ui.BindingEditorForm;
import org.moe.utils.logger.LoggerFactory;

public class BindingEditor extends FormEditor {
	
	private static final Logger LOG = LoggerFactory.getLogger(BindingEditor.class);
	
	private BindingEditorForm bindingEditorForm;
	
	public BindingEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		setPartName("Binding Editor");
		this.bindingEditorForm = new BindingEditorForm(this, "moe.editors.form.binding", "Binding");
		bindingEditorForm.setConfigurationFile(getFile());
	}

	@Override
	protected void addPages() {
		try {
			addPage(bindingEditorForm);
		} catch (PartInitException e) {
			LOG.error("Unable add page", e);;
		}
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		bindingEditorForm.doSave(arg0);
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

}
