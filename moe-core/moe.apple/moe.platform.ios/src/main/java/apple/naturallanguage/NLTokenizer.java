package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import apple.foundation.struct.NSRange;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLTokenizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLTokenizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLTokenizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLTokenizer allocWithZone(VoidPtr zone);

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
     * The tokenizer will segment the string as needed into tokens for the given unit, and return those ranges via a
     * block iterator, that iterates over all tokens intersecting a given range, supplying token ranges and flags. The
     * range passed in must not extend beyond the end of the tokenizer's string, or the method will raise an exception.
     * Note that a given instance of NLTokenizer should not be used from more than one thread simultaneously.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("enumerateTokensInRange:usingBlock:")
    public native void enumerateTokensInRangeUsingBlock(@ByValue NSRange range,
            @NotNull @ObjCBlock(name = "call_enumerateTokensInRangeUsingBlock") Block_enumerateTokensInRangeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTokensInRangeUsingBlock {
        @Generated
        void call_enumerateTokensInRangeUsingBlock(@ByValue NSRange tokenRange, @NUInt long flags,
                @NotNull BoolPtr stop);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLTokenizer init();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithUnit:")
    public native NLTokenizer initWithUnit(@NInt long unit);

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
    public static native NLTokenizer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Clients may specify the language of the string, if it is known; otherwise it will be determined from the text.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setLanguage:")
    public native void setLanguage(@NotNull String language);

    /**
     * An NLTokenizer instance must be assigned a string to tokenize, and clients can then obtain ranges for tokens in
     * that string appropriate to the tokenizer's unit.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setString:")
    public native void setString(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An NLTokenizer instance must be assigned a string to tokenize, and clients can then obtain ranges for tokens in
     * that string appropriate to the tokenizer's unit.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns the range corresponding to the token for the tokenizer's unit that contains the given character index.
     * The index must not extend beyond the end of the tokenizer's string, or the method will raise an exception.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("tokenRangeAtIndex:")
    @ByValue
    public native NSRange tokenRangeAtIndex(@NUInt long characterIndex);

    /**
     * Returns the ranges corresponding to the tokens for the tokenizer's unit that intersect the given range.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("tokensForRange:")
    public native NSArray<? extends NSValue> tokensForRange(@ByValue NSRange range);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("unit")
    @NInt
    public native long unit();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the smallest range covering all tokens for the tokenizer's unit intersecting the given range. If
     * range.length == 0, this is equivalent to tokenRangeAtIndex:.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("tokenRangeForRange:")
    @ByValue
    public native NSRange tokenRangeForRange(@ByValue NSRange range);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
