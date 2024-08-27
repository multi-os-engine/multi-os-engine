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
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 6.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSByteCountFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSByteCountFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSByteCountFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSByteCountFormatter allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native NSByteCountFormatter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shortcut for converting a byte count into a string without creating an NSByteCountFormatter and an NSNumber. If
     * you need to specify options other than countStyle, create an instance of NSByteCountFormatter first.
     */
    @NotNull
    @Generated
    @Selector("stringFromByteCount:countStyle:")
    public static native String stringFromByteCountCountStyle(long byteCount, @NInt long countStyle);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Specify the units that can be used in the output. If NSByteCountFormatterUseDefault, uses platform-appropriate
     * settings; otherwise will only use the specified units. This is the default value. Note that ZB and YB cannot be
     * covered by the range of possible values, but you can still choose to use these units to get fractional display
     * ("0.0035 ZB" for instance).
     */
    @Generated
    @Selector("allowedUnits")
    @NUInt
    public native long allowedUnits();

    /**
     * Choose whether to allow more natural display of some values, such as zero, where it may be displayed as "Zero
     * KB," ignoring all other flags or options (with the exception of NSByteCountFormatterUseBytes, which would
     * generate "Zero bytes"). The result is appropriate for standalone output. Default value is YES. Special handling
     * of certain values such as zero is especially important in some languages, so it's highly recommended that this
     * property be left in its default state.
     */
    @Generated
    @Selector("allowsNonnumericFormatting")
    public native boolean allowsNonnumericFormatting();

    /**
     * Specify how the count is displayed by indicating the number of bytes to be used for kilobyte. The default setting
     * is NSByteCountFormatterFileCount, which is the system specific value for file and storage sizes.
     */
    @Generated
    @Selector("countStyle")
    @NInt
    public native long countStyle();

    /**
     * Specify the formatting context for the formatted string. Default is NSFormattingContextUnknown.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("formattingContext")
    @NInt
    public native long formattingContext();

    /**
     * Choose whether to parenthetically (localized as appropriate) display the actual number of bytes as well, for
     * instance "723 KB (722,842 bytes)". This will happen only if needed, that is, the first part is already not
     * showing the exact byte count. If includesUnit or includesCount are NO, then this setting has no effect. Default
     * value is NO.
     */
    @Generated
    @Selector("includesActualByteCount")
    public native boolean includesActualByteCount();

    @Generated
    @Selector("includesCount")
    public native boolean includesCount();

    /**
     * Choose whether to include the number or the units in the resulting formatted string. (For example, instead of 723
     * KB, returns "723" or "KB".) You can call the API twice to get both parts, separately. But note that putting them
     * together yourself via string concatenation may be wrong for some locales; so use this functionality with care.
     * Both of these values are YES by default. Setting both to NO will unsurprisingly result in an empty string.
     */
    @Generated
    @Selector("includesUnit")
    public native boolean includesUnit();

    @Generated
    @Selector("init")
    public native NSByteCountFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSByteCountFormatter initWithCoder(@NotNull NSCoder coder);

    /**
     * Choose the display style. The "adaptive" algorithm is platform specific and uses a different number of fraction
     * digits based on the magnitude (in 10.8: 0 fraction digits for bytes and KB; 1 fraction digits for MB; 2 for GB
     * and above). Otherwise the result always tries to show at least three significant digits, introducing fraction
     * digits as necessary. Default is YES.
     */
    @Generated
    @Selector("isAdaptive")
    public native boolean isAdaptive();

    /**
     * Choose the display style. The "adaptive" algorithm is platform specific and uses a different number of fraction
     * digits based on the magnitude (in 10.8: 0 fraction digits for bytes and KB; 1 fraction digits for MB; 2 for GB
     * and above). Otherwise the result always tries to show at least three significant digits, introducing fraction
     * digits as necessary. Default is YES.
     */
    @Generated
    @Selector("setAdaptive:")
    public native void setAdaptive(boolean value);

    /**
     * Specify the units that can be used in the output. If NSByteCountFormatterUseDefault, uses platform-appropriate
     * settings; otherwise will only use the specified units. This is the default value. Note that ZB and YB cannot be
     * covered by the range of possible values, but you can still choose to use these units to get fractional display
     * ("0.0035 ZB" for instance).
     */
    @Generated
    @Selector("setAllowedUnits:")
    public native void setAllowedUnits(@NUInt long value);

    /**
     * Choose whether to allow more natural display of some values, such as zero, where it may be displayed as "Zero
     * KB," ignoring all other flags or options (with the exception of NSByteCountFormatterUseBytes, which would
     * generate "Zero bytes"). The result is appropriate for standalone output. Default value is YES. Special handling
     * of certain values such as zero is especially important in some languages, so it's highly recommended that this
     * property be left in its default state.
     */
    @Generated
    @Selector("setAllowsNonnumericFormatting:")
    public native void setAllowsNonnumericFormatting(boolean value);

    /**
     * Specify how the count is displayed by indicating the number of bytes to be used for kilobyte. The default setting
     * is NSByteCountFormatterFileCount, which is the system specific value for file and storage sizes.
     */
    @Generated
    @Selector("setCountStyle:")
    public native void setCountStyle(@NInt long value);

    /**
     * Specify the formatting context for the formatted string. Default is NSFormattingContextUnknown.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setFormattingContext:")
    public native void setFormattingContext(@NInt long value);

    /**
     * Choose whether to parenthetically (localized as appropriate) display the actual number of bytes as well, for
     * instance "723 KB (722,842 bytes)". This will happen only if needed, that is, the first part is already not
     * showing the exact byte count. If includesUnit or includesCount are NO, then this setting has no effect. Default
     * value is NO.
     */
    @Generated
    @Selector("setIncludesActualByteCount:")
    public native void setIncludesActualByteCount(boolean value);

    @Generated
    @Selector("setIncludesCount:")
    public native void setIncludesCount(boolean value);

    /**
     * Choose whether to include the number or the units in the resulting formatted string. (For example, instead of 723
     * KB, returns "723" or "KB".) You can call the API twice to get both parts, separately. But note that putting them
     * together yourself via string concatenation may be wrong for some locales; so use this functionality with care.
     * Both of these values are YES by default. Setting both to NO will unsurprisingly result in an empty string.
     */
    @Generated
    @Selector("setIncludesUnit:")
    public native void setIncludesUnit(boolean value);

    /**
     * Choose whether to zero pad fraction digits so a consistent number of fraction digits are displayed, causing
     * updating displays to remain more stable. For instance, if the adaptive algorithm is used, this option formats
     * 1.19 and 1.2 GB as "1.19 GB" and "1.20 GB" respectively, while without the option the latter would be displayed
     * as "1.2 GB". Default value is NO.
     */
    @Generated
    @Selector("setZeroPadsFractionDigits:")
    public native void setZeroPadsFractionDigits(boolean value);

    /**
     * Convenience method on stringForObjectValue:. Convert a byte count into a string without creating an NSNumber.
     */
    @NotNull
    @Generated
    @Selector("stringFromByteCount:")
    public native String stringFromByteCount(long byteCount);

    /**
     * Choose whether to zero pad fraction digits so a consistent number of fraction digits are displayed, causing
     * updating displays to remain more stable. For instance, if the adaptive algorithm is used, this option formats
     * 1.19 and 1.2 GB as "1.19 GB" and "1.20 GB" respectively, while without the option the latter would be displayed
     * as "1.2 GB". Default value is NO.
     */
    @Generated
    @Selector("zeroPadsFractionDigits")
    public native boolean zeroPadsFractionDigits();

    /**
     * Formats `obj` as a byte count (if `obj` is an `NSNumber`) or specific byte measurement (if `obj` is an
     * `NSMeasurement`) using the receiver's settings.
     * 
     * Returns `nil` if `obj` is not of the correct class (`NSNumber` or `NSMeasurement`).
     * Throws an exception if `obj` is an `NSMeasurement` whose unit does not belong to the `NSUnitInformationStorage`
     * dimension.
     */
    @Nullable
    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    /**
     * Formats the value of the given measurement using the receiver's `countStyle`.
     * Converts the measurement to the units allowed by the receiver's `allowedUnits` before formatting; depending on
     * the value of the measurement, this may result in a string which implies an approximate value (e.g. if the
     * measurement is too large to represent in `allowedUnits`, like `1e20 YB` expressed in
     * `NSByteCountFormatterUseBytes`).
     * 
     * Throws an exception if the given measurement's unit does not belong to the `NSUnitInformationStorage` dimension.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("stringFromMeasurement:")
    public native String stringFromMeasurement(@NotNull NSMeasurement<NSUnitInformationStorage> measurement);

    /**
     * Formats the value of the given measurement using the given `countStyle`.
     * 
     * Throws an exception if the given measurement's unit does not belong to the `NSUnitInformationStorage` dimension.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("stringFromMeasurement:countStyle:")
    public static native String stringFromMeasurementCountStyle(
            @NotNull NSMeasurement<NSUnitInformationStorage> measurement, @NInt long countStyle);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
