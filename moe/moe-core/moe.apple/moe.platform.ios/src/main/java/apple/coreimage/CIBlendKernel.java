package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CIBlendKernel is a special type of color kernel that blends two images.
 * 
 * Blend kernel functions are declared akin to this example:
 * kernel vec4 myBlendKernel (__sample fore, __sample back)
 * 
 * A blend kernel function must have exactly two arguments of type __sample.
 * The first argument represents the value of the source pixel and the second
 * represents that of the old destination. The vec4 returned by the kernel will
 * be the new destination color.
 * The kernel should not call sample(), samplerCoord(), or samplerTransform().
 * The function must return a vec4 pixel color.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIBlendKernel extends CIColorKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected CIBlendKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIBlendKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIBlendKernel allocWithZone(VoidPtr zone);

    /**
     * Apply the receiver CIBlendKernel to produce a new CIImage object
     * by blending a foreground and background images.
     * 
     * The 'extent' of the result image will be determined by the reciver and
     * the extent of the forground and background images. For most of the
     * builtin blend kernels (as well as custom blend kernels) the result image
     * extent will be the union of the forground and background image
     * extents.
     */
    @Nullable
    @Generated
    @Selector("applyWithForeground:background:")
    public native CIImage applyWithForegroundBackground(@NotNull CIImage foreground, @NotNull CIImage background);

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
     * Porter Duff
     * http://dl.acm.org/citation.cfm?id=808606
     */
    @NotNull
    @Generated
    @Selector("clear")
    public static native CIBlendKernel clear();

    @NotNull
    @Generated
    @Selector("color")
    public static native CIBlendKernel color();

    @NotNull
    @Generated
    @Selector("colorBurn")
    public static native CIBlendKernel colorBurn();

    @NotNull
    @Generated
    @Selector("colorDodge")
    public static native CIBlendKernel colorDodge();

    /**
     * Component-wise operators
     */
    @NotNull
    @Generated
    @Selector("componentAdd")
    public static native CIBlendKernel componentAdd();

    @NotNull
    @Generated
    @Selector("componentMax")
    public static native CIBlendKernel componentMax();

    @NotNull
    @Generated
    @Selector("componentMin")
    public static native CIBlendKernel componentMin();

    @NotNull
    @Generated
    @Selector("componentMultiply")
    public static native CIBlendKernel componentMultiply();

    @NotNull
    @Generated
    @Selector("darken")
    public static native CIBlendKernel darken();

    @NotNull
    @Generated
    @Selector("darkerColor")
    public static native CIBlendKernel darkerColor();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("destination")
    public static native CIBlendKernel destination();

    @NotNull
    @Generated
    @Selector("destinationAtop")
    public static native CIBlendKernel destinationAtop();

    @NotNull
    @Generated
    @Selector("destinationIn")
    public static native CIBlendKernel destinationIn();

    @NotNull
    @Generated
    @Selector("destinationOut")
    public static native CIBlendKernel destinationOut();

    @NotNull
    @Generated
    @Selector("destinationOver")
    public static native CIBlendKernel destinationOver();

    @NotNull
    @Generated
    @Selector("difference")
    public static native CIBlendKernel difference();

    @NotNull
    @Generated
    @Selector("divide")
    public static native CIBlendKernel divide();

    @NotNull
    @Generated
    @Selector("exclusion")
    public static native CIBlendKernel exclusion();

    @NotNull
    @Generated
    @Selector("exclusiveOr")
    public static native CIBlendKernel exclusiveOr();

    @NotNull
    @Generated
    @Selector("hardLight")
    public static native CIBlendKernel hardLight();

    @NotNull
    @Generated
    @Selector("hardMix")
    public static native CIBlendKernel hardMix();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Standard nonseparable blend modes
     */
    @NotNull
    @Generated
    @Selector("hue")
    public static native CIBlendKernel hue();

    @Generated
    @Selector("init")
    public native CIBlendKernel init();

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
    @Selector("kernelWithFunctionName:fromMetalLibraryData:error:")
    public static native CIBlendKernel kernelWithFunctionNameFromMetalLibraryDataError(@NotNull String name,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    public static native CIBlendKernel kernelWithFunctionNameFromMetalLibraryDataOutputPixelFormatError(
            @NotNull String name, @NotNull NSData data, int format,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The string argument should contain a program with one custom blend kernel.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these
     * warnings)
     */
    @Deprecated
    @Generated
    @Selector("kernelWithString:")
    public static native CIBlendKernel kernelWithString(@NotNull String string);

    @Nullable
    @Deprecated
    @Generated
    @Selector("kernelsWithString:")
    public static native NSArray<? extends CIKernel> kernelsWithString(@NotNull String string);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("lighten")
    public static native CIBlendKernel lighten();

    @NotNull
    @Generated
    @Selector("lighterColor")
    public static native CIBlendKernel lighterColor();

    @NotNull
    @Generated
    @Selector("linearBurn")
    public static native CIBlendKernel linearBurn();

    @NotNull
    @Generated
    @Selector("linearDodge")
    public static native CIBlendKernel linearDodge();

    @NotNull
    @Generated
    @Selector("linearLight")
    public static native CIBlendKernel linearLight();

    @NotNull
    @Generated
    @Selector("luminosity")
    public static native CIBlendKernel luminosity();

    /**
     * Standard separable blend modes
     */
    @NotNull
    @Generated
    @Selector("multiply")
    public static native CIBlendKernel multiply();

    @Generated
    @Owned
    @Selector("new")
    public static native CIBlendKernel new_objc();

    @NotNull
    @Generated
    @Selector("overlay")
    public static native CIBlendKernel overlay();

    @NotNull
    @Generated
    @Selector("pinLight")
    public static native CIBlendKernel pinLight();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @NotNull
    @Generated
    @Selector("saturation")
    public static native CIBlendKernel saturation();

    @NotNull
    @Generated
    @Selector("screen")
    public static native CIBlendKernel screen();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("softLight")
    public static native CIBlendKernel softLight();

    @NotNull
    @Generated
    @Selector("source")
    public static native CIBlendKernel source();

    @NotNull
    @Generated
    @Selector("sourceAtop")
    public static native CIBlendKernel sourceAtop();

    @NotNull
    @Generated
    @Selector("sourceIn")
    public static native CIBlendKernel sourceIn();

    @NotNull
    @Generated
    @Selector("sourceOut")
    public static native CIBlendKernel sourceOut();

    @NotNull
    @Generated
    @Selector("sourceOver")
    public static native CIBlendKernel sourceOver();

    /**
     * Additional blend modes
     */
    @NotNull
    @Generated
    @Selector("subtract")
    public static native CIBlendKernel subtract();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("vividLight")
    public static native CIBlendKernel vividLight();

    /**
     * Apply the receiver CIBlendKernel to produce a new CIImage object
     * by blending a foreground and background images in the specifid colorspace.
     * 
     * The 'extent' of the result image will be determined by the reciver and
     * the extent of the forground and background images. For most of the
     * builtin blend kernels (as well as custom blend kernels) the result image
     * extent will be the union of the forground and background image
     * extents.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("applyWithForeground:background:colorSpace:")
    public native CIImage applyWithForegroundBackgroundColorSpace(@NotNull CIImage foreground,
            @NotNull CIImage background, @NotNull CGColorSpaceRef colorSpace);

    @NotNull
    @Generated
    @Selector("kernelNamesFromMetalLibraryData:")
    public static native NSArray<String> kernelNamesFromMetalLibraryData(@NotNull NSData data);

    @Nullable
    @Generated
    @Selector("kernelsWithMetalString:error:")
    public static native NSArray<? extends CIKernel> kernelsWithMetalStringError(@NotNull String source,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
