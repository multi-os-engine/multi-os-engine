package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Context of a SmartCard PIN authentication operation.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKTokenSmartCardPINAuthOperation extends TKTokenAuthOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected TKTokenSmartCardPINAuthOperation(Pointer peer) {
        super(peer);
    }

    /**
     * APDU template into which PIN gets filled in. If set to nil, the system will not attempt to authenticate by sending the formatted APDU to the SmartCard, but rather the token itself is expected to perform the authentication.  It is preferred to provide APDUTemplate if possible, because it allows using hardware PINPad for secure PIN entry (provided that the reader has one).
     */
    @Generated
    @Selector("APDUTemplate")
    public native NSData APDUTemplate();

    /**
     * PIN value which will be set when 'finishWithError:' gets triggered.  Note that the PIN is not set in case that APDUTemplate was set.  In this case, PIN was already sent to the card using specified template.
     */
    @Generated
    @Selector("PIN")
    public native String PIN();

    /**
     * Offset in bytes within APDU template to mark the location for filling in the PIN.
     */
    @Generated
    @Selector("PINByteOffset")
    @NInt
    public native long PINByteOffset();

    /**
     * PIN formatting properties.
     * [@note] The property is initialized with a default instance of TKSmartCardPINFormat.
     */
    @Generated
    @Selector("PINFormat")
    public native TKSmartCardPINFormat PINFormat();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKTokenSmartCardPINAuthOperation alloc();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKTokenSmartCardPINAuthOperation init();

    @Generated
    @Selector("initWithCoder:")
    public native TKTokenSmartCardPINAuthOperation initWithCoder(NSCoder coder);

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * APDU template into which PIN gets filled in. If set to nil, the system will not attempt to authenticate by sending the formatted APDU to the SmartCard, but rather the token itself is expected to perform the authentication.  It is preferred to provide APDUTemplate if possible, because it allows using hardware PINPad for secure PIN entry (provided that the reader has one).
     */
    @Generated
    @Selector("setAPDUTemplate:")
    public native void setAPDUTemplate(NSData value);

    /**
     * PIN value which will be set when 'finishWithError:' gets triggered.  Note that the PIN is not set in case that APDUTemplate was set.  In this case, PIN was already sent to the card using specified template.
     */
    @Generated
    @Selector("setPIN:")
    public native void setPIN(String value);

    /**
     * Offset in bytes within APDU template to mark the location for filling in the PIN.
     */
    @Generated
    @Selector("setPINByteOffset:")
    public native void setPINByteOffset(@NInt long value);

    /**
     * PIN formatting properties.
     * [@note] The property is initialized with a default instance of TKSmartCardPINFormat.
     */
    @Generated
    @Selector("setPINFormat:")
    public native void setPINFormat(TKSmartCardPINFormat value);

    /**
     * TKSmartCard to which the formatted APDU gets sent in order to authenticate (used only if 'APDUTemplate' is set).
     */
    @Generated
    @Selector("setSmartCard:")
    public native void setSmartCard(TKSmartCard value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * TKSmartCard to which the formatted APDU gets sent in order to authenticate (used only if 'APDUTemplate' is set).
     */
    @Generated
    @Selector("smartCard")
    public native TKSmartCard smartCard();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}