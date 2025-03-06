package apple.coremidi;

import apple.NSObject;
import apple.coremidi.struct.MIDIEventList;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MIDIUMPMutableEndpoint
 * 
 * A mutable MIDIUMPEndpoint object.
 * 
 * It is not necessary to create a MIDIUMPEndpoint or other MIDI endpoint in order to
 * use UMP natively. Any standard MIDI endpoint created with a specified MIDIProtocolID
 * is assumed to use all 16 UMP groups for the same unspecified function and to neither
 * transmit nor receive jitter-reduction timestamps.
 * 
 * This API is not realtime-safe, all interaction with the mutable endpoint should be done on the
 * main thread.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDIUMPMutableEndpoint extends MIDIUMPEndpoint {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDIUMPMutableEndpoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDIUMPMutableEndpoint alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDIUMPMutableEndpoint allocWithZone(VoidPtr zone);

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
    public native MIDIUMPMutableEndpoint init();

    /**
     * initWithName:deviceInfo:productInstanceID:MIDIProtocol:destinationCallback
     * 
     * Initializer for creating a new MIDIUMPEndpoint.
     * 
     * This operation will fail if the device ID information is malformed or if virtual MIDI endpoint creation
     * is not allowed (for example, on iOS, if your app doesn't list 'audio' in UIBackgroundModes).
     * 
     * API-Since: 18.0
     * 
     * @param name                The UMP endpoint name.
     * @param deviceInfo          The MIDI 2 device ID info for the UMP endpoint.
     * @param productInstanceID   The product instance ID, up to 42 characters.
     * @param MIDIProtocol        The MIDI protocol.
     * @param destinationCallback The receive callback used to create the UMP endpoint's MIDI
     *                            destination associated, which can be used to observe or process
     *                            incoming MIDI traffic.
     */
    @Generated
    @Selector("initWithName:deviceInfo:productInstanceID:MIDIProtocol:destinationCallback:")
    public native MIDIUMPMutableEndpoint initWithNameDeviceInfoProductInstanceIDMIDIProtocolDestinationCallback(
            @NotNull String name, @NotNull MIDI2DeviceInfo deviceInfo, @NotNull String productInstanceID,
            int MIDIProtocol,
            @ObjCBlock(name = "call_initWithNameDeviceInfoProductInstanceIDMIDIProtocolDestinationCallback") @NotNull Block_initWithNameDeviceInfoProductInstanceIDMIDIProtocolDestinationCallback destinationCallback);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithNameDeviceInfoProductInstanceIDMIDIProtocolDestinationCallback {
        @Generated
        void call_initWithNameDeviceInfoProductInstanceIDMIDIProtocolDestinationCallback(
                @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MIDIEventList evtlist,
                @Nullable VoidPtr srcConnRefCon);
    }

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
     * The enable state of the endpoint.
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
     * [@property] mutableFunctionBlocks
     * 
     * The Function Blocks associated with the UMP endpoint, if any.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("mutableFunctionBlocks")
    @NotNull
    public native NSArray<? extends MIDIUMPMutableFunctionBlock> mutableFunctionBlocks();

    @Generated
    @Owned
    @Selector("new")
    public static native MIDIUMPMutableEndpoint new_objc();

    /**
     * registerFunctionBlocks:markAsStatic:error:
     * 
     * Register or replace Function Blocks for a disabled client-created MIDIUMPEndpoint.
     * 
     * This operation will fail if the array contains any disabled Function Blocks but the
     * MIDIUMPEndpoint Function Block configuration is static.
     * Returns YES if the Function Block configuration was set successfully.
     * 
     * API-Since: 18.0
     * 
     * @param functionBlocks A list of client-created Function Blocks to register.
     * @param markAsStatic   Whether the Function Block configuration may be updated.
     * @param error          The out-error used if an error occurs.
     * 
     * @return YES for success. NO in the event of a failure, in which case the error is returned in error.
     */
    @Generated
    @Selector("registerFunctionBlocks:markAsStatic:error:")
    public native boolean registerFunctionBlocksMarkAsStaticError(
            @NotNull NSArray<? extends MIDIUMPMutableFunctionBlock> functionBlocks, boolean markAsStatic,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setEnabled:error:
     * 
     * Enable a mutable UMP endpoint in the system-wide UMP endpoint cache.
     * 
     * A MIDIUMPMutableEndpoint must be cache enabled before it is visible via API.
     * Note that Function Blocks may only be registered to uncached MIDIUMPMutableEndpoint
     * objects.
     * 
     * API-Since: 18.0
     * 
     * @param isEnabled The enable state of the UMP endpoint.
     * @param error     The out-error used if an error occurred.
     * 
     * @return YES for success. NO in the event of a failure, in which case the error is returned in error.
     */
    @Generated
    @Selector("setEnabled:error:")
    public native boolean setEnabledError(boolean isEnabled,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * [@property] mutableFunctionBlocks
     * 
     * The Function Blocks associated with the UMP endpoint, if any.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setMutableFunctionBlocks:")
    public native void setMutableFunctionBlocks(@NotNull NSArray<? extends MIDIUMPMutableFunctionBlock> value);

    /**
     * setName:error:
     * 
     * Set the endpoints name.
     * 
     * This operation will fail if the name could not be set.
     * 
     * API-Since: 18.0
     * 
     * @param name  A string representing the name of the endpoint.
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