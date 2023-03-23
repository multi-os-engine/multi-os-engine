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
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicAnimatorDelegate;
import apple.uikit.protocol.UIDynamicItem;
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
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDynamicAnimator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDynamicAnimator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDynamicAnimator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDynamicAnimator allocWithZone(VoidPtr zone);

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
    public static native UIDynamicAnimator new_objc();

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
    @Selector("addBehavior:")
    public native void addBehavior(UIDynamicBehavior behavior);

    @Generated
    @Selector("behaviors")
    public native NSArray<? extends UIDynamicBehavior> behaviors();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIDynamicAnimatorDelegate delegate();

    @Generated
    @Selector("elapsedTime")
    public native double elapsedTime();

    @Generated
    @Selector("init")
    public native UIDynamicAnimator init();

    /**
     * When you initialize a dynamic animator with this method, you should only associate collection view layout
     * attributes with your behaviors.
     * The animator will employ the collection view layout’s content size coordinate system.
     */
    @Generated
    @Selector("initWithCollectionViewLayout:")
    public native UIDynamicAnimator initWithCollectionViewLayout(UICollectionViewLayout layout);

    /**
     * When you initialize a dynamic animator with this method, you should only associates views with your behaviors.
     * the behaviors (and their dynamic items) that you add to the animator employ the reference view’s coordinate
     * system.
     */
    @Generated
    @Selector("initWithReferenceView:")
    public native UIDynamicAnimator initWithReferenceView(UIView view);

    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * Returns the dynamic items associated with the animator’s behaviors that intersect a specified rectangle
     */
    @Generated
    @Selector("itemsInRect:")
    public native NSArray<?> itemsInRect(@ByValue CGRect rect);

    /**
     * The three convenience methods returning layout attributes (if associated to behaviors in the animator) if the
     * animator was configured with collection view layout
     */
    @Generated
    @Selector("layoutAttributesForCellAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForCellAtIndexPath(NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
            String decorationViewKind, NSIndexPath indexPath);

    @Generated
    @Selector("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindAtIndexPath(String kind,
            NSIndexPath indexPath);

    @Generated
    @Selector("referenceView")
    public native UIView referenceView();

    @Generated
    @Selector("removeAllBehaviors")
    public native void removeAllBehaviors();

    @Generated
    @Selector("removeBehavior:")
    public native void removeBehavior(UIDynamicBehavior behavior);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIDynamicAnimatorDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIDynamicAnimatorDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Update the item state in the animator if an external change was made to this item
     */
    @Generated
    @Selector("updateItemUsingCurrentState:")
    public native void updateItemUsingCurrentState(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);
}
