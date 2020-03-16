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
import apple.coregraphics.struct.CGRect;
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
    @Selector("filterArrayFromSerializedXMP:inputImageExtent:error:")
    public static native NSArray<? extends CIFilter> filterArrayFromSerializedXMPInputImageExtentError(NSData xmpData,
            @ByValue CGRect extent, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("filterNamesInCategories:")
    public static native NSArray<String> filterNamesInCategories(NSArray<String> categories);

    @Generated
    @Selector("filterNamesInCategory:")
    public static native NSArray<String> filterNamesInCategory(String category);

    @Generated
    @Selector("filterWithCVPixelBuffer:properties:options:")
    public static native CIFilter filterWithCVPixelBufferPropertiesOptions(CVBufferRef pixelBuffer,
            NSDictionary<?, ?> properties, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithImageData:options:")
    public static native CIFilter filterWithImageDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithImageURL:options:")
    public static native CIFilter filterWithImageURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("filterWithName:")
    public static native CIFilter filterWithName(String name);

    @Generated
    @Variadic()
    @Selector("filterWithName:keysAndValues:")
    public static native CIFilter filterWithNameKeysAndValues(String name, @Mapped(ObjCObjectMapper.class) Object key0,
            Object... varargs);

    @Generated
    @Selector("filterWithName:withInputParameters:")
    public static native CIFilter filterWithNameWithInputParameters(String name, NSDictionary<String, ?> params);

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
    @Selector("localizedDescriptionForFilterName:")
    public static native String localizedDescriptionForFilterName(String filterName);

    @Generated
    @Selector("localizedNameForCategory:")
    public static native String localizedNameForCategory(String category);

    @Generated
    @Selector("localizedNameForFilterName:")
    public static native String localizedNameForFilterName(String filterName);

    @Generated
    @Selector("localizedReferenceDocumentationForFilterName:")
    public static native NSURL localizedReferenceDocumentationForFilterName(String filterName);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("registerFilterName:constructor:classAttributes:")
    public static native void registerFilterNameConstructorClassAttributes(String name,
            @Mapped(ObjCObjectMapper.class) CIFilterConstructor anObject, NSDictionary<String, ?> attributes);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serializedXMPFromFilters:inputImageExtent:")
    public static native NSData serializedXMPFromFiltersInputImageExtent(NSArray<? extends CIFilter> filters,
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

    @Generated
    @Selector("attributes")
    public native NSDictionary<String, ?> attributes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native CIFilter init();

    @Generated
    @Selector("initWithCoder:")
    public native CIFilter initWithCoder(NSCoder coder);

    @Generated
    @Selector("inputKeys")
    public native NSArray<String> inputKeys();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("outputImage")
    public native CIImage outputImage();

    @Generated
    @Selector("outputKeys")
    public native NSArray<String> outputKeys();

    @Generated
    @Selector("setDefaults")
    public native void setDefaults();

    @Generated
    @Selector("setName:")
    public native void setName(String aString);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("supportedRawCameraModels")
    public static native NSArray<String> supportedRawCameraModels();
}
