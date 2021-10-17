package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * Cluster Media Playback
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPMediaPlayback extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPMediaPlayback(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPMediaPlayback alloc();

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
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

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
    public native CHIPMediaPlayback init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPMediaPlayback initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("mediaFastForward:")
    public native void mediaFastForward(
            @ObjCBlock(name = "call_mediaFastForward") Block_mediaFastForward responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaFastForward {
        @Generated
        void call_mediaFastForward(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaNext:")
    public native void mediaNext(@ObjCBlock(name = "call_mediaNext") Block_mediaNext responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaNext {
        @Generated
        void call_mediaNext(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaPause:")
    public native void mediaPause(@ObjCBlock(name = "call_mediaPause") Block_mediaPause responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaPause {
        @Generated
        void call_mediaPause(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaPlay:")
    public native void mediaPlay(@ObjCBlock(name = "call_mediaPlay") Block_mediaPlay responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaPlay {
        @Generated
        void call_mediaPlay(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaPrevious:")
    public native void mediaPrevious(@ObjCBlock(name = "call_mediaPrevious") Block_mediaPrevious responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaPrevious {
        @Generated
        void call_mediaPrevious(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaRewind:")
    public native void mediaRewind(@ObjCBlock(name = "call_mediaRewind") Block_mediaRewind responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaRewind {
        @Generated
        void call_mediaRewind(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaSkipBackward:responseHandler:")
    public native void mediaSkipBackwardResponseHandler(long deltaPositionMilliseconds,
            @ObjCBlock(name = "call_mediaSkipBackwardResponseHandler") Block_mediaSkipBackwardResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaSkipBackwardResponseHandler {
        @Generated
        void call_mediaSkipBackwardResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaSkipForward:responseHandler:")
    public native void mediaSkipForwardResponseHandler(long deltaPositionMilliseconds,
            @ObjCBlock(name = "call_mediaSkipForwardResponseHandler") Block_mediaSkipForwardResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaSkipForwardResponseHandler {
        @Generated
        void call_mediaSkipForwardResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaSkipSeek:responseHandler:")
    public native void mediaSkipSeekResponseHandler(long position,
            @ObjCBlock(name = "call_mediaSkipSeekResponseHandler") Block_mediaSkipSeekResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaSkipSeekResponseHandler {
        @Generated
        void call_mediaSkipSeekResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaStartOver:")
    public native void mediaStartOver(@ObjCBlock(name = "call_mediaStartOver") Block_mediaStartOver responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaStartOver {
        @Generated
        void call_mediaStartOver(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("mediaStop:")
    public native void mediaStop(@ObjCBlock(name = "call_mediaStop") Block_mediaStop responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_mediaStop {
        @Generated
        void call_mediaStop(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
