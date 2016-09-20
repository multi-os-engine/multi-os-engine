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

package org.clang.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ann.ObjCBlock;
import org.clang.opaque.CXCursorSet;
import org.clang.opaque.CXModuleMapDescriptor;
import org.clang.opaque.CXTranslationUnit;
import org.clang.opaque.CXVirtualFileOverlay;
import org.clang.struct.*;

@Library("clang_moe")
@Runtime(CRuntime.class)
public final class clang {
	static {
		NatJ.register();
	}

	@Generated
	private clang() {
	}

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String clang_getCString(@ByValue CXString string);

	@Generated
	@CFunction
	public static native void clang_disposeString(@ByValue CXString string);

    @CFunction("clang_createIndex")
    private static native VoidPtr clang_createIndex_unsafe(
            int excludeDeclarationsFromPCH, int displayDiagnostics);

    /**
     * This is a safe forwarder function in which clang_toggleCrashRecovery(0) is called,
     * which is a workaround for a conflict between LLVM and JVM exception handling which
     * causes a JVM crash. If this is not set then llvm::CrashRecoveryContext can cause a
     * crash from which we cannot recover.
     */
    public static VoidPtr clang_createIndex(
            int excludeDeclarationsFromPCH, int displayDiagnostics) {
		/* THIS IS A VERY IMPORTANT FIX! DO NOT REMOVE! */
		/* THIS MUST BE AFTER 'clang_createIndex' BECAUSE IT WILL IMPLICITLY ENABLE IT! */
		/*
		 * If this is not set then llvm::CrashRecoveryContext can cause a crash
		 * from which we cannot recover.
		 */
		clang.clang_forceDisableCrashRecovery();
		VoidPtr ptr = clang_createIndex_unsafe(excludeDeclarationsFromPCH, displayDiagnostics);
        clang_toggleCrashRecovery(0);
        return ptr;
    }

	@Generated
	@CFunction
	public static native void clang_disposeIndex(VoidPtr index);

	@Generated
	@CFunction
	public static native void clang_CXIndex_setGlobalOptions(VoidPtr arg1,
			int options);

