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
 * MLCLSTMDescriptor
 * <p>
 * The MLCLSTMDescriptor specifies a LSTM descriptor
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLSTMDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLSTMDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLSTMDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MLCLSTMDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   batchFirst
     * <p>
     * LSTM only supports batchFirst=YES. This means the input and output will have shape [batch size, time steps, feature]. Default is YES.
     */
    @Generated
    @Selector("batchFirst")
    public native boolean batchFirst();

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
     * Creates a LSTM descriptor with batchFirst = YES
     *
     * @param inputSize  The number of expected features in the input
     * @param hiddenSize The number of features in the hidden state
     * @param layerCount Number of recurrent layers
     * @return A valid MLCLSTMDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("descriptorWithInputSize:hiddenSize:layerCount:")
    public static native MLCLSTMDescriptor descriptorWithInputSizeHiddenSizeLayerCount(@NUInt long inputSize,
            @NUInt long hiddenSize, @NUInt long layerCount);

    @Generated
    @Selector("descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:dropout:")
    public static native MLCLSTMDescriptor descriptorWithInputSizeHiddenSizeLayerCountUsesBiasesBatchFirstIsBidirectionalDropout(
            @NUInt long inputSize, @NUInt long hiddenSize, @NUInt long layerCount, boolean usesBiases,
            boolean batchFirst, boolean isBidirectional, float dropout);

    @Generated
    @Selector("descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:returnsSequences:dropout:")
    public static native MLCLSTMDescriptor descriptorWithInputSizeHiddenSizeLayerCountUsesBiasesBatchFirstIsBidirectionalReturnsSequencesDropout(
            @NUInt long inputSize, @NUInt long hiddenSize, @NUInt long layerCount, boolean usesBiases,
            boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout);

    /**
     * Creates a LSTM descriptor.
     *
     * @param inputSize        The number of expected features in the input
     * @param hiddenSize       The number of features in the hidden state
     * @param layerCount       Number of recurrent layers
     * @param usesBiases       If NO, the layer does not use bias weights.  Default: YES
     * @param batchFirst       LSTM only supports batchFirst=YES. This means the input and output will have shape [batch size, time steps, feature]. Default is YES.
     * @param isBidirectional  If YES, becomes a bi-directional LSTM.  Default: NO
     * @param returnsSequences if YES return output for all sequences else return output only for the last sequences. Default: YES
     * @param dropout          If non-zero, introduces a dropout layer on the outputs of each LSTM layer except the last layer
     *                         with dropout probability equal to dropout.
     * @param resultMode       expected result tensors. MLCLSTMResultModeOutput returns output data. MLCLSTMResultModeOutputAndStates returns
     *                         output data, last hidden state h_n, and last cell state c_n. Default: MLCLSTMResultModeOutput.
     * @return A valid MLCLSTMDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:returnsSequences:dropout:resultMode:")
    public static native MLCLSTMDescriptor descriptorWithInputSizeHiddenSizeLayerCountUsesBiasesBatchFirstIsBidirectionalReturnsSequencesDropoutResultMode(
            @NUInt long inputSize, @NUInt long hiddenSize, @NUInt long layerCount, boolean usesBiases,
            boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout, long resultMode);

    /**
     * Creates a LSTM descriptor descriptor with batchFirst = YES
     *
     * @param inputSize       The number of expected features in the input
     * @param hiddenSize      The number of features in the hidden state
     * @param layerCount      Number of recurrent layers
     * @param usesBiases      If NO, the layer does not use bias weights.  Default: YES
     * @param isBidirectional If YES, becomes a bi-directional LSTM.  Default: NO
     * @param dropout         If non-zero, introduces a dropout layer on the outputs of each LSTM layer except the last layer
     *                        with dropout probability equal to dropout.
     * @return A valid MLCLSTMDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("descriptorWithInputSize:hiddenSize:layerCount:usesBiases:isBidirectional:dropout:")
    public static native MLCLSTMDescriptor descriptorWithInputSizeHiddenSizeLayerCountUsesBiasesIsBidirectionalDropout(
            @NUInt long inputSize, @NUInt long hiddenSize, @NUInt long layerCount, boolean usesBiases,
            boolean isBidirectional, float dropout);

    /**
     * [@property]   dropout
     * <p>
     * If non-zero, intrdouces a dropout layer on the outputs of each LSTM layer
     * except the last layer, with dropout probablity equal to dropout.  Default is 0.0.
     */
    @Generated
    @Selector("dropout")
    public native float dropout();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property]   hiddenSize
     * <p>
     * The number of feature channels in the hidden state
     */
    @Generated
    @Selector("hiddenSize")
    @NUInt
    public native long hiddenSize();

    @Generated
    @Selector("init")
    public native MLCLSTMDescriptor init();

    /**
     * [@property]   inputSize
     * <p>
     * The number of expected feature channels in the input
     */
    @Generated
    @Selector("inputSize")
    @NUInt
    public native long inputSize();

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

    /**
     * [@property]   isBidirectional
     * <p>
     * If YES, becomes a bidirectional LSTM.  Default is NO.
     */
    @Generated
    @Selector("isBidirectional")
    public native boolean isBidirectional();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]   layerCount
     * <p>
     * The number of recurrent layers.  Default is 1.
     */
    @Generated
    @Selector("layerCount")
    @NUInt
    public native long layerCount();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLSTMDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   resultMode
     * <p>
     * MLCLSTMResultModeOutput returns output data. MLCLSTMResultModeOutputAndStates returns
     * output data, last hidden state h_n, and last cell state c_n. Default MLCLSTMResultModeOutput.
     */
    @Generated
    @Selector("resultMode")
    public native long resultMode();

    /**
     * [@property]   returnsSequences
     * <p>
     * if YES return output for all sequences else return output only for the last sequences. Default: YES
     */
    @Generated
    @Selector("returnsSequences")
    public native boolean returnsSequences();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]   usesBiases
     * <p>
     * If NO, the layer does not use bias terms.  Default is YES.
     */
    @Generated
    @Selector("usesBiases")
    public native boolean usesBiases();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
