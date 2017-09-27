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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSProgressReporting;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionTask extends NSObject implements NSCopying, NSProgressReporting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSessionTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionTask alloc();

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
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("countOfBytesExpectedToReceive")
    public native long countOfBytesExpectedToReceive();

    @Generated
    @Selector("countOfBytesExpectedToSend")
    public native long countOfBytesExpectedToSend();

    @Generated
    @Selector("countOfBytesReceived")
    public native long countOfBytesReceived();

    @Generated
    @Selector("countOfBytesSent")
    public native long countOfBytesSent();

    @Generated
    @Selector("currentRequest")
    public native NSURLRequest currentRequest();

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native NSURLSessionTask init();

    @Generated
    @Selector("originalRequest")
    public native NSURLRequest originalRequest();

    @Generated
    @Selector("priority")
    public native float priority();

    @Generated
    @Selector("response")
    public native NSURLResponse response();

    @Generated
    @Selector("resume")
    public native void resume();

    @Generated
    @Selector("setPriority:")
    public native void setPriority(float value);

    @Generated
    @Selector("setTaskDescription:")
    public native void setTaskDescription(String value);

    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Selector("suspend")
    public native void suspend();

    @Generated
    @Selector("taskDescription")
    public native String taskDescription();

    @Generated
    @Selector("taskIdentifier")
    @NUInt
    public native long taskIdentifier();

    @Generated
    @Selector("countOfBytesClientExpectsToReceive")
    public native long countOfBytesClientExpectsToReceive();

    @Generated
    @Selector("countOfBytesClientExpectsToSend")
    public native long countOfBytesClientExpectsToSend();

    @Generated
    @Selector("earliestBeginDate")
    public native NSDate earliestBeginDate();

    @Generated
    @Selector("progress")
    public native NSProgress progress();

    @Generated
    @Selector("setCountOfBytesClientExpectsToReceive:")
    public native void setCountOfBytesClientExpectsToReceive(long value);

    @Generated
    @Selector("setCountOfBytesClientExpectsToSend:")
    public native void setCountOfBytesClientExpectsToSend(long value);

    @Generated
    @Selector("setEarliestBeginDate:")
    public native void setEarliestBeginDate(NSDate value);
}
