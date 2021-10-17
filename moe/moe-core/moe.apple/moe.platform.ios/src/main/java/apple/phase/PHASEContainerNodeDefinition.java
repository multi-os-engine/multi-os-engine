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
 * [@interface] PHASEContainerNodeDefinition
 * <p>
 * An object for defining a container sound event node when building a sound event.
 * <p>
 * A container node plays back all its children at once.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEContainerNodeDefinition extends PHASESoundEventNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEContainerNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addSubtree
     * <p>
     * Add a subtree to this node
     *
     * @param subtree Add a subtree of PHASESoundEventNodeDefinition nodes beneath this node.
     */
    @Generated
    @Selector("addSubtree:")
    public native void addSubtree(PHASESoundEventNodeDefinition subtree);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEContainerNodeDefinition alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHASEContainerNodeDefinition allocWithZone(VoidPtr zone);

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

    /**
     * init
     * <p>
     * Create a container node definition
     *
     * @return A new PHASEContainerNodeDefinition object
     */
    @Generated
    @Selector("init")
    public native PHASEContainerNodeDefinition init();

    /**
     * initWithIdentifier
     * <p>
     * Create a container node definition
     *
     * @param identifier An optional custom identifier to give to this object
     * @return A new PHASEContainerNodeDefinition object
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native PHASEContainerNodeDefinition initWithIdentifier(String identifier);

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
     * new
     * <p>
     * Create a container node definition
     *
     * @return A new PHASEContainerNodeDefinition object
     */
    @Generated
    @Owned
    @Selector("new")
    public static native PHASEContainerNodeDefinition new_objc();

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
