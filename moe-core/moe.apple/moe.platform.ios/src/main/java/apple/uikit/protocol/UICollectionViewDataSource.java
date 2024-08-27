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

import apple.foundation.NSArray;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollectionViewDataSource")
public interface UICollectionViewDataSource {
    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    default boolean collectionViewCanMoveItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The cell that is returned must be retrieved from a call to -dequeueReusableCellWithReuseIdentifier:forIndexPath:
     */
    @NotNull
    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    UICollectionViewCell collectionViewCellForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    /**
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:moveItemAtIndexPath:toIndexPath:")
    default void collectionViewMoveItemAtIndexPathToIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath sourceIndexPath, @NotNull NSIndexPath destinationIndexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("collectionView:numberOfItemsInSection:")
    @NInt
    long collectionViewNumberOfItemsInSection(@NotNull UICollectionView collectionView, @NInt long section);

    /**
     * The view that is returned must be retrieved from a call to
     * -dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    default UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull String kind, @NotNull NSIndexPath indexPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    default long numberOfSectionsInCollectionView(@NotNull UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the index path that corresponds to the given title / index. (e.g. "B",1)
     * Return an index path with a single index to indicate an entire section, instead of a specific item.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:indexPathForIndexTitle:atIndex:")
    default NSIndexPath collectionViewIndexPathForIndexTitleAtIndex(@NotNull UICollectionView collectionView,
            @NotNull String title, @NInt long index) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a list of index titles to display in the index view (e.g. ["A", "B", "C" ... "Z", "#"])
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("indexTitlesForCollectionView:")
    default NSArray<String> indexTitlesForCollectionView(@NotNull UICollectionView collectionView) {
        throw new java.lang.UnsupportedOperationException();
    }
}
