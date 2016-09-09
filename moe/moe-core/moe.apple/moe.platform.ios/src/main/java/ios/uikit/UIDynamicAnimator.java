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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;
import ios.uikit.protocol.UIDynamicAnimatorDelegate;
import ios.uikit.protocol.UIDynamicItem;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * addBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/addBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addBehavior:")
	public native void addBehavior(UIDynamicBehavior behavior);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIDynamicAnimator alloc();

	/**
	 * behaviors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/behaviors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("behaviors")
	public native NSArray<? extends UIDynamicBehavior> behaviors();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIDynamicAnimatorDelegate delegate();

	/**
	 * elapsedTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/elapsedTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("elapsedTime")
	public native double elapsedTime();

	@Generated
	@Selector("init")
	public native UIDynamicAnimator init();

	/**
	 * initWithCollectionViewLayout:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/initWithCollectionViewLayout:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCollectionViewLayout:")
	public native UIDynamicAnimator initWithCollectionViewLayout(
			UICollectionViewLayout layout);

	/**
	 * initWithReferenceView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/initWithReferenceView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithReferenceView:")
	public native UIDynamicAnimator initWithReferenceView(UIView view);

	/**
	 * running</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/running">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRunning")
	public native boolean isRunning();

	/**
	 * itemsInRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/itemsInRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("itemsInRect:")
	public native NSArray<?> itemsInRect(@ByValue CGRect rect);

	/**
	 * layoutAttributesForCellAtIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/layoutAttributesForCellAtIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layoutAttributesForCellAtIndexPath:")
	public native UICollectionViewLayoutAttributes layoutAttributesForCellAtIndexPath(
			NSIndexPath indexPath);

	/**
	 * layoutAttributesForDecorationViewOfKind:atIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/layoutAttributesForDecorationViewOfKind:atIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layoutAttributesForDecorationViewOfKind:atIndexPath:")
	public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKindAtIndexPath(
			String decorationViewKind, NSIndexPath indexPath);

	/**
	 * layoutAttributesForSupplementaryViewOfKind:atIndexPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/layoutAttributesForSupplementaryViewOfKind:atIndexPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
	public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKindAtIndexPath(
			String kind, NSIndexPath indexPath);

	/**
	 * referenceView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/referenceView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("referenceView")
	public native UIView referenceView();

	/**
	 * removeAllBehaviors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/removeAllBehaviors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllBehaviors")
	public native void removeAllBehaviors();

	/**
	 * removeBehavior:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/removeBehavior:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeBehavior:")
	public native void removeBehavior(UIDynamicBehavior behavior);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UIDynamicAnimatorDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instp/UIDynamicAnimator/delegate">iOS Dev Center</a>
	 */
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
	 * updateItemUsingCurrentState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicAnimator_Class/index.html#//apple_ref/occ/instm/UIDynamicAnimator/updateItemUsingCurrentState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateItemUsingCurrentState:")
	public native void updateItemUsingCurrentState(
			@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
