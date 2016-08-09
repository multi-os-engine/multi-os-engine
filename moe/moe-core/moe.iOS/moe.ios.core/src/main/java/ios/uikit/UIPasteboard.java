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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSIndexSet;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
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
public class UIPasteboard extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected UIPasteboard(Pointer peer) {
		super(peer);
	}

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URL")
	public native NSURL URL();

	/**
	 * URLs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/URLs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLs")
	public native NSArray<? extends NSURL> URLs();

	/**
	 * addItems:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/addItems:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addItems:")
	public native void addItems(NSArray<? extends NSDictionary<String, ?>> items);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIPasteboard alloc();

	/**
	 * changeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/changeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changeCount")
	@NInt
	public native long changeCount();

	/**
	 * color</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/color">iOS Dev Center</a>
	 */
	@Generated
	@Selector("color")
	public native UIColor color();

	/**
	 * colors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/colors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colors")
	public native NSArray<? extends UIColor> colors();

	/**
	 * containsPasteboardTypes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/containsPasteboardTypes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsPasteboardTypes:")
	public native boolean containsPasteboardTypes(NSArray<String> pasteboardTypes);

	/**
	 * containsPasteboardTypes:inItemSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/containsPasteboardTypes:inItemSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsPasteboardTypes:inItemSet:")
	public native boolean containsPasteboardTypesInItemSet(
			NSArray<String> pasteboardTypes, NSIndexSet itemSet);

	/**
	 * dataForPasteboardType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/dataForPasteboardType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataForPasteboardType:")
	public native NSData dataForPasteboardType(String pasteboardType);

	/**
	 * dataForPasteboardType:inItemSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/dataForPasteboardType:inItemSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataForPasteboardType:inItemSet:")
	public native NSArray<?> dataForPasteboardTypeInItemSet(String pasteboardType,
			NSIndexSet itemSet);

	/**
	 * generalPasteboard</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/clm/UIPasteboard/generalPasteboard">iOS Dev Center</a>
	 */
	@Generated
	@Selector("generalPasteboard")
	public static native UIPasteboard generalPasteboard();

	/**
	 * image</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/image">iOS Dev Center</a>
	 */
	@Generated
	@Selector("image")
	public native UIImage image();

	/**
	 * images</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/images">iOS Dev Center</a>
	 */
	@Generated
	@Selector("images")
	public native NSArray<? extends UIImage> images();

	@Generated
	@Selector("init")
	public native UIPasteboard init();

	/**
	 * persistent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/persistent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPersistent")
	public native boolean isPersistent();

	/**
	 * itemSetWithPasteboardTypes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/itemSetWithPasteboardTypes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("itemSetWithPasteboardTypes:")
	public native NSIndexSet itemSetWithPasteboardTypes(NSArray<?> pasteboardTypes);

	/**
	 * items</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/items">iOS Dev Center</a>
	 */
	@Generated
	@Selector("items")
	public native NSArray<?> items();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * numberOfItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/numberOfItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfItems")
	@NInt
	public native long numberOfItems();

	/**
	 * pasteboardTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/pasteboardTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pasteboardTypes")
	public native NSArray<String> pasteboardTypes();

	/**
	 * pasteboardTypesForItemSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/pasteboardTypesForItemSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pasteboardTypesForItemSet:")
	public native NSArray<?> pasteboardTypesForItemSet(NSIndexSet itemSet);

	/**
	 * pasteboardWithName:create:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/clm/UIPasteboard/pasteboardWithName:create:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pasteboardWithName:create:")
	public static native UIPasteboard pasteboardWithNameCreate(
			String pasteboardName, boolean create);

	/**
	 * pasteboardWithUniqueName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/clm/UIPasteboard/pasteboardWithUniqueName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pasteboardWithUniqueName")
	public static native UIPasteboard pasteboardWithUniqueName();

	/**
	 * removePasteboardWithName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/clm/UIPasteboard/removePasteboardWithName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removePasteboardWithName:")
	public static native void removePasteboardWithName(String pasteboardName);

	/**
	 * color</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/color">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setColor:")
	public native void setColor(UIColor value);

	/**
	 * colors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/colors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setColors:")
	public native void setColors(NSArray<? extends UIColor> value);

	/**
	 * setData:forPasteboardType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/setData:forPasteboardType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setData:forPasteboardType:")
	public native void setDataForPasteboardType(NSData data,
			String pasteboardType);

	/**
	 * image</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/image">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImage:")
	public native void setImage(UIImage value);

	/**
	 * images</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/images">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImages:")
	public native void setImages(NSArray<? extends UIImage> value);

	/**
	 * items</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/items">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setItems:")
	public native void setItems(NSArray<?> value);

	/**
	 * persistent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/persistent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPersistent:")
	public native void setPersistent(boolean value);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setString:")
	public native void setString(String value);

	/**
	 * strings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/strings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStrings:")
	public native void setStrings(NSArray<String> value);

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	/**
	 * URLs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/URLs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURLs:")
	public native void setURLs(NSArray<? extends NSURL> value);

	/**
	 * setValue:forPasteboardType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/setValue:forPasteboardType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forPasteboardType:")
	public native void setValueForPasteboardType(
			@Mapped(ObjCObjectMapper.class) Object value, String pasteboardType);

	/**
	 * string</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/string">iOS Dev Center</a>
	 */
	@Generated
	@Selector("string")
	public native String string();

	/**
	 * strings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instp/UIPasteboard/strings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("strings")
	public native NSArray<String> strings();

	/**
	 * valueForPasteboardType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/valueForPasteboardType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForPasteboardType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForPasteboardType(String pasteboardType);

	/**
	 * valuesForPasteboardType:inItemSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPasteboard_Class/index.html#//apple_ref/occ/instm/UIPasteboard/valuesForPasteboardType:inItemSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valuesForPasteboardType:inItemSet:")
	public native NSArray<?> valuesForPasteboardTypeInItemSet(
			String pasteboardType, NSIndexSet itemSet);

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
