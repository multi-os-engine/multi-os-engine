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

package ios.modelio;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.corefoundation.opaque.CFStringRef;
import ios.coregraphics.opaque.CGImageRef;
import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSData;
import ios.foundation.NSURL;
import ios.modelio.protocol.MDLNamed;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLTexture extends NSObject implements MDLNamed {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLTexture(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLTexture alloc();

	/**
	 * channelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/channelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("channelCount")
	@NUInt
	public native long channelCount();

	/**
	 * channelEncoding</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/channelEncoding">iOS Dev Center</a>
	 */
	@Generated
	@Selector("channelEncoding")
	@NInt
	public native long channelEncoding();

	/**
	 * imageFromTexture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/imageFromTexture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageFromTexture")
	public native CGImageRef imageFromTexture();

	@Generated
	@Selector("init")
	public native MDLTexture init();

	/**
	 * isCube</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/isCube">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isCube")
	public native boolean isCube();

	/**
	 * mipLevelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/mipLevelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mipLevelCount")
	@NUInt
	public native long mipLevelCount();

	@Generated
	@Selector("name")
	public native String name();

	/**
	 * rowStride</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/rowStride">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rowStride")
	@NInt
	public native long rowStride();

	/**
	 * isCube</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instp/MDLTexture/isCube">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIsCube:")
	public native void setIsCube(boolean value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * texelDataWithBottomLeftOrigin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/texelDataWithBottomLeftOrigin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texelDataWithBottomLeftOrigin")
	public native NSData texelDataWithBottomLeftOrigin();

	/**
	 * texelDataWithBottomLeftOriginAtMipLevel:create:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/texelDataWithBottomLeftOriginAtMipLevel:create:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texelDataWithBottomLeftOriginAtMipLevel:create:")
	public native NSData texelDataWithBottomLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

	/**
	 * texelDataWithTopLeftOrigin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/texelDataWithTopLeftOrigin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texelDataWithTopLeftOrigin")
	public native NSData texelDataWithTopLeftOrigin();

	/**
	 * texelDataWithTopLeftOriginAtMipLevel:create:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/texelDataWithTopLeftOriginAtMipLevel:create:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("texelDataWithTopLeftOriginAtMipLevel:create:")
	public native NSData texelDataWithTopLeftOriginAtMipLevelCreate(@NInt long level, boolean create);

	/**
	 * textureCubeWithImagesNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/clm/MDLTexture/textureCubeWithImagesNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureCubeWithImagesNamed:")
	public static native MDLTexture textureCubeWithImagesNamed(NSArray<String> names);

	/**
	 * textureCubeWithImagesNamed:bundle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/clm/MDLTexture/textureCubeWithImagesNamed:bundle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureCubeWithImagesNamed:bundle:")
	public static native MDLTexture textureCubeWithImagesNamedBundle(NSArray<String> names, NSBundle bundleOrNil);

	/**
	 * textureNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/clm/MDLTexture/textureNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureNamed:")
	public static native MDLTexture textureNamed(String name);

	/**
	 * textureNamed:bundle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/clm/MDLTexture/textureNamed:bundle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureNamed:bundle:")
	public static native MDLTexture textureNamedBundle(String name, NSBundle bundleOrNil);

	/**
	 * writeToURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/writeToURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("writeToURL:")
	public native boolean writeToURL(NSURL URL);

	/**
	 * writeToURL:type:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLTexture_Class/index.html#//apple_ref/occ/instm/MDLTexture/writeToURL:type:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("writeToURL:type:")
	public native boolean writeToURLType(NSURL nsurl, CFStringRef type);

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
	public static native void load_objc();

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
