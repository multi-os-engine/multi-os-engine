package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Represents how one feels, including descriptors of a feeling and optionally, its source.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKStateOfMind extends HKSample implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKStateOfMind(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKStateOfMind alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKStateOfMind allocWithZone(VoidPtr zone);

    /**
     * HKStateOfMindAssociation
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("associations")
    @NotNull
    public native NSArray<? extends NSNumber> associations();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKStateOfMind init();

    @Generated
    @Selector("initWithCoder:")
    public native HKStateOfMind initWithCoder(@NotNull NSCoder coder);

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

    /**
     * A description of the kind of feeling type captured by this state of mind.
     * 
     * Feeling types can be understood by the timeframe considered to create this log, possibly indicated by the context
     * used to create it.
     * For example, a `momentary emotion` log might be in response to 'how are you feeling right now?' while a `daily
     * mood` log
     * might be in response to 'how have you been feeling today?'.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("kind")
    @NInt
    public native long kind();

    /**
     * HKStateOfMindLabel
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("labels")
    @NotNull
    public native NSArray<? extends NSNumber> labels();

    @Generated
    @Owned
    @Selector("new")
    public static native HKStateOfMind new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Creates a new log describing an experienced emotion at a moment in time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stateOfMindWithDate:kind:valence:labels:associations:")
    public static native HKStateOfMind stateOfMindWithDateKindValenceLabelsAssociations(@NotNull NSDate date,
            @NInt long kind, double valence, @NotNull NSArray<? extends NSNumber> labels,
            @NotNull NSArray<? extends NSNumber> associations);

    /**
     * Creates a new log describing an experienced emotion at a moment in time.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stateOfMindWithDate:kind:valence:labels:associations:metadata:")
    public static native HKStateOfMind stateOfMindWithDateKindValenceLabelsAssociationsMetadata(@NotNull NSDate date,
            @NInt long kind, double valence, @NotNull NSArray<? extends NSNumber> labels,
            @NotNull NSArray<? extends NSNumber> associations, @Nullable NSDictionary<String, ?> metadata);

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

    /**
     * A signed, self-reported measure of how positive or negative one is feeling, on a continuous scale from -1 to +1.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("valence")
    public native double valence();

    /**
     * A general region of pleasantness based on this sample's valence value.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("valenceClassification")
    @NInt
    public native long valenceClassification();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}