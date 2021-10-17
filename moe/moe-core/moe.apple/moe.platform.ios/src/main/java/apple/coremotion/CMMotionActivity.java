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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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

/**
 * CMMotionActivity
 * <p>
 * Discussion:
 * An estimate of the user's activity based on the motion of the device.
 * <p>
 * The activity is exposed as a set of properties, the properties are not
 * mutually exclusive.
 * <p>
 * For example, if you're in a car stopped at a stop sign the state might
 * look like:
 * stationary = YES, walking = NO, running = NO, automotive = YES
 * <p>
 * Or a moving vehicle,
 * stationary = NO, walking = NO, running = NO, automotive = YES
 * <p>
 * Or the device could be in motion but not walking or in a vehicle.
 * stationary = NO, walking = NO, running = NO, automotive = NO.
 * Note in this case all of the properties are NO.
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMMotionActivity extends CMLogItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CMMotionActivity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMMotionActivity alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * automotive
     * <p>
     * Discussion:
     * True if the device is in a vehicle.
     */
    @Generated
    @Selector("automotive")
    public native boolean automotive();

    /**
     * confidence
     * <p>
     * Discussion:
     * A confidence estimate associated with this state.
     * <p>
     * CoreMotion always provides the most likely state.  Confidence represents
     * how likely that the state is to be correct.
     */
    @Generated
    @Selector("confidence")
    @NInt
    public native long confidence();

    /**
     * cycling
     * <p>
     * Discussion:
     * True if the device is on a bicycle.
     */
    @Generated
    @Selector("cycling")
    public native boolean cycling();

    @Generated
    @Selector("init")
    public native CMMotionActivity init();

    @Generated
    @Selector("initWithCoder:")
    public native CMMotionActivity initWithCoder(NSCoder coder);

    /**
     * running
     * <p>
     * Discussion:
     * True if the device is on a running person.
     */
    @Generated
    @Selector("running")
    public native boolean running();

    /**
     * startDate
     * <p>
     * Discussion:
     * Time at which the activity started.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * stationary
     * <p>
     * Discussion:
     * True if the device is not moving.
     */
    @Generated
    @Selector("stationary")
    public native boolean stationary();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * unknown
     * <p>
     * Discussion:
     * True if there is no estimate of the current state.  This can happen if
     * the device was turned off.
     */
    @Generated
    @Selector("unknown")
    public native boolean unknown();

    /**
     * walking
     * <p>
     * Discussion:
     * True if the device is on a walking person.
     */
    @Generated
    @Selector("walking")
    public native boolean walking();
}
