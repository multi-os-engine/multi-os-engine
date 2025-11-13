package apple.shazamkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object that represents the metadata for a matched reference signature.
 * 
 * To access properties for custom media items, use subscripting. For more information, see ``SHMediaItem``.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SHMatchedMediaItem extends SHMediaItem implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SHMatchedMediaItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SHMatchedMediaItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SHMatchedMediaItem allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("fetchMediaItemWithShazamID:completionHandler:")
    public static native void fetchMediaItemWithShazamIDCompletionHandler(@NotNull String shazamID,
            @NotNull @ObjCBlock(name = "call_fetchMediaItemWithShazamIDCompletionHandler") SHMediaItem.Block_fetchMediaItemWithShazamIDCompletionHandler completionHandler);

    /**
     * A multiple for the difference in frequency between the matched audio and the query audio.
     * 
     * A value of `0.0` indicates that the query and matched audio are at the same frequency. Other values indicate that
     * the query audio is playing at a different frequency. For example, if the original recording plays at `100` Hz, a
     * value of `0.05` indicates that the query recording plays at `105` Hz.
     * 
     * No match returns if the frequency skew is too large.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("frequencySkew")
    public native float frequencySkew();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SHMatchedMediaItem init();

    @Generated
    @Selector("initWithCoder:")
    public native SHMatchedMediaItem initWithCoder(@NotNull NSCoder coder);

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
     * The timecode in the reference recording that matches the start of the query, in seconds.
     * 
     * The value can be negative if the query signature contains unrecognizable data before the data that corresponds to
     * the start of the matched reference item.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("matchOffset")
    public native double matchOffset();

    @Generated
    @Selector("mediaItemWithProperties:")
    public static native SHMatchedMediaItem mediaItemWithProperties(@NotNull NSDictionary<String, ?> properties);

    @Generated
    @Owned
    @Selector("new")
    public static native SHMatchedMediaItem new_objc();

    /**
     * The updated timecode in the reference recording that matches the current playback position of the query audio, in
     * seconds.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("predictedCurrentMatchOffset")
    public native double predictedCurrentMatchOffset();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The level of confidence in the match result.
     * 
     * The value ranges from 0.0 to 1.0, where 1.0 indicates the highest level of confidence.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("confidence")
    public native float confidence();
}
