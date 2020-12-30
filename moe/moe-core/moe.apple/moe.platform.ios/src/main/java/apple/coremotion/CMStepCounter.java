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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
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
 * CMStepCounter
 * 
 * Discussion:
 *     CMStepCounter allows access to the approximate number of steps a user has taken
 *     with a device.  Steps can be retrieved in one of two ways:
 * 
 *     1. Via a query specifying a time range from which the approximate number of steps is
 *     tabulated and returned. (See queryStepCountStartingFrom:to:toQueue:withHandler)
 * 
 *     2. By providing a queue and a block to startStepCountingUpdatesToQueue:withHandler,
 *     step count updates will be provided on a best effort basis.  Each update will return a
 *     monotonically increasing number of steps counted since
 *     startStepCountingUpdatesToQueue:withHandler was called and a timestamp
 *     associated with the latest stepcount determination.  Step count updates can be stopped
 *     by either calling stopStepCountingUpdates or upon CMStepCounter deallocation.
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMStepCounter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMStepCounter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMStepCounter alloc();

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

    /**
     * isStepCountingAvailable
     * 
     * Discussion:
     *     Determines whether the device supports step counting.
     */
    @Generated
    @Selector("isStepCountingAvailable")
    public static native boolean isStepCountingAvailable();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native CMStepCounter init();

    /**
     * queryStepCountStartingFrom:to:toQueue:withHandler
     * 
     * Discussion:
     *     Queries for the approximate number of steps taken in the given time range, for up to 7 days.
     *     The step count returned is computed from a system wide history that is continuously being
     *     collected in the background.  The result is returned to the handler/queue specified.
     */
    @Generated
    @Selector("queryStepCountStartingFrom:to:toQueue:withHandler:")
    public native void queryStepCountStartingFromToToQueueWithHandler(NSDate start, NSDate end, NSOperationQueue queue,
            @ObjCBlock(name = "call_queryStepCountStartingFromToToQueueWithHandler") Block_queryStepCountStartingFromToToQueueWithHandler handler);

    /**
     * startStepCountingUpdatesToQueue:withHandler
     * 
     * Discussion:
     *      Starts a series of continuous step counting updates to the handler on the designated queue.  For each
     *      update, the app will receive the total step count since this method was called (this includes
     *      subsequent calls) and the timestamp associated with the latest determination.  If the app is backgrounded
     *      and resumed at a later time, the app will receive all of the steps counted during the background
     *      period in the very next update.  The handler will be called when the number of steps (as defined by
     *      the user) has been detected on a best effort basis.
     */
    @Generated
    @Selector("startStepCountingUpdatesToQueue:updateOn:withHandler:")
    public native void startStepCountingUpdatesToQueueUpdateOnWithHandler(NSOperationQueue queue, @NInt long stepCounts,
            @ObjCBlock(name = "call_startStepCountingUpdatesToQueueUpdateOnWithHandler") Block_startStepCountingUpdatesToQueueUpdateOnWithHandler handler);

    /**
     * stopStepCountingUpdates
     * 
     * Discussion:
     *     Stops step counting updates.  Upon deallocation of CMStepCounter, this function will be
     *     automatically invoked if updates are still active and stopStepCountingUpdates has not been
     *     called.
     */
    @Generated
    @Selector("stopStepCountingUpdates")
    public native void stopStepCountingUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryStepCountStartingFromToToQueueWithHandler {
        @Generated
        void call_queryStepCountStartingFromToToQueueWithHandler(@NInt long numberOfSteps, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startStepCountingUpdatesToQueueUpdateOnWithHandler {
        @Generated
        void call_startStepCountingUpdatesToQueueUpdateOnWithHandler(@NInt long numberOfSteps, NSDate timestamp,
                NSError error);
    }
}
