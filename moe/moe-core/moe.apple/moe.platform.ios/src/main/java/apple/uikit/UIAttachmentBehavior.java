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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicItem;
import apple.uikit.struct.UIFloatRange;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class UIAttachmentBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIAttachmentBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIAttachmentBehavior alloc();

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
    @Selector("fixedAttachmentWithItem:attachedToItem:attachmentAnchor:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fixedAttachmentWithItemAttachedToItemAttachmentAnchor(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2,
            @ByValue CGPoint point);

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
    @Selector("limitAttachmentWithItem:offsetFromCenter:attachedToItem:offsetFromCenter:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object limitAttachmentWithItemOffsetFromCenterAttachedToItemOffsetFromCenter(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @ByValue UIOffset offset1,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item2, @ByValue UIOffset offset2);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pinAttachmentWithItem:attachedToItem:attachmentAnchor:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object pinAttachmentWithItemAttachedToItemAttachmentAnchor(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2,
            @ByValue CGPoint point);

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
    @Selector("slidingAttachmentWithItem:attachedToItem:attachmentAnchor:axisOfTranslation:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object slidingAttachmentWithItemAttachedToItemAttachmentAnchorAxisOfTranslation(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2,
            @ByValue CGPoint point, @ByValue CGVector axis);

    @Generated
    @Selector("slidingAttachmentWithItem:attachmentAnchor:axisOfTranslation:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object slidingAttachmentWithItemAttachmentAnchorAxisOfTranslation(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item, @ByValue CGPoint point, @ByValue CGVector axis);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    @Generated
    @Selector("attachedBehaviorType")
    @NInt
    public native long attachedBehaviorType();

    @Generated
    @Selector("attachmentRange")
    @ByValue
    public native UIFloatRange attachmentRange();

    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    @Generated
    @Selector("frequency")
    @NFloat
    public native double frequency();

    @Generated
    @Selector("frictionTorque")
    @NFloat
    public native double frictionTorque();

    @Generated
    @Selector("init")
    public native UIAttachmentBehavior init();

    @Generated
    @Selector("initWithItem:attachedToAnchor:")
    public native UIAttachmentBehavior initWithItemAttachedToAnchor(@Mapped(ObjCObjectMapper.class) UIDynamicItem item,
            @ByValue CGPoint point);

    @Generated
    @Selector("initWithItem:attachedToItem:")
    public native UIAttachmentBehavior initWithItemAttachedToItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item1,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item2);

    @Generated
    @Selector("initWithItem:offsetFromCenter:attachedToAnchor:")
    public native UIAttachmentBehavior initWithItemOffsetFromCenterAttachedToAnchor(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item, @ByValue UIOffset offset, @ByValue CGPoint point);

    @Generated
    @Selector("initWithItem:offsetFromCenter:attachedToItem:offsetFromCenter:")
    public native UIAttachmentBehavior initWithItemOffsetFromCenterAttachedToItemOffsetFromCenter(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @ByValue UIOffset offset1,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item2, @ByValue UIOffset offset2);

    @Generated
    @Selector("items")
    public native NSArray<?> items();

    @Generated
    @Selector("length")
    @NFloat
    public native double length();

    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setAttachmentRange:")
    public native void setAttachmentRange(@ByValue UIFloatRange value);

    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    @Generated
    @Selector("setFrequency:")
    public native void setFrequency(@NFloat double value);

    @Generated
    @Selector("setFrictionTorque:")
    public native void setFrictionTorque(@NFloat double value);

    @Generated
    @Selector("setLength:")
    public native void setLength(@NFloat double value);
}
