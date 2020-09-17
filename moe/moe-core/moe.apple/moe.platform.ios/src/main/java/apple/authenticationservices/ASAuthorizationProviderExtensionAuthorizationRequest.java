package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationProviderExtensionAuthorizationRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationProviderExtensionAuthorizationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationProviderExtensionAuthorizationRequest alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("authorizationOptions")
    public native NSDictionary<?, ?> authorizationOptions();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("callerBundleIdentifier")
    public native String callerBundleIdentifier();

    @Generated
    @Selector("cancel")
    public native void cancel();

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
    @Selector("complete")
    public native void complete();

    @Generated
    @Selector("completeWithError:")
    public native void completeWithError(NSError error);

    @Generated
    @Selector("completeWithHTTPAuthorizationHeaders:")
    public native void completeWithHTTPAuthorizationHeaders(NSDictionary<String, String> httpAuthorizationHeaders);

    @Generated
    @Selector("completeWithHTTPResponse:httpBody:")
    public native void completeWithHTTPResponseHttpBody(NSHTTPURLResponse httpResponse, NSData httpBody);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("doNotHandle")
    public native void doNotHandle();

    @Generated
    @Selector("extensionData")
    public native NSDictionary<?, ?> extensionData();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("httpBody")
    public native NSData httpBody();

    @Generated
    @Selector("httpHeaders")
    public native NSDictionary<String, String> httpHeaders();

    @Generated
    @Selector("init")
    public native ASAuthorizationProviderExtensionAuthorizationRequest init();

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
    @Selector("presentAuthorizationViewControllerWithCompletion:")
    public native void presentAuthorizationViewControllerWithCompletion(
            @ObjCBlock(name = "call_presentAuthorizationViewControllerWithCompletion") Block_presentAuthorizationViewControllerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentAuthorizationViewControllerWithCompletion {
        @Generated
        void call_presentAuthorizationViewControllerWithCompletion(boolean success, NSError error);
    }

    @Generated
    @Selector("realm")
    public native String realm();

    @Generated
    @Selector("requestedOperation")
    public native String requestedOperation();

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
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("callerTeamIdentifier")
    public native String callerTeamIdentifier();

    @Generated
    @Selector("isCallerManaged")
    public native boolean isCallerManaged();

    @Generated
    @Selector("localizedCallerDisplayName")
    public native String localizedCallerDisplayName();
}