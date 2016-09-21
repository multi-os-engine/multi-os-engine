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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("node")
    public static native SKShapeNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKShapeNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
    @Selector("shapeNodeWithCircleOfRadius:")
    public static native SKShapeNode shapeNodeWithCircleOfRadius(@NFloat double radius);

    @Generated
    @Selector("shapeNodeWithEllipseInRect:")
    public static native SKShapeNode shapeNodeWithEllipseInRect(@ByValue CGRect rect);

    @Generated
    @Selector("shapeNodeWithEllipseOfSize:")
    public static native SKShapeNode shapeNodeWithEllipseOfSize(@ByValue CGSize size);

    @Generated
    @Selector("shapeNodeWithPath:")
    public static native SKShapeNode shapeNodeWithPath(CGPathRef path);

    @Generated
    @Selector("shapeNodeWithPath:centered:")
    public static native SKShapeNode shapeNodeWithPathCentered(CGPathRef path, boolean centered);

    @Generated
    @Selector("shapeNodeWithPoints:count:")
    public static native SKShapeNode shapeNodeWithPointsCount(Ptr<CGPoint> points, @NUInt long numPoints);

    @Generated
    @Selector("shapeNodeWithRect:")
    public static native SKShapeNode shapeNodeWithRect(@ByValue CGRect rect);

    @Generated
    @Selector("shapeNodeWithRect:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectCornerRadius(@ByValue CGRect rect, @NFloat double cornerRadius);

    @Generated
    @Selector("shapeNodeWithRectOfSize:")
    public static native SKShapeNode shapeNodeWithRectOfSize(@ByValue CGSize size);

    @Generated
    @Selector("shapeNodeWithRectOfSize:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectOfSizeCornerRadius(@ByValue CGSize size,
            @NFloat double cornerRadius);

    @Generated
    @Selector("shapeNodeWithSplinePoints:count:")
    public static native SKShapeNode shapeNodeWithSplinePointsCount(Ptr<CGPoint> points, @NUInt long numPoints);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Selector("fillColor")
    public native UIColor fillColor();

    @Generated
    @Selector("fillShader")
    public native SKShader fillShader();

    @Generated
    @Selector("fillTexture")
    public native SKTexture fillTexture();

    @Generated
    @Selector("glowWidth")
    @NFloat
    public native double glowWidth();

    @Generated
    @Selector("init")
    public native SKShapeNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKShapeNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAntialiased")
    public native boolean isAntialiased();

    @Generated
    @Selector("setAntialiased:")
    public native void setAntialiased(boolean value);

    @Generated
    @Selector("lineCap")
    public native int lineCap();

    @Generated
    @Selector("lineJoin")
    public native int lineJoin();

    @Generated
    @Selector("lineLength")
    @NFloat
    public native double lineLength();

    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    @Generated
    @Selector("path")
    public native CGPathRef path();

    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    @Generated
    @Selector("setFillColor:")
    public native void setFillColor(UIColor value);

    @Generated
    @Selector("setFillShader:")
    public native void setFillShader(SKShader value);

    @Generated
    @Selector("setFillTexture:")
    public native void setFillTexture(SKTexture value);

    @Generated
    @Selector("setGlowWidth:")
    public native void setGlowWidth(@NFloat double value);

    @Generated
    @Selector("setLineCap:")
    public native void setLineCap(int value);

    @Generated
    @Selector("setLineJoin:")
    public native void setLineJoin(int value);

    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    @Generated
    @Selector("setPath:")
    public native void setPath(CGPathRef value);

    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(UIColor value);

    @Generated
    @Selector("setStrokeShader:")
    public native void setStrokeShader(SKShader value);

    @Generated
    @Selector("setStrokeTexture:")
    public native void setStrokeTexture(SKTexture value);

    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    @Generated
    @Selector("strokeShader")
    public native SKShader strokeShader();

    @Generated
    @Selector("strokeTexture")
    public native SKTexture strokeTexture();
}
