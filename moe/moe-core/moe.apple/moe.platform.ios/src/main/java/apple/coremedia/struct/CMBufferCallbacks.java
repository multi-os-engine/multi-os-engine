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

package apple.coremedia.struct;

import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 4)
public final class CMBufferCallbacks extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CMBufferCallbacks() {
        super(CMBufferCallbacks.class);
    }

    @Generated
    protected CMBufferCallbacks(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr refcon();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRefcon(VoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGetDecodeTimeStamp(
            @FunctionPtr(name = "call_getDecodeTimeStamp") Function_getDecodeTimeStamp value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getDecodeTimeStamp {
        @Generated
        @ByValue
        CMTime call_getDecodeTimeStamp(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setGetPresentationTimeStamp(
            @FunctionPtr(name = "call_getPresentationTimeStamp") Function_getPresentationTimeStamp value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getPresentationTimeStamp {
        @Generated
        @ByValue
        CMTime call_getPresentationTimeStamp(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setGetDuration(@FunctionPtr(name = "call_getDuration") Function_getDuration value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getDuration {
        @Generated
        @ByValue
        CMTime call_getDuration(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIsDataReady(@FunctionPtr(name = "call_isDataReady") Function_isDataReady value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_isDataReady {
        @Generated
        byte call_isDataReady(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setCompare(@FunctionPtr(name = "call_compare") Function_compare value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_compare {
        @Generated
        @NInt
        long call_compare(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native CFStringRef dataBecameReadyNotification();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setDataBecameReadyNotification(CFStringRef value);

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setGetSize(@FunctionPtr(name = "call_getSize") Function_getSize value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getSize {
        @Generated
        @NUInt
        long call_getSize(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_getDecodeTimeStamp")
    public native Function_getDecodeTimeStamp getDecodeTimeStamp();

    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_getPresentationTimeStamp")
    public native Function_getPresentationTimeStamp getPresentationTimeStamp();

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_getDuration")
    public native Function_getDuration getDuration();

    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_isDataReady")
    public native Function_isDataReady isDataReady();

    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_compare")
    public native Function_compare compare();

    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call_getSize")
    public native Function_getSize getSize();
}
