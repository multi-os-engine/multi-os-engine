package apple.mediaplayer;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * API-Since: 10.3
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMusicPlayerApplicationController extends MPMusicPlayerController {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMusicPlayerApplicationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMusicPlayerApplicationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMusicPlayerApplicationController allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("applicationMusicPlayer")
    public static native MPMusicPlayerController applicationMusicPlayer();

    @NotNull
    @Generated
    @Selector("applicationQueuePlayer")
    public static native MPMusicPlayerApplicationController applicationQueuePlayer();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Deprecated
    @Selector("iPodMusicPlayer")
    public static native MPMusicPlayerController iPodMusicPlayer();

    @Generated
    @Selector("init")
    public native MPMusicPlayerApplicationController init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native MPMusicPlayerApplicationController new_objc();

    @Generated
    @Selector("performQueueTransaction:completionHandler:")
    public native void performQueueTransactionCompletionHandler(
            @NotNull @ObjCBlock(name = "call_performQueueTransactionCompletionHandler_0") Block_performQueueTransactionCompletionHandler_0 queueTransaction,
            @NotNull @ObjCBlock(name = "call_performQueueTransactionCompletionHandler_1") Block_performQueueTransactionCompletionHandler_1 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performQueueTransactionCompletionHandler_0 {
        @Generated
        void call_performQueueTransactionCompletionHandler_0(@NotNull MPMusicPlayerControllerMutableQueue queue);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performQueueTransactionCompletionHandler_1 {
        @Generated
        void call_performQueueTransactionCompletionHandler_1(@NotNull MPMusicPlayerControllerQueue queue,
                @Nullable NSError error);
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

    @NotNull
    @Generated
    @Selector("systemMusicPlayer")
    public static native MPMusicPlayerController systemMusicPlayer();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
