package apple.uikit;

import apple.NSObject;
import apple.cloudkit.CKShareMetadata;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
import apple.usernotifications.UNNotificationResponse;
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

/**
 * This object is vended to your application by UIKit when a UIScene connects to a session
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISceneConnectionOptions extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UISceneConnectionOptions(Pointer peer) {
        super(peer);
    }

    /**
     * A set of UIOpenURLContexts to handle on connection
     */
    @Generated
    @Selector("URLContexts")
    public native NSSet<? extends UIOpenURLContext> URLContexts();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISceneConnectionOptions alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * A CloudKit share metadata item to handle on connection
     */
    @Generated
    @Selector("cloudKitShareMetadata")
    public native CKShareMetadata cloudKitShareMetadata();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The type of a handoff user activity if one is pending on connect.
     * The delegate callbacks will be invoked for this activity when it is available.
     */
    @Generated
    @Selector("handoffUserActivityType")
    public native String handoffUserActivityType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UISceneConnectionOptions init();

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

    /**
     * A notification response to handle on connection
     */
    @Generated
    @Selector("notificationResponse")
    public native UNNotificationResponse notificationResponse();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A shortcut item to handle on connection
     */
    @Generated
    @Selector("shortcutItem")
    public native UIApplicationShortcutItem shortcutItem();

    /**
     * A NSString containing the bundle ID of the originating application.
     * non-nil if the originating application and this application share the same team identifier.
     */
    @Generated
    @Selector("sourceApplication")
    public native String sourceApplication();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A set of available user activities to handle on connection.
     * For handoff, the user activity is not immediately available and will not be in this set,
     * a handoff user activity will instead be indicated via the handoffUserActivityType property
     * above, and the application will receive a callback on their UISceneDelegate when the activity is fully loaded.
     */
    @Generated
    @Selector("userActivities")
    public native NSSet<? extends NSUserActivity> userActivities();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}