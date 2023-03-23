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

package apple.usernotifications;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UNNotificationSound extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UNNotificationSound(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UNNotificationSound alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UNNotificationSound allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The default sound used for notifications.
     */
    @Generated
    @Selector("defaultSound")
    public static native UNNotificationSound defaultSound();

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
    public static native UNNotificationSound new_objc();

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
     * The sound file to be played for the notification. The sound must be in the Library/Sounds folder of the app's
     * data container or the Library/Sounds folder of an app group data container. If the file is not found in a
     * container, the system will look in the app's bundle.
     */
    @Generated
    @Selector("soundNamed:")
    public static native UNNotificationSound soundNamed(String name);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native UNNotificationSound init();

    @Generated
    @Selector("initWithCoder:")
    public native UNNotificationSound initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The name of a sound file to be played for an critical alert. Critical alerts will bypass the mute switch and Do
     * Not Disturb. The sound file must be contained in the app’s bundle or in the Library/Sounds folder of the app’s
     * data container. If files exist in both locations then the file in the app’s data container will be preferred.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("criticalSoundNamed:")
    public static native UNNotificationSound criticalSoundNamed(String name);

    /**
     * The name of a sound file to be played for an critical alert with a custom audio volume level. Critical alerts
     * will bypass the mute switch and Do Not Disturb. The sound file must be contained in the app’s bundle or in the
     * Library/Sounds folder of the app’s data container. If files exist in both locations then the file in the app’s
     * data container will be preferred. The audio volume is expected to be between 0.0f and 1.0f.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("criticalSoundNamed:withAudioVolume:")
    public static native UNNotificationSound criticalSoundNamedWithAudioVolume(String name, float volume);

    /**
     * The default sound used for critical alerts. Critical alerts will bypass the mute switch and Do Not Disturb.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("defaultCriticalSound")
    public static native UNNotificationSound defaultCriticalSound();

    /**
     * The default sound used for critical alerts with a custom audio volume level. Critical alerts will bypass the mute
     * switch and Do Not Disturb. The audio volume is expected to be between 0.0f and 1.0f.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("defaultCriticalSoundWithAudioVolume:")
    public static native UNNotificationSound defaultCriticalSoundWithAudioVolume(float volume);

    /**
     * The default sound used for incoming call notifications. Plays the ringtone and haptics specified in Settings for
     * a 30 second duration. The parent UNNotificationContent object must be created in the notification service
     * extension via -[UNNotificationContent contentByUpdatingWithProvider:error:] where the provider is an
     * INStartCallIntent with a destinationType of INCallDestinationTypeNormal. Please use CallKit instead of
     * UserNotifications for this use case when available.
     * 
     * API-Since: 15.2
     */
    @Generated
    @Selector("defaultRingtoneSound")
    public static native UNNotificationSound defaultRingtoneSound();

    /**
     * The sound file to be played for an incoming call notification. The sound must be in the Library/Sounds folder of
     * the app's data container or the Library/Sounds folder of an app group data container. If the file is not found in
     * a container, the system will look in the app's bundle. The sound will repeat for a total duration of 30 seconds.
     * The haptics specified in Settings will be played along with the sound. The parent UNNotificationContent object
     * must be created in the notification service extension via -[UNNotificationContent
     * contentByUpdatingWithProvider:error:] where the provider is an INStartCallIntent with a destinationType of
     * INCallDestinationTypeNormal. Please use CallKit instead of UserNotifications for this use case when available.
     * 
     * API-Since: 15.2
     */
    @Generated
    @Selector("ringtoneSoundNamed:")
    public static native UNNotificationSound ringtoneSoundNamed(String name);
}
