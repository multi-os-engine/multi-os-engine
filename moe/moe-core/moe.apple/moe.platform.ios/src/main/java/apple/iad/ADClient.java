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

package apple.iad;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 7.1
 * Deprecated-Since: 14.5
 * Deprecated-Message: This has been replaced by functionality in AdServices.framework's AAAttribution class.
 */
@Deprecated
@Generated
@Library("iAd")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ADClient extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ADClient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ADClient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ADClient allocWithZone(VoidPtr zone);

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
    public static native ADClient new_objc();

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
     * sharedClient
     * 
     * This is no longer a singleton and returns a new instance for every call.
     * 
     * API-Since: 7.1
     * Deprecated-Since: 14.5
     * Deprecated-Message: This has been replaced by functionality in AdServices.framework's AAAttribution class.
     * 
     * @return
     *         An instance of ADClient.
     */
    @Deprecated
    @Generated
    @Selector("sharedClient")
    public static native ADClient sharedClient();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addClientToSegments:replaceExisting:
     * 
     * This method does nothing and immediately returns.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * 
     * @param segmentIdentifiers
     *                           This parameter is unused.
     * 
     * @param replaceExisting
     *                           This parameter is unused.
     */
    @Deprecated
    @Generated
    @Selector("addClientToSegments:replaceExisting:")
    public native void addClientToSegmentsReplaceExisting(NSArray<String> segmentIdentifiers, boolean replaceExisting);

    @Generated
    @Selector("init")
    public native ADClient init();

    /**
     * requestAttributionDetailsWithBlock:
     * 
     * Provides a way for an app to determine when an an was shown to the user
     * which resulted in the user's purchase of the app.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 14.5
     * Deprecated-Message: This has been replaced by functionality in AdServices.framework's AAAttribution class.
     * 
     * @param completionHandler
     *                          A block which will be called with details related to the attribution status of the app.
     *                          The attributionDetails dictionary will contain purchase and impression dates
     *                          as well as other specific campaign related information. If the attributionDetails
     *                          dictionary is nil, an NSError is passed with an ADClientError enum.
     * 
     *                          The handler will be called on an arbitrary queue.
     */
    @Deprecated
    @Generated
    @Selector("requestAttributionDetailsWithBlock:")
    public native void requestAttributionDetailsWithBlock(
            @ObjCBlock(name = "call_requestAttributionDetailsWithBlock") Block_requestAttributionDetailsWithBlock completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAttributionDetailsWithBlock {
        @Generated
        void call_requestAttributionDetailsWithBlock(NSDictionary<String, ? extends NSObject> attributionDetails,
                NSError error);
    }
}
