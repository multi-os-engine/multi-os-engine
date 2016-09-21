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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.protocol.CAAction;
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
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAEmitterLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CAEmitterLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAEmitterLayer alloc();

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
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(String event);

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
    @Selector("layer")
    public static native CAEmitterLayer layer();

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(String key);

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

    @Generated
    @Selector("birthRate")
    public native float birthRate();

    @Generated
    @Selector("emitterCells")
    public native NSArray<? extends CAEmitterCell> emitterCells();

    @Generated
    @Selector("emitterDepth")
    @NFloat
    public native double emitterDepth();

    @Generated
    @Selector("emitterMode")
    public native String emitterMode();

    @Generated
    @Selector("emitterPosition")
    @ByValue
    public native CGPoint emitterPosition();

    @Generated
    @Selector("emitterShape")
    public native String emitterShape();

    @Generated
    @Selector("emitterSize")
    @ByValue
    public native CGSize emitterSize();

    @Generated
    @Selector("emitterZPosition")
    @NFloat
    public native double emitterZPosition();

    @Generated
    @Selector("init")
    public native CAEmitterLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CAEmitterLayer initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithLayer:")
    public native CAEmitterLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    @Generated
    @Selector("lifetime")
    public native float lifetime();

    @Generated
    @Selector("preservesDepth")
    public native boolean preservesDepth();

    @Generated
    @Selector("renderMode")
    public native String renderMode();

    @Generated
    @Selector("scale")
    public native float scale();

    @Generated
    @Selector("seed")
    public native int seed();

    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(float value);

    @Generated
    @Selector("setEmitterCells:")
    public native void setEmitterCells(NSArray<? extends CAEmitterCell> value);

    @Generated
    @Selector("setEmitterDepth:")
    public native void setEmitterDepth(@NFloat double value);

    @Generated
    @Selector("setEmitterMode:")
    public native void setEmitterMode(String value);

    @Generated
    @Selector("setEmitterPosition:")
    public native void setEmitterPosition(@ByValue CGPoint value);

    @Generated
    @Selector("setEmitterShape:")
    public native void setEmitterShape(String value);

    @Generated
    @Selector("setEmitterSize:")
    public native void setEmitterSize(@ByValue CGSize value);

    @Generated
    @Selector("setEmitterZPosition:")
    public native void setEmitterZPosition(@NFloat double value);

    @Generated
    @Selector("setLifetime:")
    public native void setLifetime(float value);

    @Generated
    @Selector("setPreservesDepth:")
    public native void setPreservesDepth(boolean value);

    @Generated
    @Selector("setRenderMode:")
    public native void setRenderMode(String value);

    @Generated
    @Selector("setScale:")
    public native void setScale(float value);

    @Generated
    @Selector("setSeed:")
    public native void setSeed(int value);

    @Generated
    @Selector("setSpin:")
    public native void setSpin(float value);

    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(float value);

    @Generated
    @Selector("spin")
    public native float spin();

    @Generated
    @Selector("velocity")
    public native float velocity();
}
