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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
import apple.modelio.protocol.MDLLightProbeIrradianceDataSource;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.modelio.protocol.MDLObjectContainerComponent;
import apple.scenekit.SCNScene;
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

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLAsset extends NSObject implements NSCopying, NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLAsset alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithSCNScene:")
    public static native MDLAsset assetWithSCNScene(SCNScene scnScene);

    @Generated
    @Selector("assetWithSCNScene:bufferAllocator:")
    public static native MDLAsset assetWithSCNSceneBufferAllocator(SCNScene scnScene,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("canExportFileExtension:")
    public static native boolean canExportFileExtension(String extension);

    @Generated
    @Selector("canImportFileExtension:")
    public static native boolean canImportFileExtension(String extension);

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
    @Selector("placeLightProbesWithDensity:heuristic:usingIrradianceDataSource:")
    public static native NSArray<? extends MDLLightProbe> placeLightProbesWithDensityHeuristicUsingIrradianceDataSource(
            float value, @NInt long type, @Mapped(ObjCObjectMapper.class) MDLLightProbeIrradianceDataSource dataSource);

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

    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("addObject:")
    public native void addObject(MDLObject object);

    @Generated
    @Selector("bufferAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferAllocator bufferAllocator();

    @Generated
    @Selector("childObjectsOfClass:")
    public native NSArray<? extends MDLObject> childObjectsOfClass(Class objectClass);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("endTime")
    public native double endTime();

    @Generated
    @Selector("exportAssetToURL:")
    public native boolean exportAssetToURL(NSURL URL);

    @Generated
    @Selector("exportAssetToURL:error:")
    public native boolean exportAssetToURLError(NSURL URL, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("frameInterval")
    public native double frameInterval();

    @Generated
    @Selector("init")
    public native MDLAsset init();

    @Generated
    @Selector("initWithBufferAllocator:")
    public native MDLAsset initWithBufferAllocator(
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("initWithURL:")
    public native MDLAsset initWithURL(NSURL URL);

    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocator(NSURL URL, MDLVertexDescriptor vertexDescriptor,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocatorPreserveTopologyError(NSURL URL,
            MDLVertexDescriptor vertexDescriptor,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator, boolean preserveTopology,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("masters")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent masters();

    @Generated
    @Selector("objectAtIndex:")
    public native MDLObject objectAtIndex(@NUInt long index);

    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native MDLObject objectAtIndexedSubscript(@NUInt long index);

    @Generated
    @Selector("removeObject:")
    public native void removeObject(MDLObject object);

    @Generated
    @Selector("setEndTime:")
    public native void setEndTime(double value);

    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(double value);

    @Generated
    @Selector("setMasters:")
    public native void setMasters(@Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    @Generated
    @Selector("setStartTime:")
    public native void setStartTime(double value);

    @Generated
    @Selector("startTime")
    public native double startTime();

    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}
