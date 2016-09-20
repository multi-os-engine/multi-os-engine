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
    @Owned
    @Selector("alloc")
    public static native CAEmitterLayer alloc();

    @Generated
    @Selector("layer")
    public static native CAEmitterLayer layer();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthRate")
    public native float birthRate();

    /**
     * emitterCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterCells")
    public native NSArray<? extends CAEmitterCell> emitterCells();

    /**
     * emitterDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterDepth")
    @NFloat
    public native double emitterDepth();

    /**
     * emitterMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterMode")
    public native String emitterMode();

    /**
     * emitterPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterPosition")
    @ByValue
    public native CGPoint emitterPosition();

    /**
     * emitterShape</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterShape">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterShape")
    public native String emitterShape();

    /**
     * emitterSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterSize")
    @ByValue
    public native CGSize emitterSize();

    /**
     * emitterZPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterZPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterZPosition")
    @NFloat
    public native double emitterZPosition();

    @Generated
    @Selector("init")
    public native CAEmitterLayer init();

    @Generated
    @Selector("initWithLayer:")
    public native CAEmitterLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * lifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/lifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("lifetime")
    public native float lifetime();

    /**
     * preservesDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/preservesDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("preservesDepth")
    public native boolean preservesDepth();

    /**
     * renderMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/renderMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("renderMode")
    public native String renderMode();

    /**
     * scale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/scale">iOS Dev Center</a>
     */
    @Generated
    @Selector("scale")
    public native float scale();

    /**
     * seed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/seed">iOS Dev Center</a>
     */
    @Generated
    @Selector("seed")
    public native int seed();

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(float value);

    /**
     * emitterCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterCells:")
    public native void setEmitterCells(NSArray<? extends CAEmitterCell> value);

    /**
     * emitterDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterDepth:")
    public native void setEmitterDepth(@NFloat double value);

    /**
     * emitterMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterMode:")
    public native void setEmitterMode(String value);

    /**
     * emitterPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterPosition:")
    public native void setEmitterPosition(@ByValue CGPoint value);

    /**
     * emitterShape</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterShape">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterShape:")
    public native void setEmitterShape(String value);

    /**
     * emitterSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterSize:")
    public native void setEmitterSize(@ByValue CGSize value);

    /**
     * emitterZPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/emitterZPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterZPosition:")
    public native void setEmitterZPosition(@NFloat double value);

    /**
     * lifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/lifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLifetime:")
    public native void setLifetime(float value);

    /**
     * preservesDepth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/preservesDepth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreservesDepth:")
    public native void setPreservesDepth(boolean value);

    /**
     * renderMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/renderMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRenderMode:")
    public native void setRenderMode(String value);

    /**
     * scale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/scale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(float value);

    /**
     * seed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/seed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeed:")
    public native void setSeed(int value);

    /**
     * spin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/spin">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpin:")
    public native void setSpin(float value);

    /**
     * velocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/velocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(float value);

    /**
     * spin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/spin">iOS Dev Center</a>
     */
    @Generated
    @Selector("spin")
    public native float spin();

    /**
     * velocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterLayer_class/index.html#//apple_ref/occ/instp/CAEmitterLayer/velocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("velocity")
    public native float velocity();

    @Generated
    @Selector("initWithCoder:")
    public native CAEmitterLayer initWithCoder(NSCoder aDecoder);
}
