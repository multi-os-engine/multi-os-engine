package apple.quartzcore;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.corevideo.struct.CVTimeStamp;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.general.ann.UncertainArgument;
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
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CARenderer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CARenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add rectangle 'r' to the update region of the current frame.
     */
    @Generated
    @Selector("addUpdateRect:")
    public native void addUpdateRect(@ByValue CGRect r);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CARenderer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CARenderer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Begin rendering a frame at time 't'. If 'ts' is non-null it defines
     * the host time and update frequency of the target device.
     */
    @Generated
    @Selector("beginFrameAtTime:timeStamp:")
    public native void beginFrameAtTimeTimeStamp(double t,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CVTimeStamp ts);

    /**
     * The bounds rect of the render target.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

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
     * Release any data associated with the current frame.
     */
    @Generated
    @Selector("endFrame")
    public native void endFrame();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CARenderer init();

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

    /**
     * The root layer associated with the renderer.
     */
    @Nullable
    @Generated
    @Selector("layer")
    public native CALayer layer();

    @Generated
    @Owned
    @Selector("new")
    public static native CARenderer new_objc();

    /**
     * Returns the time at which the next update should happen. If infinite
     * no update needs to be scheduled yet. If the current frame time, a
     * continuous animation is running and an update should be scheduled
     * after a "natural" delay.
     */
    @Generated
    @Selector("nextFrameTime")
    public native double nextFrameTime();

    /**
     * Render the update region of the current frame to the target context.
     */
    @Generated
    @Selector("render")
    public native void render();

    /**
     * Create a new renderer object. Its render target is the specified
     * texture. 'dict' is an optional dictionary of parameters.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("rendererWithMTLTexture:options:")
    public static native CARenderer rendererWithMTLTextureOptions(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture tex, @Nullable NSDictionary<?, ?> dict);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The bounds rect of the render target.
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    /**
     * Change the renderer's destination Metal texture.
     */
    @Generated
    @Selector("setDestination:")
    public native void setDestination(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture tex);

    /**
     * The root layer associated with the renderer.
     */
    @Generated
    @Selector("setLayer:")
    public native void setLayer(@Nullable CALayer value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the bounds of the update region - the area that contains all
     * pixels that will be rendered by the current frame. Initially this
     * will include all differences between the current frame and the
     * previously rendered frame.
     */
    @Generated
    @Selector("updateBounds")
    @ByValue
    public native CGRect updateBounds();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}