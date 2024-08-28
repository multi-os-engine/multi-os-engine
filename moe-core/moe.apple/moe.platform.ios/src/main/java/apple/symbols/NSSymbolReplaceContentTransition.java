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
 * A symbol effect that animates the replacement of one symbol image
 * with another.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Symbols")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSymbolReplaceContentTransition extends NSSymbolContentTransition {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSymbolReplaceContentTransition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSymbolReplaceContentTransition alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSSymbolReplaceContentTransition allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSSymbolReplaceContentTransition init();

    @Generated
    @Selector("initWithCoder:")
    public native NSSymbolReplaceContentTransition initWithCoder(@NotNull NSCoder coder);

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
    public static native NSSymbolReplaceContentTransition new_objc();

    /**
     * Convenience initializer for a replace content transition where the initial symbol
     * scales down as it is removed, and the new symbol scales up as it is added.
     */
    @Generated
    @Selector("replaceDownUpTransition")
    @NotNull
    public static native NSSymbolReplaceContentTransition replaceDownUpTransition();

    /**
     * Convenience initializer for a replace content transition where the initial symbol
     * is removed with no animation, and the new symbol scales up as it is added.
     */
    @Generated
    @Selector("replaceOffUpTransition")
    @NotNull
    public static native NSSymbolReplaceContentTransition replaceOffUpTransition();

    /**
     * Convenience initializer for a replace content transition where the initial symbol
     * scales up as it is removed, and the new symbol scales up as it is added.
     */
    @Generated
    @Selector("replaceUpUpTransition")
    @NotNull
    public static native NSSymbolReplaceContentTransition replaceUpUpTransition();

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

    /**
     * The default replace transition, determined by the system.
     */
    @Generated
    @Selector("transition")
    public static native NSSymbolReplaceContentTransition transition();

    /**
     * Returns a copy of the content transition that animates incrementally, by layer.
     */
    @Generated
    @Selector("transitionWithByLayer")
    @NotNull
    public native NSSymbolReplaceContentTransition transitionWithByLayer();

    /**
     * Returns a copy of the content transition that animates all layers of the symbol simultaneously.
     */
    @Generated
    @Selector("transitionWithWholeSymbol")
    @NotNull
    public native NSSymbolReplaceContentTransition transitionWithWholeSymbol();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}