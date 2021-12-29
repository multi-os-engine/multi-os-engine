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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.metal.protocol.MTLBuffer;
import apple.modelio.MDLSubmesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNGeometryElement
 * <p>
 * A geometry element describes how vertices from a geometry source are connected together.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNGeometryElement extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNGeometryElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNGeometryElement alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNGeometryElement allocWithZone(VoidPtr zone);

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

    /**
     * geometryElementWithData:primitiveType:primitiveCount:bytesPerIndex:
     * <p>
     * Creates and returns a geometry element from the given data and data format info.
     *
     * @param data           The data that contains element indexes. You can pass nil to use an implicit vertex ordering (0,1,2...).
     * @param primitiveType  The primitive type, as listed in the SCNGeometryPrimitiveType enumeration.
     * @param primitiveCount The number of primitives in the data.
     * @param bytesPerIndex  The number of bytes that represent a single index value in the data.
     */
    @Generated
    @Selector("geometryElementWithData:primitiveType:primitiveCount:bytesPerIndex:")
    public static native SCNGeometryElement geometryElementWithDataPrimitiveTypePrimitiveCountBytesPerIndex(NSData data,
            @NInt long primitiveType, @NInt long primitiveCount, @NInt long bytesPerIndex);

    @Generated
    @Selector("geometryElementWithMDLSubmesh:")
    public static native SCNGeometryElement geometryElementWithMDLSubmesh(MDLSubmesh mdlSubMesh);

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
    public static native SCNGeometryElement new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] bytesPerIndex
     * <p>
     * The number of bytes that represent an index value
     */
    @Generated
    @Selector("bytesPerIndex")
    @NInt
    public native long bytesPerIndex();

    /**
     * [@property] data
     * <p>
     * The data for the geometry element
     */
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNGeometryElement init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometryElement initWithCoder(NSCoder coder);

    /**
     * [@property] primitiveCount
     * <p>
     * The number of primitives in the data.
     */
    @Generated
    @Selector("primitiveCount")
    @NInt
    public native long primitiveCount();

    /**
     * [@property] primitiveType
     * <p>
     * The type of the geometry element. Possible values are listed in the SCNGeometryPrimitiveType enumeration.
     */
    @Generated
    @Selector("primitiveType")
    @NInt
    public native long primitiveType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] maximumPointScreenSpaceRadius
     * <p>
     * Specifies the maximum size in screen-space (in pixel). Defaults to 1
     */
    @Generated
    @Selector("maximumPointScreenSpaceRadius")
    @NFloat
    public native double maximumPointScreenSpaceRadius();

    /**
     * [@property] minimumPointScreenSpaceRadius
     * <p>
     * Specifies the minimum size in screen-space (in pixel). Defaults to 1
     */
    @Generated
    @Selector("minimumPointScreenSpaceRadius")
    @NFloat
    public native double minimumPointScreenSpaceRadius();

    /**
     * [@property] pointSize
     * <p>
     * Specifies the size of the point in local space. Defaults to 1
     */
    @Generated
    @Selector("pointSize")
    @NFloat
    public native double pointSize();

    /**
     * [@property] primitiveRange
     * <p>
     * Specifies the subrange of primitves to render within NSMakeRange(0, primitiveCount). Defaults to NSMakeRange(NSNotFound, 0).
     * <p>
     * When the location of the range is set to NSNotFound, the entire geometry element is rendered.
     */
    @Generated
    @Selector("primitiveRange")
    @ByValue
    public native NSRange primitiveRange();

    /**
     * [@property] maximumPointScreenSpaceRadius
     * <p>
     * Specifies the maximum size in screen-space (in pixel). Defaults to 1
     */
    @Generated
    @Selector("setMaximumPointScreenSpaceRadius:")
    public native void setMaximumPointScreenSpaceRadius(@NFloat double value);

    /**
     * [@property] minimumPointScreenSpaceRadius
     * <p>
     * Specifies the minimum size in screen-space (in pixel). Defaults to 1
     */
    @Generated
    @Selector("setMinimumPointScreenSpaceRadius:")
    public native void setMinimumPointScreenSpaceRadius(@NFloat double value);

    /**
     * [@property] pointSize
     * <p>
     * Specifies the size of the point in local space. Defaults to 1
     */
    @Generated
    @Selector("setPointSize:")
    public native void setPointSize(@NFloat double value);

    /**
     * [@property] primitiveRange
     * <p>
     * Specifies the subrange of primitves to render within NSMakeRange(0, primitiveCount). Defaults to NSMakeRange(NSNotFound, 0).
     * <p>
     * When the location of the range is set to NSNotFound, the entire geometry element is rendered.
     */
    @Generated
    @Selector("setPrimitiveRange:")
    public native void setPrimitiveRange(@ByValue NSRange value);

    /**
     * geometryElementWithBuffer:primitiveType:primitiveCount:bytesPerIndex
     * <p>
     * Creates and returns a geometry element from the given Metal buffer and parameters.
     *
     * @param buffer         The buffer that contains element indexes.
     * @param primitiveType  The primitive type, as listed in the SCNGeometryPrimitiveType enumeration.
     * @param primitiveCount The number of primitives in the data.
     * @param bytesPerIndex  The number of bytes that represent a single index value in the data.
     */
    @Generated
    @Selector("geometryElementWithBuffer:primitiveType:primitiveCount:bytesPerIndex:")
    public static native SCNGeometryElement geometryElementWithBufferPrimitiveTypePrimitiveCountBytesPerIndex(
            @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NInt long primitiveType, @NInt long primitiveCount,
            @NInt long bytesPerIndex);
}
