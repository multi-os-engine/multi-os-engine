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

package apple.metalkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.modelio.MDLTexture;
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
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKTextureLoader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKTextureLoader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKTextureLoader alloc();

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

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("init")
    public native MTKTextureLoader init();

    @Generated
    @Selector("initWithDevice:")
    public native MTKTextureLoader initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("newTextureWithCGImage:options:completionHandler:")
    public native void newTextureWithCGImageOptionsCompletionHandler(CGImageRef cgImage,
            NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTextureWithCGImageOptionsCompletionHandler") Block_newTextureWithCGImageOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTextureWithCGImage:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithCGImageOptionsError(CGImageRef cgImage,
            NSDictionary<String, ? extends NSObject> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTextureWithContentsOfURL:options:completionHandler:")
    public native void newTextureWithContentsOfURLOptionsCompletionHandler(NSURL URL,
            NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTextureWithContentsOfURLOptionsCompletionHandler") Block_newTextureWithContentsOfURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTextureWithContentsOfURL:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithContentsOfURLOptionsError(NSURL URL,
            NSDictionary<String, ? extends NSObject> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTextureWithData:options:completionHandler:")
    public native void newTextureWithDataOptionsCompletionHandler(NSData data,
            NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTextureWithDataOptionsCompletionHandler") Block_newTextureWithDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTextureWithData:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithDataOptionsError(NSData data,
            NSDictionary<String, ? extends NSObject> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTextureWithMDLTexture:options:completionHandler:")
    public native void newTextureWithMDLTextureOptionsCompletionHandler(MDLTexture texture,
            NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTextureWithMDLTextureOptionsCompletionHandler") Block_newTextureWithMDLTextureOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTextureWithMDLTexture:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithMDLTextureOptionsError(MDLTexture texture,
            NSDictionary<String, ? extends NSObject> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTextureWithName:scaleFactor:bundle:options:completionHandler:")
    public native void newTextureWithNameScaleFactorBundleOptionsCompletionHandler(String name,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTextureWithNameScaleFactorBundleOptionsCompletionHandler") Block_newTextureWithNameScaleFactorBundleOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTextureWithName:scaleFactor:bundle:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithNameScaleFactorBundleOptionsError(String name, @NFloat double scaleFactor,
            NSBundle bundle, NSDictionary<String, ? extends NSObject> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTexturesWithContentsOfURLs:options:completionHandler:")
    public native void newTexturesWithContentsOfURLsOptionsCompletionHandler(NSArray<? extends NSURL> URLs,
            NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTexturesWithContentsOfURLsOptionsCompletionHandler") Block_newTexturesWithContentsOfURLsOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newTexturesWithContentsOfURLs:options:error:")
    public native NSArray<?> newTexturesWithContentsOfURLsOptionsError(NSArray<? extends NSURL> URLs,
            NSDictionary<String, ? extends NSObject> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTexturesWithNames:scaleFactor:bundle:options:completionHandler:")
    public native void newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler(NSArray<String> names,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ? extends NSObject> options,
            @ObjCBlock(name = "call_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler") Block_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithCGImageOptionsCompletionHandler {
        @Generated
        void call_newTextureWithCGImageOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithContentsOfURLOptionsCompletionHandler {
        @Generated
        void call_newTextureWithContentsOfURLOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithDataOptionsCompletionHandler {
        @Generated
        void call_newTextureWithDataOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithMDLTextureOptionsCompletionHandler {
        @Generated
        void call_newTextureWithMDLTextureOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithNameScaleFactorBundleOptionsCompletionHandler {
        @Generated
        void call_newTextureWithNameScaleFactorBundleOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTexturesWithContentsOfURLsOptionsCompletionHandler {
        @Generated
        void call_newTexturesWithContentsOfURLsOptionsCompletionHandler(NSArray<?> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler {
        @Generated
        void call_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler(NSArray<?> arg0, NSError arg1);
    }
}
