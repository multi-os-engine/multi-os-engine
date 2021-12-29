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

package apple.replaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.replaykit.protocol.RPBroadcastControllerDelegate;
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
 * RPBroadcastController
 * <p>
 * Available once a user has successfully initiated a broadcast using an RPBroadcastActivityViewController. Can be used to start, pause and stop a broadcast.
 */
@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class RPBroadcastController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected RPBroadcastController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RPBroadcastController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native RPBroadcastController allocWithZone(VoidPtr zone);

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
    public static native RPBroadcastController new_objc();

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
     * bundleID of the broadcast extension which was selected by the user.
     */
    @Generated
    @Selector("broadcastExtensionBundleID")
    public native String broadcastExtensionBundleID();

    /**
     * URL that can be used to redirect the user to the on-going or completed broadcast.
     */
    @Generated
    @Selector("broadcastURL")
    public native NSURL broadcastURL();

    /**
     * Delegate which will be notified when an error occurs during broadcast.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native RPBroadcastControllerDelegate delegate();

    /**
     * Finish the broadcast.
     *
     * @param error Optional error in the RPRecordingErrorCode domain. A nil error signifies that broadcasting has finished successfully.
     */
    @Generated
    @Selector("finishBroadcastWithHandler:")
    public native void finishBroadcastWithHandler(
            @ObjCBlock(name = "call_finishBroadcastWithHandler") Block_finishBroadcastWithHandler handler);

    @Generated
    @Selector("init")
    public native RPBroadcastController init();

    /**
     * Indicates whether the controller is currently broadcasting.
     */
    @Generated
    @Selector("isBroadcasting")
    public native boolean isBroadcasting();

    /**
     * Indicates whether the controller is currently paused.
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * Pause the broadcast. The broadcast will pause immediately.
     */
    @Generated
    @Selector("pauseBroadcast")
    public native void pauseBroadcast();

    /**
     * Resumes the broadcast. The broadcast will resume immediately.
     */
    @Generated
    @Selector("resumeBroadcast")
    public native void resumeBroadcast();

    /**
     * Dictionary updated by the service during a broadcast. The keys and values of this dictionary are defined by the broadcast service. KVO observable.
     */
    @Generated
    @Selector("serviceInfo")
    public native NSDictionary<String, ? extends NSObject> serviceInfo();

    /**
     * Delegate which will be notified when an error occurs during broadcast.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) RPBroadcastControllerDelegate value);

    /**
     * Delegate which will be notified when an error occurs during broadcast.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) RPBroadcastControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Start the broadcast.
     *
     * @param error Optional error in the RPRecordingErrorCode domain. A nil error signifies that broadcasting has started successfully.
     */
    @Generated
    @Selector("startBroadcastWithHandler:")
    public native void startBroadcastWithHandler(
            @ObjCBlock(name = "call_startBroadcastWithHandler") Block_startBroadcastWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_finishBroadcastWithHandler {
        @Generated
        void call_finishBroadcastWithHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startBroadcastWithHandler {
        @Generated
        void call_startBroadcastWithHandler(NSError error);
    }
}
