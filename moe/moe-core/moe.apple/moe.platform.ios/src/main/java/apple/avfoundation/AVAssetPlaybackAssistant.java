package apple.avfoundation;

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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetPlaybackAssistant
 * 
 * AVAssetPlaybackAssistant provides playback information for an asset.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetPlaybackAssistant extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetPlaybackAssistant(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetPlaybackAssistant alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAssetPlaybackAssistant allocWithZone(VoidPtr zone);

    /**
     * assetPlaybackAssistantWithAsset:
     * 
     * Returns an instance of AVAssetPlaybackAssistant for inspection of an AVAsset object.
     * 
     * @param asset
     *              An instance of AVAsset.
     * @return An instance of AVAssetPlaybackAssistant.
     */
    @Generated
    @Selector("assetPlaybackAssistantWithAsset:")
    public static native AVAssetPlaybackAssistant assetPlaybackAssistantWithAsset(AVAsset asset);

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
    public native AVAssetPlaybackAssistant init();

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
     * loadPlaybackConfigurationOptionsWithCompletionHandler:
     * 
     * Calls the completionHandler with information about the asset.
     * 
     * completionHandler is called when all of the AVAssetPlaybackConfigurationOption values have been loaded. If
     * AVAssetPlaybackAssistant encounters failures when inspecting the contents of the asset, it will return no
     * AVAssetPlaybackConfigurationOptions associated with those contents.
     * 
     * @param completionHandler
     *                          Called with an array of AVAssetPlaybackConfigurationOption values describing
     *                          capabilities of the asset.
     */
    @Generated
    @Selector("loadPlaybackConfigurationOptionsWithCompletionHandler:")
    public native void loadPlaybackConfigurationOptionsWithCompletionHandler(
            @ObjCBlock(name = "call_loadPlaybackConfigurationOptionsWithCompletionHandler") Block_loadPlaybackConfigurationOptionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPlaybackConfigurationOptionsWithCompletionHandler {
        @Generated
        void call_loadPlaybackConfigurationOptionsWithCompletionHandler(NSArray<String> playbackConfigurationOptions);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetPlaybackAssistant new_objc();

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