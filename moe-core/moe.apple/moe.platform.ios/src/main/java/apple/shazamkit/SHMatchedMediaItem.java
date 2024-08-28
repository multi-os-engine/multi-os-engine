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
 * [@c] SHMatchedMediaItem represents metadata that has been matched against a @c SHCatalog
 * 
 * Extra information is presented that can only be generated from a match. The properties provided here
 * that are not available on @c SHMediaItem are ephemeral and can differ each time there is a match of the @c
 * SHSignature that this
 * object represents
 * 
 * [@note] @c SHMatchedMediaItem is not intended to be subclassed
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
     * The frequency difference between the reference and sample audio
     * 
     * A value of 0.0 indicates the matched audio at the original frequency,
     * a value of 0.1 indicates 100hz is now 110hz
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
     * The difference between the start of the reference audio and the start of the sample audio
     * [@note] This value can be negative if the source audio starts before the reference audio
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
     * The auto updating playback position in the reference signature
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
}
