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
import apple.foundation.NSAttributedString;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAccessibilityCustomAction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAccessibilityCustomAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAccessibilityCustomAction alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIAccessibilityCustomAction allocWithZone(VoidPtr zone);

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
    public static native UIAccessibilityCustomAction new_objc();

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
    public native UIAccessibilityCustomAction init();

    @Generated
    @Selector("initWithName:target:selector:")
    public native UIAccessibilityCustomAction initWithNameTargetSelector(String name,
            @Mapped(ObjCObjectMapper.class) Object target, SEL selector);

    /**
     * A localized name that describes the action.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The method that will be called on the target to perform the action.
     * It must conform to one of the following signatures:
     * - (BOOL)myPerformActionMethod;
     * - (BOOL)myPerformActionMethod:(UIAccessibilityCustomAction *)action;
     */
    @Generated
    @Selector("selector")
    public native SEL selector();

    /**
     * A localized name that describes the action.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * The method that will be called on the target to perform the action.
     * It must conform to one of the following signatures:
     * - (BOOL)myPerformActionMethod;
     * - (BOOL)myPerformActionMethod:(UIAccessibilityCustomAction *)action;
     */
    @Generated
    @Selector("setSelector:")
    public native void setSelector(SEL value);

    /**
     * The object that will perform the action.
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The object that will perform the action.
     */
    @Generated
    public void setTarget(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The object that will perform the action.
     */
    @Generated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    /**
     * Underlying attributed version of the "name" property. Setting this property will change the
     * value of the "name" property and vice-versa.
     */
    @Generated
    @Selector("attributedName")
    public native NSAttributedString attributedName();

    @Generated
    @Selector("initWithAttributedName:target:selector:")
    public native UIAccessibilityCustomAction initWithAttributedNameTargetSelector(NSAttributedString attributedName,
            @Mapped(ObjCObjectMapper.class) Object target, SEL selector);

    /**
     * Underlying attributed version of the "name" property. Setting this property will change the
     * value of the "name" property and vice-versa.
     */
    @Generated
    @Selector("setAttributedName:")
    public native void setAttributedName(NSAttributedString value);

    /**
     * If the actionHandler is set, it will be preferred over the target/selector.
     */
    @Generated
    @Selector("actionHandler")
    @ObjCBlock(name = "call_actionHandler_ret")
    public native Block_actionHandler_ret actionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_actionHandler_ret {
        @Generated
        boolean call_actionHandler_ret(UIAccessibilityCustomAction customAction);
    }

    @Generated
    @Selector("initWithAttributedName:actionHandler:")
    public native UIAccessibilityCustomAction initWithAttributedNameActionHandler(NSAttributedString attributedName,
            @ObjCBlock(name = "call_initWithAttributedNameActionHandler") Block_initWithAttributedNameActionHandler actionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithAttributedNameActionHandler {
        @Generated
        boolean call_initWithAttributedNameActionHandler(UIAccessibilityCustomAction customAction);
    }

    @Generated
    @Selector("initWithName:actionHandler:")
    public native UIAccessibilityCustomAction initWithNameActionHandler(String name,
            @ObjCBlock(name = "call_initWithNameActionHandler") Block_initWithNameActionHandler actionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithNameActionHandler {
        @Generated
        boolean call_initWithNameActionHandler(UIAccessibilityCustomAction customAction);
    }

    /**
     * If the actionHandler is set, it will be preferred over the target/selector.
     */
    @Generated
    @Selector("setActionHandler:")
    public native void setActionHandler(@ObjCBlock(name = "call_setActionHandler") Block_setActionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActionHandler {
        @Generated
        boolean call_setActionHandler(UIAccessibilityCustomAction customAction);
    }

    /**
     * An image representing the action to be shown with some assistive technologies such as Switch Control.
     */
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("initWithAttributedName:image:actionHandler:")
    public native UIAccessibilityCustomAction initWithAttributedNameImageActionHandler(
            NSAttributedString attributedName, UIImage image,
            @ObjCBlock(name = "call_initWithAttributedNameImageActionHandler") Block_initWithAttributedNameImageActionHandler actionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithAttributedNameImageActionHandler {
        @Generated
        boolean call_initWithAttributedNameImageActionHandler(UIAccessibilityCustomAction customAction);
    }

    @Generated
    @Selector("initWithAttributedName:image:target:selector:")
    public native UIAccessibilityCustomAction initWithAttributedNameImageTargetSelector(
            NSAttributedString attributedName, UIImage image, @Mapped(ObjCObjectMapper.class) Object target,
            SEL selector);

    @Generated
    @Selector("initWithName:image:actionHandler:")
    public native UIAccessibilityCustomAction initWithNameImageActionHandler(String name, UIImage image,
            @ObjCBlock(name = "call_initWithNameImageActionHandler") Block_initWithNameImageActionHandler actionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithNameImageActionHandler {
        @Generated
        boolean call_initWithNameImageActionHandler(UIAccessibilityCustomAction customAction);
    }

    @Generated
    @Selector("initWithName:image:target:selector:")
    public native UIAccessibilityCustomAction initWithNameImageTargetSelector(String name, UIImage image,
            @Mapped(ObjCObjectMapper.class) Object target, SEL selector);

    /**
     * An image representing the action to be shown with some assistive technologies such as Switch Control.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);
}
