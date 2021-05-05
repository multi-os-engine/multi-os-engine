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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITouch alloc();

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

    /**
     * Altitude angle. Valid only for stylus touch types.
     * Zero radians indicates that the stylus is parallel to the screen surface,
     * while M_PI/2 radians indicates that it is normal to the screen surface.
     */
    @Generated
    @Selector("altitudeAngle")
    @NFloat
    public native double altitudeAngle();

    /**
     * Azimuth angle. Valid only for stylus touch types. Zero radians points along the positive X axis.
     * Passing a nil for the view parameter will return the azimuth relative to the touch's window.
     */
    @Generated
    @Selector("azimuthAngleInView:")
    @NFloat
    public native double azimuthAngleInView(UIView view);

    /**
     * A unit vector that points in the direction of the azimuth angle. Valid only for stylus touch types.
     * Passing nil for the view parameter will return a unit vector relative to the touch's window.
     */
    @Generated
    @Selector("azimuthUnitVectorInView:")
    @ByValue
    public native CGVector azimuthUnitVectorInView(UIView view);

    /**
     * A set of properties that has estimated values
     * Only denoting properties that are currently estimated
     */
    @Generated
    @Selector("estimatedProperties")
    @NInt
    public native long estimatedProperties();

    /**
     * A set of properties that expect to have incoming updates in the future.
     * If no updates are expected for an estimated property the current value is our final estimate.
     * This happens e.g. for azimuth/altitude values when entering from the edges
     */
    @Generated
    @Selector("estimatedPropertiesExpectingUpdates")
    @NInt
    public native long estimatedPropertiesExpectingUpdates();

    /**
     * An index which allows you to correlate updates with the original touch.
     * Is only guaranteed non-nil if this UITouch expects or is an update.
     */
    @Generated
    @Selector("estimationUpdateIndex")
    public native NSNumber estimationUpdateIndex();

    /**
     * Force of the touch, where 1.0 represents the force of an average touch
     */
    @Generated
    @Selector("force")
    @NFloat
    public native double force();

    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    @Generated
    @Selector("init")
    public native UITouch init();

    @Generated
    @Selector("locationInNode:")
    @ByValue
    public native CGPoint locationInNode(SKNode node);

    @Generated
    @Selector("locationInView:")
    @ByValue
    public native CGPoint locationInView(UIView view);

    /**
     * majorRadius and majorRadiusTolerance are in points
     * The majorRadius will be accurate +/- the majorRadiusTolerance
     */
    @Generated
    @Selector("majorRadius")
    @NFloat
    public native double majorRadius();

    @Generated
    @Selector("majorRadiusTolerance")
    @NFloat
    public native double majorRadiusTolerance();

    /**
     * Maximum possible force with this input mechanism
     */
    @Generated
    @Selector("maximumPossibleForce")
    @NFloat
    public native double maximumPossibleForce();

    @Generated
    @Selector("phase")
    @NInt
    public native long phase();

    /**
     * Use these methods to gain additional precision that may be available from touches.
     * Do not use precise locations for hit testing. A touch may hit test inside a view, yet have a precise location that lies just outside.
     */
    @Generated
    @Selector("preciseLocationInView:")
    @ByValue
    public native CGPoint preciseLocationInView(UIView view);

    @Generated
    @Selector("precisePreviousLocationInView:")
    @ByValue
    public native CGPoint precisePreviousLocationInView(UIView view);

    @Generated
    @Selector("previousLocationInNode:")
    @ByValue
    public native CGPoint previousLocationInNode(SKNode node);

    @Generated
    @Selector("previousLocationInView:")
    @ByValue
    public native CGPoint previousLocationInView(UIView view);

    /**
     * touch down within a certain point within a certain amount of time
     */
    @Generated
    @Selector("tapCount")
    @NUInt
    public native long tapCount();

    @Generated
    @Selector("timestamp")
    public native double timestamp();

    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("window")
    public native UIWindow window();
}
