package apple.corenfc;

import apple.NSObject;
import apple.corenfc.protocol.NFCTagReaderSessionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NFCPaymentTagReaderSession
 * 
 * Reader session for processing NFC payment tags supporting the @link NFCTagTypeISO7816Compatible @link/ type.
 * [@link] [NFCTagReaderSessionDelegate readerSession:didDetectTags:] @link/ will return a @link NFCISO7816Tag @link /.
 * object.
 * This session requires the "com.apple.developer.nfc.readersession.formats" entitlement in your process.
 * In addition your application's Info.plist must contain a non-empty usage description string. @link
 * NFCReaderErrorSecurityViolation @link/ will be
 * returned from @link [NFCTagReaderSessionDelegate tagReaderSession:didInvalidateWithError:] @link/ if the required
 * entitlement is missing when session is started.
 * 
 * When the reader discovers a compatible ISO7816 tag it automatically performs a SELECT command (by DF name) using the
 * values provided in
 * "com.apple.developer.nfc.readersession.iso7816.select-identifiers" in the specified array order. The tag is
 * returned from the [NFCTagReaderSessionDelegate readerSession:didDetectTags:] call on the first successful SELECT
 * command.
 * The initialSelectedAID property returns the application identifier of the selected application. Tag will not be
 * returned
 * to the NFCTagReaderSessionDelegate if no application described in
 * "com.apple.developer.nfc.readersession.iso7816.select-identifiers"
 * is found.
 * 
 * NOTE:
 * - Only one NFCReaderSession can be active at any time in the system. Subsequent opened sessions will get queued up
 * and processed by the system in FIFO order.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCPaymentTagReaderSession extends NFCTagReaderSession {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCPaymentTagReaderSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCPaymentTagReaderSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NFCPaymentTagReaderSession allocWithZone(VoidPtr zone);

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
    public native NFCPaymentTagReaderSession init();

    /**
     * initWithDelegate:queue:
     * 
     * @param delegate The session will hold a weak ARC reference to this @link NFCTagReaderSessionDelegate @link/
     *                 object.
     * @param queue    A dispatch queue where NFCTagReaderSessionDelegate delegate callbacks will be dispatched to. A
     *                 <i>nil</i> value will
     *                 cause the creation of a serial dispatch queue internally for the session. The session object will
     *                 retain the provided dispatch queue.
     * 
     * @return A new NFCPaymentTagReaderSession instance.
     * 
     *         NOTE:
     *         The super class `-initWithPollingOption:delegate:queue:` initializer would only accept
     *         NFCPollingOption.NFCPollingISO14443; all other options will be ignored.
     * 
     *         API-Since: 26.0
     */
    @Generated
    @Selector("initWithDelegate:queue:")
    public native NFCPaymentTagReaderSession initWithDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull NFCTagReaderSessionDelegate delegate,
            @Nullable dispatch_queue_t queue);

    @Generated
    @Selector("initWithPollingOption:delegate:queue:")
    public native NFCPaymentTagReaderSession initWithPollingOptionDelegateQueue(@NInt long pollingOption,
            @Mapped(ObjCObjectMapper.class) @NotNull NFCTagReaderSessionDelegate delegate,
            @Nullable dispatch_queue_t queue);

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
    public static native NFCPaymentTagReaderSession new_objc();

    @Generated
    @Selector("readingAvailable")
    public static native boolean readingAvailable();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}