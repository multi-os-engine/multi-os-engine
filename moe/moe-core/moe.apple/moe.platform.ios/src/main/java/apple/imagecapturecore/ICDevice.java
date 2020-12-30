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

/**
 * --------------------------------------------------------------------------------------------------------------------- ICDevice
 * @class ICDevice
 * @abstract ICDevice is an abstract class that represents a device supported by Image Capture facility. ImageCaptureCore defines two concrete subclasses of ICDevice, ICCameraDevice and ICScannerDevice. ICDeviceBrowser creates instances of these two subclasses to represent cameras and scanners it finds.
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
     * @property UUIDString
     * @abstract ￼A string representation of the Universally Unique ID of the device.
     */
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

    /**
     * @property capabilities
     * @abstract ￼The capabilities of the device as reported by the device module.
     */
    @Generated
    @Selector("capabilities")
    public native NSArray<String> capabilities();

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
     * @property delegate
     * @abstract The delegate to receive messages once a session is opened on the device.
     * @discussion The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this delegate can expect to receive are described by these protocols.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ICDeviceDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @property hasOpenSession
     * @abstract ￼Indicates whether the device has an open session.
     */
    @Generated
    @Selector("hasOpenSession")
    public native boolean hasOpenSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * @property icon
     * @abstract ￼Icon image for the device class.  If there is no custom icon present from a device manufacturer, this will be a rendered version of the system symbol for the device class.  Using a rendered system symbol instead of the systemSymbolName is discouraged.
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * @property name
     * @abstract ￼Name of the device as reported by the device module or by the device transport when a device module is not in control of this device.
     * @note This name may change if the device module overrides the default name of the device reported by the device's transport, or if the name of the filesystem volume mounted by the device is changed by the user.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @property productKind
     * @abstract ￼Type of the device. Possible values are: @"iPhone", @"iPod", @"iPad", @"Camera", @"Scanner"
     */
    @Generated
    @Selector("productKind")
    public native String productKind();

    /**
     * @method requestCloseSession
     * @abstract This message requests to close a previously opened session on this device.
     * @discussion This request is completed when the delegate receives a "device:didCloseSessionWithError:" message.
     * @note Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("requestCloseSession")
    public native void requestCloseSession();

    /**
     * @method requestCloseSessionWithOptions:completion
     * @abstract This message requests to close a previously opened session on this device.
     * @discussion This request will execute the completion handler provided upon return.
     * @note The completion block will execute on an any available queue, often this will not be the main queue.
     */
    @Generated
    @Selector("requestCloseSessionWithOptions:completion:")
    public native void requestCloseSessionWithOptionsCompletion(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_requestCloseSessionWithOptionsCompletion") Block_requestCloseSessionWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestCloseSessionWithOptionsCompletion {
        @Generated
        void call_requestCloseSessionWithOptionsCompletion(NSError error);
    }

    /**
     * @method requestEject
     * @abstract Eject the media if permitted by the device, or disconnect from a remote device.
     */
    @Generated
    @Selector("requestEject")
    public native void requestEject();

    /**
     * @method requestEjectWithCompletion:
     * @abstract Eject the media, or disconnect the device - if permitted by the device.
     * @discussion This request will execute the completion handler provided upon return.
     * @note The completion block will execute on an any available queue, often this will not be the main queue.
     */
    @Generated
    @Selector("requestEjectWithCompletion:")
    public native void requestEjectWithCompletion(
            @ObjCBlock(name = "call_requestEjectWithCompletion") Block_requestEjectWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestEjectWithCompletion {
        @Generated
        void call_requestEjectWithCompletion(NSError error);
    }

    /**
     * @method requestOpenSession
     * @abstract This message requests to open a session on the device.
     * @discussion Make sure the receiver's delegate is set prior to sending this message; otherwise this message will be ignored. This request is completed when the delegate receives a "device:didOpenSessionWithError:" message.
     * @note Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("requestOpenSession")
    public native void requestOpenSession();

    /**
     * @method requestOpenSessionWithOptions:completion
     * @abstract This message requests to open a session on the device.
     * @discussion This request will execute the completion handler provided upon return.
     * @note The completion block will execute on an any available queue, often this will not be the main queue.
     */
    @Generated
    @Selector("requestOpenSessionWithOptions:completion:")
    public native void requestOpenSessionWithOptionsCompletion(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_requestOpenSessionWithOptionsCompletion") Block_requestOpenSessionWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestOpenSessionWithOptionsCompletion {
        @Generated
        void call_requestOpenSessionWithOptionsCompletion(NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property delegate
     * @abstract The delegate to receive messages once a session is opened on the device.
     * @discussion The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this delegate can expect to receive are described by these protocols.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) ICDeviceDelegate value);

    /**
     * @property delegate
     * @abstract The delegate to receive messages once a session is opened on the device.
     * @discussion The delegate must conform ICDeviceDelegate protocol. In addition it should respond to selectors defined in ICCameraDeviceDelegate protocol in order to effectively interact with the device object. The messages this delegate can expect to receive are described by these protocols.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) ICDeviceDelegate value) {
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
     * @property transportType
     * @abstract ￼The transport type used by the device. The possible values are: ICTransportTypeUSB or ICTransportTypeMassStorage.
     */
    @Generated
    @Selector("transportType")
    public native String transportType();

    /**
     * @property type
     * @abstract ￼The type of the device as defined by ICDeviceType OR'd with its ICDeviceLocationType.
     * @note The type of this device can be obtained by AND'ing the value retuned by this property with an appropriate ICDeviceTypeMask.
     * @note The location type of this device can be obtained by AND'ing the value retuned by this property with an appropriate ICDeviceLocationTypeMask.
     */
    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    /**
     * @property usbLocationID
     * @abstract ￼The USB location of which the device is occupying.
     */
    @Generated
    @Selector("usbLocationID")
    public native int usbLocationID();

    /**
     * @property usbProductID
     * @abstract ￼The USB PID associated with the device attached.
     */
    @Generated
    @Selector("usbProductID")
    public native int usbProductID();

    /**
     * @property usbVendorID
     * @abstract ￼The USB VID associated with the device attached.
     */
    @Generated
    @Selector("usbVendorID")
    public native int usbVendorID();

    /**
     * @property userData
     * @abstract ￼Client convenience bookkeeping object retained by the framework.
     */
    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}