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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoCompositionLayerInstruction alloc();

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

    @Generated
    @Selector("videoCompositionLayerInstruction")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstruction();

    @Generated
    @Selector("videoCompositionLayerInstructionWithAssetTrack:")
    public static native AVMutableVideoCompositionLayerInstruction videoCompositionLayerInstructionWithAssetTrack(
            AVAssetTrack track);

    @Generated
    @Selector("init")
    public native AVMutableVideoCompositionLayerInstruction init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableVideoCompositionLayerInstruction initWithCoder(NSCoder coder);

    @Generated
    @Selector("setCropRectangle:atTime:")
    public native void setCropRectangleAtTime(@ByValue CGRect cropRectangle, @ByValue CMTime time);

    @Generated
    @Selector("setCropRectangleRampFromStartCropRectangle:toEndCropRectangle:timeRange:")
    public native void setCropRectangleRampFromStartCropRectangleToEndCropRectangleTimeRange(
            @ByValue CGRect startCropRectangle, @ByValue CGRect endCropRectangle, @ByValue CMTimeRange timeRange);

    @Generated
    @Selector("setOpacity:atTime:")
    public native void setOpacityAtTime(float opacity, @ByValue CMTime time);

    @Generated
    @Selector("setOpacityRampFromStartOpacity:toEndOpacity:timeRange:")
    public native void setOpacityRampFromStartOpacityToEndOpacityTimeRange(float startOpacity, float endOpacity,
            @ByValue CMTimeRange timeRange);

    @Generated
    @Selector("setTrackID:")
    public native void setTrackID(int value);

    @Generated
    @Selector("setTransform:atTime:")
    public native void setTransformAtTime(@ByValue CGAffineTransform transform, @ByValue CMTime time);

    @Generated
    @Selector("setTransformRampFromStartTransform:toEndTransform:timeRange:")
    public native void setTransformRampFromStartTransformToEndTransformTimeRange(
            @ByValue CGAffineTransform startTransform, @ByValue CGAffineTransform endTransform,
            @ByValue CMTimeRange timeRange);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("trackID")
    public native int trackID();
}
