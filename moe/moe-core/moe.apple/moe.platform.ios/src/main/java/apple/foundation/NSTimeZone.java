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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @NotNull
    @Generated
    @Selector("abbreviationDictionary")
    public static native NSDictionary<String, String> abbreviationDictionary();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTimeZone alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTimeZone allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("defaultTimeZone")
    public static native NSTimeZone defaultTimeZone();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("knownTimeZoneNames")
    public static native NSArray<String> knownTimeZoneNames();

    @NotNull
    @Generated
    @Selector("localTimeZone")
    public static native NSTimeZone localTimeZone();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTimeZone new_objc();

    @Generated
    @Selector("resetSystemTimeZone")
    public static native void resetSystemTimeZone();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("setAbbreviationDictionary:")
    public static native void setAbbreviationDictionary(@NotNull NSDictionary<String, String> value);

    @Generated
    @Selector("setDefaultTimeZone:")
    public static native void setDefaultTimeZone(@NotNull NSTimeZone value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @NotNull
    @Generated
    @Selector("systemTimeZone")
    public static native NSTimeZone systemTimeZone();

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("timeZoneDataVersion")
    public static native String timeZoneDataVersion();

    /**
     * Time zones created with this never have daylight savings and the
     * offset is constant no matter the date; the name and abbreviation
     * do NOT follow the POSIX convention (of minutes-west).
     */
    @Generated
    @Selector("timeZoneForSecondsFromGMT:")
    public static native NSTimeZone timeZoneForSecondsFromGMT(@NInt long seconds);

    @Generated
    @Selector("timeZoneWithAbbreviation:")
    public static native NSTimeZone timeZoneWithAbbreviation(@NotNull String abbreviation);

    /**
     * Primary creation method is +timeZoneWithName:; the
     * data-taking variants should rarely be used directly
     */
    @Generated
    @Selector("timeZoneWithName:")
    public static native NSTimeZone timeZoneWithName(@NotNull String tzName);

    @Generated
    @Selector("timeZoneWithName:data:")
    public static native NSTimeZone timeZoneWithNameData(@NotNull String tzName, @Nullable NSData aData);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("abbreviation")
    public native String abbreviation();

    @Nullable
    @Generated
    @Selector("abbreviationForDate:")
    public native String abbreviationForDate(@NotNull NSDate aDate);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * for current instant
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("daylightSavingTimeOffset")
    public native double daylightSavingTimeOffset();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("daylightSavingTimeOffsetForDate:")
    public native double daylightSavingTimeOffsetForDate(@NotNull NSDate aDate);

    @NotNull
    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NSTimeZone init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTimeZone initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithName:")
    public native NSTimeZone initWithName(@NotNull String tzName);

    @Generated
    @Selector("initWithName:data:")
    public native NSTimeZone initWithNameData(@NotNull String tzName, @Nullable NSData aData);

    @Generated
    @Selector("isDaylightSavingTime")
    public native boolean isDaylightSavingTime();

    @Generated
    @Selector("isDaylightSavingTimeForDate:")
    public native boolean isDaylightSavingTimeForDate(@NotNull NSDate aDate);

    @Generated
    @Selector("isEqualToTimeZone:")
    public native boolean isEqualToTimeZone(@NotNull NSTimeZone aTimeZone);

    /**
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("localizedName:locale:")
    public native String localizedNameLocale(@NInt long style, @Nullable NSLocale locale);

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * after current instant
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("nextDaylightSavingTimeTransition")
    public native NSDate nextDaylightSavingTimeTransition();

    /**
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @Selector("nextDaylightSavingTimeTransitionAfterDate:")
    public native NSDate nextDaylightSavingTimeTransitionAfterDate(@NotNull NSDate aDate);

    @Generated
    @Selector("secondsFromGMT")
    @NInt
    public native long secondsFromGMT();

    @Generated
    @Selector("secondsFromGMTForDate:")
    @NInt
    public native long secondsFromGMTForDate(@NotNull NSDate aDate);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
