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

package apple.javascriptcore;

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

/**
 * [@interface]
 * 
 * An instance of JSVirtualMachine represents a single JavaScript "object space"
 *  or set of execution resources. Thread safety is supported by locking the
 *  virtual machine, with concurrent JavaScript execution supported by allocating
 *  separate instances of JSVirtualMachine.
 * 
 *  A virtual machine may need to run deferred tasks on a run loop, such as garbage collection
 *  or resolving WebAssembly compilations. By default, a virtual machine will use the run loop
 *  of the thread it was initialized on. Currently, there is no API to change a
 *  JSVirtualMachine's run loop once it has been initialized.
 */
@Generated
@Library("JavaScriptCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class JSVirtualMachine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected JSVirtualMachine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native JSVirtualMachine alloc();

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

    /**
     * [@methodgroup] Memory Management
     * 
     * Notify the JSVirtualMachine of an external object relationship.
     * 
     * Allows clients of JSVirtualMachine to make the JavaScript runtime aware of
     *  arbitrary external Objective-C object graphs. The runtime can then use 
     *  this information to retain any JavaScript values that are referenced 
     *  from somewhere in said object graph.
     * 
     *  For correct behavior clients must make their external object graphs 
     *  reachable from within the JavaScript runtime. If an Objective-C object is 
     *  reachable from within the JavaScript runtime, all managed references 
     *  transitively reachable from it as recorded using
     *  -addManagedReference:withOwner: will be scanned by the garbage collector.
     * 
     * @param object The object that the owner points to.
     * @param owner The object that owns the pointed to object.
     */
    @Generated
    @Selector("addManagedReference:withOwner:")
    public native void addManagedReferenceWithOwner(@Mapped(ObjCObjectMapper.class) Object object,
            @Mapped(ObjCObjectMapper.class) Object owner);

    /**
     * [@methodgroup] Creating New Virtual Machines
     * 
     * Create a new JSVirtualMachine.
     */
    @Generated
    @Selector("init")
    public native JSVirtualMachine init();

    /**
     * Notify the JSVirtualMachine that a previous object relationship no longer exists.
     * 
     * The JavaScript runtime will continue to scan any references that were
     *  reported to it by -addManagedReference:withOwner: until those references are removed.
     * 
     * @param object The object that was formerly owned.
     * @param owner The former owner.
     */
    @Generated
    @Selector("removeManagedReference:withOwner:")
    public native void removeManagedReferenceWithOwner(@Mapped(ObjCObjectMapper.class) Object object,
            @Mapped(ObjCObjectMapper.class) Object owner);
}
