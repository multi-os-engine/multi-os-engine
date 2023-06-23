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
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLVertexDescriptor
 * 
 * Describes the layout of vertex buffers in MDLMesh objects
 * 
 * This object is a property of MDLMesh describing the current state of
 * attributes and buffer layouts of the vertex buffers in the mesh. This must be
 * immutable otherwise even small changes could cause the buffers to be out of sync
 * with the layout described here.
 * 
 * Designed to be very similar to MTLVertexDescriptor to ease creation of one from
 * the other
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLVertexDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLVertexDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLVertexDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLVertexDescriptor allocWithZone(VoidPtr zone);

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
    public static native MDLVertexDescriptor new_objc();

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
     * addOrReplaceAttribute:
     * 
     * Replace any attribute with the same name and time, or add it if it does not
     * already exist.
     */
    @Generated
    @Selector("addOrReplaceAttribute:")
    public native void addOrReplaceAttribute(@NotNull MDLVertexAttribute attribute);

    /**
     * attributeNamed:
     * 
     * Retrieves the attribute with the given name
     * 
     * @return The attribute with the supplied name or nil if attribute with the given
     *         name does not exist in the descriptor object
     */
    @Nullable
    @Generated
    @Selector("attributeNamed:")
    public native MDLVertexAttribute attributeNamed(@NotNull String name);

    /**
     * [@property] attributes
     * 
     * An array of MDLVertexAttribute objects
     * 
     * ay describing the current attribute state of vertex buffers in an
     * MDLMesh mesh
     */
    @NotNull
    @Generated
    @Selector("attributes")
    public native NSMutableArray<MDLVertexAttribute> attributes();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native MDLVertexDescriptor init();

    /**
     * initVertexDescriptor:
     * 
     * Initializes the object with values from supplied vertexDescriptor
     * 
     * This performs a deep copy of all data in the supplied descriptor.
     */
    @Generated
    @Selector("initWithVertexDescriptor:")
    public native MDLVertexDescriptor initWithVertexDescriptor(@NotNull MDLVertexDescriptor vertexDescriptor);

    /**
     * [@property] layouts
     * 
     * An array of MDLVertexBufferLayout
     * 
     * An array describing the current layout state of vertex buffers in an
     * MDLMesh mesh
     */
    @NotNull
    @Generated
    @Selector("layouts")
    public native NSMutableArray<MDLVertexBufferLayout> layouts();

    /**
     * removeAttributeNamed:
     * 
     * Remove the named attribute if it exists
     */
    @Generated
    @Selector("removeAttributeNamed:")
    public native void removeAttributeNamed(@NotNull String name);

    /**
     * reset
     * 
     * Tesets the descriptor to initial values
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * [@property] attributes
     * 
     * An array of MDLVertexAttribute objects
     * 
     * ay describing the current attribute state of vertex buffers in an
     * MDLMesh mesh
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(@NotNull NSMutableArray<MDLVertexAttribute> value);

    /**
     * [@property] layouts
     * 
     * An array of MDLVertexBufferLayout
     * 
     * An array describing the current layout state of vertex buffers in an
     * MDLMesh mesh
     */
    @Generated
    @Selector("setLayouts:")
    public native void setLayouts(@NotNull NSMutableArray<MDLVertexBufferLayout> value);

    /**
     * setPackedOffsets
     * 
     * Sets the stride in each VertexAttribute in the attributes array to
     * the minimum value to pack each attribute next to each other in its
     * vertexbuffer
     */
    @Generated
    @Selector("setPackedOffsets")
    public native void setPackedOffsets();

    /**
     * setPackedStrides
     * 
     * Sets the stride in each VertexBufferLout in the layouts array to the
     * minimum value encompassing all attributes in the vertex buffer
     */
    @Generated
    @Selector("setPackedStrides")
    public native void setPackedStrides();
}
