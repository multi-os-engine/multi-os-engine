package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NLGazetteer is a class representing an efficient probabilistic representation for assigning labels to a set of
 * strings.
 */
@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLGazetteer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLGazetteer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLGazetteer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLGazetteer allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("gazetteerWithContentsOfURL:error:")
    public static native NLGazetteer gazetteerWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLGazetteer init();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native NLGazetteer initWithContentsOfURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithData:error:")
    public native NLGazetteer initWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithDictionary:language:error:")
    public native NLGazetteer initWithDictionaryLanguageError(
            @NotNull NSDictionary<String, ? extends NSArray<String>> dictionary, @Nullable String language,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("labelForString:")
    public native String labelForString(@NotNull String string);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("language")
    public native String language();

    @Generated
    @Owned
    @Selector("new")
    public static native NLGazetteer new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("writeGazetteerForDictionary:language:toURL:error:")
    public static native boolean writeGazetteerForDictionaryLanguageToURLError(
            @NotNull NSDictionary<String, ? extends NSArray<String>> dictionary, @Nullable String language,
            @NotNull NSURL url, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
