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
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoCompositionInstruction extends NSObject implements NSSecureCoding, NSCopying, NSMutableCopying,
        apple.avfoundation.protocol.AVVideoCompositionInstruction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoCompositionInstruction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoCompositionInstruction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVVideoCompositionInstruction allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVVideoCompositionInstruction new_objc();

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
     * Indicates the background color of the composition. Solid BGRA colors only are supported; patterns and other color
     * refs that are not supported will be ignored.
     * If the background color is not specified the video compositor will use a default backgroundColor of opaque black.
     * If the rendered pixel buffer does not have alpha, the alpha value of the backgroundColor will be ignored.
     */
    @Nullable
    @Generated
    @Selector("backgroundColor")
    public native CGColorRef backgroundColor();

    @Generated
    @Selector("containsTweening")
    public native boolean containsTweening();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("enablePostProcessing")
    public native boolean enablePostProcessing();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native AVVideoCompositionInstruction init();

    @Generated
    @Selector("initWithCoder:")
    public native AVVideoCompositionInstruction initWithCoder(@NotNull NSCoder coder);

    /**
     * Provides an array of instances of AVVideoCompositionLayerInstruction that specify how video frames from source
     * tracks should be layered and composed.
     * Tracks are layered in the composition according to the top-to-bottom order of the layerInstructions array; the
     * track with trackID of the first instruction
     * in the array will be layered on top, with the track with the trackID of the second instruction immediately
     * underneath, etc.
     * If this key is nil, the output will be a fill of the background color.
     */
    @NotNull
    @Generated
    @Selector("layerInstructions")
    public native NSArray<? extends AVVideoCompositionLayerInstruction> layerInstructions();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("passthroughTrackID")
    public native int passthroughTrackID();

    @NotNull
    @Generated
    @Selector("requiredSourceTrackIDs")
    public native NSArray<? extends NSValue> requiredSourceTrackIDs();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    @NotNull
    @Generated
    @Selector("requiredSourceSampleDataTrackIDs")
    public native NSArray<? extends NSNumber> requiredSourceSampleDataTrackIDs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
