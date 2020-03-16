package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
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
import org.moe.natj.general.ann.UncertainArgument;
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
public class AVMutableMovieTrack extends AVMovieTrack {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableMovieTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addTrackAssociationToTrack:type:")
    public native void addTrackAssociationToTrackType(AVMovieTrack movieTrack, String trackAssociationType);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableMovieTrack alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("alternateGroupID")
    @NInt
    public native long alternateGroupID();

    @Generated
    @Selector("appendSampleBuffer:decodeTime:presentationTime:error:")
    public native boolean appendSampleBufferDecodeTimePresentationTimeError(CMSampleBufferRef sampleBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outDecodeTime,
            @UncertainArgument("Options: reference, array Fallback: reference") CMTime outPresentationTime,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
    @Selector("cleanApertureDimensions")
    @ByValue
    public native CGSize cleanApertureDimensions();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodedPixelsDimensions")
    @ByValue
    public native CGSize encodedPixelsDimensions();

    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    @Generated
    @Selector("hasProtectedContent")
    public native boolean hasProtectedContent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMutableMovieTrack init();

    @Generated
    @Selector("insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("insertMediaTimeRange:intoTimeRange:")
    public native boolean insertMediaTimeRangeIntoTimeRange(@ByValue CMTimeRange mediaTimeRange,
            @ByValue CMTimeRange trackTimeRange);

    @Generated
    @Selector("insertTimeRange:ofTrack:atTime:copySampleData:error:")
    public native boolean insertTimeRangeOfTrackAtTimeCopySampleDataError(@ByValue CMTimeRange timeRange,
            AVAssetTrack track, @ByValue CMTime startTime, boolean copySampleData,
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
    @Selector("isEnabled")
    public native boolean isEnabled();

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
    @Selector("languageCode")
    public native String languageCode();

    @Generated
    @Selector("layer")
    @NInt
    public native long layer();

    @Generated
    @Selector("mediaDataStorage")
    public native AVMediaDataStorage mediaDataStorage();

    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("preferredMediaChunkAlignment")
    @NInt
    public native long preferredMediaChunkAlignment();

    @Generated
    @Selector("preferredMediaChunkDuration")
    @ByValue
    public native CMTime preferredMediaChunkDuration();

    @Generated
    @Selector("preferredMediaChunkSize")
    @NInt
    public native long preferredMediaChunkSize();

    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    @Generated
    @Selector("productionApertureDimensions")
    @ByValue
    public native CGSize productionApertureDimensions();

    @Generated
    @Selector("removeTimeRange:")
    public native void removeTimeRange(@ByValue CMTimeRange timeRange);

    @Generated
    @Selector("removeTrackAssociationToTrack:type:")
    public native void removeTrackAssociationToTrackType(AVMovieTrack movieTrack, String trackAssociationType);

    @Generated
    @Selector("replaceFormatDescription:withFormatDescription:")
    public native void replaceFormatDescriptionWithFormatDescription(CMFormatDescriptionRef formatDescription,
            CMFormatDescriptionRef newFormatDescription);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sampleReferenceBaseURL")
    public native NSURL sampleReferenceBaseURL();

    @Generated
    @Selector("scaleTimeRange:toDuration:")
    public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange, @ByValue CMTime duration);

    @Generated
    @Selector("setAlternateGroupID:")
    public native void setAlternateGroupID(@NInt long value);

    @Generated
    @Selector("setCleanApertureDimensions:")
    public native void setCleanApertureDimensions(@ByValue CGSize value);

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("setEncodedPixelsDimensions:")
    public native void setEncodedPixelsDimensions(@ByValue CGSize value);

    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

    @Generated
    @Selector("setLayer:")
    public native void setLayer(@NInt long value);

    @Generated
    @Selector("setMediaDataStorage:")
    public native void setMediaDataStorage(AVMediaDataStorage value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSArray<? extends AVMetadataItem> value);

    @Generated
    @Selector("setModified:")
    public native void setModified(boolean value);

    @Generated
    @Selector("setNaturalSize:")
    public native void setNaturalSize(@ByValue CGSize value);

    @Generated
    @Selector("setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@NInt long value);

    @Generated
    @Selector("setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByValue CMTime value);

    @Generated
    @Selector("setPreferredMediaChunkSize:")
    public native void setPreferredMediaChunkSize(@NInt long value);

    @Generated
    @Selector("setPreferredTransform:")
    public native void setPreferredTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setPreferredVolume:")
    public native void setPreferredVolume(float value);

    @Generated
    @Selector("setProductionApertureDimensions:")
    public native void setProductionApertureDimensions(@ByValue CGSize value);

    @Generated
    @Selector("setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL value);

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
    @Selector("version")
    @NInt
    public static native long version_static();
}