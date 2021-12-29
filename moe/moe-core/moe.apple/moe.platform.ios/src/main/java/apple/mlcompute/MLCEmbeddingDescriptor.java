package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * MLCEmbeddingDescriptor
 * <p>
 * The MLCEmbeddingDescriptor specifies an embedding layer descriptor
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCEmbeddingDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCEmbeddingDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCEmbeddingDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCEmbeddingDescriptor allocWithZone(VoidPtr zone);

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
    @Selector("descriptorWithEmbeddingCount:embeddingDimension:")
    public static native MLCEmbeddingDescriptor descriptorWithEmbeddingCountEmbeddingDimension(NSNumber embeddingCount,
            NSNumber embeddingDimension);

    @Generated
    @Selector("descriptorWithEmbeddingCount:embeddingDimension:paddingIndex:maximumNorm:pNorm:scalesGradientByFrequency:")
    public static native MLCEmbeddingDescriptor descriptorWithEmbeddingCountEmbeddingDimensionPaddingIndexMaximumNormPNormScalesGradientByFrequency(
            NSNumber embeddingCount, NSNumber embeddingDimension, NSNumber paddingIndex, NSNumber maximumNorm,
            NSNumber pNorm, boolean scalesGradientByFrequency);

    /**
     * [@property]   embeddingCount
     * <p>
     * The size of the dictionary
     */
    @Generated
    @Selector("embeddingCount")
    public native NSNumber embeddingCount();

    /**
     * [@property]   embeddingDimension
     * <p>
     * The dimension of embedding vectors
     */
    @Generated
    @Selector("embeddingDimension")
    public native NSNumber embeddingDimension();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCEmbeddingDescriptor init();

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
     * [@property]   maximumNorm
     * <p>
     * A float, if set, in the forward pass only, the selected embedding vectors will be re-normalized to have an Lp norm of less than maximumNorm in the dictionary, Default=nil
     */
    @Generated
    @Selector("maximumNorm")
    public native NSNumber maximumNorm();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCEmbeddingDescriptor new_objc();

    /**
     * [@property]   pNorm
     * <p>
     * A float, the p of the Lp norm, can be set to infinity norm by [NSNumber numberWithFloat:INFINITY]. Default=2.0
     */
    @Generated
    @Selector("pNorm")
    public native NSNumber pNorm();

    /**
     * [@property]   paddingIndex
     * <p>
     * If set, the embedding vector at paddingIndex is initialized with zero and will not be updated in gradient pass, Default=nil
     */
    @Generated
    @Selector("paddingIndex")
    public native NSNumber paddingIndex();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   scalesGradientByFrequency
     * <p>
     * If set, the gradients are scaled by the inverse of the frequency of the words in batch before the weight update. Default=NO
     */
    @Generated
    @Selector("scalesGradientByFrequency")
    public native boolean scalesGradientByFrequency();

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
}
