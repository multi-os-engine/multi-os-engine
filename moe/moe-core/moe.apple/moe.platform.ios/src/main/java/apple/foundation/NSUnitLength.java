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
public class NSUnitLength extends NSDimension implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUnitLength(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUnitLength alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUnitLength allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("astronomicalUnits")
    public static native NSUnitLength astronomicalUnits();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("baseUnit")
    public static native NSUnitLength baseUnit();

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
    @Selector("centimeters")
    public static native NSUnitLength centimeters();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @NotNull
    @Generated
    @Selector("decameters")
    public static native NSUnitLength decameters();

    @NotNull
    @Generated
    @Selector("decimeters")
    public static native NSUnitLength decimeters();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("fathoms")
    public static native NSUnitLength fathoms();

    @NotNull
    @Generated
    @Selector("feet")
    public static native NSUnitLength feet();

    @NotNull
    @Generated
    @Selector("furlongs")
    public static native NSUnitLength furlongs();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("hectometers")
    public static native NSUnitLength hectometers();

    @NotNull
    @Generated
    @Selector("inches")
    public static native NSUnitLength inches();

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
    @Selector("kilometers")
    public static native NSUnitLength kilometers();

    @NotNull
    @Generated
    @Selector("lightyears")
    public static native NSUnitLength lightyears();

    /**
     * Base unit - meters
     */
    @NotNull
    @Generated
    @Selector("megameters")
    public static native NSUnitLength megameters();

    @NotNull
    @Generated
    @Selector("meters")
    public static native NSUnitLength meters();

    @NotNull
    @Generated
    @Selector("micrometers")
    public static native NSUnitLength micrometers();

    @NotNull
    @Generated
    @Selector("miles")
    public static native NSUnitLength miles();

    @NotNull
    @Generated
    @Selector("millimeters")
    public static native NSUnitLength millimeters();

    @NotNull
    @Generated
    @Selector("nanometers")
    public static native NSUnitLength nanometers();

    @NotNull
    @Generated
    @Selector("nauticalMiles")
    public static native NSUnitLength nauticalMiles();

    @Generated
    @Owned
    @Selector("new")
    public static native NSUnitLength new_objc();

    @NotNull
    @Generated
    @Selector("parsecs")
    public static native NSUnitLength parsecs();

    @NotNull
    @Generated
    @Selector("picometers")
    public static native NSUnitLength picometers();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @NotNull
    @Generated
    @Selector("scandinavianMiles")
    public static native NSUnitLength scandinavianMiles();

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

    @NotNull
    @Generated
    @Selector("yards")
    public static native NSUnitLength yards();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSUnitLength init();

    @Generated
    @Selector("initWithCoder:")
    public native NSUnitLength initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithSymbol:")
    public native NSUnitLength initWithSymbol(@NotNull String symbol);

    @Generated
    @Selector("initWithSymbol:converter:")
    public native NSUnitLength initWithSymbolConverter(@NotNull String symbol, @NotNull NSUnitConverter converter);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
