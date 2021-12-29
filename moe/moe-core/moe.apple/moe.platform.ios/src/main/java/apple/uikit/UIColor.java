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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIColor extends NSObject
        implements NSSecureCoding, NSCopying, NSItemProviderReading, NSItemProviderWriting {
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * 0.0 white
     */
    @Generated
    @Selector("blackColor")
    public static native UIColor blackColor();

    /**
     * 0.0, 0.0, 1.0 RGB
     */
    @Generated
    @Selector("blueColor")
    public static native UIColor blueColor();

    /**
     * 0.6, 0.4, 0.2 RGB
     */
    @Generated
    @Selector("brownColor")
    public static native UIColor brownColor();

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

    /**
     * 0.0 white, 0.0 alpha
     */
    @Generated
    @Selector("clearColor")
    public static native UIColor clearColor();

    @Generated
    @Selector("colorWithCGColor:")
    public static native UIColor colorWithCGColor(CGColorRef cgColor);

    @Generated
    @Selector("colorWithCIColor:")
    public static native UIColor colorWithCIColor(CIColor ciColor);

    @Generated
    @Selector("colorWithDisplayP3Red:green:blue:alpha:")
    public static native UIColor colorWithDisplayP3RedGreenBlueAlpha(@NFloat double displayP3Red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @Generated
    @Selector("colorWithHue:saturation:brightness:alpha:")
    public static native UIColor colorWithHueSaturationBrightnessAlpha(@NFloat double hue, @NFloat double saturation,
            @NFloat double brightness, @NFloat double alpha);

    @Generated
    @Selector("colorWithPatternImage:")
    public static native UIColor colorWithPatternImage(UIImage image);

    @Generated
    @Selector("colorWithRed:green:blue:alpha:")
    public static native UIColor colorWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * Convenience methods for creating colors
     */
    @Generated
    @Selector("colorWithWhite:alpha:")
    public static native UIColor colorWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    /**
     * 0.0, 1.0, 1.0 RGB
     */
    @Generated
    @Selector("cyanColor")
    public static native UIColor cyanColor();

    /**
     * 0.333 white
     */
    @Generated
    @Selector("darkGrayColor")
    public static native UIColor darkGrayColor();

    /**
     * for a light background
     */
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
    @Generated
    @Selector("grayColor")
    public static native UIColor grayColor();

    /**
     * 0.0, 1.0, 0.0 RGB
     */
    @Generated
    @Selector("greenColor")
    public static native UIColor greenColor();

    /**
     * groupTableViewBackgroundColor is now the same as systemGroupedBackgroundColor.
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * 0.667 white
     */
    @Generated
    @Selector("lightGrayColor")
    public static native UIColor lightGrayColor();

    /**
     * for a dark background
     */
    @Generated
    @Selector("lightTextColor")
    public static native UIColor lightTextColor();

    /**
     * 1.0, 0.0, 1.0 RGB
     */
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
    @Generated
    @Selector("orangeColor")
    public static native UIColor orangeColor();

    /**
     * 0.5, 0.0, 0.5 RGB
     */
    @Generated
    @Selector("purpleColor")
    public static native UIColor purpleColor();

    /**
     * 1.0, 0.0, 0.0 RGB
     */
    @Generated
    @Selector("redColor")
    public static native UIColor redColor();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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

    @Generated
    @Deprecated
    @Selector("underPageBackgroundColor")
    public static native UIColor underPageBackgroundColor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackgroundColor();

    /**
     * 1.0 white
     */
    @Generated
    @Selector("whiteColor")
    public static native UIColor whiteColor();

    /**
     * 1.0, 1.0, 0.0 RGB
     */
    @Generated
    @Selector("yellowColor")
    public static native UIColor yellowColor();

    @Generated
    @Selector("CGColor")
    public native CGColorRef CGColor();

    @Generated
    @Selector("CIColor")
    public native CIColor CIColor();

    /**
     * Returns a color in the same color space as the receiver with the specified alpha component.
     */
    @Generated
    @Selector("colorWithAlphaComponent:")
    public native UIColor colorWithAlphaComponent(@NFloat double alpha);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("getHue:saturation:brightness:alpha:")
    public native boolean getHueSaturationBrightnessAlpha(NFloatPtr hue, NFloatPtr saturation, NFloatPtr brightness,
            NFloatPtr alpha);

    @Generated
    @Selector("getRed:green:blue:alpha:")
    public native boolean getRedGreenBlueAlpha(NFloatPtr red, NFloatPtr green, NFloatPtr blue, NFloatPtr alpha);

    /**
     * Convenience methods for getting components.
     * If the receiver is of a compatible color space, any non-NULL parameters are populated and 'YES' is returned. Otherwise, the parameters are left unchanged and 'NO' is returned.
     */
    @Generated
    @Selector("getWhite:alpha:")
    public native boolean getWhiteAlpha(NFloatPtr white, NFloatPtr alpha);

    @Generated
    @Selector("init")
    public native UIColor init();

    @Generated
    @Selector("initWithCGColor:")
    public native UIColor initWithCGColor(CGColorRef cgColor);

    @Generated
    @Selector("initWithCIColor:")
    public native UIColor initWithCIColor(CIColor ciColor);

    @Generated
    @Selector("initWithCoder:")
    public native UIColor initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithDisplayP3Red:green:blue:alpha:")
    public native UIColor initWithDisplayP3RedGreenBlueAlpha(@NFloat double displayP3Red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @Generated
    @Selector("initWithHue:saturation:brightness:alpha:")
    public native UIColor initWithHueSaturationBrightnessAlpha(@NFloat double hue, @NFloat double saturation,
            @NFloat double brightness, @NFloat double alpha);

    @Generated
    @Selector("initWithPatternImage:")
    public native UIColor initWithPatternImage(UIImage image);

    @Generated
    @Selector("initWithRed:green:blue:alpha:")
    public native UIColor initWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NFloat double alpha);

    /**
     * Initializers for creating colors
     */
    @Generated
    @Selector("initWithWhite:alpha:")
    public native UIColor initWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    /**
     * Set the color: Sets the fill and stroke colors in the current drawing context. Should be implemented by subclassers.
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
     */
    @Generated
    @Selector("colorNamed:")
    public static native UIColor colorNamed(String name);

    @Generated
    @Selector("colorNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIColor colorNamedInBundleCompatibleWithTraitCollection(String name, NSBundle bundle,
            UITraitCollection traitCollection);

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
    public static native UIColor objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public UIColor _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

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
     * Create a dynamic color with a provider.
     * When methods are called on this color that need color component values,
     * the provider is called with UITraitCollection.currentTraitCollection.
     * The provider should use that trait collection to decide a more fundamental UIColor to return.
     * As much as possible, use the given trait collection to make that decision, not other state.
     */
    @Generated
    @Selector("colorWithDynamicProvider:")
    public static native UIColor colorWithDynamicProvider(
            @ObjCBlock(name = "call_colorWithDynamicProvider") Block_colorWithDynamicProvider dynamicProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_colorWithDynamicProvider {
        @Generated
        UIColor call_colorWithDynamicProvider(UITraitCollection traitCollection);
    }

    @Generated
    @Selector("initWithDynamicProvider:")
    public native UIColor initWithDynamicProvider(
            @ObjCBlock(name = "call_initWithDynamicProvider") Block_initWithDynamicProvider dynamicProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDynamicProvider {
        @Generated
        UIColor call_initWithDynamicProvider(UITraitCollection traitCollection);
    }

    /**
     * Foreground colors for static text and related elements.
     */
    @Generated
    @Selector("labelColor")
    public static native UIColor labelColor();

    /**
     * Foreground color for standard system links.
     */
    @Generated
    @Selector("linkColor")
    public static native UIColor linkColor();

    @Generated
    @Selector("opaqueSeparatorColor")
    public static native UIColor opaqueSeparatorColor();

    /**
     * Foreground color for placeholder text in controls or text fields or text views.
     */
    @Generated
    @Selector("placeholderTextColor")
    public static native UIColor placeholderTextColor();

    @Generated
    @Selector("quaternaryLabelColor")
    public static native UIColor quaternaryLabelColor();

    /**
     * quaternarySystemFillColor is appropriate for filling large areas containing complex content.
     * Example: Expanded table cells.
     */
    @Generated
    @Selector("quaternarySystemFillColor")
    public static native UIColor quaternarySystemFillColor();

    /**
     * Resolve any color to its most fundamental form (a non-dynamic color) for a specific trait collection.
     */
    @Generated
    @Selector("resolvedColorWithTraitCollection:")
    public native UIColor resolvedColorWithTraitCollection(UITraitCollection traitCollection);

    @Generated
    @Selector("secondaryLabelColor")
    public static native UIColor secondaryLabelColor();

    @Generated
    @Selector("secondarySystemBackgroundColor")
    public static native UIColor secondarySystemBackgroundColor();

    /**
     * secondarySystemFillColor is appropriate for filling medium-size shapes.
     * Example: The background of a switch.
     */
    @Generated
    @Selector("secondarySystemFillColor")
    public static native UIColor secondarySystemFillColor();

    @Generated
    @Selector("secondarySystemGroupedBackgroundColor")
    public static native UIColor secondarySystemGroupedBackgroundColor();

    /**
     * Foreground colors for separators (thin border or divider lines).
     * `separatorColor` may be partially transparent, so it can go on top of any content.
     * `opaqueSeparatorColor` is intended to look similar, but is guaranteed to be opaque, so it will
     * completely cover anything behind it. Depending on the situation, you may need one or the other.
     */
    @Generated
    @Selector("separatorColor")
    public static native UIColor separatorColor();

    /**
     * We provide two design systems (also known as "stacks") for structuring an iOS app's backgrounds.
     * <p>
     * Each stack has three "levels" of background colors. The first color is intended to be the
     * main background, farthest back. Secondary and tertiary colors are layered on top
     * of the main background, when appropriate.
     * <p>
     * Inside of a discrete piece of UI, choose a stack, then use colors from that stack.
     * We do not recommend mixing and matching background colors between stacks.
     * The foreground colors above are designed to work in both stacks.
     * <p>
     * 1. systemBackground
     * Use this stack for views with standard table views, and designs which have a white
     * primary background in light mode.
     */
    @Generated
    @Selector("systemBackgroundColor")
    public static native UIColor systemBackgroundColor();

    @Generated
    @Selector("systemBlueColor")
    public static native UIColor systemBlueColor();

    /**
     * Fill colors for UI elements.
     * These are meant to be used over the background colors, since their alpha component is less than 1.
     * <p>
     * systemFillColor is appropriate for filling thin and small shapes.
     * Example: The track of a slider.
     */
    @Generated
    @Selector("systemFillColor")
    public static native UIColor systemFillColor();

    /**
     * The numbered variations, systemGray2 through systemGray6, are grays which increasingly
     * trend away from systemGray and in the direction of systemBackgroundColor.
     * <p>
     * In UIUserInterfaceStyleLight: systemGray1 is slightly lighter than systemGray.
     * systemGray2 is lighter than that, and so on.
     * In UIUserInterfaceStyleDark:  systemGray1 is slightly darker than systemGray.
     * systemGray2 is darker than that, and so on.
     */
    @Generated
    @Selector("systemGray2Color")
    public static native UIColor systemGray2Color();

    @Generated
    @Selector("systemGray3Color")
    public static native UIColor systemGray3Color();

    @Generated
    @Selector("systemGray4Color")
    public static native UIColor systemGray4Color();

    @Generated
    @Selector("systemGray5Color")
    public static native UIColor systemGray5Color();

    @Generated
    @Selector("systemGray6Color")
    public static native UIColor systemGray6Color();

    /**
     * Shades of gray. systemGray is the base gray color.
     */
    @Generated
    @Selector("systemGrayColor")
    public static native UIColor systemGrayColor();

    @Generated
    @Selector("systemGreenColor")
    public static native UIColor systemGreenColor();

    /**
     * 2. systemGroupedBackground
     * Use this stack for views with grouped content, such as grouped tables and
     * platter-based designs. These are like grouped table views, but you may use these
     * colors in places where a table view wouldn't make sense.
     */
    @Generated
    @Selector("systemGroupedBackgroundColor")
    public static native UIColor systemGroupedBackgroundColor();

    @Generated
    @Selector("systemIndigoColor")
    public static native UIColor systemIndigoColor();

    @Generated
    @Selector("systemOrangeColor")
    public static native UIColor systemOrangeColor();

    @Generated
    @Selector("systemPinkColor")
    public static native UIColor systemPinkColor();

    @Generated
    @Selector("systemPurpleColor")
    public static native UIColor systemPurpleColor();

    /**
     * Some colors that are used by system elements and applications.
     * These return named colors whose values may vary between different contexts and releases.
     * Do not make assumptions about the color spaces or actual colors used.
     */
    @Generated
    @Selector("systemRedColor")
    public static native UIColor systemRedColor();

    @Generated
    @Selector("systemTealColor")
    public static native UIColor systemTealColor();

    @Generated
    @Selector("systemYellowColor")
    public static native UIColor systemYellowColor();

    @Generated
    @Selector("tertiaryLabelColor")
    public static native UIColor tertiaryLabelColor();

    @Generated
    @Selector("tertiarySystemBackgroundColor")
    public static native UIColor tertiarySystemBackgroundColor();

    /**
     * tertiarySystemFillColor is appropriate for filling large shapes.
     * Examples: Input fields, search bars, buttons.
     */
    @Generated
    @Selector("tertiarySystemFillColor")
    public static native UIColor tertiarySystemFillColor();

    @Generated
    @Selector("tertiarySystemGroupedBackgroundColor")
    public static native UIColor tertiarySystemGroupedBackgroundColor();

    /**
     * Provides an accessible name for the UIColor for use in accessibility attribute APIs, such as when using accessibilityLabel.
     */
    @Generated
    @Selector("accessibilityName")
    public native String accessibilityName();

    @Generated
    @Selector("systemBrownColor")
    public static native UIColor systemBrownColor();

    @Generated
    @Selector("systemCyanColor")
    public static native UIColor systemCyanColor();

    @Generated
    @Selector("systemMintColor")
    public static native UIColor systemMintColor();

    /**
     * This color represents the tint color of a view.
     * <p>
     * Like other dynamic colors, UIColor.tintColor relies on UITraitCollection.currentTraitCollection
     * being set to a view's trait collection when it is used, so that it can resolve to that view's
     * tint color. If you use UIColor.tintColor outside a view's context, and do not resolve it
     * manually with a view's trait collection, it will return the system default tint color.
     * <p>
     * Setting UIColor.tintColor directly to a view's tintColor property behaves the same as setting nil.
     * However, you cannot set a custom dynamic color (e.g. using +[UIColor colorWithDynamicProvider:])
     * that can resolve to UIColor.tintColor to a view's tintColor property.
     */
    @Generated
    @Selector("tintColor")
    public static native UIColor tintColor();
}
