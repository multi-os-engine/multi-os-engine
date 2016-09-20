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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXCursorAndRangeVisitor extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXCursorAndRangeVisitor() {
        super(CXCursorAndRangeVisitor.class);
    }

    @Generated
    protected CXCursorAndRangeVisitor(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXCursorAndRangeVisitor(VoidPtr context, @FunctionPtr(name = "call_visit") Function_visit visit) {
        super(CXCursorAndRangeVisitor.class);
        setContext(context);
        setVisit(visit);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr context();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setContext(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVisit(@FunctionPtr(name = "call_visit") Function_visit value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_visit")
    public native Function_visit visit();

    @Runtime(CRuntime.class)
    @Generated
    static public interface Function_visit {
        @Generated
        public int call_visit(VoidPtr arg0, @ByValue CXCursor arg1, @ByValue CXSourceRange arg2);
    }
}
