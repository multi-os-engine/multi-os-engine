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

/**
 * MTKTextureLoader
 * 
 * Load Metal textures from files with the device specified at initialization
 */
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
     * [@property] device
     * 
     * Metal device with which to create Metal textures
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("init")
    public native MTKTextureLoader init();

    /**
     * initWithDevice:
     * 
     * Initialize the loader
     * 
     * @param device Metal device with which to create Metal textures
     */
    @Generated
    @Selector("initWithDevice:")
    public native MTKTextureLoader initWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * newTextureWithCGImage:options:completionHandler:
     * 
     * Asynchronously create a Metal texture and load image data from the given CGImageRef
     * 
     * @param cgImage CGImageRef containing image data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param completionHandler Block called when texture has been loaded and fully initialized
     */
    @Generated
    @Selector("newTextureWithCGImage:options:completionHandler:")
    public native void newTextureWithCGImageOptionsCompletionHandler(CGImageRef cgImage,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTextureWithCGImageOptionsCompletionHandler") Block_newTextureWithCGImageOptionsCompletionHandler completionHandler);

    /**
     * newTextureWithCGImage:options:error:
     * 
     * Synchronously create a Metal texture and load image data from the given CGImageRef
     * 
     * @return The Metal texture. nil if an error occured
     * @param cgImage CGImageRef containing image data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param error Pointer to an autoreleased NSError object which will be set if an error occurred
     */
    @Generated
    @Selector("newTextureWithCGImage:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithCGImageOptionsError(CGImageRef cgImage, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithContentsOfURL:options:completionHandler:
     * 
     * Asynchronously create a Metal texture and load image data from the file at URL
     * 
     * @param URL Location of image file from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param completionHandler Block called when the texture has been loaded and fully initialized
     */
    @Generated
    @Selector("newTextureWithContentsOfURL:options:completionHandler:")
    public native void newTextureWithContentsOfURLOptionsCompletionHandler(NSURL URL, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTextureWithContentsOfURLOptionsCompletionHandler") Block_newTextureWithContentsOfURLOptionsCompletionHandler completionHandler);

    /**
     * newTextureWithContentsOfURL:options:error:
     * 
     * Synchronously create a Metal texture and load image data from the file at URL
     * 
     * @return The Metal texture. nil if an error occured
     * @param URL Location of image file from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param error Pointer to an autoreleased NSError object which will be set if an error occurred
     */
    @Generated
    @Selector("newTextureWithContentsOfURL:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithContentsOfURLOptionsError(NSURL URL, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithData:options:completionHandler:
     * 
     * Asynchronously create a Metal texture and load image data from the NSData object provided
     * 
     * @param data NSData object containing image file data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param completionHandler Block called when texture has been loaded and fully initialized
     */
    @Generated
    @Selector("newTextureWithData:options:completionHandler:")
    public native void newTextureWithDataOptionsCompletionHandler(NSData data, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTextureWithDataOptionsCompletionHandler") Block_newTextureWithDataOptionsCompletionHandler completionHandler);

    /**
     * newTextureWithData:options:error:
     * 
     * Synchronously create a Metal texture and load image data from the NSData object provided
     * 
     * @return The Metal texture. nil if an error occured
     * @param data NSData object containing image file data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param error Pointer to an autoreleased NSError object which will be set if an error occurred
     */
    @Generated
    @Selector("newTextureWithData:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithDataOptionsError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithMDLTexture:options:completionHandler:
     * 
     * Asynchronously create a Metal texture and load image data from the given MDLTexture
     * 
     * @param texture MDLTexture containing image data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param completionHandler Block called when texture has been loaded and fully initialized
     */
    @Generated
    @Selector("newTextureWithMDLTexture:options:completionHandler:")
    public native void newTextureWithMDLTextureOptionsCompletionHandler(MDLTexture texture,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTextureWithMDLTextureOptionsCompletionHandler") Block_newTextureWithMDLTextureOptionsCompletionHandler completionHandler);

    /**
     * newTextureWithMDLTexture:options:error:
     * 
     * Synchronously create a Metal texture and load image data from the given MDLTexture
     * 
     * @return The Metal texture. nil if an error occured
     * @param texture MDLTexture containing image data from which to create the texture
     * @param options Dictonary of MTKTextureLoaderOptions
     * @param error Pointer to an autoreleased NSError object which will be set if an error occurred
     */
    @Generated
    @Selector("newTextureWithMDLTexture:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithMDLTextureOptionsError(MDLTexture texture, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithName:scaleFactor:bundle:options:completionHandler:
     * 
     * Asynchronously create a Metal texture and load image data from a given texture or image
     *           asset name
     * 
     * Uses texture data from version of the texture from the texture set in the asset catalog
     *             which mathces the device's traits.
     *             This method attempts to load a texture asset with thw name iven.  If a texture asset
     *             with the name given does not exist, it will attempt to create a texture from an
     *             image asset with the given name
     * 
     * @param name A texture or image asset name
     * @param scaleFactor scale factor of the texture to retrieve from the asset catalog.  Typically the 
     *                    value retrieved from -[UIView contentScale] or -[NSWindow backingScaleFactor].
     * @param bundle Resource bundle in which the asset is located.  Main bundle used if nil.
     * @param options Dictonary of MTKTextureLoaderOptions. The following options are ignormed when used
     *                to load a texture asset but can be used when creating a texture from an image asset:
     *                    MTKTextureLoaderOptionGenerateMipmaps
     *                    MTKTextureLoaderOptionSRGB
     *                    MTKTextureLoaderOptionCubeFromVerticalTexture
     *                    MTKTextureLoaderOptionOrigin
     * @param completionHandler Block called when texture has been loaded and fully initialized
     */
    @Generated
    @Selector("newTextureWithName:scaleFactor:bundle:options:completionHandler:")
    public native void newTextureWithNameScaleFactorBundleOptionsCompletionHandler(String name,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTextureWithNameScaleFactorBundleOptionsCompletionHandler") Block_newTextureWithNameScaleFactorBundleOptionsCompletionHandler completionHandler);

    /**
     * newTextursWithName:scaleFactor:bundle:options:error:
     * 
     * Synchronously create a Metal texture with texture data from a given texture or image
     *           asset name
     * 
     * Uses texture data from version of the texture from the texture set in the asset catalog
     *             which mathces the device's traits.
     *             This method attempts to load a texture asset with the name given.  If a texture asset
     *             with the name given does not exist, it will attempt to create a texture from an
     *             image asset with the given name.
     * 
     * @return The Metal texture. nil if an error occured
     * @param names An array of texture asset names
     * @param scaleFactor scale factor of the texture to retrieve from the asset catalog.  Typically the
     *                    value retrieved from -[UIView contentScale] or -[NSWindow backingScaleFactor].
     * @param bundle Resource bundle in which the asset is located.  Main bundle used if nil.
     * @param options Dictonary of MTKTextureLoaderOptions. The following options are ignormed when used
     *                to load a texture asset but can be used when creating a texture from an image asset
     *                    MTKTextureLoaderOptionGenerateMipmaps
     *                    MTKTextureLoaderOptionSRGB
     *                    MTKTextureLoaderOptionCubeFromVerticalTexture
     *                    MTKTextureLoaderOptionOrigins
     */
    @Generated
    @Selector("newTextureWithName:scaleFactor:bundle:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLTexture newTextureWithNameScaleFactorBundleOptionsError(String name, @NFloat double scaleFactor,
            NSBundle bundle, NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTexturesWithContentsOfURLs:options:completionHandler:
     * 
     * Asynchronously create an array of Metal textures and load image data from the files at URLs
     * 
     * @param URLs Locations of image files from which to create the textures
     * @param options Dictonary of MTKTextureLoaderOptions, which will be used for every texture loaded
     * @param completionHandler Block called when all of the textures have been loaded and fully initialized. The array of MTLTextures will be the same length and in the same order as the requested array of paths. If an error occurs while loading a texture, the corresponding array index will contain NSNull. The NSError will be null if all of the textures are loaded successfully, or will correspond to one of the textures which failed to load.
     */
    @Generated
    @Selector("newTexturesWithContentsOfURLs:options:completionHandler:")
    public native void newTexturesWithContentsOfURLsOptionsCompletionHandler(NSArray<? extends NSURL> URLs,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTexturesWithContentsOfURLsOptionsCompletionHandler") Block_newTexturesWithContentsOfURLsOptionsCompletionHandler completionHandler);

    /**
     * newTexturesWithContentsOfURLs:options:completionHandler:
     * 
     * Synchronously create an array of Metal textures and load image data from the files at URLs
     * 
     * @return An array of MTLTextures of the same length and in the same order as the requested array of
     *         paths.  If an error occurs while loading a texture, the corresponding array index will
     *         contain [NSNull null].
     * @param URLs Locations of image files from which to create the textures
     * @param options Dictonary of MTKTextureLoaderOptions, which will be used for every texture loaded
     * @param error Pointer to an autoreleased NSError object which will be set if an error occurred.
     *              Will be null if all of the textures are loaded successfully, or will correspond to
     *              one of the textures which failed to load.
     */
    @Generated
    @Selector("newTexturesWithContentsOfURLs:options:error:")
    public native NSArray<?> newTexturesWithContentsOfURLsOptionsError(NSArray<? extends NSURL> URLs,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTexturesWithNames:scaleFactor:bundle:options:completionHandler:
     * 
     * Asynchronously create Metal textures and load image data from a given texture or image
     *           asset names
     * 
     * Uses texture data from version of the texture from the texture set in the asset catalog
     *             which mathces the device's traits.
     *             This method attempts to load a texture asset with each name iven.  If a texture asset
     *             with the name given does not exist, it will attempt to create a texture from an
     *             image asset with the given name.
     * 
     * @param names An array texture or image asset names.  If an error occurs while loading a texture,
     *              the corresponding index in the returned array contain [NSNull null]
     * @param scaleFactor scale factor of the texture to retrieve from the asset catalog.  Typically the
     *                    value retrieved from -[UIView contentScale] or -[NSWindow backingScaleFactor].
     * @param bundle Resource bundle in which the assets are located.  Main bundle used if nil.
     * @param options Dictonary of MTKTextureLoaderOptions. The following options are ignormed when used
     *                to load a texture asset but can be used when creating a texture from an image asset
     *                    MTKTextureLoaderOptionGenerateMipmaps
     *                    MTKTextureLoaderOptionSRGB
     *                    MTKTextureLoaderOptionCubeFromVerticalTexture
     *                    MTKTextureLoaderOptionOrigin
     * @param completionHandler Block called when all of the textures have been loaded and fully
     *                          initialized. The NSError will be null if all of the textures are loaded
     *                          successfully, or will correspond to one of the textures which failed to
     *                          load.
     */
    @Generated
    @Selector("newTexturesWithNames:scaleFactor:bundle:options:completionHandler:")
    public native void newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler(NSArray<String> names,
            @NFloat double scaleFactor, NSBundle bundle, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler") Block_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithCGImageOptionsCompletionHandler {
        @Generated
        void call_newTextureWithCGImageOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object texture,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithContentsOfURLOptionsCompletionHandler {
        @Generated
        void call_newTextureWithContentsOfURLOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object texture,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithDataOptionsCompletionHandler {
        @Generated
        void call_newTextureWithDataOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object texture,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithMDLTextureOptionsCompletionHandler {
        @Generated
        void call_newTextureWithMDLTextureOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object texture,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTextureWithNameScaleFactorBundleOptionsCompletionHandler {
        @Generated
        void call_newTextureWithNameScaleFactorBundleOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object texture, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTexturesWithContentsOfURLsOptionsCompletionHandler {
        @Generated
        void call_newTexturesWithContentsOfURLsOptionsCompletionHandler(NSArray<?> textures, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler {
        @Generated
        void call_newTexturesWithNamesScaleFactorBundleOptionsCompletionHandler(NSArray<?> textures, NSError error);
    }
}
