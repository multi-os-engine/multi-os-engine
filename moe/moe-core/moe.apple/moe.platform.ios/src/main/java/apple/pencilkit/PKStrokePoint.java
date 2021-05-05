package apple.pencilkit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * A point value stores all the attributes of a PKStroke at a specific point.
 * `PKStrokePoint` stores its properties compressed, the value read for a property may not
 * exactly equal the value set for a property.
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKStrokePoint extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKStrokePoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKStrokePoint alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Altitude used to create this point in radians, 0.0-π/2 radians
     */
    @Generated
    @Selector("altitude")
    @NFloat
    public native double altitude();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Azimuth of the point in radians, 0.0-2π radians
     */
    @Generated
    @Selector("azimuth")
    @NFloat
    public native double azimuth();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Force used to create this point.
     */
    @Generated
    @Selector("force")
    @NFloat
    public native double force();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKStrokePoint init();

    /**
     * Create a new point with the provided properties.
     */
    @Generated
    @Selector("initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:")
    public native PKStrokePoint initWithLocationTimeOffsetSizeOpacityForceAzimuthAltitude(@ByValue CGPoint location,
            double timeOffset, @ByValue CGSize size, @NFloat double opacity, @NFloat double force,
            @NFloat double azimuth, @NFloat double altitude);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Location of the point.
     */
    @Generated
    @Selector("location")
    @ByValue
    public native CGPoint location();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Opacity of the point 0-2.
     */
    @Generated
    @Selector("opacity")
    @NFloat
    public native double opacity();

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
     * Size of the point.
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Time offset since the start of the stroke path in seconds.
     */
    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}