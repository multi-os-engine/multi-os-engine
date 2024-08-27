package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVExternalStorageDevice
 * 
 * An AVExternalStorageDevice represents a physical external storage device connected to the device that can be used to
 * store captured media assets.
 * 
 * Each instance of AVExternalStorageDevice corresponds to a physical external storage device where captured media
 * assets can be stored. Instances of AVExternalStorageDevice cannot be created directly. An array of all currently
 * available external storage devices can be obtained using AVExternalStorageDeviceDiscoverySession.
 * 
 * Instances of AVExternalStorageDevice can be used with AVCaptureFileOutput subclasses for writing media files.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVExternalStorageDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVExternalStorageDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVExternalStorageDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVExternalStorageDevice allocWithZone(VoidPtr zone);

    /**
     * [@property] authorizationStatus
     * 
     * Returns the client's authorization status for capturing onto an external storage device connected to this device.
     * 
     * This method returns the AVAuthorizationStatus of the client for capturing onto an external storage device
     * connected to this device. If the status is AVAuthorizationStatusNotDetermined, you may use the
     * +requestAccessWithCompletionHandler: method to request access by prompting the user.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] displayName
     * 
     * Display name of the external storage device.
     * 
     * This property can be used for displaying the name of an external storage device in a user interface. Will return
     * nil if we fail to extract information from external storage device.
     */
    @Generated
    @Selector("displayName")
    @Nullable
    public native String displayName();

    /**
     * [@property] freeSize
     * 
     * Current free size in bytes.
     * 
     * This property represents the free size available on the external storage device. Will return -1 if we fail to
     * extract information from external storage device.
     */
    @Generated
    @Selector("freeSize")
    @NInt
    public native long freeSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVExternalStorageDevice init();

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
     * [@property] connected
     * 
     * Indicates whether the external storage device is connected and available to the system.
     * 
     * The property gives the current connection status of the external storage device.
     */
    @Generated
    @Selector("isConnected")
    public native boolean isConnected();

    /**
     * [@property] notRecommendedForCaptureUse
     * 
     * Indicates whether the external storage device is not recommended for capture use.
     * 
     * This property is used to let the client know if the external storage device is not suitable for camera capture.
     */
    @Generated
    @Selector("isNotRecommendedForCaptureUse")
    public native boolean isNotRecommendedForCaptureUse();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVExternalStorageDevice new_objc();

    /**
     * nextAvailableURLsWithPathExtensions:error:
     * 
     * Next available security-scoped, DCF compliant URL array with different path extensions.
     * 
     * Configures the folder structure (create a DCIM folder if there isn't one already) on the external storage device
     * to provide the next available unique DCF compliant security-scoped URL array with different path extensions.
     * 
     * Security-scoped URL requires the use of startAccessingSecurityScopedResource, and
     * stopAccessingSecurityScopedResource for access.
     * [nextAvailableURL startAccessingSecurityScopedResource];
     * . . .
     * // your code to capture image / video
     * . . .
     * [nextAvailableURL stopAccessingSecurityScopedResource];
     * 
     * Use the +requestAccessWithCompletionHandler: method to request access to external storage device before getting
     * the next available URL array else an error will be thrown.
     * 
     * @param extensionArray
     *                       An array of path extensions for the next available URL requested.
     * @param outError
     *                       An out parameter with error information indicating why the URL could not be provided. If
     *                       this method is successful, error will be nil.
     * @return
     *         An array of DCF compliant security-scoped URL with all the path extensions requested.
     */
    @Generated
    @Selector("nextAvailableURLsWithPathExtensions:error:")
    @Nullable
    public native NSArray<? extends NSURL> nextAvailableURLsWithPathExtensionsError(
            @NotNull NSArray<String> extensionArray,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> outError);

    /**
     * requestAccessWithCompletionHandler:
     * 
     * Requests access to capture onto an external storage device connected to this device, showing a dialog to the user
     * if necessary.
     * 
     * Use this method to request access to capture onto an external storage device connected to this device.
     * 
     * This call will not block while the user is being asked for access, allowing the client to continue running. Until
     * access has been granted, trying to capture into detected external storage devices will result in an error. The
     * user is only asked for permission the first time the client requests access, later calls use the authorization
     * status selected by the user.
     * 
     * The completion handler is called on an arbitrary dispatch queue. It is the client's responsibility to ensure that
     * any UIKit-related updates are called on the main queue or main thread as a result.
     * 
     * @param handler
     *                A completion handler block called with the result of requesting access to capture onto an external
     *                storage device.
     */
    @Generated
    @Selector("requestAccessWithCompletionHandler:")
    public static native void requestAccessWithCompletionHandler(
            @ObjCBlock(name = "call_requestAccessWithCompletionHandler") @NotNull Block_requestAccessWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessWithCompletionHandler {
        @Generated
        void call_requestAccessWithCompletionHandler(boolean granted);
    }

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

    /**
     * [@property] totalSize
     * 
     * Total storage size in bytes.
     * 
     * This property represents the total storage size available on the external storage device. Will return -1 if we
     * fail to extract information from external storage device.
     */
    @Generated
    @Selector("totalSize")
    @NInt
    public native long totalSize();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * [@property] uuid
     * 
     * A unique identifier for external storage device.
     * 
     * This property can be used to select a specific external storage device with ImageCapture framework APIs to read
     * media assets. Will return nil if we fail to extract information from external storage device.
     * For example the string value of this property will match the value from [ICDevice UUIDString].
     */
    @Generated
    @Selector("uuid")
    @Nullable
    public native NSUUID uuid();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}