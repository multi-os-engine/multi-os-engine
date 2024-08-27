package apple.factoryotanetworkutils;

import apple.NSObject;
import apple.factoryotanetworkutils.protocol.EZSocketSerialization;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EZSocket extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EZSocket(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EZSocket alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native EZSocket allocWithZone(VoidPtr zone);

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
    @Selector("close")
    public native void close();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("fileDescriptor")
    public native int fileDescriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native EZSocket init();

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

    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native EZSocket new_objc();

    /**
     * receiveData:
     * 
     * Blocking call that receives one message in the form of raw bytes. (internally calls read() in unistd.h)
     */
    @Generated
    @Selector("receiveData:")
    @Nullable
    public native NSData receiveData(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    /**
     * receiveDataWithTimeout:error:
     * 
     * Same as receiveData: but uses select to check if data is received within the specified timeout.
     * A timeout value of < 0 is the same as receiveData: which is an indefinite blocking call
     */
    @Generated
    @Selector("receiveDataWithTimeout:error:")
    @Nullable
    public native NSData receiveDataWithTimeoutError(double timeout,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * receiveMessage:
     * 
     * Blocking call that receives one deserialized message (internally calls receiveData:)
     */
    @Generated
    @Selector("receiveMessage:")
    @Nullable
    public native NSDictionary<?, ?> receiveMessage(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    /**
     * receiveMessageWithTimeout:error:
     * 
     * Same as receiveMessage: but uses select to check if message is received within the specified timeout.
     * A timeout value of < 0 is the same as receiveMessage: which is an indefinite blocking call
     */
    @Generated
    @Selector("receiveMessageWithTimeout:error:")
    @Nullable
    public native NSDictionary<?, ?> receiveMessageWithTimeoutError(double timeout,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * sendData:error:
     * 
     * Sends a message in the form of raw bytes synchronously, without serialization. (internally calls write() in
     * unistd.h)
     * This method can be called from multiple threads.
     */
    @Generated
    @Selector("sendData:error:")
    public native boolean sendDataError(@NotNull NSData data,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    /**
     * sendMessage:error:
     * 
     * Serializes a message and sends synchronously (internally calls sendData:error:)
     * Serializes using the serializer property if set, otherwise uses a default serialization (with NSKeyedArchiver and
     * NSKeyedUnarchiver).
     * This method can be called from multiple threads.
     */
    @Generated
    @Selector("sendMessage:error:")
    public native boolean sendMessageError(@NotNull NSDictionary<?, ?> msg,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    @Generated
    @Selector("serializer")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native EZSocketSerialization serializer();

    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    @Generated
    @Selector("setSerializer:")
    public native void setSerializer(@Mapped(ObjCObjectMapper.class) @NotNull EZSocketSerialization value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * will not close fd on dealloc
     */
    @Generated
    @Selector("socketWithFileDescriptor:")
    public static native EZSocket socketWithFileDescriptor(int fd);

    @Generated
    @Selector("socketWithFileDescriptor:closeOnDealloc:")
    public static native EZSocket socketWithFileDescriptorCloseOnDealloc(int fd, boolean cod);

    /**
     * socketWithURL:error:
     * 
     * Opens an active socket connection according to the URL.
     * Currently supported schemes:
     * - tcp://host:port
     * - unix://filepath
     */
    @Generated
    @Selector("socketWithURL:error:")
    public static native EZSocket socketWithURLError(@NotNull NSURL url,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("url")
    @NotNull
    public native NSURL url();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}