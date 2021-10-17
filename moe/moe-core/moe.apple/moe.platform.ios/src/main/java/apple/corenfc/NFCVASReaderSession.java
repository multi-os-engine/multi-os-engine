package apple.corenfc;

import apple.NSObject;
import apple.corenfc.protocol.NFCVASReaderSessionDelegate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NFCVASReaderSession
 * <p>
 * Reader session for processing Value Added Service (VAS) tags.  This session requires the "com.apple.developer.nfc.readersession.formats"
 * entitlement in your process.  In addition your application's Info.plist must contain a non-empty usage description string.
 * [@link] NFCReaderErrorSecurityViolation @link/ will be returned from @link [NFCVASReaderSessionDelegate readerSession:didInvalidateWithError:] @link/
 * if the required entitlement is missing when session is started.
 * <p>
 * NOTE:
 * Only one NFCReaderSession can be active at any time in the system. Subsequent opened sessions will get queued up and processed by the system in FIFO order.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCVASReaderSession extends NFCReaderSession {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCVASReaderSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCVASReaderSession alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NFCVASReaderSession allocWithZone(VoidPtr zone);

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
    public native NFCVASReaderSession init();

    /**
     * initWithVASCommandConfigurations:delegate:queue:invalidateAfterFirstRead:
     * <p>
     * A VAS reader session will automatically scan and detect tag that is compatible with the VAS protocol.  The session will advertise as a
     * VAS App Only terminal.  A modal system UI will present once -beginSession is called to inform the start of the session; the UI sheet
     * is automatically dismissed when the session is invalidated either by the user or by calling -invalidateSession.  The alertMessage property shall be set
     * prior to -beginSession to display a message on the action sheet UI for the tag scanning operation.
     * <p>
     * The reader session has the following properties:
     * + An opened session has a 60 seconds time limit restriction after -beginSession is called; -readerSession:didInvalidateWithError: will return
     * NFCReaderSessionInvalidationErrorSessionTimeout error when the time limit is reached.
     * + Only 1 active reader session is allowed in the system; -readerSession:didInvalidateWithError: will return NFCReaderSessionInvalidationErrorSystemIsBusy
     * when a new reader session is initiated by -beginSession when there is an active reader session.
     * + -readerSession:didInvalidateWithError: will return NFCReaderSessionInvalidationErrorUserCanceled when user clicks on the done button on the UI.
     * + -readerSession:didInvalidateWithError: will return NFCReaderSessionInvalidationErrorSessionTerminatedUnexpectedly when the client application enters
     * the background state.
     * + -readerSession:didInvalidateWithError: will return NFCReaderErrorUnsupportedFeature when 1) reader mode feature is not available on the hardware,
     * 2) client application does not have the required entitlement.
     *
     * @param commandConfigurations NSArray of NFCVASCommandConfiguration objects.  Each NFCVASCommandConfiguration defines one GET VAS DATA command send to
     *                              a compatible tag when discovered.  The order of elements in the array defines the order of the command execution.
     * @param delegate              The session will hold a weak ARC reference to this @link NFCVASReaderSessionDelegate @link/ object.
     * @param queue                 A dispatch queue where NFCVASReaderSessionDelegate delegate callbacks will be dispatched to.  A <i>nil</i> value will
     *                              cause the creation of a serial dispatch queue internally for the session.  The session object will retain the provided dispatch queue.
     * @return A new NFCVASReaderSession instance.
     */
    @Generated
    @Selector("initWithVASCommandConfigurations:delegate:queue:")
    public native NFCVASReaderSession initWithVASCommandConfigurationsDelegateQueue(
            NSArray<? extends NFCVASCommandConfiguration> commandConfigurations,
            @Mapped(ObjCObjectMapper.class) NFCVASReaderSessionDelegate delegate, NSObject queue);

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
    public static native NFCVASReaderSession new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
