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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.modelio.protocol.MDLNamed;
import apple.modelio.protocol.MDLObjectContainerComponent;
import apple.modelio.protocol.MDLTransformComponent;
import apple.scenekit.SCNNode;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLObject
 * 
 * Base class for object in a ModelIO asset hierarchy
 * 
 * Includes transformation and bounds info, links to parent and
 * children in the hierachy
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLObject extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLObject(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLObject alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLObject allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MDLObject new_objc();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLObject objectWithSCNNode(@NotNull SCNNode scnNode);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLObject objectWithSCNNodeBufferAllocator(@NotNull SCNNode scnNode,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
     * addChild:
     * 
     * Short hand for adding a child to the current container component and
     * setting the parent to this object.
     * 
     * It will create a default container if none exists. If children are
     * explicitly disallowed for an object, then add a container component
     * that throws on addition.
     * 
     * @see MDLObjectContainer
     */
    @Generated
    @Selector("addChild:")
    public native void addChild(@NotNull MDLObject child);

    /**
     * [@property] children
     * 
     * Short hand property for the MDLObjectContainerComponent.
     * 
     * The default value is an empty MDLObjectContainer
     * 
     * @see MDLObjectContainerComponent
     */
    @NotNull
    @Generated
    @Selector("children")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent children();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("enumerateChildObjectsOfClass:root:usingBlock:stopPointer:")
    public native void enumerateChildObjectsOfClassRootUsingBlockStopPointer(@NotNull Class objectClass,
            @NotNull MDLObject root,
            @NotNull @ObjCBlock(name = "call_enumerateChildObjectsOfClassRootUsingBlockStopPointer") Block_enumerateChildObjectsOfClassRootUsingBlockStopPointer block,
            @NotNull BoolPtr stopPointer);

    /**
     * [@property] hidden
     * 
     * Visibility of the node
     * 
     * default is NO
     */
    @Generated
    @Selector("hidden")
    public native boolean hidden();

    @Generated
    @Selector("init")
    public native MDLObject init();

    /**
     * [@property] instance
     * 
     * Instance object
     * 
     * nil, unless this object refers to original data to be instanced. The
     * original data object can be any MDLObject that does not have a parent.
     * If an MDLAsset has been created from a data file, any original objects
     * parsed from that file will be found in the originals property.
     * A typical use of a original and instance might be to have one original
     * chair MDLObject, and instance six chairs around a table. The
     * transform of each chair would be found on the parent MDLObject, but
     * the various items making up the chair would be found in the original
     * object.
     */
    @Nullable
    @Generated
    @Selector("instance")
    public native MDLObject instance();

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Return the object at the specified path, or nil if none exists there
     */
    @NotNull
    @Generated
    @Selector("objectAtPath:")
    public native MDLObject objectAtPath(@NotNull String path);

    /**
     * [@property] parent
     * 
     * Parent object. Nil if no parent.
     * 
     * Set to nil when you remove this from an object container inside the
     * parent object.
     */
    @Nullable
    @Generated
    @Selector("parent")
    public native MDLObject parent();

    /**
     * [@property] path
     * 
     * a string representing a path to the object
     * 
     * a path is of the form /path/to/object where the path is formed by
     * concatenating the names of the objects up the parent chain.
     * Requesting a path will force any unnamed objects to became uniquely
     * named. Any characters outside of [A-Z][a-z][0-9][:-_.] will be
     * forced to underscore.
     */
    @NotNull
    @Generated
    @Selector("path")
    public native String path();

    /**
     * [@property] children
     * 
     * Short hand property for the MDLObjectContainerComponent.
     * 
     * The default value is an empty MDLObjectContainer
     * 
     * @see MDLObjectContainerComponent
     */
    @Generated
    @Selector("setChildren:")
    public native void setChildren(@NotNull @Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    /**
     * [@property] hidden
     * 
     * Visibility of the node
     * 
     * default is NO
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * [@property] instance
     * 
     * Instance object
     * 
     * nil, unless this object refers to original data to be instanced. The
     * original data object can be any MDLObject that does not have a parent.
     * If an MDLAsset has been created from a data file, any original objects
     * parsed from that file will be found in the originals property.
     * A typical use of a original and instance might be to have one original
     * chair MDLObject, and instance six chairs around a table. The
     * transform of each chair would be found on the parent MDLObject, but
     * the various items making up the chair would be found in the original
     * object.
     */
    @Generated
    @Selector("setInstance:")
    public native void setInstance(@Nullable MDLObject value);

    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    /**
     * [@property] parent
     * 
     * Parent object. Nil if no parent.
     * 
     * Set to nil when you remove this from an object container inside the
     * parent object.
     */
    @Generated
    @Selector("setParent:")
    public native void setParent_unsafe(@Nullable MDLObject value);

    /**
     * [@property] parent
     * 
     * Parent object. Nil if no parent.
     * 
     * Set to nil when you remove this from an object container inside the
     * parent object.
     */
    @Generated
    public void setParent(@Nullable MDLObject value) {
        Object __old = parent();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setParent_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] transform
     * 
     * Short hand property for the MDLTransformComponent.
     * 
     * The default value is nil
     * 
     * @see MDLTransformComponent
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(@Nullable @Mapped(ObjCObjectMapper.class) MDLTransformComponent value);

    /**
     * [@property] transform
     * 
     * Short hand property for the MDLTransformComponent.
     * 
     * The default value is nil
     * 
     * @see MDLTransformComponent
     */
    @Nullable
    @Generated
    @Selector("transform")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLTransformComponent transform();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildObjectsOfClassRootUsingBlockStopPointer {
        @Generated
        void call_enumerateChildObjectsOfClassRootUsingBlockStopPointer(@NotNull MDLObject object,
                @NotNull BoolPtr stop);
    }

    /**
     * [@property] components
     * 
     * Allows applications to introspect the components on the objects.
     */
    @NotNull
    @Generated
    @Selector("components")
    public native NSArray<?> components();
}
