package apple.metalperformanceshaders;

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

/**
 * MPSCNNYOLOLossDescriptor
 * [@dependency] This depends on Metal.framework.
 * <p>
 * The MPSCNNYOLOLossDescriptor specifies a loss filter descriptor
 * that is used to create a MPSCNNLoss filter. The MPSCNNYOLOLoss is a filter that
 * has been specialized for object detection tasks and follows a specific layout
 * for the feature-channels of the input, output, weight and label data.
 * <p>
 * The layout of the data within the feature-channels is as follows:
 * <p>
 * Each anchorbox uses ( 2+2+1 + numberOfClasses = 5 + numberOfClasses ) feature channels.
 * <p>
 * Therefore the total number of feature channels used is: (5 + numberOfClasses) * numberOfAnchorBoxes.
 * The first feature channel for anchorbox index 'anchorIdx' is at fcIndex = (5 + numberOfClasses) * anchorIdx,
 * and the feature channels within each anchorbox are stored in the layout: 'XYWHCFFFFFF...', where (XY) are
 * the so-called raw x and y coordinates of the bounding box within each gridcell and (WH) are the corresponding
 * width and height. 'C' signifies a confidence for having an object in the cell and FFFFF... are the feature channel
 * values for each class of object to be classified in the object detector.
 * <p>
 * The YOLO-loss filter works by operating mostly independently on each anchorbox:
 * *   The XY-channels of the inputs are first transformed to relative XY-values by applying the sigmoid-neuron on them,
 * after which they are passed through the loss function defined by @ref XYLossDescriptor, which is typically chosen
 * to be the @ref MPSCNNLossTypeMeanSquaredError type loss function.
 * *   The WH-channels contain the raw width and height of the bounding box and they are operated with the
 * loss function defined by @ref WHLossDescriptor, which is typically of type @ref MPSCNNLossTypeHuber.
 * *   The C-channel contains the confidence value of having an object in the bounding box and it is operated
 * by the loss function defined by @ref confidenceLossDescriptor, which is typically chosen to be
 * [@ref] MPSCNNLossTypeSigmoidCrossEntropy.
 * *   The FFFFF... (number of channels is number of classes) channels contains the raw feature channels for
 * object classes, used to identify which objects are the most probable ones in the bounding box and
 * these channels are passed through the loss function defined by @ref classesLossDescriptor, which in
 * typical cases is of the type @ref MPSCNNLossTypeSoftMaxCrossEntropy.
 * <p>
 * For details on how to set up the label values and anchorboxes see https://arxiv.org/abs/1612.08242
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNYOLOLossDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNYOLOLossDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * [@property]   WHLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("WHLossDescriptor")
    public native MPSCNNLossDescriptor WHLossDescriptor();

    /**
     * [@property]   XYLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("XYLossDescriptor")
    public native MPSCNNLossDescriptor XYLossDescriptor();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNYOLOLossDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNYOLOLossDescriptor allocWithZone(VoidPtr zone);

    /**
     * [@property]   anchorBoxes
     * <p>
     * NSData containing the width and height for numberOfAnchorBoxes anchor boxes
     * This NSData should have 2 float values per anchor box which represent the width
     * and height of the anchor box.
     * [@code]
     * typedef struct anchorBox{
     * float width;
     * float height;
     * }anchorBox;
     * <p>
     * <p>
     * anchorBox_t gAnchorBoxes[MAX_NUM_ANCHOR_BOXES] = {
     * {.width = 1.f, .height = 2.f},
     * {.width = 1.f, .height = 1.f},
     * {.width = 2.f, .height = 1.f},
     * };
     * NSData* labelsInputData = [NSData dataWithBytes: gAnchorBoxes length: MAX_NUM_ANCHOR_BOXES * sizeof(anchorBox)];
     * [@endcode]
     */
    @Generated
    @Selector("anchorBoxes")
    public native NSData anchorBoxes();

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
     * [@property]   classesLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("classesLossDescriptor")
    public native MPSCNNLossDescriptor classesLossDescriptor();

    /**
     * Make a descriptor for a MPSCNNYOLOLoss object.
     *
     * @param XYLossType         The type of spatial position loss filter.
     * @param WHLossType         The type of spatial size loss filter.
     * @param confidenceLossType The type of confidence filter.
     * @param classesLossType    The type of classes filter.
     * @param reductionType      The type of a reduction operation to apply.
     * @param anchorBoxes        This is an NSData which has an array of anchorBoxes defined as a struct{ float width; float height; };
     * @return A valid MPSCNNYOLOLossDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("cnnLossDescriptorWithXYLossType:WHLossType:confidenceLossType:classesLossType:reductionType:anchorBoxes:numberOfAnchorBoxes:")
    public static native MPSCNNYOLOLossDescriptor cnnLossDescriptorWithXYLossTypeWHLossTypeConfidenceLossTypeClassesLossTypeReductionTypeAnchorBoxesNumberOfAnchorBoxes(
            int XYLossType, int WHLossType, int confidenceLossType, int classesLossType, int reductionType,
            NSData anchorBoxes, @NUInt long numberOfAnchorBoxes);

    /**
     * [@property]   confidenceLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("confidenceLossDescriptor")
    public native MPSCNNLossDescriptor confidenceLossDescriptor();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
    @Selector("init")
    public native MPSCNNYOLOLossDescriptor init();

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
     * [@property]   neg_iou
     * <p>
     * If the prediction IOU with groundTruth is lower than this
     * value we consider it a confident object absence, default is 0.3
     */
    @Generated
    @Selector("maxIOUForObjectAbsence")
    public native float maxIOUForObjectAbsence();

    /**
     * [@property]   pos_iou
     * <p>
     * If the prediction IOU with groundTruth is higher than this
     * value we consider it a confident object presence, default is 0.7
     */
    @Generated
    @Selector("minIOUForObjectPresence")
    public native float minIOUForObjectPresence();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNYOLOLossDescriptor new_objc();

    /**
     * [@property]   numberOfAnchorBoxes
     * <p>
     * number of anchor boxes used to detect object per grid cell
     */
    @Generated
    @Selector("numberOfAnchorBoxes")
    @NUInt
    public native long numberOfAnchorBoxes();

    /**
     * [@property]   reductionType
     * <p>
     * ReductionType shared accross all losses (so they may generate same sized output)
     */
    @Generated
    @Selector("reductionType")
    public native int reductionType();

    /**
     * [@property]   rescore
     * <p>
     * Rescore pertains to multiplying the confidence groundTruth with IOU (intersection over union)
     * of predicted bounding box and the groundTruth boundingBox. Default is YES
     */
    @Generated
    @Selector("rescore")
    public native boolean rescore();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   scaleClass
     * <p>
     * scale factor for no object classes loss and loss gradient default is 2.0
     */
    @Generated
    @Selector("scaleClass")
    public native float scaleClass();

    /**
     * [@property]   scaleNoObject
     * <p>
     * scale factor for no object confidence loss and loss gradient default is 5.0
     */
    @Generated
    @Selector("scaleNoObject")
    public native float scaleNoObject();

    /**
     * [@property]   scaleObject
     * <p>
     * scale factor for no object confidence loss and loss gradient default is 100.0
     */
    @Generated
    @Selector("scaleObject")
    public native float scaleObject();

    /**
     * [@property]   scaleWH
     * <p>
     * scale factor for WH loss and loss gradient default is 10.0
     */
    @Generated
    @Selector("scaleWH")
    public native float scaleWH();

    /**
     * [@property]   scaleXY
     * <p>
     * scale factor for XY loss and loss gradient default is 10.0
     */
    @Generated
    @Selector("scaleXY")
    public native float scaleXY();

    /**
     * [@property]   anchorBoxes
     * <p>
     * NSData containing the width and height for numberOfAnchorBoxes anchor boxes
     * This NSData should have 2 float values per anchor box which represent the width
     * and height of the anchor box.
     * [@code]
     * typedef struct anchorBox{
     * float width;
     * float height;
     * }anchorBox;
     * <p>
     * <p>
     * anchorBox_t gAnchorBoxes[MAX_NUM_ANCHOR_BOXES] = {
     * {.width = 1.f, .height = 2.f},
     * {.width = 1.f, .height = 1.f},
     * {.width = 2.f, .height = 1.f},
     * };
     * NSData* labelsInputData = [NSData dataWithBytes: gAnchorBoxes length: MAX_NUM_ANCHOR_BOXES * sizeof(anchorBox)];
     * [@endcode]
     */
    @Generated
    @Selector("setAnchorBoxes:")
    public native void setAnchorBoxes(NSData value);

    /**
     * [@property]   classesLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("setClassesLossDescriptor:")
    public native void setClassesLossDescriptor(MPSCNNLossDescriptor value);

    /**
     * [@property]   confidenceLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("setConfidenceLossDescriptor:")
    public native void setConfidenceLossDescriptor(MPSCNNLossDescriptor value);

    /**
     * [@property]   neg_iou
     * <p>
     * If the prediction IOU with groundTruth is lower than this
     * value we consider it a confident object absence, default is 0.3
     */
    @Generated
    @Selector("setMaxIOUForObjectAbsence:")
    public native void setMaxIOUForObjectAbsence(float value);

    /**
     * [@property]   pos_iou
     * <p>
     * If the prediction IOU with groundTruth is higher than this
     * value we consider it a confident object presence, default is 0.7
     */
    @Generated
    @Selector("setMinIOUForObjectPresence:")
    public native void setMinIOUForObjectPresence(float value);

    /**
     * [@property]   numberOfAnchorBoxes
     * <p>
     * number of anchor boxes used to detect object per grid cell
     */
    @Generated
    @Selector("setNumberOfAnchorBoxes:")
    public native void setNumberOfAnchorBoxes(@NUInt long value);

    /**
     * [@property]   reductionType
     * <p>
     * ReductionType shared accross all losses (so they may generate same sized output)
     */
    @Generated
    @Selector("setReductionType:")
    public native void setReductionType(int value);

    /**
     * [@property]   rescore
     * <p>
     * Rescore pertains to multiplying the confidence groundTruth with IOU (intersection over union)
     * of predicted bounding box and the groundTruth boundingBox. Default is YES
     */
    @Generated
    @Selector("setRescore:")
    public native void setRescore(boolean value);

    /**
     * [@property]   scaleClass
     * <p>
     * scale factor for no object classes loss and loss gradient default is 2.0
     */
    @Generated
    @Selector("setScaleClass:")
    public native void setScaleClass(float value);

    /**
     * [@property]   scaleNoObject
     * <p>
     * scale factor for no object confidence loss and loss gradient default is 5.0
     */
    @Generated
    @Selector("setScaleNoObject:")
    public native void setScaleNoObject(float value);

    /**
     * [@property]   scaleObject
     * <p>
     * scale factor for no object confidence loss and loss gradient default is 100.0
     */
    @Generated
    @Selector("setScaleObject:")
    public native void setScaleObject(float value);

    /**
     * [@property]   scaleWH
     * <p>
     * scale factor for WH loss and loss gradient default is 10.0
     */
    @Generated
    @Selector("setScaleWH:")
    public native void setScaleWH(float value);

    /**
     * [@property]   scaleXY
     * <p>
     * scale factor for XY loss and loss gradient default is 10.0
     */
    @Generated
    @Selector("setScaleXY:")
    public native void setScaleXY(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   WHLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("setWHLossDescriptor:")
    public native void setWHLossDescriptor(MPSCNNLossDescriptor value);

    /**
     * [@property]   XYLossDescriptor
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("setXYLossDescriptor:")
    public native void setXYLossDescriptor(MPSCNNLossDescriptor value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]   reduceAcrossBatch
     * <p>
     * If set to YES then the reduction operation is applied also across the batch-index dimension,
     * ie. the loss value is summed over images in the batch and the result of the reduction is written
     * on the first loss image in the batch while the other loss images will be set to zero.
     * If set to NO, then no reductions are performed across the batch dimension and each image in the batch
     * will contain the loss value associated with that one particular image.
     * NOTE: If reductionType == MPSCNNReductionTypeNone, then this flag has no effect on results,
     * that is no reductions are done in this case.
     * NOTE: If reduceAcrossBatch is set to YES and reductionType == MPSCNNReductionTypeMean then
     * the final forward loss value is computed by first summing over the components and then by
     * dividing the result with: number of feature channels * width * height * number of images in the batch.
     * The default value is NO.
     */
    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();

    /**
     * [@property]   reduceAcrossBatch
     * <p>
     * If set to YES then the reduction operation is applied also across the batch-index dimension,
     * ie. the loss value is summed over images in the batch and the result of the reduction is written
     * on the first loss image in the batch while the other loss images will be set to zero.
     * If set to NO, then no reductions are performed across the batch dimension and each image in the batch
     * will contain the loss value associated with that one particular image.
     * NOTE: If reductionType == MPSCNNReductionTypeNone, then this flag has no effect on results,
     * that is no reductions are done in this case.
     * NOTE: If reduceAcrossBatch is set to YES and reductionType == MPSCNNReductionTypeMean then
     * the final forward loss value is computed by first summing over the components and then by
     * dividing the result with: number of feature channels * width * height * number of images in the batch.
     * The default value is NO.
     */
    @Generated
    @Selector("setReduceAcrossBatch:")
    public native void setReduceAcrossBatch(boolean value);
}
