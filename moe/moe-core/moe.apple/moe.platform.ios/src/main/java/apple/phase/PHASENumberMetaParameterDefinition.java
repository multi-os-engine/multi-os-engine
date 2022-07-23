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

/**
 * [@interface] PHASENumberMetaParameterDefinition
 * <p>
 * A metaparameter that has a numeric value
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASENumberMetaParameterDefinition extends PHASEMetaParameterDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASENumberMetaParameterDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASENumberMetaParameterDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASENumberMetaParameterDefinition allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASENumberMetaParameterDefinition init();

    /**
     * initWithValue
     * <p>
     * Create a new numeric metaparameter definition
     *
     * @param value The initial value of the metaparameter
     * @return The new PHASENumberMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithValue:")
    public native PHASENumberMetaParameterDefinition initWithValue(double value);

    /**
     * initWithValue:identifier
     * <p>
     * Create a new numeric metaparameter definition
     *
     * @param value      The initial value of the metaparameter
     * @param identifier An optional custom identifier to give to this object
     * @return The new PHASENumberMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithValue:identifier:")
    public native PHASENumberMetaParameterDefinition initWithValueIdentifier(double value, String identifier);

    /**
     * initWithValue:minimum:maximum
     * <p>
     * Create a new numeric metaparameter definition and a predefined min and maximum range
     *
     * @param value   The initial value of the metaparameter
     * @param minimum The minimum value for this metaparameter. Values set to this metaparamter less than the minimum
     *                will be clamped.
     * @param maximum The maximum value for this metaparameter. Values set to this metaparamter less than the minimum
     *                will be clamped.
     * @return The new PHASENumberMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithValue:minimum:maximum:")
    public native PHASENumberMetaParameterDefinition initWithValueMinimumMaximum(double value, double minimum,
            double maximum);

    /**
     * initWithValue:minimum:maximum:identifier
     * <p>
     * Create a new numeric metaparameter definition and a predefined min and maximum range
     *
     * @param value      The initial value of the metaparameter
     * @param minimum    The minimum value for this metaparameter. Values set to this metaparamter less than the minimum
     *                   will be clamped.
     * @param maximum    The maximum value for this metaparameter. Values set to this metaparamter less than the minimum
     *                   will be clamped.
     * @param identifier An optional custom identifier to give to this object
     * @return The new PHASENumberMetaParameterDefinition object
     */
    @Generated
    @Selector("initWithValue:minimum:maximum:identifier:")
    public native PHASENumberMetaParameterDefinition initWithValueMinimumMaximumIdentifier(double value, double minimum,
            double maximum, String identifier);

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
     * [@property] maximum
     * <p>
     * The readonly maximum that this metaparameter definition was initialized with
     */
    @Generated
    @Selector("maximum")
    public native double maximum();

    /**
     * [@property] minimum
     * <p>
     * The readonly minimum that this metaparameter definition was initialized with
     */
    @Generated
    @Selector("minimum")
    public native double minimum();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASENumberMetaParameterDefinition new_objc();

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
