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

package org.clang.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class IndexerCallbacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IndexerCallbacks() {
		super(IndexerCallbacks.class);
	}

	@Generated
	protected IndexerCallbacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAbortQuery(
			@FunctionPtr(name = "call_abortQuery") Function_abortQuery value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_abortQuery {
		@Generated
		public int call_abortQuery(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDiagnostic(
			@FunctionPtr(name = "call_diagnostic") Function_diagnostic value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_diagnostic {
		@Generated
		public void call_diagnostic(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEnteredMainFile(
			@FunctionPtr(name = "call_enteredMainFile") Function_enteredMainFile value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_enteredMainFile {
		@Generated
		public VoidPtr call_enteredMainFile(VoidPtr arg0, VoidPtr arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPpIncludedFile(
			@FunctionPtr(name = "call_ppIncludedFile") Function_ppIncludedFile value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ppIncludedFile {
		@Generated
		public VoidPtr call_ppIncludedFile(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CXIdxIncludedFileInfo arg1);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setImportedASTFile(
			@FunctionPtr(name = "call_importedASTFile") Function_importedASTFile value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_importedASTFile {
		@Generated
		public VoidPtr call_importedASTFile(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CXIdxImportedASTFileInfo arg1);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setStartedTranslationUnit(
			@FunctionPtr(name = "call_startedTranslationUnit") Function_startedTranslationUnit value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_startedTranslationUnit {
		@Generated
		public VoidPtr call_startedTranslationUnit(VoidPtr arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setIndexDeclaration(
			@FunctionPtr(name = "call_indexDeclaration") Function_indexDeclaration value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_indexDeclaration {
		@Generated
		public void call_indexDeclaration(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setIndexEntityReference(
			@FunctionPtr(name = "call_indexEntityReference") Function_indexEntityReference value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_indexEntityReference {
		@Generated
		public void call_indexEntityReference(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityRefInfo arg1);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@FunctionPtr(name = "call_abortQuery")
	public native Function_abortQuery abortQuery();

	@Generated
	@StructureField(order = 1, isGetter = true)
	@FunctionPtr(name = "call_diagnostic")
	public native Function_diagnostic diagnostic();

	@Generated
	@StructureField(order = 2, isGetter = true)
	@FunctionPtr(name = "call_enteredMainFile")
	public native Function_enteredMainFile enteredMainFile();

	@Generated
	@StructureField(order = 3, isGetter = true)
	@FunctionPtr(name = "call_ppIncludedFile")
	public native Function_ppIncludedFile ppIncludedFile();

	@Generated
	@StructureField(order = 4, isGetter = true)
	@FunctionPtr(name = "call_importedASTFile")
	public native Function_importedASTFile importedASTFile();

	@Generated
	@StructureField(order = 5, isGetter = true)
	@FunctionPtr(name = "call_startedTranslationUnit")
	public native Function_startedTranslationUnit startedTranslationUnit();

	@Generated
	@StructureField(order = 6, isGetter = true)
	@FunctionPtr(name = "call_indexDeclaration")
	public native Function_indexDeclaration indexDeclaration();

	@Generated
	@StructureField(order = 7, isGetter = true)
	@FunctionPtr(name = "call_indexEntityReference")
	public native Function_indexEntityReference indexEntityReference();
}
