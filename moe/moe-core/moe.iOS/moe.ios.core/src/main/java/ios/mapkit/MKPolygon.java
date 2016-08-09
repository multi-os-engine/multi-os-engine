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

package ios.mapkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.foundation.NSArray;
import ios.mapkit.protocol.MKOverlay;
import ios.mapkit.struct.MKMapPoint;
import ios.mapkit.struct.MKMapRect;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKPolygon extends MKMultiPoint implements MKOverlay {
	static {
		NatJ.register();
	}

	@Generated
	protected MKPolygon(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MKPolygon alloc();

	@Generated
	@Selector("boundingMapRect")
	@ByValue
	public native MKMapRect boundingMapRect();

	@Generated
	@IsOptional
	@Selector("canReplaceMapContent")
	public native boolean canReplaceMapContent();

	@Generated
	@Selector("coordinate")
	@ByValue
	public native CLLocationCoordinate2D coordinate();

	@Generated
	@Selector("init")
	public native MKPolygon init();

	/**
	 * interiorPolygons</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKPolygon_class/index.html#//apple_ref/occ/instp/MKPolygon/interiorPolygons">iOS Dev Center</a>
	 */
	@Generated
	@Selector("interiorPolygons")
	public native NSArray<? extends MKPolygon> interiorPolygons();

	@Generated
	@IsOptional
	@Selector("intersectsMapRect:")
	public native boolean intersectsMapRect(@ByValue MKMapRect mapRect);

	/**
	 * polygonWithCoordinates:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKPolygon_class/index.html#//apple_ref/occ/clm/MKPolygon/polygonWithCoordinates:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("polygonWithCoordinates:count:")
	public static native MKPolygon polygonWithCoordinatesCount(
			Ptr<CLLocationCoordinate2D> coords,
			@NUInt long count);

	/**
	 * polygonWithCoordinates:count:interiorPolygons:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKPolygon_class/index.html#//apple_ref/occ/clm/MKPolygon/polygonWithCoordinates:count:interiorPolygons:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("polygonWithCoordinates:count:interiorPolygons:")
	public static native MKPolygon polygonWithCoordinatesCountInteriorPolygons(
			Ptr<CLLocationCoordinate2D> coords,
			@NUInt long count, NSArray<? extends MKPolygon> interiorPolygons);

	/**
	 * polygonWithPoints:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKPolygon_class/index.html#//apple_ref/occ/clm/MKPolygon/polygonWithPoints:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("polygonWithPoints:count:")
	public static native MKPolygon polygonWithPointsCount(
			Ptr<MKMapPoint> points,
			@NUInt long count);

	/**
	 * polygonWithPoints:count:interiorPolygons:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKPolygon_class/index.html#//apple_ref/occ/clm/MKPolygon/polygonWithPoints:count:interiorPolygons:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("polygonWithPoints:count:interiorPolygons:")
	public static native MKPolygon polygonWithPointsCountInteriorPolygons(
			Ptr<MKMapPoint> points,
			@NUInt long count, NSArray<? extends MKPolygon> interiorPolygons);

	@Generated
	@IsOptional
	@Selector("setCoordinate:")
	public native void setCoordinate(
			@ByValue CLLocationCoordinate2D newCoordinate);

	@Generated
	@IsOptional
	@Selector("subtitle")
	public native String subtitle();

	@Generated
	@IsOptional
	@Selector("title")
	public native String title();

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
