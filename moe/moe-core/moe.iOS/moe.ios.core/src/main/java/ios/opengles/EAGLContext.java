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

package ios.opengles;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.opengles.protocol.EAGLDrawable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("OpenGLES")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EAGLContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected EAGLContext(Pointer peer) {
		super(peer);
	}

	/**
	 * API</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/API">iOS Dev Center</a>
	 */
	@Generated
	@Selector("API")
	@NUInt
	public native long API();

	@Generated
	@Owned
	@Selector("alloc")
	public static native EAGLContext alloc();

	/**
	 * currentContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/clm/EAGLContext/currentContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentContext")
	public static native EAGLContext currentContext();

	/**
	 * debugLabel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/debugLabel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("debugLabel")
	public native String debugLabel();

	@Generated
	@Selector("init")
	public native EAGLContext init();

	/**
	 * initWithAPI:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instm/EAGLContext/initWithAPI:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAPI:")
	public native EAGLContext initWithAPI(@NUInt long api);

	/**
	 * initWithAPI:sharegroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instm/EAGLContext/initWithAPI:sharegroup:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAPI:sharegroup:")
	public native EAGLContext initWithAPISharegroup(@NUInt long api,
			EAGLSharegroup sharegroup);

	/**
	 * multiThreaded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/multiThreaded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMultiThreaded")
	public native boolean isMultiThreaded();

	/**
	 * presentRenderbuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instm/EAGLContext/presentRenderbuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentRenderbuffer:")
	public native boolean presentRenderbuffer(@NUInt long target);

	/**
	 * renderbufferStorage:fromDrawable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instm/EAGLContext/renderbufferStorage:fromDrawable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderbufferStorage:fromDrawable:")
	public native boolean renderbufferStorageFromDrawable(@NUInt long target,
			@Mapped(ObjCObjectMapper.class) EAGLDrawable drawable);

	/**
	 * setCurrentContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/clm/EAGLContext/setCurrentContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCurrentContext:")
	public static native boolean setCurrentContext(EAGLContext context);

	/**
	 * debugLabel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/debugLabel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDebugLabel:")
	public native void setDebugLabel(String value);

	/**
	 * multiThreaded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/multiThreaded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMultiThreaded:")
	public native void setMultiThreaded(boolean value);

	/**
	 * sharegroup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/OpenGLES/Reference/EAGLContext_ClassRef/index.html#//apple_ref/occ/instp/EAGLContext/sharegroup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharegroup")
	public native EAGLSharegroup sharegroup();

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
