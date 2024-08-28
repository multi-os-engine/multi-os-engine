package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents pool of SmartCard reader slots.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardSlotManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardSlotManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardSlotManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardSlotManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Global pool of SmartCard reader slots.
     * macOS: Note that defaultManager instance is accessible only if the calling application has
     * 'com.apple.security.smartcard' entitlement set to Boolean:YES. If the calling application does not have this
     * entitlement, defaultManager is always set to nil.
     * iOS: The defaultManager instance is always accessible.
     */
    @Nullable
    @Generated
    @Selector("defaultManager")
    public static native TKSmartCardSlotManager defaultManager();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Instantiates smartcard reader slot of specified name. If specified name is not registered, reports nil.
     */
    @Generated
    @Selector("getSlotWithName:reply:")
    public native void getSlotWithNameReply(@NotNull String name,
            @NotNull @ObjCBlock(name = "call_getSlotWithNameReply") Block_getSlotWithNameReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSlotWithNameReply {
        @Generated
        void call_getSlotWithNameReply(@Nullable TKSmartCardSlot slot);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKSmartCardSlotManager init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native TKSmartCardSlotManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Gets SmartCard reader slot with specified name. If reader slot with this name does not exist, returns nil.
     */
    @Nullable
    @Generated
    @Selector("slotNamed:")
    public native TKSmartCardSlot slotNamed(@NotNull String name);

    /**
     * Array of currently known slots in the system. Slots are identified by NSString name instances. Use KVO to be
     * notified about slots arrivals and removals.
     */
    @NotNull
    @Generated
    @Selector("slotNames")
    public native NSArray<String> slotNames();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
