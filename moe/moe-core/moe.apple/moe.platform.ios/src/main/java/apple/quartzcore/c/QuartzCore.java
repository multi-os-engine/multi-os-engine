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

package apple.quartzcore.c;

import apple.coregraphics.struct.CGAffineTransform;
import apple.quartzcore.struct.CATransform3D;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("QuartzCore")
@Runtime(CRuntime.class)
public final class QuartzCore {
    static {
        NatJ.register();
    }

    @Generated
    private QuartzCore() {
    }

    /**
     * Returns the current CoreAnimation absolute time. This is the result of
     * calling mach_absolute_time () and converting the units to seconds.
     */
    @Generated
    @CFunction
    public static native double CACurrentMediaTime();

    /**
     * Returns true if 't' is the identity transform.
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsIdentity(@ByValue CATransform3D t);

    /**
     * Returns true if 'a' is exactly equal to 'b'.
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DEqualToTransform(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * Returns a transform that translates by '(tx, ty, tz)':
     * t' =  [1 0 0 0; 0 1 0 0; 0 0 1 0; tx ty tz 1].
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeTranslation(@NFloat double tx, @NFloat double ty,
            @NFloat double tz);

    /**
     * Returns a transform that scales by `(sx, sy, sz)':
     * t' = [sx 0 0 0; 0 sy 0 0; 0 0 sz 0; 0 0 0 1].
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeScale(@NFloat double sx, @NFloat double sy, @NFloat double sz);

    /**
     * Returns a transform that rotates by 'angle' radians about the vector
     * '(x, y, z)'. If the vector has length zero the identity transform is
     * returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeRotation(@NFloat double angle, @NFloat double x,
            @NFloat double y, @NFloat double z);

    /**
     * Translate 't' by '(tx, ty, tz)' and return the result:
     * t' = translate(tx, ty, tz) * t.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DTranslate(@ByValue CATransform3D t, @NFloat double tx,
            @NFloat double ty, @NFloat double tz);

    /**
     * Scale 't' by '(sx, sy, sz)' and return the result:
     * t' = scale(sx, sy, sz) * t.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DScale(@ByValue CATransform3D t, @NFloat double sx,
            @NFloat double sy, @NFloat double sz);

    /**
     * Rotate 't' by 'angle' radians about the vector '(x, y, z)' and return
     * the result. If the vector has zero length the behavior is undefined:
     * t' = rotation(angle, x, y, z) * t.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DRotate(@ByValue CATransform3D t, @NFloat double angle,
            @NFloat double x, @NFloat double y, @NFloat double z);

    /**
     * Concatenate 'b' to 'a' and return the result: t' = a * b.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DConcat(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * Invert 't' and return the result. Returns the original matrix if 't'
     * has no inverse.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DInvert(@ByValue CATransform3D t);

    /**
     * Return a transform with the same effect as affine transform 'm'.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeAffineTransform(@ByValue CGAffineTransform m);

    /**
     * Returns true if 't' can be represented exactly by an affine transform.
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsAffine(@ByValue CATransform3D t);

    /**
     * Returns the affine transform represented by 't'. If 't' can not be
     * represented exactly by an affine transform the returned value is
     * undefined.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CATransform3DGetAffineTransform(@ByValue CATransform3D t);

    /**
     * The identity transform: [1 0 0 0; 0 1 0 0; 0 0 1 0; 0 0 0 1].
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CATransform3D CATransform3DIdentity();

    /**
     * `fillMode' options.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeForwards();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeBackwards();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeBoth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeRemoved();

    /**
     * Layer `contentsGravity' values. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityCenter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTop();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTopLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTopRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottomLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottomRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResizeAspect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResizeAspectFill();

    /**
     * RGBA UInt8 per component
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatRGBA8Uint();

    /**
     * RGBA half-float 16-bit per component
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatRGBA16Float();

    /**
     * Grayscale with alpha (if not opaque) UInt8 per component
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatGray8Uint();

    /**
     * Contents filter names. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterNearest();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterLinear();

    /**
     * Trilinear minification filter. Enables mipmap generation. Some
     * renderers may ignore this, or impose additional restrictions, such
     * as source images requiring power-of-two dimensions.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterTrilinear();

    /**
     * Layer event names. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderOut();

    /**
     * The animation key used for transitions. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransition();

    /**
     * `calculationMode' strings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationLinear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationDiscrete();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationPaced();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationCubic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationCubicPaced();

    /**
     * `rotationMode' strings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAuto();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAutoReverse();

    /**
     * Common transition types.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFade();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionMoveIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionPush();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionReveal();

    /**
     * Common transition subtypes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromTop();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromBottom();

    /**
     * `emitterShape' values. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerPoint();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerLine();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerRectangle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerCuboid();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerCircle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerSphere();

    /**
     * `emitterMode' values. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerPoints();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOutline();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerSurface();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerVolume();

    /**
     * `renderMode' values. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerUnordered();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOldestFirst();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOldestLast();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerBackToFront();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerAdditive();

    /**
     * `type' values. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerAxial();

    /**
     * Timing function names. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionLinear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseInEaseOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionDefault();

    /**
     * `scrollMode' values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollVertically();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollHorizontally();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollBoth();

    /**
     * `fillRule' values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleNonZero();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleEvenOdd();

    /**
     * `lineJoin' values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinMiter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinRound();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinBevel();

    /**
     * `lineCap' values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapButt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapRound();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapSquare();

    /**
     * Truncation modes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationStart();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationEnd();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationMiddle();

    /**
     * Alignment modes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentNatural();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentCenter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentJustified();

    /**
     * Transaction property ids. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionAnimationDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionDisableActions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionAnimationTimingFunction();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionCompletionBlock();

    /**
     * The `rotateX', `rotateY', `rotateZ' functions take a single input
     * value in radians, and construct a 4x4 matrix representing the
     * corresponding rotation matrix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateX();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateY();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateZ();

    /**
     * The `scale' function takes three input values and constructs a
     * 4x4 matrix representing the corresponding scale matrix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScale();

    /**
     * The `scaleX', `scaleY', `scaleZ' functions take a single input value
     * and construct a 4x4 matrix representing the corresponding scaling
     * matrix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleX();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleY();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleZ();

    /**
     * The `translate' function takes three input values and constructs a
     * 4x4 matrix representing the corresponding scale matrix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslate();

    /**
     * The `translateX', `translateY', `translateZ' functions take a single
     * input value and construct a 4x4 matrix representing the corresponding
     * translation matrix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateX();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateY();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateZ();

    /**
     * Corner curve names. *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCACornerCurveCircular();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCACornerCurveContinuous();

    /**
     * Radial gradient. The gradient is defined as an ellipse with its
     * center at 'startPoint' and its width and height defined by
     * '(endPoint.x - startPoint.x) * 2' and '(endPoint.y - startPoint.y) *
     * 2' respectively.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerRadial();

    /**
     * Conic gradient. The gradient is centered at 'startPoint' and its 0-degrees
     * direction is defined by a vector spanned between 'startPoint' and
     * 'endPoint'. When 'startPoint' and 'endPoint' overlap the results are
     * undefined. The gradient's angle increases in the direction of rotation of
     * positive x-axis towards positive y-axis.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerConic();
}
