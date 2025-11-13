package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
import apple.foundation.NSXPCConnection;
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
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRXPCDeviceControllerParameters extends MTRDeviceControllerAbstractParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRXPCDeviceControllerParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRXPCDeviceControllerParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRXPCDeviceControllerParameters allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRXPCDeviceControllerParameters init();

    /**
     * API-Since: 18.2
     * Deprecated-Since: 26.0
     * Deprecated-Message: Please use initWithXPCConnectionBlock:uniqueIdentifier:
     */
    @Deprecated
    @Generated
    @Selector("initWithXPConnectionBlock:uniqueIdentifier:")
    public native MTRXPCDeviceControllerParameters initWithXPConnectionBlockUniqueIdentifier(
            @ObjCBlock(name = "call_initWithXPConnectionBlockUniqueIdentifier") @NotNull Block_initWithXPConnectionBlockUniqueIdentifier xpcConnectionBlock,
            @NotNull NSUUID uniqueIdentifier);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithXPConnectionBlockUniqueIdentifier {
        @Generated
        @NotNull
        NSXPCConnection call_initWithXPConnectionBlockUniqueIdentifier();
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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRXPCDeviceControllerParameters new_objc();

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

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("uniqueIdentifier")
    @NotNull
    public native NSUUID uniqueIdentifier();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("xpcConnectionBlock")
    @ObjCBlock(name = "call_xpcConnectionBlock_ret")
    @NotNull
    public native Block_xpcConnectionBlock_ret xpcConnectionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_xpcConnectionBlock_ret {
        @Generated
        @NotNull
        NSXPCConnection call_xpcConnectionBlock_ret();
    }

    /**
     * A controller created from this way will connect to a remote instance of an MTRDeviceController loaded in an XPC
     * Service
     * 
     * @param xpcConnectionBlock The XPC Connection block that will return an NSXPCConnection to the intended listener.
     * 
     * @param uniqueIdentifier   The unique id to assign to the controller.
     * 
     * 
     *                           API-Since: 26.0
     */
    @Generated
    @Selector("initWithXPCConnectionBlock:uniqueIdentifier:")
    public native MTRXPCDeviceControllerParameters initWithXPCConnectionBlockUniqueIdentifier(
            @ObjCBlock(name = "call_initWithXPCConnectionBlockUniqueIdentifier") @NotNull Block_initWithXPCConnectionBlockUniqueIdentifier xpcConnectionBlock,
            @NotNull NSUUID uniqueIdentifier);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithXPCConnectionBlockUniqueIdentifier {
        @Generated
        @NotNull
        NSXPCConnection call_initWithXPCConnectionBlockUniqueIdentifier();
    }
}