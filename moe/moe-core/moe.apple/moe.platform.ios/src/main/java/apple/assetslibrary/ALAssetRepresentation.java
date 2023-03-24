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

package apple.assetslibrary;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
 */
@Deprecated
@Generated
@Library("AssetsLibrary")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALAssetRepresentation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ALAssetRepresentation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAssetRepresentation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ALAssetRepresentation allocWithZone(VoidPtr zone);

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
    public static native ALAssetRepresentation new_objc();

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
     * This is a convenience method that returns a full resolution CGImage of the representation. It takes a dictionary
     * of options as described for CGImageSourceCreateWithData() or CGImageSourceCreateWithURL()
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a targetSize of image for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("CGImageWithOptions:")
    public native CGImageRef CGImageWithOptions(NSDictionary<?, ?> options);

    /**
     * Returns the representation's UTI.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageDataForAsset:options:resultHandler: on PHImageManager for a PHAsset to
     * request image data from the Photos framework and check the dataUTI passed to your result handler instead
     */
    @Generated
    @Deprecated
    @Selector("UTI")
    public native String UTI();

    /**
     * Returns the dimensions of this representation. If the representation does not have valid dimensions, this method
     * will return CGSizeZero.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a targetSize of image for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("dimensions")
    @ByValue
    public native CGSize dimensions();

    /**
     * Returns a string representing the filename of the representation on disk.
     * For representations synced from iTunes, this will be the filename of the representation on the host.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("filename")
    public native String filename();

    /**
     * This is a convenience method for -[ALAssetRepresentation CGImageWithOptions:] where options is nil.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a targetSize PHImageManagerMaximumSize for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("fullResolutionImage")
    public native CGImageRef fullResolutionImage();

    /**
     * Returns a CGImage of the representation that is appropriate for displaying full screen.
     * The dimensions of this image will be dependent on the hardware that the application is running on and does not
     * mean it will match the dimensions of the screen.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a targetSize of image for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("fullScreenImage")
    public native CGImageRef fullScreenImage();

    /**
     * Copies the specified range of bytes into the buffer given by the caller.
     * The method returns the number of bytes actually written to the buffer. The number of bytes read will be
     * less than the requested range if the range exceeds the file's size.
     * If an error occurs, the method returns 0 and upon return contains an NSError object that describes the problem.
     * Pass NULL if you do not want error information.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageDataForAsset:options:resultHandler: on PHImageManager to request image data
     * for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("getBytes:fromOffset:length:error:")
    @NUInt
    public native long getBytesFromOffsetLengthError(BytePtr buffer, long offset, @NUInt long length,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native ALAssetRepresentation init();

    /**
     * Returns a dictionary of dictionaries of metadata for the representation.
     * If the representation is one that the system cannot interpret, nil is returned.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use CGImageSourceCopyPropertiesAtIndex() to retrieve metadata from an image returned by the
     * PHImageManager from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    /**
     * Returns the representation's orientation as defined in ALAssetOrientation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the orientation of the UIImage returned for a PHAsset from the PHImageManager from the
     * Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("orientation")
    @NInt
    public native long orientation();

    /**
     * Returns the representation's scale.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a targetSize of image for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("scale")
    public native float scale();

    /**
     * Returns the size of the file for this representation. Callers can use this to allocate buffers of the right size
     * for -getBytes:fromOffset:length:error:
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageDataForAsset:options:resultHandler: on PHImageManager to request image data
     * for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("size")
    public native long size();

    /**
     * Returns a persistent URL uniquely identifying the representation
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager instead
     */
    @Generated
    @Deprecated
    @Selector("url")
    public native NSURL url();
}
