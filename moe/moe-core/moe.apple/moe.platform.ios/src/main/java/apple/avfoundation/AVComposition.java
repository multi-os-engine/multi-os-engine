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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * [@property]       URLAssetInitializationOptions
     * 
     * Specifies the initialization options for the creation of AVURLAssets by the receiver, e.g. AVURLAssetPreferPreciseDurationAndTimingKey. The default behavior for creation of AVURLAssets by an AVComposition is equivalent to the behavior of +[AVURLAsset URLAssetWithURL:options:] when specifying no initialization options.
     * 
     *   AVCompositions create AVURLAssets internally for URLs specified by AVCompositionTrackSegments of AVCompositionTracks, as needed, whenever AVCompositionTrackSegments were originally added to a track via -[AVMutableCompositionTrack setSegments:] rather than by inserting timeranges of already existing AVAssets or AVAssetTracks.
     *   The value of URLAssetInitializationOptions can be specified at the time an AVMutableComposition is created via +compositionWithURLAssetInitializationOptions:.
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
     * [@property]       naturalSize
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
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          trackID
     *                 The trackID of the requested AVCompositionTrack.
     * @return         An instance of AVCompositionTrack; may be nil if no track of the specified trackID is available.
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVCompositionTrack trackWithTrackID(int trackID);

    /**
     * [@property]       tracks
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
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          mediaCharacteristic
     *                 The media characteristic according to which the receiver filters its AVCompositionTracks. (Media characteristics are defined in AVMediaFormat.h)
     * @return         An NSArray of AVCompositionTracks; may be empty if no tracks with the specified characteristic are available.
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVCompositionTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:
     * 
     * Provides an array of AVCompositionTracks of the asset that present media of the specified media type.
     * 
     *   Becomes callable without blocking when the key @"tracks" has been loaded
     * 
     * @param          mediaType
     *                 The media type according to which the receiver filters its AVCompositionTracks. (Media types are defined in AVMediaFormat.h)
     * @return         An NSArray of AVCompositionTracks; may be empty if no tracks of the specified media type are available.
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVCompositionTrack> tracksWithMediaType(String mediaType);
}
