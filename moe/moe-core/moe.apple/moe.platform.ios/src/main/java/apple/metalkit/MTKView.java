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
import apple.coregraphics.opaque.CGContextRef;
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
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.protocol.CALayerDelegate;
import apple.quartzcore.protocol.CAMetalDrawable;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MTKView
 * <p>
 * View for rendering metal content
 */
@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKView extends UIView implements NSCoding, CALayerDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTKView allocWithZone(VoidPtr zone);

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
    public static native MTKView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native MTKView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native MTKView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native MTKView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native MTKView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native MTKView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    @Owned
    @Selector("new")
    public static native MTKView new_objc();

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
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

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
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @IsOptional
    @Selector("actionForLayer:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAAction actionForLayerForKey(CALayer layer, String event);

    @Generated
    @ProtocolClassMethod("appearance")
    public MTKView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public MTKView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public MTKView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public MTKView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public MTKView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public MTKView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * [@property] autoResizeDrawable
     * <p>
     * Controls whether to resize the drawable as the view changes size.
     * <p>
     * If true, the size of the currentDrawable's texture, depthStencilTexture, and multisampleColorTexture will
     * automatically resize as the view resizes. If false, these textures will take on the size of drawableSize and
     * drawableSize will not change. The default value is true.
     */
    @Generated
    @Selector("autoResizeDrawable")
    public native boolean autoResizeDrawable();

    /**
     * [@property] clearColor
     * <p>
     * The clear color value used to generate the currentRenderPassDescriptor
     * <p>
     * This defaults to (0.0, 0.0, 0.0, 1.0)
     */
    @Generated
    @Selector("clearColor")
    @ByValue
    public native MTLClearColor clearColor();

    /**
     * [@property] clearDepth
     * <p>
     * The clear depth value used to generate the currentRenderPassDescriptor
     * <p>
     * This defaults to 1.0
     */
    @Generated
    @Selector("clearDepth")
    public native double clearDepth();

    /**
     * [@property] clearStencil
     * <p>
     * The clear stencil value used to generate currentRenderPassDescriptor
     * <p>
     * This defaults to 0
     */
    @Generated
    @Selector("clearStencil")
    public native int clearStencil();

    /**
     * [@property] colorPixelFormat
     * <p>
     * The pixelFormat for the drawable's texture.
     */
    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    public native long colorPixelFormat();

    /**
     * [@property] currentDrawable
     * <p>
     * The drawable to be used for the current frame.
     * <p>
     * currentDrawable is updated at the end -draw (i.e. after the delegate's drawInMTKView method is called)
     */
    @Generated
    @Selector("currentDrawable")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAMetalDrawable currentDrawable();

    /**
     * [@property] currentRenderPassDescriptor
     * <p>
     * A render pass descriptor generated from the currentDrawable's texture and the view's depth, stencil, and sample
     * buffers and clear values.
     * <p>
     * This is a convience property. The view does not use this descriptor and there is no requirement for an app to use
     * this descriptor.
     */
    @Generated
    @Selector("currentRenderPassDescriptor")
    public native MTLRenderPassDescriptor currentRenderPassDescriptor();

    /**
     * [@property] delegate
     * <p>
     * The delegate handling common view operations
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTKViewDelegate delegate();

    /**
     * [@property] depthStencilPixelFormat
     * <p>
     * The pixelFormat used to create depthStencilTexture
     */
    @Generated
    @Selector("depthStencilPixelFormat")
    @NUInt
    public native long depthStencilPixelFormat();

    /**
     * [@property] depthStencilTexture
     * <p>
     * A packed depth and stencil texture to be attached to a MTLRenderPassDescriptor
     * <p>
     * The view will generate the depth buffer using the specified depthPixelFormat. This will be nil if
     * depthStencilPixelFormat is MTLPixelFormatInvalid.
     */
    @Generated
    @Selector("depthStencilTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture depthStencilTexture();

    /**
     * [@property] device
     * <p>
     * The MTLDevice used to create Metal objects
     * <p>
     * This must be explicitly set by the application unless it was passed into the initializer. Defaults to nil
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @IsOptional
    @Selector("displayLayer:")
    public native void displayLayer(CALayer layer);

    /**
     * draw
     * <p>
     * Manually ask the view to draw new contents. This causes the view to call either the drawInMTKView (delegate) or
     * drawRect (subclass) method.
     * <p>
     * Manually ask the view to draw new contents. This causes the view to call either the drawInMTKView (delegate) or
     * drawRect (subclass) method. This should be used when the view's paused proprety is set to true and
     * enableSetNeedsDisplay is set to false.
     */
    @Generated
    @Selector("draw")
    public native void draw();

    @Generated
    @IsOptional
    @Selector("drawLayer:inContext:")
    public native void drawLayerInContext(CALayer layer, CGContextRef ctx);

    /**
     * [@property] drawableSize
     * <p>
     * The current size of drawable textures
     * <p>
     * The size currentDrawable's texture, depthStencilTexture, and multisampleColorTexture. If autoResizeDrawable is
     * true this value will be updated as the view's size changes. If autoResizeDrawable is false, this can be set to
     * fix the size of the drawable textures.
     */
    @Generated
    @Selector("drawableSize")
    @ByValue
    public native CGSize drawableSize();

    /**
     * [@property] enableSetNeedsDisplay
     * <p>
     * Controls whether the view responds to setNeedsDisplay.
     * <p>
     * If true, then the view behaves similarily to a UIView or NSView, responding to calls to setNeedsDisplay. When the
     * view has been marked for display, the view is automatically redisplayed on each pass through the application’s
     * event loop. Setting enableSetNeedsDisplay to true will also pause the MTKView's internal render loop and updates
     * will instead be event driven. The default value is false.
     */
    @Generated
    @Selector("enableSetNeedsDisplay")
    public native boolean enableSetNeedsDisplay();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] framebufferOnly
     * <p>
     * If the currentDrawable can be used for sampling or texture read operations
     * <p>
     * This defaults to YES. This property controls whether or not the returned drawables' MTLTextures may only be used
     * for framebuffer attachments (YES) or whether they may also be used for texture sampling and pixel read/write
     * operations (NO). A value of YES allows the CAMetalLayer to allocate the MTLTexture objects in ways that are
     * optimized for display purposes that makes them unsuitable for sampling. The recommended value for most
     * applications is YES.
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
     * initWithFrame:device
     * <p>
     * Initalize the view with a frame and device
     *
     * @param frameRect The frame rectangle for the created view object.
     * @param device    The MTLDevice to be used by the view to create Metal objects
     */
    @Generated
    @Selector("initWithFrame:device:")
    public native MTKView initWithFrameDevice(@ByValue CGRect frameRect,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * [@property] paused
     * <p>
     * Controls whether the draw methods should countinue at preferredFramesPerSecond
     * <p>
     * If true, the delegate will receive drawInMTKView: messages or the subclass will receive drawRect: messages at a
     * rate of preferredFramesPerSecond based on an internal timer. The default value is false.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * [@property] paused
     * <p>
     * Controls whether the draw methods should countinue at preferredFramesPerSecond
     * <p>
     * If true, the delegate will receive drawInMTKView: messages or the subclass will receive drawRect: messages at a
     * rate of preferredFramesPerSecond based on an internal timer. The default value is false.
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    @Generated
    @IsOptional
    @Selector("layerWillDraw:")
    public native void layerWillDraw(CALayer layer);

    @Generated
    @IsOptional
    @Selector("layoutSublayersOfLayer:")
    public native void layoutSublayersOfLayer(CALayer layer);

    /**
     * [@property] multisampleColorTexture
     * <p>
     * A multisample color texture that will be resolved into the currentDrawable's texture
     * <p>
     * The view will generate the multisample color buffer using the specified colorPixelFormat. This will be nil if
     * sampleCount is less than or equal to 1.
     */
    @Generated
    @Selector("multisampleColorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture multisampleColorTexture();

    /**
     * [@property] preferredFramesPerSecond
     * <p>
     * The rate you want the view to redraw its contents.
     * <p>
     * When your application sets its preferred frame rate, the view chooses a frame rate as close to that as possible
     * based on the capabilities of the screen the view is displayed on. The actual frame rate chosen is usually a
     * factor of the maximum refresh rate of the screen to provide a consistent frame rate. For example, if the maximum
     * refresh rate of the screen is 60 frames per second, that is also the highest frame rate the view sets as the
     * actual frame rate. However, if you ask for a lower frame rate, it might choose 30, 20, 15 or some other factor to
     * be the actual frame rate. Your application should choose a frame rate that it can consistently maintain. The
     * default value is 60 frames per second.
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * [@property] presentsWithTransaction
     * <p>
     * If the layer should be presented synchronously
     * <p>
     * Defaults to NO. When NO, changes to the layer's render buffer appear on-screen asynchronously to normal layer
     * updates. When YES, changes to the MTL content are sent to the screen via the standard CATransaction mechanisms.
     */
    @Generated
    @Selector("presentsWithTransaction")
    public native boolean presentsWithTransaction();

    /**
     * releaseDrawables
     * <p>
     * Release the depthStencilTexture and multisampleColorTexture
     * <p>
     * Can be called by the app to release the textures in order to conserve memory when it goes into the background.
     * The view will recreate multisampleColorTexture or depthStencilTexture upon the next access of the respective
     * properties. Both multisampleColorTexture and depthStencilTexture will be recreated in the access to
     * currentRenderPassDescriptor.
     */
    @Generated
    @Selector("releaseDrawables")
    public native void releaseDrawables();

    /**
     * [@property] sampleCount
     * <p>
     * The sample count used to to create multisampleColorTexture
     * <p>
     * This defaults to 1. If sampleCount is greater than 1 a multisampled color texture will be created and the
     * currentDrawable's texture will be set as the resolve texture in the currentRenderPassDescriptor and the store
     * action will be set to MTLStoreActionMultisampleResolve
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * [@property] autoResizeDrawable
     * <p>
     * Controls whether to resize the drawable as the view changes size.
     * <p>
     * If true, the size of the currentDrawable's texture, depthStencilTexture, and multisampleColorTexture will
     * automatically resize as the view resizes. If false, these textures will take on the size of drawableSize and
     * drawableSize will not change. The default value is true.
     */
    @Generated
    @Selector("setAutoResizeDrawable:")
    public native void setAutoResizeDrawable(boolean value);

    /**
     * [@property] clearColor
     * <p>
     * The clear color value used to generate the currentRenderPassDescriptor
     * <p>
     * This defaults to (0.0, 0.0, 0.0, 1.0)
     */
    @Generated
    @Selector("setClearColor:")
    public native void setClearColor(@ByValue MTLClearColor value);

    /**
     * [@property] clearDepth
     * <p>
     * The clear depth value used to generate the currentRenderPassDescriptor
     * <p>
     * This defaults to 1.0
     */
    @Generated
    @Selector("setClearDepth:")
    public native void setClearDepth(double value);

    /**
     * [@property] clearStencil
     * <p>
     * The clear stencil value used to generate currentRenderPassDescriptor
     * <p>
     * This defaults to 0
     */
    @Generated
    @Selector("setClearStencil:")
    public native void setClearStencil(int value);

    /**
     * [@property] colorPixelFormat
     * <p>
     * The pixelFormat for the drawable's texture.
     */
    @Generated
    @Selector("setColorPixelFormat:")
    public native void setColorPixelFormat(@NUInt long value);

    /**
     * [@property] delegate
     * <p>
     * The delegate handling common view operations
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MTKViewDelegate value);

    /**
     * [@property] delegate
     * <p>
     * The delegate handling common view operations
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
     * [@property] depthStencilPixelFormat
     * <p>
     * The pixelFormat used to create depthStencilTexture
     */
    @Generated
    @Selector("setDepthStencilPixelFormat:")
    public native void setDepthStencilPixelFormat(@NUInt long value);

    /**
     * [@property] device
     * <p>
     * The MTLDevice used to create Metal objects
     * <p>
     * This must be explicitly set by the application unless it was passed into the initializer. Defaults to nil
     */
    @Generated
    @Selector("setDevice:")
    public native void setDevice(@Mapped(ObjCObjectMapper.class) MTLDevice value);

    /**
     * [@property] drawableSize
     * <p>
     * The current size of drawable textures
     * <p>
     * The size currentDrawable's texture, depthStencilTexture, and multisampleColorTexture. If autoResizeDrawable is
     * true this value will be updated as the view's size changes. If autoResizeDrawable is false, this can be set to
     * fix the size of the drawable textures.
     */
    @Generated
    @Selector("setDrawableSize:")
    public native void setDrawableSize(@ByValue CGSize value);

    /**
     * [@property] enableSetNeedsDisplay
     * <p>
     * Controls whether the view responds to setNeedsDisplay.
     * <p>
     * If true, then the view behaves similarily to a UIView or NSView, responding to calls to setNeedsDisplay. When the
     * view has been marked for display, the view is automatically redisplayed on each pass through the application’s
     * event loop. Setting enableSetNeedsDisplay to true will also pause the MTKView's internal render loop and updates
     * will instead be event driven. The default value is false.
     */
    @Generated
    @Selector("setEnableSetNeedsDisplay:")
    public native void setEnableSetNeedsDisplay(boolean value);

    /**
     * [@property] framebufferOnly
     * <p>
     * If the currentDrawable can be used for sampling or texture read operations
     * <p>
     * This defaults to YES. This property controls whether or not the returned drawables' MTLTextures may only be used
     * for framebuffer attachments (YES) or whether they may also be used for texture sampling and pixel read/write
     * operations (NO). A value of YES allows the CAMetalLayer to allocate the MTLTexture objects in ways that are
     * optimized for display purposes that makes them unsuitable for sampling. The recommended value for most
     * applications is YES.
     */
    @Generated
    @Selector("setFramebufferOnly:")
    public native void setFramebufferOnly(boolean value);

    /**
     * [@property] preferredFramesPerSecond
     * <p>
     * The rate you want the view to redraw its contents.
     * <p>
     * When your application sets its preferred frame rate, the view chooses a frame rate as close to that as possible
     * based on the capabilities of the screen the view is displayed on. The actual frame rate chosen is usually a
     * factor of the maximum refresh rate of the screen to provide a consistent frame rate. For example, if the maximum
     * refresh rate of the screen is 60 frames per second, that is also the highest frame rate the view sets as the
     * actual frame rate. However, if you ask for a lower frame rate, it might choose 30, 20, 15 or some other factor to
     * be the actual frame rate. Your application should choose a frame rate that it can consistently maintain. The
     * default value is 60 frames per second.
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * [@property] presentsWithTransaction
     * <p>
     * If the layer should be presented synchronously
     * <p>
     * Defaults to NO. When NO, changes to the layer's render buffer appear on-screen asynchronously to normal layer
     * updates. When YES, changes to the MTL content are sent to the screen via the standard CATransaction mechanisms.
     */
    @Generated
    @Selector("setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean value);

    /**
     * [@property] sampleCount
     * <p>
     * The sample count used to to create multisampleColorTexture
     * <p>
     * This defaults to 1. If sampleCount is greater than 1 a multisampled color texture will be created and the
     * currentDrawable's texture will be set as the resolve texture in the currentRenderPassDescriptor and the store
     * action will be set to MTLStoreActionMultisampleResolve
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    /**
     * [@property] depthStencilAttachmentTextureUsage
     * <p>
     * The usage flags set on the depth attachment.
     * <p>
     * This property controls the texture usage flags set on the MTKView's depth-stencil attachment on creation. This
     * value defaults to MTLTextureUsageRenderTarget. The recommended value for most applications is
     * MTLTextureUsageRenderTarget. Changing this value re-creates the depth attachment, but any data currently in the
     * depth attachment will be lost.
     */
    @Generated
    @Selector("depthStencilAttachmentTextureUsage")
    @NUInt
    public native long depthStencilAttachmentTextureUsage();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * [@property] multisampleColorAttachmentTextureUsage
     * <p>
     * The texture usage flags for the multisample color attachment.
     * <p>
     * This property controls the texture usage flags set on the the multisample color attachment attachment. This value
     * defaults to MTLTextureUsageRenderTarget. The recommended value for most applications is
     * MTLTextureUsageRenderTarget. Changing this value re-creates the multisample color attachment, but any data
     * currently in the multisample color attachment will be lost.
     */
    @Generated
    @Selector("multisampleColorAttachmentTextureUsage")
    @NUInt
    public native long multisampleColorAttachmentTextureUsage();

    /**
     * [@property] preferredDevice
     * <p>
     * The preferred device is updated per-frame by the system in order to identify the most efficient GPU for
     * presentation (e.g. the one being used for compositing).
     * <p>
     * This value is determined by the underlying CAMetalLayer and this property is a convenience accessor for it.
     */
    @Generated
    @Selector("preferredDevice")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice preferredDevice();

    /**
     * [@property] preferredDrawableSize
     * <p>
     * The preferred drawable size reported by the backing NSView to match a NSView's native resolution.
     * <p>
     * this value can be observed via key-value observation to determine if the current native drawable size has
     * changed.
     */
    @Generated
    @Selector("preferredDrawableSize")
    @ByValue
    public native CGSize preferredDrawableSize();

    /**
     * [@property] depthStencilAttachmentTextureUsage
     * <p>
     * The usage flags set on the depth attachment.
     * <p>
     * This property controls the texture usage flags set on the MTKView's depth-stencil attachment on creation. This
     * value defaults to MTLTextureUsageRenderTarget. The recommended value for most applications is
     * MTLTextureUsageRenderTarget. Changing this value re-creates the depth attachment, but any data currently in the
     * depth attachment will be lost.
     */
    @Generated
    @Selector("setDepthStencilAttachmentTextureUsage:")
    public native void setDepthStencilAttachmentTextureUsage(@NUInt long value);

    /**
     * [@property] multisampleColorAttachmentTextureUsage
     * <p>
     * The texture usage flags for the multisample color attachment.
     * <p>
     * This property controls the texture usage flags set on the the multisample color attachment attachment. This value
     * defaults to MTLTextureUsageRenderTarget. The recommended value for most applications is
     * MTLTextureUsageRenderTarget. Changing this value re-creates the multisample color attachment, but any data
     * currently in the multisample color attachment will be lost.
     */
    @Generated
    @Selector("setMultisampleColorAttachmentTextureUsage:")
    public native void setMultisampleColorAttachmentTextureUsage(@NUInt long value);
}
