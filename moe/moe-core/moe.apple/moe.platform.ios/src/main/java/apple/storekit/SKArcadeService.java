package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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

@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKArcadeService extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKArcadeService(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKArcadeService alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKArcadeService allocWithZone(VoidPtr zone);

    @Generated
    @Selector("arcadeSubscriptionStatusWithNonce:resultHandler:")
    public static native void arcadeSubscriptionStatusWithNonceResultHandler(long nonce,
            @ObjCBlock(name = "call_arcadeSubscriptionStatusWithNonceResultHandler") Block_arcadeSubscriptionStatusWithNonceResultHandler resultHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_arcadeSubscriptionStatusWithNonceResultHandler {
        @Generated
        void call_arcadeSubscriptionStatusWithNonceResultHandler(NSData subscriptionStatus,
                int subscriptionStatusLength, NSData cmacOfNonce, int cmacOfNonceLength, NSError error);
    }

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
    @Selector("init")
    public native SKArcadeService init();

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
    public static native SKArcadeService new_objc();

    @Generated
    @Selector("registerArcadeAppWithRandomFromLib:randomFromLibLength:resultHandler:")
    public static native void registerArcadeAppWithRandomFromLibRandomFromLibLengthResultHandler(NSData randomFromLib,
            int randomFromLibLength,
            @ObjCBlock(name = "call_registerArcadeAppWithRandomFromLibRandomFromLibLengthResultHandler") Block_registerArcadeAppWithRandomFromLibRandomFromLibLengthResultHandler resultHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerArcadeAppWithRandomFromLibRandomFromLibLengthResultHandler {
        @Generated
        void call_registerArcadeAppWithRandomFromLibRandomFromLibLengthResultHandler(NSData randomFromFP,
                int randomFromFPLength, NSData cmacOfAppPID, int cmacOfAppPIDLength, NSError error);
    }

    @Generated
    @Selector("repairArcadeApp")
    public static native void repairArcadeApp();

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
