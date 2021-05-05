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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * read sequence of files with suffix starting at 0 or 1
     */
    @Generated
    @Selector("animatedImageNamed:duration:")
    public static native UIImage animatedImageNamedDuration(String name, double duration);

    @Generated
    @Selector("animatedImageWithImages:duration:")
    public static native UIImage animatedImageWithImagesDuration(NSArray<? extends UIImage> images, double duration);

    /**
     * sequence of files
     */
    @Generated
    @Selector("animatedResizableImageNamed:capInsets:duration:")
    public static native UIImage animatedResizableImageNamedCapInsetsDuration(String name,
            @ByValue UIEdgeInsets capInsets, double duration);

    @Generated
    @Selector("animatedResizableImageNamed:capInsets:resizingMode:duration:")
    public static native UIImage animatedResizableImageNamedCapInsetsResizingModeDuration(String name,
            @ByValue UIEdgeInsets capInsets, @NInt long resizingMode, double duration);

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

    /**
     * load from main bundle
     */
    @Generated
    @Selector("imageNamed:")
    public static native UIImage imageNamed(String name);

    @Generated
    @Selector("imageNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIImage imageNamedInBundleCompatibleWithTraitCollection(String name, NSBundle bundle,
            UITraitCollection traitCollection);

    @Generated
    @Selector("imageWithCGImage:")
    public static native UIImage imageWithCGImage(CGImageRef cgImage);

    @Generated
    @Selector("imageWithCGImage:scale:orientation:")
    public static native UIImage imageWithCGImageScaleOrientation(CGImageRef cgImage, @NFloat double scale,
            @NInt long orientation);

    @Generated
    @Selector("imageWithCIImage:")
    public static native UIImage imageWithCIImage(CIImage ciImage);

    @Generated
    @Selector("imageWithCIImage:scale:orientation:")
    public static native UIImage imageWithCIImageScaleOrientation(CIImage ciImage, @NFloat double scale,
            @NInt long orientation);

    @Generated
    @Selector("imageWithContentsOfFile:")
    public static native UIImage imageWithContentsOfFile(String path);

    @Generated
    @Selector("imageWithData:")
    public static native UIImage imageWithData(NSData data);

    @Generated
    @Selector("imageWithData:scale:")
    public static native UIImage imageWithDataScale(NSData data, @NFloat double scale);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    /**
     * returns underlying CIImage or nil if CGImageRef based
     */
    @Generated
    @Selector("CIImage")
    public native CIImage CIImage();

    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    @Generated
    @Selector("alignmentRectInsets")
    @ByValue
    public native UIEdgeInsets alignmentRectInsets();

    /**
     * default is UIEdgeInsetsZero for non resizable images
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
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("flipsForRightToLeftLayoutDirection")
    public native boolean flipsForRightToLeftLayoutDirection();

    /**
     * The asset is not encoded along with the image. Returns nil if the image is not CGImage based.
     */
    @Generated
    @Selector("imageAsset")
    public native UIImageAsset imageAsset();

    /**
     * Creates a version of this image that, when assigned to a UIImageView’s image property, draws its underlying image contents horizontally mirrored when running under a right-to-left language. Affects the flipsForRightToLeftLayoutDirection property; does not affect the imageOrientation property.
     * This method cannot be used to create a left-to-right version of a right-to-left source image, and will be deprecated in a future release. New code should instead use -imageWithHorizontallyFlippedOrientation to construct a UIImageAsset.
     */
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
     * Returns an optimal UIGraphicsImageRendererFormat instance for this image, maintaining pixel format and color space.
     */
    @Generated
    @Selector("imageRendererFormat")
    public native UIGraphicsImageRendererFormat imageRendererFormat();

    /**
     * Support for constraint-based layout (auto layout)
     * The alignmentRectInsets of a UIImage are used by UIImageView and other UIView and UIControl
     *  subclasses that take custom images to determine the view's alignment rect insets for
     *  constraint-based layout.
     * The default alignmentRectInsets are UIEdgeInsetsZero.
     */
    @Generated
    @Selector("imageWithAlignmentRectInsets:")
    public native UIImage imageWithAlignmentRectInsets(@ByValue UIEdgeInsets alignmentInsets);

    /**
     * Creates a version of this image with an imageOrientation property that is horizontally mirrored from this image’s. Does not affect the flipsForRightToLeftLayoutDirection property.
     */
    @Generated
    @Selector("imageWithHorizontallyFlippedOrientation")
    public native UIImage imageWithHorizontallyFlippedOrientation();

    /**
     * Create a version of this image with the specified rendering mode. By default, images have a rendering mode of UIImageRenderingModeAutomatic.
     */
    @Generated
    @Selector("imageWithRenderingMode:")
    public native UIImage imageWithRenderingMode(@NInt long renderingMode);

    /**
     * default is nil for non-animated images
     */
    @Generated
    @Selector("images")
    public native NSArray<? extends UIImage> images();

    @Generated
    @Selector("init")
    public native UIImage init();

    @Generated
    @Selector("initWithCGImage:")
    public native UIImage initWithCGImage(CGImageRef cgImage);

    @Generated
    @Selector("initWithCGImage:scale:orientation:")
    public native UIImage initWithCGImageScaleOrientation(CGImageRef cgImage, @NFloat double scale,
            @NInt long orientation);

    @Generated
    @Selector("initWithCIImage:")
    public native UIImage initWithCIImage(CIImage ciImage);

    @Generated
    @Selector("initWithCIImage:scale:orientation:")
    public native UIImage initWithCIImageScaleOrientation(CIImage ciImage, @NFloat double scale,
            @NInt long orientation);

    @Generated
    @Selector("initWithCoder:")
    public native UIImage initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native UIImage initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithData:")
    public native UIImage initWithData(NSData data);

    @Generated
    @Selector("initWithData:scale:")
    public native UIImage initWithDataScale(NSData data, @NFloat double scale);

    /**
     * default is 0. if non-zero, horiz. stretchable. right cap is calculated as width - leftCapWidth - 1
     */
    @Generated
    @Selector("leftCapWidth")
    @NInt
    public native long leftCapWidth();

    @Generated
    @Selector("renderingMode")
    @NInt
    public native long renderingMode();

    /**
     * create a resizable version of this image. the interior is tiled when drawn.
     */
    @Generated
    @Selector("resizableImageWithCapInsets:")
    public native UIImage resizableImageWithCapInsets(@ByValue UIEdgeInsets capInsets);

    /**
     * the interior is resized according to the resizingMode
     */
    @Generated
    @Selector("resizableImageWithCapInsets:resizingMode:")
    public native UIImage resizableImageWithCapInsetsResizingMode(@ByValue UIEdgeInsets capInsets,
            @NInt long resizingMode);

    /**
     * default is UIImageResizingModeTile
     */
    @Generated
    @Selector("resizingMode")
    @NInt
    public native long resizingMode();

    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String value);

    /**
     * reflects orientation setting. In iOS 4.0 and later, this is measured in points. In 3.x and earlier, measured in pixels
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * use resizableImageWithCapInsets: and capInsets.
     */
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
     */
    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("preferredPresentationSizeForItemProvider")
    @ByValue
    public native CGSize preferredPresentationSizeForItemProvider();

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * currently: white ellipsis on tinted filled circle
     */
    @Generated
    @Selector("actionsImage")
    public static native UIImage actionsImage();

    /**
     * currently: white + on green filled cirlce
     */
    @Generated
    @Selector("addImage")
    public static native UIImage addImage();

    /**
     * The baseline offset is expressed in points from the bottom of the image (positive = up, negative = down).
     * If the image doesn't have a defined baseline, this value will be 0, but you can
     * use -hasBaseline to see if it actually has one defined (because it is perfectly possible to have
     * a baseline with the value of 0).
     */
    @Generated
    @Selector("baselineOffsetFromBottom")
    @NFloat
    public native double baselineOffsetFromBottom();

    /**
     * currently: white ✓ on tinted filled circle
     */
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
     */
    @Generated
    @Selector("configuration")
    public native UIImageConfiguration configuration();

    @Generated
    @Selector("hasBaseline")
    public native boolean hasBaseline();

    /**
     * This is a convience method to apply another symbol configuration over an existing one.
     * If the image doesn't have a symbolconfiguration, it will just merge the traits of the existing
     * with the new one (where the new traits override the old traits). The symbol in
     * 
     * Create a new image by applying the specified configuration over the existing  one.
     * This only works if the configuration already has a configuration (i.e. is a symbol image).
     * The image will be configured with a combination of both configurations.
     * 
     * If you use this on a symbol image with other layout modifications done (e.g. changed baseline),
     * those changes will be lost and overwritten with the new configuration's layout properties.
     * This applies to size, contentInsets and baseline.
     */
    @Generated
    @Selector("imageByApplyingSymbolConfiguration:")
    public native UIImage imageByApplyingSymbolConfiguration(UIImageSymbolConfiguration configuration);

    @Generated
    @Selector("imageNamed:inBundle:withConfiguration:")
    public static native UIImage imageNamedInBundleWithConfiguration(String name, NSBundle bundle,
            UIImageConfiguration configuration);

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
     * *    image = image(named:"the_image").withRenderingMode(.alwaysTemplate)
     * 
     * * the following two statements aren't exactly equivalent:
     * *
     * *    a = image.imageAsset.withConfiguration(configuration)
     * *    b = image.withConfiguration(configuration)
     * *
     * * The first one will resolve the image again from the asset catalog (if it is originating from one),
     * * resulting in a fresh image without any modifications. In other words, `a` won't have the
     * * rendering mode change set anymore, and it will be "reverted" to `.automatic`.
     * * The second one will resolve the image, but apply and changes that were made to the image.
     * * That means that `b` might be a different image, but it will still have the same rendering mode
     * * as `image`.
     */
    @Generated
    @Selector("imageWithConfiguration:")
    public native UIImage imageWithConfiguration(UIImageConfiguration configuration);

    @Generated
    @Selector("imageWithTintColor:")
    public native UIImage imageWithTintColor(UIColor color);

    @Generated
    @Selector("imageWithTintColor:renderingMode:")
    public native UIImage imageWithTintColorRenderingMode(UIColor color, @NInt long renderingMode);

    @Generated
    @Selector("imageWithoutBaseline")
    public native UIImage imageWithoutBaseline();

    @Generated
    @Selector("isSymbolImage")
    public native boolean isSymbolImage();

    /**
     * currently: white - on red filled circle
     */
    @Generated
    @Selector("removeImage")
    public static native UIImage removeImage();

    /**
     * currently: white ✓ on tinted filled and white stroked circle
     */
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
     */
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
     */
    @Generated
    @Selector("systemImageNamed:")
    public static native UIImage systemImageNamed(String name);

    @Generated
    @Selector("systemImageNamed:compatibleWithTraitCollection:")
    public static native UIImage systemImageNamedCompatibleWithTraitCollection(String name,
            UITraitCollection traitCollection);

    @Generated
    @Selector("systemImageNamed:withConfiguration:")
    public static native UIImage systemImageNamedWithConfiguration(String name, UIImageConfiguration configuration);
}
