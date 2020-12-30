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
import apple.coregraphics.opaque.CGColorRef;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableVideoCompositionInstruction extends AVVideoCompositionInstruction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableVideoCompositionInstruction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoCompositionInstruction alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method		videoCompositionInstruction
     * @abstract		Returns a new instance of AVMutableVideoCompositionInstruction.
     * @discussion
     *   The returned AVMutableVideoCompositionInstruction will have a timeRange of kCMTimeRangeInvalid, a NULL backgroundColor, and a nil array of layerInstructions.
     */
    @Generated
    @Selector("videoCompositionInstruction")
    public static native AVMutableVideoCompositionInstruction videoCompositionInstruction();

    /**
     * Indicates the background color of the composition. Solid BGRA colors only are supported; patterns and other color refs that are not supported will be ignored.
     * If the background color is not specified the video compositor will use a default backgroundColor of opaque black.
     * If the rendered pixel buffer does not have alpha, the alpha value of the backgroundColor will be ignored. 
     */
    @Generated
    @Selector("backgroundColor")
    public native CGColorRef backgroundColor();

    /**
     * If NO, indicates that post-processing should be skipped for the duration of this instruction.  YES by default.
     * See +[AVVideoCompositionCoreAnimationTool videoCompositionToolWithPostProcessingAsVideoLayer:inLayer:].
     */
    @Generated
    @Selector("enablePostProcessing")
    public native boolean enablePostProcessing();

    @Generated
    @Selector("init")
    public native AVMutableVideoCompositionInstruction init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableVideoCompositionInstruction initWithCoder(NSCoder coder);

    /**
     * Provides an array of instances of AVVideoCompositionLayerInstruction that specify how video frames from source tracks should be layered and composed.
     * Tracks are layered in the composition according to the top-to-bottom order of the layerInstructions array; the track with trackID of the first instruction
     * in the array will be layered on top, with the track with the trackID of the second instruction immediately underneath, etc.
     * If this key is nil, the output will be a fill of the background color. 
     */
    @Generated
    @Selector("layerInstructions")
    public native NSArray<? extends AVVideoCompositionLayerInstruction> layerInstructions();

    /**
     * Indicates the background color of the composition. Solid BGRA colors only are supported; patterns and other color refs that are not supported will be ignored.
     * If the background color is not specified the video compositor will use a default backgroundColor of opaque black.
     * If the rendered pixel buffer does not have alpha, the alpha value of the backgroundColor will be ignored. 
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(CGColorRef value);

    /**
     * If NO, indicates that post-processing should be skipped for the duration of this instruction.  YES by default.
     * See +[AVVideoCompositionCoreAnimationTool videoCompositionToolWithPostProcessingAsVideoLayer:inLayer:].
     */
    @Generated
    @Selector("setEnablePostProcessing:")
    public native void setEnablePostProcessing(boolean value);

    /**
     * Provides an array of instances of AVVideoCompositionLayerInstruction that specify how video frames from source tracks should be layered and composed.
     * Tracks are layered in the composition according to the top-to-bottom order of the layerInstructions array; the track with trackID of the first instruction
     * in the array will be layered on top, with the track with the trackID of the second instruction immediately underneath, etc.
     * If this key is nil, the output will be a fill of the background color. 
     */
    @Generated
    @Selector("setLayerInstructions:")
    public native void setLayerInstructions(NSArray<? extends AVVideoCompositionLayerInstruction> value);

    /**
     * Indicates the timeRange during which the instruction is effective. Note requirements for the timeRanges of instructions described in connection with AVVideoComposition's instructions key above.
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Indicates the timeRange during which the instruction is effective. Note requirements for the timeRanges of instructions described in connection with AVVideoComposition's instructions key above.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();
}
