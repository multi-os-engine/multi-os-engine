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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * API-Since: 6.0
 * Deprecated-Since: 16.0
 * Deprecated-Message: Hosted content is no longer supported
 */
@Deprecated
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKDownload extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKDownload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKDownload alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKDownload allocWithZone(VoidPtr zone);

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
    public static native SKDownload new_objc();

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
     * Identifier for this content
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("contentIdentifier")
    public native String contentIdentifier();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("contentLength")
    public native long contentLength();

    /**
     * Location of the content data, if state is SKDownloadStateFinished
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * Content version
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("contentVersion")
    public native String contentVersion();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("downloadState")
    @NInt
    public native long downloadState();

    /**
     * Failure error, if state is SKDownloadStateFailed
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native SKDownload init();

    /**
     * Overall progress for the download [0..1]
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("progress")
    public native float progress();

    /**
     * Estimated time remaining to complete the download, in seconds. Value is SKDownloadTimeRemainingUnknown if
     * estimate is unknownxx.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("timeRemaining")
    public native double timeRemaining();

    /**
     * Transaction for this download
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("transaction")
    public native SKPaymentTransaction transaction();

    /**
     * Total size of the content, in bytes
     * 
     * API-Since: 13.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("expectedContentLength")
    public native long expectedContentLength();

    /**
     * State of the download
     * 
     * API-Since: 12.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
