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

package ios.modelio;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorRef;
import ios.foundation.NSURL;
import ios.modelio.protocol.MDLNamed;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLMaterialProperty extends NSObject implements MDLNamed {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLMaterialProperty(Pointer peer) {
		super(peer);
	}

	/**
	 * URLValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/URLValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLValue")
	public native NSURL URLValue();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLMaterialProperty alloc();

	/**
	 * color</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/color">iOS Dev Center</a>
	 */
	@Generated
	@Selector("color")
	public native CGColorRef color();

	/**
	 * floatValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/floatValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatValue")
	public native float floatValue();

	@Generated
	@Selector("init")
	public native MDLMaterialProperty init();

	/**
	 * initWithName:semantic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:")
	public native MDLMaterialProperty initWithNameSemantic(String name, @NUInt long semantic);

	/**
	 * initWithName:semantic:URL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:URL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:URL:")
	public native MDLMaterialProperty initWithNameSemanticURL(String name, @NUInt long semantic, NSURL URL);

	/**
	 * initWithName:semantic:color:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:color:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:color:")
	public native MDLMaterialProperty initWithNameSemanticColor(String name, @NUInt long semantic, CGColorRef color);

	/**
	 * initWithName:semantic:float:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:float:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:float:")
	public native MDLMaterialProperty initWithNameSemanticFloat(String name, @NUInt long semantic, float value);

	/**
	 * initWithName:semantic:string:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:string:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:string:")
	public native MDLMaterialProperty initWithNameSemanticString(String name, @NUInt long semantic, String string);

	/**
	 * initWithName:semantic:textureSampler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/initWithName:semantic:textureSampler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:semantic:textureSampler:")
	public native MDLMaterialProperty initWithNameSemanticTextureSampler(String name, @NUInt long semantic,
			MDLTextureSampler textureSampler);

	@Generated
	@Selector("name")
	public native String name();

	/**
	 * semantic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/semantic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("semantic")
	@NUInt
	public native long semantic();

	/**
	 * color</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/color">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setColor:")
	public native void setColor(CGColorRef value);

	/**
	 * floatValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/floatValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatValue:")
	public native void setFloatValue(float value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * setProperties:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instm/MDLMaterialProperty/setProperties:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProperties:")
	public native void setProperties(MDLMaterialProperty property);

	/**
	 * semantic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/semantic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSemantic:")
	public native void setSemantic(@NUInt long value);

	/**
	 * stringValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/stringValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStringValue:")
	public native void setStringValue(String value);

	/**
	 * textureSamplerValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/textureSamplerValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextureSamplerValue:")
	public native void setTextureSamplerValue(MDLTextureSampler value);

	/**
	 * URLValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/URLValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURLValue:")
	public native void setURLValue(NSURL value);

	/**
	 * stringValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/stringValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringValue")
	public native String stringValue();

	/**
	 * textureSamplerValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/textureSamplerValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureSamplerValue")
	public native MDLTextureSampler textureSamplerValue();

	/**
	 * type</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterialProperty_Class/index.html#//apple_ref/occ/instp/MDLMaterialProperty/type">iOS Dev Center</a>
	 */
	@Generated
	@Selector("type")
	@NUInt
	public native long type();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
