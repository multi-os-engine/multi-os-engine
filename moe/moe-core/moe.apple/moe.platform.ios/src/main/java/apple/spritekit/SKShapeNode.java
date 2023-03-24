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

package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.opaque.CGPathRef;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * A SpriteKit Node used to stroke or fill a shape. CGPaths are used to supply the path.
 * 
 * See CGPath <a
 * href="http://developer.apple.com/library/mac/#documentation/GraphicsImaging/Reference/CGPath/Reference/reference.html">reference
 * pages</a> for details on how to construct a CGPath.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKShapeNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKShapeNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKShapeNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKShapeNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native SKShapeNode new_objc();

    @Generated
    @Selector("node")
    public static native SKShapeNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKShapeNode nodeWithFileNamed(@NotNull String filename);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            @NotNull NSArray<? extends SKNode> sprites, float accuracy);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a Shape Node representing an circle centered at the Node's origin.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithCircleOfRadius:")
    public static native SKShapeNode shapeNodeWithCircleOfRadius(@NFloat double radius);

    /**
     * Create a Shape Node representing an Ellipse inscribed within a Rect
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithEllipseInRect:")
    public static native SKShapeNode shapeNodeWithEllipseInRect(@ByValue CGRect rect);

    /**
     * Create a Shape Node representing an Ellipse inscribed within a Rect centered at the Node's origin.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithEllipseOfSize:")
    public static native SKShapeNode shapeNodeWithEllipseOfSize(@ByValue CGSize size);

    /**
     * Create a Shape Node using a CGPathRef, optionally centered at the Node's origin.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithPath:")
    public static native SKShapeNode shapeNodeWithPath(@NotNull CGPathRef path);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithPath:centered:")
    public static native SKShapeNode shapeNodeWithPathCentered(@NotNull CGPathRef path, boolean centered);

    /**
     * Create a Shape Node representing an a series of Points interpreted as line segments
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithPoints:count:")
    public static native SKShapeNode shapeNodeWithPointsCount(
            @NotNull @ReferenceInfo(type = CGPoint.class) Ptr<CGPoint> points, @NUInt long numPoints);

    /**
     * Create a Shape Node representing a Rect.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithRect:")
    public static native SKShapeNode shapeNodeWithRect(@ByValue CGRect rect);

    /**
     * Create a Shape Node representing a rounded rect with a corner radius
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithRect:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectCornerRadius(@ByValue CGRect rect, @NFloat double cornerRadius);

    /**
     * Create a Shape Node representing a rect centered at the Node's origin.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithRectOfSize:")
    public static native SKShapeNode shapeNodeWithRectOfSize(@ByValue CGSize size);

    /**
     * Create a Shape Node representing a rounded rect with a corner radius centered at the Node's origin.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithRectOfSize:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectOfSizeCornerRadius(@ByValue CGSize size,
            @NFloat double cornerRadius);

    /**
     * Create a Shape Node representing a smoothed spline that passes through a series of Points
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("shapeNodeWithSplinePoints:count:")
    public static native SKShapeNode shapeNodeWithSplinePointsCount(
            @NotNull @ReferenceInfo(type = CGPoint.class) Ptr<CGPoint> points, @NUInt long numPoints);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    /**
     * Sets the blend mode to use when composing the shape with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * The color to fill the path with. Defaults to [SKColor clearColor] (no fill).
     */
    @NotNull
    @Generated
    @Selector("fillColor")
    public native UIColor fillColor();

    /**
     * An optional SKShader used for the filling the Shape
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("fillShader")
    public native SKShader fillShader();

    /**
     * An optional Texture used for the filling the Shape
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("fillTexture")
    public native SKTexture fillTexture();

    /**
     * Add a glow to the path stroke of the specified width. Defaults to 0.0 (no glow)
     */
    @Generated
    @Selector("glowWidth")
    @NFloat
    public native double glowWidth();

    @Generated
    @Selector("init")
    public native SKShapeNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKShapeNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * If set to YES, the path stroke edges and caps is smoothed (antialiased) when drawn.
     */
    @Generated
    @Selector("isAntialiased")
    public native boolean isAntialiased();

    /**
     * If set to YES, the path stroke edges and caps is smoothed (antialiased) when drawn.
     */
    @Generated
    @Selector("setAntialiased:")
    public native void setAntialiased(boolean value);

    /**
     * The cap type that should be used when stroking a non-closed path
     */
    @Generated
    @Selector("lineCap")
    public native int lineCap();

    /**
     * The join type that should be used when stroking a path
     */
    @Generated
    @Selector("lineJoin")
    public native int lineJoin();

    /**
     * The length of the node's path if it were to be stroked
     */
    @Generated
    @Selector("lineLength")
    @NFloat
    public native double lineLength();

    /**
     * The width used to stroke the path. Widths larger than 2.0 may result in artifacts. Defaults to 1.0.
     */
    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    /**
     * When a miter join is used, the maximum ratio of miter length to line with to be used
     */
    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    /**
     * The CGPath to be drawn (in the Node's coordinate space)
     */
    @Nullable
    @Generated
    @Selector("path")
    public native CGPathRef path();

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(@NotNull NSDictionary<String, ? extends SKAttributeValue> value);

    /**
     * Sets the blend mode to use when composing the shape with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * The color to fill the path with. Defaults to [SKColor clearColor] (no fill).
     */
    @Generated
    @Selector("setFillColor:")
    public native void setFillColor(@NotNull UIColor value);

    /**
     * An optional SKShader used for the filling the Shape
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setFillShader:")
    public native void setFillShader(@Nullable SKShader value);

    /**
     * An optional Texture used for the filling the Shape
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setFillTexture:")
    public native void setFillTexture(@Nullable SKTexture value);

    /**
     * Add a glow to the path stroke of the specified width. Defaults to 0.0 (no glow)
     */
    @Generated
    @Selector("setGlowWidth:")
    public native void setGlowWidth(@NFloat double value);

    /**
     * The cap type that should be used when stroking a non-closed path
     */
    @Generated
    @Selector("setLineCap:")
    public native void setLineCap(int value);

    /**
     * The join type that should be used when stroking a path
     */
    @Generated
    @Selector("setLineJoin:")
    public native void setLineJoin(int value);

    /**
     * The width used to stroke the path. Widths larger than 2.0 may result in artifacts. Defaults to 1.0.
     */
    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    /**
     * When a miter join is used, the maximum ratio of miter length to line with to be used
     */
    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    /**
     * The CGPath to be drawn (in the Node's coordinate space)
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(@Nullable CGPathRef value);

    /**
     * The color to draw the path with. (for no stroke use [SKColor clearColor]). Defaults to [SKColor whiteColor].
     */
    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(@NotNull UIColor value);

    /**
     * An optional SKShader used for the Shape's Stroke.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setStrokeShader:")
    public native void setStrokeShader(@Nullable SKShader value);

    /**
     * An optional Texture used for the Shape's stroke.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setStrokeTexture:")
    public native void setStrokeTexture(@Nullable SKTexture value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(@NotNull SKAttributeValue value, @NotNull String key);

    /**
     * The color to draw the path with. (for no stroke use [SKColor clearColor]). Defaults to [SKColor whiteColor].
     */
    @NotNull
    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    /**
     * An optional SKShader used for the Shape's Stroke.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("strokeShader")
    public native SKShader strokeShader();

    /**
     * An optional Texture used for the Shape's stroke.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("strokeTexture")
    public native SKTexture strokeTexture();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(@NotNull String key);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKShapeNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
