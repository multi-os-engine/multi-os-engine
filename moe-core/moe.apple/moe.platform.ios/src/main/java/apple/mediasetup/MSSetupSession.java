package apple.mediasetup;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediasetup.protocol.MSAuthenticationPresentationContext;
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
import org.moe.natj.general.ptr.Ptr;
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
 * An object that manages the transfer of configuration information between
 * your app, the system, your media service, and HomePod speakers.
 * 
 * An `MSSetupSession` object guides the user through connecting HomePod
 * speakers in their home to your media service. When your iOS app calls
 * ``MSSetupSession/startWithError:``, the session displays a setup view in the
 * window you provide in
 * ``MSAuthenticationPresentationContext/presentationAnchor``. The session
 * embeds your app icon and the ``MSServiceAccount/serviceName`` you provide
 * into this setup view.
 * 
 * ![A wireframe showing the setup view Media Setup displays to the user, with
 * callouts indicating where your app’s icon and your media service’s name
 * appear.](mssetupsession-1)
 * 
 * After the user confirms the setup by tapping the “Use in Home” button, the
 * system requests an OAuth 2.0 token from your authentication service and shares
 * the token with HomePod speakers in the user’s home.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MediaSetup")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSSetupSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MSSetupSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The streaming media service account for the session to configure.
     */
    @NotNull
    @Generated
    @Selector("account")
    public native MSServiceAccount account();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSSetupSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MSSetupSession allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MSSetupSession init();

    /**
     * Creates a new session.
     * 
     * - Parameters:
     * - serviceAccount: The streaming media service account to set up on a
     * HomePod.
     * 
     * - Returns:
     * Returns `true` if it successfully presents; otherwise, `false`.
     * 
     * This method presents user with options to add a service to the home.
     */
    @Generated
    @Selector("initWithServiceAccount:")
    public native MSSetupSession initWithServiceAccount(@NotNull MSServiceAccount serviceAccount);

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
    public static native MSSetupSession new_objc();

    /**
     * A delegate that provides media setup display information to the system.
     */
    @Nullable
    @Generated
    @Selector("presentationContext")
    @MappedReturn(ObjCObjectMapper.class)
    public native MSAuthenticationPresentationContext presentationContext();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A delegate that provides media setup display information to the system.
     */
    @Generated
    @Selector("setPresentationContext:")
    public native void setPresentationContext_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MSAuthenticationPresentationContext value);

    /**
     * A delegate that provides media setup display information to the system.
     */
    @Generated
    public void setPresentationContext(
            @Nullable @Mapped(ObjCObjectMapper.class) MSAuthenticationPresentationContext value) {
        Object __old = presentationContext();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPresentationContext_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Initiates the service configuration process.
     * 
     * This method sends the account details of the streaming media service to the user’s HomePod speakers.
     */
    @Generated
    @Selector("startWithError:")
    public native boolean startWithError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
