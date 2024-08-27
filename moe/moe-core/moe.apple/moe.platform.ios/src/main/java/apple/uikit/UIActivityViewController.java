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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIActivityItemsConfigurationReading;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIActivityViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UIActivityViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIActivityViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIActivityViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native UIActivityViewController new_objc();

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
     * set to nil after activity performs or view controller is dismissed
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    /**
     * set to nil after activity performs or view controller is dismissed
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("completionWithItemsHandler")
    @ObjCBlock(name = "call_completionWithItemsHandler_ret")
    public native Block_completionWithItemsHandler_ret completionWithItemsHandler();

    /**
     * default is nil. activity types listed will not be displayed
     */
    @Nullable
    @Generated
    @Selector("excludedActivityTypes")
    public native NSArray<String> excludedActivityTypes();

    @Generated
    @Selector("init")
    public native UIActivityViewController init();

    @Generated
    @Selector("initWithActivityItems:applicationActivities:")
    public native UIActivityViewController initWithActivityItemsApplicationActivities(@NotNull NSArray<?> activityItems,
            @Nullable NSArray<? extends UIActivity> applicationActivities);

    @Generated
    @Selector("initWithCoder:")
    public native UIActivityViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIActivityViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * set to nil after activity performs or view controller is dismissed
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @Nullable @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    /**
     * set to nil after activity performs or view controller is dismissed
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setCompletionWithItemsHandler:")
    public native void setCompletionWithItemsHandler(
            @Nullable @ObjCBlock(name = "call_setCompletionWithItemsHandler") Block_setCompletionWithItemsHandler value);

    /**
     * default is nil. activity types listed will not be displayed
     */
    @Generated
    @Selector("setExcludedActivityTypes:")
    public native void setExcludedActivityTypes(@Nullable NSArray<String> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(@Nullable String activityType, boolean completed);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionWithItemsHandler_ret {
        @Generated
        void call_completionWithItemsHandler_ret(@Nullable String activityType, boolean completed,
                @Nullable NSArray<?> returnedItems, @Nullable NSError activityError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(@Nullable String activityType, boolean completed);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionWithItemsHandler {
        @Generated
        void call_setCompletionWithItemsHandler(@Nullable String activityType, boolean completed,
                @Nullable NSArray<?> returnedItems, @Nullable NSError activityError);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithActivityItemsConfiguration:")
    public native UIActivityViewController initWithActivityItemsConfiguration(
            @NotNull @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationReading activityItemsConfiguration);

    /**
     * In some contexts, the activity view controller can elevate a specific activity in the header view to enhance it.
     * The prominent activity can only be chosen by the system.
     * Defaults to YES.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("allowsProminentActivity")
    public native boolean allowsProminentActivity();

    /**
     * In some contexts, the activity view controller can elevate a specific activity in the header view to enhance it.
     * The prominent activity can only be chosen by the system.
     * Defaults to YES.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setAllowsProminentActivity:")
    public native void setAllowsProminentActivity(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
