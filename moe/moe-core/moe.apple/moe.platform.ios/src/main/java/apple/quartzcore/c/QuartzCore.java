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
     * CACurrentMediaTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CACurrentMediaTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CACurrentMediaTime();

    /**
     * CATransform3DIsIdentity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DIsIdentity">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsIdentity(@ByValue CATransform3D t);

    /**
     * CATransform3DEqualToTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DEqualToTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DEqualToTransform(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * CATransform3DMakeTranslation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DMakeTranslation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeTranslation(@NFloat double tx, @NFloat double ty,
            @NFloat double tz);

    /**
     * CATransform3DMakeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DMakeScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeScale(@NFloat double sx, @NFloat double sy, @NFloat double sz);

    /**
     * CATransform3DMakeRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DMakeRotation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeRotation(@NFloat double angle, @NFloat double x,
            @NFloat double y, @NFloat double z);

    /**
     * CATransform3DTranslate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DTranslate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DTranslate(@ByValue CATransform3D t, @NFloat double tx,
            @NFloat double ty, @NFloat double tz);

    /**
     * CATransform3DScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DScale(@ByValue CATransform3D t, @NFloat double sx,
            @NFloat double sy, @NFloat double sz);

    /**
     * CATransform3DRotate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DRotate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DRotate(@ByValue CATransform3D t, @NFloat double angle,
            @NFloat double x, @NFloat double y, @NFloat double z);

    /**
     * CATransform3DConcat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DConcat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DConcat(@ByValue CATransform3D a, @ByValue CATransform3D b);

    /**
     * CATransform3DInvert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DInvert">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DInvert(@ByValue CATransform3D t);

    /**
     * CATransform3DMakeAffineTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DMakeAffineTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CATransform3D CATransform3DMakeAffineTransform(@ByValue CGAffineTransform m);

    /**
     * CATransform3DIsAffine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DIsAffine">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CATransform3DIsAffine(@ByValue CATransform3D t);

    /**
     * CATransform3DGetAffineTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreAnimation_functions/index.html#//apple_ref/c/func/CATransform3DGetAffineTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CATransform3DGetAffineTransform(@ByValue CATransform3D t);

    @Generated
    @CVariable()
    @ByValue
    public static native CATransform3D CATransform3DIdentity();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterNearest();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterLinear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFilterTrilinear();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderIn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAOnOrderOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCATransition();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAuto();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAAnimationRotateAutoReverse();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorWave();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorDrag();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorAlignToMotion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorValueOverLife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorColorOverLife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorLight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAEmitterBehaviorAttractor();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAGradientLayerAxial();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleNonZero();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAFillRuleEvenOdd();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionScale();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kCAValueFunctionTranslate();

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
}
