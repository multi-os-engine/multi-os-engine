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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.coreimage.CIImage;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.UIAccessibilityIdentification;
import apple.uikit.protocol.UIItemProviderPresentationSizeProviding;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImage extends NSObject implements NSSecureCoding, NSItemProviderReading, NSItemProviderWriting,
        UIItemProviderPresentationSizeProviding, UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UIImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIImage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIImage allocWithZone(VoidPtr zone);

    /**
     * read sequence of files with suffix starting at 0 or 1
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("animatedImageNamed:duration:")
    public static native UIImage animatedImageNamedDuration(@NotNull String name, double duration);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("animatedImageWithImages:duration:")
    public static native UIImage animatedImageWithImagesDuration(@NotNull NSArray<? extends UIImage> images,
            double duration);

    /**
     * sequence of files
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("animatedResizableImageNamed:capInsets:duration:")
    public static native UIImage animatedResizableImageNamedCapInsetsDuration(@NotNull String name,
            @ByValue UIEdgeInsets capInsets, double duration);

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("animatedResizableImageNamed:capInsets:resizingMode:duration:")
    public static native UIImage animatedResizableImageNamedCapInsetsResizingModeDuration(@NotNull String name,
            @ByValue UIEdgeInsets capInsets, @NInt long resizingMode, double duration);

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

    /**
     * load from main bundle
     */
    @Nullable
    @Generated
    @Selector("imageNamed:")
    public static native UIImage imageNamed(@NotNull String name);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("imageNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIImage imageNamedInBundleCompatibleWithTraitCollection(@NotNull String name,
            @Nullable NSBundle bundle, @Nullable UITraitCollection traitCollection);

    @NotNull
    @Generated
    @Selector("imageWithCGImage:")
    public static native UIImage imageWithCGImage(@NotNull CGImageRef cgImage);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("imageWithCGImage:scale:orientation:")
    public static native UIImage imageWithCGImageScaleOrientation(@NotNull CGImageRef cgImage, @NFloat double scale,
            @NInt long orientation);

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("imageWithCIImage:")
    public static native UIImage imageWithCIImage(@NotNull CIImage ciImage);

    /**
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("imageWithCIImage:scale:orientation:")
    public static native UIImage imageWithCIImageScaleOrientation(@NotNull CIImage ciImage, @NFloat double scale,
            @NInt long orientation);

    @Nullable
    @Generated
    @Selector("imageWithContentsOfFile:")
    public static native UIImage imageWithContentsOfFile(@NotNull String path);

    @Nullable
    @Generated
    @Selector("imageWithData:")
    public static native UIImage imageWithData(@NotNull NSData data);

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("imageWithData:scale:")
    public static native UIImage imageWithDataScale(@NotNull NSData data, @NFloat double scale);

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
    public static native UIImage new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    /**
     * returns underlying CIImage or nil if CGImageRef based
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("CIImage")
    public native CIImage CIImage();

    @Nullable
    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("alignmentRectInsets")
    @ByValue
    public native UIEdgeInsets alignmentRectInsets();

    /**
     * default is UIEdgeInsetsZero for non resizable images
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("capInsets")
    @ByValue
    public native UIEdgeInsets capInsets();

    /**
     * draws the image as a CGPattern
     */
    @Generated
    @Selector("drawAsPatternInRect:")
    public native void drawAsPatternInRect(@ByValue CGRect rect);

    /**
     * mode = kCGBlendModeNormal, alpha = 1.0
     */
    @Generated
    @Selector("drawAtPoint:")
    public native void drawAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("drawAtPoint:blendMode:alpha:")
    public native void drawAtPointBlendModeAlpha(@ByValue CGPoint point, int blendMode, @NFloat double alpha);

    /**
     * mode = kCGBlendModeNormal, alpha = 1.0
     */
    @Generated
    @Selector("drawInRect:")
    public native void drawInRect(@ByValue CGRect rect);

    @Generated
    @Selector("drawInRect:blendMode:alpha:")
    public native void drawInRectBlendModeAlpha(@ByValue CGRect rect, int blendMode, @NFloat double alpha);

    /**
     * total duration for all frames. default is 0 for non-animated images
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("flipsForRightToLeftLayoutDirection")
    public native boolean flipsForRightToLeftLayoutDirection();

    /**
     * The asset is not encoded along with the image. Returns nil if the image is not CGImage based.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("imageAsset")
    public native UIImageAsset imageAsset();

    /**
     * Creates a version of this image that, when assigned to a UIImageView’s image property, draws its underlying image
     * contents horizontally mirrored when running under a right-to-left language. Affects the
     * flipsForRightToLeftLayoutDirection property; does not affect the imageOrientation property.
     * This method cannot be used to create a left-to-right version of a right-to-left source image, and will be
     * deprecated in a future release. New code should instead use -imageWithHorizontallyFlippedOrientation to construct
     * a UIImageAsset.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("imageFlippedForRightToLeftLayoutDirection")
    public native UIImage imageFlippedForRightToLeftLayoutDirection();

    /**
     * this will affect how the image is composited
     */
    @Generated
    @Selector("imageOrientation")
    @NInt
    public native long imageOrientation();

    /**
     * Returns an optimal UIGraphicsImageRendererFormat instance for this image, maintaining pixel format and color
     * space.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("imageRendererFormat")
    public native UIGraphicsImageRendererFormat imageRendererFormat();

    /**
     * Support for constraint-based layout (auto layout)
     * The alignmentRectInsets of a UIImage are used by UIImageView and other UIView and UIControl
     * subclasses that take custom images to determine the view's alignment rect insets for
     * constraint-based layout.
     * The default alignmentRectInsets are UIEdgeInsetsZero.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("imageWithAlignmentRectInsets:")
    public native UIImage imageWithAlignmentRectInsets(@ByValue UIEdgeInsets alignmentInsets);

    /**
     * Creates a version of this image with an imageOrientation property that is horizontally mirrored from this
     * image’s. Does not affect the flipsForRightToLeftLayoutDirection property.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("imageWithHorizontallyFlippedOrientation")
    public native UIImage imageWithHorizontallyFlippedOrientation();

    /**
     * Create a version of this image with the specified rendering mode. By default, images have a rendering mode of
     * UIImageRenderingModeAutomatic.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("imageWithRenderingMode:")
    public native UIImage imageWithRenderingMode(@NInt long renderingMode);

    /**
     * default is nil for non-animated images
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("images")
    public native NSArray<? extends UIImage> images();

    @Generated
    @Selector("init")
    public native UIImage init();

    @Generated
    @Selector("initWithCGImage:")
    public native UIImage initWithCGImage(@NotNull CGImageRef cgImage);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("initWithCGImage:scale:orientation:")
    public native UIImage initWithCGImageScaleOrientation(@NotNull CGImageRef cgImage, @NFloat double scale,
            @NInt long orientation);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithCIImage:")
    public native UIImage initWithCIImage(@NotNull CIImage ciImage);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("initWithCIImage:scale:orientation:")
    public native UIImage initWithCIImageScaleOrientation(@NotNull CIImage ciImage, @NFloat double scale,
            @NInt long orientation);

    @Generated
    @Selector("initWithCoder:")
    public native UIImage initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native UIImage initWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("initWithData:")
    public native UIImage initWithData(@NotNull NSData data);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("initWithData:scale:")
    public native UIImage initWithDataScale(@NotNull NSData data, @NFloat double scale);

    /**
     * default is 0. if non-zero, horiz. stretchable. right cap is calculated as width - leftCapWidth - 1
     */
    @Generated
    @Selector("leftCapWidth")
    @NInt
    public native long leftCapWidth();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("renderingMode")
    @NInt
    public native long renderingMode();

    /**
     * create a resizable version of this image. the interior is tiled when drawn.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("resizableImageWithCapInsets:")
    public native UIImage resizableImageWithCapInsets(@ByValue UIEdgeInsets capInsets);

    /**
     * the interior is resized according to the resizingMode
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("resizableImageWithCapInsets:resizingMode:")
    public native UIImage resizableImageWithCapInsetsResizingMode(@ByValue UIEdgeInsets capInsets,
            @NInt long resizingMode);

    /**
     * default is UIImageResizingModeTile
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("resizingMode")
    @NInt
    public native long resizingMode();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(@Nullable String value);

    /**
     * reflects orientation setting. In iOS 4.0 and later, this is measured in points. In 3.x and earlier, measured in
     * pixels
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * use resizableImageWithCapInsets: and capInsets.
     */
    @NotNull
    @Generated
    @Selector("stretchableImageWithLeftCapWidth:topCapHeight:")
    public native UIImage stretchableImageWithLeftCapWidthTopCapHeight(@NInt long leftCapWidth,
            @NInt long topCapHeight);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * default is 0. if non-zero, vert. stretchable. bottom cap is calculated as height - topCapWidth - 1
     */
    @Generated
    @Selector("topCapHeight")
    @NInt
    public native long topCapHeight();

    /**
     * describes the image in terms of its traits
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(
            @NotNull String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(@NotNull String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(@NotNull String typeIdentifier);

    @Nullable
    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(@NotNull String typeIdentifier,
            @NotNull @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native UIImage objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public UIImage _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data, @NotNull String typeIdentifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("preferredPresentationSizeForItemProvider")
    @ByValue
    public native CGSize preferredPresentationSizeForItemProvider();

    @NotNull
    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @NotNull
    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @NotNull
    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @NotNull
    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * currently: white ellipsis on tinted filled circle
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("actionsImage")
    public static native UIImage actionsImage();

    /**
     * currently: white + on green filled circle
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("addImage")
    public static native UIImage addImage();

    /**
     * The baseline offset is expressed in points from the bottom of the image (positive = up, negative = down).
     * If the image doesn't have a defined baseline, this value will be 0, but you can
     * use -hasBaseline to see if it actually has one defined (because it is perfectly possible to have
     * a baseline with the value of 0).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("baselineOffsetFromBottom")
    @NFloat
    public native double baselineOffsetFromBottom();

    /**
     * currently: white ✓ on tinted filled circle
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("checkmarkImage")
    public static native UIImage checkmarkImage();

    /**
     * Configuration support
     * ---------------------
     * This describes the configuration of the image.
     * Depending on which type of image, the configuration might be different.
     * Symbol images will always have a UIImageSymbolConfiguration, even if you give it another
     * type of configuration (it will merge the trait info from the other configuration into
     * its current configuration).
     * Images start off with an unspecified configuration but can be modified by the methods below.
     * The preferred ways of adding configurations for displaying images is to specify them on
     * the image view, but it is possible to modify images with a more specific configuration.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("configuration")
    public native UIImageConfiguration configuration();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("hasBaseline")
    public native boolean hasBaseline();

    /**
     * This is a convenience method to apply another symbol configuration over an existing one.
     * If the image doesn't have a symbol configuration, it will just merge the traits of the existing
     * with the new one (where the new traits override the old traits).
     * 
     * Create a new image by applying the specified configuration over the existing one.
     * This only works if the configuration already has a configuration (i.e. is a symbol image).
     * The image will be configured with a combination of both configurations.
     * 
     * If you use this on a symbol image with other layout modifications done (e.g. changed baseline),
     * those changes will be lost and overwritten with the new configuration's layout properties.
     * This applies to size, contentInsets and baseline.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("imageByApplyingSymbolConfiguration:")
    public native UIImage imageByApplyingSymbolConfiguration(@NotNull UIImageSymbolConfiguration configuration);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("imageNamed:inBundle:withConfiguration:")
    public static native UIImage imageNamedInBundleWithConfiguration(@NotNull String name, @Nullable NSBundle bundle,
            @Nullable UIImageConfiguration configuration);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageWithBaselineOffsetFromBottom:")
    public native UIImage imageWithBaselineOffsetFromBottom(@NFloat double baselineOffset);

    /**
     * * Create a new image by replacing the existing configuration with a new one.
     * * For symbol images this will always result in an image with a UIImageSymbolConfiguration,
     * * even if you give it another type of configuration (the trait info from the new configuration
     * * will be merged into the current symbol configuration resulting in anew symbol configuration).
     * * For non-symbol images, this will replace the configuration of the image with a new one.
     * *
     * * Important note! Given (for example):
     * *
     * * image = image(named:"the_image").withRenderingMode(.alwaysTemplate)
     * 
     * * the following two statements aren't exactly equivalent:
     * *
     * * a = image.imageAsset.withConfiguration(configuration)
     * * b = image.withConfiguration(configuration)
     * *
     * * The first one will resolve the image again from the asset catalog (if it is originating from one),
     * * resulting in a fresh image without any modifications. In other words, `a` won't have the
     * * rendering mode change set anymore, and it will be "reverted" to `.automatic`.
     * * The second one will resolve the image, but apply and changes that were made to the image.
     * * That means that `b` might be a different image, but it will still have the same rendering mode
     * * as `image`.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageWithConfiguration:")
    public native UIImage imageWithConfiguration(@NotNull UIImageConfiguration configuration);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageWithTintColor:")
    public native UIImage imageWithTintColor(@NotNull UIColor color);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageWithTintColor:renderingMode:")
    public native UIImage imageWithTintColorRenderingMode(@NotNull UIColor color, @NInt long renderingMode);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageWithoutBaseline")
    public native UIImage imageWithoutBaseline();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("isSymbolImage")
    public native boolean isSymbolImage();

    /**
     * currently: white - on red filled circle
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("removeImage")
    public static native UIImage removeImage();

    /**
     * currently: white ✓ on tinted filled and white stroked circle
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("strokedCheckmarkImage")
    public static native UIImage strokedCheckmarkImage();

    /**
     * Symbol configuration support
     * ----------------------------
     * This describes the symbol configuration of a symbol image.
     * Symbol images start off with an unspecified configuration but can be modified by using
     * `image.withConfiguration(:)`.
     * 
     * However... the preferred ways of adding configurations for displaying images is to specify
     * them on the image view using `preferredSymbolConfiguration`, but it is possible to modify
     * images with a more specific configuration. This include image related traits, for example
     * you can use this to fix a symbol image to a dynamic type style at a fixed preferred content size
     * category.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("symbolConfiguration")
    public native UIImageSymbolConfiguration symbolConfiguration();

    /**
     * Retrieve a system-provided image with the specified name.
     * This will only return system-provided images. If you want a custom
     * image as defined in your own catalogs, you should use +imageNamed:.
     * 
     * UIKit applications on macOS may pass NSImageName values (defined in
     * <AppKit/NSImage.h>) for the name to access macOS system images.
     * 
     * Returns nil if an image with specified name doesn't exist.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("systemImageNamed:")
    public static native UIImage systemImageNamed(@NotNull String name);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("systemImageNamed:compatibleWithTraitCollection:")
    public static native UIImage systemImageNamedCompatibleWithTraitCollection(@NotNull String name,
            @Nullable UITraitCollection traitCollection);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("systemImageNamed:withConfiguration:")
    public static native UIImage systemImageNamedWithConfiguration(@NotNull String name,
            @Nullable UIImageConfiguration configuration);

    /**
     * Synchronously prepares this image for displaying on the specified screen.
     * 
     * [@note] The prepared UIImage is not related to the original image. If the properties of the screen (such as its
     * resolution or color gamut) change, or if the image is displayed on a different screen that the one it was
     * prepared for, it may not render correctly.
     * 
     * API-Since: 15.0
     * 
     * @return A UIImage object that contains the prepared image.
     */
    @Nullable
    @Generated
    @Selector("imageByPreparingForDisplay")
    public native UIImage imageByPreparingForDisplay();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("imageByPreparingThumbnailOfSize:")
    public native UIImage imageByPreparingThumbnailOfSize(@ByValue CGSize size);

    /**
     * Asynchronously prepares this image for displaying on the specified screen.
     * 
     * The completion handler will be invoked on a private queue. Be sure to return to the main queue before assigning
     * the prepared image to an image view.
     * 
     * [@note] The prepared UIImage is not related to the original image. If the properties of the screen (such as its
     * resolution or color gamut) change, or if the image is displayed on a different screen that the one it was
     * prepared for, it may not render correctly.
     * 
     * API-Since: 15.0
     * 
     * @param completionHandler A block to invoke with the prepared image. If preparation failed (for example, beacuse
     *                          the image data is corrupt), @c image will be nil.
     */
    @Generated
    @Selector("prepareForDisplayWithCompletionHandler:")
    public native void prepareForDisplayWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_prepareForDisplayWithCompletionHandler") Block_prepareForDisplayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareForDisplayWithCompletionHandler {
        @Generated
        void call_prepareForDisplayWithCompletionHandler(@Nullable UIImage arg0);
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("prepareThumbnailOfSize:completionHandler:")
    public native void prepareThumbnailOfSizeCompletionHandler(@ByValue CGSize size,
            @NotNull @ObjCBlock(name = "call_prepareThumbnailOfSizeCompletionHandler") Block_prepareThumbnailOfSizeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareThumbnailOfSizeCompletionHandler {
        @Generated
        void call_prepareThumbnailOfSizeCompletionHandler(@Nullable UIImage arg0);
    }

    /**
     * Retrieve a image with the specified name and variable value (between 0 and 1).
     * 
     * This will only return custom images defined in your own catalogs. If you want a system-provided image,
     * you should use @c +systemImageNamed:variableValue:withConfiguration:.
     * 
     * Returns @c nil if an image with specified name doesn't exist.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("imageNamed:inBundle:variableValue:withConfiguration:")
    public static native UIImage imageNamedInBundleVariableValueWithConfiguration(@NotNull String name,
            @Nullable NSBundle bundle, double value, @Nullable UIImageConfiguration configuration);

    /**
     * Retrieve a system-provided image with the specified name and variable value (between 0 and 1).
     * 
     * This will only return system-provided images. If you want a custom image as defined in your own catalogs,
     * you should use @c +imageNamed:inBundle:variableValue:withConfiguration:.
     * 
     * Returns @c nil if an image with specified name doesn't exist.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("systemImageNamed:variableValue:withConfiguration:")
    public static native UIImage systemImageNamedVariableValueWithConfiguration(@NotNull String name, double value,
            @Nullable UIImageConfiguration configuration);
}
