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
    /**
     * collectionView:layout:insetForSectionAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:insetForSectionAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:insetForSectionAtIndex:")
    @ByValue
    default UIEdgeInsets collectionViewLayoutInsetForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:layout:minimumInteritemSpacingForSectionAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:minimumInteritemSpacingForSectionAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    @NFloat
    default double collectionViewLayoutMinimumInteritemSpacingForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:layout:minimumLineSpacingForSectionAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:minimumLineSpacingForSectionAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    @NFloat
    default double collectionViewLayoutMinimumLineSpacingForSectionAtIndex(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:layout:referenceSizeForFooterInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:referenceSizeForFooterInSection:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:referenceSizeForFooterInSection:")
    @ByValue
    default CGSize collectionViewLayoutReferenceSizeForFooterInSection(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:layout:referenceSizeForHeaderInSection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:referenceSizeForHeaderInSection:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:referenceSizeForHeaderInSection:")
    @ByValue
    default CGSize collectionViewLayoutReferenceSizeForHeaderInSection(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, @NInt long section) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * collectionView:layout:sizeForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewDelegateFlowLayout_protocol/index.html#//apple_ref/occ/intfm/UICollectionViewDelegateFlowLayout/collectionView:layout:sizeForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("collectionView:layout:sizeForItemAtIndexPath:")
    @ByValue
    default CGSize collectionViewLayoutSizeForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }
}
