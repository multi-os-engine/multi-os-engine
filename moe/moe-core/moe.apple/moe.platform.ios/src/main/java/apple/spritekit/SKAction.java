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
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKAction extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAction alloc();

    /**
     * animateWithTextures:timePerFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/animateWithTextures:timePerFrame:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithTextures:timePerFrame:")
    public static native SKAction animateWithTexturesTimePerFrame(NSArray<? extends SKTexture> textures, double sec);

    /**
     * animateWithTextures:timePerFrame:resize:restore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/animateWithTextures:timePerFrame:resize:restore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithTexturesTimePerFrameResizeRestore(NSArray<? extends SKTexture> textures,
            double sec, boolean resize, boolean restore);

    /**
     * colorizeWithColor:colorBlendFactor:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/colorizeWithColor:colorBlendFactor:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("colorizeWithColor:colorBlendFactor:duration:")
    public static native SKAction colorizeWithColorColorBlendFactorDuration(UIColor color,
            @NFloat double colorBlendFactor, double sec);

    /**
     * colorizeWithColorBlendFactor:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/colorizeWithColorBlendFactor:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("colorizeWithColorBlendFactor:duration:")
    public static native SKAction colorizeWithColorBlendFactorDuration(@NFloat double colorBlendFactor, double sec);

    /**
     * customActionWithDuration:actionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/customActionWithDuration:actionBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("customActionWithDuration:actionBlock:")
    public static native SKAction customActionWithDurationActionBlock(double seconds,
            @ObjCBlock(name = "call_customActionWithDurationActionBlock") Block_customActionWithDurationActionBlock block);

    /**
     * fadeAlphaBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/fadeAlphaBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeAlphaBy:duration:")
    public static native SKAction fadeAlphaByDuration(@NFloat double factor, double sec);

    /**
     * fadeAlphaTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/fadeAlphaTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeAlphaTo:duration:")
    public static native SKAction fadeAlphaToDuration(@NFloat double alpha, double sec);

    /**
     * fadeInWithDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/fadeInWithDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeInWithDuration:")
    public static native SKAction fadeInWithDuration(double sec);

    /**
     * fadeOutWithDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/fadeOutWithDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeOutWithDuration:")
    public static native SKAction fadeOutWithDuration(double sec);

    /**
     * falloffBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/falloffBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("falloffBy:duration:")
    public static native SKAction falloffByDuration(float falloff, double sec);

    /**
     * falloffTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/falloffTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("falloffTo:duration:")
    public static native SKAction falloffToDuration(float falloff, double sec);

    /**
     * followPath:asOffset:orientToPath:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/followPath:asOffset:orientToPath:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("followPath:asOffset:orientToPath:duration:")
    public static native SKAction followPathAsOffsetOrientToPathDuration(CGPathRef path, boolean offset, boolean orient,
            double sec);

    /**
     * followPath:asOffset:orientToPath:speed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/followPath:asOffset:orientToPath:speed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("followPath:asOffset:orientToPath:speed:")
    public static native SKAction followPathAsOffsetOrientToPathSpeed(CGPathRef path, boolean offset, boolean orient,
            @NFloat double speed);

    /**
     * followPath:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/followPath:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("followPath:duration:")
    public static native SKAction followPathDuration(CGPathRef path, double sec);

    /**
     * followPath:speed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/followPath:speed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("followPath:speed:")
    public static native SKAction followPathSpeed(CGPathRef path, @NFloat double speed);

    /**
     * group:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/group:">iOS Dev Center</a>
     */
    @Generated
    @Selector("group:")
    public static native SKAction group(NSArray<? extends SKAction> actions);

    /**
     * hide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/hide">iOS Dev Center</a>
     */
    @Generated
    @Selector("hide")
    public static native SKAction hide();

    /**
     * moveBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/moveBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveBy:duration:")
    public static native SKAction moveByDuration(@ByValue CGVector delta, double sec);

    /**
     * moveByX:y:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/moveByX:y:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveByX:y:duration:")
    public static native SKAction moveByXYDuration(@NFloat double deltaX, @NFloat double deltaY, double sec);

    /**
     * moveTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/moveTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveTo:duration:")
    public static native SKAction moveToDuration(@ByValue CGPoint location, double sec);

    /**
     * moveToX:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/moveToX:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveToX:duration:")
    public static native SKAction moveToXDuration(@NFloat double x, double sec);

    /**
     * moveToY:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/moveToY:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveToY:duration:")
    public static native SKAction moveToYDuration(@NFloat double y, double sec);

    /**
     * performSelector:onTarget:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/performSelector:onTarget:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelector:onTarget:")
    public static native SKAction performSelectorOnTarget(SEL selector, @Mapped(ObjCObjectMapper.class) Object target);

    /**
     * playSoundFileNamed:waitForCompletion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/playSoundFileNamed:waitForCompletion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playSoundFileNamed:waitForCompletion:")
    public static native SKAction playSoundFileNamedWaitForCompletion(String soundFile, boolean wait_);

    /**
     * reachTo:rootNode:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/reachTo:rootNode:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reachTo:rootNode:duration:")
    public static native SKAction reachToRootNodeDuration(@ByValue CGPoint position, SKNode root, double sec);

    /**
     * reachTo:rootNode:velocity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/reachTo:rootNode:velocity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reachTo:rootNode:velocity:")
    public static native SKAction reachToRootNodeVelocity(@ByValue CGPoint position, SKNode root,
            @NFloat double velocity);

    /**
     * reachToNode:rootNode:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/reachToNode:rootNode:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reachToNode:rootNode:duration:")
    public static native SKAction reachToNodeRootNodeDuration(SKNode node, SKNode root, double sec);

    /**
     * reachToNode:rootNode:velocity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/reachToNode:rootNode:velocity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reachToNode:rootNode:velocity:")
    public static native SKAction reachToNodeRootNodeVelocity(SKNode node, SKNode root, @NFloat double velocity);

    /**
     * removeFromParent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/removeFromParent">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromParent")
    public static native SKAction removeFromParent();

    /**
     * repeatAction:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/repeatAction:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatAction:count:")
    public static native SKAction repeatActionCount(SKAction action, @NUInt long count);

    /**
     * repeatActionForever:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/repeatActionForever:">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatActionForever:")
    public static native SKAction repeatActionForever(SKAction action);

    /**
     * resizeByWidth:height:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/resizeByWidth:height:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resizeByWidth:height:duration:")
    public static native SKAction resizeByWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    /**
     * resizeToHeight:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/resizeToHeight:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resizeToHeight:duration:")
    public static native SKAction resizeToHeightDuration(@NFloat double height, double duration);

    /**
     * resizeToWidth:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/resizeToWidth:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resizeToWidth:duration:")
    public static native SKAction resizeToWidthDuration(@NFloat double width, double duration);

    /**
     * resizeToWidth:height:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/resizeToWidth:height:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resizeToWidth:height:duration:")
    public static native SKAction resizeToWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    /**
     * rotateByAngle:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/rotateByAngle:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateByAngle:duration:")
    public static native SKAction rotateByAngleDuration(@NFloat double radians, double sec);

    /**
     * rotateToAngle:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/rotateToAngle:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateToAngle:duration:")
    public static native SKAction rotateToAngleDuration(@NFloat double radians, double sec);

    /**
     * rotateToAngle:duration:shortestUnitArc:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/rotateToAngle:duration:shortestUnitArc:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateToAngle:duration:shortestUnitArc:")
    public static native SKAction rotateToAngleDurationShortestUnitArc(@NFloat double radians, double sec,
            boolean shortestUnitArc);

    /**
     * runAction:onChildWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/runAction:onChildWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runAction:onChildWithName:")
    public static native SKAction runActionOnChildWithName(SKAction action, String name);

    /**
     * runBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/runBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runBlock:")
    public static native SKAction runBlock(@ObjCBlock(name = "call_runBlock") Block_runBlock block);

    /**
     * runBlock:queue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/runBlock:queue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runBlock:queue:")
    public static native SKAction runBlockQueue(@ObjCBlock(name = "call_runBlockQueue") Block_runBlockQueue block,
            NSObject queue);

    /**
     * scaleBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleBy:duration:")
    public static native SKAction scaleByDuration(@NFloat double scale, double sec);

    /**
     * scaleTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleTo:duration:")
    public static native SKAction scaleToDuration(@NFloat double scale, double sec);

    /**
     * scaleXBy:y:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleXBy:y:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleXBy:y:duration:")
    public static native SKAction scaleXByYDuration(@NFloat double xScale, @NFloat double yScale, double sec);

    /**
     * scaleXTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleXTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleXTo:duration:")
    public static native SKAction scaleXToDuration(@NFloat double scale, double sec);

    /**
     * scaleXTo:y:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleXTo:y:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleXTo:y:duration:")
    public static native SKAction scaleXToYDuration(@NFloat double xScale, @NFloat double yScale, double sec);

    /**
     * scaleYTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/scaleYTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleYTo:duration:")
    public static native SKAction scaleYToDuration(@NFloat double scale, double sec);

    /**
     * sequence:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/sequence:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sequence:")
    public static native SKAction sequence(NSArray<? extends SKAction> actions);

    /**
     * setTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/setTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTexture:")
    public static native SKAction setTexture(SKTexture texture);

    /**
     * setTexture:resize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/setTexture:resize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTexture:resize:")
    public static native SKAction setTextureResize(SKTexture texture, boolean resize);

    /**
     * speedBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/speedBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("speedBy:duration:")
    public static native SKAction speedByDuration(@NFloat double speed, double sec);

    /**
     * speedTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/speedTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("speedTo:duration:")
    public static native SKAction speedToDuration(@NFloat double speed, double sec);

    /**
     * strengthBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/strengthBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("strengthBy:duration:")
    public static native SKAction strengthByDuration(float strength, double sec);

    /**
     * strengthTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/strengthTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("strengthTo:duration:")
    public static native SKAction strengthToDuration(float strength, double sec);

    /**
     * unhide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/unhide">iOS Dev Center</a>
     */
    @Generated
    @Selector("unhide")
    public static native SKAction unhide();

    /**
     * waitForDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/waitForDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitForDuration:")
    public static native SKAction waitForDuration(double sec);

    /**
     * waitForDuration:withRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/waitForDuration:withRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitForDuration:withRange:")
    public static native SKAction waitForDurationWithRange(double sec, double durationRange);

    /**
     * actionNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/actionNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionNamed:")
    public static native SKAction actionNamed(String name);

    /**
     * actionNamed:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/actionNamed:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionNamed:duration:")
    public static native SKAction actionNamedDuration(String name, double sec);

    /**
     * actionNamed:fromURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/actionNamed:fromURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionNamed:fromURL:")
    public static native SKAction actionNamedFromURL(String name, NSURL url);

    /**
     * actionNamed:fromURL:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/actionNamed:fromURL:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionNamed:fromURL:duration:")
    public static native SKAction actionNamedFromURLDuration(String name, NSURL url, double sec);

    /**
     * animateWithNormalTextures:timePerFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/animateWithNormalTextures:timePerFrame:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:")
    public static native SKAction animateWithNormalTexturesTimePerFrame(NSArray<? extends SKTexture> textures,
            double sec);

    /**
     * animateWithNormalTextures:timePerFrame:resize:restore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/animateWithNormalTextures:timePerFrame:resize:restore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithNormalTexturesTimePerFrameResizeRestore(
            NSArray<? extends SKTexture> textures, double sec, boolean resize, boolean restore);

    /**
     * applyAngularImpulse:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyAngularImpulse:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyAngularImpulse:duration:")
    public static native SKAction applyAngularImpulseDuration(@NFloat double impulse, double sec);

    /**
     * applyForce:atPoint:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyForce:atPoint:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyForce:atPoint:duration:")
    public static native SKAction applyForceAtPointDuration(@ByValue CGVector force, @ByValue CGPoint point,
            double sec);

    /**
     * applyForce:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyForce:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyForce:duration:")
    public static native SKAction applyForceDuration(@ByValue CGVector force, double sec);

    /**
     * applyImpulse:atPoint:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyImpulse:atPoint:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyImpulse:atPoint:duration:")
    public static native SKAction applyImpulseAtPointDuration(@ByValue CGVector impulse, @ByValue CGPoint point,
            double sec);

    /**
     * applyImpulse:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyImpulse:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyImpulse:duration:")
    public static native SKAction applyImpulseDuration(@ByValue CGVector impulse, double sec);

    /**
     * applyTorque:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/applyTorque:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyTorque:duration:")
    public static native SKAction applyTorqueDuration(@NFloat double torque, double sec);

    /**
     * changeChargeBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeChargeBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeChargeBy:duration:")
    public static native SKAction changeChargeByDuration(float v, double duration);

    /**
     * changeChargeTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeChargeTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeChargeTo:duration:")
    public static native SKAction changeChargeToDuration(float v, double duration);

    /**
     * changeMassBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeMassBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeMassBy:duration:")
    public static native SKAction changeMassByDuration(float v, double duration);

    /**
     * changeMassTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeMassTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeMassTo:duration:")
    public static native SKAction changeMassToDuration(float v, double duration);

    /**
     * changeObstructionBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeObstructionBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeObstructionBy:duration:")
    public static native SKAction changeObstructionByDuration(float v, double duration);

    /**
     * changeObstructionTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeObstructionTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeObstructionTo:duration:")
    public static native SKAction changeObstructionToDuration(float v, double duration);

    /**
     * changeOcclusionBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeOcclusionBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeOcclusionBy:duration:")
    public static native SKAction changeOcclusionByDuration(float v, double duration);

    /**
     * changeOcclusionTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeOcclusionTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeOcclusionTo:duration:")
    public static native SKAction changeOcclusionToDuration(float v, double duration);

    /**
     * changePlaybackRateBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changePlaybackRateBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changePlaybackRateBy:duration:")
    public static native SKAction changePlaybackRateByDuration(float v, double duration);

    /**
     * changePlaybackRateTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changePlaybackRateTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changePlaybackRateTo:duration:")
    public static native SKAction changePlaybackRateToDuration(float v, double duration);

    /**
     * changeReverbBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeReverbBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeReverbBy:duration:")
    public static native SKAction changeReverbByDuration(float v, double duration);

    /**
     * changeReverbTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeReverbTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeReverbTo:duration:")
    public static native SKAction changeReverbToDuration(float v, double duration);

    /**
     * changeVolumeBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeVolumeBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeVolumeBy:duration:")
    public static native SKAction changeVolumeByDuration(float v, double duration);

    /**
     * changeVolumeTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/changeVolumeTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("changeVolumeTo:duration:")
    public static native SKAction changeVolumeToDuration(float v, double duration);

    /**
     * pause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/pause">iOS Dev Center</a>
     */
    @Generated
    @Selector("pause")
    public static native SKAction pause();

    /**
     * play</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/play">iOS Dev Center</a>
     */
    @Generated
    @Selector("play")
    public static native SKAction play();

    /**
     * setNormalTexture:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/setNormalTexture:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNormalTexture:")
    public static native SKAction setNormalTexture(SKTexture texture);

    /**
     * setNormalTexture:resize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/setNormalTexture:resize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNormalTexture:resize:")
    public static native SKAction setNormalTextureResize(SKTexture texture, boolean resize);

    /**
     * stereoPanBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/stereoPanBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stereoPanBy:duration:")
    public static native SKAction stereoPanByDuration(float v, double duration);

    /**
     * stereoPanTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/stereoPanTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stereoPanTo:duration:")
    public static native SKAction stereoPanToDuration(float v, double duration);

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/clm/SKAction/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    public static native SKAction stop();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SKAction init();

    @Generated
    @Selector("initWithCoder:")
    public native SKAction initWithCoder(NSCoder aDecoder);

    /**
     * reversedAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instm/SKAction/reversedAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("reversedAction")
    public native SKAction reversedAction();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * timingFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/timingFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@ObjCBlock(name = "call_setTimingFunction") Block_setTimingFunction value);

    /**
     * timingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/timingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimingMode:")
    public native void setTimingMode(@NInt long value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    /**
     * timingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/timingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("timingMode")
    @NInt
    public native long timingMode();

    /**
     * timingFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKAction_Ref/index.html#//apple_ref/occ/instp/SKAction/timingFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("timingFunction")
    @ObjCBlock(name = "call_timingFunction_ret")
    public native Block_timingFunction_ret timingFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customActionWithDurationActionBlock {
        @Generated
        void call_customActionWithDurationActionBlock(SKNode arg0, @NFloat double arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlock {
        @Generated
        void call_runBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlockQueue {
        @Generated
        void call_runBlockQueue();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTimingFunction {
        @Generated
        float call_setTimingFunction(float arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timingFunction_ret {
        @Generated
        float call_timingFunction_ret(float arg0);
    }
}
