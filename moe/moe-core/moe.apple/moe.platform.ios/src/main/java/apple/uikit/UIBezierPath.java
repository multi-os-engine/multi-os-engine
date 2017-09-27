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
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBezierPath extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBezierPath(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBezierPath alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bezierPath")
    public static native UIBezierPath bezierPath();

    @Generated
    @Selector("bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:")
    public static native UIBezierPath bezierPathWithArcCenterRadiusStartAngleEndAngleClockwise(@ByValue CGPoint center,
            @NFloat double radius, @NFloat double startAngle, @NFloat double endAngle, boolean clockwise);

    @Generated
    @Selector("bezierPathWithCGPath:")
    public static native UIBezierPath bezierPathWithCGPath(CGPathRef CGPath);

    @Generated
    @Selector("bezierPathWithOvalInRect:")
    public static native UIBezierPath bezierPathWithOvalInRect(@ByValue CGRect rect);

    @Generated
    @Selector("bezierPathWithRect:")
    public static native UIBezierPath bezierPathWithRect(@ByValue CGRect rect);

    @Generated
    @Selector("bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:")
    public static native UIBezierPath bezierPathWithRoundedRectByRoundingCornersCornerRadii(@ByValue CGRect rect,
            @NUInt long corners, @ByValue CGSize cornerRadii);

    @Generated
    @Selector("bezierPathWithRoundedRect:cornerRadius:")
    public static native UIBezierPath bezierPathWithRoundedRectCornerRadius(@ByValue CGRect rect,
            @NFloat double cornerRadius);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("CGPath")
    public native CGPathRef CGPath();

    @Generated
    @Selector("addArcWithCenter:radius:startAngle:endAngle:clockwise:")
    public native void addArcWithCenterRadiusStartAngleEndAngleClockwise(@ByValue CGPoint center, @NFloat double radius,
            @NFloat double startAngle, @NFloat double endAngle, boolean clockwise);

    @Generated
    @Selector("addClip")
    public native void addClip();

    @Generated
    @Selector("addCurveToPoint:controlPoint1:controlPoint2:")
    public native void addCurveToPointControlPoint1ControlPoint2(@ByValue CGPoint endPoint,
            @ByValue CGPoint controlPoint1, @ByValue CGPoint controlPoint2);

    @Generated
    @Selector("addLineToPoint:")
    public native void addLineToPoint(@ByValue CGPoint point);

    @Generated
    @Selector("addQuadCurveToPoint:controlPoint:")
    public native void addQuadCurveToPointControlPoint(@ByValue CGPoint endPoint, @ByValue CGPoint controlPoint);

    @Generated
    @Selector("appendPath:")
    public native void appendPath(UIBezierPath bezierPath);

    @Generated
    @Selector("applyTransform:")
    public native void applyTransform(@ByValue CGAffineTransform transform);

    @Generated
    @Selector("bezierPathByReversingPath")
    public native UIBezierPath bezierPathByReversingPath();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("closePath")
    public native void closePath();

    @Generated
    @Selector("containsPoint:")
    public native boolean containsPoint(@ByValue CGPoint point);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("currentPoint")
    @ByValue
    public native CGPoint currentPoint();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("fill")
    public native void fill();

    @Generated
    @Selector("fillWithBlendMode:alpha:")
    public native void fillWithBlendModeAlpha(int blendMode, @NFloat double alpha);

    @Generated
    @Selector("flatness")
    @NFloat
    public native double flatness();

    @Generated
    @Selector("getLineDash:count:phase:")
    public native void getLineDashCountPhase(NFloatPtr pattern, NIntPtr count, NFloatPtr phase);

    @Generated
    @Selector("init")
    public native UIBezierPath init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBezierPath initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    @Generated
    @Selector("lineCapStyle")
    public native int lineCapStyle();

    @Generated
    @Selector("lineJoinStyle")
    public native int lineJoinStyle();

    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    @Generated
    @Selector("moveToPoint:")
    public native void moveToPoint(@ByValue CGPoint point);

    @Generated
    @Selector("removeAllPoints")
    public native void removeAllPoints();

    @Generated
    @Selector("setCGPath:")
    public native void setCGPath(CGPathRef value);

    @Generated
    @Selector("setFlatness:")
    public native void setFlatness(@NFloat double value);

    @Generated
    @Selector("setLineCapStyle:")
    public native void setLineCapStyle(int value);

    @Generated
    @Selector("setLineDash:count:phase:")
    public native void setLineDashCountPhase(ConstNFloatPtr pattern, @NInt long count, @NFloat double phase);

    @Generated
    @Selector("setLineJoinStyle:")
    public native void setLineJoinStyle(int value);

    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    @Generated
    @Selector("setUsesEvenOddFillRule:")
    public native void setUsesEvenOddFillRule(boolean value);

    @Generated
    @Selector("stroke")
    public native void stroke();

    @Generated
    @Selector("strokeWithBlendMode:alpha:")
    public native void strokeWithBlendModeAlpha(int blendMode, @NFloat double alpha);

    @Generated
    @Selector("usesEvenOddFillRule")
    public native boolean usesEvenOddFillRule();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
