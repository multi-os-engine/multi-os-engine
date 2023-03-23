/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSMutableCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.foundation.NSLocale;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVComposition extends AVAsset implements NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVComposition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVComposition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVComposition allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVComposition assetWithURL(NSURL URL);

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
    public static native AVComposition new_objc();

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

    /**
     * [@property] URLAssetInitializationOptions
     * 
     * Specifies the initialization options for the creation of AVURLAssets by the receiver, e.g.
     * AVURLAssetPreferPreciseDurationAndTimingKey. The default behavior for creation of AVURLAssets by an AVComposition
     * is equivalent to the behavior of +[AVURLAsset URLAssetWithURL:options:] when specifying no initialization
     * options.
     * 
     * AVCompositions create AVURLAssets internally for URLs specified by AVCompositionTrackSegments of
     * AVCompositionTracks, as needed, whenever AVCompositionTrackSegments were originally added to a track via
     * -[AVMutableCompositionTrack setSegments:] rather than by inserting timeranges of already existing AVAssets or
     * AVAssetTracks.
     * The value of URLAssetInitializationOptions can be specified at the time an AVMutableComposition is created via
     * +compositionWithURLAssetInitializationOptions:.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("URLAssetInitializationOptions")
    public native NSDictionary<String, ?> URLAssetInitializationOptions();

    @Generated
    @Selector("init")
    public native AVComposition init();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * [@property] naturalSize
     * 
     * Indicates the authored size of the visual portion of the composition.
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * trackWithTrackID:
     * 
     * Provides an instance of AVCompositionTrack that represents the track of the specified trackID.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param trackID
     *                The trackID of the requested AVCompositionTrack.
     * @return An instance of AVCompositionTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVCompositionTrack trackWithTrackID(int trackID);

    /**
     * [@property] tracks
     * 
     * Provides the array of AVCompositionTracks contained by the composition.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVCompositionTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * 
     * Provides an array of AVCompositionTracks of the asset that present media with the specified characteristic.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which the receiver filters its
     *                            AVCompositionTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @return An NSArray of AVCompositionTracks; may be empty if no tracks with the specified characteristic are
     *         available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVCompositionTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVCompositionTracks of the asset that present media of the specified media type.
     * 
     * Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param mediaType
     *                  The media type according to which the receiver filters its AVCompositionTracks. (Media types are
     *                  defined in AVMediaFormat.h)
     * @return An NSArray of AVCompositionTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVCompositionTrack> tracksWithMediaType(String mediaType);

    /**
     * loadTrackWithTrackID:completionHandler:
     * 
     * Loads an instance of AVCompositionTrack that represents the track of the specified trackID.
     * 
     * @param trackID
     *                          The trackID of the requested AVCompositionTrack.
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded track (which
     *                          may be nil if no track of the specified trackID is available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTrackWithTrackID:completionHandler:")
    public native void loadTrackWithTrackIDCompletionHandler(int trackID,
            @ObjCBlock(name = "call_loadTrackWithTrackIDCompletionHandler") Block_loadTrackWithTrackIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTrackWithTrackIDCompletionHandler {
        @Generated
        void call_loadTrackWithTrackIDCompletionHandler(AVCompositionTrack arg0, NSError arg1);
    }

    /**
     * loadTracksWithMediaCharacteristic:completionHandler:
     * 
     * Loads an array of AVCompositionTracks of the asset that present media with the specified characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic according to which AVAsset filters its AVCompositionTracks.
     *                            (Media characteristics are defined in AVMediaFormat.h.)
     * @param completionHandler
     *                            A block that is called when the loading is finished, with either the loaded tracks
     *                            (which may be empty if no tracks with the specified characteristic are available) or
     *                            an error.
     * 
     *                            API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristicCompletionHandler(String mediaCharacteristic,
            @ObjCBlock(name = "call_loadTracksWithMediaCharacteristicCompletionHandler") Block_loadTracksWithMediaCharacteristicCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaCharacteristicCompletionHandler {
        @Generated
        void call_loadTracksWithMediaCharacteristicCompletionHandler(NSArray<? extends AVCompositionTrack> arg0,
                NSError arg1);
    }

    /**
     * loadTracksWithMediaType:completionHandler:
     * 
     * Loads an array of AVCompositionTracks of the asset that present media of the specified media type.
     * 
     * @param mediaType
     *                          The media type according to which AVAsset filters its AVCompositionTracks. (Media types
     *                          are defined in AVMediaFormat.h.)
     * @param completionHandler
     *                          A block that is called when the loading is finished, with either the loaded tracks
     *                          (which may be empty if no tracks of the specified media type are available) or an error.
     * 
     *                          API-Since: 15.0
     */
    @Generated
    @Selector("loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaTypeCompletionHandler(String mediaType,
            @ObjCBlock(name = "call_loadTracksWithMediaTypeCompletionHandler") Block_loadTracksWithMediaTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadTracksWithMediaTypeCompletionHandler {
        @Generated
        void call_loadTracksWithMediaTypeCompletionHandler(NSArray<? extends AVCompositionTrack> arg0, NSError arg1);
    }

    @Generated
    @Selector("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsBestMatchingPreferredLanguages(
            NSArray<String> preferredLanguages);

    @Generated
    @Selector("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeys(
            NSLocale locale, NSArray<String> commonKeys);

    @Generated
    @Selector("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup mediaSelectionGroupForMediaCharacteristic(String mediaCharacteristic);

    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(String format);

    @Generated
    @Selector("unusedTrackID")
    public native int unusedTrackID();
}
