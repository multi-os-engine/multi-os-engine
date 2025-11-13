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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVQueuePlayer is a subclass of AVPlayer that offers an interface for multiple-item playback.
 * 
 * AVQueuePlayer extends AVPlayer with methods for managing a queue of items to be played in sequence.
 * It plays these items as gaplessly as possible in the current runtime environment, depending on
 * the timely availability of media data for the enqueued items.
 * 
 * For best performance clients should typically enqueue only as many AVPlayerItems as are necessary
 * to ensure smooth playback. Note that once an item is enqueued it becomes eligible to be loaded and
 * made ready for playback, with whatever I/O and processing overhead that entails.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVQueuePlayer extends AVPlayer {
    static {
        NatJ.register();
    }

    @Generated
    protected AVQueuePlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVQueuePlayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVQueuePlayer allocWithZone(VoidPtr zone);

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
    public static native AVQueuePlayer new_objc();

    @Generated
    @Selector("playerWithPlayerItem:")
    public static native AVQueuePlayer playerWithPlayerItem(@Nullable AVPlayerItem item);

    @Generated
    @Selector("playerWithURL:")
    public static native AVQueuePlayer playerWithURL(@NotNull NSURL URL);

    /**
     * Creates an instance of AVQueuePlayer and enqueues the AVPlayerItems from the specified array.
     * 
     * - Parameter items: An NSArray of AVPlayerItems with which to populate the player's queue initially.
     * 
     * - Returns: An instance of AVQueuePlayer.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("queuePlayerWithItems:")
    public static native AVQueuePlayer queuePlayerWithItems(@NotNull NSArray<? extends AVPlayerItem> items);

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
     * Ends playback of the current item and initiates playback of the next item in the player's queue.
     * 
     * Removes the current item from the play queue.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("advanceToNextItem")
    public native void advanceToNextItem();

    /**
     * Tests whether an AVPlayerItem can be inserted into the player's queue.
     * 
     * Note that adding the same AVPlayerItem to an AVQueuePlayer at more than one position in the queue is not
     * supported.
     * 
     * - Parameter item: The AVPlayerItem to be tested.
     * - Parameter afterItem: The item that the item to be tested is to follow in the queue. Pass nil to test whether
     * the item can be appended to the queue.
     * 
     * - Returns: An indication of whether the item can be inserted into the queue after the specified item.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("canInsertItem:afterItem:")
    public native boolean canInsertItemAfterItem(@NotNull AVPlayerItem item, @Nullable AVPlayerItem afterItem);

    @Generated
    @Selector("init")
    public native AVQueuePlayer init();

    /**
     * Initializes an instance of AVQueuePlayer by enqueueing the AVPlayerItems from the specified array.
     * 
     * This method throws an exception if items contains duplicated values or values associated with another AVPlayer.
     * 
     * - Parameter items: An NSArray of AVPlayerItems with which to populate the player's queue initially.
     * 
     * - Returns: An instance of AVQueuePlayer.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("initWithItems:")
    public native AVQueuePlayer initWithItems(@NotNull NSArray<? extends AVPlayerItem> items);

    @Generated
    @Selector("initWithPlayerItem:")
    public native AVQueuePlayer initWithPlayerItem(@Nullable AVPlayerItem item);

    @Generated
    @Selector("initWithURL:")
    public native AVQueuePlayer initWithURL(@NotNull NSURL URL);

    /**
     * Places an AVPlayerItem after the specified item in the queue.
     * 
     * This method throws an exception if item already exists in the queue.
     * 
     * - Parameter item: The item to be inserted.
     * - Parameter afterItem: The item that the newly inserted item should follow in the queue. Pass nil to append the
     * item to the queue.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("insertItem:afterItem:")
    public native void insertItemAfterItem(@NotNull AVPlayerItem item, @Nullable AVPlayerItem afterItem);

    /**
     * Provides an array of the currently enqueued items.
     * 
     * - Returns: An NSArray containing the enqueued AVPlayerItems.
     * 
     * API-Since: 4.1
     */
    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<? extends AVPlayerItem> items();

    /**
     * Removes all items from the queue.
     * 
     * Stops playback by the target.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("removeAllItems")
    public native void removeAllItems();

    /**
     * Removes an AVPlayerItem from the queue.
     * 
     * If the item to be removed is currently playing, has the same effect as -advanceToNextItem.
     * 
     * - Parameter item: The item to be removed.
     * 
     * API-Since: 4.1
     */
    @Generated
    @Selector("removeItem:")
    public native void removeItem(@NotNull AVPlayerItem item);

    @Deprecated
    @Generated
    @Selector("availableHDRModes")
    @NInt
    public static native long availableHDRModes();

    @Generated
    @Selector("eligibleForHDRPlayback")
    public static native boolean eligibleForHDRPlayback();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("isObservationEnabled")
    public static native boolean isObservationEnabled();

    @Generated
    @Selector("setObservationEnabled:")
    public static native void setObservationEnabled(boolean value);
}
