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

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.opaque.CGColorRef;
import ios.coregraphics.opaque.CGPathRef;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSNumber;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.quartzcore.protocol.CAAction;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAShapeLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected CAShapeLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAShapeLayer alloc();

	/**
	 * fillColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/fillColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fillColor")
	public native CGColorRef fillColor();

	/**
	 * fillRule</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/fillRule">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fillRule")
	public native String fillRule();

	@Generated
	@Selector("init")
	public native CAShapeLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native CAShapeLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	@Generated
	@Selector("layer")
	public static native CAShapeLayer layer();

	/**
	 * lineCap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineCap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineCap")
	public native String lineCap();

	/**
	 * lineDashPattern</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineDashPattern">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineDashPattern")
	public native NSArray<? extends NSNumber> lineDashPattern();

	/**
	 * lineDashPhase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineDashPhase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineDashPhase")
	@NFloat
	public native double lineDashPhase();

	/**
	 * lineJoin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineJoin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineJoin")
	public native String lineJoin();

	/**
	 * lineWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lineWidth")
	@NFloat
	public native double lineWidth();

	/**
	 * miterLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/miterLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("miterLimit")
	@NFloat
	public native double miterLimit();

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("path")
	public native CGPathRef path();

	/**
	 * fillColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/fillColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFillColor:")
	public native void setFillColor(CGColorRef value);

	/**
	 * fillRule</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/fillRule">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFillRule:")
	public native void setFillRule(String value);

	/**
	 * lineCap</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineCap">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineCap:")
	public native void setLineCap(String value);

	/**
	 * lineDashPattern</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineDashPattern">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineDashPattern:")
	public native void setLineDashPattern(NSArray<? extends NSNumber> value);

	/**
	 * lineDashPhase</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineDashPhase">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineDashPhase:")
	public native void setLineDashPhase(@NFloat double value);

	/**
	 * lineJoin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineJoin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineJoin:")
	public native void setLineJoin(String value);

	/**
	 * lineWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/lineWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLineWidth:")
	public native void setLineWidth(@NFloat double value);

	/**
	 * miterLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/miterLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMiterLimit:")
	public native void setMiterLimit(@NFloat double value);

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPath:")
	public native void setPath(CGPathRef value);

	/**
	 * strokeColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStrokeColor:")
	public native void setStrokeColor(CGColorRef value);

	/**
	 * strokeEnd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeEnd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStrokeEnd:")
	public native void setStrokeEnd(@NFloat double value);

	/**
	 * strokeStart</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeStart">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStrokeStart:")
	public native void setStrokeStart(@NFloat double value);

	/**
	 * strokeColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("strokeColor")
	public native CGColorRef strokeColor();

	/**
	 * strokeEnd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeEnd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("strokeEnd")
	@NFloat
	public native double strokeEnd();

	/**
	 * strokeStart</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAShapeLayer_class/index.html#//apple_ref/occ/instp/CAShapeLayer/strokeStart">iOS Dev Center</a>
	 */
	@Generated
	@Selector("strokeStart")
	@NFloat
	public native double strokeStart();

	@Generated
	@Selector("initWithCoder:")
	public native CAShapeLayer initWithCoder(NSCoder aDecoder);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
