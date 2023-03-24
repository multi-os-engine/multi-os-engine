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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents SmartCard inserted in the slot. Once the card is physically removed from the slot, the session object is
 * invalid and will always fail the operation invoked on it. In order to communicate with the card, an exclusive session
 * must be established.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCard allocWithZone(VoidPtr zone);

    /**
     * Bitmask containing allowed protocols to be used when communicating with the card. This property is consulted only
     * during connection to the card, changes are not propagated to already connected session. By default, any protocol
     * can be used.
     */
    @Generated
    @Selector("allowedProtocols")
    @NUInt
    public native long allowedProtocols();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Begins session with the card.
     * 
     * When session exists, other requests for sessions from other card objects to the same card are blocked. Session is
     * reference-counted, the same amount of 'end' calls must be done to really terminate the session. Note that
     * finishing session does not automatically mean that the card is disconnected; it only happens when another session
     * from different card object is requested.
     * 
     * @param success Signals whether session was successfully started.
     * @param error   More information about error preventing the transaction to start
     */
    @Generated
    @Selector("beginSessionWithReply:")
    public native void beginSessionWithReply(
            @NotNull @ObjCBlock(name = "call_beginSessionWithReply") Block_beginSessionWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginSessionWithReply {
        @Generated
        void call_beginSessionWithReply(boolean success, @Nullable NSError error);
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * CLA byte which will be used for sendIns: APDU transmits. Default value is 0x00.
     */
    @Generated
    @Selector("cla")
    public native byte cla();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * User-specified context kept as long as the card is powered. Once the card is removed or another TKSmartCard
     * object opens session, this property is automatically set to nil.
     */
    @Nullable
    @Generated
    @Selector("context")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object context();

    /**
     * Protocol used for communication with the SmartCard. If no card session is established, TKSmartCardProtocolNone is
     * set.
     */
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

    /**
     * Terminates the transaction. If no transaction is pending any more, the connection will be closed if there is
     * another session in the system waiting for the transaction.
     */
    @Generated
    @Selector("endSession")
    public native void endSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Synchronous variant of session creation. Begins the session, executes given block and ends session.
     * 
     * @param error Error receiving more information when transaction failed to start or block failed for some reason.
     * @param block Block to be executed when the session was successfully begun.
     * @return Returns YES if the session was successfully begun and block returned YES, otherwise NO.
     */
    @Generated
    @Selector("inSessionWithError:executeBlock:")
    public native boolean inSessionWithErrorExecuteBlock(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            @NotNull @ObjCBlock(name = "call_inSessionWithErrorExecuteBlock") Block_inSessionWithErrorExecuteBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inSessionWithErrorExecuteBlock {
        @Generated
        boolean call_inSessionWithErrorExecuteBlock(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native TKSmartCard new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Transmits APDU to the card and returns response.
     * 
     * Asynchronous high level variant of command for transmitting APDU to the card. Handles all ISO7816-4 APDU cases
     * translation to proper sequences according to used protocol. Consults useExtendedAPDU and useCommandChaining
     * properties and uses these modes whenever appropriate and beneficial for sending requested APDU request.
     * 
     * @param ins         INS code of the APDU
     * @param p1          P1 code of the APDU
     * @param p2          P2 code of the APDU
     * @param requestData Data field of the APDU, or nil if no input data field should be present (i.e case1 or case2
     *                    APDUs). Length of the data serves as Lc field of the APDU.
     * @param le          Expected number of bytes to be returned, or nil if no output data are expected (i.e. case1 or
     *                    case3 APDUs). To get as much bytes as card provides, pass @0.
     * @param replyData   Block of returned data without SW1SW2 bytes, or nil if an error occured.
     * @param sw          SW1SW2 result code, first two bytes of returned card's reply.
     * @param error       Contains error details when nil is returned. Specific error is also filled in if there was no
     *                    communication error, but card returned other SW code than 0x9000.
     */
    @Generated
    @Selector("sendIns:p1:p2:data:le:reply:")
    public native void sendInsP1P2DataLeReply(byte ins, byte p1, byte p2, @Nullable NSData requestData,
            @Nullable NSNumber le,
            @NotNull @ObjCBlock(name = "call_sendInsP1P2DataLeReply") Block_sendInsP1P2DataLeReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendInsP1P2DataLeReply {
        @Generated
        void call_sendInsP1P2DataLeReply(@Nullable NSData replyData, char sw, @Nullable NSError error);
    }

    /**
     * Transmits APDU to the card and returns response.
     * 
     * Synchronous high level variant of command for transmitting APDU to the card. Handles all ISO7816-4 APDU cases
     * translation to proper sequences according to used protocol. Should be used in block passed to -[TKSmartCard
     * inSessionWithError:executeBlock:] method.
     * 
     * @param ins   INS code of the APDU
     * @param p1    P1 code of the APDU
     * @param p2    P2 code of the APDU
     * @param data  Data field of the APDU. Length of the data serves as Lc field of the APDU
     * @param le    Expected number of bytes to be returned, or nil if no output data are expected (i.e. case1 or case3
     *              APDUs). To get as much bytes as card provides, pass @0.
     * @param sw    On output, filled with SW1SW2 result code
     * @param error Contains error details when nil is returned. Specific error is also filled in if there was no
     *              communication error, but card returned other SW code than 0x9000.
     * @return Returned data field, excluding SW status bytes. If an error occured, returns nil.
     */
    @Nullable
    @Generated
    @Selector("sendIns:p1:p2:data:le:sw:error:")
    public native NSData sendInsP1P2DataLeSwError(byte ins, byte p1, byte p2, @Nullable NSData requestData,
            @Nullable NSNumber le, @NotNull CharPtr sw,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Flag indicating whether card session should be considered as sensitive. Sensitive session always gets card after
     * reset before communicating with it and never leaves card without reset to be used by another SmartCard object.
     * This might be important in case that card session contain some important state which should not leak to another
     * SmartCard object (possibly running in another, foreign application). Default is NO.
     */
    @Generated
    @Selector("sensitive")
    public native boolean sensitive();

    /**
     * Bitmask containing allowed protocols to be used when communicating with the card. This property is consulted only
     * during connection to the card, changes are not propagated to already connected session. By default, any protocol
     * can be used.
     */
    @Generated
    @Selector("setAllowedProtocols:")
    public native void setAllowedProtocols(@NUInt long value);

    /**
     * CLA byte which will be used for sendIns: APDU transmits. Default value is 0x00.
     */
    @Generated
    @Selector("setCla:")
    public native void setCla(byte value);

    /**
     * User-specified context kept as long as the card is powered. Once the card is removed or another TKSmartCard
     * object opens session, this property is automatically set to nil.
     */
    @Generated
    @Selector("setContext:")
    public native void setContext(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Flag indicating whether card session should be considered as sensitive. Sensitive session always gets card after
     * reset before communicating with it and never leaves card without reset to be used by another SmartCard object.
     * This might be important in case that card session contain some important state which should not leak to another
     * SmartCard object (possibly running in another, foreign application). Default is NO.
     */
    @Generated
    @Selector("setSensitive:")
    public native void setSensitive(boolean value);

    /**
     * Flag indicating whether command chaining of APDU with data field longer than 255 bytes can be used. It is
     * automatically enabled when card announces that command chaining is supported in its ATR. However, caller can
     * explicitly override this decision.
     */
    @Generated
    @Selector("setUseCommandChaining:")
    public native void setUseCommandChaining(boolean value);

    /**
     * Flag indicating whether extended length APDUs should be used. It is automatically enabled only when used slot
     * supports transmitting extended length commands and card announces that extended length APDU are supported in its
     * ATR. However, caller can explicitly override this decision.
     */
    @Generated
    @Selector("setUseExtendedLength:")
    public native void setUseExtendedLength(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Slot in which is this card inserted.
     */
    @NotNull
    @Generated
    @Selector("slot")
    public native TKSmartCardSlot slot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Transmits raw command to the card. This call is allowed only inside session.
     * 
     * @param request Request part of APDU
     * @param reponse Response part of APDU, or nil if communication with the card failed
     * @param error   Error details when communication with the card failed
     */
    @Generated
    @Selector("transmitRequest:reply:")
    public native void transmitRequestReply(@NotNull NSData request,
            @NotNull @ObjCBlock(name = "call_transmitRequestReply") Block_transmitRequestReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transmitRequestReply {
        @Generated
        void call_transmitRequestReply(@Nullable NSData response, @Nullable NSError error);
    }

    /**
     * Flag indicating whether command chaining of APDU with data field longer than 255 bytes can be used. It is
     * automatically enabled when card announces that command chaining is supported in its ATR. However, caller can
     * explicitly override this decision.
     */
    @Generated
    @Selector("useCommandChaining")
    public native boolean useCommandChaining();

    /**
     * Flag indicating whether extended length APDUs should be used. It is automatically enabled only when used slot
     * supports transmitting extended length commands and card announces that extended length APDU are supported in its
     * ATR. However, caller can explicitly override this decision.
     */
    @Generated
    @Selector("useExtendedLength")
    public native boolean useExtendedLength();

    /**
     * Creates a new user interaction object for secure PIN change using the SmartCard reader facilities (typically a HW
     * keypad).
     * [@note] This interaction is only allowed within a session.
     * 
     * @param PINFormat            PIN format descriptor.
     * @param APDU                 Predefined APDU in which the SmartCard reader fills in the PIN(s).
     * @param currentPINByteOffset Offset in bytes within APDU data field to mark a location of a PIN block for filling
     *                             in the current PIN.
     * @param newPINByteOffset     Offset in bytes within APDU data field to mark a location of a PIN block for filling
     *                             in the new PIN.
     * @return A new user interaction object, or nil if this feature is not supported by the SmartCard reader. After the
     *         interaction has been successfully completed the operation result is available in the result properites.
     * 
     *         API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("userInteractionForSecurePINChangeWithPINFormat:APDU:currentPINByteOffset:newPINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINChange userInteractionForSecurePINChangeWithPINFormatAPDUCurrentPINByteOffsetNewPINByteOffset(
            @NotNull TKSmartCardPINFormat PINFormat, @NotNull NSData APDU, @NInt long currentPINByteOffset,
            @NInt long newPINByteOffset);

    /**
     * Creates a new user interaction object for secure PIN verification using the SmartCard reader facilities
     * (typically a HW keypad).
     * [@note] This interaction is only allowed within a session.
     * 
     * @param PINFormat     PIN format descriptor.
     * @param APDU          Predefined APDU in which the SmartCard reader fills in the PIN.
     * @param PINByteOffset Offset in bytes within APDU data field to mark a location of a PIN block for filling in the
     *                      entered PIN (currently unused, must be 0).
     * @return A new user interaction object, or nil if this feature is not supported by the SmartCard reader. After the
     *         interaction has been successfully completed the operation result is available in the result properites.
     * 
     *         API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("userInteractionForSecurePINVerificationWithPINFormat:APDU:PINByteOffset:")
    public native TKSmartCardUserInteractionForSecurePINVerification userInteractionForSecurePINVerificationWithPINFormatAPDUPINByteOffset(
            @NotNull TKSmartCardPINFormat PINFormat, @NotNull NSData APDU, @NInt long PINByteOffset);

    /**
     * Flag indicating whether card is valid, i.e. it was not removed from the reader. Use Key-Value-Observing to be
     * notified about card removal.
     */
    @Generated
    @Selector("valid")
    public native boolean valid();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
