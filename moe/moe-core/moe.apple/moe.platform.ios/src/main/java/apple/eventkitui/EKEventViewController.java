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
import apple.eventkitui.protocol.EKEventViewDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEventViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEventViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEventViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKEventViewController allocWithZone(VoidPtr zone);

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
    public static native EKEventViewController new_objc();

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
     * [@property] allowsCalendarPreview
     * 
     * Determines whether event can be shown in calendar day view preview.
     * 
     * This option only affects calendar invites at present. If the event is an invite,
     * and this option is set, a table cell will appear that allows the user to preview
     * the event along with their other events for the day.
     */
    @Generated
    @Selector("allowsCalendarPreview")
    public native boolean allowsCalendarPreview();

    /**
     * [@property] allowsEditing
     * 
     * Determines whether Edit button can be shown.
     * 
     * Note that even if this is enabled, the edit button may not appear if this event
     * is in a read-only calendar, such as a subscribed calendar. It may also not appear
     * if the event was not created by the current user (i.e. it's an event they were
     * invited to). And lastly, if the event was never saved, the edit button will not
     * appear.
     */
    @Generated
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    /**
     * API-Since: 4.2
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native EKEventViewDelegate delegate();

    /**
     * [@property] event
     * 
     * Specifies the event to view.
     * 
     * You must set this prior to displaying the view controller.
     */
    @Generated
    @Selector("event")
    public native EKEvent event();

    @Generated
    @Selector("init")
    public native EKEventViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native EKEventViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native EKEventViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * [@property] allowsCalendarPreview
     * 
     * Determines whether event can be shown in calendar day view preview.
     * 
     * This option only affects calendar invites at present. If the event is an invite,
     * and this option is set, a table cell will appear that allows the user to preview
     * the event along with their other events for the day.
     */
    @Generated
    @Selector("setAllowsCalendarPreview:")
    public native void setAllowsCalendarPreview(boolean value);

    /**
     * [@property] allowsEditing
     * 
     * Determines whether Edit button can be shown.
     * 
     * Note that even if this is enabled, the edit button may not appear if this event
     * is in a read-only calendar, such as a subscribed calendar. It may also not appear
     * if the event was not created by the current user (i.e. it's an event they were
     * invited to). And lastly, if the event was never saved, the edit button will not
     * appear.
     */
    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    /**
     * API-Since: 4.2
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) EKEventViewDelegate value);

    /**
     * API-Since: 4.2
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) EKEventViewDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] event
     * 
     * Specifies the event to view.
     * 
     * You must set this prior to displaying the view controller.
     */
    @Generated
    @Selector("setEvent:")
    public native void setEvent(EKEvent value);
}
