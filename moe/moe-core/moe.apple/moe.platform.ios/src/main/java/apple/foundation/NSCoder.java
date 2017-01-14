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
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.uikit.struct.UIEdgeInsets;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCoder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCoder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCoder alloc();

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

    @Generated
    @Selector("allowedClasses")
    public native NSSet<? extends Class> allowedClasses();

    @Generated
    @Selector("allowsKeyedCoding")
    public native boolean allowsKeyedCoding();

    @Generated
    @Selector("containsValueForKey:")
    public native boolean containsValueForKey(String key);

    @Generated
    @Selector("decodeArrayOfObjCType:count:at:")
    public native void decodeArrayOfObjCTypeCountAt(@Mapped(CStringMapper.class) String itemType, @NUInt long count,
            VoidPtr array);

    @Generated
    @Selector("decodeBoolForKey:")
    public native boolean decodeBoolForKey(String key);

    @Generated
    @Selector("decodeBytesForKey:returnedLength:")
    public native ConstBytePtr decodeBytesForKeyReturnedLength(String key, NUIntPtr lengthp);

    @Generated
    @Selector("decodeBytesWithReturnedLength:")
    public native VoidPtr decodeBytesWithReturnedLength(NUIntPtr lengthp);

    @Generated
    @Selector("decodeCGAffineTransformForKey:")
    @ByValue
    public native CGAffineTransform decodeCGAffineTransformForKey(String key);

    @Generated
    @Selector("decodeCGPointForKey:")
    @ByValue
    public native CGPoint decodeCGPointForKey(String key);

    @Generated
    @Selector("decodeCGRectForKey:")
    @ByValue
    public native CGRect decodeCGRectForKey(String key);

    @Generated
    @Selector("decodeCGSizeForKey:")
    @ByValue
    public native CGSize decodeCGSizeForKey(String key);

    @Generated
    @Selector("decodeCGVectorForKey:")
    @ByValue
    public native CGVector decodeCGVectorForKey(String key);

    @Generated
    @Selector("decodeCMTimeForKey:")
    @ByValue
    public native CMTime decodeCMTimeForKey(String key);

    @Generated
    @Selector("decodeCMTimeMappingForKey:")
    @ByValue
    public native CMTimeMapping decodeCMTimeMappingForKey(String key);

    @Generated
    @Selector("decodeCMTimeRangeForKey:")
    @ByValue
    public native CMTimeRange decodeCMTimeRangeForKey(String key);

    @Generated
    @Selector("decodeDataObject")
    public native NSData decodeDataObject();

    @Generated
    @Selector("decodeDoubleForKey:")
    public native double decodeDoubleForKey(String key);

    @Generated
    @Selector("decodeFloatForKey:")
    public native float decodeFloatForKey(String key);

    @Generated
    @Selector("decodeInt32ForKey:")
    public native int decodeInt32ForKey(String key);

    @Generated
    @Selector("decodeInt64ForKey:")
    public native long decodeInt64ForKey(String key);

    @Generated
    @Selector("decodeIntForKey:")
    public native int decodeIntForKey(String key);

    @Generated
    @Selector("decodeIntegerForKey:")
    @NInt
    public native long decodeIntegerForKey(String key);

    @Generated
    @Selector("decodeObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObject();

    @Generated
    @Selector("decodeObjectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectForKey(String key);

    @Generated
    @Selector("decodeObjectOfClass:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassForKey(Class aClass, String key);

    @Generated
    @Selector("decodeObjectOfClasses:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassesForKey(NSSet<? extends Class> classes, String key);

    @Generated
    @Selector("decodePropertyListForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodePropertyListForKey(String key);

    @Generated
    @Selector("decodeTopLevelObjectAndReturnError:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectForKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectForKeyError(String key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectOfClass:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassForKeyError(Class aClass, String key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectOfClasses:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassesForKeyError(NSSet<? extends Class> classes, String key,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("decodeUIEdgeInsetsForKey:")
    @ByValue
    public native UIEdgeInsets decodeUIEdgeInsetsForKey(String key);

    @Generated
    @Selector("decodeUIOffsetForKey:")
    @ByValue
    public native UIOffset decodeUIOffsetForKey(String key);

    @Generated
    @Selector("decodeValueOfObjCType:at:")
    public native void decodeValueOfObjCTypeAt(@Mapped(CStringMapper.class) String type, VoidPtr data);

    @Generated
    @Variadic()
    @Selector("decodeValuesOfObjCTypes:")
    public native void decodeValuesOfObjCTypes(@Mapped(CStringMapper.class) String types, Object... varargs);

    @Generated
    @Selector("decodingFailurePolicy")
    @NInt
    public native long decodingFailurePolicy();

    @Generated
    @Selector("encodeArrayOfObjCType:count:at:")
    public native void encodeArrayOfObjCTypeCountAt(@Mapped(CStringMapper.class) String type, @NUInt long count,
            ConstVoidPtr array);

    @Generated
    @Selector("encodeBool:forKey:")
    public native void encodeBoolForKey(boolean boolv, String key);

    @Generated
    @Selector("encodeBycopyObject:")
    public native void encodeBycopyObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("encodeByrefObject:")
    public native void encodeByrefObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("encodeBytes:length:")
    public native void encodeBytesLength(ConstVoidPtr byteaddr, @NUInt long length);

    @Generated
    @Selector("encodeBytes:length:forKey:")
    public native void encodeBytesLengthForKey(ConstBytePtr bytesp, @NUInt long lenv, String key);

    @Generated
    @Selector("encodeCGAffineTransform:forKey:")
    public native void encodeCGAffineTransformForKey(@ByValue CGAffineTransform transform, String key);

    @Generated
    @Selector("encodeCGPoint:forKey:")
    public native void encodeCGPointForKey(@ByValue CGPoint point, String key);

    @Generated
    @Selector("encodeCGRect:forKey:")
    public native void encodeCGRectForKey(@ByValue CGRect rect, String key);

    @Generated
    @Selector("encodeCGSize:forKey:")
    public native void encodeCGSizeForKey(@ByValue CGSize size, String key);

    @Generated
    @Selector("encodeCGVector:forKey:")
    public native void encodeCGVectorForKey(@ByValue CGVector vector, String key);

    @Generated
    @Selector("encodeCMTime:forKey:")
    public native void encodeCMTimeForKey(@ByValue CMTime time, String key);

    @Generated
    @Selector("encodeCMTimeMapping:forKey:")
    public native void encodeCMTimeMappingForKey(@ByValue CMTimeMapping timeMapping, String key);

    @Generated
    @Selector("encodeCMTimeRange:forKey:")
    public native void encodeCMTimeRangeForKey(@ByValue CMTimeRange timeRange, String key);

    @Generated
    @Selector("encodeConditionalObject:")
    public native void encodeConditionalObject(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("encodeConditionalObject:forKey:")
    public native void encodeConditionalObjectForKey(@Mapped(ObjCObjectMapper.class) Object objv, String key);

    @Generated
    @Selector("encodeDataObject:")
    public native void encodeDataObject(NSData data);

    @Generated
    @Selector("encodeDouble:forKey:")
    public native void encodeDoubleForKey(double realv, String key);

    @Generated
    @Selector("encodeFloat:forKey:")
    public native void encodeFloatForKey(float realv, String key);

    @Generated
    @Selector("encodeInt32:forKey:")
    public native void encodeInt32ForKey(int intv, String key);

    @Generated
    @Selector("encodeInt64:forKey:")
    public native void encodeInt64ForKey(long intv, String key);

    @Generated
    @Selector("encodeInt:forKey:")
    public native void encodeIntForKey(int intv, String key);

    @Generated
    @Selector("encodeInteger:forKey:")
    public native void encodeIntegerForKey(@NInt long intv, String key);

    @Generated
    @Selector("encodeObject:")
    public native void encodeObject(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("encodeObject:forKey:")
    public native void encodeObjectForKey(@Mapped(ObjCObjectMapper.class) Object objv, String key);

    @Generated
    @Selector("encodeRootObject:")
    public native void encodeRootObject(@Mapped(ObjCObjectMapper.class) Object rootObject);

    @Generated
    @Selector("encodeUIEdgeInsets:forKey:")
    public native void encodeUIEdgeInsetsForKey(@ByValue UIEdgeInsets insets, String key);

    @Generated
    @Selector("encodeUIOffset:forKey:")
    public native void encodeUIOffsetForKey(@ByValue UIOffset offset, String key);

    @Generated
    @Selector("encodeValueOfObjCType:at:")
    public native void encodeValueOfObjCTypeAt(@Mapped(CStringMapper.class) String type, ConstVoidPtr addr);

    @Generated
    @Variadic()
    @Selector("encodeValuesOfObjCTypes:")
    public native void encodeValuesOfObjCTypes(@Mapped(CStringMapper.class) String types, Object... varargs);

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("failWithError:")
    public native void failWithError(NSError error);

    @Generated
    @Selector("init")
    public native NSCoder init();

    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    @Generated
    @Selector("systemVersion")
    public native int systemVersion();

    @Generated
    @Selector("versionForClassName:")
    @NInt
    public native long versionForClassName(String className);
}
