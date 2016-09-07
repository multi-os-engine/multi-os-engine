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

import org.clang.struct.CXType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class COpaquePtrManager extends AbstractUnitManager {

	/**
	 * Logger for the class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(COpaquePtrManager.class);

	private final String rootName;

	public String getRootName() {
		return rootName;
	}

	private final boolean rootIsConst;

	public boolean isRootConst() {
		return rootIsConst;
	}

	private COpaquePtrManager rootManager;

	protected COpaquePtrManager(Indexer indexer, String name_fq, CXType rootType) {
		super(indexer, name_fq);
		rootName = rootType.getTypeDeclaration().toString();
		rootIsConst = rootType.isConstQualifiedType();
	}

	@Override
	public boolean isSupported() {
		return true;
	}

	@Override
	public void preparationPhase_Final() {
		if (!rootIsConst) {
			rootManager = getGenerator().getConstOpaqueTypeManager(rootName);
		}
	}

	@Override
	public void update() {
		ClassMemberEditor cme = updateClass();
		COpaquePtrImplManager adMan = new COpaquePtrImplManager(this);
		try {
			adMan.update(cme);
		} catch (GeneratorException e) {
			LOG.error("Failed to generate implementation class.");
		}
		cme.close();
	}

	@Override
	public void cleanup() {
	}

	/**
	 * Update class information
	 * 
	 * @return ClassMemberEditor for the class
	 * @throws GeneratorException
	 */
	private ClassMemberEditor updateClass() {
		try {
			ClassEditor editor = new ClassEditor(this, getClassDecl(), isNew());
			if (editor.isEditable()) {
				editor.setInterface();
				editor.setClassName(getUnitName());
				editor.setSuperClass(null);
				if (rootManager != null) {
					editor.setInterfaces(addImport(rootManager));
				} else {
					editor.setInterfaces(addImport(Constants.OpaquePtrFQ));
				}

				ModifierEditor modifiers = editor.getModifiers();
				modifiers.setPublic();
				modifiers.setRuntime(addImport(Constants.CRuntimeFQ));
				modifiers.setGenerated();

				editor.close();
			}
			logOK(Statistics.C_OPAQUE_TYPE);
			return editor.getMemberEditor();
		} catch (GeneratorException e) {
			logFAIL(Statistics.C_OPAQUE_TYPE, getFullyQualifiedName(), null, LOG, e);
			return null;
		}
	}

}
