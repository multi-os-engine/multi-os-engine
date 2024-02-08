package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationControllerDelegate;
import apple.authenticationservices.protocol.ASAuthorizationControllerPresentationContextProviding;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationController allocWithZone(VoidPtr zone);

    /**
     * Authorization requests that are being serviced by this controller
     */
    @NotNull
    @Generated
    @Selector("authorizationRequests")
    public native NSArray<? extends ASAuthorizationRequest> authorizationRequests();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * This delegate will be invoked upon completion of the authorization indicating success or failure.
     * Delegate is required to receive the results of authorization.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ASAuthorizationControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASAuthorizationController init();

    /**
     * Initialize the controller with authorization requests.
     * 
     * @param authorizationRequests At least one request should be provided. Requests of same type maybe honored in
     *                              first in first out order
     */
    @Generated
    @Selector("initWithAuthorizationRequests:")
    public native ASAuthorizationController initWithAuthorizationRequests(
            @NotNull NSArray<? extends ASAuthorizationRequest> authorizationRequests);

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
    public static native ASAuthorizationController new_objc();

    /**
     * Initiate the authorization flows. Upon completion, the delegate will be called with either success or failure.
     * Certain authorization flows may require a presentation context. The @c presentationContextProvider will be called
     * to provide it.
     * 
     * The instance will remain retained until the flow is either completed or canceled, and the delegate callback is
     * made.
     */
    @Generated
    @Selector("performRequests")
    public native void performRequests();

    /**
     * This delegate will be invoked upon needing a presentation context to display authorization UI.
     */
    @Nullable
    @Generated
    @Selector("presentationContextProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native ASAuthorizationControllerPresentationContextProviding presentationContextProvider();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This delegate will be invoked upon completion of the authorization indicating success or failure.
     * Delegate is required to receive the results of authorization.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) ASAuthorizationControllerDelegate value);

    /**
     * This delegate will be invoked upon completion of the authorization indicating success or failure.
     * Delegate is required to receive the results of authorization.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) ASAuthorizationControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * This delegate will be invoked upon needing a presentation context to display authorization UI.
     */
    @Generated
    @Selector("setPresentationContextProvider:")
    public native void setPresentationContextProvider_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) ASAuthorizationControllerPresentationContextProviding value);

    /**
     * This delegate will be invoked upon needing a presentation context to display authorization UI.
     */
    @Generated
    public void setPresentationContextProvider(
            @Nullable @Mapped(ObjCObjectMapper.class) ASAuthorizationControllerPresentationContextProviding value) {
        Object __old = presentationContextProvider();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPresentationContextProvider_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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

    /**
     * Cancel the running authorization flows, if there are any. If a flow is canceled, the delegate callback will
     * be made indicating the cancel.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * Initiate the authorization flows for requests that support AutoFill presentation. UI will be shown when
     * focusing a text field with the appropriate text content type. Upon completion, the delegate will be called with
     * either success
     * or failure.
     * 
     * The instance will remain retained until the flow is either completed or canceled, and the delegate callback is
     * made.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("performAutoFillAssistedRequests")
    public native void performAutoFillAssistedRequests();

    /**
     * Initiate the authorization flows. Upon completion, the delegate will be called with either success or failure.
     * Certain authorization flows may require a presentation context. The @c presentationContextProvider will be called
     * to provide it.
     * 
     * Calling this method with no options is the same as calling @c performRequests. The instance will remain retained
     * until
     * the flow is either completed or canceled, and the delegate callback is made.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("performRequestsWithOptions:")
    public native void performRequestsWithOptions(@NUInt long options);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
