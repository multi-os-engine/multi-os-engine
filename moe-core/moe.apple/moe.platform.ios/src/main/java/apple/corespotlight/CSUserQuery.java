package apple.corespotlight;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSUserQuery extends CSSearchQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected CSUserQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSUserQuery alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CSUserQuery allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancel")
    public native void cancel();

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
     * The query will update the count before each foundSuggestionsHandler invocation to reflect
     * the number of suggestions found so far; if foundSuggestionsHandler is nil then the count will be zero.
     */
    @Generated
    @Selector("foundSuggestionCount")
    @NInt
    public native long foundSuggestionCount();

    /**
     * The foundSuggestionsHandler may be invoked additional times as new suggestions are generated,
     * but the value will always be a complete, ordered list. The query serializes all the foundSuggestionsHandler
     * invocations. If no handler is set, suggestions will not be generated.
     */
    @Nullable
    @Generated
    @Selector("foundSuggestionsHandler")
    @ObjCBlock(name = "call_foundSuggestionsHandler_ret")
    public native Block_foundSuggestionsHandler_ret foundSuggestionsHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_foundSuggestionsHandler_ret {
        @Generated
        void call_foundSuggestionsHandler_ret(@NotNull NSArray<? extends CSSuggestion> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CSUserQuery init();

    @Generated
    @Selector("initWithQueryString:attributes:")
    public native CSUserQuery initWithQueryStringAttributes(@NotNull String queryString,
            @Nullable NSArray<String> attributes);

    @Generated
    @Selector("initWithQueryString:queryContext:")
    public native CSUserQuery initWithQueryStringQueryContext(@NotNull String queryString,
            @Nullable CSSearchQueryContext queryContext);

    @Generated
    @Selector("initWithUserQueryString:userQueryContext:")
    public native CSUserQuery initWithUserQueryStringUserQueryContext(@Nullable String userQueryString,
            @Nullable CSUserQueryContext userQueryContext);

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
    public static native CSUserQuery new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The foundSuggestionsHandler may be invoked additional times as new suggestions are generated,
     * but the value will always be a complete, ordered list. The query serializes all the foundSuggestionsHandler
     * invocations. If no handler is set, suggestions will not be generated.
     */
    @Generated
    @Selector("setFoundSuggestionsHandler:")
    public native void setFoundSuggestionsHandler(
            @Nullable @ObjCBlock(name = "call_setFoundSuggestionsHandler") Block_setFoundSuggestionsHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFoundSuggestionsHandler {
        @Generated
        void call_setFoundSuggestionsHandler(@NotNull NSArray<? extends CSSuggestion> arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("start")
    public native void start();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}