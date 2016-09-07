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

package org.moe.natjgen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.moe.natjgen.Configuration.Unit;

public abstract class AbstractUnitManager {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(AbstractUnitManager.class);

	/**
	 * Indexer
	 */
	private final Indexer indexer;

	/**
	 * Get indexer
	 * 
	 * @return Indexer
	 */
	public final Indexer getIndexer() {
		return indexer;
	}

	/**
	 * Indicates whether the unit manager should be generated or not
	 */
	private boolean externalUnit = false;

	/**
	 * Tells whether the manager is an external unit or not
	 * 
	 * @return external flag
	 */
	public boolean isExternalUnit() {
		return externalUnit;
	}

	/**
	 * Sets the external flag, but will only set if the method is non-external
	 * 
	 * @param externalUnit
	 *            external flag
	 */
	public void setExternalUnit(boolean externalUnit) {
		if (!this.externalUnit) {
			this.externalUnit = externalUnit;
		}
	}

	/**
	 * Edit context of the unit
	 */
	private UnitEditContext editContext;

	/**
	 * Returns the edit context of the unit or throws an exception if there is
	 * none
	 * 
	 * @return edit context
	 */
	private final UnitEditContext getEditContext() {
		if (editContext == null) {
			throw new RuntimeException("Trying to edit unit while not in edit mode");
		}
		return editContext;
	}

	/**
	 * The unit's name (this is equal to the generated java name)
	 */
	private String unitName;

	/**
	 * Returns the unit's name
	 * 
	 * @return unit's name
	 */
	public final String getUnitName() {
		return unitName;
	}

	/**
	 * Updates the unit name
	 * 
	 * @param newName
	 *            new unit name
	 */
	protected final void setUnitName(String newName) {
		unitName = newName;
		fullyQualifiedName = Unit.packageName(packageName, unitName);
	}

	/**
	 * The unit's package
	 */
	private String packageName;

	/**
	 * Returns the Java package in which the managed Java class is
	 * 
	 * @return package
	 */
	public final String getPackage() {
		return packageName;
	}

	/**
	 * The unit's fully qualified name
	 */
	private String fullyQualifiedName;

	/**
	 * Returns the fully qualified name of the Java class
	 * 
	 * @return fully qualified name
	 */
	public final String getFullyQualifiedName() {
		return fullyQualifiedName;
	}

	/**
	 * Updates the unit's fully qualified name
	 * 
	 * @param name_fq
	 *            new fully qualified name
	 */
	private final void setFullyQualifiedName(String name_fq) {
		this.fullyQualifiedName = name_fq;
		int idx = name_fq.lastIndexOf('.');
		if (idx > -1) {
			this.packageName = name_fq.substring(0, idx);
			this.unitName = name_fq.substring(idx + 1);
		} else {
			this.packageName = "";
			this.unitName = name_fq;
		}
	}

	/**
	 * Set for all classes needing to be imported in the java file
	 */
	private Set<String> importables = new HashSet<String>();

	/**
	 * Set for all already existing imports
	 */
	private HashSet<String> existingImports;

	/**
	 * Import the package of the given {@link AbstractUnitManager}
	 * 
	 * @param external
	 *            {@link AbstractUnitManager} to import
	 * @return the name it can be referenced as from the source
	 */
	public final String addImport(AbstractUnitManager external) {
		if (external == null) {
			return null;
		}
		return _import(external.getPackage(), external.getFullyQualifiedName());
	}

	/**
	 * Import the package of the given fully qualified name
	 * 
	 * @param external
	 *            fully qualified name to import
	 * @return the name it can be referenced as from the source
	 */
	public final String addImport(String fq) {
		if (fq == null || fq.length() == 0) {
			return null;
		}
		return _import(fq.substring(0, fq.lastIndexOf('.')), fq);
	}

	/**
	 * Import the package of the given fully qualified name
	 * 
	 * @param e_pkg
	 *            package of the type
	 * @param e_fq
	 *            fully qualified name
	 * @return the name it can be referenced as from the source
	 */
	private final String _import(String e_pkg, String e_fq) {
		String simplename = Type.toSimpleName(e_fq);
		if ("java.lang".equals(e_pkg)) {
			return simplename;
		}
		if (e_fq.startsWith(getFullyQualifiedName())) {
			return simplename;
		}
		if (simplename.equals(getUnitName())) {
			return e_fq;
		}
		if (!e_pkg.equals(getPackage())) {
			if (existingImports == null) {
				readExistingImports();
			}
			if (existingImports.contains(e_fq)) {
				return simplename;
			}
			if (existingImports.contains(e_pkg + ".*")) {
				return simplename;
			}
			final String dottedSimpleName = "." + simplename;
			for (String imp : existingImports) {
				if (imp.endsWith(dottedSimpleName)) {
					return e_fq;
				}
			}
			importables.add(e_fq);
			existingImports.add(e_fq);
			return simplename;
		} else {
			return simplename;
		}
	}

