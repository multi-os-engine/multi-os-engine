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

package apple.spritekit;

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
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SKConstraints are evaluated each frame after actions and physics.
 * The node's transform will be changed to staisfy the constarint
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKConstraint extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SKConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKConstraint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKConstraint allocWithZone(VoidPtr zone);

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

    /**
     * Constrain the node's position to be within a distance of a point or node
     */
    @NotNull
    @Generated
    @Selector("distance:toNode:")
    public static native SKConstraint distanceToNode(@NotNull SKRange range, @NotNull SKNode node);

    @NotNull
    @Generated
    @Selector("distance:toPoint:")
    public static native SKConstraint distanceToPoint(@NotNull SKRange range, @ByValue CGPoint point);

    @NotNull
    @Generated
    @Selector("distance:toPoint:inNode:")
    public static native SKConstraint distanceToPointInNode(@NotNull SKRange range, @ByValue CGPoint point,
            @NotNull SKNode node);

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
    public static native SKConstraint new_objc();

    /**
     * Constrain the node's rotation to orient to a point or node
     */
    @NotNull
    @Generated
    @Selector("orientToNode:offset:")
    public static native SKConstraint orientToNodeOffset(@NotNull SKNode node, @NotNull SKRange radians);

    @NotNull
    @Generated
    @Selector("orientToPoint:inNode:offset:")
    public static native SKConstraint orientToPointInNodeOffset(@ByValue CGPoint point, @NotNull SKNode node,
            @NotNull SKRange radians);

    @NotNull
    @Generated
    @Selector("orientToPoint:offset:")
    public static native SKConstraint orientToPointOffset(@ByValue CGPoint point, @NotNull SKRange radians);

    /**
     * Constrain the node's position to a range
     */
    @NotNull
    @Generated
    @Selector("positionX:")
    public static native SKConstraint positionX(@NotNull SKRange range);

    @NotNull
    @Generated
    @Selector("positionX:Y:")
    public static native SKConstraint positionXY(@NotNull SKRange xRange, @NotNull SKRange yRange);

    @NotNull
    @Generated
    @Selector("positionY:")
    public static native SKConstraint positionY(@NotNull SKRange range);

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
     * Constrain the node's rotation to a range
     */
    @NotNull
    @Generated
    @Selector("zRotation:")
    public static native SKConstraint zRotation(@NotNull SKRange zRange);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Wether the constraint should apply. Defualts to YES
     */
    @Generated
    @Selector("enabled")
    public native boolean enabled();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SKConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SKConstraint initWithCoder(@NotNull NSCoder coder);

    /**
     * Reference node to transform the values to before apply the constraint limits. Defaults to nil (no transfrom).
     */
    @Nullable
    @Generated
    @Selector("referenceNode")
    public native SKNode referenceNode();

    /**
     * Wether the constraint should apply. Defualts to YES
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Reference node to transform the values to before apply the constraint limits. Defaults to nil (no transfrom).
     */
    @Generated
    @Selector("setReferenceNode:")
    public native void setReferenceNode(@Nullable SKNode value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
