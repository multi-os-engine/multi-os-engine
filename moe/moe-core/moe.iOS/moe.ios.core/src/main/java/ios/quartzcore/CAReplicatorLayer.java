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

package ios.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.opaque.CGColorRef;
import ios.foundation.NSCoder;
import ios.quartzcore.struct.CATransform3D;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.quartzcore.protocol.CAAction;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAReplicatorLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected CAReplicatorLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAReplicatorLayer alloc();

	@Generated
	@Selector("init")
	public native CAReplicatorLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native CAReplicatorLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	/**
	 * instanceAlphaOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceAlphaOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceAlphaOffset")
	public native float instanceAlphaOffset();

	/**
	 * instanceBlueOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceBlueOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceBlueOffset")
	public native float instanceBlueOffset();

	/**
	 * instanceColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceColor")
	public native CGColorRef instanceColor();

	/**
	 * instanceCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceCount")
	@NInt
	public native long instanceCount();

	/**
	 * instanceDelay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceDelay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceDelay")
	public native double instanceDelay();

	/**
	 * instanceGreenOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceGreenOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceGreenOffset")
	public native float instanceGreenOffset();

	/**
	 * instanceRedOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceRedOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceRedOffset")
	public native float instanceRedOffset();

	/**
	 * instanceTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instanceTransform")
	@ByValue
	public native CATransform3D instanceTransform();

	@Generated
	@Selector("layer")
	public static native CAReplicatorLayer layer();

	/**
	 * preservesDepth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/preservesDepth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preservesDepth")
	public native boolean preservesDepth();

	/**
	 * instanceAlphaOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceAlphaOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceAlphaOffset:")
	public native void setInstanceAlphaOffset(float value);

	/**
	 * instanceBlueOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceBlueOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceBlueOffset:")
	public native void setInstanceBlueOffset(float value);

	/**
	 * instanceColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceColor:")
	public native void setInstanceColor(CGColorRef value);

	/**
	 * instanceCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceCount:")
	public native void setInstanceCount(@NInt long value);

	/**
	 * instanceDelay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceDelay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceDelay:")
	public native void setInstanceDelay(double value);

	/**
	 * instanceGreenOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceGreenOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceGreenOffset:")
	public native void setInstanceGreenOffset(float value);

	/**
	 * instanceRedOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceRedOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceRedOffset:")
	public native void setInstanceRedOffset(float value);

	/**
	 * instanceTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/instanceTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstanceTransform:")
	public native void setInstanceTransform(@ByValue CATransform3D value);

	/**
	 * preservesDepth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAReplicatorLayer_class/index.html#//apple_ref/occ/instp/CAReplicatorLayer/preservesDepth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreservesDepth:")
	public native void setPreservesDepth(boolean value);

	@Generated
	@Selector("initWithCoder:")
	public native CAReplicatorLayer initWithCoder(NSCoder aDecoder);

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
	@Selector("defaultActionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native CAAction defaultActionForKey(String event);

	@Generated
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

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
	@Selector("needsDisplayForKey:")
	public static native boolean needsDisplayForKey(String key);

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
