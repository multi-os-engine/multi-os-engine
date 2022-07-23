package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSExtensionRequestHandling;
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

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMMatterRequestHandler extends NSObject implements NSExtensionRequestHandling {
    static {
        NatJ.register();
    }

    @Generated
    protected HMMatterRequestHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMMatterRequestHandler alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HMMatterRequestHandler allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginRequestWithExtensionContext:")
    public native void beginRequestWithExtensionContext(NSExtensionContext context);

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

    /**
     * When this method is invoked, configure the accessory with user selected attributes.
     *
     * @param accessoryName The user given name for the accessory.
     * @param accessoryRoom The user selected room for the accessory.
     * @param completion    Invoke the completion handler with an optional error after configuration.
     */
    @Generated
    @Selector("configureAccessoryWithName:room:completion:")
    public native void configureAccessoryWithNameRoomCompletion(String accessoryName, HMMatterRoom accessoryRoom,
            @ObjCBlock(name = "call_configureAccessoryWithNameRoomCompletion") Block_configureAccessoryWithNameRoomCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAccessoryWithNameRoomCompletion {
        @Generated
        void call_configureAccessoryWithNameRoomCompletion(NSError arg0);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Use this method to vend the rooms that correspond to a given home to accessory setup. iOS will issue this request
     * before presenting the "Select Room" card.
     *
     * @param home       The home for which iOS is requesting rooms.
     * @param completion Invoke the completion block with the requested rooms or an optional error.
     */
    @Generated
    @Selector("fetchRoomsInHome:completion:")
    public native void fetchRoomsInHomeCompletion(HMMatterHome home,
            @ObjCBlock(name = "call_fetchRoomsInHomeCompletion") Block_fetchRoomsInHomeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRoomsInHomeCompletion {
        @Generated
        void call_fetchRoomsInHomeCompletion(NSArray<? extends HMMatterRoom> arg0, NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HMMatterRequestHandler init();

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
    public static native HMMatterRequestHandler new_objc();

    /**
     * When this method is invoked, pair with the given accessory payload.
     *
     * @param onboardingPayload The onboarding payload your CHIP stack will use to pair with the accessory.
     * @param completion        Invoke the completion handler with an optional error after pairing.
     */
    @Generated
    @Selector("pairAccessoryInHome:onboardingPayload:completion:")
    public native void pairAccessoryInHomeOnboardingPayloadCompletion(HMMatterHome home, String onboardingPayload,
            @ObjCBlock(name = "call_pairAccessoryInHomeOnboardingPayloadCompletion") Block_pairAccessoryInHomeOnboardingPayloadCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pairAccessoryInHomeOnboardingPayloadCompletion {
        @Generated
        void call_pairAccessoryInHomeOnboardingPayloadCompletion(NSError arg0);
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
}
