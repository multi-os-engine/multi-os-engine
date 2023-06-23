package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * [@interface] PHASERandomNodeDefinition
 * 
 * An object for defining a random sound event node when building a sound event.
 * 
 * A random node selects one of its children based on a weighted random choice.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASERandomNodeDefinition extends PHASESoundEventNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASERandomNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addSubtree
     * 
     * Add a subtree to a random node
     * 
     * @param subtree
     *                A PHASESoundEventNodeDefinition that will be a child node of this random node
     * @param weight
     *                The probability weight of this subtree. Higher numbers compared to other subtree weights will
     *                increase the likelihood of being
     *                chosen. This value must be greater than or equal to 1, and is clamped otherwise.
     */
    @Generated
    @Selector("addSubtree:weight:")
    public native void addSubtreeWeight(@NotNull PHASESoundEventNodeDefinition subtree, @NotNull NSNumber weight);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASERandomNodeDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASERandomNodeDefinition allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * init
     * 
     * Create a random node definition
     * 
     * @return
     *         A new PHASERandomNodeDefinition object
     */
    @Generated
    @Selector("init")
    public native PHASERandomNodeDefinition init();

    /**
     * initWithIdentifier
     * 
     * Create a random node definition
     * 
     * @param identifier
     *                   An optional custom identifier to give to this object
     * @return
     *         A new PHASERandomNodeDefinition object
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native PHASERandomNodeDefinition initWithIdentifier(@NotNull String identifier);

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
    public static native PHASERandomNodeDefinition new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] uniqueSelectionQueueLength
     * 
     * Subtrees will not be repeated until after this random node is activated uniqueSelectionQueueLength number of
     * times.
     */
    @Generated
    @Selector("setUniqueSelectionQueueLength:")
    public native void setUniqueSelectionQueueLength(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] uniqueSelectionQueueLength
     * 
     * Subtrees will not be repeated until after this random node is activated uniqueSelectionQueueLength number of
     * times.
     */
    @Generated
    @Selector("uniqueSelectionQueueLength")
    @NInt
    public native long uniqueSelectionQueueLength();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
