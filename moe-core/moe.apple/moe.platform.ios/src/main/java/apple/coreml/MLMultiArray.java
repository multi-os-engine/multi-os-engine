package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corevideo.opaque.CVBufferRef;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Use `MLMultiArray` to store a multi-dimensional value.
 * 
 * Unlike `MLShapedArray` or `MLTensor`, `MLMultiArray` can be used in Obj-C code. Unlike `MLTensor`, `MLMultiArray` is
 * always backed by a concrete storage.
 * 
 * The object has properties to define the interpretation of the storage.
 * 
 * `.dataType` defines the interpretation of raw bytes into a numeric scalar value. For example,
 * `MLMultiArrayDataTypeFloat32` means the backing storage uses IEEE 754 Float32 encoding.
 * 
 * `.shape` defines the multi-dimensional space. For example, 30 x 20 image with three color components (Red, Green,
 * Blue) could be defined using the shape `[3, 20, 30]`.
 * 
 * `.strides` defines the offset addressing of the scalar for a given coordinates. For example, the image above might
 * use `[640, 32, 1]` as the `strides`. Then, the scalar at (1, 10, 15) is stored at `640 * 1 + 32 * 10 + 1 * 15`, or
 * 975th scalar in the storage. In general, the scalar offset for coordinates `index` and strides `strides` is:
 * 
 * ```
 * scalarOffset = sum_d index[d]*strides[d]
 * ```
 * 
 * The backing storage can be a heap allocated buffer or CVPixelBuffer. Though CVPixelBuffer backing supports limited
 * data types, `MLModel` could share the storage with backend hardware such as Apple Neural Engine without copy.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLMultiArray extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLMultiArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLMultiArray alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLMultiArray allocWithZone(VoidPtr zone);

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

    /**
     * Count of total number of addressable scalars.
     * 
     * The value is same as `product_d shape[d]`.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("count")
    @NInt
    public native long count();

    /**
     * Unsafe pointer to underlying buffer holding the data
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use getBytesWithHandler or getMutableBytesWithHandler instead. For Swift, use withUnsafeBytes
     * or withUnsafeMutableBytes.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("dataPointer")
    public native VoidPtr dataPointer();

    /**
     * Scalar's data type.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("dataType")
    @NInt
    public native long dataType();

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
    @Selector("init")
    public native MLMultiArray init();

    /**
     * Creates the object with existing data without copy.
     * 
     * Use this initializer to reference the existing buffer as the storage without copy.
     * 
     * ```objc
     * int32_t *buffer = malloc(sizeof(int32_t) * 2 * 3 * 4);
     * MLMultiArray *multiArray = [[MLMultiArray alloc] initWithDataPointer:buffer
     * shape:@[@2, @3, @4]
     * dataType:MLMultiArrayDataTypeInt32
     * strides:@[@12, @4, @1]
     * deallocator:^(void *bytes) { free(bytes); }
     * error:NULL];
     * ```
     * 
     * - Parameters:
     * - dataPointer: The pointer to the buffer.
     * - shape: The shape
     * - dataType: The data type
     * - strides: The strides.
     * - deallocator: Block to be called on the deallocation of the instance.
     * - error: Filled with error information on error.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithDataPointer:shape:dataType:strides:deallocator:error:")
    public native MLMultiArray initWithDataPointerShapeDataTypeStridesDeallocatorError(@NotNull VoidPtr dataPointer,
            @NotNull NSArray<? extends NSNumber> shape, @NInt long dataType,
            @NotNull NSArray<? extends NSNumber> strides,
            @Nullable @ObjCBlock(name = "call_initWithDataPointerShapeDataTypeStridesDeallocatorError") Block_initWithDataPointerShapeDataTypeStridesDeallocatorError deallocator,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDataPointerShapeDataTypeStridesDeallocatorError {
        @Generated
        void call_initWithDataPointerShapeDataTypeStridesDeallocatorError(@NotNull VoidPtr bytes);
    }

    /**
     * Creates the object.
     * 
     * The contents of the object are left uninitialized; the client must initialize it.
     * 
     * The scalars will use the first-major contiguous layout.
     * 
     * - Parameters:
     * - shape: The shape
     * - dataType: The data type
     * - error: Filled with error information on error.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithShape:dataType:error:")
    public native MLMultiArray initWithShapeDataTypeError(@NotNull NSArray<? extends NSNumber> shape,
            @NInt long dataType, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native MLMultiArray new_objc();

    /**
     * Get a value by its linear index (assumes C-style index ordering)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native NSNumber objectAtIndexedSubscript(@NInt long idx);

    /**
     * Get a value by its multidimensional index (NSArray<NSNumber *>)
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(@NotNull NSArray<? extends NSNumber> key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set a value by its linear index (assumes C-style index ordering)
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(@NotNull NSNumber obj, @NInt long idx);

    /**
     * Set a value by subindicies (NSArray<NSNumber *>)
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@NotNull NSNumber obj, @NotNull NSArray<? extends NSNumber> key);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shape of the multi-dimensional space that this instance represents.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("shape")
    public native NSArray<? extends NSNumber> shape();

    /**
     * Strides.
     * 
     * It defines the offset of the scalar of a given coordinate index in the storage, which is:
     * ```
     * scalarOffset = sum_d index[d]*strides[d]
     * ```
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("strides")
    public native NSArray<? extends NSNumber> strides();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MLMultiArray initWithCoder(@NotNull NSCoder coder);

    /**
     * Concatenate MLMultiArrays to form a new MLMultiArray.
     * 
     * All the source MLMultiArrays must have a same shape except the specified axis. The resultant
     * MLMultiArray has the same shape as inputs except this axis, which dimension will be the sum of
     * all the input dimensions of the axis.
     * 
     * For example,
     * 
     * ```swift
     * // Swift
     * let A = try MLMultiArray(shape: [2, 3], dataType: .int32)
     * let B = try MLMultiArray(shape: [2, 2], dataType: .int32)
     * let C = MLMultiArray(concatenating: [A, B], axis: 1, dataType: .int32)
     * assert(C.shape == [2, 5])
     * ```
     * 
     * ```objc
     * // Obj-C
     * MLMultiArray *A = [[MLMultiArray alloc] initWithShape:@[@2, @3] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * MLMultiArray *B = [[MLMultiArray alloc] initWithShape:@[@2, @2] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * MLMultiArray *C = [MLMultiArray multiArrayByConcatenatingMultiArrays:@[A, B] alongAxis:1
     * dataType:MLMultiArrayDataTypeInt32];
     * assert(C.shape == @[@2, @5])
     * ```
     * 
     * Numeric data will be up or down casted as needed.
     * 
     * The method raises NSInvalidArgumentException if the shapes of input multi arrays are not
     * compatible for concatenation.
     * 
     * - Parameters:
     * - multiArrays: Array of MLMultiArray instances to be concatenated.
     * - axis: Axis index with which the concatenation will performed. The value is wrapped by the dimension of the
     * axis. For example, -1 is the last axis.
     * - dataType: The data type of the resultant MLMultiArray.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("multiArrayByConcatenatingMultiArrays:alongAxis:dataType:")
    public static native MLMultiArray multiArrayByConcatenatingMultiArraysAlongAxisDataType(
            @NotNull NSArray<? extends MLMultiArray> multiArrays, @NInt long axis, @NInt long dataType);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Get the underlying buffer pointer to read.
     * 
     * The buffer pointer is valid only within the block.
     * 
     * ```objc
     * MLMultiArray * A = [[MLMultiArray alloc] initWithShape:@[@3, @2] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * A[@[@1, @2]] = @42;
     * [A getBytesWithHandler:^(const void *bytes, NSInteger size) {
     * const int32_t *scalarBuffer = (const int32_t *)bytes;
     * const int strideY = A.strides[0].intValue;
     * // Print 42
     * NSLog(@"Scalar at (1, 2): %d", scalarBuffer[1 * strideY + 2]);
     * }];
     * ```
     * - Parameters:
     * - handler: The block to receive the buffer pointer and its size in bytes.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("getBytesWithHandler:")
    public native void getBytesWithHandler(
            @NotNull @ObjCBlock(name = "call_getBytesWithHandler") Block_getBytesWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getBytesWithHandler {
        @Generated
        void call_getBytesWithHandler(@NotNull ConstVoidPtr bytes, @NInt long size);
    }

    /**
     * Get the underlying buffer pointer to mutate.
     * 
     * The buffer pointer is valid only within the block.
     * 
     * Use `strides` parameter passed in the block because the method may switch to a new backing buffer with different
     * strides.
     * 
     * ```objc
     * MLMultiArray * A = [[MLMultiArray alloc] initWithShape:@[@3, @2] dataType:MLMultiArrayDataTypeInt32 error:NULL];
     * [A getMutableBytesWithHandler:^(void *bytes, NSInteger __unused size, NSArray<NSNumber *> *strides) {
     * int32_t *scalarBuffer = (int32_t *)bytes;
     * const int strideY = strides[0].intValue;
     * scalarBuffer[1 * strideY + 2] = 42; // Set 42 at A[1, 2]
     * }];
     * ```
     * 
     * - Parameters:
     * - handler: The block to receive the buffer pointer, size in bytes, and strides.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("getMutableBytesWithHandler:")
    public native void getMutableBytesWithHandler(
            @NotNull @ObjCBlock(name = "call_getMutableBytesWithHandler") Block_getMutableBytesWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMutableBytesWithHandler {
        @Generated
        void call_getMutableBytesWithHandler(@NotNull VoidPtr mutableBytes, @NInt long size,
                @NotNull NSArray<? extends NSNumber> strides);
    }

    /**
     * Create by wrapping a pixel buffer.
     * 
     * Use this initializer to create an IOSurface backed MLMultiArray, which can reduce the inference latency by
     * avoiding the buffer copy.
     * 
     * The instance will own the pixel buffer and release it on the deallocation.
     * 
     * The pixel buffer's pixel format type must be OneComponent16Half. As such, MLMultiArray's data type will be
     * MLMultiArrayDataTypeFloat16.
     * 
     * ```objc
     * CVPixelBufferRef pixelBuffer = NULL;
     * NSDictionary* pixelBufferAttributes = @{
     * (id)kCVPixelBufferIOSurfacePropertiesKey: @{}
     * };
     * 
     * // Since shape == [2, 3, 4], width is 4 (= shape[2]) and height is 6 (= shape[0] * shape[1]).
     * CVPixelBufferCreate(kCFAllocatorDefault, 4, 6, kCVPixelFormatType_OneComponent16Half, (__bridge
     * CFDictionaryRef)pixelBufferAttributes, &pixelBuffer);
     * MLMultiArray *multiArray = [[MLMultiArray alloc] initWithPixelBuffer:pixelBuffer shape:@[@2, @3, @4]];
     * ```
     * 
     * - Parameters:
     * - pixelBuffer: The pixel buffer to be owned by the instance.
     * - shape: The shape of the MLMultiArray. The last dimension of `shape` must match the pixel buffer's width. The
     * product of the rest of the dimensions must match the height.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithPixelBuffer:shape:")
    public native MLMultiArray initWithPixelBufferShape(@NotNull CVBufferRef pixelBuffer,
            @NotNull NSArray<? extends NSNumber> shape);

    /**
     * Returns the backing pixel buffer if exists, otherwise nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("pixelBuffer")
    public native CVBufferRef pixelBuffer();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Creates the object with specified strides.
     * 
     * The contents of the object are left uninitialized; the client must initialize it.
     * 
     * ```swift
     * let shape = [2, 3];
     * let strides = [4, 1]
     * 
     * let multiArray = MLMultiArray(shape: shape, dataType: .float32, strides: strides)
     * XCTAssertEqual(multiArray.shape, shape as [NSNumber])
     * XCTAssertEqual(multiArray.strides, strides as [NSNumber])
     * ```
     * 
     * ```objc
     * NSArray<NSNumber *> *shape = @[@2, @3];
     * NSArray<NSNumber *> *strides = @[@4, @1];
     * 
     * MLMultiArray *multiArray = [[MLMultiArray alloc] initWithShape:shape
     * dataType:MLMultiArrayDataTypeFloat32
     * strides:strides];
     * XCTAssertEqualObjects(multiArray.shape, shape);
     * XCTAssertEqualObjects(multiArray.strides, strides);
     * ```
     * 
     * - Parameters:
     * - shape: The shape
     * - dataType: The data type
     * - strides: The strides.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithShape:dataType:strides:")
    public native MLMultiArray initWithShapeDataTypeStrides(@NotNull NSArray<? extends NSNumber> shape,
            @NInt long dataType, @NotNull NSArray<? extends NSNumber> strides);

    /**
     * Transfer the contents to the destination multi-array.
     * 
     * Numeric data will be up or down casted as needed. It can transfer to a multi-array with different layout
     * (strides).
     * 
     * ```swift
     * let sourceMultiArray: MLMultiArray = ... // shape is [2, 3] and data type is Float64
     * 
     * let newStrides = [4, 1]
     * let destinationMultiArray = MLMultiArray(shape: [2, 3],
     * dataType: .float32,
     * strides: newStrides)
     * sourceMultiArray.transfer(to: destinationMultiArray)
     * ```
     * 
     * ```objc
     * NSArray<NSNumber *> *shape = @[@2, @3];
     * NSArray<NSNumber *> *sourceStrides = @[@3, @1];
     * NSArray<NSNumber *> *destinationStrides = @[@4, @1];
     * MLMultiArray *source = [[MLMultiArray alloc] initWithShape:shape
     * dataType:MLMultiArrayDataTypeDouble
     * strides:sourceStrides];
     * // Initialize source...
     * 
     * MLMultiArray *destination = [[MLMultiArray alloc] initWithShape:shape
     * dataType:MLMultiArrayDataTypeFloat32
     * strides:destinationStrides];
     * [source transferToMultiArray:destination];
     * ```
     * 
     * - Parameters:
     * - destinationMultiArray: The transfer destination.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("transferToMultiArray:")
    public native void transferToMultiArray(@NotNull MLMultiArray destinationMultiArray);
}
