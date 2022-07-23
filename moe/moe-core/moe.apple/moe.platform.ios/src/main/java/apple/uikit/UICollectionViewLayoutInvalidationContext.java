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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewLayoutInvalidationContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewLayoutInvalidationContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewLayoutInvalidationContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewLayoutInvalidationContext allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UICollectionViewLayoutInvalidationContext new_objc();

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
     * delta to be applied to the collection view's current contentOffset - default is CGPointZero
     */
    @Generated
    @Selector("contentOffsetAdjustment")
    @ByValue
    public native CGPoint contentOffsetAdjustment();

    /**
     * delta to be applied to the current content size - default is CGSizeZero
     */
    @Generated
    @Selector("contentSizeAdjustment")
    @ByValue
    public native CGSize contentSizeAdjustment();

    @Generated
    @Selector("init")
    public native UICollectionViewLayoutInvalidationContext init();

    @Generated
    @Selector("interactiveMovementTarget")
    @ByValue
    public native CGPoint interactiveMovementTarget();

    /**
     * if YES, the layout should requery section and item counts from the collection view - set to YES when the
     * collection view is sent -reloadData and when items are inserted or deleted
     */
    @Generated
    @Selector("invalidateDataSourceCounts")
    public native boolean invalidateDataSourceCounts();

    @Generated
    @Selector("invalidateDecorationElementsOfKind:atIndexPaths:")
    public native void invalidateDecorationElementsOfKindAtIndexPaths(String elementKind,
            NSArray<? extends NSIndexPath> indexPaths);

    /**
     * set to YES when invalidation occurs because the collection view is sent -reloadData
     */
    @Generated
    @Selector("invalidateEverything")
    public native boolean invalidateEverything();

    @Generated
    @Selector("invalidateItemsAtIndexPaths:")
    public native void invalidateItemsAtIndexPaths(NSArray<? extends NSIndexPath> indexPaths);

    @Generated
    @Selector("invalidateSupplementaryElementsOfKind:atIndexPaths:")
    public native void invalidateSupplementaryElementsOfKindAtIndexPaths(String elementKind,
            NSArray<? extends NSIndexPath> indexPaths);

    /**
     * keys are element kind strings - values are NSArrays of NSIndexPaths
     */
    @Generated
    @Selector("invalidatedDecorationIndexPaths")
    public native NSDictionary<String, ? extends NSArray<? extends NSIndexPath>> invalidatedDecorationIndexPaths();

    @Generated
    @Selector("invalidatedItemIndexPaths")
    public native NSArray<? extends NSIndexPath> invalidatedItemIndexPaths();

    /**
     * keys are element kind strings - values are NSArrays of NSIndexPaths
     */
    @Generated
    @Selector("invalidatedSupplementaryIndexPaths")
    public native NSDictionary<String, ? extends NSArray<? extends NSIndexPath>> invalidatedSupplementaryIndexPaths();

    /**
     * index paths of moving items prior to the invalidation
     */
    @Generated
    @Selector("previousIndexPathsForInteractivelyMovingItems")
    public native NSArray<? extends NSIndexPath> previousIndexPathsForInteractivelyMovingItems();

    /**
     * delta to be applied to the collection view's current contentOffset - default is CGPointZero
     */
    @Generated
    @Selector("setContentOffsetAdjustment:")
    public native void setContentOffsetAdjustment(@ByValue CGPoint value);

    /**
     * delta to be applied to the current content size - default is CGSizeZero
     */
    @Generated
    @Selector("setContentSizeAdjustment:")
    public native void setContentSizeAdjustment(@ByValue CGSize value);

    /**
     * index paths of moved items following the invalidation
     */
    @Generated
    @Selector("targetIndexPathsForInteractivelyMovingItems")
    public native NSArray<? extends NSIndexPath> targetIndexPathsForInteractivelyMovingItems();
}
