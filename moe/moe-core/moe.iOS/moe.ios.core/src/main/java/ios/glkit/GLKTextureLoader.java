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

package ios.glkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.coregraphics.opaque.CGImageRef;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSNumber;
import ios.foundation.NSURL;
import ios.opengles.EAGLSharegroup;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKTextureLoader extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected GLKTextureLoader(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native GLKTextureLoader alloc();

	/**
	 * cubeMapWithContentsOfFile:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/cubeMapWithContentsOfFile:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfFile:options:error:")
	public static native GLKTextureInfo cubeMapWithContentsOfFileOptionsError(
			String path, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * cubeMapWithContentsOfFile:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/cubeMapWithContentsOfFile:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfFile:options:queue:completionHandler:")
	public native void cubeMapWithContentsOfFileOptionsQueueCompletionHandler(
			String path,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler {
		@Generated
		void call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	/**
	 * cubeMapWithContentsOfFiles:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/cubeMapWithContentsOfFiles:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfFiles:options:error:")
	public static native GLKTextureInfo cubeMapWithContentsOfFilesOptionsError(
			NSArray<?> paths, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * cubeMapWithContentsOfFiles:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/cubeMapWithContentsOfFiles:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfFiles:options:queue:completionHandler:")
	public native void cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(
			NSArray<?> paths,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler {
		@Generated
		void call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	/**
	 * cubeMapWithContentsOfURL:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/cubeMapWithContentsOfURL:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfURL:options:error:")
	public static native GLKTextureInfo cubeMapWithContentsOfURLOptionsError(
			NSURL url, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * cubeMapWithContentsOfURL:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/cubeMapWithContentsOfURL:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cubeMapWithContentsOfURL:options:queue:completionHandler:")
	public native void cubeMapWithContentsOfURLOptionsQueueCompletionHandler(
			NSURL url,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler {
		@Generated
		void call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	@Generated
	@Selector("init")
	public native GLKTextureLoader init();

	/**
	 * initWithSharegroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/initWithSharegroup:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSharegroup:")
	public native GLKTextureLoader initWithSharegroup(EAGLSharegroup sharegroup);

	/**
	 * textureWithCGImage:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/textureWithCGImage:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithCGImage:options:error:")
	public static native GLKTextureInfo textureWithCGImageOptionsError(
			CGImageRef cgImage, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * textureWithCGImage:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/textureWithCGImage:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithCGImage:options:queue:completionHandler:")
	public native void textureWithCGImageOptionsQueueCompletionHandler(
			CGImageRef cgImage,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_textureWithCGImageOptionsQueueCompletionHandler") Block_textureWithCGImageOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_textureWithCGImageOptionsQueueCompletionHandler {
		@Generated
		void call_textureWithCGImageOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	/**
	 * textureWithContentsOfData:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/textureWithContentsOfData:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfData:options:error:")
	public static native GLKTextureInfo textureWithContentsOfDataOptionsError(
			NSData data, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * textureWithContentsOfData:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/textureWithContentsOfData:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfData:options:queue:completionHandler:")
	public native void textureWithContentsOfDataOptionsQueueCompletionHandler(
			NSData data,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_textureWithContentsOfDataOptionsQueueCompletionHandler") Block_textureWithContentsOfDataOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_textureWithContentsOfDataOptionsQueueCompletionHandler {
		@Generated
		void call_textureWithContentsOfDataOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	/**
	 * textureWithContentsOfFile:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/textureWithContentsOfFile:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfFile:options:error:")
	public static native GLKTextureInfo textureWithContentsOfFileOptionsError(
			String path, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * textureWithContentsOfFile:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/textureWithContentsOfFile:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfFile:options:queue:completionHandler:")
	public native void textureWithContentsOfFileOptionsQueueCompletionHandler(
			String path,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_textureWithContentsOfFileOptionsQueueCompletionHandler") Block_textureWithContentsOfFileOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_textureWithContentsOfFileOptionsQueueCompletionHandler {
		@Generated
		void call_textureWithContentsOfFileOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
	}

	/**
	 * textureWithContentsOfURL:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/clm/GLKTextureLoader/textureWithContentsOfURL:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfURL:options:error:")
	public static native GLKTextureInfo textureWithContentsOfURLOptionsError(
			NSURL url, NSDictionary<String, ? extends NSNumber> options, Ptr<NSError> outError);

	/**
	 * textureWithContentsOfURL:options:queue:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKTextureLoader_ClassRef/index.html#//apple_ref/occ/instm/GLKTextureLoader/textureWithContentsOfURL:options:queue:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textureWithContentsOfURL:options:queue:completionHandler:")
	public native void textureWithContentsOfURLOptionsQueueCompletionHandler(
			NSURL url,
			NSDictionary<String, ? extends NSNumber> options,
			NSObject queue,
			@ObjCBlock(name = "call_textureWithContentsOfURLOptionsQueueCompletionHandler") Block_textureWithContentsOfURLOptionsQueueCompletionHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_textureWithContentsOfURLOptionsQueueCompletionHandler {
		@Generated
		void call_textureWithContentsOfURLOptionsQueueCompletionHandler(
				GLKTextureInfo arg0, NSError arg1);
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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
