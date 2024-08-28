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

package org.moe.ui;

import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;

public abstract class AbstractEditiorPage extends FormPage {
	
	protected boolean dirty = false;
	private boolean mainTarget = false;
	
	public AbstractEditiorPage(String id, String title) {
		super(id, title);
	}

	public AbstractEditiorPage(FormEditor editor, String id, String title, boolean main) {
		super(editor, id, title);
		this.mainTarget = main;
	}

	public abstract void setXcodeEditorManager(XcodeEditorManager xcodeEditorManager);

	public void setInfoPlistManager(InfoPlistManager testInfoPlistManager) {
		// TODO Auto-generated method stub
		
	}

	public void documentChanged() {
		this.dirty = true;
		getEditor().editorDirtyStateChanged();
	}
	
	public void documentSaved() {
		this.dirty = false;
		getEditor().editorDirtyStateChanged();
	}
	
	@Override
	public final boolean isDirty() {
		return dirty;
	}
	
	public boolean isMain() {
		return mainTarget;
	}

}
