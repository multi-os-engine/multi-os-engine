package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MTRThreadOperationalDataset allows converting between an "expanded" view of
 * the dataset (with the separate fields) and a single-blob NSData view.
 * 
 * The latter can be used to pass Thread network credentials via
 * MTRCommissioningParameters.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRThreadOperationalDataset extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRThreadOperationalDataset(Pointer peer) {
        super(peer);
    }

    /**
     * The Thread PSKc
     */
    @Generated
    @Selector("PSKc")
    @NotNull
    public native NSData PSKc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRThreadOperationalDataset alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRThreadOperationalDataset allocWithZone(VoidPtr zone);

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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use channelNumber
     */
    @Generated
    @Deprecated
    @Selector("channel")
    public native char channel();

    /**
     * The Thread network channel. Always an unsigned 16-bit integer.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("channelNumber")
    @NotNull
    public native NSNumber channelNumber();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Get the underlying data that represents the Thread Active Operational Dataset
     * This can be used for the threadOperationalDataset of MTRCommissioningParameters.
     */
    @Generated
    @Selector("data")
    @NotNull
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The Thread Network extendended PAN ID
     */
    @Generated
    @Selector("extendedPANID")
    @NotNull
    public native NSData extendedPANID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRThreadOperationalDataset init();

    /**
     * Create a Thread Operational Dataset object with a RCP formatted active operational dataset.
     * This initializer will return nil if the input data cannot be parsed correctly
     */
    @Generated
    @Selector("initWithData:")
    public native MTRThreadOperationalDataset initWithData(@NotNull NSData data);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithNetworkName:extendedPANID:masterKey:PSKc:channelNumber:panID
     */
    @Generated
    @Deprecated
    @Selector("initWithNetworkName:extendedPANID:masterKey:PSKc:channel:panID:")
    public native MTRThreadOperationalDataset initWithNetworkNameExtendedPANIDMasterKeyPSKcChannelPanID(
            @NotNull String networkName, @NotNull NSData extendedPANID, @NotNull NSData masterKey, @NotNull NSData PSKc,
            char channel, @NotNull NSData panID);

    /**
     * Create a Thread Operational Dataset object with the individual network
     * fields.
     * 
     * @param extendedPANID Must be MTRSizeThreadExtendedPANID bytes. Otherwise nil
     *                      will be returned.
     * @param masterKey     Must be MTRSizeThreadMasterKey bytes. Otherwise nil will be
     *                      returned.
     * @param PSKc          Must be MTRSizeThreadPSKc bytes. Otherwise nil will be returned.
     * @param channelNumber Must be an unsigned 16-bit value.
     * @param panID         Must be MTRSizeThreadPANID bytes. Otherwise nil will be
     *                      returned. In particular, it's expected to be a 16-bit unsigned
     *                      integer stored as 2 bytes in host order.
     * 
     *                      API-Since: 16.4
     */
    @Generated
    @Selector("initWithNetworkName:extendedPANID:masterKey:PSKc:channelNumber:panID:")
    public native MTRThreadOperationalDataset initWithNetworkNameExtendedPANIDMasterKeyPSKcChannelNumberPanID(
            @NotNull String networkName, @NotNull NSData extendedPANID, @NotNull NSData masterKey, @NotNull NSData PSKc,
            @NotNull NSNumber channelNumber, @NotNull NSData panID);

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
     * The 16 byte Master Key
     */
    @Generated
    @Selector("masterKey")
    @NotNull
    public native NSData masterKey();

    /**
     * The Thread Network name
     */
    @Generated
    @Selector("networkName")
    @NotNull
    public native String networkName();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRThreadOperationalDataset new_objc();

    /**
     * A uint16_t stored as 2-bytes in host order representing the Thread PAN ID
     */
    @Generated
    @Selector("panID")
    @NotNull
    public native NSData panID();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use channelNumber
     */
    @Generated
    @Deprecated
    @Selector("setChannel:")
    public native void setChannel(char value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}