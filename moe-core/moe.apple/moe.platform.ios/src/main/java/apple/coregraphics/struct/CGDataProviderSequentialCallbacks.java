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

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class CGDataProviderSequentialCallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CGDataProviderSequentialCallbacks() {
        super(CGDataProviderSequentialCallbacks.class);
    }

    @Generated
    protected CGDataProviderSequentialCallbacks(Pointer peer) {
        super(peer);
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
    @FunctionPtr(name = "call_getBytes")
    public native Function_getBytes getBytes();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGetBytes(@Nullable @FunctionPtr(name = "call_getBytes") Function_getBytes value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_skipForward")
    public native Function_skipForward skipForward();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSkipForward(@Nullable @FunctionPtr(name = "call_skipForward") Function_skipForward value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_rewind")
    public native Function_rewind rewind();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRewind(@Nullable @FunctionPtr(name = "call_rewind") Function_rewind value);

    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_releaseInfo")
    public native Function_releaseInfo releaseInfo();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setReleaseInfo(@Nullable @FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getBytes {
        @Generated
        @NUInt
        long call_getBytes(@Nullable VoidPtr arg0, @NotNull VoidPtr arg1, @NUInt long arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_skipForward {
        @Generated
        long call_skipForward(@Nullable VoidPtr arg0, long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_rewind {
        @Generated
        void call_rewind(@Nullable VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_releaseInfo {
        @Generated
        void call_releaseInfo(@Nullable VoidPtr arg0);
    }
}
