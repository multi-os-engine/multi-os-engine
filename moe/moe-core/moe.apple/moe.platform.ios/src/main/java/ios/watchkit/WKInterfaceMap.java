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

package ios.watchkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGPoint;
import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.mapkit.struct.MKCoordinateRegion;
import ios.mapkit.struct.MKMapRect;
import ios.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("WatchKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKInterfaceMap extends WKInterfaceObject {
	static {
		NatJ.register();
	}

	@Generated
	protected WKInterfaceMap(Pointer peer) {
		super(peer);
	}

	/**
	 * addAnnotation:withImage:centerOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/addAnnotation:withImage:centerOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnnotation:withImage:centerOffset:")
	public native void addAnnotationWithImageCenterOffset(
			@ByValue CLLocationCoordinate2D location, UIImage image,
			@ByValue CGPoint offset);

	/**
	 * addAnnotation:withImageNamed:centerOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/addAnnotation:withImageNamed:centerOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnnotation:withImageNamed:centerOffset:")
	public native void addAnnotationWithImageNamedCenterOffset(
			@ByValue CLLocationCoordinate2D location, String name,
			@ByValue CGPoint offset);

	/**
	 * addAnnotation:withPinColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/addAnnotation:withPinColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnnotation:withPinColor:")
	public native void addAnnotationWithPinColor(
			@ByValue CLLocationCoordinate2D location, @NInt long pinColor);

	@Generated
	@Owned
	@Selector("alloc")
	public static native WKInterfaceMap alloc();

	@Generated
	@Selector("init")
	public native WKInterfaceMap init();

	/**
	 * removeAllAnnotations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/removeAllAnnotations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllAnnotations")
	public native void removeAllAnnotations();

	/**
	 * setRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/setRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRegion:")
	public native void setRegion(@ByValue MKCoordinateRegion coordinateRegion);

	/**
	 * setVisibleMapRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceMap_class/index.html#//apple_ref/occ/instm/WKInterfaceMap/setVisibleMapRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVisibleMapRect:")
	public native void setVisibleMapRect(@ByValue MKMapRect mapRect);

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
