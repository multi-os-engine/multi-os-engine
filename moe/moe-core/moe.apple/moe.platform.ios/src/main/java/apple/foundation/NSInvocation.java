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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSInvocation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSInvocation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSInvocation alloc();

    /**
     * argumentsRetained</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/argumentsRetained">iOS Dev Center</a>
     */
    @Generated
    @Selector("argumentsRetained")
    public native boolean argumentsRetained();

    /**
     * getArgument:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/getArgument:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getArgument:atIndex:")
    public native void getArgumentAtIndex(VoidPtr argumentLocation, @NInt long idx);

    /**
     * getReturnValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/getReturnValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getReturnValue:")
    public native void getReturnValue(VoidPtr retLoc);

    @Generated
    @Selector("init")
    public native NSInvocation init();

    /**
     * invocationWithMethodSignature:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/clm/NSInvocation/invocationWithMethodSignature:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invocationWithMethodSignature:")
    public static native NSInvocation invocationWithMethodSignature(NSMethodSignature sig);

    /**
     * invoke</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/invoke">iOS Dev Center</a>
     */
    @Generated
    @Selector("invoke")
    public native void invoke();

    /**
     * invokeWithTarget:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/invokeWithTarget:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invokeWithTarget:")
    public native void invokeWithTarget(@Mapped(ObjCObjectMapper.class) Object target);

    /**
     * methodSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/methodSignature">iOS Dev Center</a>
     */
    @Generated
    @Selector("methodSignature")
    public native NSMethodSignature methodSignature();

    /**
     * retainArguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/retainArguments">iOS Dev Center</a>
     */
    @Generated
    @Selector("retainArguments")
    public native void retainArguments();

    /**
     * selector</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/selector">iOS Dev Center</a>
     */
    @Generated
    @Selector("selector")
    public native SEL selector();

    /**
     * setArgument:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/setArgument:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setArgument:atIndex:")
    public native void setArgumentAtIndex(VoidPtr argumentLocation, @NInt long idx);

    /**
     * setReturnValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instm/NSInvocation/setReturnValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReturnValue:")
    public native void setReturnValue(VoidPtr retLoc);

    /**
     * selector</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/selector">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelector:")
    public native void setSelector(SEL value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/target">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/target">iOS Dev Center</a>
     */
    @Generated
    public void setTarget(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * target</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInvocation_Class/index.html#//apple_ref/occ/instp/NSInvocation/target">iOS Dev Center</a>
     */
    @Generated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

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
    public static native long version();
}
