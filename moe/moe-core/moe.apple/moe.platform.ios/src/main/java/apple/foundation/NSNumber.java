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
import apple.coredata.protocol.NSFetchRequestResult;
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
import apple.coremedia.struct.CMVideoDimensions;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.corefoundation.struct.CGVector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNumber extends NSValue implements CKRecordValue, NSFetchRequestResult {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNumber(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNumber alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSNumber allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSNumber new_objc();

    @NotNull
    @Generated
    @Selector("numberWithBool:")
    public static native NSNumber numberWithBool(boolean value);

    @NotNull
    @Generated
    @Selector("numberWithChar:")
    public static native NSNumber numberWithChar(byte value);

    @NotNull
    @Generated
    @Selector("numberWithDouble:")
    public static native NSNumber numberWithDouble(double value);

    @NotNull
    @Generated
    @Selector("numberWithFloat:")
    public static native NSNumber numberWithFloat(float value);

    @NotNull
    @Generated
    @Selector("numberWithInt:")
    public static native NSNumber numberWithInt(int value);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("numberWithInteger:")
    public static native NSNumber numberWithInteger(@NInt long value);

    @NotNull
    @Generated
    @Selector("numberWithLong:")
    public static native NSNumber numberWithLong(@NInt long value);

    @NotNull
    @Generated
    @Selector("numberWithLongLong:")
    public static native NSNumber numberWithLongLong(long value);

    @NotNull
    @Generated
    @Selector("numberWithShort:")
    public static native NSNumber numberWithShort(short value);

    @NotNull
    @Generated
    @Selector("numberWithUnsignedChar:")
    public static native NSNumber numberWithUnsignedChar(byte value);

    @NotNull
    @Generated
    @Selector("numberWithUnsignedInt:")
    public static native NSNumber numberWithUnsignedInt(int value);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("numberWithUnsignedInteger:")
    public static native NSNumber numberWithUnsignedInteger(@NUInt long value);

    @NotNull
    @Generated
    @Selector("numberWithUnsignedLong:")
    public static native NSNumber numberWithUnsignedLong(@NUInt long value);

    @NotNull
    @Generated
    @Selector("numberWithUnsignedLongLong:")
    public static native NSNumber numberWithUnsignedLongLong(long value);

    @NotNull
    @Generated
    @Selector("numberWithUnsignedShort:")
    public static native NSNumber numberWithUnsignedShort(char value);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @NotNull
    @Generated
    @Selector("value:withObjCType:")
    public static native NSValue valueWithObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @NotNull
    @Generated
    @Selector("valueWithBytes:objCType:")
    public static native NSValue valueWithBytesObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @NotNull
    @Generated
    @Selector("valueWithCATransform3D:")
    public static native NSValue valueWithCATransform3D(@ByValue CATransform3D t);

    @NotNull
    @Generated
    @Selector("valueWithCGAffineTransform:")
    public static native NSValue valueWithCGAffineTransform(@ByValue CGAffineTransform transform);

    @NotNull
    @Generated
    @Selector("valueWithCGPoint:")
    public static native NSValue valueWithCGPoint(@ByValue CGPoint point);

    @NotNull
    @Generated
    @Selector("valueWithCGRect:")
    public static native NSValue valueWithCGRect(@ByValue CGRect rect);

    @NotNull
    @Generated
    @Selector("valueWithCGSize:")
    public static native NSValue valueWithCGSize(@ByValue CGSize size);

    @NotNull
    @Generated
    @Selector("valueWithCGVector:")
    public static native NSValue valueWithCGVector(@ByValue CGVector vector);

    @NotNull
    @Generated
    @Selector("valueWithCMTime:")
    public static native NSValue valueWithCMTime(@ByValue CMTime time);

    @NotNull
    @Generated
    @Selector("valueWithCMTimeMapping:")
    public static native NSValue valueWithCMTimeMapping(@ByValue CMTimeMapping timeMapping);

    @NotNull
    @Generated
    @Selector("valueWithCMTimeRange:")
    public static native NSValue valueWithCMTimeRange(@ByValue CMTimeRange timeRange);

    @NotNull
    @Generated
    @Selector("valueWithMKCoordinate:")
    public static native NSValue valueWithMKCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    @NotNull
    @Generated
    @Selector("valueWithMKCoordinateSpan:")
    public static native NSValue valueWithMKCoordinateSpan(@ByValue MKCoordinateSpan span);

    @NotNull
    @Generated
    @Selector("valueWithNonretainedObject:")
    public static native NSValue valueWithNonretainedObject(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @NotNull
    @Generated
    @Selector("valueWithPointer:")
    public static native NSValue valueWithPointer(@Nullable ConstVoidPtr pointer);

    @NotNull
    @Generated
    @Selector("valueWithRange:")
    public static native NSValue valueWithRange(@ByValue NSRange range);

    @NotNull
    @Generated
    @Selector("valueWithSCNMatrix4:")
    public static native NSValue valueWithSCNMatrix4(@ByValue SCNMatrix4 v);

    @NotNull
    @Generated
    @Selector("valueWithSCNVector3:")
    public static native NSValue valueWithSCNVector3(@ByValue SCNVector3 v);

    @NotNull
    @Generated
    @Selector("valueWithSCNVector4:")
    public static native NSValue valueWithSCNVector4(@ByValue SCNVector4 v);

    @NotNull
    @Generated
    @Selector("valueWithUIEdgeInsets:")
    public static native NSValue valueWithUIEdgeInsets(@ByValue UIEdgeInsets insets);

    @NotNull
    @Generated
    @Selector("valueWithUIOffset:")
    public static native NSValue valueWithUIOffset(@ByValue UIOffset insets);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("boolValue")
    public native boolean boolValue();

    @Generated
    @Selector("charValue")
    public native byte charValue();

    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(@NotNull NSNumber otherNumber);

    @NotNull
    @Generated
    @Selector("descriptionWithLocale:")
    public native String descriptionWithLocale(@Nullable @Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    @Generated
    @Selector("floatValue")
    public native float floatValue();

    @Generated
    @Selector("init")
    public native NSNumber init();

    @NotNull
    @Generated
    @Selector("initWithBool:")
    public native NSNumber initWithBool(boolean value);

    @Generated
    @Selector("initWithBytes:objCType:")
    public native NSNumber initWithBytesObjCType(@NotNull ConstVoidPtr value,
            @NotNull @Mapped(CStringMapper.class) String type);

    @NotNull
    @Generated
    @Selector("initWithChar:")
    public native NSNumber initWithChar(byte value);

    @Generated
    @Selector("initWithCoder:")
    public native NSNumber initWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("initWithDouble:")
    public native NSNumber initWithDouble(double value);

    @NotNull
    @Generated
    @Selector("initWithFloat:")
    public native NSNumber initWithFloat(float value);

    @NotNull
    @Generated
    @Selector("initWithInt:")
    public native NSNumber initWithInt(int value);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("initWithInteger:")
    public native NSNumber initWithInteger(@NInt long value);

    @NotNull
    @Generated
    @Selector("initWithLong:")
    public native NSNumber initWithLong(@NInt long value);

    @NotNull
    @Generated
    @Selector("initWithLongLong:")
    public native NSNumber initWithLongLong(long value);

    @NotNull
    @Generated
    @Selector("initWithShort:")
    public native NSNumber initWithShort(short value);

    @NotNull
    @Generated
    @Selector("initWithUnsignedChar:")
    public native NSNumber initWithUnsignedChar(byte value);

    @NotNull
    @Generated
    @Selector("initWithUnsignedInt:")
    public native NSNumber initWithUnsignedInt(int value);

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("initWithUnsignedInteger:")
    public native NSNumber initWithUnsignedInteger(@NUInt long value);

    @NotNull
    @Generated
    @Selector("initWithUnsignedLong:")
    public native NSNumber initWithUnsignedLong(@NUInt long value);

    @NotNull
    @Generated
    @Selector("initWithUnsignedLongLong:")
    public native NSNumber initWithUnsignedLongLong(long value);

    @NotNull
    @Generated
    @Selector("initWithUnsignedShort:")
    public native NSNumber initWithUnsignedShort(char value);

    @Generated
    @Selector("intValue")
    public native int intValue();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("integerValue")
    @NInt
    public native long integerValue();

    @Generated
    @Selector("isEqualToNumber:")
    public native boolean isEqualToNumber(@NotNull NSNumber number);

    @Generated
    @Selector("longLongValue")
    public native long longLongValue();

    @Generated
    @Selector("longValue")
    @NInt
    public native long longValue();

    @Generated
    @Selector("shortValue")
    public native short shortValue();

    @NotNull
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unsignedCharValue")
    public native byte unsignedCharValue();

    @Generated
    @Selector("unsignedIntValue")
    public native int unsignedIntValue();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("unsignedIntegerValue")
    @NUInt
    public native long unsignedIntegerValue();

    @Generated
    @Selector("unsignedLongLongValue")
    public native long unsignedLongLongValue();

    @Generated
    @Selector("unsignedLongValue")
    @NUInt
    public native long unsignedLongValue();

    @Generated
    @Selector("unsignedShortValue")
    public native char unsignedShortValue();

    @NotNull
    @Generated
    @Selector("valueWithDirectionalEdgeInsets:")
    public static native NSValue valueWithDirectionalEdgeInsets(@ByValue NSDirectionalEdgeInsets insets);

    @Generated
    @Selector("valueWithCMVideoDimensions:")
    public static native NSValue valueWithCMVideoDimensions(@ByValue CMVideoDimensions dimensions);
}
