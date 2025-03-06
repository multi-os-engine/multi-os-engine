package apple.mapkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mapkit.protocol.MKMapItemDetailViewControllerDelegate;
import apple.uikit.UIViewController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * API-Since: 18.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKMapItemDetailViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected MKMapItemDetailViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKMapItemDetailViewController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MKMapItemDetailViewController allocWithZone(VoidPtr zone);

    @Generated
    @Deprecated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The map item detail view controller's delegate
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MKMapItemDetailViewControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MKMapItemDetailViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native MKMapItemDetailViewController initWithCoder(@NotNull NSCoder coder);

    /**
     * Create a map item detail view controller
     * 
     * Displays an inline map with the place data. If the application UI is
     * already showing the place in a map view, the inline map can be disabled
     * by using the `- initWithMapItem:displaysMap:` initializer.
     * 
     * - Parameters:
     * - mapItem: The map item to display, or `nil` for "loading"
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithMapItem:")
    public native MKMapItemDetailViewController initWithMapItem(@Nullable MKMapItem mapItem);

    /**
     * Create a map item detail view controller
     * 
     * - Parameters:
     * - mapItem: The map item to display, or `nil` for "loading"
     * - displaysMap: If an inline map should be displayed with the place data.
     * A value of `YES` must be specified if the application UI is not
     * already showing the place in a map view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithMapItem:displaysMap:")
    public native MKMapItemDetailViewController initWithMapItemDisplaysMap(@Nullable MKMapItem mapItem,
            boolean displaysMap);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MKMapItemDetailViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The map item to display
     * 
     * If nil, a "loading" view is displayed
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("mapItem")
    @Nullable
    public native MKMapItem mapItem();

    @Generated
    @Owned
    @Selector("new")
    public static native MKMapItemDetailViewController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The map item detail view controller's delegate
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable MKMapItemDetailViewControllerDelegate value);

    /**
     * The map item detail view controller's delegate
     * 
     * API-Since: 18.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable MKMapItemDetailViewControllerDelegate value) {
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
     * The map item to display
     * 
     * If nil, a "loading" view is displayed
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMapItem:")
    public native void setMapItem(@Nullable MKMapItem value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}