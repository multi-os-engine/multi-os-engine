package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] PHASEMappedMetaParameterDefinition
 * 
 * An object to define a Mapped Metaparameter when building an sound event.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEMappedMetaParameterDefinition extends PHASENumberMetaParameterDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEMappedMetaParameterDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEMappedMetaParameterDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEMappedMetaParameterDefinition allocWithZone(VoidPtr zone);

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

    /**
     * [@property] envelope
     * 
     * An Envelope to define segments of curves
     */
    @NotNull
    @Generated
    @Selector("envelope")
    public native PHASEEnvelope envelope();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEMappedMetaParameterDefinition init();

    /**
     * initWithInputMetaParameterDefinition
     * 
     * Create a new mapped range metaparameter definition
     * 
     * @param inputMetaParameterDefinition
     *                                     The metaparameter that will provide an input for this mapped metaparameter
     * @param envelope
     *                                     The envelope to use.
     * @return
     *         The new PHASEMappedMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithInputMetaParameterDefinition:envelope:")
    public native PHASEMappedMetaParameterDefinition initWithInputMetaParameterDefinitionEnvelope(
            @NotNull PHASENumberMetaParameterDefinition inputMetaParameterDefinition, @NotNull PHASEEnvelope envelope);

    /**
     * initWithInputMetaParameterDefinition:identifier
     * 
     * Create a new mapped range metaparameter definition
     * 
     * @param inputMetaParameterDefinition
     *                                     The metaparameter that will provide an input for this mapped metaparameter
     * @param envelope
     *                                     The envelope to use.
     * @param identifier
     *                                     An optional custom identifier to give to this object
     * @return
     *         The new PHASEMappedMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithInputMetaParameterDefinition:envelope:identifier:")
    public native PHASEMappedMetaParameterDefinition initWithInputMetaParameterDefinitionEnvelopeIdentifier(
            @NotNull PHASENumberMetaParameterDefinition inputMetaParameterDefinition, @NotNull PHASEEnvelope envelope,
            @NotNull String identifier);

    @Generated
    @Selector("initWithValue:")
    public native PHASEMappedMetaParameterDefinition initWithValue(double value);

    @Generated
    @Selector("initWithValue:identifier:")
    public native PHASEMappedMetaParameterDefinition initWithValueIdentifier(double value, @NotNull String identifier);

    @Generated
    @Selector("initWithValue:minimum:maximum:")
    public native PHASEMappedMetaParameterDefinition initWithValueMinimumMaximum(double value, double minimum,
            double maximum);

    @Generated
    @Selector("initWithValue:minimum:maximum:identifier:")
    public native PHASEMappedMetaParameterDefinition initWithValueMinimumMaximumIdentifier(double value, double minimum,
            double maximum, @NotNull String identifier);

    /**
     * [@property] inputMetaParameterDefinition
     * 
     * The readonly PHASENumberMetaParameterDefinition that this metaparameter definition was initialized with
     */
    @NotNull
    @Generated
    @Selector("inputMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition inputMetaParameterDefinition();

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
    public static native PHASEMappedMetaParameterDefinition new_objc();

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
}
