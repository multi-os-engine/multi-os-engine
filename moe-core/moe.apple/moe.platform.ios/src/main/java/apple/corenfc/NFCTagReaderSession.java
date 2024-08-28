package apple.corenfc;

import apple.NSObject;
import apple.corenfc.protocol.NFCTag;
import apple.corenfc.protocol.NFCTagReaderSessionDelegate;
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
import org.moe.natj.general.ann.MappedReturn;
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
import apple.opaque.dispatch_queue_t;

/**
 * NFCTagReaderSession
 * 
 * Reader session for processing NFC tags supporting one of the @link NFCTagType @link/ types. @link
 * [NFCTagReaderSessionDelegate readerSession:didDetectTags:] @link/
 * will return tag objects matching the requested type for the session. This session requires the
 * "com.apple.developer.nfc.readersession.formats" entitlement
 * in your process. In addition your application's Info.plist must contain a non-empty usage description string. @link
 * NFCReaderErrorSecurityViolation @link/ will be
 * returned from @link [NFCTagReaderSessionDelegate tagReaderSession:didInvalidateWithError:] @link/ if the required
 * entitlement is missing when session is started.
 * 
 * NOTE:
 * - Only one NFCReaderSession can be active at any time in the system. Subsequent opened sessions will get queued up
 * and processed by the system in FIFO order.
 * - If the session is configured with @link NFCPollingISO14443 @link/ and an ISO7816 compliant MiFare tag that contains
 * one of the applications listed in the
 * "com.apple.developer.nfc.readersession.iso7816.select-identifiers" array in Info.plist is found, then @link
 * [NFCTagReaderSessionDelegate readerSession:didDetectTags:] @link/
 * will return a tag instance conform to the @link NFCISO7816Tag @link/ protocol.
 * - Use of @link NFCPollingPACE @link/ requires "PACE" to be added into the
 * "com.apple.developer.nfc.readersession.formats" entitlement.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCTagReaderSession extends NFCReaderSession {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCTagReaderSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCTagReaderSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCTagReaderSession allocWithZone(VoidPtr zone);

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

    /**
     * connectToTag:completionHandler:
     * 
     * This method establishes a tag connection and activates the tag. Connecting to the same tag that is currently
     * opened has no effect.
     * Connecting to a different tag will automatically terminate the previous tag connection and put it into the halt
     * state. Tag stays in the
     * connected state until another tag is connected or the polling is restarted.
     * 
     * API-Since: 13.0
     * 
     * @param tag               A NFCTag protocol compliant tag object that will be connected to.
     * 
     * @param completionHandler Completion handler called when the operation is completed. error is nil if operation
     *                          succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with
     *                          the tag.
     */
    @Generated
    @Selector("connectToTag:completionHandler:")
    public native void connectToTagCompletionHandler(@NotNull @Mapped(ObjCObjectMapper.class) NFCTag tag,
            @NotNull @ObjCBlock(name = "call_connectToTagCompletionHandler") Block_connectToTagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectToTagCompletionHandler {
        @Generated
        void call_connectToTagCompletionHandler(@Nullable NSError error);
    }

    /**
     * [@property] connectedTag Current connected tag object; nil if no tag is connected in the session.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("connectedTag")
    @MappedReturn(ObjCObjectMapper.class)
    public native NFCTag connectedTag();

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
    public native NFCTagReaderSession init();

    /**
     * initWithPollingOption:delegate:queue:
     * 
     * @param pollingOption Configures the RF polling of the reader session; multiple options can be OR'ed together.
     *                      This option affects the possible NFC tag type discover.
     * @param delegate      The session will hold a weak ARC reference to this @link NFCTagReaderSessionDelegate @link/
     *                      object.
     * @param queue         A dispatch queue where NFCTagReaderSessionDelegate delegate callbacks will be dispatched to.
     *                      A <i>nil</i> value will
     *                      cause the creation of a serial dispatch queue internally for the session. The session object
     *                      will retain the provided dispatch queue.
     * 
     * @return A new NFCTagReaderSession instance.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("initWithPollingOption:delegate:queue:")
    public native NFCTagReaderSession initWithPollingOptionDelegateQueue(@NInt long pollingOption,
            @NotNull @Mapped(ObjCObjectMapper.class) NFCTagReaderSessionDelegate delegate,
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NFCTagReaderSession new_objc();

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
     * 
     * Restart the polling sequence in this session to discover new tags. New tags discovered from polling will return
     * in the subsequent @link [NFCTagReaderSessionDelegate tagReaderSession:didDetectTags:]
     * @link/ call. Tags that are returned previously by @link [NFCTagReaderSessionDelegate
     * tagReaderSession:didDetectTags:] @link/ will become invalid,
     * and all references to these tags shall be removed to properly release the resources. Calling this method on an
     * invalidated session
     * will have no effect; a new reader session is required to restart the reader.
     * 
     * API-Since: 13.0
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
