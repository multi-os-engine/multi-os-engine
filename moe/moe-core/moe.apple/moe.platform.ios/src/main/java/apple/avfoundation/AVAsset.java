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
import apple.avfoundation.protocol.AVAsynchronousKeyValueLoading;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAsset extends NSObject implements NSCopying, AVAsynchronousKeyValueLoading {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAsset alloc();

    /**
     * assetWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/clm/AVAsset/assetWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assetWithURL:")
    public static native AVAsset assetWithURL(NSURL URL);

    /**
     * availableChapterLocales</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/availableChapterLocales">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableChapterLocales")
    public native NSArray<? extends NSLocale> availableChapterLocales();

    /**
     * availableMediaCharacteristicsWithMediaSelectionOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/availableMediaCharacteristicsWithMediaSelectionOptions">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableMediaCharacteristicsWithMediaSelectionOptions")
    public native NSArray<String> availableMediaCharacteristicsWithMediaSelectionOptions();

    /**
     * availableMetadataFormats</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/availableMetadataFormats">iOS Dev Center</a>
     */
    @Generated
    @Selector("availableMetadataFormats")
    public native NSArray<String> availableMetadataFormats();

    /**
     * cancelLoading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/cancelLoading">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelLoading")
    public native void cancelLoading();

    /**
     * chapterMetadataGroupsBestMatchingPreferredLanguages:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/chapterMetadataGroupsBestMatchingPreferredLanguages:">iOS Dev Center</a>
     */
    @Generated
    @Selector("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsBestMatchingPreferredLanguages(
            NSArray<String> preferredLanguages);

    /**
     * chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<? extends AVTimedMetadataGroup> chapterMetadataGroupsWithTitleLocaleContainingItemsWithCommonKeys(
            NSLocale locale, NSArray<String> commonKeys);

    /**
     * commonMetadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/commonMetadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("commonMetadata")
    public native NSArray<? extends AVMetadataItem> commonMetadata();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * creationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/creationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("creationDate")
    public native AVMetadataItem creationDate();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * hasProtectedContent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/hasProtectedContent">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasProtectedContent")
    public native boolean hasProtectedContent();

    @Generated
    @Selector("init")
    public native AVAsset init();

    /**
     * compatibleWithSavedPhotosAlbum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/compatibleWithSavedPhotosAlbum">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCompatibleWithSavedPhotosAlbum")
    public native boolean isCompatibleWithSavedPhotosAlbum();

    /**
     * composable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/composable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isComposable")
    public native boolean isComposable();

    /**
     * exportable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/exportable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExportable")
    public native boolean isExportable();

    /**
     * playable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/playable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * readable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/readable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isReadable")
    public native boolean isReadable();

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(NSArray<String> keys,
            @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * lyrics</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/lyrics">iOS Dev Center</a>
     */
    @Generated
    @Selector("lyrics")
    public native String lyrics();

    /**
     * mediaSelectionGroupForMediaCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/mediaSelectionGroupForMediaCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup mediaSelectionGroupForMediaCharacteristic(String mediaCharacteristic);

    /**
     * metadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/metadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadata")
    public native NSArray<? extends AVMetadataItem> metadata();

    /**
     * metadataForFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/metadataForFormat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(String format);

    /**
     * naturalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/naturalSize">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    /**
     * preferredRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/preferredRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredRate")
    public native float preferredRate();

    /**
     * preferredTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/preferredTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredTransform")
    @ByValue
    public native CGAffineTransform preferredTransform();

    /**
     * preferredVolume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/preferredVolume">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredVolume")
    public native float preferredVolume();

    /**
     * providesPreciseDurationAndTiming</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/providesPreciseDurationAndTiming">iOS Dev Center</a>
     */
    @Generated
    @Selector("providesPreciseDurationAndTiming")
    public native boolean providesPreciseDurationAndTiming();

    /**
     * referenceRestrictions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/referenceRestrictions">iOS Dev Center</a>
     */
    @Generated
    @Selector("referenceRestrictions")
    @NUInt
    public native long referenceRestrictions();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(String key, Ptr<NSError> outError);

    /**
     * trackGroups</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/trackGroups">iOS Dev Center</a>
     */
    @Generated
    @Selector("trackGroups")
    public native NSArray<? extends AVAssetTrackGroup> trackGroups();

    /**
     * trackWithTrackID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/trackWithTrackID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("trackWithTrackID:")
    public native AVAssetTrack trackWithTrackID(int trackID);

    /**
     * tracks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instp/AVAsset/tracks">iOS Dev Center</a>
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVAssetTrack> tracks();

    /**
     * tracksWithMediaCharacteristic:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/tracksWithMediaCharacteristic:">iOS Dev Center</a>
     */
    @Generated
    @Selector("tracksWithMediaCharacteristic:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

    /**
     * tracksWithMediaType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/tracksWithMediaType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("tracksWithMediaType:")
    public native NSArray<? extends AVAssetTrack> tracksWithMediaType(String mediaType);

    /**
     * unusedTrackID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAsset_Class/index.html#//apple_ref/occ/instm/AVAsset/unusedTrackID">iOS Dev Center</a>
     */
    @Generated
    @Selector("unusedTrackID")
    public native int unusedTrackID();

    @Generated
    @Selector("canContainFragments")
    public native boolean canContainFragments();

    @Generated
    @Selector("containsFragments")
    public native boolean containsFragments();

    @Generated
    @Selector("isCompatibleWithAirPlayVideo")
    public native boolean isCompatibleWithAirPlayVideo();

    @Generated
    @Selector("preferredMediaSelection")
    public native AVMediaSelection preferredMediaSelection();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();
}
