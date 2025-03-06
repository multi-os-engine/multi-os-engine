package apple.symbols;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A symbol effect that applies the Wiggle animation to symbol images.
 * 
 * The Wiggle animation applies a transitory translation or rotation effect
 * to the symbol.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("Symbols")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSymbolWiggleEffect extends NSSymbolEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSymbolWiggleEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSymbolWiggleEffect alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSSymbolWiggleEffect allocWithZone(VoidPtr zone);

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
     * The default wiggle effect, determined by the system.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("effect")
    public static native NSSymbolWiggleEffect effect();

    /**
     * Returns a copy of the effect that animates incrementally, by layer.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("effectWithByLayer")
    @NotNull
    public native NSSymbolWiggleEffect effectWithByLayer();

    /**
     * Returns a copy of the effect that animates all layers of the symbol simultaneously.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("effectWithWholeSymbol")
    @NotNull
    public native NSSymbolWiggleEffect effectWithWholeSymbol();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSSymbolWiggleEffect init();

    @Generated
    @Selector("initWithCoder:")
    public native NSSymbolWiggleEffect initWithCoder(@NotNull NSCoder coder);

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
    public static native NSSymbolWiggleEffect new_objc();

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
     * Convenience initializer for a wiggle effect that moves back and forth
     * horizontally based on the current locale, starting by moving backward.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleBackwardEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleBackwardEffect();

    /**
     * Convenience initializer for a wiggle effect that
     * rotates back and forth, starting by rotating clockwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleClockwiseEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleClockwiseEffect();

    /**
     * Convenience initializer for a wiggle effect that
     * rotates back and forth, starting by rotating counter-clockwise.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleCounterClockwiseEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleCounterClockwiseEffect();

    /**
     * Convenience initializer for a wiggle effect that moves back and forth
     * along an axis, starting by moving toward a custom angle.
     * 
     * The angle is in degrees moving clockwise from the positive x-axis.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleCustomAngleEffect:")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleCustomAngleEffect(double angle);

    /**
     * Convenience initializer for a wiggle effect that
     * moves back and forth vertically, starting by moving down.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleDownEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleDownEffect();

    /**
     * Convenience initializer for a wiggle effect that moves back and forth
     * horizontally based on the current locale, starting by moving forward.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleForwardEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleForwardEffect();

    /**
     * Convenience initializer for a wiggle effect that
     * moves back and forth horizontally, starting by moving left.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleLeftEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleLeftEffect();

    /**
     * Convenience initializer for a wiggle effect that
     * moves back and forth horizontally, starting by moving right.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleRightEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleRightEffect();

    /**
     * Convenience initializer for a wiggle effect that
     * moves back and forth vertically, starting by moving up.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("wiggleUpEffect")
    @NotNull
    public static native NSSymbolWiggleEffect wiggleUpEffect();
}