	@SuppressWarnings("unchecked")
	private void readExistingImports() {
		existingImports = new HashSet<String>();
		for (ImportDeclaration idecl : (List<ImportDeclaration>)getAstRoot().imports()) {
			if (idecl.isStatic()) {
				continue;
			}
			if (idecl.isOnDemand()) {
				String fqn = idecl.getName().getFullyQualifiedName();
				existingImports.add(fqn + ".*");
			} else {
				existingImports.add(idecl.getName().getFullyQualifiedName());
			}
		}
	}

	/**
	 * Indicates whether the root type declaration was newly created or not
	 */
	private boolean isNew = false;

	/**
	 * Returns
	 * 
	 * @return
	 */
	public final boolean isNew() {
		return isNew;
	}

	/**
	 * Create an abstract unit manager
	 * 
	 * @param unit
	 *            compilation unit
	 * @param generator
	 *            generator containing the compilation unit
	 */
	protected AbstractUnitManager(Indexer indexer, String name_fq) {
		// Check values
		if (indexer == null || indexer.getGenerator() == null || name_fq == null) {
			throw new IllegalArgumentException();
		}

		// Set value
		this.indexer = indexer;
		setFullyQualifiedName(name_fq);
	}

	/**
	 * Tells whether the unit's generation is supported or not
	 */
	public abstract boolean isSupported();

	/**
	 * In this phase all initialization should be made.
	 */
	public void preparationPhase_Initialize() {
		// Do nothing
	}

	/**
	 * In this phase type information regarding members should be validated.
	 */
	public void preparationPhase_MemberTypeValidation() {
		// Do nothing
	}

	/**
	 * In this phase manager member manipulation should be made.
	 */
	public void preparationPhase_MemberMerge() {
		// Do nothing
	}

	/**
	 * In this phase member manipulations should be made.
	 */
	public void preparationPhase_MemberManipulation() {
		// Do nothing
	}

	/**
	 * This is the final phase before generation. Cleanup should be done here.
	 */
	public void preparationPhase_Final() {
		// Do nothing
	}

	/**
	 * Update AST
	 */
	protected abstract void update();

	/**
	 * Generate compilation unit
	 * 
	 * @return true on success otherwise false
	 */
	public final void generate() {
		if (isExternalUnit()) {
			return;
		}

		try {
			editContext = new UnitEditContext(this);
		} catch (Exception e) {
			LOG.error("Unable to create edit context: " + getFullyQualifiedName(), e);
			editContext = null;
			return;
		}

		try {
			updatePackage();
			update();
			updateImports();
		} catch (Exception e) {
			LOG.error("Error occured during update: " + getFullyQualifiedName(), e);
			editContext = null;
			return;
		}

		editContext.save();
		editContext = null;
		return;
	}

	/**
	 * Clean up
	 */
	public abstract void cleanup();

	/**
	 * Get rewriter AST
	 * 
	 * @return AST
	 */
	protected final AST getAST() {
		return getEditContext().getAST();
	}

	/**
	 * Get rewriter
	 * 
	 * @return ASTRewrite
	 */
	protected final ASTRewrite getRewrite() {
		return getEditContext().getRewrite();
	}

	/**
	 * Get AST root
	 * 
	 * @return AST root
	 */
	public final CompilationUnit getAstRoot() {
		return getEditContext().getAstRoot();
	}

	/**
	 * Get edit group
	 * 
	 * @return edit group
	 */
	public final TextEditGroup getEditGroup() {
		return indexer.getEditGroup();
	}

	/**
	 * Get generator
	 * 
	 * @return Generator
	 */
	protected final Generator getGenerator() {
		return indexer.getGenerator();
	}

	/**
	 * Update imports in the compilation unit
	 */
	@SuppressWarnings("unchecked")
	protected final void updateImports() {
		Set<String> new_imports = new HashSet<String>();
		new_imports.addAll(importables);
		ListRewrite imports_rw = getRewrite().getListRewrite(getAstRoot(), CompilationUnit.IMPORTS_PROPERTY);
		for (ImportDeclaration id : (List<ImportDeclaration>)imports_rw.getRewrittenList()) {
			for (String new_import : importables) {
				if (id.getName().getFullyQualifiedName().equals(new_import)) {
					new_imports.remove(new_import);
					break;
				}
			}
		}
		List<String> sorted_imports = new ArrayList<String>(new_imports);
		Collections.sort(sorted_imports);
		for (String new_import : sorted_imports) {
			ImportDeclaration import_decl = getAST().newImportDeclaration();
			import_decl.setName(getAST().newName(new_import));
			imports_rw.insertLast(import_decl, getEditGroup());
		}
	}

