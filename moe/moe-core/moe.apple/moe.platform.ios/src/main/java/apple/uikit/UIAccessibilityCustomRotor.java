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
public class UIAccessibilityCustomRotor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAccessibilityCustomRotor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAccessibilityCustomRotor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIAccessibilityCustomRotor allocWithZone(VoidPtr zone);

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
    public static native UIAccessibilityCustomRotor new_objc();

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
    public native UIAccessibilityCustomRotor init();

    @Generated
    @Selector("initWithName:itemSearchBlock:")
    public native UIAccessibilityCustomRotor initWithNameItemSearchBlock(String name,
            @ObjCBlock(name = "call_initWithNameItemSearchBlock") Block_initWithNameItemSearchBlock itemSearchBlock);

    /**
     * A block that takes a UIAccessibilityCustomRotorItemResult and the search direction and returns the next/previous instance of that rotor item.
     * If the currentItem is nil, that implies the first/last item should be returned.
     */
    @Generated
    @Selector("itemSearchBlock")
    @ObjCBlock(name = "call_itemSearchBlock_ret")
    public native Block_itemSearchBlock_ret itemSearchBlock();

    /**
     * The localized name the assistive technology will use to describe the custom rotor.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * A block that takes a UIAccessibilityCustomRotorItemResult and the search direction and returns the next/previous instance of that rotor item.
     * If the currentItem is nil, that implies the first/last item should be returned.
     */
    @Generated
    @Selector("setItemSearchBlock:")
    public native void setItemSearchBlock(@ObjCBlock(name = "call_setItemSearchBlock") Block_setItemSearchBlock value);

    /**
     * The localized name the assistive technology will use to describe the custom rotor.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithNameItemSearchBlock {
        @Generated
        UIAccessibilityCustomRotorItemResult call_initWithNameItemSearchBlock(
                UIAccessibilityCustomRotorSearchPredicate predicate);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_itemSearchBlock_ret {
        @Generated
        UIAccessibilityCustomRotorItemResult call_itemSearchBlock_ret(
                UIAccessibilityCustomRotorSearchPredicate predicate);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setItemSearchBlock {
        @Generated
        UIAccessibilityCustomRotorItemResult call_setItemSearchBlock(
                UIAccessibilityCustomRotorSearchPredicate predicate);
    }

    /**
     * Underlying attributed version of the "name" property. Setting this property will change the
     * value of the "name" property and vice-versa.
     */
    @Generated
    @Selector("attributedName")
    public native NSAttributedString attributedName();

    @Generated
    @Selector("initWithAttributedName:itemSearchBlock:")
    public native UIAccessibilityCustomRotor initWithAttributedNameItemSearchBlock(NSAttributedString attributedName,
            @ObjCBlock(name = "call_initWithAttributedNameItemSearchBlock") Block_initWithAttributedNameItemSearchBlock itemSearchBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithAttributedNameItemSearchBlock {
        @Generated
        UIAccessibilityCustomRotorItemResult call_initWithAttributedNameItemSearchBlock(
                UIAccessibilityCustomRotorSearchPredicate predicate);
    }

    @Generated
    @Selector("initWithSystemType:itemSearchBlock:")
    public native UIAccessibilityCustomRotor initWithSystemTypeItemSearchBlock(@NInt long type,
            @ObjCBlock(name = "call_initWithSystemTypeItemSearchBlock") Block_initWithSystemTypeItemSearchBlock itemSearchBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSystemTypeItemSearchBlock {
        @Generated
        UIAccessibilityCustomRotorItemResult call_initWithSystemTypeItemSearchBlock(
                UIAccessibilityCustomRotorSearchPredicate predicate);
    }

    /**
     * Underlying attributed version of the "name" property. Setting this property will change the
     * value of the "name" property and vice-versa.
     */
    @Generated
    @Selector("setAttributedName:")
    public native void setAttributedName(NSAttributedString value);

    /**
     * The system rotor type that was optionally used during initialization.
     * default = UIAccessibilityCustomSystemRotorTypeNone
     */
    @Generated
    @Selector("systemRotorType")
    @NInt
    public native long systemRotorType();
}
