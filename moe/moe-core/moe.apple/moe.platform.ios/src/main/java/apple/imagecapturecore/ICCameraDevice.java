package apple.imagecapturecore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.imagecapturecore.protocol.ICCameraDeviceDownloadDelegate;
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
public class ICCameraDevice extends ICDevice {
    static {
        NatJ.register();
    }

    @Generated
    protected ICCameraDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ICCameraDevice alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("batteryLevel")
    @NUInt
    public native long batteryLevel();

    @Generated
    @Selector("batteryLevelAvailable")
    public native boolean batteryLevelAvailable();

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
    @Selector("contentCatalogPercentCompleted")
    @NUInt
    public native long contentCatalogPercentCompleted();

    @Generated
    @Selector("contents")
    public native NSArray<? extends ICCameraItem> contents();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("filesOfType:")
    public native NSArray<String> filesOfType(String fileUTType);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("iCloudPhotosEnabled")
    public native boolean iCloudPhotosEnabled();

    @Generated
    @Selector("init")
    public native ICCameraDevice init();

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
    @Selector("isAccessRestrictedAppleDevice")
    public native boolean isAccessRestrictedAppleDevice();

    @Generated
    @Selector("isEjectable")
    public native boolean isEjectable();

    @Generated
    @Selector("isLocked")
    public native boolean isLocked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("mediaFiles")
    public native NSArray<? extends ICCameraItem> mediaFiles();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("ptpEventHandler")
    @ObjCBlock(name = "call_ptpEventHandler_ret")
    public native Block_ptpEventHandler_ret ptpEventHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_ptpEventHandler_ret {
        @Generated
        void call_ptpEventHandler_ret(NSData arg0);
    }

    @Generated
    @Selector("requestDeleteFiles:")
    public native void requestDeleteFiles(NSArray<? extends ICCameraItem> files);

    @Generated
    @Selector("requestDeleteFiles:deleteFailed:completion:")
    public native NSProgress requestDeleteFilesDeleteFailedCompletion(NSArray<? extends ICCameraItem> files,
            @ObjCBlock(name = "call_requestDeleteFilesDeleteFailedCompletion_1") Block_requestDeleteFilesDeleteFailedCompletion_1 deleteFailed,
            @ObjCBlock(name = "call_requestDeleteFilesDeleteFailedCompletion_2") Block_requestDeleteFilesDeleteFailedCompletion_2 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDeleteFilesDeleteFailedCompletion_1 {
        @Generated
        void call_requestDeleteFilesDeleteFailedCompletion_1(NSDictionary<String, ? extends ICCameraItem> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestDeleteFilesDeleteFailedCompletion_2 {
        @Generated
        void call_requestDeleteFilesDeleteFailedCompletion_2(
                NSDictionary<String, ? extends NSArray<? extends ICCameraItem>> arg0, NSError arg1);
    }

    @Generated
    @Selector("requestDownloadFile:options:downloadDelegate:didDownloadSelector:contextInfo:")
    public native void requestDownloadFileOptionsDownloadDelegateDidDownloadSelectorContextInfo(ICCameraFile file,
            NSDictionary<String, ?> options,
            @Mapped(ObjCObjectMapper.class) ICCameraDeviceDownloadDelegate downloadDelegate, SEL selector,
            VoidPtr contextInfo);

    @Generated
    @Selector("requestSendPTPCommand:outData:completion:")
    public native void requestSendPTPCommandOutDataCompletion(NSData ptpCommand, NSData ptpData,
            @ObjCBlock(name = "call_requestSendPTPCommandOutDataCompletion") Block_requestSendPTPCommandOutDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSendPTPCommandOutDataCompletion {
        @Generated
        void call_requestSendPTPCommandOutDataCompletion(NSData arg0, NSData arg1, NSError arg2);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setPtpEventHandler:")
    public native void setPtpEventHandler(@ObjCBlock(name = "call_setPtpEventHandler") Block_setPtpEventHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPtpEventHandler {
        @Generated
        void call_setPtpEventHandler(NSData arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("tetheredCaptureEnabled")
    public native boolean tetheredCaptureEnabled();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}