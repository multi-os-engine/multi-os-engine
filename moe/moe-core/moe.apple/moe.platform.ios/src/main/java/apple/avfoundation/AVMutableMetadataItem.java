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
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableMetadataItem extends AVMetadataItem {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableMetadataItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableMetadataItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableMetadataItem allocWithZone(VoidPtr zone);

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
    @Selector("identifierForKey:keySpace:")
    public static native String identifierForKeyKeySpace(@Mapped(ObjCObjectMapper.class) Object key, String keySpace);

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
    @Selector("keyForIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object keyForIdentifier(String identifier);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("keySpaceForIdentifier:")
    public static native String keySpaceForIdentifier(String identifier);

    /**
     * metadataItem
     * 
     * Returns an instance of AVMutableMetadataItem.
     */
    @Generated
    @Selector("metadataItem")
    public static native AVMutableMetadataItem metadataItem();

    @Generated
    @Selector("metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:")
    public static native AVMetadataItem metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(
            AVMetadataItem metadataItem,
            @ObjCBlock(name = "call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler") AVMetadataItem.Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler handler);

    @Generated
    @Selector("metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredAndSortedAccordingToPreferredLanguages(
            NSArray<? extends AVMetadataItem> metadataItems, NSArray<String> preferredLanguages);

    @Generated
    @Selector("metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByIdentifier(
            NSArray<? extends AVMetadataItem> metadataItems, String identifier);

    @Generated
    @Selector("metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByMetadataItemFilter(
            NSArray<? extends AVMetadataItem> metadataItems, AVMetadataItemFilter metadataItemFilter);

    @Generated
    @Selector("metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithKeyKeySpace(
            NSArray<? extends AVMetadataItem> metadataItems, @Mapped(ObjCObjectMapper.class) Object key,
            String keySpace);

    @Generated
    @Selector("metadataItemsFromArray:withLocale:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithLocale(
            NSArray<? extends AVMetadataItem> metadataItems, NSLocale locale);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMutableMetadataItem new_objc();

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
     * indicates the data type of the metadata item's value. Publicly defined data types are declared in
     * <CoreMedia/CMMetadata.h>
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("dataType")
    public native String dataType();

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
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * Provides a dictionary of the additional attributes. Extra attributes of metadata items are related to specifics
     * of their carriage in their container format. Keys for extra attributes are declared in AVMetadataFormat.h.
     */
    @Generated
    @Selector("extraAttributes")
    public native NSDictionary<String, ?> extraAttributes();

    /**
     * Indicates the identifier of the metadata item. Publicly defined identifiers are declared in
     * AVMetadataIdentifiers.h. This property throws an exception if identifier is not of the form \"<keySpace>/<key>\".
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVMutableMetadataItem init();

    /**
     * Indicates the key of the metadata item. Metadata item keys that are not instances NSString, NSNumber, or NSData
     * cannot be converted to metadata identifiers; they also cannot be written to media resources via
     * AVAssetExportSession or AVAssetWriter.
     */
    @Generated
    @Selector("key")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object key();

    /**
     * Indicates the keyspace of the metadata item's key; this will typically be the default keyspace for the metadata
     * container in which the metadata item is stored.
     */
    @Generated
    @Selector("keySpace")
    public native String keySpace();

    /**
     * indicates the locale of the metadata item; may be nil if no locale information is available for the metadata item
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * indicates the data type of the metadata item's value. Publicly defined data types are declared in
     * <CoreMedia/CMMetadata.h>
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(String value);

    /**
     * indicates the duration of the metadata item
     * 
     * API-Since: 4.2
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(@ByValue CMTime value);

    /**
     * indicates the IETF BCP 47 (RFC 4646) language identifier of the metadata item; may be nil if no language tag
     * information is available
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * Provides a dictionary of the additional attributes. Extra attributes of metadata items are related to specifics
     * of their carriage in their container format. Keys for extra attributes are declared in AVMetadataFormat.h.
     */
    @Generated
    @Selector("setExtraAttributes:")
    public native void setExtraAttributes(NSDictionary<String, ?> value);

    /**
     * Indicates the identifier of the metadata item. Publicly defined identifiers are declared in
     * AVMetadataIdentifiers.h. This property throws an exception if identifier is not of the form \"<keySpace>/<key>\".
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * Indicates the key of the metadata item. Metadata item keys that are not instances NSString, NSNumber, or NSData
     * cannot be converted to metadata identifiers; they also cannot be written to media resources via
     * AVAssetExportSession or AVAssetWriter.
     */
    @Generated
    @Selector("setKey:")
    public native void setKey(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Indicates the keyspace of the metadata item's key; this will typically be the default keyspace for the metadata
     * container in which the metadata item is stored.
     */
    @Generated
    @Selector("setKeySpace:")
    public native void setKeySpace(String value);

    /**
     * indicates the locale of the metadata item; may be nil if no locale information is available for the metadata item
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * indicates the start date of the timed metadata; nil if no date is indicated
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    /**
     * indicates the timestamp of the metadata item.
     */
    @Generated
    @Selector("setTime:")
    public native void setTime(@ByValue CMTime value);

    /**
     * provides the value of the metadata item
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * indicates the start date of the timed metadata; nil if no date is indicated
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

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
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();
}
