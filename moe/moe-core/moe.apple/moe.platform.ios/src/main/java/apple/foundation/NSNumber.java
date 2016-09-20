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
import apple.cloudkit.protocol.CKRecordValue;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.struct.NSRange;
import apple.mapkit.struct.MKCoordinateSpan;
import apple.quartzcore.struct.CATransform3D;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
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
public class NSNumber extends NSValue implements CKRecordValue {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNumber(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNumber alloc();

    /**
     * numberWithBool:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithBool:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithBool:")
    public static native NSNumber numberWithBool(boolean value);

    /**
     * numberWithChar:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithChar:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithChar:")
    public static native NSNumber numberWithChar(byte value);

    /**
     * numberWithDouble:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithDouble:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithDouble:")
    public static native NSNumber numberWithDouble(double value);

    /**
     * numberWithFloat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithFloat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithFloat:")
    public static native NSNumber numberWithFloat(float value);

    /**
     * numberWithInt:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithInt:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithInt:")
    public static native NSNumber numberWithInt(int value);

    /**
     * numberWithInteger:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithInteger:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithInteger:")
    public static native NSNumber numberWithInteger(@NInt long value);

    /**
     * numberWithLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithLong:")
    public static native NSNumber numberWithLong(@NInt long value);

    /**
     * numberWithLongLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithLongLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithLongLong:")
    public static native NSNumber numberWithLongLong(long value);

    /**
     * numberWithShort:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithShort:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithShort:")
    public static native NSNumber numberWithShort(short value);

    /**
     * numberWithUnsignedChar:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedChar:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedChar:")
    public static native NSNumber numberWithUnsignedChar(byte value);

    /**
     * numberWithUnsignedInt:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedInt:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedInt:")
    public static native NSNumber numberWithUnsignedInt(int value);

    /**
     * numberWithUnsignedInteger:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedInteger:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedInteger:")
    public static native NSNumber numberWithUnsignedInteger(@NUInt long value);

    /**
     * numberWithUnsignedLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedLong:")
    public static native NSNumber numberWithUnsignedLong(@NUInt long value);

    /**
     * numberWithUnsignedLongLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedLongLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedLongLong:")
    public static native NSNumber numberWithUnsignedLongLong(long value);

    /**
     * numberWithUnsignedShort:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/clm/NSNumber/numberWithUnsignedShort:">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberWithUnsignedShort:")
    public static native NSNumber numberWithUnsignedShort(char value);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * boolValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/boolValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("boolValue")
    public native boolean boolValue();

    /**
     * charValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/charValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("charValue")
    public native byte charValue();

    /**
     * compare:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/compare:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(NSNumber otherNumber);

    /**
     * descriptionWithLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/descriptionWithLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Mapped(ObjCObjectMapper.class) Object locale);

    /**
     * doubleValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/doubleValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    /**
     * floatValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/floatValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("floatValue")
    public native float floatValue();

    @Generated
    @Selector("init")
    public native NSNumber init();

    /**
     * initWithBool:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithBool:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBool:")
    public native NSNumber initWithBool(boolean value);

    @Generated
    @Selector("initWithBytes:objCType:")
    public native NSNumber initWithBytesObjCType(ConstVoidPtr value, @Mapped(CStringMapper.class) String type);

    /**
     * initWithChar:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithChar:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithChar:")
    public native NSNumber initWithChar(byte value);

    @Generated
    @Selector("initWithCoder:")
    public native NSNumber initWithCoder(NSCoder aDecoder);

    /**
     * initWithDouble:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithDouble:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithDouble:")
    public native NSNumber initWithDouble(double value);

    /**
     * initWithFloat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithFloat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFloat:")
    public native NSNumber initWithFloat(float value);

    /**
     * initWithInt:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithInt:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithInt:")
    public native NSNumber initWithInt(int value);

    /**
     * initWithInteger:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithInteger:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithInteger:")
    public native NSNumber initWithInteger(@NInt long value);

    /**
     * initWithLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithLong:")
    public native NSNumber initWithLong(@NInt long value);

    /**
     * initWithLongLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithLongLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithLongLong:")
    public native NSNumber initWithLongLong(long value);

    /**
     * initWithShort:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithShort:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithShort:")
    public native NSNumber initWithShort(short value);

    /**
     * initWithUnsignedChar:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedChar:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedChar:")
    public native NSNumber initWithUnsignedChar(byte value);

    /**
     * initWithUnsignedInt:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedInt:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedInt:")
    public native NSNumber initWithUnsignedInt(int value);

    /**
     * initWithUnsignedInteger:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedInteger:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedInteger:")
    public native NSNumber initWithUnsignedInteger(@NUInt long value);

    /**
     * initWithUnsignedLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedLong:")
    public native NSNumber initWithUnsignedLong(@NUInt long value);

    /**
     * initWithUnsignedLongLong:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedLongLong:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedLongLong:")
    public native NSNumber initWithUnsignedLongLong(long value);

    /**
     * initWithUnsignedShort:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/initWithUnsignedShort:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithUnsignedShort:")
    public native NSNumber initWithUnsignedShort(char value);

    /**
     * intValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/intValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("intValue")
    public native int intValue();

    /**
     * integerValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/integerValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("integerValue")
    @NInt
    public native long integerValue();

    /**
     * isEqualToNumber:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instm/NSNumber/isEqualToNumber:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToNumber:")
    public native boolean isEqualToNumber(NSNumber number);

    /**
     * longLongValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/longLongValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("longLongValue")
    public native long longLongValue();

    /**
     * longValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/longValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("longValue")
    @NInt
    public native long longValue();

    /**
     * shortValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/shortValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("shortValue")
    public native short shortValue();

    /**
     * stringValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/stringValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    /**
     * unsignedCharValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedCharValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedCharValue")
    public native byte unsignedCharValue();

    /**
     * unsignedIntValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedIntValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedIntValue")
    public native int unsignedIntValue();

    /**
     * unsignedIntegerValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedIntegerValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedIntegerValue")
    @NUInt
    public native long unsignedIntegerValue();

    /**
     * unsignedLongLongValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedLongLongValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedLongLongValue")
    public native long unsignedLongLongValue();

    /**
     * unsignedLongValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedLongValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedLongValue")
    @NUInt
    public native long unsignedLongValue();

    /**
     * unsignedShortValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSNumber_Class/index.html#//apple_ref/occ/instp/NSNumber/unsignedShortValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("unsignedShortValue")
    public native char unsignedShortValue();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
