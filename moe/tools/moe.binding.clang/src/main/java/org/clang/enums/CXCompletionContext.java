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

@Generated
public final class CXCompletionContext {
    @Generated public static final int Unexposed = 0x00000000;
    @Generated public static final int AnyType = 0x00000001;
    @Generated public static final int AnyValue = 0x00000002;
    @Generated public static final int ObjCObjectValue = 0x00000004;
    @Generated public static final int ObjCSelectorValue = 0x00000008;
    @Generated public static final int CXXClassTypeValue = 0x00000010;
    @Generated public static final int DotMemberAccess = 0x00000020;
    @Generated public static final int ArrowMemberAccess = 0x00000040;
    @Generated public static final int ObjCPropertyAccess = 0x00000080;
    @Generated public static final int EnumTag = 0x00000100;
    @Generated public static final int UnionTag = 0x00000200;
    @Generated public static final int StructTag = 0x00000400;
    @Generated public static final int ClassTag = 0x00000800;
    @Generated public static final int Namespace = 0x00001000;
    @Generated public static final int NestedNameSpecifier = 0x00002000;
    @Generated public static final int ObjCInterface = 0x00004000;
    @Generated public static final int ObjCProtocol = 0x00008000;
    @Generated public static final int ObjCCategory = 0x00010000;
    @Generated public static final int ObjCInstanceMessage = 0x00020000;
    @Generated public static final int ObjCClassMessage = 0x00040000;
    @Generated public static final int ObjCSelectorName = 0x00080000;
    @Generated public static final int MacroName = 0x00100000;
    @Generated public static final int NaturalLanguage = 0x00200000;
    @Generated public static final int Unknown = 0x003FFFFF;

    @Generated
    private CXCompletionContext() {
    }
}
