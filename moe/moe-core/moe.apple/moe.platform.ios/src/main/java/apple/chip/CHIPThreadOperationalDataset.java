package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPThreadOperationalDataset extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPThreadOperationalDataset(Pointer peer) {
        super(peer);
    }

    /**
     * The Thread PSKc
     */
    @Generated
    @Selector("PSKc")
    public native NSData PSKc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPThreadOperationalDataset alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPThreadOperationalDataset allocWithZone(VoidPtr zone);

    /**
     * Get the underlying data that represents the Thread Active Operational Dataset
     */
    @Generated
    @Selector("asData")
    public native NSData asData();

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

    /**
     * The Thread network channel
     */
    @Generated
    @Selector("channel")
    public native char channel();

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

    /**
     * The Thread Network extendended PAN ID
     */
    @Generated
    @Selector("extendedPANID")
    public native NSData extendedPANID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPThreadOperationalDataset init();

    /**
     * Create a Thread Operational Dataset object with a RCP formatted active operational dataset.
     * This initializer will return nil if the input data cannot be parsed correctly
     */
    @Generated
    @Selector("initWithData:")
    public native CHIPThreadOperationalDataset initWithData(NSData data);

    /**
     * Create a Thread Operational Dataset object with the individual network fields.
     * This initializer will return nil if any of the NSData fields don't match the expected size.
     * <p>
     * Note: The panID is expected to be a uint16_t stored as 2-bytes in host order
     */
    @Generated
    @Selector("initWithNetworkName:extendedPANID:masterKey:PSKc:channel:panID:")
    public native CHIPThreadOperationalDataset initWithNetworkNameExtendedPANIDMasterKeyPSKcChannelPanID(
            String networkName, NSData extendedPANID, NSData masterKey, NSData PSKc, char channel, NSData panID);

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

    /**
     * The 16 byte Master Key
     */
    @Generated
    @Selector("masterKey")
    public native NSData masterKey();

    /**
     * The Thread Network name
     */
    @Generated
    @Selector("networkName")
    public native String networkName();

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPThreadOperationalDataset new_objc();

    /**
     * A uint16_t stored as 2-bytes in host order representing the Thread PAN ID
     */
    @Generated
    @Selector("panID")
    public native NSData panID();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The Thread network channel
     */
    @Generated
    @Selector("setChannel:")
    public native void setChannel(char value);

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
