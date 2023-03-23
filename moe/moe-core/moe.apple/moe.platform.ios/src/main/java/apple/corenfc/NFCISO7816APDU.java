package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NFCISO7816APDU
 * 
 * ISO7816 Application Data Unit (APDU).
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCISO7816APDU extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCISO7816APDU(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCISO7816APDU alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCISO7816APDU allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] data Data field; nil if data field is absent
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] expectedResponseLength Expected response length (Le). -1 means no response data field is expected.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("expectedResponseLength")
    @NInt
    public native long expectedResponseLength();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NFCISO7816APDU init();

    /**
     * initWithData:
     * 
     * @param data Data buffer containing the full APDU.
     * 
     * @return nil if input data does not contain a valid APDU.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("initWithData:")
    public native NFCISO7816APDU initWithData(NSData data);

    /**
     * initWithInstructionClass:instructionCode:p1Parameter:p2Parameter:data:expectedResponseLength:
     * 
     * Generates an ISO7816 APDU object. The Lc value is generated base on the size of the data object; possible value
     * ranges from
     * 1 to 65535 inclusively. Use @link -initWithData: @link/ in cases where a finer control on the APDU format is
     * required.
     * 
     * API-Since: 13.0
     * 
     * @param instructionClass       Instruction class (CLA) byte
     * @param instructionCode        Instruction code (INS) byte
     * @param p1Parameter            P1 parameter byte
     * @param p2Parameter            P2 parameter byte
     * @param data                   Data to transmit. Value of Lc field is set according to the data size.
     * @param expectedResponseLength Response data length (Le) in bytes. Valid range is from 1 to 65536 inclusively;
     *                               -1 means no response data field is expected. Use 256 if you want to send '00' as
     *                               the short Le field
     *                               assuming the data field is less than 256 bytes. Use 65536 if you want to send
     *                               '0000' as the extended
     *                               Le field.
     */
    @Generated
    @Selector("initWithInstructionClass:instructionCode:p1Parameter:p2Parameter:data:expectedResponseLength:")
    public native NFCISO7816APDU initWithInstructionClassInstructionCodeP1ParameterP2ParameterDataExpectedResponseLength(
            byte instructionClass, byte instructionCode, byte p1Parameter, byte p2Parameter, NSData data,
            @NInt long expectedResponseLength);

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
     * [@property] instructionClass Class (CLA) byte.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("instructionClass")
    public native byte instructionClass();

    /**
     * [@property] instructionCode Instruction (INS) byte.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("instructionCode")
    public native byte instructionCode();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NFCISO7816APDU new_objc();

    /**
     * [@property] p1Parameter P1 parameter.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("p1Parameter")
    public native byte p1Parameter();

    /**
     * [@property] p2Parameter P2 parameter.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("p2Parameter")
    public native byte p2Parameter();

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
