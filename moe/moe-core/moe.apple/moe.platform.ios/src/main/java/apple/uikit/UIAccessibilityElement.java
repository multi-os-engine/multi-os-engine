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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIAccessibilityElement extends NSObject implements UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAccessibilityElement(Pointer peer) {
        super(peer);
    }

    /**
     * accessibilityContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object accessibilityContainer();

    /**
     * accessibilityFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityFrame")
    @ByValue
    public native CGRect accessibilityFrame();

    /**
     * accessibilityHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityHint")
    public native String accessibilityHint();

    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    /**
     * accessibilityLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    /**
     * accessibilityTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityTraits">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityTraits")
    public native long accessibilityTraits();

    /**
     * accessibilityValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityValue")
    public native String accessibilityValue();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAccessibilityElement alloc();

    @Generated
    @Selector("init")
    public native UIAccessibilityElement init();

    /**
     * initWithAccessibilityContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instm/UIAccessibilityElement/initWithAccessibilityContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAccessibilityContainer:")
    public native UIAccessibilityElement initWithAccessibilityContainer(
            @Mapped(ObjCObjectMapper.class) Object container);

    /**
     * isAccessibilityElement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/isAccessibilityElement">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAccessibilityElement")
    public native boolean isAccessibilityElement();

    /**
     * accessibilityContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityContainer:")
    public native void setAccessibilityContainer_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * accessibilityContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityContainer">iOS Dev Center</a>
     */
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

    /**
     * accessibilityFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByValue CGRect value);

    /**
     * accessibilityHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityHint:")
    public native void setAccessibilityHint(String value);

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String value);

    /**
     * accessibilityLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    /**
     * accessibilityTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityTraits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityTraits:")
    public native void setAccessibilityTraits(long value);

    /**
     * accessibilityValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/accessibilityValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityValue:")
    public native void setAccessibilityValue(String value);

    /**
     * isAccessibilityElement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityElement_Class/index.html#//apple_ref/occ/instp/UIAccessibilityElement/isAccessibilityElement">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean value);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
}
