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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerLooper extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerLooper(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerLooper alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerLooper allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlayerLooper new_objc();

    /**
     * playerLooperWithPlayer:templateItem:
     * 
     * Returns an instance of AVPlayerLooper to loop specified AVPlayerItem with specified AVQueuePlayer.
     * 
     * Equivalent to +playerLooperWithPlayer:templateItem:timeRange: and passing in kCMTimeRangeInvalid for timeRange
     * parameter.
     * 
     * @param player
     *                   Must not be nil
     * @param itemToLoop
     *                   Must not be nil
     * @return
     *         An instance of AVPlayerLooper.
     */
    @Generated
    @Selector("playerLooperWithPlayer:templateItem:")
    public static native AVPlayerLooper playerLooperWithPlayerTemplateItem(@NotNull AVQueuePlayer player,
            @NotNull AVPlayerItem itemToLoop);

    /**
     * playerLooperWithPlayer:templateItem:timeRange:
     * 
     * Returns an instance of AVPlayerLooper to loop specified AVPlayerItem within the specified time range with
     * specified AVQueuePlayer.
     * 
     * The specified AVPlayerItem will be used as a template to generate at least 3 AVPlayerItem replicas and the
     * replicas will be inserted into specified AVQueuePlayer's play queue to accomplish the looping playback. The
     * specified AVPlayerItem should have its asset's duration property loaded beforehand so looping setup work would
     * not be blocked until the duration value is known. Otherwise, AVPlayerLooper's status property is
     * AVPlayerLooperStatusUnknown until the duration property is loaded. The specified AVPlayerItem will not be used in
     * the actual looping playback. Furthermore, AVPlayerItem replicas will be generated at initialization time so any
     * changes made to the specified AVPlayerItem's property afterwards will not be reflected in the replicas used for
     * looping playback. Specified CMTimeRange will limit each item loop iteration to playing within the specified time
     * range. To play from beginning and the whole duration of the item, specify kCMTimeRangeInvalid for the range
     * parameter. Time range will be accomplished by seeking to range start time and setting AVPlayerItem's
     * forwardPlaybackEndTime property on the looping item replicas. Client should not modify AVQueuePlayer's play queue
     * while AVPlayerLooper is performing the looping. AVPlayerLooper will insert the replica items before any existing
     * items in the specified AVQueuePlayer's play queue and change the actionAtItemEnd to
     * AVPlayerActionAtItemEndAdvance if required. AVQueuePlayer's play queue and actionAtItemEnd will be restored when
     * -disableLooping method is called and then current looping item replicas completes playback or when AVPlayerLooper
     * is destroyed. While AVPlayerLooper is being initialized, the specified AVQueuePlayer will be paused (rate of 0.0)
     * if necessary and the original player rate will be restored after initialization completes. The client shall set
     * the specified AVQueuePlayer's rate to 0 beforehand if additional set-up work needs to be performed after
     * AVPlayerLooper initialization and before starting looping playback. An NSInvalidArgumentException will be raised
     * if the player and template item are not specified or the template item has a 0 duration. An
     * NSInvalidArgumentException will be raised if a valid time range has a duration of 0 or is not contained within
     * time 0 and duration of the templateItem.
     * 
     * @param player
     *                   Must not be nil
     * @param itemToLoop
     *                   Must not be nil
     * @param loopRange
     *                   Playback time range in [0, itemToLoop's duration]. kCMTimeRangeInvalid means [0, itemToLoop's
     *                   duration].
     * @return
     *         An instance of AVPlayerLooper.
     */
    @Generated
    @Selector("playerLooperWithPlayer:templateItem:timeRange:")
    public static native AVPlayerLooper playerLooperWithPlayerTemplateItemTimeRange(@NotNull AVQueuePlayer player,
            @NotNull AVPlayerItem itemToLoop, @ByValue CMTimeRange loopRange);

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

    /**
     * disableLooping
     * 
     * Disables the item looping
     * 
     * AVPlayerLooper will stop performing player queue operations for looping and let the current looping item replica
     * play to the end. The player's original actionAtItemEnd property will be restored afterwards. After this method is
     * called, the value of the receiver's status property will be AVPlayerLooperStatusCancelled.
     */
    @Generated
    @Selector("disableLooping")
    public native void disableLooping();

    /**
     * [@property] error
     * 
     * If the receiver's status is AVPlayerLooperStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is a NSError that describes what caused the receiver to not be able to perform looping
     * playback. If the receiver's status is not AVPlayerLooperStatusFailed, the value of this property is nil.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native AVPlayerLooper init();

    /**
     * initWithPlayer:templateItem:timeRange:
     * 
     * Initializes an instance of AVPlayerLooper to loop specified AVPlayerItem within the specified time range with
     * specified AVQueuePlayer.
     * 
     * The specified AVPlayerItem will be used as a template to generate at least 3 AVPlayerItem replicas and the
     * replicas will be inserted into specified AVQueuePlayer's play queue to accomplish the looping playback. The
     * specified AVPlayerItem should have its asset's duration property loaded beforehand so looping setup work would
     * not be blocked until the duration value is known. Otherwise, AVPlayerLooper's status property is
     * AVPlayerLooperStatusUnknown until the duration property is loaded. The specified AVPlayerItem will not be used in
     * the actual looping playback. Furthermore, AVPlayerItem replicas will be generated at initialization time so any
     * changes made to the specified AVPlayerItem's property afterwards will not be reflected in the replicas used for
     * looping playback. Specified CMTimeRange will limit each item loop iteration to playing within the specified time
     * range. To play from beginning and the whole duration of the item, specify kCMTimeRangeInvalid for the range
     * parameter. Time range will be accomplished by seeking to range start time and setting AVPlayerItem's
     * forwardPlaybackEndTime property on the looping item replicas. Client should not modify AVQueuePlayer's play queue
     * while AVPlayerLooper is performing the looping. AVPlayerLooper will insert the replica items before any existing
     * items in the specified AVQueuePlayer's play queue and change the actionAtItemEnd to
     * AVPlayerActionAtItemEndAdvance if required. AVQueuePlayer's play queue and actionAtItemEnd will be restored when
     * -disableLooping method is called and then current looping item replicas completes playback or when AVPlayerLooper
     * is destroyed. While AVPlayerLooper is being initialized, the specified AVQueuePlayer will be paused (rate of 0.0)
     * if necessary and the original player rate will be restored after initialization completes. The client shall set
     * the specified AVQueuePlayer's rate to 0 beforehand if additional set-up work needs to be performed after
     * AVPlayerLooper initialization and before starting looping playback. An NSInvalidArgumentException will be raised
     * if the player and template item are not specified or the template item has a 0 duration. An
     * NSInvalidArgumentException will be raised if a valid time range has a duration of 0 or is not contained within
     * time 0 and duration of the templateItem.
     * 
     * @param player
     *                   Must not be nil
     * @param itemToLoop
     *                   Must not be nil
     * @param loopRange
     *                   Playback time range in [0, itemToLoop's duration]. kCMTimeRangeInvalid means [0, itemToLoop's
     *                   duration].
     * @return
     *         An initialized AVPlayerLooper.
     */
    @Generated
    @Selector("initWithPlayer:templateItem:timeRange:")
    public native AVPlayerLooper initWithPlayerTemplateItemTimeRange(@NotNull AVQueuePlayer player,
            @NotNull AVPlayerItem itemToLoop, @ByValue CMTimeRange loopRange);

    /**
     * [@property] loopCount
     * 
     * Number of times the specified AVPlayerItem has been played
     * 
     * Starts at 0 and increments when the player starts playback of the AVPlayerItem again. This property is key value
     * observable.
     */
    @Generated
    @Selector("loopCount")
    @NInt
    public native long loopCount();

    /**
     * [@property] loopingPlayerItems
     * 
     * Returns an array containing replicas of specified AVPlayerItem used to accomplish the looping
     * 
     * AVPlayerLooper creates replicas of the template AVPlayerItem using -copyWithZone: and inserts the replicas in the
     * specified AVQueuePlayer to accomplish the looping. The AVPlayerItem replicas are for informational purposes and
     * to allow the client to apply properties that are not transferred from the template AVPlayerItem to the replicas.
     * The client can determine the number of replicas created and can listen for notifications and property changes
     * from the replicas if desired. AVPlayerItemOutputs and AVPlayerItemMediaDataCollectors are not transferred to the
     * replicas so the client should add them to each replica if desired. The client shall not modify the properties on
     * the replicas that would disrupt looping playback. Examples of such properties are playhead time/date, selected
     * media option, and forward playback end time. This property is key value observable.
     * 
     * @return
     *         Array containing replicas of specified AVPlayerItem
     */
    @NotNull
    @Generated
    @Selector("loopingPlayerItems")
    public native NSArray<? extends AVPlayerItem> loopingPlayerItems();

    /**
     * [@property] status
     * 
     * The ability of the receiver to be used for looping playback.
     * 
     * The value of this property is an AVPlayerLooperStatus that indicates whether the receiver is ready for looping
     * playback. When the value of this property is AVPlayerStatusFailed, the receiver can no longer be used for
     * playback and a new instance needs to be created in its place. When this happens, clients can check the value of
     * the error property to determine the nature of the failure. This property is key value observable.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();
}
