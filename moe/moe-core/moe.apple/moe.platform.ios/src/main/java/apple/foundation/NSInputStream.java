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
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.NUIntPtr;
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
 * NSInputStream is an abstract class representing the base functionality of a read stream.
 * Subclassers are required to implement these methods.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSInputStream extends NSStream {
    static {
        NatJ.register();
    }

    @Generated
    protected NSInputStream(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSInputStream alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSInputStream allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("getBoundStreamsWithBufferSize:inputStream:outputStream:")
    public static native void getBoundStreamsWithBufferSizeInputStreamOutputStream(@NUInt long bufferSize,
            @Nullable @ReferenceInfo(type = NSInputStream.class) Ptr<NSInputStream> inputStream,
            @Nullable @ReferenceInfo(type = NSOutputStream.class) Ptr<NSOutputStream> outputStream);

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
    @Selector("inputStreamWithData:")
    public static native NSInputStream inputStreamWithData(@NotNull NSData data);

    @Generated
    @Selector("inputStreamWithFileAtPath:")
    public static native NSInputStream inputStreamWithFileAtPath(@NotNull String path);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("inputStreamWithURL:")
    public static native NSInputStream inputStreamWithURL(@NotNull NSURL url);

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
    public static native NSInputStream new_objc();

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

    /**
     * reads up to length bytes into the supplied buffer, which must be at least of size len. Returns the actual number
     * of bytes read.
     */
    @Generated
    @Selector("getBuffer:length:")
    public native boolean getBufferLength(@NotNull @ReferenceInfo(type = Byte.class, depth = 2) Ptr<BytePtr> buffer,
            @NotNull NUIntPtr len);

    /**
     * returns in O(1) a pointer to the buffer in 'buffer' and by reference in 'len' how many bytes are available. This
     * buffer is only valid until the next stream operation. Subclassers may return NO for this if it is not appropriate
     * for the stream type. This may return NO if the buffer is not available.
     */
    @Generated
    @Selector("hasBytesAvailable")
    public native boolean hasBytesAvailable();

    @Generated
    @Selector("init")
    public native NSInputStream init();

    /**
     * returns YES if the stream has bytes available or if it impossible to tell without actually doing the read.
     */
    @Generated
    @Selector("initWithData:")
    public native NSInputStream initWithData(@NotNull NSData data);

    @Generated
    @Selector("initWithFileAtPath:")
    public native NSInputStream initWithFileAtPath(@NotNull String path);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("initWithURL:")
    public native NSInputStream initWithURL(@NotNull NSURL url);

    @Generated
    @Selector("read:maxLength:")
    @NInt
    public native long readMaxLength(@NotNull BytePtr buffer, @NUInt long len);
}
