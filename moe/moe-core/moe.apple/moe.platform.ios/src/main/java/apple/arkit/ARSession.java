package apple.arkit;

import apple.NSObject;
import apple.arkit.protocol.ARSessionDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The ARSession class configures and runs different Augmented Reality techniques on a device.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ARSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds an anchor to the session.
     * 
     * The anchor will be added in the next frame update.
     * 
     * @param anchor The anchor to add.
     */
    @Generated
    @Selector("addAnchor:")
    public native void addAnchor(@NotNull ARAnchor anchor);

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ARSession allocWithZone(VoidPtr zone);

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

    /**
     * The configuration currently being used by the session.
     */
    @Nullable
    @Generated
    @Selector("configuration")
    public native ARConfiguration configuration();

    /**
     * The current frame of the session.
     */
    @Nullable
    @Generated
    @Selector("currentFrame")
    public native ARFrame currentFrame();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * A delegate for receiving ARSession updates.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ARSessionDelegate delegate();

    /**
     * The dispatch queue on which the delegate calls are performed.
     * 
     * If not provided or nil, delegate calls will be performed on the main queue.
     */
    @Nullable
    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARSession init();

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
    public static native ARSession new_objc();

    /**
     * Pauses the session.
     * 
     * Once paused, no more updates will be received from the
     * session until run is called again.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * Removes an anchor from the session.
     * 
     * The anchor will be removed from subsequent frame updates.
     * 
     * @param anchor The anchor to remove.
     */
    @Generated
    @Selector("removeAnchor:")
    public native void removeAnchor(@NotNull ARAnchor anchor);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Runs the session with the provided configuration.
     * 
     * Calling run on a session that has already started will
     * transition immediately to using the new configuration.
     * 
     * @param configuration The configuration to use.
     */
    @Generated
    @Selector("runWithConfiguration:")
    public native void runWithConfiguration(@NotNull ARConfiguration configuration);

    /**
     * Runs the session with the provided configuration and options.
     * 
     * Calling run on a session that has already started will
     * transition immediately to using the new configuration. Options
     * can be used to alter the default behavior when transitioning configurations.
     * 
     * @param configuration The configuration to use.
     * @param options       The run options to use.
     */
    @Generated
    @Selector("runWithConfiguration:options:")
    public native void runWithConfigurationOptions(@NotNull ARConfiguration configuration, @NUInt long options);

    /**
     * A delegate for receiving ARSession updates.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) ARSessionDelegate value);

    /**
     * A delegate for receiving ARSession updates.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) ARSessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The dispatch queue on which the delegate calls are performed.
     * 
     * If not provided or nil, delegate calls will be performed on the main queue.
     */
    @Generated
    @Selector("setDelegateQueue:")
    public native void setDelegateQueue(@Nullable NSObject value);

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

    /**
     * Copies the current state of the world being tracked by the session.
     * 
     * A world map is only provided when running an ARWorldTrackingConfiguration.
     * 
     * @param completionHandler The completion handler to call when the get has completed. This handler is executed
     *                          on the session's delegate queue. The completion handler takes the following parameters:
     *                          worldMap - The current world map or nil if unavailable.
     *                          error - An error that indicates why the world map is unavailable, or nil if a world map
     *                          was provided.
     * 
     *                          API-Since: 12.0
     */
    @Generated
    @Selector("getCurrentWorldMapWithCompletionHandler:")
    public native void getCurrentWorldMapWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getCurrentWorldMapWithCompletionHandler") Block_getCurrentWorldMapWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCurrentWorldMapWithCompletionHandler {
        @Generated
        void call_getCurrentWorldMapWithCompletionHandler(@Nullable ARWorldMap worldMap, @Nullable NSError error);
    }

    /**
     * Unique identifier of the running session.
     * 
     * The identifier may change after calling runWithConfiguration.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native NSUUID identifier();

    /**
     * Perform a raycast.
     * 
     * @param query Raycast query used for raycasting.
     * @return List of raycast results, sorted from nearest to farthest (in distance from the camera). The results could
     *         be empty if raycast fails.
     * 
     *         API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("raycast:")
    public native NSArray<? extends ARRaycastResult> raycast(@NotNull ARRaycastQuery query);

    /**
     * Perform a tracked raycast.
     * 
     * The session performs continuous raycasting and calls the update handler with the updated results.
     * The ARTrackedRaycast object returned can be used to update the raycast with a new raycast query or stop
     * raycasting.
     * 
     * @param query         Raycast query used for raycasting.
     * @param updateHandler update handler where updated list of results, sorted from nearest to farthest (in distance
     *                      from
     *                      the camera) are delivered. updateHandler will be called on session's delegate queue.
     * @return Tracked raycast object used to update or stop raycasting. This could be nil if the raycast fails or if
     *         the
     *         configuration is not `ARWorldTrackingConfiguration` or its subclasses.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("trackedRaycast:updateHandler:")
    public native ARTrackedRaycast trackedRaycastUpdateHandler(@NotNull ARRaycastQuery query,
            @NotNull @ObjCBlock(name = "call_trackedRaycastUpdateHandler") Block_trackedRaycastUpdateHandler updateHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_trackedRaycastUpdateHandler {
        @Generated
        void call_trackedRaycastUpdateHandler(@NotNull NSArray<? extends ARRaycastResult> arg0);
    }

    /**
     * Update session with collaboration data.
     * 
     * Use this to update the session with collaboration data received from other participants.
     * 
     * @param collaborationData Collaboration data for updating the session.
     * @see ARCollaborationData
     * 
     *      API-Since: 13.0
     */
    @Generated
    @Selector("updateWithCollaborationData:")
    public native void updateWithCollaborationData(@NotNull ARCollaborationData collaborationData);

    /**
     * Requests a single, high resolution frame be captured at that moment in time.
     * 
     * Some video formats do not support a significantly higher resolution than the streaming camera resolution. Use
     * the @c isRecommendedForHighResolutionFrameCapturing method on the video format to check if the format is
     * recommended.
     * 
     * @see -[ARVideoFormat isRecommendedForHighResolutionFrameCapturing]
     * @param completion Block being called when the call completes.
     * 
     *                   API-Since: 16.0
     */
    @Generated
    @Selector("captureHighResolutionFrameWithCompletion:")
    public native void captureHighResolutionFrameWithCompletion(
            @NotNull @ObjCBlock(name = "call_captureHighResolutionFrameWithCompletion") Block_captureHighResolutionFrameWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_captureHighResolutionFrameWithCompletion {
        @Generated
        void call_captureHighResolutionFrameWithCompletion(@Nullable ARFrame frame, @Nullable NSError error);
    }
}
