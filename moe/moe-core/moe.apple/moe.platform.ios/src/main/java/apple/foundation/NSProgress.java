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
    @Selector("currentProgress")
    public static native NSProgress currentProgress();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("progressWithTotalUnitCount:")
    public static native NSProgress progressWithTotalUnitCount(long unitCount);

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

    @Generated
    @Selector("addChild:withPendingUnitCount:")
    public native void addChildWithPendingUnitCount(NSProgress child, long inUnitCount);

    @Generated
    @Selector("becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrentWithPendingUnitCount(long unitCount);

    @Generated
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Selector("cancellationHandler")
    @ObjCBlock(name = "call_cancellationHandler_ret")
    public native Block_cancellationHandler_ret cancellationHandler();

    @Generated
    @Selector("completedUnitCount")
    public native long completedUnitCount();

    @Generated
    @Selector("fractionCompleted")
    public native double fractionCompleted();

    @Generated
    @Selector("init")
    public native NSProgress init();

    @Generated
    @Selector("initWithParent:userInfo:")
    public native NSProgress initWithParentUserInfo(NSProgress parentProgressOrNil,
            NSDictionary<String, ?> userInfoOrNil);

    @Generated
    @Selector("isCancellable")
    public native boolean isCancellable();

    @Generated
    @Selector("setCancellable:")
    public native void setCancellable(boolean value);

    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

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

    @Generated
    @Selector("kind")
    public native String kind();

    @Generated
    @Selector("localizedAdditionalDescription")
    public native String localizedAdditionalDescription();

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("pausingHandler")
    @ObjCBlock(name = "call_pausingHandler_ret")
    public native Block_pausingHandler_ret pausingHandler();

    @Generated
    @Selector("resignCurrent")
    public native void resignCurrent();

    @Generated
    @Selector("resume")
    public native void resume();

    @Generated
    @Selector("resumingHandler")
    @ObjCBlock(name = "call_resumingHandler_ret")
    public native Block_resumingHandler_ret resumingHandler();

    @Generated
    @Selector("setCancellationHandler:")
    public native void setCancellationHandler(
            @ObjCBlock(name = "call_setCancellationHandler") Block_setCancellationHandler value);

    @Generated
    @Selector("setCompletedUnitCount:")
    public native void setCompletedUnitCount(long value);

    @Generated
    @Selector("setKind:")
    public native void setKind(String value);

    @Generated
    @Selector("setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(String value);

    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    @Generated
    @Selector("setPausingHandler:")
    public native void setPausingHandler(@ObjCBlock(name = "call_setPausingHandler") Block_setPausingHandler value);

    @Generated
    @Selector("setResumingHandler:")
    public native void setResumingHandler(@ObjCBlock(name = "call_setResumingHandler") Block_setResumingHandler value);

    @Generated
    @Selector("setTotalUnitCount:")
    public native void setTotalUnitCount(long value);

    @Generated
    @Selector("setUserInfoObject:forKey:")
    public native void setUserInfoObjectForKey(@Mapped(ObjCObjectMapper.class) Object objectOrNil, String key);

    @Generated
    @Selector("totalUnitCount")
    public native long totalUnitCount();

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

    @Generated
    @Selector("estimatedTimeRemaining")
    public native NSNumber estimatedTimeRemaining();

    @Generated
    @Selector("fileCompletedCount")
    public native NSNumber fileCompletedCount();

    @Generated
    @Selector("fileOperationKind")
    public native String fileOperationKind();

    @Generated
    @Selector("fileTotalCount")
    public native NSNumber fileTotalCount();

    @Generated
    @Selector("fileURL")
    public native NSURL fileURL();

    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

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

    @Generated
    @Selector("setEstimatedTimeRemaining:")
    public native void setEstimatedTimeRemaining(NSNumber value);

    @Generated
    @Selector("setFileCompletedCount:")
    public native void setFileCompletedCount(NSNumber value);

    @Generated
    @Selector("setFileOperationKind:")
    public native void setFileOperationKind(String value);

    @Generated
    @Selector("setFileTotalCount:")
    public native void setFileTotalCount(NSNumber value);

    @Generated
    @Selector("setFileURL:")
    public native void setFileURL(NSURL value);

    @Generated
    @Selector("setThroughput:")
    public native void setThroughput(NSNumber value);

    @Generated
    @Selector("throughput")
    public native NSNumber throughput();
}