	@Generated
	@CFunction
	public static native int clang_CXIndex_getGlobalOptions(VoidPtr arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getFileName(VoidPtr SFile);

	@Generated
	@CFunction
	public static native long clang_getFileTime(VoidPtr SFile);

	@Generated
	@CFunction
	public static native int clang_getFileUniqueID(
			VoidPtr file,
			@UncertainArgument("Options: reference, array Fallback: reference") CXFileUniqueID outID);

	@Generated
	@CFunction
	public static native int clang_isFileMultipleIncludeGuarded(
			CXTranslationUnit tu, VoidPtr file);

	@Generated
	@CFunction
	public static native VoidPtr clang_getFile(
			CXTranslationUnit tu,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String file_name);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getNullLocation();

	@Generated
	@CFunction
	public static native int clang_equalLocations(
			@ByValue CXSourceLocation loc1, @ByValue CXSourceLocation loc2);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getLocation(
			CXTranslationUnit tu, VoidPtr file, int line, int column);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getLocationForOffset(
			CXTranslationUnit tu, VoidPtr file, int offset);

	@Generated
	@CFunction
	public static native int clang_Location_isInSystemHeader(
			@ByValue CXSourceLocation location);

	@Generated
	@CFunction
	public static native int clang_Location_isFromMainFile(
			@ByValue CXSourceLocation location);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getNullRange();

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getRange(
			@ByValue CXSourceLocation begin, @ByValue CXSourceLocation end);

	@Generated
	@CFunction
	public static native int clang_equalRanges(@ByValue CXSourceRange range1,
			@ByValue CXSourceRange range2);

	@Generated
	@CFunction
	public static native int clang_Range_isNull(@ByValue CXSourceRange range);

	@Generated
	@CFunction
	public static native void clang_getExpansionLocation(
			@ByValue CXSourceLocation location, Ptr<VoidPtr> file, IntPtr line,
			IntPtr column, IntPtr offset);

	@Generated
	@CFunction
	public static native void clang_getPresumedLocation(
			@ByValue CXSourceLocation location,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString filename,
			IntPtr line, IntPtr column);

	@Generated
	@CFunction
	public static native void clang_getInstantiationLocation(
			@ByValue CXSourceLocation location, Ptr<VoidPtr> file, IntPtr line,
			IntPtr column, IntPtr offset);

	@Generated
	@CFunction
	public static native void clang_getSpellingLocation(
			@ByValue CXSourceLocation location, Ptr<VoidPtr> file, IntPtr line,
			IntPtr column, IntPtr offset);

	@Generated
	@CFunction
	public static native void clang_getFileLocation(
			@ByValue CXSourceLocation location, Ptr<VoidPtr> file, IntPtr line,
			IntPtr column, IntPtr offset);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getRangeStart(
			@ByValue CXSourceRange range);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getRangeEnd(
			@ByValue CXSourceRange range);

	@Generated
	@CFunction
	public static native int clang_getNumDiagnosticsInSet(VoidPtr Diags);

	@Generated
	@CFunction
	public static native VoidPtr clang_getDiagnosticInSet(VoidPtr Diags,
			int Index);

	@Generated
	@CFunction
	public static native VoidPtr clang_loadDiagnostics(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String file,
			IntPtr error,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString errorString);

	@Generated
	@CFunction
	public static native void clang_disposeDiagnosticSet(VoidPtr Diags);

	@Generated
	@CFunction
	public static native VoidPtr clang_getChildDiagnostics(VoidPtr D);

	@Generated
	@CFunction
	public static native int clang_getNumDiagnostics(CXTranslationUnit Unit);

	@Generated
	@CFunction
	public static native VoidPtr clang_getDiagnostic(CXTranslationUnit Unit,
			int Index);

	@Generated
	@CFunction
	public static native VoidPtr clang_getDiagnosticSetFromTU(
			CXTranslationUnit Unit);

	@Generated
	@CFunction
	public static native void clang_disposeDiagnostic(VoidPtr Diagnostic);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_formatDiagnostic(VoidPtr Diagnostic,
			int Options);

	@Generated
	@CFunction
	public static native int clang_defaultDiagnosticDisplayOptions();

	@Generated
	@CFunction
	public static native int clang_getDiagnosticSeverity(VoidPtr arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getDiagnosticLocation(
			VoidPtr arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getDiagnosticSpelling(VoidPtr arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getDiagnosticOption(
			VoidPtr Diag,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString Disable);

	@Generated
	@CFunction
	public static native int clang_getDiagnosticCategory(VoidPtr arg1);

	@Generated
	@Deprecated
	@CFunction
	@ByValue
	public static native CXString clang_getDiagnosticCategoryName(int Category);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getDiagnosticCategoryText(VoidPtr arg1);

	@Generated
	@CFunction
	public static native int clang_getDiagnosticNumRanges(VoidPtr arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getDiagnosticRange(
			VoidPtr Diagnostic, int Range);

	@Generated
	@CFunction
	public static native int clang_getDiagnosticNumFixIts(VoidPtr Diagnostic);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getDiagnosticFixIt(
			VoidPtr Diagnostic,
			int FixIt,
			@UncertainArgument("Options: reference, array Fallback: reference") CXSourceRange ReplacementRange);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getTranslationUnitSpelling(
			CXTranslationUnit CTUnit);

	@Generated
	@CFunction
	public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(
			VoidPtr CIdx,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
			int num_clang_command_line_args,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] clang_command_line_args,
			int num_unsaved_files,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files);

	@Generated
	@CFunction
	public static native CXTranslationUnit clang_createTranslationUnit(
			VoidPtr CIdx,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ast_filename);

	@Generated
	@CFunction
	public static native int clang_defaultEditingTranslationUnitOptions();

	@Generated
	@CFunction
	public static native CXTranslationUnit clang_parseTranslationUnit(
			VoidPtr CIdx,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
			int num_command_line_args,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
			int num_unsaved_files, int options);

	@Generated
	@CFunction
	public static native int clang_defaultSaveOptions(CXTranslationUnit TU);

	@Generated
	@CFunction
	public static native int clang_saveTranslationUnit(
			CXTranslationUnit TU,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String FileName,
			int options);

	@Generated
	@CFunction
	public static native void clang_disposeTranslationUnit(
			CXTranslationUnit arg1);

	@Generated
	@CFunction
	public static native int clang_defaultReparseOptions(CXTranslationUnit TU);

	@Generated
	@CFunction
	public static native int clang_reparseTranslationUnit(
			CXTranslationUnit TU,
			int num_unsaved_files,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
			int options);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String clang_getTUResourceUsageName(int kind);

	@Generated
	@CFunction
	@ByValue
	public static native CXTUResourceUsage clang_getCXTUResourceUsage(
			CXTranslationUnit TU);

	@Generated
	@CFunction
	public static native void clang_disposeCXTUResourceUsage(
			@ByValue CXTUResourceUsage usage);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getNullCursor();

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getTranslationUnitCursor(
			CXTranslationUnit arg1);

	@Generated
	@CFunction
	public static native int clang_equalCursors(@ByValue CXCursor arg1,
			@ByValue CXCursor arg2);

	@Generated
	@CFunction
	public static native int clang_Cursor_isNull(@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_hashCursor(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_getCursorKind(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_isDeclaration(int arg1);

	@Generated
	@CFunction
	public static native int clang_isReference(int arg1);

	@Generated
	@CFunction
	public static native int clang_isExpression(int arg1);

	@Generated
	@CFunction
	public static native int clang_isStatement(int arg1);

	@Generated
	@CFunction
	public static native int clang_isAttribute(int arg1);

	@Generated
	@CFunction
	public static native int clang_isInvalid(int arg1);

	@Generated
	@CFunction
	public static native int clang_isTranslationUnit(int arg1);

	@Generated
	@CFunction
	public static native int clang_isPreprocessing(int arg1);

	@Generated
	@CFunction
	public static native int clang_isUnexposed(int arg1);

	@Generated
	@CFunction
	public static native int clang_getCursorLinkage(@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_getCursorAvailability(
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_getCursorPlatformAvailability(
			@ByValue CXCursor cursor,
			IntPtr always_deprecated,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString deprecated_message,
			IntPtr always_unavailable,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString unavailable_message,
			@UncertainArgument("Options: reference, array Fallback: reference") CXPlatformAvailability availability,
			int availability_size);

	@Generated
	@CFunction
	public static native void clang_disposeCXPlatformAvailability(
			@UncertainArgument("Options: reference, array Fallback: reference") CXPlatformAvailability availability);

	@Generated
	@CFunction
	public static native int clang_getCursorLanguage(@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native CXTranslationUnit clang_Cursor_getTranslationUnit(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native CXCursorSet clang_createCXCursorSet();

	@Generated
	@CFunction
	public static native void clang_disposeCXCursorSet(CXCursorSet cset);

	@Generated
	@CFunction
	public static native int clang_CXCursorSet_contains(CXCursorSet cset,
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_CXCursorSet_insert(CXCursorSet cset,
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCursorSemanticParent(
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCursorLexicalParent(
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native void clang_getOverriddenCursors(
			@ByValue CXCursor cursor, Ptr<Ptr<CXCursor>> overridden,
			IntPtr num_overridden);

	@Generated
	@CFunction
	public static native void clang_disposeOverriddenCursors(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCursor overridden);

	@Generated
	@CFunction
	public static native VoidPtr clang_getIncludedFile(@ByValue CXCursor cursor);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCursor(CXTranslationUnit arg1,
			@ByValue CXSourceLocation arg2);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getCursorLocation(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getCursorExtent(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getCursorType(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getTypeSpelling(@ByValue CXType CT);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getTypedefDeclUnderlyingType(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getEnumDeclIntegerType(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native long clang_getEnumConstantDeclValue(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native long clang_getEnumConstantDeclUnsignedValue(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_getFieldDeclBitWidth(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_getNumArguments(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_Cursor_getArgument(@ByValue CXCursor C,
			int i);

	@Generated
	@CFunction
	public static native int clang_equalTypes(@ByValue CXType A,
			@ByValue CXType B);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getCanonicalType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_isConstQualifiedType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_isVolatileQualifiedType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_isRestrictQualifiedType(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getPointeeType(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getTypeDeclaration(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getDeclObjCTypeEncoding(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getTypeKindSpelling(int K);

	@Generated
	@CFunction
	public static native int clang_getFunctionTypeCallingConv(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getResultType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_getNumArgTypes(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getArgType(@ByValue CXType T, int i);

	@Generated
	@CFunction
	public static native int clang_isFunctionTypeVariadic(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getCursorResultType(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_isPODType(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getElementType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_getNumElements(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getArrayElementType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_getArraySize(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Type_getNamedType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_Type_getAlignOf(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Type_getClassType(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_Type_getSizeOf(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_Type_getOffsetOf(
			@ByValue CXType T,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String S);

	@Generated
	@CFunction
	public static native int clang_Type_getCXXRefQualifier(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_Cursor_isBitField(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_isVirtualBase(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_getCXXAccessSpecifier(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_getNumOverloadedDecls(
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getOverloadedDecl(
			@ByValue CXCursor cursor, int index);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getIBOutletCollectionType(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_visitChildren(
			@ByValue CXCursor parent,
			@FunctionPtr(name = "call_clang_visitChildren") Function_clang_visitChildren visitor,
			VoidPtr client_data);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_clang_visitChildren {
		@Generated
		public int call_clang_visitChildren(@ByValue CXCursor arg0,
				@ByValue CXCursor arg1, VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native int clang_visitChildrenWithBlock(
			@ByValue CXCursor parent,
			@ObjCBlock(name = "call_clang_visitChildrenWithBlock") Block_clang_visitChildrenWithBlock block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_clang_visitChildrenWithBlock {
		@Generated
		public int call_clang_visitChildrenWithBlock(@ByValue CXCursor arg0,
				@ByValue CXCursor arg1);
	}

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCursorUSR(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCClass(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String class_name);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCCategory(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String class_name,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category_name);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCProtocol(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String protocol_name);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCIvar(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@ByValue CXString classUSR);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCMethod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			int isInstanceMethod, @ByValue CXString classUSR);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_constructUSR_ObjCProperty(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String property,
			@ByValue CXString classUSR);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCursorSpelling(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_Cursor_getSpellingNameRange(
			@ByValue CXCursor arg1, int pieceIndex, int options);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCursorDisplayName(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCursorReferenced(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCursorDefinition(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_isCursorDefinition(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getCanonicalCursor(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_Cursor_getObjCSelectorIndex(
			@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native int clang_Cursor_isDynamicCall(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Cursor_getReceiverType(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_getObjCPropertyAttributes(
			@ByValue CXCursor C, int reserved);

	@Generated
	@CFunction
	public static native int clang_Cursor_getObjCDeclQualifiers(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_isObjCOptional(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_isVariadic(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_Cursor_getCommentRange(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_Cursor_getRawCommentText(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_Cursor_getBriefCommentText(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXComment clang_Cursor_getParsedComment(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native VoidPtr clang_Cursor_getModule(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native VoidPtr clang_Module_getASTFile(VoidPtr Module);

	@Generated
	@CFunction
	public static native VoidPtr clang_Module_getParent(VoidPtr Module);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_Module_getName(VoidPtr Module);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_Module_getFullName(VoidPtr Module);

	@Generated
	@CFunction
	public static native int clang_Module_getNumTopLevelHeaders(
			CXTranslationUnit arg1, VoidPtr Module);

	@Generated
	@CFunction
	public static native VoidPtr clang_Module_getTopLevelHeader(
			CXTranslationUnit arg1, VoidPtr Module, int Index);

	@Generated
	@CFunction
	public static native int clang_Comment_getKind(@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_Comment_getNumChildren(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXComment clang_Comment_getChild(
			@ByValue CXComment Comment, int ChildIdx);

	@Generated
	@CFunction
	public static native int clang_Comment_isWhitespace(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_InlineContentComment_hasTrailingNewline(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_TextComment_getText(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_InlineCommandComment_getCommandName(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_InlineCommandComment_getRenderKind(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_InlineCommandComment_getNumArgs(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_InlineCommandComment_getArgText(
			@ByValue CXComment Comment, int ArgIdx);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_HTMLTagComment_getTagName(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_HTMLStartTagComment_isSelfClosing(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_HTMLStartTag_getNumAttrs(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_HTMLStartTag_getAttrName(
			@ByValue CXComment Comment, int AttrIdx);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_HTMLStartTag_getAttrValue(
			@ByValue CXComment Comment, int AttrIdx);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_BlockCommandComment_getCommandName(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_BlockCommandComment_getNumArgs(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_BlockCommandComment_getArgText(
			@ByValue CXComment Comment, int ArgIdx);

	@Generated
	@CFunction
	@ByValue
	public static native CXComment clang_BlockCommandComment_getParagraph(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_ParamCommandComment_getParamName(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_ParamCommandComment_isParamIndexValid(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_ParamCommandComment_getParamIndex(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_ParamCommandComment_isDirectionExplicit(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_ParamCommandComment_getDirection(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_TParamCommandComment_getParamName(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_TParamCommandComment_isParamPositionValid(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_TParamCommandComment_getDepth(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_TParamCommandComment_getIndex(
			@ByValue CXComment Comment, int Depth);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_VerbatimBlockLineComment_getText(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_VerbatimLineComment_getText(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_HTMLTagComment_getAsString(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_FullComment_getAsHTML(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_FullComment_getAsXML(
			@ByValue CXComment Comment);

	@Generated
	@CFunction
	public static native int clang_CXXMethod_isPureVirtual(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_CXXMethod_isStatic(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_CXXMethod_isVirtual(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_getTemplateCursorKind(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_getSpecializedCursorTemplate(
			@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getCursorReferenceNameRange(
			@ByValue CXCursor C, int NameFlags, int PieceIndex);

	@Generated
	@CFunction
	public static native int clang_getTokenKind(@ByValue CXToken arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getTokenSpelling(
			CXTranslationUnit arg1, @ByValue CXToken arg2);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_getTokenLocation(
			CXTranslationUnit arg1, @ByValue CXToken arg2);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceRange clang_getTokenExtent(
			CXTranslationUnit arg1, @ByValue CXToken arg2);

	@Generated
	@CFunction
	public static native void clang_tokenize(CXTranslationUnit TU,
			@ByValue CXSourceRange Range, Ptr<Ptr<CXToken>> Tokens,
			IntPtr NumTokens);

	@Generated
	@CFunction
	public static native void clang_annotateTokens(
			CXTranslationUnit TU,
			@UncertainArgument("Options: reference, array Fallback: reference") CXToken Tokens,
			int NumTokens,
			@UncertainArgument("Options: reference, array Fallback: reference") CXCursor Cursors);

	@Generated
	@CFunction
	public static native void clang_disposeTokens(
			CXTranslationUnit TU,
			Ptr<CXToken> Tokens,
			int NumTokens);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCursorKindSpelling(int Kind);

	@Generated
	@CFunction
	public static native void clang_getDefinitionSpellingAndExtent(
			@ByValue CXCursor arg1,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] startBuf,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] endBuf,
			IntPtr startLine, IntPtr startColumn, IntPtr endLine,
			IntPtr endColumn);

	@Generated
	@CFunction
	public static native void clang_enableStackTraces();

	@Generated
	@CFunction
	public static native void clang_executeOnThread(
			@FunctionPtr(name = "call_clang_executeOnThread") Function_clang_executeOnThread fn,
			VoidPtr user_data, int stack_size);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_clang_executeOnThread {
		@Generated
		public void call_clang_executeOnThread(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native int clang_getCompletionChunkKind(
			VoidPtr completion_string, int chunk_number);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCompletionChunkText(
			VoidPtr completion_string, int chunk_number);

	@Generated
	@CFunction
	public static native VoidPtr clang_getCompletionChunkCompletionString(
			VoidPtr completion_string, int chunk_number);

	@Generated
	@CFunction
	public static native int clang_getNumCompletionChunks(
			VoidPtr completion_string);

	@Generated
	@CFunction
	public static native int clang_getCompletionPriority(
			VoidPtr completion_string);

	@Generated
	@CFunction
	public static native int clang_getCompletionAvailability(
			VoidPtr completion_string);

	@Generated
	@CFunction
	public static native int clang_getCompletionNumAnnotations(
			VoidPtr completion_string);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCompletionAnnotation(
			VoidPtr completion_string, int annotation_number);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCompletionParent(
			VoidPtr completion_string, IntPtr kind);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getCompletionBriefComment(
			VoidPtr completion_string);

	@Generated
	@CFunction
	public static native VoidPtr clang_getCursorCompletionString(
			@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_defaultCodeCompleteOptions();

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXCodeCompleteResults clang_codeCompleteAt(
			CXTranslationUnit TU,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String complete_filename,
			int complete_line,
			int complete_column,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
			int num_unsaved_files, int options);

	@Generated
	@CFunction
	public static native void clang_sortCodeCompletionResults(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCompletionResult Results,
			int NumResults);

	@Generated
	@CFunction
	public static native void clang_disposeCodeCompleteResults(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

	@Generated
	@CFunction
	public static native int clang_codeCompleteGetNumDiagnostics(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

	@Generated
	@CFunction
	public static native VoidPtr clang_codeCompleteGetDiagnostic(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results,
			int Index);

	@Generated
	@CFunction
	public static native long clang_codeCompleteGetContexts(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

	@Generated
	@CFunction
	public static native int clang_codeCompleteGetContainerKind(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results,
			IntPtr IsIncomplete);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_codeCompleteGetContainerUSR(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_codeCompleteGetObjCSelector(
			@UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_getClangVersion();

	@Generated
	@CFunction
	public static native void clang_toggleCrashRecovery(int isEnabled);

	@Generated
	@CFunction
	public static native void clang_getInclusions(
			CXTranslationUnit tu,
			@FunctionPtr(name = "call_clang_getInclusions") Function_clang_getInclusions visitor,
			VoidPtr client_data);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_clang_getInclusions {
		@Generated
		public void call_clang_getInclusions(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CXSourceLocation arg1,
				int arg2, VoidPtr arg3);
	}

	@Generated
	@CFunction
	public static native VoidPtr clang_getRemappings(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

	@Generated
	@CFunction
	public static native VoidPtr clang_getRemappingsFromFileList(
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] filePaths,
			int numFiles);

	@Generated
	@CFunction
	public static native int clang_remap_getNumFiles(VoidPtr arg1);

	@Generated
	@CFunction
	public static native void clang_remap_getFilenames(
			VoidPtr arg1,
			int index,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString original,
			@UncertainArgument("Options: reference, array Fallback: reference") CXString transformed);

	@Generated
	@CFunction
	public static native void clang_remap_dispose(VoidPtr arg1);

	@Generated
	@CFunction
	public static native int clang_findReferencesInFile(
			@ByValue CXCursor cursor, VoidPtr file,
			@ByValue CXCursorAndRangeVisitor visitor);

	@Generated
	@CFunction
	public static native int clang_findIncludesInFile(CXTranslationUnit TU,
			VoidPtr file, @ByValue CXCursorAndRangeVisitor visitor);

	@Generated
	@CFunction
	public static native int clang_findReferencesInFileWithBlock(
			@ByValue CXCursor arg1,
			VoidPtr arg2,
			@ObjCBlock(name = "call_clang_findReferencesInFileWithBlock") Block_clang_findReferencesInFileWithBlock arg3);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_clang_findReferencesInFileWithBlock {
		@Generated
		public int call_clang_findReferencesInFileWithBlock(
				@ByValue CXCursor arg0, @ByValue CXSourceRange arg1);
	}

	@Generated
	@CFunction
	public static native int clang_findIncludesInFileWithBlock(
			CXTranslationUnit arg1,
			VoidPtr arg2,
			@ObjCBlock(name = "call_clang_findIncludesInFileWithBlock") Block_clang_findIncludesInFileWithBlock arg3);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_clang_findIncludesInFileWithBlock {
		@Generated
		public int call_clang_findIncludesInFileWithBlock(
				@ByValue CXCursor arg0, @ByValue CXSourceRange arg1);
	}

	@Generated
	@CFunction
	public static native int clang_index_isEntityObjCContainerKind(int arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxObjCContainerDeclInfo clang_index_getObjCContainerDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxObjCInterfaceDeclInfo clang_index_getObjCInterfaceDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxObjCCategoryDeclInfo clang_index_getObjCCategoryDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxObjCProtocolRefListInfo clang_index_getObjCProtocolRefListInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxObjCPropertyDeclInfo clang_index_getObjCPropertyDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxIBOutletCollectionAttrInfo clang_index_getIBOutletCollectionAttrInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxAttrInfo arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXIdxCXXClassDeclInfo clang_index_getCXXClassDeclInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxDeclInfo arg1);

	@Generated
	@CFunction
	public static native VoidPtr clang_index_getClientContainer(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo arg1);

	@Generated
	@CFunction
	public static native void clang_index_setClientContainer(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo arg1,
			VoidPtr arg2);

	@Generated
	@CFunction
	public static native VoidPtr clang_index_getClientEntity(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo arg1);

	@Generated
	@CFunction
	public static native void clang_index_setClientEntity(
			@UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo arg1,
			VoidPtr arg2);

	@Generated
	@CFunction
	public static native VoidPtr clang_IndexAction_create(VoidPtr CIdx);

	@Generated
	@CFunction
	public static native void clang_IndexAction_dispose(VoidPtr arg1);

	@Generated
	@CFunction
	public static native int clang_indexSourceFile(
			VoidPtr arg1,
			VoidPtr client_data,
			@UncertainArgument("Options: reference, array Fallback: reference") IndexerCallbacks index_callbacks,
			int index_callbacks_size,
			int index_options,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
			int num_command_line_args,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
			int num_unsaved_files, Ptr<CXTranslationUnit> out_TU, int TU_options);

	@Generated
	@CFunction
	public static native int clang_indexTranslationUnit(
			VoidPtr arg1,
			VoidPtr client_data,
			@UncertainArgument("Options: reference, array Fallback: reference") IndexerCallbacks index_callbacks,
			int index_callbacks_size, int index_options, CXTranslationUnit arg6);

	@Generated
	@CFunction
	public static native void clang_indexLoc_getFileLocation(
			@ByValue CXIdxLoc loc, Ptr<VoidPtr> indexFile, Ptr<VoidPtr> file,
			IntPtr line, IntPtr column, IntPtr offset);

	@Generated
	@CFunction
	@ByValue
	public static native CXSourceLocation clang_indexLoc_getCXSourceLocation(
			@ByValue CXIdxLoc loc);

	@Generated
	@CFunction
	public static native long clang_getBuildSessionTimestamp();

	@Generated
	@CFunction
	public static native CXVirtualFileOverlay clang_VirtualFileOverlay_create(
			int options);

	@Generated
	@CFunction
	public static native int clang_VirtualFileOverlay_addFileMapping(
			CXVirtualFileOverlay arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String virtualPath,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String realPath);

	@Generated
	@CFunction
	public static native int clang_VirtualFileOverlay_setCaseSensitivity(
			CXVirtualFileOverlay arg1, int caseSensitive);

	@Generated
	@CFunction
	public static native int clang_VirtualFileOverlay_writeToBuffer(
			CXVirtualFileOverlay arg1, int options,
			Ptr<BytePtr> out_buffer_ptr, IntPtr out_buffer_size);

	@Generated
	@CFunction
	public static native void clang_VirtualFileOverlay_dispose(
			CXVirtualFileOverlay arg1);

	@Generated
	@CFunction
	public static native CXModuleMapDescriptor clang_ModuleMapDescriptor_create(
			int options);

	@Generated
	@CFunction
	public static native int clang_ModuleMapDescriptor_setFrameworkModuleName(
			CXModuleMapDescriptor arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native int clang_ModuleMapDescriptor_setUmbrellaHeader(
			CXModuleMapDescriptor arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native int clang_ModuleMapDescriptor_writeToBuffer(
			CXModuleMapDescriptor arg1, int options,
			Ptr<BytePtr> out_buffer_ptr, IntPtr out_buffer_size);

	@Generated
	@CFunction
	public static native void clang_ModuleMapDescriptor_dispose(
			CXModuleMapDescriptor arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native CXSourceRangeList clang_getSkippedRanges(
			CXTranslationUnit tu, VoidPtr file);

	@Generated
	@CFunction
	public static native void clang_disposeSourceRangeList(
			@UncertainArgument("Options: reference, array Fallback: reference") CXSourceRangeList ranges);

	@Generated
	@CFunction
	public static native int clang_createTranslationUnit2(
			VoidPtr CIdx,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ast_filename,
			Ptr<CXTranslationUnit> out_TU);

	@Generated
	@CFunction
	public static native int clang_parseTranslationUnit2(
			VoidPtr CIdx,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
			int num_command_line_args,
			@UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
			int num_unsaved_files, int options, Ptr<CXTranslationUnit> out_TU);

	@Generated
	@CFunction
	public static native int clang_Type_getNumTemplateArguments(
			@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Type_getTemplateArgumentAsType(
			@ByValue CXType T, int i);

	@Generated
	@CFunction
	public static native VoidPtr clang_getModuleForFile(CXTranslationUnit arg1,
			VoidPtr arg2);

	@Generated
	@CFunction
	public static native int clang_Module_isSystem(VoidPtr Module);

	@Generated
	@CFunction
	public static native int clang_CXXMethod_isConst(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_File_isEqual(VoidPtr file1, VoidPtr file2);

	@Generated
	@CFunction
	public static native int clang_Cursor_getNumTemplateArguments(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_getTemplateArgumentKind(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Cursor_getTemplateArgumentType(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	public static native long clang_Cursor_getTemplateArgumentValue(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	public static native long clang_Cursor_getTemplateArgumentUnsignedValue(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	public static native int clang_Cursor_getStorageClass(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	@ByValue
	public static native CXString clang_Cursor_getMangling(@ByValue CXCursor arg1);

	@Generated
	@CFunction
	public static native void clang_free(VoidPtr buffer);

	@Generated
	@CFunction
	public static native int clang_Cursor_isInlined(@ByValue CXCursor cursor);

	@Generated
	@CFunction
	public static native int clang_isSignedIntegerType(@ByValue CXType CT);

	@Generated
	@CFunction
	public static native int clang_isUnsignedIntegerType(@ByValue CXType CT);

	@Generated
	@CFunction
	public static native int clang_isSignedIntegerOrEnumerationType(@ByValue CXType CT);

	@Generated
	@CFunction
	public static native int clang_isUnsignedIntegerOrEnumerationType(@ByValue CXType CT);

	@Generated
	@CFunction
	public static native int clang_getNullabilityKind(@ByValue CXType T);

	@Generated
	@CFunction
	public static native long clang_Cursor_getOffsetOfField(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_isAnonymous(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Type_isObjCKindOf(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_Type_getNumObjCProtocols(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXCursor clang_Type_getObjCProtocolAsCursor(@ByValue CXType T, int i);

	@Generated
	@CFunction
	public static native int clang_Type_visitFields(@ByValue CXType T,
			@FunctionPtr(name = "call_clang_Type_visitFields") Function_clang_Type_visitFields visitor,
			VoidPtr client_data);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_clang_Type_visitFields {
		@Generated
		public int call_clang_Type_visitFields(@ByValue CXCursor arg0, VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void clang_forceDisableCrashRecovery();

	@Generated
	@CFunction
	public static native void clang_forceSetNoThreads();

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getTypeByStrippingOuterNullability(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_getTypeByStrippingOuterObjCKindOf(@ByValue CXType T);

	@Generated
	@CFunction
	public static native int clang_getRawType(@ByValue CXType T);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String clang_getRawTypeName(@ByValue CXType T);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Cursor_getObjCInterfaceParameterizedSuperType(@ByValue CXCursor C);

	@Generated
	@CFunction
	public static native int clang_Cursor_getNumObjCGenericParams(@ByValue CXCursor C);

	@Generated
	@CFunction
	@ByValue
	public static native CXType clang_Cursor_getObjCGenericParamType(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	public static native int clang_Cursor_getObjCGenericParamVariance(@ByValue CXCursor C, int I);

	@Generated
	@CFunction
	public static native int clang_cursor_getEvaluatedValue(@ByValue CXCursor arg1, LongPtr arg2);
}
