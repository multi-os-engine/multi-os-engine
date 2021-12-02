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
import apple.avfoundation.protocol.AVContentKeyRecipient;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVURLAsset extends AVAsset implements NSItemProviderReading, NSItemProviderWriting, AVContentKeyRecipient {
    static {
        NatJ.register();
    }

    @Generated
    protected AVURLAsset(Pointer peer) {
        super(peer);
    }

    /**
     * URLAssetWithURL:options:
     * <p>
     * Returns an instance of AVURLAsset for inspection of a media resource.
     *
     * @param        URL An instance of NSURL that references a media resource.
     * @param        options An instance of NSDictionary that contains keys for specifying options for the initialization of the AVURLAsset. See AVURLAssetPreferPreciseDurationAndTimingKey and AVURLAssetReferenceRestrictionsKey above.
     * @return An instance of AVURLAsset.
     */
    @Generated
    @Selector("URLAssetWithURL:options:")
    public static native AVURLAsset URLAssetWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVURLAsset alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVURLAsset allocWithZone(VoidPtr zone);

    @Generated
    @Selector("assetWithURL:")
    public static native AVURLAsset assetWithURL(NSURL URL);

    /**
     * audiovisualMIMETypes
     * <p>
     * Provides the MIME types the AVURLAsset class understands.
     *
     * @return An NSArray of NSStrings containing MIME types the AVURLAsset class understands.
     */
    @Generated
    @Selector("audiovisualMIMETypes")
    public static native NSArray<String> audiovisualMIMETypes();

    /**
     * audiovisualTypes
     * <p>
     * Provides the file types the AVURLAsset class understands.
     *
     * @return An NSArray of UTIs identifying the file types the AVURLAsset class understands.
     */
    @Generated
    @Selector("audiovisualTypes")
    public static native NSArray<String> audiovisualTypes();

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

    /**
     * isPlayableExtendedMIMEType:
     * <p>
     * Returns YES if asset is playable with the codec(s) and container type specified in extendedMIMEType. Returns NO otherwise.
     *
     * @param        extendedMIMEType
     * @return YES or NO.
     */
    @Generated
    @Selector("isPlayableExtendedMIMEType:")
    public static native boolean isPlayableExtendedMIMEType(String extendedMIMEType);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVURLAsset new_objc();

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
     * indicates the URL with which the instance of AVURLAsset was initialized
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * [@property]	assetCache
     * <p>
     * Provides access to an instance of AVAssetCache to use for inspection of locally cached media data. Will be nil if an asset has not been configured to store or access media data from disk.
     */
    @Generated
    @Selector("assetCache")
    public native AVAssetCache assetCache();

    /**
     * compatibleTrackForCompositionTrack:
     * <p>
     * Provides a reference to an AVAssetTrack of the target from which any timeRange
     * can be inserted into a mutable composition track (via -[AVMutableCompositionTrack insertTimeRange:ofTrack:atTime:error:]).
     * <p>
     * Finds a track of the target with content that can be accommodated by the specified composition track.
     * The logical complement of -[AVMutableComposition mutableTrackCompatibleWithTrack:].
     *
     * @param        compositionTrack The composition track for which a compatible AVAssetTrack is requested.
     * @return an instance of AVAssetTrack
     */
    @Generated
    @Selector("compatibleTrackForCompositionTrack:")
    public native AVAssetTrack compatibleTrackForCompositionTrack(AVCompositionTrack compositionTrack);

    @Generated
    @Selector("init")
    public native AVURLAsset init();

    /**
     * initWithURL:options:
     * <p>
     * Initializes an instance of AVURLAsset for inspection of a media resource.
     *
     * @param        URL An instance of NSURL that references a media resource.
     * @param        options An instance of NSDictionary that contains keys for specifying options for the initialization of the AVURLAsset. See AVURLAssetPreferPreciseDurationAndTimingKey and AVURLAssetReferenceRestrictionsKey above.
     * @return An instance of AVURLAsset.
     */
    @Generated
    @Selector("initWithURL:options:")
    public native AVURLAsset initWithURLOptions(NSURL URL, NSDictionary<String, ?> options);

    /**
     * [@property] resourceLoader
     * <p>
     * Provides access to an instance of AVAssetResourceLoader, which offers limited control over the handling of URLs that may be loaded in the course of performing operations on the asset, such as playback.
     * The loading of file URLs cannot be mediated via use of AVAssetResourceLoader.
     * Note that copies of an AVAsset will vend the same instance of AVAssetResourceLoader.
     */
    @Generated
    @Selector("resourceLoader")
    public native AVAssetResourceLoader resourceLoader();

    @Generated
    @Selector("mayRequireContentKeysForMediaDataProcessing")
    public native boolean mayRequireContentKeysForMediaDataProcessing();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native AVURLAsset objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public AVURLAsset _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    @Generated
    @IsOptional
    @Selector("contentKeySession:didProvideContentKey:")
    public native void contentKeySessionDidProvideContentKey(AVContentKeySession contentKeySession,
            AVContentKey contentKey);

    /**
     * findCompatibleTrackForCompositionTrack:completionHandler:
     * <p>
     * Loads a reference to an AVAssetTrack of the target from which any timeRange
     * can be inserted into a mutable composition track (via -[AVMutableCompositionTrack insertTimeRange:ofTrack:atTime:error:]).
     * <p>
     * Finds a track of the target with content that can be accommodated by the specified composition track.
     * The logical complement of -[AVMutableComposition mutableTrackCompatibleWithTrack:].
     *
     * @param        compositionTrack The composition track for which a compatible AVAssetTrack is requested.
     * @param        completionHandler A block that is invoked when loading is complete, vending an instance of AVAssetTrack or an error.
     */
    @Generated
    @Selector("findCompatibleTrackForCompositionTrack:completionHandler:")
    public native void findCompatibleTrackForCompositionTrackCompletionHandler(AVCompositionTrack compositionTrack,
            @ObjCBlock(name = "call_findCompatibleTrackForCompositionTrackCompletionHandler") Block_findCompatibleTrackForCompositionTrackCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findCompatibleTrackForCompositionTrackCompletionHandler {
        @Generated
        void call_findCompatibleTrackForCompositionTrackCompletionHandler(AVAssetTrack arg0, NSError arg1);
    }

    /**
     * [@property]		variants
     * <p>
     * Provides an array of AVAssetVariants contained in the asset
     * <p>
     * Some variants may not be playable according to the current device configuration.
     */
    @Generated
    @Selector("variants")
    public native NSArray<? extends AVAssetVariant> variants();
}
