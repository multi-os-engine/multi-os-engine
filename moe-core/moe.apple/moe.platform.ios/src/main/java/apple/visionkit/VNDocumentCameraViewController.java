package apple.visionkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
import apple.visionkit.protocol.VNDocumentCameraViewControllerDelegate;
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
 * A view controller that shows what the document camera sees.
 * 
 * Present this view controller, as follows, and add it to your view controller
 * hierarchy to scan documents.
 * 
 * ```occ VNDocumentCameraViewController* documentCameraViewController =
 * [[VNDocumentCameraViewController alloc] init];
 * documentCameraViewController.delegate = self; [self
 * presentViewController:documentCameraViewController animated:YES
 * completion:nil]; ```
 * 
 * API-Since: 13.0
 */
@Generated
@Library("VisionKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDocumentCameraViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDocumentCameraViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDocumentCameraViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNDocumentCameraViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The delegate to be notified when the user saves or cancels the document
     * scanner.
     * 
     * The delegate receives one of the following three calls:
     * 
     * -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFinishWith:)``
     * when the camera successfully completes a scan. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewControllerDidCancel(_:)``
     * when the user cancels out of the document camera interface. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFailWithError:)``
     * when the document scan fails or is unable to capture a photo.
     * 
     * Your app is responsible for dismissing the document camera in all delegate
     * callback methods.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native VNDocumentCameraViewControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNDocumentCameraViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native VNDocumentCameraViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native VNDocumentCameraViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
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

    /**
     * A Boolean variable that indicates whether or not the current device supports document scanning.
     * 
     * This class method returns `false` for unsupported hardware.
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNDocumentCameraViewController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The delegate to be notified when the user saves or cancels the document
     * scanner.
     * 
     * The delegate receives one of the following three calls:
     * 
     * -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFinishWith:)``
     * when the camera successfully completes a scan. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewControllerDidCancel(_:)``
     * when the user cancels out of the document camera interface. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFailWithError:)``
     * when the document scan fails or is unable to capture a photo.
     * 
     * Your app is responsible for dismissing the document camera in all delegate
     * callback methods.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) VNDocumentCameraViewControllerDelegate value);

    /**
     * The delegate to be notified when the user saves or cancels the document
     * scanner.
     * 
     * The delegate receives one of the following three calls:
     * 
     * -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFinishWith:)``
     * when the camera successfully completes a scan. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewControllerDidCancel(_:)``
     * when the user cancels out of the document camera interface. -
     * ``VisionKit/VNDocumentCameraViewControllerDelegate/documentCameraViewController(_:didFailWithError:)``
     * when the document scan fails or is unable to capture a photo.
     * 
     * Your app is responsible for dismissing the document camera in all delegate
     * callback methods.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) VNDocumentCameraViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
