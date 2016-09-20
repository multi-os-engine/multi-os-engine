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
    @Owned
    @Selector("alloc")
    public static native NSProgress alloc();

    /**
     * currentProgress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/clm/NSProgress/currentProgress">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentProgress")
    public static native NSProgress currentProgress();

    /**
     * progressWithTotalUnitCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/clm/NSProgress/progressWithTotalUnitCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("progressWithTotalUnitCount:")
    public static native NSProgress progressWithTotalUnitCount(long unitCount);

    /**
     * discreteProgressWithTotalUnitCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/clm/NSProgress/discreteProgressWithTotalUnitCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discreteProgressWithTotalUnitCount:")
    public static native NSProgress discreteProgressWithTotalUnitCount(long unitCount);

    /**
     * progressWithTotalUnitCount:parent:pendingUnitCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/clm/NSProgress/progressWithTotalUnitCount:parent:pendingUnitCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("progressWithTotalUnitCount:parent:pendingUnitCount:")
    public static native NSProgress progressWithTotalUnitCountParentPendingUnitCount(long unitCount, NSProgress parent,
            long portionOfParentTotalUnitCount);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * becomeCurrentWithPendingUnitCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/becomeCurrentWithPendingUnitCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrentWithPendingUnitCount(long unitCount);

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * completedUnitCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/completedUnitCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("completedUnitCount")
    public native long completedUnitCount();

    /**
     * fractionCompleted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/fractionCompleted">iOS Dev Center</a>
     */
    @Generated
    @Selector("fractionCompleted")
    public native double fractionCompleted();

    @Generated
    @Selector("init")
    public native NSProgress init();

    /**
     * initWithParent:userInfo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/initWithParent:userInfo:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithParent:userInfo:")
    public native NSProgress initWithParentUserInfo(NSProgress parentProgressOrNil, NSDictionary<?, ?> userInfoOrNil);

    /**
     * cancellable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/cancellable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCancellable")
    public native boolean isCancellable();

    /**
     * cancellable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/cancellable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCancellable:")
    public native void setCancellable(boolean value);

    /**
     * cancelled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/cancelled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * indeterminate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/indeterminate">iOS Dev Center</a>
     */
    @Generated
    @Selector("isIndeterminate")
    public native boolean isIndeterminate();

    /**
     * pausable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/pausable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPausable")
    public native boolean isPausable();

    /**
     * pausable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/pausable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPausable:")
    public native void setPausable(boolean value);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * kind</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/kind">iOS Dev Center</a>
     */
    @Generated
    @Selector("kind")
    public native String kind();

    /**
     * localizedAdditionalDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/localizedAdditionalDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedAdditionalDescription")
    public native String localizedAdditionalDescription();

    /**
     * localizedDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/localizedDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * pause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/pause">iOS Dev Center</a>
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * resignCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/resignCurrent">iOS Dev Center</a>
     */
    @Generated
    @Selector("resignCurrent")
    public native void resignCurrent();

    /**
     * cancellationHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/cancellationHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCancellationHandler:")
    public native void setCancellationHandler(
            @ObjCBlock(name = "call_setCancellationHandler") Block_setCancellationHandler value);

    /**
     * completedUnitCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/completedUnitCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCompletedUnitCount:")
    public native void setCompletedUnitCount(long value);

    /**
     * kind</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/kind">iOS Dev Center</a>
     */
    @Generated
    @Selector("setKind:")
    public native void setKind(String value);

    /**
     * localizedAdditionalDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/localizedAdditionalDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(String value);

    /**
     * localizedDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/localizedDescription">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(String value);

    /**
     * pausingHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/pausingHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPausingHandler:")
    public native void setPausingHandler(@ObjCBlock(name = "call_setPausingHandler") Block_setPausingHandler value);

    /**
     * totalUnitCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/totalUnitCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTotalUnitCount:")
    public native void setTotalUnitCount(long value);

    /**
     * setUserInfoObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/setUserInfoObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInfoObject:forKey:")
    public native void setUserInfoObjectForKey(@Mapped(ObjCObjectMapper.class) Object objectOrNil, String key);

    /**
     * totalUnitCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/totalUnitCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("totalUnitCount")
    public native long totalUnitCount();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * cancellationHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/cancellationHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancellationHandler")
    @ObjCBlock(name = "call_cancellationHandler_ret")
    public native Block_cancellationHandler_ret cancellationHandler();

    /**
     * pausingHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/pausingHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("pausingHandler")
    @ObjCBlock(name = "call_pausingHandler_ret")
    public native Block_pausingHandler_ret pausingHandler();

    /**
     * addChild:withPendingUnitCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/addChild:withPendingUnitCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addChild:withPendingUnitCount:")
    public native void addChildWithPendingUnitCount(NSProgress child, long inUnitCount);

    /**
     * resume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instm/NSProgress/resume">iOS Dev Center</a>
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * resumingHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/resumingHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("resumingHandler")
    @ObjCBlock(name = "call_resumingHandler_ret")
    public native Block_resumingHandler_ret resumingHandler();

    /**
     * resumingHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSProgress_Class/index.html#//apple_ref/occ/instp/NSProgress/resumingHandler">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResumingHandler:")
    public native void setResumingHandler(@ObjCBlock(name = "call_setResumingHandler") Block_setResumingHandler value);

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
    public interface Block_setResumingHandler {
        @Generated
        void call_setResumingHandler();
    }
}
