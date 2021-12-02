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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXIdxImportedASTFileInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxImportedASTFileInfo() {
        super(CXIdxImportedASTFileInfo.class);
    }

    @Generated
    protected CXIdxImportedASTFileInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXIdxImportedASTFileInfo(VoidPtr file, VoidPtr module, @ByValue CXIdxLoc loc, int isImplicit) {
        super(CXIdxImportedASTFileInfo.class);
        setFile(file);
        setModule(module);
        setLoc(loc);
        setIsImplicit(isImplicit);
    }

    /**
     * Top level AST file containing the imported PCH, module or submodule.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr file();

    /**
     * Top level AST file containing the imported PCH, module or submodule.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFile(VoidPtr value);

    /**
     * The imported module or NULL if the AST file is a PCH.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr module();

    /**
     * The imported module or NULL if the AST file is a PCH.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setModule(VoidPtr value);

    /**
     * Location where the file is imported. Applicable only for modules.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CXIdxLoc loc();

    /**
     * Location where the file is imported. Applicable only for modules.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLoc(@ByValue CXIdxLoc value);

    /**
     * Non-zero if an inclusion directive was automatically turned into
     * a module import. Applicable only for modules.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int isImplicit();

    /**
     * Non-zero if an inclusion directive was automatically turned into
     * a module import. Applicable only for modules.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIsImplicit(int value);
}
