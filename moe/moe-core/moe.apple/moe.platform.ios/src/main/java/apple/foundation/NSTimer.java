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
public class NSTimer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTimer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTimer alloc();

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
    @Selector("scheduledTimerWithTimeInterval:invocation:repeats:")
    public static native NSTimer scheduledTimerWithTimeIntervalInvocationRepeats(double ti, NSInvocation invocation,
            boolean yesOrNo);

    @Generated
    @Selector("scheduledTimerWithTimeInterval:repeats:block:")
    public static native NSTimer scheduledTimerWithTimeIntervalRepeatsBlock(double interval, boolean repeats,
            @ObjCBlock(name = "call_scheduledTimerWithTimeIntervalRepeatsBlock") Block_scheduledTimerWithTimeIntervalRepeatsBlock block);

    @Generated
    @Selector("scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(double ti,
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object userInfo, boolean yesOrNo);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("timerWithTimeInterval:invocation:repeats:")
    public static native NSTimer timerWithTimeIntervalInvocationRepeats(double ti, NSInvocation invocation,
            boolean yesOrNo);

    @Generated
    @Selector("timerWithTimeInterval:repeats:block:")
    public static native NSTimer timerWithTimeIntervalRepeatsBlock(double interval, boolean repeats,
            @ObjCBlock(name = "call_timerWithTimeIntervalRepeatsBlock") Block_timerWithTimeIntervalRepeatsBlock block);

    @Generated
    @Selector("timerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer timerWithTimeIntervalTargetSelectorUserInfoRepeats(double ti,
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object userInfo, boolean yesOrNo);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("fire")
    public native void fire();

    @Generated
    @Selector("fireDate")
    public native NSDate fireDate();

    @Generated
    @Selector("init")
    public native NSTimer init();

    @Generated
    @Selector("initWithFireDate:interval:repeats:block:")
    public native NSTimer initWithFireDateIntervalRepeatsBlock(NSDate date, double interval, boolean repeats,
            @ObjCBlock(name = "call_initWithFireDateIntervalRepeatsBlock") Block_initWithFireDateIntervalRepeatsBlock block);

    @Generated
    @Selector("initWithFireDate:interval:target:selector:userInfo:repeats:")
    public native NSTimer initWithFireDateIntervalTargetSelectorUserInfoRepeats(NSDate date, double ti,
            @Mapped(ObjCObjectMapper.class) Object t, SEL s, @Mapped(ObjCObjectMapper.class) Object ui, boolean rep);

    @Generated
    @Selector("invalidate")
    public native void invalidate();

    @Generated
    @Selector("isValid")
    public native boolean isValid();

    @Generated
    @Selector("setFireDate:")
    public native void setFireDate(NSDate value);

    @Generated
    @Selector("setTolerance:")
    public native void setTolerance(double value);

    @Generated
    @Selector("timeInterval")
    public native double timeInterval();

    @Generated
    @Selector("tolerance")
    public native double tolerance();

    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithFireDateIntervalRepeatsBlock {
        @Generated
        void call_initWithFireDateIntervalRepeatsBlock(NSTimer arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduledTimerWithTimeIntervalRepeatsBlock {
        @Generated
        void call_scheduledTimerWithTimeIntervalRepeatsBlock(NSTimer arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timerWithTimeIntervalRepeatsBlock {
        @Generated
        void call_timerWithTimeIntervalRepeatsBlock(NSTimer arg0);
    }
}
