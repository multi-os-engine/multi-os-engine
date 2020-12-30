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

/**
 * @class      NKLibrary
 * @abstract   Represents the library of Newsstand issues
 * @discussion This is the library of Newsstand issues. Upon launch, one can
 * get the issues in the Newsstand library and determine any outstanding
 * downloading assets. To reconnect with any outstanding background
 * download of content, you will be required to call 
 * -[NKAssetDownload downloadWithDelegate:].
 */
@Generated
@Library("NewsstandKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NKLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NKLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NKLibrary alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @method     sharedLibrary
     * @abstract   The application's shared Newsstand Content Library
     */
    @Generated
    @Selector("sharedLibrary")
    public static native NKLibrary sharedLibrary();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method     addIssueWithName:date:
     * @abstract   Add a new issue to the Newsstand Content Library.
     */
    @Generated
    @Selector("addIssueWithName:date:")
    public native NKIssue addIssueWithNameDate(String name, NSDate date);

    /**
     * @property   currentlyReadingIssue
     * @abstract   The issue that is currently being read by the user. Clients should
     * set this property to the currently read issue to prevent data
     * from being purged when under disk pressure.
     */
    @Generated
    @Selector("currentlyReadingIssue")
    public native NKIssue currentlyReadingIssue();

    /**
     * @property   downloadingAssets
     * @abstract   The assets that are currently being downloaded in this
     * Newsstand library. The issue that this asset is associated with
     * can be determined from the asset itself.
     */
    @Generated
    @Selector("downloadingAssets")
    public native NSArray<? extends NKAssetDownload> downloadingAssets();

    @Generated
    @Selector("init")
    public native NKLibrary init();

    /**
     * @method     issueWithName:
     * @abstract   Return the issue identified by the given name if it exists.
     */
    @Generated
    @Selector("issueWithName:")
    public native NKIssue issueWithName(String name);

    /**
     * @property   issues
     * @abstract   The Newsstand issues in the library
     */
    @Generated
    @Selector("issues")
    public native NSArray<? extends NKIssue> issues();

    /**
     * @method     removeIssue:
     * @abstract   Remove the issue from the library
     */
    @Generated
    @Selector("removeIssue:")
    public native void removeIssue(NKIssue issue);

    /**
     * @property   currentlyReadingIssue
     * @abstract   The issue that is currently being read by the user. Clients should
     * set this property to the currently read issue to prevent data
     * from being purged when under disk pressure.
     */
    @Generated
    @Selector("setCurrentlyReadingIssue:")
    public native void setCurrentlyReadingIssue(NKIssue value);
}
