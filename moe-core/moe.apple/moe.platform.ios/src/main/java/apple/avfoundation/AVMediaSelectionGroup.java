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
import apple.foundation.NSArray;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.mediaplayer.MPNowPlayingInfoLanguageOptionGroup;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVMediaSelectionGroup provides a collection of mutually exclusive options for the presentation of media within an
 * asset.
 * 
 * API-Since: 5.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMediaSelectionGroup extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMediaSelectionGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMediaSelectionGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMediaSelectionGroup allocWithZone(VoidPtr zone);

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

    /**
     * Filters an array of AVMediaSelectionOptions according to whether their locales match any language identifier in
     * the specified array of preferred languages. The returned array is sorted according to the order of preference of
     * the language each matches.
     * 
     * - Parameter mediaSelectionOptions: An array of AVMediaSelectionOptions to be filtered and sorted.
     * - Parameter preferredLanguages: An array of language identifiers in order of preference, each of which is an IETF
     * BCP 47 (RFC 4646) language identifier. If your goal is to provide the best match for the end user's preferred
     * languages without consideration of your app's available localizations, pass [NSLocale preferredLanguages] as the
     * value of preferredLanguages. However, if you want to filter the available choices in order to obtain the best
     * match among the localizations that are available for your app, pass [NSBundle
     * preferredLocalizationsFromArray:[[NSBundle mainBundle] localizations] forPreferences:[NSLocale
     * preferredLanguages]] instead. The latter choice is normally more appropriate for strings intended for display as
     * part of the app's UI.
     * 
     * - Returns: An instance of NSArray containing media selection options of the specified NSArray that match a
     * preferred language, sorted according to the order of preference of the language each matches.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayFilteredAndSortedAccordingToPreferredLanguages(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> preferredLanguages);

    /**
     * Filters an array of AVMediaSelectionOptions according to locale.
     * 
     * - Parameter mediaSelectionOptions: An array of AVMediaSelectionOption to be filtered by locale.
     * - Parameter locale: The NSLocale that must be matched for a media selection option to be copied to the output
     * array.
     * 
     * - Returns: An instance of NSArray containing the media selection options of the specified NSArray that match the
     * specified locale.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withLocale:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithLocale(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions, @NotNull NSLocale locale);

    /**
     * Filters an array of AVMediaSelectionOptions according to one or more media characteristics.
     * 
     * - Parameter mediaSelectionOptions: An array of AVMediaSelectionOptions to be filtered by media characteristic.
     * - Parameter mediaCharacteristics: The media characteristics that must be matched for a media selection option to
     * be copied to the output array.
     * 
     * - Returns: An instance of NSArray containing the media selection options of the specified NSArray that match the
     * specified
     * media characteristics.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withMediaCharacteristics:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithMediaCharacteristics(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> mediaCharacteristics);

    /**
     * Filters an array of AVMediaSelectionOptions according to whether they lack one or more media characteristics.
     * 
     * - Parameter mediaSelectionOptions: An array of AVMediaSelectionOptions to be filtered by media characteristic.
     * - Parameter mediaCharacteristics: The media characteristics that must not be present for a media selection option
     * to be copied to the output array.
     * 
     * - Returns: An instance of NSArray containing the media selection options of the specified NSArray that lack the
     * specified
     * media characteristics.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withoutMediaCharacteristics:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithoutMediaCharacteristics(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> mediaCharacteristics);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMediaSelectionGroup new_objc();

    /**
     * Filters an array of AVMediaSelectionOptions according to whether they are playable.
     * 
     * - Parameter mediaSelectionOptions: An array of AVMediaSelectionOption to be filtered according to whether they
     * are playable.
     * 
     * - Returns: An instance of NSArray containing the media selection options of the specified NSArray that are
     * playable.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("playableMediaSelectionOptionsFromArray:")
    public static native NSArray<? extends AVMediaSelectionOption> playableMediaSelectionOptionsFromArray(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions);

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
     * Indicates whether it's possible to present none of the options in the group when an associated AVPlayerItem is
     * played.
     * 
     * If allowsEmptySelection is YES, all of the available media options in the group can be deselected by passing nil
     * as the specified AVMediaSelectionOption to -[AVPlayerItem selectMediaOption:inMediaSelectionGroup:].
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("allowsEmptySelection")
    public native boolean allowsEmptySelection();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Indicates the default option in the group, i.e. the option that's intended for use in the absence of a specific
     * end-user selection or preference.
     * 
     * Can be nil, indicating that without a specific end-user selection or preference, no option in the group is
     * intended to be selected.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("defaultOption")
    public native AVMediaSelectionOption defaultOption();

    @Generated
    @Selector("init")
    public native AVMediaSelectionGroup init();

    /**
     * Will create a language option group from the AVMediaSelectionGroup
     * Any AVMediaSelectionOptions in the AVMediaSelectionGroup not representing
     * Audible or Legible selection options will be ignored.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("makeNowPlayingInfoLanguageOptionGroup")
    public native MPNowPlayingInfoLanguageOptionGroup makeNowPlayingInfoLanguageOptionGroup();

    /**
     * Returns the instance of AVMediaSelectionOption with properties that match the specified property list.
     * 
     * - Parameter plist: A property list previously obtained from an option in the group via -[AVMediaSelectionOption
     * propertyList].
     * 
     * - Returns: If the specified properties match those of an option in the group, an instance of
     * AVMediaSelectionOption. Otherwise nil.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("mediaSelectionOptionWithPropertyList:")
    public native AVMediaSelectionOption mediaSelectionOptionWithPropertyList(
            @NotNull @Mapped(ObjCObjectMapper.class) Object plist);

    /**
     * A collection of mutually exclusive media selection options.
     * 
     * An NSArray of AVMediaSelectionOption*.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("options")
    public native NSArray<? extends AVMediaSelectionOption> options();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * For content that has been authored with the express intent of offering an alternative selection interface for
     * AVMediaSelectionOptions, AVCustomMediaSelectionScheme provides a collection of custom settings for controlling
     * the presentation of the media.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("customMediaSelectionScheme")
    @Nullable
    public native AVCustomMediaSelectionScheme customMediaSelectionScheme();
}
