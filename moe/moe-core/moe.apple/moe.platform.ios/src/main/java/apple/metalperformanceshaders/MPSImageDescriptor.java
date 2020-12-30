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

package apple.metalperformanceshaders;

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
 * @class      MPSImageDescriptor
 * @dependency This depends on Metal.framework
 * @abstract   A MPSImageDescriptor object describes a attributes of MPSImage and is used to
 *             create one (see MPSImage discussion below)
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageDescriptor alloc();

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

    /**
     * @abstract   Create a MPSImageDescriptor for a single read/write cnn image.
     */
    @Generated
    @Selector("imageDescriptorWithChannelFormat:width:height:featureChannels:")
    public static native MPSImageDescriptor imageDescriptorWithChannelFormatWidthHeightFeatureChannels(
            @NUInt long channelFormat, @NUInt long width, @NUInt long height, @NUInt long featureChannels);

    /**
     * @abstract   Create a MPSImageDescriptor for a read/write cnn image with option to set usage and batch size (numberOfImages).
     */
    @Generated
    @Selector("imageDescriptorWithChannelFormat:width:height:featureChannels:numberOfImages:usage:")
    public static native MPSImageDescriptor imageDescriptorWithChannelFormatWidthHeightFeatureChannelsNumberOfImagesUsage(
            @NUInt long channelFormat, @NUInt long width, @NUInt long height, @NUInt long featureChannels,
            @NUInt long numberOfImages, @NUInt long usage);

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
     * @property   channelFormat
     * @abstract   The storage format to use for each channel in the image.
     */
    @Generated
    @Selector("channelFormat")
    @NUInt
    public native long channelFormat();

    /**
     * @property cpuCacheMode
     * @abstract Options to specify CPU cache mode of texture resource. Default = MTLCPUCacheModeDefaultCache
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    /**
     * @property   featureChannels
     * @abstract   The number of feature channels per pixel.  Default = 1.
     */
    @Generated
    @Selector("featureChannels")
    @NUInt
    public native long featureChannels();

    /**
     * @property   height
     * @abstract   The height of the CNN image.
     * @discussion The formal height of the CNN image in pixels. Default = 1.
     */
    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MPSImageDescriptor init();

    /**
     * @property   numberOfImages
     * @abstract   The number of images for batch processing.   Default = 1.
     */
    @Generated
    @Selector("numberOfImages")
    @NUInt
    public native long numberOfImages();

    /**
     * @property   pixelFormat
     * @abstract   The MTLPixelFormat expected for the underlying texture.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * @property   channelFormat
     * @abstract   The storage format to use for each channel in the image.
     */
    @Generated
    @Selector("setChannelFormat:")
    public native void setChannelFormat(@NUInt long value);

    /**
     * @property cpuCacheMode
     * @abstract Options to specify CPU cache mode of texture resource. Default = MTLCPUCacheModeDefaultCache
     */
    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    /**
     * @property   featureChannels
     * @abstract   The number of feature channels per pixel.  Default = 1.
     */
    @Generated
    @Selector("setFeatureChannels:")
    public native void setFeatureChannels(@NUInt long value);

    /**
     * @property   height
     * @abstract   The height of the CNN image.
     * @discussion The formal height of the CNN image in pixels. Default = 1.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NUInt long value);

    /**
     * @property   numberOfImages
     * @abstract   The number of images for batch processing.   Default = 1.
     */
    @Generated
    @Selector("setNumberOfImages:")
    public native void setNumberOfImages(@NUInt long value);

    /**
     * @property storageMode
     * @abstract To specify storage mode of texture resource.
     * @discussion Storage mode options:
     *        @code
     *            Default =   MTLStorageModeShared on iOS
     *                        MTLStorageModeManaged on Mac OSX
     *            MTLStorageModeShared not supported on Mac OSX.
     *            See Metal headers for synchronization requirements when using StorageModeManaged
     *        @endcode
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    /**
     * @property   usage
     * @abstract   Description of texture usage.  Default = MTLTextureUsageShaderRead/Write
     */
    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    /**
     * @property   width
     * @abstract   The width of the CNN image.
     * @discussion The formal width of the CNN image in pixels.  Default = 1.
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NUInt long value);

    /**
     * @property storageMode
     * @abstract To specify storage mode of texture resource.
     * @discussion Storage mode options:
     *        @code
     *            Default =   MTLStorageModeShared on iOS
     *                        MTLStorageModeManaged on Mac OSX
     *            MTLStorageModeShared not supported on Mac OSX.
     *            See Metal headers for synchronization requirements when using StorageModeManaged
     *        @endcode
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    /**
     * @property   usage
     * @abstract   Description of texture usage.  Default = MTLTextureUsageShaderRead/Write
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    /**
     * @property   width
     * @abstract   The width of the CNN image.
     * @discussion The formal width of the CNN image in pixels.  Default = 1.
     */
    @Generated
    @Selector("width")
    @NUInt
    public native long width();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);
}
