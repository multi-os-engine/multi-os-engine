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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHContentEditingInputRequestOptions extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHContentEditingInputRequestOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHContentEditingInputRequestOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHContentEditingInputRequestOptions allocWithZone(VoidPtr zone);

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
    public static native PHContentEditingInputRequestOptions new_objc();

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
     * Block to be provided by the client, used to determine if the given adjustment data can be handled (i.e. can be
     * decoded and rendered).
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("canHandleAdjustmentData")
    @ObjCBlock(name = "call_canHandleAdjustmentData_ret")
    public native Block_canHandleAdjustmentData_ret canHandleAdjustmentData();

    @Generated
    @Selector("init")
    public native PHContentEditingInputRequestOptions init();

    /**
     * Used if data is not available locally and needs to be retrieved from iCloud.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();

    /**
     * Used if data is not available locally and needs to be retrieved from iCloud.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    public native Block_progressHandler_ret progressHandler();

    /**
     * Block to be provided by the client, used to determine if the given adjustment data can be handled (i.e. can be
     * decoded and rendered).
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setCanHandleAdjustmentData:")
    public native void setCanHandleAdjustmentData(
            @ObjCBlock(name = "call_setCanHandleAdjustmentData") Block_setCanHandleAdjustmentData value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setProgressHandler:")
    public native void setProgressHandler(@ObjCBlock(name = "call_setProgressHandler") Block_setProgressHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_canHandleAdjustmentData_ret {
        @Generated
        boolean call_canHandleAdjustmentData_ret(PHAdjustmentData arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_progressHandler_ret {
        @Generated
        void call_progressHandler_ret(double arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCanHandleAdjustmentData {
        @Generated
        boolean call_setCanHandleAdjustmentData(PHAdjustmentData arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProgressHandler {
        @Generated
        void call_setProgressHandler(double arg0, BoolPtr arg1);
    }
}
