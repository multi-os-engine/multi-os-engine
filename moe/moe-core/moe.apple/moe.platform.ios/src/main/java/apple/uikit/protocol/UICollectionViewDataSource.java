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

import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionReusableView;
import apple.uikit.UICollectionView;
import apple.uikit.UICollectionViewCell;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDataSource")
public interface UICollectionViewDataSource {
    @Generated
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    default boolean collectionViewCanMoveItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    UICollectionViewCell collectionViewCellForItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:moveItemAtIndexPath:toIndexPath:")
    default void collectionViewMoveItemAtIndexPathToIndexPath(UICollectionView collectionView,
            NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("collectionView:numberOfItemsInSection:")
    @NInt
    long collectionViewNumberOfItemsInSection(UICollectionView collectionView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    default UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            UICollectionView collectionView, String kind, NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    default long numberOfSectionsInCollectionView(UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
