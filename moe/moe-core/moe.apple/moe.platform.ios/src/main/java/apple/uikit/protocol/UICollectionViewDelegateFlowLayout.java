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

import apple.coregraphics.struct.CGSize;
import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionView;
import apple.uikit.UICollectionViewLayout;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDelegateFlowLayout")
public interface UICollectionViewDelegateFlowLayout extends UICollectionViewDelegate {
    @Generated
    @IsOptional
    @Selector("collectionView:layout:insetForSectionAtIndex:")
    @ByValue
    default UIEdgeInsets collectionViewLayoutInsetForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    @NFloat
    default double collectionViewLayoutMinimumInteritemSpacingForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    @NFloat
    default double collectionViewLayoutMinimumLineSpacingForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:layout:referenceSizeForFooterInSection:")
    @ByValue
    default CGSize collectionViewLayoutReferenceSizeForFooterInSection(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:layout:referenceSizeForHeaderInSection:")
    @ByValue
    default CGSize collectionViewLayoutReferenceSizeForHeaderInSection(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collectionView:layout:sizeForItemAtIndexPath:")
    @ByValue
    default CGSize collectionViewLayoutSizeForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }
}
