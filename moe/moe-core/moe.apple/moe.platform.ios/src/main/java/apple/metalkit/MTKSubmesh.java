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

package apple.metalkit;

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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MTKSubmesh
 * <p>
 * A segment of a mesh and properties to render the segement.
 * <p>
 * Container for data that can be rendered in a single draw call. 1:1 mapping to MDLSubmesh.  Each submesh contains an index Buffer with which the parents mesh data can be rendered.  Actual vertex data resides in the submesh's parent MTKMesh object.
 */
@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKSubmesh extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKSubmesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKSubmesh alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTKSubmesh allocWithZone(VoidPtr zone);

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
    public static native MTKSubmesh new_objc();

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
     * [@property] indexBuffer
     * <p>
     * IndexBuffer (including indexCount) to render the object.
     * <p>
     * The MTLBuffer to use for indexBuffer parameter in a [MTLRenderCommandEncoder drawIndexedPrimitives] call.
     */
    @Generated
    @Selector("indexBuffer")
    public native MTKMeshBuffer indexBuffer();

    /**
     * [@property] indexCount
     * <p>
     * Number of indicies in indexBuffer.
     * <p>
     * Value to use for indexCount parameter in a [MTLRenderCommandEncoder drawIndexedPrimitives] call.
     */
    @Generated
    @Selector("indexCount")
    @NUInt
    public native long indexCount();

    /**
     * [@property] indexType
     * <p>
     * Metal index type of data in indexBuffer.
     * <p>
     * Value to use for indexType parameter in a [MTLRenderCommandEncoder drawIndexedPrimitives] call.
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MTKSubmesh init();

    /**
     * [@property] mesh
     * <p>
     * Parent MTKMesh object containing vertex data of this object.
     * <p>
     * The buffer of this parent mesh should be set in the encoder before a drawIndexedPrimitives call is made.
     */
    @Generated
    @Selector("mesh")
    public native MTKMesh mesh();

    /**
     * [@property] name
     * <p>
     * Name from the original MDLSubmesh object.
     * <p>
     * Although not directly used by this object, the application may use this to identify the submesh in the renderer/scene/world.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] primitiveType
     * <p>
     * Metal primitive type with which to draw this object.
     * <p>
     * Value to use for primitiveType parameter in a [MTLRenderCommandEncoder drawIndexedPrimitives] call.
     */
    @Generated
    @Selector("primitiveType")
    @NUInt
    public native long primitiveType();

    /**
     * [@property] name
     * <p>
     * Name from the original MDLSubmesh object.
     * <p>
     * Although not directly used by this object, the application may use this to identify the submesh in the renderer/scene/world.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);
}
