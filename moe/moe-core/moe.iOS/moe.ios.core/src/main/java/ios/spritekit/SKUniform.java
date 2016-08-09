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

package ios.spritekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.glkit.struct.GLKMatrix2;
import ios.glkit.struct.GLKMatrix3;
import ios.glkit.struct.GLKMatrix4;
import ios.glkit.struct.GLKVector2;
import ios.glkit.struct.GLKVector3;
import ios.glkit.struct.GLKVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKUniform extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected SKUniform(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKUniform alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * floatMatrix2Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix2Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatMatrix2Value")
	@ByValue
	public native GLKMatrix2 floatMatrix2Value();

	/**
	 * floatMatrix3Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix3Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatMatrix3Value")
	@ByValue
	public native GLKMatrix3 floatMatrix3Value();

	/**
	 * floatMatrix4Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix4Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatMatrix4Value")
	@ByValue
	public native GLKMatrix4 floatMatrix4Value();

	/**
	 * floatValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatValue")
	public native float floatValue();

	/**
	 * floatVector2Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector2Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatVector2Value")
	@ByValue
	public native GLKVector2 floatVector2Value();

	/**
	 * floatVector3Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector3Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatVector3Value")
	@ByValue
	public native GLKVector3 floatVector3Value();

	/**
	 * floatVector4Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector4Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floatVector4Value")
	@ByValue
	public native GLKVector4 floatVector4Value();

	@Generated
	@Selector("init")
	public native SKUniform init();

	@Generated
	@Selector("initWithCoder:")
	public native SKUniform initWithCoder(NSCoder aDecoder);

	/**
	 * initWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:")
	public native SKUniform initWithName(String name);

	/**
	 * initWithName:float:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:float:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:float:")
	public native SKUniform initWithNameFloat(String name, float value);

	/**
	 * initWithName:floatMatrix2:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatMatrix2:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatMatrix2:")
	public native SKUniform initWithNameFloatMatrix2(String name,
			@ByValue GLKMatrix2 value);

	/**
	 * initWithName:floatMatrix3:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatMatrix3:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatMatrix3:")
	public native SKUniform initWithNameFloatMatrix3(String name,
			@ByValue GLKMatrix3 value);

	/**
	 * initWithName:floatMatrix4:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatMatrix4:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatMatrix4:")
	public native SKUniform initWithNameFloatMatrix4(String name,
			@ByValue GLKMatrix4 value);

	/**
	 * initWithName:floatVector2:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatVector2:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatVector2:")
	public native SKUniform initWithNameFloatVector2(String name,
			@ByValue GLKVector2 value);

	/**
	 * initWithName:floatVector3:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatVector3:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatVector3:")
	public native SKUniform initWithNameFloatVector3(String name,
			@ByValue GLKVector3 value);

	/**
	 * initWithName:floatVector4:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:floatVector4:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:floatVector4:")
	public native SKUniform initWithNameFloatVector4(String name,
			@ByValue GLKVector4 value);

	/**
	 * initWithName:texture:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instm/SKUniform/initWithName:texture:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithName:texture:")
	public native SKUniform initWithNameTexture(String name, SKTexture texture);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * floatMatrix2Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix2Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatMatrix2Value:")
	public native void setFloatMatrix2Value(@ByValue GLKMatrix2 value);

	/**
	 * floatMatrix3Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix3Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatMatrix3Value:")
	public native void setFloatMatrix3Value(@ByValue GLKMatrix3 value);

	/**
	 * floatMatrix4Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatMatrix4Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatMatrix4Value:")
	public native void setFloatMatrix4Value(@ByValue GLKMatrix4 value);

	/**
	 * floatValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatValue:")
	public native void setFloatValue(float value);

	/**
	 * floatVector2Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector2Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatVector2Value:")
	public native void setFloatVector2Value(@ByValue GLKVector2 value);

	/**
	 * floatVector3Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector3Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatVector3Value:")
	public native void setFloatVector3Value(@ByValue GLKVector3 value);

	/**
	 * floatVector4Value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/floatVector4Value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFloatVector4Value:")
	public native void setFloatVector4Value(@ByValue GLKVector4 value);

	/**
	 * textureValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/textureValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextureValue:")
	public native void setTextureValue(SKTexture value);

	/**
	 * textureValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/textureValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureValue")
	public native SKTexture textureValue();

	/**
	 * uniformType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/instp/SKUniform/uniformType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformType")
	@NInt
	public native long uniformType();

	/**
	 * uniformWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:")
	public static native SKUniform uniformWithName(String name);

	/**
	 * uniformWithName:float:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:float:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:float:")
	public static native SKUniform uniformWithNameFloat(String name, float value);

	/**
	 * uniformWithName:floatMatrix2:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatMatrix2:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatMatrix2:")
	public static native SKUniform uniformWithNameFloatMatrix2(String name,
			@ByValue GLKMatrix2 value);

	/**
	 * uniformWithName:floatMatrix3:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatMatrix3:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatMatrix3:")
	public static native SKUniform uniformWithNameFloatMatrix3(String name,
			@ByValue GLKMatrix3 value);

	/**
	 * uniformWithName:floatMatrix4:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatMatrix4:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatMatrix4:")
	public static native SKUniform uniformWithNameFloatMatrix4(String name,
			@ByValue GLKMatrix4 value);

	/**
	 * uniformWithName:floatVector2:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatVector2:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatVector2:")
	public static native SKUniform uniformWithNameFloatVector2(String name,
			@ByValue GLKVector2 value);

	/**
	 * uniformWithName:floatVector3:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatVector3:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatVector3:")
	public static native SKUniform uniformWithNameFloatVector3(String name,
			@ByValue GLKVector3 value);

	/**
	 * uniformWithName:floatVector4:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:floatVector4:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:floatVector4:")
	public static native SKUniform uniformWithNameFloatVector4(String name,
			@ByValue GLKVector4 value);

	/**
	 * uniformWithName:texture:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKUniform_Ref/index.html#//apple_ref/occ/clm/SKUniform/uniformWithName:texture:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uniformWithName:texture:")
	public static native SKUniform uniformWithNameTexture(String name,
			SKTexture texture);

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
