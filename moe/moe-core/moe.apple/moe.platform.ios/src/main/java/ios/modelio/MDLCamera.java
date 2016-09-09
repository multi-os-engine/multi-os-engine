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

package ios.modelio;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.scenekit.SCNCamera;
import ios.scenekit.SCNNode;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLCamera extends MDLObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MDLCamera(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MDLCamera alloc();

	/**
	 * apertureBladeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/apertureBladeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("apertureBladeCount")
	@NUInt
	public native long apertureBladeCount();

	/**
	 * barrelDistortion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/barrelDistortion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("barrelDistortion")
	public native float barrelDistortion();

	/**
	 * cameraWithSCNCamera:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/clm/MDLCamera/cameraWithSCNCamera:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cameraWithSCNCamera:")
	public static native MDLCamera cameraWithSCNCamera(SCNCamera scnCamera);

	/**
	 * chromaticAberration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/chromaticAberration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("chromaticAberration")
	public native float chromaticAberration();

	/**
	 * fStop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fStop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fStop")
	public native float fStop();

	/**
	 * farVisibilityDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/farVisibilityDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("farVisibilityDistance")
	public native float farVisibilityDistance();

	/**
	 * fieldOfView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fieldOfView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fieldOfView")
	public native float fieldOfView();

	/**
	 * fisheyeDistortion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fisheyeDistortion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fisheyeDistortion")
	public native float fisheyeDistortion();

	/**
	 * focalLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/focalLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("focalLength")
	public native float focalLength();

	/**
	 * focusDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/focusDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("focusDistance")
	public native float focusDistance();

	@Generated
	@Selector("init")
	public native MDLCamera init();

	/**
	 * maximumCircleOfConfusion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/maximumCircleOfConfusion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumCircleOfConfusion")
	public native float maximumCircleOfConfusion();

	/**
	 * nearVisibilityDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/nearVisibilityDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nearVisibilityDistance")
	public native float nearVisibilityDistance();

	@Generated
	@Selector("objectWithSCNNode:")
	public static native MDLCamera objectWithSCNNode(SCNNode scnNode);

	/**
	 * opticalVignetting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/opticalVignetting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("opticalVignetting")
	public native float opticalVignetting();

	/**
	 * sensorAspect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/sensorAspect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sensorAspect")
	public native float sensorAspect();

	/**
	 * sensorVerticalAperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/sensorVerticalAperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sensorVerticalAperture")
	public native float sensorVerticalAperture();

	/**
	 * apertureBladeCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/apertureBladeCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setApertureBladeCount:")
	public native void setApertureBladeCount(@NUInt long value);

	/**
	 * barrelDistortion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/barrelDistortion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBarrelDistortion:")
	public native void setBarrelDistortion(float value);

	/**
	 * chromaticAberration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/chromaticAberration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setChromaticAberration:")
	public native void setChromaticAberration(float value);

	/**
	 * fStop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fStop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFStop:")
	public native void setFStop(float value);

	/**
	 * farVisibilityDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/farVisibilityDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFarVisibilityDistance:")
	public native void setFarVisibilityDistance(float value);

	/**
	 * fieldOfView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fieldOfView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFieldOfView:")
	public native void setFieldOfView(float value);

	/**
	 * fisheyeDistortion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/fisheyeDistortion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFisheyeDistortion:")
	public native void setFisheyeDistortion(float value);

	/**
	 * focalLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/focalLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFocalLength:")
	public native void setFocalLength(float value);

	/**
	 * focusDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/focusDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFocusDistance:")
	public native void setFocusDistance(float value);

	/**
	 * maximumCircleOfConfusion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/maximumCircleOfConfusion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumCircleOfConfusion:")
	public native void setMaximumCircleOfConfusion(float value);

	/**
	 * nearVisibilityDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/nearVisibilityDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNearVisibilityDistance:")
	public native void setNearVisibilityDistance(float value);

	/**
	 * opticalVignetting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/opticalVignetting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOpticalVignetting:")
	public native void setOpticalVignetting(float value);

	/**
	 * sensorAspect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/sensorAspect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSensorAspect:")
	public native void setSensorAspect(float value);

	/**
	 * sensorVerticalAperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/sensorVerticalAperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSensorVerticalAperture:")
	public native void setSensorVerticalAperture(float value);

	/**
	 * shutterOpenInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/shutterOpenInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShutterOpenInterval:")
	public native void setShutterOpenInterval(double value);

	/**
	 * worldToMetersConversionScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/worldToMetersConversionScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWorldToMetersConversionScale:")
	public native void setWorldToMetersConversionScale(float value);

	/**
	 * shutterOpenInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/shutterOpenInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shutterOpenInterval")
	public native double shutterOpenInterval();

	/**
	 * worldToMetersConversionScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLCamera_Class/index.html#//apple_ref/occ/instp/MDLCamera/worldToMetersConversionScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("worldToMetersConversionScale")
	public native float worldToMetersConversionScale();

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
