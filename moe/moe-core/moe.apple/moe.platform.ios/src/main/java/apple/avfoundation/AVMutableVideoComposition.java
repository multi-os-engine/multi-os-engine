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
import apple.avfoundation.protocol.AVVideoCompositing;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableVideoComposition extends AVVideoComposition {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableVideoComposition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoComposition alloc();

    /**
     * animationTool</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/animationTool">iOS Dev Center</a>
     */
    @Generated
    @Selector("animationTool")
    public native AVVideoCompositionCoreAnimationTool animationTool();

    /**
     * customVideoCompositorClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/customVideoCompositorClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("customVideoCompositorClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositorClass();

    /**
     * frameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/frameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("frameDuration")
    @ByValue
    public native CMTime frameDuration();

    @Generated
    @Selector("init")
    public native AVMutableVideoComposition init();

    /**
     * instructions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/instructions">iOS Dev Center</a>
     */
    @Generated
    @Selector("instructions")
    public native NSArray<?> instructions();

    /**
     * renderScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/renderScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderScale")
    public native float renderScale();

    /**
     * renderSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/renderSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderSize")
    @ByValue
    public native CGSize renderSize();

    /**
     * animationTool</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/animationTool">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationTool:")
    public native void setAnimationTool(AVVideoCompositionCoreAnimationTool value);

    /**
     * customVideoCompositorClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/customVideoCompositorClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCustomVideoCompositorClass:")
    public native void setCustomVideoCompositorClass(@Mapped(ObjCObjectMapper.class) AVVideoCompositing value);

    /**
     * frameDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/frameDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFrameDuration:")
    public native void setFrameDuration(@ByValue CMTime value);

    /**
     * instructions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/instructions">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInstructions:")
    public native void setInstructions(NSArray<?> value);

    /**
     * renderScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/renderScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderScale:")
    public native void setRenderScale(float value);

    /**
     * renderSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/instp/AVMutableVideoComposition/renderSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderSize:")
    public native void setRenderSize(@ByValue CGSize value);

    /**
     * videoComposition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/clm/AVMutableVideoComposition/videoComposition">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoComposition")
    public static native AVMutableVideoComposition videoComposition();

    /**
     * videoCompositionWithPropertiesOfAsset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableVideoComposition_Class/index.html#//apple_ref/occ/clm/AVMutableVideoComposition/videoCompositionWithPropertiesOfAsset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:")
    public static native AVMutableVideoComposition videoCompositionWithPropertiesOfAsset(AVAsset asset);

    @Generated
    @Selector("videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    public static native AVMutableVideoComposition videoCompositionWithAssetApplyingCIFiltersWithHandler(AVAsset asset,
            @ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandler") Block_videoCompositionWithAssetApplyingCIFiltersWithHandler applier);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithAssetApplyingCIFiltersWithHandler {
        @Generated
        void call_videoCompositionWithAssetApplyingCIFiltersWithHandler(AVAsynchronousCIImageFilteringRequest arg0);
    }

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
    @Selector("version")
    @NInt
    public static native long version_static();
}
