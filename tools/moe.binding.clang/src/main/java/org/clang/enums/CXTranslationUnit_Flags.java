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

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags that control the creation of translation units.
 * <p>
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * constructing the translation unit.
 */
@Generated
public final class CXTranslationUnit_Flags {
    /**
     * Used to indicate that no special translation-unit options are
     * needed.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Used to indicate that the parser should construct a "detailed"
     * preprocessing record, including all macro definitions and instantiations.
     * <p>
     * Constructing a detailed preprocessing record requires more memory
     * and time to parse, since the information contained in the record
     * is usually not retained. However, it can be useful for
     * applications that require more detailed information about the
     * behavior of the preprocessor.
     */
    @Generated public static final int DetailedPreprocessingRecord = 0x00000001;
    /**
     * Used to indicate that the translation unit is incomplete.
     * <p>
     * When a translation unit is considered "incomplete", semantic
     * analysis that is typically performed at the end of the
     * translation unit will be suppressed. For example, this suppresses
     * the completion of tentative declarations in C and of
     * instantiation of implicitly-instantiation function templates in
     * C++. This option is typically used when parsing a header with the
     * intent of producing a precompiled header.
     */
    @Generated public static final int Incomplete = 0x00000002;
    /**
     * Used to indicate that the translation unit should be built with an
     * implicit precompiled header for the preamble.
     * <p>
     * An implicit precompiled header is used as an optimization when a
     * particular translation unit is likely to be reparsed many times
     * when the sources aren't changing that often. In this case, an
     * implicit precompiled header will be built containing all of the
     * initial includes at the top of the main file (what we refer to as
     * the "preamble" of the file). In subsequent parses, if the
     * preamble or the files in it have not changed, \c
     * clang_reparseTranslationUnit() will re-use the implicit
     * precompiled header to improve parsing performance.
     */
    @Generated public static final int PrecompiledPreamble = 0x00000004;
    /**
     * Used to indicate that the translation unit should cache some
     * code-completion results with each reparse of the source file.
     * <p>
     * Caching of code-completion results is a performance optimization that
     * introduces some overhead to reparsing but improves the performance of
     * code-completion operations.
     */
    @Generated public static final int CacheCompletionResults = 0x00000008;
    /**
     * Used to indicate that the translation unit will be serialized with
     * \c clang_saveTranslationUnit.
     * <p>
     * This option is typically used when parsing a header with the intent of
     * producing a precompiled header.
     */
    @Generated public static final int ForSerialization = 0x00000010;
    /**
     * DEPRECATED: Enabled chained precompiled preambles in C++.
     * <p>
     * Note: this is a *temporary* option that is available only while
     * we are testing C++ precompiled preamble support. It is deprecated.
     */
    @Generated public static final int CXXChainedPCH = 0x00000020;
    /**
     * Used to indicate that function/method bodies should be skipped while
     * parsing.
     * <p>
     * This option can be used to search for declarations/definitions while
     * ignoring the usages.
     */
    @Generated public static final int SkipFunctionBodies = 0x00000040;
    /**
     * Used to indicate that brief documentation comments should be
     * included into the set of code completions returned from this translation
     * unit.
     */
    @Generated public static final int IncludeBriefCommentsInCodeCompletion = 0x00000080;
    /**
     * Used to indicate that the precompiled preamble should be created on
     * the first parse. Otherwise it will be created on the first reparse. This
     * trades runtime on the first parse (serializing the preamble takes time) for
     * reduced runtime on the second parse (can now reuse the preamble).
     */
    @Generated public static final int CreatePreambleOnFirstParse = 0x00000100;
    /**
     * Do not stop processing when fatal errors are encountered.
     * <p>
     * When fatal errors are encountered while parsing a translation unit,
     * semantic analysis is typically stopped early when compiling code. A common
     * source for fatal errors are unresolvable include files. For the
     * purposes of an IDE, this is undesirable behavior and as much information
     * as possible should be reported. Use this flag to enable this behavior.
     */
    @Generated public static final int KeepGoing = 0x00000200;

    @Generated
    private CXTranslationUnit_Flags() {
    }

    /**
     * Sets the preprocessor in a mode for parsing a single file only.
     */
    @Generated public static final int SingleFileParse = 0x00000400;
    /**
     * Used in combination with CXTranslationUnit_SkipFunctionBodies to
     * constrain the skipping of function bodies to the preamble.
     * <p>
     * The function bodies of the main file are not skipped.
     */
    @Generated public static final int LimitSkipFunctionBodiesToPreamble = 0x00000800;
    /**
     * Used to indicate that attributed types should be included in CXType.
     */
    @Generated public static final int IncludeAttributedTypes = 0x00001000;
    /**
     * Used to indicate that implicit attributes should be visited.
     */
    @Generated public static final int VisitImplicitAttributes = 0x00002000;
    /**
     * Used to indicate that non-errors from included files should be ignored.
     * <p>
     * If set, clang_getDiagnosticSetFromTU() will not report e.g. warnings from
     * included files anymore. This speeds up clang_getDiagnosticSetFromTU() for
     * the case where these warnings are not of interest, as for an IDE for
     * example, which typically shows only the diagnostics in the main file.
     */
    @Generated public static final int IgnoreNonErrorsFromIncludedFiles = 0x00004000;
    /**
     * Tells the preprocessor not to skip excluded conditional blocks.
     */
    @Generated public static final int RetainExcludedConditionalBlocks = 0x00008000;
}
