package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAUPresetEvent
 * 
 * The event class representing a preset load and change on the AVMusicTrack's destinationAudioUnit.
 * 
 * AVAUPresetEvents make it possible to schedule and/or automate preset changes on the audio unit
 * that has been configured as the destination for the AVMusicTrack containing this event.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAUPresetEvent extends AVMusicEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAUPresetEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAUPresetEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAUPresetEvent allocWithZone(VoidPtr zone);

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

    /**
     * [@property] element
     * The element index within the scope (see AudioUnitElement). This should usually be set to 0.
     */
    @Generated
    @Selector("element")
    public native int element();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAUPresetEvent init();

    /**
     * initWithScope:element:dictionary
     * 
     * Initialize the event with the scope, element, and dictionary for the preset.
     * 
     * The dictionary passed to this initializer will be copied and is not editable once the event is
     * created.
     * 
     * @param scope
     *                         The audio unit scope for the parameter (see AudioUnitScope). This should always be set to
     *                         Global.
     * @param element
     *                         The element index within the scope (see AudioUnitElement). This should usually be set to
     *                         0.
     * @param presetDictionary
     *                         An NSDictionary containing the preset. The audio unit will expect this to be a dictionary
     *                         structured as an appropriate audio unit preset.
     */
    @Generated
    @Selector("initWithScope:element:dictionary:")
    public native AVAUPresetEvent initWithScopeElementDictionary(int scope, int element,
            @NotNull NSDictionary<?, ?> presetDictionary);

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
    public static native AVAUPresetEvent new_objc();

    /**
     * [@property] presetDictionary
     * An NSDictionary containing the preset.
     */
    @NotNull
    @Generated
    @Selector("presetDictionary")
    public native NSDictionary<?, ?> presetDictionary();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] scope
     * The audio unit scope for the parameter (see AudioUnitScope). This should always be set to Global.
     */
    @Generated
    @Selector("scope")
    public native int scope();

    /**
     * [@property] element
     * The element index within the scope (see AudioUnitElement). This should usually be set to 0.
     */
    @Generated
    @Selector("setElement:")
    public native void setElement(int value);

    /**
     * [@property] scope
     * The audio unit scope for the parameter (see AudioUnitScope). This should always be set to Global.
     */
    @Generated
    @Selector("setScope:")
    public native void setScope(int value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}