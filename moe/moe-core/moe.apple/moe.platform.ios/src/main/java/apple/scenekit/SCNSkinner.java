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
import apple.foundation.NSValue;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.struct.SCNMatrix4;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNSkinner extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNSkinner(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNSkinner alloc();

    /**
     * skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/clm/SCNSkinner/skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:">iOS Dev Center</a>
     */
    @Generated
    @Selector("skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:")
    public static native SCNSkinner skinnerWithBaseGeometryBonesBoneInverseBindTransformsBoneWeightsBoneIndices(
            SCNGeometry baseGeometry, NSArray<? extends SCNNode> bones,
            NSArray<? extends NSValue> boneInverseBindTransforms, SCNGeometrySource boneWeights,
            SCNGeometrySource boneIndices);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    @Selector("initialize")
    public static native void initialize();

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

    /**
     * baseGeometry</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/baseGeometry">iOS Dev Center</a>
     */
    @Generated
    @Selector("baseGeometry")
    public native SCNGeometry baseGeometry();

    /**
     * baseGeometryBindTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/baseGeometryBindTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("baseGeometryBindTransform")
    @ByValue
    public native SCNMatrix4 baseGeometryBindTransform();

    /**
     * boneIndices</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/boneIndices">iOS Dev Center</a>
     */
    @Generated
    @Selector("boneIndices")
    public native SCNGeometrySource boneIndices();

    /**
     * boneInverseBindTransforms</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/boneInverseBindTransforms">iOS Dev Center</a>
     */
    @Generated
    @Selector("boneInverseBindTransforms")
    public native NSArray<? extends NSValue> boneInverseBindTransforms();

    /**
     * boneWeights</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/boneWeights">iOS Dev Center</a>
     */
    @Generated
    @Selector("boneWeights")
    public native SCNGeometrySource boneWeights();

    /**
     * bones</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/bones">iOS Dev Center</a>
     */
    @Generated
    @Selector("bones")
    public native NSArray<? extends SCNNode> bones();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SCNSkinner init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNSkinner initWithCoder(NSCoder aDecoder);

    /**
     * baseGeometry</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/baseGeometry">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBaseGeometry:")
    public native void setBaseGeometry(SCNGeometry value);

    /**
     * baseGeometryBindTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/baseGeometryBindTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBaseGeometryBindTransform:")
    public native void setBaseGeometryBindTransform(@ByValue SCNMatrix4 value);

    /**
     * skeleton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/skeleton">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSkeleton:")
    public native void setSkeleton(SCNNode value);

    /**
     * skeleton</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSkinner_Class/index.html#//apple_ref/occ/instp/SCNSkinner/skeleton">iOS Dev Center</a>
     */
    @Generated
    @Selector("skeleton")
    public native SCNNode skeleton();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
