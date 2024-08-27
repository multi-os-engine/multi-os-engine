package apple.screentime;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * The object you use to delete web-usage data.
 * 
 * This class provides an easy way for you to delete web history, including:
 * 
 * - All history
 * - History associated to a specific URL
 * - History during a specific time interval
 * 
 * API-Since: 14.0
 */
@Generated
@Library("ScreenTime")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class STWebHistory extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected STWebHistory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native STWebHistory alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native STWebHistory allocWithZone(VoidPtr zone);

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
     * Deletes all web history associated with the bundle identifier you specified
     * during initialization.
     */
    @Generated
    @Selector("deleteAllHistory")
    public native void deleteAllHistory();

    /**
     * Deletes web history that occurred during the date interval you specify.
     * 
     * - Parameters:
     * - interval: The date interval of web history you want to delete.
     */
    @Generated
    @Selector("deleteHistoryDuringInterval:")
    public native void deleteHistoryDuringInterval(@NotNull NSDateInterval interval);

    /**
     * Deletes all the web history for the URL you specify.
     * 
     * The framework references the entire URL to determine which web-usage data to
     * delete.
     * 
     * - Parameters:
     * - url: The URL associated with the web history to delete.
     */
    @Generated
    @Selector("deleteHistoryForURL:")
    public native void deleteHistoryForURL(@NotNull NSURL url);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native STWebHistory init();

    /**
     * Creates a web history instance to delete web-usage data associated to the
     * bundle identifier you specify.
     * 
     * The default value for `bundleIdentifier` is `Bundle.main.bundleIdentifier`.
     * This is the recommended identifier to use, except for example, if a helper
     * process is presenting web UI and you want to group that web-usage under the
     * main app’s bundle identifier.
     * 
     * - Parameters:
     * - bundleIdentifier: The bundle identifier.
     * - error: Any error that occurred while changing the bundle identifier.
     */
    @Generated
    @Selector("initWithBundleIdentifier:error:")
    public native STWebHistory initWithBundleIdentifierError(@NotNull String bundleIdentifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native STWebHistory new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
