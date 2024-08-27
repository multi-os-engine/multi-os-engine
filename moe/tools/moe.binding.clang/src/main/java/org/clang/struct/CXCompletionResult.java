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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXCompletionResult extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXCompletionResult() {
        super(CXCompletionResult.class);
    }

    @Generated
    protected CXCompletionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXCompletionResult(int CursorKind, VoidPtr CompletionString) {
        super(CXCompletionResult.class);
        setCursorKind(CursorKind);
        setCompletionString(CompletionString);
    }

    /**
     * The kind of entity that this completion refers to.
     * <p>
     * The cursor kind will be a macro, keyword, or a declaration (one of the
     * *Decl cursor kinds), describing the entity that the completion is
     * referring to.
     * <p>
     * \todo In the future, we would like to provide a full cursor, to allow
     * the client to extract additional information from declaration.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int CursorKind();

    /**
     * The kind of entity that this completion refers to.
     * <p>
     * The cursor kind will be a macro, keyword, or a declaration (one of the
     * *Decl cursor kinds), describing the entity that the completion is
     * referring to.
     * <p>
     * \todo In the future, we would like to provide a full cursor, to allow
     * the client to extract additional information from declaration.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCursorKind(int value);

    /**
     * The code-completion string that describes how to insert this
     * code-completion result into the editing buffer.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr CompletionString();

    /**
     * The code-completion string that describes how to insert this
     * code-completion result into the editing buffer.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCompletionString(VoidPtr value);
}
