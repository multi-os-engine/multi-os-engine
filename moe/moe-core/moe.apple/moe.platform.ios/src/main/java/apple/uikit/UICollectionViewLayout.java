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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
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
public class UICollectionViewLayout extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewLayout alloc();

    /**
     * invalidationContextClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/clm/UICollectionViewLayout/invalidationContextClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidationContextClass")
    public static native Class invalidationContextClass();

    /**
     * layoutAttributesClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/clm/UICollectionViewLayout/layoutAttributesClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesClass")
    public static native Class layoutAttributesClass();

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
    public static native void load_objc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();

    /**
     * collectionView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instp/UICollectionViewLayout/collectionView">iOS Dev Center</a>
     */
    @Generated
    @Selector("collectionView")
    public native UICollectionView collectionView();

    /**
     * collectionViewContentSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/collectionViewContentSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("collectionViewContentSize")
    @ByValue
    public native CGSize collectionViewContentSize();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingDecorationElementOfKindAtIndexPath(
            String elementKind, NSIndexPath decorationIndexPath);

    /**
     * finalLayoutAttributesForDisappearingItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalLayoutAttributesForDisappearingItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalLayoutAttributesForDisappearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingItemAtIndexPath(
            NSIndexPath itemIndexPath);

    /**
     * finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingSupplementaryElementOfKindAtIndexPath(
            String elementKind, NSIndexPath elementIndexPath);

    /**
     * finalizeAnimatedBoundsChange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalizeAnimatedBoundsChange">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();

    /**
     * finalizeCollectionViewUpdates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalizeCollectionViewUpdates">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();

    /**
     * finalizeLayoutTransition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/finalizeLayoutTransition">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalizeLayoutTransition")
    public native void finalizeLayoutTransition();

    /**
     * indexPathsToDeleteForDecorationViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/indexPathsToDeleteForDecorationViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForDecorationViewOfKind(String elementKind);

    /**
     * indexPathsToDeleteForSupplementaryViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/indexPathsToDeleteForSupplementaryViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForSupplementaryViewOfKind(String elementKind);

    /**
     * indexPathsToInsertForDecorationViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/indexPathsToInsertForDecorationViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForDecorationViewOfKind(String elementKind);

    /**
     * indexPathsToInsertForSupplementaryViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/indexPathsToInsertForSupplementaryViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForSupplementaryViewOfKind(String elementKind);

    @Generated
    @Selector("init")
    public native UICollectionViewLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewLayout initWithCoder(NSCoder aDecoder);

    /**
     * initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingDecorationElementOfKindAtIndexPath(
            String elementKind, NSIndexPath decorationIndexPath);

    /**
     * initialLayoutAttributesForAppearingItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/initialLayoutAttributesForAppearingItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingItemAtIndexPath(
            NSIndexPath itemIndexPath);

    /**
     * initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingSupplementaryElementOfKindAtIndexPath(
            String elementKind, NSIndexPath elementIndexPath);

    /**
     * invalidateLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidateLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateLayout")
    public native void invalidateLayout();

    /**
     * invalidateLayoutWithContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidateLayoutWithContext:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateLayoutWithContext:")
    public native void invalidateLayoutWithContext(UICollectionViewLayoutInvalidationContext context);

    /**
     * invalidationContextForBoundsChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidationContextForBoundsChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForBoundsChange(
            @ByValue CGRect newBounds);

    /**
     * invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    /**
     * layoutAttributesForDecorationViewOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/layoutAttributesForDecorationViewOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
            String elementKind, NSIndexPath indexPath);

    /**
     * layoutAttributesForElementsInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/layoutAttributesForElementsInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForElementsInRect:")
    public native NSArray<? extends UICollectionViewLayoutAttributes> layoutAttributesForElementsInRect(
            @ByValue CGRect rect);

    /**
     * layoutAttributesForItemAtIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/layoutAttributesForItemAtIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath(NSIndexPath indexPath);

    /**
     * layoutAttributesForSupplementaryViewOfKind:atIndexPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/layoutAttributesForSupplementaryViewOfKind:atIndexPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindAtIndexPath(
            String elementKind, NSIndexPath indexPath);

    /**
     * prepareForAnimatedBoundsChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/prepareForAnimatedBoundsChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange(@ByValue CGRect oldBounds);

    /**
     * prepareForCollectionViewUpdates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/prepareForCollectionViewUpdates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates(NSArray<? extends UICollectionViewUpdateItem> updateItems);

    /**
     * prepareForTransitionFromLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/prepareForTransitionFromLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout(UICollectionViewLayout oldLayout);

    /**
     * prepareForTransitionToLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/prepareForTransitionToLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout(UICollectionViewLayout newLayout);

    /**
     * prepareLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/prepareLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareLayout")
    public native void prepareLayout();

    /**
     * registerClass:forDecorationViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/registerClass:forDecorationViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerClass:forDecorationViewOfKind:")
    public native void registerClassForDecorationViewOfKind(Class viewClass, String elementKind);

    /**
     * registerNib:forDecorationViewOfKind:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/registerNib:forDecorationViewOfKind:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerNib:forDecorationViewOfKind:")
    public native void registerNibForDecorationViewOfKind(UINib nib, String elementKind);

    /**
     * shouldInvalidateLayoutForBoundsChange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/shouldInvalidateLayoutForBoundsChange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange(@ByValue CGRect newBounds);

    /**
     * shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:")
    public native boolean shouldInvalidateLayoutForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    /**
     * targetContentOffsetForProposedContentOffset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/targetContentOffsetForProposedContentOffset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffset(@ByValue CGPoint proposedContentOffset);

    /**
     * targetContentOffsetForProposedContentOffset:withScrollingVelocity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/targetContentOffsetForProposedContentOffset:withScrollingVelocity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffsetWithScrollingVelocity(
            @ByValue CGPoint proposedContentOffset, @ByValue CGPoint velocity);

    /**
     * invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPaths:previousIndexPaths:movementCancelled:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPaths:previousIndexPaths:movementCancelled:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPaths:previousIndexPaths:movementCancelled:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPathsPreviousIndexPathsMovementCancelled(
            NSArray<? extends NSIndexPath> indexPaths, NSArray<? extends NSIndexPath> previousIndexPaths,
            boolean movementCancelled);

    /**
     * invalidationContextForInteractivelyMovingItems:withTargetPosition:previousIndexPaths:previousPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/invalidationContextForInteractivelyMovingItems:withTargetPosition:previousIndexPaths:previousPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidationContextForInteractivelyMovingItems:withTargetPosition:previousIndexPaths:previousPosition:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForInteractivelyMovingItemsWithTargetPositionPreviousIndexPathsPreviousPosition(
            NSArray<? extends NSIndexPath> targetIndexPaths, @ByValue CGPoint targetPosition,
            NSArray<? extends NSIndexPath> previousIndexPaths, @ByValue CGPoint previousPosition);

    /**
     * layoutAttributesForInteractivelyMovingItemAtIndexPath:withTargetPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/layoutAttributesForInteractivelyMovingItemAtIndexPath:withTargetPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutAttributesForInteractivelyMovingItemAtIndexPath:withTargetPosition:")
    public native UICollectionViewLayoutAttributes layoutAttributesForInteractivelyMovingItemAtIndexPathWithTargetPosition(
            NSIndexPath indexPath, @ByValue CGPoint position);

    /**
     * targetIndexPathForInteractivelyMovingItem:withPosition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollectionViewLayout_class/index.html#//apple_ref/occ/instm/UICollectionViewLayout/targetIndexPathForInteractivelyMovingItem:withPosition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetIndexPathForInteractivelyMovingItem:withPosition:")
    public native NSIndexPath targetIndexPathForInteractivelyMovingItemWithPosition(NSIndexPath previousIndexPath,
            @ByValue CGPoint position);
}
