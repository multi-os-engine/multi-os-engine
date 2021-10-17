package apple.cryptotokenkit;

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

/**
 * TKSmartCardToken base class for implementing SmartCard based token.
 * <p>
 * When implementing SmartCard token extension, subclass TKSmartCardToken and implement TKTokenDelegate on it.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardToken extends TKToken {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardToken(Pointer peer) {
        super(peer);
    }

    /**
     * This is AID which is specified in extension's plist NSExtensionAttributes as @c com.apple.ctk.aid attribute. If the attribute specifies array of multiple AIDs, this parameter represents AID which was found on the card and is already preselected.  If @c com.apple.ctk.aid is not present, no application is automatically preselected and value of this property is nil.
     */
    @Generated
    @Selector("AID")
    public native NSData AID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardToken alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardToken allocWithZone(VoidPtr zone);

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
    public native TKSmartCardToken init();

    /**
     * Initializes token instance with specified attributes.
     *
     * @param smartCard   TKSmartCard instance representing connection to SmartCard on which the intance should operate.
     * @param AID         ISO7816-4 application ID which is preselected on the card.
     * @param instanceID  Unique, persistent identifier of this token.  This is typically implemented by some kind of SmartCard serial number.
     * @param tokenDriver associated driver which initiated creation of this token.
     */
    @Generated
    @Selector("initWithSmartCard:AID:instanceID:tokenDriver:")
    public native TKSmartCardToken initWithSmartCardAIDInstanceIDTokenDriver(TKSmartCard smartCard, NSData AID,
            String instanceID, TKSmartCardTokenDriver tokenDriver);

    @Generated
    @Selector("initWithTokenDriver:instanceID:")
    public native TKSmartCardToken initWithTokenDriverInstanceID(TKTokenDriver tokenDriver, String instanceID);

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
    public static native TKSmartCardToken new_objc();

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
