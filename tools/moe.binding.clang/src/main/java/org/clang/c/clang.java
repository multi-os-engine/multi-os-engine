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

import org.clang.opaque.CXCursorSet;
import org.clang.opaque.CXModuleMapDescriptor;
import org.clang.opaque.CXTargetInfo;
import org.clang.opaque.CXTranslationUnit;
import org.clang.opaque.CXVirtualFileOverlay;
import org.clang.struct.CXCodeCompleteResults;
import org.clang.struct.CXComment;
import org.clang.struct.CXCompletionResult;
import org.clang.struct.CXCursor;
import org.clang.struct.CXCursorAndRangeVisitor;
import org.clang.struct.CXFileUniqueID;
import org.clang.struct.CXIdxAttrInfo;
import org.clang.struct.CXIdxCXXClassDeclInfo;
import org.clang.struct.CXIdxContainerInfo;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxEntityInfo;
import org.clang.struct.CXIdxIBOutletCollectionAttrInfo;
import org.clang.struct.CXIdxLoc;
import org.clang.struct.CXIdxObjCCategoryDeclInfo;
import org.clang.struct.CXIdxObjCContainerDeclInfo;
import org.clang.struct.CXIdxObjCInterfaceDeclInfo;
import org.clang.struct.CXIdxObjCPropertyDeclInfo;
import org.clang.struct.CXIdxObjCProtocolRefListInfo;
import org.clang.struct.CXPlatformAvailability;
import org.clang.struct.CXSourceLocation;
import org.clang.struct.CXSourceRange;
import org.clang.struct.CXSourceRangeList;
import org.clang.struct.CXString;
import org.clang.struct.CXStringSet;
import org.clang.struct.CXTUResourceUsage;
import org.clang.struct.CXToken;
import org.clang.struct.CXType;
import org.clang.struct.CXUnsavedFile;
import org.clang.struct.IndexerCallbacks;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Library("clang_moe")
@Runtime(CRuntime.class)
public final class clang {
    static {
        NatJ.register();
    }

    @Generated
    private clang() {
    }

    /**
     * Retrieve the character data associated with the given string.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String clang_getCString(@ByValue CXString string);

    /**
     * Free the given string.
     */
    @Generated
    @CFunction
    public static native void clang_disposeString(@ByValue CXString string);

    @CFunction("clang_createIndex")
    private static native VoidPtr clang_createIndex_unsafe(int excludeDeclarationsFromPCH, int displayDiagnostics);

    /**
     * This is a safe forwarder function in which clang_toggleCrashRecovery(0) is called,
     * which is a workaround for a conflict between LLVM and JVM exception handling which
     * causes a JVM crash. If this is not set then llvm::CrashRecoveryContext can cause a
     * crash from which we cannot recover.
     *
     * @param excludeDeclarationsFromPCH Exclude declarations from PCH
     * @param displayDiagnostics         Display diagnostics
     * @return Index
     */
    public static VoidPtr clang_createIndex(int excludeDeclarationsFromPCH, int displayDiagnostics) {
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

    /**
     * Destroy the given index.
     * <p>
     * The index must not be destroyed until all of the translation units created
     * within that index have been destroyed.
     */
    @Generated
    @CFunction
    public static native void clang_disposeIndex(VoidPtr index);

    /**
     * Sets general options associated with a CXIndex.
     * <p>
     * For example:
     * \code
     * CXIndex idx = ...;
     * clang_CXIndex_setGlobalOptions(idx,
     * clang_CXIndex_getGlobalOptions(idx) |
     * CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
     * \endcode
     * <p>
     * \param options A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags.
     */
    @Generated
    @CFunction
    public static native void clang_CXIndex_setGlobalOptions(VoidPtr arg1, int options);

    /**
     * Gets the general options associated with a CXIndex.
     * <p>
     * \returns A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags that
     * are associated with the given CXIndex object.
     */
    @Generated
    @CFunction
    public static native int clang_CXIndex_getGlobalOptions(VoidPtr arg1);

    /**
     * Retrieve the complete file and path name of the given file.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getFileName(VoidPtr SFile);

    /**
     * Retrieve the last modification time of the given file.
     */
    @Generated
    @CFunction
    public static native long clang_getFileTime(VoidPtr SFile);

    /**
     * Retrieve the unique ID for the given \c file.
     * <p>
     * \param file the file to get the ID for.
     * \param outID stores the returned CXFileUniqueID.
     * \returns If there was a failure getting the unique ID, returns non-zero,
     * otherwise returns 0.
     */
    @Generated
    @CFunction
    public static native int clang_getFileUniqueID(VoidPtr file,
            @UncertainArgument("Options: reference, array Fallback: reference") CXFileUniqueID outID);

    /**
     * Determine whether the given header is guarded against
     * multiple inclusions, either with the conventional
     * \#ifndef/\#define/\#endif macro guards or with \#pragma once.
     */
    @Generated
    @CFunction
    public static native int clang_isFileMultipleIncludeGuarded(CXTranslationUnit tu, VoidPtr file);

    /**
     * Retrieve a file handle within the given translation unit.
     * <p>
     * \param tu the translation unit
     * <p>
     * \param file_name the name of the file.
     * <p>
     * \returns the file handle for the named file in the translation unit \p tu,
     * or a NULL file handle if the file was not a part of this translation unit.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getFile(CXTranslationUnit tu,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String file_name);

    /**
     * Retrieve a NULL (invalid) source location.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getNullLocation();

    /**
     * Determine whether two source locations, which must refer into
     * the same translation unit, refer to exactly the same point in the source
     * code.
     * <p>
     * \returns non-zero if the source locations refer to the same location, zero
     * if they refer to different locations.
     */
    @Generated
    @CFunction
    public static native int clang_equalLocations(@ByValue CXSourceLocation loc1, @ByValue CXSourceLocation loc2);

    /**
     * Retrieves the source location associated with a given file/line/column
     * in a particular translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getLocation(CXTranslationUnit tu, VoidPtr file, int line, int column);

    /**
     * Retrieves the source location associated with a given character offset
     * in a particular translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getLocationForOffset(CXTranslationUnit tu, VoidPtr file, int offset);

    /**
     * Returns non-zero if the given source location is in a system header.
     */
    @Generated
    @CFunction
    public static native int clang_Location_isInSystemHeader(@ByValue CXSourceLocation location);

    /**
     * Returns non-zero if the given source location is in the main file of
     * the corresponding translation unit.
     */
    @Generated
    @CFunction
    public static native int clang_Location_isFromMainFile(@ByValue CXSourceLocation location);

    /**
     * Retrieve a NULL (invalid) source range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getNullRange();

    /**
     * Retrieve a source range given the beginning and ending source
     * locations.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getRange(@ByValue CXSourceLocation begin, @ByValue CXSourceLocation end);

    /**
     * Determine whether two ranges are equivalent.
     * <p>
     * \returns non-zero if the ranges are the same, zero if they differ.
     */
    @Generated
    @CFunction
    public static native int clang_equalRanges(@ByValue CXSourceRange range1, @ByValue CXSourceRange range2);

    /**
     * Returns non-zero if \p range is null.
     */
    @Generated
    @CFunction
    public static native int clang_Range_isNull(@ByValue CXSourceRange range);

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     * <p>
     * If the location refers into a macro expansion, retrieves the
     * location of the macro expansion.
     * <p>
     * \param location the location within a source file that will be decomposed
     * into its parts.
     * <p>
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     * <p>
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     * <p>
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     * <p>
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    @Generated
    @CFunction
    public static native void clang_getExpansionLocation(@ByValue CXSourceLocation location, Ptr<VoidPtr> file,
            IntPtr line, IntPtr column, IntPtr offset);

    /**
     * Retrieve the file, line and column represented by the given source
     * location, as specified in a # line directive.
     * <p>
     * Example: given the following source code in a file somefile.c
     * <p>
     * \code
     * #123 "dummy.c" 1
     * <p>
     * static int func(void)
     * {
     * return 0;
     * }
     * \endcode
     * <p>
     * the location information returned by this function would be
     * <p>
     * File: dummy.c Line: 124 Column: 12
     * <p>
     * whereas clang_getExpansionLocation would have returned
     * <p>
     * File: somefile.c Line: 3 Column: 12
     * <p>
     * \param location the location within a source file that will be decomposed
     * into its parts.
     * <p>
     * \param filename [out] if non-NULL, will be set to the filename of the
     * source location. Note that filenames returned will be for "virtual" files,
     * which don't necessarily exist on the machine running clang - e.g. when
     * parsing preprocessed output obtained from a different environment. If
     * a non-NULL value is passed in, remember to dispose of the returned value
     * using \c clang_disposeString() once you've finished with it. For an invalid
     * source location, an empty string is returned.
     * <p>
     * \param line [out] if non-NULL, will be set to the line number of the
     * source location. For an invalid source location, zero is returned.
     * <p>
     * \param column [out] if non-NULL, will be set to the column number of the
     * source location. For an invalid source location, zero is returned.
     */
    @Generated
    @CFunction
    public static native void clang_getPresumedLocation(@ByValue CXSourceLocation location,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString filename, IntPtr line,
            IntPtr column);

    /**
     * Legacy API to retrieve the file, line, column, and offset represented
     * by the given source location.
     * <p>
     * This interface has been replaced by the newer interface
     * #clang_getExpansionLocation(). See that interface's documentation for
     * details.
     */
    @Generated
    @CFunction
    public static native void clang_getInstantiationLocation(@ByValue CXSourceLocation location, Ptr<VoidPtr> file,
            IntPtr line, IntPtr column, IntPtr offset);

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     * <p>
     * If the location refers into a macro instantiation, return where the
     * location was originally spelled in the source file.
     * <p>
     * \param location the location within a source file that will be decomposed
     * into its parts.
     * <p>
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     * <p>
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     * <p>
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     * <p>
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    @Generated
    @CFunction
    public static native void clang_getSpellingLocation(@ByValue CXSourceLocation location, Ptr<VoidPtr> file,
            IntPtr line, IntPtr column, IntPtr offset);

    /**
     * Retrieve the file, line, column, and offset represented by
     * the given source location.
     * <p>
     * If the location refers into a macro expansion, return where the macro was
     * expanded or where the macro argument was written, if the location points at
     * a macro argument.
     * <p>
     * \param location the location within a source file that will be decomposed
     * into its parts.
     * <p>
     * \param file [out] if non-NULL, will be set to the file to which the given
     * source location points.
     * <p>
     * \param line [out] if non-NULL, will be set to the line to which the given
     * source location points.
     * <p>
     * \param column [out] if non-NULL, will be set to the column to which the given
     * source location points.
     * <p>
     * \param offset [out] if non-NULL, will be set to the offset into the
     * buffer to which the given source location points.
     */
    @Generated
    @CFunction
    public static native void clang_getFileLocation(@ByValue CXSourceLocation location, Ptr<VoidPtr> file, IntPtr line,
            IntPtr column, IntPtr offset);

    /**
     * Retrieve a source location representing the first character within a
     * source range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getRangeStart(@ByValue CXSourceRange range);

    /**
     * Retrieve a source location representing the last character within a
     * source range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getRangeEnd(@ByValue CXSourceRange range);

    /**
     * Determine the number of diagnostics in a CXDiagnosticSet.
     */
    @Generated
    @CFunction
    public static native int clang_getNumDiagnosticsInSet(VoidPtr Diags);

    /**
     * Retrieve a diagnostic associated with the given CXDiagnosticSet.
     * <p>
     * \param Diags the CXDiagnosticSet to query.
     * \param Index the zero-based diagnostic number to retrieve.
     * <p>
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getDiagnosticInSet(VoidPtr Diags, int Index);

    /**
     * Deserialize a set of diagnostics from a Clang diagnostics bitcode
     * file.
     * <p>
     * \param file The name of the file to deserialize.
     * \param error A pointer to a enum value recording if there was a problem
     * deserializing the diagnostics.
     * \param errorString A pointer to a CXString for recording the error string
     * if the file was not successfully loaded.
     * <p>
     * \returns A loaded CXDiagnosticSet if successful, and NULL otherwise.  These
     * diagnostics should be released using clang_disposeDiagnosticSet().
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_loadDiagnostics(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String file,
            IntPtr error, @UncertainArgument("Options: reference, array Fallback: reference") CXString errorString);

    /**
     * Release a CXDiagnosticSet and all of its contained diagnostics.
     */
    @Generated
    @CFunction
    public static native void clang_disposeDiagnosticSet(VoidPtr Diags);

    /**
     * Retrieve the child diagnostics of a CXDiagnostic.
     * <p>
     * This CXDiagnosticSet does not need to be released by
     * clang_disposeDiagnosticSet.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getChildDiagnostics(VoidPtr D);

    /**
     * Determine the number of diagnostics produced for the given
     * translation unit.
     */
    @Generated
    @CFunction
    public static native int clang_getNumDiagnostics(CXTranslationUnit Unit);

    /**
     * Retrieve a diagnostic associated with the given translation unit.
     * <p>
     * \param Unit the translation unit to query.
     * \param Index the zero-based diagnostic number to retrieve.
     * <p>
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getDiagnostic(CXTranslationUnit Unit, int Index);

    /**
     * Retrieve the complete set of diagnostics associated with a
     * translation unit.
     * <p>
     * \param Unit the translation unit to query.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getDiagnosticSetFromTU(CXTranslationUnit Unit);

    /**
     * Destroy a diagnostic.
     */
    @Generated
    @CFunction
    public static native void clang_disposeDiagnostic(VoidPtr Diagnostic);

    /**
     * Format the given diagnostic in a manner that is suitable for display.
     * <p>
     * This routine will format the given diagnostic to a string, rendering
     * the diagnostic according to the various options given. The
     * \c clang_defaultDiagnosticDisplayOptions() function returns the set of
     * options that most closely mimics the behavior of the clang compiler.
     * <p>
     * \param Diagnostic The diagnostic to print.
     * <p>
     * \param Options A set of options that control the diagnostic display,
     * created by combining \c CXDiagnosticDisplayOptions values.
     * <p>
     * \returns A new string containing for formatted diagnostic.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_formatDiagnostic(VoidPtr Diagnostic, int Options);

    /**
     * Retrieve the set of display options most similar to the
     * default behavior of the clang compiler.
     * <p>
     * \returns A set of display options suitable for use with \c
     * clang_formatDiagnostic().
     */
    @Generated
    @CFunction
    public static native int clang_defaultDiagnosticDisplayOptions();

    /**
     * Determine the severity of the given diagnostic.
     */
    @Generated
    @CFunction
    public static native int clang_getDiagnosticSeverity(VoidPtr arg1);

    /**
     * Retrieve the source location of the given diagnostic.
     * <p>
     * This location is where Clang would print the caret ('^') when
     * displaying the diagnostic on the command line.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getDiagnosticLocation(VoidPtr arg1);

    /**
     * Retrieve the text of the given diagnostic.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getDiagnosticSpelling(VoidPtr arg1);

    /**
     * Retrieve the name of the command-line option that enabled this
     * diagnostic.
     * <p>
     * \param Diag The diagnostic to be queried.
     * <p>
     * \param Disable If non-NULL, will be set to the option that disables this
     * diagnostic (if any).
     * <p>
     * \returns A string that contains the command-line option used to enable this
     * warning, such as "-Wconversion" or "-pedantic".
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getDiagnosticOption(VoidPtr Diag,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString Disable);

    /**
     * Retrieve the category number for this diagnostic.
     * <p>
     * Diagnostics can be categorized into groups along with other, related
     * diagnostics (e.g., diagnostics under the same warning flag). This routine
     * retrieves the category number for the given diagnostic.
     * <p>
     * \returns The number of the category that contains this diagnostic, or zero
     * if this diagnostic is uncategorized.
     */
    @Generated
    @CFunction
    public static native int clang_getDiagnosticCategory(VoidPtr arg1);

    /**
     * Retrieve the name of a particular diagnostic category.  This
     * is now deprecated.  Use clang_getDiagnosticCategoryText()
     * instead.
     * <p>
     * \param Category A diagnostic category number, as returned by
     * \c clang_getDiagnosticCategory().
     * <p>
     * \returns The name of the given diagnostic category.
     */
    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CXString clang_getDiagnosticCategoryName(int Category);

    /**
     * Retrieve the diagnostic category text for a given diagnostic.
     * <p>
     * \returns The text of the given diagnostic category.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getDiagnosticCategoryText(VoidPtr arg1);

    /**
     * Determine the number of source ranges associated with the given
     * diagnostic.
     */
    @Generated
    @CFunction
    public static native int clang_getDiagnosticNumRanges(VoidPtr arg1);

    /**
     * Retrieve a source range associated with the diagnostic.
     * <p>
     * A diagnostic's source ranges highlight important elements in the source
     * code. On the command line, Clang displays source ranges by
     * underlining them with '~' characters.
     * <p>
     * \param Diagnostic the diagnostic whose range is being extracted.
     * <p>
     * \param Range the zero-based index specifying which range to
     * <p>
     * \returns the requested source range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getDiagnosticRange(VoidPtr Diagnostic, int Range);

    /**
     * Determine the number of fix-it hints associated with the
     * given diagnostic.
     */
    @Generated
    @CFunction
    public static native int clang_getDiagnosticNumFixIts(VoidPtr Diagnostic);

    /**
     * Retrieve the replacement information for a given fix-it.
     * <p>
     * Fix-its are described in terms of a source range whose contents
     * should be replaced by a string. This approach generalizes over
     * three kinds of operations: removal of source code (the range covers
     * the code to be removed and the replacement string is empty),
     * replacement of source code (the range covers the code to be
     * replaced and the replacement string provides the new code), and
     * insertion (both the start and end of the range point at the
     * insertion location, and the replacement string provides the text to
     * insert).
     * <p>
     * \param Diagnostic The diagnostic whose fix-its are being queried.
     * <p>
     * \param FixIt The zero-based index of the fix-it.
     * <p>
     * \param ReplacementRange The source range whose contents will be
     * replaced with the returned replacement string. Note that source
     * ranges are half-open ranges [a, b), so the source code should be
     * replaced from a and up to (but not including) b.
     * <p>
     * \returns A string containing text that should be replace the source
     * code indicated by the \c ReplacementRange.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getDiagnosticFixIt(VoidPtr Diagnostic, int FixIt,
            @UncertainArgument("Options: reference, array Fallback: reference") CXSourceRange ReplacementRange);

    /**
     * Get the original translation unit source file name.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getTranslationUnitSpelling(CXTranslationUnit CTUnit);

    /**
     * Return the CXTranslationUnit for a given source file and the provided
     * command line arguments one would pass to the compiler.
     * <p>
     * Note: The 'source_filename' argument is optional.  If the caller provides a
     * NULL pointer, the name of the source file is expected to reside in the
     * specified command line arguments.
     * <p>
     * Note: When encountered in 'clang_command_line_args', the following options
     * are ignored:
     * <p>
     * '-c'
     * '-emit-ast'
     * '-fsyntax-only'
     * '-o \<output file>'  (both '-o' and '\<output file>' are ignored)
     * <p>
     * \param CIdx The index object with which the translation unit will be
     * associated.
     * <p>
     * \param source_filename The name of the source file to load, or NULL if the
     * source file is included in \p clang_command_line_args.
     * <p>
     * \param num_clang_command_line_args The number of command-line arguments in
     * \p clang_command_line_args.
     * <p>
     * \param clang_command_line_args The command-line arguments that would be
     * passed to the \c clang executable if it were being invoked out-of-process.
     * These command-line options will be parsed and will affect how the translation
     * unit is parsed. Note that the following options are ignored: '-c',
     * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
     * <p>
     * \param num_unsaved_files the number of unsaved file entries in \p
     * unsaved_files.
     * <p>
     * \param unsaved_files the files that have not yet been saved to disk
     * but may be required for code completion, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     */
    @Generated
    @CFunction
    public static native CXTranslationUnit clang_createTranslationUnitFromSourceFile(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            int num_clang_command_line_args,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] clang_command_line_args,
            int num_unsaved_files,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files);

