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

package apple.foundation;

import apple.NSObject;
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

/**
 * NSProgress is used to report the amount of work done, and provides a way to allow the user to cancel that work.
 * <p>
 * Since work is often split up into several parts, progress objects can form a tree where children represent part of
 * the overall total work. Each parent may have as many children as required, but each child only has one parent. The
 * top level progress object in this tree is typically the one that you would display to a user. The leaf objects are
 * updated as work completes, and the updates propagate up the tree.
 * <p>
 * The work that an NSProgress does is tracked via a "unit count." There are two unit count values: total and completed.
 * In its leaf form, an NSProgress is created with a total unit count and its completed unit count is updated with
 * -setCompletedUnitCount: until it matches the total unit count. The progress is then considered finished.
 * <p>
 * When progress objects form nodes in trees, they are still created with a total unit count. Portions of the total are
 * then handed out to children as a "pending unit count." The total amount handed out to children should add up to the
 * parent's totalUnitCount. When those children become finished, the pending unit count assigned to that child is added
 * to the parent's completedUnitCount. Therefore, when all children are finished, the parent's completedUnitCount is
 * equal to its totalUnitCount and it becomes finished itself.
 * <p>
 * Children NSProgress objects can be added implicitly or by invoking the -addChild:withPendingUnitCount: method on the
 * parent. Implicitly added children are attached to a parent progress between a call to
 * -becomeCurrentWithPendingUnitCount: and a call to -resignCurrent. The implicit child is created with the
 * +progressWithTotalUnitCount: method or by passing the result of +currentProgress to the -initWithParent:userInfo:
 * method. Both kinds of children can be attached to the same parent progress object. If you have an idea in advance
 * that some portions of the work will take more or less time than the others, you can use different values of pending
 * unit count for each child.
 * <p>
 * If you are designing an interface of an object that reports progress, then the recommended approach is to vend an
 * NSProgress property and adopt the NSProgressReporting protocol. The progress should be created with the
 * -discreteProgressWithTotalUnitCount: method. You can then either update the progress object directly or set it to
 * have children of its own. Users of your object can compose your progress into their tree by using the
 * -addChild:withPendingUnitCount: method.
 * <p>
 * If you want to provide progress reporting for a single method, then the recommended approach is to implicitly attach
 * to a current NSProgress by creating an NSProgress object at the very beginning of your method using
 * +progressWithTotalUnitCount:. This progress object will consume the pending unit count, and then you can set up the
 * progress object with children of its own.
 * <p>
 * The localizedDescription and localizedAdditionalDescription properties are meant to be observed as well as set. So
 * are the cancellable and pausable properties. totalUnitCount and completedUnitCount on the other hand are often not
 * the best properties to observe when presenting progress to the user. For example, you should observe
 * fractionCompleted instead of observing totalUnitCount and completedUnitCount and doing your own calculation.
 * NSProgress' default implementation of fractionCompleted does fairly sophisticated things like taking child
 * NSProgresses into account.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProgress extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSProgress(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSProgress alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSProgress allocWithZone(VoidPtr zone);

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
     * The instance of NSProgress associated with the current thread by a previous invocation of
     * -becomeCurrentWithPendingUnitCount:, if any. The purpose of this per-thread value is to allow code that does work
     * to usefully report progress even when it is widely separated from the code that actually presents progress to the
     * user, without requiring layers of intervening code to pass the instance of NSProgress through. Using the result
     * of invoking this directly will often not be the right thing to do, because the invoking code will often not even
     * know what units of work the current progress object deals in. Invoking +progressWithTotalUnitCount: to create a
     * child NSProgress object and then using that to report progress makes more sense in that situation.
     */
    @Generated
    @Selector("currentProgress")
    public static native NSProgress currentProgress();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Return an instance of NSProgress that has been initialized with -initWithParent:userInfo:. The initializer is
     * passed nil for the parent, resulting in a progress object that is not part of an existing progress tree. The
     * value of the totalUnitCount property is also set.
     */
    @Generated
    @Selector("discreteProgressWithTotalUnitCount:")
    public static native NSProgress discreteProgressWithTotalUnitCount(long unitCount);

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
    public static native NSProgress new_objc();

    /**
     * Return an instance of NSProgress that has been initialized with -initWithParent:userInfo:. The initializer is
     * passed the current progress object, if there is one, and the value of the totalUnitCount property is set. In many
     * cases you can simply precede code that does a substantial amount of work with an invocation of this method, with
     * repeated invocations of -setCompletedUnitCount: and -isCancelled in the loop that does the work.
     * <p>
     * You can invoke this method on one thread and then message the returned NSProgress on another thread. For example,
     * you can let the result of invoking this method get captured by a block passed to dispatch_async(). In that block
     * you can invoke methods like -becomeCurrentWithPendingUnitCount: and -resignCurrent, or -setCompletedUnitCount:
     * and -isCancelled.
     */
    @Generated
    @Selector("progressWithTotalUnitCount:")
    public static native NSProgress progressWithTotalUnitCount(long unitCount);

    /**
     * Return an instance of NSProgress that has been attached to a parent progress with the given pending unit count.
     */
    @Generated
    @Selector("progressWithTotalUnitCount:parent:pendingUnitCount:")
    public static native NSProgress progressWithTotalUnitCountParentPendingUnitCount(long unitCount, NSProgress parent,
            long portionOfParentTotalUnitCount);

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
     * Directly add a child progress to the receiver, assigning it a portion of the receiver's total unit count.
     */
    @Generated
    @Selector("addChild:withPendingUnitCount:")
    public native void addChildWithPendingUnitCount(NSProgress child, long inUnitCount);

    /**
     * Make the receiver the current thread's current progress object, returned by +currentProgress. At the same time,
     * record how large a portion of the work represented by the receiver will be represented by the next progress
     * object initialized by invoking -initWithParent:userInfo: in the current thread with the receiver as the parent.
     * This will be used when that child is sent -setCompletedUnitCount: and the receiver is notified of that.
     * <p>
     * With this mechanism, code that doesn't know anything about its callers can report progress accurately by using
     * +progressWithTotalUnitCount: and -setCompletedUnitCount:. The calling code will account for the fact that the
     * work done is only a portion of the work to be done as part of a larger operation. The unit of work in a call to
     * -becomeCurrentWithPendingUnitCount: has to be the same unit of work as that used for the value of the
     * totalUnitCount property, but the unit of work used by the child can be a completely different one, and often will
     * be. You must always balance invocations of this method with invocations of -resignCurrent.
     */
    @Generated
    @Selector("becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrentWithPendingUnitCount(long unitCount);

    /**
     * Invoke the block registered with the cancellationHandler property, if there is one, and set the cancelled
     * property to YES. Do this for the receiver, any descendants of the receiver, the instance of NSProgress that was
     * published in another process to make the receiver if that's the case, and any descendants of such a published
     * instance of NSProgress.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * A block to be invoked when cancel is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("cancellationHandler")
    @ObjCBlock(name = "call_cancellationHandler_ret")
    public native Block_cancellationHandler_ret cancellationHandler();

    @Generated
    @Selector("completedUnitCount")
    public native long completedUnitCount();

    /**
     * The fraction of the overall work completed by this progress object, including work done by any children it may
     * have.
     */
    @Generated
    @Selector("fractionCompleted")
    public native double fractionCompleted();

    @Generated
    @Selector("init")
    public native NSProgress init();

    /**
     * The designated initializer. If a parent NSProgress object is passed then progress reporting and cancellation
     * checking done by the receiver will notify or consult the parent. The only valid arguments to the first argument
     * of this method are nil (indicating no parent) or [NSProgress currentProgress]. Any other value will throw an
     * exception.
     */
    @Generated
    @Selector("initWithParent:userInfo:")
    public native NSProgress initWithParentUserInfo(NSProgress parentProgressOrNil,
            NSDictionary<String, ?> userInfoOrNil);

    /**
     * Whether the work being done can be cancelled or paused, respectively. By default NSProgresses are cancellable but
     * not pausable. NSProgress is by default KVO-compliant for these properties, with the notifications always being
     * sent on the thread which updates the property. These properties are for communicating whether controls for
     * cancelling and pausing should appear in a progress reporting user interface. NSProgress itself does not do
     * anything with these properties other than help pass their values from progress reporters to progress observers.
     * It is valid for the values of these properties to change in virtually any way during the lifetime of an
     * NSProgress. Of course, if an NSProgress is cancellable you should actually implement cancellability by setting a
     * cancellation handler or by making your code poll the result of invoking -isCancelled. Likewise for pausability.
     */
    @Generated
    @Selector("isCancellable")
    public native boolean isCancellable();

    /**
     * Whether the work being done can be cancelled or paused, respectively. By default NSProgresses are cancellable but
     * not pausable. NSProgress is by default KVO-compliant for these properties, with the notifications always being
     * sent on the thread which updates the property. These properties are for communicating whether controls for
     * cancelling and pausing should appear in a progress reporting user interface. NSProgress itself does not do
     * anything with these properties other than help pass their values from progress reporters to progress observers.
     * It is valid for the values of these properties to change in virtually any way during the lifetime of an
     * NSProgress. Of course, if an NSProgress is cancellable you should actually implement cancellability by setting a
     * cancellation handler or by making your code poll the result of invoking -isCancelled. Likewise for pausability.
     */
    @Generated
    @Selector("setCancellable:")
    public native void setCancellable(boolean value);

    /**
     * Whether the work being done has been cancelled or paused, respectively. NSProgress is by default KVO-compliant
     * for these properties, with the notifications always being sent on the thread which updates the property.
     * Instances of NSProgress that have parents are at least as cancelled or paused as their parents.
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * Whether the progress being made is indeterminate. -isIndeterminate returns YES when the value of the
     * totalUnitCount or completedUnitCount property is less than zero. Zero values for both of those properties
     * indicates that there turned out to not be any work to do after all; -isIndeterminate returns NO and
     * -fractionCompleted returns 1.0 in that case. NSProgress is by default KVO-compliant for these properties, with
     * the notifications always being sent on the thread which updates the property.
     */
    @Generated
    @Selector("isIndeterminate")
    public native boolean isIndeterminate();

    @Generated
    @Selector("isPausable")
    public native boolean isPausable();

    @Generated
    @Selector("setPausable:")
    public native void setPausable(boolean value);

    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * Either a string identifying what kind of progress is being made, like NSProgressKindFile, or nil. If the value of
     * the localizedDescription property has not been set to a non-nil value then the default implementation of
     * -localizedDescription uses the progress kind to determine how to use the values of other properties, as well as
     * values in the user info dictionary, to create a string that is presentable to the user. This is most useful when
     * -localizedDescription is actually being invoked in another process, whose localization language may be different,
     * as a result of using the publish and subscribe mechanism described here.
     */
    @Generated
    @Selector("kind")
    public native String kind();

    /**
     * A more specific description of what progress is being made, fit to present to the user. NSProgress is by default
     * KVO-compliant for this property, with the notifications always being sent on thread which updates the property.
     * The default implementation of the getter for this property does not always return the most recently set value of
     * the property. If the most recently set value of this property is nil then NSProgress uses the value of the kind
     * property to determine how to use the values of other properties, as well as values in the user info dictionary,
     * to return a computed string. If it fails to do that then it returns an empty string. The difference between this
     * and localizedDescription is that this text is meant to be more specific about what work is being done at any
     * particular moment.
     * <p>
     * For example, depending on the kind of progress, the completed and total unit counts, and other parameters, these
     * kinds of strings may be generated:
     * 3 of 10 files
     * 123 KB of 789.1 MB
     * 3.3 MB of 103.92 GB — 2 minutes remaining
     * 1.61 GB of 3.22 GB (2 KB/sec) — 2 minutes remaining
     * 1 minute remaining (1 KB/sec)
     */
    @Generated
    @Selector("localizedAdditionalDescription")
    public native String localizedAdditionalDescription();

    /**
     * A description of what progress is being made, fit to present to the user. NSProgress is by default KVO-compliant
     * for this property, with the notifications always being sent on thread which updates the property. The default
     * implementation of the getter for this property does not always return the most recently set value of the
     * property. If the most recently set value of this property is nil then NSProgress uses the value of the kind
     * property to determine how to use the values of other properties, as well as values in the user info dictionary,
     * to return a computed string. If it fails to do that then it returns an empty string.
     * <p>
     * For example, depending on the kind of progress, the completed and total unit counts, and other parameters, these
     * kinds of strings may be generated:
     * Copying 10 files…
     * 30% completed
     * Copying “TextEdit”…
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * Invoke the block registered with the pausingHandler property, if there is one, and set the paused property to
     * YES. Do this for the receiver, any descendants of the receiver, the instance of NSProgress that was published in
     * another process to make the receiver if that's the case, and any descendants of such a published instance of
     * NSProgress.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * A block to be invoked when pause is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("pausingHandler")
    @ObjCBlock(name = "call_pausingHandler_ret")
    public native Block_pausingHandler_ret pausingHandler();

    /**
     * Balance the most recent previous invocation of -becomeCurrentWithPendingUnitCount: on the same thread by
     * restoring the current progress object to what it was before -becomeCurrentWithPendingUnitCount: was invoked.
     */
    @Generated
    @Selector("resignCurrent")
    public native void resignCurrent();

    /**
     * Invoke the block registered with the resumingHandler property, if there is one, and set the paused property to
     * NO. Do this for the receiver, any descendants of the receiver, the instance of NSProgress that was published in
     * another process to make the receiver if that's the case, and any descendants of such a published instance of
     * NSProgress.
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * A block to be invoked when resume is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("resumingHandler")
    @ObjCBlock(name = "call_resumingHandler_ret")
    public native Block_resumingHandler_ret resumingHandler();

    /**
     * A block to be invoked when cancel is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("setCancellationHandler:")
    public native void setCancellationHandler(
            @ObjCBlock(name = "call_setCancellationHandler") Block_setCancellationHandler value);

    @Generated
    @Selector("setCompletedUnitCount:")
    public native void setCompletedUnitCount(long value);

    /**
     * Either a string identifying what kind of progress is being made, like NSProgressKindFile, or nil. If the value of
     * the localizedDescription property has not been set to a non-nil value then the default implementation of
     * -localizedDescription uses the progress kind to determine how to use the values of other properties, as well as
     * values in the user info dictionary, to create a string that is presentable to the user. This is most useful when
     * -localizedDescription is actually being invoked in another process, whose localization language may be different,
     * as a result of using the publish and subscribe mechanism described here.
     */
    @Generated
    @Selector("setKind:")
    public native void setKind(String value);

    /**
     * A more specific description of what progress is being made, fit to present to the user. NSProgress is by default
     * KVO-compliant for this property, with the notifications always being sent on thread which updates the property.
     * The default implementation of the getter for this property does not always return the most recently set value of
     * the property. If the most recently set value of this property is nil then NSProgress uses the value of the kind
     * property to determine how to use the values of other properties, as well as values in the user info dictionary,
     * to return a computed string. If it fails to do that then it returns an empty string. The difference between this
     * and localizedDescription is that this text is meant to be more specific about what work is being done at any
     * particular moment.
     * <p>
     * For example, depending on the kind of progress, the completed and total unit counts, and other parameters, these
     * kinds of strings may be generated:
     * 3 of 10 files
     * 123 KB of 789.1 MB
     * 3.3 MB of 103.92 GB — 2 minutes remaining
     * 1.61 GB of 3.22 GB (2 KB/sec) — 2 minutes remaining
     * 1 minute remaining (1 KB/sec)
     */
    @Generated
    @Selector("setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(String value);

    /**
     * A description of what progress is being made, fit to present to the user. NSProgress is by default KVO-compliant
     * for this property, with the notifications always being sent on thread which updates the property. The default
     * implementation of the getter for this property does not always return the most recently set value of the
     * property. If the most recently set value of this property is nil then NSProgress uses the value of the kind
     * property to determine how to use the values of other properties, as well as values in the user info dictionary,
     * to return a computed string. If it fails to do that then it returns an empty string.
     * <p>
     * For example, depending on the kind of progress, the completed and total unit counts, and other parameters, these
     * kinds of strings may be generated:
     * Copying 10 files…
     * 30% completed
     * Copying “TextEdit”…
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * A block to be invoked when pause is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("setPausingHandler:")
    public native void setPausingHandler(@ObjCBlock(name = "call_setPausingHandler") Block_setPausingHandler value);

    /**
     * A block to be invoked when resume is invoked. The block will be invoked even when the method is invoked on an
     * ancestor of the receiver, or an instance of NSProgress in another process that resulted from publishing the
     * receiver or an ancestor of the receiver. Your block won't be invoked on any particular queue. If it must do work
     * on a specific queue then it should schedule that work on that queue.
     */
    @Generated
    @Selector("setResumingHandler:")
    public native void setResumingHandler(@ObjCBlock(name = "call_setResumingHandler") Block_setResumingHandler value);

    /**
     * The size of the job whose progress is being reported, and how much of it has been completed so far, respectively.
     * For an NSProgress with a kind of NSProgressKindFile, the unit of these properties is bytes while the
     * NSProgressFileTotalCountKey and NSProgressFileCompletedCountKey keys in the userInfo dictionary are used for the
     * overall count of files. For any other kind of NSProgress, the unit of measurement you use does not matter as long
     * as you are consistent. The values may be reported to the user in the localizedDescription and
     * localizedAdditionalDescription.
     * <p>
     * If the receiver NSProgress object is a "leaf progress" (no children), then the fractionCompleted is generally
     * completedUnitCount / totalUnitCount. If the receiver NSProgress has children, the fractionCompleted will reflect
     * progress made in child objects in addition to its own completedUnitCount. As children finish, the
     * completedUnitCount of the parent will be updated.
     */
    @Generated
    @Selector("setTotalUnitCount:")
    public native void setTotalUnitCount(long value);

    /**
     * Set a value in the dictionary returned by invocations of -userInfo, with appropriate KVO notification for
     * properties whose values can depend on values in the user info dictionary, like localizedDescription. If a nil
     * value is passed then the dictionary entry is removed.
     */
    @Generated
    @Selector("setUserInfoObject:forKey:")
    public native void setUserInfoObjectForKey(@Mapped(ObjCObjectMapper.class) Object objectOrNil, String key);

    /**
     * The size of the job whose progress is being reported, and how much of it has been completed so far, respectively.
     * For an NSProgress with a kind of NSProgressKindFile, the unit of these properties is bytes while the
     * NSProgressFileTotalCountKey and NSProgressFileCompletedCountKey keys in the userInfo dictionary are used for the
     * overall count of files. For any other kind of NSProgress, the unit of measurement you use does not matter as long
     * as you are consistent. The values may be reported to the user in the localizedDescription and
     * localizedAdditionalDescription.
     * <p>
     * If the receiver NSProgress object is a "leaf progress" (no children), then the fractionCompleted is generally
     * completedUnitCount / totalUnitCount. If the receiver NSProgress has children, the fractionCompleted will reflect
     * progress made in child objects in addition to its own completedUnitCount. As children finish, the
     * completedUnitCount of the parent will be updated.
     */
    @Generated
    @Selector("totalUnitCount")
    public native long totalUnitCount();

    /**
     * Arbitrary values associated with the receiver. Returns a KVO-compliant dictionary that changes as
     * -setUserInfoObject:forKey: is sent to the receiver. The dictionary will send all of its KVO notifications on the
     * thread which updates the property. The result will never be nil, but may be an empty dictionary. Some entries
     * have meanings that are recognized by the NSProgress class itself. See the NSProgress...Key string constants
     * listed below.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancellationHandler_ret {
        @Generated
        void call_cancellationHandler_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pausingHandler_ret {
        @Generated
        void call_pausingHandler_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumingHandler_ret {
        @Generated
        void call_resumingHandler_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCancellationHandler {
        @Generated
        void call_setCancellationHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPausingHandler {
        @Generated
        void call_setPausingHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setResumingHandler {
        @Generated
        void call_setResumingHandler();
    }

    /**
     * How much time is probably left in the operation, as an NSNumber containing a number of seconds.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("estimatedTimeRemaining")
    public native NSNumber estimatedTimeRemaining();

    /**
     * If the progress is operating on a set of files, then set to the number of completed files in the operation.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("fileCompletedCount")
    public native NSNumber fileCompletedCount();

    /**
     * When the kind property is NSProgressKindFile, this value should be set. It describes the kind of file operation
     * being performed.
     * If present, NSProgress will use the information to present more information in its localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("fileOperationKind")
    public native String fileOperationKind();

    /**
     * If the progress is operating on a set of files, then set to the total number of files in the operation.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("fileTotalCount")
    public native NSNumber fileTotalCount();

    /**
     * A URL identifying the item on which progress is being made. This is required for any NSProgress that is published
     * using -publish to be reported to subscribers registered with +addSubscriberForFileURL:withPublishingHandler:
     * If present, NSProgress will use the information to present more information in its localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("fileURL")
    public native NSURL fileURL();

    /**
     * True if the progress is considered finished. This property is observable.
     */
    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

    /**
     * Become current, do some work, then resign current.
     */
    @Generated
    @Selector("performAsCurrentWithPendingUnitCount:usingBlock:")
    public native void performAsCurrentWithPendingUnitCountUsingBlock(long unitCount,
            @ObjCBlock(name = "call_performAsCurrentWithPendingUnitCountUsingBlock") Block_performAsCurrentWithPendingUnitCountUsingBlock work);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performAsCurrentWithPendingUnitCountUsingBlock {
        @Generated
        void call_performAsCurrentWithPendingUnitCountUsingBlock();
    }

    /**
     * How much time is probably left in the operation, as an NSNumber containing a number of seconds.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setEstimatedTimeRemaining:")
    public native void setEstimatedTimeRemaining(NSNumber value);

    /**
     * If the progress is operating on a set of files, then set to the number of completed files in the operation.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setFileCompletedCount:")
    public native void setFileCompletedCount(NSNumber value);

    /**
     * When the kind property is NSProgressKindFile, this value should be set. It describes the kind of file operation
     * being performed.
     * If present, NSProgress will use the information to present more information in its localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setFileOperationKind:")
    public native void setFileOperationKind(String value);

    /**
     * If the progress is operating on a set of files, then set to the total number of files in the operation.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setFileTotalCount:")
    public native void setFileTotalCount(NSNumber value);

    /**
     * A URL identifying the item on which progress is being made. This is required for any NSProgress that is published
     * using -publish to be reported to subscribers registered with +addSubscriberForFileURL:withPublishingHandler:
     * If present, NSProgress will use the information to present more information in its localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setFileURL:")
    public native void setFileURL(NSURL value);

    /**
     * How fast data is being processed, as an NSNumber containing bytes per second.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("setThroughput:")
    public native void setThroughput(NSNumber value);

    /**
     * How fast data is being processed, as an NSNumber containing bytes per second.
     * This property is optional. If present, NSProgress will use the information to present more information in its
     * localized description.
     * This property sets a value in the userInfo dictionary.
     */
    @Generated
    @Selector("throughput")
    public native NSNumber throughput();
}
