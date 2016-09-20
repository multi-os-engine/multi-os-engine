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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAction extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAction alloc();

    /**
     * customActionWithDuration:actionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/customActionWithDuration:actionBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("customActionWithDuration:actionBlock:")
    public static native SCNAction customActionWithDurationActionBlock(double seconds,
            @ObjCBlock(name = "call_customActionWithDurationActionBlock") Block_customActionWithDurationActionBlock block);

    /**
     * fadeInWithDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/fadeInWithDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeInWithDuration:")
    public static native SCNAction fadeInWithDuration(double sec);

    /**
     * fadeOpacityBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/fadeOpacityBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeOpacityBy:duration:")
    public static native SCNAction fadeOpacityByDuration(@NFloat double factor, double sec);

    /**
     * fadeOpacityTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/fadeOpacityTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeOpacityTo:duration:")
    public static native SCNAction fadeOpacityToDuration(@NFloat double opacity, double sec);

    /**
     * fadeOutWithDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/fadeOutWithDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fadeOutWithDuration:")
    public static native SCNAction fadeOutWithDuration(double sec);

    /**
     * group:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/group:">iOS Dev Center</a>
     */
    @Generated
    @Selector("group:")
    public static native SCNAction group(NSArray<? extends SCNAction> actions);

    /**
     * javaScriptActionWithScript:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/javaScriptActionWithScript:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("javaScriptActionWithScript:duration:")
    public static native SCNAction javaScriptActionWithScriptDuration(String script, double seconds);

    /**
     * moveBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/moveBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveBy:duration:")
    public static native SCNAction moveByDuration(@ByValue SCNVector3 delta, double duration);

    /**
     * moveByX:y:z:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/moveByX:y:z:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveByX:y:z:duration:")
    public static native SCNAction moveByXYZDuration(@NFloat double deltaX, @NFloat double deltaY,
            @NFloat double deltaZ, double duration);

    /**
     * moveTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/moveTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveTo:duration:")
    public static native SCNAction moveToDuration(@ByValue SCNVector3 location, double duration);

    /**
     * removeFromParentNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/removeFromParentNode">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromParentNode")
    public static native SCNAction removeFromParentNode();

    /**
     * repeatAction:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/repeatAction:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatAction:count:")
    public static native SCNAction repeatActionCount(SCNAction action, @NUInt long count);

    /**
     * repeatActionForever:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/repeatActionForever:">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatActionForever:")
    public static native SCNAction repeatActionForever(SCNAction action);

    /**
     * rotateByAngle:aroundAxis:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/rotateByAngle:aroundAxis:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateByAngle:aroundAxis:duration:")
    public static native SCNAction rotateByAngleAroundAxisDuration(@NFloat double angle, @ByValue SCNVector3 axis,
            double duration);

    /**
     * rotateByX:y:z:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/rotateByX:y:z:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateByX:y:z:duration:")
    public static native SCNAction rotateByXYZDuration(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration);

    /**
     * rotateToAxisAngle:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/rotateToAxisAngle:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateToAxisAngle:duration:")
    public static native SCNAction rotateToAxisAngleDuration(@ByValue SCNVector4 axisAngle, double duration);

    /**
     * rotateToX:y:z:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/rotateToX:y:z:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateToX:y:z:duration:")
    public static native SCNAction rotateToXYZDuration(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration);

    /**
     * rotateToX:y:z:duration:shortestUnitArc:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/rotateToX:y:z:duration:shortestUnitArc:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rotateToX:y:z:duration:shortestUnitArc:")
    public static native SCNAction rotateToXYZDurationShortestUnitArc(@NFloat double xAngle, @NFloat double yAngle,
            @NFloat double zAngle, double duration, boolean shortestUnitArc);

    /**
     * runBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/runBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runBlock:")
    public static native SCNAction runBlock(@ObjCBlock(name = "call_runBlock") Block_runBlock block);

    /**
     * runBlock:queue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/runBlock:queue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runBlock:queue:")
    public static native SCNAction runBlockQueue(@ObjCBlock(name = "call_runBlockQueue") Block_runBlockQueue block,
            NSObject queue);

    /**
     * scaleBy:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/scaleBy:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleBy:duration:")
    public static native SCNAction scaleByDuration(@NFloat double scale, double sec);

    /**
     * scaleTo:duration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/scaleTo:duration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleTo:duration:")
    public static native SCNAction scaleToDuration(@NFloat double scale, double sec);

    /**
     * sequence:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/sequence:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sequence:")
    public static native SCNAction sequence(NSArray<? extends SCNAction> actions);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * waitForDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/waitForDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitForDuration:")
    public static native SCNAction waitForDuration(double sec);

    /**
     * waitForDuration:withRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/waitForDuration:withRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("waitForDuration:withRange:")
    public static native SCNAction waitForDurationWithRange(double sec, double durationRange);

    /**
     * hide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/hide">iOS Dev Center</a>
     */
    @Generated
    @Selector("hide")
    public static native SCNAction hide();

    /**
     * playAudioSource:waitForCompletion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/playAudioSource:waitForCompletion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playAudioSource:waitForCompletion:")
    public static native SCNAction playAudioSourceWaitForCompletion(SCNAudioSource source, boolean wait_);

    /**
     * unhide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/clm/SCNAction/unhide">iOS Dev Center</a>
     */
    @Generated
    @Selector("unhide")
    public static native SCNAction unhide();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SCNAction init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAction initWithCoder(NSCoder aDecoder);

    /**
     * reversedAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instm/SCNAction/reversedAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("reversedAction")
    public native SCNAction reversedAction();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * timingFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/timingFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@ObjCBlock(name = "call_setTimingFunction") Block_setTimingFunction value);

    /**
     * timingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/timingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimingMode:")
    public native void setTimingMode(@NInt long value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * timingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/timingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("timingMode")
    @NInt
    public native long timingMode();

    /**
     * timingFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAction_Class/index.html#//apple_ref/occ/instp/SCNAction/timingFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("timingFunction")
    @ObjCBlock(name = "call_timingFunction_ret")
    public native Block_timingFunction_ret timingFunction();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customActionWithDurationActionBlock {
        @Generated
        void call_customActionWithDurationActionBlock(SCNNode arg0, @NFloat double arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlock {
        @Generated
        void call_runBlock(SCNNode arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runBlockQueue {
        @Generated
        void call_runBlockQueue(SCNNode arg0);
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
