package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.struct.MPSDimensionSlice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.general.ptr.NUIntPtr;
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
public class MPSNDArrayDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayDescriptor alloc();

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
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptorWithDataType:dimensionCount:dimensionSizes:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeDimensionCountDimensionSizes(int dataType,
            @NUInt long numberOfDimensions, NUIntPtr dimensionSizes);

    @Generated
    @Variadic()
    @Selector("descriptorWithDataType:dimensionSizes:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeDimensionSizes(int dataType, @NUInt long dimension0,
            Object... varargs);

    @Generated
    @Selector("descriptorWithDataType:shape:")
    public static native MPSNDArrayDescriptor descriptorWithDataTypeShape(int dataType,
            NSArray<? extends NSNumber> shape);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayDescriptor init();

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
    @Selector("lengthOfDimension:")
    @NUInt
    public native long lengthOfDimension(@NUInt long dimensionIndex);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfDimensions")
    @NUInt
    public native long numberOfDimensions();

    @Generated
    @Selector("reshapeWithDimensionCount:dimensionSizes:")
    public native void reshapeWithDimensionCountDimensionSizes(@NUInt long numberOfDimensions, NUIntPtr dimensionSizes);

    @Generated
    @Selector("reshapeWithShape:")
    public native void reshapeWithShape(NSArray<? extends NSNumber> shape);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDataType:")
    public native void setDataType(int value);

    @Generated
    @Selector("setNumberOfDimensions:")
    public native void setNumberOfDimensions(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sliceDimension:withSubrange:")
    public native void sliceDimensionWithSubrange(@NUInt long dimensionIndex, @ByValue MPSDimensionSlice subRange);

    @Generated
    @Selector("sliceRangeForDimension:")
    @ByValue
    public native MPSDimensionSlice sliceRangeForDimension(@NUInt long dimensionIndex);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transposeDimension:withDimension:")
    public native void transposeDimensionWithDimension(@NUInt long dimensionIndex, @NUInt long dimensionIndex2);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}