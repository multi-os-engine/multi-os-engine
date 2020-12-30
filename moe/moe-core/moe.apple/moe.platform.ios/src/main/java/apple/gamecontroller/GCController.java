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

/**
 * Controllers are available to an application that links to GameController.framework. There are 2 ways to access controllers
 * paired to the system, adopt both to ensure the best user experience:
 * 
 * 1: Querying for the the current array or controllers using [GCController controllers].
 * 2: Registering for Connection/Disconnection notifications from NSNotificationCenter.
 * 
 * Only controllers that support one of the allowed profiles, such as GCExtendedGamepad, will be enumerated. Check for the profile
 * supported before using a controller in your application. Ignore a controller that doesn't support a profile that suits
 * your application, as the user will expect their controller to either be fully supported or not supported at all.
 */
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

    /**
     * Get a list of controllers currently attached to the system.
     * 
     * @see GCControllerDidConnectNotification
     * @see GCControllerDidDisconnectNotification
     */
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

    /**
     * Start discovery of new wireless controllers that are discoverable. This is an asynchronous and the supplied completionHandler
     * will get called once no more devices can be found. If there are already multiple controllers available for use, there
     * may be little reason to automatically start discovery of new wireless controllers. In this situation it may be best to
     * allow the user to start discovery manually via in-game UI.
     * 
     * Once discovery has started new controllers will notify themselves as connected via GCControllerDidConnectNotification.
     * As the notification arrives the controller is also available in the controllers array.
     * 
     * The completionHandler could be used to update UI and/or game state to indicate that no more controllers will be found
     * and the current set of controllers is what is available for use in the game.
     * 
     * If a completionHandler was provided, it will be called once when discovery stops. Either from an explicit call to
     * stopWirelessControllerDiscovery or from timing out or stopping in its natural course of operation. Thus the
     * completionHandler will at most be called once per call to startWirelessControllerDiscoveryWithCompletionHandler:.
     * 
     * The completionHandler may also not get called at all, if for example startWirelessControllerDiscoveryWithCompletionHandler:
     * is called multiple times during dicovery. For this case the net effect is that the completionHandler is replaced with each call
     * and only the last one set before discovery stops will be called.
     * 
     * @param completionHandler an optional handler that is called when discovery stops. (may be nil, in which case you will not be notified when discovery stops)
     * @see stopWirelessControllerDiscovery
     * @see controllers
     */
    @Generated
    @Selector("startWirelessControllerDiscoveryWithCompletionHandler:")
    public static native void startWirelessControllerDiscoveryWithCompletionHandler(
            @ObjCBlock(name = "call_startWirelessControllerDiscoveryWithCompletionHandler") Block_startWirelessControllerDiscoveryWithCompletionHandler completionHandler);

    /**
     * If no more controllers are needed, depending on game state or number of controllers supported by a game, the discovery
     * process can be stopped. Calling stopWirelessControllerDiscovery when no discovery is currently in progress will return
     * immediately without any effect, thus it is safe to call even if the completionHandler of
     * startWirelessControllerDiscoveryWithCompletionHandler: has been called.
     * 
     * @see startWirelessControllerDiscoveryWithCompletionHandler:
     */
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

    /**
     * Set this block to be notified when a user intends to suspend or resume the current game state. A controller will have a button
     * dedicated to suspending and resuming play and invoking context sensitive actions. During event handling the system will
     * notify the application using this block such that the application can handle the suspension and resumption from the given controller.
     * 
     * Use this to implement your canonical transition to a pause menu for example if that is your application's desired handling
     * of suspension in play. You may pause and resume based on game state as well so the event is only called each time the
     * pause/resume button is pressed.
     * 
     * @note This handler has been deprecated in favor of the Menu button found on GCMicroGamepad and GCExtendedGamepad.
     * @see microGamepad
     * @see extendedGamepad
     */
    @Generated
    @Selector("controllerPausedHandler")
    @ObjCBlock(name = "call_controllerPausedHandler_ret")
    public native Block_controllerPausedHandler_ret controllerPausedHandler();

    @Generated
    @Selector("extendedGamepad")
    public native GCExtendedGamepad extendedGamepad();

    /**
     * Gets the profile for the controller that suits current application.
     * 
     * There are several supported profiles, with an additional optional profile for motion as well.
     * Each controller may be able to map its inputs into all profiles or just one kind of profile. Query for the controller
     * profile that suits your game, the simplest kind will be supported by the broadest variety
     * of controllers. A controller supporting the Extended Gamepad profile for example supports the Gamepad profile and more.
     * As such it can always be used just in the Gamepad profile if that suits the game.
     * 
     * A physical controller that supports a profile must support it completely. That means that all buttons and axis inputs must
     * be valid inputs that a developer can utilize.
     * 
     * If a controller does not support the given profile the returned value will be nil. Use this to filter controllers if the
     * application requires a specific kind of profile.
     * @see motion
     */
    @Generated
    @Selector("gamepad")
    public native GCGamepad gamepad();

    @Generated
    @Selector("handlerQueue")
    public native NSObject handlerQueue();

    @Generated
    @Selector("init")
    public native GCController init();

    /**
     * A controller may be form fitting or otherwise closely attached to the device. This closeness to other inputs on the device
     * may suggest that interaction with the device may use other inputs easily. This is presented to developers to allow them to
     * make informed decisions about UI and interactions to choose for their game in this situation.
     */
    @Generated
    @Selector("isAttachedToDevice")
    public native boolean isAttachedToDevice();

    @Generated
    @Selector("microGamepad")
    public native GCMicroGamepad microGamepad();

    /**
     * Gets the motion input profile. This profile is optional and may be available if the controller is attached to a device that supports motion.
     * If this is nil the controller does not support motion input and only the gamepad & extendedGamepad profiles are available.
     * @see gamepad
     * @see extendedGamepad
     */
    @Generated
    @Selector("motion")
    public native GCMotion motion();

    /**
     * A player index for the controller, defaults to GCControllerPlayerIndexUnset.
     * 
     * This can be set both for the application to keep track of controllers and as a signal to make a controller display a player
     * index on a set of LEDs or some other mechanism.
     * 
     * A controller is not guaranteed to have a visual display of the playerIndex, playerIndex does not persist for a controller
     * with regards to a system.
     * 
     * Negative values less than GCControllerPlayerIndexUnset will just map back to GCControllerPlayerIndexUnset when read back.
     */
    @Generated
    @Selector("playerIndex")
    @NInt
    public native long playerIndex();

    /**
     * Set this block to be notified when a user intends to suspend or resume the current game state. A controller will have a button
     * dedicated to suspending and resuming play and invoking context sensitive actions. During event handling the system will
     * notify the application using this block such that the application can handle the suspension and resumption from the given controller.
     * 
     * Use this to implement your canonical transition to a pause menu for example if that is your application's desired handling
     * of suspension in play. You may pause and resume based on game state as well so the event is only called each time the
     * pause/resume button is pressed.
     * 
     * @note This handler has been deprecated in favor of the Menu button found on GCMicroGamepad and GCExtendedGamepad.
     * @see microGamepad
     * @see extendedGamepad
     */
    @Generated
    @Selector("setControllerPausedHandler:")
    public native void setControllerPausedHandler(
            @ObjCBlock(name = "call_setControllerPausedHandler") Block_setControllerPausedHandler value);

    @Generated
    @Selector("setHandlerQueue:")
    public native void setHandlerQueue(NSObject value);

    /**
     * A player index for the controller, defaults to GCControllerPlayerIndexUnset.
     * 
     * This can be set both for the application to keep track of controllers and as a signal to make a controller display a player
     * index on a set of LEDs or some other mechanism.
     * 
     * A controller is not guaranteed to have a visual display of the playerIndex, playerIndex does not persist for a controller
     * with regards to a system.
     * 
     * Negative values less than GCControllerPlayerIndexUnset will just map back to GCControllerPlayerIndexUnset when read back.
     */
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

    /**
     * Polls the state vector of the controller and saves it to a new and writable instance of GCController.
     * 
     * If your application is heavily multithreaded this may also be useful to guarantee atomicity of input handling as
     * a snapshot will not change based on user input once it is taken.
     * 
     * @see snapshot
     * @return A new controller with the duplicated state vector of the current controller
     */
    @Generated
    @Selector("capture")
    public native GCController capture();

    /**
     * Creates a controller with an extended gamepad profile.
     * 
     * This controller will be considered a snapshot, allowing developers to write to any GCControllerElement of its profiles.
     * 
     * @see snapshot
     * @return A new controller with an extended gamepad profile
     */
    @Generated
    @Selector("controllerWithExtendedGamepad")
    public static native GCController controllerWithExtendedGamepad();

    /**
     * Creates a controller with a micro gamepad profile.
     * 
     * This controller will be considered a snapshot, allowing developers to write to any GCControllerElement of its profiles.
     * 
     * @see snapshot
     * @return A new controller with a micro gamepad profile
     */
    @Generated
    @Selector("controllerWithMicroGamepad")
    public static native GCController controllerWithMicroGamepad();

    /**
     * A controller may represent a real device managed by the operating system, or a virtual snapshot created by the developer.
     * If a controller is directly created by the developer, it is considered to be a snapshot, allowing direct writes to any
     * GCControllerElement of its profiles. If the controller is not snapshot, the system will reject any write requests to GCControllerElement.
     * 
     * @see controllerWithMicroGamepad
     * @see controllerWithExtendedGamepad
     * @see capture
     */
    @Generated
    @Selector("isSnapshot")
    public native boolean isSnapshot();

    @Generated
    @Selector("productCategory")
    public native String productCategory();

    /**
     * Gets the battery information if controller supports one
     * 
     * This property is useful when you try to notify your user to change or charge controller before it runs out of battery life
     * or simply display the current battery level and status.
     */
    @Generated
    @Selector("battery")
    public native GCDeviceBattery battery();

    /**
     * The most recently used game controller. If a user actuates a game controller input, that controller will become the current one.
     * 
     * @note This is useful for single player games where you only care about whether an input is pressed, and not where it came from. You
     * will still need to register for changes to GCController.current so that your UI can remain up-to-date with the current controller.
     */
    @Generated
    @Selector("current")
    public static native GCController current();

    /**
     * Gets the haptics for the controller, if one exists.
     * 
     * Use this property to create CHHapticEngine instances according to your needs. 
     * 
     * @note Haptics are a drain on the controller's battery, and can be distracting when used excessively. 
     */
    @Generated
    @Selector("haptics")
    public native GCDeviceHaptics haptics();

    /**
     * Gets the light for the controller, if one exists.
     * 
     * A controller's light can be used to signal information to the player, such as using different light colors based on the player
     * index. It can also be used to react to in-game events and enhance user immersion.
     */
    @Generated
    @Selector("light")
    public native GCDeviceLight light();

    @Generated
    @Selector("physicalInputProfile")
    public native GCPhysicalInputProfile physicalInputProfile();
}
