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

import static org.clang.c.clang.clang_getFileName;

import org.clang.c.clang;
import org.clang.enums.CXCursorKind;
import org.clang.enums.CXLinkageKind;
import org.clang.struct.CXCursor;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxEntityInfo;
import org.clang.struct.CXIdxObjCPropertyDeclInfo;
import org.clang.struct.CXType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natjgen.Configuration.Unit;

class ModelDowngrader extends AbstractModelEditor {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(ModelDowngrader.class);

	protected ModelDowngrader(Indexer indexer, int memModel) {
		super(indexer, memModel);
	}

	@Override
	public void processObjCClass(CXIdxDeclInfo decl) {
		// Do nothing
	}

	@Override
	public void processObjCCategory(CXIdxDeclInfo decl) {
		// Do nothing
	}

	@Override
	public void processObjCProtocol(CXIdxDeclInfo decl) {
		// Do nothing
	}

	@Override
	public void processObjCMethod(final CXIdxDeclInfo decl) {
		// Get manager
		ObjCClassManager manager = indexer.getObjCManagerForContainer(decl);
		if (manager == null) {
			return;
		}

		// Get selector, type & arguments
		boolean isStatic = decl.cursor().kind() == CXCursorKind.ObjCClassMethodDecl;
		String selector = decl.entityInfo().cursor().toString();

		// Get method
		ObjCMethod objCMethod = manager.getMethodWithSelector(selector, isStatic);
		if (objCMethod == null) {
			return;
		}
		objCMethod.setEdited();

		String callableID = manager.getFullyQualifiedName() + (isStatic ? " @ +" : " @ -") + selector;
		String error = downgradePCallable(new IDPCCallback() {

			@Override
			public Type getType() {
				return new Type(decl.cursor().getCursorResultType(), memModel);
			}

			@Override
			public Type getArgType(int idx) {
				CXCursor cursor = decl.cursor().getArgument(idx);
				return new Type(cursor.getCursorType(), memModel);
			}

			@Override
			public int getArgCount() {
				return decl.cursor().getNumArguments();
			}
		}, objCMethod);
		if (error != null) {
			LOG.error(callableID + " " + error);
			objCMethod.setDisabled();
		}
	}

	private static interface IDPCCallback {
		Type getType();

		int getArgCount();

		Type getArgType(int idx);
	}

	protected String downgradePCallable(IDPCCallback cb, IParameterizedCallable callable) {
		// Check argument count
		int count = cb.getArgCount();
		if (callable.getArguments().size() != count) {
			return "invalid method arg count";
		}

		// Check return type
		Type type = cb.getType();
		if (!callable.getType().setDowngradable(type)) {
			return "return type downgrade failed";
		}

		// Check argument types
		for (int i = 0; i < count; ++i) {
			CalleeArgument arg = callable.getArguments().get(i);

			type = cb.getArgType(i);
			if (!arg.getType().setDowngradable(type)) {
				return "argument " + i + " type downgrade failed";
			}
		}

		return null;
	}

