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

package apple.audiotoolbox;

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

/**
 * AUParameter
 * 
 * A node representing a single parameter.
 */
@Generated
@Library("AudioToolbox")
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUParameter alloc();

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
     * The parameter's address.
     */
    @Generated
    @Selector("address")
    public native long address();

    /**
     * Parameters whose values may change as a side effect of this parameter's value
     * 			changing.
     * 
     * 	Each array value is an NSNumber representing AUParameterAddress.
     */
    @Generated
    @Selector("dependentParameters")
    public native NSArray<? extends NSNumber> dependentParameters();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Various details of the parameter.
     */
    @Generated
    @Selector("flags")
    public native int flags();

    @Generated
    @Selector("init")
    public native AUParameter init();

    @Generated
    @Selector("initWithCoder:")
    public native AUParameter initWithCoder(NSCoder coder);

    /**
     * The parameter's maximum value.
     */
    @Generated
    @Selector("maxValue")
    public native float maxValue();

    /**
     * The parameter's minimum value.
     */
    @Generated
    @Selector("minValue")
    public native float minValue();

    /**
     * The parameter's current value.
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(float value);

    /**
     * Set the parameter's value, avoiding redundant notifications to the originator.
     * 
     * 		Bridged to the v2 function AudioUnitSetParameter.
     */
    @Generated
    @Selector("setValue:originator:")
    public native void setValueOriginator(float value, VoidPtr originator);

    /**
     * Convenience for setValue:originator:atHostTime:eventType:
     * 
     * 		Bridged to the v2 function AudioUnitSetParameter.
     */
    @Generated
    @Selector("setValue:originator:atHostTime:")
    public native void setValueOriginatorAtHostTime(float value, VoidPtr originator, long hostTime);

    /**
     * Set the parameter's value, preserving the host time of the gesture that initiated the
     * 		change, and associating an event type such as touch/release.
     * 
     * 	In general, this method should only be called from a user interface. It initiates a change
     * 	to a parameter in a way that captures the gesture such that it can be recorded later --
     * 	any AUParameterAutomationObservers will receive the host time and event type associated
     * 	with the parameter change.
     * 
     * 	From an audio playback engine, a host should schedule automated parameter changes through
     * 	AUAudioUnit's scheduleParameterBlock.
     * 
     * 	Bridged to the v2 function AudioUnitSetParameter.
     */
    @Generated
    @Selector("setValue:originator:atHostTime:eventType:")
    public native void setValueOriginatorAtHostTimeEventType(float value, VoidPtr originator, long hostTime,
            int eventType);

    /**
     * Get a textual representation of a value for the parameter. Use value==nil to use the
     * 	   current value. Bridged to the v2 property kAudioUnitProperty_ParameterStringFromValue.
     * 
     * 	This is currently only supported for parameters whose flags include
     * 	kAudioUnitParameterFlag_ValuesHaveStrings.
     */
    @Generated
    @Selector("stringFromValue:")
    public native String stringFromValue(ConstFloatPtr value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The parameter's unit of measurement.
     */
    @Generated
    @Selector("unit")
    public native int unit();

    /**
     * A localized name for the parameter's unit. Supplied by the AU if kAudioUnitParameterUnit_CustomUnit; else by the framework.
     */
    @Generated
    @Selector("unitName")
    public native String unitName();

    /**
     * The parameter's current value.
     */
    @Generated
    @Selector("value")
    public native float value();

    /**
     * Convert a textual representation of a value to a numeric one.
     * 
     * 	This is currently only supported for parameters whose flags include
     * 	kAudioUnitParameterFlag_ValuesHaveStrings.
     */
    @Generated
    @Selector("valueFromString:")
    public native float valueFromString(String string);

    /**
     * For parameters with kAudioUnitParameterUnit_Indexed, localized strings corresponding
     * to the values.
     */
    @Generated
    @Selector("valueStrings")
    public native NSArray<String> valueStrings();
}
