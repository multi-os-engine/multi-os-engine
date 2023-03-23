package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.passkit.protocol.PKIdentityDocumentDescriptor;
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
 * Used to request information from an identity document stored as a Wallet pass.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKIdentityAuthorizationController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKIdentityAuthorizationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKIdentityAuthorizationController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKIdentityAuthorizationController allocWithZone(VoidPtr zone);

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
     * If there is a request in progress through requestDocument, this will cancel that request
     * if possible. If the request is cancelled, PKIdentityErrorAppCancelled will be returned in the
     * requestDocument:completion: completion handler. Cancellation is not guaranteed; even if
     * this method is called, it is possible that requestDocument:completion: will return a document
     * response if a response was already in flight.
     */
    @Generated
    @Selector("cancelRequest")
    public native void cancelRequest();

    /**
     * Determines if a document can be requested, taking into account the entitlement of the
     * calling process as well as the state of this device.
     */
    @Generated
    @Selector("checkCanRequestDocument:completion:")
    public native void checkCanRequestDocumentCompletion(
            @Mapped(ObjCObjectMapper.class) PKIdentityDocumentDescriptor descriptor,
            @ObjCBlock(name = "call_checkCanRequestDocumentCompletion") Block_checkCanRequestDocumentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkCanRequestDocumentCompletion {
        @Generated
        void call_checkCanRequestDocumentCompletion(boolean canRequest);
    }

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
    public native PKIdentityAuthorizationController init();

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
    public static native PKIdentityAuthorizationController new_objc();

    /**
     * Requests identity document information from the user. The user will be prompted to approve
     * the request before any data is released.
     * If the user approves, the document will be returned through the completion handler.
     * If the user does not approve, PKIdentityErrorUserCancelled will be returned through
     * the completion handler.
     * If the request is cancelled by the calling app through cancelRequest, PKIdentityErrorAppCancelled
     * will be returned.
     * Only one request can be in progress at a time, otherwise PKIdentityErrorRequestAlreadyInProgress
     * will be returned.
     */
    @Generated
    @Selector("requestDocument:completion:")
    public native void requestDocumentCompletion(PKIdentityRequest request,
            @ObjCBlock(name = "call_requestDocumentCompletion") Block_requestDocumentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDocumentCompletion {
        @Generated
        void call_requestDocumentCompletion(PKIdentityDocument document, NSError error);
    }

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