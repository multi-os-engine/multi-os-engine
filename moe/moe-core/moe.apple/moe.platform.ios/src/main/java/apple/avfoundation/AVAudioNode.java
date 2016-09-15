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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioNode alloc();

    /**
     * engine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instp/AVAudioNode/engine">iOS Dev Center</a>
     */
    @Generated
    @Selector("engine")
    public native AVAudioEngine engine();

    @Generated
    @Selector("init")
    public native AVAudioNode init();

    /**
     * inputFormatForBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/inputFormatForBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputFormatForBus:")
    public native AVAudioFormat inputFormatForBus(@NUInt long bus);

    /**
     * installTapOnBus:bufferSize:format:block:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/installTapOnBus:bufferSize:format:block:">iOS Dev Center</a>
     */
    @Generated
    @Selector("installTapOnBus:bufferSize:format:block:")
    public native void installTapOnBusBufferSizeFormatBlock(@NUInt long bus, int bufferSize, AVAudioFormat format,
            @ObjCBlock(name = "call_installTapOnBusBufferSizeFormatBlock") Block_installTapOnBusBufferSizeFormatBlock tapBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_installTapOnBusBufferSizeFormatBlock {
        @Generated
        void call_installTapOnBusBufferSizeFormatBlock(AVAudioPCMBuffer arg0, AVAudioTime arg1);
    }

    /**
     * lastRenderTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instp/AVAudioNode/lastRenderTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastRenderTime")
    public native AVAudioTime lastRenderTime();

    /**
     * nameForInputBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/nameForInputBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nameForInputBus:")
    public native String nameForInputBus(@NUInt long bus);

    /**
     * nameForOutputBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/nameForOutputBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nameForOutputBus:")
    public native String nameForOutputBus(@NUInt long bus);

    /**
     * numberOfInputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instp/AVAudioNode/numberOfInputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfInputs")
    @NUInt
    public native long numberOfInputs();

    /**
     * numberOfOutputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instp/AVAudioNode/numberOfOutputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfOutputs")
    @NUInt
    public native long numberOfOutputs();

    /**
     * outputFormatForBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/outputFormatForBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputFormatForBus:")
    public native AVAudioFormat outputFormatForBus(@NUInt long bus);

    /**
     * removeTapOnBus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/removeTapOnBus:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTapOnBus:")
    public native void removeTapOnBus(@NUInt long bus);

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioNode_Class/index.html#//apple_ref/occ/instm/AVAudioNode/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
