package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Groups
 * Attributes and commands for group configuration and manipulation.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterGroups extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterGroups(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addGroupIfIdentifyingWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupsClusterAddGroupIfIdentifyingParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use addGroupIfIdentifyingWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addGroupIfIdentifyingWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupsClusterAddGroupIfIdentifyingParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addGroupIfIdentifyingWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addGroupWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupsClusterAddGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupsClusterAddGroupResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use addGroupWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addGroupWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupsClusterAddGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupsClusterAddGroupResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterGroups alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterGroups allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getGroupMembershipWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupsClusterGetGroupMembershipParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupsClusterGetGroupMembershipResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getGroupMembershipWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getGroupMembershipWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupsClusterGetGroupMembershipParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getGroupMembershipWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupsClusterGetGroupMembershipResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterGroups init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterGroups initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterGroups initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterGroups new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNameSupportWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNameSupportWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeAllGroupsWithExpectedValues:expectedValueInterval:completion:")
    public native void removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeAllGroupsWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeAllGroupsWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeAllGroupsWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeAllGroupsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRGroupsClusterRemoveAllGroupsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeAllGroupsWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeAllGroupsWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRGroupsClusterRemoveAllGroupsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeAllGroupsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeGroupWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupsClusterRemoveGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupsClusterRemoveGroupResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeGroupWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeGroupWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupsClusterRemoveGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupsClusterRemoveGroupResponseParams data, @Nullable NSError error);
    }

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("viewGroupWithParams:expectedValues:expectedValueInterval:completion:")
    public native void viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGroupsClusterViewGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRGroupsClusterViewGroupResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use viewGroupWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("viewGroupWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGroupsClusterViewGroupParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_viewGroupWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRGroupsClusterViewGroupResponseParams data, @Nullable NSError error);
    }
}