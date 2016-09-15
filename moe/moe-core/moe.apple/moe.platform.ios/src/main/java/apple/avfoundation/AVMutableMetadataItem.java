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
    @Owned
    @Selector("alloc")
    public static native AVMutableMetadataItem alloc();

    /**
     * dataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/dataType">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataType")
    public native String dataType();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("extendedLanguageTag")
    public native String extendedLanguageTag();

    /**
     * extraAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/extraAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("extraAttributes")
    public native NSDictionary<String, ?> extraAttributes();

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native AVMutableMetadataItem init();

    /**
     * key</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/key">iOS Dev Center</a>
     */
    @Generated
    @Selector("key")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object key();

    /**
     * keySpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/keySpace">iOS Dev Center</a>
     */
    @Generated
    @Selector("keySpace")
    public native String keySpace();

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * metadataItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/clm/AVMutableMetadataItem/metadataItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("metadataItem")
    public static native AVMutableMetadataItem metadataItem();

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

    /**
     * dataType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/dataType">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(String value);

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(@ByValue CMTime value);

    /**
     * extendedLanguageTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/extendedLanguageTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String value);

    /**
     * extraAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/extraAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExtraAttributes:")
    public native void setExtraAttributes(NSDictionary<String, ?> value);

    /**
     * identifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/identifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * key</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/key">iOS Dev Center</a>
     */
    @Generated
    @Selector("setKey:")
    public native void setKey(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * keySpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/keySpace">iOS Dev Center</a>
     */
    @Generated
    @Selector("setKeySpace:")
    public native void setKeySpace(String value);

    /**
     * locale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/locale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * time</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/time">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTime:")
    public native void setTime(@ByValue CMTime value);

    /**
     * value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/value">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * time</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/time">iOS Dev Center</a>
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    /**
     * value</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/value">iOS Dev Center</a>
     */
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();

    @Generated
    @Selector("metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:")
    public static native AVMetadataItem metadataItemWithPropertiesOfMetadataItemValueLoadingHandler(
            AVMetadataItem metadataItem,
            @ObjCBlock(name = "call_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler") AVMetadataItem.Block_metadataItemWithPropertiesOfMetadataItemValueLoadingHandler handler);

    /**
     * startDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/startDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    /**
     * startDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableMetadataItem_Class/index.html#//apple_ref/occ/instp/AVMutableMetadataItem/startDate">iOS Dev Center</a>
     */
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
    @Selector("identifierForKey:keySpace:")
    public static native String identifierForKeyKeySpace(@Mapped(ObjCObjectMapper.class) Object key, String keySpace);

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
    @Selector("keyForIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object keyForIdentifier(String identifier);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("keySpaceForIdentifier:")
    public static native String keySpaceForIdentifier(String identifier);

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
