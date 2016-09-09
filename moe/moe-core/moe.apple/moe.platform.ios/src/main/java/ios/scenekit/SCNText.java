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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.modelio.MDLMesh;
import ios.uikit.UIBezierPath;
import ios.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNText extends SCNGeometry {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNText(Pointer peer) {
		super(peer);
	}

	/**
	 * alignmentMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/alignmentMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alignmentMode")
	public native String alignmentMode();

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNText alloc();

	/**
	 * chamferProfile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/chamferProfile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chamferProfile")
	public native UIBezierPath chamferProfile();

	/**
	 * chamferRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/chamferRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chamferRadius")
	@NFloat
	public native double chamferRadius();

	/**
	 * containerFrame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/containerFrame">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerFrame")
	@ByValue
	public native CGRect containerFrame();

	/**
	 * extrusionDepth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/extrusionDepth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extrusionDepth")
	@NFloat
	public native double extrusionDepth();

	/**
	 * flatness</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/flatness">iOS Dev Center</a>
	 */
	@Generated
	@Selector("flatness")
	@NFloat
	public native double flatness();

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("font")
	public native UIFont font();

	@Generated
	@Selector("geometry")
	public static native SCNText geometry();

	@Generated
	@Selector("geometryWithSources:elements:")
	public static native SCNText geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
			NSArray<? extends SCNGeometryElement> elements);

	@Generated
	@Selector("init")
	public native SCNText init();

	/**
	 * wrapped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/wrapped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isWrapped")
	public native boolean isWrapped();

	/**
	 * alignmentMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/alignmentMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlignmentMode:")
	public native void setAlignmentMode(String value);

	/**
	 * chamferProfile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/chamferProfile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setChamferProfile:")
	public native void setChamferProfile(UIBezierPath value);

	/**
	 * chamferRadius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/chamferRadius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setChamferRadius:")
	public native void setChamferRadius(@NFloat double value);

	/**
	 * containerFrame</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/containerFrame">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainerFrame:")
	public native void setContainerFrame(@ByValue CGRect value);

	/**
	 * extrusionDepth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/extrusionDepth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExtrusionDepth:")
	public native void setExtrusionDepth(@NFloat double value);

	/**
	 * flatness</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/flatness">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFlatness:")
	public native void setFlatness(@NFloat double value);

	/**
	 * font</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/font">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFont:")
	public native void setFont(UIFont value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setString:")
	public native void setString(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * truncationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/truncationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTruncationMode:")
	public native void setTruncationMode(String value);

	/**
	 * wrapped</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/wrapped">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWrapped:")
	public native void setWrapped(boolean value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("string")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object string();

	/**
	 * textWithString:extrusionDepth:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/clm/SCNText/textWithString:extrusionDepth:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textWithString:extrusionDepth:")
	public static native SCNText textWithStringExtrusionDepth(
			@Mapped(ObjCObjectMapper.class) Object string,
			@NFloat double extrusionDepth);

	/**
	 * truncationMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNText_Class/index.html#//apple_ref/occ/instp/SCNText/truncationMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("truncationMode")
	public native String truncationMode();

	@Generated
	@Selector("geometryWithMDLMesh:")
	public static native SCNText geometryWithMDLMesh(MDLMesh mdlMesh);

	@Generated
	@Selector("initWithCoder:")
	public native SCNText initWithCoder(NSCoder aDecoder);

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
