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


import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.uikit.protocol.UIAccessibilityIdentification;
import ios.uikit.protocol.UIAppearance;
import ios.uikit.struct.UIEdgeInsets;
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
public class UIBarItem extends NSObject implements NSCoding,
		UIAppearance, UIAccessibilityIdentification {
	static {
		NatJ.register();
	}

	@Generated
	protected UIBarItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessibilityIdentifier")
	public native String accessibilityIdentifier();

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIBarItem alloc();

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Deprecated
	@Generated
	@Variadic()
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Deprecated
	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Deprecated
	@Generated
	@Variadic()
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Deprecated
	@Generated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	/**
	 * image</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/image">iOS Dev Center</a>
	 */
	@Generated
	@Selector("image")
	public native UIImage image();

	/**
	 * imageInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/imageInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageInsets")
	@ByValue
	public native UIEdgeInsets imageInsets();

	@Generated
	@Selector("init")
	public native UIBarItem init();

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * landscapeImagePhone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/landscapeImagePhone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("landscapeImagePhone")
	public native UIImage landscapeImagePhone();

	/**
	 * landscapeImagePhoneInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/landscapeImagePhoneInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("landscapeImagePhoneInsets")
	@ByValue
	public native UIEdgeInsets landscapeImagePhoneInsets();

	@Generated
	@Selector("setAccessibilityIdentifier:")
	public native void setAccessibilityIdentifier(String value);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * image</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/image">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImage:")
	public native void setImage(UIImage value);

	/**
	 * imageInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/imageInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImageInsets:")
	public native void setImageInsets(@ByValue UIEdgeInsets value);

	/**
	 * landscapeImagePhone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/landscapeImagePhone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLandscapeImagePhone:")
	public native void setLandscapeImagePhone(UIImage value);

	/**
	 * landscapeImagePhoneInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/landscapeImagePhoneInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLandscapeImagePhoneInsets:")
	public native void setLandscapeImagePhoneInsets(@ByValue UIEdgeInsets value);

	/**
	 * tag</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/tag">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTag:")
	public native void setTag(@NInt long value);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	/**
	 * setTitleTextAttributes:forState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instm/UIBarItem/setTitleTextAttributes:forState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitleTextAttributes:forState:")
	public native void setTitleTextAttributesForState(NSDictionary<String, ?> attributes,
			@NUInt long state);

	/**
	 * tag</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/tag">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tag")
	@NInt
	public native long tag();

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instp/UIBarItem/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

	/**
	 * titleTextAttributesForState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIBarItem_Class/index.html#//apple_ref/occ/instm/UIBarItem/titleTextAttributesForState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titleTextAttributesForState:")
	public native NSDictionary<String, ?> titleTextAttributesForState(@NUInt long state);

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
			NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("initWithCoder:")
	public native UIBarItem initWithCoder(NSCoder aDecoder);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
