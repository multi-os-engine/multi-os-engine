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
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRScenesClusterAddSceneParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRScenesClusterAddSceneParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRScenesClusterAddSceneParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRScenesClusterAddSceneParams allocWithZone(VoidPtr zone);

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("extensionFieldSets")
    @NotNull
    public native NSArray<?> extensionFieldSets();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("groupID")
    @NotNull
    public native NSNumber groupID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use groupID
     */
    @Generated
    @Deprecated
    @Selector("groupId")
    @NotNull
    public native NSNumber groupId();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRScenesClusterAddSceneParams init();

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
    public static native MTRScenesClusterAddSceneParams new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("sceneID")
    @NotNull
    public native NSNumber sceneID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use sceneID
     */
    @Generated
    @Deprecated
    @Selector("sceneId")
    @NotNull
    public native NSNumber sceneId();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("sceneName")
    @NotNull
    public native String sceneName();

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("setExtensionFieldSets:")
    public native void setExtensionFieldSets(@NotNull NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setGroupID:")
    public native void setGroupID(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use groupID
     */
    @Generated
    @Deprecated
    @Selector("setGroupId:")
    public native void setGroupId(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setSceneID:")
    public native void setSceneID(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use sceneID
     */
    @Generated
    @Deprecated
    @Selector("setSceneId:")
    public native void setSceneId(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setSceneName:")
    public native void setSceneName(@NotNull String value);

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("setTransitionTime:")
    public native void setTransitionTime(@NotNull NSNumber value);

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("transitionTime")
    @NotNull
    public native NSNumber transitionTime();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}