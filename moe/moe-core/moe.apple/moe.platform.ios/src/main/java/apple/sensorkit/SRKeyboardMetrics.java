package apple.sensorkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUnitDuration;
import apple.foundation.NSUnitLength;
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

@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRKeyboardMetrics extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SRKeyboardMetrics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRKeyboardMetrics alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SRKeyboardMetrics allocWithZone(VoidPtr zone);

    /**
     * The duration between touchup of any key and touch down on a sequential character key
     */
    @Generated
    @Selector("anyTapToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> anyTapToCharKey();

    /**
     * The duration between touchup of any key and touch down on a plane change key
     */
    @Generated
    @Selector("anyTapToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> anyTapToPlaneChangeKey();

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

    /**
     * The duration between touchup on a character key and touch down on the next sequential key (any key)
     */
    @Generated
    @Selector("charKeyToAnyTapKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> charKeyToAnyTapKey();

    /**
     * The duration between touchup of a character key and touch down of a sequential delete key
     */
    @Generated
    @Selector("charKeyToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> charKeyToDelete();

    /**
     * The duration between touchup of a character key and touch down of a sequential plane change key
     */
    @Generated
    @Selector("charKeyToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> charKeyToPlaneChangeKey();

    /**
     * The duration between touchup on a character key and touch down on a word in the prediction bar
     */
    @Generated
    @Selector("charKeyToPrediction")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> charKeyToPrediction();

    /**
     * The duration between touchup of a character key and touch down of a sequential space key
     */
    @Generated
    @Selector("charKeyToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> charKeyToSpaceKey();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The distance from the touch down to the center of the delete key
     */
    @Generated
    @Selector("deleteDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> deleteDownErrorDistance();

    /**
     * The duration between touchup of a delete key and touch down of a sequential character key
     */
    @Generated
    @Selector("deleteToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToCharKey();

    /**
     * The duration between touchup of a delete key and touch down of a sequential delete key
     */
    @Generated
    @Selector("deleteToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToDelete();

    /**
     * The duration between touchup of the delete key and touch down of a sequential delete key
     */
    @Generated
    @Selector("deleteToDeletes")
    public native NSArray<? extends SRKeyboardProbabilityMetric<NSUnitDuration>> deleteToDeletes();

    /**
     * The duration between touchup of a delete key and touch down of a sequential path
     */
    @Generated
    @Selector("deleteToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToPath();

    /**
     * The duration between touchup of a delete key and touch down of a sequential plane change key
     */
    @Generated
    @Selector("deleteToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToPlaneChangeKey();

    /**
     * The duration between touchup of a delete key and touch down of a sequential Shift key
     */
    @Generated
    @Selector("deleteToShiftKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToShiftKey();

    /**
     * The duration between touchup of a delete key and touch down of a sequential space key
     */
    @Generated
    @Selector("deleteToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteToSpaceKey();

    /**
     * The duration between touch down and touchup of all delete key events in the session.
     */
    @Generated
    @Selector("deleteTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> deleteTouchDownUp();

    /**
     * The distance from the touch up to the center of the delete key
     */
    @Generated
    @Selector("deleteUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> deleteUpErrorDistance();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The distance from the touch down to the center of any key
     */
    @Generated
    @Selector("downErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> downErrorDistance();

    /**
     * The duration over which these metrics were calculated
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * The count of emoji typed per category in the session
     */
    @Generated
    @Selector("emojiCountForSentimentCategory:")
    @NInt
    public native long emojiCountForSentimentCategory(@NInt long category);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The height of the keyboard in mm in the session
     */
    @Generated
    @Selector("height")
    public native NSMeasurement<NSUnitLength> height();

    @Generated
    @Selector("init")
    public native SRKeyboardMetrics init();

    /**
     * The input modes used during a keyboard session
     */
    @Generated
    @Selector("inputModes")
    public native NSArray<String> inputModes();

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

    /**
     * The identifier of the keyboard in the keyboard list
     */
    @Generated
    @Selector("keyboardIdentifier")
    public native String keyboardIdentifier();

    /**
     * The distance from the touch down to the center of the intended key of the characters of a long word
     */
    @Generated
    @Selector("longWordDownErrorDistance")
    public native NSArray<? extends SRKeyboardProbabilityMetric<NSUnitLength>> longWordDownErrorDistance();

    /**
     * The duration between touch down and touch down of the character keys of all the long words in the session.
     */
    @Generated
    @Selector("longWordTouchDownDown")
    public native NSArray<? extends SRKeyboardProbabilityMetric<NSUnitDuration>> longWordTouchDownDown();

    /**
     * The duration between touch down and touchup of the character keys of all the long words in the session.
     */
    @Generated
    @Selector("longWordTouchDownUp")
    public native NSArray<? extends SRKeyboardProbabilityMetric<NSUnitDuration>> longWordTouchDownUp();

    /**
     * The distance from the touch up to the center of the intended key of the characters of a long word
     */
    @Generated
    @Selector("longWordUpErrorDistance")
    public native NSArray<? extends SRKeyboardProbabilityMetric<NSUnitLength>> longWordUpErrorDistance();

    @Generated
    @Owned
    @Selector("new")
    public static native SRKeyboardMetrics new_objc();

    /**
     * sample values of the ratio of error distance between intended and actual path
     */
    @Generated
    @Selector("pathErrorDistanceRatio")
    public native NSArray<? extends NSNumber> pathErrorDistanceRatio();

    /**
     * The duration between touchup of a delete key and touch down of a sequential path (ie. Continuous Path)
     */
    @Generated
    @Selector("pathToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> pathToDelete();

    /**
     * The duration between touchup of a path and touch down of a sequential path
     */
    @Generated
    @Selector("pathToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> pathToPath();

    /**
     * The duration between touchup of a path and touch down of a sequential space key
     */
    @Generated
    @Selector("pathToSpace")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> pathToSpace();

    /**
     * The words per minute typed using continuous path during the session
     */
    @Generated
    @Selector("pathTypingSpeed")
    public native double pathTypingSpeed();

    /**
     * The duration between touchup of a plane change key and touch down of any key
     */
    @Generated
    @Selector("planeChangeKeyToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> planeChangeKeyToCharKey();

    /**
     * The duration between touchup on a plane change key and touch down on the next sequential key
     */
    @Generated
    @Selector("planeChangeToAnyTap")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> planeChangeToAnyTap();

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
     * The distance from the touch down to the center of the intended key of a character in a short word
     */
    @Generated
    @Selector("shortWordCharKeyDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> shortWordCharKeyDownErrorDistance();

    /**
     * The duration between touchup on a character key and touch down on any sequential character key in a short word
     */
    @Generated
    @Selector("shortWordCharKeyToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> shortWordCharKeyToCharKey();

    /**
     * The duration between touch down and touchup of all character keys in short words in the session.
     */
    @Generated
    @Selector("shortWordCharKeyTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> shortWordCharKeyTouchDownUp();

    /**
     * The distance from the touch up to the center of the intended key of a character in a short word
     */
    @Generated
    @Selector("shortWordCharKeyUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> shortWordCharKeyUpErrorDistance();

    /**
     * The distance from the touch down to the right centroid of the space key
     */
    @Generated
    @Selector("spaceDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> spaceDownErrorDistance();

    /**
     * The duration between touchup of a space key and touch down of a sequential character key
     */
    @Generated
    @Selector("spaceToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToCharKey();

    /**
     * The duration between touchup of a space key and touch down of a sequential delete key
     */
    @Generated
    @Selector("spaceToDeleteKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToDeleteKey();

    /**
     * The duration between touchup on the space key and touch down to begin a sequential path
     */
    @Generated
    @Selector("spaceToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToPath();

    /**
     * The duration between touchup of a space key and touch down of a sequential plane change key
     */
    @Generated
    @Selector("spaceToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToPlaneChangeKey();

    /**
     * The duration between touchup on the space key and touch down of a sequential selection from the prediction bar
     */
    @Generated
    @Selector("spaceToPredictionKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToPredictionKey();

    /**
     * The duration between touchup of a space key and touch down of a sequential Shift key
     */
    @Generated
    @Selector("spaceToShiftKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToShiftKey();

    /**
     * The duration between touchup of a space key and touch down of a sequential space key
     */
    @Generated
    @Selector("spaceToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceToSpaceKey();

    /**
     * The duration between touch down and touchup of all space key events in the session.
     */
    @Generated
    @Selector("spaceTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> spaceTouchDownUp();

    /**
     * The distance from the touch up to the right centroid of the space key
     */
    @Generated
    @Selector("spaceUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> spaceUpErrorDistance();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The total number of altered words during the session
     */
    @Generated
    @Selector("totalAlteredWords")
    @NInt
    public native long totalAlteredWords();

    /**
     * The total number of autocorrections in the session
     */
    @Generated
    @Selector("totalAutoCorrections")
    @NInt
    public native long totalAutoCorrections();

    /**
     * The total number of deletes during the session
     */
    @Generated
    @Selector("totalDeletes")
    @NInt
    public native long totalDeletes();

    /**
     * The total number of drags during the session
     */
    @Generated
    @Selector("totalDrags")
    @NInt
    public native long totalDrags();

    /**
     * The total number of emojis used during the session
     */
    @Generated
    @Selector("totalEmojis")
    @NInt
    public native long totalEmojis();

    /**
     * The total number of hit test corrections in the session
     */
    @Generated
    @Selector("totalHitTestCorrections")
    @NInt
    public native long totalHitTestCorrections();

    /**
     * The total number of insert key corrections in the session
     */
    @Generated
    @Selector("totalInsertKeyCorrections")
    @NInt
    public native long totalInsertKeyCorrections();

    /**
     * The total number of near key corrections in the session
     */
    @Generated
    @Selector("totalNearKeyCorrections")
    @NInt
    public native long totalNearKeyCorrections();

    /**
     * The total length of paths completed in the session
     */
    @Generated
    @Selector("totalPathLength")
    public native NSMeasurement<NSUnitLength> totalPathLength();

    /**
     * The total number of pauses made while entering the path for any words composed using continuous path during the session
     */
    @Generated
    @Selector("totalPathPauses")
    @NInt
    public native long totalPathPauses();

    /**
     * The total time taken to complete paths in the session
     */
    @Generated
    @Selector("totalPathTime")
    public native double totalPathTime();

    /**
     * The total number of paths used during the sesion
     */
    @Generated
    @Selector("totalPaths")
    @NInt
    public native long totalPaths();

    /**
     * The total number of pauses during the session
     */
    @Generated
    @Selector("totalPauses")
    @NInt
    public native long totalPauses();

    /**
     * The total number of retro corrections in the session
     */
    @Generated
    @Selector("totalRetroCorrections")
    @NInt
    public native long totalRetroCorrections();

    /**
     * The total number of skip touch corrections in the session
     */
    @Generated
    @Selector("totalSkipTouchCorrections")
    @NInt
    public native long totalSkipTouchCorrections();

    /**
     * The total number of space corrections in the session
     */
    @Generated
    @Selector("totalSpaceCorrections")
    @NInt
    public native long totalSpaceCorrections();

    /**
     * The total number of substitution corrections in the session
     */
    @Generated
    @Selector("totalSubstitutionCorrections")
    @NInt
    public native long totalSubstitutionCorrections();

    /**
     * The total number of taps during the session
     */
    @Generated
    @Selector("totalTaps")
    @NInt
    public native long totalTaps();

    /**
     * The total number of transposition corrections in the session
     */
    @Generated
    @Selector("totalTranspositionCorrections")
    @NInt
    public native long totalTranspositionCorrections();

    /**
     * The total amount of time typing during the session
     */
    @Generated
    @Selector("totalTypingDuration")
    public native double totalTypingDuration();

    /**
     * Total number of continuous typing episodes during the session
     */
    @Generated
    @Selector("totalTypingEpisodes")
    @NInt
    public native long totalTypingEpisodes();

    /**
     * The total number of words typed during the session
     */
    @Generated
    @Selector("totalWords")
    @NInt
    public native long totalWords();

    /**
     * The duration between touch down to touch down for any key
     */
    @Generated
    @Selector("touchDownDown")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> touchDownDown();

    /**
     * The duration between touch down to touchup for any key
     */
    @Generated
    @Selector("touchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> touchDownUp();

    /**
     * The words per minute typed during the session
     */
    @Generated
    @Selector("typingSpeed")
    public native double typingSpeed();

    /**
     * The distance from the touch up to the center of any key
     */
    @Generated
    @Selector("upErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> upErrorDistance();

    /**
     * The version of keyboard metrics
     */
    @Generated
    @Selector("version")
    public native String version();

    /**
     * The width of the keyboard in mm in the session
     */
    @Generated
    @Selector("width")
    public native NSMeasurement<NSUnitLength> width();

    /**
     * The count of words typed per category in the session
     */
    @Generated
    @Selector("wordCountForSentimentCategory:")
    @NInt
    public native long wordCountForSentimentCategory(@NInt long category);
}
