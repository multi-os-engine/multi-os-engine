package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
public class AVMutableMovie extends AVMovie {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableMovie(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addMutableTrackWithMediaType:copySettingsFromTrack:options:")
    public native AVMutableMovieTrack addMutableTrackWithMediaTypeCopySettingsFromTrackOptions(String mediaType,
            AVAssetTrack track, NSDictionary<String, ?> options);

    @Generated
    @Selector("addMutableTracksCopyingSettingsFromTracks:options:")
    public native NSArray<? extends AVMutableMovieTrack> addMutableTracksCopyingSettingsFromTracksOptions(
            NSArray<? extends AVAssetTrack> existingTracks, NSDictionary<String, ?> options);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableMovie alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVMutableMovie assetWithURL(NSURL URL);

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
    @Selector("defaultMediaDataStorage")
    public native AVMediaDataStorage defaultMediaDataStorage();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMutableMovie init();

    @Generated
    @Selector("initWithData:options:")
    public native AVMutableMovie initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithData:options:error:")
    public native AVMutableMovie initWithDataOptionsError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithSettingsFromMovie:options:error:")
    public native AVMutableMovie initWithSettingsFromMovieOptionsError(AVMovie movie, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithURL:options:")
    public native AVMutableMovie initWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithURL:options:error:")
    public native AVMutableMovie initWithURLOptionsError(NSURL URL, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("insertTimeRange:ofAsset:atTime:copySampleData:error:")
    public native boolean insertTimeRangeOfAssetAtTimeCopySampleDataError(@ByValue CMTimeRange timeRange, AVAsset asset,
            @ByValue CMTime startTime, boolean copySampleData,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    @Selector("interleavingPeriod")
    @ByValue
    public native CMTime interleavingPeriod();

    @Generated
    @Selector("isModified")
    public native boolean isModified();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("movieTypes")
    public static native NSArray<String> movieTypes();

    @Generated
    @Selector("movieWithData:options:")
    public static native AVMutableMovie movieWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("movieWithData:options:error:")
    public static native AVMutableMovie movieWithDataOptionsError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("movieWithSettingsFromMovie:options:error:")
    public static native AVMutableMovie movieWithSettingsFromMovieOptionsError(AVMovie movie,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("movieWithURL:options:")
    public static native AVMutableMovie movieWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    @Generated
    @Selector("movieWithURL:options:error:")
    public static native AVMutableMovie movieWithURLOptionsError(NSURL URL, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("mutableTrackCompatibleWithTrack:")
    public native AVMutableMovieTrack mutableTrackCompatibleWithTrack(AVAssetTrack track);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("preferredRate")
    public native float preferredRate();

    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("removeTrack:")
    public native void removeTrack(AVMovieTrack track);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    @Generated
    @Selector("setDefaultMediaDataStorage:")
    public native void setDefaultMediaDataStorage(AVMediaDataStorage value);

    @Generated
    @Selector("setInterleavingPeriod:")
    public native void setInterleavingPeriod(@ByValue CMTime value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setModified:")
    public native void setModified(boolean value);

    @Generated
    @Selector("setPreferredRate:")
    public native void setPreferredRate(float value);

    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    @Generated
    @Selector("setTimescale:")
    public native void setTimescale(int value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("timescale")
    public native int timescale();

    @Generated
    @Selector("trackWithTrackID:")
    public native AVMutableMovieTrack trackWithTrackID(int trackID);

    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMutableMovieTrack> tracks();

    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVMutableMovieTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVMutableMovieTrack> tracksWithMediaType(String mediaType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}