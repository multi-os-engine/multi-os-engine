package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("announcementReason")
    @NotNull
    public native NSNumber announcementReason();

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("endpoint")
    @NotNull
    public native NSNumber endpoint();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams init();

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("metadataForNode")
    @Nullable
    public native NSData metadataForNode();

    @Generated
    @Owned
    @Selector("new")
    public static native MTROTASoftwareUpdateRequestorClusterAnnounceOTAProviderParams new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("providerNodeID")
    @NotNull
    public native NSNumber providerNodeID();

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use providerNodeID
     */
    @Generated
    @Deprecated
    @Selector("providerNodeId")
    @NotNull
    public native NSNumber providerNodeId();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Controls how much time, in seconds, we will allow for the server to process the command.
     * 
     * The command will then time out if that much time, plus an allowance for retransmits due to network failures,
     * passes.
     * 
     * If nil, the framework will try to select an appropriate timeout value itself.
     */
    @Generated
    @Selector("serverSideProcessingTimeout")
    @Nullable
    public native NSNumber serverSideProcessingTimeout();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setAnnouncementReason:")
    public native void setAnnouncementReason(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setEndpoint:")
    public native void setEndpoint(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setMetadataForNode:")
    public native void setMetadataForNode(@Nullable NSData value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setProviderNodeID:")
    public native void setProviderNodeID(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use providerNodeID
     */
    @Generated
    @Deprecated
    @Selector("setProviderNodeId:")
    public native void setProviderNodeId(@NotNull NSNumber value);

    /**
     * Controls how much time, in seconds, we will allow for the server to process the command.
     * 
     * The command will then time out if that much time, plus an allowance for retransmits due to network failures,
     * passes.
     * 
     * If nil, the framework will try to select an appropriate timeout value itself.
     */
    @Generated
    @Selector("setServerSideProcessingTimeout:")
    public native void setServerSideProcessingTimeout(@Nullable NSNumber value);

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     */
    @Generated
    @Selector("setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("setVendorId:")
    public native void setVendorId(@NotNull NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     */
    @Generated
    @Selector("timedInvokeTimeoutMs")
    @Nullable
    public native NSNumber timedInvokeTimeoutMs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("vendorId")
    @NotNull
    public native NSNumber vendorId();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}