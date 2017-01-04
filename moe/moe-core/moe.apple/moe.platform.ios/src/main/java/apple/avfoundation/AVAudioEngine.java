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
import apple.audiotoolbox.opaque.MusicSequence;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEngine alloc();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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

    @Generated
    @Selector("attachNode:")
    public native void attachNode(AVAudioNode node);

    @Generated
    @Selector("connect:to:format:")
    public native void connectToFormat(AVAudioNode node1, AVAudioNode node2, AVAudioFormat format);

    @Generated
    @Selector("connect:to:fromBus:toBus:format:")
    public native void connectToFromBusToBusFormat(AVAudioNode node1, AVAudioNode node2, @NUInt long bus1,
            @NUInt long bus2, AVAudioFormat format);

    @Generated
    @Selector("connect:toConnectionPoints:fromBus:format:")
    public native void connectToConnectionPointsFromBusFormat(AVAudioNode sourceNode,
            NSArray<? extends AVAudioConnectionPoint> destNodes, @NUInt long sourceBus, AVAudioFormat format);

    @Generated
    @Selector("detachNode:")
    public native void detachNode(AVAudioNode node);

    @Generated
    @Selector("disconnectNodeInput:")
    public native void disconnectNodeInput(AVAudioNode node);

    @Generated
    @Selector("disconnectNodeInput:bus:")
    public native void disconnectNodeInputBus(AVAudioNode node, @NUInt long bus);

    @Generated
    @Selector("disconnectNodeOutput:")
    public native void disconnectNodeOutput(AVAudioNode node);

    @Generated
    @Selector("disconnectNodeOutput:bus:")
    public native void disconnectNodeOutputBus(AVAudioNode node, @NUInt long bus);

    @Generated
    @Selector("init")
    public native AVAudioEngine init();

    @Generated
    @Selector("inputConnectionPointForNode:inputBus:")
    public native AVAudioConnectionPoint inputConnectionPointForNodeInputBus(AVAudioNode node, @NUInt long bus);

    @Generated
    @Selector("inputNode")
    public native AVAudioInputNode inputNode();

    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    @Generated
    @Selector("mainMixerNode")
    public native AVAudioMixerNode mainMixerNode();

    @Generated
    @Selector("musicSequence")
    public native MusicSequence musicSequence();

    @Generated
    @Selector("outputConnectionPointsForNode:outputBus:")
    public native NSArray<? extends AVAudioConnectionPoint> outputConnectionPointsForNodeOutputBus(AVAudioNode node,
            @NUInt long bus);

    @Generated
    @Selector("outputNode")
    public native AVAudioOutputNode outputNode();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("prepare")
    public native void prepare();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("setMusicSequence:")
    public native void setMusicSequence(MusicSequence value);

    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("stop")
    public native void stop();
}
