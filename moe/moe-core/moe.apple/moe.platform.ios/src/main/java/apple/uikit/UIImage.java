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

    @Generated
    @Selector("animatedImageNamed:duration:")
    public static native UIImage animatedImageNamedDuration(String name, double duration);

    @Generated
    @Selector("animatedImageWithImages:duration:")
    public static native UIImage animatedImageWithImagesDuration(NSArray<? extends UIImage> images, double duration);

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

    @Generated
    @Selector("capInsets")
    @ByValue
    public native UIEdgeInsets capInsets();

    @Generated
    @Selector("drawAsPatternInRect:")
    public native void drawAsPatternInRect(@ByValue CGRect rect);

    @Generated
    @Selector("drawAtPoint:")
    public native void drawAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("drawAtPoint:blendMode:alpha:")
    public native void drawAtPointBlendModeAlpha(@ByValue CGPoint point, int blendMode, @NFloat double alpha);

    @Generated
    @Selector("drawInRect:")
    public native void drawInRect(@ByValue CGRect rect);

    @Generated
    @Selector("drawInRect:blendMode:alpha:")
    public native void drawInRectBlendModeAlpha(@ByValue CGRect rect, int blendMode, @NFloat double alpha);

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("flipsForRightToLeftLayoutDirection")
    public native boolean flipsForRightToLeftLayoutDirection();

    @Generated
    @Selector("imageAsset")
    public native UIImageAsset imageAsset();

    @Generated
    @Selector("imageFlippedForRightToLeftLayoutDirection")
    public native UIImage imageFlippedForRightToLeftLayoutDirection();

    @Generated
    @Selector("imageOrientation")
    @NInt
    public native long imageOrientation();

    @Generated
    @Selector("imageRendererFormat")
    public native UIGraphicsImageRendererFormat imageRendererFormat();

    @Generated
    @Selector("imageWithAlignmentRectInsets:")
    public native UIImage imageWithAlignmentRectInsets(@ByValue UIEdgeInsets alignmentInsets);

    @Generated
    @Selector("imageWithHorizontallyFlippedOrientation")
    public native UIImage imageWithHorizontallyFlippedOrientation();

    @Generated
    @Selector("imageWithRenderingMode:")
    public native UIImage imageWithRenderingMode(@NInt long renderingMode);

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

    @Generated
    @Selector("leftCapWidth")
    @NInt
    public native long leftCapWidth();

    @Generated
    @Selector("renderingMode")
    @NInt
    public native long renderingMode();

    @Generated
    @Selector("resizableImageWithCapInsets:")
    public native UIImage resizableImageWithCapInsets(@ByValue UIEdgeInsets capInsets);

    @Generated
    @Selector("resizableImageWithCapInsets:resizingMode:")
    public native UIImage resizableImageWithCapInsetsResizingMode(@ByValue UIEdgeInsets capInsets,
            @NInt long resizingMode);

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

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("stretchableImageWithLeftCapWidth:topCapHeight:")
    public native UIImage stretchableImageWithLeftCapWidthTopCapHeight(@NInt long leftCapWidth,
            @NInt long topCapHeight);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("topCapHeight")
    @NInt
    public native long topCapHeight();

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

    @Generated
    @Selector("actionsImage")
    public static native UIImage actionsImage();

    @Generated
    @Selector("addImage")
    public static native UIImage addImage();

    @Generated
    @Selector("baselineOffsetFromBottom")
    @NFloat
    public native double baselineOffsetFromBottom();

    @Generated
    @Selector("checkmarkImage")
    public static native UIImage checkmarkImage();

    @Generated
    @Selector("configuration")
    public native UIImageConfiguration configuration();

    @Generated
    @Selector("hasBaseline")
    public native boolean hasBaseline();

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

    @Generated
    @Selector("removeImage")
    public static native UIImage removeImage();

    @Generated
    @Selector("strokedCheckmarkImage")
    public static native UIImage strokedCheckmarkImage();

    @Generated
    @Selector("symbolConfiguration")
    public native UIImageSymbolConfiguration symbolConfiguration();

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
