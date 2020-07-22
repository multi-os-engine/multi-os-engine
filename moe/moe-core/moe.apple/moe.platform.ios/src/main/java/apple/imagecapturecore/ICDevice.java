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

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ICDeviceDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hasOpenSession")
    public native boolean hasOpenSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("productKind")
    public native String productKind();

    @Generated
    @Selector("requestCloseSession")
    public native void requestCloseSession();

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

    @Generated
    @Selector("requestEject")
    public native void requestEject();

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

    @Generated
    @Selector("requestOpenSession")
    public native void requestOpenSession();

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

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) ICDeviceDelegate value);

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

    @Generated
    @Selector("transportType")
    public native String transportType();

    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    @Generated
    @Selector("usbLocationID")
    public native int usbLocationID();

    @Generated
    @Selector("usbProductID")
    public native int usbProductID();

    @Generated
    @Selector("usbVendorID")
    public native int usbVendorID();

    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}