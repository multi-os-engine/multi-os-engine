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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * SCNLevelOfDetail
 * <p>
 * SCNLevelOfDetail represents a level of detail of a geometry.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNLevelOfDetail extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNLevelOfDetail(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNLevelOfDetail alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SCNLevelOfDetail allocWithZone(VoidPtr zone);

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

    /**
     * levelOfDetailWithGeometry:screenSpaceRadius:
     * <p>
     * This is a convenience method to create a level of detail with a coverage radius threshold mode.
     *
     * @param geometry The geometry for this level of detail. nil is supported and indicates that no geometry should be rendered for this level of detail.
     * @param radius   The maximum radius in screen-space that this level of detail is suitable for. The coverage radius is calculated from the projected bounding sphere and expressed in pixels.
     */
    @Generated
    @Selector("levelOfDetailWithGeometry:screenSpaceRadius:")
    public static native SCNLevelOfDetail levelOfDetailWithGeometryScreenSpaceRadius(SCNGeometry geometry,
            @NFloat double radius);

    /**
     * levelOfDetailWithGeometry:worldSpaceDistance:
     * <p>
     * This is a convenience method to create a level of detail with a distance threshold mode.
     *
     * @param geometry The geometry for this level of detail. nil is supported and indicates that no geometry should be rendered for this level of detail.
     * @param distance The minimum distance to the current point of view that this level of detail is suitable for.
     */
    @Generated
    @Selector("levelOfDetailWithGeometry:worldSpaceDistance:")
    public static native SCNLevelOfDetail levelOfDetailWithGeometryWorldSpaceDistance(SCNGeometry geometry,
            @NFloat double distance);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNLevelOfDetail new_objc();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] geometry
     * <p>
     * Returns the geometry of the receiver.
     */
    @Generated
    @Selector("geometry")
    public native SCNGeometry geometry();

    @Generated
    @Selector("init")
    public native SCNLevelOfDetail init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLevelOfDetail initWithCoder(NSCoder coder);

    /**
     * [@property] screenSpaceRadius
     * <p>
     * Returns the screen space radius of the receiver if any, 0 otherwise.
     */
    @Generated
    @Selector("screenSpaceRadius")
    @NFloat
    public native double screenSpaceRadius();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] worldSpaceDistance
     * <p>
     * Returns the world space distance of the receiver if any, 0 otherwise.
     */
    @Generated
    @Selector("worldSpaceDistance")
    @NFloat
    public native double worldSpaceDistance();
}
