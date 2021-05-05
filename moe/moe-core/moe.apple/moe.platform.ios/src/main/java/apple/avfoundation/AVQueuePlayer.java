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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("playerWithPlayerItem:")
    public static native AVQueuePlayer playerWithPlayerItem(AVPlayerItem item);

    @Generated
    @Selector("playerWithURL:")
    public static native AVQueuePlayer playerWithURL(NSURL URL);

    /**
     * queuePlayerWithItems:
     * 
     * Creates an instance of AVQueuePlayer and enqueues the AVPlayerItems from the specified array.
     * 
     * @param      items
     *   An NSArray of AVPlayerItems with which to populate the player's queue initially.
     * @return
     *   An instance of AVQueuePlayer.
     */
    @Generated
    @Selector("queuePlayerWithItems:")
    public static native AVQueuePlayer queuePlayerWithItems(NSArray<? extends AVPlayerItem> items);

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
     * advanceToNextItem
     * 
     * Ends playback of the current item and initiates playback of the next item in the player's queue.
     * 
     * Removes the current item from the play queue.
     */
    @Generated
    @Selector("advanceToNextItem")
    public native void advanceToNextItem();

    /**
     * canInsertItem:afterItem:
     * 
     * Tests whether an AVPlayerItem can be inserted into the player's queue.
     * 
     *   Note that adding the same AVPlayerItem to an AVQueuePlayer at more than one position in the queue is not supported.
     * 
     * @param      item
     *   The AVPlayerItem to be tested.
     * @param      afterItem
     *   The item that the item to be tested is to follow in the queue. Pass nil to test whether the item can be appended to the queue.
     * @return
     *   An indication of whether the item can be inserted into the queue after the specified item.
     */
    @Generated
    @Selector("canInsertItem:afterItem:")
    public native boolean canInsertItemAfterItem(AVPlayerItem item, AVPlayerItem afterItem);

    @Generated
    @Selector("init")
    public native AVQueuePlayer init();

    /**
     * initWithItems:
     * 
     * Initializes an instance of AVQueuePlayer by enqueueing the AVPlayerItems from the specified array.
     * 
     * @param      items
     *   An NSArray of AVPlayerItems with which to populate the player's queue initially.
     * @return
     *   An instance of AVQueuePlayer.
     */
    @Generated
    @Selector("initWithItems:")
    public native AVQueuePlayer initWithItems(NSArray<? extends AVPlayerItem> items);

    @Generated
    @Selector("initWithPlayerItem:")
    public native AVQueuePlayer initWithPlayerItem(AVPlayerItem item);

    @Generated
    @Selector("initWithURL:")
    public native AVQueuePlayer initWithURL(NSURL URL);

    /**
     * insertItem:afterItem:
     * 
     * Places an AVPlayerItem after the specified item in the queue.
     * 
     * @param      item
     *   The item to be inserted.
     * @param      afterItem
     *   The item that the newly inserted item should follow in the queue. Pass nil to append the item to the queue.
     */
    @Generated
    @Selector("insertItem:afterItem:")
    public native void insertItemAfterItem(AVPlayerItem item, AVPlayerItem afterItem);

    /**
     * items
     * 
     * Provides an array of the currently enqueued items.
     * 
     * @return     An NSArray containing the enqueued AVPlayerItems.
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends AVPlayerItem> items();

    /**
     * removeAllItems
     * 
     * Removes all items from the queue.
     * 
     * Stops playback by the target.
     */
    @Generated
    @Selector("removeAllItems")
    public native void removeAllItems();

    /**
     * removeItem:
     * 
     * Removes an AVPlayerItem from the queue.
     * 
     *   If the item to be removed is currently playing, has the same effect as -advanceToNextItem.
     * 
     * @param      item
     *   The item to be removed.
     */
    @Generated
    @Selector("removeItem:")
    public native void removeItem(AVPlayerItem item);

    @Generated
    @Selector("availableHDRModes")
    @NInt
    public static native long availableHDRModes();

    @Generated
    @Selector("eligibleForHDRPlayback")
    public static native boolean eligibleForHDRPlayback();
}
