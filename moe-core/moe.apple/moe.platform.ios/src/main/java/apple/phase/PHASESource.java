package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * PHASESource
 * 
 * A PHASESource represents where sound originates within the simulated acoustic scene.
 * 
 * PHASE supports both point sources and volumetric sources.
 * A point source simulates the sound from a point in space.
 * A volumetric source simulates the sound from a shape.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASESource extends PHASEObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASESource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASESource alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASESource allocWithZone(VoidPtr zone);

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
     * [@property] gain
     * 
     * Linear gain scalar.
     * [@note]
     * Values are clamped to the range [0, 1]. Default value is 1.
     */
    @Generated
    @Selector("gain")
    public native double gain();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASESource init();

    /**
     * initWithEngine:
     * 
     * Initialize a new point source.
     */
    @Generated
    @Selector("initWithEngine:")
    public native PHASESource initWithEngine(@NotNull PHASEEngine engine);

    /**
     * initWithEngine:shapes:
     * 
     * Initialize a new volumetric source with shapes.
     * 
     * The shapes array cannot be empty, otherwise an exception is thrown.
     * [@note]
     * This function is thread-safe.
     * Clients can safely run this function to create multiple sources from multiple threads, if required.
     * 
     * @param shapes
     *               The shape(s) of the source within the world
     */
    @Generated
    @Selector("initWithEngine:shapes:")
    public native PHASESource initWithEngineShapes(@NotNull PHASEEngine engine,
            @NotNull NSArray<? extends PHASEShape> shapes);

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
    public static native PHASESource new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] gain
     * 
     * Linear gain scalar.
     * [@note]
     * Values are clamped to the range [0, 1]. Default value is 1.
     */
    @Generated
    @Selector("setGain:")
    public native void setGain(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] shapes
     * 
     * Array of shapes associated with this source.
     */
    @NotNull
    @Generated
    @Selector("shapes")
    public native NSArray<? extends PHASEShape> shapes();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
