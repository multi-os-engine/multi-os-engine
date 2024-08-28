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

package apple.coregraphics.struct;

import apple.coregraphics.opaque.CGContextRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class CGPatternCallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CGPatternCallbacks() {
        super(CGPatternCallbacks.class);
    }

    @Generated
    protected CGPatternCallbacks(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGPatternCallbacks(int version,
            @FunctionPtr(name = "call_drawPattern") @Nullable Function_drawPattern drawPattern,
            @FunctionPtr(name = "call_releaseInfo") @Nullable Function_releaseInfo releaseInfo) {
        super(CGPatternCallbacks.class);
        setVersion(version);
        setDrawPattern(drawPattern);
        setReleaseInfo(releaseInfo);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_drawPattern")
    public native Function_drawPattern drawPattern();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDrawPattern(@Nullable @FunctionPtr(name = "call_drawPattern") Function_drawPattern value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_releaseInfo")
    public native Function_releaseInfo releaseInfo();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setReleaseInfo(@Nullable @FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_drawPattern {
        @Generated
        void call_drawPattern(@Nullable VoidPtr arg0, @Nullable CGContextRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_releaseInfo {
        @Generated
        void call_releaseInfo(@Nullable VoidPtr arg0);
    }
}
