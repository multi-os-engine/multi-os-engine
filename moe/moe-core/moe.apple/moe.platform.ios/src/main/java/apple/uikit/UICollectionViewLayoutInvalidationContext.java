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
public class UICollectionViewLayoutInvalidationContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewLayoutInvalidationContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewLayoutInvalidationContext alloc();

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
    @Selector("contentOffsetAdjustment")
    @ByValue
    public native CGPoint contentOffsetAdjustment();

    @Generated
    @Selector("contentSizeAdjustment")
    @ByValue
    public native CGSize contentSizeAdjustment();

    @Generated
    @Selector("init")
    public native UICollectionViewLayoutInvalidationContext init();

    @Generated
    @Selector("invalidateDataSourceCounts")
    public native boolean invalidateDataSourceCounts();

    @Generated
    @Selector("invalidateDecorationElementsOfKind:atIndexPaths:")
    public native void invalidateDecorationElementsOfKindAtIndexPaths(String elementKind,
            NSArray<? extends NSIndexPath> indexPaths);

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

    @Generated
    @Selector("invalidatedDecorationIndexPaths")
    public native NSDictionary<String, ? extends NSArray<? extends NSIndexPath>> invalidatedDecorationIndexPaths();

    @Generated
    @Selector("invalidatedItemIndexPaths")
    public native NSArray<? extends NSIndexPath> invalidatedItemIndexPaths();

    @Generated
    @Selector("invalidatedSupplementaryIndexPaths")
    public native NSDictionary<String, ? extends NSArray<? extends NSIndexPath>> invalidatedSupplementaryIndexPaths();

    @Generated
    @Selector("setContentOffsetAdjustment:")
    public native void setContentOffsetAdjustment(@ByValue CGPoint value);

    @Generated
    @Selector("setContentSizeAdjustment:")
    public native void setContentSizeAdjustment(@ByValue CGSize value);

    @Generated
    @Selector("interactiveMovementTarget")
    @ByValue
    public native CGPoint interactiveMovementTarget();

    @Generated
    @Selector("previousIndexPathsForInteractivelyMovingItems")
    public native NSArray<? extends NSIndexPath> previousIndexPathsForInteractivelyMovingItems();

    @Generated
    @Selector("targetIndexPathsForInteractivelyMovingItems")
    public native NSArray<? extends NSIndexPath> targetIndexPathsForInteractivelyMovingItems();
}
