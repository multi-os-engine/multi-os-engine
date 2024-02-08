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

package apple.corebluetooth;

import apple.NSObject;
import apple.corefoundation.opaque.CFUUIDRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ann.Runtime;
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
 * CBUUID
 * 
 * A 16-bit, 32-bit, or 128-bit Bluetooth UUID.
 * 16-bit and 32-bit UUIDs are implicitly pre-filled with the Bluetooth Base UUID.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBUUID extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CBUUID(Pointer peer) {
        super(peer);
    }

    /**
     * UUIDWithCFUUID:
     * 
     * Creates a CBUUID with a CFUUIDRef.
     * 
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("UUIDWithCFUUID:")
    public static native CBUUID UUIDWithCFUUID(@NotNull CFUUIDRef theUUID);

    /**
     * UUIDWithData:
     * 
     * Creates a CBUUID with a 16-bit, 32-bit, or 128-bit UUID data container.
     */
    @NotNull
    @Generated
    @Selector("UUIDWithData:")
    public static native CBUUID UUIDWithData(@NotNull NSData theData);

    /**
     * UUIDWithNSUUID:
     * 
     * Creates a CBUUID with an NSUUID.
     * 
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("UUIDWithNSUUID:")
    public static native CBUUID UUIDWithNSUUID(@NotNull NSUUID theUUID);

    /**
     * UUIDWithString:
     * 
     * Creates a CBUUID with a 16-bit, 32-bit, or 128-bit UUID string representation.
     * The expected format for 128-bit UUIDs is a string punctuated by hyphens, for example
     * 68753A44-4D6F-1226-9C60-0050E4C00067.
     */
    @NotNull
    @Generated
    @Selector("UUIDWithString:")
    public static native CBUUID UUIDWithString(@NotNull String theString);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CBUUID alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CBUUID allocWithZone(VoidPtr zone);

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
    public static native CBUUID new_objc();

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
     * [@property] UUIDString
     * 
     * The UUID as NSString.
     * 
     * 
     * API-Since: 7.1
     */
    @NotNull
    @Generated
    @Selector("UUIDString")
    public native String UUIDString();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] data
     * 
     * The UUID as NSData.
     */
    @NotNull
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("init")
    public native CBUUID init();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
