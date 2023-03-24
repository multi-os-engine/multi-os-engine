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

package apple.callkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
 * API-Since: 10.0
 */
@Generated
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CXProviderConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CXProviderConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CXProviderConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CXProviderConfiguration allocWithZone(VoidPtr zone);

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
    public static native CXProviderConfiguration new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Image should be a square with side length of 40 points
     */
    @Nullable
    @Generated
    @Selector("iconTemplateImageData")
    public native NSData iconTemplateImageData();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("init")
    public native CXProviderConfiguration init();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithLocalizedName:")
    public native CXProviderConfiguration initWithLocalizedName(@NotNull String localizedName);

    /**
     * Localized name of the provider
     * 
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: No longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * Default 2
     */
    @Generated
    @Selector("maximumCallGroups")
    @NUInt
    public native long maximumCallGroups();

    /**
     * Default 5
     */
    @Generated
    @Selector("maximumCallsPerCallGroup")
    @NUInt
    public native long maximumCallsPerCallGroup();

    /**
     * Name of resource in app's bundle to play as ringtone for incoming call
     */
    @Nullable
    @Generated
    @Selector("ringtoneSound")
    public native String ringtoneSound();

    /**
     * Image should be a square with side length of 40 points
     */
    @Generated
    @Selector("setIconTemplateImageData:")
    public native void setIconTemplateImageData(@Nullable NSData value);

    /**
     * Default 2
     */
    @Generated
    @Selector("setMaximumCallGroups:")
    public native void setMaximumCallGroups(@NUInt long value);

    /**
     * Default 5
     */
    @Generated
    @Selector("setMaximumCallsPerCallGroup:")
    public native void setMaximumCallsPerCallGroup(@NUInt long value);

    /**
     * Name of resource in app's bundle to play as ringtone for incoming call
     */
    @Generated
    @Selector("setRingtoneSound:")
    public native void setRingtoneSound(@Nullable String value);

    /**
     * Numbers are of type CXHandleType
     */
    @Generated
    @Selector("setSupportedHandleTypes:")
    public native void setSupportedHandleTypes(@NotNull NSSet<? extends NSNumber> value);

    /**
     * Default NO
     */
    @Generated
    @Selector("setSupportsVideo:")
    public native void setSupportsVideo(boolean value);

    /**
     * Numbers are of type CXHandleType
     */
    @NotNull
    @Generated
    @Selector("supportedHandleTypes")
    public native NSSet<? extends NSNumber> supportedHandleTypes();

    /**
     * Default NO
     */
    @Generated
    @Selector("supportsVideo")
    public native boolean supportsVideo();

    /**
     * Whether this provider's calls should be included in the system's Recents list at the end of each call.
     * Default: YES
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("includesCallsInRecents")
    public native boolean includesCallsInRecents();

    /**
     * Whether this provider's calls should be included in the system's Recents list at the end of each call.
     * Default: YES
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setIncludesCallsInRecents:")
    public native void setIncludesCallsInRecents(boolean value);
}
