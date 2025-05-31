package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRChannelClusterProgramStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRChannelClusterProgramStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRChannelClusterProgramStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRChannelClusterProgramStruct allocWithZone(VoidPtr zone);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("audioLanguages")
    @Nullable
    public native NSArray<?> audioLanguages();

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

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("castList")
    @Nullable
    public native NSArray<?> castList();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("categoryList")
    @Nullable
    public native NSArray<?> categoryList();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("channel")
    @NotNull
    public native MTRChannelClusterChannelInfoStruct channel();

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("descriptionString")
    @Nullable
    public native String descriptionString();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("endTime")
    @NotNull
    public native NSNumber endTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    @Generated
    @Selector("init")
    public native MTRChannelClusterProgramStruct init();

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
    public static native MTRChannelClusterProgramStruct new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("parentalGuidanceText")
    @Nullable
    public native String parentalGuidanceText();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("ratings")
    @Nullable
    public native NSArray<?> ratings();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("recordingFlag")
    @Nullable
    public native NSNumber recordingFlag();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("releaseDate")
    @Nullable
    public native String releaseDate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("seriesInfo")
    @Nullable
    public native MTRChannelClusterSeriesInfoStruct seriesInfo();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setAudioLanguages:")
    public native void setAudioLanguages(@Nullable NSArray<?> value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setCastList:")
    public native void setCastList(@Nullable NSArray<?> value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setCategoryList:")
    public native void setCategoryList(@Nullable NSArray<?> value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setChannel:")
    public native void setChannel(@NotNull MTRChannelClusterChannelInfoStruct value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDescriptionString:")
    public native void setDescriptionString(@Nullable String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setEndTime:")
    public native void setEndTime(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setParentalGuidanceText:")
    public native void setParentalGuidanceText(@Nullable String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setRatings:")
    public native void setRatings(@Nullable NSArray<?> value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setRecordingFlag:")
    public native void setRecordingFlag(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setReleaseDate:")
    public native void setReleaseDate(@Nullable String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSeriesInfo:")
    public native void setSeriesInfo(@Nullable MTRChannelClusterSeriesInfoStruct value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setStartTime:")
    public native void setStartTime(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("startTime")
    @NotNull
    public native NSNumber startTime();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subtitle")
    @Nullable
    public native String subtitle();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}