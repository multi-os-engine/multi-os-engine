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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UILayoutGuides will not show up in the view hierarchy, but may be used as items in
 * an NSLayoutConstraint and represent a rectangle in the layout engine.
 * 
 * Create a UILayoutGuide with -init, and add to a view with -[UIView addLayoutGuide:]
 * before using it in a constraint.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILayoutGuide extends NSObject implements NSCoding, UIPopoverPresentationControllerSourceItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UILayoutGuide(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UILayoutGuide alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UILayoutGuide allocWithZone(VoidPtr zone);

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
    public static native UILayoutGuide new_objc();

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

    @NotNull
    @Generated
    @Selector("bottomAnchor")
    public native NSLayoutYAxisAnchor bottomAnchor();

    @NotNull
    @Generated
    @Selector("centerXAnchor")
    public native NSLayoutXAxisAnchor centerXAnchor();

    @NotNull
    @Generated
    @Selector("centerYAnchor")
    public native NSLayoutYAxisAnchor centerYAnchor();

    /**
     * This returns a list of all the constraints that are affecting the current location of the receiver. The
     * constraints do not necessarily involve the receiver, they may affect the frame indirectly.
     * Pass UILayoutConstraintAxisHorizontal for the constraints affecting [self center].x and CGRectGetWidth([self
     * bounds]), and UILayoutConstraintAxisVertical for the constraints affecting[self center].y and
     * CGRectGetHeight([self bounds]).
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("constraintsAffectingLayoutForAxis:")
    public native NSArray<? extends NSLayoutConstraint> constraintsAffectingLayoutForAxis(@NInt long axis);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * If there aren't enough constraints in the system to uniquely determine layout, we say the layout is ambiguous.
     * For example, if the only constraint in the system was x = y + 100, then there are lots of different possible
     * values for x and y. This situation is not automatically detected by UIKit, due to performance considerations and
     * details of the algorithm used for layout.
     * The symptom of ambiguity is that views sometimes jump from place to place, or possibly are just in the wrong
     * place.
     * -hasAmbiguousLayout runs a check for whether there is another center and bounds the receiver could have that
     * could also satisfy the constraints.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();

    @NotNull
    @Generated
    @Selector("heightAnchor")
    public native NSLayoutDimension heightAnchor();

    /**
     * For ease of debugging.
     * 'UI' prefix is reserved for UIKit-created layout guides.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native UILayoutGuide init();

    @Generated
    @Selector("initWithCoder:")
    public native UILayoutGuide initWithCoder(@NotNull NSCoder coder);

    /**
     * The frame of the UILayoutGuide in its owningView's coordinate system.
     * Valid by the time the owningView receives -layoutSubviews.
     */
    @Generated
    @Selector("layoutFrame")
    @ByValue
    public native CGRect layoutFrame();

    /**
     * Constraint creation conveniences. See NSLayoutAnchor.h for details.
     */
    @NotNull
    @Generated
    @Selector("leadingAnchor")
    public native NSLayoutXAxisAnchor leadingAnchor();

    @NotNull
    @Generated
    @Selector("leftAnchor")
    public native NSLayoutXAxisAnchor leftAnchor();

    /**
     * The guide must be added to a view with -[UIView addLayoutGuide:] before being used in a constraint.
     * Do not use this property directly to change the owningView of a layout guide. Instead, use
     * -[UIView addLayoutGuide:] and -[UIView removeLayoutGuide:], which will use this property to
     * change the owningView.
     */
    @Nullable
    @Generated
    @Selector("owningView")
    public native UIView owningView();

    @NotNull
    @Generated
    @Selector("rightAnchor")
    public native NSLayoutXAxisAnchor rightAnchor();

    /**
     * For ease of debugging.
     * 'UI' prefix is reserved for UIKit-created layout guides.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    /**
     * The guide must be added to a view with -[UIView addLayoutGuide:] before being used in a constraint.
     * Do not use this property directly to change the owningView of a layout guide. Instead, use
     * -[UIView addLayoutGuide:] and -[UIView removeLayoutGuide:], which will use this property to
     * change the owningView.
     */
    @Generated
    @Selector("setOwningView:")
    public native void setOwningView_unsafe(@Nullable UIView value);

    /**
     * The guide must be added to a view with -[UIView addLayoutGuide:] before being used in a constraint.
     * Do not use this property directly to change the owningView of a layout guide. Instead, use
     * -[UIView addLayoutGuide:] and -[UIView removeLayoutGuide:], which will use this property to
     * change the owningView.
     */
    @Generated
    public void setOwningView(@Nullable UIView value) {
        Object __old = owningView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setOwningView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @NotNull
    @Generated
    @Selector("topAnchor")
    public native NSLayoutYAxisAnchor topAnchor();

    @NotNull
    @Generated
    @Selector("trailingAnchor")
    public native NSLayoutXAxisAnchor trailingAnchor();

    @NotNull
    @Generated
    @Selector("widthAnchor")
    public native NSLayoutDimension widthAnchor();

    @Generated
    @Selector("frameInView:")
    @ByValue
    public native CGRect frameInView(@NotNull UIView referenceView);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
