package apple.cryptotokenkit;

import apple.NSObject;
import apple.cryptotokenkit.protocol.TKSmartCardUserInteractionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * Represents handle to a user interaction involving the SmartCard reader.
 * 
 * It is a proxy object obtained as a result of invoking the userInteractionFor*** family of methods in TKSmartCardSlot
 * and TKSmartCard.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardUserInteraction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardUserInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardUserInteraction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardUserInteraction allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Attempts to cancel a running interaction. Note that for some interactions, this functionality might not be
     * available.
     * 
     * @return Returns NO if the operation is not running, or cancelling is not supported.
     */
    @Generated
    @Selector("cancel")
    public native boolean cancel();

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

    /**
     * Delegate for state observing of the interaction.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native TKSmartCardUserInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKSmartCardUserInteraction init();

    /**
     * Initial interaction timeout. If set to 0, the reader-defined default timeout is used.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("initialTimeout")
    public native double initialTimeout();

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

    /**
     * Timeout after the first key stroke. If set to 0, the reader-defined default timeout is used.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("interactionTimeout")
    public native double interactionTimeout();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native TKSmartCardUserInteraction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Runs the interaction.
     */
    @Generated
    @Selector("runWithReply:")
    public native void runWithReply(@ObjCBlock(name = "call_runWithReply") Block_runWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runWithReply {
        @Generated
        void call_runWithReply(boolean success, NSError error);
    }

    /**
     * Delegate for state observing of the interaction.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) TKSmartCardUserInteractionDelegate value);

    /**
     * Delegate for state observing of the interaction.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) TKSmartCardUserInteractionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Initial interaction timeout. If set to 0, the reader-defined default timeout is used.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("setInitialTimeout:")
    public native void setInitialTimeout(double value);

    /**
     * Timeout after the first key stroke. If set to 0, the reader-defined default timeout is used.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("setInteractionTimeout:")
    public native void setInteractionTimeout(double value);

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
