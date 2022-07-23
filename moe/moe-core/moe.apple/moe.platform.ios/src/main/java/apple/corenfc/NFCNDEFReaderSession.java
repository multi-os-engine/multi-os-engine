package apple.corenfc;

import apple.NSObject;
import apple.corenfc.protocol.NFCNDEFReaderSessionDelegate;
import apple.corenfc.protocol.NFCNDEFTag;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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

/**
 * NFCNDEFReaderSession
 * <p>
 * NFC reader session for processing NFC Data Exchange Format (NDEF) tags. This session requires the
 * "com.apple.developer.nfc.readersession.formats"
 * entitlement in your process. In addition your application's Info.plist must contain a non-empty usage description
 * string.
 * [@link] NFCReaderErrorSecurityViolation @link/ will be returned from @link [NFCNDEFReaderSessionDelegate
 * readerSession:didInvalidateWithError:] @link/
 * if the required entitlement is missing when session is started.
 * <p>
 * [@note] Only one NFCNDEFReaderSession can be active at any time in the system. Subsequent opened sessions will get
 * queued up and processed by the system in FIFO order.
 * [@note] If the delegate object implements the optional -readerSession:didDetectTags: method the NFCNDEFReaderSession
 * will become a read-write session; see @link
 * NFCNDEFReaderSessionDelegate @link/ for detail description.
 * [@note] The error symbol will not be drawn on the action sheet if -invalidateSessionWithError: method is called on a
 * session that is not a read-write session;
 * -invalidateSession: method should be used in a read-only session.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCNDEFReaderSession extends NFCReaderSession {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCNDEFReaderSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCNDEFReaderSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCNDEFReaderSession allocWithZone(VoidPtr zone);

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

    /**
     * connectToTag:completionHandler:
     * <p>
     * This method establishes a tag connection and activates the tag. Connecting to the same tag that is currently
     * opened has no effect.
     * Connecting to a different tag will automatically terminate the previous tag connection and put it into the halt
     * state. Tag stays in the
     * connected state until another tag is connected or the polling is restarted.
     *
     * @param tag               A NFCTag protocol compliant tag object that will be connect to.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if operation
     *                          succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with
     *                          the tag.
     */
    @Generated
    @Selector("connectToTag:completionHandler:")
    public native void connectToTagCompletionHandler(@Mapped(ObjCObjectMapper.class) NFCNDEFTag tag,
            @ObjCBlock(name = "call_connectToTagCompletionHandler") Block_connectToTagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectToTagCompletionHandler {
        @Generated
        void call_connectToTagCompletionHandler(NSError error);
    }

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
    public native NFCNDEFReaderSession init();

    /**
     * initWithDelegate:queue:invalidateAfterFirstRead:
     * <p>
     * A NDEF reader session will scan and detect NFC Forum tags that contain a valid NDEF message. NFC Forum Tag type 1
     * to 5 that
     * is NDEF formatted are supported. A modal system UI will present once -beginSession is called to inform the start
     * of the session; the UI sheet
     * is automatically dismissed when the session is invalidated either by the user or by calling -invalidateSession.
     * The alertMessage property shall be set
     * prior to -beginSession to display a message on the action sheet UI for the tag scanning operation.
     * <p>
     * The reader session has the following properties:
     * + An opened session has a 60 seconds time limit restriction after -beginSession is called;
     * -readerSession:didInvalidateWithError: will return
     * NFCReaderSessionInvalidationErrorSessionTimeout error when the time limit is reached.
     * + Only 1 active reader session is allowed in the system; -readerSession:didInvalidateWithError: will return
     * NFCReaderSessionInvalidationErrorSystemIsBusy
     * when a new reader session is initiated by -beginSession when there is an active reader session.
     * + -readerSession:didInvalidateWithError: will return NFCReaderSessionInvalidationErrorUserCanceled when user
     * clicks on the done button on the UI.
     * + -readerSession:didInvalidateWithError: will return
     * NFCReaderSessionInvalidationErrorSessionTerminatedUnexpectedly when the client application enters
     * the background state.
     * + -readerSession:didInvalidateWithError: will return NFCReaderErrorUnsupportedFeature when 1) reader mode feature
     * is not available on the hardware,
     * 2) client application does not have the required entitlement.
     * <p>
     * The session's mode of operation is determined by the implementation of the delegate object. The
     * -readerSession:didDetectTags: optional method will
     * enable the read-write capability and suppress the -readerSession:didDetectNDEFs: callback for the session.
     *
     * @param delegate                 The session will hold a weak ARC reference to this @link
     *                                 NFCNDEFReaderSessionDelegate @link/ object.
     * @param queue                    A dispatch queue where NFCNDEFReaderSessionDelegate delegate callbacks will be
     *                                 dispatched to. A <i>nil</i> value will
     *                                 cause the creation of a serial dispatch queue internally for the session. The
     *                                 session object will retain the provided dispatch queue.
     * @param invalidateAfterFirstRead Session will automatically invalidate after the first NDEF tag is read
     *                                 successfully when this is set to YES, and
     *                                 -readerSession:didInvalidateWithError: will return
     *                                 NFCReaderSessionInvalidationErrorFirstNDEFTagRead in this case.
     *                                 Set to NO if the delegate object implements the -readerSession:didDetectTags:
     *                                 optional method.
     * @return A new NFCNDEFReaderSession instance.
     */
    @Generated
    @Selector("initWithDelegate:queue:invalidateAfterFirstRead:")
    public native NFCNDEFReaderSession initWithDelegateQueueInvalidateAfterFirstRead(
            @Mapped(ObjCObjectMapper.class) NFCNDEFReaderSessionDelegate delegate, NSObject queue,
            boolean invalidateAfterFirstRead);

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
    public static native NFCNDEFReaderSession new_objc();

    @Generated
    @Selector("readingAvailable")
    public static native boolean readingAvailable();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * restartPolling
     * <p>
     * Restart the polling sequence in this session to discover new NDEF tags. New tags discovered from polling will
     * return in the subsequent @link [NFCNDEFReaderSessionDelegate readerSession:didDetectTags:]
     *
     * @link/ call. Tags that are returned previously by @link [NFCNDEFReaderSessionDelegate
     * -readerSession:didDetectTags:] @link/ will become invalid,
     * and all references to these tags shall be removed to properly release the resources. Calling this method on an
     * invalidated session
     * will have no effect; a new reader session is required to restart the reader. Calling this method on an instance
     * initiated with a delegate object that does not implement
     * the optional -readerSession:didDetectTags: method has no effect as RF polling restart is done automatically.
     */
    @Generated
    @Selector("restartPolling")
    public native void restartPolling();

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
