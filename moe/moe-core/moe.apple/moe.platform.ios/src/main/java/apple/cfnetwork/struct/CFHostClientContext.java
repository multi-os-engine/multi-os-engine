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

package apple.cfnetwork.struct;

import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 2)
public final class CFHostClientContext extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CFHostClientContext() {
        super(CFHostClientContext.class);
    }

    @Generated
    protected CFHostClientContext(Pointer peer) {
        super(peer);
    }

    /**
     * The version number of the structure type being passed in as a
     * parameter to the CFHost client function. Valid version number is
     * currently 0.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long version();

    /**
     * The version number of the structure type being passed in as a
     * parameter to the CFHost client function. Valid version number is
     * currently 0.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(@NInt long value);

    /**
     * An arbitrary pointer to client-defined data, which can be
     * associated with the host and is passed to the callbacks.
     */
    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr info();

    /**
     * An arbitrary pointer to client-defined data, which can be
     * associated with the host and is passed to the callbacks.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInfo(@Nullable VoidPtr value);

    /**
     * The callback used to add a retain for the host on the info pointer
     * for the life of the host, and may be used for temporary references
     * the host needs to take. This callback returns the actual info
     * pointer to store in the host, almost always just the pointer
     * passed as the parameter.
     */
    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_retain")
    public native Function_retain retain();

    /**
     * The callback used to add a retain for the host on the info pointer
     * for the life of the host, and may be used for temporary references
     * the host needs to take. This callback returns the actual info
     * pointer to store in the host, almost always just the pointer
     * passed as the parameter.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRetain(@Nullable @FunctionPtr(name = "call_retain") Function_retain value);

    /**
     * The callback used to remove a retain previously added for the host
     * on the info pointer.
     */
    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_release")
    public native Function_release release();

    /**
     * The callback used to remove a retain previously added for the host
     * on the info pointer.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRelease(@Nullable @FunctionPtr(name = "call_release") Function_release value);

    /**
     * The callback used to create a descriptive string representation of
     * the info pointer (or the data pointed to by the info pointer) for
     * debugging purposes. This is used by the CFCopyDescription()
     * function.
     */
    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_copyDescription")
    public native Function_copyDescription copyDescription();

    /**
     * The callback used to create a descriptive string representation of
     * the info pointer (or the data pointed to by the info pointer) for
     * debugging purposes. This is used by the CFCopyDescription()
     * function.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCopyDescription(
            @Nullable @FunctionPtr(name = "call_copyDescription") Function_copyDescription value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_retain {
        @Generated
        ConstVoidPtr call_retain(ConstVoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_release {
        @Generated
        void call_release(ConstVoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_copyDescription {
        @Generated
        CFStringRef call_copyDescription(ConstVoidPtr arg0);
    }
}
