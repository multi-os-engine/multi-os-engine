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
import apple.foundation.NSCoder;
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
 * UIFocusGuides are UILayoutGuide subclasses that participate in the focus system from within their owning view. A UIFocusGuide may be used to expose non-view areas as focusable.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFocusGuide extends UILayoutGuide {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFocusGuide(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFocusGuide alloc();

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

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native UIFocusGuide init();

    @Generated
    @Selector("initWithCoder:")
    public native UIFocusGuide initWithCoder(NSCoder coder);

    /**
     * If disabled, UIFocusGuides are ignored by the focus engine, but still participate in layout. Modifying this flag allows you to conditionally enable or disable certain focus behaviors. YES by default.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * If disabled, UIFocusGuides are ignored by the focus engine, but still participate in layout. Modifying this flag allows you to conditionally enable or disable certain focus behaviors. YES by default.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Setting preferredFocusEnvironments to a non-empty array marks this guide's layoutFrame as focusable. If empty, this guide is effectively disabled.
     * If focused, the guide attempts to redirect focus to each environment in the array, in order, stopping when a focusable item in an environment has been found.
     */
    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    /**
     * Setting a preferred focused view marks this guide's layoutFrame as focusable, and if focused, redirects focus to its preferred focused view. If nil, this guide is effectively disabled.
     */
    @Generated
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    /**
     * Setting preferredFocusEnvironments to a non-empty array marks this guide's layoutFrame as focusable. If empty, this guide is effectively disabled.
     * If focused, the guide attempts to redirect focus to each environment in the array, in order, stopping when a focusable item in an environment has been found.
     */
    @Generated
    @Selector("setPreferredFocusEnvironments:")
    public native void setPreferredFocusEnvironments(NSArray<?> value);

    /**
     * Setting a preferred focused view marks this guide's layoutFrame as focusable, and if focused, redirects focus to its preferred focused view. If nil, this guide is effectively disabled.
     */
    @Generated
    @Selector("setPreferredFocusedView:")
    public native void setPreferredFocusedView_unsafe(UIView value);

    /**
     * Setting a preferred focused view marks this guide's layoutFrame as focusable, and if focused, redirects focus to its preferred focused view. If nil, this guide is effectively disabled.
     */
    @Generated
    public void setPreferredFocusedView(UIView value) {
        Object __old = preferredFocusedView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPreferredFocusedView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
