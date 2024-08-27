package apple.eventkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSExtensionRequestHandling;
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
 * EKVirtualConferenceProvider
 * 
 * Provides virtual conferences to Calendar.
 * 
 * Subclass this class in your extension and override the below two methods.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKVirtualConferenceProvider extends NSObject implements NSExtensionRequestHandling {
    static {
        NatJ.register();
    }

    @Generated
    protected EKVirtualConferenceProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKVirtualConferenceProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKVirtualConferenceProvider allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("beginRequestWithExtensionContext:")
    public native void beginRequestWithExtensionContext(@NotNull NSExtensionContext context);

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
     * fetchAvailableRoomTypesWithCompletionHandler:
     * 
     * Called to determine the available virtual conference room types that the user can add to a calendar event.
     * 
     * Your extension must override this method in order to present virtual conference options in Calendar's UI.
     * When your extension has finished determining what room types are available, call the completion handler with
     * an array of EKVirtualConferenceRoomTypeDescriptors. Most extensions will only need to provide one room type.
     * 
     * @param completionHandler A block to call when your extension has finished retrieving available room types. If
     *                          your extension is unable to provide any room types at this time, call this block with
     *                          nil
     *                          for the first argument and an appropriate NSError object for the second argument. Do not
     *                          call this block with nil for both arguments. Similarly, do not call this block with both
     *                          a non-nil array and a non-nil NSError. This block must be called when your extension has
     *                          finished its work.
     */
    @Generated
    @Selector("fetchAvailableRoomTypesWithCompletionHandler:")
    public native void fetchAvailableRoomTypesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_fetchAvailableRoomTypesWithCompletionHandler") Block_fetchAvailableRoomTypesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAvailableRoomTypesWithCompletionHandler {
        @Generated
        void call_fetchAvailableRoomTypesWithCompletionHandler(
                @Nullable NSArray<? extends EKVirtualConferenceRoomTypeDescriptor> arg0, @Nullable NSError arg1);
    }

    /**
     * fetchVirtualConferenceForIdentifier:completionHandler:
     * 
     * Called to fetch the specific virtual conference details to add to an event.
     * 
     * Your extension must override this method in order to add virtual conferences to calendar events.
     * When your extension has finished retrieving the requested virtual conference details, create an
     * EKVirtualConferenceDescriptor object containing the virtual conference details and call the completion handler
     * with the EKVirtualConferenceDescriptor object as the first argument.
     * 
     * @param identifier        Represents the room type that the user chose. This is the same identifier that your
     *                          extension
     *                          chose for this EKVirtualConferenceRoomTypeDescriptor in an earlier call to
     *                          fetchAvailableRoomTypesWithCompletionHandler:.
     * @param completionHandler A block to call when your extension has finished retrieving the virtual conference
     *                          details.
     *                          If your extension is unable to retrieve virtual conference details at this time (for
     *                          example,
     *                          because network access is not available), call this block with nil for the first
     *                          argument and
     *                          an appropriate NSError object for the second argument. Do not call this block with nil
     *                          for
     *                          both arguments. Similarly, do not call this block with both a non-nil
     *                          EKVirtualConferenceDescriptor and a non-nil NSError. This block must be called when your
     *                          extension has finished its work.
     */
    @Generated
    @Selector("fetchVirtualConferenceForIdentifier:completionHandler:")
    public native void fetchVirtualConferenceForIdentifierCompletionHandler(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_fetchVirtualConferenceForIdentifierCompletionHandler") Block_fetchVirtualConferenceForIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchVirtualConferenceForIdentifierCompletionHandler {
        @Generated
        void call_fetchVirtualConferenceForIdentifierCompletionHandler(@Nullable EKVirtualConferenceDescriptor arg0,
                @Nullable NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native EKVirtualConferenceProvider init();

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
    public static native EKVirtualConferenceProvider new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
