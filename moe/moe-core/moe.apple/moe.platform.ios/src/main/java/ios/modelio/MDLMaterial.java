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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.protocol.NSFastEnumeration;
import ios.modelio.protocol.MDLNamed;
import ios.scenekit.SCNMaterial;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
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
public class MDLMaterial extends NSObject implements MDLNamed, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLMaterial(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLMaterial alloc();

	/**
	 * baseMaterial</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instp/MDLMaterial/baseMaterial">iOS Dev Center</a>
	 */
	@Generated
	@Selector("baseMaterial")
	public native MDLMaterial baseMaterial();

	/**
	 * count</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instp/MDLMaterial/count">iOS Dev Center</a>
	 */
	@Generated
	@Selector("count")
	@NUInt
	public native long count();

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	@NUInt
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

	@Generated
	@Selector("init")
	public native MDLMaterial init();

	/**
	 * initWithName:scatteringFunction:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/initWithName:scatteringFunction:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:scatteringFunction:")
	public native MDLMaterial initWithNameScatteringFunction(String name, MDLScatteringFunction scatteringFunction);

	/**
	 * materialWithSCNMaterial:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/clm/MDLMaterial/materialWithSCNMaterial:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("materialWithSCNMaterial:")
	public static native MDLMaterial materialWithSCNMaterial(SCNMaterial scnMaterial);

	@Generated
	@Selector("name")
	public native String name();

	/**
	 * objectAtIndexedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/objectAtIndexedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectAtIndexedSubscript:")
	public native MDLMaterialProperty objectAtIndexedSubscript(@NUInt long idx);

	/**
	 * objectForKeyedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/objectForKeyedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectForKeyedSubscript:")
	public native MDLMaterialProperty objectForKeyedSubscript(String name);

	/**
	 * propertyNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/propertyNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("propertyNamed:")
	public native MDLMaterialProperty propertyNamed(String name);

	/**
	 * propertyWithSemantic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/propertyWithSemantic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("propertyWithSemantic:")
	public native MDLMaterialProperty propertyWithSemantic(@NUInt long semantic);

	/**
	 * removeAllProperties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/removeAllProperties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllProperties")
	public native void removeAllProperties();

	/**
	 * removeProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/removeProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeProperty:")
	public native void removeProperty(MDLMaterialProperty property);

	/**
	 * scatteringFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instp/MDLMaterial/scatteringFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scatteringFunction")
	public native MDLScatteringFunction scatteringFunction();

	/**
	 * baseMaterial</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instp/MDLMaterial/baseMaterial">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBaseMaterial:")
	public native void setBaseMaterial(MDLMaterial value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * setProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMaterial_Class/index.html#//apple_ref/occ/instm/MDLMaterial/setProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProperty:")
	public native void setProperty(MDLMaterialProperty property);

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
