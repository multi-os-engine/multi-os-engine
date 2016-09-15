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

package apple.audiounit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AudioUnit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUParameter extends AUParameterNode implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AUParameter(Pointer peer) {
        super(peer);
    }

    /**
     * address</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/address">iOS Dev Center</a>
     */
    @Generated
    @Selector("address")
    public native long address();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUParameter alloc();

    /**
     * dependentParameters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/dependentParameters">iOS Dev Center</a>
     */
    @Generated
    @Selector("dependentParameters")
    public native NSArray<? extends NSNumber> dependentParameters();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * flags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/flags">iOS Dev Center</a>
     */
    @Generated
    @Selector("flags")
    public native int flags();

    @Generated
    @Selector("init")
    public native AUParameter init();

    @Generated
    @Selector("initWithCoder:")
    public native AUParameter initWithCoder(NSCoder aDecoder);

    /**
     * maxValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/maxValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxValue")
    public native float maxValue();

    /**
     * minValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/minValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("minValue")
    public native float minValue();

    /**
     * value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/value">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(float value);

    /**
     * setValue:originator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instm/AUParameter/setValue:originator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:originator:")
    public native void setValueOriginator(float value, VoidPtr originator);

    /**
     * setValue:originator:atHostTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instm/AUParameter/setValue:originator:atHostTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:originator:atHostTime:")
    public native void setValueOriginatorAtHostTime(float value, VoidPtr originator, long hostTime);

    /**
     * stringFromValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instm/AUParameter/stringFromValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringFromValue:")
    public native String stringFromValue(ConstFloatPtr value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * unit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/unit">iOS Dev Center</a>
     */
    @Generated
    @Selector("unit")
    public native int unit();

    /**
     * unitName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/unitName">iOS Dev Center</a>
     */
    @Generated
    @Selector("unitName")
    public native String unitName();

    /**
     * value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/value">iOS Dev Center</a>
     */
    @Generated
    @Selector("value")
    public native float value();

    /**
     * valueFromString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instm/AUParameter/valueFromString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueFromString:")
    public native float valueFromString(String string);

    /**
     * valueStrings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUParameter_ClassReference/index.html#//apple_ref/occ/instp/AUParameter/valueStrings">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueStrings")
    public native NSArray<String> valueStrings();

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
}
