package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCard extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCard(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCard alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("allowedProtocols")
    @NUInt
    public native long allowedProtocols();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginSessionWithReply:")
    public native void beginSessionWithReply(
            @ObjCBlock(name = "call_beginSessionWithReply") Block_beginSessionWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginSessionWithReply {
        @Generated
        void call_beginSessionWithReply(boolean arg0, NSError arg1);
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("cla")
    public native byte cla();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("context")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object context();

    @Generated
    @Selector("currentProtocol")
    @NUInt
    public native long currentProtocol();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("endSession")
    public native void endSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inSessionWithError:executeBlock:")
    public native boolean inSessionWithErrorExecuteBlock(@ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            @ObjCBlock(name = "call_inSessionWithErrorExecuteBlock") Block_inSessionWithErrorExecuteBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inSessionWithErrorExecuteBlock {
        @Generated
        boolean call_inSessionWithErrorExecuteBlock(@ReferenceInfo(type = NSError.class) Ptr<NSError> arg0);
    }

    @Generated
    @Selector("init")
    public native TKSmartCard init();

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

    @Generated
    @Selector("sendIns:p1:p2:data:le:reply:")
    public native void sendInsP1P2DataLeReply(byte ins, byte p1, byte p2, NSData requestData, NSNumber le,
            @ObjCBlock(name = "call_sendInsP1P2DataLeReply") Block_sendInsP1P2DataLeReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendInsP1P2DataLeReply {
        @Generated
        void call_sendInsP1P2DataLeReply(NSData arg0, char arg1, NSError arg2);
    }

    @Generated
    @Selector("sendIns:p1:p2:data:le:sw:error:")
    public native NSData sendInsP1P2DataLeSwError(byte ins, byte p1, byte p2, NSData requestData, NSNumber le,
            CharPtr sw, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("sensitive")
    public native boolean sensitive();

    @Generated
    @Selector("setAllowedProtocols:")
    public native void setAllowedProtocols(@NUInt long value);

    @Generated
    @Selector("setCla:")
    public native void setCla(byte value);

    @Generated
    @Selector("setContext:")
    public native void setContext(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setSensitive:")
    public native void setSensitive(boolean value);

    @Generated
    @Selector("setUseCommandChaining:")
    public native void setUseCommandChaining(boolean value);

    @Generated
    @Selector("setUseExtendedLength:")
    public native void setUseExtendedLength(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("slot")
    public native TKSmartCardSlot slot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transmitRequest:reply:")
    public native void transmitRequestReply(NSData request,
            @ObjCBlock(name = "call_transmitRequestReply") Block_transmitRequestReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transmitRequestReply {
        @Generated
        void call_transmitRequestReply(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("useCommandChaining")
    public native boolean useCommandChaining();

    @Generated
    @Selector("useExtendedLength")
    public native boolean useExtendedLength();

    @Generated
    @Selector("userInteractionForSecurePINChangeWithPINFormat:APDU:currentPINByteOffset:newPINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINChange userInteractionForSecurePINChangeWithPINFormatAPDUCurrentPINByteOffsetNewPINByteOffset(
            TKSmartCardPINFormat PINFormat, NSData APDU, @NInt long currentPINByteOffset, @NInt long newPINByteOffset);

    @Generated
    @Selector("userInteractionForSecurePINVerificationWithPINFormat:APDU:PINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINVerification userInteractionForSecurePINVerificationWithPINFormatAPDUPINByteOffset(
            TKSmartCardPINFormat PINFormat, NSData APDU, @NInt long PINByteOffset);

    @Generated
    @Selector("valid")
    public native boolean valid();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}