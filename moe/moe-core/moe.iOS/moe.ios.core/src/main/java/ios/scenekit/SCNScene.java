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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.foundation.protocol.NSSecureCoding;
import ios.modelio.MDLAsset;
import ios.scenekit.struct.SCNMatrix4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNScene extends NSObject implements NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNScene(Pointer peer) {
		super(peer);
	}

	/**
	 * addParticleSystem:withTransform:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instm/SCNScene/addParticleSystem:withTransform:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addParticleSystem:withTransform:")
	public native void addParticleSystemWithTransform(SCNParticleSystem system,
			@ByValue SCNMatrix4 transform);

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNScene alloc();

	/**
	 * attributeForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instm/SCNScene/attributeForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attributeForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object attributeForKey(String key);

	/**
	 * background</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/background">iOS Dev Center</a>
	 */
	@Generated
	@Selector("background")
	public native SCNMaterialProperty background();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fogColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fogColor")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object fogColor();

	/**
	 * fogDensityExponent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogDensityExponent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fogDensityExponent")
	@NFloat
	public native double fogDensityExponent();

	/**
	 * fogEndDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogEndDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fogEndDistance")
	@NFloat
	public native double fogEndDistance();

	/**
	 * fogStartDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogStartDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fogStartDistance")
	@NFloat
	public native double fogStartDistance();

	@Generated
	@Selector("init")
	public native SCNScene init();

	@Generated
	@Selector("initWithCoder:")
	public native SCNScene initWithCoder(NSCoder aDecoder);

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPaused")
	public native boolean isPaused();

	/**
	 * particleSystems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/particleSystems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("particleSystems")
	public native NSArray<? extends SCNParticleSystem> particleSystems();

	/**
	 * physicsWorld</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/physicsWorld">iOS Dev Center</a>
	 */
	@Generated
	@Selector("physicsWorld")
	public native SCNPhysicsWorld physicsWorld();

	/**
	 * removeAllParticleSystems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instm/SCNScene/removeAllParticleSystems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllParticleSystems")
	public native void removeAllParticleSystems();

	/**
	 * removeParticleSystem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instm/SCNScene/removeParticleSystem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeParticleSystem:")
	public native void removeParticleSystem(SCNParticleSystem system);

	/**
	 * rootNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/rootNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rootNode")
	public native SCNNode rootNode();

	/**
	 * scene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/clm/SCNScene/scene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scene")
	public static native SCNScene scene();

	/**
	 * sceneNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/clm/SCNScene/sceneNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneNamed:")
	public static native SCNScene sceneNamed(String name);

	/**
	 * sceneNamed:inDirectory:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/clm/SCNScene/sceneNamed:inDirectory:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneNamed:inDirectory:options:")
	public static native SCNScene sceneNamedInDirectoryOptions(String name,
			String directory, NSDictionary<String, ?> options);

	/**
	 * sceneWithURL:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/clm/SCNScene/sceneWithURL:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneWithURL:options:error:")
	public static native SCNScene sceneWithURLOptionsError(NSURL url,
			NSDictionary<String, ?> options, Ptr<NSError> error);

	/**
	 * setAttribute:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instm/SCNScene/setAttribute:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAttribute:forKey:")
	public native void setAttributeForKey(
			@Mapped(ObjCObjectMapper.class) Object attribute, String key);

	/**
	 * fogColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFogColor:")
	public native void setFogColor(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * fogDensityExponent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogDensityExponent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFogDensityExponent:")
	public native void setFogDensityExponent(@NFloat double value);

	/**
	 * fogEndDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogEndDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFogEndDistance:")
	public native void setFogEndDistance(@NFloat double value);

	/**
	 * fogStartDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/fogStartDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFogStartDistance:")
	public native void setFogStartDistance(@NFloat double value);

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/instp/SCNScene/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPaused:")
	public native void setPaused(boolean value);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * sceneWithMDLAsset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNScene_Class/index.html#//apple_ref/occ/clm/SCNScene/sceneWithMDLAsset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneWithMDLAsset:")
	public static native SCNScene sceneWithMDLAsset(MDLAsset mdlAsset);

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
