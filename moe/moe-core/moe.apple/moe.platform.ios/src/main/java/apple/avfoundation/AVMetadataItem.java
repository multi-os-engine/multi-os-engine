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
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMetadataItem extends NSObject implements AVAsynchronousKeyValueLoading, NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetadataItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetadataItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMetadataItem allocWithZone(VoidPtr zone);

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

    /**
     * identifierForKey:keySpace:
     * 
     * Provides the metadata identifier that's equivalent to a key and keySpace.
     * 
     * Metadata keys that are not instances of NSString, NSNumber, or NSData cannot be converted to metadata
     * identifiers; they also cannot be written to media resources via AVAssetExportSession or AVAssetWriter. Metadata
     * item keySpaces must be a string of one to four printable ASCII characters.
     * 
     * For custom identifiers, the keySpace AVMetadataKeySpaceQuickTimeMetadata is recommended. This keySpace defines
     * its key values to be expressed as reverse-DNS strings, which allows third parties to define their own keys in a
     * well established way that avoids collisions.
     * 
     * API-Since: 8.0
     * 
     * @param key
     *                 The metadata key.
     * @param keySpace
     *                 The metadata keySpace.
     * @return A metadata identifier equivalent to the given key and keySpace, or nil if no identifier can be
     *         constructed from the given key and keySpace.
     */
    @Nullable
    @Generated
    @Selector("identifierForKey:keySpace:")
    public static native String identifierForKeyKeySpace(@NotNull @Mapped(ObjCObjectMapper.class) Object key,
            @NotNull String keySpace);

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
     * provides the metadata key indicated by the identifier
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("keyForIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object keyForIdentifier(@NotNull String identifier);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * provides the metadata keySpace indicated by the identifier
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("keySpaceForIdentifier:")
    public static native String keySpaceForIdentifier(@NotNull String identifier);

    /**
     * metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:
     * 
     * Creates an instance of AVMutableMetadataItem with a value that you do not wish to load unless required, e.g. a
     * large image value that needn't be loaded into memory until another module wants to display it.
     * 
     * This method is intended for the creation of metadata items for optional display purposes, when there is no
     * immediate need to load specific metadata values. For example, see the interface for navigation markers as
     * consumed by AVPlayerViewController. It's not intended for the creation of metadata items with values that are
     * required immediately, such as metadata items that are provided for impending serialization operations (e.g. via
     * -[AVAssetExportSession setMetadata:] and other similar methods defined on AVAssetWriter and AVAssetWriterInput).
     * When -loadValuesAsynchronouslyForKeys:completionHandler: is invoked on an AVMetadataItem created via
     * +metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler: and @"value" is among the keys for which loading
     * is requested, the block you provide as the value loading handler will be executed on an arbitrary dispatch queue,
     * off the main thread. The handler can perform I/O and other necessary operations to obtain the value. If loading
     * of the value succeeds, provide the value by invoking -[AVMetadataItemValueRequest respondWithValue:]. If loading
     * of the value fails, provide an instance of NSError that describes the failure by invoking
     * -[AVMetadataItemValueRequest respondWithError:].
     * 
     * API-Since: 9.0
     * 
     * @param metadataItem
     *                     An instance of AVMetadataItem with the identifier, extendedLanguageTag, and other property
     *                     values that you want the newly created instance of AVMetadataItem to share. The value of
     *                     metadataItem is ignored.
     * @param handler
     *                     A block that loads the value of the metadata item.
     * @return An instance of AVMetadataItem.
     */
    @NotNull
    @Generated
    @Selector("metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:")
    public static native AVMetadataItem metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(
            @NotNull AVMetadataItem metadataItem,
            @NotNull @ObjCBlock(name = "call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler") Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler handler);

    /**
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:
     * 
     * Filters an array of AVMetadataItems according to whether their locales match any language identifier in the
     * specified array of preferred languages. The returned array is sorted according to the order of preference of the
     * language each matches.
     * 
     * @param metadataItems
     *                           An array of AVMetadataItems to be filtered and sorted.
     * @param preferredLanguages
     *                           An array of language identifiers in order of preference, each of which is an IETF BCP
     *                           47 (RFC 4646) language identifier. Use +[NSLocale preferredLanguages] to obtain the
     *                           user's list of preferred languages.
     * @return An instance of NSArray containing metadata items of the specified NSArray that match a preferred
     *         language, sorted according to the order of preference of the language each matches.
     * 
     *         API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredAndSortedAccordingToPreferredLanguages(
            @NotNull NSArray<? extends AVMetadataItem> metadataItems, @NotNull NSArray<String> preferredLanguages);

    /**
     * metadataItemsFromArray:filteredByIdentifier:
     * 
     * Filters an array of AVMetadataItems according to identifier.
     * 
     * @param metadataItems
     *                      An array of AVMetadataItems to be filtered by identifier.
     * @param identifier
     *                      The identifier that must be matched for a metadata item to be copied to the output array.
     *                      Items are considered a match not only when their identifiers are equal to the specified
     *                      identifier, and also when their identifiers conform to the specified identifier.
     * @return An instance of NSArray containing the metadata items of the target NSArray that match the specified
     *         identifier.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByIdentifier(
            @NotNull NSArray<? extends AVMetadataItem> metadataItems, @NotNull String identifier);

    /**
     * metadataItemsFromArray:filteredByMetadataItemFilter:
     * 
     * Filters an array of AVMetadataItems using the supplied AVMetadataItemFilter.
     * 
     * @param metadataItems
     *                           An array of AVMetadataItems to be filtered.
     * @param metadataItemFilter
     *                           The AVMetadataItemFilter object for filtering the metadataItems.
     * @return An instance of NSArray containing the metadata items of the target NSArray that have not been removed by
     *         metadataItemFilter.
     * 
     *         API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByMetadataItemFilter(
            @NotNull NSArray<? extends AVMetadataItem> metadataItems, @NotNull AVMetadataItemFilter metadataItemFilter);

    /**
     * metadataItemsFromArray:withKey:keySpace:
     * 
     * Instead, use metadataItemsFromArray:filteredByIdentifier:.
     */
    @NotNull
    @Generated
    @Selector("metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithKeyKeySpace(
            @NotNull NSArray<? extends AVMetadataItem> metadataItems,
            @Nullable @Mapped(ObjCObjectMapper.class) Object key, @Nullable String keySpace);

    /**
     * metadataItemsFromArray:withLocale:
     * 
     * Instead, use metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:.
     */
    @NotNull
    @Generated
    @Selector("metadataItemsFromArray:withLocale:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithLocale(
            @NotNull NSArray<? extends AVMetadataItem> metadataItems, @NotNull NSLocale locale);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMetadataItem new_objc();

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
     * indicates the common key of the metadata item
     */
    @Nullable
    @Generated
    @Selector("commonKey")
    public native String commonKey();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * indicates the data type of the metadata item's value. Publicly defined data types are declared in
     * <CoreMedia/CMMetadata.h>
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("dataType")
    public native String dataType();

    /**
     * provides the raw bytes of the value of the metadata item
     */
    @Nullable
    @Generated
    @Selector("dataValue")
    public native NSData dataValue();

    /**
     * provides the value of the metadata item as an NSDate. If the metadata item's value can't be coerced to a
     * date, @"dateValue" will be nil.
     */
    @Nullable
    @Generated
    @Selector("dateValue")
    public native NSDate dateValue();

    /**
     * indicates the duration of the metadata item
     * 
     * API-Since: 4.2
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * indicates the IETF BCP 47 (RFC 4646) language identifier of the metadata item; may be nil if no language tag
     * information is available
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * provides a dictionary of the additional attributes
     */
    @Nullable
    @Generated
    @Selector("extraAttributes")
    public native NSDictionary<String, ?> extraAttributes();

    /**
     * Indicates the identifier of the metadata item. Publicly defined identifiers are declared in
     * AVMetadataIdentifiers.h.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVMetadataItem init();

    /**
     * indicates the key of the metadata item
     */
    @Nullable
    @Generated
    @Selector("key")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object key();

    /**
     * indicates the keyspace of the metadata item's key; this will typically
     * be the default keyspace for the metadata container in which the metadata item is stored
     */
    @Nullable
    @Generated
    @Selector("keySpace")
    public native String keySpace();

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(@NotNull NSArray<String> keys,
            @Nullable @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * indicates the locale of the metadata item; may be nil if no locale information is available for the metadata item
     */
    @Nullable
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    /**
     * provides the value of the metadata item as an NSNumber. If the metadata item's value can't be coerced to a
     * number, @"numberValue" will be nil.
     */
    @Nullable
    @Generated
    @Selector("numberValue")
    public native NSNumber numberValue();

    /**
     * indicates the start date of the timed metadata; nil if no date is indicated
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(@NotNull String key,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * provides the value of the metadata item as a string; will be nil if the value cannot be represented as a string
     */
    @Nullable
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    /**
     * indicates the timestamp of the metadata item.
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * provides the value of the metadata item
     */
    @Nullable
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler {
        @Generated
        void call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(
                @NotNull AVMetadataItemValueRequest valueRequest);
    }
}
