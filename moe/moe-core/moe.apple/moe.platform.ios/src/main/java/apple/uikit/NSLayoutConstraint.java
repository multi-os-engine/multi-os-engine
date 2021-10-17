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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutConstraint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Convenience method that activates each constraint in the contained array, in the same manner as setting active=YES. This is often more efficient than activating each constraint individually.
     */
    @Generated
    @Selector("activateConstraints:")
    public static native void activateConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutConstraint alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSLayoutConstraint allocWithZone(VoidPtr zone);

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

    /**
     * Create constraints explicitly.  Constraints are of the form "view1.attr1 = view2.attr2 * multiplier + constant"
     * If your equation does not have a second view and attribute, use nil and NSLayoutAttributeNotAnAttribute.
     * Use of this method is not recommended. Constraints should be created using anchor objects on views and layout guides.
     */
    @Generated
    @Selector("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
    public static native NSLayoutConstraint constraintWithItemAttributeRelatedByToItemAttributeMultiplierConstant(
            @Mapped(ObjCObjectMapper.class) Object view1, @NInt long attr1, @NInt long relation,
            @Mapped(ObjCObjectMapper.class) Object view2, @NInt long attr2, @NFloat double multiplier,
            @NFloat double c);

    /**
     * Create an array of constraints using an ASCII-art-like visual format string.  The values of the `metrics` dictionary should be NSNumber (or some other type that responds to -doubleValue and returns a double).
     */
    @Generated
    @Selector("constraintsWithVisualFormat:options:metrics:views:")
    public static native NSArray<? extends NSLayoutConstraint> constraintsWithVisualFormatOptionsMetricsViews(
            String format, @NUInt long opts, NSDictionary<String, ?> metrics, NSDictionary<String, ?> views);

    /**
     * Convenience method that deactivates each constraint in the contained array, in the same manner as setting active=NO. This is often more efficient than deactivating each constraint individually.
     */
    @Generated
    @Selector("deactivateConstraints:")
    public static native void deactivateConstraints(NSArray<? extends NSLayoutConstraint> constraints);

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

    @Generated
    @Owned
    @Selector("new")
    public static native NSLayoutConstraint new_objc();

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
     * Unlike the other properties, the constant may be modified after constraint creation.  Setting the constant on an existing constraint performs much better than removing the constraint and adding a new one that's just like the old but for having a new constant.
     */
    @Generated
    @Selector("constant")
    @NFloat
    public native double constant();

    /**
     * accessors
     * firstAnchor{==,<=,>=} secondAnchor * multiplier + constant
     */
    @Generated
    @Selector("firstAnchor")
    public native NSLayoutAnchor<?> firstAnchor();

    @Generated
    @Selector("firstAttribute")
    @NInt
    public native long firstAttribute();

    /**
     * accessors
     * firstItem.firstAttribute {==,<=,>=} secondItem.secondAttribute * multiplier + constant
     * Access to these properties is not recommended. Use the `firstAnchor` and `secondAnchor` properties instead.
     */
    @Generated
    @Selector("firstItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object firstItem();

    /**
     * For ease in debugging, name a constraint by setting its identifier, which will be printed in the constraint's description.
     * Identifiers starting with NS or UI are reserved by the system.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSLayoutConstraint init();

    /**
     * The receiver may be activated or deactivated by manipulating this property.  Only active constraints affect the calculated layout.  Attempting to activate a constraint whose items have no common ancestor will cause an exception to be thrown.  Defaults to NO for newly created constraints.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * The receiver may be activated or deactivated by manipulating this property.  Only active constraints affect the calculated layout.  Attempting to activate a constraint whose items have no common ancestor will cause an exception to be thrown.  Defaults to NO for newly created constraints.
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    @Generated
    @Selector("multiplier")
    @NFloat
    public native double multiplier();

    @Generated
    @Selector("priority")
    public native float priority();

    @Generated
    @Selector("relation")
    @NInt
    public native long relation();

    @Generated
    @Selector("secondAnchor")
    public native NSLayoutAnchor<?> secondAnchor();

    @Generated
    @Selector("secondAttribute")
    @NInt
    public native long secondAttribute();

    @Generated
    @Selector("secondItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object secondItem();

    /**
     * Unlike the other properties, the constant may be modified after constraint creation.  Setting the constant on an existing constraint performs much better than removing the constraint and adding a new one that's just like the old but for having a new constant.
     */
    @Generated
    @Selector("setConstant:")
    public native void setConstant(@NFloat double value);

    /**
     * For ease in debugging, name a constraint by setting its identifier, which will be printed in the constraint's description.
     * Identifiers starting with NS or UI are reserved by the system.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @Selector("setPriority:")
    public native void setPriority(float value);

    /**
     * When a view is archived, it archives some but not all constraints in its -constraints array.  The value of shouldBeArchived informs the view if a particular constraint should be archived by the view.
     * If a constraint is created at runtime in response to the state of the object, it isn't appropriate to archive the constraint - rather you archive the state that gives rise to the constraint.  Since the majority of constraints that should be archived are created in Interface Builder (which is smart enough to set this prop to YES), the default value for this property is NO.
     */
    @Generated
    @Selector("setShouldBeArchived:")
    public native void setShouldBeArchived(boolean value);

    /**
     * When a view is archived, it archives some but not all constraints in its -constraints array.  The value of shouldBeArchived informs the view if a particular constraint should be archived by the view.
     * If a constraint is created at runtime in response to the state of the object, it isn't appropriate to archive the constraint - rather you archive the state that gives rise to the constraint.  Since the majority of constraints that should be archived are created in Interface Builder (which is smart enough to set this prop to YES), the default value for this property is NO.
     */
    @Generated
    @Selector("shouldBeArchived")
    public native boolean shouldBeArchived();
}
