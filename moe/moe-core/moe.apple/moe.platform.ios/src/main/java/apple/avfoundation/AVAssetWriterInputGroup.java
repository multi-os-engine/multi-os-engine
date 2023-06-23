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
 * AVAssetWriterInputGroup
 * 
 * Associates tracks corresponding to inputs with each other in a mutually exclusive relationship.
 * 
 * This class is used to associate tracks corresponding to multiple AVAssetWriterInputs as mutually exclusive to each
 * other for playback or other processing. For example, if you are creating an asset with multiple audio tracks using
 * different spoken languages, only one of which should be played at a time, group the inputs corresponding to those
 * tracks into a single instance of AVAssetWriterInputGroup and add the group to the AVAssetWriter via -[AVAssetWriter
 * addInputGroup:]. If the output format supports mutually exlusive relationships among tracks, the AVAssetWriter will
 * mark the tracks as mutually exclusive to each other.
 * 
 * Note that because AVAssetWriterInputGroup is a subclass of AVMediaSelectionGroup, clients can examine the media
 * selection options that will be available on the output asset before the asset is written. Best results for examining
 * the options of the AVAssetWriterInputGroup will be obtained after associating the AVAssetWriterInputs of the AVAsset
 * as appropriate via -[AVAssetWriterInput addTrackAssociationWithTrackOfInput:type:] and by initializing each
 * AVAssetWriterInput with a source format hint, where appropriate.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInputGroup extends AVMediaSelectionGroup {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInputGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInputGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetWriterInputGroup allocWithZone(VoidPtr zone);

    /**
     * assetWriterInputGroupWithInputs:defaultInput:
     * 
     * Creates an instance of AVAssetWriterInputGroup, for use with -[AVAssetWriter addInputGroup:].
     * 
     * @param inputs
     *                     The collection of AVAssetWriterInputs to be grouped together.
     * @param defaultInput
     *                     The instance of AVAssetWriterInput in the group to designate as the default. When the input
     *                     group is added to an AVAssetWriter via -addInputGroup:, the value of
     *                     marksOutputTrackAsEnabled will automatically be set to YES for the default input and set to
     *                     NO for all of the other inputs in the group.
     * @return
     *         An instance of AVAssetWriterInputGroup, for use with -[AVAssetWriter addInputGroup:].
     */
    @Generated
    @Selector("assetWriterInputGroupWithInputs:defaultInput:")
    public static native AVAssetWriterInputGroup assetWriterInputGroupWithInputsDefaultInput(
            @NotNull NSArray<? extends AVAssetWriterInput> inputs, @Nullable AVAssetWriterInput defaultInput);

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

    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayFilteredAndSortedAccordingToPreferredLanguages(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> preferredLanguages);

    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withLocale:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithLocale(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions, @NotNull NSLocale locale);

    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withMediaCharacteristics:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithMediaCharacteristics(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> mediaCharacteristics);

    @NotNull
    @Generated
    @Selector("mediaSelectionOptionsFromArray:withoutMediaCharacteristics:")
    public static native NSArray<? extends AVMediaSelectionOption> mediaSelectionOptionsFromArrayWithoutMediaCharacteristics(
            @NotNull NSArray<? extends AVMediaSelectionOption> mediaSelectionOptions,
            @NotNull NSArray<String> mediaCharacteristics);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetWriterInputGroup new_objc();

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
     * [@property] defaultInput
     * 
     * The input designated at the defaultInput of the receiver.
     * 
     * The value of this property is a concrete instance of AVAssetWriterInput.
     */
    @Nullable
    @Generated
    @Selector("defaultInput")
    public native AVAssetWriterInput defaultInput();

    @Generated
    @Selector("init")
    public native AVAssetWriterInputGroup init();

    /**
     * initWithInputs:defaultInput:
     * 
     * Creates an instance of AVAssetWriterInputGroup, for use with -[AVAssetWriter addInputGroup:].
     * 
     * @param inputs
     *                     The collection of AVAssetWriterInputs to be grouped together.
     * @param defaultInput
     *                     The instance of AVAssetWriterInput in the group to designate as the default. When the input
     *                     group is added to an AVAssetWriter via -addInputGroup:, the value of
     *                     marksOutputTrackAsEnabled will automatically be set to YES for the default input and set to
     *                     NO for all of the other inputs in the group.
     * @return
     *         An instance of AVAssetWriterInputGroup, for use with -[AVAssetWriter addInputGroup:].
     */
    @Generated
    @Selector("initWithInputs:defaultInput:")
    public native AVAssetWriterInputGroup initWithInputsDefaultInput(
            @NotNull NSArray<? extends AVAssetWriterInput> inputs, @Nullable AVAssetWriterInput defaultInput);

    /**
     * [@property] inputs
     * 
     * The inputs grouped together by the receiver.
     * 
     * The value of this property is an NSArray containing concrete instances of AVAssetWriterInput.
     */
    @NotNull
    @Generated
    @Selector("inputs")
    public native NSArray<? extends AVAssetWriterInput> inputs();
}
