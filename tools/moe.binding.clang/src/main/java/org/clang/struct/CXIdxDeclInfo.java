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

import org.clang.c.clang;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstPtr;

@Generated
@Structure()
public final class CXIdxDeclInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxDeclInfo() {
        super(CXIdxDeclInfo.class);
    }

    @Generated
    protected CXIdxDeclInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXIdxEntityInfo entityInfo();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setEntityInfo(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxEntityInfo value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CXCursor cursor();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCursor(@ByValue CXCursor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CXIdxLoc loc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLoc(@ByValue CXIdxLoc value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXIdxContainerInfo semanticContainer();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSemanticContainer(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo value);

    /**
     * Generally same as #semanticContainer but can be different in
     * cases like out-of-line C++ member functions.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXIdxContainerInfo lexicalContainer();

    /**
     * Generally same as #semanticContainer but can be different in
     * cases like out-of-line C++ member functions.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLexicalContainer(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int isRedeclaration();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIsRedeclaration(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int isDefinition();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIsDefinition(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int isContainer();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setIsContainer(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CXIdxContainerInfo declAsContainer();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setDeclAsContainer(
            @UncertainArgument("Options: reference, array Fallback: reference") CXIdxContainerInfo value);

    /**
     * Whether the declaration exists in code or was created implicitly
     * by the compiler, e.g. implicit Objective-C methods for properties.
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int isImplicit();

    /**
     * Whether the declaration exists in code or was created implicitly
     * by the compiler, e.g. implicit Objective-C methods for properties.
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setIsImplicit(int value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    @ReferenceInfo(type = CXIdxAttrInfo.class, depth = 2)
    public native ConstPtr<ConstPtr<CXIdxAttrInfo>> attributes();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setAttributes(ConstPtr<ConstPtr<CXIdxAttrInfo>> value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int numAttributes();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setNumAttributes(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int flags();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setFlags(int value);

    /* Comfort java methods */
    public CXIdxObjCContainerDeclInfo getObjCContainerDeclInfo() {
        return clang.clang_index_getObjCContainerDeclInfo(this);
    }

    public CXIdxObjCInterfaceDeclInfo getObjCInterfaceDeclInfo() {
        return clang.clang_index_getObjCInterfaceDeclInfo(this);
    }

    public CXIdxObjCCategoryDeclInfo getObjCCategoryDeclInfo() {
        return clang.clang_index_getObjCCategoryDeclInfo(this);
    }

    public CXIdxObjCProtocolRefListInfo getObjCProtocolRefListInfo() {
        return clang.clang_index_getObjCProtocolRefListInfo(this);
    }

    public CXIdxObjCPropertyDeclInfo getObjCPropertyDeclInfo() {
        return clang.clang_index_getObjCPropertyDeclInfo(this);
    }
}
