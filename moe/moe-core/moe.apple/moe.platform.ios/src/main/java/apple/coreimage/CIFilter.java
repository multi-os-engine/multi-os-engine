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

package apple.coreimage;

import apple.NSObject;
import apple.coreimage.protocol.CIFilterConstructor;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CIFilter are filter objects for Core Image that encapsulate the filter with its attributes
 * 
 * The CIFilter class produces a CIImage object as output. Typically, a filter takes one or more images as input. Some
 * filters, however, generate an image based on other types of input parameters. The parameters of a CIFilter object are
 * set and retrieved through the use of key-value pairs. You use the CIFilter object in conjunction with the CIImage,
 * CIContext, CIVector, CIImageAccumulator, and CIColor objects to take advantage of the built-in Core Image filters
 * when processing images. CIFilter objects are also used along with CIKernel, CISampler, and CIFilterShape objects to
 * create custom filters.
 * 
 * API-Since: 5.0
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIFilter extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CIFilter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIFilter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIFilter allocWithZone(VoidPtr zone);

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

    /**
     * Return an array of CIFilters de-serialized from XMP data.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("filterArrayFromSerializedXMP:inputImageExtent:error:")
    public static native NSArray<? extends CIFilter> filterArrayFromSerializedXMPInputImageExtentError(
            @NotNull NSData xmpData, @ByValue CGRect extent,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Returns an array containing all published filter names that belong to all listed categories.
     */
    @NotNull
    @Generated
    @Selector("filterNamesInCategories:")
    public static native NSArray<String> filterNamesInCategories(@Nullable NSArray<String> categories);

    /**
     * Returns an array containing all published filter names in a category.
     */
    @NotNull
    @Generated
    @Selector("filterNamesInCategory:")
    public static native NSArray<String> filterNamesInCategory(@Nullable String category);

    /**
     * Returns a CIFilter that will in turn return a properly processed CIImage as "outputImage".
     * 
     * Note that when using this initializer, you should pass in a CVPixelBufferRef with one of the following Raw pixel
     * format types
     * kCVPixelFormatType_14Bayer_GRBG, kCVPixelFormatType_14Bayer_RGGB, kCVPixelFormatType_14Bayer_BGGR,
     * kCVPixelFormatType_14Bayer_GBRG
     * as well as the root properties attachment from the CMSampleBufferRef.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @Selector("filterWithCVPixelBuffer:properties:options:")
    public static native CIFilter filterWithCVPixelBufferPropertiesOptions(CVBufferRef pixelBuffer,
            NSDictionary<?, ?> properties, NSDictionary<String, ?> options);

    /**
     * Returns a CIFilter that will in turn return a properly processed CIImage as "outputImage".
     * 
     * Note that when using this initializer, you should pass in a source type identifier hint
     * (kCGImageSourceTypeIdentifierHint) key/value pair in order to help the decoder determine the file type, as
     * otherwise confusion and incorrect results are possible.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @Selector("filterWithImageData:options:")
    public static native CIFilter filterWithImageDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * Returns a CIFilter that will in turn return a properly processed CIImage as "outputImage".
     * 
     * API-Since: 10.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @Selector("filterWithImageURL:options:")
    public static native CIFilter filterWithImageURLOptions(NSURL url, NSDictionary<String, ?> options);

    /**
     * Creates a new filter of type 'name'.
     * On OSX, all input values will be undefined.
     * On iOS, all input values will be set to default values.
     */
    @Nullable
    @Generated
    @Selector("filterWithName:")
    public static native CIFilter filterWithName(@NotNull String name);

    /**
     * Creates a new filter of type 'name'.
     * The filter's input parameters are set from the list of key-value pairs which must be nil-terminated.
     * On OSX, any of the filter input parameters not specified in the list will be undefined.
     * On iOS, any of the filter input parameters not specified in the list will be set to default values.
     */
    @Nullable
    @Generated
    @Variadic()
    @Selector("filterWithName:keysAndValues:")
    public static native CIFilter filterWithNameKeysAndValues(@NotNull String name,
            @Mapped(ObjCObjectMapper.class) Object key0, Object... varargs);

    /**
     * Creates a new filter of type 'name'.
     * The filter's input parameters are set from the dictionary of key-value pairs.
     * On OSX, any of the filter input parameters not specified in the dictionary will be undefined.
     * On iOS, any of the filter input parameters not specified in the dictionary will be set to default values.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("filterWithName:withInputParameters:")
    public static native CIFilter filterWithNameWithInputParameters(@NotNull String name,
            @Nullable NSDictionary<String, ?> params);

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

    /**
     * Returns the localized description of a filter for display in the UI.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("localizedDescriptionForFilterName:")
    public static native String localizedDescriptionForFilterName(@NotNull String filterName);

    /**
     * Returns the localized name of a category for display in the UI.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("localizedNameForCategory:")
    public static native String localizedNameForCategory(@NotNull String category);

    /**
     * Returns the localized name of a filter for display in the UI.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("localizedNameForFilterName:")
    public static native String localizedNameForFilterName(@NotNull String filterName);

    /**
     * Returns the URL to the localized reference documentation describing the filter.
     * 
     * The URL can be a local file or a remote document on a webserver. It is possible, that this method returns nil
     * (like filters that predate this feature). A client of this API has to handle this case gracefully.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("localizedReferenceDocumentationForFilterName:")
    public static native NSURL localizedReferenceDocumentationForFilterName(@NotNull String filterName);

    @Generated
    @Owned
    @Selector("new")
    public static native CIFilter new_objc();

    /**
     * Publishes a new filter called 'name'.
     * 
     * The constructor object 'anObject' should implement the filterWithName: method.
     * That method will be invoked with the name of the filter to create.
     * The class attributes must have a kCIAttributeFilterCategories key associated with a set of categories.
     * 
     * @param attributes Dictionary of the registration attributes of the filter. See below for attribute keys.
     * 
     *                   API-Since: 9.0
     */
    @Generated
    @Selector("registerFilterName:constructor:classAttributes:")
    public static native void registerFilterNameConstructorClassAttributes(@NotNull String name,
            @NotNull @Mapped(ObjCObjectMapper.class) CIFilterConstructor anObject,
            @NotNull NSDictionary<String, ?> attributes);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Given an array of filters, serialize the filters' parameters
     * into XMP form that is suitable for embedding in to an image.
     * At this time the only filters classes that are serialized
     * are, CIAffineTransform, CICrop, and the filters returned by
     * [CIImage autoAdjustmentFilters].
     * The parameters of other filter classes will not be serialized.
     * The return value will be null if none of the filters can be serialized.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("serializedXMPFromFilters:inputImageExtent:")
    public static native NSData serializedXMPFromFiltersInputImageExtent(@NotNull NSArray<? extends CIFilter> filters,
            @ByValue CGRect extent);

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
     * Returns a dictionary containing key/value pairs describing the filter. (see description of keys below)
     */
    @NotNull
    @Generated
    @Selector("attributes")
    public native NSDictionary<String, ?> attributes();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native CIFilter init();

    @Generated
    @Selector("initWithCoder:")
    public native CIFilter initWithCoder(@NotNull NSCoder coder);

    /**
     * Returns an array containing the names of all inputs in the filter.
     */
    @NotNull
    @Generated
    @Selector("inputKeys")
    public native NSArray<String> inputKeys();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("outputImage")
    public native CIImage outputImage();

    /**
     * Returns an array containing the names of all outputs in the filter.
     */
    @NotNull
    @Generated
    @Selector("outputKeys")
    public native NSArray<String> outputKeys();

    /**
     * Sets all inputs to their default values (where default values are defined, other inputs are left as-is).
     */
    @Generated
    @Selector("setDefaults")
    public native void setDefaults();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String aString);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns a NSArray containing the names of all supported RAW cameras.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use new CIRAWFilter class instead.
     */
    @Deprecated
    @Generated
    @Selector("supportedRawCameraModels")
    public static native NSArray<String> supportedRawCameraModels();
}
