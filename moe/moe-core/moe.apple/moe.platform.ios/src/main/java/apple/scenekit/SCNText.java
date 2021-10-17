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

package apple.scenekit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.MDLMesh;
import apple.uikit.UIBezierPath;
import apple.uikit.UIFont;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNText
 * <p>
 * SCNText represents a block of text that has been extruded
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNText extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNText(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNText alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SCNText allocWithZone(VoidPtr zone);

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
    @Selector("geometry")
    public static native SCNText geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNText geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNText geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
            NSArray<? extends SCNGeometryElement> elements);

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
    public static native SCNText new_objc();

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

    /**
     * textWithString:extrusionDepth:
     * <p>
     * Creates and returns a 3D representation of given text with given extrusion depth.
     *
     * @param string         The text to be represented.
     * @param extrusionDepth The extrusion depth.
     */
    @Generated
    @Selector("textWithString:extrusionDepth:")
    public static native SCNText textWithStringExtrusionDepth(@Mapped(ObjCObjectMapper.class) Object string,
            @NFloat double extrusionDepth);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] alignmentMode
     * <p>
     * Determines how individual lines of text are horizontally aligned within the bounds.
     * <p>
     * For the text to be aligned you first need to set its bounds, otherwise the text is not aligned. The default value is kCAAlignmentNatural. See alignments in CATextLayer.h.
     */
    @Generated
    @Selector("alignmentMode")
    public native String alignmentMode();

    /**
     * [@property] chamferProfile
     * <p>
     * Describes the profile used to when "chamferRadius" is not nil. When "chamferProfile" is nil we fallback on a path representing a quadrant.
     * <p>
     * The profile should be a 2D curve beginning at (0,1) and ending at (1,0). The "flatness" property is also used to flatten this path. The default value is nil.
     */
    @Generated
    @Selector("chamferProfile")
    public native UIBezierPath chamferProfile();

    /**
     * [@property] chamferRadius
     * <p>
     * The chamfer radius. Animatable.
     * <p>
     * Values are clamped to the range [0, extrusionDepth / 2]. The actual chamfer radius might be different to the one here specified: large values are clipped to a per-glyph max value. The default value is 0.
     */
    @Generated
    @Selector("chamferRadius")
    @NFloat
    public native double chamferRadius();

    /**
     * [@property] containerFrame
     * <p>
     * A container within which the text may be wrapped or truncated.
     * <p>
     * The text will start at the top-left corner of the rect. You need to set this property for text truncation or alignment to work. Getting this property when it has never been set returns CGRectZero.
     */
    @Generated
    @Selector("containerFrame")
    @ByValue
    public native CGRect containerFrame();

    /**
     * [@property] extrusionDepth
     * <p>
     * The extrusion depth. Animatable.
     * <p>
     * If the value is 0, we get a mono-sided, 2D version of the text.
     */
    @Generated
    @Selector("extrusionDepth")
    @NFloat
    public native double extrusionDepth();

    /**
     * [@property] flatness
     * <p>
     * Specifies the accuracy (or smoothness) with which fonts are rendered.
     * <p>
     * Smaller numbers give smoother curves at the expense of more computation and heavier geometries in terms of vertices. The default value is 1.0, which yields smooth curves.
     */
    @Generated
    @Selector("flatness")
    @NFloat
    public native double flatness();

    /**
     * [@property] font
     * <p>
     * The font used to represent the text.
     * <p>
     * The font property is only used when the string property is not an NSAttributedString. Defaults to Helvetica 36 point.
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    @Generated
    @Selector("init")
    public native SCNText init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNText initWithCoder(NSCoder coder);

    /**
     * [@property] wrapped
     * <p>
     * Determines whether the text is wrapped to fit within the bounds.
     * <p>
     * For the text to be wrapped you first need to set its bounds, otherwise the text is not wrapped. The default value is NO.
     */
    @Generated
    @Selector("isWrapped")
    public native boolean isWrapped();

    /**
     * [@property] wrapped
     * <p>
     * Determines whether the text is wrapped to fit within the bounds.
     * <p>
     * For the text to be wrapped you first need to set its bounds, otherwise the text is not wrapped. The default value is NO.
     */
    @Generated
    @Selector("setWrapped:")
    public native void setWrapped(boolean value);

    /**
     * [@property] alignmentMode
     * <p>
     * Determines how individual lines of text are horizontally aligned within the bounds.
     * <p>
     * For the text to be aligned you first need to set its bounds, otherwise the text is not aligned. The default value is kCAAlignmentNatural. See alignments in CATextLayer.h.
     */
    @Generated
    @Selector("setAlignmentMode:")
    public native void setAlignmentMode(String value);

    /**
     * [@property] chamferProfile
     * <p>
     * Describes the profile used to when "chamferRadius" is not nil. When "chamferProfile" is nil we fallback on a path representing a quadrant.
     * <p>
     * The profile should be a 2D curve beginning at (0,1) and ending at (1,0). The "flatness" property is also used to flatten this path. The default value is nil.
     */
    @Generated
    @Selector("setChamferProfile:")
    public native void setChamferProfile(UIBezierPath value);

    /**
     * [@property] chamferRadius
     * <p>
     * The chamfer radius. Animatable.
     * <p>
     * Values are clamped to the range [0, extrusionDepth / 2]. The actual chamfer radius might be different to the one here specified: large values are clipped to a per-glyph max value. The default value is 0.
     */
    @Generated
    @Selector("setChamferRadius:")
    public native void setChamferRadius(@NFloat double value);

    /**
     * [@property] containerFrame
     * <p>
     * A container within which the text may be wrapped or truncated.
     * <p>
     * The text will start at the top-left corner of the rect. You need to set this property for text truncation or alignment to work. Getting this property when it has never been set returns CGRectZero.
     */
    @Generated
    @Selector("setContainerFrame:")
    public native void setContainerFrame(@ByValue CGRect value);

    /**
     * [@property] extrusionDepth
     * <p>
     * The extrusion depth. Animatable.
     * <p>
     * If the value is 0, we get a mono-sided, 2D version of the text.
     */
    @Generated
    @Selector("setExtrusionDepth:")
    public native void setExtrusionDepth(@NFloat double value);

    /**
     * [@property] flatness
     * <p>
     * Specifies the accuracy (or smoothness) with which fonts are rendered.
     * <p>
     * Smaller numbers give smoother curves at the expense of more computation and heavier geometries in terms of vertices. The default value is 1.0, which yields smooth curves.
     */
    @Generated
    @Selector("setFlatness:")
    public native void setFlatness(@NFloat double value);

    /**
     * [@property] font
     * <p>
     * The font used to represent the text.
     * <p>
     * The font property is only used when the string property is not an NSAttributedString. Defaults to Helvetica 36 point.
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * [@property] string
     * <p>
     * The text to be represented. The text must be an instance of NSString or NSAttributedString.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("setString:")
    public native void setString(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] truncationMode
     * <p>
     * Describes how the text is truncated to fit within the bounds.
     * <p>
     * For the text to be truncated you first need to set its bounds, otherwise the text is not truncated. The default value is kCATruncationNone. See truncation modes in CATextLayer.h.
     */
    @Generated
    @Selector("setTruncationMode:")
    public native void setTruncationMode(String value);

    /**
     * [@property] string
     * <p>
     * The text to be represented. The text must be an instance of NSString or NSAttributedString.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("string")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object string();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] truncationMode
     * <p>
     * Describes how the text is truncated to fit within the bounds.
     * <p>
     * For the text to be truncated you first need to set its bounds, otherwise the text is not truncated. The default value is kCATruncationNone. See truncation modes in CATextLayer.h.
     */
    @Generated
    @Selector("truncationMode")
    public native String truncationMode();
}
