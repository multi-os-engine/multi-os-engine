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

import apple.quartzcore.struct.CAFrameRateRange;
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
import apple.corefoundation.struct.CGAffineTransform;
import org.jetbrains.annotations.NotNull;

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
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native double CACurrentMediaTime();

    /**
     * Returns true if 't' is the identity transform.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsIdentity(@ByValue CATransform3D t);

    /**
     * Returns true if 'a' is exactly equal to 'b'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DEqualToTransform(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * Returns a transform that translates by '(tx, ty, tz)':
     * t' = [1 0 0 0; 0 1 0 0; 0 0 1 0; tx ty tz 1].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeTranslation(@NFloat double tx, @NFloat double ty,
            @NFloat double tz);

    /**
     * Returns a transform that scales by `(sx, sy, sz)':
     * t' = [sx 0 0 0; 0 sy 0 0; 0 0 sz 0; 0 0 0 1].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeScale(@NFloat double sx, @NFloat double sy, @NFloat double sz);

    /**
     * Returns a transform that rotates by 'angle' radians about the vector
     * '(x, y, z)'. If the vector has length zero the identity transform is
     * returned.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeRotation(@NFloat double angle, @NFloat double x,
            @NFloat double y, @NFloat double z);

    /**
     * Translate 't' by '(tx, ty, tz)' and return the result:
     * t' = translate(tx, ty, tz) * t.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DTranslate(@ByValue CATransform3D t, @NFloat double tx,
            @NFloat double ty, @NFloat double tz);

    /**
     * Scale 't' by '(sx, sy, sz)' and return the result:
     * t' = scale(sx, sy, sz) * t.
     * 
     * API-Since: 2.0
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
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DRotate(@ByValue CATransform3D t, @NFloat double angle,
            @NFloat double x, @NFloat double y, @NFloat double z);

    /**
     * Concatenate 'b' to 'a' and return the result: t' = a * b.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DConcat(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * Invert 't' and return the result. Returns the original matrix if 't'
     * has no inverse.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DInvert(@ByValue CATransform3D t);

    /**
     * Return a transform with the same effect as affine transform 'm'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeAffineTransform(@ByValue CGAffineTransform m);

    /**
     * Returns true if 't' can be represented exactly by an affine transform.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsAffine(@ByValue CATransform3D t);

    /**
     * Returns the affine transform represented by 't'. If 't' can not be
     * represented exactly by an affine transform the returned value is
     * undefined.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CATransform3DGetAffineTransform(@ByValue CATransform3D t);

    /**
     * The identity transform: [1 0 0 0; 0 1 0 0; 0 0 1 0; 0 0 0 1].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CATransform3D CATransform3DIdentity();

    /**
     * `fillMode' options.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeForwards();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeBackwards();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeBoth();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillModeRemoved();

    /**
     * Layer `contentsGravity' values. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityCenter();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTop();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottom();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityLeft();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityRight();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTopLeft();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityTopRight();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottomLeft();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityBottomRight();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResize();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResizeAspect();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGravityResizeAspectFill();

    /**
     * RGBA UInt8 per component
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatRGBA8Uint();

    /**
     * RGBA half-float 16-bit per component
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatRGBA16Float();

    /**
     * Grayscale with alpha (if not opaque) UInt8 per component
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAContentsFormatGray8Uint();

    /**
     * Contents filter names. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterNearest();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterLinear();

    /**
     * Trilinear minification filter. Enables mipmap generation. Some
     * renderers may ignore this, or impose additional restrictions, such
     * as source images requiring power-of-two dimensions.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterTrilinear();

    /**
     * Layer event names. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderIn();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderOut();

    /**
     * The animation key used for transitions. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransition();

    /**
     * `calculationMode' strings.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationLinear();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationDiscrete();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationPaced();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationCubic();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationCubicPaced();

    /**
     * `rotationMode' strings.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAuto();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAutoReverse();

    /**
     * Common transition types.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFade();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionMoveIn();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionPush();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionReveal();

    /**
     * Common transition subtypes.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromRight();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromLeft();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromTop();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransitionFromBottom();

    /**
     * `emitterShape' values. *
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerPoint();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerLine();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerRectangle();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerCuboid();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerCircle();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerSphere();

    /**
     * `emitterMode' values. *
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerPoints();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOutline();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerSurface();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerVolume();

    /**
     * `renderMode' values. *
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerUnordered();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOldestFirst();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerOldestLast();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerBackToFront();

    /**
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterLayerAdditive();

    /**
     * `type' values. *
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerAxial();

    /**
     * Timing function names. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionLinear();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseIn();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseOut();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionEaseInEaseOut();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAMediaTimingFunctionDefault();

    /**
     * `scrollMode' values.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollNone();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollVertically();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollHorizontally();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAScrollBoth();

    /**
     * `fillRule' values.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleNonZero();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleEvenOdd();

    /**
     * `lineJoin' values.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinMiter();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinRound();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineJoinBevel();

    /**
     * `lineCap' values.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapButt();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapRound();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCALineCapSquare();

    /**
     * Truncation modes.
     * 
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationNone();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationStart();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationEnd();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATruncationMiddle();

    /**
     * Alignment modes.
     * 
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentNatural();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentLeft();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentRight();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentCenter();

    /**
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAlignmentJustified();

    /**
     * Transaction property ids. *
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionAnimationDuration();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionDisableActions();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionAnimationTimingFunction();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransactionCompletionBlock();

    /**
     * The `rotateX', `rotateY', `rotateZ' functions take a single input
     * value in radians, and construct a 4x4 matrix representing the
     * corresponding rotation matrix.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateX();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateY();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionRotateZ();

    /**
     * The `scale' function takes three input values and constructs a
     * 4x4 matrix representing the corresponding scale matrix.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScale();

    /**
     * The `scaleX', `scaleY', `scaleZ' functions take a single input value
     * and construct a 4x4 matrix representing the corresponding scaling
     * matrix.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleX();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleY();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScaleZ();

    /**
     * The `translate' function takes three input values and constructs a
     * 4x4 matrix representing the corresponding scale matrix.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslate();

    /**
     * The `translateX', `translateY', `translateZ' functions take a single
     * input value and construct a 4x4 matrix representing the corresponding
     * translation matrix.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateX();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateY();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslateZ();

    /**
     * Corner curve names. *
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCACornerCurveCircular();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCACornerCurveContinuous();

    /**
     * Radial gradient. The gradient is defined as an ellipse with its
     * center at 'startPoint' and its width and height defined by
     * '(endPoint.x - startPoint.x) * 2' and '(endPoint.y - startPoint.y) *
     * 2' respectively.
     * 
     * API-Since: 3.2
     */
    @NotNull
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
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerConic();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CAFrameRateRange CAFrameRateRangeMake(float minimum, float maximum, float preferred);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean CAFrameRateRangeIsEqualToRange(@ByValue CAFrameRateRange range,
            @ByValue CAFrameRateRange other);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CAFrameRateRange CAFrameRateRangeDefault();

    /**
     * The CGColorSpaceRef object defining the output color space.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCARendererColorSpace();

    /**
     * The Metal Command Queue object against which to submit work.
     * 
     * If the client provides a queue, then we will only commit our
     * command buffer and let the client handle it's own synchronization
     * and/or resource synchronization blits.
     * 
     * If none is provided, then we will use an internal queue which
     * automatically commits and waitUntilScheduled.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCARendererMetalCommandQueue();

    @Generated public static final double CA_WARN_DEPRECATED = 1.0;
}
