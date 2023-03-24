package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INCallRecord extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INCallRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INCallRecord alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INCallRecord allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("callCapability")
    @NInt
    public native long callCapability();

    @Nullable
    @Generated
    @Selector("callDuration")
    public native NSNumber callDuration();

    @Generated
    @Selector("callRecordType")
    @NInt
    public native long callRecordType();

    /**
     * API-Since: 11.0
     * Deprecated-Since: 14.5
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("caller")
    public native INPerson caller();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("dateCreated")
    public native NSDate dateCreated();

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

    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INCallRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native INCallRecord initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 11.0
     * Deprecated-Since: 14.5
     * Deprecated-Message: Replaced by
     * -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Generated
    @Selector("initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:")
    public native INCallRecord initWithIdentifierDateCreatedCallerCallRecordTypeCallCapabilityCallDurationUnseen(
            @NotNull String identifier, @Nullable NSDate dateCreated, @Nullable INPerson caller,
            @NInt long callRecordType, @NInt long callCapability, @Nullable NSNumber callDuration,
            @Nullable NSNumber unseen);

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
    public static native INCallRecord new_objc();

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

    @Nullable
    @Generated
    @Selector("unseen")
    public native NSNumber unseen();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.5
     * Deprecated-Message: Replaced by
     * -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Generated
    @Selector("initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    public native INCallRecord initWithIdentifierDateCreatedCallerCallRecordTypeCallCapabilityCallDurationUnseenNumberOfCalls(
            @NotNull String identifier, @Nullable NSDate dateCreated, @Nullable INPerson caller,
            @NInt long callRecordType, @NInt long callCapability, @Nullable NSNumber callDuration,
            @Nullable NSNumber unseen, @Nullable NSNumber numberOfCalls);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("numberOfCalls")
    public native NSNumber numberOfCalls();

    @Generated
    @Selector("initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:")
    public native INCallRecord initWithIdentifierDateCreatedCallRecordTypeCallCapabilityCallDurationUnseen(
            @NotNull String identifier, @Nullable NSDate dateCreated, @NInt long callRecordType,
            @NInt long callCapability, @Nullable NSNumber callDuration, @Nullable NSNumber unseen);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    public native INCallRecord initWithIdentifierDateCreatedCallRecordTypeCallCapabilityCallDurationUnseenNumberOfCalls(
            @NotNull String identifier, @Nullable NSDate dateCreated, @NInt long callRecordType,
            @NInt long callCapability, @Nullable NSNumber callDuration, @Nullable NSNumber unseen,
            @Nullable NSNumber numberOfCalls);

    /**
     * API-Since: 14.5
     */
    @Generated
    @Selector("initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked:")
    public native INCallRecord initWithIdentifierDateCreatedCallRecordTypeCallCapabilityCallDurationUnseenParticipantsNumberOfCallsIsCallerIdBlocked(
            @NotNull String identifier, @Nullable NSDate dateCreated, @NInt long callRecordType,
            @NInt long callCapability, @Nullable NSNumber callDuration, @Nullable NSNumber unseen,
            @Nullable NSArray<? extends INPerson> participants, @Nullable NSNumber numberOfCalls,
            @Nullable NSNumber isCallerIdBlocked);

    /**
     * API-Since: 14.5
     */
    @Nullable
    @Generated
    @Selector("isCallerIdBlocked")
    public native NSNumber isCallerIdBlocked();

    /**
     * API-Since: 14.5
     */
    @Nullable
    @Generated
    @Selector("participants")
    public native NSArray<? extends INPerson> participants();
}
