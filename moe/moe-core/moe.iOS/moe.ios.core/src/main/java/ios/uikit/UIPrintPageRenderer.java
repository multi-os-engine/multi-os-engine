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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * addPrintFormatter:startingAtPageAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/addPrintFormatter:startingAtPageAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPrintFormatter:startingAtPageAtIndex:")
	public native void addPrintFormatterStartingAtPageAtIndex(
			UIPrintFormatter formatter, @NInt long pageIndex);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIPrintPageRenderer alloc();

	/**
	 * drawContentForPageAtIndex:inRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawContentForPageAtIndex:inRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawContentForPageAtIndex:inRect:")
	public native void drawContentForPageAtIndexInRect(@NInt long pageIndex,
			@ByValue CGRect contentRect);

	/**
	 * drawFooterForPageAtIndex:inRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawFooterForPageAtIndex:inRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawFooterForPageAtIndex:inRect:")
	public native void drawFooterForPageAtIndexInRect(@NInt long pageIndex,
			@ByValue CGRect footerRect);

	/**
	 * drawHeaderForPageAtIndex:inRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawHeaderForPageAtIndex:inRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawHeaderForPageAtIndex:inRect:")
	public native void drawHeaderForPageAtIndexInRect(@NInt long pageIndex,
			@ByValue CGRect headerRect);

	/**
	 * drawPageAtIndex:inRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawPageAtIndex:inRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPageAtIndex:inRect:")
	public native void drawPageAtIndexInRect(@NInt long pageIndex,
			@ByValue CGRect printableRect);

	/**
	 * drawPrintFormatter:forPageAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawPrintFormatter:forPageAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPrintFormatter:forPageAtIndex:")
	public native void drawPrintFormatterForPageAtIndex(
			UIPrintFormatter printFormatter, @NInt long pageIndex);

	/**
	 * footerHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/footerHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("footerHeight")
	@NFloat
	public native double footerHeight();

	/**
	 * headerHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/headerHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headerHeight")
	@NFloat
	public native double headerHeight();

	@Generated
	@Selector("init")
	public native UIPrintPageRenderer init();

	/**
	 * numberOfPages</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/numberOfPages">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfPages")
	@NInt
	public native long numberOfPages();

	/**
	 * paperRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/paperRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("paperRect")
	@ByValue
	public native CGRect paperRect();

	/**
	 * prepareForDrawingPages:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/prepareForDrawingPages:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareForDrawingPages:")
	public native void prepareForDrawingPages(@ByValue NSRange range);

	/**
	 * printFormatters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/printFormatters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("printFormatters")
	public native NSArray<? extends UIPrintFormatter> printFormatters();

	/**
	 * printFormattersForPageAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instm/UIPrintPageRenderer/printFormattersForPageAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("printFormattersForPageAtIndex:")
	public native NSArray<? extends UIPrintFormatter> printFormattersForPageAtIndex(@NInt long pageIndex);

	/**
	 * printableRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/printableRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("printableRect")
	@ByValue
	public native CGRect printableRect();

	/**
	 * footerHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/footerHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFooterHeight:")
	public native void setFooterHeight(@NFloat double value);

	/**
	 * headerHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/headerHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeaderHeight:")
	public native void setHeaderHeight(@NFloat double value);

	/**
	 * printFormatters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/iPhone/Reference/UIPrintPageRenderer_Class/index.html#//apple_ref/occ/instp/UIPrintPageRenderer/printFormatters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPrintFormatters:")
	public native void setPrintFormatters(NSArray<? extends UIPrintFormatter> value);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native long version();
}
