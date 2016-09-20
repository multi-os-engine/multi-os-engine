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
import apple.modelio.protocol.MDLMeshBufferAllocator;
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
    @Owned
    @Selector("alloc")
    public static native MDLAsset alloc();

    /**
     * assetWithSCNScene:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/clm/MDLAsset/assetWithSCNScene:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assetWithSCNScene:")
    public static native MDLAsset assetWithSCNScene(SCNScene scnScene);

    /**
     * canExportFileExtension:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/clm/MDLAsset/canExportFileExtension:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canExportFileExtension:")
    public static native boolean canExportFileExtension(String extension);

    /**
     * canImportFileExtension:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/clm/MDLAsset/canImportFileExtension:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canImportFileExtension:")
    public static native boolean canImportFileExtension(String extension);

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

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * addObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/addObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObject:")
    public native void addObject(MDLObject object);

    /**
     * bufferAllocator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/bufferAllocator">iOS Dev Center</a>
     */
    @Generated
    @Selector("bufferAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferAllocator bufferAllocator();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * endTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/endTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("endTime")
    public native double endTime();

    /**
     * exportAssetToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/exportAssetToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exportAssetToURL:")
    public native boolean exportAssetToURL(NSURL URL);

    /**
     * exportAssetToURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/exportAssetToURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exportAssetToURL:error:")
    public native boolean exportAssetToURLError(NSURL URL, Ptr<NSError> error);

    /**
     * frameInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/frameInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("frameInterval")
    public native double frameInterval();

    @Generated
    @Selector("init")
    public native MDLAsset init();

    /**
     * initWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/initWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:")
    public native MDLAsset initWithURL(NSURL URL);

    /**
     * initWithURL:vertexDescriptor:bufferAllocator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/initWithURL:vertexDescriptor:bufferAllocator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocator(NSURL URL, MDLVertexDescriptor vertexDescriptor,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    /**
     * initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:vertexDescriptor:bufferAllocator:preserveTopology:error:")
    public native MDLAsset initWithURLVertexDescriptorBufferAllocatorPreserveTopologyError(NSURL URL,
            MDLVertexDescriptor vertexDescriptor,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator, boolean preserveTopology,
            Ptr<NSError> error);

    /**
     * objectAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/objectAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectAtIndex:")
    public native MDLObject objectAtIndex(@NUInt long index);

    /**
     * objectAtIndexedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/objectAtIndexedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native MDLObject objectAtIndexedSubscript(@NUInt long index);

    /**
     * removeObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instm/MDLAsset/removeObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObject:")
    public native void removeObject(MDLObject object);

    /**
     * endTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/endTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEndTime:")
    public native void setEndTime(double value);

    /**
     * frameInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/frameInterval">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(double value);

    /**
     * startTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/startTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStartTime:")
    public native void setStartTime(double value);

    /**
     * startTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/startTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("startTime")
    public native double startTime();

    /**
     * vertexDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLAsset_Class/index.html#//apple_ref/occ/instp/MDLAsset/vertexDescriptor">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}
