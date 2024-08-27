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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUnitVolume extends NSDimension implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUnitVolume(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @NotNull
    @Generated
    @Selector("acreFeet")
    public static native NSUnitVolume acreFeet();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUnitVolume alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUnitVolume allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("baseUnit")
    public static native NSUnitVolume baseUnit();

    @NotNull
    @Generated
    @Selector("bushels")
    public static native NSUnitVolume bushels();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("centiliters")
    public static native NSUnitVolume centiliters();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Selector("cubicCentimeters")
    public static native NSUnitVolume cubicCentimeters();

    @NotNull
    @Generated
    @Selector("cubicDecimeters")
    public static native NSUnitVolume cubicDecimeters();

    @NotNull
    @Generated
    @Selector("cubicFeet")
    public static native NSUnitVolume cubicFeet();

    @NotNull
    @Generated
    @Selector("cubicInches")
    public static native NSUnitVolume cubicInches();

    @NotNull
    @Generated
    @Selector("cubicKilometers")
    public static native NSUnitVolume cubicKilometers();

    @NotNull
    @Generated
    @Selector("cubicMeters")
    public static native NSUnitVolume cubicMeters();

    @NotNull
    @Generated
    @Selector("cubicMiles")
    public static native NSUnitVolume cubicMiles();

    @NotNull
    @Generated
    @Selector("cubicMillimeters")
    public static native NSUnitVolume cubicMillimeters();

    @NotNull
    @Generated
    @Selector("cubicYards")
    public static native NSUnitVolume cubicYards();

    @NotNull
    @Generated
    @Selector("cups")
    public static native NSUnitVolume cups();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @NotNull
    @Generated
    @Selector("deciliters")
    public static native NSUnitVolume deciliters();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("fluidOunces")
    public static native NSUnitVolume fluidOunces();

    @NotNull
    @Generated
    @Selector("gallons")
    public static native NSUnitVolume gallons();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("imperialFluidOunces")
    public static native NSUnitVolume imperialFluidOunces();

    @NotNull
    @Generated
    @Selector("imperialGallons")
    public static native NSUnitVolume imperialGallons();

    @NotNull
    @Generated
    @Selector("imperialPints")
    public static native NSUnitVolume imperialPints();

    @NotNull
    @Generated
    @Selector("imperialQuarts")
    public static native NSUnitVolume imperialQuarts();

    @NotNull
    @Generated
    @Selector("imperialTablespoons")
    public static native NSUnitVolume imperialTablespoons();

    @NotNull
    @Generated
    @Selector("imperialTeaspoons")
    public static native NSUnitVolume imperialTeaspoons();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("kiloliters")
    public static native NSUnitVolume kiloliters();

    @NotNull
    @Generated
    @Selector("liters")
    public static native NSUnitVolume liters();

    /**
     * Base unit - liters
     */
    @NotNull
    @Generated
    @Selector("megaliters")
    public static native NSUnitVolume megaliters();

    @NotNull
    @Generated
    @Selector("metricCups")
    public static native NSUnitVolume metricCups();

    @NotNull
    @Generated
    @Selector("milliliters")
    public static native NSUnitVolume milliliters();

    @Generated
    @Owned
    @Selector("new")
    public static native NSUnitVolume new_objc();

    @NotNull
    @Generated
    @Selector("pints")
    public static native NSUnitVolume pints();

    @NotNull
    @Generated
    @Selector("quarts")
    public static native NSUnitVolume quarts();

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

    @NotNull
    @Generated
    @Selector("tablespoons")
    public static native NSUnitVolume tablespoons();

    @NotNull
    @Generated
    @Selector("teaspoons")
    public static native NSUnitVolume teaspoons();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSUnitVolume init();

    @Generated
    @Selector("initWithCoder:")
    public native NSUnitVolume initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithSymbol:")
    public native NSUnitVolume initWithSymbol(@NotNull String symbol);

    @Generated
    @Selector("initWithSymbol:converter:")
    public native NSUnitVolume initWithSymbolConverter(@NotNull String symbol, @NotNull NSUnitConverter converter);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
