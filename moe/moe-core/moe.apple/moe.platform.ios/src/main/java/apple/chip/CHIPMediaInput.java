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
 * Cluster Media Input
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPMediaInput extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPMediaInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPMediaInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPMediaInput allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("hideInputStatus:")
    public native void hideInputStatus(@ObjCBlock(name = "call_hideInputStatus") Block_hideInputStatus responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_hideInputStatus {
        @Generated
        void call_hideInputStatus(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("init")
    public native CHIPMediaInput init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPMediaInput initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native CHIPMediaInput new_objc();

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
    @Selector("readAttributeMediaInputListWithResponseHandler:")
    public native void readAttributeMediaInputListWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMediaInputListWithResponseHandler") Block_readAttributeMediaInputListWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMediaInputListWithResponseHandler {
        @Generated
        void call_readAttributeMediaInputListWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("renameInput:name:responseHandler:")
    public native void renameInputNameResponseHandler(byte index, String name,
            @ObjCBlock(name = "call_renameInputNameResponseHandler") Block_renameInputNameResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renameInputNameResponseHandler {
        @Generated
        void call_renameInputNameResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("selectInput:responseHandler:")
    public native void selectInputResponseHandler(byte index,
            @ObjCBlock(name = "call_selectInputResponseHandler") Block_selectInputResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectInputResponseHandler {
        @Generated
        void call_selectInputResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("showInputStatus:")
    public native void showInputStatus(@ObjCBlock(name = "call_showInputStatus") Block_showInputStatus responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_showInputStatus {
        @Generated
        void call_showInputStatus(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("readAttributeCurrentMediaInputWithResponseHandler:")
    public native void readAttributeCurrentMediaInputWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentMediaInputWithResponseHandler") Block_readAttributeCurrentMediaInputWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentMediaInputWithResponseHandler {
        @Generated
        void call_readAttributeCurrentMediaInputWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
