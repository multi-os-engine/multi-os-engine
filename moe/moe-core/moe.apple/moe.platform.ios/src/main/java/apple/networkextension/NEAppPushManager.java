package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.networkextension.protocol.NEAppPushDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppPushManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppPushManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppPushManager alloc();

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NEAppPushDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEAppPushManager init();

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
    @Selector("isActive")
    public native boolean isActive();

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("loadAllFromPreferencesWithCompletionHandler:")
    public static native void loadAllFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadAllFromPreferencesWithCompletionHandler") Block_loadAllFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAllFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadAllFromPreferencesWithCompletionHandler(NSArray<? extends NEAppPushManager> managers,
                NSError error);
    }

    @Generated
    @Selector("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_loadFromPreferencesWithCompletionHandler") Block_loadFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadFromPreferencesWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Selector("matchSSIDs")
    public native NSArray<String> matchSSIDs();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("providerBundleIdentifier")
    public native String providerBundleIdentifier();

    @Generated
    @Selector("providerConfiguration")
    public native NSDictionary<String, ?> providerConfiguration();

    @Generated
    @Selector("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_removeFromPreferencesWithCompletionHandler") Block_removeFromPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFromPreferencesWithCompletionHandler {
        @Generated
        void call_removeFromPreferencesWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferencesWithCompletionHandler(
            @ObjCBlock(name = "call_saveToPreferencesWithCompletionHandler") Block_saveToPreferencesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToPreferencesWithCompletionHandler {
        @Generated
        void call_saveToPreferencesWithCompletionHandler(NSError error);
    }

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NEAppPushDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NEAppPushDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    @Generated
    @Selector("setMatchSSIDs:")
    public native void setMatchSSIDs(NSArray<String> value);

    @Generated
    @Selector("setProviderBundleIdentifier:")
    public native void setProviderBundleIdentifier(String value);

    @Generated
    @Selector("setProviderConfiguration:")
    public native void setProviderConfiguration(NSDictionary<String, ?> value);

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