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
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CMBufferCallbacks() {
        super(CMBufferCallbacks.class);
    }

    @Generated
    protected CMBufferCallbacks(Pointer peer) {
        super(peer);
    }

    /**
     * < Must be 0 or 1.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * < Must be 0 or 1.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    /**
     * < Client refcon to be passed to all callbacks (can be NULL,
     * if the callbacks don't require it).
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr refcon();

    /**
     * < Client refcon to be passed to all callbacks (can be NULL,
     * if the callbacks don't require it).
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRefcon(VoidPtr value);

    /**
     * < This callback is called from CMBufferQueueGetFirstDecodeTimeStamp (once),
     * and from CMBufferQueueGetMinDecodeTimeStamp (multiple times). It should
     * return the decode timestamp of the buffer. If there are multiple samples
     * in the buffer, this callback should return the minimum decode timestamp
     * in the buffer. Can be NULL (CMBufferQueueGetFirstDecodeTimeStamp and
     * CMBufferQueueGetMinDecodeTimeStamp will return kCMTimeInvalid).
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_getDecodeTimeStamp")
    public native Function_getDecodeTimeStamp getDecodeTimeStamp();

    /**
     * < This callback is called from CMBufferQueueGetFirstDecodeTimeStamp (once),
     * and from CMBufferQueueGetMinDecodeTimeStamp (multiple times). It should
     * return the decode timestamp of the buffer. If there are multiple samples
     * in the buffer, this callback should return the minimum decode timestamp
     * in the buffer. Can be NULL (CMBufferQueueGetFirstDecodeTimeStamp and
     * CMBufferQueueGetMinDecodeTimeStamp will return kCMTimeInvalid).
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setGetDecodeTimeStamp(
            @FunctionPtr(name = "call_getDecodeTimeStamp") Function_getDecodeTimeStamp value);

    /**
     * < This callback is called from CMBufferQueueGetFirstPresentationTimeStamp
     * (once) and from CMBufferQueueGetMinPresentationTimeStamp (multiple times).
     * It should return the presentation timestamp of the buffer. If there are
     * multiple samples in the buffer, this callback should return the minimum
     * presentation timestamp in the buffer. Can be NULL
     * (CMBufferQueueGetFirstPresentationTimeStamp and
     * CMBufferQueueGetMinPresentationTimeStamp will return kCMTimeInvalid).
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_getPresentationTimeStamp")
    public native Function_getPresentationTimeStamp getPresentationTimeStamp();

    /**
     * < This callback is called from CMBufferQueueGetFirstPresentationTimeStamp
     * (once) and from CMBufferQueueGetMinPresentationTimeStamp (multiple times).
     * It should return the presentation timestamp of the buffer. If there are
     * multiple samples in the buffer, this callback should return the minimum
     * presentation timestamp in the buffer. Can be NULL
     * (CMBufferQueueGetFirstPresentationTimeStamp and
     * CMBufferQueueGetMinPresentationTimeStamp will return kCMTimeInvalid).
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setGetPresentationTimeStamp(
            @FunctionPtr(name = "call_getPresentationTimeStamp") Function_getPresentationTimeStamp value);

    /**
     * < This callback is called (once) during enqueue and dequeue operations to
     * update the total duration of the queue. Must not be NULL.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_getDuration")
    public native Function_getDuration getDuration();

    /**
     * < This callback is called (once) during enqueue and dequeue operations to
     * update the total duration of the queue. Must not be NULL.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setGetDuration(@FunctionPtr(name = "call_getDuration") Function_getDuration value);

    /**
     * < This callback is called from CMBufferQueueDequeueIfDataReadyAndRetain, to
     * ask if the buffer that is about to be dequeued is ready. Can be NULL
     * (data will be assumed to be ready).
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_isDataReady")
    public native Function_isDataReady isDataReady();

    /**
     * < This callback is called from CMBufferQueueDequeueIfDataReadyAndRetain, to
     * ask if the buffer that is about to be dequeued is ready. Can be NULL
     * (data will be assumed to be ready).
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIsDataReady(@FunctionPtr(name = "call_isDataReady") Function_isDataReady value);

    /**
     * < This callback is called (multiple times) from CMBufferQueueEnqueue, to
     * perform an insertion sort. Can be NULL (queue will be FIFO).
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_compare")
    public native Function_compare compare();

    /**
     * < This callback is called (multiple times) from CMBufferQueueEnqueue, to
     * perform an insertion sort. Can be NULL (queue will be FIFO).
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setCompare(@FunctionPtr(name = "call_compare") Function_compare value);

    /**
     * < If triggers of type kCMBufferQueueTrigger_WhenDataBecomesReady are installed,
     * the queue will listen for this notification on the head buffer.
     * Can be NULL (then the queue won't listen for it).
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native CFStringRef dataBecameReadyNotification();

    /**
     * < If triggers of type kCMBufferQueueTrigger_WhenDataBecomesReady are installed,
     * the queue will listen for this notification on the head buffer.
     * Can be NULL (then the queue won't listen for it).
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setDataBecameReadyNotification(CFStringRef value);

    /**
     * < This callback is called (once) during enqueue and dequeue operation to
     * update the total size of the queue. Can be NULL. Ignored if version < 1.
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    @FunctionPtr(name = "call_getSize")
    public native Function_getSize getSize();

    /**
     * < This callback is called (once) during enqueue and dequeue operation to
     * update the total size of the queue. Can be NULL. Ignored if version < 1.
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setGetSize(@FunctionPtr(name = "call_getSize") Function_getSize value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getDecodeTimeStamp {
        @Generated
        @ByValue
        CMTime call_getDecodeTimeStamp(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getPresentationTimeStamp {
        @Generated
        @ByValue
        CMTime call_getPresentationTimeStamp(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getDuration {
        @Generated
        @ByValue
        CMTime call_getDuration(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_isDataReady {
        @Generated
        byte call_isDataReady(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_compare {
        @Generated
        @NInt
        long call_compare(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_getSize {
        @Generated
        @NUInt
        long call_getSize(ConstVoidPtr arg0, VoidPtr arg1);
    }
}
