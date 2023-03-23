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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 6.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewLayout allocWithZone(VoidPtr zone);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * override this method to provide a custom class to be used for invalidation contexts
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("invalidationContextClass")
    public static native Class invalidationContextClass();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * override this method to provide a custom class to be used when instantiating instances of
     * UICollectionViewLayoutAttributes
     */
    @Generated
    @Selector("layoutAttributesClass")
    public static native Class layoutAttributesClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UICollectionViewLayout new_objc();

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

    /**
     * Methods in this class are meant to be overridden and will be called by its collection view to gather layout
     * information.
     * To get the truth on the current state of the collection view, call methods on UICollectionView rather than these.
     */
    @Generated
    @Selector("collectionView")
    public native UICollectionView collectionView();

    /**
     * Subclasses must override this method and use it to return the width and height of the collection view’s content.
     * These values represent the width and height of all the content, not just the content that is currently visible.
     * The collection view uses this information to configure its own content size to facilitate scrolling.
     */
    @Generated
    @Selector("collectionViewContentSize")
    @ByValue
    public native CGSize collectionViewContentSize();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

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

    /**
     * also called inside the animation block
     */
    @Generated
    @Selector("finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();

    /**
     * called inside an animation block after the update
     */
    @Generated
    @Selector("finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();

    /**
     * called inside an animation block after the transition
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("finalizeLayoutTransition")
    public native void finalizeLayoutTransition();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForDecorationViewOfKind(String elementKind);

    /**
     * These methods are called by collection view during an update block.
     * Return an array of index paths to indicate views that the layout is deleting or inserting in response to the
     * update.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToDeleteForSupplementaryViewOfKind(String elementKind);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForDecorationViewOfKind(String elementKind);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray<? extends NSIndexPath> indexPathsToInsertForSupplementaryViewOfKind(String elementKind);

    @Generated
    @Selector("init")
    public native UICollectionViewLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewLayout initWithCoder(NSCoder coder);

    @Generated
    @Selector("initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingDecorationElementOfKindAtIndexPath(
            String elementKind, NSIndexPath decorationIndexPath);

    /**
     * This set of methods is called when the collection view undergoes an animated transition such as a batch update
     * block or an animated bounds change.
     * For each element on screen before the invalidation, finalLayoutAttributesForDisappearingXXX will be called and an
     * animation setup from what is on screen to those final attributes.
     * For each element on screen after the invalidation, initialLayoutAttributesForAppearingXXX will be called and an
     * animation setup from those initial attributes to what ends up on screen.
     */
    @Generated
    @Selector("initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingItemAtIndexPath(
            NSIndexPath itemIndexPath);

    @Generated
    @Selector("initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingSupplementaryElementOfKindAtIndexPath(
            String elementKind, NSIndexPath elementIndexPath);

    /**
     * Call -invalidateLayout to indicate that the collection view needs to requery the layout information.
     * Subclasses must always call super if they override.
     */
    @Generated
    @Selector("invalidateLayout")
    public native void invalidateLayout();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("invalidateLayoutWithContext:")
    public native void invalidateLayoutWithContext(UICollectionViewLayoutInvalidationContext context);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForBoundsChange(
            @ByValue CGRect newBounds);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPaths:previousIndexPaths:movementCancelled:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForEndingInteractiveMovementOfItemsToFinalIndexPathsPreviousIndexPathsMovementCancelled(
            NSArray<? extends NSIndexPath> indexPaths, NSArray<? extends NSIndexPath> previousIndexPaths,
            boolean movementCancelled);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("invalidationContextForInteractivelyMovingItems:withTargetPosition:previousIndexPaths:previousPosition:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForInteractivelyMovingItemsWithTargetPositionPreviousIndexPathsPreviousPosition(
            NSArray<? extends NSIndexPath> targetIndexPaths, @ByValue CGPoint targetPosition,
            NSArray<? extends NSIndexPath> previousIndexPaths, @ByValue CGPoint previousPosition);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    @Generated
    @Selector("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
            String elementKind, NSIndexPath indexPath);

    /**
     * return an array layout attributes instances for all the views in the given rect
     */
    @Generated
    @Selector("layoutAttributesForElementsInRect:")
    public native NSArray<? extends UICollectionViewLayoutAttributes> layoutAttributesForElementsInRect(
            @ByValue CGRect rect);

    /**
     * API-Since: 9.0
     */
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

    /**
     * UICollectionView calls this when its bounds have changed inside an animation block before displaying cells in its
     * new bounds
     */
    @Generated
    @Selector("prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange(@ByValue CGRect oldBounds);

    /**
     * This method is called when there is an update with deletes/inserts to the collection view.
     * It will be called prior to calling the initial/final layout attribute methods below to give the layout an
     * opportunity to do batch computations for the insertion and deletion layout attributes.
     * The updateItems parameter is an array of UICollectionViewUpdateItem instances for each element that is moving to
     * a new index path.
     */
    @Generated
    @Selector("prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates(NSArray<? extends UICollectionViewUpdateItem> updateItems);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout(UICollectionViewLayout oldLayout);

    /**
     * UICollectionView calls this when prior the layout transition animation on the incoming and outgoing layout
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout(UICollectionViewLayout newLayout);

    /**
     * The collection view calls -prepareLayout once at its first layout as the first message to the layout instance.
     * The collection view calls -prepareLayout again after layout is invalidated and before requerying the layout
     * information.
     * Subclasses should always call super if they override.
     */
    @Generated
    @Selector("prepareLayout")
    public native void prepareLayout();

    @Generated
    @Selector("registerClass:forDecorationViewOfKind:")
    public native void registerClassForDecorationViewOfKind(Class viewClass, String elementKind);

    @Generated
    @Selector("registerNib:forDecorationViewOfKind:")
    public native void registerNibForDecorationViewOfKind(UINib nib, String elementKind);

    /**
     * return YES to cause the collection view to requery the layout for geometry information
     */
    @Generated
    @Selector("shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange(@ByValue CGRect newBounds);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:")
    public native boolean shouldInvalidateLayoutForPreferredLayoutAttributesWithOriginalAttributes(
            UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);

    /**
     * a layout can return the content offset to be applied during transition or update animations
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffset(@ByValue CGPoint proposedContentOffset);

    /**
     * return a point at which to rest after scrolling - for layouts that want snap-to-point scrolling behavior
     */
    @Generated
    @Selector("targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    @ByValue
    public native CGPoint targetContentOffsetForProposedContentOffsetWithScrollingVelocity(
            @ByValue CGPoint proposedContentOffset, @ByValue CGPoint velocity);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("targetIndexPathForInteractivelyMovingItem:withPosition:")
    public native NSIndexPath targetIndexPathForInteractivelyMovingItemWithPosition(NSIndexPath previousIndexPath,
            @ByValue CGPoint position);

    /**
     * Default implementation returns the layout direction of the main bundle's development region; FlowLayout returns
     * leftToRight. Subclasses may override this to specify the implementation-time layout direction of the layout.
     */
    @Generated
    @Selector("developmentLayoutDirection")
    @NInt
    public native long developmentLayoutDirection();

    /**
     * Base implementation returns false. If your subclass’s implementation overrides this property to return true, a
     * UICollectionView showing this layout will ensure its bounds.origin is always found at the leading edge, flipping
     * its coordinate system horizontally if necessary.
     */
    @Generated
    @Selector("flipsHorizontallyInOppositeLayoutDirection")
    public native boolean flipsHorizontallyInOppositeLayoutDirection();
}
