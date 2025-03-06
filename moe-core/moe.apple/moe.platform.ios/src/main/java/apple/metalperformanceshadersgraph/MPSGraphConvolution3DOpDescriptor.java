package apple.metalperformanceshadersgraph;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class that describes the properties of a 3D-convolution operator.
 * 
 * Use an instance of this class is to add a 3D-convolution operator with desired properties to the graph.
 * 
 * API-Since: 16.3
 */
@Generated
@Library("MetalPerformanceShadersGraph")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGraphConvolution3DOpDescriptor extends MPSGraphObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGraphConvolution3DOpDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGraphConvolution3DOpDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSGraphConvolution3DOpDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The named layout of data in the source tensor.
     * 
     * It defines the order of named dimensions (Batch, Channel, Depth, Height, Width). The convolution operation uses
     * this to interpret data in the source tensor.
     * For example, if `dataLayout` is `MPSGraphTensorNamedDataLayoutNCDHW`, frameork interprets data in source tensor
     * as `batch x channels x depth x height x width`
     * with `width` as fastest moving dimension.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("dataLayout")
    @NUInt
    public native long dataLayout();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a convolution descriptor with given values for parameters.
     * - Parameters:
     * - strideInX: See ``strideInX`` property.
     * - strideInY: See ``strideInY`` property.
     * - strideInZ: See ``strideInZ`` property.
     * - dilationRateInX: See ``dilationRateInX`` property.
     * - dilationRateInY: See ``dilationRateInY`` property.
     * - dilationRateInZ: See ``dilationRateInZ`` property.
     * - groups: See ``groups`` property.
     * - paddingLeft: See ``paddingLeft`` property.
     * - paddingRight: See ``paddingRight`` property.
     * - paddingTop: See ``paddingTop`` property.
     * - paddingBottom: See ``paddingBottom`` property.
     * - paddingFront: See ``paddingFront`` property.
     * - paddingBack: See ``paddingBack`` property.
     * - paddingStyle: See ``paddingStyle`` property.
     * - dataLayout: See ``dataLayout`` property.
     * - weightsLayout: See ``weightsLayout`` property.
     * - Returns: The `MPSGraphConvolution3DOpDescriptor` on autoreleasepool.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("descriptorWithStrideInX:strideInY:strideInZ:dilationRateInX:dilationRateInY:dilationRateInZ:groups:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingFront:paddingBack:paddingStyle:dataLayout:weightsLayout:")
    public static native MPSGraphConvolution3DOpDescriptor descriptorWithStrideInXStrideInYStrideInZDilationRateInXDilationRateInYDilationRateInZGroupsPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingFrontPaddingBackPaddingStyleDataLayoutWeightsLayout(
            @NUInt long strideInX, @NUInt long strideInY, @NUInt long strideInZ, @NUInt long dilationRateInX,
            @NUInt long dilationRateInY, @NUInt long dilationRateInZ, @NUInt long groups, @NUInt long paddingLeft,
            @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom, @NUInt long paddingFront,
            @NUInt long paddingBack, @NUInt long paddingStyle, @NUInt long dataLayout, @NUInt long weightsLayout);

    /**
     * Creates a convolution descriptor with given values for parameters.
     * - Parameters:
     * - strideInX: See ``strideInX`` property.
     * - strideInY: See ``strideInY`` property.
     * - strideInZ: See ``strideInZ`` property.
     * - dilationRateInX: See ``dilationRateInX`` property.
     * - dilationRateInY: See ``dilationRateInY`` property.
     * - dilationRateInZ: See ``dilationRateInZ`` property.
     * - groups: See ``groups`` property.
     * - paddingStyle: See ``paddingStyle`` property.
     * - dataLayout: See ``dataLayout`` property.
     * - weightsLayout: See ``weightsLayout`` property.
     * - Returns: The `MPSGraphConvolution3DOpDescriptor` on autoreleasepool.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("descriptorWithStrideInX:strideInY:strideInZ:dilationRateInX:dilationRateInY:dilationRateInZ:groups:paddingStyle:dataLayout:weightsLayout:")
    public static native MPSGraphConvolution3DOpDescriptor descriptorWithStrideInXStrideInYStrideInZDilationRateInXDilationRateInYDilationRateInZGroupsPaddingStyleDataLayoutWeightsLayout(
            @NUInt long strideInX, @NUInt long strideInY, @NUInt long strideInZ, @NUInt long dilationRateInX,
            @NUInt long dilationRateInY, @NUInt long dilationRateInZ, @NUInt long groups, @NUInt long paddingStyle,
            @NUInt long dataLayout, @NUInt long weightsLayout);

    /**
     * The amount by which weights tensor expands in the `x`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInX-1` zeros between consecutive values in `x`-dimension.
     * Dilated weights tensor width is `(dilationRateInX-1)*kernelWidth+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * The amount by which weights tensor expands in the `y`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInY-1` zeros between consecutive values in `y`-dimension.
     * Dilated weights tensor width is `(dilationRateInY-1)*kernelHeight+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    /**
     * The amount by which weights tensor expands in the `z`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInZ-1` zeros between consecutive values in `z`-dimension.
     * Dilated weights tensor depth is `(dilationRateInZ-1)*kernelDepth+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("dilationRateInZ")
    @NUInt
    public native long dilationRateInZ();

    /**
     * The number of partitions of the input and output channels.
     * 
     * The convolution operation divides input and output channels in `groups` partitions.
     * input channels in a group or partition are only connected to output channels in corresponding group.
     * Number of weights the convolution needs is `outputFeatureChannels x inputFeatureChannels/groups x kernelDepth x
     * kernelWidth x kernelHeight`
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGraphConvolution3DOpDescriptor init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSGraphConvolution3DOpDescriptor new_objc();

    /**
     * The number of zeros added at the back of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingBack")
    @NUInt
    public native long paddingBack();

    /**
     * The number of zeros added at the bottom of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingBottom")
    @NUInt
    public native long paddingBottom();

    /**
     * The number of zeros added at the front of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingFront")
    @NUInt
    public native long paddingFront();

    /**
     * The number of zeros added on the left side of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingLeft")
    @NUInt
    public native long paddingLeft();

    /**
     * The number of zeros added on the right side of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingRight")
    @NUInt
    public native long paddingRight();

    /**
     * The type of padding that is applied to the source tensor.
     * 
     * If paddingStyle is `MPSGraphPaddingStyleExplicit`, `paddingLeft`, `laddingRight`, `paddingTop`,
     * `paddingBottom`, `paddingFront` and `paddingBack` must to be specified. For all other padding styles, framework
     * compute these values so you dont need to provide these values.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingStyle")
    @NUInt
    public native long paddingStyle();

    /**
     * The number of zeros added at the top of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("paddingTop")
    @NUInt
    public native long paddingTop();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The named layout of data in the source tensor.
     * 
     * It defines the order of named dimensions (Batch, Channel, Depth, Height, Width). The convolution operation uses
     * this to interpret data in the source tensor.
     * For example, if `dataLayout` is `MPSGraphTensorNamedDataLayoutNCDHW`, frameork interprets data in source tensor
     * as `batch x channels x depth x height x width`
     * with `width` as fastest moving dimension.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setDataLayout:")
    public native void setDataLayout(@NUInt long value);

    /**
     * The amount by which weights tensor expands in the `x`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInX-1` zeros between consecutive values in `x`-dimension.
     * Dilated weights tensor width is `(dilationRateInX-1)*kernelWidth+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setDilationRateInX:")
    public native void setDilationRateInX(@NUInt long value);

    /**
     * The amount by which weights tensor expands in the `y`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInY-1` zeros between consecutive values in `y`-dimension.
     * Dilated weights tensor width is `(dilationRateInY-1)*kernelHeight+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setDilationRateInY:")
    public native void setDilationRateInY(@NUInt long value);

    /**
     * The amount by which weights tensor expands in the `z`-direction.
     * 
     * The weights tensor is dilated by inserting `dilationRateInZ-1` zeros between consecutive values in `z`-dimension.
     * Dilated weights tensor depth is `(dilationRateInZ-1)*kernelDepth+1`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setDilationRateInZ:")
    public native void setDilationRateInZ(@NUInt long value);

    /**
     * Sets the left, right, top, bottom, front, and back padding values.
     * - Parameters:
     * - paddingLeft: See ``paddingLeft`` property.
     * - paddingRight: See ``paddingRight`` property.
     * - paddingTop: See ``paddingTop`` property.
     * - paddingBottom: See ``paddingBottom`` property.
     * - paddingFront: See ``paddingFront`` property.
     * - paddingBottom: See ``paddingBottom`` property.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:paddingFront:paddingBack:")
    public native void setExplicitPaddingWithPaddingLeftPaddingRightPaddingTopPaddingBottomPaddingFrontPaddingBack(
            @NUInt long paddingLeft, @NUInt long paddingRight, @NUInt long paddingTop, @NUInt long paddingBottom,
            @NUInt long paddingFront, @NUInt long paddingBack);

    /**
     * The number of partitions of the input and output channels.
     * 
     * The convolution operation divides input and output channels in `groups` partitions.
     * input channels in a group or partition are only connected to output channels in corresponding group.
     * Number of weights the convolution needs is `outputFeatureChannels x inputFeatureChannels/groups x kernelDepth x
     * kernelWidth x kernelHeight`
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setGroups:")
    public native void setGroups(@NUInt long value);

    /**
     * The number of zeros added at the back of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingBack:")
    public native void setPaddingBack(@NUInt long value);

    /**
     * The number of zeros added at the bottom of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingBottom:")
    public native void setPaddingBottom(@NUInt long value);

    /**
     * The number of zeros added at the front of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingFront:")
    public native void setPaddingFront(@NUInt long value);

    /**
     * The number of zeros added on the left side of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingLeft:")
    public native void setPaddingLeft(@NUInt long value);

    /**
     * The number of zeros added on the right side of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingRight:")
    public native void setPaddingRight(@NUInt long value);

    /**
     * The type of padding that is applied to the source tensor.
     * 
     * If paddingStyle is `MPSGraphPaddingStyleExplicit`, `paddingLeft`, `laddingRight`, `paddingTop`,
     * `paddingBottom`, `paddingFront` and `paddingBack` must to be specified. For all other padding styles, framework
     * compute these values so you dont need to provide these values.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingStyle:")
    public native void setPaddingStyle(@NUInt long value);

    /**
     * The number of zeros added at the top of the source tensor.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setPaddingTop:")
    public native void setPaddingTop(@NUInt long value);

    /**
     * The scale that maps`x`-coordinate of destination to `x`-coordinate of source.
     * 
     * Source `x`-coordinate, `sx` is computed from destination `x`-coordinate, `dx` as `sx = strideInX*dx`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * The scale that maps`y`-coordinate of destination to `y`-coordinate of source.
     * 
     * Source `y`-coordinate, `sy` is computed from destination `y`-coordinate, `dy` as `sy = strideInY*dy`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    /**
     * The scale that maps`z`-coordinate of destination to `z`-coordinate of source.
     * 
     * Source `z`-coordinate, `sz` is computed from destination `z`-coordinate, `dz` as `sz = strideInZ*dz`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setStrideInZ:")
    public native void setStrideInZ(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The named layout of data in the weights tensor.
     * 
     * It defines the order of named dimensions (Output channels, Input channels, Kernel depth, Kernel height, Kernel
     * width). The convolution operation uses this to interpret data in the weights tensor.
     * For example, if `weightsLayout` is `MPSGraphTensorNamedDataLayoutOIDHW`, frameork interprets data in weights
     * tensor as `outputChannels x inputChannels x kernelDepth x kernelHeight x kernelWidth`
     * with `kernelWidth` as fastest moving dimension.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("setWeightsLayout:")
    public native void setWeightsLayout(@NUInt long value);

    /**
     * The scale that maps`x`-coordinate of destination to `x`-coordinate of source.
     * 
     * Source `x`-coordinate, `sx` is computed from destination `x`-coordinate, `dx` as `sx = strideInX*dx`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * The scale that maps`y`-coordinate of destination to `y`-coordinate of source.
     * 
     * Source `y`-coordinate, `sy` is computed from destination `y`-coordinate, `dy` as `sy = strideInY*dy`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

    /**
     * The scale that maps`z`-coordinate of destination to `z`-coordinate of source.
     * 
     * Source `z`-coordinate, `sz` is computed from destination `z`-coordinate, `dz` as `sz = strideInZ*dz`.
     * Default value is 1.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("strideInZ")
    @NUInt
    public native long strideInZ();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The named layout of data in the weights tensor.
     * 
     * It defines the order of named dimensions (Output channels, Input channels, Kernel depth, Kernel height, Kernel
     * width). The convolution operation uses this to interpret data in the weights tensor.
     * For example, if `weightsLayout` is `MPSGraphTensorNamedDataLayoutOIDHW`, frameork interprets data in weights
     * tensor as `outputChannels x inputChannels x kernelDepth x kernelHeight x kernelWidth`
     * with `kernelWidth` as fastest moving dimension.
     * 
     * API-Since: 16.3
     */
    @Generated
    @Selector("weightsLayout")
    @NUInt
    public native long weightsLayout();
}