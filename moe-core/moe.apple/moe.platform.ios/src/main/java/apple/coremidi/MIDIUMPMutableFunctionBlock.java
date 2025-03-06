package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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

/**
 * MIDIUMPMutableFunctionBlock
 * 
 * A mutable Function Block object created by the client process.
 * 
 * A Function Block created with this API may be used in the Function Block configuration
 * of a client-created MIDIUMPMutableEndpoint.
 * 
 * This API is not realtime-safe, all interaction with the function block should be done on the
 * main thread.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDIUMPMutableFunctionBlock extends MIDIUMPFunctionBlock {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDIUMPMutableFunctionBlock(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] UMPEndpoint
     * 
     * The UMP Endpoint to which this Function Block is registered.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("UMPEndpoint")
    @Nullable
    public native MIDIUMPMutableEndpoint UMPEndpoint();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDIUMPMutableFunctionBlock alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDIUMPMutableFunctionBlock allocWithZone(VoidPtr zone);

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
    public native MIDIUMPMutableFunctionBlock init();

    /**
     * initWithName:direction:firstGroup:totalGroupsSpanned:maxSysEx8Streams:MIDI1Info:UIHint:isEnabled:
     * 
     * The initializer for constructing a Function Block.
     * 
     * This operation will fail if virtual MIDI endpoint creation is not allowed
     * (for example, on iOS, if your app doesn't list 'audio' in UIBackgroundModes).
     * 
     * API-Since: 18.0
     * 
     * @param name               The Function Block name.
     * @param direction          The directionality of the Function Block.
     * @param firstGroup         The first UMP Group supported by the Function Block.
     * @param totalGroupsSpanned The number of UMP groups spanned by the Function Block.
     * @param maxSysEx8Streams   The maximum number of simultaneous Sysex8 streams.
     * @param MIDI1Info          The MIDI 1.0 speed information for the Function Block.
     * @param UIHint             A UI hint for the Function Block.
     * @param isEnabled          The enable state of the Function Block.
     */
    @Generated
    @Selector("initWithName:direction:firstGroup:totalGroupsSpanned:maxSysEx8Streams:MIDI1Info:UIHint:isEnabled:")
    public native MIDIUMPMutableFunctionBlock initWithNameDirectionFirstGroupTotalGroupsSpannedMaxSysEx8StreamsMIDI1InfoUIHintIsEnabled(
            @NotNull String name, int direction, byte firstGroup, byte totalGroupsSpanned, byte maxSysEx8Streams,
            int MIDI1Info, int UIHint, boolean isEnabled);

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
    public static native MIDIUMPMutableFunctionBlock new_objc();

    /**
     * reconfigureWithFirstGroup:direction:MIDI1Info:UIHint:error
     * 
     * Reconfigure a Function Block.
     * 
     * If a mutable Function Block has not been registered to a CI device or was registered in
     * a non-static Function Block configuration, the first Group can be changed if the final
     * Group spanned by the Function Block is valid after the Function Block has been
     * relocated.
     * Returns YES if the first Group of the Function Block was changed.
     * 
     * API-Since: 18.0
     * 
     * @param firstGroup The new first Group to use for the Function Block..
     * @param direction  The direction of the Function Block: input, output, or bidirectional.
     * @param MIDI1Info  MIDI 1.0 speed information.
     * @param UIHint     A hint for UI about the primary usage of this Function Block.
     */
    @Generated
    @Selector("reconfigureWithFirstGroup:direction:MIDI1Info:UIHint:error:")
    public native boolean reconfigureWithFirstGroupDirectionMIDI1InfoUIHintError(byte firstGroup, int direction,
            int MIDI1Info, int UIHint, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setEnabled:error:
     * 
     * Set whether this Function Block is enabled or disabled.
     * 
     * If a Function Block is registered to UMP Endpoint as part of a static configuration,
     * the state must always be enabled and may not change. If registered to a UMP Endpoint,
     * changes to the Function Block state are propagated to the system-wide cache.
     * 
     * API-Since: 18.0
     * 
     * @param isEnabled The new state of the Function Block.
     * @param error     The out-error used if an error occurred.
     * 
     * @return YES for success. NO in the event of a failure, in which case the error is returned in error.
     */
    @Generated
    @Selector("setEnabled:error:")
    public native boolean setEnabledError(boolean isEnabled,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * setName:error:
     * 
     * Set the function block name.
     * 
     * The Function Block name string. Updating the name of a Function Block will cause the
     * updated name to be propagated to all local copies of the system-wide cache.
     * 
     * API-Since: 18.0
     * 
     * @param name  A string representing the name of the function block.
     * @param error The out-error used if an error occurs.
     * 
     * @return YES for success. NO in the event of a failure, in which case the error is returned in error.
     */
    @Generated
    @Selector("setName:error:")
    public native boolean setNameError(@NotNull String name,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
}