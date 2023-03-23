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
import apple.intents.INIntent;
import apple.replaykit.RPBroadcastConfiguration;
import apple.uikit.UIImage;
import apple.usernotifications.UNNotificationAction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGSize;

/**
 * Class representing the extension request's context
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSExtensionContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSExtensionContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSExtensionContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSExtensionContext allocWithZone(VoidPtr zone);

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
    public static native NSExtensionContext new_objc();

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
     * Signals the host to cancel the app extension request, with the supplied error, which should be non-nil. The
     * userInfo of the NSError will contain a key NSExtensionItemsAndErrorsKey which will have as its value a dictionary
     * of NSExtensionItems and associated NSError instances.
     */
    @Generated
    @Selector("cancelRequestWithError:")
    public native void cancelRequestWithError(NSError error);

    /**
     * Signals the host to complete the app extension request with the supplied result items. The completion handler
     * optionally contains any work which the extension may need to perform after the request has been completed, as a
     * background-priority task. The `expired` parameter will be YES if the system decides to prematurely terminate a
     * previous non-expiration invocation of the completionHandler. Note: calling this method will eventually dismiss
     * the associated view controller.
     */
    @Generated
    @Selector("completeRequestReturningItems:completionHandler:")
    public native void completeRequestReturningItemsCompletionHandler(NSArray<?> items,
            @ObjCBlock(name = "call_completeRequestReturningItemsCompletionHandler") Block_completeRequestReturningItemsCompletionHandler completionHandler);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @Selector("completeRequestWithBroadcastURL:broadcastConfiguration:setupInfo:")
    public native void completeRequestWithBroadcastURLBroadcastConfigurationSetupInfo(NSURL broadcastURL,
            RPBroadcastConfiguration broadcastConfiguration, NSDictionary<String, ? extends NSObject> setupInfo);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("hostedViewMaximumAllowedSize")
    @ByValue
    public native CGSize hostedViewMaximumAllowedSize();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("hostedViewMinimumAllowedSize")
    @ByValue
    public native CGSize hostedViewMinimumAllowedSize();

    @Generated
    @Selector("init")
    public native NSExtensionContext init();

    /**
     * The list of input NSExtensionItems associated with the context. If the context has no input items, this array
     * will be empty.
     */
    @Generated
    @Selector("inputItems")
    public native NSArray<?> inputItems();

    /**
     * Load information about the broadcasting app.
     * 
     * @param handler block which will be supplied a bundleID, displayName and an optional appIcon.
     */
    @Generated
    @Selector("loadBroadcastingApplicationInfoWithCompletion:")
    public native void loadBroadcastingApplicationInfoWithCompletion(
            @ObjCBlock(name = "call_loadBroadcastingApplicationInfoWithCompletion") Block_loadBroadcastingApplicationInfoWithCompletion handler);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("mediaPlayingPaused")
    public native void mediaPlayingPaused();

    /**
     * Call these methods when the playback state changes in the content
     * extension to update the state of the media control button.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("mediaPlayingStarted")
    public native void mediaPlayingStarted();

    /**
     * Asks the host to open a URL on the extension's behalf
     */
    @Generated
    @Selector("openURL:completionHandler:")
    public native void openURLCompletionHandler(NSURL URL,
            @ObjCBlock(name = "call_openURLCompletionHandler") Block_openURLCompletionHandler completionHandler);

    /**
     * Widgets can change the largest display mode they make available from the default 'NCWidgetDisplayModeCompact' by
     * messaging the extension context.
     * Modifying this property more than once during the lifetime of the widget (perhaps due to changes in the amount of
     * available content) is supported.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @Generated
    @Selector("setWidgetLargestAvailableDisplayMode:")
    public native void setWidgetLargestAvailableDisplayMode(@NInt long value);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @Generated
    @Selector("widgetActiveDisplayMode")
    @NInt
    public native long widgetActiveDisplayMode();

    /**
     * Widgets can change the largest display mode they make available from the default 'NCWidgetDisplayModeCompact' by
     * messaging the extension context.
     * Modifying this property more than once during the lifetime of the widget (perhaps due to changes in the amount of
     * available content) is supported.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @Generated
    @Selector("widgetLargestAvailableDisplayMode")
    @NInt
    public native long widgetLargestAvailableDisplayMode();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @Generated
    @Selector("widgetMaximumSizeForDisplayMode:")
    @ByValue
    public native CGSize widgetMaximumSizeForDisplayMode(@NInt long displayMode);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completeRequestReturningItemsCompletionHandler {
        @Generated
        void call_completeRequestReturningItemsCompletionHandler(boolean expired);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadBroadcastingApplicationInfoWithCompletion {
        @Generated
        void call_loadBroadcastingApplicationInfoWithCompletion(String bundleID, String displayName, UIImage appIcon);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openURLCompletionHandler {
        @Generated
        void call_openURLCompletionHandler(boolean success);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("completeRequestWithBroadcastURL:setupInfo:")
    public native void completeRequestWithBroadcastURLSetupInfo(NSURL broadcastURL,
            NSDictionary<String, ? extends NSObject> setupInfo);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("interfaceParametersDescription")
    public native String interfaceParametersDescription();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("dismissNotificationContentExtension")
    public native void dismissNotificationContentExtension();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("intent")
    public native INIntent intent();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("notificationActions")
    public native NSArray<? extends UNNotificationAction> notificationActions();

    /**
     * Opens the corresponding applicaton and delivers it the default notification action response
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("performNotificationDefaultAction")
    public native void performNotificationDefaultAction();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setNotificationActions:")
    public native void setNotificationActions(NSArray<? extends UNNotificationAction> value);
}
