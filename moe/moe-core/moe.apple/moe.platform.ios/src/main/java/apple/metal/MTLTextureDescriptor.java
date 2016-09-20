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

package apple.metal;

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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLTextureDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLTextureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLTextureDescriptor alloc();

    /**
     * texture2DDescriptorWithPixelFormat:width:height:mipmapped:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/clm/MTLTextureDescriptor/texture2DDescriptorWithPixelFormat:width:height:mipmapped:">iOS Dev Center</a>
     */
    @Generated
    @Selector("texture2DDescriptorWithPixelFormat:width:height:mipmapped:")
    public static native MTLTextureDescriptor texture2DDescriptorWithPixelFormatWidthHeightMipmapped(
            @NUInt long pixelFormat, @NUInt long width, @NUInt long height, boolean mipmapped);

    /**
     * textureCubeDescriptorWithPixelFormat:size:mipmapped:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/clm/MTLTextureDescriptor/textureCubeDescriptorWithPixelFormat:size:mipmapped:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureCubeDescriptorWithPixelFormat:size:mipmapped:")
    public static native MTLTextureDescriptor textureCubeDescriptorWithPixelFormatSizeMipmapped(@NUInt long pixelFormat,
            @NUInt long size, boolean mipmapped);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * arrayLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/arrayLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    public native long arrayLength();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * depth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/depth">iOS Dev Center</a>
     */
    @Generated
    @Selector("depth")
    @NUInt
    public native long depth();

    /**
     * height</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/height">iOS Dev Center</a>
     */
    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MTLTextureDescriptor init();

    /**
     * mipmapLevelCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/mipmapLevelCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    public native long mipmapLevelCount();

    /**
     * pixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/pixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * resourceOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/resourceOptions">iOS Dev Center</a>
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    public native long resourceOptions();

    /**
     * sampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/sampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * arrayLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/arrayLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("setArrayLength:")
    public native void setArrayLength(@NUInt long value);

    /**
     * depth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/depth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDepth:")
    public native void setDepth(@NUInt long value);

    /**
     * height</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/height">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NUInt long value);

    /**
     * mipmapLevelCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/mipmapLevelCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMipmapLevelCount:")
    public native void setMipmapLevelCount(@NUInt long value);

    /**
     * pixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/pixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * resourceOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/resourceOptions">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResourceOptions:")
    public native void setResourceOptions(@NUInt long value);

    /**
     * sampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/sampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    /**
     * textureType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/textureType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextureType:")
    public native void setTextureType(@NUInt long value);

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NUInt long value);

    /**
     * textureType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/textureType">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("width")
    @NUInt
    public native long width();

    /**
     * cpuCacheMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/cpuCacheMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    /**
     * cpuCacheMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/cpuCacheMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    /**
     * storageMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/storageMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    /**
     * usage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/usage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    /**
     * storageMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/storageMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    /**
     * usage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTextureDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLTextureDescriptor/usage">iOS Dev Center</a>
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();
}
