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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGSize;
import ios.foundation.NSCoder;
import ios.metal.protocol.MTLDevice;
import ios.quartzcore.protocol.CAMetalDrawable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
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
public class CAMetalLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected CAMetalLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAMetalLayer alloc();

	/**
	 * device</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/device">iOS Dev Center</a>
	 */
	@Generated
	@Selector("device")
	@MappedReturn(ObjCObjectMapper.class)
	public native MTLDevice device();

	/**
	 * drawableSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/drawableSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawableSize")
	@ByValue
	public native CGSize drawableSize();

	/**
	 * framebufferOnly</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/framebufferOnly">iOS Dev Center</a>
	 */
	@Generated
	@Selector("framebufferOnly")
	public native boolean framebufferOnly();

	@Generated
	@Selector("init")
	public native CAMetalLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native CAMetalLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	@Generated
	@Selector("layer")
	public static native CAMetalLayer layer();

	/**
	 * nextDrawable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instm/CAMetalLayer/nextDrawable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nextDrawable")
	@MappedReturn(ObjCObjectMapper.class)
	public native CAMetalDrawable nextDrawable();

	/**
	 * pixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/pixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelFormat")
	@NUInt
	public native long pixelFormat();

	/**
	 * presentsWithTransaction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/presentsWithTransaction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentsWithTransaction")
	public native boolean presentsWithTransaction();

	/**
	 * device</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/device">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDevice:")
	public native void setDevice(@Mapped(ObjCObjectMapper.class) MTLDevice value);

	/**
	 * drawableSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/drawableSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDrawableSize:")
	public native void setDrawableSize(@ByValue CGSize value);

	/**
	 * framebufferOnly</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/framebufferOnly">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFramebufferOnly:")
	public native void setFramebufferOnly(boolean value);

	/**
	 * pixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/pixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPixelFormat:")
	public native void setPixelFormat(@NUInt long value);

	/**
	 * presentsWithTransaction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Animation/Reference/CAMetalLayer_Ref/index.html#//apple_ref/occ/instp/CAMetalLayer/presentsWithTransaction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPresentsWithTransaction:")
	public native void setPresentsWithTransaction(boolean value);

	@Generated
	@Selector("initWithCoder:")
	public native CAMetalLayer initWithCoder(NSCoder aDecoder);

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
