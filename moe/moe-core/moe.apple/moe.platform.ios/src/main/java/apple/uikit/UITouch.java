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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.spritekit.SKNode;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITouch extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UITouch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITouch alloc();

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

    /**
     * gestureRecognizers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/gestureRecognizers">iOS Dev Center</a>
     */
    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    @Generated
    @Selector("init")
    public native UITouch init();

    /**
     * locationInNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/locationInNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("locationInNode:")
    @ByValue
    public native CGPoint locationInNode(SKNode node);

    /**
     * locationInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/locationInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(UIView view);

    /**
     * majorRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/majorRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("majorRadius")
    @NFloat
    public native double majorRadius();

    /**
     * majorRadiusTolerance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/majorRadiusTolerance">iOS Dev Center</a>
     */
    @Generated
    @Selector("majorRadiusTolerance")
    @NFloat
    public native double majorRadiusTolerance();

    /**
     * phase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/phase">iOS Dev Center</a>
     */
    @Generated
    @Selector("phase")
    @NInt
    public native long phase();

    /**
     * previousLocationInNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/previousLocationInNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("previousLocationInNode:")
    @ByValue
    public native CGPoint previousLocationInNode(SKNode node);

    /**
     * previousLocationInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/previousLocationInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("previousLocationInView:")
    @ByValue
    public native CGPoint previousLocationInView(UIView view);

    /**
     * tapCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/tapCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("tapCount")
    @NUInt
    public native long tapCount();

    /**
     * timestamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/timestamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("timestamp")
    public native double timestamp();

    /**
     * view</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/view">iOS Dev Center</a>
     */
    @Generated
    @Selector("view")
    public native UIView view();

    /**
     * window</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/window">iOS Dev Center</a>
     */
    @Generated
    @Selector("window")
    public native UIWindow window();

    /**
     * force</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/force">iOS Dev Center</a>
     */
    @Generated
    @Selector("force")
    @NFloat
    public native double force();

    /**
     * maximumPossibleForce</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/maximumPossibleForce">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumPossibleForce")
    @NFloat
    public native double maximumPossibleForce();

    /**
     * altitudeAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/altitudeAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("altitudeAngle")
    @NFloat
    public native double altitudeAngle();

    /**
     * azimuthAngleInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/azimuthAngleInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("azimuthAngleInView:")
    @NFloat
    public native double azimuthAngleInView(UIView view);

    /**
     * azimuthUnitVectorInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/azimuthUnitVectorInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("azimuthUnitVectorInView:")
    @ByValue
    public native CGVector azimuthUnitVectorInView(UIView view);

    /**
     * estimatedProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/estimatedProperties">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedProperties")
    @NInt
    public native long estimatedProperties();

    /**
     * estimatedPropertiesExpectingUpdates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/estimatedPropertiesExpectingUpdates">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimatedPropertiesExpectingUpdates")
    @NInt
    public native long estimatedPropertiesExpectingUpdates();

    /**
     * estimationUpdateIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/estimationUpdateIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("estimationUpdateIndex")
    public native NSNumber estimationUpdateIndex();

    /**
     * preciseLocationInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/preciseLocationInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("preciseLocationInView:")
    @ByValue
    public native CGPoint preciseLocationInView(UIView view);

    /**
     * precisePreviousLocationInView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instm/UITouch/precisePreviousLocationInView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("precisePreviousLocationInView:")
    @ByValue
    public native CGPoint precisePreviousLocationInView(UIView view);

    /**
     * type</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITouch_Class/index.html#//apple_ref/occ/instp/UITouch/type">iOS Dev Center</a>
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();
}