	@Override
	public void processObjCProperty(CXIdxDeclInfo decl) {
		// Get manager
		ObjCClassManager manager = indexer.getObjCManagerForContainer(decl);
		if (manager == null) {
			return;
		}

		// Prepare infos
		CXIdxObjCPropertyDeclInfo info = decl.getObjCPropertyDeclInfo();
		CXIdxEntityInfo getter_info = info.getter();
		CXIdxEntityInfo setter_info = info.setter();

		// Get Objective-C attribute
		final CXType type = decl.cursor().getCursorType();

		// Check getter
		String selector = getter_info.cursor().toString();
		ObjCMethod getter = manager.getMethodWithSelector(selector, false);
		if (getter == null) {
			return;
		}
		getter.setEdited();

		String error = downgradePCallable(new IDPCCallback() {

			@Override
			public Type getType() {
				return new Type(type, memModel);
			}

			@Override
			public Type getArgType(int idx) {
				throw new IllegalStateException();
			}

			@Override
			public int getArgCount() {
				return 0;
			}
		}, getter);
		if (error != null) {
			LOG.error(manager.getFullyQualifiedName() + " @ -" + selector + ": " + error);
			getter.setDisabled();
		}

		// Create setter
		if (setter_info != null) {
			selector = setter_info.cursor().toString();
			ObjCMethod setter = manager.getMethodWithSelector(selector, false);
			if (setter == null) {
				return;
			}
			setter.setEdited();

			error = downgradePCallable(new IDPCCallback() {

				@Override
				public Type getType() {
					return new Type();
				}

				@Override
				public Type getArgType(int idx) {
					if (idx == 0) {
						return new Type(type, memModel);
					}
					throw new IllegalStateException();
				}

				@Override
				public int getArgCount() {
					return 1;
				}
			}, setter);
			if (error != null) {
				LOG.error(manager.getFullyQualifiedName() + " @ -" + selector + ": " + error);
				setter.setDisabled();
			}
		}
	}

	@Override
	public void processStruct(CXIdxDeclInfo decl) {
		CStructManager struct = getGenerator().getStruct(decl.cursor().getCursorUSR().toString());
		if (struct == null || struct.isFatal()) {
			return;
		}
		struct.incModelDowngraderExecutionCount();
	}

	@Override
	public void processField(CXIdxDeclInfo decl) {
		// Get manager
		CStructManager struct = getGenerator().getStruct(decl.semanticContainer().cursor().getCursorUSR().toString());
		if (struct == null || struct.isFatal() || !struct.isModelDowngraderExecuting()) {
			return;
		}

		String fieldname = decl.cursor().toString();
		if (fieldname != null) {
			Type type = new Type(decl.cursor().getCursorType(), memModel);
			int constantArraySize = 1;
			while (type.getKind() == Type.ConstantArray) {
				constantArraySize *= type.getArraySize();
				type = type.getInnerType();
			}
			if (constantArraySize > 0) {
				struct.getFieldSecondaryTypes().add(type);
			}
		} else {
			struct.setFatal("Field's name is null");
		}
	}

	@Override
	public void processEnum(CXIdxDeclInfo decl) {
		// Do nothing
	}

	@Override
	public void processEnumConstant(CXIdxDeclInfo decl) {
		// Get unit
		Unit unit = configuration.getUnit(decl);
		if (unit.handlingDisabled()) {
			return;
		}

		// Skip generation if needed
		if (unit.handlingExternal()) {
			return;
		}

		// Check availability
		if (!ClangUtil.isAvailable(decl.cursor())) {
			return;
		}

		// Get const's manager
		String enum_name = ClangUtil.getLocationUID(decl.semanticContainer().cursor());
		CEnumManager manager = getGenerator().getEnum(enum_name);
		if (manager == null) {
			LOG.debug("FAILED MANAGER: " + enum_name);
			return;
		}

		// Get const's info
		String const_name = decl.cursor().toString();
		Type const_type = new Type(decl.semanticContainer().cursor().getEnumDeclIntegerType(), memModel);

		CEnumConstant con = manager.getConstant(const_name);
		if (con == null) {
			LOG.debug("FAILED CONSTANT: " + const_name);
			LOG.debug(manager.toString());
			return;
		}
		con.setEdited();

		try {
			con.getValue().trySetValue32FromEnum(const_type, decl);
		} catch (GeneratorException e) {
			LOG.error(manager.getFullyQualifiedName() + " @ " + const_name + ": " + e.getMessage());
			con.setDontGenerate();
			return;
		}
	}

