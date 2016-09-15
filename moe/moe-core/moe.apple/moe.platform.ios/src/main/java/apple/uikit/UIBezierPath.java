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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBezierPath extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBezierPath(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("CGPath")
    public native CGPathRef CGPath();

    /**
     * addArcWithCenter:radius:startAngle:endAngle:clockwise:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/addArcWithCenter:radius:startAngle:endAngle:clockwise:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addArcWithCenter:radius:startAngle:endAngle:clockwise:")
    public native void addArcWithCenterRadiusStartAngleEndAngleClockwise(@ByValue CGPoint center, @NFloat double radius,
            @NFloat double startAngle, @NFloat double endAngle, boolean clockwise);

    /**
     * addClip</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/addClip">iOS Dev Center</a>
     */
    @Generated
    @Selector("addClip")
    public native void addClip();

    /**
     * addCurveToPoint:controlPoint1:controlPoint2:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/addCurveToPoint:controlPoint1:controlPoint2:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addCurveToPoint:controlPoint1:controlPoint2:")
    public native void addCurveToPointControlPoint1ControlPoint2(@ByValue CGPoint endPoint,
            @ByValue CGPoint controlPoint1, @ByValue CGPoint controlPoint2);

    /**
     * addLineToPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/addLineToPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addLineToPoint:")
    public native void addLineToPoint(@ByValue CGPoint point);

    /**
     * addQuadCurveToPoint:controlPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/addQuadCurveToPoint:controlPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addQuadCurveToPoint:controlPoint:")
    public native void addQuadCurveToPointControlPoint(@ByValue CGPoint endPoint, @ByValue CGPoint controlPoint);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBezierPath alloc();

    /**
     * appendPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/appendPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appendPath:")
    public native void appendPath(UIBezierPath bezierPath);

    /**
     * applyTransform:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/applyTransform:">iOS Dev Center</a>
     */
    @Generated
    @Selector("applyTransform:")
    public native void applyTransform(@ByValue CGAffineTransform transform);

    /**
     * bezierPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPath")
    public static native UIBezierPath bezierPath();

    /**
     * bezierPathByReversingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/bezierPathByReversingPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathByReversingPath")
    public native UIBezierPath bezierPathByReversingPath();

    /**
     * bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:")
    public static native UIBezierPath bezierPathWithArcCenterRadiusStartAngleEndAngleClockwise(@ByValue CGPoint center,
            @NFloat double radius, @NFloat double startAngle, @NFloat double endAngle, boolean clockwise);

    /**
     * bezierPathWithCGPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithCGPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithCGPath:")
    public static native UIBezierPath bezierPathWithCGPath(CGPathRef CGPath);

    /**
     * bezierPathWithOvalInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithOvalInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithOvalInRect:")
    public static native UIBezierPath bezierPathWithOvalInRect(@ByValue CGRect rect);

    /**
     * bezierPathWithRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithRect:")
    public static native UIBezierPath bezierPathWithRect(@ByValue CGRect rect);

    /**
     * bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:")
    public static native UIBezierPath bezierPathWithRoundedRectByRoundingCornersCornerRadii(@ByValue CGRect rect,
            @NUInt long corners, @ByValue CGSize cornerRadii);

    /**
     * bezierPathWithRoundedRect:cornerRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/clm/UIBezierPath/bezierPathWithRoundedRect:cornerRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bezierPathWithRoundedRect:cornerRadius:")
    public static native UIBezierPath bezierPathWithRoundedRectCornerRadius(@ByValue CGRect rect,
            @NFloat double cornerRadius);

    /**
     * bounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/bounds">iOS Dev Center</a>
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * closePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/closePath">iOS Dev Center</a>
     */
    @Generated
    @Selector("closePath")
    public native void closePath();

    /**
     * containsPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/containsPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsPoint:")
    public native boolean containsPoint(@ByValue CGPoint point);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * currentPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/currentPoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPoint")
    @ByValue
    public native CGPoint currentPoint();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * fill</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/fill">iOS Dev Center</a>
     */
    @Generated
    @Selector("fill")
    public native void fill();

    /**
     * fillWithBlendMode:alpha:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/fillWithBlendMode:alpha:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fillWithBlendMode:alpha:")
    public native void fillWithBlendModeAlpha(int blendMode, @NFloat double alpha);

    /**
     * flatness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/flatness">iOS Dev Center</a>
     */
    @Generated
    @Selector("flatness")
    @NFloat
    public native double flatness();

    /**
     * getLineDash:count:phase:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/getLineDash:count:phase:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getLineDash:count:phase:")
    public native void getLineDashCountPhase(NFloatPtr pattern, NIntPtr count, NFloatPtr phase);

    @Generated
    @Selector("init")
    public native UIBezierPath init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBezierPath initWithCoder(NSCoder aDecoder);

    /**
     * empty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/empty">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    /**
     * lineCapStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineCapStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineCapStyle")
    public native int lineCapStyle();

    /**
     * lineJoinStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineJoinStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineJoinStyle")
    public native int lineJoinStyle();

    /**
     * lineWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineWidth")
    @NFloat
    public native double lineWidth();

    /**
     * miterLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/miterLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("miterLimit")
    @NFloat
    public native double miterLimit();

    /**
     * moveToPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/moveToPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveToPoint:")
    public native void moveToPoint(@ByValue CGPoint point);

    /**
     * removeAllPoints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/removeAllPoints">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllPoints")
    public native void removeAllPoints();

    /**
     * CGPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/CGPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCGPath:")
    public native void setCGPath(CGPathRef value);

    /**
     * flatness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/flatness">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFlatness:")
    public native void setFlatness(@NFloat double value);

    /**
     * lineCapStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineCapStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineCapStyle:")
    public native void setLineCapStyle(int value);

    /**
     * setLineDash:count:phase:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/setLineDash:count:phase:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineDash:count:phase:")
    public native void setLineDashCountPhase(ConstNFloatPtr pattern, @NInt long count, @NFloat double phase);

    /**
     * lineJoinStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineJoinStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineJoinStyle:")
    public native void setLineJoinStyle(int value);

    /**
     * lineWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/lineWidth">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineWidth:")
    public native void setLineWidth(@NFloat double value);

    /**
     * miterLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/miterLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMiterLimit:")
    public native void setMiterLimit(@NFloat double value);

    /**
     * usesEvenOddFillRule</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/usesEvenOddFillRule">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesEvenOddFillRule:")
    public native void setUsesEvenOddFillRule(boolean value);

    /**
     * stroke</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/stroke">iOS Dev Center</a>
     */
    @Generated
    @Selector("stroke")
    public native void stroke();

    /**
     * strokeWithBlendMode:alpha:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instm/UIBezierPath/strokeWithBlendMode:alpha:">iOS Dev Center</a>
     */
    @Generated
    @Selector("strokeWithBlendMode:alpha:")
    public native void strokeWithBlendModeAlpha(int blendMode, @NFloat double alpha);

    /**
     * usesEvenOddFillRule</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBezierPath_class/index.html#//apple_ref/occ/instp/UIBezierPath/usesEvenOddFillRule">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesEvenOddFillRule")
    public native boolean usesEvenOddFillRule();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
}
