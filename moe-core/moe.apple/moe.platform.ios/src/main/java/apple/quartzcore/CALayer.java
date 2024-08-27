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

package apple.quartzcore;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.protocol.CALayerDelegate;
import apple.quartzcore.protocol.CAMediaTiming;
import apple.quartzcore.struct.CATransform3D;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The base layer class. *
 * 
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CALayer extends NSObject implements NSSecureCoding, CAMediaTiming {
    static {
        NatJ.register();
    }

    @Generated
    protected CALayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CALayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CALayer allocWithZone(VoidPtr zone);

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

    /**
     * Returns the default action object associated with the event named by
     * the string 'event'. The default implementation returns a suitable
     * animation object for events posted by animatable properties, nil
     * otherwise.
     */
    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    /**
     * Returns the default value of the named property, or nil if no
     * default value is known. Subclasses that override this method to
     * define default values for their own properties should call `super'
     * for unknown properties.
     */
    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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

    /**
     * Layer creation and initialization. *
     */
    @Generated
    @Selector("layer")
    public static native CALayer layer();

    /**
     * Method for subclasses to override. Returning true for a given
     * property causes the layer's contents to be redrawn when the property
     * is changed (including when changed by an animation attached to the
     * layer). The default implementation returns NO. Subclasses should
     * call super for properties defined by the superclass. (For example,
     * do not try to return YES for properties implemented by CALayer,
     * doing will have undefined results.)
     */
    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CALayer new_objc();

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
     * Returns the action object associated with the event named by the
     * string 'event'. The default implementation searches for an action
     * object in the following places:
     * 
     * 1. if defined, call the delegate method -actionForLayer:forKey:
     * 2. look in the layer's `actions' dictionary
     * 3. look in any `actions' dictionaries in the `style' hierarchy
     * 4. call +defaultActionForKey: on the layer's class
     * 
     * If any of these steps results in a non-nil action object, the
     * following steps are ignored. If the final result is an instance of
     * NSNull, it is converted to `nil'.
     */
    @Nullable
    @Generated
    @Selector("actionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAAction actionForKey(@NotNull String event);

    /**
     * A dictionary mapping keys to objects implementing the CAAction
     * protocol. Default value is nil.
     */
    @Nullable
    @Generated
    @Selector("actions")
    public native NSDictionary<String, ?> actions();

    /**
     * Attach an animation object to the layer. Typically this is implicitly
     * invoked through an action that is an CAAnimation object.
     * 
     * 'key' may be any string such that only one animation per unique key
     * is added per layer. The special key 'transition' is automatically
     * used for transition animations. The nil pointer is also a valid key.
     * 
     * If the `duration' property of the animation is zero or negative it
     * is given the default duration, either the value of the
     * `animationDuration' transaction property or .25 seconds otherwise.
     * 
     * The animation is copied before being added to the layer, so any
     * subsequent modifications to `anim' will have no affect unless it is
     * added to another layer.
     */
    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@NotNull CAAnimation anim, @Nullable String key);

    /**
     * Add 'layer' to the end of the receiver's sublayers array. If 'layer'
     * already has a superlayer, it will be removed before being added.
     */
    @Generated
    @Selector("addSublayer:")
    public native void addSublayer(@NotNull CALayer layer);

    /**
     * Convenience methods for accessing the `transform' property as an
     * affine transform.
     */
    @Generated
    @Selector("affineTransform")
    @ByValue
    public native CGAffineTransform affineTransform();

    /**
     * When true this layer is allowed to antialias its edges, as requested
     * by the value of the edgeAntialiasingMask property.
     * 
     * The default value is read from the boolean UIViewEdgeAntialiasing
     * property in the main bundle's Info.plist. If no value is found in
     * the Info.plist the default value is NO.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("allowsEdgeAntialiasing")
    public native boolean allowsEdgeAntialiasing();

    /**
     * When true, and the layer's opacity property is less than one, the
     * layer is allowed to composite itself as a group separate from its
     * parent. This gives the correct results when the layer contains
     * multiple opaque components, but may reduce performance.
     * 
     * The default value of the property is read from the boolean
     * UIViewGroupOpacity property in the main bundle's Info.plist. If no
     * value is found in the Info.plist the default value is YES for
     * applications linked against the iOS 7 SDK or later and NO for
     * applications linked against an earlier SDK.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("allowsGroupOpacity")
    public native boolean allowsGroupOpacity();

    /**
     * Defines the anchor point of the layer's bounds rect, as a point in
     * normalized layer coordinates - '(0, 0)' is the bottom left corner of
     * the bounds rect, '(1, 1)' is the top right corner. Defaults to
     * '(0.5, 0.5)', i.e. the center of the bounds rect. Animatable.
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    /**
     * The Z component of the layer's anchor point (i.e. reference point for
     * position and transform). Defaults to zero. Animatable.
     */
    @Generated
    @Selector("anchorPointZ")
    @NFloat
    public native double anchorPointZ();

    /**
     * Returns the animation added to the layer with identifier 'key', or nil
     * if no such animation exists. Attempting to modify any properties of
     * the returned object will result in undefined behavior.
     */
    @Nullable
    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(@NotNull String key);

    /**
     * Returns an array containing the keys of all animations currently
     * attached to the receiver. The order of the array matches the order
     * in which animations will be applied.
     */
    @Nullable
    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    /**
     * The background color of the layer. Default value is nil. Colors
     * created from tiled patterns are supported. Animatable.
     */
    @Nullable
    @Generated
    @Selector("backgroundColor")
    public native CGColorRef backgroundColor();

    /**
     * An array of filters that are applied to the background of the layer.
     * The root layer ignores this property. Animatable.
     */
    @Nullable
    @Generated
    @Selector("backgroundFilters")
    public native NSArray<?> backgroundFilters();

    @Generated
    @Selector("beginTime")
    public native double beginTime();

    /**
     * The color of the layer's border. Defaults to opaque black. Colors
     * created from tiled patterns are supported. Animatable.
     */
    @Nullable
    @Generated
    @Selector("borderColor")
    public native CGColorRef borderColor();

    /**
     * The width of the layer's border, inset from the layer bounds. The
     * border is composited above the layer's content and sublayers and
     * includes the effects of the `cornerRadius' property. Defaults to
     * zero. Animatable.
     */
    @Generated
    @Selector("borderWidth")
    @NFloat
    public native double borderWidth();

    /**
     * The bounds of the layer. Defaults to CGRectZero. Animatable.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * A filter object used to composite the layer with its (possibly
     * filtered) background. Default value is nil, which implies source-
     * over compositing. Animatable.
     * 
     * Note that if the inputs of the filter are modified directly after
     * the filter is attached to a layer, the behavior is undefined. The
     * filter must either be reattached to the layer, or filter properties
     * should be modified by calling -setValue:forKeyPath: on each layer
     * that the filter is attached to. (This also applies to the `filters'
     * and `backgroundFilters' properties.)
     */
    @Nullable
    @Generated
    @Selector("compositingFilter")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object compositingFilter();

    /**
     * Returns true if the bounds of the layer contains point 'p'.
     */
    @Generated
    @Selector("containsPoint:")
    public native boolean containsPoint(@ByValue CGPoint p);

    /**
     * An object providing the contents of the layer, typically a CGImageRef
     * or an IOSurfaceRef, but may be something else. (For example, NSImage
     * objects are supported on Mac OS X 10.6 and later.) Default value is nil.
     * Animatable.
     */
    @Nullable
    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    /**
     * Returns true if the contents of the contents property of the layer
     * will be implicitly flipped when rendered in relation to the local
     * coordinate space (e.g. if there are an odd number of layers with
     * flippedGeometry=YES from the receiver up to and including the
     * implicit container of the root layer). Subclasses should not attempt
     * to redefine this method. When this method returns true the
     * CGContextRef object passed to -drawInContext: by the default
     * -display method will have been y- flipped (and rectangles passed to
     * -setNeedsDisplayInRect: will be similarly flipped).
     */
    @Generated
    @Selector("contentsAreFlipped")
    public native boolean contentsAreFlipped();

    /**
     * A rectangle in normalized image coordinates defining the scaled
     * center part of the `contents' image.
     * 
     * When an image is resized due to its `contentsGravity' property its
     * center part implicitly defines the 3x3 grid that controls how the
     * image is scaled to its drawn size. The center part is stretched in
     * both dimensions; the top and bottom parts are only stretched
     * horizontally; the left and right parts are only stretched
     * vertically; the four corner parts are not stretched at all. (This is
     * often called "9-slice scaling".)
     * 
     * The rectangle is interpreted after the effects of the `contentsRect'
     * property have been applied. It defaults to the unit rectangle [0 0 1
     * 1] meaning that the entire image is scaled. As a special case, if
     * the width or height is zero, it is implicitly adjusted to the width
     * or height of a single source pixel centered at that position. If the
     * rectangle extends outside the [0 0 1 1] unit rectangle the result is
     * undefined. Animatable.
     */
    @Generated
    @Selector("contentsCenter")
    @ByValue
    public native CGRect contentsCenter();

    /**
     * A hint for the desired storage format of the layer contents provided by
     * -drawLayerInContext. Defaults to kCAContentsFormatRGBA8Uint. Note that this
     * does not affect the interpretation of the `contents' property directly.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("contentsFormat")
    public native String contentsFormat();

    /**
     * A string defining how the contents of the layer is mapped into its
     * bounds rect. Options are `center', `top', `bottom', `left',
     * `right', `topLeft', `topRight', `bottomLeft', `bottomRight',
     * `resize', `resizeAspect', `resizeAspectFill'. The default value is
     * `resize'. Note that "bottom" always means "Minimum Y" and "top"
     * always means "Maximum Y".
     */
    @NotNull
    @Generated
    @Selector("contentsGravity")
    public native String contentsGravity();

    /**
     * A rectangle in normalized image coordinates defining the
     * subrectangle of the `contents' property that will be drawn into the
     * layer. If pixels outside the unit rectangles are requested, the edge
     * pixels of the contents image will be extended outwards. If an empty
     * rectangle is provided, the results are undefined. Defaults to the
     * unit rectangle [0 0 1 1]. Animatable.
     */
    @Generated
    @Selector("contentsRect")
    @ByValue
    public native CGRect contentsRect();

    /**
     * Defines the scale factor applied to the contents of the layer. If
     * the physical size of the contents is '(w, h)' then the logical size
     * (i.e. for contentsGravity calculations) is defined as '(w /
     * contentsScale, h / contentsScale)'. Applies to both images provided
     * explicitly and content provided via -drawInContext: (i.e. if
     * contentsScale is two -drawInContext: will draw into a buffer twice
     * as large as the layer bounds). Defaults to one. Animatable.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("contentsScale")
    @NFloat
    public native double contentsScale();

    /**
     * Mapping between layer coordinate and time spaces. *
     */
    @Generated
    @Selector("convertPoint:fromLayer:")
    @ByValue
    public native CGPoint convertPointFromLayer(@ByValue CGPoint p, @Nullable CALayer l);

    @Generated
    @Selector("convertPoint:toLayer:")
    @ByValue
    public native CGPoint convertPointToLayer(@ByValue CGPoint p, @Nullable CALayer l);

    @Generated
    @Selector("convertRect:fromLayer:")
    @ByValue
    public native CGRect convertRectFromLayer(@ByValue CGRect r, @Nullable CALayer l);

    @Generated
    @Selector("convertRect:toLayer:")
    @ByValue
    public native CGRect convertRectToLayer(@ByValue CGRect r, @Nullable CALayer l);

    @Generated
    @Selector("convertTime:fromLayer:")
    public native double convertTimeFromLayer(double t, @Nullable CALayer l);

    @Generated
    @Selector("convertTime:toLayer:")
    public native double convertTimeToLayer(double t, @Nullable CALayer l);

    /**
     * When positive, the background of the layer will be drawn with
     * rounded corners. Also effects the mask generated by the
     * `masksToBounds' property. Defaults to zero. Animatable.
     */
    @Generated
    @Selector("cornerRadius")
    @NFloat
    public native double cornerRadius();

    /**
     * An object that will receive the CALayer delegate methods defined
     * below (for those that it implements). The value of this property is
     * not retained. Default value is nil.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CALayerDelegate delegate();

    /**
     * Reload the content of this layer. Calls the -drawInContext: method
     * then updates the `contents' property of the layer. Typically this is
     * not called directly.
     */
    @Generated
    @Selector("display")
    public native void display();

    /**
     * Call -display if receiver is marked as needing redrawing.
     */
    @Generated
    @Selector("displayIfNeeded")
    public native void displayIfNeeded();

    /**
     * Called via the -display method when the `contents' property is being
     * updated. Default implementation does nothing. The context may be
     * clipped to protect valid layer content. Subclasses that wish to find
     * the actual region to draw can call CGContextGetClipBoundingBox().
     */
    @Generated
    @Selector("drawInContext:")
    public native void drawInContext(@NotNull CGContextRef ctx);

    /**
     * When true, the CGContext object passed to the -drawInContext: method
     * may queue the drawing commands submitted to it, such that they will
     * be executed later (i.e. asynchronously to the execution of the
     * -drawInContext: method). This may allow the layer to complete its
     * drawing operations sooner than when executing synchronously. The
     * default value is NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("drawsAsynchronously")
    public native boolean drawsAsynchronously();

    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * Defines how the edges of the layer are rasterized. For each of the
     * four edges (left, right, bottom, top) if the corresponding bit is
     * set the edge will be antialiased. Typically this property is used to
     * disable antialiasing for edges that abut edges of other layers, to
     * eliminate the seams that would otherwise occur. The default value is
     * for all edges to be antialiased.
     */
    @Generated
    @Selector("edgeAntialiasingMask")
    public native int edgeAntialiasingMask();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("fillMode")
    public native String fillMode();

    /**
     * An array of filters that will be applied to the contents of the
     * layer and its sublayers. Defaults to nil. Animatable.
     */
    @Nullable
    @Generated
    @Selector("filters")
    public native NSArray<?> filters();

    /**
     * Unlike NSView, each Layer in the hierarchy has an implicit frame
     * rectangle, a function of the `position', `bounds', `anchorPoint',
     * and `transform' properties. When setting the frame the `position'
     * and `bounds.size' are changed to match the given frame.
     */
    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    /**
     * Returns the farthest descendant of the layer containing point 'p'.
     * Siblings are searched in top-to-bottom order. 'p' is defined to be
     * in the coordinate space of the receiver's nearest ancestor that
     * isn't a CATransformLayer (transform layers don't have a 2D
     * coordinate space in which the point could be specified).
     */
    @Nullable
    @Generated
    @Selector("hitTest:")
    public native CALayer hitTest(@ByValue CGPoint p);

    /**
     * The designated initializer.
     */
    @Generated
    @Selector("init")
    public native CALayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CALayer initWithCoder(@NotNull NSCoder coder);

    /**
     * This initializer is used by CoreAnimation to create shadow copies of
     * layers, e.g. for use as presentation layers. Subclasses can override
     * this method to copy their instance variables into the presentation
     * layer (subclasses should call the superclass afterwards). Calling this
     * method in any other situation will result in undefined behavior.
     */
    @Generated
    @Selector("initWithLayer:")
    public native CALayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    @Generated
    @Selector("insertSublayer:above:")
    public native void insertSublayerAbove(@NotNull CALayer layer, @Nullable CALayer sibling);

    /**
     * Insert 'layer' at position 'idx' in the receiver's sublayers array.
     * If 'layer' already has a superlayer, it will be removed before being
     * inserted.
     */
    @Generated
    @Selector("insertSublayer:atIndex:")
    public native void insertSublayerAtIndex(@NotNull CALayer layer, int idx);

    /**
     * Insert 'layer' either above or below the specified layer in the
     * receiver's sublayers array. If 'layer' already has a superlayer, it
     * will be removed before being inserted.
     */
    @Generated
    @Selector("insertSublayer:below:")
    public native void insertSublayerBelow(@NotNull CALayer layer, @Nullable CALayer sibling);

    /**
     * When false layers facing away from the viewer are hidden from view.
     * Defaults to YES. Animatable.
     */
    @Generated
    @Selector("isDoubleSided")
    public native boolean isDoubleSided();

    /**
     * When false layers facing away from the viewer are hidden from view.
     * Defaults to YES. Animatable.
     */
    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    /**
     * Whether or not the geometry of the layer (and its sublayers) is
     * flipped vertically. Defaults to NO. Note that even when geometry is
     * flipped, image orientation remains the same (i.e. a CGImageRef
     * stored in the `contents' property will display the same with both
     * flipped=NO and flipped=YES, assuming no transform on the layer).
     */
    @Generated
    @Selector("isGeometryFlipped")
    public native boolean isGeometryFlipped();

    /**
     * Whether or not the geometry of the layer (and its sublayers) is
     * flipped vertically. Defaults to NO. Note that even when geometry is
     * flipped, image orientation remains the same (i.e. a CGImageRef
     * stored in the `contents' property will display the same with both
     * flipped=NO and flipped=YES, assuming no transform on the layer).
     */
    @Generated
    @Selector("setGeometryFlipped:")
    public native void setGeometryFlipped(boolean value);

    /**
     * When true the layer and its sublayers are not displayed. Defaults to
     * NO. Animatable.
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * When true the layer and its sublayers are not displayed. Defaults to
     * NO. Animatable.
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * A hint marking that the layer contents provided by -drawInContext:
     * is completely opaque. Defaults to NO. Note that this does not affect
     * the interpretation of the `contents' property directly.
     */
    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    /**
     * A hint marking that the layer contents provided by -drawInContext:
     * is completely opaque. Defaults to NO. Note that this does not affect
     * the interpretation of the `contents' property directly.
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * Traverse upwards from the layer while the superlayer requires layout.
     * Then layout the entire tree beneath that ancestor.
     */
    @Generated
    @Selector("layoutIfNeeded")
    public native void layoutIfNeeded();

    /**
     * Called when the layer requires layout. The default implementation
     * calls the layout manager if one exists and it implements the
     * -layoutSublayersOfLayer: method. Subclasses can override this to
     * provide their own layout algorithm, which should set the frame of
     * each sublayer.
     */
    @Generated
    @Selector("layoutSublayers")
    public native void layoutSublayers();

    @NotNull
    @Generated
    @Selector("magnificationFilter")
    public native String magnificationFilter();

    /**
     * A layer whose alpha channel is used as a mask to select between the
     * layer's background and the result of compositing the layer's
     * contents with its filtered background. Defaults to nil. When used as
     * a mask the layer's `compositingFilter' and `backgroundFilters'
     * properties are ignored. When setting the mask to a new layer, the
     * new layer must have a nil superlayer, otherwise the behavior is
     * undefined. Nested masks (mask layers with their own masks) are
     * unsupported.
     */
    @Nullable
    @Generated
    @Selector("mask")
    public native CALayer mask();

    /**
     * When true an implicit mask matching the layer bounds is applied to
     * the layer (including the effects of the `cornerRadius' property). If
     * both `mask' and `masksToBounds' are non-nil the two masks are
     * multiplied to get the actual mask values. Defaults to NO.
     * Animatable.
     */
    @Generated
    @Selector("masksToBounds")
    public native boolean masksToBounds();

    /**
     * The filter types to use when rendering the `contents' property of
     * the layer. The minification filter is used when to reduce the size
     * of image data, the magnification filter to increase the size of
     * image data. Currently the allowed values are `nearest' and `linear'.
     * Both properties default to `linear'.
     */
    @NotNull
    @Generated
    @Selector("minificationFilter")
    public native String minificationFilter();

    /**
     * The bias factor added when determining which levels of detail to use
     * when minifying using trilinear filtering. The default value is 0.
     * Animatable.
     */
    @Generated
    @Selector("minificationFilterBias")
    public native float minificationFilterBias();

    /**
     * When called on the result of the -presentationLayer method, returns
     * the underlying layer with the current model values. When called on a
     * non-presentation layer, returns the receiver. The result of calling
     * this method after the transaction that produced the presentation
     * layer has completed is undefined.
     */
    @NotNull
    @Generated
    @Selector("modelLayer")
    public native CALayer modelLayer();

    /**
     * The name of the layer. Used by some layout managers. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Returns true when the layer is marked as needing redrawing.
     */
    @Generated
    @Selector("needsDisplay")
    public native boolean needsDisplay();

    /**
     * When true -setNeedsDisplay will automatically be called when the
     * bounds of the layer changes. Default value is NO.
     */
    @Generated
    @Selector("needsDisplayOnBoundsChange")
    public native boolean needsDisplayOnBoundsChange();

    /**
     * Returns true when the receiver is marked as needing layout.
     */
    @Generated
    @Selector("needsLayout")
    public native boolean needsLayout();

    /**
     * The opacity of the layer, as a value between zero and one. Defaults
     * to one. Specifying a value outside the [0,1] range will give undefined
     * results. Animatable.
     */
    @Generated
    @Selector("opacity")
    public native float opacity();

    /**
     * The position in the superlayer that the anchor point of the layer's
     * bounds rect is aligned to. Defaults to the zero point. Animatable.
     */
    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    /**
     * Returns the preferred frame size of the layer in the coordinate
     * space of the superlayer. The default implementation calls the layout
     * manager if one exists and it implements the -preferredSizeOfLayer:
     * method, otherwise returns the size of the bounds rect mapped into
     * the superlayer.
     */
    @Generated
    @Selector("preferredFrameSize")
    @ByValue
    public native CGSize preferredFrameSize();

    /**
     * Returns a copy of the layer containing all properties as they were
     * at the start of the current transaction, with any active animations
     * applied. This gives a close approximation to the version of the layer
     * that is currently displayed. Returns nil if the layer has not yet
     * been committed.
     * 
     * The effect of attempting to modify the returned layer in any way is
     * undefined.
     * 
     * The `sublayers', `mask' and `superlayer' properties of the returned
     * layer return the presentation versions of these properties. This
     * carries through to read-only layer methods. E.g., calling -hitTest:
     * on the result of the -presentationLayer will query the presentation
     * values of the layer tree.
     */
    @Nullable
    @Generated
    @Selector("presentationLayer")
    public native CALayer presentationLayer();

    /**
     * The scale at which the layer will be rasterized (when the
     * shouldRasterize property has been set to YES) relative to the
     * coordinate space of the layer. Defaults to one. Animatable.
     */
    @Generated
    @Selector("rasterizationScale")
    @NFloat
    public native double rasterizationScale();

    /**
     * Remove all animations attached to the layer.
     */
    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    /**
     * Remove any animation attached to the layer for 'key'.
     */
    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(@NotNull String key);

    /**
     * Removes the layer from its superlayer, works both if the receiver is
     * in its superlayer's `sublayers' array or set as its `mask' value.
     */
    @Generated
    @Selector("removeFromSuperlayer")
    public native void removeFromSuperlayer();

    /**
     * Renders the receiver and its sublayers into 'ctx'. This method
     * renders directly from the layer tree. Renders in the coordinate space
     * of the layer.
     * 
     * WARNING: currently this method does not implement the full
     * CoreAnimation composition model, use with caution.
     */
    @Generated
    @Selector("renderInContext:")
    public native void renderInContext(@NotNull CGContextRef ctx);

    @Generated
    @Selector("repeatCount")
    public native float repeatCount();

    @Generated
    @Selector("repeatDuration")
    public native double repeatDuration();

    /**
     * Remove 'oldLayer' from the sublayers array of the receiver and insert
     * 'newLayer' if non-nil in its position. If the superlayer of 'oldLayer'
     * is not the receiver, the behavior is undefined.
     */
    @Generated
    @Selector("replaceSublayer:with:")
    public native void replaceSublayerWith(@NotNull CALayer oldLayer, @NotNull CALayer newLayer);

    /**
     * These methods search for the closest ancestor CAScrollLayer of the *
     * receiver, and then call either -scrollToPoint: or -scrollToRect: on
     * that layer with the specified geometry converted from the coordinate
     * space of the receiver to that of the found scroll layer.
     */
    @Generated
    @Selector("scrollPoint:")
    public native void scrollPoint(@ByValue CGPoint p);

    @Generated
    @Selector("scrollRectToVisible:")
    public native void scrollRectToVisible(@ByValue CGRect r);

    /**
     * A dictionary mapping keys to objects implementing the CAAction
     * protocol. Default value is nil.
     */
    @Generated
    @Selector("setActions:")
    public native void setActions(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Selector("setAffineTransform:")
    public native void setAffineTransform(@ByValue CGAffineTransform m);

    /**
     * When true this layer is allowed to antialias its edges, as requested
     * by the value of the edgeAntialiasingMask property.
     * 
     * The default value is read from the boolean UIViewEdgeAntialiasing
     * property in the main bundle's Info.plist. If no value is found in
     * the Info.plist the default value is NO.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("setAllowsEdgeAntialiasing:")
    public native void setAllowsEdgeAntialiasing(boolean value);

    /**
     * When true, and the layer's opacity property is less than one, the
     * layer is allowed to composite itself as a group separate from its
     * parent. This gives the correct results when the layer contains
     * multiple opaque components, but may reduce performance.
     * 
     * The default value of the property is read from the boolean
     * UIViewGroupOpacity property in the main bundle's Info.plist. If no
     * value is found in the Info.plist the default value is YES for
     * applications linked against the iOS 7 SDK or later and NO for
     * applications linked against an earlier SDK.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("setAllowsGroupOpacity:")
    public native void setAllowsGroupOpacity(boolean value);

    /**
     * Defines the anchor point of the layer's bounds rect, as a point in
     * normalized layer coordinates - '(0, 0)' is the bottom left corner of
     * the bounds rect, '(1, 1)' is the top right corner. Defaults to
     * '(0.5, 0.5)', i.e. the center of the bounds rect. Animatable.
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    /**
     * The Z component of the layer's anchor point (i.e. reference point for
     * position and transform). Defaults to zero. Animatable.
     */
    @Generated
    @Selector("setAnchorPointZ:")
    public native void setAnchorPointZ(@NFloat double value);

    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    /**
     * The background color of the layer. Default value is nil. Colors
     * created from tiled patterns are supported. Animatable.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(@Nullable CGColorRef value);

    /**
     * An array of filters that are applied to the background of the layer.
     * The root layer ignores this property. Animatable.
     */
    @Generated
    @Selector("setBackgroundFilters:")
    public native void setBackgroundFilters(@Nullable NSArray<?> value);

    @Generated
    @Selector("setBeginTime:")
    public native void setBeginTime(double value);

    /**
     * The color of the layer's border. Defaults to opaque black. Colors
     * created from tiled patterns are supported. Animatable.
     */
    @Generated
    @Selector("setBorderColor:")
    public native void setBorderColor(@Nullable CGColorRef value);

    /**
     * The width of the layer's border, inset from the layer bounds. The
     * border is composited above the layer's content and sublayers and
     * includes the effects of the `cornerRadius' property. Defaults to
     * zero. Animatable.
     */
    @Generated
    @Selector("setBorderWidth:")
    public native void setBorderWidth(@NFloat double value);

    /**
     * The bounds of the layer. Defaults to CGRectZero. Animatable.
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    /**
     * A filter object used to composite the layer with its (possibly
     * filtered) background. Default value is nil, which implies source-
     * over compositing. Animatable.
     * 
     * Note that if the inputs of the filter are modified directly after
     * the filter is attached to a layer, the behavior is undefined. The
     * filter must either be reattached to the layer, or filter properties
     * should be modified by calling -setValue:forKeyPath: on each layer
     * that the filter is attached to. (This also applies to the `filters'
     * and `backgroundFilters' properties.)
     */
    @Generated
    @Selector("setCompositingFilter:")
    public native void setCompositingFilter(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * An object providing the contents of the layer, typically a CGImageRef
     * or an IOSurfaceRef, but may be something else. (For example, NSImage
     * objects are supported on Mac OS X 10.6 and later.) Default value is nil.
     * Animatable.
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * A rectangle in normalized image coordinates defining the scaled
     * center part of the `contents' image.
     * 
     * When an image is resized due to its `contentsGravity' property its
     * center part implicitly defines the 3x3 grid that controls how the
     * image is scaled to its drawn size. The center part is stretched in
     * both dimensions; the top and bottom parts are only stretched
     * horizontally; the left and right parts are only stretched
     * vertically; the four corner parts are not stretched at all. (This is
     * often called "9-slice scaling".)
     * 
     * The rectangle is interpreted after the effects of the `contentsRect'
     * property have been applied. It defaults to the unit rectangle [0 0 1
     * 1] meaning that the entire image is scaled. As a special case, if
     * the width or height is zero, it is implicitly adjusted to the width
     * or height of a single source pixel centered at that position. If the
     * rectangle extends outside the [0 0 1 1] unit rectangle the result is
     * undefined. Animatable.
     */
    @Generated
    @Selector("setContentsCenter:")
    public native void setContentsCenter(@ByValue CGRect value);

    /**
     * A hint for the desired storage format of the layer contents provided by
     * -drawLayerInContext. Defaults to kCAContentsFormatRGBA8Uint. Note that this
     * does not affect the interpretation of the `contents' property directly.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setContentsFormat:")
    public native void setContentsFormat(@NotNull String value);

    /**
     * A string defining how the contents of the layer is mapped into its
     * bounds rect. Options are `center', `top', `bottom', `left',
     * `right', `topLeft', `topRight', `bottomLeft', `bottomRight',
     * `resize', `resizeAspect', `resizeAspectFill'. The default value is
     * `resize'. Note that "bottom" always means "Minimum Y" and "top"
     * always means "Maximum Y".
     */
    @Generated
    @Selector("setContentsGravity:")
    public native void setContentsGravity(@NotNull String value);

    /**
     * A rectangle in normalized image coordinates defining the
     * subrectangle of the `contents' property that will be drawn into the
     * layer. If pixels outside the unit rectangles are requested, the edge
     * pixels of the contents image will be extended outwards. If an empty
     * rectangle is provided, the results are undefined. Defaults to the
     * unit rectangle [0 0 1 1]. Animatable.
     */
    @Generated
    @Selector("setContentsRect:")
    public native void setContentsRect(@ByValue CGRect value);

    /**
     * Defines the scale factor applied to the contents of the layer. If
     * the physical size of the contents is '(w, h)' then the logical size
     * (i.e. for contentsGravity calculations) is defined as '(w /
     * contentsScale, h / contentsScale)'. Applies to both images provided
     * explicitly and content provided via -drawInContext: (i.e. if
     * contentsScale is two -drawInContext: will draw into a buffer twice
     * as large as the layer bounds). Defaults to one. Animatable.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setContentsScale:")
    public native void setContentsScale(@NFloat double value);

    /**
     * When positive, the background of the layer will be drawn with
     * rounded corners. Also effects the mask generated by the
     * `masksToBounds' property. Defaults to zero. Animatable.
     */
    @Generated
    @Selector("setCornerRadius:")
    public native void setCornerRadius(@NFloat double value);

    /**
     * An object that will receive the CALayer delegate methods defined
     * below (for those that it implements). The value of this property is
     * not retained. Default value is nil.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) CALayerDelegate value);

    /**
     * An object that will receive the CALayer delegate methods defined
     * below (for those that it implements). The value of this property is
     * not retained. Default value is nil.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CALayerDelegate value) {
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
     * When true, the CGContext object passed to the -drawInContext: method
     * may queue the drawing commands submitted to it, such that they will
     * be executed later (i.e. asynchronously to the execution of the
     * -drawInContext: method). This may allow the layer to complete its
     * drawing operations sooner than when executing synchronously. The
     * default value is NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setDrawsAsynchronously:")
    public native void setDrawsAsynchronously(boolean value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * Defines how the edges of the layer are rasterized. For each of the
     * four edges (left, right, bottom, top) if the corresponding bit is
     * set the edge will be antialiased. Typically this property is used to
     * disable antialiasing for edges that abut edges of other layers, to
     * eliminate the seams that would otherwise occur. The default value is
     * for all edges to be antialiased.
     */
    @Generated
    @Selector("setEdgeAntialiasingMask:")
    public native void setEdgeAntialiasingMask(int value);

    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(@NotNull String value);

    /**
     * An array of filters that will be applied to the contents of the
     * layer and its sublayers. Defaults to nil. Animatable.
     */
    @Generated
    @Selector("setFilters:")
    public native void setFilters(@Nullable NSArray<?> value);

    /**
     * Unlike NSView, each Layer in the hierarchy has an implicit frame
     * rectangle, a function of the `position', `bounds', `anchorPoint',
     * and `transform' properties. When setting the frame the `position'
     * and `bounds.size' are changed to match the given frame.
     */
    @Generated
    @Selector("setFrame:")
    public native void setFrame(@ByValue CGRect value);

    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(@NotNull String value);

    /**
     * A layer whose alpha channel is used as a mask to select between the
     * layer's background and the result of compositing the layer's
     * contents with its filtered background. Defaults to nil. When used as
     * a mask the layer's `compositingFilter' and `backgroundFilters'
     * properties are ignored. When setting the mask to a new layer, the
     * new layer must have a nil superlayer, otherwise the behavior is
     * undefined. Nested masks (mask layers with their own masks) are
     * unsupported.
     */
    @Generated
    @Selector("setMask:")
    public native void setMask(@Nullable CALayer value);

    /**
     * When true an implicit mask matching the layer bounds is applied to
     * the layer (including the effects of the `cornerRadius' property). If
     * both `mask' and `masksToBounds' are non-nil the two masks are
     * multiplied to get the actual mask values. Defaults to NO.
     * Animatable.
     */
    @Generated
    @Selector("setMasksToBounds:")
    public native void setMasksToBounds(boolean value);

    /**
     * The filter types to use when rendering the `contents' property of
     * the layer. The minification filter is used when to reduce the size
     * of image data, the magnification filter to increase the size of
     * image data. Currently the allowed values are `nearest' and `linear'.
     * Both properties default to `linear'.
     */
    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(@NotNull String value);

    /**
     * The bias factor added when determining which levels of detail to use
     * when minifying using trilinear filtering. The default value is 0.
     * Animatable.
     */
    @Generated
    @Selector("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float value);

    /**
     * The name of the layer. Used by some layout managers. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * Marks that -display needs to be called before the layer is next
     * committed. If a region is specified, only that region of the layer
     * is invalidated.
     */
    @Generated
    @Selector("setNeedsDisplay")
    public native void setNeedsDisplay();

    @Generated
    @Selector("setNeedsDisplayInRect:")
    public native void setNeedsDisplayInRect(@ByValue CGRect r);

    /**
     * When true -setNeedsDisplay will automatically be called when the
     * bounds of the layer changes. Default value is NO.
     */
    @Generated
    @Selector("setNeedsDisplayOnBoundsChange:")
    public native void setNeedsDisplayOnBoundsChange(boolean value);

    /**
     * Marks that -layoutSublayers needs to be invoked on the receiver
     * before the next update. If the receiver's layout manager implements
     * the -invalidateLayoutOfLayer: method it will be called.
     * 
     * This method is automatically invoked on a layer whenever its
     * `sublayers' or `layoutManager' property is modified, and is invoked
     * on the layer and its superlayer whenever its `bounds' or `transform'
     * properties are modified. Implicit calls to -setNeedsLayout are
     * skipped if the layer is currently executing its -layoutSublayers
     * method.
     */
    @Generated
    @Selector("setNeedsLayout")
    public native void setNeedsLayout();

    /**
     * The opacity of the layer, as a value between zero and one. Defaults
     * to one. Specifying a value outside the [0,1] range will give undefined
     * results. Animatable.
     */
    @Generated
    @Selector("setOpacity:")
    public native void setOpacity(float value);

    /**
     * The position in the superlayer that the anchor point of the layer's
     * bounds rect is aligned to. Defaults to the zero point. Animatable.
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue CGPoint value);

    /**
     * The scale at which the layer will be rasterized (when the
     * shouldRasterize property has been set to YES) relative to the
     * coordinate space of the layer. Defaults to one. Animatable.
     */
    @Generated
    @Selector("setRasterizationScale:")
    public native void setRasterizationScale(@NFloat double value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    public native void setRepeatDuration(double value);

    /**
     * The color of the shadow. Defaults to opaque black. Colors created
     * from patterns are currently NOT supported. Animatable.
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Nullable CGColorRef value);

    /**
     * The shadow offset. Defaults to (0, -3). Animatable.
     */
    @Generated
    @Selector("setShadowOffset:")
    public native void setShadowOffset(@ByValue CGSize value);

    /**
     * The opacity of the shadow. Defaults to 0. Specifying a value outside the
     * [0,1] range will give undefined results. Animatable.
     */
    @Generated
    @Selector("setShadowOpacity:")
    public native void setShadowOpacity(float value);

    /**
     * When non-null this path defines the outline used to construct the
     * layer's shadow instead of using the layer's composited alpha
     * channel. The path is rendered using the non-zero winding rule.
     * Specifying the path explicitly using this property will usually
     * improve rendering performance, as will sharing the same path
     * reference across multiple layers. Upon assignment the path is copied.
     * Defaults to null. Animatable.
     */
    @Generated
    @Selector("setShadowPath:")
    public native void setShadowPath(@Nullable CGPathRef value);

    /**
     * The blur radius used to create the shadow. Defaults to 3. Animatable.
     */
    @Generated
    @Selector("setShadowRadius:")
    public native void setShadowRadius(@NFloat double value);

    /**
     * When true, the layer is rendered as a bitmap in its local coordinate
     * space ("rasterized"), then the bitmap is composited into the
     * destination (with the minificationFilter and magnificationFilter
     * properties of the layer applied if the bitmap needs scaling).
     * Rasterization occurs after the layer's filters and shadow effects
     * are applied, but before the opacity modulation. As an implementation
     * detail the rendering engine may attempt to cache and reuse the
     * bitmap from one frame to the next. (Whether it does or not will have
     * no affect on the rendered output.)
     * 
     * When false the layer is composited directly into the destination
     * whenever possible (however, certain features of the compositing
     * model may force rasterization, e.g. adding filters).
     * 
     * Defaults to NO. Animatable.
     */
    @Generated
    @Selector("setShouldRasterize:")
    public native void setShouldRasterize(boolean value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(float value);

    /**
     * When non-nil, a dictionary dereferenced to find property values that
     * aren't explicitly defined by the layer. (This dictionary may in turn
     * have a `style' property, forming a hierarchy of default values.)
     * If the style dictionary doesn't define a value for an attribute, the
     * +defaultValueForKey: method is called. Defaults to nil.
     * 
     * Note that if the dictionary or any of its ancestors are modified,
     * the values of the layer's properties are undefined until the `style'
     * property is reset.
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@Nullable NSDictionary<?, ?> value);

    /**
     * A transform applied to each member of the `sublayers' array while
     * rendering its contents into the receiver's output. Typically used as
     * the projection matrix to add perspective and other viewing effects
     * into the model. Defaults to identity. Animatable.
     */
    @Generated
    @Selector("setSublayerTransform:")
    public native void setSublayerTransform(@ByValue CATransform3D value);

    /**
     * The array of sublayers of this layer. The layers are listed in back
     * to front order. Defaults to nil. When setting the value of the
     * property, any newly added layers must have nil superlayers, otherwise
     * the behavior is undefined. Note that the returned array is not
     * guaranteed to retain its elements.
     */
    @Generated
    @Selector("setSublayers:")
    public native void setSublayers(@Nullable NSArray<? extends CALayer> value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    /**
     * A transform applied to the layer relative to the anchor point of its
     * bounds rect. Defaults to the identity transform. Animatable.
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CATransform3D value);

    /**
     * The Z component of the layer's position in its superlayer. Defaults
     * to zero. Animatable.
     */
    @Generated
    @Selector("setZPosition:")
    public native void setZPosition(@NFloat double value);

    /**
     * The color of the shadow. Defaults to opaque black. Colors created
     * from patterns are currently NOT supported. Animatable.
     */
    @Nullable
    @Generated
    @Selector("shadowColor")
    public native CGColorRef shadowColor();

    /**
     * The shadow offset. Defaults to (0, -3). Animatable.
     */
    @Generated
    @Selector("shadowOffset")
    @ByValue
    public native CGSize shadowOffset();

    /**
     * The opacity of the shadow. Defaults to 0. Specifying a value outside the
     * [0,1] range will give undefined results. Animatable.
     */
    @Generated
    @Selector("shadowOpacity")
    public native float shadowOpacity();

    /**
     * When non-null this path defines the outline used to construct the
     * layer's shadow instead of using the layer's composited alpha
     * channel. The path is rendered using the non-zero winding rule.
     * Specifying the path explicitly using this property will usually
     * improve rendering performance, as will sharing the same path
     * reference across multiple layers. Upon assignment the path is copied.
     * Defaults to null. Animatable.
     */
    @Nullable
    @Generated
    @Selector("shadowPath")
    public native CGPathRef shadowPath();

    /**
     * The blur radius used to create the shadow. Defaults to 3. Animatable.
     */
    @Generated
    @Selector("shadowRadius")
    @NFloat
    public native double shadowRadius();

    /**
     * Called by the object's implementation of -encodeWithCoder:, returns
     * false if the named property should not be archived. The base
     * implementation returns YES. Subclasses should call super for
     * unknown properties.
     */
    @Generated
    @Selector("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey(@NotNull String key);

    /**
     * When true, the layer is rendered as a bitmap in its local coordinate
     * space ("rasterized"), then the bitmap is composited into the
     * destination (with the minificationFilter and magnificationFilter
     * properties of the layer applied if the bitmap needs scaling).
     * Rasterization occurs after the layer's filters and shadow effects
     * are applied, but before the opacity modulation. As an implementation
     * detail the rendering engine may attempt to cache and reuse the
     * bitmap from one frame to the next. (Whether it does or not will have
     * no affect on the rendered output.)
     * 
     * When false the layer is composited directly into the destination
     * whenever possible (however, certain features of the compositing
     * model may force rasterization, e.g. adding filters).
     * 
     * Defaults to NO. Animatable.
     */
    @Generated
    @Selector("shouldRasterize")
    public native boolean shouldRasterize();

    @Generated
    @Selector("speed")
    public native float speed();

    /**
     * When non-nil, a dictionary dereferenced to find property values that
     * aren't explicitly defined by the layer. (This dictionary may in turn
     * have a `style' property, forming a hierarchy of default values.)
     * If the style dictionary doesn't define a value for an attribute, the
     * +defaultValueForKey: method is called. Defaults to nil.
     * 
     * Note that if the dictionary or any of its ancestors are modified,
     * the values of the layer's properties are undefined until the `style'
     * property is reset.
     */
    @Nullable
    @Generated
    @Selector("style")
    public native NSDictionary<?, ?> style();

    /**
     * A transform applied to each member of the `sublayers' array while
     * rendering its contents into the receiver's output. Typically used as
     * the projection matrix to add perspective and other viewing effects
     * into the model. Defaults to identity. Animatable.
     */
    @Generated
    @Selector("sublayerTransform")
    @ByValue
    public native CATransform3D sublayerTransform();

    /**
     * The array of sublayers of this layer. The layers are listed in back
     * to front order. Defaults to nil. When setting the value of the
     * property, any newly added layers must have nil superlayers, otherwise
     * the behavior is undefined. Note that the returned array is not
     * guaranteed to retain its elements.
     */
    @Nullable
    @Generated
    @Selector("sublayers")
    public native NSArray<? extends CALayer> sublayers();

    /**
     * The receiver's superlayer object. Implicitly changed to match the
     * hierarchy described by the `sublayers' properties.
     */
    @Nullable
    @Generated
    @Selector("superlayer")
    public native CALayer superlayer();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    /**
     * A transform applied to the layer relative to the anchor point of its
     * bounds rect. Defaults to the identity transform. Animatable.
     */
    @Generated
    @Selector("transform")
    @ByValue
    public native CATransform3D transform();

    /**
     * Returns the visible region of the receiver, in its own coordinate
     * space. The visible region is the area not clipped by the containing
     * scroll layer.
     */
    @Generated
    @Selector("visibleRect")
    @ByValue
    public native CGRect visibleRect();

    /**
     * The Z component of the layer's position in its superlayer. Defaults
     * to zero. Animatable.
     */
    @Generated
    @Selector("zPosition")
    @NFloat
    public native double zPosition();

    /**
     * Defines which of the four corners receives the masking when using
     * `cornerRadius' property. Defaults to all four corners.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maskedCorners")
    @NUInt
    public native long maskedCorners();

    /**
     * Defines which of the four corners receives the masking when using
     * `cornerRadius' property. Defaults to all four corners.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMaskedCorners:")
    public native void setMaskedCorners(@NUInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Defines the curve used for rendering the rounded corners of the layer.
     * Defaults to 'kCACornerCurveCircular'.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("cornerCurve")
    public native String cornerCurve();

    /**
     * Expansion scale factor applied to the rounded corner bounding box size
     * when specific corner curve is used.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    /**
     * Defines the curve used for rendering the rounded corners of the layer.
     * Defaults to 'kCACornerCurveCircular'.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCornerCurve:")
    public native void setCornerCurve(@NotNull String value);

    /**
     * If YES, contents of the layer can be displayed up to its NSScreen's
     * maximumExtendedDynamicRangeColorComponentValue or UIScreen's
     * currentEDRHeadroom. If NO, contents are clipped or tonemapped to 1.0 (SDR).
     * `contents` with a CGColorSpaceRef conforming to ITU-R 2100
     * (CGColorSpaceUsesITUR_2100TF) will be tonemapped. Setting this value to
     * YES may have a significant impact on power consumption and therefore
     * should only be set when displaying EDR contents. The default value is NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setWantsExtendedDynamicRangeContent:")
    public native void setWantsExtendedDynamicRangeContent(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * If YES, contents of the layer can be displayed up to its NSScreen's
     * maximumExtendedDynamicRangeColorComponentValue or UIScreen's
     * currentEDRHeadroom. If NO, contents are clipped or tonemapped to 1.0 (SDR).
     * `contents` with a CGColorSpaceRef conforming to ITU-R 2100
     * (CGColorSpaceUsesITUR_2100TF) will be tonemapped. Setting this value to
     * YES may have a significant impact on power consumption and therefore
     * should only be set when displaying EDR contents. The default value is NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("wantsExtendedDynamicRangeContent")
    public native boolean wantsExtendedDynamicRangeContent();
}
