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

package apple.glkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.opengles.EAGLSharegroup;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * API-Since: 5.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
@Deprecated
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKTextureLoader alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKTextureLoader allocWithZone(VoidPtr zone);

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

    /**
     * File path of image.
     */
    @Nullable
    @Generated
    @Selector("cubeMapWithContentsOfFile:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfFileOptionsError(@NotNull String path,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * An array of paths (NSStrings or NSURLs).
     */
    @Nullable
    @Generated
    @Selector("cubeMapWithContentsOfFiles:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfFilesOptionsError(@NotNull NSArray<?> paths,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * File path of image.
     */
    @Nullable
    @Generated
    @Selector("cubeMapWithContentsOfURL:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfURLOptionsError(@NotNull NSURL url,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    public static native GLKTextureLoader new_objc();

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

    /**
     * CGImage reference.
     */
    @Nullable
    @Generated
    @Selector("textureWithCGImage:options:error:")
    public static native GLKTextureInfo textureWithCGImageOptionsError(@NotNull CGImageRef cgImage,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * NSData containing image contents.
     */
    @Nullable
    @Generated
    @Selector("textureWithContentsOfData:options:error:")
    public static native GLKTextureInfo textureWithContentsOfDataOptionsError(@NotNull NSData data,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * File path of image.
     */
    @Nullable
    @Generated
    @Selector("textureWithContentsOfFile:options:error:")
    public static native GLKTextureInfo textureWithContentsOfFileOptionsError(@NotNull String path,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The URL from which to read.
     */
    @Nullable
    @Generated
    @Selector("textureWithContentsOfURL:options:error:")
    public static native GLKTextureInfo textureWithContentsOfURLOptionsError(@NotNull NSURL url,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The asset name
     */
    @Nullable
    @Generated
    @Selector("textureWithName:scaleFactor:bundle:options:error:")
    public static native GLKTextureInfo textureWithNameScaleFactorBundleOptionsError(@NotNull String name,
            @NFloat double scaleFactor, @Nullable NSBundle bundle,
            @Nullable NSDictionary<String, ? extends NSNumber> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * File path of image.
     */
    @Generated
    @Selector("cubeMapWithContentsOfFile:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfFileOptionsQueueCompletionHandler(@NotNull String path,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler block);

    /**
     * An array of paths (NSStrings or NSURLs).
     */
    @Generated
    @Selector("cubeMapWithContentsOfFiles:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(@NotNull NSArray<?> paths,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler block);

    /**
     * File path of image.
     */
    @Generated
    @Selector("cubeMapWithContentsOfURL:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfURLOptionsQueueCompletionHandler(@NotNull NSURL url,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler block);

    @Generated
    @Selector("init")
    public native GLKTextureLoader init();

    @Generated
    @Selector("initWithSharegroup:")
    public native GLKTextureLoader initWithSharegroup(@NotNull EAGLSharegroup sharegroup);

    /**
     * CGImage reference.
     */
    @Generated
    @Selector("textureWithCGImage:options:queue:completionHandler:")
    public native void textureWithCGImageOptionsQueueCompletionHandler(@NotNull CGImageRef cgImage,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_textureWithCGImageOptionsQueueCompletionHandler") Block_textureWithCGImageOptionsQueueCompletionHandler block);

    /**
     * NSData containing image contents.
     */
    @Generated
    @Selector("textureWithContentsOfData:options:queue:completionHandler:")
    public native void textureWithContentsOfDataOptionsQueueCompletionHandler(@NotNull NSData data,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_textureWithContentsOfDataOptionsQueueCompletionHandler") Block_textureWithContentsOfDataOptionsQueueCompletionHandler block);

    /**
     * File path of image.
     */
    @Generated
    @Selector("textureWithContentsOfFile:options:queue:completionHandler:")
    public native void textureWithContentsOfFileOptionsQueueCompletionHandler(@NotNull String path,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_textureWithContentsOfFileOptionsQueueCompletionHandler") Block_textureWithContentsOfFileOptionsQueueCompletionHandler block);

    /**
     * File path of image.
     */
    @Generated
    @Selector("textureWithContentsOfURL:options:queue:completionHandler:")
    public native void textureWithContentsOfURLOptionsQueueCompletionHandler(@NotNull NSURL url,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_textureWithContentsOfURLOptionsQueueCompletionHandler") Block_textureWithContentsOfURLOptionsQueueCompletionHandler block);

    /**
     * The asset name
     */
    @Generated
    @Selector("textureWithName:scaleFactor:bundle:options:queue:completionHandler:")
    public native void textureWithNameScaleFactorBundleOptionsQueueCompletionHandler(@NotNull String name,
            @NFloat double scaleFactor, @Nullable NSBundle bundle,
            @Nullable NSDictionary<String, ? extends NSNumber> options, @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler") Block_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithCGImageOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithCGImageOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfDataOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfDataOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfFileOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfFileOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfURLOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfURLOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler(@Nullable GLKTextureInfo textureInfo,
                @Nullable NSError outError);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
