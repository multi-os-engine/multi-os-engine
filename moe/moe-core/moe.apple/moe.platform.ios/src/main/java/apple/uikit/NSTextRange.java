package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.NSTextLocation;
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
 * NSTextRange represents a contiguous range between two locations inside document contents. It consists of the starting location and terminating location. They are the two basic properties, location and endLocation, respectively. The terminating location, endLocation, is directly following the last location in the range. So, a location is contained in a range if (range.location <= location) && (location < range.endLocation).
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextRange extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextRange(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextRange alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSTextRange allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("containsLocation:")
    public native boolean containsLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation location);

    @Generated
    @Selector("containsRange:")
    public native boolean containsRange(NSTextRange textRange);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("endLocation")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation endLocation();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextRange init();

    @Generated
    @Selector("initWithLocation:")
    public native NSTextRange initWithLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns an empty range when endLocation=nil
     */
    @Generated
    @Selector("initWithLocation:endLocation:")
    public native NSTextRange initWithLocationEndLocation(@Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @Mapped(ObjCObjectMapper.class) NSTextLocation endLocation);

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
    @Selector("intersectsWithTextRange:")
    public native boolean intersectsWithTextRange(NSTextRange textRange);

    /**
     * An empty range when location == endLocation
     */
    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    @Generated
    @Selector("isEqualToTextRange:")
    public native boolean isEqualToTextRange(NSTextRange textRange);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Represented with the inclusive location and the exclusive endLocation
     */
    @Generated
    @Selector("location")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation location();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextRange new_objc();

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
    @Selector("textRangeByFormingUnionWithTextRange:")
    public native NSTextRange textRangeByFormingUnionWithTextRange(NSTextRange textRange);

    /**
     * Returns the intersection with textRange. Returns nil when not intersecting.
     */
    @Generated
    @Selector("textRangeByIntersectingWithTextRange:")
    public native NSTextRange textRangeByIntersectingWithTextRange(NSTextRange textRange);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
