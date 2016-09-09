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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.cloudkit.protocol.CKRecordValue;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDate extends NSObject implements NSCopying, NSSecureCoding,
		CKRecordValue {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDate(Pointer peer) {
		super(peer);
	}

	/**
	 * addTimeInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/addTimeInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("addTimeInterval:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object addTimeInterval(double seconds);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDate alloc();

	/**
	 * compare:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/compare:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("compare:")
	@NInt
	public native long compare(NSDate other);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * date</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/date">iOS Dev Center</a>
	 */
	@Generated
	@Selector("date")
	public static native NSDate date();

	/**
	 * dateByAddingTimeInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/dateByAddingTimeInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateByAddingTimeInterval:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dateByAddingTimeInterval(double ti);

	/**
	 * dateWithTimeInterval:sinceDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/dateWithTimeInterval:sinceDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateWithTimeInterval:sinceDate:")
	public static native NSDate dateWithTimeIntervalSinceDate(
			double secsToBeAdded, NSDate date);

	/**
	 * dateWithTimeIntervalSince1970:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/dateWithTimeIntervalSince1970:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateWithTimeIntervalSince1970:")
	public static native NSDate dateWithTimeIntervalSince1970(double secs);

	/**
	 * dateWithTimeIntervalSinceNow:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/dateWithTimeIntervalSinceNow:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateWithTimeIntervalSinceNow:")
	public static native NSDate dateWithTimeIntervalSinceNow(double secs);

	/**
	 * dateWithTimeIntervalSinceReferenceDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/dateWithTimeIntervalSinceReferenceDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dateWithTimeIntervalSinceReferenceDate:")
	public static native NSDate dateWithTimeIntervalSinceReferenceDate(double ti);

	/**
	 * description</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instp/NSDate/description">iOS Dev Center</a>
	 */
	@Generated
	@Selector("description")
	public native String description();

	/**
	 * descriptionWithLocale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/descriptionWithLocale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	/**
	 * distantFuture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/distantFuture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distantFuture")
	public static native NSDate distantFuture();

	/**
	 * distantPast</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/distantPast">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distantPast")
	public static native NSDate distantPast();

	/**
	 * earlierDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/earlierDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("earlierDate:")
	public native NSDate earlierDate(NSDate anotherDate);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSDate init();

	@Generated
	@Selector("initWithCoder:")
	public native NSDate initWithCoder(NSCoder aDecoder);

	/**
	 * initWithTimeInterval:sinceDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/initWithTimeInterval:sinceDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTimeInterval:sinceDate:")
	public native NSDate initWithTimeIntervalSinceDate(double secsToBeAdded,
			NSDate date);

	/**
	 * initWithTimeIntervalSince1970:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/initWithTimeIntervalSince1970:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTimeIntervalSince1970:")
	public native NSDate initWithTimeIntervalSince1970(double secs);

	/**
	 * initWithTimeIntervalSinceNow:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/initWithTimeIntervalSinceNow:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTimeIntervalSinceNow:")
	public native NSDate initWithTimeIntervalSinceNow(double secs);

	/**
	 * initWithTimeIntervalSinceReferenceDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/initWithTimeIntervalSinceReferenceDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTimeIntervalSinceReferenceDate:")
	public native NSDate initWithTimeIntervalSinceReferenceDate(double ti);

	/**
	 * isEqualToDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/isEqualToDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqualToDate:")
	public native boolean isEqualToDate(NSDate otherDate);

	/**
	 * laterDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/laterDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("laterDate:")
	public native NSDate laterDate(NSDate anotherDate);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * timeIntervalSince1970</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instp/NSDate/timeIntervalSince1970">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeIntervalSince1970")
	public native double timeIntervalSince1970();

	/**
	 * timeIntervalSinceDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instm/NSDate/timeIntervalSinceDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeIntervalSinceDate:")
	public native double timeIntervalSinceDate(NSDate anotherDate);

	/**
	 * timeIntervalSinceNow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instp/NSDate/timeIntervalSinceNow">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeIntervalSinceNow")
	public native double timeIntervalSinceNow();

	/**
	 * timeIntervalSinceReferenceDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/instp/NSDate/timeIntervalSinceReferenceDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeIntervalSinceReferenceDate")
	public native double timeIntervalSinceReferenceDate();

	/**
	 * timeIntervalSinceReferenceDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDate_Class/index.html#//apple_ref/occ/clm/NSDate/timeIntervalSinceReferenceDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeIntervalSinceReferenceDate")
	public static native double timeIntervalSinceReferenceDate_static();

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
	public static native long version_static();
}
