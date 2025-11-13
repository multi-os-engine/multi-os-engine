package apple.avrouting;

import apple.NSObject;
import apple.avrouting.protocol.AVRoutingPlaybackParticipant;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * An object that manages playback routing preferences.
 * 
 * This object manages instances of ``AVRoutingPlaybackParticipant`` for arbitration of media playback routing
 * priorities and preferences on restricted playback interfaces. The playback routing arbiter is responsible for
 * collecting and applying preferences, such as priorities in non-mixable audio routes and external playback states
 * where the number of allowed players is limited.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVRoutingPlaybackArbiter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVRoutingPlaybackArbiter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVRoutingPlaybackArbiter alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVRoutingPlaybackArbiter allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVRoutingPlaybackArbiter init();

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
    @Owned
    @Selector("new")
    public static native AVRoutingPlaybackArbiter new_objc();

    /**
     * The participant that has priority to play on external playback interfaces.
     * 
     * This participant takes precedence over all others to play on external playback interfaces (specifically for
     * AirPlay video and Apple Lightning Digital AV Adapters).
     * 
     * By default, this value is `nil`. When the value is `nil`, the arbiter doesn't impose any priority on the
     * participants, and the participant that is selected to playback externally falls back to the existing selection
     * mechanism.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("preferredParticipantForExternalPlayback")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native AVRoutingPlaybackParticipant preferredParticipantForExternalPlayback();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The participant that has priority to play on external playback interfaces.
     * 
     * This participant takes precedence over all others to play on external playback interfaces (specifically for
     * AirPlay video and Apple Lightning Digital AV Adapters).
     * 
     * By default, this value is `nil`. When the value is `nil`, the arbiter doesn't impose any priority on the
     * participants, and the participant that is selected to playback externally falls back to the existing selection
     * mechanism.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPreferredParticipantForExternalPlayback:")
    public native void setPreferredParticipantForExternalPlayback_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable AVRoutingPlaybackParticipant value);

    /**
     * The participant that has priority to play on external playback interfaces.
     * 
     * This participant takes precedence over all others to play on external playback interfaces (specifically for
     * AirPlay video and Apple Lightning Digital AV Adapters).
     * 
     * By default, this value is `nil`. When the value is `nil`, the arbiter doesn't impose any priority on the
     * participants, and the participant that is selected to playback externally falls back to the existing selection
     * mechanism.
     * 
     * API-Since: 26.0
     */
    @Generated
    public void setPreferredParticipantForExternalPlayback(
            @Mapped(ObjCObjectMapper.class) @Nullable AVRoutingPlaybackParticipant value) {
        Object __old = preferredParticipantForExternalPlayback();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPreferredParticipantForExternalPlayback_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns the singleton playback arbiter instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("sharedRoutingPlaybackArbiter")
    @NotNull
    public static native AVRoutingPlaybackArbiter sharedRoutingPlaybackArbiter();

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
}