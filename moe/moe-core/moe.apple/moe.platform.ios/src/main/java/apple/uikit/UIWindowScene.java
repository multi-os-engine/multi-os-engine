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
import apple.foundation.NSError;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @NotNull
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
    public native UIWindowScene initWithSessionConnectionOptions(@NotNull UISceneSession session,
            @NotNull UISceneConnectionOptions connectionOptions);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

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

    @NotNull
    @Generated
    @Selector("screen")
    public native UIScreen screen();

    /**
     * The screenshot object associated with the scene
     * 
     * This is non-null if the screenshot service is available for this window scene
     */
    @Nullable
    @Generated
    @Selector("screenshotService")
    public native UIScreenshotService screenshotService();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Restrictions which the system should use when resizing the scene. This property will be NULL on platforms which
     * don't support scene resize, else a mutable object is returned which the client may customize.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("sizeRestrictions")
    public native UISceneSizeRestrictions sizeRestrictions();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("statusBarManager")
    public native UIStatusBarManager statusBarManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
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
    @NotNull
    @Generated
    @Selector("windows")
    public native NSArray<? extends UIWindow> windows();

    /**
     * An optional object used as a source of scene-level activity items configuration
     * 
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activityItemsConfigurationSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIActivityItemsConfigurationProviding activityItemsConfigurationSource();

    /**
     * Returns the focus system that is responsible for this scene or nil if this scene does not support focus.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("focusSystem")
    public native UIFocusSystem focusSystem();

    /**
     * The key window for this UIWindowScene
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("keyWindow")
    public native UIWindow keyWindow();

    /**
     * An optional object used as a source of scene-level activity items configuration
     * 
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setActivityItemsConfigurationSource:")
    public native void setActivityItemsConfigurationSource_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationProviding value);

    /**
     * An optional object used as a source of scene-level activity items configuration
     * 
     * If this property returns @c nil, the @c activityItemsConfiguration property of the most-presented view controller
     * of the scene's key window will be used for scene-level sharing and activities.
     * 
     * API-Since: 15.0
     */
    @Generated
    public void setActivityItemsConfigurationSource(
            @Nullable @Mapped(ObjCObjectMapper.class) UIActivityItemsConfigurationProviding value) {
        Object __old = activityItemsConfigurationSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setActivityItemsConfigurationSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Provides the current resolved values for the window scene's geometry in system space.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("effectiveGeometry")
    public native UIWindowSceneGeometry effectiveGeometry();

    @Generated
    @Selector("isFullScreen")
    public native boolean isFullScreen();

    /**
     * Request an update to the window scene's geometry in system space.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("requestGeometryUpdateWithPreferences:errorHandler:")
    public native void requestGeometryUpdateWithPreferencesErrorHandler(
            @NotNull UIWindowSceneGeometryPreferences geometryPreferences,
            @Nullable @ObjCBlock(name = "call_requestGeometryUpdateWithPreferencesErrorHandler") Block_requestGeometryUpdateWithPreferencesErrorHandler errorHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestGeometryUpdateWithPreferencesErrorHandler {
        @Generated
        void call_requestGeometryUpdateWithPreferencesErrorHandler(@NotNull NSError error);
    }

    /**
     * Additional window behaviors which may be platform specific. This property will be nil on unsupported platforms,
     * otherwise will provide a mutable object for window behavior customization.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("windowingBehaviors")
    public native UISceneWindowingBehaviors windowingBehaviors();
}
