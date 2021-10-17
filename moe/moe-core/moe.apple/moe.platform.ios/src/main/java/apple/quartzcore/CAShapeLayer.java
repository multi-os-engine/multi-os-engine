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
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The shape layer draws a cubic Bezier spline in its coordinate space.
 * <p>
 * The spline is described using a CGPath object and may have both fill
 * and stroke components (in which case the stroke is composited over
 * the fill). The shape as a whole is composited between the layer's
 * contents and its first sublayer.
 * <p>
 * The path object may be animated using any of the concrete subclasses
 * of CAPropertyAnimation. Paths will interpolate as a linear blend of
 * the "on-line" points; "off-line" points may be interpolated
 * non-linearly (e.g. to preserve continuity of the curve's
 * derivative). If the two paths have a different number of control
 * points or segments the results are undefined.
 * <p>
 * The shape will be drawn antialiased, and whenever possible it will
 * be mapped into screen space before being rasterized to preserve
 * resolution independence. (However, certain kinds of image processing
 * operations, e.g. CoreImage filters, applied to the layer or its
 * ancestors may force rasterization in a local coordinate space.)
 * <p>
 * Note: rasterization may favor speed over accuracy, e.g. pixels with
 * multiple intersecting path segments may not give exact results.
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAShapeLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CAShapeLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAShapeLayer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(String event);

    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(String key);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layer")
    public static native CAShapeLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(String key);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The color to fill the path, or nil for no fill. Defaults to opaque
     * black. Animatable.
     */
    @Generated
    @Selector("fillColor")
    public native CGColorRef fillColor();

    /**
     * The fill rule used when filling the path. Options are `non-zero' and
     * `even-odd'. Defaults to `non-zero'.
     */
    @Generated
    @Selector("fillRule")
    public native String fillRule();

    @Generated
    @Selector("init")
    public native CAShapeLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CAShapeLayer initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native CAShapeLayer initWithLayer(@Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * The cap style used when stroking the path. Options are `butt', `round'
     * and `square'. Defaults to `butt'.
     */
    @Generated
    @Selector("lineCap")
    public native String lineCap();

    /**
     * The dash pattern (an array of NSNumbers) applied when creating the
     * stroked version of the path. Defaults to nil.
     */
    @Generated
    @Selector("lineDashPattern")
    public native NSArray<? extends NSNumber> lineDashPattern();

    /**
     * The phase of the dashing pattern applied when creating the stroke.
     * Defaults to zero. Animatable.
     */
    @Generated
    @Selector("lineDashPhase")
    @NFloat
    public native double lineDashPhase();

    /**
     * The join style used when stroking the path. Options are `miter', `round'
     * and `bevel'. Defaults to `miter'.
     */
    @Generated
    @Selector("lineJoin")
    public native String lineJoin();

    /**
     * The line width used when stroking the path. Defaults to one.
     * Animatable.
     */
    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    /**
     * The miter limit used when stroking the path. Defaults to ten.
     * Animatable.
     */
    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    /**
     * The path defining the shape to be rendered. If the path extends
     * outside the layer bounds it will not automatically be clipped to the
     * layer, only if the normal layer masking rules cause that. Upon
     * assignment the path is copied. Defaults to null. Animatable.
     * (Note that although the path property is animatable, no implicit
     * animation will be created when the property is changed.)
     */
    @Generated
    @Selector("path")
    public native CGPathRef path();

    /**
     * The color to fill the path, or nil for no fill. Defaults to opaque
     * black. Animatable.
     */
    @Generated
    @Selector("setFillColor:")
    public native void setFillColor(CGColorRef value);

    /**
     * The fill rule used when filling the path. Options are `non-zero' and
     * `even-odd'. Defaults to `non-zero'.
     */
    @Generated
    @Selector("setFillRule:")
    public native void setFillRule(String value);

    /**
     * The cap style used when stroking the path. Options are `butt', `round'
     * and `square'. Defaults to `butt'.
     */
    @Generated
    @Selector("setLineCap:")
    public native void setLineCap(String value);

    /**
     * The dash pattern (an array of NSNumbers) applied when creating the
     * stroked version of the path. Defaults to nil.
     */
    @Generated
    @Selector("setLineDashPattern:")
    public native void setLineDashPattern(NSArray<? extends NSNumber> value);

    /**
     * The phase of the dashing pattern applied when creating the stroke.
     * Defaults to zero. Animatable.
     */
    @Generated
    @Selector("setLineDashPhase:")
    public native void setLineDashPhase(@NFloat double value);

    /**
     * The join style used when stroking the path. Options are `miter', `round'
     * and `bevel'. Defaults to `miter'.
     */
    @Generated
    @Selector("setLineJoin:")
    public native void setLineJoin(String value);

    /**
     * The line width used when stroking the path. Defaults to one.
     * Animatable.
     */
    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    /**
     * The miter limit used when stroking the path. Defaults to ten.
     * Animatable.
     */
    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    /**
     * The path defining the shape to be rendered. If the path extends
     * outside the layer bounds it will not automatically be clipped to the
     * layer, only if the normal layer masking rules cause that. Upon
     * assignment the path is copied. Defaults to null. Animatable.
     * (Note that although the path property is animatable, no implicit
     * animation will be created when the property is changed.)
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(CGPathRef value);

    /**
     * The color to fill the path's stroked outline, or nil for no stroking.
     * Defaults to nil. Animatable.
     */
    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(CGColorRef value);

    @Generated
    @Selector("setStrokeEnd:")
    public native void setStrokeEnd(@NFloat double value);

    /**
     * These values define the subregion of the path used to draw the
     * stroked outline. The values must be in the range [0,1] with zero
     * representing the start of the path and one the end. Values in
     * between zero and one are interpolated linearly along the path
     * length. strokeStart defaults to zero and strokeEnd to one. Both are
     * animatable.
     */
    @Generated
    @Selector("setStrokeStart:")
    public native void setStrokeStart(@NFloat double value);

    /**
     * The color to fill the path's stroked outline, or nil for no stroking.
     * Defaults to nil. Animatable.
     */
    @Generated
    @Selector("strokeColor")
    public native CGColorRef strokeColor();

    @Generated
    @Selector("strokeEnd")
    @NFloat
    public native double strokeEnd();

    /**
     * These values define the subregion of the path used to draw the
     * stroked outline. The values must be in the range [0,1] with zero
     * representing the start of the path and one the end. Values in
     * between zero and one are interpolated linearly along the path
     * length. strokeStart defaults to zero and strokeEnd to one. Both are
     * animatable.
     */
    @Generated
    @Selector("strokeStart")
    @NFloat
    public native double strokeStart();

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
    public static native double cornerCurveExpansionFactor(String curve);
}
