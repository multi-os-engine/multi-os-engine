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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.modelio.protocol.MDLMeshBuffer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
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
public class MDLSubmeshTopology extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLSubmeshTopology(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLSubmeshTopology alloc();

	/**
	 * edgeCreaseCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreaseCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeCreaseCount")
	@NUInt
	public native long edgeCreaseCount();

	/**
	 * edgeCreaseIndices</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreaseIndices">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeCreaseIndices")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer edgeCreaseIndices();

	/**
	 * edgeCreases</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreases">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeCreases")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer edgeCreases();

	/**
	 * faceCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/faceCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("faceCount")
	@NUInt
	public native long faceCount();

	/**
	 * faceTopology</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/faceTopology">iOS Dev Center</a>
	 */
	@Generated
	@Selector("faceTopology")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer faceTopology();

	/**
	 * holeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/holeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("holeCount")
	@NUInt
	public native long holeCount();

	/**
	 * holes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/holes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("holes")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer holes();

	@Generated
	@Selector("init")
	public native MDLSubmeshTopology init();

	/**
	 * edgeCreaseCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreaseCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeCreaseCount:")
	public native void setEdgeCreaseCount(@NUInt long value);

	/**
	 * edgeCreaseIndices</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreaseIndices">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeCreaseIndices:")
	public native void setEdgeCreaseIndices(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * edgeCreases</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/edgeCreases">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeCreases:")
	public native void setEdgeCreases(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * faceCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/faceCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFaceCount:")
	public native void setFaceCount(@NUInt long value);

	/**
	 * faceTopology</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/faceTopology">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFaceTopology:")
	public native void setFaceTopology(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * holeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/holeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHoleCount:")
	public native void setHoleCount(@NUInt long value);

	/**
	 * holes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/holes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHoles:")
	public native void setHoles(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * vertexCreaseCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreaseCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexCreaseCount:")
	public native void setVertexCreaseCount(@NUInt long value);

	/**
	 * vertexCreaseIndices</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreaseIndices">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexCreaseIndices:")
	public native void setVertexCreaseIndices(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * vertexCreases</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreases">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexCreases:")
	public native void setVertexCreases(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

	/**
	 * vertexCreaseCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreaseCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexCreaseCount")
	@NUInt
	public native long vertexCreaseCount();

	/**
	 * vertexCreaseIndices</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreaseIndices">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexCreaseIndices")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer vertexCreaseIndices();

	/**
	 * vertexCreases</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSubmeshTopology_Class/index.html#//apple_ref/occ/instp/MDLSubmeshTopology/vertexCreases">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vertexCreases")
	@MappedReturn(ObjCObjectMapper.class)
	public native MDLMeshBuffer vertexCreases();

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
