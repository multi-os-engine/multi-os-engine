package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * MLCMultiheadAttentionDescriptor
 * <p>
 * The MLCMultiheadAttentionDescriptor specifies a Multi-Head Attention descriptor
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCMultiheadAttentionDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCMultiheadAttentionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * if true, a row of zeroes is added to projected key and value. Default = false
     */
    @Generated
    @Selector("addsZeroAttention")
    public native boolean addsZeroAttention();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCMultiheadAttentionDescriptor alloc();

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

    /**
     * A multi-head attention layer descriptor
     *
     * @param modelDimension total dimension of model space
     * @param headCount      number of parallel attention heads
     * @return A valid MultiheadAttention layer descriptor
     */
    @Generated
    @Selector("descriptorWithModelDimension:headCount:")
    public static native MLCMultiheadAttentionDescriptor descriptorWithModelDimensionHeadCount(
            @NUInt long modelDimension, @NUInt long headCount);

    /**
     * A multi-head attention layer descriptor
     *
     * @param modelDimension     total dimension of model space
     * @param keyDimension       total dimension of key space. Default = modelDimension
     * @param valueDimension     total dimension of value space. Default = modelDimension
     * @param headCount          number of parallel attention heads
     * @param dropout            optional, a dropout layer applied to the output projection weights. Default = 0.0f
     * @param hasBiases          if true, bias will be added to query/key/value/output projections. Default = YES
     * @param hasAttentionBiases if true, an array of biases is added to key and value respectively. Default = NO
     * @param addsZeroAttention  if true, a row of zeroes is added to projected key and value. Default = NO
     * @return A new MultiheadAttention layer descriptor
     */
    @Generated
    @Selector("descriptorWithModelDimension:keyDimension:valueDimension:headCount:dropout:hasBiases:hasAttentionBiases:addsZeroAttention:")
    public static native MLCMultiheadAttentionDescriptor descriptorWithModelDimensionKeyDimensionValueDimensionHeadCountDropoutHasBiasesHasAttentionBiasesAddsZeroAttention(
            @NUInt long modelDimension, @NUInt long keyDimension, @NUInt long valueDimension, @NUInt long headCount,
            float dropout, boolean hasBiases, boolean hasAttentionBiases, boolean addsZeroAttention);

    /**
     * a droupout layer applied to the output projection weights. Default = 0.0
     */
    @Generated
    @Selector("dropout")
    public native float dropout();

    /**
     * if true, an array of biases is added to key and value respectively. Default = false
     */
    @Generated
    @Selector("hasAttentionBiases")
    public native boolean hasAttentionBiases();

    /**
     * if true, bias is used for query/key/value/output projections. Default = true
     */
    @Generated
    @Selector("hasBiases")
    public native boolean hasBiases();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * number of parallel attention heads
     */
    @Generated
    @Selector("headCount")
    @NUInt
    public native long headCount();

    @Generated
    @Selector("init")
    public native MLCMultiheadAttentionDescriptor init();

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

    /**
     * total dimension of key space, Default = modelDimension
     */
    @Generated
    @Selector("keyDimension")
    @NUInt
    public native long keyDimension();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * model or embedding dimension
     */
    @Generated
    @Selector("modelDimension")
    @NUInt
    public native long modelDimension();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * total dimension of value space, Default = modelDimension
     */
    @Generated
    @Selector("valueDimension")
    @NUInt
    public native long valueDimension();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
