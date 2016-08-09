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

package ios.glkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.glkit.protocol.GLKNamedEffect;
import ios.glkit.struct.GLKVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKBaseEffect extends NSObject implements GLKNamedEffect {
	static {
		NatJ.register();
	}

	@Generated
	protected GLKBaseEffect(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GLKBaseEffect alloc();

	/**
	 * colorMaterialEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/colorMaterialEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorMaterialEnabled")
	public native byte colorMaterialEnabled();

	/**
	 * constantColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/constantColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constantColor")
	@ByValue
	public native GLKVector4 constantColor();

	/**
	 * fog</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/fog">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fog")
	public native GLKEffectPropertyFog fog();

	@Generated
	@Selector("init")
	public native GLKBaseEffect init();

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("label")
	public native String label();

	/**
	 * light0</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/light0">iOS Dev Center</a>
	 */
	@Generated
	@Selector("light0")
	public native GLKEffectPropertyLight light0();

	/**
	 * light1</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/light1">iOS Dev Center</a>
	 */
	@Generated
	@Selector("light1")
	public native GLKEffectPropertyLight light1();

	/**
	 * light2</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/light2">iOS Dev Center</a>
	 */
	@Generated
	@Selector("light2")
	public native GLKEffectPropertyLight light2();

	/**
	 * lightModelAmbientColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightModelAmbientColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightModelAmbientColor")
	@ByValue
	public native GLKVector4 lightModelAmbientColor();

	/**
	 * lightModelTwoSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightModelTwoSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightModelTwoSided")
	public native byte lightModelTwoSided();

	/**
	 * lightingType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightingType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightingType")
	public native int lightingType();

	/**
	 * material</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/material">iOS Dev Center</a>
	 */
	@Generated
	@Selector("material")
	public native GLKEffectPropertyMaterial material();

	@Generated
	@Selector("prepareToDraw")
	public native void prepareToDraw();

	/**
	 * colorMaterialEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/colorMaterialEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setColorMaterialEnabled:")
	public native void setColorMaterialEnabled(byte value);

	/**
	 * constantColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/constantColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setConstantColor:")
	public native void setConstantColor(@ByValue GLKVector4 value);

	/**
	 * label</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/label">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLabel:")
	public native void setLabel(String value);

	/**
	 * lightModelAmbientColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightModelAmbientColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLightModelAmbientColor:")
	public native void setLightModelAmbientColor(@ByValue GLKVector4 value);

	/**
	 * lightModelTwoSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightModelTwoSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLightModelTwoSided:")
	public native void setLightModelTwoSided(byte value);

	/**
	 * lightingType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/lightingType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLightingType:")
	public native void setLightingType(int value);

	/**
	 * textureOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/textureOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextureOrder:")
	public native void setTextureOrder(NSArray<? extends GLKEffectPropertyTexture> value);

	/**
	 * useConstantColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/useConstantColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUseConstantColor:")
	public native void setUseConstantColor(byte value);

	/**
	 * texture2d0</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/texture2d0">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texture2d0")
	public native GLKEffectPropertyTexture texture2d0();

	/**
	 * texture2d1</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/texture2d1">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texture2d1")
	public native GLKEffectPropertyTexture texture2d1();

	/**
	 * textureOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/textureOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureOrder")
	public native NSArray<? extends GLKEffectPropertyTexture> textureOrder();

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transform")
	public native GLKEffectPropertyTransform transform();

	/**
	 * useConstantColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKBaseEffect_ClassRef/index.html#//apple_ref/occ/instp/GLKBaseEffect/useConstantColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("useConstantColor")
	public native byte useConstantColor();

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
