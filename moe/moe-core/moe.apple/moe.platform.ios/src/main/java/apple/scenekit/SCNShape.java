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
import apple.uikit.UIBezierPath;
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

/**
 * SCNShape
 * <p>
 * SCNShape represents a 2D shape (cubic Bezier spline) than can be extruded.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNShape extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNShape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNShape alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNShape allocWithZone(VoidPtr zone);

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
    @Selector("geometry")
    public static native SCNShape geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNShape geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNShape geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
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
    public static native SCNShape new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * shapeWithPath:extrusionDepth:
     * <p>
     * Creates and returns a 3D representation of the given shape with the given extrusion depth.
     *
     * @param path           The cubic Bezier spline to extrude.
     * @param extrusionDepth The extrusion depth.
     */
    @Generated
    @Selector("shapeWithPath:extrusionDepth:")
    public static native SCNShape shapeWithPathExtrusionDepth(UIBezierPath path, @NFloat double extrusionDepth);

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
     * [@property] chamferMode
     * <p>
     * The sides of the text that are chamfered.
     * <p>
     * The default value is SCNChamferModeBoth.
     */
    @Generated
    @Selector("chamferMode")
    @NInt
    public native long chamferMode();

    /**
     * [@property] chamferProfile
     * <p>
     * Describes the profile used to when "chamferRadius" is not nil. When "chamferProfile" is nil we fallback on a path
     * representing a quadrant.
     * <p>
     * The profile should be a 2D curve beginning at (0,1) and ending at (1,0). The "flatness" property is also used to
     * flatten this path. The default value is nil.
     */
    @Generated
    @Selector("chamferProfile")
    public native UIBezierPath chamferProfile();

    /**
     * [@property] chamferRadius
     * <p>
     * The chamfer radius. Animatable.
     * <p>
     * Values are clamped to the range [0, extrusionDepth / 2]. The default value is 0.
     */
    @Generated
    @Selector("chamferRadius")
    @NFloat
    public native double chamferRadius();

    /**
     * [@property] extrusionDepth
     * <p>
     * The extrusion depth. Animatable.
     * <p>
     * If the value is 0, we get a mono-sided, 2D version of the shape.
     */
    @Generated
    @Selector("extrusionDepth")
    @NFloat
    public native double extrusionDepth();

    @Generated
    @Selector("init")
    public native SCNShape init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNShape initWithCoder(NSCoder coder);

    /**
     * [@property] path
     * <p>
     * The path defining the shape to be rendered.
     * <p>
     * The path defines the outline of the shape. The path is filled using the even-odd rule. If the path is
     * self-intersecting, the behavior is undefined.
     */
    @Generated
    @Selector("path")
    public native UIBezierPath path();

    /**
     * [@property] chamferMode
     * <p>
     * The sides of the text that are chamfered.
     * <p>
     * The default value is SCNChamferModeBoth.
     */
    @Generated
    @Selector("setChamferMode:")
    public native void setChamferMode(@NInt long value);

    /**
     * [@property] chamferProfile
     * <p>
     * Describes the profile used to when "chamferRadius" is not nil. When "chamferProfile" is nil we fallback on a path
     * representing a quadrant.
     * <p>
     * The profile should be a 2D curve beginning at (0,1) and ending at (1,0). The "flatness" property is also used to
     * flatten this path. The default value is nil.
     */
    @Generated
    @Selector("setChamferProfile:")
    public native void setChamferProfile(UIBezierPath value);

    /**
     * [@property] chamferRadius
     * <p>
     * The chamfer radius. Animatable.
     * <p>
     * Values are clamped to the range [0, extrusionDepth / 2]. The default value is 0.
     */
    @Generated
    @Selector("setChamferRadius:")
    public native void setChamferRadius(@NFloat double value);

    /**
     * [@property] extrusionDepth
     * <p>
     * The extrusion depth. Animatable.
     * <p>
     * If the value is 0, we get a mono-sided, 2D version of the shape.
     */
    @Generated
    @Selector("setExtrusionDepth:")
    public native void setExtrusionDepth(@NFloat double value);

    /**
     * [@property] path
     * <p>
     * The path defining the shape to be rendered.
     * <p>
     * The path defines the outline of the shape. The path is filled using the even-odd rule. If the path is
     * self-intersecting, the behavior is undefined.
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(UIBezierPath value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
