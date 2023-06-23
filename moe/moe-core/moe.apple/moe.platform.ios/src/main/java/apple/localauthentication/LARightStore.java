package apple.localauthentication;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Persistent storage for @c LARight instances.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LARightStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LARightStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LARightStore alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LARightStore allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("init")
    public native LARightStore init();

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
    public static native LARightStore new_objc();

    /**
     * Removes all rights stored by the client
     * 
     * @param handler Completion handler with an error on failure.
     */
    @Generated
    @Selector("removeAllRightsWithCompletion:")
    public native void removeAllRightsWithCompletion(
            @NotNull @ObjCBlock(name = "call_removeAllRightsWithCompletion") Block_removeAllRightsWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllRightsWithCompletion {
        @Generated
        void call_removeAllRightsWithCompletion(@Nullable NSError error);
    }

    /**
     * Removes a right from the persistent storage along with its associated resources.
     * 
     * @param right   @c LAPersistedRight instance to remove.
     * @param handler Completion handler with an error on failure.
     */
    @Generated
    @Selector("removeRight:completion:")
    public native void removeRightCompletion(@NotNull LAPersistedRight right,
            @NotNull @ObjCBlock(name = "call_removeRightCompletion") Block_removeRightCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRightCompletion {
        @Generated
        void call_removeRightCompletion(@Nullable NSError error);
    }

    /**
     * Removes right with provided identifier from persistant storage.
     * 
     * @param identifier Identifier of @c LAPersistedRight instance to remove.
     * @param handler    Completion handler with an error on failure.
     */
    @Generated
    @Selector("removeRightForIdentifier:completion:")
    public native void removeRightForIdentifierCompletion(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_removeRightForIdentifierCompletion") Block_removeRightForIdentifierCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeRightForIdentifierCompletion {
        @Generated
        void call_removeRightForIdentifierCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Fetches a right stored under the given identifier.
     * 
     * @param identifier Identifier associated with a previously stored right.
     * @param handler    Completion handler with the fetched right or an error on failure.
     */
    @Generated
    @Selector("rightForIdentifier:completion:")
    public native void rightForIdentifierCompletion(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_rightForIdentifierCompletion") Block_rightForIdentifierCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_rightForIdentifierCompletion {
        @Generated
        void call_rightForIdentifierCompletion(@Nullable LAPersistedRight arg0, @Nullable NSError arg1);
    }

    /**
     * Persists a right for later usage.
     * 
     * @param right      @c LARight instance to store.
     * @param identifier Identifier to be associated with the right. Useful for later retrieval.
     * @param handler    Completion handler with the persisted right or an error on failure.
     */
    @Generated
    @Selector("saveRight:identifier:completion:")
    public native void saveRightIdentifierCompletion(@NotNull LARight right, @NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_saveRightIdentifierCompletion") Block_saveRightIdentifierCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRightIdentifierCompletion {
        @Generated
        void call_saveRightIdentifierCompletion(@Nullable LAPersistedRight arg0, @Nullable NSError arg1);
    }

    /**
     * Persists a right for later usage.
     * 
     * @param right      @c LARight instance to store.
     * @param identifier Identifier to be associated with the right. Useful for later retrieval.
     * @param secret     Secret data to be associated with the provided right.
     * @param handler    Completion handler with the persisted right or an error on failure.
     */
    @Generated
    @Selector("saveRight:identifier:secret:completion:")
    public native void saveRightIdentifierSecretCompletion(@NotNull LARight right, @NotNull String identifier,
            @NotNull NSData secret,
            @NotNull @ObjCBlock(name = "call_saveRightIdentifierSecretCompletion") Block_saveRightIdentifierSecretCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRightIdentifierSecretCompletion {
        @Generated
        void call_saveRightIdentifierSecretCompletion(@Nullable LAPersistedRight arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shared instance of @c LARightStore.
     */
    @NotNull
    @Generated
    @Selector("sharedStore")
    public static native LARightStore sharedStore();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}