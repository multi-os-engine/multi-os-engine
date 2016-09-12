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

package ios.scenekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNBox extends SCNGeometry {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNBox(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNBox alloc();

	/**
	 * boxWithWidth:height:length:chamferRadius:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/clm/SCNBox/boxWithWidth:height:length:chamferRadius:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("boxWithWidth:height:length:chamferRadius:")
	public static native SCNBox boxWithWidthHeightLengthChamferRadius(
			@NFloat double width, @NFloat double height, @NFloat double length,
			@NFloat double chamferRadius);

	/**
	 * chamferRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/chamferRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chamferRadius")
	@NFloat
	public native double chamferRadius();

	/**
	 * chamferSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/chamferSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chamferSegmentCount")
	@NInt
	public native long chamferSegmentCount();

	@Generated
	@Selector("geometry")
	public static native SCNBox geometry();

	@Generated
	@Selector("geometryWithSources:elements:")
	public static native SCNBox geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
			NSArray<? extends SCNGeometryElement> elements);

	/**
	 * height</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/height">iOS Dev Center</a>
	 */
	@Generated
	@Selector("height")
	@NFloat
	public native double height();

	/**
	 * heightSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/heightSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("heightSegmentCount")
	@NInt
	public native long heightSegmentCount();

	@Generated
	@Selector("init")
	public native SCNBox init();

	/**
	 * length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/length">iOS Dev Center</a>
	 */
	@Generated
	@Selector("length")
	@NFloat
	public native double length();

	/**
	 * lengthSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/lengthSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lengthSegmentCount")
	@NInt
	public native long lengthSegmentCount();

	/**
	 * chamferRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/chamferRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setChamferRadius:")
	public native void setChamferRadius(@NFloat double value);

	/**
	 * chamferSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/chamferSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setChamferSegmentCount:")
	public native void setChamferSegmentCount(@NInt long value);

	/**
	 * height</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/height">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeight:")
	public native void setHeight(@NFloat double value);

	/**
	 * heightSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/heightSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeightSegmentCount:")
	public native void setHeightSegmentCount(@NInt long value);

	/**
	 * length</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/length">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLength:")
	public native void setLength(@NFloat double value);

	/**
	 * lengthSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/lengthSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLengthSegmentCount:")
	public native void setLengthSegmentCount(@NInt long value);

	/**
	 * width</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/width">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWidth:")
	public native void setWidth(@NFloat double value);

	/**
	 * widthSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/widthSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWidthSegmentCount:")
	public native void setWidthSegmentCount(@NInt long value);

	/**
	 * width</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/width">iOS Dev Center</a>
	 */
	@Generated
	@Selector("width")
	@NFloat
	public native double width();

	/**
	 * widthSegmentCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBox_Class/index.html#//apple_ref/occ/instp/SCNBox/widthSegmentCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("widthSegmentCount")
	@NInt
	public native long widthSegmentCount();

	@Generated
	@Selector("geometryWithMDLMesh:")
	public static native SCNBox geometryWithMDLMesh(MDLMesh mdlMesh);

	@Generated
	@Selector("initWithCoder:")
	public native SCNBox initWithCoder(NSCoder aDecoder);

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
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