    /**
     * Same as \c clang_createTranslationUnit2, but returns
     * the \c CXTranslationUnit instead of an error code.  In case of an error this
     * routine returns a \c NULL \c CXTranslationUnit, without further detailed
     * error codes.
     */
    @Generated
    @CFunction
    public static native CXTranslationUnit clang_createTranslationUnit(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ast_filename);

    /**
     * Returns the set of flags that is suitable for parsing a translation
     * unit that is being edited.
     * <p>
     * The set of flags returned provide options for \c clang_parseTranslationUnit()
     * to indicate that the translation unit is likely to be reparsed many times,
     * either explicitly (via \c clang_reparseTranslationUnit()) or implicitly
     * (e.g., by code completion (\c clang_codeCompletionAt())). The returned flag
     * set contains an unspecified set of optimizations (e.g., the precompiled
     * preamble) geared toward improving the performance of these routines. The
     * set of optimizations enabled may change from one version to the next.
     */
    @Generated
    @CFunction
    public static native int clang_defaultEditingTranslationUnitOptions();

    /**
     * Same as \c clang_parseTranslationUnit2, but returns
     * the \c CXTranslationUnit instead of an error code.  In case of an error this
     * routine returns a \c NULL \c CXTranslationUnit, without further detailed
     * error codes.
     */
    @Generated
    @CFunction
    public static native CXTranslationUnit clang_parseTranslationUnit(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
            int num_command_line_args,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, int options);

    /**
     * Returns the set of flags that is suitable for saving a translation
     * unit.
     * <p>
     * The set of flags returned provide options for
     * \c clang_saveTranslationUnit() by default. The returned flag
     * set contains an unspecified set of options that save translation units with
     * the most commonly-requested data.
     */
    @Generated
    @CFunction
    public static native int clang_defaultSaveOptions(CXTranslationUnit TU);

    /**
     * Saves a translation unit into a serialized representation of
     * that translation unit on disk.
     * <p>
     * Any translation unit that was parsed without error can be saved
     * into a file. The translation unit can then be deserialized into a
     * new \c CXTranslationUnit with \c clang_createTranslationUnit() or,
     * if it is an incomplete translation unit that corresponds to a
     * header, used as a precompiled header when parsing other translation
     * units.
     * <p>
     * \param TU The translation unit to save.
     * <p>
     * \param FileName The file to which the translation unit will be saved.
     * <p>
     * \param options A bitmask of options that affects how the translation unit
     * is saved. This should be a bitwise OR of the
     * CXSaveTranslationUnit_XXX flags.
     * <p>
     * \returns A value that will match one of the enumerators of the CXSaveError
     * enumeration. Zero (CXSaveError_None) indicates that the translation unit was
     * saved successfully, while a non-zero value indicates that a problem occurred.
     */
    @Generated
    @CFunction
    public static native int clang_saveTranslationUnit(CXTranslationUnit TU,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String FileName,
            int options);

    /**
     * Destroy the specified CXTranslationUnit object.
     */
    @Generated
    @CFunction
    public static native void clang_disposeTranslationUnit(CXTranslationUnit arg1);

    /**
     * Returns the set of flags that is suitable for reparsing a translation
     * unit.
     * <p>
     * The set of flags returned provide options for
     * \c clang_reparseTranslationUnit() by default. The returned flag
     * set contains an unspecified set of optimizations geared toward common uses
     * of reparsing. The set of optimizations enabled may change from one version
     * to the next.
     */
    @Generated
    @CFunction
    public static native int clang_defaultReparseOptions(CXTranslationUnit TU);

    /**
     * Reparse the source files that produced this translation unit.
     * <p>
     * This routine can be used to re-parse the source files that originally
     * created the given translation unit, for example because those source files
     * have changed (either on disk or as passed via \p unsaved_files). The
     * source code will be reparsed with the same command-line options as it
     * was originally parsed.
     * <p>
     * Reparsing a translation unit invalidates all cursors and source locations
     * that refer into that translation unit. This makes reparsing a translation
     * unit semantically equivalent to destroying the translation unit and then
     * creating a new translation unit with the same command-line arguments.
     * However, it may be more efficient to reparse a translation
     * unit using this routine.
     * <p>
     * \param TU The translation unit whose contents will be re-parsed. The
     * translation unit must originally have been built with
     * \c clang_createTranslationUnitFromSourceFile().
     * <p>
     * \param num_unsaved_files The number of unsaved file entries in \p
     * unsaved_files.
     * <p>
     * \param unsaved_files The files that have not yet been saved to disk
     * but may be required for parsing, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     * <p>
     * \param options A bitset of options composed of the flags in CXReparse_Flags.
     * The function \c clang_defaultReparseOptions() produces a default set of
     * options recommended for most uses, based on the translation unit.
     * <p>
     * \returns 0 if the sources could be reparsed.  A non-zero error code will be
     * returned if reparsing was impossible, such that the translation unit is
     * invalid. In such cases, the only valid call for \c TU is
     * \c clang_disposeTranslationUnit(TU).  The error codes returned by this
     * routine are described by the \c CXErrorCode enum.
     */
    @Generated
    @CFunction
    public static native int clang_reparseTranslationUnit(CXTranslationUnit TU, int num_unsaved_files,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int options);

    /**
     * Returns the human-readable null-terminated C string that represents
     * the name of the memory category.  This string should never be freed.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String clang_getTUResourceUsageName(int kind);

    /**
     * Return the memory usage of a translation unit.  This object
     * should be released with clang_disposeCXTUResourceUsage().
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXTUResourceUsage clang_getCXTUResourceUsage(CXTranslationUnit TU);

    @Generated
    @CFunction
    public static native void clang_disposeCXTUResourceUsage(@ByValue CXTUResourceUsage usage);

    /**
     * Retrieve the NULL cursor, which represents no entity.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getNullCursor();

    /**
     * Retrieve the cursor that represents the given translation unit.
     * <p>
     * The translation unit cursor can be used to start traversing the
     * various declarations within the given translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getTranslationUnitCursor(CXTranslationUnit arg1);

    /**
     * Determine whether two cursors are equivalent.
     */
    @Generated
    @CFunction
    public static native int clang_equalCursors(@ByValue CXCursor arg1, @ByValue CXCursor arg2);

    /**
     * Returns non-zero if \p cursor is null.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isNull(@ByValue CXCursor cursor);

    /**
     * Compute a hash value for the given cursor.
     */
    @Generated
    @CFunction
    public static native int clang_hashCursor(@ByValue CXCursor arg1);

    /**
     * Retrieve the kind of the given cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorKind(@ByValue CXCursor arg1);

    /**
     * Determine whether the given cursor kind represents a declaration.
     */
    @Generated
    @CFunction
    public static native int clang_isDeclaration(int arg1);

    /**
     * Determine whether the given cursor kind represents a simple
     * reference.
     * <p>
     * Note that other kinds of cursors (such as expressions) can also refer to
     * other cursors. Use clang_getCursorReferenced() to determine whether a
     * particular cursor refers to another entity.
     */
    @Generated
    @CFunction
    public static native int clang_isReference(int arg1);

    /**
     * Determine whether the given cursor kind represents an expression.
     */
    @Generated
    @CFunction
    public static native int clang_isExpression(int arg1);

    /**
     * Determine whether the given cursor kind represents a statement.
     */
    @Generated
    @CFunction
    public static native int clang_isStatement(int arg1);

    /**
     * Determine whether the given cursor kind represents an attribute.
     */
    @Generated
    @CFunction
    public static native int clang_isAttribute(int arg1);

    /**
     * Determine whether the given cursor kind represents an invalid
     * cursor.
     */
    @Generated
    @CFunction
    public static native int clang_isInvalid(int arg1);

    /**
     * Determine whether the given cursor kind represents a translation
     * unit.
     */
    @Generated
    @CFunction
    public static native int clang_isTranslationUnit(int arg1);

    /**
     * Determine whether the given cursor represents a preprocessing
     * element, such as a preprocessor directive or macro instantiation.
     */
    @Generated
    @CFunction
    public static native int clang_isPreprocessing(int arg1);

    /**
     * Determine whether the given cursor represents a currently
     * unexposed piece of the AST (e.g., CXCursor_UnexposedStmt).
     */
    @Generated
    @CFunction
    public static native int clang_isUnexposed(int arg1);

    /**
     * Determine the linkage of the entity referred to by a given cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorLinkage(@ByValue CXCursor cursor);

    /**
     * Determine the availability of the entity that this cursor refers to,
     * taking the current target platform into account.
     * <p>
     * \param cursor The cursor to query.
     * <p>
     * \returns The availability of the cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorAvailability(@ByValue CXCursor cursor);

    /**
     * Determine the availability of the entity that this cursor refers to
     * on any platforms for which availability information is known.
     * <p>
     * \param cursor The cursor to query.
     * <p>
     * \param always_deprecated If non-NULL, will be set to indicate whether the
     * entity is deprecated on all platforms.
     * <p>
     * \param deprecated_message If non-NULL, will be set to the message text
     * provided along with the unconditional deprecation of this entity. The client
     * is responsible for deallocating this string.
     * <p>
     * \param always_unavailable If non-NULL, will be set to indicate whether the
     * entity is unavailable on all platforms.
     * <p>
     * \param unavailable_message If non-NULL, will be set to the message text
     * provided along with the unconditional unavailability of this entity. The
     * client is responsible for deallocating this string.
     * <p>
     * \param availability If non-NULL, an array of CXPlatformAvailability instances
     * that will be populated with platform availability information, up to either
     * the number of platforms for which availability information is available (as
     * returned by this function) or \c availability_size, whichever is smaller.
     * <p>
     * \param availability_size The number of elements available in the
     * \c availability array.
     * <p>
     * \returns The number of platforms (N) for which availability information is
     * available (which is unrelated to \c availability_size).
     * <p>
     * Note that the client is responsible for calling
     * \c clang_disposeCXPlatformAvailability to free each of the
     * platform-availability structures returned. There are
     * \c min(N, availability_size) such structures.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorPlatformAvailability(@ByValue CXCursor cursor, IntPtr always_deprecated,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString deprecated_message,
            IntPtr always_unavailable,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString unavailable_message,
            Ptr<CXPlatformAvailability> availability,
            int availability_size);

    /**
     * Free the memory associated with a \c CXPlatformAvailability structure.
     */
    @Generated
    @CFunction
    public static native void clang_disposeCXPlatformAvailability(
            Ptr<CXPlatformAvailability> availability);

    /**
     * Determine the "language" of the entity referred to by a given cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorLanguage(@ByValue CXCursor cursor);

    /**
     * Returns the translation unit that a cursor originated from.
     */
    @Generated
    @CFunction
    public static native CXTranslationUnit clang_Cursor_getTranslationUnit(@ByValue CXCursor arg1);

    /**
     * Creates an empty CXCursorSet.
     */
    @Generated
    @CFunction
    public static native CXCursorSet clang_createCXCursorSet();

    /**
     * Disposes a CXCursorSet and releases its associated memory.
     */
    @Generated
    @CFunction
    public static native void clang_disposeCXCursorSet(CXCursorSet cset);

    /**
     * Queries a CXCursorSet to see if it contains a specific CXCursor.
     * <p>
     * \returns non-zero if the set contains the specified cursor.
     */
    @Generated
    @CFunction
    public static native int clang_CXCursorSet_contains(CXCursorSet cset, @ByValue CXCursor cursor);

