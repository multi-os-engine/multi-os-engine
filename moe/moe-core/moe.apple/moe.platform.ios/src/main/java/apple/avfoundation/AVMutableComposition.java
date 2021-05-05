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
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableComposition extends AVComposition {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableComposition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableComposition alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVMutableComposition assetWithURL(NSURL URL);

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

    /**
     * composition
     * 
     * Returns an empty AVMutableComposition.
     */
    @Generated
    @Selector("composition")
    public static native AVMutableComposition composition();

    /**
     * compositionWithURLAssetInitializationOptions:
     * 
     * Returns an empty AVMutableComposition.
     * 
     *   AVMutableCompositions create AVURLAssets internally for URLs specified by AVCompositionTrackSegments of AVMutableCompositionTracks, as needed, whenever AVCompositionTrackSegments are added to tracks via -[AVMutableCompositionTrack setSegments:] rather than by inserting timeranges of already existing AVAssets or AVAssetTracks.
     * 
     * @param          URLAssetInitializationOptions
     *                 Specifies the initialization options that the receiver should use when creating AVURLAssets internally, e.g. AVURLAssetPreferPreciseDurationAndTimingKey. The default behavior for creation of AVURLAssets by an AVMutableComposition is equivalent to the behavior of +[AVURLAsset URLAssetWithURL:options:] when specifying no initialization options.
     */
    @Generated
    @Selector("compositionWithURLAssetInitializationOptions:")
    public static native AVMutableComposition compositionWithURLAssetInitializationOptions(
            NSDictionary<String, ?> URLAssetInitializationOptions);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * addMutableTrackWithMediaType:preferredTrackID:
     * 
     * Adds an empty track to a mutable composition.
     * 
     *   If the specified preferred track ID is not available, or kCMPersistentTrackID_Invalid was passed in, a unique track ID will be generated.
     * 
     * @param          mediaType
     *                 The media type of the new track.
     * @param          preferredTrackID
     *                 Specifies the preferred track ID for the new track. If you do not need to specify a preferred track ID, pass kCMPersistentTrackID_Invalid. Otherwise the preferred track ID will be used for the new track, provided that it is not currently in use and has not previously been used.
     * @return         An instance of AVMutableCompositionTrack representing the new track. Its actual trackID is available via its @"trackID" key.
     */
    @Generated
    @Selector("addMutableTrackWithMediaType:preferredTrackID:")
    public native AVMutableCompositionTrack addMutableTrackWithMediaTypePreferredTrackID(String mediaType,
            int preferredTrackID);

    @Generated
    @Selector("init")
    public native AVMutableComposition init();

    /**
     * insertEmptyTimeRange:
     * 
     * Adds or extends an empty timeRange within all tracks of the composition.
     * 
     *  If you insert an empty timeRange into the composition, any media that was presented during that interval prior to the insertion will be presented instead immediately afterward. You can use this method to reserve an interval in which you want a subsequently created track to present its media.
     *   Note that you cannot add empty time ranges to the end of a composition.
     * 
     * @param          timeRange
     *                 Specifies the empty timeRange to be inserted.
     */
    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * insertTimeRange:ofAsset:atTime:error:
     * 
     * Inserts all the tracks of a timeRange of an asset into a composition.
     * 
     *   You provide a reference to an AVAsset and the timeRange within it that you want to insert. You specify the start time in the destination composition at which the timeRange should be inserted.
     * 
     *   This method may add new tracks to ensure that all tracks of the asset are represented in the inserted timeRange.
     * 
     *   Note that the media data for the inserted timeRange will be presented at its natural duration and rate. It can be scaled to a different duration and presented at a different rate via -scaleTimeRange:toDuration:.
     * 
     *   Existing content at the specified startTime will be pushed out by the duration of timeRange.
     * 
     * @param          timeRange
     *                 Specifies the timeRange of the asset to be inserted.
     * @param          asset
     *                 Specifies the asset that contains the tracks that are to be inserted. Only instances of AVURLAsset and AVComposition are supported (AVComposition starting in MacOS X 10.10 and iOS 8.0).
     * @param          startTime
     *                 Specifies the time at which the inserted tracks are to be presented by the composition.
     * @param          outError
     *                 Describes failures that may be reported to the user, e.g. the asset that was selected for insertion in the composition is restricted by copy-protection.
     * @return         A BOOL value indicating the success of the insertion.
     */
    @Generated
    @Selector("insertTimeRange:ofAsset:atTime:error:")
    public native boolean insertTimeRangeOfAssetAtTimeError(@ByValue CMTimeRange timeRange, AVAsset asset,
            @ByValue CMTime startTime, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * mutableTrackCompatibleWithTrack:
     * 
     * Provides a reference to a track of a mutable composition into which any timeRange of an AVAssetTrack can be inserted (via -[AVMutableCompositionTrack insertTimeRange:ofTrack:atTime:error:]).
     * 
     *   If a compatible track is desired but the result of this method is nil, a new track of the same mediaType as the AVAssetTrack can be created via -addMutableTrackWithMediaType:preferredTrackID:, and this new track will be compatible.
     * 
     *   For best performance, the number of tracks of a composition should be kept to a minimum, corresponding to the number for which media data must be presented in parallel. If media data of the same type is to be presented serially, even from multiple assets, a single track of that media type should be used. This method, -mutableTrackCompatibleWithTrack:, can help the client to identify an existing target track for an insertion.
     * 
     *   Similar to -[AVAsset compatibleTrackForCompositionTrack:].
     * 
     * @param          track
     *                 A reference to the AVAssetTrack from which a timeRange may be inserted.
     * @return         An AVMutableCompositionTrack that can accommodate the insertion, or, if no such track is available, nil.
     */
    @Generated
    @Selector("mutableTrackCompatibleWithTrack:")
    public native AVMutableCompositionTrack mutableTrackCompatibleWithTrack(AVAssetTrack track);

    /**
     * [@property]       naturalSize
     * 
     * Indicates the authored size of the visual portion of the asset.
     * 
     *   If not set, the value is the size of the composition's first video track. Set to CGSizeZero to revert to default behavior.
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * removeTimeRange:
     * 
     * Removes a specified timeRange from all tracks of the composition.
     * 
     *   Removal of a time range does not cause any existing tracks to be removed from the composition, even if removing timeRange results in an empty track. Instead, it removes or truncates track segments that intersect with the timeRange.
     * 
     *   After removing, existing content after timeRange will be pulled in.
     * 
     * @param          timeRange
     *                 Specifies the timeRange to be removed.
     */
    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    /**
     * removeTrack:
     * 
     * Removes a track of a mutable composition.
     * 
     *   If you retain a reference to the removed track, note that its @"composition" key will have the value nil, and the values of its other properties are undefined.
     * 
     * @param          track
     *                 A reference to the AVCompositionTrack to be removed.
     */
    @Generated
    @Selector("removeTrack:")
    public native void removeTrack(AVCompositionTrack track);

    /**
     * scaleTimeRange:toDuration:
     * 
     * Changes the duration of a timeRange of all tracks.
     * 
     *   Each trackSegment affected by the scaling operation will be presented at a rate equal to source.duration / target.duration of its resulting timeMapping.
     * 
     * @param          timeRange
     *                 Specifies the timeRange of the composition to be scaled.
     * @param          duration
     *                 Specifies the new duration of the timeRange.
     */
    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    /**
     * [@property]       naturalSize
     * 
     * Indicates the authored size of the visual portion of the asset.
     * 
     *   If not set, the value is the size of the composition's first video track. Set to CGSizeZero to revert to default behavior.
     */
    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    /**
     * trackWithTrackID:
     * 
     * Provides an instance of AVMutableCompositionTrack that represents the track of the specified trackID.
     * 
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          trackID
     *                 The trackID of the requested AVMutableCompositionTrack.
     * @return         An instance of AVMutableCompositionTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVMutableCompositionTrack trackWithTrackID(int trackID);

    /**
     * [@property]       tracks
     * 
     * Provides the array of AVMutableCompositionTracks contained by the composition.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMutableCompositionTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:
     * 
     * Provides an array of AVMutableCompositionTracks of the asset that present media with the specified characteristic.
     * 
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          mediaCharacteristic
     *                 The media characteristic according to which the receiver filters its AVMutableCompositionTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @return         An NSArray of AVMutableCompositionTracks; may be empty if no tracks with the specified characteristic are available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVMutableCompositionTrack> tracksWithMediaCharacteristic(
            String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVMutableCompositionTracks of the asset that present media of the specified media type.
     * 
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          mediaType
     *                 The media type according to which the receiver filters its AVMutableCompositionTracks. (Media types are defined in AVMediaFormat.h)
     * @return         An NSArray of AVMutableCompositionTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVMutableCompositionTrack> tracksWithMediaType(String mediaType);
}
