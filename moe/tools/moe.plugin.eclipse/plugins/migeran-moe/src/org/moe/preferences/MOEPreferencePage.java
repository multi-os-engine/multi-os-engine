package org.moe.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.moe.MOEPlugin;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class MOEPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public MOEPreferencePage() {
		super(GRID);
		setPreferenceStore(MOEPlugin.getDefault().getPreferenceStore());
		setDescription("Multi-OS Engine Preferences");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		GridLayout layout = new GridLayout();
		Group groupApp = new Group(getFieldEditorParent(), SWT.NONE);
		groupApp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupApp.setText("Gradle");
		layout = new GridLayout();
		layout.numColumns = 2;
		groupApp.setLayout(layout);
		
		addField(new ComboFieldEditor(PreferenceConstants.GRADLE_RUN_MODE_KEY, "Run mode:", new String[][] {new String[] {PreferenceConstants.GRADLE_DEFAULT_KEY, PreferenceConstants.GRADLE_DEFAULT_VALUE}, new String[] {PreferenceConstants.GRADLE_INFO_KEY, PreferenceConstants.GRADLE_INFO_VALUE}, new String[] {PreferenceConstants.GRADLE_STACKTRACE_KEY, PreferenceConstants.GRADLE_STACKTRACE_VALUE}, new String[] {PreferenceConstants.GRADLE_DEBUG_KEY, PreferenceConstants.GRADLE_DEBUG_VALUE}}, groupApp));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}