	@Override
	public void processFunction(final CXIdxDeclInfo decl) {
		// Get unit
		Unit unit = configuration.getUnit(decl);
		if (!unit.handlingDefault()) {
			return;
		}

		// Get manager
		CManager manager = getGenerator().getCManager(indexer, unit);
		if (manager == null) {
			return;
		}

		String function_name = decl.cursor().toString();
		CFunction function = manager.getFunction(function_name);
		if (function == null) {
			return;
		}
		function.setEdited();

		final int num_args = decl.cursor().getNumArguments();
		String error = downgradePCallable(new IDPCCallback() {

			@Override
			public Type getType() {
				return new Type(decl.cursor().getCursorResultType(), memModel);
			}

			@Override
			public Type getArgType(int idx) {
				CXCursor cursor = decl.cursor().getArgument(idx);
				return new Type(cursor.getCursorType(), memModel);
			}

			@Override
			public int getArgCount() {
				return num_args;
			}
		}, function);
		if (error != null) {
			LOG.error(manager.getFullyQualifiedName() + " @ " + function_name + ": " + error);
			function.setDontGenerate();
		} else {
			CXType function_type = decl.cursor().getCursorType();
			boolean isInline = decl.cursor().isInlined();
			if (isInline) {
				function.addLocation(clang_getFileName(decl.loc().getFileLocation()).toString());
			}
			for (int i = 0; i < num_args; ++i) {
				CXType type = function_type.getArgType(i);
				if (isInline) {
					VoidPtr argtfile = type.getTypeDeclaration().getCursorLocation().getFile();
					if (argtfile != null) {
						function.addLocation(clang_getFileName(argtfile).toString());
					}
				}
			}
		}
	}

	@Override
	public void processVariable(CXIdxDeclInfo decl) {
		// Get unit
		Unit unit = configuration.getUnit(decl);
		if (!unit.handlingDefault()) {
			return;
		}

		// Get manager
		CManager manager = getGenerator().getCManager(indexer, unit);
		if (manager == null) {
			return;
		}

		// Get variable
		CXCursor declCursor = decl.cursor();
		String variable_name = declCursor.toString();
		CVariable variable = manager.getVariable(variable_name);
		if (variable == null) {
			return;
		}
		variable.setEdited();

		// Figure out linkage
		int linkage = clang.clang_getCursorLinkage(declCursor);
		if (linkage != CXLinkageKind.External && linkage != CXLinkageKind.Internal) {
			statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
					"Linkage mismatch (" + ClangUtil.nameForLinkage(linkage) + ")");
			// Linkage MUST match
			variable.setDontGenerate();
			return;
		}

		// Check type
		Type variable_type = new Type(declCursor.getCursorType(), memModel);
		if (!variable.getType().setDowngradable(variable_type)) {
			LOG.error(manager.getFullyQualifiedName() + " @ " + variable_name + ": " + "type downgrade failed");
			variable.setDontGenerate();
		}

		// Get optional value
		if (linkage == CXLinkageKind.Internal) {
			if (variable.getValue() == null) {
				statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
						"Linkage mismatch (" + ClangUtil.nameForLinkage(linkage) + ")");
				// Linkage MUST match
				variable.setDontGenerate();
				return;
			}
			LongPtr val = PtrFactory.newLongReference();
			if (clang.clang_cursor_getEvaluatedValue(declCursor, val) == 0) {
				statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
						"Failed to get downgraded Java compatible evaluated value");
				// Linkage MUST match
				variable.setDontGenerate();
				return;
			}
			try {
				variable.getValue().trySetValue32(variable_type, val.getValue());
			} catch (GeneratorException e) {
				LOG.error(manager.getFullyQualifiedName() + " @ " + variable_name + ": " + e.getMessage());
				variable.setDontGenerate();
				return;
			}
		}
	}

	@Override
	public void processTypedef(CXIdxDeclInfo decl) {
		// Do nothing
	}

	@Override
	public void postProcess() {
		super.postProcess();

		for (CStructManager manager : getGenerator().getAllStructs()) {
			manager.flattenSecondaryFieldTypes();
		}
	}

}
