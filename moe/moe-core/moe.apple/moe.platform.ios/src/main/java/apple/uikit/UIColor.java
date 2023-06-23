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
import apple.coregraphics.opaque.CGColorRef;
import apple.coreimage.CIColor;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.NFloatPtr;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIColor extends NSObject implements NSSecureCoding, NSCopying, NSItemProviderReading,
        NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected UIColor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIColor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIColor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * 0.0 white
     */
    @NotNull
    @Generated
    @Selector("blackColor")
    public static native UIColor blackColor();

    /**
     * 0.0, 0.0, 1.0 RGB
     */
    @NotNull
    @Generated
    @Selector("blueColor")
    public static native UIColor blueColor();

    /**
     * 0.6, 0.4, 0.2 RGB
     */
    @NotNull
    @Generated
    @Selector("brownColor")
    public static native UIColor brownColor();

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
     * 0.0 white, 0.0 alpha
     */
    @NotNull
    @Generated
    @Selector("clearColor")
    public static native UIColor clearColor();

    @NotNull
    @Generated
    @Selector("colorWithCGColor:")
    public static native UIColor colorWithCGColor(@NotNull CGColorRef cgColor);

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("colorWithCIColor:")
    public static native UIColor colorWithCIColor(@NotNull CIColor ciColor);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("colorWithDisplayP3Red:green:blue:alpha:")
    public static native UIColor colorWithDisplayP3RedGreenBlueAlpha(@NFloat double displayP3Red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @NotNull
    @Generated
    @Selector("colorWithHue:saturation:brightness:alpha:")
    public static native UIColor colorWithHueSaturationBrightnessAlpha(@NFloat double hue, @NFloat double saturation,
            @NFloat double brightness, @NFloat double alpha);

    @NotNull
    @Generated
    @Selector("colorWithPatternImage:")
    public static native UIColor colorWithPatternImage(@NotNull UIImage image);

    @NotNull
    @Generated
    @Selector("colorWithRed:green:blue:alpha:")
    public static native UIColor colorWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * Convenience methods for creating colors
     */
    @NotNull
    @Generated
    @Selector("colorWithWhite:alpha:")
    public static native UIColor colorWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    /**
     * 0.0, 1.0, 1.0 RGB
     */
    @NotNull
    @Generated
    @Selector("cyanColor")
    public static native UIColor cyanColor();

    /**
     * 0.333 white
     */
    @NotNull
    @Generated
    @Selector("darkGrayColor")
    public static native UIColor darkGrayColor();

    /**
     * for a light background
     */
    @NotNull
    @Generated
    @Selector("darkTextColor")
    public static native UIColor darkTextColor();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * 0.5 white
     */
    @NotNull
    @Generated
    @Selector("grayColor")
    public static native UIColor grayColor();

    /**
     * 0.0, 1.0, 0.0 RGB
     */
    @NotNull
    @Generated
    @Selector("greenColor")
    public static native UIColor greenColor();

    /**
     * groupTableViewBackgroundColor is now the same as systemGroupedBackgroundColor.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("groupTableViewBackgroundColor")
    public static native UIColor groupTableViewBackgroundColor();

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

    /**
     * 0.667 white
     */
    @NotNull
    @Generated
    @Selector("lightGrayColor")
    public static native UIColor lightGrayColor();

    /**
     * for a dark background
     */
    @NotNull
    @Generated
    @Selector("lightTextColor")
    public static native UIColor lightTextColor();

    /**
     * 1.0, 0.0, 1.0 RGB
     */
    @NotNull
    @Generated
    @Selector("magentaColor")
    public static native UIColor magentaColor();

    @Generated
    @Owned
    @Selector("new")
    public static native UIColor new_objc();

    /**
     * 1.0, 0.5, 0.0 RGB
     */
    @NotNull
    @Generated
    @Selector("orangeColor")
    public static native UIColor orangeColor();

    /**
     * 0.5, 0.0, 0.5 RGB
     */
    @NotNull
    @Generated
    @Selector("purpleColor")
    public static native UIColor purpleColor();

    /**
     * 1.0, 0.0, 0.0 RGB
     */
    @NotNull
    @Generated
    @Selector("redColor")
    public static native UIColor redColor();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 3.2
     * Deprecated-Since: 7.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("scrollViewTexturedBackgroundColor")
    public static native UIColor scrollViewTexturedBackgroundColor();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("underPageBackgroundColor")
    public static native UIColor underPageBackgroundColor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackgroundColor();

    /**
     * 1.0 white
     */
    @NotNull
    @Generated
    @Selector("whiteColor")
    public static native UIColor whiteColor();

    /**
     * 1.0, 1.0, 0.0 RGB
     */
    @NotNull
    @Generated
    @Selector("yellowColor")
    public static native UIColor yellowColor();

    @NotNull
    @Generated
    @Selector("CGColor")
    public native CGColorRef CGColor();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("CIColor")
    public native CIColor CIColor();

    /**
     * Returns a color in the same color space as the receiver with the specified alpha component.
     */
    @NotNull
    @Generated
    @Selector("colorWithAlphaComponent:")
    public native UIColor colorWithAlphaComponent(@NFloat double alpha);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("getHue:saturation:brightness:alpha:")
    public native boolean getHueSaturationBrightnessAlpha(@Nullable NFloatPtr hue, @Nullable NFloatPtr saturation,
            @Nullable NFloatPtr brightness, @Nullable NFloatPtr alpha);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("getRed:green:blue:alpha:")
    public native boolean getRedGreenBlueAlpha(@Nullable NFloatPtr red, @Nullable NFloatPtr green,
            @Nullable NFloatPtr blue, @Nullable NFloatPtr alpha);

    /**
     * Convenience methods for getting components.
     * If the receiver is of a compatible color space, any non-NULL parameters are populated and 'YES' is returned.
     * Otherwise, the parameters are left unchanged and 'NO' is returned.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("getWhite:alpha:")
    public native boolean getWhiteAlpha(@Nullable NFloatPtr white, @Nullable NFloatPtr alpha);

    @Generated
    @Selector("init")
    public native UIColor init();

    @NotNull
    @Generated
    @Selector("initWithCGColor:")
    public native UIColor initWithCGColor(@NotNull CGColorRef cgColor);

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("initWithCIColor:")
    public native UIColor initWithCIColor(@NotNull CIColor ciColor);

    @Generated
    @Selector("initWithCoder:")
    public native UIColor initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("initWithDisplayP3Red:green:blue:alpha:")
    public native UIColor initWithDisplayP3RedGreenBlueAlpha(@NFloat double displayP3Red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @NotNull
    @Generated
    @Selector("initWithHue:saturation:brightness:alpha:")
    public native UIColor initWithHueSaturationBrightnessAlpha(@NFloat double hue, @NFloat double saturation,
            @NFloat double brightness, @NFloat double alpha);

    @NotNull
    @Generated
    @Selector("initWithPatternImage:")
    public native UIColor initWithPatternImage(@NotNull UIImage image);

    @NotNull
    @Generated
    @Selector("initWithRed:green:blue:alpha:")
    public native UIColor initWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NFloat double alpha);

    /**
     * Initializers for creating colors
     */
    @NotNull
    @Generated
    @Selector("initWithWhite:alpha:")
    public native UIColor initWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    /**
     * Set the color: Sets the fill and stroke colors in the current drawing context. Should be implemented by
     * subclassers.
     */
    @Generated
    @Selector("set")
    public native void set();

    /**
     * Set the fill or stroke colors individually. These should be implemented by subclassers.
     */
    @Generated
    @Selector("setFill")
    public native void setFill();

    @Generated
    @Selector("setStroke")
    public native void setStroke();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * load from main bundle
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("colorNamed:")
    public static native UIColor colorNamed(@NotNull String name);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("colorNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIColor colorNamedInBundleCompatibleWithTraitCollection(@NotNull String name,
            @Nullable NSBundle bundle, @Nullable UITraitCollection traitCollection);

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
    public static native UIColor objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public UIColor _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data, @NotNull String typeIdentifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

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
     * Create a dynamic color with a provider.
     * When methods are called on this color that need color component values,
     * the provider is called with UITraitCollection.currentTraitCollection.
     * The provider should use that trait collection to decide a more fundamental UIColor to return.
     * As much as possible, use the given trait collection to make that decision, not other state.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("colorWithDynamicProvider:")
    public static native UIColor colorWithDynamicProvider(
            @NotNull @ObjCBlock(name = "call_colorWithDynamicProvider") Block_colorWithDynamicProvider dynamicProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorWithDynamicProvider {
        @NotNull
        @Generated
        UIColor call_colorWithDynamicProvider(@NotNull UITraitCollection traitCollection);
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("initWithDynamicProvider:")
    public native UIColor initWithDynamicProvider(
            @NotNull @ObjCBlock(name = "call_initWithDynamicProvider") Block_initWithDynamicProvider dynamicProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDynamicProvider {
        @NotNull
        @Generated
        UIColor call_initWithDynamicProvider(@NotNull UITraitCollection traitCollection);
    }

    /**
     * Foreground colors for static text and related elements.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("labelColor")
    public static native UIColor labelColor();

    /**
     * Foreground color for standard system links.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("linkColor")
    public static native UIColor linkColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("opaqueSeparatorColor")
    public static native UIColor opaqueSeparatorColor();

    /**
     * Foreground color for placeholder text in controls or text fields or text views.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("placeholderTextColor")
    public static native UIColor placeholderTextColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("quaternaryLabelColor")
    public static native UIColor quaternaryLabelColor();

    /**
     * quaternarySystemFillColor is appropriate for filling large areas containing complex content.
     * Example: Expanded table cells.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("quaternarySystemFillColor")
    public static native UIColor quaternarySystemFillColor();

    /**
     * Resolve any color to its most fundamental form (a non-dynamic color) for a specific trait collection.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("resolvedColorWithTraitCollection:")
    public native UIColor resolvedColorWithTraitCollection(@NotNull UITraitCollection traitCollection);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("secondaryLabelColor")
    public static native UIColor secondaryLabelColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("secondarySystemBackgroundColor")
    public static native UIColor secondarySystemBackgroundColor();

    /**
     * secondarySystemFillColor is appropriate for filling medium-size shapes.
     * Example: The background of a switch.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("secondarySystemFillColor")
    public static native UIColor secondarySystemFillColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("secondarySystemGroupedBackgroundColor")
    public static native UIColor secondarySystemGroupedBackgroundColor();

    /**
     * Foreground colors for separators (thin border or divider lines).
     * `separatorColor` may be partially transparent, so it can go on top of any content.
     * `opaqueSeparatorColor` is intended to look similar, but is guaranteed to be opaque, so it will
     * completely cover anything behind it. Depending on the situation, you may need one or the other.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("separatorColor")
    public static native UIColor separatorColor();

    /**
     * We provide two design systems (also known as "stacks") for structuring an iOS app's backgrounds.
     * 
     * Each stack has three "levels" of background colors. The first color is intended to be the
     * main background, farthest back. Secondary and tertiary colors are layered on top
     * of the main background, when appropriate.
     * 
     * Inside of a discrete piece of UI, choose a stack, then use colors from that stack.
     * We do not recommend mixing and matching background colors between stacks.
     * The foreground colors above are designed to work in both stacks.
     * 
     * 1. systemBackground
     * Use this stack for views with standard table views, and designs which have a white
     * primary background in light mode.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemBackgroundColor")
    public static native UIColor systemBackgroundColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemBlueColor")
    public static native UIColor systemBlueColor();

    /**
     * Fill colors for UI elements.
     * These are meant to be used over the background colors, since their alpha component is less than 1.
     * 
     * systemFillColor is appropriate for filling thin and small shapes.
     * Example: The track of a slider.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemFillColor")
    public static native UIColor systemFillColor();

    /**
     * The numbered variations, systemGray2 through systemGray6, are grays which increasingly
     * trend away from systemGray and in the direction of systemBackgroundColor.
     * 
     * In UIUserInterfaceStyleLight: systemGray2 is slightly lighter than systemGray.
     * systemGray3 is lighter than that, and so on.
     * In UIUserInterfaceStyleDark: systemGray2 is slightly darker than systemGray.
     * systemGray3 is darker than that, and so on.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGray2Color")
    public static native UIColor systemGray2Color();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGray3Color")
    public static native UIColor systemGray3Color();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGray4Color")
    public static native UIColor systemGray4Color();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGray5Color")
    public static native UIColor systemGray5Color();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGray6Color")
    public static native UIColor systemGray6Color();

    /**
     * Shades of gray. systemGray is the base gray color.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemGrayColor")
    public static native UIColor systemGrayColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemGreenColor")
    public static native UIColor systemGreenColor();

    /**
     * 2. systemGroupedBackground
     * Use this stack for views with grouped content, such as grouped tables and
     * platter-based designs. These are like grouped table views, but you may use these
     * colors in places where a table view wouldn't make sense.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemGroupedBackgroundColor")
    public static native UIColor systemGroupedBackgroundColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemIndigoColor")
    public static native UIColor systemIndigoColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemOrangeColor")
    public static native UIColor systemOrangeColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemPinkColor")
    public static native UIColor systemPinkColor();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("systemPurpleColor")
    public static native UIColor systemPurpleColor();

    /**
     * Some colors that are used by system elements and applications.
     * These return named colors whose values may vary between different contexts and releases.
     * Do not make assumptions about the color spaces or actual colors used.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemRedColor")
    public static native UIColor systemRedColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemTealColor")
    public static native UIColor systemTealColor();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("systemYellowColor")
    public static native UIColor systemYellowColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("tertiaryLabelColor")
    public static native UIColor tertiaryLabelColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("tertiarySystemBackgroundColor")
    public static native UIColor tertiarySystemBackgroundColor();

    /**
     * tertiarySystemFillColor is appropriate for filling large shapes.
     * Examples: Input fields, search bars, buttons.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("tertiarySystemFillColor")
    public static native UIColor tertiarySystemFillColor();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("tertiarySystemGroupedBackgroundColor")
    public static native UIColor tertiarySystemGroupedBackgroundColor();

    /**
     * Provides an accessible name for the UIColor for use in accessibility attribute APIs, such as when using
     * accessibilityLabel.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("accessibilityName")
    public native String accessibilityName();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemBrownColor")
    public static native UIColor systemBrownColor();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("systemCyanColor")
    public static native UIColor systemCyanColor();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("systemMintColor")
    public static native UIColor systemMintColor();

    /**
     * This color represents the tint color of a view.
     * 
     * Like other dynamic colors, UIColor.tintColor relies on UITraitCollection.currentTraitCollection
     * being set to a view's trait collection when it is used, so that it can resolve to that view's
     * tint color. If you use UIColor.tintColor outside a view's context, and do not resolve it
     * manually with a view's trait collection, it will return the system default tint color.
     * 
     * Setting UIColor.tintColor directly to a view's tintColor property behaves the same as setting nil.
     * However, you cannot set a custom dynamic color (e.g. using +[UIColor colorWithDynamicProvider:])
     * that can resolve to UIColor.tintColor to a view's tintColor property.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("tintColor")
    public static native UIColor tintColor();
}
