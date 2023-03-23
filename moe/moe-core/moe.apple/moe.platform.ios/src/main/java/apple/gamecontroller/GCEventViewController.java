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

package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
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

/**
 * API-Since: 9.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCEventViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected GCEventViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCEventViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCEventViewController allocWithZone(VoidPtr zone);

    @Deprecated
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

    @Generated
    @Owned
    @Selector("new")
    public static native GCEventViewController new_objc();

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
     * Controllers can be used to control the general UIKit user interface and for many views that is
     * the default behavior. By using a controller event view controller you get fine grained control
     * over whether the controller events go trough the UIEvent & UIResponder chain, or if they are
     * decoupled from the UI and all incoming data is served via GCController.
     * 
     * Defaults to NO - suppressing UIEvents from game controllers and presenting them via the GCController
     * API whilst this controller's view or any of it's subviews are the first responders. If you are not
     * using any UIView components or UIEvents in your application you should leave this as NO and process
     * your game controller events via the normal GCController API.
     * 
     * If set to YES the controller input will start flowing through UIEvent and the UIResponder
     * chain will be used. This gives you fine grained control over the event handling of the
     * controlled view and its subviews. You should stop using GCController instances and the corresponding
     * profiles if you no longer need to read input from them.
     * 
     * Note that unlike UIView.userInteractionEnabled this only controls the flow of game controller events.
     * 
     * @see GCController
     * @see UIView.userInteractionEnabled
     */
    @Generated
    @Selector("controllerUserInteractionEnabled")
    public native boolean controllerUserInteractionEnabled();

    @Generated
    @Selector("init")
    public native GCEventViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GCEventViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GCEventViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Controllers can be used to control the general UIKit user interface and for many views that is
     * the default behavior. By using a controller event view controller you get fine grained control
     * over whether the controller events go trough the UIEvent & UIResponder chain, or if they are
     * decoupled from the UI and all incoming data is served via GCController.
     * 
     * Defaults to NO - suppressing UIEvents from game controllers and presenting them via the GCController
     * API whilst this controller's view or any of it's subviews are the first responders. If you are not
     * using any UIView components or UIEvents in your application you should leave this as NO and process
     * your game controller events via the normal GCController API.
     * 
     * If set to YES the controller input will start flowing through UIEvent and the UIResponder
     * chain will be used. This gives you fine grained control over the event handling of the
     * controlled view and its subviews. You should stop using GCController instances and the corresponding
     * profiles if you no longer need to read input from them.
     * 
     * Note that unlike UIView.userInteractionEnabled this only controls the flow of game controller events.
     * 
     * @see GCController
     * @see UIView.userInteractionEnabled
     */
    @Generated
    @Selector("setControllerUserInteractionEnabled:")
    public native void setControllerUserInteractionEnabled(boolean value);
}
