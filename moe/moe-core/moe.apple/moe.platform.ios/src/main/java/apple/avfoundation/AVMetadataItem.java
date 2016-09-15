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
public class AVMetadataItem extends NSObject implements AVAsynchronousKeyValueLoading, NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMetadataItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMetadataItem alloc();

    /**
     * commonKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/commonKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("commonKey")
    public native String commonKey();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * dataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/dataType">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataType")
    public native String dataType();

    /**
     * dataValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/dataValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataValue")
    public native NSData dataValue();

    /**
     * dateValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/dateValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("dateValue")
    public native NSDate dateValue();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * extraAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/extraAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("extraAttributes")
    public native NSDictionary<String, ?> extraAttributes();

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * identifierForKey:keySpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/identifierForKey:keySpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifierForKey:keySpace:")
    public static native String identifierForKeyKeySpace(@Mapped(ObjCObjectMapper.class) Object key, String keySpace);

    @Generated
    @Selector("init")
    public native AVMetadataItem init();

    /**
     * key</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/key">iOS Dev Center</a>
     */
    @Generated
    @Selector("key")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object key();

    /**
     * keyForIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/keyForIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyForIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object keyForIdentifier(String identifier);

    /**
     * keySpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/keySpace">iOS Dev Center</a>
     */
    @Generated
    @Selector("keySpace")
    public native String keySpace();

    /**
     * keySpaceForIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/keySpaceForIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keySpaceForIdentifier:")
    public static native String keySpaceForIdentifier(String identifier);

    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronouslyForKeysCompletionHandler(NSArray<String> keys,
            @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredAndSortedAccordingToPreferredLanguages(
            NSArray<? extends AVMetadataItem> metadataItems, NSArray<String> preferredLanguages);

    /**
     * metadataItemsFromArray:filteredByIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/metadataItemsFromArray:filteredByIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByIdentifier(
            NSArray<? extends AVMetadataItem> metadataItems, String identifier);

    /**
     * metadataItemsFromArray:filteredByMetadataItemFilter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/metadataItemsFromArray:filteredByMetadataItemFilter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayFilteredByMetadataItemFilter(
            NSArray<? extends AVMetadataItem> metadataItems, AVMetadataItemFilter metadataItemFilter);

    /**
     * metadataItemsFromArray:withKey:keySpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/metadataItemsFromArray:withKey:keySpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithKeyKeySpace(
            NSArray<? extends AVMetadataItem> metadataItems, @Mapped(ObjCObjectMapper.class) Object key,
            String keySpace);

    /**
     * metadataItemsFromArray:withLocale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMetadataItem/metadataItemsFromArray:withLocale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItemsFromArray:withLocale:")
    public static native NSArray<? extends AVMetadataItem> metadataItemsFromArrayWithLocale(
            NSArray<? extends AVMetadataItem> metadataItems, NSLocale locale);

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * numberValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/numberValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberValue")
    public native NSNumber numberValue();

    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    public native long statusOfValueForKeyError(String key, Ptr<NSError> outError);

    /**
     * stringValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/stringValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    /**
     * time</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/time">iOS Dev Center</a>
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMetadataItem/value">iOS Dev Center</a>
     */
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();

    @Generated
    @Selector("metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:")
    public static native AVMetadataItem metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(
            AVMetadataItem metadataItem,
            @ObjCBlock(name = "call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler") Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler {
        @Generated
        void call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(AVMetadataItemValueRequest arg0);
    }

    @Generated
    @Selector("startDate")
    public native NSDate startDate();

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
    public static native long version_static();
}
