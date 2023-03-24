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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNPyramid
 * 
 * SCNPyramid represents a right pyramid with a rectangular base.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPyramid extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPyramid(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPyramid alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNPyramid allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
    public static native SCNPyramid geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNPyramid geometryWithMDLMesh(@NotNull MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNPyramid geometryWithSourcesElements(@NotNull NSArray<? extends SCNGeometrySource> sources,
            @Nullable NSArray<? extends SCNGeometryElement> elements);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPyramid new_objc();

    /**
     * pyramidWithWidth:height:length:
     * 
     * Creates and returns a pyramid with given width, height, and length.
     * 
     * @param width  The width of the pyramid.
     * @param height The height of the pyramid.
     * @param length The length of the pyramid.
     */
    @Generated
    @Selector("pyramidWithWidth:height:length:")
    public static native SCNPyramid pyramidWithWidthHeightLength(@NFloat double width, @NFloat double height,
            @NFloat double length);

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
     * [@property] height
     * 
     * The height of the pyramid. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("height")
    @NFloat
    public native double height();

    /**
     * [@property] heightSegmentCount
     * 
     * The number of subdivisions along the Y axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("heightSegmentCount")
    @NInt
    public native long heightSegmentCount();

    @Generated
    @Selector("init")
    public native SCNPyramid init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPyramid initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] length
     * 
     * The length of the pyramid base. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("length")
    @NFloat
    public native double length();

    /**
     * [@property] lengthSegmentCount
     * 
     * The number of subdivisions along the Z axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("lengthSegmentCount")
    @NInt
    public native long lengthSegmentCount();

    /**
     * [@property] height
     * 
     * The height of the pyramid. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NFloat double value);

    /**
     * [@property] heightSegmentCount
     * 
     * The number of subdivisions along the Y axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@NInt long value);

    /**
     * [@property] length
     * 
     * The length of the pyramid base. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("setLength:")
    public native void setLength(@NFloat double value);

    /**
     * [@property] lengthSegmentCount
     * 
     * The number of subdivisions along the Z axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setLengthSegmentCount:")
    public native void setLengthSegmentCount(@NInt long value);

    /**
     * [@property] width
     * 
     * The width of the pyramid base. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NFloat double value);

    /**
     * [@property] widthSegmentCount
     * 
     * The number of subdivisions along the X axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setWidthSegmentCount:")
    public native void setWidthSegmentCount(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] width
     * 
     * The width of the pyramid base. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();

    /**
     * [@property] widthSegmentCount
     * 
     * The number of subdivisions along the X axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("widthSegmentCount")
    @NInt
    public native long widthSegmentCount();
}
