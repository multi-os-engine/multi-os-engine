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

package ios.gamecontroller;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCController extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GCController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GCController alloc();

	/**
	 * controllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/clm/GCController/controllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("controllers")
	public static native NSArray<? extends GCController> controllers();

	/**
	 * extendedGamepad</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/extendedGamepad">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extendedGamepad")
	public native GCExtendedGamepad extendedGamepad();

	/**
	 * gamepad</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/gamepad">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gamepad")
	public native GCGamepad gamepad();

	@Generated
	@Selector("init")
	public native GCController init();

	/**
	 * attachedToDevice</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/attachedToDevice">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAttachedToDevice")
	public native boolean isAttachedToDevice();

	/**
	 * motion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/motion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("motion")
	public native GCMotion motion();

	/**
	 * playerIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/playerIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerIndex")
	@NInt
	public native long playerIndex();

	/**
	 * controllerPausedHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/controllerPausedHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setControllerPausedHandler:")
	public native void setControllerPausedHandler(
			@ObjCBlock(name = "call_setControllerPausedHandler") Block_setControllerPausedHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setControllerPausedHandler {
		@Generated
		void call_setControllerPausedHandler(GCController arg0);
	}

	/**
	 * playerIndex</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/playerIndex">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayerIndex:")
	public native void setPlayerIndex(@NInt long value);

	/**
	 * startWirelessControllerDiscoveryWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/clm/GCController/startWirelessControllerDiscoveryWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startWirelessControllerDiscoveryWithCompletionHandler:")
	public static native void startWirelessControllerDiscoveryWithCompletionHandler(
			@ObjCBlock(name = "call_startWirelessControllerDiscoveryWithCompletionHandler") Block_startWirelessControllerDiscoveryWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startWirelessControllerDiscoveryWithCompletionHandler {
		@Generated
		void call_startWirelessControllerDiscoveryWithCompletionHandler();
	}

	/**
	 * stopWirelessControllerDiscovery</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/clm/GCController/stopWirelessControllerDiscovery">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopWirelessControllerDiscovery")
	public static native void stopWirelessControllerDiscovery();

	/**
	 * vendorName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/vendorName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vendorName")
	public native String vendorName();

	/**
	 * controllerPausedHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/controllerPausedHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("controllerPausedHandler")
	@ObjCBlock(name = "call_controllerPausedHandler_ret")
	public native Block_controllerPausedHandler_ret controllerPausedHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_controllerPausedHandler_ret {
		@Generated
		void call_controllerPausedHandler_ret(GCController arg0);
	}

	/**
	 * handlerQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/handlerQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("handlerQueue")
	public native NSObject handlerQueue();

	/**
	 * handlerQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameController/Reference/GCController_Ref/index.html#//apple_ref/occ/instp/GCController/handlerQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHandlerQueue:")
	public native void setHandlerQueue(NSObject value);

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
