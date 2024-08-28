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

package apple.quartzcore;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.protocol.CAAction;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
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
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CATextLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CATextLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CATextLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CATextLayer allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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
    @Selector("layer")
    public static native CATextLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CATextLayer new_objc();

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
     * Describes how individual lines of text are aligned within the layer
     * bounds. The possible options are `natural', `left', `right',
     * `center' and `justified'. Defaults to `natural'.
     */
    @NotNull
    @Generated
    @Selector("alignmentMode")
    public native String alignmentMode();

    /**
     * Sets allowsFontSubpixelQuantization parameter of CGContextRef
     * passed to the -drawInContext: method. Defaults to NO.
     */
    @Generated
    @Selector("allowsFontSubpixelQuantization")
    public native boolean allowsFontSubpixelQuantization();

    /**
     * The font to use, currently may be either a CTFontRef (toll-free
     * bridged from UIFont), a CGFontRef, or a string naming the font.
     * Defaults to the Helvetica font. Only used when the `string' property
     * is not an NSAttributedString.
     */
    @Nullable
    @Generated
    @Selector("font")
    public native ConstVoidPtr font();

    /**
     * The font size. Defaults to 36. Only used when the `string' property
     * is not an NSAttributedString. Animatable (Mac OS X 10.6 and later.)
     */
    @Generated
    @Selector("fontSize")
    @NFloat
    public native double fontSize();

    /**
     * The color object used to draw the text. Defaults to opaque white.
     * Only used when the `string' property is not an NSAttributedString.
     * Animatable (Mac OS X 10.6 and later.)
     */
    @Nullable
    @Generated
    @Selector("foregroundColor")
    public native CGColorRef foregroundColor();

    @Generated
    @Selector("init")
    public native CATextLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CATextLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native CATextLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * When true the string is wrapped to fit within the layer bounds.
     * Defaults to NO.
     */
    @Generated
    @Selector("isWrapped")
    public native boolean isWrapped();

    /**
     * When true the string is wrapped to fit within the layer bounds.
     * Defaults to NO.
     */
    @Generated
    @Selector("setWrapped:")
    public native void setWrapped(boolean value);

    /**
     * Describes how individual lines of text are aligned within the layer
     * bounds. The possible options are `natural', `left', `right',
     * `center' and `justified'. Defaults to `natural'.
     */
    @Generated
    @Selector("setAlignmentMode:")
    public native void setAlignmentMode(@NotNull String value);

    /**
     * Sets allowsFontSubpixelQuantization parameter of CGContextRef
     * passed to the -drawInContext: method. Defaults to NO.
     */
    @Generated
    @Selector("setAllowsFontSubpixelQuantization:")
    public native void setAllowsFontSubpixelQuantization(boolean value);

    /**
     * The font to use, currently may be either a CTFontRef (toll-free
     * bridged from UIFont), a CGFontRef, or a string naming the font.
     * Defaults to the Helvetica font. Only used when the `string' property
     * is not an NSAttributedString.
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(@Nullable ConstVoidPtr value);

    /**
     * The font size. Defaults to 36. Only used when the `string' property
     * is not an NSAttributedString. Animatable (Mac OS X 10.6 and later.)
     */
    @Generated
    @Selector("setFontSize:")
    public native void setFontSize(@NFloat double value);

    /**
     * The color object used to draw the text. Defaults to opaque white.
     * Only used when the `string' property is not an NSAttributedString.
     * Animatable (Mac OS X 10.6 and later.)
     */
    @Generated
    @Selector("setForegroundColor:")
    public native void setForegroundColor(@Nullable CGColorRef value);

    /**
     * The text to be rendered, should be either an NSString or an
     * NSAttributedString. Defaults to nil.
     */
    @Generated
    @Selector("setString:")
    public native void setString(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Describes how the string is truncated to fit within the layer
     * bounds. The possible options are `none', `start', `middle' and
     * `end'. Defaults to `none'.
     */
    @Generated
    @Selector("setTruncationMode:")
    public native void setTruncationMode(@NotNull String value);

    /**
     * The text to be rendered, should be either an NSString or an
     * NSAttributedString. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("string")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object string();

    /**
     * Describes how the string is truncated to fit within the layer
     * bounds. The possible options are `none', `start', `middle' and
     * `end'. Defaults to `none'.
     */
    @NotNull
    @Generated
    @Selector("truncationMode")
    public native String truncationMode();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
