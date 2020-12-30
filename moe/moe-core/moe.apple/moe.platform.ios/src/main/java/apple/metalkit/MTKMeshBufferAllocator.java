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
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.modelio.protocol.MDLMeshBuffer;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.modelio.protocol.MDLMeshBufferZone;
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
 * @class MTKMeshBufferAllocator
 * @abstract Allocator passed to MDLAsset init method to load vertex and index data directly into Metal buffers.
 */
@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKMeshBufferAllocator extends NSObject implements MDLMeshBufferAllocator {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKMeshBufferAllocator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKMeshBufferAllocator alloc();

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
     * @property device
     * @abstract Device used to create buffers.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("init")
    public native MTKMeshBufferAllocator init();

    /**
     * @method initWithDevice
     * @abstract Initialize the allocator with a device to be used to create buffers.
     * @discussion The designated initializer for this class.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MTKMeshBufferAllocator initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("newBuffer:type:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer newBufferType(@NUInt long length, @NUInt long type);

    @Generated
    @Selector("newBufferFromZone:data:type:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer newBufferFromZoneDataType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone,
            NSData data, @NUInt long type);

    @Generated
    @Selector("newBufferFromZone:length:type:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer newBufferFromZoneLengthType(@Mapped(ObjCObjectMapper.class) MDLMeshBufferZone zone,
            @NUInt long length, @NUInt long type);

    @Generated
    @Selector("newBufferWithData:type:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer newBufferWithDataType(NSData data, @NUInt long type);

    @Generated
    @Selector("newZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferZone newZone(@NUInt long capacity);

    @Generated
    @Selector("newZoneForBuffersWithSize:andType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferZone newZoneForBuffersWithSizeAndType(NSArray<? extends NSNumber> sizes,
            NSArray<? extends NSNumber> types);
}
