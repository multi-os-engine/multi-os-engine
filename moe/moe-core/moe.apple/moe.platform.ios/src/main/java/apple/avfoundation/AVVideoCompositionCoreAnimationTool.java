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
import apple.quartzcore.CALayer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
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
public class AVVideoCompositionCoreAnimationTool extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoCompositionCoreAnimationTool(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoCompositionCoreAnimationTool alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVVideoCompositionCoreAnimationTool allocWithZone(VoidPtr zone);

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
    public static native AVVideoCompositionCoreAnimationTool new_objc();

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
     * videoCompositionCoreAnimationToolWithAdditionalLayer:asTrackID:
     * 
     * Add a Core Animation layer to the video composition
     * 
     * Include a Core Animation layer as an individual track input in video composition.
     * This layer should not come from, or be added to, another layer tree.
     * trackID should not match any real trackID in the source. Use -[AVAsset unusedTrackID]
     * to obtain a trackID that's guaranteed not to coincide with the trackID of any track of the asset.
     * AVVideoCompositionInstructions should reference trackID where the rendered animation should be included.
     * For best performance, no transform should be set in the AVVideoCompositionLayerInstruction for this trackID.
     * Be aware that on iOS, CALayers backing a UIView usually have their content flipped (as defined by the
     * -contentsAreFlipped method). It may be required to insert a CALayer with its geometryFlipped property set
     * to YES in the layer hierarchy to get the same result when attaching a CALayer to a
     * AVVideoCompositionCoreAnimationTool
     * as when using it to back a UIView.
     */
    @Generated
    @Selector("videoCompositionCoreAnimationToolWithAdditionalLayer:asTrackID:")
    public static native AVVideoCompositionCoreAnimationTool videoCompositionCoreAnimationToolWithAdditionalLayerAsTrackID(
            @NotNull CALayer layer, int trackID);

    /**
     * videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayer:inLayer:
     * 
     * Compose the composited video frames with the Core Animation layer
     * 
     * Place composited video frames in videoLayer and render animationLayer
     * to produce the final frame. Normally videoLayer should be in animationLayer's sublayer tree.
     * The animationLayer should not come from, or be added to, another layer tree.
     * Be aware that on iOS, CALayers backing a UIView usually have their content flipped (as defined by the
     * -contentsAreFlipped method). It may be required to insert a CALayer with its geometryFlipped property set
     * to YES in the layer hierarchy to get the same result when attaching a CALayer to a
     * AVVideoCompositionCoreAnimationTool
     * as when using it to back a UIView.
     */
    @Generated
    @Selector("videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayer:inLayer:")
    public static native AVVideoCompositionCoreAnimationTool videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayerInLayer(
            @NotNull CALayer videoLayer, @NotNull CALayer animationLayer);

    /**
     * videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayers:inLayer:
     * 
     * Compose the composited video frames with the Core Animation layer
     * 
     * Duplicate the composited video frames in each videoLayer and render animationLayer
     * to produce the final frame. Normally videoLayers should be in animationLayer's sublayer tree.
     * The animationLayer should not come from, or be added to, another layer tree.
     * Be aware that on iOS, CALayers backing a UIView usually have their content flipped (as defined by the
     * -contentsAreFlipped method). It may be required to insert a CALayer with its geometryFlipped property set
     * to YES in the layer hierarchy to get the same result when attaching a CALayer to a
     * AVVideoCompositionCoreAnimationTool
     * as when using it to back a UIView.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayers:inLayer:")
    public static native AVVideoCompositionCoreAnimationTool videoCompositionCoreAnimationToolWithPostProcessingAsVideoLayersInLayer(
            @NotNull NSArray<? extends CALayer> videoLayers, @NotNull CALayer animationLayer);

    @Generated
    @Selector("init")
    public native AVVideoCompositionCoreAnimationTool init();
}
