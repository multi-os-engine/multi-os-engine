package apple.coremidi;

import apple.NSObject;
import apple.coremidi.struct.MIDICIDeviceIdentification;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDICISession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDICISession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDICISession alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("deviceIdentification")
    @ByValue
    public native MIDICIDeviceIdentification deviceIdentification();

    @Generated
    @Selector("disableProfile:onChannel:error:")
    public native boolean disableProfileOnChannelError(MIDICIProfile profile, byte channel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("enableProfile:onChannel:error:")
    public native boolean enableProfileOnChannelError(MIDICIProfile profile, byte channel,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("entity")
    public native int entity();

    @Generated
    @Selector("getProperty:onChannel:responseHandler:")
    public native void getPropertyOnChannelResponseHandler(NSData inquiry, byte channel,
            @ObjCBlock(name = "call_getPropertyOnChannelResponseHandler") Block_getPropertyOnChannelResponseHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPropertyOnChannelResponseHandler {
        @Generated
        void call_getPropertyOnChannelResponseHandler(MIDICISession arg0, byte arg1, NSData arg2, NSError arg3);
    }

    @Generated
    @Selector("hasProperty:onChannel:responseHandler:")
    public native void hasPropertyOnChannelResponseHandler(NSData inquiry, byte channel,
            @ObjCBlock(name = "call_hasPropertyOnChannelResponseHandler") Block_hasPropertyOnChannelResponseHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_hasPropertyOnChannelResponseHandler {
        @Generated
        void call_hasPropertyOnChannelResponseHandler(MIDICISession arg0, byte arg1, NSData arg2, NSError arg3);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDICISession init();

    @Generated
    @Selector("initWithMIDIEntity:dataReadyHandler:")
    public native MIDICISession initWithMIDIEntityDataReadyHandler(int entity,
            @ObjCBlock(name = "call_initWithMIDIEntityDataReadyHandler") Block_initWithMIDIEntityDataReadyHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithMIDIEntityDataReadyHandler {
        @Generated
        void call_initWithMIDIEntityDataReadyHandler();
    }

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("profileChangedCallback")
    @ObjCBlock(name = "call_profileChangedCallback_ret")
    public native Block_profileChangedCallback_ret profileChangedCallback();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_profileChangedCallback_ret {
        @Generated
        void call_profileChangedCallback_ret(MIDICISession arg0, byte arg1, MIDICIProfile arg2, boolean arg3);
    }

    @Generated
    @Selector("profileStateForChannel:")
    public native MIDICIProfileState profileStateForChannel(byte channel);

    @Generated
    @Selector("propertyChangedCallback")
    @ObjCBlock(name = "call_propertyChangedCallback_ret")
    public native Block_propertyChangedCallback_ret propertyChangedCallback();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_propertyChangedCallback_ret {
        @Generated
        void call_propertyChangedCallback_ret(MIDICISession arg0, byte arg1, NSData arg2);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setProfileChangedCallback:")
    public native void setProfileChangedCallback(
            @ObjCBlock(name = "call_setProfileChangedCallback") Block_setProfileChangedCallback value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProfileChangedCallback {
        @Generated
        void call_setProfileChangedCallback(MIDICISession arg0, byte arg1, MIDICIProfile arg2, boolean arg3);
    }

    @Generated
    @Selector("setProperty:onChannel:responseHandler:")
    public native void setPropertyOnChannelResponseHandler(NSData inquiry, byte channel,
            @ObjCBlock(name = "call_setPropertyOnChannelResponseHandler") Block_setPropertyOnChannelResponseHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPropertyOnChannelResponseHandler {
        @Generated
        void call_setPropertyOnChannelResponseHandler(MIDICISession arg0, byte arg1, NSData arg2, NSError arg3);
    }

    @Generated
    @Selector("setPropertyChangedCallback:")
    public native void setPropertyChangedCallback(
            @ObjCBlock(name = "call_setPropertyChangedCallback") Block_setPropertyChangedCallback value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPropertyChangedCallback {
        @Generated
        void call_setPropertyChangedCallback(MIDICISession arg0, byte arg1, NSData arg2);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsProfileCapability")
    public native boolean supportsProfileCapability();

    @Generated
    @Selector("supportsPropertyCapability")
    public native boolean supportsPropertyCapability();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}