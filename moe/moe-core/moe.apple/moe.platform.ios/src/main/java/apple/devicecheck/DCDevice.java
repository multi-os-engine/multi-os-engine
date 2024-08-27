package apple.devicecheck;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A representation of a device that provides a unique, authenticated token.
 * 
 * Use the shared instance of the `DCDevice` class to generate a
 * token that identifies a device. Call the
 * ``DeviceCheck/DCDevice/generateTokenWithCompletionHandler:`` method to get
 * the token, and then send it to your server:
 * 
 * ```swift
 * if DCDevice.current.isSupported { // Always test for availability.
 * DCDevice.current.generateToken { token, error in
 * guard error == nil else { /* Handle the error. }
 * 
 * // Send the token to your server.
 * }
 * }
 * ```
 * 
 * On your server, combine the token with an authentication key that you obtain
 * from Apple, and use the result to request access to two per-device binary
 * digits (bits). After authenticating the device, Apple passes the current
 * values of the bits, along with the date they were last modified, to your
 * server. Your server applies its business logic to this information and
 * communicates the results to your app. For more information about server-side
 * procedures, see <doc:accessing-and-modifying-per-device-data>.
 * 
 * - Note: To use the `DCDevice` class, your app must have an app
 * ID that you register on the [Apple
 * Developer](https://developer.apple.com/account/) website.
 * 
 * Apple records the bits for you, and reports the bits back to you, but you’re
 * responsible for keeping track of what the bits mean. You’re also responsible
 * for determining when to reset the bits for a given device; for example, when
 * a user sells the device to someone else.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("DeviceCheck")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class DCDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected DCDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native DCDevice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native DCDevice allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * A representation of the device for which you want to query the two bits of
     * data.
     */
    @NotNull
    @Generated
    @Selector("currentDevice")
    public static native DCDevice currentDevice();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Generates a token that identifies the current device.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func generateToken() async throws -> Data
     * > ```
     * > For example:
     * > ```swift
     * > let token = try await generateToken()
     * > ```
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * Your server uses the generated token in its requests to get or set the
     * persistent bits for the current device. You should treat the token you
     * receive in the completion block as single-use. Although the token remains
     * valid long enough for your server to retry a specific request if necessary,
     * you should not use a token multiple times. Instead, use this method to
     * generate a new token.
     * 
     * - Note: The app you use to generate the token must be associated with your
     * developer account; otherwise, the generation request fails.
     * 
     * - Parameters:
     * - completion: A completion block that includes the following parameters:
     * - `token`: An ephemeral token that identifies the current device.
     * - `error`: The error that occurred, if any.
     */
    @Generated
    @Selector("generateTokenWithCompletionHandler:")
    public native void generateTokenWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_generateTokenWithCompletionHandler") Block_generateTokenWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateTokenWithCompletionHandler {
        @Generated
        void call_generateTokenWithCompletionHandler(@Nullable NSData token, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native DCDevice init();

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

    /**
     * A Boolean value that indicates whether the device supports the DeviceCheck
     * API.
     */
    @Generated
    @Selector("isSupported")
    public native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native DCDevice new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
