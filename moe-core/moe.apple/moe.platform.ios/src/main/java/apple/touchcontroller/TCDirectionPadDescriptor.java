package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
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
 * A descriptor for configuring a directional pad.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCDirectionPadDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCDirectionPadDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCDirectionPadDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCDirectionPadDescriptor allocWithZone(VoidPtr zone);

    /**
     * The anchor point that the direction pad's offset is relative to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("anchor")
    @NInt
    public native long anchor();

    /**
     * The coordinate system for the control's anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("anchorCoordinateSystem")
    @NInt
    public native long anchorCoordinateSystem();

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

    /**
     * The shape of collider to use for the direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colliderShape")
    @NInt
    public native long colliderShape();

    /**
     * A composite control label.
     * 
     * If set, the control will behave as a `GCControllerDirectionPad`. Otherwise, it will behave as separate buttons.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("compositeLabel")
    @Nullable
    public native TCControlLabel compositeLabel();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The contents for the down button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("downContents")
    @Nullable
    public native TCControlContents downContents();

    /**
     * The label for the down button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("downLabel")
    @Nullable
    public native TCControlLabel downLabel();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The time it takes for a highlight to fade away, in seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("highlightDuration")
    public native double highlightDuration();

    /**
     * Creates a new instance with default values.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native TCDirectionPadDescriptor init();

    /**
     * A Boolean value that indicates whether the control has mutally exclusive input.
     * 
     * If `YES`, only one element of the direction pad can be pressed at a time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputIsMutuallyExclusive")
    public native boolean inputIsMutuallyExclusive();

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
     * A Boolean value that indicates whether the control behaves as a digital button.
     * 
     * If `YES`, dpad buttons will report 1 or 0. Ignored if radial is set, as button presses will always be digital.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isDigital")
    public native boolean isDigital();

    /**
     * A Boolean value that indicates whether the control behaves as a swipeable radial button.
     * 
     * If `YES`, the control behaves as a swipable radial button, rather than a collection of 4 separate buttons.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isRadial")
    public native boolean isRadial();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The contents for the left button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leftContents")
    @Nullable
    public native TCControlContents leftContents();

    /**
     * The label for the left button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leftLabel")
    @Nullable
    public native TCControlLabel leftLabel();

    @Generated
    @Owned
    @Selector("new")
    public static native TCDirectionPadDescriptor new_objc();

    /**
     * The control's offset from the anchor, which determines its position.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native CGPoint offset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The contents for the right button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rightContents")
    @Nullable
    public native TCControlContents rightContents();

    /**
     * The label for the right button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rightLabel")
    @Nullable
    public native TCControlLabel rightLabel();

    /**
     * The anchor point that the direction pad's offset is relative to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAnchor:")
    public native void setAnchor(@NInt long value);

    /**
     * The coordinate system for the control's anchor point.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAnchorCoordinateSystem:")
    public native void setAnchorCoordinateSystem(@NInt long value);

    /**
     * The shape of collider to use for the direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColliderShape:")
    public native void setColliderShape(@NInt long value);

    /**
     * A composite control label.
     * 
     * If set, the control will behave as a `GCControllerDirectionPad`. Otherwise, it will behave as separate buttons.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setCompositeLabel:")
    public native void setCompositeLabel(@Nullable TCControlLabel value);

    /**
     * A Boolean value that indicates whether the control behaves as a digital button.
     * 
     * If `YES`, dpad buttons will report 1 or 0. Ignored if radial is set, as button presses will always be digital.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDigital:")
    public native void setDigital(boolean value);

    /**
     * The contents for the down button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDownContents:")
    public native void setDownContents(@Nullable TCControlContents value);

    /**
     * The label for the down button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDownLabel:")
    public native void setDownLabel(@Nullable TCControlLabel value);

    /**
     * The time it takes for a highlight to fade away, in seconds.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setHighlightDuration:")
    public native void setHighlightDuration(double value);

    /**
     * The contents for the left button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLeftContents:")
    public native void setLeftContents(@Nullable TCControlContents value);

    /**
     * The label for the left button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLeftLabel:")
    public native void setLeftLabel(@Nullable TCControlLabel value);

    /**
     * A Boolean value that indicates whether the control has mutally exclusive input.
     * 
     * If `YES`, only one element of the direction pad can be pressed at a time.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMutuallyExclusiveInput:")
    public native void setMutuallyExclusiveInput(boolean value);

    /**
     * The control's offset from the anchor, which determines its position.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue CGPoint value);

    /**
     * A Boolean value that indicates whether the control behaves as a swipeable radial button.
     * 
     * If `YES`, the control behaves as a swipable radial button, rather than a collection of 4 separate buttons.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRadial:")
    public native void setRadial(boolean value);

    /**
     * The contents for the right button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRightContents:")
    public native void setRightContents(@Nullable TCControlContents value);

    /**
     * The label for the right button, if the control is not a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRightLabel:")
    public native void setRightLabel(@Nullable TCControlLabel value);

    /**
     * The size (width, height) of the direction pad in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * The contents for the up button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setUpContents:")
    public native void setUpContents(@Nullable TCControlContents value);

    /**
     * The label for the up button, if the control isn't a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setUpLabel:")
    public native void setUpLabel(@Nullable TCControlLabel value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The z-index of the direction pad. A lower z-index is drawn first.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setZIndex:")
    public native void setZIndex(@NInt long value);

    /**
     * The size (width, height) of the direction pad in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The contents for the up button.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("upContents")
    @Nullable
    public native TCControlContents upContents();

    /**
     * The label for the up button, if the control isn't a composite direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("upLabel")
    @Nullable
    public native TCControlLabel upLabel();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The z-index of the direction pad. A lower z-index is drawn first.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("zIndex")
    @NInt
    public native long zIndex();
}