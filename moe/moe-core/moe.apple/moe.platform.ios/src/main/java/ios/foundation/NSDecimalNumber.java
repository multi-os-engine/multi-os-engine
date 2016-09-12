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


import org.moe.natj.c.map.CStringMapper;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.coregraphics.struct.CGVector;
import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.coremedia.struct.CMTime;
import ios.coremedia.struct.CMTimeMapping;
import ios.coremedia.struct.CMTimeRange;
import ios.foundation.struct.NSRange;
import ios.mapkit.struct.MKCoordinateSpan;
import ios.quartzcore.struct.CATransform3D;
import ios.scenekit.struct.SCNMatrix4;
import ios.scenekit.struct.SCNVector3;
import ios.scenekit.struct.SCNVector4;
import ios.uikit.struct.UIEdgeInsets;
import ios.uikit.struct.UIOffset;
import ios.foundation.protocol.NSDecimalNumberBehaviors;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDecimalNumber extends NSNumber {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDecimalNumber(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDecimalNumber alloc();

	/**
	 * compare:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/compare:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("compare:")
	@NInt
	public native long compare(NSNumber decimalNumber);

	/**
	 * decimalNumberByAdding:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByAdding:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByAdding:")
	public native NSDecimalNumber decimalNumberByAdding(
			NSDecimalNumber decimalNumber);

	/**
	 * decimalNumberByAdding:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByAdding:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByAdding:withBehavior:")
	public native NSDecimalNumber decimalNumberByAddingWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberByDividingBy:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByDividingBy:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByDividingBy:")
	public native NSDecimalNumber decimalNumberByDividingBy(
			NSDecimalNumber decimalNumber);

	/**
	 * decimalNumberByDividingBy:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByDividingBy:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByDividingBy:withBehavior:")
	public native NSDecimalNumber decimalNumberByDividingByWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberByMultiplyingBy:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByMultiplyingBy:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByMultiplyingBy:")
	public native NSDecimalNumber decimalNumberByMultiplyingBy(
			NSDecimalNumber decimalNumber);

	/**
	 * decimalNumberByMultiplyingBy:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByMultiplyingBy:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByMultiplyingBy:withBehavior:")
	public native NSDecimalNumber decimalNumberByMultiplyingByWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberByMultiplyingByPowerOf10:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByMultiplyingByPowerOf10:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByMultiplyingByPowerOf10:")
	public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10(
			short power);

	/**
	 * decimalNumberByMultiplyingByPowerOf10:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByMultiplyingByPowerOf10:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByMultiplyingByPowerOf10:withBehavior:")
	public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10WithBehavior(
			short power, @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberByRaisingToPower:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByRaisingToPower:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByRaisingToPower:")
	public native NSDecimalNumber decimalNumberByRaisingToPower(
			@NUInt long power);

	/**
	 * decimalNumberByRaisingToPower:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByRaisingToPower:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByRaisingToPower:withBehavior:")
	public native NSDecimalNumber decimalNumberByRaisingToPowerWithBehavior(
			@NUInt long power, @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberByRoundingAccordingToBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberByRoundingAccordingToBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberByRoundingAccordingToBehavior:")
	public native NSDecimalNumber decimalNumberByRoundingAccordingToBehavior(
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberBySubtracting:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberBySubtracting:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberBySubtracting:")
	public native NSDecimalNumber decimalNumberBySubtracting(
			NSDecimalNumber decimalNumber);

	/**
	 * decimalNumberBySubtracting:withBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/decimalNumberBySubtracting:withBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberBySubtracting:withBehavior:")
	public native NSDecimalNumber decimalNumberBySubtractingWithBehavior(
			NSDecimalNumber decimalNumber,
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	/**
	 * decimalNumberWithMantissa:exponent:isNegative:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/decimalNumberWithMantissa:exponent:isNegative:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberWithMantissa:exponent:isNegative:")
	public static native NSDecimalNumber decimalNumberWithMantissaExponentIsNegative(
			long mantissa, short exponent, boolean flag);

	/**
	 * decimalNumberWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/decimalNumberWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberWithString:")
	public static native NSDecimalNumber decimalNumberWithString(
			String numberValue);

	/**
	 * decimalNumberWithString:locale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/decimalNumberWithString:locale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("decimalNumberWithString:locale:")
	public static native NSDecimalNumber decimalNumberWithStringLocale(
			String numberValue, @Mapped(ObjCObjectMapper.class) Object locale);

	/**
	 * defaultBehavior</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/defaultBehavior">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultBehavior")
	@MappedReturn(ObjCObjectMapper.class)
	public static native NSDecimalNumberBehaviors defaultBehavior();

	/**
	 * descriptionWithLocale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/descriptionWithLocale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	/**
	 * doubleValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instp/NSDecimalNumber/doubleValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("init")
	public native NSDecimalNumber init();

	@Generated
	@Selector("initWithBool:")
	public native NSNumber initWithBool(boolean value);

	@Generated
	@Selector("initWithBytes:objCType:")
	public native NSDecimalNumber initWithBytesObjCType(
			ConstVoidPtr value,
			@Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("initWithChar:")
	public native NSNumber initWithChar(byte value);

	@Generated
	@Selector("initWithCoder:")
	public native NSDecimalNumber initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDouble:")
	public native NSNumber initWithDouble(double value);

	@Generated
	@Selector("initWithFloat:")
	public native NSNumber initWithFloat(float value);

	@Generated
	@Selector("initWithInt:")
	public native NSNumber initWithInt(int value);

	@Generated
	@Selector("initWithInteger:")
	public native NSNumber initWithInteger(@NInt long value);

	@Generated
	@Selector("initWithLong:")
	public native NSNumber initWithLong(@NInt long value);

	@Generated
	@Selector("initWithLongLong:")
	public native NSNumber initWithLongLong(long value);

	/**
	 * initWithMantissa:exponent:isNegative:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/initWithMantissa:exponent:isNegative:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithMantissa:exponent:isNegative:")
	public native NSDecimalNumber initWithMantissaExponentIsNegative(
			long mantissa, short exponent, boolean flag);

	@Generated
	@Selector("initWithShort:")
	public native NSNumber initWithShort(short value);

	/**
	 * initWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/initWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithString:")
	public native NSDecimalNumber initWithString(String numberValue);

	/**
	 * initWithString:locale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instm/NSDecimalNumber/initWithString:locale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithString:locale:")
	public native NSDecimalNumber initWithStringLocale(String numberValue,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("initWithUnsignedChar:")
	public native NSNumber initWithUnsignedChar(byte value);

	@Generated
	@Selector("initWithUnsignedInt:")
	public native NSNumber initWithUnsignedInt(int value);

	@Generated
	@Selector("initWithUnsignedInteger:")
	public native NSNumber initWithUnsignedInteger(@NUInt long value);

	@Generated
	@Selector("initWithUnsignedLong:")
	public native NSNumber initWithUnsignedLong(@NUInt long value);

	@Generated
	@Selector("initWithUnsignedLongLong:")
	public native NSNumber initWithUnsignedLongLong(long value);

	@Generated
	@Selector("initWithUnsignedShort:")
	public native NSNumber initWithUnsignedShort(char value);

	/**
	 * maximumDecimalNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/maximumDecimalNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumDecimalNumber")
	public static native NSDecimalNumber maximumDecimalNumber();

	/**
	 * minimumDecimalNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/minimumDecimalNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumDecimalNumber")
	public static native NSDecimalNumber minimumDecimalNumber();

	/**
	 * notANumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/notANumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notANumber")
	public static native NSDecimalNumber notANumber();

	@Generated
	@Selector("numberWithBool:")
	public static native NSNumber numberWithBool(boolean value);

	@Generated
	@Selector("numberWithChar:")
	public static native NSNumber numberWithChar(byte value);

	@Generated
	@Selector("numberWithDouble:")
	public static native NSNumber numberWithDouble(double value);

	@Generated
	@Selector("numberWithFloat:")
	public static native NSNumber numberWithFloat(float value);

	@Generated
	@Selector("numberWithInt:")
	public static native NSNumber numberWithInt(int value);

	@Generated
	@Selector("numberWithInteger:")
	public static native NSNumber numberWithInteger(@NInt long value);

	@Generated
	@Selector("numberWithLong:")
	public static native NSNumber numberWithLong(@NInt long value);

	@Generated
	@Selector("numberWithLongLong:")
	public static native NSNumber numberWithLongLong(long value);

	@Generated
	@Selector("numberWithShort:")
	public static native NSNumber numberWithShort(short value);

	@Generated
	@Selector("numberWithUnsignedChar:")
	public static native NSNumber numberWithUnsignedChar(byte value);

	@Generated
	@Selector("numberWithUnsignedInt:")
	public static native NSNumber numberWithUnsignedInt(int value);

	@Generated
	@Selector("numberWithUnsignedInteger:")
	public static native NSNumber numberWithUnsignedInteger(@NUInt long value);

	@Generated
	@Selector("numberWithUnsignedLong:")
	public static native NSNumber numberWithUnsignedLong(@NUInt long value);

	@Generated
	@Selector("numberWithUnsignedLongLong:")
	public static native NSNumber numberWithUnsignedLongLong(long value);

	@Generated
	@Selector("numberWithUnsignedShort:")
	public static native NSNumber numberWithUnsignedShort(char value);

	/**
	 * objCType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/instp/NSDecimalNumber/objCType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objCType")
	@MappedReturn(CStringMapper.class)
	public native String objCType();

	/**
	 * one</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/one">iOS Dev Center</a>
	 */
	@Generated
	@Selector("one")
	public static native NSDecimalNumber one();

	/**
	 * setDefaultBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/setDefaultBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDefaultBehavior:")
	public static native void setDefaultBehavior(
			@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

	@Generated
	@Selector("value:withObjCType:")
	public static native NSValue valueWithObjCType(
			ConstVoidPtr value,
			@Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("valueWithBytes:objCType:")
	public static native NSValue valueWithBytesObjCType(
			ConstVoidPtr value,
			@Mapped(CStringMapper.class) String type);

	@Generated
	@Selector("valueWithCATransform3D:")
	public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);

	@Generated
	@Selector("valueWithCGAffineTransform:")
	public static native NSValue valueWithCGAffineTransform(
			@ByValue CGAffineTransform transform);

	@Generated
	@Selector("valueWithCGPoint:")
	public static native NSValue valueWithCGPoint(@ByValue CGPoint point);

	@Generated
	@Selector("valueWithCGRect:")
	public static native NSValue valueWithCGRect(@ByValue CGRect rect);

	@Generated
	@Selector("valueWithCGSize:")
	public static native NSValue valueWithCGSize(@ByValue CGSize size);

	@Generated
	@Selector("valueWithCGVector:")
	public static native NSValue valueWithCGVector(@ByValue CGVector vector);

	@Generated
	@Selector("valueWithCMTime:")
	public static native NSValue valueWithCMTime(@ByValue CMTime time);

	@Generated
	@Selector("valueWithCMTimeMapping:")
	public static native NSValue valueWithCMTimeMapping(
			@ByValue CMTimeMapping timeMapping);

	@Generated
	@Selector("valueWithCMTimeRange:")
	public static native NSValue valueWithCMTimeRange(
			@ByValue CMTimeRange timeRange);

	@Generated
	@Selector("valueWithMKCoordinate:")
	public static native NSValue valueWithMKCoordinate(
			@ByValue CLLocationCoordinate2D coordinate);

	@Generated
	@Selector("valueWithMKCoordinateSpan:")
	public static native NSValue valueWithMKCoordinateSpan(
			@ByValue MKCoordinateSpan span);

	@Generated
	@Selector("valueWithNonretainedObject:")
	public static native NSValue valueWithNonretainedObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("valueWithPointer:")
	public static native NSValue valueWithPointer(ConstVoidPtr pointer);

	@Generated
	@Selector("valueWithRange:")
	public static native NSValue valueWithRange(@ByValue NSRange range);

	@Generated
	@Selector("valueWithSCNMatrix4:")
	public static native NSValue valueWithSCNMatrix4(@ByValue SCNMatrix4 v);

	@Generated
	@Selector("valueWithSCNVector3:")
	public static native NSValue valueWithSCNVector3(@ByValue SCNVector3 v);

	@Generated
	@Selector("valueWithSCNVector4:")
	public static native NSValue valueWithSCNVector4(@ByValue SCNVector4 v);

	@Generated
	@Selector("valueWithUIEdgeInsets:")
	public static native NSValue valueWithUIEdgeInsets(
			@ByValue UIEdgeInsets insets);

	@Generated
	@Selector("valueWithUIOffset:")
	public static native NSValue valueWithUIOffset(@ByValue UIOffset insets);

	/**
	 * zero</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSDecimalNumber_Class/index.html#//apple_ref/occ/clm/NSDecimalNumber/zero">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zero")
	public static native NSDecimalNumber zero();

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
