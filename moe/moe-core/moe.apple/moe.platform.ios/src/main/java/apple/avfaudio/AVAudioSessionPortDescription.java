package apple.avfaudio;

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
 * Information about a port, a physical connector or audio device.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSessionPortDescription extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSessionPortDescription(Pointer peer) {
        super(peer);
    }

    /**
     * A system-assigned unique identifier for the associated hardware port
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("UID")
    public native String UID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSessionPortDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioSessionPortDescription allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("channels")
    public native NSArray<? extends AVAudioSessionChannelDescription> channels();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Will be nil if there are no selectable data sources.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("dataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> dataSources();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This property's value will be true if the associated hardware port has built-in
     * processing for two-way voice communication.
     * 
     * Applications that use their own proprietary voice processing algorithms should use this property
     * to decide when to disable processing. On the other hand, if using Apple's Voice Processing I/O
     * unit (subtype kAudioUnitSubType_VoiceProcessingIO), the system will automatically manage this
     * for the application. In particular, ports of type AVAudioSessionPortBluetoothHFP and
     * AVAudioSessionPortCarAudio often have hardware voice processing.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasHardwareVoiceCallProcessing")
    public native boolean hasHardwareVoiceCallProcessing();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioSessionPortDescription init();

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
     * This property's value will be true if the port supports spatial audio playback and the feature is
     * enabled.
     * 
     * 'Now Playing' apps should also inform the system if they support multichannel audio content using
     * -setSupportsMultichannelContent:error: method. Apps may also register to receive the
     * AVAudioSessionSpatialPlaybackCapabilitiesChanged notification to detect changes in user preferences that
     * affect spatial audio playback.
     * 
     * This property is only relevant in the context of ports that have a small number of hardware channels
     * (typically 2), but have enhanced capabilities for rendering multi-channel content. Note that some port
     * types such as USB and HDMI may support multi-channel playback because they have hardware formats supporting
     * more than 2 channels. For example, many HDMI receivers are connected to multiple speakers and are capable of
     * rendering 5.1, 7.1, or other popular surround sound formats. Applications interested in utilizing multi-channel
     * formats should also query AVAudioSession's maximumOutputNumberOfChannels property and make use of
     * -setPreferredOutputNumberOfChannels:error: to set the preferred number of hardware channels.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isSpatialAudioEnabled")
    public native boolean isSpatialAudioEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioSessionPortDescription new_objc();

    /**
     * A descriptive name for the associated hardware port
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("portName")
    public native String portName();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("portType")
    public native String portType();

    /**
     * This property reflects the application's preferred data source for the Port. Will be nil if
     * there are no selectable data sources or if no preference has been set.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("preferredDataSource")
    public native AVAudioSessionDataSourceDescription preferredDataSource();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Will be nil if there are no selectable data sources. In all other cases, this property reflects
     * the currently selected data source.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("selectedDataSource")
    public native AVAudioSessionDataSourceDescription selectedDataSource();

    /**
     * Select the preferred data source for this port. The input dataSource parameter must be
     * one of the dataSources exposed by the dataSources property. Setting a nil value will clear the
     * preference. Note: if the port is part of the active audio route, changing the data source will
     * likely result in a route reconfiguration. If the port is not part of the active route,
     * selecting a new data source will not result in an immediate route reconfiguration. Use
     * AVAudioSession's -setPreferredInput:error: method to activate the port.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPreferredDataSource:error:")
    public native boolean setPreferredDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
