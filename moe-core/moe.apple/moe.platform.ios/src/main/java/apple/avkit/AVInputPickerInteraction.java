package apple.avkit;

import apple.NSObject;
import apple.avfaudio.AVAudioSession;
import apple.avkit.protocol.AVInputPickerInteractionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.protocol.UIInteraction;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Use `AVInputPickerInteraction` to present an input picker.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVInputPickerInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVInputPickerInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVInputPickerInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVInputPickerInteraction allocWithZone(VoidPtr zone);

    /**
     * The audio session for the picker.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("audioSession")
    @NotNull
    public native AVAudioSession audioSession();

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

    /**
     * The input picker view's delegate.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVInputPickerInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    /**
     * Dismisses the input picker.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dismiss")
    public native void dismiss();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a new instance of AVInputPickerController using a default sharedInstance from `AVAudioSession`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native AVInputPickerInteraction init();

    /**
     * Creates a new instance of AVInputPickerInteraction using a specific `AVAudioSession`.
     * 
     * Use this initializer when the provided `AVAudioSession` is in .record
     * mode or you plan to switch it to record mode.
     * 
     * If nil session is passed in object will use a sharedInstance from `AVAudioSession`.
     * 
     * - Parameter audioSession: An optional recording configured audio session. If you provide a non-recording session,
     * the input list will be empty.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithAudioSession:")
    public native AVInputPickerInteraction initWithAudioSession(@Nullable AVAudioSession audioSession);

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
     * A Boolean value that indicates whether the picker is currently visible.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isPresented")
    public native boolean isPresented();

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
    public static native AVInputPickerInteraction new_objc();

    /**
     * Presents the input picker.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("present")
    public native void present();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The audio session for the picker.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAudioSession:")
    public native void setAudioSession(@NotNull AVAudioSession value);

    /**
     * The input picker view's delegate.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable AVInputPickerInteractionDelegate value);

    /**
     * The input picker view's delegate.
     * 
     * API-Since: 26.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable AVInputPickerInteractionDelegate value) {
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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    @Nullable
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);
}