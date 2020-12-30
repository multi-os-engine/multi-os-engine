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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class SCNCapsule
 * @abstract SCNCapsule represents a capsule with controllable height and cap radius.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNCapsule extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCapsule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCapsule alloc();

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

    /**
     * @method capsuleWithCapRadius:height:
     * @abstract Creates and returns a capsule with given radius and height.
     * @param capRadius The radius of the capsule.
     * @param height The height of the capsule.
     */
    @Generated
    @Selector("capsuleWithCapRadius:height:")
    public static native SCNCapsule capsuleWithCapRadiusHeight(@NFloat double capRadius, @NFloat double height);

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
    @Selector("geometry")
    public static native SCNCapsule geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNCapsule geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNCapsule geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
            NSArray<? extends SCNGeometryElement> elements);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @property capRadius
     * @abstract The cap radius of the capsule. Animatable.
     * @discussion If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("capRadius")
    @NFloat
    public native double capRadius();

    /**
     * @property capSegmentCount
     * @abstract The number of subdivisions in the cap. Animatable.
     * @discussion If the value is less than 2, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("capSegmentCount")
    @NInt
    public native long capSegmentCount();

    /**
     * @property height
     * @abstract The height of the capsule. Animatable.
     * @discussion If the value is less than or equal to 0, the geometry is empty. The default value is 2.
     */
    @Generated
    @Selector("height")
    @NFloat
    public native double height();

    /**
     * @property heightSegmentCount
     * @abstract The number of subdivisions along the Y axis. Animatable.
     * @discussion If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("heightSegmentCount")
    @NInt
    public native long heightSegmentCount();

    @Generated
    @Selector("init")
    public native SCNCapsule init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCapsule initWithCoder(NSCoder coder);

    /**
     * @property radialSegmentCount
     * @abstract The number of subdivisions along the radial coordinate. Animatable.
     * @discussion If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("radialSegmentCount")
    @NInt
    public native long radialSegmentCount();

    /**
     * @property capRadius
     * @abstract The cap radius of the capsule. Animatable.
     * @discussion If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("setCapRadius:")
    public native void setCapRadius(@NFloat double value);

    /**
     * @property capSegmentCount
     * @abstract The number of subdivisions in the cap. Animatable.
     * @discussion If the value is less than 2, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("setCapSegmentCount:")
    public native void setCapSegmentCount(@NInt long value);

    /**
     * @property height
     * @abstract The height of the capsule. Animatable.
     * @discussion If the value is less than or equal to 0, the geometry is empty. The default value is 2.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NFloat double value);

    /**
     * @property heightSegmentCount
     * @abstract The number of subdivisions along the Y axis. Animatable.
     * @discussion If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@NInt long value);

    /**
     * @property radialSegmentCount
     * @abstract The number of subdivisions along the radial coordinate. Animatable.
     * @discussion If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("setRadialSegmentCount:")
    public native void setRadialSegmentCount(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
