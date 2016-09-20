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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKLabelNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKLabelNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKLabelNode alloc();

    /**
     * labelNodeWithFontNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/clm/SKLabelNode/labelNodeWithFontNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("labelNodeWithFontNamed:")
    public static native SKLabelNode labelNodeWithFontNamed(String fontName);

    /**
     * labelNodeWithText:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/clm/SKLabelNode/labelNodeWithText:">iOS Dev Center</a>
     */
    @Generated
    @Selector("labelNodeWithText:")
    public static native SKLabelNode labelNodeWithText(String text);

    @Generated
    @Selector("node")
    public static native SKLabelNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKLabelNode nodeWithFileNamed(String filename);

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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * colorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/colorBlendFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("colorBlendFactor")
    @NFloat
    public native double colorBlendFactor();

    /**
     * fontColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("fontColor")
    public native UIColor fontColor();

    /**
     * fontName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontName">iOS Dev Center</a>
     */
    @Generated
    @Selector("fontName")
    public native String fontName();

    /**
     * fontSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("fontSize")
    @NFloat
    public native double fontSize();

    /**
     * horizontalAlignmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/horizontalAlignmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("horizontalAlignmentMode")
    @NInt
    public native long horizontalAlignmentMode();

    @Generated
    @Selector("init")
    public native SKLabelNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKLabelNode initWithCoder(NSCoder aDecoder);

    /**
     * initWithFontNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instm/SKLabelNode/initWithFontNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFontNamed:")
    public native SKLabelNode initWithFontNamed(String fontName);

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(UIColor value);

    /**
     * colorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/colorBlendFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    /**
     * fontColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFontColor:")
    public native void setFontColor(UIColor value);

    /**
     * fontName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFontName:")
    public native void setFontName(String value);

    /**
     * fontSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/fontSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFontSize:")
    public native void setFontSize(@NFloat double value);

    /**
     * horizontalAlignmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/horizontalAlignmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHorizontalAlignmentMode:")
    public native void setHorizontalAlignmentMode(@NInt long value);

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    /**
     * verticalAlignmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/verticalAlignmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVerticalAlignmentMode:")
    public native void setVerticalAlignmentMode(@NInt long value);

    /**
     * text</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/text">iOS Dev Center</a>
     */
    @Generated
    @Selector("text")
    public native String text();

    /**
     * verticalAlignmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLabelNode_Ref/index.html#//apple_ref/occ/instp/SKLabelNode/verticalAlignmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("verticalAlignmentMode")
    @NInt
    public native long verticalAlignmentMode();
}
