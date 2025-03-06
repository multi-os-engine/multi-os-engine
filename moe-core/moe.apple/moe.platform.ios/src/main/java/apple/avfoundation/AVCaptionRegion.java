package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.struct.AVCaptionPoint;
import apple.avfoundation.struct.AVCaptionSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptionRegion
 * 
 * An instance of AVCaptionRegion represents a region where a caption is placed.
 * 
 * Currently, there is just four predefined region instances. The interface doesn't support configuration of region
 * settings.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptionRegion extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptionRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptionRegion alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptionRegion allocWithZone(VoidPtr zone);

    /**
     * [@property] appleITTBottomRegion
     * 
     * The bottom region for iTT format
     * 
     * This region can be used in iTT format and it occupies the bottom 15% of the display area. The region uses LRTB, a
     * line progresses left to right and the block extends from top to bottom. Each line is stacked with bottom
     * justified.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("appleITTBottomRegion")
    @NotNull
    public static native AVCaptionRegion appleITTBottomRegion();

    /**
     * [@property] appleITTLeftRegion
     * 
     * The left region for iTT format
     * 
     * This region can be used in iTT format and it occupies the left 15% of the display area. The region uses TBRL, a
     * line progresses top to bottom and the block extends from right to left. Each line is stacked with right
     * justified.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("appleITTLeftRegion")
    @NotNull
    public static native AVCaptionRegion appleITTLeftRegion();

    /**
     * [@property] appleITTRightRegion
     * 
     * The right region for iTT format
     * 
     * This region can be used in iTT format and it occupies the right 15% of the display area. The region uses TBRL, a
     * line progresses top to bottom and the block extends from right to left. Each line is stacked with right
     * justified.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("appleITTRightRegion")
    @NotNull
    public static native AVCaptionRegion appleITTRightRegion();

    /**
     * [@property] appleITTTopRegion
     * 
     * The top region for iTT format
     * 
     * This region can be used in iTT format and it occupies the top 15% of the display area. The region uses LRTB, a
     * line progresses left to right and the block extends from top to bottom. Each line is stacked with top justified.
     * 
     * API-Since: 18.0
     */
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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] displayAlignment
     * 
     * Alignment of lines for the region
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("displayAlignment")
    @NInt
    public native long displayAlignment();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder encoder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] identifier
     * 
     * Identifier for the region
     * 
     * When regionIdentifier is nil, two regions with the same position and endPosition are considered to be same, that
     * is
     * captions referring these regions belong to the same region when serialized to a format like TTML. In addition,
     * the
     * AVCaptionRegion cannot be mutably copied.
     * 
     * When regionIdentifier is not nil, two regions are same if and only if the region identifier is equal. It is a
     * client's responsibility to ensure these AVCaptionRegion objects have the same properties.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("identifier")
    @Nullable
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVCaptionRegion init();

    @Generated
    @Selector("initWithCoder:")
    public native AVCaptionRegion initWithCoder(@NotNull NSCoder coder);

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

    /**
     * isEqual:
     * 
     * NSObject protocol method override
     * 
     * This method throws an exception if the caption region's size has different units for width and height, or if the
     * units are unrecognizeable.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) @NotNull Object object);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptionRegion new_objc();

    /**
     * [@property] origin
     * 
     * The position of the top-left of the region, potentially with unspecified fields.
     * 
     * It returns an AVCaptionPoint potentially with unspecified x and/or y fields. Unspecified dimensions indicate the
     * region doesn't have positioning information for that dimension.
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
     * Scroll mode for the region
     * 
     * See AVCaptionRegionScrollXXX enum for possible values.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("scroll")
    @NInt
    public native long scroll();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] size
     * 
     * The width and height of the region, potentally with unspecified fields.
     * 
     * It returns an AVCaptionSize potentially with unspecified width and/or height.
     * CEA608 closed captions support limits the size.height property’s value to 1 cell except when the
     * AVCaptionRegionScroll is AVCaptionRegionScrollRollUp.
     * If the AVCaptionRegionScroll is AVCaptionRegionScrollRollUp, the size.height property’s value must be 2, 3 or 4
     * cells.
     * It returns an AVCaptionSize with unspecifed width and height when the region doesn't have width or height
     * information.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native AVCaptionSize size();

    /**
     * [@property] subRipTextBottomRegion
     * 
     * The bottom region for SubRip Text (SRT) format
     * 
     * This region can be used in SRT format and it occupies the entire video display area. The region uses LRTB, a line
     * progresses left to right and the block extends from top to bottom. Each line is stacked with bottom justified.
     * 
     * API-Since: 18.0
     */
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