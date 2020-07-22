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
import org.moe.natj.general.ann.MappedReturn;
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
    @Selector("cubeMapWithContentsOfFile:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfFileOptionsError(String path,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("cubeMapWithContentsOfFiles:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfFilesOptionsError(NSArray<?> paths,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("cubeMapWithContentsOfURL:options:error:")
    public static native GLKTextureInfo cubeMapWithContentsOfURLOptionsError(NSURL url,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    @Selector("textureWithCGImage:options:error:")
    public static native GLKTextureInfo textureWithCGImageOptionsError(CGImageRef cgImage,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("textureWithContentsOfData:options:error:")
    public static native GLKTextureInfo textureWithContentsOfDataOptionsError(NSData data,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("textureWithContentsOfFile:options:error:")
    public static native GLKTextureInfo textureWithContentsOfFileOptionsError(String path,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("textureWithContentsOfURL:options:error:")
    public static native GLKTextureInfo textureWithContentsOfURLOptionsError(NSURL url,
            NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("textureWithName:scaleFactor:bundle:options:error:")
    public static native GLKTextureInfo textureWithNameScaleFactorBundleOptionsError(String name,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ? extends NSNumber> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("cubeMapWithContentsOfFile:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfFileOptionsQueueCompletionHandler(String path,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler block);

    @Generated
    @Selector("cubeMapWithContentsOfFiles:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(NSArray<?> paths,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler block);

    @Generated
    @Selector("cubeMapWithContentsOfURL:options:queue:completionHandler:")
    public native void cubeMapWithContentsOfURLOptionsQueueCompletionHandler(NSURL url,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler") Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler block);

    @Generated
    @Selector("init")
    public native GLKTextureLoader init();

    @Generated
    @Selector("initWithSharegroup:")
    public native GLKTextureLoader initWithSharegroup(EAGLSharegroup sharegroup);

    @Generated
    @Selector("textureWithCGImage:options:queue:completionHandler:")
    public native void textureWithCGImageOptionsQueueCompletionHandler(CGImageRef cgImage,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_textureWithCGImageOptionsQueueCompletionHandler") Block_textureWithCGImageOptionsQueueCompletionHandler block);

    @Generated
    @Selector("textureWithContentsOfData:options:queue:completionHandler:")
    public native void textureWithContentsOfDataOptionsQueueCompletionHandler(NSData data,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_textureWithContentsOfDataOptionsQueueCompletionHandler") Block_textureWithContentsOfDataOptionsQueueCompletionHandler block);

    @Generated
    @Selector("textureWithContentsOfFile:options:queue:completionHandler:")
    public native void textureWithContentsOfFileOptionsQueueCompletionHandler(String path,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_textureWithContentsOfFileOptionsQueueCompletionHandler") Block_textureWithContentsOfFileOptionsQueueCompletionHandler block);

    @Generated
    @Selector("textureWithContentsOfURL:options:queue:completionHandler:")
    public native void textureWithContentsOfURLOptionsQueueCompletionHandler(NSURL url,
            NSDictionary<String, ? extends NSNumber> options, NSObject queue,
            @ObjCBlock(name = "call_textureWithContentsOfURLOptionsQueueCompletionHandler") Block_textureWithContentsOfURLOptionsQueueCompletionHandler block);

    @Generated
    @Selector("textureWithName:scaleFactor:bundle:options:queue:completionHandler:")
    public native void textureWithNameScaleFactorBundleOptionsQueueCompletionHandler(String name,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ? extends NSNumber> options,
            NSObject queue,
            @ObjCBlock(name = "call_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler") Block_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfFileOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfFileOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfFilesOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cubeMapWithContentsOfURLOptionsQueueCompletionHandler {
        @Generated
        void call_cubeMapWithContentsOfURLOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithCGImageOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithCGImageOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfDataOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfDataOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfFileOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfFileOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithContentsOfURLOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithContentsOfURLOptionsQueueCompletionHandler(GLKTextureInfo textureInfo, NSError outError);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler {
        @Generated
        void call_textureWithNameScaleFactorBundleOptionsQueueCompletionHandler(GLKTextureInfo textureInfo,
                NSError outError);
    }
}
