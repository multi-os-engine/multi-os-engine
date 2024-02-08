package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCYOLOLossDescriptor
 * 
 * The MLCYOLOLossDescriptor specifies a YOLO loss filter descriptor.
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCYOLOLossDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCYOLOLossDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCYOLOLossDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCYOLOLossDescriptor allocWithZone(VoidPtr zone);

    /**
     * [@property] anchorBoxCount
     * 
     * number of anchor boxes used to detect object per grid cell
     */
    @Generated
    @Selector("anchorBoxCount")
    @NUInt
    public native long anchorBoxCount();

    /**
     * [@property] anchorBoxes
     * 
     * \p NSData containing the width and height for \p anchorBoxCount anchor boxes
     * This \p NSData should have 2 floating-point values per anchor box which represent the width
     * and height of the anchor box.
     */
    @NotNull
    @Generated
    @Selector("anchorBoxes")
    public native NSData anchorBoxes();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a YOLO loss descriptor object
     * 
     * @param anchorBoxes    The anchor box data
     * @param anchorBoxCount The number of anchor boxes
     * @return A new MLCYOLOLossDescriptor object.
     */
    @Generated
    @Selector("descriptorWithAnchorBoxes:anchorBoxCount:")
    public static native MLCYOLOLossDescriptor descriptorWithAnchorBoxesAnchorBoxCount(@NotNull NSData anchorBoxes,
            @NUInt long anchorBoxCount);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCYOLOLossDescriptor init();

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

    /**
     * [@property] negative IOU
     * 
     * If the prediction IOU with groundTruth is lower than this
     * value we consider it a confident object absence. The default is 0.3
     */
    @Generated
    @Selector("maximumIOUForObjectAbsence")
    public native float maximumIOUForObjectAbsence();

    /**
     * [@property] positive IOU
     * 
     * If the prediction IOU with groundTruth is higher than this
     * value we consider it a confident object presence, The default is 0.7
     */
    @Generated
    @Selector("minimumIOUForObjectPresence")
    public native float minimumIOUForObjectPresence();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCYOLOLossDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] scaleClass
     * 
     * The scale factor for no object classes loss and loss gradient. The default is 2.0
     */
    @Generated
    @Selector("scaleClassLoss")
    public native float scaleClassLoss();

    /**
     * [@property] scaleNoObject
     * 
     * The scale factor for no object confidence loss and loss gradient. The default is 5.0
     */
    @Generated
    @Selector("scaleNoObjectConfidenceLoss")
    public native float scaleNoObjectConfidenceLoss();

    /**
     * [@property] scaleObject
     * 
     * The scale factor for object confidence loss and loss gradient. The default is 100.0
     */
    @Generated
    @Selector("scaleObjectConfidenceLoss")
    public native float scaleObjectConfidenceLoss();

    /**
     * [@property] scaleSpatialPositionLoss
     * 
     * The scale factor for spatial position loss and loss gradient. The default is 10.0
     */
    @Generated
    @Selector("scaleSpatialPositionLoss")
    public native float scaleSpatialPositionLoss();

    /**
     * [@property] scaleSpatialSizeLoss
     * 
     * The scale factor for spatial size loss and loss gradient. The default is 10.0
     */
    @Generated
    @Selector("scaleSpatialSizeLoss")
    public native float scaleSpatialSizeLoss();

    /**
     * [@property] negative IOU
     * 
     * If the prediction IOU with groundTruth is lower than this
     * value we consider it a confident object absence. The default is 0.3
     */
    @Generated
    @Selector("setMaximumIOUForObjectAbsence:")
    public native void setMaximumIOUForObjectAbsence(float value);

    /**
     * [@property] positive IOU
     * 
     * If the prediction IOU with groundTruth is higher than this
     * value we consider it a confident object presence, The default is 0.7
     */
    @Generated
    @Selector("setMinimumIOUForObjectPresence:")
    public native void setMinimumIOUForObjectPresence(float value);

    /**
     * [@property] scaleClass
     * 
     * The scale factor for no object classes loss and loss gradient. The default is 2.0
     */
    @Generated
    @Selector("setScaleClassLoss:")
    public native void setScaleClassLoss(float value);

    /**
     * [@property] scaleNoObject
     * 
     * The scale factor for no object confidence loss and loss gradient. The default is 5.0
     */
    @Generated
    @Selector("setScaleNoObjectConfidenceLoss:")
    public native void setScaleNoObjectConfidenceLoss(float value);

    /**
     * [@property] scaleObject
     * 
     * The scale factor for object confidence loss and loss gradient. The default is 100.0
     */
    @Generated
    @Selector("setScaleObjectConfidenceLoss:")
    public native void setScaleObjectConfidenceLoss(float value);

    /**
     * [@property] scaleSpatialPositionLoss
     * 
     * The scale factor for spatial position loss and loss gradient. The default is 10.0
     */
    @Generated
    @Selector("setScaleSpatialPositionLoss:")
    public native void setScaleSpatialPositionLoss(float value);

    /**
     * [@property] scaleSpatialSizeLoss
     * 
     * The scale factor for spatial size loss and loss gradient. The default is 10.0
     */
    @Generated
    @Selector("setScaleSpatialSizeLoss:")
    public native void setScaleSpatialSizeLoss(float value);

    /**
     * [@property] shouldRescore
     * 
     * Rescore pertains to multiplying the confidence groundTruth with IOU (intersection over union)
     * of predicted bounding box and the groundTruth boundingBox. The default is YES
     */
    @Generated
    @Selector("setShouldRescore:")
    public native void setShouldRescore(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] shouldRescore
     * 
     * Rescore pertains to multiplying the confidence groundTruth with IOU (intersection over union)
     * of predicted bounding box and the groundTruth boundingBox. The default is YES
     */
    @Generated
    @Selector("shouldRescore")
    public native boolean shouldRescore();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
