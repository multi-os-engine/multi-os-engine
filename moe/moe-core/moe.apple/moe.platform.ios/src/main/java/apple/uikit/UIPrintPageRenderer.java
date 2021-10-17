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
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
public class UIPrintPageRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrintPageRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrintPageRenderer alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIPrintPageRenderer allocWithZone(VoidPtr zone);

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
    public static native UIPrintPageRenderer new_objc();

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
    @Selector("addPrintFormatter:startingAtPageAtIndex:")
    public native void addPrintFormatterStartingAtPageAtIndex(UIPrintFormatter formatter, @NInt long pageIndex);

    /**
     * override point. default does nothing
     */
    @Generated
    @Selector("drawContentForPageAtIndex:inRect:")
    public native void drawContentForPageAtIndexInRect(@NInt long pageIndex, @ByValue CGRect contentRect);

    /**
     * override point. default does nothing
     */
    @Generated
    @Selector("drawFooterForPageAtIndex:inRect:")
    public native void drawFooterForPageAtIndexInRect(@NInt long pageIndex, @ByValue CGRect footerRect);

    /**
     * override point. default does nothing
     */
    @Generated
    @Selector("drawHeaderForPageAtIndex:inRect:")
    public native void drawHeaderForPageAtIndexInRect(@NInt long pageIndex, @ByValue CGRect headerRect);

    /**
     * override point. may be called from non-main thread.  calls the various draw methods below.
     */
    @Generated
    @Selector("drawPageAtIndex:inRect:")
    public native void drawPageAtIndexInRect(@NInt long pageIndex, @ByValue CGRect printableRect);

    /**
     * override point. calls each formatter to draw for that page. subclassers must call super.
     */
    @Generated
    @Selector("drawPrintFormatter:forPageAtIndex:")
    public native void drawPrintFormatterForPageAtIndex(UIPrintFormatter printFormatter, @NInt long pageIndex);

    /**
     * bottom of contentRect from printableRect
     */
    @Generated
    @Selector("footerHeight")
    @NFloat
    public native double footerHeight();

    /**
     * top of contentRect from printableRect
     */
    @Generated
    @Selector("headerHeight")
    @NFloat
    public native double headerHeight();

    @Generated
    @Selector("init")
    public native UIPrintPageRenderer init();

    /**
     * override point. page count. default is maximum page count needed for all formatters or 0
     */
    @Generated
    @Selector("numberOfPages")
    @NInt
    public native long numberOfPages();

    /**
     * complete paper rect. origin is (0,0)
     */
    @Generated
    @Selector("paperRect")
    @ByValue
    public native CGRect paperRect();

    /**
     * override point. default does nothing. called before requesting a set of pages to draw
     */
    @Generated
    @Selector("prepareForDrawingPages:")
    public native void prepareForDrawingPages(@ByValue NSRange range);

    @Generated
    @Selector("printFormatters")
    public native NSArray<? extends UIPrintFormatter> printFormatters();

    @Generated
    @Selector("printFormattersForPageAtIndex:")
    public native NSArray<? extends UIPrintFormatter> printFormattersForPageAtIndex(@NInt long pageIndex);

    /**
     * imageable area inside paper rect
     */
    @Generated
    @Selector("printableRect")
    @ByValue
    public native CGRect printableRect();

    /**
     * bottom of contentRect from printableRect
     */
    @Generated
    @Selector("setFooterHeight:")
    public native void setFooterHeight(@NFloat double value);

    /**
     * top of contentRect from printableRect
     */
    @Generated
    @Selector("setHeaderHeight:")
    public native void setHeaderHeight(@NFloat double value);

    @Generated
    @Selector("setPrintFormatters:")
    public native void setPrintFormatters(NSArray<? extends UIPrintFormatter> value);

    /**
     * If the print sheet is unresponsive or sluggish due to the time is takes you to fully render a page,
     * you can override this method and read from requestedPrintRenderQuality to determine if the print operation prefers speed over fidelity.
     * Please see the comments for UIPrintRenderingQuality. Most applications render each page fast enough and do not need to override this method.
     * Return value is the quality you current actually used for the rendering.
     * Returns UIPrintRenderingQualityBest by default.
     */
    @Generated
    @Selector("currentRenderingQualityForRequestedRenderingQuality:")
    @NInt
    public native long currentRenderingQualityForRequestedRenderingQuality(@NInt long requestedRenderingQuality);
}
