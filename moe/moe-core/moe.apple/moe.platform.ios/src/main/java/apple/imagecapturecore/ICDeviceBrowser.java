package apple.imagecapturecore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.imagecapturecore.protocol.ICDeviceBrowserDelegate;
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

/**
 * -------------------------------------------------------------------------------------------------------------- ICDeviceBrowser
 * <p>
 * ICDeviceBrowser
 * <p>
 * The ICDeviceBrowser object is used to find devices such as digital cameras and scanners that are supported by Image Capture. These device may be directly attached to the USB or FireWire bus on the host computer, or available over a TCP/IP network. This object communicates with an Image Capture agent process asynchronously to accomplish this.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICDeviceBrowser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ICDeviceBrowser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICDeviceBrowser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ICDeviceBrowser allocWithZone(VoidPtr zone);

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

    /**
     * [@property] delegate
     * <p>
     * The delegate. It must conform to ICDeviceBrowserDelegate protocol. The messages this delegate can expect to receive are described by ICDeviceBrowserDelegate protocol.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ICDeviceBrowserDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] devices
     * <p>
     * All devices found by the browser. This property will change as devices appear and disappear. This array is empty before the first invocation of the delegate method 'deviceBrowser:didAddDevice:moreComing:'.
     */
    @Generated
    @Selector("devices")
    public native NSArray<? extends ICDevice> devices();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * init
     * <p>
     * This is the designated initializer.
     */
    @Generated
    @Selector("init")
    public native ICDeviceBrowser init();

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
     * [@property] browsing
     * <p>
     * Indicates whether the device browser is browsing for devices.
     */
    @Generated
    @Selector("isBrowsing")
    public native boolean isBrowsing();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ICDeviceBrowser new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] delegate
     * <p>
     * The delegate. It must conform to ICDeviceBrowserDelegate protocol. The messages this delegate can expect to receive are described by ICDeviceBrowserDelegate protocol.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) ICDeviceBrowserDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The delegate. It must conform to ICDeviceBrowserDelegate protocol. The messages this delegate can expect to receive are described by ICDeviceBrowserDelegate protocol.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) ICDeviceBrowserDelegate value) {
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

    /**
     * start:
     * <p>
     * This message tells the receiver to start looking for devices.
     * <p>
     * Make sure that the receiver's delegate is set prior to sending this message; otherwise this message will be ignored. The messages the delegate can expect to receive are described by ICDeviceBrowserDelegate protocol.
     */
    @Generated
    @Selector("start")
    public native void start();

    /**
     * stop:
     * <p>
     * This method tells the receiver to stop looking for devices.
     * <p>
     * This will free all device instances that are not in use.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * contentsAuthorizationStatus
     * <p>
     * This method returns a constant indicating whether the app has permission to acces the contents of an attached media device.
     * <p>
     * A constant indicating authorization status.
     */
    @Generated
    @Selector("contentsAuthorizationStatus")
    public native String contentsAuthorizationStatus();

    /**
     * controlAuthorizationStatus
     * <p>
     * This method returns a constant indicating whether the app has permission to control the attached camera device.
     */
    @Generated
    @Selector("controlAuthorizationStatus")
    public native String controlAuthorizationStatus();

    /**
     * [@property] suspended
     * <p>
     * Indicates whether the  devices in the browser have suspended communication.
     */
    @Generated
    @Selector("isSuspended")
    public native boolean isSuspended();

    /**
     * requestContentsAuthorizationWithCompletion:
     * <p>
     * This method requests the user’s permission, if needed, for accessing the conents of an external media device.
     */
    @Generated
    @Selector("requestContentsAuthorizationWithCompletion:")
    public native void requestContentsAuthorizationWithCompletion(
            @ObjCBlock(name = "call_requestContentsAuthorizationWithCompletion") Block_requestContentsAuthorizationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestContentsAuthorizationWithCompletion {
        @Generated
        void call_requestContentsAuthorizationWithCompletion(String status);
    }

    /**
     * requestControlAuthorizationWithCompletion:
     * <p>
     * This method requests the user’s permission, if needed, for controlling the attached camera device.
     */
    @Generated
    @Selector("requestControlAuthorizationWithCompletion:")
    public native void requestControlAuthorizationWithCompletion(
            @ObjCBlock(name = "call_requestControlAuthorizationWithCompletion") Block_requestControlAuthorizationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestControlAuthorizationWithCompletion {
        @Generated
        void call_requestControlAuthorizationWithCompletion(String status);
    }

    /**
     * resetContentsAuthorizationWithCompletion:
     * <p>
     * This method resets the authorization status for the application accessing the conents of an external media device.
     */
    @Generated
    @Selector("resetContentsAuthorizationWithCompletion:")
    public native void resetContentsAuthorizationWithCompletion(
            @ObjCBlock(name = "call_resetContentsAuthorizationWithCompletion") Block_resetContentsAuthorizationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetContentsAuthorizationWithCompletion {
        @Generated
        void call_resetContentsAuthorizationWithCompletion(String status);
    }

    /**
     * resetControlAuthorizationWithCompletion:
     * <p>
     * This method resets the authorization status for the application controlling the attached camera device.
     * <p>
     * If the application already has been granted camera access, this will reset only the presentation dialog letting the user know the app has permission, not the camera access itself.
     */
    @Generated
    @Selector("resetControlAuthorizationWithCompletion:")
    public native void resetControlAuthorizationWithCompletion(
            @ObjCBlock(name = "call_resetControlAuthorizationWithCompletion") Block_resetControlAuthorizationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetControlAuthorizationWithCompletion {
        @Generated
        void call_resetControlAuthorizationWithCompletion(String status);
    }
}
