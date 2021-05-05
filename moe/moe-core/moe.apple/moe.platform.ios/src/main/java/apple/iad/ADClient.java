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
import apple.foundation.NSDate;
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
import org.moe.natj.general.ann.MappedReturn;
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
     * sharedClient
     * 
     * ADClient is a singleton object.
     * 
     * @return
     * The shared singleton instance of ADClient.
     */
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
     * Enables apps to add users to custom segments owned and defined by the calling
     * application.  If Limit Ad Tracking is enabled on the device, this method will
     * have no effect. For iOS 14 and later, and macOS 11 and later, this method will
     * have no effect.
     * 
     * @param segmentIdentifiers
     * Array of NSString objects identifying which segments to add the client to.
     * May be nil.
     * 
     * @param replaceExisting
     * If YES, the client will be removed from all existing segments prior to
     * being added to the specified segments.
     */
    @Generated
    @Selector("addClientToSegments:replaceExisting:")
    public native void addClientToSegmentsReplaceExisting(NSArray<String> segmentIdentifiers, boolean replaceExisting);

    /**
     * determineAppInstallationAttributionWithCompletionHandler:
     * 
     * Provides a way for an app to determine if it was installed by the user in
     * response to seeing an iAd for the app.
     * 
     * @param completionHandler
     * A block accepting one BOOL argument that will be called when app installation
     * attribution status has been determined. If this installation of the app is
     * attributed to an iAd impression, the completion handler will be called with
     * YES. Otherwise, or if the user has enabled Limit Ad Tracking, the completion
     * handler will be called with NO. For iOS 14 and later, the completion
     * handler will always be called with NO.
     * 
     * The handler will be called on an arbitrary queue.
     */
    @Generated
    @Deprecated
    @Selector("determineAppInstallationAttributionWithCompletionHandler:")
    public native void determineAppInstallationAttributionWithCompletionHandler(
            @ObjCBlock(name = "call_determineAppInstallationAttributionWithCompletionHandler") Block_determineAppInstallationAttributionWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native ADClient init();

    /**
     * lookupAdConversionDetails:
     * 
     * Provides a way for an app to determine when an iAd was shown to the user
     * which resulted in the user's purchase of the app.
     * 
     * @param completionHandler
     * This method is deprecated.
     * A block will be called with iAdImpressionDate = nil
     * 
     * The handler will be called on an arbitrary queue.
     */
    @Generated
    @Deprecated
    @Selector("lookupAdConversionDetails:")
    public native void lookupAdConversionDetails(
            @ObjCBlock(name = "call_lookupAdConversionDetails") Block_lookupAdConversionDetails completionHandler);

    /**
     * requestAttributionDetailsWithBlock:
     * 
     * Provides a way for an app to determine when an iAd was shown to the user
     * which resulted in the user's purchase of the app.
     * 
     * @param completionHandler
     * A block which will be called with details related to the attribution status of the app.
     * The attributionDetails dictionary will contain purchase and impression dates
     * as well as other specific campaign related information provided by iAd. If the attributionDetails
     * dictionary is nil, an NSError is passed with an ADClientError enum.
     * 
     * The handler will be called on an arbitrary queue.
     */
    @Generated
    @Selector("requestAttributionDetailsWithBlock:")
    public native void requestAttributionDetailsWithBlock(
            @ObjCBlock(name = "call_requestAttributionDetailsWithBlock") Block_requestAttributionDetailsWithBlock completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineAppInstallationAttributionWithCompletionHandler {
        @Generated
        void call_determineAppInstallationAttributionWithCompletionHandler(boolean appInstallationWasAttributedToiAd);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lookupAdConversionDetails {
        @Generated
        void call_lookupAdConversionDetails(NSDate appPurchaseDate, NSDate iAdImpressionDate);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAttributionDetailsWithBlock {
        @Generated
        void call_requestAttributionDetailsWithBlock(NSDictionary<String, ? extends NSObject> attributionDetails,
                NSError error);
    }
}
