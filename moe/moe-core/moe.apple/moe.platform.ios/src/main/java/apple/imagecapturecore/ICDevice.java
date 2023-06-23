package apple.imagecapturecore;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.imagecapturecore.protocol.ICDeviceDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * ---------------------------------------------------------------------------------------------------------------------
 * ICDevice
 * 
 * ICDevice
 * 
 * ICDevice is an abstract class that represents a device supported by Image Capture facility. ImageCaptureCore defines
 * two concrete subclasses of ICDevice, ICCameraDevice and ICScannerDevice. ICDeviceBrowser creates instances of these
 * two subclasses to represent cameras and scanners it finds.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ICDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ICDevice(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] UUIDString
     * 
     * ￼A string representation of the Universally Unique ID of the device.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("UUIDString")
    public native String UUIDString();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICDevice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ICDevice allocWithZone(VoidPtr zone);

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

    /**
     * [@property] capabilities
     * 
     * ￼The capabilities of the device as reported by the device module.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("capabilities")
    public native NSArray<String> capabilities();

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
     * [@property] delegate
     * 
     * The delegate to receive messages once a session is opened on the device.
     * 
     * The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in
     * ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this
     * delegate can expect to receive are described by these protocols.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ICDeviceDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] hasOpenSession
     * 
     * ￼Indicates whether the device has an open session.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hasOpenSession")
    public native boolean hasOpenSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] icon
     * 
     * ￼Icon image for the device class. If there is no custom icon present from a device manufacturer, this will be a
     * rendered version of the system symbol for the device class. Using a rendered system symbol instead of the
     * systemSymbolName is discouraged.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("icon")
    public native CGImageRef icon();

    @Generated
    @Selector("init")
    public native ICDevice init();

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

    /**
     * [@property] name
     * 
     * ￼Name of the device as reported by the device module or by the device transport when a device module is not in
     * control of this device.
     * [@note] This name may change if the device module overrides the default name of the device reported by the
     * device's transport, or if the name of the filesystem volume mounted by the device is changed by the user.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native ICDevice new_objc();

    /**
     * [@property] productKind
     * 
     * ￼Type of the device. Possible values are: @"iPhone", @"iPod", @"iPad", @"Camera", @"Scanner"
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("productKind")
    public native String productKind();

    /**
     * requestCloseSession
     * 
     * This message requests to close a previously opened session on this device.
     * 
     * This request is completed when the delegate receives a "device:didCloseSessionWithError:" message.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestCloseSession")
    public native void requestCloseSession();

    /**
     * requestCloseSessionWithOptions:completion
     * 
     * This message requests to close a previously opened session on this device.
     * 
     * This request will execute the completion handler provided upon return.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestCloseSessionWithOptions:completion:")
    public native void requestCloseSessionWithOptionsCompletion(@Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_requestCloseSessionWithOptionsCompletion") Block_requestCloseSessionWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestCloseSessionWithOptionsCompletion {
        @Generated
        void call_requestCloseSessionWithOptionsCompletion(@Nullable NSError error);
    }

    /**
     * requestEject
     * 
     * Eject the media if permitted by the device, or disconnect from a remote device.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestEject")
    public native void requestEject();

    /**
     * requestEjectWithCompletion:
     * 
     * Eject the media, or disconnect the device - if permitted by the device.
     * 
     * This request will execute the completion handler provided upon return.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestEjectWithCompletion:")
    public native void requestEjectWithCompletion(
            @NotNull @ObjCBlock(name = "call_requestEjectWithCompletion") Block_requestEjectWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestEjectWithCompletion {
        @Generated
        void call_requestEjectWithCompletion(@Nullable NSError error);
    }

    /**
     * requestOpenSession
     * 
     * This message requests to open a session on the device.
     * 
     * Make sure the receiver's delegate is set prior to sending this message; otherwise this message will be ignored.
     * This request is completed when the delegate receives a "device:didOpenSessionWithError:" message.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestOpenSession")
    public native void requestOpenSession();

    /**
     * requestOpenSessionWithOptions:completion
     * 
     * This message requests to open a session on the device.
     * 
     * This request will execute the completion handler provided upon return.
     * [@note] The completion block will execute on an any available queue, often this will not be the main queue.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestOpenSessionWithOptions:completion:")
    public native void requestOpenSessionWithOptionsCompletion(@Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_requestOpenSessionWithOptionsCompletion") Block_requestOpenSessionWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestOpenSessionWithOptionsCompletion {
        @Generated
        void call_requestOpenSessionWithOptionsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] delegate
     * 
     * The delegate to receive messages once a session is opened on the device.
     * 
     * The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in
     * ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this
     * delegate can expect to receive are described by these protocols.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) ICDeviceDelegate value);

    /**
     * [@property] delegate
     * 
     * The delegate to receive messages once a session is opened on the device.
     * 
     * The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in
     * ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this
     * delegate can expect to receive are described by these protocols.
     * 
     * API-Since: 13.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) ICDeviceDelegate value) {
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

    /**
     * [@property] transportType
     * 
     * ￼The transport type used by the device. The possible values are: ICTransportTypeUSB or
     * ICTransportTypeMassStorage.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("transportType")
    public native String transportType();

    /**
     * [@property] type
     * 
     * ￼The type of the device as defined by ICDeviceType OR'd with its ICDeviceLocationType.
     * [@note] The type of this device can be obtained by AND'ing the value retuned by this property with an appropriate
     * ICDeviceTypeMask.
     * [@note] The location type of this device can be obtained by AND'ing the value retuned by this property with an
     * appropriate ICDeviceLocationTypeMask.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    /**
     * [@property] usbLocationID
     * 
     * ￼The USB location of which the device is occupying.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usbLocationID")
    public native int usbLocationID();

    /**
     * [@property] usbProductID
     * 
     * ￼The USB PID associated with the device attached.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usbProductID")
    public native int usbProductID();

    /**
     * [@property] usbVendorID
     * 
     * ￼The USB VID associated with the device attached.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usbVendorID")
    public native int usbVendorID();

    /**
     * [@property] userData
     * 
     * ￼Client convenience bookkeeping object retained by the framework.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] systemSymbolName
     * 
     * ￼Standard system symbol used to represent the device class. Using the symbol to render an appropriate device icon
     * will ensure proper scaling for high resolution devices.
     * 
     * API-Since: 15.2
     */
    @Nullable
    @Generated
    @Selector("systemSymbolName")
    public native String systemSymbolName();
}