    /**
     * Inserts a CXCursor into a CXCursorSet.
     * <p>
     * \returns zero if the CXCursor was already in the set, and non-zero otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_CXCursorSet_insert(CXCursorSet cset, @ByValue CXCursor cursor);

    /**
     * Determine the semantic parent of the given cursor.
     * <p>
     * The semantic parent of a cursor is the cursor that semantically contains
     * the given \p cursor. For many declarations, the lexical and semantic parents
     * are equivalent (the lexical parent is returned by
     * \c clang_getCursorLexicalParent()). They diverge when declarations or
     * definitions are provided out-of-line. For example:
     * <p>
     * \code
     * class C {
     * void f();
     * };
     * <p>
     * void C::f() { }
     * \endcode
     * <p>
     * In the out-of-line definition of \c C::f, the semantic parent is
     * the class \c C, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this
     * case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics
     * of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration,
     * on the other hand, can have a major impact on semantics, and redeclarations
     * of a particular entity should all have the same semantic context.
     * <p>
     * In the example above, both declarations of \c C::f have \c C as their
     * semantic context, while the lexical context of the first \c C::f is \c C
     * and the lexical context of the second \c C::f is the translation unit.
     * <p>
     * For global declarations, the semantic parent is the translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCursorSemanticParent(@ByValue CXCursor cursor);

    /**
     * Determine the lexical parent of the given cursor.
     * <p>
     * The lexical parent of a cursor is the cursor in which the given \p cursor
     * was actually written. For many declarations, the lexical and semantic parents
     * are equivalent (the semantic parent is returned by
     * \c clang_getCursorSemanticParent()). They diverge when declarations or
     * definitions are provided out-of-line. For example:
     * <p>
     * \code
     * class C {
     * void f();
     * };
     * <p>
     * void C::f() { }
     * \endcode
     * <p>
     * In the out-of-line definition of \c C::f, the semantic parent is
     * the class \c C, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this
     * case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics
     * of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration,
     * on the other hand, can have a major impact on semantics, and redeclarations
     * of a particular entity should all have the same semantic context.
     * <p>
     * In the example above, both declarations of \c C::f have \c C as their
     * semantic context, while the lexical context of the first \c C::f is \c C
     * and the lexical context of the second \c C::f is the translation unit.
     * <p>
     * For declarations written in the global scope, the lexical parent is
     * the translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCursorLexicalParent(@ByValue CXCursor cursor);

    /**
     * Determine the set of methods that are overridden by the given
     * method.
     * <p>
     * In both Objective-C and C++, a method (aka virtual member function,
     * in C++) can override a virtual method in a base class. For
     * Objective-C, a method is said to override any method in the class's
     * base class, its protocols, or its categories' protocols, that has the same
     * selector and is of the same kind (class or instance).
     * If no such method exists, the search continues to the class's superclass,
     * its protocols, and its categories, and so on. A method from an Objective-C
     * implementation is considered to override the same methods as its
     * corresponding method in the interface.
     * <p>
     * For C++, a virtual member function overrides any virtual member
     * function with the same signature that occurs in its base
     * classes. With multiple inheritance, a virtual member function can
     * override several virtual member functions coming from different
     * base classes.
     * <p>
     * In all cases, this function determines the immediate overridden
     * method, rather than all of the overridden methods. For example, if
     * a method is originally declared in a class A, then overridden in B
     * (which in inherits from A) and also in C (which inherited from B),
     * then the only overridden method returned from this function when
     * invoked on C's method will be B's method. The client may then
     * invoke this function again, given the previously-found overridden
     * methods, to map out the complete method-override set.
     * <p>
     * \param cursor A cursor representing an Objective-C or C++
     * method. This routine will compute the set of methods that this
     * method overrides.
     * <p>
     * \param overridden A pointer whose pointee will be replaced with a
     * pointer to an array of cursors, representing the set of overridden
     * methods. If there are no overridden methods, the pointee will be
     * set to NULL. The pointee must be freed via a call to
     * \c clang_disposeOverriddenCursors().
     * <p>
     * \param num_overridden A pointer to the number of overridden
     * functions, will be set to the number of overridden functions in the
     * array pointed to by \p overridden.
     */
    @Generated
    @CFunction
    public static native void clang_getOverriddenCursors(@ByValue CXCursor cursor, Ptr<Ptr<CXCursor>> overridden,
            IntPtr num_overridden);

    /**
     * Free the set of overridden cursors returned by \c
     * clang_getOverriddenCursors().
     */
    @Generated
    @CFunction
    public static native void clang_disposeOverriddenCursors(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCursor overridden);

    /**
     * Retrieve the file that is included by the given inclusion directive
     * cursor.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getIncludedFile(@ByValue CXCursor cursor);

    /**
     * Map a source location to the cursor that describes the entity at that
     * location in the source code.
     * <p>
     * clang_getCursor() maps an arbitrary source location within a translation
     * unit down to the most specific cursor that describes the entity at that
     * location. For example, given an expression \c x + y, invoking
     * clang_getCursor() with a source location pointing to "x" will return the
     * cursor for "x"; similarly for "y". If the cursor points anywhere between
     * "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
     * will return a cursor referring to the "+" expression.
     * <p>
     * \returns a cursor representing the entity at the given source location, or
     * a NULL cursor if no such entity can be found.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCursor(CXTranslationUnit arg1, @ByValue CXSourceLocation arg2);

    /**
     * Retrieve the physical location of the source constructor referenced
     * by the given cursor.
     * <p>
     * The location of a declaration is typically the location of the name of that
     * declaration, where the name of that declaration would occur if it is
     * unnamed, or some keyword that introduces that particular declaration.
     * The location of a reference is where that reference occurs within the
     * source code.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getCursorLocation(@ByValue CXCursor arg1);

    /**
     * Retrieve the physical extent of the source construct referenced by
     * the given cursor.
     * <p>
     * The extent of a cursor starts with the file/line/column pointing at the
     * first character within the source construct that the cursor refers to and
     * ends with the last character within that source construct. For a
     * declaration, the extent covers the declaration itself. For a reference,
     * the extent covers the location of the reference (e.g., where the referenced
     * entity was actually used).
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getCursorExtent(@ByValue CXCursor arg1);

    /**
     * Retrieve the type of a CXCursor (if any).
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getCursorType(@ByValue CXCursor C);

    /**
     * Pretty-print the underlying type using the rules of the
     * language of the translation unit from which it came.
     * <p>
     * If the type is invalid, an empty string is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getTypeSpelling(@ByValue CXType CT);

    /**
     * Retrieve the underlying type of a typedef declaration.
     * <p>
     * If the cursor does not reference a typedef declaration, an invalid type is
     * returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getTypedefDeclUnderlyingType(@ByValue CXCursor C);

    /**
     * Retrieve the integer type of an enum declaration.
     * <p>
     * If the cursor does not reference an enum declaration, an invalid type is
     * returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getEnumDeclIntegerType(@ByValue CXCursor C);

    /**
     * Retrieve the integer value of an enum constant declaration as a signed
     * long long.
     * <p>
     * If the cursor does not reference an enum constant declaration, LLONG_MIN is
     * returned. Since this is also potentially a valid constant value, the kind of
     * the cursor must be verified before calling this function.
     */
    @Generated
    @CFunction
    public static native long clang_getEnumConstantDeclValue(@ByValue CXCursor C);

    /**
     * Retrieve the integer value of an enum constant declaration as an unsigned
     * long long.
     * <p>
     * If the cursor does not reference an enum constant declaration, ULLONG_MAX is
     * returned. Since this is also potentially a valid constant value, the kind of
     * the cursor must be verified before calling this function.
     */
    @Generated
    @CFunction
    public static native long clang_getEnumConstantDeclUnsignedValue(@ByValue CXCursor C);

    /**
     * Retrieve the bit width of a bit field declaration as an integer.
     * <p>
     * If a cursor that is not a bit field declaration is passed in, -1 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_getFieldDeclBitWidth(@ByValue CXCursor C);

    /**
     * Retrieve the number of non-variadic arguments associated with a given
     * cursor.
     * <p>
     * The number of arguments can be determined for calls as well as for
     * declarations of functions or methods. For other cursors -1 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getNumArguments(@ByValue CXCursor C);

    /**
     * Retrieve the argument cursor of a function or method.
     * <p>
     * The argument cursor can be determined for calls as well as for declarations
     * of functions or methods. For other cursors and for invalid indices, an
     * invalid cursor is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_Cursor_getArgument(@ByValue CXCursor C, int i);

    /**
     * Determine whether two CXTypes represent the same type.
     * <p>
     * \returns non-zero if the CXTypes represent the same type and
     * zero otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_equalTypes(@ByValue CXType A, @ByValue CXType B);

    /**
     * Return the canonical type for a CXType.
     * <p>
     * Clang's type system explicitly models typedefs and all the ways
     * a specific type can be represented.  The canonical type is the underlying
     * type with all the "sugar" removed.  For example, if 'T' is a typedef
     * for 'int', the canonical type for 'T' would be 'int'.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getCanonicalType(@ByValue CXType T);

    /**
     * Determine whether a CXType has the "const" qualifier set,
     * without looking through typedefs that may have added "const" at a
     * different level.
     */
    @Generated
    @CFunction
    public static native int clang_isConstQualifiedType(@ByValue CXType T);

    /**
     * Determine whether a CXType has the "volatile" qualifier set,
     * without looking through typedefs that may have added "volatile" at
     * a different level.
     */
    @Generated
    @CFunction
    public static native int clang_isVolatileQualifiedType(@ByValue CXType T);

    /**
     * Determine whether a CXType has the "restrict" qualifier set,
     * without looking through typedefs that may have added "restrict" at a
     * different level.
     */
    @Generated
    @CFunction
    public static native int clang_isRestrictQualifiedType(@ByValue CXType T);

    /**
     * For pointer types, returns the type of the pointee.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getPointeeType(@ByValue CXType T);

    /**
     * Return the cursor for the declaration of the given type.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getTypeDeclaration(@ByValue CXType T);

    /**
     * Returns the Objective-C type encoding for the specified declaration.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getDeclObjCTypeEncoding(@ByValue CXCursor C);

    /**
     * Retrieve the spelling of a given CXTypeKind.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getTypeKindSpelling(int K);

    /**
     * Retrieve the calling convention associated with a function type.
     * <p>
     * If a non-function type is passed in, CXCallingConv_Invalid is returned.
     */
    @Generated
    @CFunction
    public static native int clang_getFunctionTypeCallingConv(@ByValue CXType T);

    /**
     * Retrieve the return type associated with a function type.
     * <p>
     * If a non-function type is passed in, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getResultType(@ByValue CXType T);

    /**
     * Retrieve the number of non-variadic parameters associated with a
     * function type.
     * <p>
     * If a non-function type is passed in, -1 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_getNumArgTypes(@ByValue CXType T);

    /**
     * Retrieve the type of a parameter of a function type.
     * <p>
     * If a non-function type is passed in or the function does not have enough
     * parameters, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getArgType(@ByValue CXType T, int i);

    /**
     * Return 1 if the CXType is a variadic function type, and 0 otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_isFunctionTypeVariadic(@ByValue CXType T);

    /**
     * Retrieve the return type associated with a given cursor.
     * <p>
     * This only returns a valid type if the cursor refers to a function or method.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getCursorResultType(@ByValue CXCursor C);

    /**
     * Return 1 if the CXType is a POD (plain old data) type, and 0
     * otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_isPODType(@ByValue CXType T);

    /**
     * Return the element type of an array, complex, or vector type.
     * <p>
     * If a type is passed in that is not an array, complex, or vector type,
     * an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getElementType(@ByValue CXType T);

    /**
     * Return the number of elements of an array or vector type.
     * <p>
     * If a type is passed in that is not an array or vector type,
     * -1 is returned.
     */
    @Generated
    @CFunction
    public static native long clang_getNumElements(@ByValue CXType T);

    /**
     * Return the element type of an array type.
     * <p>
     * If a non-array type is passed in, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getArrayElementType(@ByValue CXType T);

    /**
     * Return the array size of a constant array.
     * <p>
     * If a non-array type is passed in, -1 is returned.
     */
    @Generated
    @CFunction
    public static native long clang_getArraySize(@ByValue CXType T);

    /**
     * Retrieve the type named by the qualified-id.
     * <p>
     * If a non-elaborated type is passed in, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getNamedType(@ByValue CXType T);

    /**
     * Return the alignment of a type in bytes as per C++[expr.alignof]
     * standard.
     * <p>
     * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
     * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
     * is returned.
     * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
     * returned.
     * If the type declaration is not a constant size type,
     * CXTypeLayoutError_NotConstantSize is returned.
     */
    @Generated
    @CFunction
    public static native long clang_Type_getAlignOf(@ByValue CXType T);

    /**
     * Return the class type of an member pointer type.
     * <p>
     * If a non-member-pointer type is passed in, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getClassType(@ByValue CXType T);

    /**
     * Return the size of a type in bytes as per C++[expr.sizeof] standard.
     * <p>
     * If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
     * If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
     * is returned.
     * If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
     * returned.
     */
    @Generated
    @CFunction
    public static native long clang_Type_getSizeOf(@ByValue CXType T);

    /**
     * Return the offset of a field named S in a record of type T in bits
     * as it would be returned by __offsetof__ as per C++11[18.2p4]
     * <p>
     * If the cursor is not a record field declaration, CXTypeLayoutError_Invalid
     * is returned.
     * If the field's type declaration is an incomplete type,
     * CXTypeLayoutError_Incomplete is returned.
     * If the field's type declaration is a dependent type,
     * CXTypeLayoutError_Dependent is returned.
     * If the field's name S is not found,
     * CXTypeLayoutError_InvalidFieldName is returned.
     */
    @Generated
    @CFunction
    public static native long clang_Type_getOffsetOf(@ByValue CXType T,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String S);

    /**
     * Retrieve the ref-qualifier kind of a function or method.
     * <p>
     * The ref-qualifier is returned for C++ functions or methods. For other types
     * or non-C++ declarations, CXRefQualifier_None is returned.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getCXXRefQualifier(@ByValue CXType T);

    /**
     * Returns non-zero if the cursor specifies a Record member that is a
     * bitfield.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isBitField(@ByValue CXCursor C);

    /**
     * Returns 1 if the base class specified by the cursor with kind
     * CX_CXXBaseSpecifier is virtual.
     */
    @Generated
    @CFunction
    public static native int clang_isVirtualBase(@ByValue CXCursor arg1);

    /**
     * Returns the access control level for the referenced object.
     * <p>
     * If the cursor refers to a C++ declaration, its access control level within
     * its parent scope is returned. Otherwise, if the cursor refers to a base
     * specifier or access specifier, the specifier itself is returned.
     */
    @Generated
    @CFunction
    public static native int clang_getCXXAccessSpecifier(@ByValue CXCursor arg1);

    /**
     * Determine the number of overloaded declarations referenced by a
     * \c CXCursor_OverloadedDeclRef cursor.
     * <p>
     * \param cursor The cursor whose overloaded declarations are being queried.
     * <p>
     * \returns The number of overloaded declarations referenced by \c cursor. If it
     * is not a \c CXCursor_OverloadedDeclRef cursor, returns 0.
     */
    @Generated
    @CFunction
    public static native int clang_getNumOverloadedDecls(@ByValue CXCursor cursor);

