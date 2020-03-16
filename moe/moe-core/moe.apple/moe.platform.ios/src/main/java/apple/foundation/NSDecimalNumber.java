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

package apple.foundation;

import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.protocol.NSDecimalNumberBehaviors;
import apple.foundation.struct.NSRange;
import apple.mapkit.struct.MKCoordinateSpan;
import apple.quartzcore.struct.CATransform3D;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import apple.uikit.struct.UIEdgeInsets;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDecimalNumber alloc();

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
    @Selector("decimalNumberWithMantissa:exponent:isNegative:")
    public static native NSDecimalNumber decimalNumberWithMantissaExponentIsNegative(long mantissa, short exponent,
            boolean flag);

    @Generated
    @Selector("decimalNumberWithString:")
    public static native NSDecimalNumber decimalNumberWithString(String numberValue);

    @Generated
    @Selector("decimalNumberWithString:locale:")
    public static native NSDecimalNumber decimalNumberWithStringLocale(String numberValue,
            @Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("defaultBehavior")
    @MappedReturn(ObjCObjectMapper.class)
    public static native NSDecimalNumberBehaviors defaultBehavior();

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
    @Selector("maximumDecimalNumber")
    public static native NSDecimalNumber maximumDecimalNumber();

    @Generated
    @Selector("minimumDecimalNumber")
    public static native NSDecimalNumber minimumDecimalNumber();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("one")
    public static native NSDecimalNumber one();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDefaultBehavior:")
    public static native void setDefaultBehavior(@Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("value:withObjCType:")
    public static native NSValue valueWithObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    @Generated
    @Selector("valueWithBytes:objCType:")
    public static native NSValue valueWithBytesObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    @Generated
    @Selector("valueWithCATransform3D:")
    public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);

    @Generated
    @Selector("valueWithCGAffineTransform:")
    public static native NSValue valueWithCGAffineTransform(@ByValue CGAffineTransform transform);

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
    public static native NSValue valueWithCMTimeMapping(@ByValue CMTimeMapping timeMapping);

    @Generated
    @Selector("valueWithCMTimeRange:")
    public static native NSValue valueWithCMTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("valueWithMKCoordinate:")
    public static native NSValue valueWithMKCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    @Generated
    @Selector("valueWithMKCoordinateSpan:")
    public static native NSValue valueWithMKCoordinateSpan(@ByValue MKCoordinateSpan span);

    @Generated
    @Selector("valueWithNonretainedObject:")
    public static native NSValue valueWithNonretainedObject(@Mapped(ObjCObjectMapper.class) Object anObject);

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
    public static native NSValue valueWithUIEdgeInsets(@ByValue UIEdgeInsets insets);

    @Generated
    @Selector("valueWithUIOffset:")
    public static native NSValue valueWithUIOffset(@ByValue UIOffset insets);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("zero")
    public static native NSDecimalNumber zero();

    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(NSNumber decimalNumber);

    @Generated
    @Selector("decimalNumberByAdding:")
    public native NSDecimalNumber decimalNumberByAdding(NSDecimalNumber decimalNumber);

    @Generated
    @Selector("decimalNumberByAdding:withBehavior:")
    public native NSDecimalNumber decimalNumberByAddingWithBehavior(NSDecimalNumber decimalNumber,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberByDividingBy:")
    public native NSDecimalNumber decimalNumberByDividingBy(NSDecimalNumber decimalNumber);

    @Generated
    @Selector("decimalNumberByDividingBy:withBehavior:")
    public native NSDecimalNumber decimalNumberByDividingByWithBehavior(NSDecimalNumber decimalNumber,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberByMultiplyingBy:")
    public native NSDecimalNumber decimalNumberByMultiplyingBy(NSDecimalNumber decimalNumber);

    @Generated
    @Selector("decimalNumberByMultiplyingBy:withBehavior:")
    public native NSDecimalNumber decimalNumberByMultiplyingByWithBehavior(NSDecimalNumber decimalNumber,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberByMultiplyingByPowerOf10:")
    public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10(short power);

    @Generated
    @Selector("decimalNumberByMultiplyingByPowerOf10:withBehavior:")
    public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10WithBehavior(short power,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberByRaisingToPower:")
    public native NSDecimalNumber decimalNumberByRaisingToPower(@NUInt long power);

    @Generated
    @Selector("decimalNumberByRaisingToPower:withBehavior:")
    public native NSDecimalNumber decimalNumberByRaisingToPowerWithBehavior(@NUInt long power,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberByRoundingAccordingToBehavior:")
    public native NSDecimalNumber decimalNumberByRoundingAccordingToBehavior(
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("decimalNumberBySubtracting:")
    public native NSDecimalNumber decimalNumberBySubtracting(NSDecimalNumber decimalNumber);

    @Generated
    @Selector("decimalNumberBySubtracting:withBehavior:")
    public native NSDecimalNumber decimalNumberBySubtractingWithBehavior(NSDecimalNumber decimalNumber,
            @Mapped(ObjCObjectMapper.class) NSDecimalNumberBehaviors behavior);

    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

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
    public native NSDecimalNumber initWithBytesObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    @Generated
    @Selector("initWithChar:")
    public native NSNumber initWithChar(byte value);

    @Generated
    @Selector("initWithCoder:")
    public native NSDecimalNumber initWithCoder(NSCoder coder);

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

    @Generated
    @Selector("initWithMantissa:exponent:isNegative:")
    public native NSDecimalNumber initWithMantissaExponentIsNegative(long mantissa, short exponent, boolean flag);

    @Generated
    @Selector("initWithShort:")
    public native NSNumber initWithShort(short value);

    @Generated
    @Selector("initWithString:")
    public native NSDecimalNumber initWithString(String numberValue);

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

    @Generated
    @Selector("objCType")
    @MappedReturn(CStringMapper.class)
    public native String objCType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("valueWithDirectionalEdgeInsets:")
    public static native NSValue valueWithDirectionalEdgeInsets(@ByValue NSDirectionalEdgeInsets insets);
}
