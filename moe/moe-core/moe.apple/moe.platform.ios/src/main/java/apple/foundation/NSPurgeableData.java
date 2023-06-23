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
import apple.foundation.protocol.NSDiscardableContent;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Purgeable Data ***************
 * 
 * API-Since: 4.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPurgeableData extends NSMutableData implements NSDiscardableContent {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPurgeableData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPurgeableData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPurgeableData allocWithZone(VoidPtr zone);

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
    @Selector("data")
    public static native NSPurgeableData data();

    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSPurgeableData dataWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSPurgeableData dataWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSPurgeableData dataWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes,
            @NUInt long length, boolean b);

    @Generated
    @Selector("dataWithCapacity:")
    public static native NSPurgeableData dataWithCapacity(@NUInt long aNumItems);

    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSPurgeableData dataWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSPurgeableData dataWithContentsOfFileOptionsError(@NotNull String path,
            @NUInt long readOptionsMask, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSPurgeableData dataWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSPurgeableData dataWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSPurgeableData dataWithContentsOfURLOptionsError(@NotNull NSURL url,
            @NUInt long readOptionsMask, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("dataWithData:")
    public static native NSPurgeableData dataWithData(@NotNull NSData data);

    @Generated
    @Selector("dataWithLength:")
    public static native NSPurgeableData dataWithLength(@NUInt long length);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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
    public static native NSPurgeableData new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("beginContentAccess")
    public native boolean beginContentAccess();

    @Generated
    @Selector("discardContentIfPossible")
    public native void discardContentIfPossible();

    @Generated
    @Selector("endContentAccess")
    public native void endContentAccess();

    @Generated
    @Selector("init")
    public native NSPurgeableData init();

    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSPurgeableData initWithBase64EncodedDataOptions(@NotNull NSData base64Data, @NUInt long options);

    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSPurgeableData initWithBase64EncodedStringOptions(@NotNull String base64String, @NUInt long options);

    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSPurgeableData initWithBase64Encoding(@NotNull String base64String);

    @Generated
    @Selector("initWithBytes:length:")
    public native NSPurgeableData initWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSPurgeableData initWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSPurgeableData initWithBytesNoCopyLengthDeallocator(@NotNull VoidPtr bytes, @NUInt long length,
            @Nullable @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") NSData.Block_initWithBytesNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSPurgeableData initWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long length,
            boolean b);

    @Generated
    @Selector("initWithCapacity:")
    public native NSPurgeableData initWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("initWithCoder:")
    public native NSPurgeableData initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSPurgeableData initWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSPurgeableData initWithContentsOfFileOptionsError(@NotNull String path, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSPurgeableData initWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSPurgeableData initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSPurgeableData initWithContentsOfURLOptionsError(@NotNull NSURL url, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("initWithData:")
    public native NSPurgeableData initWithData(@NotNull NSData data);

    @Generated
    @Selector("initWithLength:")
    public native NSPurgeableData initWithLength(@NUInt long length);

    @Generated
    @Selector("isContentDiscarded")
    public native boolean isContentDiscarded();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
