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

package apple.replaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.replaykit.protocol.RPBroadcastActivityViewControllerDelegate;
import apple.uikit.UIViewController;
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

/**
 * RPBroadcastActivityViewController
 * <p>
 * View controller that presents the user with a list of broadcast services installed on the device.
 */
@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class RPBroadcastActivityViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected RPBroadcastActivityViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RPBroadcastActivityViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native RPBroadcastActivityViewController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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

    /**
     * Loads a RPBroadcastActivityViewController instance and returns it in the handler block.
     * <p>
     * The view controller will present the user with a list of broadcast services available on the device and allow the user to set up a broadcast with the service through the service's UI.
     * <p>
     * The RPBroadcastActivityViewController can be presented using [UIViewController presentViewController:animated:completion:] and should be dismissed when the delegate's broadcastActivityViewController:didFinishWithBroadcastController:error: method is called. Note that on large screen devices such as iPad, the default presentation style for view controllers is a popover. For an instance of RPBroadcastActivityViewController to present properly on iPad, it needs to have its popoverPresentationController's sourceRect and sourceView configured.
     *
     * @param broadcastActivityViewController The RPBroadcastActivityViewController which can be presented.
     * @param error                           Optional error in the RPRecordingErrorCode domain which is supplied in the event the view controller could not be loaded.
     */
    @Generated
    @Selector("loadBroadcastActivityViewControllerWithHandler:")
    public static native void loadBroadcastActivityViewControllerWithHandler(
            @ObjCBlock(name = "call_loadBroadcastActivityViewControllerWithHandler") Block_loadBroadcastActivityViewControllerWithHandler handler);

    @Generated
    @Owned
    @Selector("new")
    public static native RPBroadcastActivityViewController new_objc();

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
     * Delegate that is notified when the activity view controller is complete.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native RPBroadcastActivityViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native RPBroadcastActivityViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native RPBroadcastActivityViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native RPBroadcastActivityViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Delegate that is notified when the activity view controller is complete.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) RPBroadcastActivityViewControllerDelegate value);

    /**
     * Delegate that is notified when the activity view controller is complete.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) RPBroadcastActivityViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadBroadcastActivityViewControllerWithHandler {
        @Generated
        void call_loadBroadcastActivityViewControllerWithHandler(
                RPBroadcastActivityViewController broadcastActivityViewController, NSError error);
    }

    /**
     * Loads a RPBroadcastActivityViewController instance and returns it in the handler block.
     * <p>
     * The view controller will present the user with a view that shows the preferred streaming extension service and allow the user to set up a broadcast with the service through the service's UI.
     * <p>
     * The RPBroadcastActivityViewController can be presented using [UIViewController presentViewController:animated:completion:] and should be dismissed when the delegate's broadcastActivityViewController:didFinishWithBroadcastController:error: method is called. Note that on large screen devices such as iPad, the default presentation style for view controllers is a popover. For an instance of RPBroadcastActivityViewController to present properly on iPad, it needs to have its popoverPresentationController's sourceRect and sourceView configured.
     *
     * @param preferredExtension              The extension bundle identifier for the preferred broadcast extension service
     * @param broadcastActivityViewController The RPBroadcastActivityViewController which can be presented, returns nil if ther eis no matching extension.
     * @param error                           Optional error in the RPRecordingErrorCode domain which is supplied in the event the view controller could not be loaded.
     */
    @Generated
    @Selector("loadBroadcastActivityViewControllerWithPreferredExtension:handler:")
    public static native void loadBroadcastActivityViewControllerWithPreferredExtensionHandler(
            String preferredExtension,
            @ObjCBlock(name = "call_loadBroadcastActivityViewControllerWithPreferredExtensionHandler") Block_loadBroadcastActivityViewControllerWithPreferredExtensionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadBroadcastActivityViewControllerWithPreferredExtensionHandler {
        @Generated
        void call_loadBroadcastActivityViewControllerWithPreferredExtensionHandler(
                RPBroadcastActivityViewController broadcastActivityViewController, NSError error);
    }
}
