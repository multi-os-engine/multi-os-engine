package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * Cluster Scenes
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPScenes extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPScenes(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addScene:sceneId:transitionTime:sceneName:clusterId:length:value:responseHandler:")
    public native void addSceneSceneIdTransitionTimeSceneNameClusterIdLengthValueResponseHandler(char groupId,
            byte sceneId, char transitionTime, String sceneName, int clusterId, byte length, byte value,
            @ObjCBlock(name = "call_addSceneSceneIdTransitionTimeSceneNameClusterIdLengthValueResponseHandler") Block_addSceneSceneIdTransitionTimeSceneNameClusterIdLengthValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addSceneSceneIdTransitionTimeSceneNameClusterIdLengthValueResponseHandler {
        @Generated
        void call_addSceneSceneIdTransitionTimeSceneNameClusterIdLengthValueResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPScenes alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPScenes allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
    @Selector("getSceneMembership:responseHandler:")
    public native void getSceneMembershipResponseHandler(char groupId,
            @ObjCBlock(name = "call_getSceneMembershipResponseHandler") Block_getSceneMembershipResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSceneMembershipResponseHandler {
        @Generated
        void call_getSceneMembershipResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPScenes init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPScenes initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPScenes new_objc();

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentGroupWithResponseHandler:")
    public native void readAttributeCurrentGroupWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentGroupWithResponseHandler") Block_readAttributeCurrentGroupWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentGroupWithResponseHandler {
        @Generated
        void call_readAttributeCurrentGroupWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentSceneWithResponseHandler:")
    public native void readAttributeCurrentSceneWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentSceneWithResponseHandler") Block_readAttributeCurrentSceneWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSceneWithResponseHandler {
        @Generated
        void call_readAttributeCurrentSceneWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNameSupportWithResponseHandler:")
    public native void readAttributeNameSupportWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNameSupportWithResponseHandler") Block_readAttributeNameSupportWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNameSupportWithResponseHandler {
        @Generated
        void call_readAttributeNameSupportWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSceneCountWithResponseHandler:")
    public native void readAttributeSceneCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSceneCountWithResponseHandler") Block_readAttributeSceneCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSceneCountWithResponseHandler {
        @Generated
        void call_readAttributeSceneCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSceneValidWithResponseHandler:")
    public native void readAttributeSceneValidWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSceneValidWithResponseHandler") Block_readAttributeSceneValidWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSceneValidWithResponseHandler {
        @Generated
        void call_readAttributeSceneValidWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("recallScene:sceneId:transitionTime:responseHandler:")
    public native void recallSceneSceneIdTransitionTimeResponseHandler(char groupId, byte sceneId, char transitionTime,
            @ObjCBlock(name = "call_recallSceneSceneIdTransitionTimeResponseHandler") Block_recallSceneSceneIdTransitionTimeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recallSceneSceneIdTransitionTimeResponseHandler {
        @Generated
        void call_recallSceneSceneIdTransitionTimeResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("removeAllScenes:responseHandler:")
    public native void removeAllScenesResponseHandler(char groupId,
            @ObjCBlock(name = "call_removeAllScenesResponseHandler") Block_removeAllScenesResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllScenesResponseHandler {
        @Generated
        void call_removeAllScenesResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("removeScene:sceneId:responseHandler:")
    public native void removeSceneSceneIdResponseHandler(char groupId, byte sceneId,
            @ObjCBlock(name = "call_removeSceneSceneIdResponseHandler") Block_removeSceneSceneIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeSceneSceneIdResponseHandler {
        @Generated
        void call_removeSceneSceneIdResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("storeScene:sceneId:responseHandler:")
    public native void storeSceneSceneIdResponseHandler(char groupId, byte sceneId,
            @ObjCBlock(name = "call_storeSceneSceneIdResponseHandler") Block_storeSceneSceneIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_storeSceneSceneIdResponseHandler {
        @Generated
        void call_storeSceneSceneIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("viewScene:sceneId:responseHandler:")
    public native void viewSceneSceneIdResponseHandler(char groupId, byte sceneId,
            @ObjCBlock(name = "call_viewSceneSceneIdResponseHandler") Block_viewSceneSceneIdResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewSceneSceneIdResponseHandler {
        @Generated
        void call_viewSceneSceneIdResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
