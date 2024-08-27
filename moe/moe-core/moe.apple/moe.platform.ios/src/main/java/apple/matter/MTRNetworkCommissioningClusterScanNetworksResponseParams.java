package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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

/**
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRNetworkCommissioningClusterScanNetworksResponseParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRNetworkCommissioningClusterScanNetworksResponseParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRNetworkCommissioningClusterScanNetworksResponseParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRNetworkCommissioningClusterScanNetworksResponseParams allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("debugText")
    @Nullable
    public native String debugText();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRNetworkCommissioningClusterScanNetworksResponseParams init();

    /**
     * Initialize an MTRNetworkCommissioningClusterScanNetworksResponseParams with a response-value dictionary
     * of the sort that MTRDeviceResponseHandler would receive.
     * 
     * Will return nil and hand out an error if the response-value dictionary is not
     * a command data response or is not the right command response.
     * 
     * Will return nil and hand out an error if the data response does not match the known
     * schema for this command.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTRNetworkCommissioningClusterScanNetworksResponseParams initWithResponseValueError(
            @NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("networkingStatus")
    @NotNull
    public native NSNumber networkingStatus();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRNetworkCommissioningClusterScanNetworksResponseParams new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setDebugText:")
    public native void setDebugText(@Nullable String value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setNetworkingStatus:")
    public native void setNetworkingStatus(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setThreadScanResults:")
    public native void setThreadScanResults(@Nullable NSArray<?> value);

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
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setWiFiScanResults:")
    public native void setWiFiScanResults(@Nullable NSArray<?> value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("threadScanResults")
    @Nullable
    public native NSArray<?> threadScanResults();

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
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeTimeoutMs")
    @Nullable
    public native NSNumber timedInvokeTimeoutMs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("wiFiScanResults")
    @Nullable
    public native NSArray<?> wiFiScanResults();
}