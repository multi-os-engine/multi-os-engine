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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAccessibilityIdentification;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * UIAccessibilityElement
 * <p>
 * Instances of this class can be used as "fake" accessibility elements.
 * An accessibility container (see UIAccessibility.h) can create and vend instances
 * of UIAccessibilityElement to cover for user interface items that are not
 * backed by a UIView (for example: painted text or icon).
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAccessibilityElement extends UIResponder implements UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAccessibilityElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAccessibilityElement alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIAccessibilityElement allocWithZone(VoidPtr zone);

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
    public static native UIAccessibilityElement new_objc();

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
    @Selector("accessibilityContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object accessibilityContainer();

    @Generated
    @Selector("accessibilityFrame")
    @ByValue
    public native CGRect accessibilityFrame();

    /**
     * When set, -[UIAccessibilityElement accessibilityFrame] will automatically adjust for the container's frame.
     * This can be useful when the element is a descendant of a scroll view, for instance.
     */
    @Generated
    @Selector("accessibilityFrameInContainerSpace")
    @ByValue
    public native CGRect accessibilityFrameInContainerSpace();

    @Generated
    @Selector("accessibilityHint")
    public native String accessibilityHint();

    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    @Generated
    @Selector("accessibilityTraits")
    public native long accessibilityTraits();

    @Generated
    @Selector("accessibilityValue")
    public native String accessibilityValue();

    @Generated
    @Selector("init")
    public native UIAccessibilityElement init();

    /**
     * initialize with the accessibility container that contains this element
     */
    @Generated
    @Selector("initWithAccessibilityContainer:")
    public native UIAccessibilityElement initWithAccessibilityContainer(
            @Mapped(ObjCObjectMapper.class) Object container);

    @Generated
    @Selector("isAccessibilityElement")
    public native boolean isAccessibilityElement();

    @Generated
    @Selector("setAccessibilityContainer:")
    public native void setAccessibilityContainer_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setAccessibilityContainer(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = accessibilityContainer();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setAccessibilityContainer_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByValue CGRect value);

    /**
     * When set, -[UIAccessibilityElement accessibilityFrame] will automatically adjust for the container's frame.
     * This can be useful when the element is a descendant of a scroll view, for instance.
     */
    @Generated
    @Selector("setAccessibilityFrameInContainerSpace:")
    public native void setAccessibilityFrameInContainerSpace(@ByValue CGRect value);

    @Generated
    @Selector("setAccessibilityHint:")
    public native void setAccessibilityHint(String value);

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String value);

    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    @Generated
    @Selector("setAccessibilityTraits:")
    public native void setAccessibilityTraits(long value);

    @Generated
    @Selector("setAccessibilityValue:")
    public native void setAccessibilityValue(String value);

    @Generated
    @Selector("setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean value);

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);
}
