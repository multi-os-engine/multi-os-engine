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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrintFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPrintFormatter allocWithZone(VoidPtr zone);

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
    public static native UIPrintFormatter new_objc();

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
    @Selector("contentInsets")
    @ByValue
    public native UIEdgeInsets contentInsets();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * override point to add custom drawing
     */
    @Generated
    @Selector("drawInRect:forPageAtIndex:")
    public native void drawInRectForPageAtIndex(@ByValue CGRect rect, @NInt long pageIndex);

    @Generated
    @Selector("init")
    public native UIPrintFormatter init();

    /**
     * default is 0.0. limits content to width
     */
    @Generated
    @Selector("maximumContentHeight")
    @NFloat
    public native double maximumContentHeight();

    /**
     * default is 0.0. limits content to height
     */
    @Generated
    @Selector("maximumContentWidth")
    @NFloat
    public native double maximumContentWidth();

    /**
     * calculated
     */
    @Generated
    @Selector("pageCount")
    @NInt
    public native long pageCount();

    /**
     * default is UIEdgeInsetsZero from edge of the page. applies to content on each page (each edge applies to each
     * page)
     */
    @Generated
    @Selector("perPageContentInsets")
    @ByValue
    public native UIEdgeInsets perPageContentInsets();

    /**
     * default is nil. set when formatter added to a print page renderer
     */
    @Generated
    @Selector("printPageRenderer")
    public native UIPrintPageRenderer printPageRenderer();

    /**
     * returns empty rect if index out of range
     */
    @Generated
    @Selector("rectForPageAtIndex:")
    @ByValue
    public native CGRect rectForPageAtIndex(@NInt long pageIndex);

    @Generated
    @Selector("removeFromPrintPageRenderer")
    public native void removeFromPrintPageRenderer();

    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue UIEdgeInsets value);

    /**
     * default is 0.0. limits content to width
     */
    @Generated
    @Selector("setMaximumContentHeight:")
    public native void setMaximumContentHeight(@NFloat double value);

    /**
     * default is 0.0. limits content to height
     */
    @Generated
    @Selector("setMaximumContentWidth:")
    public native void setMaximumContentWidth(@NFloat double value);

    /**
     * default is UIEdgeInsetsZero from edge of the page. applies to content on each page (each edge applies to each
     * page)
     */
    @Generated
    @Selector("setPerPageContentInsets:")
    public native void setPerPageContentInsets(@ByValue UIEdgeInsets value);

    /**
     * default is NSNotFound
     */
    @Generated
    @Selector("setStartPage:")
    public native void setStartPage(@NInt long value);

    /**
     * default is NSNotFound
     */
    @Generated
    @Selector("startPage")
    @NInt
    public native long startPage();
}
