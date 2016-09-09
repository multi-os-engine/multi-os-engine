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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.modelio.MDLMesh;
import ios.quartzcore.CAAnimation;
import ios.scenekit.protocol.SCNAnimatable;
import ios.scenekit.protocol.SCNBoundingVolume;
import ios.scenekit.protocol.SCNShadable;
import ios.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNGeometry extends NSObject implements SCNAnimatable,
		SCNBoundingVolume, SCNShadable, NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNGeometry(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addAnimation:forKey:")
	public native void addAnimationForKey(CAAnimation animation, String key);

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNGeometry alloc();

	@Generated
	@Selector("animationForKey:")
	public native CAAnimation animationForKey(String key);

	@Generated
	@Selector("animationKeys")
	public native NSArray<String> animationKeys();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * edgeCreasesElement</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/edgeCreasesElement">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeCreasesElement")
	public native SCNGeometryElement edgeCreasesElement();

	/**
	 * edgeCreasesSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/edgeCreasesSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgeCreasesSource")
	public native SCNGeometrySource edgeCreasesSource();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * firstMaterial</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/firstMaterial">iOS Dev Center</a>
	 */
	@Generated
	@Selector("firstMaterial")
	public native SCNMaterial firstMaterial();

	/**
	 * geometry</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/clm/SCNGeometry/geometry">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometry")
	public static native SCNGeometry geometry();

	/**
	 * geometryElementAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/geometryElementAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryElementAtIndex:")
	public native SCNGeometryElement geometryElementAtIndex(
			@NInt long elementIndex);

	/**
	 * geometryElementCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/geometryElementCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryElementCount")
	@NInt
	public native long geometryElementCount();

	/**
	 * geometrySourcesForSemantic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/geometrySourcesForSemantic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometrySourcesForSemantic:")
	public native NSArray<? extends SCNGeometrySource> geometrySourcesForSemantic(String semantic);

	/**
	 * geometryWithSources:elements:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/clm/SCNGeometry/geometryWithSources:elements:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryWithSources:elements:")
	public static native SCNGeometry geometryWithSourcesElements(
			NSArray<? extends SCNGeometrySource> sources, NSArray<? extends SCNGeometryElement> elements);

	@Generated
	@Selector("getBoundingBoxMin:max:")
	public native boolean getBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);

	@Generated
	@Selector("getBoundingSphereCenter:radius:")
	public native boolean getBoundingSphereCenterRadius(
			SCNVector3 center,
			NFloatPtr radius);

	@Generated
	@IsOptional
	@Selector("handleBindingOfSymbol:usingBlock:")
	public native void handleBindingOfSymbolUsingBlock(
			String symbol,
			@ObjCBlock(name = "call_handleBindingOfSymbolUsingBlock") SCNShadable.Block_handleBindingOfSymbolUsingBlock block);

	@Generated
	@IsOptional
	@Selector("handleUnbindingOfSymbol:usingBlock:")
	public native void handleUnbindingOfSymbolUsingBlock(
			String symbol,
			@ObjCBlock(name = "call_handleUnbindingOfSymbolUsingBlock") SCNShadable.Block_handleUnbindingOfSymbolUsingBlock block);

	@Generated
	@Selector("init")
	public native SCNGeometry init();

	@Generated
	@Selector("initWithCoder:")
	public native SCNGeometry initWithCoder(NSCoder aDecoder);

	/**
	 * insertMaterial:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/insertMaterial:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertMaterial:atIndex:")
	public native void insertMaterialAtIndex(SCNMaterial material,
			@NUInt long index);

	@Generated
	@Selector("isAnimationForKeyPaused:")
	public native boolean isAnimationForKeyPaused(String key);

	/**
	 * levelsOfDetail</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/levelsOfDetail">iOS Dev Center</a>
	 */
	@Generated
	@Selector("levelsOfDetail")
	public native NSArray<? extends SCNLevelOfDetail> levelsOfDetail();

	/**
	 * materialWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/materialWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("materialWithName:")
	public native SCNMaterial materialWithName(String name);

	/**
	 * materials</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/materials">iOS Dev Center</a>
	 */
	@Generated
	@Selector("materials")
	public native NSArray<? extends SCNMaterial> materials();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("pauseAnimationForKey:")
	public native void pauseAnimationForKey(String key);

	@Generated
	@IsOptional
	@Selector("program")
	public native SCNProgram program();

	@Generated
	@Selector("removeAllAnimations")
	public native void removeAllAnimations();

	@Generated
	@Selector("removeAnimationForKey:")
	public native void removeAnimationForKey(String key);

	@Generated
	@Selector("removeAnimationForKey:fadeOutDuration:")
	public native void removeAnimationForKeyFadeOutDuration(String key,
			@NFloat double duration);

	/**
	 * removeMaterialAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/removeMaterialAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeMaterialAtIndex:")
	public native void removeMaterialAtIndex(@NUInt long index);

	/**
	 * replaceMaterialAtIndex:withMaterial:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instm/SCNGeometry/replaceMaterialAtIndex:withMaterial:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceMaterialAtIndex:withMaterial:")
	public native void replaceMaterialAtIndexWithMaterial(@NUInt long index,
			SCNMaterial material);

	@Generated
	@Selector("resumeAnimationForKey:")
	public native void resumeAnimationForKey(String key);

	@Generated
	@Selector("setBoundingBoxMin:max:")
	public native void setBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);

	/**
	 * edgeCreasesElement</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/edgeCreasesElement">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeCreasesElement:")
	public native void setEdgeCreasesElement(SCNGeometryElement value);

	/**
	 * edgeCreasesSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/edgeCreasesSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgeCreasesSource:")
	public native void setEdgeCreasesSource(SCNGeometrySource value);

	/**
	 * firstMaterial</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/firstMaterial">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFirstMaterial:")
	public native void setFirstMaterial(SCNMaterial value);

	/**
	 * levelsOfDetail</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/levelsOfDetail">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLevelsOfDetail:")
	public native void setLevelsOfDetail(NSArray<? extends SCNLevelOfDetail> value);

	/**
	 * materials</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/materials">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaterials:")
	public native void setMaterials(NSArray<? extends SCNMaterial> value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	@Generated
	@IsOptional
	@Selector("setProgram:")
	public native void setProgram(SCNProgram value);

	@Generated
	@IsOptional
	@Selector("setShaderModifiers:")
	public native void setShaderModifiers(NSDictionary<String, String> value);

	/**
	 * subdivisionLevel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/subdivisionLevel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSubdivisionLevel:")
	public native void setSubdivisionLevel(@NUInt long value);

	@Generated
	@IsOptional
	@Selector("shaderModifiers")
	public native NSDictionary<String, String> shaderModifiers();

	/**
	 * subdivisionLevel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/subdivisionLevel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subdivisionLevel")
	@NUInt
	public native long subdivisionLevel();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * geometryElements</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/geometryElements">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryElements")
	public native NSArray<? extends SCNGeometryElement> geometryElements();

	/**
	 * geometrySources</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/instp/SCNGeometry/geometrySources">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometrySources")
	public native NSArray<? extends SCNGeometrySource> geometrySources();

	/**
	 * geometryWithMDLMesh:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometry_Class/index.html#//apple_ref/occ/clm/SCNGeometry/geometryWithMDLMesh:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometryWithMDLMesh:")
	public static native SCNGeometry geometryWithMDLMesh(MDLMesh mdlMesh);

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
