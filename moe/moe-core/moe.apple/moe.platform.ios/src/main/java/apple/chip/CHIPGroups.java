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
 * Cluster Groups
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPGroups extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPGroups(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addGroup:groupName:responseHandler:")
    public native void addGroupGroupNameResponseHandler(char groupId, String groupName,
            @ObjCBlock(name = "call_addGroupGroupNameResponseHandler") Block_addGroupGroupNameResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupGroupNameResponseHandler {
        @Generated
        void call_addGroupGroupNameResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("addGroupIfIdentifying:groupName:responseHandler:")
    public native void addGroupIfIdentifyingGroupNameResponseHandler(char groupId, String groupName,
            @ObjCBlock(name = "call_addGroupIfIdentifyingGroupNameResponseHandler") Block_addGroupIfIdentifyingGroupNameResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addGroupIfIdentifyingGroupNameResponseHandler {
        @Generated
        void call_addGroupIfIdentifyingGroupNameResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPGroups alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CHIPGroups allocWithZone(VoidPtr zone);

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
    @Selector("getGroupMembership:groupList:responseHandler:")
    public native void getGroupMembershipGroupListResponseHandler(byte groupCount, char groupList,
            @ObjCBlock(name = "call_getGroupMembershipGroupListResponseHandler") Block_getGroupMembershipGroupListResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getGroupMembershipGroupListResponseHandler {
        @Generated
        void call_getGroupMembershipGroupListResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPGroups init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPGroups initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    public static native CHIPGroups new_objc();

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
    @Selector("removeAllGroups:")
    public native void removeAllGroups(@ObjCBlock(name = "call_removeAllGroups") Block_removeAllGroups responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllGroups {
        @Generated
        void call_removeAllGroups(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("removeGroup:responseHandler:")
    public native void removeGroupResponseHandler(char groupId,
            @ObjCBlock(name = "call_removeGroupResponseHandler") Block_removeGroupResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeGroupResponseHandler {
        @Generated
        void call_removeGroupResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("viewGroup:responseHandler:")
    public native void viewGroupResponseHandler(char groupId,
            @ObjCBlock(name = "call_viewGroupResponseHandler") Block_viewGroupResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewGroupResponseHandler {
        @Generated
        void call_viewGroupResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
