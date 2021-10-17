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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUnitConverterLinear extends NSUnitConverter implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUnitConverterLinear(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUnitConverterLinear alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSUnitConverterLinear allocWithZone(VoidPtr zone);

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
    public static native NSUnitConverterLinear new_objc();

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
     * For units that require linear conversion, the methods perform calculations in the form of y = ax + b, where
     * - x is the value in terms of the unit on which this method is called
     * - y is the value in terms of the base unit of the dimension
     * - a is the known coefficient used for this unit's conversion
     * - b is the known constant used for this unit's conversion
     * <p>
     * baseUnitValueFromValue: performs the conversion in the form of y = ax + b, where x represents the value passed in and y represents the value returned.
     * valueFromBaseUnitValue: performs the inverse conversion in the form of x = (y + (-1 * b))/a, where y represents the value passed in and x represents the value returned.
     * <p>
     * An example of this is NSUnitTemperature.  For Celsius, baseUnitValueFromValue: calculates the value in Kelvin using the formula
     * K = 1 * °C + 273.15
     * and valueFromBaseUnitValue: calculates the value in Celsius using the formula
     * C° = (K + (-1 * 273.15))/1
     * where the coefficient is 1 and the constant is 273.15.
     * <p>
     * For units that only require conversion by scale factor, the coefficient is the scale factor and the constant is always 0.  baseUnitValueFromValue: calculates the value in meters using the formula
     * valueInMeters = 1000 * valueInKilometers + 0
     * and valueFromBaseUnitValue: calculates the value in kilometers using the formula
     * valueInKilometers = valueInMeters / 1000
     * where the coefficient is 1000 and the constant is 0.  This API provides a convenience initializer initWithCoefficient: that assumes the constant is 0.
     */
    @Generated
    @Selector("coefficient")
    public native double coefficient();

    @Generated
    @Selector("constant")
    public native double constant();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSUnitConverterLinear init();

    @Generated
    @Selector("initWithCoder:")
    public native NSUnitConverterLinear initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoefficient:")
    public native NSUnitConverterLinear initWithCoefficient(double coefficient);

    @Generated
    @Selector("initWithCoefficient:constant:")
    public native NSUnitConverterLinear initWithCoefficientConstant(double coefficient, double constant);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
