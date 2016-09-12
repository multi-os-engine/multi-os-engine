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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutConstraint extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLayoutConstraint(Pointer peer) {
		super(peer);
	}

	/**
	 * activateConstraints:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/clm/NSLayoutConstraint/activateConstraints:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activateConstraints:")
	public static native void activateConstraints(NSArray<? extends NSLayoutConstraint> constraints);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLayoutConstraint alloc();

	/**
	 * constant</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/constant">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constant")
	@NFloat
	public native double constant();

	/**
	 * constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/clm/NSLayoutConstraint/constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
	public static native NSLayoutConstraint constraintWithItemAttributeRelatedByToItemAttributeMultiplierConstant(
			@Mapped(ObjCObjectMapper.class) Object view1, @NInt long attr1,
			@NInt long relation, @Mapped(ObjCObjectMapper.class) Object view2,
			@NInt long attr2, @NFloat double multiplier, @NFloat double c);

	/**
	 * constraintsWithVisualFormat:options:metrics:views:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/clm/NSLayoutConstraint/constraintsWithVisualFormat:options:metrics:views:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constraintsWithVisualFormat:options:metrics:views:")
	public static native NSArray<? extends NSLayoutConstraint> constraintsWithVisualFormatOptionsMetricsViews(
			String format, @NUInt long opts, NSDictionary<String, ?> metrics,
			NSDictionary<String, ?> views);

	/**
	 * deactivateConstraints:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/clm/NSLayoutConstraint/deactivateConstraints:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deactivateConstraints:")
	public static native void deactivateConstraints(NSArray<? extends NSLayoutConstraint> constraints);

	/**
	 * firstAttribute</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/firstAttribute">iOS Dev Center</a>
	 */
	@Generated
	@Selector("firstAttribute")
	@NInt
	public native long firstAttribute();

	/**
	 * firstItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/firstItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("firstItem")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object firstItem();

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSLayoutConstraint init();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isActive")
	public native boolean isActive();

	/**
	 * multiplier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/multiplier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("multiplier")
	@NFloat
	public native double multiplier();

	/**
	 * priority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/priority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("priority")
	public native float priority();

	/**
	 * relation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/relation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("relation")
	@NInt
	public native long relation();

	/**
	 * secondAttribute</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/secondAttribute">iOS Dev Center</a>
	 */
	@Generated
	@Selector("secondAttribute")
	@NInt
	public native long secondAttribute();

	/**
	 * secondItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/secondItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("secondItem")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object secondItem();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:")
	public native void setActive(boolean value);

	/**
	 * constant</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/constant">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setConstant:")
	public native void setConstant(@NFloat double value);

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	/**
	 * priority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/priority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPriority:")
	public native void setPriority(float value);

	/**
	 * shouldBeArchived</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/shouldBeArchived">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldBeArchived:")
	public native void setShouldBeArchived(boolean value);

	/**
	 * shouldBeArchived</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AppKit/Reference/NSLayoutConstraint_Class/index.html#//apple_ref/occ/instp/NSLayoutConstraint/shouldBeArchived">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldBeArchived")
	public native boolean shouldBeArchived();

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
