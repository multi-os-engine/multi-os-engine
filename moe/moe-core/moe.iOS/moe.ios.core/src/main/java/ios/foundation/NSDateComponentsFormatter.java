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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateComponentsFormatter extends NSFormatter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDateComponentsFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDateComponentsFormatter alloc();

	/**
	 * allowedUnits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/allowedUnits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowedUnits")
	@NUInt
	public native long allowedUnits();

	/**
	 * allowsFractionalUnits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/allowsFractionalUnits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsFractionalUnits")
	public native boolean allowsFractionalUnits();

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calendar")
	public native NSCalendar calendar();

	/**
	 * collapsesLargestUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/collapsesLargestUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("collapsesLargestUnit")
	public native boolean collapsesLargestUnit();

	@Generated
	@Selector("formattingContext")
	@NInt
	public native long formattingContext();

	@Generated
	@Selector("getObjectValue:forString:errorDescription:")
	public native boolean getObjectValueForStringErrorDescription(
			Ptr<ObjCObject> obj, String string, Ptr<NSString> error);

	/**
	 * includesApproximationPhrase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/includesApproximationPhrase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("includesApproximationPhrase")
	public native boolean includesApproximationPhrase();

	/**
	 * includesTimeRemainingPhrase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/includesTimeRemainingPhrase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("includesTimeRemainingPhrase")
	public native boolean includesTimeRemainingPhrase();

	@Generated
	@Selector("init")
	public native NSDateComponentsFormatter init();

	/**
	 * localizedStringFromDateComponents:unitsStyle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/clm/NSDateComponentsFormatter/localizedStringFromDateComponents:unitsStyle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedStringFromDateComponents:unitsStyle:")
	public static native String localizedStringFromDateComponentsUnitsStyle(
			NSDateComponents components, @NInt long unitsStyle);

	/**
	 * maximumUnitCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/maximumUnitCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumUnitCount")
	@NInt
	public native long maximumUnitCount();

	/**
	 * allowedUnits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/allowedUnits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowedUnits:")
	public native void setAllowedUnits(@NUInt long value);

	/**
	 * allowsFractionalUnits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/allowsFractionalUnits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsFractionalUnits:")
	public native void setAllowsFractionalUnits(boolean value);

	/**
	 * calendar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/calendar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(NSCalendar value);

	/**
	 * collapsesLargestUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/collapsesLargestUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCollapsesLargestUnit:")
	public native void setCollapsesLargestUnit(boolean value);

	@Generated
	@Selector("setFormattingContext:")
	public native void setFormattingContext(@NInt long value);

	/**
	 * includesApproximationPhrase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/includesApproximationPhrase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIncludesApproximationPhrase:")
	public native void setIncludesApproximationPhrase(boolean value);

	/**
	 * includesTimeRemainingPhrase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/includesTimeRemainingPhrase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIncludesTimeRemainingPhrase:")
	public native void setIncludesTimeRemainingPhrase(boolean value);

	/**
	 * maximumUnitCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/maximumUnitCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumUnitCount:")
	public native void setMaximumUnitCount(@NInt long value);

	/**
	 * unitsStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/unitsStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUnitsStyle:")
	public native void setUnitsStyle(@NInt long value);

	/**
	 * zeroFormattingBehavior</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/zeroFormattingBehavior">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setZeroFormattingBehavior:")
	public native void setZeroFormattingBehavior(@NUInt long value);

	/**
	 * stringForObjectValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instm/NSDateComponentsFormatter/stringForObjectValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringForObjectValue:")
	public native String stringForObjectValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

	/**
	 * stringFromDate:toDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instm/NSDateComponentsFormatter/stringFromDate:toDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringFromDate:toDate:")
	public native String stringFromDateToDate(NSDate startDate, NSDate endDate);

	/**
	 * stringFromDateComponents:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instm/NSDateComponentsFormatter/stringFromDateComponents:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringFromDateComponents:")
	public native String stringFromDateComponents(NSDateComponents components);

	/**
	 * stringFromTimeInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instm/NSDateComponentsFormatter/stringFromTimeInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringFromTimeInterval:")
	public native String stringFromTimeInterval(double ti);

	/**
	 * unitsStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/unitsStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitsStyle")
	@NInt
	public native long unitsStyle();

	/**
	 * zeroFormattingBehavior</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSDateComponentsFormatter_class/index.html#//apple_ref/occ/instp/NSDateComponentsFormatter/zeroFormattingBehavior">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zeroFormattingBehavior")
	@NUInt
	public native long zeroFormattingBehavior();

	@Generated
	@Selector("initWithCoder:")
	public native NSDateComponentsFormatter initWithCoder(NSCoder aDecoder);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
