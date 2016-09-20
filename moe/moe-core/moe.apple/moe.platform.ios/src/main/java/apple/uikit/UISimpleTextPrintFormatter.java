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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISimpleTextPrintFormatter extends UIPrintFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected UISimpleTextPrintFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISimpleTextPrintFormatter alloc();

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

    /**
     * attributedText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/attributedText">iOS Dev Center</a>
     */
    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/font">iOS Dev Center</a>
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @Selector("init")
    public native UISimpleTextPrintFormatter init();

    /**
     * initWithAttributedText:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instm/UISimpleTextPrintFormatter/initWithAttributedText:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAttributedText:")
    public native UISimpleTextPrintFormatter initWithAttributedText(NSAttributedString attributedText);

    /**
     * initWithText:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instm/UISimpleTextPrintFormatter/initWithText:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithText:")
    public native UISimpleTextPrintFormatter initWithText(String text);

    /**
     * attributedText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/attributedText">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(NSAttributedString value);

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * font</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/font">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("text")
    public native String text();

    /**
     * textAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISimpleTextPrintFormatter_Class/index.html#//apple_ref/occ/instp/UISimpleTextPrintFormatter/textAlignment">iOS Dev Center</a>
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();
}
