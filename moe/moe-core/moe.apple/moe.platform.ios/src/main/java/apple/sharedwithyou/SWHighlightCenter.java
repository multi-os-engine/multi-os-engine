package apple.sharedwithyou;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.sharedwithyou.protocol.SWHighlightCenterDelegate;
import apple.sharedwithyou.protocol.SWHighlightEvent;
import apple.sharedwithyoucore.SWSignedPersonIdentityProof;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * SWHighlightCenter
 * 
 * Provides the application with a priority-ordered list of universal links which have been shared with the current
 * user.
 * 
 * The system decides which links should be surfaced. The app is responsible for updating its UI to reflect the latest
 * provided list.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYou")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SWHighlightCenter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SWHighlightCenter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SWHighlightCenter alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SWHighlightCenter allocWithZone(VoidPtr zone);

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
     * Clear notices for a given collaboration highlight in Messages.
     * 
     * @param highlight The highlight to clear notices from.
     * 
     *                  API-Since: 16.1
     */
    @Generated
    @Selector("clearNoticesForHighlight:")
    public native void clearNoticesForHighlight(@NotNull SWCollaborationHighlight highlight);

    @Nullable
    @Generated
    @Selector("collaborationHighlightForIdentifier:error:")
    public native SWCollaborationHighlight collaborationHighlightForIdentifierError(
            @NotNull String collaborationIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The highlight center's delegate
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SWHighlightCenterDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A convenience method to get an SWCollaborationHighlight for a given URL
     * 
     * @param URL               The URL used to find the SWCollaborationHighlight
     * @param completionHandler an SWCollaborationHighlight if it was fetched. The completion handler will always be
     *                          invoked on the main queue
     * 
     *                          API-Since: 16.0
     */
    @Generated
    @Selector("getCollaborationHighlightForURL:completionHandler:")
    public native void getCollaborationHighlightForURLCompletionHandler(@NotNull NSURL URL,
            @NotNull @ObjCBlock(name = "call_getCollaborationHighlightForURLCompletionHandler") Block_getCollaborationHighlightForURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCollaborationHighlightForURLCompletionHandler {
        @Generated
        void call_getCollaborationHighlightForURLCompletionHandler(@Nullable SWCollaborationHighlight highlight,
                @Nullable NSError fetchError);
    }

    /**
     * A convenience method to get a SWHighlight for a given URL
     * 
     * @param URL               The URL used to find the SWHighlight
     * @param completionHandler an SWHighlight if it was fetched. The completion handler will always be invoked on the
     *                          main queue
     */
    @Generated
    @Selector("getHighlightForURL:completionHandler:")
    public native void getHighlightForURLCompletionHandler(@NotNull NSURL URL,
            @NotNull @ObjCBlock(name = "call_getHighlightForURLCompletionHandler") Block_getHighlightForURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHighlightForURLCompletionHandler {
        @Generated
        void call_getHighlightForURLCompletionHandler(@Nullable SWHighlight highlight, @Nullable NSError fetchError);
    }

    /**
     * Method to sign passed in data with local device's private key
     * 
     * @param data                   NSData that needs to be signed
     * @param collaborationHighlight The corresponding collaboration highlight.
     * @param completionHandler      Signed data along with proof of inclusion for merkle if signing succeeded,
     *                               otherwise an error. The completion handler will always be invoked on main queue
     * 
     *                               API-Since: 16.0
     */
    @Generated
    @Selector("getSignedIdentityProofForCollaborationHighlight:usingData:completionHandler:")
    public native void getSignedIdentityProofForCollaborationHighlightUsingDataCompletionHandler(
            @NotNull SWCollaborationHighlight collaborationHighlight, @NotNull NSData data,
            @NotNull @ObjCBlock(name = "call_getSignedIdentityProofForCollaborationHighlightUsingDataCompletionHandler") Block_getSignedIdentityProofForCollaborationHighlightUsingDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSignedIdentityProofForCollaborationHighlightUsingDataCompletionHandler {
        @Generated
        void call_getSignedIdentityProofForCollaborationHighlightUsingDataCompletionHandler(
                @Nullable SWSignedPersonIdentityProof arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Localized title to display with a collection of highlights
     * 
     * Use this string as the title for a collection of shared highlight links displayed to the user.
     */
    @NotNull
    @Generated
    @Selector("highlightCollectionTitle")
    public static native String highlightCollectionTitle();

    @NotNull
    @Generated
    @Selector("highlights")
    public native NSArray<? extends SWHighlight> highlights();

    @Generated
    @Selector("init")
    public native SWHighlightCenter init();

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

    /**
     * Whether the current software version has full support for Messages collaboration features.
     * 
     * Use this property at runtime to conditionally enable Messages collaboration features in your app. This property
     * will be permantently set to YES on a software version with full support for these features.
     */
    @Generated
    @Selector("isSystemCollaborationSupportAvailable")
    public static native boolean isSystemCollaborationSupportAvailable();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SWHighlightCenter new_objc();

    /**
     * Post a given event to the highlight center for display in Messages.
     * 
     * @param event The event to add for a specific highlight
     * 
     *              API-Since: 16.0
     */
    @Generated
    @Selector("postNoticeForHighlightEvent:")
    public native void postNoticeForHighlightEvent(@NotNull @Mapped(ObjCObjectMapper.class) SWHighlightEvent event);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The highlight center's delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SWHighlightCenterDelegate value);

    /**
     * The highlight center's delegate
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SWHighlightCenterDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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