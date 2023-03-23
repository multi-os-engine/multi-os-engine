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

package apple.eventkitui;

import apple.NSObject;
import apple.eventkit.EKEvent;
import apple.eventkit.EKEventStore;
import apple.eventkitui.protocol.EKEventEditViewDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UINavigationController;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 4.0
 */
@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEventEditViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEventEditViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEventEditViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKEventEditViewController allocWithZone(VoidPtr zone);

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
    public static native EKEventEditViewController new_objc();

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
     * cancelEditing
     * 
     * Ends the editing session discarding any changes to the event.
     * 
     * This method simulates the user tapping the Cancel button. The delegate will not
     * receive the eventEditViewController:didCompleteWithAction: message, so you are
     * responsible for dismissing the controller after calling this method.
     */
    @Generated
    @Selector("cancelEditing")
    public native void cancelEditing();

    @Generated
    @Selector("editViewDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native EKEventEditViewDelegate editViewDelegate();

    /**
     * [@property] event
     * 
     * The event to edit.
     * 
     * You must set this before presenting the view controller. You can leave
     * it set to nil and a new event will be created for you. If you pass an event
     * here and it does not belong to the event store (if set) an exception will be
     * raised.
     */
    @Generated
    @Selector("event")
    public native EKEvent event();

    /**
     * [@property] eventStore
     * 
     * The event store to use to save events.
     * 
     * You must set this before presenting the view controller.
     */
    @Generated
    @Selector("eventStore")
    public native EKEventStore eventStore();

    @Generated
    @Selector("init")
    public native EKEventEditViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native EKEventEditViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native EKEventEditViewController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native EKEventEditViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native EKEventEditViewController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Selector("setEditViewDelegate:")
    public native void setEditViewDelegate_unsafe(@Mapped(ObjCObjectMapper.class) EKEventEditViewDelegate value);

    @Generated
    public void setEditViewDelegate(@Mapped(ObjCObjectMapper.class) EKEventEditViewDelegate value) {
        Object __old = editViewDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setEditViewDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] event
     * 
     * The event to edit.
     * 
     * You must set this before presenting the view controller. You can leave
     * it set to nil and a new event will be created for you. If you pass an event
     * here and it does not belong to the event store (if set) an exception will be
     * raised.
     */
    @Generated
    @Selector("setEvent:")
    public native void setEvent(EKEvent value);

    /**
     * [@property] eventStore
     * 
     * The event store to use to save events.
     * 
     * You must set this before presenting the view controller.
     */
    @Generated
    @Selector("setEventStore:")
    public native void setEventStore(EKEventStore value);
}
