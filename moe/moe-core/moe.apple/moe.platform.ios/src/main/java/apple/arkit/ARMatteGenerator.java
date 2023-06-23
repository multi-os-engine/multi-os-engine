package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object designed to generate either full resolution or half resolution matte given the ARFrame.
 * 
 * The caller initializes the object once and calls the alpha matte generation API for every ARFrame with the captured
 * image and segmentation stencil.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARMatteGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ARMatteGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARMatteGenerator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARMatteGenerator allocWithZone(VoidPtr zone);

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

    /**
     * Generates dilated depth at the resolution of the segmentation stencil.
     * 
     * The caller can use depth information when compositing a virtual object with the captured scene. This API returns
     * the dilated linear depth to the caller. The reprojection of this depth to the caller's scene space is carried out
     * externally.
     * 
     * @param frame         Current ARFrame containing camera image and estimated depth buffer. The caller is to ensure
     *                      that a valid depth buffer is present.
     * @param commandBuffer Metal command buffer for encoding depth dilation operations. The command buffer is committed
     *                      by the caller externally.
     * @return Dilated depth MTLTexture for the given ARFrame at the segmentation stencil resolution. The texture
     *         consists of a single channel and is of type float16.
     */
    @NotNull
    @Generated
    @Selector("generateDilatedDepthFromFrame:commandBuffer:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture generateDilatedDepthFromFrameCommandBuffer(@NotNull ARFrame frame,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * Generates alpha matte at either full resolution or half the resolution of the captured image.
     * 
     * @param frame         Current ARFrame containing camera image and segmentation stencil. The caller is to ensure
     *                      that a valid segmentation buffer is present.
     * @param commandBuffer Metal command buffer for encoding matting related operations. The command buffer is
     *                      committed by the caller externally.
     * @return Alpha matte MTLTexture for the given ARFrame at full resolution or half resolution as chosen by the
     *         caller during initialization.
     */
    @NotNull
    @Generated
    @Selector("generateMatteFromFrame:commandBuffer:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture generateMatteFromFrameCommandBuffer(@NotNull ARFrame frame,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARMatteGenerator init();

    /**
     * Initializes an instance of ARMatteGenerator.
     * 
     * For efficient creation of alpha mattes in real time it is recommended to instantiate this object only once and to
     * generate an alpha matte for every incoming frame.
     * 
     * @see ARFrame
     * @see -[ARMatteGenerator generateMatteFromFrame:commandBuffer:]
     * @param device          The device the filter will run on.
     * @param matteResolution The resolution at which the matte is to be generated. Set using one of the values from
     *                        'ARMatteResolution'.
     * @see ARMatteResolution
     * @return Instance of ARMatteGenerator.
     */
    @Generated
    @Selector("initWithDevice:matteResolution:")
    public native ARMatteGenerator initWithDeviceMatteResolution(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NInt long matteResolution);

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
    public static native ARMatteGenerator new_objc();

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
}
