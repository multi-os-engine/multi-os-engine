package apple.coremidi;

import apple.NSObject;
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
 * MIDIUMPFunctionBlock
 * 
 * An object representing a Function Block.
 * 
 * A Function Block encapsulates one or more UMP groups with a single function, allowing
 * agents communicating with that UMP Endpoint to route and process UMP traffic
 * properly. Unless the owning MIDIUMPEndpoint has a static Function Block configuration,
 * any Function Block metadata may change in response to a configuration change in the
 * owning UMP endpoint.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDIUMPFunctionBlock extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDIUMPFunctionBlock(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] MIDI1Info
     * 
     * MIDI 1.0 speed information.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("MIDI1Info")
    public native int MIDI1Info();

    /**
     * [@property] UIHint
     * 
     * A hint for UI about the primary usage of this Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("UIHint")
    public native int UIHint();

    /**
     * [@property] UMPEndpoint
     * 
     * The UMP Endpoint to which this Function Block is registered.
     * 
     * If the function block does not belong to an endpoint this property will be nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("UMPEndpoint")
    @Nullable
    public native MIDIUMPEndpoint UMPEndpoint();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDIUMPFunctionBlock alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDIUMPFunctionBlock allocWithZone(VoidPtr zone);

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

    /**
     * [@property] direction
     * 
     * The direction of the Function Block: input, output, or bidirectional.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("direction")
    public native int direction();

    /**
     * [@property] firstGroup
     * 
     * The first Group spanned by this Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("firstGroup")
    public native byte firstGroup();

    /**
     * [@property] functionBlockID
     * 
     * The device-unique ID for this Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("functionBlockID")
    public native byte functionBlockID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDIUMPFunctionBlock init();

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
     * [@property] isEnabled
     * 
     * The enable state of this Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] maxSysEx8Streams
     * 
     * The maximum number of simultaneous Sysex8 streams.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("maxSysEx8Streams")
    public native byte maxSysEx8Streams();

    /**
     * [@property] MIDICIDevice
     * 
     * Retrieve the MIDICIDevice class interface if the Function Block supports MIDI-CI.
     * 
     * If a Function Block was created as a MIDICIDevice object, this property will
     * provide an in-place MIDICIDevice interface that may be used with MIDI-CI API. If the
     * device was not created as a MIDICIDevice, this method returns nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("midiCIDevice")
    @Nullable
    public native MIDICIDevice midiCIDevice();

    /**
     * [@property] name
     * 
     * A string containing the Function Block's name.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native MIDIUMPFunctionBlock new_objc();

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

    /**
     * [@property] totalGroupsSpanned
     * 
     * The total number of groups spanned by this Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("totalGroupsSpanned")
    public native byte totalGroupsSpanned();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}