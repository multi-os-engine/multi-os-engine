package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.struct.AVCaptionPoint;
import apple.avfoundation.struct.AVCaptionSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMutableCaptionRegion
 * 
 * Mutable subclass of AVCaptionRegion.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableCaptionRegion extends AVCaptionRegion {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableCaptionRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableCaptionRegion alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMutableCaptionRegion allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appleITTBottomRegion")
    @NotNull
    public static native AVCaptionRegion appleITTBottomRegion();

    @Generated
    @Selector("appleITTLeftRegion")
    @NotNull
    public static native AVCaptionRegion appleITTLeftRegion();

    @Generated
    @Selector("appleITTRightRegion")
    @NotNull
    public static native AVCaptionRegion appleITTRightRegion();

    @Generated
    @Selector("appleITTTopRegion")
    @NotNull
    public static native AVCaptionRegion appleITTTopRegion();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] displayAlignment
     * 
     * Alignment of lines in the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("displayAlignment")
    @NInt
    public native long displayAlignment();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * init
     * 
     * Create a region object without any properties.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("init")
    public native AVMutableCaptionRegion init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableCaptionRegion initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithIdentifier:
     * 
     * Create a region object with the identifier.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native AVMutableCaptionRegion initWithIdentifier(@NotNull String identifier);

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
    public static native AVMutableCaptionRegion new_objc();

    /**
     * [@property] origin
     * 
     * The position of the top-left of the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("origin")
    @ByValue
    public native AVCaptionPoint origin();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] scroll
     * 
     * Region scroll mode.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("scroll")
    @NInt
    public native long scroll();

    /**
     * [@property] displayAlignment
     * 
     * Alignment of lines in the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDisplayAlignment:")
    public native void setDisplayAlignment(@NInt long value);

    /**
     * [@property] origin
     * 
     * The position of the top-left of the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setOrigin:")
    public native void setOrigin(@ByValue AVCaptionPoint value);

    /**
     * [@property] scroll
     * 
     * Region scroll mode.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setScroll:")
    public native void setScroll(@NInt long value);

    /**
     * [@property] size
     * 
     * The width and height of the region, potentally with unspecified fields.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue AVCaptionSize value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] writingMode
     * 
     * The block and inline progression direction of the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWritingMode:")
    public native void setWritingMode(@NInt long value);

    /**
     * [@property] size
     * 
     * The width and height of the region, potentally with unspecified fields.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native AVCaptionSize size();

    @Generated
    @Selector("subRipTextBottomRegion")
    @NotNull
    public static native AVCaptionRegion subRipTextBottomRegion();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] writingMode
     * 
     * The block and inline progression direction of the region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("writingMode")
    @NInt
    public native long writingMode();
}