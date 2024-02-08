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
 * A symbol effect that applies the Variable Color
 * animation to symbol images.
 * 
 * The Variable Color animation replaces the opacity of variable
 * layers in the symbol by a possibly repeating pattern that moves
 * up and possibly back down the variable layers. It has no effect
 * for non-variable color symbol images.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Symbols")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSymbolVariableColorEffect extends NSSymbolEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSymbolVariableColorEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSymbolVariableColorEffect alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSSymbolVariableColorEffect allocWithZone(VoidPtr zone);

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
     * The default variable color effect, determined by the system.
     */
    @Generated
    @Selector("effect")
    public static native NSSymbolVariableColorEffect effect();

    /**
     * Returns a copy of the effect that activates each layer until all layers are active. This cancels the iterative
     * variant.
     */
    @Generated
    @Selector("effectWithCumulative")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithCumulative();

    /**
     * Returns a copy of the effect that draws layers with reduced (but non-zero)
     * opacity when they are inactive.
     */
    @Generated
    @Selector("effectWithDimInactiveLayers")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithDimInactiveLayers();

    /**
     * Returns a copy of the effect that hides layers when they are inactive.
     */
    @Generated
    @Selector("effectWithHideInactiveLayers")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithHideInactiveLayers();

    /**
     * Returns a copy of the effect that activates one layer at a time. This cancels the cumulative variant.
     */
    @Generated
    @Selector("effectWithIterative")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithIterative();

    /**
     * Returns a copy of the effect that only animates forwards before restarting. This cancels the reversing variant.
     */
    @Generated
    @Selector("effectWithNonReversing")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithNonReversing();

    /**
     * Returns a copy of the effect that animates in reverse after fully executing. This cancels the nonReversing
     * variant.
     */
    @Generated
    @Selector("effectWithReversing")
    @NotNull
    public native NSSymbolVariableColorEffect effectWithReversing();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSSymbolVariableColorEffect init();

    @Generated
    @Selector("initWithCoder:")
    public native NSSymbolVariableColorEffect initWithCoder(@NotNull NSCoder coder);

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
    public static native NSSymbolVariableColorEffect new_objc();

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
}