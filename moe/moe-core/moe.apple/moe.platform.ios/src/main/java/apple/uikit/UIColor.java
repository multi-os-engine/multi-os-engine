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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("blackColor")
    public static native UIColor blackColor();

    @Generated
    @Selector("blueColor")
    public static native UIColor blueColor();

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

    @Generated
    @Selector("colorWithWhite:alpha:")
    public static native UIColor colorWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    @Generated
    @Selector("cyanColor")
    public static native UIColor cyanColor();

    @Generated
    @Selector("darkGrayColor")
    public static native UIColor darkGrayColor();

    @Generated
    @Selector("darkTextColor")
    public static native UIColor darkTextColor();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("grayColor")
    public static native UIColor grayColor();

    @Generated
    @Selector("greenColor")
    public static native UIColor greenColor();

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

    @Generated
    @Selector("lightGrayColor")
    public static native UIColor lightGrayColor();

    @Generated
    @Selector("lightTextColor")
    public static native UIColor lightTextColor();

    @Generated
    @Selector("magentaColor")
    public static native UIColor magentaColor();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("orangeColor")
    public static native UIColor orangeColor();

    @Generated
    @Selector("purpleColor")
    public static native UIColor purpleColor();

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

    @Generated
    @Selector("whiteColor")
    public static native UIColor whiteColor();

    @Generated
    @Selector("yellowColor")
    public static native UIColor yellowColor();

    @Generated
    @Selector("CGColor")
    public native CGColorRef CGColor();

    @Generated
    @Selector("CIColor")
    public native CIColor CIColor();

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
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("getHue:saturation:brightness:alpha:")
    public native boolean getHueSaturationBrightnessAlpha(NFloatPtr hue, NFloatPtr saturation, NFloatPtr brightness,
            NFloatPtr alpha);

    @Generated
    @Selector("getRed:green:blue:alpha:")
    public native boolean getRedGreenBlueAlpha(NFloatPtr red, NFloatPtr green, NFloatPtr blue, NFloatPtr alpha);

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
    public native UIColor initWithCoder(NSCoder aDecoder);

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

    @Generated
    @Selector("initWithWhite:alpha:")
    public native UIColor initWithWhiteAlpha(@NFloat double white, @NFloat double alpha);

    @Generated
    @Selector("set")
    public native void set();

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
}
