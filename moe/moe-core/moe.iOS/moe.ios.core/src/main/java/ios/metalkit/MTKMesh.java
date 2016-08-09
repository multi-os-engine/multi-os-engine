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

package ios.metalkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.modelio.MDLAsset;
import ios.modelio.MDLMesh;
import ios.modelio.MDLVertexDescriptor;
import ios.metal.protocol.MTLDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKMesh extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MTKMesh(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MTKMesh alloc();

	@Generated
	@Selector("init")
	public native MTKMesh init();

	/**
	 * initWithMesh:device:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instm/MTKMesh/initWithMesh:device:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithMesh:device:error:")
	public native MTKMesh initWithMeshDeviceError(MDLMesh mesh, @Mapped(ObjCObjectMapper.class) MTLDevice device,
			Ptr<NSError> error);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * newMeshesFromAsset:device:sourceMeshes:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/clm/MTKMesh/newMeshesFromAsset:device:sourceMeshes:error:">iOS Dev Center</a>
	 */
	@Generated
	@Owned
	@Selector("newMeshesFromAsset:device:sourceMeshes:error:")
	public static native NSArray<? extends MTKMesh> newMeshesFromAssetDeviceSourceMeshesError(MDLAsset asset,
			@Mapped(ObjCObjectMapper.class) MTLDevice device, Ptr<NSArray<? extends MDLMesh>> sourceMeshes, Ptr<NSError> error);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * submeshes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/submeshes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("submeshes")
	public native NSArray<? extends MTKSubmesh> submeshes();

	/**
	 * vertexBuffers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/vertexBuffers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexBuffers")
	public native NSArray<? extends MTKMeshBuffer> vertexBuffers();

	/**
	 * vertexCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/vertexCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexCount")
	@NUInt
	public native long vertexCount();

	/**
	 * vertexDescriptor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MetalKit/Reference/MTKMesh_ClassReference/index.html#//apple_ref/occ/instp/MTKMesh/vertexDescriptor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexDescriptor")
	public native MDLVertexDescriptor vertexDescriptor();

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
