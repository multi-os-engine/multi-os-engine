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
    @Owned
    @Selector("alloc")
    public static native SKShapeNode alloc();

    @Generated
    @Selector("node")
    public static native SKShapeNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKShapeNode nodeWithFileNamed(String filename);

    /**
     * shapeNodeWithCircleOfRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithCircleOfRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithCircleOfRadius:")
    public static native SKShapeNode shapeNodeWithCircleOfRadius(@NFloat double radius);

    /**
     * shapeNodeWithEllipseInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithEllipseInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithEllipseInRect:")
    public static native SKShapeNode shapeNodeWithEllipseInRect(@ByValue CGRect rect);

    /**
     * shapeNodeWithEllipseOfSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithEllipseOfSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithEllipseOfSize:")
    public static native SKShapeNode shapeNodeWithEllipseOfSize(@ByValue CGSize size);

    /**
     * shapeNodeWithPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithPath:")
    public static native SKShapeNode shapeNodeWithPath(CGPathRef path);

    /**
     * shapeNodeWithPath:centered:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithPath:centered:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithPath:centered:")
    public static native SKShapeNode shapeNodeWithPathCentered(CGPathRef path, boolean centered);

    /**
     * shapeNodeWithPoints:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithPoints:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithPoints:count:")
    public static native SKShapeNode shapeNodeWithPointsCount(Ptr<CGPoint> points, @NUInt long numPoints);

    /**
     * shapeNodeWithRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithRect:")
    public static native SKShapeNode shapeNodeWithRect(@ByValue CGRect rect);

    /**
     * shapeNodeWithRect:cornerRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithRect:cornerRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithRect:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectCornerRadius(@ByValue CGRect rect, @NFloat double cornerRadius);

    /**
     * shapeNodeWithRectOfSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithRectOfSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithRectOfSize:")
    public static native SKShapeNode shapeNodeWithRectOfSize(@ByValue CGSize size);

    /**
     * shapeNodeWithRectOfSize:cornerRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithRectOfSize:cornerRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithRectOfSize:cornerRadius:")
    public static native SKShapeNode shapeNodeWithRectOfSizeCornerRadius(@ByValue CGSize size,
            @NFloat double cornerRadius);

    /**
     * shapeNodeWithSplinePoints:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/clm/SKShapeNode/shapeNodeWithSplinePoints:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shapeNodeWithSplinePoints:count:")
    public static native SKShapeNode shapeNodeWithSplinePointsCount(Ptr<CGPoint> points, @NUInt long numPoints);

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * fillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("fillColor")
    public native UIColor fillColor();

    /**
     * fillShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("fillShader")
    public native SKShader fillShader();

    /**
     * fillTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("fillTexture")
    public native SKTexture fillTexture();

    /**
     * glowWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/glowWidth">iOS Dev Center</a>
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
    public native SKShapeNode initWithCoder(NSCoder aDecoder);

    /**
     * antialiased</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/antialiased">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAntialiased")
    public native boolean isAntialiased();

    /**
     * antialiased</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/antialiased">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAntialiased:")
    public native void setAntialiased(boolean value);

    /**
     * lineCap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineCap">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineCap")
    public native int lineCap();

    /**
     * lineJoin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineJoin">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineJoin")
    public native int lineJoin();

    /**
     * lineLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineLength")
    @NFloat
    public native double lineLength();

    /**
     * lineWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    /**
     * miterLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/miterLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    /**
     * path</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/path">iOS Dev Center</a>
     */
    @Generated
    @Selector("path")
    public native CGPathRef path();

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * fillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFillColor:")
    public native void setFillColor(UIColor value);

    /**
     * fillShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFillShader:")
    public native void setFillShader(SKShader value);

    /**
     * fillTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/fillTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFillTexture:")
    public native void setFillTexture(SKTexture value);

    /**
     * glowWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/glowWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGlowWidth:")
    public native void setGlowWidth(@NFloat double value);

    /**
     * lineCap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineCap">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineCap:")
    public native void setLineCap(int value);

    /**
     * lineJoin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineJoin">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineJoin:")
    public native void setLineJoin(int value);

    /**
     * lineWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/lineWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    /**
     * miterLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/miterLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    /**
     * path</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/path">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(CGPathRef value);

    /**
     * strokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(UIColor value);

    /**
     * strokeShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStrokeShader:")
    public native void setStrokeShader(SKShader value);

    /**
     * strokeTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStrokeTexture:")
    public native void setStrokeTexture(SKTexture value);

    /**
     * strokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    /**
     * strokeShader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeShader">iOS Dev Center</a>
     */
    @Generated
    @Selector("strokeShader")
    public native SKShader strokeShader();

    /**
     * strokeTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShapeNode_Ref/index.html#//apple_ref/occ/instp/SKShapeNode/strokeTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("strokeTexture")
    public native SKTexture strokeTexture();
}