    /**
     * Retrieve a cursor for one of the overloaded declarations referenced
     * by a \c CXCursor_OverloadedDeclRef cursor.
     * <p>
     * \param cursor The cursor whose overloaded declarations are being queried.
     * <p>
     * \param index The zero-based index into the set of overloaded declarations in
     * the cursor.
     * <p>
     * \returns A cursor representing the declaration referenced by the given
     * \c cursor at the specified \c index. If the cursor does not have an
     * associated set of overloaded declarations, or if the index is out of bounds,
     * returns \c clang_getNullCursor();
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getOverloadedDecl(@ByValue CXCursor cursor, int index);

    /**
     * For cursors representing an iboutletcollection attribute,
     * this function returns the collection element type.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getIBOutletCollectionType(@ByValue CXCursor arg1);

    /**
     * Visit the children of a particular cursor.
     * <p>
     * This function visits all the direct children of the given cursor,
     * invoking the given \p visitor function with the cursors of each
     * visited child. The traversal may be recursive, if the visitor returns
     * \c CXChildVisit_Recurse. The traversal may also be ended prematurely, if
     * the visitor returns \c CXChildVisit_Break.
     * <p>
     * \param parent the cursor whose child may be visited. All kinds of
     * cursors can be visited, including invalid cursors (which, by
     * definition, have no children).
     * <p>
     * \param visitor the visitor function that will be invoked for each
     * child of \p parent.
     * <p>
     * \param client_data pointer data supplied by the client, which will
     * be passed to the visitor each time it is invoked.
     * <p>
     * \returns a non-zero value if the traversal was terminated
     * prematurely by the visitor returning \c CXChildVisit_Break.
     */
    @Generated
    @CFunction
    public static native int clang_visitChildren(@ByValue CXCursor parent,
            @FunctionPtr(name = "call_clang_visitChildren") Function_clang_visitChildren visitor, VoidPtr client_data);

    /**
     * Visits the children of a cursor using the specified block.  Behaves
     * identically to clang_visitChildren() in all other respects.
     */
    @Generated
    @CFunction
    public static native int clang_visitChildrenWithBlock(@ByValue CXCursor parent,
            @ObjCBlock(name = "call_clang_visitChildrenWithBlock") Block_clang_visitChildrenWithBlock block);

    /**
     * Retrieve a Unified Symbol Resolution (USR) for the entity referenced
     * by the given cursor.
     * <p>
     * A Unified Symbol Resolution (USR) is a string that identifies a particular
     * entity (function, class, variable, etc.) within a program. USRs can be
     * compared across translation units to determine, e.g., when references in
     * one translation refer to an entity defined in another translation unit.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCursorUSR(@ByValue CXCursor arg1);

    /**
     * Construct a USR for a specified Objective-C class.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCClass(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String class_name);

    /**
     * Construct a USR for a specified Objective-C category.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCCategory(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String class_name,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category_name);

    /**
     * Construct a USR for a specified Objective-C protocol.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCProtocol(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String protocol_name);

    /**
     * Construct a USR for a specified Objective-C instance variable and
     * the USR for its containing class.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCIvar(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @ByValue CXString classUSR);

    /**
     * Construct a USR for a specified Objective-C method and
     * the USR for its containing class.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCMethod(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            int isInstanceMethod, @ByValue CXString classUSR);

    /**
     * Construct a USR for a specified Objective-C property and the USR
     * for its containing class.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_constructUSR_ObjCProperty(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String property,
            @ByValue CXString classUSR);

    /**
     * Retrieve a name for the entity referenced by this cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCursorSpelling(@ByValue CXCursor arg1);

    /**
     * Retrieve a range for a piece that forms the cursors spelling name.
     * Most of the times there is only one range for the complete spelling but for
     * Objective-C methods and Objective-C message expressions, there are multiple
     * pieces for each selector identifier.
     * <p>
     * \param pieceIndex the index of the spelling name piece. If this is greater
     * than the actual number of pieces, it will return a NULL (invalid) range.
     * <p>
     * \param options Reserved.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_Cursor_getSpellingNameRange(@ByValue CXCursor arg1, int pieceIndex,
            int options);

    /**
     * Retrieve the display name for the entity referenced by this cursor.
     * <p>
     * The display name contains extra information that helps identify the cursor,
     * such as the parameters of a function or template or the arguments of a
     * class template specialization.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCursorDisplayName(@ByValue CXCursor arg1);

    /**
     * For a cursor that is a reference, retrieve a cursor representing the
     * entity that it references.
     * <p>
     * Reference cursors refer to other entities in the AST. For example, an
     * Objective-C superclass reference cursor refers to an Objective-C class.
     * This function produces the cursor for the Objective-C class from the
     * cursor for the superclass reference. If the input cursor is a declaration or
     * definition, it returns that declaration or definition unchanged.
     * Otherwise, returns the NULL cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCursorReferenced(@ByValue CXCursor arg1);

    /**
     * For a cursor that is either a reference to or a declaration
     * of some entity, retrieve a cursor that describes the definition of
     * that entity.
     * <p>
     * Some entities can be declared multiple times within a translation
     * unit, but only one of those declarations can also be a
     * definition. For example, given:
     * <p>
     * \code
     * int f(int, int);
     * int g(int x, int y) { return f(x, y); }
     * int f(int a, int b) { return a + b; }
     * int f(int, int);
     * \endcode
     * <p>
     * there are three declarations of the function "f", but only the
     * second one is a definition. The clang_getCursorDefinition()
     * function will take any cursor pointing to a declaration of "f"
     * (the first or fourth lines of the example) or a cursor referenced
     * that uses "f" (the call to "f' inside "g") and will return a
     * declaration cursor pointing to the definition (the second "f"
     * declaration).
     * <p>
     * If given a cursor for which there is no corresponding definition,
     * e.g., because there is no definition of that entity within this
     * translation unit, returns a NULL cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCursorDefinition(@ByValue CXCursor arg1);

    /**
     * Determine whether the declaration pointed to by this cursor
     * is also a definition of that entity.
     */
    @Generated
    @CFunction
    public static native int clang_isCursorDefinition(@ByValue CXCursor arg1);

    /**
     * Retrieve the canonical cursor corresponding to the given cursor.
     * <p>
     * In the C family of languages, many kinds of entities can be declared several
     * times within a single translation unit. For example, a structure type can
     * be forward-declared (possibly multiple times) and later defined:
     * <p>
     * \code
     * struct X;
     * struct X;
     * struct X {
     * int member;
     * };
     * \endcode
     * <p>
     * The declarations and the definition of \c X are represented by three
     * different cursors, all of which are declarations of the same underlying
     * entity. One of these cursor is considered the "canonical" cursor, which
     * is effectively the representative for the underlying entity. One can
     * determine if two cursors are declarations of the same underlying entity by
     * comparing their canonical cursors.
     * <p>
     * \returns The canonical cursor for the entity referred to by the given cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getCanonicalCursor(@ByValue CXCursor arg1);

    /**
     * If the cursor points to a selector identifier in an Objective-C
     * method or message expression, this returns the selector index.
     * <p>
     * After getting a cursor with #clang_getCursor, this can be called to
     * determine if the location points to a selector identifier.
     * <p>
     * \returns The selector index if the cursor is an Objective-C method or message
     * expression and the cursor is pointing to a selector identifier, or -1
     * otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getObjCSelectorIndex(@ByValue CXCursor arg1);

    /**
     * Given a cursor pointing to a C++ method call or an Objective-C
     * message, returns non-zero if the method/message is "dynamic", meaning:
     * <p>
     * For a C++ method: the call is virtual.
     * For an Objective-C message: the receiver is an object instance, not 'super'
     * or a specific class.
     * <p>
     * If the method/message is "static" or the cursor does not point to a
     * method/message, it will return zero.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isDynamicCall(@ByValue CXCursor C);

    /**
     * Given a cursor pointing to an Objective-C message or property
     * reference, or C++ method call, returns the CXType of the receiver.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Cursor_getReceiverType(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a property declaration, return the
     * associated property attributes. The bits are formed from
     * \c CXObjCPropertyAttrKind.
     * <p>
     * \param reserved Reserved for future use, pass 0.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getObjCPropertyAttributes(@ByValue CXCursor C, int reserved);

    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getObjCRuntimeName(@ByValue CXCursor C);

    /**
     * Given a cursor that represents an Objective-C method or parameter
     * declaration, return the associated Objective-C qualifiers for the return
     * type or the parameter respectively. The bits are formed from
     * CXObjCDeclQualifierKind.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getObjCDeclQualifiers(@ByValue CXCursor C);

    /**
     * Given a cursor that represents an Objective-C method or property
     * declaration, return non-zero if the declaration was affected by "\@optional".
     * Returns zero if the cursor is not such a declaration or it is "\@required".
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isObjCOptional(@ByValue CXCursor C);

    /**
     * Returns non-zero if the given cursor is a variadic function or method.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isVariadic(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a declaration, return the associated
     * comment's source range.  The range may include multiple consecutive comments
     * with whitespace in between.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_Cursor_getCommentRange(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a declaration, return the associated
     * comment text, including comment markers.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getRawCommentText(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a documentable entity (e.g.,
     * declaration), return the associated \paragraph; otherwise return the
     * first paragraph.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getBriefCommentText(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a documentable entity (e.g.,
     * declaration), return the associated parsed comment as a
     * \c CXComment_FullComment AST node.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXComment clang_Cursor_getParsedComment(@ByValue CXCursor C);

    /**
     * Given a CXCursor_ModuleImportDecl cursor, return the associated module.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_Cursor_getModule(@ByValue CXCursor C);

    /**
     * \param Module a module object.
     * <p>
     * \returns the module file where the provided module object came from.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_Module_getASTFile(VoidPtr Module);

    /**
     * \param Module a module object.
     * <p>
     * \returns the parent of a sub-module or NULL if the given module is top-level,
     * e.g. for 'std.vector' it will return the 'std' module.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_Module_getParent(VoidPtr Module);

    /**
     * \param Module a module object.
     * <p>
     * \returns the name of the module, e.g. for the 'std.vector' sub-module it
     * will return "vector".
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Module_getName(VoidPtr Module);

    /**
     * \param Module a module object.
     * <p>
     * \returns the full name of the module, e.g. "std.vector".
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Module_getFullName(VoidPtr Module);

    /**
     * \param Module a module object.
     * <p>
     * \returns the number of top level headers associated with this module.
     */
    @Generated
    @CFunction
    public static native int clang_Module_getNumTopLevelHeaders(CXTranslationUnit arg1, VoidPtr Module);

    /**
     * \param Module a module object.
     * <p>
     * \param Index top level header index (zero-based).
     * <p>
     * \returns the specified top level header associated with the module.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_Module_getTopLevelHeader(CXTranslationUnit arg1, VoidPtr Module, int Index);

    /**
     * \param Comment AST node of any kind.
     * <p>
     * \returns the type of the AST node.
     */
    @Generated
    @CFunction
    public static native int clang_Comment_getKind(@ByValue CXComment Comment);

    /**
     * \param Comment AST node of any kind.
     * <p>
     * \returns number of children of the AST node.
     */
    @Generated
    @CFunction
    public static native int clang_Comment_getNumChildren(@ByValue CXComment Comment);

    /**
     * \param Comment AST node of any kind.
     * <p>
     * \param ChildIdx child index (zero-based).
     * <p>
     * \returns the specified child of the AST node.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXComment clang_Comment_getChild(@ByValue CXComment Comment, int ChildIdx);

    /**
     * A \c CXComment_Paragraph node is considered whitespace if it contains
     * only \c CXComment_Text nodes that are empty or whitespace.
     * <p>
     * Other AST nodes (except \c CXComment_Paragraph and \c CXComment_Text) are
     * never considered whitespace.
     * <p>
     * \returns non-zero if \c Comment is whitespace.
     */
    @Generated
    @CFunction
    public static native int clang_Comment_isWhitespace(@ByValue CXComment Comment);

