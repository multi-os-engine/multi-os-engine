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
import apple.foundation.protocol.NSCopying;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
public class UIPrintFormatter extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrintFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrintFormatter alloc();

    /**
     * contentInsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/contentInsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentInsets")
    @ByValue
    public native UIEdgeInsets contentInsets();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * drawInRect:forPageAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instm/UIPrintFormatter/drawInRect:forPageAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawInRect:forPageAtIndex:")
    public native void drawInRectForPageAtIndex(@ByValue CGRect rect, @NInt long pageIndex);

    @Generated
    @Selector("init")
    public native UIPrintFormatter init();

    /**
     * maximumContentHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/maximumContentHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumContentHeight")
    @NFloat
    public native double maximumContentHeight();

    /**
     * maximumContentWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/maximumContentWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumContentWidth")
    @NFloat
    public native double maximumContentWidth();

    /**
     * pageCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/pageCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("pageCount")
    @NInt
    public native long pageCount();

    /**
     * perPageContentInsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/perPageContentInsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("perPageContentInsets")
    @ByValue
    public native UIEdgeInsets perPageContentInsets();

    /**
     * printPageRenderer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/printPageRenderer">iOS Dev Center</a>
     */
    @Generated
    @Selector("printPageRenderer")
    public native UIPrintPageRenderer printPageRenderer();

    /**
     * rectForPageAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instm/UIPrintFormatter/rectForPageAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rectForPageAtIndex:")
    @ByValue
    public native CGRect rectForPageAtIndex(@NInt long pageIndex);

    /**
     * removeFromPrintPageRenderer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instm/UIPrintFormatter/removeFromPrintPageRenderer">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromPrintPageRenderer")
    public native void removeFromPrintPageRenderer();

    /**
     * contentInsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/contentInsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue UIEdgeInsets value);

    /**
     * maximumContentHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/maximumContentHeight">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumContentHeight:")
    public native void setMaximumContentHeight(@NFloat double value);

    /**
     * maximumContentWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/maximumContentWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumContentWidth:")
    public native void setMaximumContentWidth(@NFloat double value);

    /**
     * perPageContentInsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/perPageContentInsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPerPageContentInsets:")
    public native void setPerPageContentInsets(@ByValue UIEdgeInsets value);

    /**
     * startPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/startPage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStartPage:")
    public native void setStartPage(@NInt long value);

    /**
     * startPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPrintFormatter_Class/index.html#//apple_ref/occ/instp/UIPrintFormatter/startPage">iOS Dev Center</a>
     */
    @Generated
    @Selector("startPage")
    @NInt
    public native long startPage();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
