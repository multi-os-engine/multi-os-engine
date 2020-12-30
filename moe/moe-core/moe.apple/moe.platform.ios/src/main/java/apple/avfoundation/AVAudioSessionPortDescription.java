/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation;

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
import org.moe.natj.general.ann.MappedReturn;
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
 */
@Generated
@Library("AVFoundation")
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSessionPortDescription alloc();

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
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * A system-assigned unique identifier for the associated hardware port
     */
    @Generated
    @Selector("UID")
    public native String UID();

    @Generated
    @Selector("channels")
    public native NSArray<? extends AVAudioSessionChannelDescription> channels();

    /**
     * Will be nil if there are no selectable data sources.
     */
    @Generated
    @Selector("dataSources")
    public native NSArray<? extends AVAudioSessionDataSourceDescription> dataSources();

    /**
     * @brief This property's value will be true if the associated hardware port has built-in
     * processing for two-way voice communication.
     * 
     * Applications that use their own proprietary voice processing algorithms should use this property
     * to decide when to disable processing.  On the other hand, if using Apple's Voice Processing I/O
     * unit (subtype kAudioUnitSubType_VoiceProcessingIO), the system will automatically manage this
     * for the application. In particular, ports of type AVAudioSessionPortBluetoothHFP and
     * AVAudioSessionPortCarAudio often have hardware voice processing.
     */
    @Generated
    @Selector("hasHardwareVoiceCallProcessing")
    public native boolean hasHardwareVoiceCallProcessing();

    @Generated
    @Selector("init")
    public native AVAudioSessionPortDescription init();

    /**
     * A descriptive name for the associated hardware port
     */
    @Generated
    @Selector("portName")
    public native String portName();

    @Generated
    @Selector("portType")
    public native String portType();

    /**
     * This property reflects the application's preferred data source for the Port. Will be nil if
     * there are no selectable data sources or if no preference has been set.
     */
    @Generated
    @Selector("preferredDataSource")
    public native AVAudioSessionDataSourceDescription preferredDataSource();

    /**
     * Will be nil if there are no selectable data sources. In all other cases, this property reflects
     * the currently selected data source.
     */
    @Generated
    @Selector("selectedDataSource")
    public native AVAudioSessionDataSourceDescription selectedDataSource();

    /**
     * @brief Select the preferred data source for this port. The input dataSource parameter must be
     * one of the dataSources exposed by the dataSources property. Setting a nil value will clear the
     * preference. Note: if the port is part of the active audio route, changing the data source will
     * likely result in a route reconfiguration.  If the port is not part of the active route,
     * selecting a new data source will not result in an immediate route reconfiguration.  Use
     * AVAudioSession's -setPreferredInput:error: method to activate the port.
     */
    @Generated
    @Selector("setPreferredDataSource:error:")
    public native boolean setPreferredDataSourceError(AVAudioSessionDataSourceDescription dataSource,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}
