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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSStreamDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSStream is an abstract class encapsulating the common API to NSInputStream and NSOutputStream.
 * Subclassers of NSInputStream and NSOutputStream must also implement these methods.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStream extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSStream(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSStream alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSStream allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("getBoundStreamsWithBufferSize:inputStream:outputStream:")
    public static native void getBoundStreamsWithBufferSizeInputStreamOutputStream(@NUInt long bufferSize,
            @Nullable @ReferenceInfo(type = NSInputStream.class) Ptr<NSInputStream> inputStream,
            @Nullable @ReferenceInfo(type = NSOutputStream.class) Ptr<NSOutputStream> outputStream);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use nw_connection_t in Network framework instead
     */
    @Deprecated
    @Generated
    @Selector("getStreamsToHostWithName:port:inputStream:outputStream:")
    public static native void getStreamsToHostWithNamePortInputStreamOutputStream(@NotNull String hostname,
            @NInt long port, @Nullable @ReferenceInfo(type = NSInputStream.class) Ptr<NSInputStream> inputStream,
            @Nullable @ReferenceInfo(type = NSOutputStream.class) Ptr<NSOutputStream> outputStream);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSStream new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("close")
    public native void close();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSStreamDelegate delegate();

    @Generated
    @Selector("init")
    public native NSStream init();

    @Generated
    @Selector("open")
    public native void open();

    /**
     * By default, a stream is its own delegate, and subclassers of NSInputStream and NSOutputStream must maintain this
     * contract. [someStream setDelegate:nil] must restore this behavior. As usual, delegates are not retained.
     */
    @Nullable
    @Generated
    @Selector("propertyForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyForKey(@NotNull String key);

    @Generated
    @Selector("removeFromRunLoop:forMode:")
    public native void removeFromRunLoopForMode(@NotNull NSRunLoop aRunLoop, @NotNull String mode);

    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(@NotNull NSRunLoop aRunLoop, @NotNull String mode);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSStreamDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSStreamDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setProperty:forKey:")
    public native boolean setPropertyForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object property,
            @NotNull String key);

    @Nullable
    @Generated
    @Selector("streamError")
    public native NSError streamError();

    @Generated
    @Selector("streamStatus")
    @NUInt
    public native long streamStatus();
}
