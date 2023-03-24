package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class provides some pre-rolled padding policies for common tasks
 * 
 * You are, of course, welcome to write your own class that conforms to
 * The MPSNNPadding protocol and use that instead.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNDefaultPadding extends NSObject implements MPSNNPadding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNDefaultPadding(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNDefaultPadding alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNDefaultPadding allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @IsOptional
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStatesForKernelSuggestedDescriptor(
            @NotNull NSArray<? extends MPSImage> sourceImages, @Nullable NSArray<? extends MPSState> sourceStates,
            @NotNull MPSKernel kernel, @NotNull MPSImageDescriptor inDescriptor);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNDefaultPadding init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNDefaultPadding initWithCoder(@NotNull NSCoder coder);

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

    @NotNull
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNDefaultPadding new_objc();

    /**
     * same size centering mode
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("paddingForTensorflowAveragePooling")
    public static native MPSNNDefaultPadding paddingForTensorflowAveragePooling();

    @Generated
    @Selector("paddingMethod")
    @NUInt
    public native long paddingMethod();

    /**
     * Fetch a well known object that implements a non-custom padding method
     * 
     * For custom padding methods, you will need to implement an object that conforms
     * to the full MPSNNPadding protocol, including NSSecureCoding.
     * 
     * @param method A MPSNNPaddingMethod
     * @return An object that implements <MPSNNPadding> for use with MPSNNGraphNodes.
     */
    @Generated
    @Selector("paddingWithMethod:")
    public static native MPSNNDefaultPadding paddingWithMethod(@NUInt long method);

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

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @IsOptional
    @Selector("inverse")
    public native MPSNNDefaultPadding inverse();

    /**
     * Typical pooling padding policy for valid only mode
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("paddingForTensorflowAveragePoolingValidOnly")
    public static native MPSNNDefaultPadding paddingForTensorflowAveragePoolingValidOnly();
}
