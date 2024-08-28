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
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeMapping;
import apple.coremedia.struct.CMTimeRange;
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import org.moe.natj.general.ann.UncertainArgument;
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCoder allocWithZone(VoidPtr zone);

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
    public static native NSCoder new_objc();

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

    /**
     * Get the current set of allowed classes.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("allowedClasses")
    public native NSSet<? extends Class> allowedClasses();

    @Generated
    @Selector("allowsKeyedCoding")
    public native boolean allowsKeyedCoding();

    @Generated
    @Selector("containsValueForKey:")
    public native boolean containsValueForKey(@NotNull String key);

    @Generated
    @Selector("decodeArrayOfObjCType:count:at:")
    public native void decodeArrayOfObjCTypeCountAt(@NotNull @Mapped(CStringMapper.class) String itemType,
            @NUInt long count, @NotNull VoidPtr array);

    @Generated
    @Selector("decodeBoolForKey:")
    public native boolean decodeBoolForKey(@NotNull String key);

    /**
     * returned bytes immutable!
     */
    @Nullable
    @Generated
    @Selector("decodeBytesForKey:returnedLength:")
    public native ConstBytePtr decodeBytesForKeyReturnedLength(@NotNull String key, @Nullable NUIntPtr lengthp);

    @Nullable
    @Generated
    @Selector("decodeBytesWithReturnedLength:")
    public native VoidPtr decodeBytesWithReturnedLength(@NotNull NUIntPtr lengthp);

    @Generated
    @Selector("decodeCGAffineTransformForKey:")
    @ByValue
    public native CGAffineTransform decodeCGAffineTransformForKey(@NotNull String key);

    @Generated
    @Selector("decodeCGPointForKey:")
    @ByValue
    public native CGPoint decodeCGPointForKey(@NotNull String key);

    @Generated
    @Selector("decodeCGRectForKey:")
    @ByValue
    public native CGRect decodeCGRectForKey(@NotNull String key);

    @Generated
    @Selector("decodeCGSizeForKey:")
    @ByValue
    public native CGSize decodeCGSizeForKey(@NotNull String key);

    @Generated
    @Selector("decodeCGVectorForKey:")
    @ByValue
    public native CGVector decodeCGVectorForKey(@NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("decodeCMTimeForKey:")
    @ByValue
    public native CMTime decodeCMTimeForKey(@NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("decodeCMTimeMappingForKey:")
    @ByValue
    public native CMTimeMapping decodeCMTimeMappingForKey(@NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("decodeCMTimeRangeForKey:")
    @ByValue
    public native CMTimeRange decodeCMTimeRangeForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("decodeDataObject")
    public native NSData decodeDataObject();

    @Generated
    @Selector("decodeDoubleForKey:")
    public native double decodeDoubleForKey(@NotNull String key);

    @Generated
    @Selector("decodeFloatForKey:")
    public native float decodeFloatForKey(@NotNull String key);

    @Generated
    @Selector("decodeInt32ForKey:")
    public native int decodeInt32ForKey(@NotNull String key);

    @Generated
    @Selector("decodeInt64ForKey:")
    public native long decodeInt64ForKey(@NotNull String key);

    @Generated
    @Selector("decodeIntForKey:")
    public native int decodeIntForKey(@NotNull String key);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("decodeIntegerForKey:")
    @NInt
    public native long decodeIntegerForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("decodeObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObject();

    @Nullable
    @Generated
    @Selector("decodeObjectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectForKey(@NotNull String key);

    /**
     * Specify what the expected class of the allocated object is. If the coder responds YES to -requiresSecureCoding,
     * then an exception will be thrown if the class to be decoded does not implement NSSecureCoding or is not
     * isKindOfClass: of the argument. If the coder responds NO to -requiresSecureCoding, then the class argument is
     * ignored and no check of the class of the decoded object is performed, exactly as if decodeObjectForKey: had been
     * called.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("decodeObjectOfClass:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassForKey(@NotNull Class aClass, @NotNull String key);

    /**
     * The class of the object may be any class in the provided NSSet, or a subclass of any class in the set. Otherwise,
     * the behavior is the same as -decodeObjectOfClass:forKey:.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("decodeObjectOfClasses:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectOfClassesForKey(@Nullable NSSet<? extends Class> classes, @NotNull String key);

    /**
     * Calls -decodeObjectOfClasses:forKey: with a set allowing only property list types.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("decodePropertyListForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodePropertyListForKey(@NotNull String key);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("decodeTopLevelObjectAndReturnError:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("decodeTopLevelObjectForKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectForKeyError(@NotNull String key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("decodeTopLevelObjectOfClass:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassForKeyError(@NotNull Class aClass, @NotNull String key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("decodeTopLevelObjectOfClasses:forKey:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeTopLevelObjectOfClassesForKeyError(@Nullable NSSet<? extends Class> classes,
            @NotNull String key, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("decodeUIEdgeInsetsForKey:")
    @ByValue
    public native UIEdgeInsets decodeUIEdgeInsetsForKey(@NotNull String key);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("decodeUIOffsetForKey:")
    @ByValue
    public native UIOffset decodeUIOffsetForKey(@NotNull String key);

    /**
     * This method is unsafe because it could potentially cause buffer overruns. You should use
     * -decodeValueOfObjCType:at:size: instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("decodeValueOfObjCType:at:")
    public native void decodeValueOfObjCTypeAt(@NotNull @Mapped(CStringMapper.class) String type,
            @NotNull VoidPtr data);

    @Generated
    @Variadic()
    @Selector("decodeValuesOfObjCTypes:")
    public native void decodeValuesOfObjCTypes(@NotNull @Mapped(CStringMapper.class) String types, Object... varargs);

    /**
     * Defines the behavior this NSCoder should take on decode failure (i.e. corrupt archive, invalid data, etc.).
     * 
     * The default result of this property is NSDecodingFailurePolicyRaiseException, subclasses can change this to an
     * alternative policy.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("decodingFailurePolicy")
    @NInt
    public native long decodingFailurePolicy();

    @Generated
    @Selector("encodeArrayOfObjCType:count:at:")
    public native void encodeArrayOfObjCTypeCountAt(@NotNull @Mapped(CStringMapper.class) String type,
            @NUInt long count, @NotNull ConstVoidPtr array);

    @Generated
    @Selector("encodeBool:forKey:")
    public native void encodeBoolForKey(boolean value, @NotNull String key);

    @Generated
    @Selector("encodeBycopyObject:")
    public native void encodeBycopyObject(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("encodeByrefObject:")
    public native void encodeByrefObject(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("encodeBytes:length:")
    public native void encodeBytesLength(@Nullable ConstVoidPtr byteaddr, @NUInt long length);

    @Generated
    @Selector("encodeBytes:length:forKey:")
    public native void encodeBytesLengthForKey(@Nullable ConstBytePtr bytes, @NUInt long length, @NotNull String key);

    @Generated
    @Selector("encodeCGAffineTransform:forKey:")
    public native void encodeCGAffineTransformForKey(@ByValue CGAffineTransform transform, @NotNull String key);

    @Generated
    @Selector("encodeCGPoint:forKey:")
    public native void encodeCGPointForKey(@ByValue CGPoint point, @NotNull String key);

    @Generated
    @Selector("encodeCGRect:forKey:")
    public native void encodeCGRectForKey(@ByValue CGRect rect, @NotNull String key);

    @Generated
    @Selector("encodeCGSize:forKey:")
    public native void encodeCGSizeForKey(@ByValue CGSize size, @NotNull String key);

    @Generated
    @Selector("encodeCGVector:forKey:")
    public native void encodeCGVectorForKey(@ByValue CGVector vector, @NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("encodeCMTime:forKey:")
    public native void encodeCMTimeForKey(@ByValue CMTime time, @NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("encodeCMTimeMapping:forKey:")
    public native void encodeCMTimeMappingForKey(@ByValue CMTimeMapping timeMapping, @NotNull String key);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("encodeCMTimeRange:forKey:")
    public native void encodeCMTimeRangeForKey(@ByValue CMTimeRange timeRange, @NotNull String key);

    @Generated
    @Selector("encodeConditionalObject:")
    public native void encodeConditionalObject(@Nullable @Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("encodeConditionalObject:forKey:")
    public native void encodeConditionalObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object object,
            @NotNull String key);

    @Generated
    @Selector("encodeDataObject:")
    public native void encodeDataObject(@NotNull NSData data);

    @Generated
    @Selector("encodeDouble:forKey:")
    public native void encodeDoubleForKey(double value, @NotNull String key);

    @Generated
    @Selector("encodeFloat:forKey:")
    public native void encodeFloatForKey(float value, @NotNull String key);

    @Generated
    @Selector("encodeInt32:forKey:")
    public native void encodeInt32ForKey(int value, @NotNull String key);

    @Generated
    @Selector("encodeInt64:forKey:")
    public native void encodeInt64ForKey(long value, @NotNull String key);

    @Generated
    @Selector("encodeInt:forKey:")
    public native void encodeIntForKey(int value, @NotNull String key);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("encodeInteger:forKey:")
    public native void encodeIntegerForKey(@NInt long value, @NotNull String key);

    @Generated
    @Selector("encodeObject:")
    public native void encodeObject(@Nullable @Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("encodeObject:forKey:")
    public native void encodeObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object object, @NotNull String key);

    @Generated
    @Selector("encodeRootObject:")
    public native void encodeRootObject(@NotNull @Mapped(ObjCObjectMapper.class) Object rootObject);

    @Generated
    @Selector("encodeUIEdgeInsets:forKey:")
    public native void encodeUIEdgeInsetsForKey(@ByValue UIEdgeInsets insets, @NotNull String key);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("encodeUIOffset:forKey:")
    public native void encodeUIOffsetForKey(@ByValue UIOffset offset, @NotNull String key);

    @Generated
    @Selector("encodeValueOfObjCType:at:")
    public native void encodeValueOfObjCTypeAt(@NotNull @Mapped(CStringMapper.class) String type,
            @NotNull ConstVoidPtr addr);

    @Generated
    @Variadic()
    @Selector("encodeValuesOfObjCTypes:")
    public native void encodeValuesOfObjCTypes(@NotNull @Mapped(CStringMapper.class) String types, Object... varargs);

    /**
     * The current error (if there is one) for the current TopLevel decode.
     * 
     * The meaning of this property changes based on the result of the decodingFailurePolicy property:
     * For NSDecodingFailurePolicyRaiseException, this property will always be nil.
     * For NSDecodingFailurePolicySetErrorAndReturn, this property can be non-nil, and if so, indicates that there was a
     * failure while decoding the archive (specifically its the very first error encountered).
     * 
     * While .error is non-nil, all attempts to decode data from this coder will return a nil/zero-equivalent value.
     * 
     * This error is consumed by a TopLevel decode API (which resets this coder back to a being able to potentially
     * decode data).
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * Signals to this coder that the decode has failed.
     * [@parameter] non-nil error that describes the reason why the decode failed
     * 
     * Sets an error on this NSCoder once per TopLevel decode; calling it repeatedly will have no effect until the call
     * stack unwinds to one of the TopLevel decode entry-points.
     * 
     * This method is only meaningful to call for decodes.
     * 
     * Typically, you would want to call this method in your -initWithCoder: implementation when you detect situations
     * like:
     * - lack of secure coding
     * - corruption of your data
     * - domain validation failures
     * 
     * After calling -failWithError: within your -initWithCoder: implementation, you should clean up and return nil as
     * early as possible.
     * 
     * Once an error has been signaled to a decoder, it remains set until it has handed off to the first TopLevel decode
     * invocation above it. For example, consider the following call graph:
     * A -decodeTopLevelObjectForKey:error:
     * B -initWithCoder:
     * C -decodeObjectForKey:
     * D -initWithCoder:
     * E -decodeObjectForKey:
     * F -failWithError:
     * 
     * In this case the error provided in stack-frame F will be returned via the outError in stack-frame A. Furthermore
     * the result object from decodeTopLevelObjectForKey:error: will be nil, regardless of the result of stack-frame B.
     * 
     * NSCoder implementations support two mechanisms for the stack-unwinding from F to A:
     * - forced (NSException based)
     * - particpatory (error based)
     * 
     * The kind of unwinding you get is determined by the decodingFailurePolicy property of this NSCoder (which defaults
     * to NSDecodingFailurePolicyRaiseException to match historical behavior).
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("failWithError:")
    public native void failWithError(@NotNull NSError error);

    @Generated
    @Selector("init")
    public native NSCoder init();

    /**
     * Returns YES if this coder requires secure coding. Secure coders check a list of allowed classes before decoding
     * objects, and all objects must implement NSSecureCoding.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    @Generated
    @Selector("systemVersion")
    public native int systemVersion();

    @Generated
    @Selector("versionForClassName:")
    @NInt
    public native long versionForClassName(@NotNull String className);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("decodeDirectionalEdgeInsetsForKey:")
    @ByValue
    public native NSDirectionalEdgeInsets decodeDirectionalEdgeInsetsForKey(@NotNull String key);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("decodeValueOfObjCType:at:size:")
    public native void decodeValueOfObjCTypeAtSize(
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String type,
            @NotNull VoidPtr data, @NUInt long size);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("encodeDirectionalEdgeInsets:forKey:")
    public native void encodeDirectionalEdgeInsetsForKey(@ByValue NSDirectionalEdgeInsets insets, @NotNull String key);

    /**
     * Decodes the \c NSArray object for the given \c key, which should be an \c NSArray<cls>, containing the given
     * non-collection class (no nested arrays or arrays of dictionaries, etc) from the coder.
     * 
     * Requires \c NSSecureCoding otherwise an exception is thrown and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the object for \c key is not of the expected types, or cannot be decoded, and sets the \c error
     * on the decoder.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("decodeArrayOfObjectsOfClass:forKey:")
    public native NSArray<?> decodeArrayOfObjectsOfClassForKey(@NotNull Class cls, @NotNull String key);

    /**
     * Decodes the \c NSArray object for the given \c key, which should be an \c NSArray, containing the given
     * non-collection classes (no nested arrays or arrays of dictionaries, etc) from the coder.
     * 
     * Requires \c NSSecureCoding otherwise an exception is thrown and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the object for \c key is not of the expected types, or cannot be decoded, and sets the \c error
     * on the decoder.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("decodeArrayOfObjectsOfClasses:forKey:")
    public native NSArray<?> decodeArrayOfObjectsOfClassesForKey(@NotNull NSSet<? extends Class> classes,
            @NotNull String key);

    /**
     * Decodes the \c NSDictionary object for the given \c key, which should be an \c NSDictionary<keyCls,objectCls> ,
     * with keys of type given in \c keyCls and objects of the given non-collection class \c objectCls (no nested
     * dictionaries or other dictionaries contained in the dictionary, etc) from the coder.
     * 
     * Requires \c NSSecureCoding otherwise an exception is thrown and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the object for \c key is not of the expected types, or cannot be decoded, and sets the \c error
     * on the decoder.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("decodeDictionaryWithKeysOfClass:objectsOfClass:forKey:")
    public native NSDictionary<?, ?> decodeDictionaryWithKeysOfClassObjectsOfClassForKey(@NotNull Class keyCls,
            @NotNull Class objectCls, @NotNull String key);

    /**
     * Decodes the \c NSDictionary object for the given \c key, which should be an \c NSDictionary, with keys of the
     * types given in \c keyClasses and objects of the given non-collection classes in \c objectClasses (no nested
     * dictionaries or other dictionaries contained in the dictionary, etc) from the given coder.
     * 
     * Requires \c NSSecureCoding otherwise an exception is thrown and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the object for \c key is not of the expected types, or cannot be decoded, and sets the \c error
     * on the decoder.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("decodeDictionaryWithKeysOfClasses:objectsOfClasses:forKey:")
    public native NSDictionary<?, ?> decodeDictionaryWithKeysOfClassesObjectsOfClassesForKey(
            @NotNull NSSet<? extends Class> keyClasses, @NotNull NSSet<? extends Class> objectClasses,
            @NotNull String key);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
