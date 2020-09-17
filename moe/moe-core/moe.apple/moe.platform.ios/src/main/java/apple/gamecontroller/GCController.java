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

package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.protocol.GCDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCController extends NSObject implements GCDevice {
    static {
        NatJ.register();
    }

    @Generated
    protected GCController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("controllers")
    public static native NSArray<? extends GCController> controllers();

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    @Selector("startWirelessControllerDiscoveryWithCompletionHandler:")
    public static native void startWirelessControllerDiscoveryWithCompletionHandler(
            @ObjCBlock(name = "call_startWirelessControllerDiscoveryWithCompletionHandler") Block_startWirelessControllerDiscoveryWithCompletionHandler completionHandler);

    @Generated
    @Selector("stopWirelessControllerDiscovery")
    public static native void stopWirelessControllerDiscovery();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("controllerPausedHandler")
    @ObjCBlock(name = "call_controllerPausedHandler_ret")
    public native Block_controllerPausedHandler_ret controllerPausedHandler();

    @Generated
    @Selector("extendedGamepad")
    public native GCExtendedGamepad extendedGamepad();

    @Generated
    @Selector("gamepad")
    public native GCGamepad gamepad();

    @Generated
    @Selector("handlerQueue")
    public native NSObject handlerQueue();

    @Generated
    @Selector("init")
    public native GCController init();

    @Generated
    @Selector("isAttachedToDevice")
    public native boolean isAttachedToDevice();

    @Generated
    @Selector("microGamepad")
    public native GCMicroGamepad microGamepad();

    @Generated
    @Selector("motion")
    public native GCMotion motion();

    @Generated
    @Selector("playerIndex")
    @NInt
    public native long playerIndex();

    @Generated
    @Selector("setControllerPausedHandler:")
    public native void setControllerPausedHandler(
            @ObjCBlock(name = "call_setControllerPausedHandler") Block_setControllerPausedHandler value);

    @Generated
    @Selector("setHandlerQueue:")
    public native void setHandlerQueue(NSObject value);

    @Generated
    @Selector("setPlayerIndex:")
    public native void setPlayerIndex(@NInt long value);

    @Generated
    @Selector("vendorName")
    public native String vendorName();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_controllerPausedHandler_ret {
        @Generated
        void call_controllerPausedHandler_ret(GCController arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setControllerPausedHandler {
        @Generated
        void call_setControllerPausedHandler(GCController arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWirelessControllerDiscoveryWithCompletionHandler {
        @Generated
        void call_startWirelessControllerDiscoveryWithCompletionHandler();
    }

    @Generated
    @Selector("capture")
    public native GCController capture();

    @Generated
    @Selector("controllerWithExtendedGamepad")
    public static native GCController controllerWithExtendedGamepad();

    @Generated
    @Selector("controllerWithMicroGamepad")
    public static native GCController controllerWithMicroGamepad();

    @Generated
    @Selector("isSnapshot")
    public native boolean isSnapshot();

    @Generated
    @Selector("productCategory")
    public native String productCategory();

    @Generated
    @Selector("battery")
    public native GCDeviceBattery battery();

    @Generated
    @Selector("current")
    public static native GCController current();

    @Generated
    @Selector("haptics")
    public native GCDeviceHaptics haptics();

    @Generated
    @Selector("light")
    public native GCDeviceLight light();

    @Generated
    @Selector("physicalInputProfile")
    public native GCPhysicalInputProfile physicalInputProfile();
}
