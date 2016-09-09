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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableParagraphStyle extends NSParagraphStyle {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableParagraphStyle(Pointer peer) {
		super(peer);
	}

	/**
	 * alignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/alignment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alignment")
	@NInt
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableParagraphStyle alloc();

	/**
	 * baseWritingDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/baseWritingDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("baseWritingDirection")
	@NInt
	public native long baseWritingDirection();

	/**
	 * defaultTabInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/defaultTabInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultTabInterval")
	@NFloat
	public native double defaultTabInterval();

	/**
	 * firstLineHeadIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/firstLineHeadIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("firstLineHeadIndent")
	@NFloat
	public native double firstLineHeadIndent();

	/**
	 * headIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/headIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headIndent")
	@NFloat
	public native double headIndent();

	/**
	 * hyphenationFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/hyphenationFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hyphenationFactor")
	public native float hyphenationFactor();

	@Generated
	@Selector("init")
	public native NSMutableParagraphStyle init();

	/**
	 * lineBreakMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineBreakMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineBreakMode")
	@NInt
	public native long lineBreakMode();

	/**
	 * lineHeightMultiple</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineHeightMultiple">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineHeightMultiple")
	@NFloat
	public native double lineHeightMultiple();

	/**
	 * lineSpacing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineSpacing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineSpacing")
	@NFloat
	public native double lineSpacing();

	/**
	 * maximumLineHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/maximumLineHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumLineHeight")
	@NFloat
	public native double maximumLineHeight();

	/**
	 * minimumLineHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/minimumLineHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumLineHeight")
	@NFloat
	public native double minimumLineHeight();

	/**
	 * paragraphSpacing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/paragraphSpacing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("paragraphSpacing")
	@NFloat
	public native double paragraphSpacing();

	/**
	 * paragraphSpacingBefore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/paragraphSpacingBefore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("paragraphSpacingBefore")
	@NFloat
	public native double paragraphSpacingBefore();

	/**
	 * alignment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/alignment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(@NInt long value);

	/**
	 * baseWritingDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/baseWritingDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBaseWritingDirection:")
	public native void setBaseWritingDirection(@NInt long value);

	/**
	 * defaultTabInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/defaultTabInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDefaultTabInterval:")
	public native void setDefaultTabInterval(@NFloat double value);

	/**
	 * firstLineHeadIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/firstLineHeadIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFirstLineHeadIndent:")
	public native void setFirstLineHeadIndent(@NFloat double value);

	/**
	 * headIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/headIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeadIndent:")
	public native void setHeadIndent(@NFloat double value);

	/**
	 * hyphenationFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/hyphenationFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHyphenationFactor:")
	public native void setHyphenationFactor(float value);

	/**
	 * lineBreakMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineBreakMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineBreakMode:")
	public native void setLineBreakMode(@NInt long value);

	/**
	 * lineHeightMultiple</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineHeightMultiple">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineHeightMultiple:")
	public native void setLineHeightMultiple(@NFloat double value);

	/**
	 * lineSpacing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/lineSpacing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineSpacing:")
	public native void setLineSpacing(@NFloat double value);

	/**
	 * maximumLineHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/maximumLineHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumLineHeight:")
	public native void setMaximumLineHeight(@NFloat double value);

	/**
	 * minimumLineHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/minimumLineHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumLineHeight:")
	public native void setMinimumLineHeight(@NFloat double value);

	/**
	 * paragraphSpacing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/paragraphSpacing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setParagraphSpacing:")
	public native void setParagraphSpacing(@NFloat double value);

	/**
	 * paragraphSpacingBefore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/paragraphSpacingBefore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setParagraphSpacingBefore:")
	public native void setParagraphSpacingBefore(@NFloat double value);

	/**
	 * tabStops</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/tabStops">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTabStops:")
	public native void setTabStops(NSArray<? extends NSTextTab> value);

	/**
	 * tailIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/tailIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTailIndent:")
	public native void setTailIndent(@NFloat double value);

	/**
	 * tabStops</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/tabStops">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tabStops")
	public native NSArray<? extends NSTextTab> tabStops();

	/**
	 * tailIndent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instp/NSMutableParagraphStyle/tailIndent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tailIndent")
	@NFloat
	public native double tailIndent();

	/**
	 * addTabStop:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instm/NSMutableParagraphStyle/addTabStop:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addTabStop:")
	public native void addTabStop(NSTextTab anObject);

	@Generated
	@Selector("allowsDefaultTighteningForTruncation")
	public native boolean allowsDefaultTighteningForTruncation();

	/**
	 * removeTabStop:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instm/NSMutableParagraphStyle/removeTabStop:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeTabStop:")
	public native void removeTabStop(NSTextTab anObject);

	@Generated
	@Selector("setAllowsDefaultTighteningForTruncation:")
	public native void setAllowsDefaultTighteningForTruncation(boolean value);

	/**
	 * setParagraphStyle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSMutableParagraphStyle_Class/index.html#//apple_ref/occ/instm/NSMutableParagraphStyle/setParagraphStyle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setParagraphStyle:")
	public native void setParagraphStyle(NSParagraphStyle obj);

	@Generated
	@Selector("initWithCoder:")
	public native NSMutableParagraphStyle initWithCoder(NSCoder aDecoder);

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
	@Selector("defaultParagraphStyle")
	public static native NSParagraphStyle defaultParagraphStyle();

	@Generated
	@Selector("defaultWritingDirectionForLanguage:")
	@NInt
	public static native long defaultWritingDirectionForLanguage(
			String languageName);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
