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

    /**
     * A fixed attachment fuses two dynamic items together at a reference point. 
     * Fixed attachments are useful for creating complex shapes that can be broken apart later.
     * 
     * @param item1 The first of two dynamic items connected by the attachment behavior.
     * @param item2 The second of two dynamic items connected by the attachment behavior.
     * @param point The point for which each item will be attached. The anchor point will be converted to each items local corrdinate system.
     */
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

    /**
     * A limit attachment imposes a maximum distance between two dynamic items, as if they were connected by a rope.
     * 
     * @param item1 The first of two dynamic items connected by the attachment behavior.
     * @param offset1 The point, within the dynamic item and described as an offset from its center point, for the attachment behavior.
     * @param item2 The second of two dynamic items connected by the attachment behavior.
     * @param offset2 The point, within the dynamic item and described as an offset from its center point, for the attachment behavior.
     * @see length
     */
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

    /**
     * A pin attachment allows two dynamic items to independently rotate around the anchor point as if pinned together. 
     * You can configure how far the two objects may rotate and the resistance to rotation
     * 
     * @param item1 The first of two dynamic items connected by the attachment behavior.
     * @param item2 The second of two dynamic items connected by the attachment behavior.
     * @param point The point for which each item will be attached. The anchor point will be converted to each items local corrdinate system
     * @see frictionTorque, resistance to rotation
     */
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

    /**
     * A sliding attachment allows for relative translation of two items along a specified axis with respect to the anchor point. A sliding
     * attachment prevents all relative rotation of the dynamic items.
     * 
     * @param item1 The first of two dynamic items connected by the attachment behavior.
     * @param item2 The second of two dynamic items connected by the attachment behavior.
     * @param point The point for which each item will be attached. The anchor point will be converted to each items local corrdinate system.
     * @param axis Axis of allowed relative translation between local anchor point. Must be a unit vector.
     * @see attachmentRange, Represents the slidable range of the attachment with respect to the anchor point along the specified axis, this range must include 0
     */
    @Generated
    @Selector("slidingAttachmentWithItem:attachedToItem:attachmentAnchor:axisOfTranslation:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object slidingAttachmentWithItemAttachedToItemAttachmentAnchorAxisOfTranslation(
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2,
            @ByValue CGPoint point, @ByValue CGVector axis);

    /**
     * A sliding attachment allows for translation of the item along a specified axis with respect to the anchor point. A sliding
     * attachment prevents all relative rotation of the dynamic items.
     * 
     * @param item1 The dynamic item connected by the attachment behavior.
     * @param point The point for the item will be anchored by the attachment.
     * @param axis Axis of allowed translation for the item. Must be a unit vector.
     * @see attachmentRange, Represents the slidable range of the attachment with respect to the anchor point along the specified axis, this range must include 0
     */
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

    /**
     * default is UIFloatRangeInfinite
     */
    @Generated
    @Selector("attachmentRange")
    @ByValue
    public native UIFloatRange attachmentRange();

    /**
     * 1: critical damping
     */
    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    /**
     * in Hertz
     */
    @Generated
    @Selector("frequency")
    @NFloat
    public native double frequency();

    /**
     * default is 0.0
     */
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

    /**
     * default is UIFloatRangeInfinite
     */
    @Generated
    @Selector("setAttachmentRange:")
    public native void setAttachmentRange(@ByValue UIFloatRange value);

    /**
     * 1: critical damping
     */
    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    /**
     * in Hertz
     */
    @Generated
    @Selector("setFrequency:")
    public native void setFrequency(@NFloat double value);

    /**
     * default is 0.0
     */
    @Generated
    @Selector("setFrictionTorque:")
    public native void setFrictionTorque(@NFloat double value);

    @Generated
    @Selector("setLength:")
    public native void setLength(@NFloat double value);
}
