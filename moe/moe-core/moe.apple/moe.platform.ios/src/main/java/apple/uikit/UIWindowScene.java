package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIActivityItemsConfigurationProviding;
import apple.uikit.protocol.UICoordinateSpace;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWindowScene extends UIScene {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWindowScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIWindowScene alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIWindowScene allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace coordinateSpace();

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
    public native UIWindowScene init();

    @Generated
    @Selector("initWithSession:connectionOptions:")
    public native UIWindowScene initWithSessionConnectionOptions(UISceneSession session,
            UISceneConnectionOptions connectionOptions);

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
    @Selector("interfaceOrientation")
    @NInt
    public native long interfaceOrientation();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIWindowScene new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("screen")
    public native UIScreen screen();

    /**
     * The screenshot object associated with the scene
     * <p>
     * This is non-null if the screenshot service is available for this window scene
     */
    @Generated
    @Selector("screenshotService")
    public native UIScreenshotService screenshotService();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Restrictions which the system should use when resizing the scene. This property will be NULL on platforms which
     * don't support scene resize, else a mutable object is returned which the client may customize.
     */
    @Generated
    @Selector("sizeRestrictions")
    public native UISceneSizeRestrictions sizeRestrictions();

    @Generated
    @Selector("statusBarManager")
    public native UIStatusBarManager statusBarManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The array of all windows associated with this UIWindowScene
     */
    @Generated
    @Selector("windows")
    public native NSArray<? extends UIWindow> windows();

    /**
     * An optional object used as a source of scene-level activity items configuration
     * <p>
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     */
    @Generated
    @Selector("activityItemsConfigurationSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIActivityItemsConfigurationProviding activityItemsConfigurationSource();

    /**
     * Returns the focus system that is responsible for this scene or nil if this scene does not support focus.
     */
    @Generated
    @Selector("focusSystem")
    public native UIFocusSystem focusSystem();

    /**
     * The key window for this UIWindowScene
     */
    @Generated
    @Selector("keyWindow")
    public native UIWindow keyWindow();

    /**
     * An optional object used as a source of scene-level activity items configuration
     * <p>
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     */
    @Generated
    @Selector("setActivityItemsConfigurationSource:")
    public native void setActivityItemsConfigurationSource_unsafe(
            @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationProviding value);

    /**
     * An optional object used as a source of scene-level activity items configuration
     * <p>
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     */
    @Generated
    public void setActivityItemsConfigurationSource(
            @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationProviding value) {
        Object __old = activityItemsConfigurationSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setActivityItemsConfigurationSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
