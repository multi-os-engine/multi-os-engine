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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A node that displays a text label with a given font.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKLabelNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKLabelNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKLabelNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKLabelNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    @Selector("labelNodeWithFontNamed:")
    public static native SKLabelNode labelNodeWithFontNamed(@Nullable String fontName);

    @Generated
    @Selector("labelNodeWithText:")
    public static native SKLabelNode labelNodeWithText(@Nullable String text);

    @Generated
    @Owned
    @Selector("new")
    public static native SKLabelNode new_objc();

    @Generated
    @Selector("node")
    public static native SKLabelNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKLabelNode nodeWithFileNamed(@NotNull String filename);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            @NotNull NSArray<? extends SKNode> sprites, float accuracy);

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
     * Sets the blend mode to use when composing the sprite with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * Color to be blended with the text based on the colorBlendFactor
     */
    @Nullable
    @Generated
    @Selector("color")
    public native UIColor color();

    /**
     * Controls the blending between the rendered text and a color. The valid interval of values is from 0.0 up to and
     * including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum (1.0)
     * if above.
     */
    @Generated
    @Selector("colorBlendFactor")
    @NFloat
    public native double colorBlendFactor();

    /**
     * Base color that the text is rendered with (if supported by the font)
     */
    @Nullable
    @Generated
    @Selector("fontColor")
    public native UIColor fontColor();

    @Nullable
    @Generated
    @Selector("fontName")
    public native String fontName();

    @Generated
    @Selector("fontSize")
    @NFloat
    public native double fontSize();

    @Generated
    @Selector("horizontalAlignmentMode")
    @NInt
    public native long horizontalAlignmentMode();

    @Generated
    @Selector("init")
    public native SKLabelNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKLabelNode initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithFontNamed:")
    public native SKLabelNode initWithFontNamed(@Nullable String fontName);

    /**
     * Sets the blend mode to use when composing the sprite with the final framebuffer.
     * 
     * @see SKNode.SKBlendMode
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * Color to be blended with the text based on the colorBlendFactor
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@Nullable UIColor value);

    /**
     * Controls the blending between the rendered text and a color. The valid interval of values is from 0.0 up to and
     * including 1.0. A value above or below that interval is clamped to the minimum (0.0) if below or the maximum (1.0)
     * if above.
     */
    @Generated
    @Selector("setColorBlendFactor:")
    public native void setColorBlendFactor(@NFloat double value);

    /**
     * Base color that the text is rendered with (if supported by the font)
     */
    @Generated
    @Selector("setFontColor:")
    public native void setFontColor(@Nullable UIColor value);

    @Generated
    @Selector("setFontName:")
    public native void setFontName(@Nullable String value);

    @Generated
    @Selector("setFontSize:")
    public native void setFontSize(@NFloat double value);

    @Generated
    @Selector("setHorizontalAlignmentMode:")
    public native void setHorizontalAlignmentMode(@NInt long value);

    @Generated
    @Selector("setText:")
    public native void setText(@Nullable String value);

    @Generated
    @Selector("setVerticalAlignmentMode:")
    public native void setVerticalAlignmentMode(@NInt long value);

    @Nullable
    @Generated
    @Selector("text")
    public native String text();

    @Generated
    @Selector("verticalAlignmentMode")
    @NInt
    public native long verticalAlignmentMode();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("labelNodeWithAttributedText:")
    public static native SKLabelNode labelNodeWithAttributedText(@Nullable NSAttributedString attributedText);

    /**
     * Determines the line break mode for multiple lines.
     * Default is NSLineBreakByTruncatingTail
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * Determines the number of lines to draw. The default value is 1 (single line). A value of 0 means no limit.
     * If the height of the text reaches the # of lines the text will be truncated using the line break mode.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("numberOfLines")
    @NInt
    public native long numberOfLines();

    /**
     * If nonzero, this is used when determining layout width for multiline labels.
     * Default is zero.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("preferredMaxLayoutWidth")
    @NFloat
    public native double preferredMaxLayoutWidth();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(@Nullable NSAttributedString value);

    /**
     * Determines the line break mode for multiple lines.
     * Default is NSLineBreakByTruncatingTail
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * Determines the number of lines to draw. The default value is 1 (single line). A value of 0 means no limit.
     * If the height of the text reaches the # of lines the text will be truncated using the line break mode.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setNumberOfLines:")
    public native void setNumberOfLines(@NInt long value);

    /**
     * If nonzero, this is used when determining layout width for multiline labels.
     * Default is zero.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@NFloat double value);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKLabelNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
