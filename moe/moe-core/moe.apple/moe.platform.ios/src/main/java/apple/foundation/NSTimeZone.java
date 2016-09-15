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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTimeZone extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTimeZone(Pointer peer) {
        super(peer);
    }

    /**
     * abbreviation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/abbreviation">iOS Dev Center</a>
     */
    @Generated
    @Selector("abbreviation")
    public native String abbreviation();

    /**
     * abbreviationDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/abbreviationDictionary">iOS Dev Center</a>
     */
    @Generated
    @Selector("abbreviationDictionary")
    public static native NSDictionary<String, String> abbreviationDictionary();

    /**
     * abbreviationForDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/abbreviationForDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("abbreviationForDate:")
    public native String abbreviationForDate(NSDate aDate);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTimeZone alloc();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * data</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/data">iOS Dev Center</a>
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * daylightSavingTimeOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/daylightSavingTimeOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("daylightSavingTimeOffset")
    public native double daylightSavingTimeOffset();

    /**
     * daylightSavingTimeOffsetForDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/daylightSavingTimeOffsetForDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("daylightSavingTimeOffsetForDate:")
    public native double daylightSavingTimeOffsetForDate(NSDate aDate);

    /**
     * defaultTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/defaultTimeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultTimeZone")
    public static native NSTimeZone defaultTimeZone();

    /**
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSTimeZone init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTimeZone initWithCoder(NSCoder aDecoder);

    /**
     * initWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/initWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithName:")
    public native NSTimeZone initWithName(String tzName);

    /**
     * initWithName:data:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/initWithName:data:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithName:data:")
    public native NSTimeZone initWithNameData(String tzName, NSData aData);

    /**
     * daylightSavingTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/daylightSavingTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDaylightSavingTime")
    public native boolean isDaylightSavingTime();

    /**
     * isDaylightSavingTimeForDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/isDaylightSavingTimeForDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDaylightSavingTimeForDate:")
    public native boolean isDaylightSavingTimeForDate(NSDate aDate);

    /**
     * isEqualToTimeZone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/isEqualToTimeZone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToTimeZone:")
    public native boolean isEqualToTimeZone(NSTimeZone aTimeZone);

    /**
     * knownTimeZoneNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/knownTimeZoneNames">iOS Dev Center</a>
     */
    @Generated
    @Selector("knownTimeZoneNames")
    public static native NSArray<String> knownTimeZoneNames();

    /**
     * localTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/localTimeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("localTimeZone")
    public static native NSTimeZone localTimeZone();

    /**
     * localizedName:locale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/localizedName:locale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("localizedName:locale:")
    public native String localizedNameLocale(@NInt long style, NSLocale locale);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * nextDaylightSavingTimeTransition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/nextDaylightSavingTimeTransition">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextDaylightSavingTimeTransition")
    public native NSDate nextDaylightSavingTimeTransition();

    /**
     * nextDaylightSavingTimeTransitionAfterDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/nextDaylightSavingTimeTransitionAfterDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nextDaylightSavingTimeTransitionAfterDate:")
    public native NSDate nextDaylightSavingTimeTransitionAfterDate(NSDate aDate);

    /**
     * resetSystemTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/resetSystemTimeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("resetSystemTimeZone")
    public static native void resetSystemTimeZone();

    /**
     * secondsFromGMT</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instp/NSTimeZone/secondsFromGMT">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondsFromGMT")
    @NInt
    public native long secondsFromGMT();

    /**
     * secondsFromGMTForDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/instm/NSTimeZone/secondsFromGMTForDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("secondsFromGMTForDate:")
    @NInt
    public native long secondsFromGMTForDate(NSDate aDate);

    /**
     * setAbbreviationDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/setAbbreviationDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAbbreviationDictionary:")
    public static native void setAbbreviationDictionary(NSDictionary<String, String> dict);

    /**
     * setDefaultTimeZone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/setDefaultTimeZone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDefaultTimeZone:")
    public static native void setDefaultTimeZone(NSTimeZone aTimeZone);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * systemTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/systemTimeZone">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemTimeZone")
    public static native NSTimeZone systemTimeZone();

    /**
     * timeZoneDataVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/timeZoneDataVersion">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZoneDataVersion")
    public static native String timeZoneDataVersion();

    /**
     * timeZoneForSecondsFromGMT:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/timeZoneForSecondsFromGMT:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZoneForSecondsFromGMT:")
    public static native NSTimeZone timeZoneForSecondsFromGMT(@NInt long seconds);

    /**
     * timeZoneWithAbbreviation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/timeZoneWithAbbreviation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZoneWithAbbreviation:")
    public static native NSTimeZone timeZoneWithAbbreviation(String abbreviation);

    /**
     * timeZoneWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/timeZoneWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZoneWithName:")
    public static native NSTimeZone timeZoneWithName(String tzName);

    /**
     * timeZoneWithName:data:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSTimeZone_Class/index.html#//apple_ref/occ/clm/NSTimeZone/timeZoneWithName:data:">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeZoneWithName:data:")
    public static native NSTimeZone timeZoneWithNameData(String tzName, NSData aData);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
