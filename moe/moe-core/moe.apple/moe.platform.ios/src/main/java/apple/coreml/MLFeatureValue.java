package apple.coreml;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An immutable variant holding a data value of a supported MLFeatureType
 * 
 * MLFeatureValue does not support type conversion in its accessor properties. It
 * can also have a missing or undefined value of a well defined type.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLFeatureValue extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLFeatureValue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLFeatureValue alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLFeatureValue allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Populated value if the type is MLFeatureTypeDictionary
     */
    @NotNull
    @Generated
    @Selector("dictionaryValue")
    public native NSDictionary<?, ? extends NSNumber> dictionaryValue();

    /**
     * Populated value if the type is MLFeatureTypeDouble
     */
    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    /**
     * For encoding a sparse feature set or for encoding probabilities. Input keys that are not
     * NSNumber * or NSString * are rejected on construction and return a MLModelErrorFeatureTypeMismatch
     * error. Further validation for consistency occurs on evaluation
     */
    @Generated
    @Selector("featureValueWithDictionary:error:")
    public static native MLFeatureValue featureValueWithDictionaryError(
            @NotNull NSDictionary<?, ? extends NSNumber> value,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("featureValueWithDouble:")
    public static native MLFeatureValue featureValueWithDouble(double value);

    /**
     * Hold an object with the specified value
     */
    @Generated
    @Selector("featureValueWithInt64:")
    public static native MLFeatureValue featureValueWithInt64(long value);

    @Generated
    @Selector("featureValueWithMultiArray:")
    public static native MLFeatureValue featureValueWithMultiArray(@NotNull MLMultiArray value);

    @Generated
    @Selector("featureValueWithPixelBuffer:")
    public static native MLFeatureValue featureValueWithPixelBuffer(@NotNull CVBufferRef value);

    @Generated
    @Selector("featureValueWithString:")
    public static native MLFeatureValue featureValueWithString(@NotNull String value);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Populated value if the type is MLFeatureTypeImage
     */
    @Nullable
    @Generated
    @Selector("imageBufferValue")
    public native CVBufferRef imageBufferValue();

    @Generated
    @Selector("init")
    public native MLFeatureValue init();

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

    /**
     * Populated value if the type is MLFeatureTypeInt64
     */
    @Generated
    @Selector("int64Value")
    public native long int64Value();

    /**
     * Returns a Boolean value that indicates whether a feature value is equal to another.
     * 
     * If the types of the MLFeatureValue objects "self" and "value" are integer in one case and
     * double in the other (in either order) then those mixed mode numeric values are compared as NSNumbers.
     * Otherwise if the types of the MLFeatureValue objects are different NO is returned.
     * When "self" and "value" are both PixelBuffer MLFeatureValue types, only their CVPixelBufferRef values are
     * compared for equality,
     * the underlying arrays of pixelValues are not examined.
     * [So, distinct PixelBuffer MLFeatureValue objects with distinct CVPixelBufferRef values which encapsulate the same
     * array of pixels will compare *not* equal.]
     * For all other (matching) MLFeatureValue types, the BOOL value returned is the result of comparing "self" with
     * "value" via
     * isEqualToNumber:, isEqualToString:, isEqualtoDictionary:, isEqualToMultiArray:, isEqualToArray: as chosen by the
     * MLFeatureValue types.
     */
    @Generated
    @Selector("isEqualToFeatureValue:")
    public native boolean isEqualToFeatureValue(@NotNull MLFeatureValue value);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * True if the value represents a missing or undefined value
     */
    @Generated
    @Selector("isUndefined")
    public native boolean isUndefined();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Populated value if the type is MLFeatureTypeMultiArray
     */
    @Nullable
    @Generated
    @Selector("multiArrayValue")
    public native MLMultiArray multiArrayValue();

    @Generated
    @Owned
    @Selector("new")
    public static native MLFeatureValue new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Populated value if the type is MLFeatureTypeString
     */
    @NotNull
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Type of the value for which the corresponding property below is held
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * Represent an undefined value of a specified type
     */
    @NotNull
    @Generated
    @Selector("undefinedFeatureValueWithType:")
    public static native MLFeatureValue undefinedFeatureValueWithType(@NInt long type);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Construct image feature value from CGImage, using the size and type information required by feature description
     * (orientation is assumed to be kCGImagePropertyOrientationUp)
     */
    @Generated
    @Selector("featureValueWithCGImage:constraint:options:error:")
    public static native MLFeatureValue featureValueWithCGImageConstraintOptionsError(@NotNull CGImageRef cgImage,
            @NotNull MLImageConstraint constraint, @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage w/ specified orientation, using the size and type information required
     * by feature description
     */
    @Generated
    @Selector("featureValueWithCGImage:orientation:constraint:options:error:")
    public static native MLFeatureValue featureValueWithCGImageOrientationConstraintOptionsError(
            @NotNull CGImageRef cgImage, int orientation, @NotNull MLImageConstraint constraint,
            @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage w/ specified orientation
     */
    @Generated
    @Selector("featureValueWithCGImage:orientation:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithCGImageOrientationPixelsWidePixelsHighPixelFormatTypeOptionsError(
            @NotNull CGImageRef cgImage, int orientation, @NInt long pixelsWide, @NInt long pixelsHigh,
            int pixelFormatType, @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage (orientation is assumed to be kCGImagePropertyOrientationUp)
     */
    @Generated
    @Selector("featureValueWithCGImage:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithCGImagePixelsWidePixelsHighPixelFormatTypeOptionsError(
            @NotNull CGImageRef cgImage, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk, using a model specified image constraint. Orientation is
     * read from Exif if avaiable
     */
    @Generated
    @Selector("featureValueWithImageAtURL:constraint:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLConstraintOptionsError(@NotNull NSURL url,
            @NotNull MLImageConstraint constraint, @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk using a model specified image constraint. The passed in
     * orientation supersedes any in the file
     */
    @Generated
    @Selector("featureValueWithImageAtURL:orientation:constraint:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLOrientationConstraintOptionsError(@NotNull NSURL url,
            int orientation, @NotNull MLImageConstraint constraint, @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk. The passed in orientation supersedes any in the file
     */
    @Generated
    @Selector("featureValueWithImageAtURL:orientation:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLOrientationPixelsWidePixelsHighPixelFormatTypeOptionsError(
            @NotNull NSURL url, int orientation, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk. Orientation is read from Exif if avaiable
     */
    @Generated
    @Selector("featureValueWithImageAtURL:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLPixelsWidePixelsHighPixelFormatTypeOptionsError(
            @NotNull NSURL url, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            @Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("featureValueWithSequence:")
    public static native MLFeatureValue featureValueWithSequence(@NotNull MLSequence sequence);

    /**
     * Populated value if the type is MLFeatureTypeSequence
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("sequenceValue")
    public native MLSequence sequenceValue();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MLFeatureValue initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
