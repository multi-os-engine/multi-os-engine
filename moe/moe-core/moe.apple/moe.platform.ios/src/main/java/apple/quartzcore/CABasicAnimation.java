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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.SCNAnimation;
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
 * Subclass for basic (single-keyframe) animations. *
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CABasicAnimation extends CAPropertyAnimation {
    static {
        NatJ.register();
    }

    @Generated
    protected CABasicAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CABasicAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CABasicAnimation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animation")
    public static native CABasicAnimation animation();

    @Generated
    @Selector("animationWithKeyPath:")
    public static native CABasicAnimation animationWithKeyPath(String path);

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
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

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
    public static native CABasicAnimation new_objc();

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
    @Selector("byValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object byValue();

    /**
     * The objects defining the property values being interpolated between.
     * All are optional, and no more than two should be non-nil. The object
     * type should match the type of the property being animated (using the
     * standard rules described in CALayer.h). The supported modes of
     * animation are:
     * <p>
     * - both `fromValue' and `toValue' non-nil. Interpolates between
     * `fromValue' and `toValue'.
     * <p>
     * - `fromValue' and `byValue' non-nil. Interpolates between
     * `fromValue' and `fromValue' plus `byValue'.
     * <p>
     * - `byValue' and `toValue' non-nil. Interpolates between `toValue'
     * minus `byValue' and `toValue'.
     * <p>
     * - `fromValue' non-nil. Interpolates between `fromValue' and the
     * current presentation value of the property.
     * <p>
     * - `toValue' non-nil. Interpolates between the layer's current value
     * of the property in the render tree and `toValue'.
     * <p>
     * - `byValue' non-nil. Interpolates between the layer's current value
     * of the property in the render tree and that plus `byValue'.
     */
    @Generated
    @Selector("fromValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fromValue();

    @Generated
    @Selector("init")
    public native CABasicAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native CABasicAnimation initWithCoder(NSCoder coder);

    @Generated
    @Selector("setByValue:")
    public native void setByValue(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The objects defining the property values being interpolated between.
     * All are optional, and no more than two should be non-nil. The object
     * type should match the type of the property being animated (using the
     * standard rules described in CALayer.h). The supported modes of
     * animation are:
     * <p>
     * - both `fromValue' and `toValue' non-nil. Interpolates between
     * `fromValue' and `toValue'.
     * <p>
     * - `fromValue' and `byValue' non-nil. Interpolates between
     * `fromValue' and `fromValue' plus `byValue'.
     * <p>
     * - `byValue' and `toValue' non-nil. Interpolates between `toValue'
     * minus `byValue' and `toValue'.
     * <p>
     * - `fromValue' non-nil. Interpolates between `fromValue' and the
     * current presentation value of the property.
     * <p>
     * - `toValue' non-nil. Interpolates between the layer's current value
     * of the property in the render tree and `toValue'.
     * <p>
     * - `byValue' non-nil. Interpolates between the layer's current value
     * of the property in the render tree and that plus `byValue'.
     */
    @Generated
    @Selector("setFromValue:")
    public native void setFromValue(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setToValue:")
    public native void setToValue(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("toValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object toValue();

    @Generated
    @Selector("animationWithSCNAnimation:")
    public static native CAAnimation animationWithSCNAnimation(SCNAnimation animation);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
