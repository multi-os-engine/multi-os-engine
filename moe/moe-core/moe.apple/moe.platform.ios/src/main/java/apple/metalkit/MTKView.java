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

package apple.metalkit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLClearColor;
import apple.metalkit.protocol.MTKViewDelegate;
import apple.quartzcore.protocol.CAMetalDrawable;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKView extends UIView implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKView alloc();

    /**
     * autoResizeDrawable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/autoResizeDrawable">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoResizeDrawable")
    public native boolean autoResizeDrawable();

    /**
     * clearColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearColor")
    @ByValue
    public native MTLClearColor clearColor();

    /**
     * clearDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearDepth")
    public native double clearDepth();

    /**
     * clearStencil</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearStencil">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearStencil")
    public native int clearStencil();

    /**
     * colorPixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/colorPixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    public native long colorPixelFormat();

    /**
     * currentDrawable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/currentDrawable">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentDrawable")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAMetalDrawable currentDrawable();

    /**
     * currentRenderPassDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/currentRenderPassDescriptor">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentRenderPassDescriptor")
    public native MTLRenderPassDescriptor currentRenderPassDescriptor();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTKViewDelegate delegate();

    /**
     * depthStencilPixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/depthStencilPixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("depthStencilPixelFormat")
    @NUInt
    public native long depthStencilPixelFormat();

    /**
     * depthStencilTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/depthStencilTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("depthStencilTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture depthStencilTexture();

    /**
     * device</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/device">iOS Dev Center</a>
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    /**
     * draw</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instm/MTKView/draw">iOS Dev Center</a>
     */
    @Generated
    @Selector("draw")
    public native void draw();

    /**
     * drawableSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/drawableSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawableSize")
    @ByValue
    public native CGSize drawableSize();

    /**
     * enableSetNeedsDisplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/enableSetNeedsDisplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("enableSetNeedsDisplay")
    public native boolean enableSetNeedsDisplay();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * framebufferOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/framebufferOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("framebufferOnly")
    public native boolean framebufferOnly();

    @Generated
    @Selector("init")
    public native MTKView init();

    @Generated
    @Selector("initWithCoder:")
    public native MTKView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native MTKView initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:device:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instm/MTKView/initWithFrame:device:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFrame:device:")
    public native MTKView initWithFrameDevice(@ByValue CGRect frameRect,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * multisampleColorTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/multisampleColorTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("multisampleColorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture multisampleColorTexture();

    /**
     * preferredFramesPerSecond</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/preferredFramesPerSecond">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * presentsWithTransaction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/presentsWithTransaction">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentsWithTransaction")
    public native boolean presentsWithTransaction();

    /**
     * releaseDrawables</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instm/MTKView/releaseDrawables">iOS Dev Center</a>
     */
    @Generated
    @Selector("releaseDrawables")
    public native void releaseDrawables();

    /**
     * sampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/sampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * autoResizeDrawable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/autoResizeDrawable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoResizeDrawable:")
    public native void setAutoResizeDrawable(boolean value);

    /**
     * clearColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClearColor:")
    public native void setClearColor(@ByValue MTLClearColor value);

    /**
     * clearDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClearDepth:")
    public native void setClearDepth(double value);

    /**
     * clearStencil</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/clearStencil">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClearStencil:")
    public native void setClearStencil(int value);

    /**
     * colorPixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/colorPixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColorPixelFormat:")
    public native void setColorPixelFormat(@NUInt long value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MTKViewDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) MTKViewDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * depthStencilPixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/depthStencilPixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepthStencilPixelFormat:")
    public native void setDepthStencilPixelFormat(@NUInt long value);

    /**
     * device</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/device">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDevice:")
    public native void setDevice(@Mapped(ObjCObjectMapper.class) MTLDevice value);

    /**
     * drawableSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/drawableSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDrawableSize:")
    public native void setDrawableSize(@ByValue CGSize value);

    /**
     * enableSetNeedsDisplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/enableSetNeedsDisplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEnableSetNeedsDisplay:")
    public native void setEnableSetNeedsDisplay(boolean value);

    /**
     * framebufferOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/framebufferOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFramebufferOnly:")
    public native void setFramebufferOnly(boolean value);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * preferredFramesPerSecond</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/preferredFramesPerSecond">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * presentsWithTransaction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/presentsWithTransaction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean value);

    /**
     * sampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKView_ClassReference/index.html#//apple_ref/occ/instp/MTKView/sampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

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
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
