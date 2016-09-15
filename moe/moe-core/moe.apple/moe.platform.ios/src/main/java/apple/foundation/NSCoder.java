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
    @Owned
    @Selector("alloc")
    public static native NSCoder alloc();

    /**
     * allowedClasses</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instp/NSCoder/allowedClasses">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowedClasses")
    public native NSSet<? extends Class> allowedClasses();

    /**
     * allowsKeyedCoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instp/NSCoder/allowsKeyedCoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsKeyedCoding")
    public native boolean allowsKeyedCoding();

    /**
     * containsValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/containsValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsValueForKey:")
    public native boolean containsValueForKey(String key);

    /**
     * decodeArrayOfObjCType:count:at:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeArrayOfObjCType:count:at:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeArrayOfObjCType:count:at:")
    public native void decodeArrayOfObjCTypeCountAt(@Mapped(CStringMapper.class) String itemType, @NUInt long count,
            VoidPtr array);

    /**
     * decodeBoolForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeBoolForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeBoolForKey:")
    public native boolean decodeBoolForKey(String key);

    /**
     * decodeBytesForKey:returnedLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeBytesForKey:returnedLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeBytesForKey:returnedLength:")
    public native ConstBytePtr decodeBytesForKeyReturnedLength(String key, NUIntPtr lengthp);

    /**
     * decodeBytesWithReturnedLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeBytesWithReturnedLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeBytesWithReturnedLength:")
    public native VoidPtr decodeBytesWithReturnedLength(NUIntPtr lengthp);

    /**
     * decodeCGAffineTransformForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCGAffineTransformForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCGAffineTransformForKey:")
    @ByValue
    public native CGAffineTransform decodeCGAffineTransformForKey(String key);

    /**
     * decodeCGPointForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCGPointForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCGPointForKey:")
    @ByValue
    public native CGPoint decodeCGPointForKey(String key);

    /**
     * decodeCGRectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCGRectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCGRectForKey:")
    @ByValue
    public native CGRect decodeCGRectForKey(String key);

    /**
     * decodeCGSizeForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCGSizeForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCGSizeForKey:")
    @ByValue
    public native CGSize decodeCGSizeForKey(String key);

    /**
     * decodeCGVectorForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCGVectorForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCGVectorForKey:")
    @ByValue
    public native CGVector decodeCGVectorForKey(String key);

    /**
     * decodeCMTimeForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCMTimeForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCMTimeForKey:")
    @ByValue
    public native CMTime decodeCMTimeForKey(String key);

    /**
     * decodeCMTimeMappingForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCMTimeMappingForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCMTimeMappingForKey:")
    @ByValue
    public native CMTimeMapping decodeCMTimeMappingForKey(String key);

    /**
     * decodeCMTimeRangeForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeCMTimeRangeForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeCMTimeRangeForKey:")
    @ByValue
    public native CMTimeRange decodeCMTimeRangeForKey(String key);

    /**
     * decodeDataObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeDataObject">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeDataObject")
    public native NSData decodeDataObject();

    /**
     * decodeDoubleForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeDoubleForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeDoubleForKey:")
    public native double decodeDoubleForKey(String key);

    /**
     * decodeFloatForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeFloatForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeFloatForKey:")
    public native float decodeFloatForKey(String key);

    /**
     * decodeInt32ForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeInt32ForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeInt32ForKey:")
    public native int decodeInt32ForKey(String key);

    /**
     * decodeInt64ForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeInt64ForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeInt64ForKey:")
    public native long decodeInt64ForKey(String key);

    /**
     * decodeIntForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeIntForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeIntForKey:")
    public native int decodeIntForKey(String key);

    /**
     * decodeIntegerForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeIntegerForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeIntegerForKey:")
    @NInt
    public native long decodeIntegerForKey(String key);

    /**
     * decodeObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeObject">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObject();

    /**
     * decodeObjectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeObjectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeObjectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectForKey(String key);

    /**
     * decodeObjectOfClass:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeObjectOfClass:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeObjectOfClass:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassForKey(Class aClass, String key);

    /**
     * decodeObjectOfClasses:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeObjectOfClasses:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeObjectOfClasses:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassesForKey(NSSet<? extends Class> classes, String key);

    /**
     * decodePropertyListForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodePropertyListForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodePropertyListForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodePropertyListForKey(String key);

    /**
     * decodeUIEdgeInsetsForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeUIEdgeInsetsForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeUIEdgeInsetsForKey:")
    @ByValue
    public native UIEdgeInsets decodeUIEdgeInsetsForKey(String key);

    /**
     * decodeUIOffsetForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeUIOffsetForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeUIOffsetForKey:")
    @ByValue
    public native UIOffset decodeUIOffsetForKey(String key);

    /**
     * decodeValueOfObjCType:at:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeValueOfObjCType:at:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeValueOfObjCType:at:")
    public native void decodeValueOfObjCTypeAt(@Mapped(CStringMapper.class) String type, VoidPtr data);

    /**
     * decodeValuesOfObjCTypes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/decodeValuesOfObjCTypes:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("decodeValuesOfObjCTypes:")
    public native void decodeValuesOfObjCTypes(@Mapped(CStringMapper.class) String types, Object... varargs);

    /**
     * encodeArrayOfObjCType:count:at:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeArrayOfObjCType:count:at:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeArrayOfObjCType:count:at:")
    public native void encodeArrayOfObjCTypeCountAt(@Mapped(CStringMapper.class) String type, @NUInt long count,
            ConstVoidPtr array);

    /**
     * encodeBool:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeBool:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeBool:forKey:")
    public native void encodeBoolForKey(boolean boolv, String key);

    /**
     * encodeBycopyObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeBycopyObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeBycopyObject:")
    public native void encodeBycopyObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    /**
     * encodeByrefObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeByrefObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeByrefObject:")
    public native void encodeByrefObject(@Mapped(ObjCObjectMapper.class) Object anObject);

    /**
     * encodeBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeBytes:length:")
    public native void encodeBytesLength(ConstVoidPtr byteaddr, @NUInt long length);

    /**
     * encodeBytes:length:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeBytes:length:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeBytes:length:forKey:")
    public native void encodeBytesLengthForKey(ConstBytePtr bytesp, @NUInt long lenv, String key);

    /**
     * encodeCGAffineTransform:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCGAffineTransform:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCGAffineTransform:forKey:")
    public native void encodeCGAffineTransformForKey(@ByValue CGAffineTransform transform, String key);

    /**
     * encodeCGPoint:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCGPoint:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCGPoint:forKey:")
    public native void encodeCGPointForKey(@ByValue CGPoint point, String key);

    /**
     * encodeCGRect:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCGRect:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCGRect:forKey:")
    public native void encodeCGRectForKey(@ByValue CGRect rect, String key);

    /**
     * encodeCGSize:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCGSize:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCGSize:forKey:")
    public native void encodeCGSizeForKey(@ByValue CGSize size, String key);

    /**
     * encodeCGVector:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCGVector:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCGVector:forKey:")
    public native void encodeCGVectorForKey(@ByValue CGVector vector, String key);

    /**
     * encodeCMTime:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCMTime:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCMTime:forKey:")
    public native void encodeCMTimeForKey(@ByValue CMTime time, String key);

    /**
     * encodeCMTimeMapping:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCMTimeMapping:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCMTimeMapping:forKey:")
    public native void encodeCMTimeMappingForKey(@ByValue CMTimeMapping timeMapping, String key);

    /**
     * encodeCMTimeRange:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeCMTimeRange:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeCMTimeRange:forKey:")
    public native void encodeCMTimeRangeForKey(@ByValue CMTimeRange timeRange, String key);

    /**
     * encodeConditionalObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeConditionalObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeConditionalObject:")
    public native void encodeConditionalObject(@Mapped(ObjCObjectMapper.class) Object object);

    /**
     * encodeConditionalObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeConditionalObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeConditionalObject:forKey:")
    public native void encodeConditionalObjectForKey(@Mapped(ObjCObjectMapper.class) Object objv, String key);

    /**
     * encodeDataObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeDataObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeDataObject:")
    public native void encodeDataObject(NSData data);

    /**
     * encodeDouble:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeDouble:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeDouble:forKey:")
    public native void encodeDoubleForKey(double realv, String key);

    /**
     * encodeFloat:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeFloat:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeFloat:forKey:")
    public native void encodeFloatForKey(float realv, String key);

    /**
     * encodeInt32:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeInt32:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeInt32:forKey:")
    public native void encodeInt32ForKey(int intv, String key);

    /**
     * encodeInt64:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeInt64:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeInt64:forKey:")
    public native void encodeInt64ForKey(long intv, String key);

    /**
     * encodeInt:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeInt:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeInt:forKey:")
    public native void encodeIntForKey(int intv, String key);

    /**
     * encodeInteger:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeInteger:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeInteger:forKey:")
    public native void encodeIntegerForKey(@NInt long intv, String key);

    /**
     * encodeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeObject:")
    public native void encodeObject(@Mapped(ObjCObjectMapper.class) Object object);

    /**
     * encodeObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeObject:forKey:")
    public native void encodeObjectForKey(@Mapped(ObjCObjectMapper.class) Object objv, String key);

    /**
     * encodeRootObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeRootObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeRootObject:")
    public native void encodeRootObject(@Mapped(ObjCObjectMapper.class) Object rootObject);

    /**
     * encodeUIEdgeInsets:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeUIEdgeInsets:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeUIEdgeInsets:forKey:")
    public native void encodeUIEdgeInsetsForKey(@ByValue UIEdgeInsets insets, String key);

    /**
     * encodeUIOffset:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeUIOffset:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeUIOffset:forKey:")
    public native void encodeUIOffsetForKey(@ByValue UIOffset offset, String key);

    /**
     * encodeValueOfObjCType:at:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeValueOfObjCType:at:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeValueOfObjCType:at:")
    public native void encodeValueOfObjCTypeAt(@Mapped(CStringMapper.class) String type, ConstVoidPtr addr);

    /**
     * encodeValuesOfObjCTypes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/encodeValuesOfObjCTypes:">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @Selector("encodeValuesOfObjCTypes:")
    public native void encodeValuesOfObjCTypes(@Mapped(CStringMapper.class) String types, Object... varargs);

    @Generated
    @Selector("init")
    public native NSCoder init();

    /**
     * requiresSecureCoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instp/NSCoder/requiresSecureCoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    /**
     * systemVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instp/NSCoder/systemVersion">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemVersion")
    public native int systemVersion();

    /**
     * versionForClassName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCoder_Class/index.html#//apple_ref/occ/instm/NSCoder/versionForClassName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("versionForClassName:")
    @NInt
    public native long versionForClassName(String className);

    @Generated
    @Selector("decodeTopLevelObjectAndReturnError:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectAndReturnError(Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectForKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectForKeyError(String key, Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectOfClass:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassForKeyError(Class aClass, String key, Ptr<NSError> error);

    @Generated
    @Selector("decodeTopLevelObjectOfClasses:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassesForKeyError(NSSet<? extends Class> classes, String key,
            Ptr<NSError> error);

    @Generated
    @Selector("failWithError:")
    public native void failWithError(NSError error);

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
