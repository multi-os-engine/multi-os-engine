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

/**
 * MDLVertexAttribute
 * 
 * Structure with properties of a vertex attribute
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLVertexAttribute extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLVertexAttribute(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLVertexAttribute alloc();

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
     * [@property] bufferIndex
     * 
     * index of the buffer in mesh's vertexBuffer array in which this
     *           attribute resides
     */
    @Generated
    @Selector("bufferIndex")
    @NUInt
    public native long bufferIndex();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] format
     * 
     * Format (including number of components) of the attribute
     * 
     * If the value is MDLVertexFormatInvalid.   Other values of this
     *             object will be ignored when setting the MDLVertexDescriptor object 
     *             in a Mesh. The initial value is MDLVertexFormatInvalid.
     */
    @Generated
    @Selector("format")
    @NUInt
    public native long format();

    @Generated
    @Selector("init")
    public native MDLVertexAttribute init();

    /**
     * initWithName:format:offset:bufferIndex
     * 
     * Initialize attribute object with all properties
     */
    @Generated
    @Selector("initWithName:format:offset:bufferIndex:")
    public native MDLVertexAttribute initWithNameFormatOffsetBufferIndex(String name, @NUInt long format,
            @NUInt long offset, @NUInt long bufferIndex);

    /**
     * [@property] name
     * 
     * Identifying name of the attribute derived from model file, or one of
     *           the predefined MDLVertexAttribute strings
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] offset
     * 
     * offset in bytes of the attrbute in each element of the vertex buffer
     */
    @Generated
    @Selector("offset")
    @NUInt
    public native long offset();

    /**
     * [@property] bufferIndex
     * 
     * index of the buffer in mesh's vertexBuffer array in which this
     *           attribute resides
     */
    @Generated
    @Selector("setBufferIndex:")
    public native void setBufferIndex(@NUInt long value);

    /**
     * [@property] format
     * 
     * Format (including number of components) of the attribute
     * 
     * If the value is MDLVertexFormatInvalid.   Other values of this
     *             object will be ignored when setting the MDLVertexDescriptor object 
     *             in a Mesh. The initial value is MDLVertexFormatInvalid.
     */
    @Generated
    @Selector("setFormat:")
    public native void setFormat(@NUInt long value);

    /**
     * [@property] name
     * 
     * Identifying name of the attribute derived from model file, or one of
     *           the predefined MDLVertexAttribute strings
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * [@property] offset
     * 
     * offset in bytes of the attrbute in each element of the vertex buffer
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@NUInt long value);

    /**
     * [@property] time
     * 
     * the time the attribute is intended for.
     * 
     * morph targets would store their times here
     */
    @Generated
    @Selector("setTime:")
    public native void setTime(double value);

    /**
     * [@property] time
     * 
     * the time the attribute is intended for.
     * 
     * morph targets would store their times here
     */
    @Generated
    @Selector("time")
    public native double time();
}
