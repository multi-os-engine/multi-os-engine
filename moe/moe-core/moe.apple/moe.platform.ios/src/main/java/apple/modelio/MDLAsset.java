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
import apple.modelio.protocol.MDLAssetResolver;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLAsset
 * 
 * An MDLAsset represents the contents of a model file.
 * 
 * Each asset contains a collection of hierarchies of objects, where
 * each object in the asset is the top level of a hierarchy. Objects
 * include transforms, lights, cameras, and meshes.
 * 
 * MDLAssets are typically instantiated from NSURLs that refer to a model resource.
 * 
 * The model resource may represented timed information, for example, a series of
 * mesh morphs. If the asset is timed, then the framerate will be non-zero, and the
 * firstFrame and lastFrame properties will indicate the range for which sample
 * data exists. Samples before or after that range will be clamped. Some model
 * resource representations allow continuous sampling, others are discrete. In the
 * discrete case, if a requested sample time is not on a discrete boundary the
 * returned sample will be the sample exactly on the sample time, or if no such is
 * available, the immediately preceding sample. If no time is specified for a
 * sample, the first data will be returned.
 * 
 * An asset's bounding box can be queried without traversing the hierarchy of
 * objects.
 * 
 * Fast enumeration of an MDLAsset iterates the top level objects contained within.
 * 
 * API-Since: 9.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLAsset allocWithZone(VoidPtr zone);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("assetWithSCNScene:")
    public static native MDLAsset assetWithSCNScene(@NotNull SCNScene scnScene);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("assetWithSCNScene:bufferAllocator:")
    public static native MDLAsset assetWithSCNSceneBufferAllocator(@NotNull SCNScene scnScene,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * canImportFileExtension:
     * 
     * Indicates whether MDLAsset object can export asset to resource with
     * the given extension
     * 
     * @return YES is returned if MDLAsset is able is able to export assets to
     *         resources with the given extension
     */
    @Generated
    @Selector("canExportFileExtension:")
    public static native boolean canExportFileExtension(@NotNull String extension);

    /**
     * canImportFileExtension:
     * 
     * Indicates whether MDLAsset object can be initialized with resource
     * with the given extension
     * 
     * @return YES is returned if MDLAsset is able to load and represent assets with
     *         the given extension
     */
    @Generated
    @Selector("canImportFileExtension:")
    public static native boolean canImportFileExtension(@NotNull String extension);

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
    public static native MDLAsset new_objc();

    @NotNull
    @Generated
    @Selector("placeLightProbesWithDensity:heuristic:usingIrradianceDataSource:")
    public static native NSArray<? extends MDLLightProbe> placeLightProbesWithDensityHeuristicUsingIrradianceDataSource(
            float value, @NInt long type,
            @NotNull @Mapped(ObjCObjectMapper.class) MDLLightProbeIrradianceDataSource dataSource);

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
     * [@property] URL
     * 
     * URL used to create the asset
     * 
     * If the asset was not created with a URL, nil will be returned.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * addObject:
     * 
     * Add a top level object to an asset.
     * 
     * If the object was already in the asset, this has no effect.
     */
    @Generated
    @Selector("addObject:")
    public native void addObject(@NotNull MDLObject object);

    /**
     * [@property] bufferAllocator
     * 
     * Allocator used to create vertex and index buffers
     */
    @NotNull
    @Generated
    @Selector("bufferAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferAllocator bufferAllocator();

    /**
     * childObjectsOfClass:
     * 
     * Inspects an asset's hierarchy for objects of the specified class type
     * 
     * This can be used to get references to all MDLMesh objects, MDLLights,
     * etc. if objectClass is not a subclass of MDLObject, an exception will be
     * raised.
     * 
     * @return returns an NSArray of all objects in the asset matching the requested class
     */
    @NotNull
    @Generated
    @Selector("childObjectsOfClass:")
    public native NSArray<? extends MDLObject> childObjectsOfClass(@NotNull Class objectClass);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] count
     * 
     * The number of top level objects
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * [@property] endTime
     * 
     * End time bracket of animation data
     * 
     * If no animation data was specified by resource or resource incapable
     * of specifying animation data, this value defaults to 0. If the
     * endTime was set explicitly, then the value of endTime will be the
     * greater of the set value and the animated values.
     */
    @Generated
    @Selector("endTime")
    public native double endTime();

    /**
     * exportAssetToURL:
     * 
     * Export an asset to the specified URL.
     * 
     * @return YES is returned if exporting proceeded successfully,
     */
    @Generated
    @Selector("exportAssetToURL:")
    public native boolean exportAssetToURL(@NotNull NSURL URL);

    /**
     * exportAssetToURL:error:
     * 
     * Export an asset to the specified URL.
     * 
     * @return YES is returned if exporting proceeded successfully,
     */
    @Generated
    @Selector("exportAssetToURL:error:")
    public native boolean exportAssetToURLError(@NotNull NSURL URL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] frameInterval
     * 
     * Inherent frame rate of an asset
     * 
     * If no framerate was specified by resource or resource uncapable of
     * specifying framerate, this value defaults to 0
     */
    @Generated
    @Selector("frameInterval")
    public native double frameInterval();

    @Generated
    @Selector("init")
    public native MDLAsset init();

    /**
     * initWithBufferAllocator:
     * 
     * Initialize an empty MDLAsset with a buffer allocator to be used during
     * other operations.
     */
    @Generated
    @Selector("initWithBufferAllocator:")
    public native MDLAsset initWithBufferAllocator(
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    /**
     * initWithURL:
     * 
     * Initialize an MDLAsset using the contents of the resource located at
     * the indicated URL
     * 
     * Vertex layout (i.e. vertexDescriptor) will be specified by ModelIO
     * depending on attributes of the resource. Buffers will be allocated
     * using a default NSData based allocator
     * 
     * Submeshes will be converted to triangle topology.
     */
    @Generated
    @Selector("initWithURL:")
    public native MDLAsset initWithURL(@NotNull NSURL URL);

    /**
     * initWithURL:vertexDescriptor:bufferAllocator:
     * 
     * Initialize an MDLAsset using the contents of the resource located at
     * URL, ensuring that the asset conforms to the supplied vertexDescriptor,
     * and buffers are allocated in the supplied allocator
     * 
     * The default behavior is to triangulate any discovered meshes and to
     * conform the mesh to the supplied vertexDescriptor.
     * 
     * If nil is passed as the vertexDescriptor, then a vertexDescriptor
     * will be created according to the attributes of the resource.
     * 
     * If nil is passed as the bufferAllocator, buffers will be allocated
     * using a default NSData based allocator.
     * 
     * Submeshes will be converted to triangle topology.
     */
    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocator(@Nullable NSURL URL,
            @Nullable MDLVertexDescriptor vertexDescriptor,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    /**
     * initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:
     * 
     * Same as initWithURL:vertexDescriptor:bufferAllocator: except that
     * if preserveTopology is YES, a topology buffer might be created on the
     * submeshes.
     * 
     * If all faces in a submesh have the same vertex count, then the
     * submesh will a geometry type corresponding to that vertex count.
     * For example, if all faces have four vertices, then the geometry
     * type will be MDLGeometryTypeQuads. If faces have a varying number
     * of vertices, then the the submesh type will be
     * MDLGeometryTypeVariableTopology, and a faceTopologyBuffer will be
     * created.
     */
    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocatorPreserveTopologyError(@NotNull NSURL URL,
            @Nullable MDLVertexDescriptor vertexDescriptor,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator, boolean preserveTopology,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("masters")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent masters();

    /**
     * objectAtIndex:
     * 
     * return the indexed top level object
     */
    @NotNull
    @Generated
    @Selector("objectAtIndex:")
    public native MDLObject objectAtIndex(@NUInt long index);

    /**
     * objectAtIndexedSubscript:
     * 
     * return the indexed top level object
     */
    @Nullable
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native MDLObject objectAtIndexedSubscript(@NUInt long index);

    /**
     * removeObject:
     * 
     * Remove a top level object from an asset.
     * 
     * If the object not in the asset, this has no effect.
     */
    @Generated
    @Selector("removeObject:")
    public native void removeObject(@NotNull MDLObject object);

    /**
     * [@property] endTime
     * 
     * End time bracket of animation data
     * 
     * If no animation data was specified by resource or resource incapable
     * of specifying animation data, this value defaults to 0. If the
     * endTime was set explicitly, then the value of endTime will be the
     * greater of the set value and the animated values.
     */
    @Generated
    @Selector("setEndTime:")
    public native void setEndTime(double value);

    /**
     * [@property] frameInterval
     * 
     * Inherent frame rate of an asset
     * 
     * If no framerate was specified by resource or resource uncapable of
     * specifying framerate, this value defaults to 0
     */
    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(double value);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("setMasters:")
    public native void setMasters(@NotNull @Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    /**
     * [@property] startTime
     * 
     * Start time bracket of animation data
     * 
     * If no animation data was specified by resource or resource incapable
     * of specifying animation data, this value defaults to 0. If startTime
     * was set explicitly, then the value of startTime will be the lesser
     * of the set value and the animated values.
     */
    @Generated
    @Selector("setStartTime:")
    public native void setStartTime(double value);

    /**
     * [@property] startTime
     * 
     * Start time bracket of animation data
     * 
     * If no animation data was specified by resource or resource incapable
     * of specifying animation data, this value defaults to 0. If startTime
     * was set explicitly, then the value of startTime will be the lesser
     * of the set value and the animated values.
     */
    @Generated
    @Selector("startTime")
    public native double startTime();

    /**
     * [@property] vertexDescriptor
     * 
     * Vertex descriptor set upon asset initialization
     * 
     * Will be nil if there was no descriptor set
     */
    @Nullable
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();

    /**
     * [@property] animations
     * 
     * Animations that can be bound to MDLObjects (@see MDLAnimationBindComponent)
     * 
     * @see MDLObjectContainerComponent
     * 
     *      API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("animations")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent animations();

    /**
     * loadTextures
     * 
     * Iterates over all material properties on all materials. If they are string
     * values or NSURL values, and can be resolved as textures, then the string
     * and NSURL values will be replaced by MDLTextureSampler values.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("loadTextures")
    public native void loadTextures();

    /**
     * Return the object at the specified path, or nil if none exists there
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("objectAtPath:")
    public native MDLObject objectAtPath(@NotNull String path);

    /**
     * [@property] AssetResolver
     * 
     * Resolver asset that helps find associated files
     * 
     * The default asset resolver is the RelativeAssetResolver
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("resolver")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLAssetResolver resolver();

    /**
     * [@property] animations
     * 
     * Animations that can be bound to MDLObjects (@see MDLAnimationBindComponent)
     * 
     * @see MDLObjectContainerComponent
     * 
     *      API-Since: 11.0
     */
    @Generated
    @Selector("setAnimations:")
    public native void setAnimations(@NotNull @Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);

    /**
     * [@property] AssetResolver
     * 
     * Resolver asset that helps find associated files
     * 
     * The default asset resolver is the RelativeAssetResolver
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setResolver:")
    public native void setResolver(@Nullable @Mapped(ObjCObjectMapper.class) MDLAssetResolver value);

    /**
     * [@property] originals
     * 
     * Original objects that can be instanced into the asset's object hierarchy
     * 
     * @see MDLObjectContainerComponent
     * 
     *      API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("originals")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLObjectContainerComponent originals();

    /**
     * [@property] originals
     * 
     * Original objects that can be instanced into the asset's object hierarchy
     * 
     * @see MDLObjectContainerComponent
     * 
     *      API-Since: 15.0
     */
    @Generated
    @Selector("setOriginals:")
    public native void setOriginals(@NotNull @Mapped(ObjCObjectMapper.class) MDLObjectContainerComponent value);
}