	/**
	 * Update package information
	 */
	protected final void updatePackage() {
		PackageDeclaration pkg_decl = (PackageDeclaration)getRewrite().get(getAstRoot(),
				CompilationUnit.PACKAGE_PROPERTY);
		if (pkg_decl == null) {
			pkg_decl = getAST().newPackageDeclaration();
			getRewrite().set(getAstRoot(), CompilationUnit.PACKAGE_PROPERTY, pkg_decl, getEditGroup());
		}

		String pkg_name_value = getPackage();
		Name pkg_name_decl = (Name)getRewrite().get(pkg_decl, PackageDeclaration.NAME_PROPERTY);
		if (pkg_name_decl == null || !pkg_name_decl.getFullyQualifiedName().equals(pkg_name_value)) {
			getRewrite().set(pkg_decl, PackageDeclaration.NAME_PROPERTY, getAST().newName(pkg_name_value),
					getEditGroup());
		}
	}

	/**
	 * Get root type declaration
	 * 
	 * @return {@link TypeDeclaration} of the root type
	 */
	@SuppressWarnings("unchecked")
	protected final TypeDeclaration getClassDecl() {
		// Get top level class with correct name
		TypeDeclaration class_decl = null;
		ListRewrite type_rw = getRewrite().getListRewrite(getAstRoot(), CompilationUnit.TYPES_PROPERTY);
		List<AbstractTypeDeclaration> type_rwl = (List<AbstractTypeDeclaration>)type_rw.getRewrittenList();
		for (AbstractTypeDeclaration atd : type_rwl) {
			if (atd instanceof TypeDeclaration && atd.getName().getFullyQualifiedName().equals(getUnitName())) {
				class_decl = (TypeDeclaration)atd;
				break;
			}
		}

		// If no class found, get first type_decl if it is a TypeDeclaration
		if (class_decl == null && type_rwl.size() == 1 && type_rwl.get(0) instanceof TypeDeclaration) {
			class_decl = (TypeDeclaration)type_rwl.get(0);
		}

		// If no class found, create one
		if (class_decl == null) {
			isNew = true;
			class_decl = getAST().newTypeDeclaration();
			type_rw.insertLast(class_decl, getEditGroup());
		}

		return class_decl;
	}

	protected final void log(String type, String category, String subject, String container, String reason) {
		ArrayList<String> r = new ArrayList<String>();
		r.add(reason);
		log(type, category, subject, container, r);
	}

	protected final void log(String type, String category, String subject, String container,
			ArrayList<String> reasons) {
		if (!isExternalUnit()) {
			getIndexer().getStats().log(type, category, subject + (container == null ? "" : " in " + container),
					reasons.toArray(new String[reasons.size()]));
		}
	}

	protected final void logOK(String category) {
		if (!isExternalUnit()) {
			getIndexer().getStats().log(Statistics.SUCCESS, category, null);
		}
	}

	protected final void logFAIL(String category, String subject, String container, Logger logger,
			GeneratorException ex) {
		if (!isExternalUnit()) {
			getIndexer().getStats().log(Statistics.FAILED, category, subject, "Check Eclipse's log for more details");
			logger.error("Exception during generation of " + subject + (container == null ? "" : " in " + container),
					ex);
		}
	}

	protected final void logType(String type, String category) {
		if (!isExternalUnit()) {
			getIndexer().getStats().log(type, category, null);
		}
	}

	protected final void updateFunctionCBOrBlockInterface(ClassMemberEditor cme, IParameterizedCallable callable) {
		try {
			Type t = callable.getType();
			if (t.isCallback()) {
				CallbackManager cbman = t.getCallbackManager();
				if (cbman == null) {
					throw new RuntimeException();
				}
				cbman.update(cme);
				logOK(Statistics.CALLBACK);
			}
		} catch (GeneratorException e) {
			logFAIL(Statistics.CALLBACK, callable.getJavaName(), getFullyQualifiedName(), LOG, e);
		}
		for (CalleeArgument arg : callable.getArguments()) {
			try {
				Type t = arg.getType();
				if (t.isCallback()) {
					CallbackManager cbman = t.getCallbackManager();
					if (cbman == null) {
						throw new RuntimeException();
					}
					cbman.update(cme);
					logOK(Statistics.CALLBACK);
				}
			} catch (GeneratorException e) {
				logFAIL(Statistics.CALLBACK, callable.getJavaName(), getFullyQualifiedName(), LOG, e);
			}
		}
	}

}
