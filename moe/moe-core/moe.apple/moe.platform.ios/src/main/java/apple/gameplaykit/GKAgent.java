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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.protocol.GKAgentDelegate;
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
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKAgent extends GKComponent {
    static {
        NatJ.register();
    }

    @Generated
    protected GKAgent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKAgent alloc();

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
     * behavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/behavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("behavior")
    public native GKBehavior behavior();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKAgentDelegate delegate();

    @Generated
    @Selector("init")
    public native GKAgent init();

    /**
     * mass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/mass">iOS Dev Center</a>
     */
    @Generated
    @Selector("mass")
    public native float mass();

    /**
     * maxAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/maxAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxAcceleration")
    public native float maxAcceleration();

    /**
     * maxSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/maxSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxSpeed")
    public native float maxSpeed();

    /**
     * radius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/radius">iOS Dev Center</a>
     */
    @Generated
    @Selector("radius")
    public native float radius();

    /**
     * behavior</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/behavior">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBehavior:")
    public native void setBehavior(GKBehavior value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GKAgentDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) GKAgentDelegate value) {
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
     * mass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/mass">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMass:")
    public native void setMass(float value);

    /**
     * maxAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/maxAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaxAcceleration:")
    public native void setMaxAcceleration(float value);

    /**
     * maxSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/maxSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaxSpeed:")
    public native void setMaxSpeed(float value);

    /**
     * radius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/radius">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRadius:")
    public native void setRadius(float value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKAgent_Class/index.html#//apple_ref/occ/instp/GKAgent/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    public native float speed();
}
