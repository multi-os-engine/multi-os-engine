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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerMediaSelectionCriteria extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerMediaSelectionCriteria(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerMediaSelectionCriteria alloc();

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

    @Generated
    @Selector("init")
    public native AVPlayerMediaSelectionCriteria init();

    /**
     * initWithPreferredLanguages:preferredMediaCharacteristics:
     * <p>
     * Creates an instance of AVPlayerMediaSelectionCriteria.
     *
     * @param        preferredLanguages An NSArray of NSStrings containing language identifiers, in order of desirability, that are preferred for selection. Can be nil.
     * @param        preferredMediaCharacteristics An NSArray of AVMediaCharacteristics indicating additional media characteristics, in order of desirability, that are preferred when selecting media with the characteristic for which the receiver is set on the AVPlayer as the selection criteria. Can be nil.
     * @return An instance of AVPlayerMediaSelectionCriteria.
     */
    @Generated
    @Selector("initWithPreferredLanguages:preferredMediaCharacteristics:")
    public native AVPlayerMediaSelectionCriteria initWithPreferredLanguagesPreferredMediaCharacteristics(
            NSArray<String> preferredLanguages, NSArray<String> preferredMediaCharacteristics);

    /**
     * An NSArray of NSStrings containing language identifiers, in order of desirability, that are preferred for selection. Can be nil. Languages can be indicated via BCP 47 language identifiers or via ISO 639-2/T language codes.
     * If no option in a media selection group with any of the preferred languages is available, the default option in the group will be considered the best match.
     * When making selections, AVPlayer treats language preferences as criteria that supersede preferred media characteristics.
     */
    @Generated
    @Selector("preferredLanguages")
    public native NSArray<String> preferredLanguages();

    /**
     * An NSArray of AVMediaCharacteristics indicating additional media characteristics, in order of desirability, that are preferred when selecting media with the characteristic for which the receiver is set on the AVPlayer as the selection criteria. Can be nil. See AVMediaFormat.h for declarations of media characteristics of the form AVMediaCharacteristic*. For example, desirable characteristics of legible media may include AVMediaCharacteristicTranscribesSpokenDialogForAccessibility and AVMediaCharacteristicDescribesMusicAndSoundForAccessibility. Simiarly, desirable characteristics of audible media may include AVMediaCharacteristicDescribesVideoForAccessibility.
     * When making automatic selections, AVPlayer treats preferred media characteristics as criteria that are superseded by language preferences.
     */
    @Generated
    @Selector("preferredMediaCharacteristics")
    public native NSArray<String> preferredMediaCharacteristics();

    /**
     * initWithPrincipalMediaCharacteristics:principalMediaCharacteristics:preferredLanguages:preferredMediaCharacteristics:
     * <p>
     * Creates an instance of AVPlayerMediaSelectionCriteria.
     * <p>
     * Note that even though principal media characteristics, when present, will override language preferences when making a selection within a specific media selection group, language preferences may still pertain to selections in other groups. For example, language preferences for the group that corresponds to the audible characteristic may be considered when choosing whether or not to select non-forced subtitles for translation purposes.
     *
     * @param        principalMediaCharacteristics An NSArray of AVMediaCharacteristics indicating media characteristics that are considered essential when selecting media with the characteristic for which the receiver is set on the AVPlayer as the selection criteria. Can be nil.
     * @param        preferredLanguages An NSArray of NSStrings containing language identifiers, in order of desirability, that are preferred for selection. Can be nil.
     * @param        preferredMediaCharacteristics An NSArray of AVMediaCharacteristics indicating additional media characteristics, in order of desirability, that are preferred when selecting media with the characteristic for which the receiver is set on the AVPlayer as the selection criteria. Can be nil.
     * @return An instance of AVPlayerMediaSelectionCriteria.
     */
    @Generated
    @Selector("initWithPrincipalMediaCharacteristics:preferredLanguages:preferredMediaCharacteristics:")
    public native AVPlayerMediaSelectionCriteria initWithPrincipalMediaCharacteristicsPreferredLanguagesPreferredMediaCharacteristics(
            NSArray<String> principalMediaCharacteristics, NSArray<String> preferredLanguages,
            NSArray<String> preferredMediaCharacteristics);

    /**
     * An NSArray of AVMediaCharacteristics indicating media characteristics that are considered essential when selecting media with the characteristic for which the receiver is set on the AVPlayer as the selection criteria. Can be nil. See AVMediaFormat.h for declarations of media characteristics of the form AVMediaCharacteristic*. For example, principal characteristics of audible media may include AVMediaCharacteristicIsOriginalContent.
     * If no option in a media selection group that possesses all of the principal media characteristics is available, the default option in the group will be considered the best match.
     * When making automatic selections, AVPlayer treats principal media characteristics as criteria that supersede both language preferences and preferred media characteristics. Use principal media characteristics with caution; use cases in support of accessibility features are normally satisfied via the use of a combination of language preferences and preferred characteristics, not via the use of principal media characteristics.
     */
    @Generated
    @Selector("principalMediaCharacteristics")
    public native NSArray<String> principalMediaCharacteristics();
}
