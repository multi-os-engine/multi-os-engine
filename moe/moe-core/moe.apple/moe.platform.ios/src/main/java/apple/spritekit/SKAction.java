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
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("actionNamed:")
    public static native SKAction actionNamed(String name);

    @Generated
    @Selector("actionNamed:duration:")
    public static native SKAction actionNamedDuration(String name, double sec);

    @Generated
    @Selector("actionNamed:fromURL:")
    public static native SKAction actionNamedFromURL(String name, NSURL url);

    @Generated
    @Selector("actionNamed:fromURL:duration:")
    public static native SKAction actionNamedFromURLDuration(String name, NSURL url, double sec);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKAction alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:")
    public static native SKAction animateWithNormalTexturesTimePerFrame(NSArray<? extends SKTexture> textures,
            double sec);

    @Generated
    @Selector("animateWithNormalTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithNormalTexturesTimePerFrameResizeRestore(
            NSArray<? extends SKTexture> textures, double sec, boolean resize, boolean restore);

    @Generated
    @Selector("animateWithTextures:timePerFrame:")
    public static native SKAction animateWithTexturesTimePerFrame(NSArray<? extends SKTexture> textures, double sec);

    @Generated
    @Selector("animateWithTextures:timePerFrame:resize:restore:")
    public static native SKAction animateWithTexturesTimePerFrameResizeRestore(NSArray<? extends SKTexture> textures,
            double sec, boolean resize, boolean restore);

    @Generated
    @Selector("animateWithWarps:times:")
    public static native SKAction animateWithWarpsTimes(NSArray<? extends SKWarpGeometry> warps,
            NSArray<? extends NSNumber> times);

    @Generated
    @Selector("animateWithWarps:times:restore:")
    public static native SKAction animateWithWarpsTimesRestore(NSArray<? extends SKWarpGeometry> warps,
            NSArray<? extends NSNumber> times, boolean restore);

    @Generated
    @Selector("applyAngularImpulse:duration:")
    public static native SKAction applyAngularImpulseDuration(@NFloat double impulse, double sec);

    @Generated
    @Selector("applyForce:atPoint:duration:")
    public static native SKAction applyForceAtPointDuration(@ByValue CGVector force, @ByValue CGPoint point,
            double sec);

    @Generated
    @Selector("applyForce:duration:")
    public static native SKAction applyForceDuration(@ByValue CGVector force, double sec);

    @Generated
    @Selector("applyImpulse:atPoint:duration:")
    public static native SKAction applyImpulseAtPointDuration(@ByValue CGVector impulse, @ByValue CGPoint point,
            double sec);

    @Generated
    @Selector("applyImpulse:duration:")
    public static native SKAction applyImpulseDuration(@ByValue CGVector impulse, double sec);

    @Generated
    @Selector("applyTorque:duration:")
    public static native SKAction applyTorqueDuration(@NFloat double torque, double sec);

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
    @Selector("changeChargeBy:duration:")
    public static native SKAction changeChargeByDuration(float v, double duration);

    @Generated
    @Selector("changeChargeTo:duration:")
    public static native SKAction changeChargeToDuration(float v, double duration);

    @Generated
    @Selector("changeMassBy:duration:")
    public static native SKAction changeMassByDuration(float v, double duration);

    @Generated
    @Selector("changeMassTo:duration:")
    public static native SKAction changeMassToDuration(float v, double duration);

    @Generated
    @Selector("changeObstructionBy:duration:")
    public static native SKAction changeObstructionByDuration(float v, double duration);

    @Generated
    @Selector("changeObstructionTo:duration:")
    public static native SKAction changeObstructionToDuration(float v, double duration);

    @Generated
    @Selector("changeOcclusionBy:duration:")
    public static native SKAction changeOcclusionByDuration(float v, double duration);

    @Generated
    @Selector("changeOcclusionTo:duration:")
    public static native SKAction changeOcclusionToDuration(float v, double duration);

    @Generated
    @Selector("changePlaybackRateBy:duration:")
    public static native SKAction changePlaybackRateByDuration(float v, double duration);

    @Generated
    @Selector("changePlaybackRateTo:duration:")
    public static native SKAction changePlaybackRateToDuration(float v, double duration);

    @Generated
    @Selector("changeReverbBy:duration:")
    public static native SKAction changeReverbByDuration(float v, double duration);

    @Generated
    @Selector("changeReverbTo:duration:")
    public static native SKAction changeReverbToDuration(float v, double duration);

    @Generated
    @Selector("changeVolumeBy:duration:")
    public static native SKAction changeVolumeByDuration(float v, double duration);

    @Generated
    @Selector("changeVolumeTo:duration:")
    public static native SKAction changeVolumeToDuration(float v, double duration);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("colorizeWithColor:colorBlendFactor:duration:")
    public static native SKAction colorizeWithColorColorBlendFactorDuration(UIColor color,
            @NFloat double colorBlendFactor, double sec);

    @Generated
    @Selector("colorizeWithColorBlendFactor:duration:")
    public static native SKAction colorizeWithColorBlendFactorDuration(@NFloat double colorBlendFactor, double sec);

    @Generated
    @Selector("customActionWithDuration:actionBlock:")
    public static native SKAction customActionWithDurationActionBlock(double seconds,
            @ObjCBlock(name = "call_customActionWithDurationActionBlock") Block_customActionWithDurationActionBlock block);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("fadeAlphaBy:duration:")
    public static native SKAction fadeAlphaByDuration(@NFloat double factor, double sec);

    @Generated
    @Selector("fadeAlphaTo:duration:")
    public static native SKAction fadeAlphaToDuration(@NFloat double alpha, double sec);

    @Generated
    @Selector("fadeInWithDuration:")
    public static native SKAction fadeInWithDuration(double sec);

    @Generated
    @Selector("fadeOutWithDuration:")
    public static native SKAction fadeOutWithDuration(double sec);

    @Generated
    @Selector("falloffBy:duration:")
    public static native SKAction falloffByDuration(float falloff, double sec);

    @Generated
    @Selector("falloffTo:duration:")
    public static native SKAction falloffToDuration(float falloff, double sec);

    @Generated
    @Selector("followPath:asOffset:orientToPath:duration:")
    public static native SKAction followPathAsOffsetOrientToPathDuration(CGPathRef path, boolean offset, boolean orient,
            double sec);

    @Generated
    @Selector("followPath:asOffset:orientToPath:speed:")
    public static native SKAction followPathAsOffsetOrientToPathSpeed(CGPathRef path, boolean offset, boolean orient,
            @NFloat double speed);

    @Generated
    @Selector("followPath:duration:")
    public static native SKAction followPathDuration(CGPathRef path, double sec);

    @Generated
    @Selector("followPath:speed:")
    public static native SKAction followPathSpeed(CGPathRef path, @NFloat double speed);

    @Generated
    @Selector("group:")
    public static native SKAction group(NSArray<? extends SKAction> actions);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("hide")
    public static native SKAction hide();

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
    @Selector("moveBy:duration:")
    public static native SKAction moveByDuration(@ByValue CGVector delta, double sec);

    @Generated
    @Selector("moveByX:y:duration:")
    public static native SKAction moveByXYDuration(@NFloat double deltaX, @NFloat double deltaY, double sec);

    @Generated
    @Selector("moveTo:duration:")
    public static native SKAction moveToDuration(@ByValue CGPoint location, double sec);

    @Generated
    @Selector("moveToX:duration:")
    public static native SKAction moveToXDuration(@NFloat double x, double sec);

    @Generated
    @Selector("moveToY:duration:")
    public static native SKAction moveToYDuration(@NFloat double y, double sec);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pause")
    public static native SKAction pause();

    @Generated
    @Selector("performSelector:onTarget:")
    public static native SKAction performSelectorOnTarget(SEL selector, @Mapped(ObjCObjectMapper.class) Object target);

    @Generated
    @Selector("play")
    public static native SKAction play();

    @Generated
    @Selector("playSoundFileNamed:waitForCompletion:")
    public static native SKAction playSoundFileNamedWaitForCompletion(String soundFile, boolean wait_);

    @Generated
    @Selector("reachTo:rootNode:duration:")
    public static native SKAction reachToRootNodeDuration(@ByValue CGPoint position, SKNode root, double sec);

    @Generated
    @Selector("reachTo:rootNode:velocity:")
    public static native SKAction reachToRootNodeVelocity(@ByValue CGPoint position, SKNode root,
            @NFloat double velocity);

    @Generated
    @Selector("reachToNode:rootNode:duration:")
    public static native SKAction reachToNodeRootNodeDuration(SKNode node, SKNode root, double sec);

    @Generated
    @Selector("reachToNode:rootNode:velocity:")
    public static native SKAction reachToNodeRootNodeVelocity(SKNode node, SKNode root, @NFloat double velocity);

    @Generated
    @Selector("removeFromParent")
    public static native SKAction removeFromParent();

    @Generated
    @Selector("repeatAction:count:")
    public static native SKAction repeatActionCount(SKAction action, @NUInt long count);

    @Generated
    @Selector("repeatActionForever:")
    public static native SKAction repeatActionForever(SKAction action);

    @Generated
    @Selector("resizeByWidth:height:duration:")
    public static native SKAction resizeByWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    @Generated
    @Selector("resizeToHeight:duration:")
    public static native SKAction resizeToHeightDuration(@NFloat double height, double duration);

    @Generated
    @Selector("resizeToWidth:duration:")
    public static native SKAction resizeToWidthDuration(@NFloat double width, double duration);

    @Generated
    @Selector("resizeToWidth:height:duration:")
    public static native SKAction resizeToWidthHeightDuration(@NFloat double width, @NFloat double height,
            double duration);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("rotateByAngle:duration:")
    public static native SKAction rotateByAngleDuration(@NFloat double radians, double sec);

    @Generated
    @Selector("rotateToAngle:duration:")
    public static native SKAction rotateToAngleDuration(@NFloat double radians, double sec);

    @Generated
    @Selector("rotateToAngle:duration:shortestUnitArc:")
    public static native SKAction rotateToAngleDurationShortestUnitArc(@NFloat double radians, double sec,
            boolean shortestUnitArc);

    @Generated
    @Selector("runAction:onChildWithName:")
    public static native SKAction runActionOnChildWithName(SKAction action, String name);

    @Generated
    @Selector("runBlock:")
    public static native SKAction runBlock(@ObjCBlock(name = "call_runBlock") Block_runBlock block);

    @Generated
    @Selector("runBlock:queue:")
    public static native SKAction runBlockQueue(@ObjCBlock(name = "call_runBlockQueue") Block_runBlockQueue block,
            NSObject queue);

    @Generated
    @Selector("scaleBy:duration:")
    public static native SKAction scaleByDuration(@NFloat double scale, double sec);

    @Generated
    @Selector("scaleTo:duration:")
    public static native SKAction scaleToDuration(@NFloat double scale, double sec);

    @Generated
    @Selector("scaleToSize:duration:")
    public static native SKAction scaleToSizeDuration(@ByValue CGSize size, double sec);

    @Generated
    @Selector("scaleXBy:y:duration:")
    public static native SKAction scaleXByYDuration(@NFloat double xScale, @NFloat double yScale, double sec);

    @Generated
    @Selector("scaleXTo:duration:")
    public static native SKAction scaleXToDuration(@NFloat double scale, double sec);

    @Generated
    @Selector("scaleXTo:y:duration:")
    public static native SKAction scaleXToYDuration(@NFloat double xScale, @NFloat double yScale, double sec);

    @Generated
    @Selector("scaleYTo:duration:")
    public static native SKAction scaleYToDuration(@NFloat double scale, double sec);

    @Generated
    @Selector("sequence:")
    public static native SKAction sequence(NSArray<? extends SKAction> actions);

    @Generated
    @Selector("setNormalTexture:")
    public static native SKAction setNormalTexture(SKTexture texture);

    @Generated
    @Selector("setNormalTexture:resize:")
    public static native SKAction setNormalTextureResize(SKTexture texture, boolean resize);

    @Generated
    @Selector("setTexture:")
    public static native SKAction setTexture(SKTexture texture);

    @Generated
    @Selector("setTexture:resize:")
    public static native SKAction setTextureResize(SKTexture texture, boolean resize);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("speedBy:duration:")
    public static native SKAction speedByDuration(@NFloat double speed, double sec);

    @Generated
    @Selector("speedTo:duration:")
    public static native SKAction speedToDuration(@NFloat double speed, double sec);

    @Generated
    @Selector("stereoPanBy:duration:")
    public static native SKAction stereoPanByDuration(float v, double duration);

    @Generated
    @Selector("stereoPanTo:duration:")
    public static native SKAction stereoPanToDuration(float v, double duration);

    @Generated
    @Selector("stop")
    public static native SKAction stop();

    @Generated
    @Selector("strengthBy:duration:")
    public static native SKAction strengthByDuration(float strength, double sec);

    @Generated
    @Selector("strengthTo:duration:")
    public static native SKAction strengthToDuration(float strength, double sec);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unhide")
    public static native SKAction unhide();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("waitForDuration:")
    public static native SKAction waitForDuration(double sec);

    @Generated
    @Selector("waitForDuration:withRange:")
    public static native SKAction waitForDurationWithRange(double sec, double durationRange);

    @Generated
    @Selector("warpTo:duration:")
    public static native SKAction warpToDuration(SKWarpGeometry warp, double duration);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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

    @Generated
    @Selector("reversedAction")
    public native SKAction reversedAction();

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@ObjCBlock(name = "call_setTimingFunction") Block_setTimingFunction value);

    @Generated
    @Selector("setTimingMode:")
    public native void setTimingMode(@NInt long value);

    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @Selector("timingFunction")
    @ObjCBlock(name = "call_timingFunction_ret")
    public native Block_timingFunction_ret timingFunction();

    @Generated
    @Selector("timingMode")
    @NInt
    public native long timingMode();

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