    /**
     * \returns non-zero if \c Comment is inline content and has a newline
     * immediately following it in the comment text.  Newlines between paragraphs
     * do not count.
     */
    @Generated
    @CFunction
    public static native int clang_InlineContentComment_hasTrailingNewline(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_Text AST node.
     * <p>
     * \returns text contained in the AST node.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_TextComment_getText(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     * <p>
     * \returns name of the inline command.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_InlineCommandComment_getCommandName(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     * <p>
     * \returns the most appropriate rendering mode, chosen on command
     * semantics in Doxygen.
     */
    @Generated
    @CFunction
    public static native int clang_InlineCommandComment_getRenderKind(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     * <p>
     * \returns number of command arguments.
     */
    @Generated
    @CFunction
    public static native int clang_InlineCommandComment_getNumArgs(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_InlineCommand AST node.
     * <p>
     * \param ArgIdx argument index (zero-based).
     * <p>
     * \returns text of the specified argument.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_InlineCommandComment_getArgText(@ByValue CXComment Comment, int ArgIdx);

    /**
     * \param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
     * node.
     * <p>
     * \returns HTML tag name.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_HTMLTagComment_getTagName(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     * <p>
     * \returns non-zero if tag is self-closing (for example, &lt;br /&gt;).
     */
    @Generated
    @CFunction
    public static native int clang_HTMLStartTagComment_isSelfClosing(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     * <p>
     * \returns number of attributes (name-value pairs) attached to the start tag.
     */
    @Generated
    @CFunction
    public static native int clang_HTMLStartTag_getNumAttrs(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     * <p>
     * \param AttrIdx attribute index (zero-based).
     * <p>
     * \returns name of the specified attribute.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_HTMLStartTag_getAttrName(@ByValue CXComment Comment, int AttrIdx);

    /**
     * \param Comment a \c CXComment_HTMLStartTag AST node.
     * <p>
     * \param AttrIdx attribute index (zero-based).
     * <p>
     * \returns value of the specified attribute.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_HTMLStartTag_getAttrValue(@ByValue CXComment Comment, int AttrIdx);

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     * <p>
     * \returns name of the block command.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_BlockCommandComment_getCommandName(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     * <p>
     * \returns number of word-like arguments.
     */
    @Generated
    @CFunction
    public static native int clang_BlockCommandComment_getNumArgs(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_BlockCommand AST node.
     * <p>
     * \param ArgIdx argument index (zero-based).
     * <p>
     * \returns text of the specified word-like argument.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_BlockCommandComment_getArgText(@ByValue CXComment Comment, int ArgIdx);

    /**
     * \param Comment a \c CXComment_BlockCommand or
     * \c CXComment_VerbatimBlockCommand AST node.
     * <p>
     * \returns paragraph argument of the block command.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXComment clang_BlockCommandComment_getParagraph(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     * <p>
     * \returns parameter name.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_ParamCommandComment_getParamName(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     * <p>
     * \returns non-zero if the parameter that this AST node represents was found
     * in the function prototype and \c clang_ParamCommandComment_getParamIndex
     * function will return a meaningful value.
     */
    @Generated
    @CFunction
    public static native int clang_ParamCommandComment_isParamIndexValid(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     * <p>
     * \returns zero-based parameter index in function prototype.
     */
    @Generated
    @CFunction
    public static native int clang_ParamCommandComment_getParamIndex(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     * <p>
     * \returns non-zero if parameter passing direction was specified explicitly in
     * the comment.
     */
    @Generated
    @CFunction
    public static native int clang_ParamCommandComment_isDirectionExplicit(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_ParamCommand AST node.
     * <p>
     * \returns parameter passing direction.
     */
    @Generated
    @CFunction
    public static native int clang_ParamCommandComment_getDirection(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     * <p>
     * \returns template parameter name.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_TParamCommandComment_getParamName(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     * <p>
     * \returns non-zero if the parameter that this AST node represents was found
     * in the template parameter list and
     * \c clang_TParamCommandComment_getDepth and
     * \c clang_TParamCommandComment_getIndex functions will return a meaningful
     * value.
     */
    @Generated
    @CFunction
    public static native int clang_TParamCommandComment_isParamPositionValid(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     * <p>
     * \returns zero-based nesting depth of this parameter in the template parameter list.
     * <p>
     * For example,
     * \verbatim
     * template<typename C, template<typename T> class TT>
     * void test(TT<int> aaa);
     * \endverbatim
     * for C and TT nesting depth is 0,
     * for T nesting depth is 1.
     */
    @Generated
    @CFunction
    public static native int clang_TParamCommandComment_getDepth(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_TParamCommand AST node.
     * <p>
     * \returns zero-based parameter index in the template parameter list at a
     * given nesting depth.
     * <p>
     * For example,
     * \verbatim
     * template<typename C, template<typename T> class TT>
     * void test(TT<int> aaa);
     * \endverbatim
     * for C and TT nesting depth is 0, so we can ask for index at depth 0:
     * at depth 0 C's index is 0, TT's index is 1.
     * <p>
     * For T nesting depth is 1, so we can ask for index at depth 0 and 1:
     * at depth 0 T's index is 1 (same as TT's),
     * at depth 1 T's index is 0.
     */
    @Generated
    @CFunction
    public static native int clang_TParamCommandComment_getIndex(@ByValue CXComment Comment, int Depth);

    /**
     * \param Comment a \c CXComment_VerbatimBlockLine AST node.
     * <p>
     * \returns text contained in the AST node.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_VerbatimBlockLineComment_getText(@ByValue CXComment Comment);

    /**
     * \param Comment a \c CXComment_VerbatimLine AST node.
     * <p>
     * \returns text contained in the AST node.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_VerbatimLineComment_getText(@ByValue CXComment Comment);

    /**
     * Convert an HTML tag AST node to string.
     * <p>
     * \param Comment a \c CXComment_HTMLStartTag or \c CXComment_HTMLEndTag AST
     * node.
     * <p>
     * \returns string containing an HTML tag.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_HTMLTagComment_getAsString(@ByValue CXComment Comment);

    /**
     * Convert a given full parsed comment to an HTML fragment.
     * <p>
     * Specific details of HTML layout are subject to change.  Don't try to parse
     * this HTML back into an AST, use other APIs instead.
     * <p>
     * Currently the following CSS classes are used:
     * \li "para-brief" for \paragraph and equivalent commands;
     * \li "para-returns" for \\returns paragraph and equivalent commands;
     * \li "word-returns" for the "Returns" word in \\returns paragraph.
     * <p>
     * Function argument documentation is rendered as a \<dl\> list with arguments
     * sorted in function prototype order.  CSS classes used:
     * \li "param-name-index-NUMBER" for parameter name (\<dt\>);
     * \li "param-descr-index-NUMBER" for parameter description (\<dd\>);
     * \li "param-name-index-invalid" and "param-descr-index-invalid" are used if
     * parameter index is invalid.
     * <p>
     * Template parameter documentation is rendered as a \<dl\> list with
     * parameters sorted in template parameter list order.  CSS classes used:
     * \li "tparam-name-index-NUMBER" for parameter name (\<dt\>);
     * \li "tparam-descr-index-NUMBER" for parameter description (\<dd\>);
     * \li "tparam-name-index-other" and "tparam-descr-index-other" are used for
     * names inside template template parameters;
     * \li "tparam-name-index-invalid" and "tparam-descr-index-invalid" are used if
     * parameter position is invalid.
     * <p>
     * \param Comment a \c CXComment_FullComment AST node.
     * <p>
     * \returns string containing an HTML fragment.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_FullComment_getAsHTML(@ByValue CXComment Comment);

    /**
     * Convert a given full parsed comment to an XML document.
     * <p>
     * A Relax NG schema for the XML can be found in comment-xml-schema.rng file
     * inside clang source tree.
     * <p>
     * \param Comment a \c CXComment_FullComment AST node.
     * <p>
     * \returns string containing an XML document.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_FullComment_getAsXML(@ByValue CXComment Comment);

    /**
     * Determine if a C++ member function or member function template is
     * pure virtual.
     */
    @Generated
    @CFunction
    public static native int clang_CXXMethod_isPureVirtual(@ByValue CXCursor C);

    /**
     * Determine if a C++ member function or member function template is
     * declared 'static'.
     */
    @Generated
    @CFunction
    public static native int clang_CXXMethod_isStatic(@ByValue CXCursor C);

    /**
     * Determine if a C++ member function or member function template is
     * explicitly declared 'virtual' or if it overrides a virtual method from
     * one of the base classes.
     */
    @Generated
    @CFunction
    public static native int clang_CXXMethod_isVirtual(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a template, determine
     * the cursor kind of the specializations would be generated by instantiating
     * the template.
     * <p>
     * This routine can be used to determine what flavor of function template,
     * class template, or class template partial specialization is stored in the
     * cursor. For example, it can describe whether a class template cursor is
     * declared with "struct", "class" or "union".
     * <p>
     * \param C The cursor to query. This cursor should represent a template
     * declaration.
     * <p>
     * \returns The cursor kind of the specializations that would be generated
     * by instantiating the template \p C. If \p C is not a template, returns
     * \c CXCursor_NoDeclFound.
     */
    @Generated
    @CFunction
    public static native int clang_getTemplateCursorKind(@ByValue CXCursor C);

    /**
     * Given a cursor that may represent a specialization or instantiation
     * of a template, retrieve the cursor that represents the template that it
     * specializes or from which it was instantiated.
     * <p>
     * This routine determines the template involved both for explicit
     * specializations of templates and for implicit instantiations of the template,
     * both of which are referred to as "specializations". For a class template
     * specialization (e.g., \c std::vector<bool>), this routine will return
     * either the primary template (\c std::vector) or, if the specialization was
     * instantiated from a class template partial specialization, the class template
     * partial specialization. For a class template partial specialization and a
     * function template specialization (including instantiations), this
     * this routine will return the specialized template.
     * <p>
     * For members of a class template (e.g., member functions, member classes, or
     * static data members), returns the specialized or instantiated member.
     * Although not strictly "templates" in the C++ language, members of class
     * templates have the same notions of specializations and instantiations that
     * templates do, so this routine treats them similarly.
     * <p>
     * \param C A cursor that may be a specialization of a template or a member
     * of a template.
     * <p>
     * \returns If the given cursor is a specialization or instantiation of a
     * template or a member thereof, the template or member that it specializes or
     * from which it was instantiated. Otherwise, returns a NULL cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_getSpecializedCursorTemplate(@ByValue CXCursor C);

    /**
     * Given a cursor that references something else, return the source range
     * covering that reference.
     * <p>
     * \param C A cursor pointing to a member reference, a declaration reference, or
     * an operator call.
     * \param NameFlags A bitset with three independent flags:
     * CXNameRange_WantQualifier, CXNameRange_WantTemplateArgs, and
     * CXNameRange_WantSinglePiece.
     * \param PieceIndex For contiguous names or when passing the flag
     * CXNameRange_WantSinglePiece, only one piece with index 0 is
     * available. When the CXNameRange_WantSinglePiece flag is not passed for a
     * non-contiguous names, this index can be used to retrieve the individual
     * pieces of the name. See also CXNameRange_WantSinglePiece.
     * <p>
     * \returns The piece of the name pointed to by the given cursor. If there is no
     * name, or if the PieceIndex is out-of-range, a null-cursor will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getCursorReferenceNameRange(@ByValue CXCursor C, int NameFlags,
            int PieceIndex);

    /**
     * Determine the kind of the given token.
     */
    @Generated
    @CFunction
    public static native int clang_getTokenKind(@ByValue CXToken arg1);

    /**
     * Determine the spelling of the given token.
     * <p>
     * The spelling of a token is the textual representation of that token, e.g.,
     * the text of an identifier or keyword.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getTokenSpelling(CXTranslationUnit arg1, @ByValue CXToken arg2);

    /**
     * Retrieve the source location of the given token.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_getTokenLocation(CXTranslationUnit arg1, @ByValue CXToken arg2);

    /**
     * Retrieve a source range that covers the given token.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceRange clang_getTokenExtent(CXTranslationUnit arg1, @ByValue CXToken arg2);

    /**
     * Tokenize the source code described by the given range into raw
     * lexical tokens.
     * <p>
     * \param TU the translation unit whose text is being tokenized.
     * <p>
     * \param Range the source range in which text should be tokenized. All of the
     * tokens produced by tokenization will fall within this source range,
     * <p>
     * \param Tokens this pointer will be set to point to the array of tokens
     * that occur within the given source range. The returned pointer must be
     * freed with clang_disposeTokens() before the translation unit is destroyed.
     * <p>
     * \param NumTokens will be set to the number of tokens in the \c *Tokens
     * array.
     */
    @Generated
    @CFunction
    public static native void clang_tokenize(CXTranslationUnit TU, @ByValue CXSourceRange Range,
            Ptr<Ptr<CXToken>> Tokens, IntPtr NumTokens);

    /**
     * Annotate the given set of tokens by providing cursors for each token
     * that can be mapped to a specific entity within the abstract syntax tree.
     * <p>
     * This token-annotation routine is equivalent to invoking
     * clang_getCursor() for the source locations of each of the
     * tokens. The cursors provided are filtered, so that only those
     * cursors that have a direct correspondence to the token are
     * accepted. For example, given a function call \c f(x),
     * clang_getCursor() would provide the following cursors:
     * <p>
     * * when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.
     * * when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.
     * * when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'.
     * <p>
     * Only the first and last of these cursors will occur within the
     * annotate, since the tokens "f" and "x' directly refer to a function
     * and a variable, respectively, but the parentheses are just a small
     * part of the full syntax of the function call expression, which is
     * not provided as an annotation.
     * <p>
     * \param TU the translation unit that owns the given tokens.
     * <p>
     * \param Tokens the set of tokens to annotate.
     * <p>
     * \param NumTokens the number of tokens in \p Tokens.
     * <p>
     * \param Cursors an array of \p NumTokens cursors, whose contents will be
     * replaced with the cursors corresponding to each token.
     */
    @Generated
    @CFunction
    public static native void clang_annotateTokens(CXTranslationUnit TU,
            @UncertainArgument("Options: reference, array Fallback: reference") CXToken Tokens, int NumTokens,
            @UncertainArgument("Options: reference, array Fallback: reference") CXCursor Cursors);

    /**
     * Free the given set of tokens.
     */
    @Generated
    @CFunction
    public static native void clang_disposeTokens(CXTranslationUnit TU, Ptr<CXToken> Tokens, int NumTokens);

    /**
     * for debug/testing
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCursorKindSpelling(int Kind);

    @Generated
    @CFunction
    public static native void clang_getDefinitionSpellingAndExtent(@ByValue CXCursor arg1,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] startBuf,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] endBuf,
            IntPtr startLine, IntPtr startColumn, IntPtr endLine, IntPtr endColumn);

    @Generated
    @CFunction
    public static native void clang_enableStackTraces();

    @Generated
    @CFunction
    public static native void clang_executeOnThread(
            @FunctionPtr(name = "call_clang_executeOnThread") Function_clang_executeOnThread fn, VoidPtr user_data,
            int stack_size);

    /**
     * Determine the kind of a particular chunk within a completion string.
     * <p>
     * \param completion_string the completion string to query.
     * <p>
     * \param chunk_number the 0-based index of the chunk in the completion string.
     * <p>
     * \returns the kind of the chunk at the index \c chunk_number.
     */
    @Generated
    @CFunction
    public static native int clang_getCompletionChunkKind(VoidPtr completion_string, int chunk_number);

    /**
     * Retrieve the text associated with a particular chunk within a
     * completion string.
     * <p>
     * \param completion_string the completion string to query.
     * <p>
     * \param chunk_number the 0-based index of the chunk in the completion string.
     * <p>
     * \returns the text associated with the chunk at index \c chunk_number.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCompletionChunkText(VoidPtr completion_string, int chunk_number);

    /**
     * Retrieve the completion string associated with a particular chunk
     * within a completion string.
     * <p>
     * \param completion_string the completion string to query.
     * <p>
     * \param chunk_number the 0-based index of the chunk in the completion string.
     * <p>
     * \returns the completion string associated with the chunk at index
     * \c chunk_number.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getCompletionChunkCompletionString(VoidPtr completion_string, int chunk_number);

    /**
     * Retrieve the number of chunks in the given code-completion string.
     */
    @Generated
    @CFunction
    public static native int clang_getNumCompletionChunks(VoidPtr completion_string);

    /**
     * Determine the priority of this code completion.
     * <p>
     * The priority of a code completion indicates how likely it is that this
     * particular completion is the completion that the user will select. The
     * priority is selected by various internal heuristics.
     * <p>
     * \param completion_string The completion string to query.
     * <p>
     * \returns The priority of this completion string. Smaller values indicate
     * higher-priority (more likely) completions.
     */
    @Generated
    @CFunction
    public static native int clang_getCompletionPriority(VoidPtr completion_string);

    /**
     * Determine the availability of the entity that this code-completion
     * string refers to.
     * <p>
     * \param completion_string The completion string to query.
     * <p>
     * \returns The availability of the completion string.
     */
    @Generated
    @CFunction
    public static native int clang_getCompletionAvailability(VoidPtr completion_string);

    /**
     * Retrieve the number of annotations associated with the given
     * completion string.
     * <p>
     * \param completion_string the completion string to query.
     * <p>
     * \returns the number of annotations associated with the given completion
     * string.
     */
    @Generated
    @CFunction
    public static native int clang_getCompletionNumAnnotations(VoidPtr completion_string);

    /**
     * Retrieve the annotation associated with the given completion string.
     * <p>
     * \param completion_string the completion string to query.
     * <p>
     * \param annotation_number the 0-based index of the annotation of the
     * completion string.
     * <p>
     * \returns annotation string associated with the completion at index
     * \c annotation_number, or a NULL string if that annotation is not available.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCompletionAnnotation(VoidPtr completion_string, int annotation_number);

    /**
     * Retrieve the parent context of the given completion string.
     * <p>
     * The parent context of a completion string is the semantic parent of
     * the declaration (if any) that the code completion represents. For example,
     * a code completion for an Objective-C method would have the method's class
     * or protocol as its context.
     * <p>
     * \param completion_string The code completion string whose parent is
     * being queried.
     * <p>
     * \param kind DEPRECATED: always set to CXCursor_NotImplemented if non-NULL.
     * <p>
     * \returns The name of the completion parent, e.g., "NSObject" if
     * the completion string represents a method in the NSObject class.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCompletionParent(VoidPtr completion_string, IntPtr kind);

    /**
     * Retrieve the brief documentation comment attached to the declaration
     * that corresponds to the given completion string.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCompletionBriefComment(VoidPtr completion_string);

    /**
     * Retrieve a completion string for an arbitrary declaration or macro
     * definition cursor.
     * <p>
     * \param cursor The cursor to query.
     * <p>
     * \returns A non-context-sensitive completion string for declaration and macro
     * definition cursors, or NULL for other kinds of cursors.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getCursorCompletionString(@ByValue CXCursor cursor);

    /**
     * Returns a default set of code-completion options that can be
     * passed to\c clang_codeCompleteAt().
     */
    @Generated
    @CFunction
    public static native int clang_defaultCodeCompleteOptions();

    /**
     * Perform code completion at a given location in a translation unit.
     * <p>
     * This function performs code completion at a particular file, line, and
     * column within source code, providing results that suggest potential
     * code snippets based on the context of the completion. The basic model
     * for code completion is that Clang will parse a complete source file,
     * performing syntax checking up to the location where code-completion has
     * been requested. At that point, a special code-completion token is passed
     * to the parser, which recognizes this token and determines, based on the
     * current location in the C/Objective-C/C++ grammar and the state of
     * semantic analysis, what completions to provide. These completions are
     * returned via a new \c CXCodeCompleteResults structure.
     * <p>
     * Code completion itself is meant to be triggered by the client when the
     * user types punctuation characters or whitespace, at which point the
     * code-completion location will coincide with the cursor. For example, if \c p
     * is a pointer, code-completion might be triggered after the "-" and then
     * after the ">" in \c p->. When the code-completion location is after the ">",
     * the completion results will provide, e.g., the members of the struct that
     * "p" points to. The client is responsible for placing the cursor at the
     * beginning of the token currently being typed, then filtering the results
     * based on the contents of the token. For example, when code-completing for
     * the expression \c p->get, the client should provide the location just after
     * the ">" (e.g., pointing at the "g") to this code-completion hook. Then, the
     * client can filter the results based on the current token text ("get"), only
     * showing those results that start with "get". The intent of this interface
     * is to separate the relatively high-latency acquisition of code-completion
     * results from the filtering of results on a per-character basis, which must
     * have a lower latency.
     * <p>
     * \param TU The translation unit in which code-completion should
     * occur. The source files for this translation unit need not be
     * completely up-to-date (and the contents of those source files may
     * be overridden via \p unsaved_files). Cursors referring into the
     * translation unit may be invalidated by this invocation.
     * <p>
     * \param complete_filename The name of the source file where code
     * completion should be performed. This filename may be any file
     * included in the translation unit.
     * <p>
     * \param complete_line The line at which code-completion should occur.
     * <p>
     * \param complete_column The column at which code-completion should occur.
     * Note that the column should point just after the syntactic construct that
     * initiated code completion, and not in the middle of a lexical token.
     * <p>
     * \param unsaved_files the Files that have not yet been saved to disk
     * but may be required for parsing or code completion, including the
     * contents of those files.  The contents and name of these files (as
     * specified by CXUnsavedFile) are copied when necessary, so the
     * client only needs to guarantee their validity until the call to
     * this function returns.
     * <p>
     * \param num_unsaved_files The number of unsaved file entries in \p
     * unsaved_files.
     * <p>
     * \param options Extra options that control the behavior of code
     * completion, expressed as a bitwise OR of the enumerators of the
     * CXCodeComplete_Flags enumeration. The
     * \c clang_defaultCodeCompleteOptions() function returns a default set
     * of code-completion options.
     * <p>
     * \returns If successful, a new \c CXCodeCompleteResults structure
     * containing code-completion results, which should eventually be
     * freed with \c clang_disposeCodeCompleteResults(). If code
     * completion fails, returns NULL.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXCodeCompleteResults clang_codeCompleteAt(CXTranslationUnit TU,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String complete_filename,
            int complete_line, int complete_column,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, int options);

    /**
     * Sort the code-completion results in case-insensitive alphabetical
     * order.
     * <p>
     * \param Results The set of results to sort.
     * \param NumResults The number of results in \p Results.
     */
    @Generated
    @CFunction
    public static native void clang_sortCodeCompletionResults(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCompletionResult Results,
            int NumResults);

    /**
     * Free the given set of code-completion results.
     */
    @Generated
    @CFunction
    public static native void clang_disposeCodeCompleteResults(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

    /**
     * Determine the number of diagnostics produced prior to the
     * location where code completion was performed.
     */
    @Generated
    @CFunction
    public static native int clang_codeCompleteGetNumDiagnostics(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

    /**
     * Retrieve a diagnostic associated with the given code completion.
     * <p>
     * \param Results the code completion results to query.
     * \param Index the zero-based diagnostic number to retrieve.
     * <p>
     * \returns the requested diagnostic. This diagnostic must be freed
     * via a call to \c clang_disposeDiagnostic().
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_codeCompleteGetDiagnostic(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results,
            int Index);

    /**
     * Determines what completions are appropriate for the context
     * the given code completion.
     * <p>
     * \param Results the code completion results to query
     * <p>
     * \returns the kinds of completions that are appropriate for use
     * along with the given code completion results.
     */
    @Generated
    @CFunction
    public static native long clang_codeCompleteGetContexts(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

    /**
     * Returns the cursor kind for the container for the current code
     * completion context. The container is only guaranteed to be set for
     * contexts where a container exists (i.e. member accesses or Objective-C
     * message sends); if there is not a container, this function will return
     * CXCursor_InvalidCode.
     * <p>
     * \param Results the code completion results to query
     * <p>
     * \param IsIncomplete on return, this value will be false if Clang has complete
     * information about the container. If Clang does not have complete
     * information, this value will be true.
     * <p>
     * \returns the container kind, or CXCursor_InvalidCode if there is not a
     * container
     */
    @Generated
    @CFunction
    public static native int clang_codeCompleteGetContainerKind(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results,
            IntPtr IsIncomplete);

    /**
     * Returns the USR for the container for the current code completion
     * context. If there is not a container for the current context, this
     * function will return the empty string.
     * <p>
     * \param Results the code completion results to query
     * <p>
     * \returns the USR for the container
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_codeCompleteGetContainerUSR(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

    /**
     * Returns the currently-entered selector for an Objective-C message
     * send, formatted like "initWithFoo:bar:". Only guaranteed to return a
     * non-empty string for CXCompletionContext_ObjCInstanceMessage and
     * CXCompletionContext_ObjCClassMessage.
     * <p>
     * \param Results the code completion results to query
     * <p>
     * \returns the selector (or partial selector) that has been entered thus far
     * for an Objective-C message send.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_codeCompleteGetObjCSelector(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults Results);

    /**
     * Return a version string, suitable for showing to a user, but not
     * intended to be parsed (the format is not guaranteed to be stable).
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getClangVersion();

    /**
     * Enable/disable crash recovery.
     * <p>
     * \param isEnabled Flag to indicate if crash recovery is enabled.  A non-zero
     * value enables crash recovery, while 0 disables it.
     */
    @Generated
    @CFunction
    public static native void clang_toggleCrashRecovery(int isEnabled);

    /**
     * Visit the set of preprocessor inclusions in a translation unit.
     * The visitor function is called with the provided data for every included
     * file.  This does not include headers included by the PCH file (unless one
     * is inspecting the inclusions in the PCH file itself).
     */
    @Generated
    @CFunction
    public static native void clang_getInclusions(CXTranslationUnit tu,
            @FunctionPtr(name = "call_clang_getInclusions") Function_clang_getInclusions visitor, VoidPtr client_data);

    /**
     * Retrieve a remapping.
     * <p>
     * \param path the path that contains metadata about remappings.
     * <p>
     * \returns the requested remapping. This remapping must be freed
     * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getRemappings(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

    /**
     * Retrieve a remapping.
     * <p>
     * \param filePaths pointer to an array of file paths containing remapping info.
     * <p>
     * \param numFiles number of file paths.
     * <p>
     * \returns the requested remapping. This remapping must be freed
     * via a call to \c clang_remap_dispose(). Can return NULL if an error occurred.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getRemappingsFromFileList(
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] filePaths,
            int numFiles);

    /**
     * Determine the number of remappings.
     */
    @Generated
    @CFunction
    public static native int clang_remap_getNumFiles(VoidPtr arg1);

    /**
     * Get the original and the associated filename from the remapping.
     * <p>
     * \param original If non-NULL, will be set to the original filename.
     * <p>
     * \param transformed If non-NULL, will be set to the filename that the original
     * is associated with.
     */
    @Generated
    @CFunction
    public static native void clang_remap_getFilenames(VoidPtr arg1, int index,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString original,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString transformed);

    /**
     * Dispose the remapping.
     */
    @Generated
    @CFunction
    public static native void clang_remap_dispose(VoidPtr arg1);

    /**
     * Find references of a declaration in a specific file.
     * <p>
     * \param cursor pointing to a declaration or a reference of one.
     * <p>
     * \param file to search for references.
     * <p>
     * \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
     * each reference found.
     * The CXSourceRange will point inside the file; if the reference is inside
     * a macro (and not a macro argument) the CXSourceRange will be invalid.
     * <p>
     * \returns one of the CXResult enumerators.
     */
    @Generated
    @CFunction
    public static native int clang_findReferencesInFile(@ByValue CXCursor cursor, VoidPtr file,
            @ByValue CXCursorAndRangeVisitor visitor);

    /**
     * Find #import/#include directives in a specific file.
     * <p>
     * \param TU translation unit containing the file to query.
     * <p>
     * \param file to search for #import/#include directives.
     * <p>
     * \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
     * each directive found.
     * <p>
     * \returns one of the CXResult enumerators.
     */
    @Generated
    @CFunction
    public static native int clang_findIncludesInFile(CXTranslationUnit TU, VoidPtr file,
            @ByValue CXCursorAndRangeVisitor visitor);

    @Generated
    @CFunction
    public static native int clang_findReferencesInFileWithBlock(@ByValue CXCursor arg1, VoidPtr arg2,
            @ObjCBlock(name = "call_clang_findReferencesInFileWithBlock") Block_clang_findReferencesInFileWithBlock arg3);

    @Generated
    @CFunction
    public static native int clang_findIncludesInFileWithBlock(CXTranslationUnit arg1, VoidPtr arg2,
            @ObjCBlock(name = "call_clang_findIncludesInFileWithBlock") Block_clang_findIncludesInFileWithBlock arg3);

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

    /**
     * For retrieving a custom CXIdxClientContainer attached to a
     * container.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_index_getClientContainer(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo arg1);

    /**
     * For setting a custom CXIdxClientContainer attached to a
     * container.
     */
    @Generated
    @CFunction
    public static native void clang_index_setClientContainer(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo arg1, VoidPtr arg2);

    /**
     * For retrieving a custom CXIdxClientEntity attached to an entity.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_index_getClientEntity(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo arg1);

    /**
     * For setting a custom CXIdxClientEntity attached to an entity.
     */
    @Generated
    @CFunction
    public static native void clang_index_setClientEntity(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo arg1, VoidPtr arg2);

    /**
     * An indexing action/session, to be applied to one or multiple
     * translation units.
     * <p>
     * \param CIdx The index object with which the index action will be associated.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_IndexAction_create(VoidPtr CIdx);

    /**
     * Destroy the given index action.
     * <p>
     * The index action must not be destroyed until all of the translation units
     * created within that index action have been destroyed.
     */
    @Generated
    @CFunction
    public static native void clang_IndexAction_dispose(VoidPtr arg1);

    /**
     * Index the given source file and the translation unit corresponding
     * to that file via callbacks implemented through #IndexerCallbacks.
     * <p>
     * \param client_data pointer data supplied by the client, which will
     * be passed to the invoked callbacks.
     * <p>
     * \param index_callbacks Pointer to indexing callbacks that the client
     * implements.
     * <p>
     * \param index_callbacks_size Size of #IndexerCallbacks structure that gets
     * passed in index_callbacks.
     * <p>
     * \param index_options A bitmask of options that affects how indexing is
     * performed. This should be a bitwise OR of the CXIndexOpt_XXX flags.
     * <p>
     * \param[out] out_TU pointer to store a \c CXTranslationUnit that can be
     * reused after indexing is finished. Set to \c NULL if you do not require it.
     * <p>
     * \returns 0 on success or if there were errors from which the compiler could
     * recover.  If there is a failure from which there is no recovery, returns
     * a non-zero \c CXErrorCode.
     * <p>
     * The rest of the parameters are the same as #clang_parseTranslationUnit.
     */
    @Generated
    @CFunction
    public static native int clang_indexSourceFile(VoidPtr arg1, VoidPtr client_data,
            @UncertainArgument("Options: reference, array Fallback: reference") IndexerCallbacks index_callbacks,
            int index_callbacks_size, int index_options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
            int num_command_line_args,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, Ptr<CXTranslationUnit> out_TU, int TU_options);

    /**
     * Index the given translation unit via callbacks implemented through
     * #IndexerCallbacks.
     * <p>
     * The order of callback invocations is not guaranteed to be the same as
     * when indexing a source file. The high level order will be:
     * <p>
     * -Preprocessor callbacks invocations
     * -Declaration/reference callbacks invocations
     * -Diagnostic callback invocations
     * <p>
     * The parameters are the same as #clang_indexSourceFile.
     * <p>
     * \returns If there is a failure from which there is no recovery, returns
     * non-zero, otherwise returns 0.
     */
    @Generated
    @CFunction
    public static native int clang_indexTranslationUnit(VoidPtr arg1, VoidPtr client_data,
            @UncertainArgument("Options: reference, array Fallback: reference") IndexerCallbacks index_callbacks,
            int index_callbacks_size, int index_options, CXTranslationUnit arg6);

    /**
     * Retrieve the CXIdxFile, file, line, column, and offset represented by
     * the given CXIdxLoc.
     * <p>
     * If the location refers into a macro expansion, retrieves the
     * location of the macro expansion and if it refers into a macro argument
     * retrieves the location of the argument.
     */
    @Generated
    @CFunction
    public static native void clang_indexLoc_getFileLocation(@ByValue CXIdxLoc loc, Ptr<VoidPtr> indexFile,
            Ptr<VoidPtr> file, IntPtr line, IntPtr column, IntPtr offset);

    /**
     * Retrieve the CXSourceLocation represented by the given CXIdxLoc.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXSourceLocation clang_indexLoc_getCXSourceLocation(@ByValue CXIdxLoc loc);

    /**
     * Return the timestamp for use with Clang's
     * \c -fbuild-session-timestamp= option.
     */
    @Generated
    @CFunction
    public static native long clang_getBuildSessionTimestamp();

    /**
     * Create a \c CXVirtualFileOverlay object.
     * Must be disposed with \c clang_VirtualFileOverlay_dispose().
     * <p>
     * \param options is reserved, always pass 0.
     */
    @Generated
    @CFunction
    public static native CXVirtualFileOverlay clang_VirtualFileOverlay_create(int options);

    /**
     * Map an absolute virtual file path to an absolute real one.
     * The virtual path must be canonicalized (not contain "."/"..").
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String virtualPath,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String realPath);

    /**
     * Set the case sensitivity for the \c CXVirtualFileOverlay object.
     * The \c CXVirtualFileOverlay object is case-sensitive by default, this
     * option can be used to override the default.
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_VirtualFileOverlay_setCaseSensitivity(CXVirtualFileOverlay arg1, int caseSensitive);

    /**
     * Write out the \c CXVirtualFileOverlay object to a char buffer.
     * <p>
     * \param options is reserved, always pass 0.
     * \param out_buffer_ptr pointer to receive the buffer pointer, which should be
     * disposed using \c clang_free().
     * \param out_buffer_size pointer to receive the buffer size.
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay arg1, int options,
            Ptr<BytePtr> out_buffer_ptr, IntPtr out_buffer_size);

    /**
     * Dispose a \c CXVirtualFileOverlay object.
     */
    @Generated
    @CFunction
    public static native void clang_VirtualFileOverlay_dispose(CXVirtualFileOverlay arg1);

    /**
     * Create a \c CXModuleMapDescriptor object.
     * Must be disposed with \c clang_ModuleMapDescriptor_dispose().
     * <p>
     * \param options is reserved, always pass 0.
     */
    @Generated
    @CFunction
    public static native CXModuleMapDescriptor clang_ModuleMapDescriptor_create(int options);

    /**
     * Sets the framework module name that the module.map describes.
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * Sets the umbrella header name that the module.map describes.
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * Write out the \c CXModuleMapDescriptor object to a char buffer.
     * <p>
     * \param options is reserved, always pass 0.
     * \param out_buffer_ptr pointer to receive the buffer pointer, which should be
     * disposed using \c clang_free().
     * \param out_buffer_size pointer to receive the buffer size.
     * \returns 0 for success, non-zero to indicate an error.
     */
    @Generated
    @CFunction
    public static native int clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor arg1, int options,
            Ptr<BytePtr> out_buffer_ptr, IntPtr out_buffer_size);

    /**
     * Dispose a \c CXModuleMapDescriptor object.
     */
    @Generated
    @CFunction
    public static native void clang_ModuleMapDescriptor_dispose(CXModuleMapDescriptor arg1);

    /**
     * Retrieve all ranges that were skipped by the preprocessor.
     * <p>
     * The preprocessor will skip lines when they are surrounded by an
     * if/ifdef/ifndef directive whose condition does not evaluate to true.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXSourceRangeList clang_getSkippedRanges(CXTranslationUnit tu, VoidPtr file);

    /**
     * Destroy the given \c CXSourceRangeList.
     */
    @Generated
    @CFunction
    public static native void clang_disposeSourceRangeList(
            @UncertainArgument("Options: reference, array Fallback: reference") CXSourceRangeList ranges);

    /**
     * Create a translation unit from an AST file (\c -emit-ast).
     * <p>
     * \param[out] out_TU A non-NULL pointer to store the created
     * \c CXTranslationUnit.
     * <p>
     * \returns Zero on success, otherwise returns an error code.
     */
    @Generated
    @CFunction
    public static native int clang_createTranslationUnit2(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String ast_filename,
            Ptr<CXTranslationUnit> out_TU);

    /**
     * Parse the given source file and the translation unit corresponding
     * to that file.
     * <p>
     * This routine is the main entry point for the Clang C API, providing the
     * ability to parse a source file into a translation unit that can then be
     * queried by other functions in the API. This routine accepts a set of
     * command-line arguments so that the compilation can be configured in the same
     * way that the compiler is configured on the command line.
     * <p>
     * \param CIdx The index object with which the translation unit will be
     * associated.
     * <p>
     * \param source_filename The name of the source file to load, or NULL if the
     * source file is included in \c command_line_args.
     * <p>
     * \param command_line_args The command-line arguments that would be
     * passed to the \c clang executable if it were being invoked out-of-process.
     * These command-line options will be parsed and will affect how the translation
     * unit is parsed. Note that the following options are ignored: '-c',
     * '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
     * <p>
     * \param num_command_line_args The number of command-line arguments in
     * \c command_line_args.
     * <p>
     * \param unsaved_files the files that have not yet been saved to disk
     * but may be required for parsing, including the contents of
     * those files.  The contents and name of these files (as specified by
     * CXUnsavedFile) are copied when necessary, so the client only needs to
     * guarantee their validity until the call to this function returns.
     * <p>
     * \param num_unsaved_files the number of unsaved file entries in \p
     * unsaved_files.
     * <p>
     * \param options A bitmask of options that affects how the translation unit
     * is managed but not its compilation. This should be a bitwise OR of the
     * CXTranslationUnit_XXX flags.
     * <p>
     * \param[out] out_TU A non-NULL pointer to store the created
     * \c CXTranslationUnit, describing the parsed code and containing any
     * diagnostics produced by the compiler.
     * <p>
     * \returns Zero on success, otherwise returns an error code.
     */
    @Generated
    @CFunction
    public static native int clang_parseTranslationUnit2(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
            int num_command_line_args,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, int options, Ptr<CXTranslationUnit> out_TU);

    /**
     * Returns the number of template arguments for given template
     * specialization, or -1 if type \c T is not a template specialization.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getNumTemplateArguments(@ByValue CXType T);

    /**
     * Returns the type template argument of a template class specialization
     * at given index.
     * <p>
     * This function only returns template type arguments and does not handle
     * template template arguments or variadic packs.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getTemplateArgumentAsType(@ByValue CXType T, int i);

    /**
     * Given a CXFile header file, return the module that contains it, if one
     * exists.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getModuleForFile(CXTranslationUnit arg1, VoidPtr arg2);

    /**
     * \param Module a module object.
     * <p>
     * \returns non-zero if the module is a system one.
     */
    @Generated
    @CFunction
    public static native int clang_Module_isSystem(VoidPtr Module);

    /**
     * Determine if a C++ member function or member function template is
     * declared 'const'.
     */
    @Generated
    @CFunction
    public static native int clang_CXXMethod_isConst(@ByValue CXCursor C);

    /**
     * Returns non-zero if the \c file1 and \c file2 point to the same file,
     * or they are both NULL.
     */
    @Generated
    @CFunction
    public static native int clang_File_isEqual(VoidPtr file1, VoidPtr file2);

    /**
     * Returns the number of template args of a function decl representing a
     * template specialization.
     * <p>
     * If the argument cursor cannot be converted into a template function
     * declaration, -1 is returned.
     * <p>
     * For example, for the following declaration and specialization:
     * template <typename T, int kInt, bool kBool>
     * void foo() { ... }
     * <p>
     * template <>
     * void foo<float, -7, true>();
     * <p>
     * The value 3 would be returned from this call.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getNumTemplateArguments(@ByValue CXCursor C);

    /**
     * Retrieve the kind of the I'th template argument of the CXCursor C.
     * <p>
     * If the argument CXCursor does not represent a FunctionDecl, an invalid
     * template argument kind is returned.
     * <p>
     * For example, for the following declaration and specialization:
     * template <typename T, int kInt, bool kBool>
     * void foo() { ... }
     * <p>
     * template <>
     * void foo<float, -7, true>();
     * <p>
     * For I = 0, 1, and 2, Type, Integral, and Integral will be returned,
     * respectively.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getTemplateArgumentKind(@ByValue CXCursor C, int I);

    /**
     * Retrieve a CXType representing the type of a TemplateArgument of a
     * function decl representing a template specialization.
     * <p>
     * If the argument CXCursor does not represent a FunctionDecl whose I'th
     * template argument has a kind of CXTemplateArgKind_Integral, an invalid type
     * is returned.
     * <p>
     * For example, for the following declaration and specialization:
     * template <typename T, int kInt, bool kBool>
     * void foo() { ... }
     * <p>
     * template <>
     * void foo<float, -7, true>();
     * <p>
     * If called with I = 0, "float", will be returned.
     * Invalid types will be returned for I == 1 or 2.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Cursor_getTemplateArgumentType(@ByValue CXCursor C, int I);

    /**
     * Retrieve the value of an Integral TemplateArgument (of a function
     * decl representing a template specialization) as a signed long long.
     * <p>
     * It is undefined to call this function on a CXCursor that does not represent a
     * FunctionDecl or whose I'th template argument is not an integral value.
     * <p>
     * For example, for the following declaration and specialization:
     * template <typename T, int kInt, bool kBool>
     * void foo() { ... }
     * <p>
     * template <>
     * void foo<float, -7, true>();
     * <p>
     * If called with I = 1 or 2, -7 or true will be returned, respectively.
     * For I == 0, this function's behavior is undefined.
     */
    @Generated
    @CFunction
    public static native long clang_Cursor_getTemplateArgumentValue(@ByValue CXCursor C, int I);

    /**
     * Retrieve the value of an Integral TemplateArgument (of a function
     * decl representing a template specialization) as an unsigned long long.
     * <p>
     * It is undefined to call this function on a CXCursor that does not represent a
     * FunctionDecl or whose I'th template argument is not an integral value.
     * <p>
     * For example, for the following declaration and specialization:
     * template <typename T, int kInt, bool kBool>
     * void foo() { ... }
     * <p>
     * template <>
     * void foo<float, 2147483649, true>();
     * <p>
     * If called with I = 1 or 2, 2147483649 or true will be returned, respectively.
     * For I == 0, this function's behavior is undefined.
     */
    @Generated
    @CFunction
    public static native long clang_Cursor_getTemplateArgumentUnsignedValue(@ByValue CXCursor C, int I);

    /**
     * Returns the storage class for a function or variable declaration.
     * <p>
     * If the passed in Cursor is not a function or variable declaration,
     * CX_SC_Invalid is returned else the storage class.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_getStorageClass(@ByValue CXCursor arg1);

    /**
     * Retrieve the CXString representing the mangled name of the cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getMangling(@ByValue CXCursor arg1);

    /**
     * free memory allocated by libclang, such as the buffer returned by
     * \c CXVirtualFileOverlay() or \c clang_ModuleMapDescriptor_writeToBuffer().
     * <p>
     * \param buffer memory pointer to free.
     */
    @Generated
    @CFunction
    public static native void clang_free(VoidPtr buffer);

    /**
     * Returns non-zero if \p C refers to an inlined function.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isInlined(@ByValue CXCursor cursor);

    /**
     * Determine whether a CXType is a signed integer type.
     */
    @Generated
    @CFunction
    public static native int clang_isSignedIntegerType(@ByValue CXType CT);

    /**
     * Determine whether a CXType is an unsigned integer type.
     */
    @Generated
    @CFunction
    public static native int clang_isUnsignedIntegerType(@ByValue CXType CT);

    /**
     * Determine whether a CXType is a signed integer or enum type.
     */
    @Generated
    @CFunction
    public static native int clang_isSignedIntegerOrEnumerationType(@ByValue CXType CT);

    /**
     * Determine whether a CXType is an unsigned integer or enum type.
     */
    @Generated
    @CFunction
    public static native int clang_isUnsignedIntegerOrEnumerationType(@ByValue CXType CT);

    /**
     * Return the offset of the field represented by the Cursor.
     * <p>
     * If the cursor is not a field declaration, -1 is returned.
     * If the cursor semantic parent is not a record field declaration,
     * CXTypeLayoutError_Invalid is returned.
     * If the field's type declaration is an incomplete type,
     * CXTypeLayoutError_Incomplete is returned.
     * If the field's type declaration is a dependent type,
     * CXTypeLayoutError_Dependent is returned.
     * If the field's name S is not found,
     * CXTypeLayoutError_InvalidFieldName is returned.
     */
    @Generated
    @CFunction
    public static native long clang_Cursor_getOffsetOfField(@ByValue CXCursor C);

    /**
     * Determine whether the given cursor represents an anonymous
     * tag or namespace
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isAnonymous(@ByValue CXCursor C);

    /**
     * Returns non-zero if the cursor specifies an Objective-C type which is
     * a "kindof" type.
     */
    @Generated
    @CFunction
    public static native int clang_Type_isObjCKindOf(@ByValue CXType T);

    /**
     * Returns the number of Objective-C protocols of a Objective-C type
     * specialization, or -1 if type \c T is not an Objective-C type specialization.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getNumObjCProtocols(@ByValue CXType T);

    /**
     * Returns the cursor of the Objective-C protocol declaration at given
     * index.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_Type_getObjCProtocolAsCursor(@ByValue CXType T, int i);

    /**
     * Visit the fields of a particular type.
     * <p>
     * This function visits all the direct fields of the given cursor,
     * invoking the given \p visitor function with the cursors of each
     * visited field. The traversal may be ended prematurely, if
     * the visitor returns \c CXFieldVisit_Break.
     * <p>
     * \param T the record type whose field may be visited.
     * <p>
     * \param visitor the visitor function that will be invoked for each
     * field of \p T.
     * <p>
     * \param client_data pointer data supplied by the client, which will
     * be passed to the visitor each time it is invoked.
     * <p>
     * \returns a non-zero value if the traversal was terminated
     * prematurely by the visitor returning \c CXFieldVisit_Break.
     */
    @Generated
    @CFunction
    public static native int clang_Type_visitFields(@ByValue CXType T,
            @FunctionPtr(name = "call_clang_Type_visitFields") Function_clang_Type_visitFields visitor,
            VoidPtr client_data);

    /**
     * @}
     */
    @Generated
    @CFunction
    public static native void clang_forceDisableCrashRecovery();

    @Generated
    @CFunction
    public static native void clang_forceSetNoThreads();

    /**
     * Retrieve the same type by stripping nullability attributes.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_getTypeByStrippingOuterNullability(@ByValue CXType T);

    /**
     * Retrieve the same type by stripping Objective-C kindof attribute.
     */
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

    /**
     * Returns the evaluated value for a variable declaration.
     * <p>
     * If the cursor is not a variable
     */
    @Generated
    @CFunction
    public static native int clang_cursor_getEvaluatedValue(@ByValue CXCursor arg1, LongPtr arg2);

    /**
     * Free the given string set.
     */
    @Generated
    @CFunction
    public static native void clang_disposeStringSet(
            @UncertainArgument("Options: reference, array Fallback: reference") CXStringSet set);

    /**
     * Same as clang_parseTranslationUnit2 but requires a full command line
     * for \c command_line_args including argv[0]. This is useful if the standard
     * library paths are relative to the binary.
     */
    @Generated
    @CFunction
    public static native int clang_parseTranslationUnit2FullArgv(VoidPtr CIdx,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
            int num_command_line_args,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, int options, Ptr<CXTranslationUnit> out_TU);

    /**
     * Determine whether the given cursor has any attributes.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_hasAttrs(@ByValue CXCursor C);

    /**
     * Describe the visibility of the entity referred to by a cursor.
     * <p>
     * This returns the default visibility if not explicitly specified by
     * a visibility attribute. The default visibility may be changed by
     * commandline arguments.
     * <p>
     * \param cursor The cursor to query.
     * <p>
     * \returns The visibility of the cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorVisibility(@ByValue CXCursor cursor);

    /**
     * Determine whether a  CXCursor that is a macro, is
     * function like.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isMacroFunctionLike(@ByValue CXCursor C);

    /**
     * Determine whether a  CXCursor that is a macro, is a
     * builtin one.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isMacroBuiltin(@ByValue CXCursor C);

    /**
     * Determine whether a  CXCursor that is a function declaration, is an
     * inline declaration.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isFunctionInlined(@ByValue CXCursor C);

    /**
     * Returns the Objective-C type encoding for the specified CXType.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Type_getObjCEncoding(@ByValue CXType type);

    /**
     * Retrieve the CXStrings representing the mangled symbols of the C++
     * constructor or destructor at the cursor.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXStringSet clang_Cursor_getCXXManglings(@ByValue CXCursor arg1);

    /**
     * Determine if a C++ constructor is a converting constructor.
     */
    @Generated
    @CFunction
    public static native int clang_CXXConstructor_isConvertingConstructor(@ByValue CXCursor C);

    /**
     * Determine if a C++ constructor is a copy constructor.
     */
    @Generated
    @CFunction
    public static native int clang_CXXConstructor_isCopyConstructor(@ByValue CXCursor C);

    /**
     * Determine if a C++ constructor is the default constructor.
     */
    @Generated
    @CFunction
    public static native int clang_CXXConstructor_isDefaultConstructor(@ByValue CXCursor C);

    /**
     * Determine if a C++ constructor is a move constructor.
     */
    @Generated
    @CFunction
    public static native int clang_CXXConstructor_isMoveConstructor(@ByValue CXCursor C);

    /**
     * Determine if a C++ field is declared 'mutable'.
     */
    @Generated
    @CFunction
    public static native int clang_CXXField_isMutable(@ByValue CXCursor C);

    /**
     * Determine if a C++ method is declared '= default'.
     */
    @Generated
    @CFunction
    public static native int clang_CXXMethod_isDefaulted(@ByValue CXCursor C);

    /**
     * If cursor is a statement declaration tries to evaluate the
     * statement and if its variable, tries to evaluate its initializer,
     * into its corresponding type.
     * If it's an expression, tries to evaluate the expression.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_Cursor_Evaluate(@ByValue CXCursor C);

    /**
     * Returns the kind of the evaluated result.
     */
    @Generated
    @CFunction
    public static native int clang_EvalResult_getKind(VoidPtr E);

    /**
     * Returns the evaluation result as integer if the
     * kind is Int.
     */
    @Generated
    @CFunction
    public static native int clang_EvalResult_getAsInt(VoidPtr E);

    /**
     * Returns the evaluation result as double if the
     * kind is double.
     */
    @Generated
    @CFunction
    public static native double clang_EvalResult_getAsDouble(VoidPtr E);

    /**
     * Returns the evaluation result as a constant string if the
     * kind is other than Int or float. User must not free this pointer,
     * instead call clang_EvalResult_dispose on the CXEvalResult returned
     * by clang_Cursor_Evaluate.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String clang_EvalResult_getAsStr(VoidPtr E);

    /**
     * Disposes the created Eval memory.
     */
    @Generated
    @CFunction
    public static native void clang_EvalResult_dispose(VoidPtr E);

    /**
     * Same as clang_indexSourceFile but requires a full command line
     * for \c command_line_args including argv[0]. This is useful if the standard
     * library paths are relative to the binary.
     */
    @Generated
    @CFunction
    public static native int clang_indexSourceFileFullArgv(VoidPtr arg1, VoidPtr client_data,
            @UncertainArgument("Options: reference, array Fallback: reference") IndexerCallbacks index_callbacks,
            int index_callbacks_size, int index_options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String source_filename,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] command_line_args,
            int num_command_line_args,
            @UncertainArgument("Options: reference, array Fallback: reference") CXUnsavedFile unsaved_files,
            int num_unsaved_files, Ptr<CXTranslationUnit> out_TU, int TU_options);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_clang_visitChildren {
        @Generated
        int call_clang_visitChildren(@ByValue CXCursor arg0, @ByValue CXCursor arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_clang_visitChildrenWithBlock {
        @Generated
        int call_clang_visitChildrenWithBlock(@ByValue CXCursor cursor, @ByValue CXCursor parent);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_clang_executeOnThread {
        @Generated
        void call_clang_executeOnThread(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_clang_getInclusions {
        @Generated
        void call_clang_getInclusions(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CXSourceLocation arg1, int arg2,
                VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_clang_findReferencesInFileWithBlock {
        @Generated
        int call_clang_findReferencesInFileWithBlock(@ByValue CXCursor arg0, @ByValue CXSourceRange arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_clang_findIncludesInFileWithBlock {
        @Generated
        int call_clang_findIncludesInFileWithBlock(@ByValue CXCursor arg0, @ByValue CXSourceRange arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_clang_Type_visitFields {
        @Generated
        int call_clang_Type_visitFields(@ByValue CXCursor arg0, VoidPtr arg1);
    }

    /**
     * Sets the invocation emission path option in a CXIndex.
     * <p>
     * The invocation emission path specifies a path which will contain log
     * files for certain libclang invocations. A null value (default) implies that
     * libclang invocations are not logged..
     */
    @Generated
    @CFunction
    public static native void clang_CXIndex_setInvocationEmissionPathOption(VoidPtr arg1,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String Path);

    /**
     * Retrieve the buffer associated with the given file.
     * <p>
     * \param tu the translation unit
     * <p>
     * \param file the file for which to retrieve the buffer.
     * <p>
     * \param size [out] if non-NULL, will be set to the size of the buffer.
     * <p>
     * \returns a pointer to the buffer in memory that holds the contents of
     * \p file, or a NULL pointer when the file is not loaded.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String clang_getFileContents(CXTranslationUnit tu, VoidPtr file, LongPtr size);

    /**
     * Returns the real path name of \c file.
     * <p>
     * An empty string may be returned. Use \c clang_getFileName() in that case.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_File_tryGetRealPathName(VoidPtr file);

    /**
     * Retrieve all ranges from all files that were skipped by the
     * preprocessor.
     * <p>
     * The preprocessor will skip lines when they are surrounded by an
     * if/ifdef/ifndef directive whose condition does not evaluate to true.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXSourceRangeList clang_getAllSkippedRanges(CXTranslationUnit tu);

    /**
     * Suspend a translation unit in order to free memory associated with it.
     * <p>
     * A suspended translation unit uses significantly less memory but on the other
     * side does not support any other calls than \c clang_reparseTranslationUnit
     * to resume it or \c clang_disposeTranslationUnit to dispose it completely.
     */
    @Generated
    @CFunction
    public static native int clang_suspendTranslationUnit(CXTranslationUnit arg1);

    /**
     * Get target information for this translation unit.
     * <p>
     * The CXTargetInfo object cannot outlive the CXTranslationUnit object.
     */
    @Generated
    @CFunction
    public static native CXTargetInfo clang_getTranslationUnitTargetInfo(CXTranslationUnit CTUnit);

    /**
     * Destroy the CXTargetInfo object.
     */
    @Generated
    @CFunction
    public static native void clang_TargetInfo_dispose(CXTargetInfo Info);

    /**
     * Get the normalized target triple as a string.
     * <p>
     * Returns the empty string in case of any error.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_TargetInfo_getTriple(CXTargetInfo Info);

    /**
     * Get the pointer width of the target in bits.
     * <p>
     * Returns -1 in case of error.
     */
    @Generated
    @CFunction
    public static native int clang_TargetInfo_getPointerWidth(CXTargetInfo Info);

    /**
     * Determine whether the given declaration is invalid.
     * <p>
     * A declaration is invalid if it could not be parsed successfully.
     * <p>
     * \returns non-zero if the cursor represents a declaration and it is
     * invalid, otherwise NULL.
     */
    @Generated
    @CFunction
    public static native int clang_isInvalidDeclaration(@ByValue CXCursor arg1);

    /**
     * If cursor refers to a variable declaration and it has initializer returns
     * cursor referring to the initializer otherwise return null cursor.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_Cursor_getVarDeclInitializer(@ByValue CXCursor cursor);

    /**
     * If cursor refers to a variable declaration that has global storage returns 1.
     * If cursor refers to a variable declaration that doesn't have global storage
     * returns 0. Otherwise returns -1.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_hasVarDeclGlobalStorage(@ByValue CXCursor cursor);

    /**
     * If cursor refers to a variable declaration that has external storage
     * returns 1. If cursor refers to a variable declaration that doesn't have
     * external storage returns 0. Otherwise returns -1.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_hasVarDeclExternalStorage(@ByValue CXCursor cursor);

    /**
     * Determine the "thread-local storage (TLS) kind" of the declaration
     * referred to by a cursor.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorTLSKind(@ByValue CXCursor cursor);

    /**
     * Returns the address space of the given type.
     */
    @Generated
    @CFunction
    public static native int clang_getAddressSpace(@ByValue CXType T);

    /**
     * Returns the typedef name of the given type.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getTypedefName(@ByValue CXType CT);

    /**
     * Retrieve the exception specification type associated with a function type.
     * This is a value of type CXCursor_ExceptionSpecificationKind.
     * <p>
     * If a non-function type is passed in, an error code of -1 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_getExceptionSpecificationType(@ByValue CXType T);

    /**
     * Retrieves the base type of the ObjCObjectType.
     * <p>
     * If the type is not an ObjC object, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getObjCObjectBaseType(@ByValue CXType T);

    /**
     * Retrieve the number of protocol references associated with an ObjC object/id.
     * <p>
     * If the type is not an ObjC object, 0 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getNumObjCProtocolRefs(@ByValue CXType T);

    /**
     * Retrieve the decl for a protocol reference for an ObjC object/id.
     * <p>
     * If the type is not an ObjC object or there are not enough protocol
     * references, an invalid cursor is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXCursor clang_Type_getObjCProtocolDecl(@ByValue CXType T, int i);

    /**
     * Retrieve the number of type arguments associated with an ObjC object.
     * <p>
     * If the type is not an ObjC object, 0 is returned.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getNumObjCTypeArgs(@ByValue CXType T);

    /**
     * Retrieve a type argument associated with an ObjC object.
     * <p>
     * If the type is not an ObjC or the index is not valid,
     * an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getObjCTypeArg(@ByValue CXType T, int i);

    /**
     * Retrieve the exception specification type associated with a given cursor.
     * This is a value of type CXCursor_ExceptionSpecificationKind.
     * <p>
     * This only returns a valid result if the cursor refers to a function or
     * method.
     */
    @Generated
    @CFunction
    public static native int clang_getCursorExceptionSpecificationType(@ByValue CXCursor C);

    /**
     * Determine if a typedef is 'transparent' tag.
     * <p>
     * A typedef is considered 'transparent' if it shares a name and spelling
     * location with its underlying tag type, as is the case with the NS_ENUM macro.
     * <p>
     * \returns non-zero if transparent and zero otherwise.
     */
    @Generated
    @CFunction
    public static native int clang_Type_isTransparentTagTypedef(@ByValue CXType T);

    /**
     * Retrieve the nullability kind of a pointer type.
     */
    @Generated
    @CFunction
    public static native int clang_Type_getNullability(@ByValue CXType T);

    /**
     * Return the type that was modified by this attributed type.
     * <p>
     * If the type is not an attributed type, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getModifiedType(@ByValue CXType T);

    /**
     * Gets the type contained by this atomic type.
     * <p>
     * If a non-atomic type is passed in, an invalid type is returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXType clang_Type_getValueType(@ByValue CXType CT);

    /**
     * Determine whether the given cursor represents an anonymous record
     * declaration.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isAnonymousRecordDecl(@ByValue CXCursor C);

    /**
     * Determine whether the given cursor represents an inline namespace
     * declaration.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isInlineNamespace(@ByValue CXCursor C);

    /**
     * Get a property value for the given printing policy.
     */
    @Generated
    @CFunction
    public static native int clang_PrintingPolicy_getProperty(VoidPtr Policy, int Property);

    /**
     * Set a property value for the given printing policy.
     */
    @Generated
    @CFunction
    public static native void clang_PrintingPolicy_setProperty(VoidPtr Policy, int Property, int Value);

    /**
     * Retrieve the default policy for the cursor.
     * <p>
     * The policy should be released after use with \c
     * clang_PrintingPolicy_dispose.
     */
    @Generated
    @CFunction
    public static native VoidPtr clang_getCursorPrintingPolicy(@ByValue CXCursor arg1);

    /**
     * Release a printing policy.
     */
    @Generated
    @CFunction
    public static native void clang_PrintingPolicy_dispose(VoidPtr Policy);

    /**
     * Pretty print declarations.
     * <p>
     * \param Cursor The cursor representing a declaration.
     * <p>
     * \param Policy The policy to control the entities being printed. If
     * NULL, a default policy is used.
     * <p>
     * \returns The pretty printed declaration or the empty string for
     * other cursors.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCursorPrettyPrinted(@ByValue CXCursor Cursor, VoidPtr Policy);

    /**
     * Given a cursor that represents a property declaration, return the
     * name of the method that implements the getter.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getObjCPropertyGetterName(@ByValue CXCursor C);

    /**
     * Given a cursor that represents a property declaration, return the
     * name of the method that implements the setter, if any.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_Cursor_getObjCPropertySetterName(@ByValue CXCursor C);

    /**
     * Returns non-zero if the given cursor points to a symbol marked with
     * external_source_symbol attribute.
     * <p>
     * \param language If non-NULL, and the attribute is present, will be set to
     * the 'language' string from the attribute.
     * <p>
     * \param definedIn If non-NULL, and the attribute is present, will be set to
     * the 'definedIn' string from the attribute.
     * <p>
     * \param isGenerated If non-NULL, and the attribute is present, will be set to
     * non-zero if the 'generated_declaration' is set in the attribute.
     */
    @Generated
    @CFunction
    public static native int clang_Cursor_isExternalSymbol(@ByValue CXCursor C,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString language,
            @UncertainArgument("Options: reference, array Fallback: reference") CXString definedIn, IntPtr isGenerated);

    /**
     * Retrieve the CXStrings representing the mangled symbols of the ObjC
     * class interface or implementation at the cursor.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXStringSet clang_Cursor_getObjCManglings(@ByValue CXCursor arg1);

    /**
     * Determine if a C++ record is abstract, i.e. whether a class or struct
     * has a pure virtual member function.
     */
    @Generated
    @CFunction
    public static native int clang_CXXRecord_isAbstract(@ByValue CXCursor C);

    /**
     * Determine if an enum declaration refers to a scoped enum.
     */
    @Generated
    @CFunction
    public static native int clang_EnumDecl_isScoped(@ByValue CXCursor C);

    /**
     * Get the raw lexical token starting with the given location.
     * <p>
     * \param TU the translation unit whose text is being tokenized.
     * <p>
     * \param Location the source location with which the token starts.
     * <p>
     * \returns The token starting with the given location or NULL if no such token
     * exist. The returned pointer must be freed with clang_disposeTokens before the
     * translation unit is destroyed.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CXToken clang_getToken(CXTranslationUnit TU, @ByValue CXSourceLocation Location);

    /**
     * Retrieve the number of fix-its for the given completion index.
     * <p>
     * Calling this makes sense only if CXCodeComplete_IncludeCompletionsWithFixIts
     * option was set.
     * <p>
     * \param results The structure keeping all completion results
     * <p>
     * \param completion_index The index of the completion
     * <p>
     * \return The number of fix-its which must be applied before the completion at
     * completion_index can be applied
     */
    @Generated
    @CFunction
    public static native int clang_getCompletionNumFixIts(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults results,
            int completion_index);

    /**
     * Fix-its that *must* be applied before inserting the text for the
     * corresponding completion.
     * <p>
     * By default, clang_codeCompleteAt() only returns completions with empty
     * fix-its. Extra completions with non-empty fix-its should be explicitly
     * requested by setting CXCodeComplete_IncludeCompletionsWithFixIts.
     * <p>
     * For the clients to be able to compute position of the cursor after applying
     * fix-its, the following conditions are guaranteed to hold for
     * replacement_range of the stored fix-its:
     * - Ranges in the fix-its are guaranteed to never contain the completion
     * point (or identifier under completion point, if any) inside them, except
     * at the start or at the end of the range.
     * - If a fix-it range starts or ends with completion point (or starts or
     * ends after the identifier under completion point), it will contain at
     * least one character. It allows to unambiguously recompute completion
     * point after applying the fix-it.
     * <p>
     * The intuition is that provided fix-its change code around the identifier we
     * complete, but are not allowed to touch the identifier itself or the
     * completion point. One example of completions with corrections are the ones
     * replacing '.' with '->' and vice versa:
     * <p>
     * std::unique_ptr<std::vector<int>> vec_ptr;
     * In 'vec_ptr.^', one of the completions is 'push_back', it requires
     * replacing '.' with '->'.
     * In 'vec_ptr->^', one of the completions is 'release', it requires
     * replacing '->' with '.'.
     * <p>
     * \param results The structure keeping all completion results
     * <p>
     * \param completion_index The index of the completion
     * <p>
     * \param fixit_index The index of the fix-it for the completion at
     * completion_index
     * <p>
     * \param replacement_range The fix-it range that must be replaced before the
     * completion at completion_index can be applied
     * <p>
     * \returns The fix-it string that must replace the code at replacement_range
     * before the completion at completion_index can be applied
     */
    @Generated
    @CFunction
    @ByValue
    public static native CXString clang_getCompletionFixIt(
            @UncertainArgument("Options: reference, array Fallback: reference") CXCodeCompleteResults results,
            int completion_index, int fixit_index,
            @UncertainArgument("Options: reference, array Fallback: reference") CXSourceRange replacement_range);

    /**
     * Returns the evaluation result as a long long integer if the
     * kind is Int. This prevents overflows that may happen if the result is
     * returned with clang_EvalResult_getAsInt.
     */
    @Generated
    @CFunction
    public static native long clang_EvalResult_getAsLongLong(VoidPtr E);

    /**
     * Returns a non-zero value if the kind is Int and the evaluation
     * result resulted in an unsigned integer.
     */
    @Generated
    @CFunction
    public static native int clang_EvalResult_isUnsignedInt(VoidPtr E);

    /**
     * Returns the evaluation result as an unsigned integer if
     * the kind is Int and clang_EvalResult_isUnsignedInt is non-zero.
     */
    @Generated
    @CFunction
    public static native long clang_EvalResult_getAsUnsigned(VoidPtr E);
}
