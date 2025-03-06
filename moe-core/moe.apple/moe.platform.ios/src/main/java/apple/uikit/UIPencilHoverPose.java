package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * An object that describes the hover pose of the pencil while performing a gesture on the pencil
 * 
 * API-Since: 17.5
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPencilHoverPose extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPencilHoverPose(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPencilHoverPose alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIPencilHoverPose allocWithZone(VoidPtr zone);

    /**
     * The altitude angle in radians of the pencil while performing the associated action. Zero radians indicates that
     * the stylus is parallel to the screen surface, while `M_PI/2`
     * radians indicates that it is normal to the screen surface.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("altitudeAngle")
    @NFloat
    public native double altitudeAngle();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The azimuth angle in radians of the pencil in the interaction's view while performing the associated action. Zero
     * radians points along the positive X axis.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("azimuthAngle")
    @NFloat
    public native double azimuthAngle();

    /**
     * The azimuth unit vector of the pencil in the interaction's view while performing the associated action. The unit
     * vector points in the direction of the azimuth angle.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("azimuthUnitVector")
    @ByValue
    public native CGVector azimuthUnitVector();

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
    public native UIPencilHoverPose init();

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

    /**
     * The hover location of the pencil in the interaction's view while performing the associated action. If the pencil
     * is removed from hover range during a continuous interaction,
     * this will be the last reported location.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("location")
    @ByValue
    public native CGPoint location();

    @Generated
    @Owned
    @Selector("new")
    public static native UIPencilHoverPose new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The roll angle in radians of the pencil while performing the associated action. For pencils that don't support
     * roll, this value will be 0.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("rollAngle")
    @NFloat
    public native double rollAngle();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
     * The normalized distance from the screen of the hovering pencil. This value will be 1 at the maximum distance from
     * the screen and will approach 0 as the pencil gets
     * closer to the screen.
     * 
     * API-Since: 17.5
     */
    @Generated
    @Selector("zOffset")
    @NFloat
    public native double zOffset();
}