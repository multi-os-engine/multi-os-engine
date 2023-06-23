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

package apple.newsstandkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
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
 * NKIssue
 * 
 * Represents the Newsstand issue and its location on disk.
 * 
 * All Newsstand issues have a publication date and a unique name.
 * You register assets for download through this class.
 * All of the Newsstand content that represents this issue should be
 * placed in the URL provided by contentURL.
 * If there are any downloading assets associated with this issue,
 * the state of the issue is "downloading". If there are no outstanding
 * downloading assets and the contentURL is non-empty, the state
 * is "content available".
 * An issue is created by adding it to the library with
 * -[NKLibrary addIssueWithName:date:].
 * 
 * API-Since: 5.0
 * Deprecated-Since: 13.0
 * Deprecated-Message: Use the Remote Notifications Background Modes instead:
 * https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_updates_to_your_app_silently
 */
@Deprecated
@Generated
@Library("NewsstandKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NKIssue extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NKIssue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NKIssue alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NKIssue allocWithZone(VoidPtr zone);

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
    public static native NKIssue new_objc();

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
     * addAssetWithRequest:
     * 
     * Add a downloading asset to this issue. Initiate the download for this
     * asset with the downloadWithDelegate: method on the NKAssetDownload.
     */
    @NotNull
    @Generated
    @Selector("addAssetWithRequest:")
    public native NKAssetDownload addAssetWithRequest(@NotNull NSURLRequest request);

    /**
     * [@property] contentURL
     * 
     * All content that represents this issue should be placed in the
     * URL provided.
     */
    @NotNull
    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * [@property] date
     * 
     * The date of this issue
     */
    @NotNull
    @Generated
    @Selector("date")
    public native NSDate date();

    /**
     * [@property] downloadingAssets
     * 
     * An array of NKAssetDownload associated with this issue.
     */
    @NotNull
    @Generated
    @Selector("downloadingAssets")
    public native NSArray<? extends NKAssetDownload> downloadingAssets();

    @Generated
    @Selector("init")
    public native NKIssue init();

    /**
     * [@property] name
     * 
     * The unique name given to this issue
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] status
     * 
     * The availability of this issue's content.
     * 
     * If there are asset downloads associated with this issue, the status
     * is NKIssueContentStatusDownloading. If there are no downloading assets
     * and the directory represented by contentURL is non-empty, the status
     * is NKIssueContentStatusAvailable. Otherwise, no content is available
     * at the destination and the status is NKIssueContentStatusNone.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();
}
