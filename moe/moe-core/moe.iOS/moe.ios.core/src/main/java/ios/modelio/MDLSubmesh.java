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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.modelio.protocol.MDLNamed;
import ios.scenekit.SCNGeometryElement;
import ios.modelio.protocol.MDLMeshBuffer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLSubmesh extends NSObject implements MDLNamed {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLSubmesh(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLSubmesh alloc();

	/**
	 * geometryType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/geometryType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryType")
	@NInt
	public native long geometryType();

	/**
	 * indexBuffer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/indexBuffer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexBuffer")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer indexBuffer();

	/**
	 * indexCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/indexCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexCount")
	@NUInt
	public native long indexCount();

	/**
	 * indexType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/indexType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indexType")
	@NUInt
	public native long indexType();

	@Generated
	@Selector("init")
	public native MDLSubmesh init();

	/**
	 * initWithIndexBuffer:indexCount:indexType:geometryType:material:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instm/MDLSubmesh/initWithIndexBuffer:indexCount:indexType:geometryType:material:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithIndexBuffer:indexCount:indexType:geometryType:material:")
	public native MDLSubmesh initWithIndexBufferIndexCountIndexTypeGeometryTypeMaterial(
			@Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
			@NInt long geometryType, MDLMaterial material);

	/**
	 * initWithMDLSubmesh:indexType:geometryType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instm/MDLSubmesh/initWithMDLSubmesh:indexType:geometryType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithMDLSubmesh:indexType:geometryType:")
	public native MDLSubmesh initWithMDLSubmeshIndexTypeGeometryType(MDLSubmesh submesh, @NUInt long indexType,
			@NInt long geometryType);

	/**
	 * initWithName:indexBuffer:indexCount:indexType:geometryType:material:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instm/MDLSubmesh/initWithName:indexBuffer:indexCount:indexType:geometryType:material:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:")
	public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterial(String name,
			@Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
			@NInt long geometryType, MDLMaterial material);

	/**
	 * initWithName:indexBuffer:indexCount:indexType:geometryType:material:topology:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instm/MDLSubmesh/initWithName:indexBuffer:indexCount:indexType:geometryType:material:topology:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:topology:")
	public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterialTopology(String name,
			@Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
			@NInt long geometryType, MDLMaterial material, MDLSubmeshTopology topology);

	/**
	 * material</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/material">iOS Dev Center</a>
	 */
	@Generated
	@Selector("material")
	public native MDLMaterial material();

	@Generated
	@Selector("name")
	public native String name();

	/**
	 * material</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/material">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaterial:")
	public native void setMaterial(MDLMaterial value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * submeshWithSCNGeometryElement:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/clm/MDLSubmesh/submeshWithSCNGeometryElement:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("submeshWithSCNGeometryElement:")
	public static native MDLSubmesh submeshWithSCNGeometryElement(SCNGeometryElement scnGeometryElement);

	/**
	 * topology</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmesh_Class/index.html#//apple_ref/occ/instp/MDLSubmesh/topology">iOS Dev Center</a>
	 */
	@Generated
	@Selector("topology")
	public native MDLSubmeshTopology topology();

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
	@Selector("version")
	@NInt
	public static native long version_static();
}
