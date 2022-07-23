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
 * [@interface] PHASESwitchNodeDefinition
 * <p>
 * An object for defining a switch sound event node when building a sound event.
 * <p>
 * A switch node switches between its children based on a string parameter.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASESwitchNodeDefinition extends PHASESoundEventNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASESwitchNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addSubtree
     * <p>
     * Add a subtree to a switch node
     *
     * @param subtree     A PHASESoundEventNodeDefinition that will be a child node of this switch node
     * @param switchValue A string value that the metaparameter will use to activate this subtree
     */
    @Generated
    @Selector("addSubtree:switchValue:")
    public native void addSubtreeSwitchValue(PHASESoundEventNodeDefinition subtree, String switchValue);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASESwitchNodeDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASESwitchNodeDefinition allocWithZone(VoidPtr zone);

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
    public native PHASESwitchNodeDefinition init();

    /**
     * initWithSwitchMetaParameterDefinition
     * <p>
     * Create a switch node definition
     *
     * @param switchMetaParameterDefinition A metaparameter definition that wil be used to control the parameter of the
     *                                      switch node at runtime.
     * @return A new PHASESwitchNodeDefinition object
     */
    @Generated
    @Selector("initWithSwitchMetaParameterDefinition:")
    public native PHASESwitchNodeDefinition initWithSwitchMetaParameterDefinition(
            PHASEStringMetaParameterDefinition switchMetaParameterDefinition);

    /**
     * initWithSwitchMetaParameterDefinition:identifier
     * <p>
     * Create a switch node definition
     *
     * @param switchMetaParameterDefinition A metaparameter definition that wil be used to control the parameter of the
     *                                      switch node at runtime.
     * @param identifier                    An optional custom identifier to give to this object
     * @return A new PHASESwitchNodeDefinition object
     */
    @Generated
    @Selector("initWithSwitchMetaParameterDefinition:identifier:")
    public native PHASESwitchNodeDefinition initWithSwitchMetaParameterDefinitionIdentifier(
            PHASEStringMetaParameterDefinition switchMetaParameterDefinition, String identifier);

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
    @Owned
    @Selector("new")
    public static native PHASESwitchNodeDefinition new_objc();

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
     * [@property] mixerDefinition
     * <p>
     * The readonly property that returns the PHASEMixerDefinition this sampler was created with and assigned to.
     */
    @Generated
    @Selector("switchMetaParameterDefinition")
    public native PHASEStringMetaParameterDefinition switchMetaParameterDefinition();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
