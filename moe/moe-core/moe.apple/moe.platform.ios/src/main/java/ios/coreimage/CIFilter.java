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

package ios.coreimage;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.coreimage.protocol.CIFilterConstructor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native CIFilter alloc();

	/**
	 * attributes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instp/CIFilter/attributes">iOS Dev Center</a>
	 */
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
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * filterArrayFromSerializedXMP:inputImageExtent:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterArrayFromSerializedXMP:inputImageExtent:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterArrayFromSerializedXMP:inputImageExtent:error:")
	public static native NSArray<? extends CIFilter> filterArrayFromSerializedXMPInputImageExtentError(
			NSData xmpData, @ByValue CGRect extent, Ptr<NSError> outError);

	/**
	 * filterNamesInCategories:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterNamesInCategories:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterNamesInCategories:")
	public static native NSArray<String> filterNamesInCategories(NSArray<String> categories);

	/**
	 * filterNamesInCategory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterNamesInCategory:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterNamesInCategory:")
	public static native NSArray<String> filterNamesInCategory(String category);

	/**
	 * filterWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterWithName:")
	public static native CIFilter filterWithName(String name);

	/**
	 * filterWithName:keysAndValues:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterWithName:keysAndValues:">iOS Dev Center</a>
	 */
	@Generated
	@Variadic()
	@Selector("filterWithName:keysAndValues:")
	public static native CIFilter filterWithNameKeysAndValues(String name,
			@Mapped(ObjCObjectMapper.class) Object key0, Object... varargs);

	/**
	 * filterWithName:withInputParameters:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/filterWithName:withInputParameters:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filterWithName:withInputParameters:")
	public static native CIFilter filterWithNameWithInputParameters(
			String name, NSDictionary<String, ?> params);

	@Generated
	@Selector("init")
	public native CIFilter init();

	@Generated
	@Selector("initWithCoder:")
	public native CIFilter initWithCoder(NSCoder aDecoder);

	/**
	 * inputKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instp/CIFilter/inputKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inputKeys")
	public native NSArray<String> inputKeys();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instp/CIFilter/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * outputImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instp/CIFilter/outputImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputImage")
	public native CIImage outputImage();

	/**
	 * outputKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instp/CIFilter/outputKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputKeys")
	public native NSArray<String> outputKeys();

	/**
	 * serializedXMPFromFilters:inputImageExtent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/serializedXMPFromFilters:inputImageExtent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("serializedXMPFromFilters:inputImageExtent:")
	public static native NSData serializedXMPFromFiltersInputImageExtent(
			NSArray<? extends CIFilter> filters, @ByValue CGRect extent);

	/**
	 * setDefaults</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/instm/CIFilter/setDefaults">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDefaults")
	public native void setDefaults();

	/**
	 * localizedDescriptionForFilterName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/localizedDescriptionForFilterName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedDescriptionForFilterName:")
	public static native String localizedDescriptionForFilterName(String filterName);

	/**
	 * localizedNameForCategory:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/localizedNameForCategory:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedNameForCategory:")
	public static native String localizedNameForCategory(String category);

	/**
	 * localizedNameForFilterName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/localizedNameForFilterName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedNameForFilterName:")
	public static native String localizedNameForFilterName(String filterName);

	/**
	 * localizedReferenceDocumentationForFilterName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/localizedReferenceDocumentationForFilterName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedReferenceDocumentationForFilterName:")
	public static native NSURL localizedReferenceDocumentationForFilterName(String filterName);

	/**
	 * registerFilterName:constructor:classAttributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIFilter_Class/index.html#//apple_ref/occ/clm/CIFilter/registerFilterName:constructor:classAttributes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerFilterName:constructor:classAttributes:")
	public static native void registerFilterNameConstructorClassAttributes(String name,
			@Mapped(ObjCObjectMapper.class) CIFilterConstructor anObject, NSDictionary<String, ?> attributes);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native long version();
}
