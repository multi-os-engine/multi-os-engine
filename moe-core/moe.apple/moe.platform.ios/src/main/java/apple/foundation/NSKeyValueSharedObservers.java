package apple.foundation;

import apple.NSObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * A collection of key-value observations which may be registered with multiple
 * observable objects
 * 
 * API-Since: 18.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSKeyValueSharedObservers extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSKeyValueSharedObservers(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add a new observer to the collection.
     * 
     * This method works like `-[NSObject addObserver: forKey: options: context:]`,
     * but observations on nested and computed properties are disallowed. Observers
     * are not registered until `setSharedObservers` is called on the observable.
     * 
     * - Parameter observer: The observer object to register for KVO notifications.
     * The observer must implement the key-value observing method ``observeValue:
     * forKeyPath: of: change: context:``
     * - Parameter key: key of the property being observed. This cannot be a nested
     * key path or a computed property
     * - Parameter options: A combination of NSKeyValueObservingOptions values that
     * specify what is included in observation notifications. For possible values
     * see NSKeyValueObservingOptions.
     * - Parameter context: Arbitrary data which is passed to the observer object
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addSharedObserver:forKey:options:context:")
    public native void addSharedObserverForKeyOptionsContext(@NotNull NSObject observer, @NotNull String key,
            @NUInt long options, @Nullable VoidPtr context);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSKeyValueSharedObservers alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSKeyValueSharedObservers allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native NSKeyValueSharedObservers init();

    /**
     * A new collection of observables for an observable object of the given class
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithObservableClass:")
    public native NSKeyValueSharedObservers initWithObservableClass(@NotNull Class observableClass);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSKeyValueSharedObservers new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A momentary snapshot of all observers added to the collection thus far, that
     * can be assigned to an observable using ``-[NSObject setSharedObservers:]``
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("snapshot")
    @NotNull
    public native NSKeyValueSharedObserversSnapshot snapshot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}