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

package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.uikit.UIScrollView;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIScrollViewDelegate")
public interface UIScrollViewDelegate {
    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    default void scrollViewDidEndDecelerating(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    default void scrollViewDidEndDraggingWillDecelerate(UIScrollView scrollView, boolean decelerate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    default void scrollViewDidEndScrollingAnimation(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    default void scrollViewDidEndZoomingWithViewAtScale(UIScrollView scrollView, UIView view, @NFloat double scale) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    default void scrollViewDidScroll(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    default void scrollViewDidScrollToTop(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    default void scrollViewDidZoom(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    default boolean scrollViewShouldScrollToTop(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    default void scrollViewWillBeginDecelerating(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    default void scrollViewWillBeginDragging(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    default void scrollViewWillBeginZoomingWithView(UIScrollView scrollView, UIView view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    default void scrollViewWillEndDraggingWithVelocityTargetContentOffset(UIScrollView scrollView,
            @ByValue CGPoint velocity, CGPoint targetContentOffset) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    default UIView viewForZoomingInScrollView(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    default void scrollViewDidChangeAdjustedContentInset(UIScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
