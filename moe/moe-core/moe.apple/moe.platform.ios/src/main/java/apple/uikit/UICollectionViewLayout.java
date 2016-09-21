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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewLayout alloc();

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
    @Selector("invalidationContextClass")
    public static native Class invalidationContextClass();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layoutAttributesClass")
    public static native Class layoutAttributesClass();

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

    @Generated
    @Selector("collectionView")
    public native UICollectionView collectionView();

    @Generated
    @Selector("collectionViewContentSize")
    @ByValue
    public native CGSize collectionViewContentSize();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingDecorationElementOfKindAtIndexPath(
            String elementKind, NSIndexPath decorationIndexPath);

    @Generated
    @Selector("finalLayoutAttributesForDisappearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingItemAtIndexPath(
            NSIndexPath itemIndexPath);

    @Generated
    @Selector("finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingSupplementaryElementOfKindAtIndexPath(
            String elementKind, NSIndexPath elementIndexPath);

    @Generated
    @Selector("finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();

    @Generated
    @Selector("finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();

    @Generated
    @Selector("finalizeLayoutTransition")
    public native void finalizeLayoutTransition();

    @Generated
    @Selector("indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForDecorationViewOfKind(String elementKind);

    @Generated
    @Selector("indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForSupplementaryViewOfKind(String elementKind);

    @Generated
    @Selector("indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForDecorationViewOfKind(String elementKind);

    @Generated
    @Selector("indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForSupplementaryViewOfKind(String elementKind);

    @Generated
    @Selector("init")
    public native UICollectionViewLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewLayout initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingDecorationElementOfKindAtIndexPath(
            String elementKind, NSIndexPath decorationIndexPath);

    @Generated
    @Selector("initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingItemAtIndexPath(
            NSIndexPath itemIndexPath);

    @Generated
    @Selector("initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingSupplementaryElementOfKindAtIndexPath(
            String elementKind, NSIndexPath elementIndexPath);

    @Generated
    @Selector("invalidateLayout")
    public native void invalidateLayout();

    @Generated
    @Selector("invalidateLayoutWithContext:")
    public native void invalidateLayoutWithContext(UICollectionViewLayoutInvalidationContext context);

    @Generated
    @Selector("invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForBoundsChange(
            @ByValue CGRect newBounds);

    @Generated
    @Selector("invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPaths:previousIndexPaths:movementCancelled:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPathsPreviousIndexPathsMovementCancelled(
            NSArray<? extends NSIndexPath> indexPaths, NSArray<? extends NSIndexPath> previousIndexPaths,
            boolean movementCancelled);

    @Generated
    @Selector("invalidationContextForInteractivelyMovingItems:withTargetPosition:previousIndexPaths:previousPosition:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForInteractivelyMovingItemsWithTargetPositionPreviousIndexPathsPreviousPosition(
            NSArray<? extends NSIndexPath> targetIndexPaths, @ByValue CGPoint targetPosition,
            NSArray<? extends NSIndexPath> previousIndexPaths, @ByValue CGPoint previousPosition);

    @Generated
    @Selector("invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    @Generated
    @Selector("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
            String elementKind, NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForElementsInRect:")
    public native NSArray<? extends UICollectionViewLayoutAttributes> layoutAttributesForElementsInRect(
            @ByValue CGRect rect);

    @Generated
    @Selector("layoutAttributesForInteractivelyMovingItemAtIndexPath:withTargetPosition:")
    public native UICollectionViewLayoutAttributes layoutAttributesForInteractivelyMovingItemAtIndexPathWithTargetPosition(
            NSIndexPath indexPath, @ByValue CGPoint position);

    @Generated
    @Selector("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath(NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindAtIndexPath(
            String elementKind, NSIndexPath indexPath);

    @Generated
    @Selector("prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange(@ByValue CGRect oldBounds);

    @Generated
    @Selector("prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates(NSArray<? extends UICollectionViewUpdateItem> updateItems);

    @Generated
    @Selector("prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout(UICollectionViewLayout oldLayout);

    @Generated
    @Selector("prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout(UICollectionViewLayout newLayout);

    @Generated
    @Selector("prepareLayout")
    public native void prepareLayout();

    @Generated
    @Selector("registerClass:forDecorationViewOfKind:")
    public native void registerClassForDecorationViewOfKind(Class viewClass, String elementKind);

    @Generated
    @Selector("registerNib:forDecorationViewOfKind:")
    public native void registerNibForDecorationViewOfKind(UINib nib, String elementKind);

    @Generated
    @Selector("shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange(@ByValue CGRect newBounds);

    @Generated
    @Selector("shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:")
    public native boolean shouldInvalidateLayoutForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffset(@ByValue CGPoint proposedContentOffset);

    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffsetWithScrollingVelocity(
            @ByValue CGPoint proposedContentOffset, @ByValue CGPoint velocity);

    @Generated
    @Selector("targetIndexPathForInteractivelyMovingItem:withPosition:")
    public native NSIndexPath targetIndexPathForInteractivelyMovingItemWithPosition(NSIndexPath previousIndexPath,
            @ByValue CGPoint position);
}
