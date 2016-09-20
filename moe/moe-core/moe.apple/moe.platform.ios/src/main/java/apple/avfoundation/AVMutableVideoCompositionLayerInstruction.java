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
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGRect;
import apple.coremedia.struct.CMTime;
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
public class AVMutableVideoCompositionLayerInstruction extends AVVideoCompositionLayerInstruction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableVideoCompositionLayerInstruction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoCompositionLayerInstruction alloc();

    /**
     * videoCompositionLayerInstruction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/clm/AVMutableVideoCompositionLayerInstruction/videoCompositionLayerInstruction">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoCompositionLayerInstruction")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstruction();

    /**
     * videoCompositionLayerInstructionWithAssetTrack:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/clm/AVMutableVideoCompositionLayerInstruction/videoCompositionLayerInstructionWithAssetTrack:">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoCompositionLayerInstructionWithAssetTrack:")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstructionWithAssetTrack(
            AVAssetTrack track);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native AVMutableVideoCompositionLayerInstruction init();

    /**
     * setCropRectangle:atTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setCropRectangle:atTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCropRectangle:atTime:")
    public native void setCropRectangleAtTime(@ByValue CGRect cropRectangle, @ByValue CMTime time);

    /**
     * setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:")
    public native void setCropRectangleRampFromStartCropRectangleToEndCropRectangleTimeRange(
            @ByValue CGRect startCropRectangle, @ByValue CGRect endCropRectangle, @ByValue CMTimeRange timeRange);

    /**
     * setOpacity:atTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setOpacity:atTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOpacity:atTime:")
    public native void setOpacityAtTime(float opacity, @ByValue CMTime time);

    /**
     * setOpacityRampFromStartOpacity:toEndOpacity:timeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setOpacityRampFromStartOpacity:toEndOpacity:timeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOpacityRampFromStartOpacity:toEndOpacity:timeRange:")
    public native void setOpacityRampFromStartOpacityToEndOpacityTimeRange(float startOpacity, float endOpacity,
            @ByValue CMTimeRange timeRange);

    /**
     * trackID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instp/AVMutableVideoCompositionLayerInstruction/trackID">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTrackID:")
    public native void setTrackID(int value);

    /**
     * setTransform:atTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setTransform:atTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransform:atTime:")
    public native void setTransformAtTime(@ByValue CGAffineTransform transform, @ByValue CMTime time);

    /**
     * setTransformRampFromStartTransform:toEndTransform:timeRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instm/AVMutableVideoCompositionLayerInstruction/setTransformRampFromStartTransform:toEndTransform:timeRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransformRampFromStartTransform:toEndTransform:timeRange:")
    public native void setTransformRampFromStartTransformToEndTransformTimeRange(
            @ByValue CGAffineTransform startTransform, @ByValue CGAffineTransform endTransform,
            @ByValue CMTimeRange timeRange);

    /**
     * trackID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoCompositionLayerInstruction_Class/index.html#//apple_ref/occ/instp/AVMutableVideoCompositionLayerInstruction/trackID">iOS Dev Center</a>
     */
    @Generated
    @Selector("trackID")
    public native int trackID();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableVideoCompositionLayerInstruction initWithCoder(NSCoder aDecoder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
