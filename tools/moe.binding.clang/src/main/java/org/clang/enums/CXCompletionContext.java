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
 * Bits that represent the context under which completion is occurring.
 * <p>
 * The enumerators in this enumeration may be bitwise-OR'd together if multiple
 * contexts are occurring simultaneously.
 */
@Generated
public final class CXCompletionContext {
    /**
     * The context for completions is unexposed, as only Clang results
     * should be included. (This is equivalent to having no context bits set.)
     */
    @Generated public static final int Unexposed = 0x00000000;
    /**
     * Completions for any possible type should be included in the results.
     */
    @Generated public static final int AnyType = 0x00000001;
    /**
     * Completions for any possible value (variables, function calls, etc.)
     * should be included in the results.
     */
    @Generated public static final int AnyValue = 0x00000002;
    /**
     * Completions for values that resolve to an Objective-C object should
     * be included in the results.
     */
    @Generated public static final int ObjCObjectValue = 0x00000004;
    /**
     * Completions for values that resolve to an Objective-C selector
     * should be included in the results.
     */
    @Generated public static final int ObjCSelectorValue = 0x00000008;
    /**
     * Completions for values that resolve to a C++ class type should be
     * included in the results.
     */
    @Generated public static final int CXXClassTypeValue = 0x00000010;
    /**
     * Completions for fields of the member being accessed using the dot
     * operator should be included in the results.
     */
    @Generated public static final int DotMemberAccess = 0x00000020;
    /**
     * Completions for fields of the member being accessed using the arrow
     * operator should be included in the results.
     */
    @Generated public static final int ArrowMemberAccess = 0x00000040;
    /**
     * Completions for properties of the Objective-C object being accessed
     * using the dot operator should be included in the results.
     */
    @Generated public static final int ObjCPropertyAccess = 0x00000080;
    /**
     * Completions for enum tags should be included in the results.
     */
    @Generated public static final int EnumTag = 0x00000100;
    /**
     * Completions for union tags should be included in the results.
     */
    @Generated public static final int UnionTag = 0x00000200;
    /**
     * Completions for struct tags should be included in the results.
     */
    @Generated public static final int StructTag = 0x00000400;
    /**
     * Completions for C++ class names should be included in the results.
     */
    @Generated public static final int ClassTag = 0x00000800;
    /**
     * Completions for C++ namespaces and namespace aliases should be
     * included in the results.
     */
    @Generated public static final int Namespace = 0x00001000;
    /**
     * Completions for C++ nested name specifiers should be included in
     * the results.
     */
    @Generated public static final int NestedNameSpecifier = 0x00002000;
    /**
     * Completions for Objective-C interfaces (classes) should be included
     * in the results.
     */
    @Generated public static final int ObjCInterface = 0x00004000;
    /**
     * Completions for Objective-C protocols should be included in
     * the results.
     */
    @Generated public static final int ObjCProtocol = 0x00008000;
    /**
     * Completions for Objective-C categories should be included in
     * the results.
     */
    @Generated public static final int ObjCCategory = 0x00010000;
    /**
     * Completions for Objective-C instance messages should be included
     * in the results.
     */
    @Generated public static final int ObjCInstanceMessage = 0x00020000;
    /**
     * Completions for Objective-C class messages should be included in
     * the results.
     */
    @Generated public static final int ObjCClassMessage = 0x00040000;
    /**
     * Completions for Objective-C selector names should be included in
     * the results.
     */
    @Generated public static final int ObjCSelectorName = 0x00080000;
    /**
     * Completions for preprocessor macro names should be included in
     * the results.
     */
    @Generated public static final int MacroName = 0x00100000;
    /**
     * Natural language completions should be included in the results.
     */
    @Generated public static final int NaturalLanguage = 0x00200000;
    /**
     * The current context is unknown, so set all contexts.
     */
    @Generated public static final int Unknown = 0x007FFFFF;

    @Generated
    private CXCompletionContext() {
    }

    /**
     * #include file completions should be included in the results.
     */
    @Generated public static final int IncludedFile = 0x00400000;
}
