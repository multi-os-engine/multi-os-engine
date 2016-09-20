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
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.quartzcore.protocol.CAMediaTiming;
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
public class CAEmitterCell extends NSObject implements NSCoding, CAMediaTiming {
    static {
        NatJ.register();
    }

    @Generated
    protected CAEmitterCell(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAEmitterCell alloc();

    /**
     * defaultValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/clm/CAEmitterCell/defaultValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

    /**
     * emitterCell</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/clm/CAEmitterCell/emitterCell">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterCell")
    public static native CAEmitterCell emitterCell();

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

    /**
     * alphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/alphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("alphaRange")
    public native float alphaRange();

    /**
     * alphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/alphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("alphaSpeed")
    public native float alphaSpeed();

    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    @Generated
    @Selector("beginTime")
    public native double beginTime();

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthRate")
    public native float birthRate();

    /**
     * blueRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/blueRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("blueRange")
    public native float blueRange();

    /**
     * blueSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/blueSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("blueSpeed")
    public native float blueSpeed();

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("color")
    public native CGColorRef color();

    /**
     * contents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/contents">iOS Dev Center</a>
     */
    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    /**
     * contentsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/contentsRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsRect")
    @ByValue
    public native CGRect contentsRect();

    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * emissionLatitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionLatitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionLatitude")
    @NFloat
    public native double emissionLatitude();

    /**
     * emissionLongitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionLongitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionLongitude")
    @NFloat
    public native double emissionLongitude();

    /**
     * emissionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionRange")
    @NFloat
    public native double emissionRange();

    /**
     * emitterCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emitterCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterCells")
    public native NSArray<? extends CAEmitterCell> emitterCells();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("fillMode")
    public native String fillMode();

    /**
     * greenRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/greenRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("greenRange")
    public native float greenRange();

    /**
     * greenSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/greenSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("greenSpeed")
    public native float greenSpeed();

    @Generated
    @Selector("init")
    public native CAEmitterCell init();

    @Generated
    @Selector("initWithCoder:")
    public native CAEmitterCell initWithCoder(NSCoder aDecoder);

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * lifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/lifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("lifetime")
    public native float lifetime();

    /**
     * lifetimeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/lifetimeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("lifetimeRange")
    public native float lifetimeRange();

    /**
     * magnificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/magnificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("magnificationFilter")
    public native String magnificationFilter();

    /**
     * minificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/minificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("minificationFilter")
    public native String minificationFilter();

    /**
     * minificationFilterBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/minificationFilterBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("minificationFilterBias")
    public native float minificationFilterBias();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * redRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/redRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("redRange")
    public native float redRange();

    /**
     * redSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/redSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("redSpeed")
    public native float redSpeed();

    @Generated
    @Selector("repeatCount")
    public native float repeatCount();

    @Generated
    @Selector("repeatDuration")
    public native double repeatDuration();

    /**
     * scale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scale">iOS Dev Center</a>
     */
    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    /**
     * scaleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scaleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleRange")
    @NFloat
    public native double scaleRange();

    /**
     * scaleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scaleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("scaleSpeed")
    @NFloat
    public native double scaleSpeed();

    /**
     * alphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/alphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlphaRange:")
    public native void setAlphaRange(float value);

    /**
     * alphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/alphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlphaSpeed:")
    public native void setAlphaSpeed(float value);

    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    @Generated
    @Selector("setBeginTime:")
    public native void setBeginTime(double value);

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(float value);

    /**
     * blueRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/blueRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlueRange:")
    public native void setBlueRange(float value);

    /**
     * blueSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/blueSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlueSpeed:")
    public native void setBlueSpeed(float value);

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(CGColorRef value);

    /**
     * contents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/contents">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * contentsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/contentsRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentsRect:")
    public native void setContentsRect(@ByValue CGRect value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * emissionLatitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionLatitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionLatitude:")
    public native void setEmissionLatitude(@NFloat double value);

    /**
     * emissionLongitude</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionLongitude">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionLongitude:")
    public native void setEmissionLongitude(@NFloat double value);

    /**
     * emissionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emissionRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionRange:")
    public native void setEmissionRange(@NFloat double value);

    /**
     * emitterCells</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/emitterCells">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterCells:")
    public native void setEmitterCells(NSArray<? extends CAEmitterCell> value);

    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(String value);

    /**
     * greenRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/greenRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGreenRange:")
    public native void setGreenRange(float value);

    /**
     * greenSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/greenSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGreenSpeed:")
    public native void setGreenSpeed(float value);

    /**
     * lifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/lifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLifetime:")
    public native void setLifetime(float value);

    /**
     * lifetimeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/lifetimeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLifetimeRange:")
    public native void setLifetimeRange(float value);

    /**
     * magnificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/magnificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(String value);

    /**
     * minificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/minificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(String value);

    /**
     * minificationFilterBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/minificationFilterBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * redRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/redRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRedRange:")
    public native void setRedRange(float value);

    /**
     * redSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/redSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRedSpeed:")
    public native void setRedSpeed(float value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    public native void setRepeatDuration(double value);

    /**
     * scale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double value);

    /**
     * scaleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scaleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScaleRange:")
    public native void setScaleRange(@NFloat double value);

    /**
     * scaleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/scaleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScaleSpeed:")
    public native void setScaleSpeed(@NFloat double value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(float value);

    /**
     * spin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/spin">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpin:")
    public native void setSpin(@NFloat double value);

    /**
     * spinRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/spinRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpinRange:")
    public native void setSpinRange(@NFloat double value);

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(NSDictionary<?, ?> value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    /**
     * velocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/velocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@NFloat double value);

    /**
     * velocityRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/velocityRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVelocityRange:")
    public native void setVelocityRange(@NFloat double value);

    /**
     * xAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/xAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setXAcceleration:")
    public native void setXAcceleration(@NFloat double value);

    /**
     * yAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/yAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setYAcceleration:")
    public native void setYAcceleration(@NFloat double value);

    /**
     * zAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/zAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZAcceleration:")
    public native void setZAcceleration(@NFloat double value);

    /**
     * shouldArchiveValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instm/CAEmitterCell/shouldArchiveValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey(String key);

    @Generated
    @Selector("speed")
    public native float speed();

    /**
     * spin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/spin">iOS Dev Center</a>
     */
    @Generated
    @Selector("spin")
    @NFloat
    public native double spin();

    /**
     * spinRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/spinRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("spinRange")
    @NFloat
    public native double spinRange();

    /**
     * style</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/style">iOS Dev Center</a>
     */
    @Generated
    @Selector("style")
    public native NSDictionary<?, ?> style();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    /**
     * velocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/velocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("velocity")
    @NFloat
    public native double velocity();

    /**
     * velocityRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/velocityRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("velocityRange")
    @NFloat
    public native double velocityRange();

    /**
     * xAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/xAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("xAcceleration")
    @NFloat
    public native double xAcceleration();

    /**
     * yAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/yAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("yAcceleration")
    @NFloat
    public native double yAcceleration();

    /**
     * zAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAEmitterCell_class/index.html#//apple_ref/occ/instp/CAEmitterCell/zAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("zAcceleration")
    @NFloat
    public native double zAcceleration();

    @Generated
    @Selector("contentsScale")
    @NFloat
    public native double contentsScale();

    @Generated
    @Selector("setContentsScale:")
    public native void setContentsScale(@NFloat double value);
}
