package apple.gamekit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIWindow;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKAccessPoint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKAccessPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKAccessPoint alloc();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("frameInScreenCoordinates")
    @ByValue
    public native CGRect frameInScreenCoordinates();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GKAccessPoint init();

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

    /**
     * set this true to enable access point in your app.  Setting this will cause the access point to appear after the notification banner is presented.  If it already was presented it will appear immediately
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * observable property that indicates when the access point is visible.
     */
    @Generated
    @Selector("isPresentingGameCenter")
    public native boolean isPresentingGameCenter();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isVisible")
    public native boolean isVisible();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * These properties control the placement of the widget
     */
    @Generated
    @Selector("location")
    @NInt
    public native long location();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("parentWindow")
    public native UIWindow parentWindow();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * set this true to enable access point in your app.  Setting this will cause the access point to appear after the notification banner is presented.  If it already was presented it will appear immediately
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * These properties control the placement of the widget
     */
    @Generated
    @Selector("setLocation:")
    public native void setLocation(@NInt long value);

    @Generated
    @Selector("setParentWindow:")
    public native void setParentWindow_unsafe(UIWindow value);

    @Generated
    public void setParentWindow(UIWindow value) {
        Object __old = parentWindow();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setParentWindow_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Set this property to true if you wish to show the highlights for most recent acheivement, current rank on default leaderboard, etc
     */
    @Generated
    @Selector("setShowHighlights:")
    public native void setShowHighlights(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("shared")
    public static native GKAccessPoint shared();

    /**
     * Set this property to true if you wish to show the highlights for most recent acheivement, current rank on default leaderboard, etc
     */
    @Generated
    @Selector("showHighlights")
    public native boolean showHighlights();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * this lets the developer trigger the access point as if the user had touched it.  This is useful for games that use controllers or the remote on AppleTV.  the argument lets you specify a specific state (default, profile, acheivements, leaderboards) for GameCenterViewController
     */
    @Generated
    @Selector("triggerAccessPointWithHandler:")
    public native void triggerAccessPointWithHandler(
            @ObjCBlock(name = "call_triggerAccessPointWithHandler") Block_triggerAccessPointWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_triggerAccessPointWithHandler {
        @Generated
        void call_triggerAccessPointWithHandler();
    }

    @Generated
    @Selector("triggerAccessPointWithState:handler:")
    public native void triggerAccessPointWithStateHandler(@NInt long state,
            @ObjCBlock(name = "call_triggerAccessPointWithStateHandler") Block_triggerAccessPointWithStateHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_triggerAccessPointWithStateHandler {
        @Generated
        void call_triggerAccessPointWithStateHandler();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}