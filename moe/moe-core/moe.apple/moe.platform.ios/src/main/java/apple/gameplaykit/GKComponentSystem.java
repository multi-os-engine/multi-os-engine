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
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A component system is a homogeneous collection of components that are intended to be called at the same time.
 * The system is homogeneous, meaning it only allows members of the same class into the system.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKComponentSystem<_ComponentType> extends NSObject implements NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected GKComponentSystem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKComponentSystem<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKComponentSystem<?> allocWithZone(VoidPtr zone);

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
    public static native GKComponentSystem<?> new_objc();

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
     * Adds a component to the system. The component must be of the same class as the system's componentClass.
     * The component is added to the tail of the collection and will be processed after components that were added
     * before it.
     * 
     * @throws NSInvalidArgumentException if the component added is not a kind of the system's componentClass.
     */
    @Generated
    @Selector("addComponent:")
    public native void addComponent(GKComponent component);

    /**
     * Adds the supported component from the entity's component collection.
     * This is conceptually the same as the pseudo-code:
     * 
     * for (GKComponent *component in entity.components)
     * if (component.class == system.componentClass)
     * [system addComponent:component]
     * 
     * @see GKEntity.components
     */
    @Generated
    @Selector("addComponentWithEntity:")
    public native void addComponentWithEntity(GKEntity entity);

    /**
     * Returns the class of the specified generic index
     */
    @Generated
    @Selector("classForGenericArgumentAtIndex:")
    public native Class classForGenericArgumentAtIndex(@NUInt long index);

    /**
     * The collection's component class. Any selector the component supports can be called on the system and it will be
     * forwarded
     * to each of the components in the collection.
     */
    @Generated
    @Selector("componentClass")
    public native Class componentClass();

    /**
     * The array of components currently in the system.
     */
    @Generated
    @Selector("components")
    public native NSArray<? extends GKComponent> components();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("init")
    public native GKComponentSystem<?> init();

    /**
     * Initializes a system for the given component class. The receiver can now only accept components of the given
     * class.
     */
    @Generated
    @Selector("initWithComponentClass:")
    public native GKComponentSystem<?> initWithComponentClass(Class cls);

    /**
     * Supports getting components via a [] subscript.
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native GKComponent objectAtIndexedSubscript(@NUInt long idx);

    /**
     * Removes a component from the system
     * 
     * Does nothing if the component is not in this system
     */
    @Generated
    @Selector("removeComponent:")
    public native void removeComponent(GKComponent component);

    /**
     * Removes the supported component from the entity's component collection
     * This is conceptually the same as the pseudo-code:
     * 
     * for (GKComponent *component in entity.components)
     * if (component.class == system.componentClass)
     * [system removeComponent:component]
     */
    @Generated
    @Selector("removeComponentWithEntity:")
    public native void removeComponentWithEntity(GKEntity entity);

    /**
     * Updates each component with the given delta time since the last update. Each component thus performs its time
     * based logic with a single message.
     */
    @Generated
    @Selector("updateWithDeltaTime:")
    public native void updateWithDeltaTime(double seconds);
}
