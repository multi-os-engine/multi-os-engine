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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFormatter extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFormatter alloc();

	/**
	 * attributedStringForObjectValue:withDefaultAttributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/attributedStringForObjectValue:withDefaultAttributes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attributedStringForObjectValue:withDefaultAttributes:")
	public native NSAttributedString attributedStringForObjectValueWithDefaultAttributes(
			@Mapped(ObjCObjectMapper.class) Object obj, NSDictionary<String, ?> attrs);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * editingStringForObjectValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/editingStringForObjectValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("editingStringForObjectValue:")
	public native String editingStringForObjectValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * getObjectValue:forString:errorDescription:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/getObjectValue:forString:errorDescription:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getObjectValue:forString:errorDescription:")
	public native boolean getObjectValueForStringErrorDescription(
			Ptr<ObjCObject> obj, String string, Ptr<NSString> error);

	@Generated
	@Selector("init")
	public native NSFormatter init();

	@Generated
	@Selector("initWithCoder:")
	public native NSFormatter initWithCoder(NSCoder aDecoder);

	/**
	 * isPartialStringValid:newEditingString:errorDescription:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/isPartialStringValid:newEditingString:errorDescription:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPartialStringValid:newEditingString:errorDescription:")
	public native boolean isPartialStringValidNewEditingStringErrorDescription(
			String partialString, Ptr<NSString> newString, Ptr<NSString> error);

	/**
	 * isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:")
	public native boolean isPartialStringValidProposedSelectedRangeOriginalStringOriginalSelectedRangeErrorDescription(
			Ptr<NSString> partialStringPtr,
			NSRange proposedSelRangePtr,
			String origString, @ByValue NSRange origSelRange,
			Ptr<NSString> error);

	/**
	 * stringForObjectValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFormatter_Class/index.html#//apple_ref/occ/instm/NSFormatter/stringForObjectValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringForObjectValue:")
	public native String stringForObjectValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

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
