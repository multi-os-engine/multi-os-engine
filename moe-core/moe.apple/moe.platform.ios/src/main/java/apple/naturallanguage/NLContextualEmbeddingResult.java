package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NLContextualEmbeddingResult is a class representing the embedding vectors resulting from applying a contextual
 * embedding to a given string. Each embedding vector represents a given range in the string.
 */
@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLContextualEmbeddingResult extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLContextualEmbeddingResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLContextualEmbeddingResult alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NLContextualEmbeddingResult allocWithZone(VoidPtr zone);

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
     * This method allows clients to iterate over all of the embedding vectors generated for a particular range in the
     * text.
     */
    @Generated
    @Selector("enumerateTokenVectorsInRange:usingBlock:")
    public native void enumerateTokenVectorsInRangeUsingBlock(@ByValue NSRange range,
            @ObjCBlock(name = "call_enumerateTokenVectorsInRangeUsingBlock") @NotNull Block_enumerateTokenVectorsInRangeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTokenVectorsInRangeUsingBlock {
        @Generated
        void call_enumerateTokenVectorsInRangeUsingBlock(@NotNull NSArray<? extends NSNumber> tokenVector,
                @ByValue NSRange tokenRange, @NotNull BoolPtr stop);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLContextualEmbeddingResult init();

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
    @Selector("language")
    @NotNull
    public native String language();

    @Generated
    @Owned
    @Selector("new")
    public static native NLContextualEmbeddingResult new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The number of embedding vectors which were generated.
     */
    @Generated
    @Selector("sequenceLength")
    @NUInt
    public native long sequenceLength();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("string")
    @NotNull
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("tokenVectorAtIndex:tokenRange:")
    @Nullable
    public native NSArray<? extends NSNumber> tokenVectorAtIndexTokenRange(@NUInt long characterIndex,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange tokenRange);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}