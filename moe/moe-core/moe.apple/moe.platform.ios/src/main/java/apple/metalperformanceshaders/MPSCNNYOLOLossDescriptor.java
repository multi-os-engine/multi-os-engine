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

    @Generated
    @Selector("WHLossDescriptor")
    public native MPSCNNLossDescriptor WHLossDescriptor();

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classesLossDescriptor")
    public native MPSCNNLossDescriptor classesLossDescriptor();

    @Generated
    @Selector("cnnLossDescriptorWithXYLossType:WHLossType:confidenceLossType:classesLossType:reductionType:anchorBoxes:numberOfAnchorBoxes:")
    public static native MPSCNNYOLOLossDescriptor cnnLossDescriptorWithXYLossTypeWHLossTypeConfidenceLossTypeClassesLossTypeReductionTypeAnchorBoxesNumberOfAnchorBoxes(
            int XYLossType, int WHLossType, int confidenceLossType, int classesLossType, int reductionType,
            NSData anchorBoxes, @NUInt long numberOfAnchorBoxes);

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

    @Generated
    @Selector("maxIOUForObjectAbsence")
    public native float maxIOUForObjectAbsence();

    @Generated
    @Selector("minIOUForObjectPresence")
    public native float minIOUForObjectPresence();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfAnchorBoxes")
    @NUInt
    public native long numberOfAnchorBoxes();

    @Generated
    @Selector("reductionType")
    public native int reductionType();

    @Generated
    @Selector("rescore")
    public native boolean rescore();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scaleClass")
    public native float scaleClass();

    @Generated
    @Selector("scaleNoObject")
    public native float scaleNoObject();

    @Generated
    @Selector("scaleObject")
    public native float scaleObject();

    @Generated
    @Selector("scaleWH")
    public native float scaleWH();

    @Generated
    @Selector("scaleXY")
    public native float scaleXY();

    @Generated
    @Selector("setAnchorBoxes:")
    public native void setAnchorBoxes(NSData value);

    @Generated
    @Selector("setClassesLossDescriptor:")
    public native void setClassesLossDescriptor(MPSCNNLossDescriptor value);

    @Generated
    @Selector("setConfidenceLossDescriptor:")
    public native void setConfidenceLossDescriptor(MPSCNNLossDescriptor value);

    @Generated
    @Selector("setMaxIOUForObjectAbsence:")
    public native void setMaxIOUForObjectAbsence(float value);

    @Generated
    @Selector("setMinIOUForObjectPresence:")
    public native void setMinIOUForObjectPresence(float value);

    @Generated
    @Selector("setNumberOfAnchorBoxes:")
    public native void setNumberOfAnchorBoxes(@NUInt long value);

    @Generated
    @Selector("setReductionType:")
    public native void setReductionType(int value);

    @Generated
    @Selector("setRescore:")
    public native void setRescore(boolean value);

    @Generated
    @Selector("setScaleClass:")
    public native void setScaleClass(float value);

    @Generated
    @Selector("setScaleNoObject:")
    public native void setScaleNoObject(float value);

    @Generated
    @Selector("setScaleObject:")
    public native void setScaleObject(float value);

    @Generated
    @Selector("setScaleWH:")
    public native void setScaleWH(float value);

    @Generated
    @Selector("setScaleXY:")
    public native void setScaleXY(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWHLossDescriptor:")
    public native void setWHLossDescriptor(MPSCNNLossDescriptor value);

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
}