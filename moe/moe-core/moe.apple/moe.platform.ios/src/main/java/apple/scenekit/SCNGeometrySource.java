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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLBuffer;
import apple.scenekit.struct.SCNVector3;
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
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNGeometrySource extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNGeometrySource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNGeometrySource alloc();

    /**
     * bytesPerComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/bytesPerComponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("bytesPerComponent")
    @NInt
    public native long bytesPerComponent();

    /**
     * componentsPerVector</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/componentsPerVector">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsPerVector")
    @NInt
    public native long componentsPerVector();

    /**
     * data</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/data">iOS Dev Center</a>
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * dataOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/dataOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataOffset")
    @NInt
    public native long dataOffset();

    /**
     * dataStride</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/dataStride">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataStride")
    @NInt
    public native long dataStride();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * floatComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/floatComponents">iOS Dev Center</a>
     */
    @Generated
    @Selector("floatComponents")
    public native boolean floatComponents();

    /**
     * geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/clm/SCNGeometrySource/geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:">iOS Dev Center</a>
     */
    @Generated
    @Selector("geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:")
    public static native SCNGeometrySource geometrySourceWithDataSemanticVectorCountFloatComponentsComponentsPerVectorBytesPerComponentDataOffsetDataStride(
            NSData data, String semantic, @NInt long vectorCount, boolean floatComponents,
            @NInt long componentsPerVector, @NInt long bytesPerComponent, @NInt long offset, @NInt long stride);

    /**
     * geometrySourceWithNormals:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/clm/SCNGeometrySource/geometrySourceWithNormals:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("geometrySourceWithNormals:count:")
    public static native SCNGeometrySource geometrySourceWithNormalsCount(ConstPtr<SCNVector3> normals,
            @NInt long count);

    /**
     * geometrySourceWithTextureCoordinates:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/clm/SCNGeometrySource/geometrySourceWithTextureCoordinates:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("geometrySourceWithTextureCoordinates:count:")
    public static native SCNGeometrySource geometrySourceWithTextureCoordinatesCount(ConstPtr<CGPoint> texcoord,
            @NInt long count);

    /**
     * geometrySourceWithVertices:count:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/clm/SCNGeometrySource/geometrySourceWithVertices:count:">iOS Dev Center</a>
     */
    @Generated
    @Selector("geometrySourceWithVertices:count:")
    public static native SCNGeometrySource geometrySourceWithVerticesCount(ConstPtr<SCNVector3> vertices,
            @NInt long count);

    @Generated
    @Selector("init")
    public native SCNGeometrySource init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometrySource initWithCoder(NSCoder aDecoder);

    /**
     * semantic</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/semantic">iOS Dev Center</a>
     */
    @Generated
    @Selector("semantic")
    public native String semantic();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * vectorCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/instp/SCNGeometrySource/vectorCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("vectorCount")
    @NInt
    public native long vectorCount();

    /**
     * geometrySourceWithBuffer:vertexFormat:semantic:vertexCount:dataOffset:dataStride:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNGeometrySource_Class/index.html#//apple_ref/occ/clm/SCNGeometrySource/geometrySourceWithBuffer:vertexFormat:semantic:vertexCount:dataOffset:dataStride:">iOS Dev Center</a>
     */
    @Generated
    @Selector("geometrySourceWithBuffer:vertexFormat:semantic:vertexCount:dataOffset:dataStride:")
    public static native SCNGeometrySource geometrySourceWithBufferVertexFormatSemanticVertexCountDataOffsetDataStride(
            @Mapped(ObjCObjectMapper.class) MTLBuffer mtlBuffer, @NUInt long vertexFormat, String semantic,
            @NInt long vertexCount, @NInt long offset, @NInt long stride);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
