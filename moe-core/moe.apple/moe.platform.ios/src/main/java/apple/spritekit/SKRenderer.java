package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A renderer for displaying a SpriteKit scene in an existing Metal workflow.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKRenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKRenderer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKRenderer allocWithZone(VoidPtr zone);

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

    /**
     * Ignores sibling and traversal order to sort the rendered contents of a scene into the most efficient batching
     * possible.
     * This will require zPosition to be used in the scenes to properly guarantee elements are in front or behind each
     * other.
     * 
     * This defaults to NO, meaning that sibling order overrides efficiency heuristics in the rendering of the scenes in
     * the view.
     * 
     * Setting this to YES for a complex scene may substantially increase performance, but care must be taken as only
     * zPosition
     * determines render order before the efficiency heuristics are used.
     */
    @Generated
    @Selector("ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();

    @Generated
    @Selector("init")
    public native SKRenderer init();

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
    public static native SKRenderer new_objc();

    /**
     * Render the scene content in the specified Metal command buffer.
     * 
     * @param viewport             The pixel dimensions in which to render.
     * @param commandBuffer        The Metal command buffer in which SpriteKit should schedule rendering commands.
     * @param renderPassDescriptor The Metal render pass descriptor describing the rendering target.
     */
    @Generated
    @Selector("renderWithViewport:commandBuffer:renderPassDescriptor:")
    public native void renderWithViewportCommandBufferRenderPassDescriptor(@ByValue CGRect viewport,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * Render the scene content using a specific Metal command encoder.
     * 
     * @param viewport             The pixel dimensions in which to render.
     * @param renderCommandEncoder The Metal render command encoder that SpriteKit will use to encode rendering
     *                             commands. This method will not call endEncoding.
     * @param renderPassDescriptor The Metal render pass descriptor describing the rendering target.
     * @param commandQueue         The Metal command queue.
     */
    @Generated
    @Selector("renderWithViewport:renderCommandEncoder:renderPassDescriptor:commandQueue:")
    public native void renderWithViewportRenderCommandEncoderRenderPassDescriptorCommandQueue(@ByValue CGRect viewport,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLRenderCommandEncoder renderCommandEncoder,
            @NotNull MTLRenderPassDescriptor renderPassDescriptor,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    /**
     * Creates a renderer with the specified Metal device.
     * 
     * @param device A Metal device.
     * @return A new renderer object.
     */
    @NotNull
    @Generated
    @Selector("rendererWithDevice:")
    public static native SKRenderer rendererWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The currently presented scene, otherwise nil. If in a transition, the 'incoming' scene is returned.
     */
    @Nullable
    @Generated
    @Selector("scene")
    public native SKScene scene();

    /**
     * Ignores sibling and traversal order to sort the rendered contents of a scene into the most efficient batching
     * possible.
     * This will require zPosition to be used in the scenes to properly guarantee elements are in front or behind each
     * other.
     * 
     * This defaults to NO, meaning that sibling order overrides efficiency heuristics in the rendering of the scenes in
     * the view.
     * 
     * Setting this to YES for a complex scene may substantially increase performance, but care must be taken as only
     * zPosition
     * determines render order before the efficiency heuristics are used.
     */
    @Generated
    @Selector("setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean value);

    /**
     * The currently presented scene, otherwise nil. If in a transition, the 'incoming' scene is returned.
     */
    @Generated
    @Selector("setScene:")
    public native void setScene(@Nullable SKScene value);

    /**
     * A boolean that indicated whether non-visible nodes should be automatically culled when rendering.
     */
    @Generated
    @Selector("setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean value);

    /**
     * Toggles display of performance stats when rendering. All default to false.
     */
    @Generated
    @Selector("setShowsDrawCount:")
    public native void setShowsDrawCount(boolean value);

    @Generated
    @Selector("setShowsFields:")
    public native void setShowsFields(boolean value);

    @Generated
    @Selector("setShowsNodeCount:")
    public native void setShowsNodeCount(boolean value);

    @Generated
    @Selector("setShowsPhysics:")
    public native void setShowsPhysics(boolean value);

    @Generated
    @Selector("setShowsQuadCount:")
    public native void setShowsQuadCount(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A boolean that indicated whether non-visible nodes should be automatically culled when rendering.
     */
    @Generated
    @Selector("shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();

    /**
     * Toggles display of performance stats when rendering. All default to false.
     */
    @Generated
    @Selector("showsDrawCount")
    public native boolean showsDrawCount();

    @Generated
    @Selector("showsFields")
    public native boolean showsFields();

    @Generated
    @Selector("showsNodeCount")
    public native boolean showsNodeCount();

    @Generated
    @Selector("showsPhysics")
    public native boolean showsPhysics();

    @Generated
    @Selector("showsQuadCount")
    public native boolean showsQuadCount();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Update the scene at the specified system time.
     * 
     * @param currentTime The timestamp in seconds.
     */
    @Generated
    @Selector("updateAtTime:")
    public native void updateAtTime(double currentTime);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
