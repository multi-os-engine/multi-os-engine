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
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicItem;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFieldBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFieldBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFieldBehavior alloc();

    @Generated
    @Selector("dragField")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object dragField();

    @Generated
    @Selector("electricField")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object electricField();

    @Generated
    @Selector("fieldWithEvaluationBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fieldWithEvaluationBlock(
            @ObjCBlock(name = "call_fieldWithEvaluationBlock") Block_fieldWithEvaluationBlock block);

    @Generated
    @Selector("linearGravityFieldWithVector:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object linearGravityFieldWithVector(@ByValue CGVector direction);

    @Generated
    @Selector("magneticField")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object magneticField();

    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness, @NFloat double speed);

    @Generated
    @Selector("radialGravityFieldWithPosition:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object radialGravityFieldWithPosition(@ByValue CGPoint position);

    @Generated
    @Selector("springField")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object springField();

    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    @Generated
    @Selector("velocityFieldWithVector:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object velocityFieldWithVector(@ByValue CGVector direction);

    @Generated
    @Selector("vortexField")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object vortexField();

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
    public static native long version();

    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("animationSpeed")
    @NFloat
    public native double animationSpeed();

    @Generated
    @Selector("direction")
    @ByValue
    public native CGVector direction();

    @Generated
    @Selector("falloff")
    @NFloat
    public native double falloff();

    @Generated
    @Selector("init")
    public native UIFieldBehavior init();

    @Generated
    @Selector("items")
    public native NSArray<?> items();

    @Generated
    @Selector("minimumRadius")
    @NFloat
    public native double minimumRadius();

    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    @Generated
    @Selector("region")
    public native UIRegion region();

    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("setAnimationSpeed:")
    public native void setAnimationSpeed(@NFloat double value);

    @Generated
    @Selector("setDirection:")
    public native void setDirection(@ByValue CGVector value);

    @Generated
    @Selector("setFalloff:")
    public native void setFalloff(@NFloat double value);

    @Generated
    @Selector("setMinimumRadius:")
    public native void setMinimumRadius(@NFloat double value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue CGPoint value);

    @Generated
    @Selector("setRegion:")
    public native void setRegion(UIRegion value);

    @Generated
    @Selector("setSmoothness:")
    public native void setSmoothness(@NFloat double value);

    @Generated
    @Selector("setStrength:")
    public native void setStrength(@NFloat double value);

    @Generated
    @Selector("smoothness")
    @NFloat
    public native double smoothness();

    @Generated
    @Selector("strength")
    @NFloat
    public native double strength();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fieldWithEvaluationBlock {
        @Generated
        @ByValue
        CGVector call_fieldWithEvaluationBlock(UIFieldBehavior arg0, @ByValue CGPoint arg1, @ByValue CGVector arg2,
                @NFloat double arg3, @NFloat double arg4, double arg5);
    }
}
