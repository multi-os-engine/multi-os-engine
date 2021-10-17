package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Color Control
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPColorControl extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPColorControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPColorControl alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CHIPColorControl allocWithZone(VoidPtr zone);

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
    @Selector("configureAttributeColorTemperatureWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeColorTemperatureWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeColorTemperatureWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeColorTemperatureWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeColorTemperatureWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeColorTemperatureWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentHueWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentHueWithMinIntervalMaxIntervalChangeResponseHandler(char minInterval,
            char maxInterval, byte change,
            @ObjCBlock(name = "call_configureAttributeCurrentHueWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentHueWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentHueWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentHueWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentSaturationWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentSaturationWithMinIntervalMaxIntervalChangeResponseHandler(
            char minInterval, char maxInterval, byte change,
            @ObjCBlock(name = "call_configureAttributeCurrentSaturationWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentSaturationWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentSaturationWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentSaturationWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentXWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentXWithMinIntervalMaxIntervalChangeResponseHandler(char minInterval,
            char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentXWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentXWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentXWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentXWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("configureAttributeCurrentYWithMinInterval:maxInterval:change:responseHandler:")
    public native void configureAttributeCurrentYWithMinIntervalMaxIntervalChangeResponseHandler(char minInterval,
            char maxInterval, char change,
            @ObjCBlock(name = "call_configureAttributeCurrentYWithMinIntervalMaxIntervalChangeResponseHandler") Block_configureAttributeCurrentYWithMinIntervalMaxIntervalChangeResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureAttributeCurrentYWithMinIntervalMaxIntervalChangeResponseHandler {
        @Generated
        void call_configureAttributeCurrentYWithMinIntervalMaxIntervalChangeResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

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
    @Selector("init")
    public native CHIPColorControl init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPColorControl initWithDeviceEndpointQueue(CHIPDevice device, byte endpoint, NSObject queue);

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
    @Selector("moveColor:rateY:optionsMask:optionsOverride:responseHandler:")
    public native void moveColorRateYOptionsMaskOptionsOverrideResponseHandler(short rateX, short rateY,
            byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveColorRateYOptionsMaskOptionsOverrideResponseHandler") Block_moveColorRateYOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorRateYOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveColorRateYOptionsMaskOptionsOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveColorTemperature:rate:colorTemperatureMinimum:colorTemperatureMaximum:optionsMask:optionsOverride:responseHandler:")
    public native void moveColorTemperatureRateColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler(
            byte moveMode, char rate, char colorTemperatureMinimum, char colorTemperatureMaximum, byte optionsMask,
            byte optionsOverride,
            @ObjCBlock(name = "call_moveColorTemperatureRateColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler") Block_moveColorTemperatureRateColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveColorTemperatureRateColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveColorTemperatureRateColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveHue:rate:optionsMask:optionsOverride:responseHandler:")
    public native void moveHueRateOptionsMaskOptionsOverrideResponseHandler(byte moveMode, byte rate, byte optionsMask,
            byte optionsOverride,
            @ObjCBlock(name = "call_moveHueRateOptionsMaskOptionsOverrideResponseHandler") Block_moveHueRateOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveHueRateOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveHueRateOptionsMaskOptionsOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveSaturation:rate:optionsMask:optionsOverride:responseHandler:")
    public native void moveSaturationRateOptionsMaskOptionsOverrideResponseHandler(byte moveMode, byte rate,
            byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveSaturationRateOptionsMaskOptionsOverrideResponseHandler") Block_moveSaturationRateOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveSaturationRateOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveSaturationRateOptionsMaskOptionsOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToColor:colorY:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void moveToColorColorYTransitionTimeOptionsMaskOptionsOverrideResponseHandler(char colorX,
            char colorY, char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveToColorColorYTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_moveToColorColorYTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorColorYTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveToColorColorYTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToColorTemperature:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void moveToColorTemperatureTransitionTimeOptionsMaskOptionsOverrideResponseHandler(
            char colorTemperature, char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveToColorTemperatureTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_moveToColorTemperatureTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToColorTemperatureTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveToColorTemperatureTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToHue:direction:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void moveToHueDirectionTransitionTimeOptionsMaskOptionsOverrideResponseHandler(byte hue,
            byte direction, char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveToHueDirectionTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_moveToHueDirectionTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueDirectionTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveToHueDirectionTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToHueAndSaturation:saturation:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void moveToHueAndSaturationSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler(byte hue,
            byte saturation, char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveToHueAndSaturationSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_moveToHueAndSaturationSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToHueAndSaturationSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveToHueAndSaturationSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("moveToSaturation:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void moveToSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler(byte saturation,
            char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_moveToSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_moveToSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_moveToSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_moveToSaturationTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPColorControl new_objc();

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorCapabilitiesWithResponseHandler:")
    public native void readAttributeColorCapabilitiesWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorCapabilitiesWithResponseHandler") Block_readAttributeColorCapabilitiesWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorCapabilitiesWithResponseHandler {
        @Generated
        void call_readAttributeColorCapabilitiesWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorControlOptionsWithResponseHandler:")
    public native void readAttributeColorControlOptionsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorControlOptionsWithResponseHandler") Block_readAttributeColorControlOptionsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorControlOptionsWithResponseHandler {
        @Generated
        void call_readAttributeColorControlOptionsWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorLoopActiveWithResponseHandler:")
    public native void readAttributeColorLoopActiveWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopActiveWithResponseHandler") Block_readAttributeColorLoopActiveWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopActiveWithResponseHandler {
        @Generated
        void call_readAttributeColorLoopActiveWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorLoopDirectionWithResponseHandler:")
    public native void readAttributeColorLoopDirectionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopDirectionWithResponseHandler") Block_readAttributeColorLoopDirectionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopDirectionWithResponseHandler {
        @Generated
        void call_readAttributeColorLoopDirectionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorLoopTimeWithResponseHandler:")
    public native void readAttributeColorLoopTimeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorLoopTimeWithResponseHandler") Block_readAttributeColorLoopTimeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorLoopTimeWithResponseHandler {
        @Generated
        void call_readAttributeColorLoopTimeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorModeWithResponseHandler:")
    public native void readAttributeColorModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorModeWithResponseHandler") Block_readAttributeColorModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorModeWithResponseHandler {
        @Generated
        void call_readAttributeColorModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointBIntensityWithResponseHandler:")
    public native void readAttributeColorPointBIntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBIntensityWithResponseHandler") Block_readAttributeColorPointBIntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBIntensityWithResponseHandler {
        @Generated
        void call_readAttributeColorPointBIntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointBXWithResponseHandler:")
    public native void readAttributeColorPointBXWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBXWithResponseHandler") Block_readAttributeColorPointBXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBXWithResponseHandler {
        @Generated
        void call_readAttributeColorPointBXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointBYWithResponseHandler:")
    public native void readAttributeColorPointBYWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointBYWithResponseHandler") Block_readAttributeColorPointBYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointBYWithResponseHandler {
        @Generated
        void call_readAttributeColorPointBYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointGIntensityWithResponseHandler:")
    public native void readAttributeColorPointGIntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGIntensityWithResponseHandler") Block_readAttributeColorPointGIntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGIntensityWithResponseHandler {
        @Generated
        void call_readAttributeColorPointGIntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointGXWithResponseHandler:")
    public native void readAttributeColorPointGXWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGXWithResponseHandler") Block_readAttributeColorPointGXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGXWithResponseHandler {
        @Generated
        void call_readAttributeColorPointGXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointGYWithResponseHandler:")
    public native void readAttributeColorPointGYWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointGYWithResponseHandler") Block_readAttributeColorPointGYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointGYWithResponseHandler {
        @Generated
        void call_readAttributeColorPointGYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointRIntensityWithResponseHandler:")
    public native void readAttributeColorPointRIntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRIntensityWithResponseHandler") Block_readAttributeColorPointRIntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRIntensityWithResponseHandler {
        @Generated
        void call_readAttributeColorPointRIntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointRXWithResponseHandler:")
    public native void readAttributeColorPointRXWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRXWithResponseHandler") Block_readAttributeColorPointRXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRXWithResponseHandler {
        @Generated
        void call_readAttributeColorPointRXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorPointRYWithResponseHandler:")
    public native void readAttributeColorPointRYWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorPointRYWithResponseHandler") Block_readAttributeColorPointRYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorPointRYWithResponseHandler {
        @Generated
        void call_readAttributeColorPointRYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorTempPhysicalMaxWithResponseHandler:")
    public native void readAttributeColorTempPhysicalMaxWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMaxWithResponseHandler") Block_readAttributeColorTempPhysicalMaxWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMaxWithResponseHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMaxWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorTempPhysicalMinWithResponseHandler:")
    public native void readAttributeColorTempPhysicalMinWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorTempPhysicalMinWithResponseHandler") Block_readAttributeColorTempPhysicalMinWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTempPhysicalMinWithResponseHandler {
        @Generated
        void call_readAttributeColorTempPhysicalMinWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeColorTemperatureWithResponseHandler:")
    public native void readAttributeColorTemperatureWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeColorTemperatureWithResponseHandler") Block_readAttributeColorTemperatureWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeColorTemperatureWithResponseHandler {
        @Generated
        void call_readAttributeColorTemperatureWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCompensationTextWithResponseHandler:")
    public native void readAttributeCompensationTextWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCompensationTextWithResponseHandler") Block_readAttributeCompensationTextWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCompensationTextWithResponseHandler {
        @Generated
        void call_readAttributeCompensationTextWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler:")
    public native void readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler") Block_readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler {
        @Generated
        void call_readAttributeCoupleColorTempToLevelMinMiredsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentHueWithResponseHandler:")
    public native void readAttributeCurrentHueWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentHueWithResponseHandler") Block_readAttributeCurrentHueWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentHueWithResponseHandler {
        @Generated
        void call_readAttributeCurrentHueWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentSaturationWithResponseHandler:")
    public native void readAttributeCurrentSaturationWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentSaturationWithResponseHandler") Block_readAttributeCurrentSaturationWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentSaturationWithResponseHandler {
        @Generated
        void call_readAttributeCurrentSaturationWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentXWithResponseHandler:")
    public native void readAttributeCurrentXWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentXWithResponseHandler") Block_readAttributeCurrentXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentXWithResponseHandler {
        @Generated
        void call_readAttributeCurrentXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCurrentYWithResponseHandler:")
    public native void readAttributeCurrentYWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCurrentYWithResponseHandler") Block_readAttributeCurrentYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentYWithResponseHandler {
        @Generated
        void call_readAttributeCurrentYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeDriftCompensationWithResponseHandler:")
    public native void readAttributeDriftCompensationWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeDriftCompensationWithResponseHandler") Block_readAttributeDriftCompensationWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDriftCompensationWithResponseHandler {
        @Generated
        void call_readAttributeDriftCompensationWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEnhancedColorModeWithResponseHandler:")
    public native void readAttributeEnhancedColorModeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEnhancedColorModeWithResponseHandler") Block_readAttributeEnhancedColorModeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedColorModeWithResponseHandler {
        @Generated
        void call_readAttributeEnhancedColorModeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeEnhancedCurrentHueWithResponseHandler:")
    public native void readAttributeEnhancedCurrentHueWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeEnhancedCurrentHueWithResponseHandler") Block_readAttributeEnhancedCurrentHueWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnhancedCurrentHueWithResponseHandler {
        @Generated
        void call_readAttributeEnhancedCurrentHueWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNumberOfPrimariesWithResponseHandler:")
    public native void readAttributeNumberOfPrimariesWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfPrimariesWithResponseHandler") Block_readAttributeNumberOfPrimariesWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPrimariesWithResponseHandler {
        @Generated
        void call_readAttributeNumberOfPrimariesWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary1IntensityWithResponseHandler:")
    public native void readAttributePrimary1IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary1IntensityWithResponseHandler") Block_readAttributePrimary1IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary1IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary1XWithResponseHandler:")
    public native void readAttributePrimary1XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary1XWithResponseHandler") Block_readAttributePrimary1XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1XWithResponseHandler {
        @Generated
        void call_readAttributePrimary1XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary1YWithResponseHandler:")
    public native void readAttributePrimary1YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary1YWithResponseHandler") Block_readAttributePrimary1YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary1YWithResponseHandler {
        @Generated
        void call_readAttributePrimary1YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary2IntensityWithResponseHandler:")
    public native void readAttributePrimary2IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary2IntensityWithResponseHandler") Block_readAttributePrimary2IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary2IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary2XWithResponseHandler:")
    public native void readAttributePrimary2XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary2XWithResponseHandler") Block_readAttributePrimary2XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2XWithResponseHandler {
        @Generated
        void call_readAttributePrimary2XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary2YWithResponseHandler:")
    public native void readAttributePrimary2YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary2YWithResponseHandler") Block_readAttributePrimary2YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary2YWithResponseHandler {
        @Generated
        void call_readAttributePrimary2YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary3IntensityWithResponseHandler:")
    public native void readAttributePrimary3IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary3IntensityWithResponseHandler") Block_readAttributePrimary3IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary3IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary3XWithResponseHandler:")
    public native void readAttributePrimary3XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary3XWithResponseHandler") Block_readAttributePrimary3XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3XWithResponseHandler {
        @Generated
        void call_readAttributePrimary3XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary3YWithResponseHandler:")
    public native void readAttributePrimary3YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary3YWithResponseHandler") Block_readAttributePrimary3YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary3YWithResponseHandler {
        @Generated
        void call_readAttributePrimary3YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary4IntensityWithResponseHandler:")
    public native void readAttributePrimary4IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary4IntensityWithResponseHandler") Block_readAttributePrimary4IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary4IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary4XWithResponseHandler:")
    public native void readAttributePrimary4XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary4XWithResponseHandler") Block_readAttributePrimary4XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4XWithResponseHandler {
        @Generated
        void call_readAttributePrimary4XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary4YWithResponseHandler:")
    public native void readAttributePrimary4YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary4YWithResponseHandler") Block_readAttributePrimary4YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary4YWithResponseHandler {
        @Generated
        void call_readAttributePrimary4YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary5IntensityWithResponseHandler:")
    public native void readAttributePrimary5IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary5IntensityWithResponseHandler") Block_readAttributePrimary5IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary5IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary5XWithResponseHandler:")
    public native void readAttributePrimary5XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary5XWithResponseHandler") Block_readAttributePrimary5XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5XWithResponseHandler {
        @Generated
        void call_readAttributePrimary5XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary5YWithResponseHandler:")
    public native void readAttributePrimary5YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary5YWithResponseHandler") Block_readAttributePrimary5YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary5YWithResponseHandler {
        @Generated
        void call_readAttributePrimary5YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary6IntensityWithResponseHandler:")
    public native void readAttributePrimary6IntensityWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary6IntensityWithResponseHandler") Block_readAttributePrimary6IntensityWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6IntensityWithResponseHandler {
        @Generated
        void call_readAttributePrimary6IntensityWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary6XWithResponseHandler:")
    public native void readAttributePrimary6XWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary6XWithResponseHandler") Block_readAttributePrimary6XWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6XWithResponseHandler {
        @Generated
        void call_readAttributePrimary6XWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePrimary6YWithResponseHandler:")
    public native void readAttributePrimary6YWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePrimary6YWithResponseHandler") Block_readAttributePrimary6YWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePrimary6YWithResponseHandler {
        @Generated
        void call_readAttributePrimary6YWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRemainingTimeWithResponseHandler:")
    public native void readAttributeRemainingTimeWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRemainingTimeWithResponseHandler") Block_readAttributeRemainingTimeWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingTimeWithResponseHandler {
        @Generated
        void call_readAttributeRemainingTimeWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeStartUpColorTemperatureMiredsWithResponseHandler:")
    public native void readAttributeStartUpColorTemperatureMiredsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeStartUpColorTemperatureMiredsWithResponseHandler") Block_readAttributeStartUpColorTemperatureMiredsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartUpColorTemperatureMiredsWithResponseHandler {
        @Generated
        void call_readAttributeStartUpColorTemperatureMiredsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeWhitePointXWithResponseHandler:")
    public native void readAttributeWhitePointXWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeWhitePointXWithResponseHandler") Block_readAttributeWhitePointXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointXWithResponseHandler {
        @Generated
        void call_readAttributeWhitePointXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeWhitePointYWithResponseHandler:")
    public native void readAttributeWhitePointYWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeWhitePointYWithResponseHandler") Block_readAttributeWhitePointYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWhitePointYWithResponseHandler {
        @Generated
        void call_readAttributeWhitePointYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeColorTemperatureWithResponseHandler:")
    public native void reportAttributeColorTemperatureWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeColorTemperatureWithResponseHandler") Block_reportAttributeColorTemperatureWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeColorTemperatureWithResponseHandler {
        @Generated
        void call_reportAttributeColorTemperatureWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentHueWithResponseHandler:")
    public native void reportAttributeCurrentHueWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentHueWithResponseHandler") Block_reportAttributeCurrentHueWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentHueWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentHueWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentSaturationWithResponseHandler:")
    public native void reportAttributeCurrentSaturationWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentSaturationWithResponseHandler") Block_reportAttributeCurrentSaturationWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentSaturationWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentSaturationWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentXWithResponseHandler:")
    public native void reportAttributeCurrentXWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentXWithResponseHandler") Block_reportAttributeCurrentXWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentXWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentXWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("reportAttributeCurrentYWithResponseHandler:")
    public native void reportAttributeCurrentYWithResponseHandler(
            @ObjCBlock(name = "call_reportAttributeCurrentYWithResponseHandler") Block_reportAttributeCurrentYWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reportAttributeCurrentYWithResponseHandler {
        @Generated
        void call_reportAttributeCurrentYWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

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
    @Selector("stepColor:stepY:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void stepColorStepYTransitionTimeOptionsMaskOptionsOverrideResponseHandler(short stepX, short stepY,
            char transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_stepColorStepYTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_stepColorStepYTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorStepYTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_stepColorStepYTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stepColorTemperature:stepSize:transitionTime:colorTemperatureMinimum:colorTemperatureMaximum:optionsMask:optionsOverride:responseHandler:")
    public native void stepColorTemperatureStepSizeTransitionTimeColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler(
            byte stepMode, char stepSize, char transitionTime, char colorTemperatureMinimum,
            char colorTemperatureMaximum, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_stepColorTemperatureStepSizeTransitionTimeColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler") Block_stepColorTemperatureStepSizeTransitionTimeColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepColorTemperatureStepSizeTransitionTimeColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_stepColorTemperatureStepSizeTransitionTimeColorTemperatureMinimumColorTemperatureMaximumOptionsMaskOptionsOverrideResponseHandler(
                NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stepHue:stepSize:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void stepHueStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler(byte stepMode,
            byte stepSize, byte transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_stepHueStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_stepHueStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepHueStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_stepHueStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stepSaturation:stepSize:transitionTime:optionsMask:optionsOverride:responseHandler:")
    public native void stepSaturationStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler(byte stepMode,
            byte stepSize, byte transitionTime, byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_stepSaturationStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler") Block_stepSaturationStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stepSaturationStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler {
        @Generated
        void call_stepSaturationStepSizeTransitionTimeOptionsMaskOptionsOverrideResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("stopMoveStep:optionsOverride:responseHandler:")
    public native void stopMoveStepOptionsOverrideResponseHandler(byte optionsMask, byte optionsOverride,
            @ObjCBlock(name = "call_stopMoveStepOptionsOverrideResponseHandler") Block_stopMoveStepOptionsOverrideResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMoveStepOptionsOverrideResponseHandler {
        @Generated
        void call_stopMoveStepOptionsOverrideResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("writeAttributeColorControlOptionsWithValue:responseHandler:")
    public native void writeAttributeColorControlOptionsWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeColorControlOptionsWithValueResponseHandler") Block_writeAttributeColorControlOptionsWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorControlOptionsWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorControlOptionsWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointBIntensityWithValue:responseHandler:")
    public native void writeAttributeColorPointBIntensityWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeColorPointBIntensityWithValueResponseHandler") Block_writeAttributeColorPointBIntensityWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBIntensityWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointBIntensityWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointBXWithValue:responseHandler:")
    public native void writeAttributeColorPointBXWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointBXWithValueResponseHandler") Block_writeAttributeColorPointBXWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBXWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointBXWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointBYWithValue:responseHandler:")
    public native void writeAttributeColorPointBYWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointBYWithValueResponseHandler") Block_writeAttributeColorPointBYWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointBYWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointBYWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointGIntensityWithValue:responseHandler:")
    public native void writeAttributeColorPointGIntensityWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeColorPointGIntensityWithValueResponseHandler") Block_writeAttributeColorPointGIntensityWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGIntensityWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointGIntensityWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointGXWithValue:responseHandler:")
    public native void writeAttributeColorPointGXWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointGXWithValueResponseHandler") Block_writeAttributeColorPointGXWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGXWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointGXWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointGYWithValue:responseHandler:")
    public native void writeAttributeColorPointGYWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointGYWithValueResponseHandler") Block_writeAttributeColorPointGYWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointGYWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointGYWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointRIntensityWithValue:responseHandler:")
    public native void writeAttributeColorPointRIntensityWithValueResponseHandler(byte value,
            @ObjCBlock(name = "call_writeAttributeColorPointRIntensityWithValueResponseHandler") Block_writeAttributeColorPointRIntensityWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRIntensityWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointRIntensityWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointRXWithValue:responseHandler:")
    public native void writeAttributeColorPointRXWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointRXWithValueResponseHandler") Block_writeAttributeColorPointRXWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRXWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointRXWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeColorPointRYWithValue:responseHandler:")
    public native void writeAttributeColorPointRYWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeColorPointRYWithValueResponseHandler") Block_writeAttributeColorPointRYWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeColorPointRYWithValueResponseHandler {
        @Generated
        void call_writeAttributeColorPointRYWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeStartUpColorTemperatureMiredsWithValue:responseHandler:")
    public native void writeAttributeStartUpColorTemperatureMiredsWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeStartUpColorTemperatureMiredsWithValueResponseHandler") Block_writeAttributeStartUpColorTemperatureMiredsWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStartUpColorTemperatureMiredsWithValueResponseHandler {
        @Generated
        void call_writeAttributeStartUpColorTemperatureMiredsWithValueResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeWhitePointXWithValue:responseHandler:")
    public native void writeAttributeWhitePointXWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeWhitePointXWithValueResponseHandler") Block_writeAttributeWhitePointXWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointXWithValueResponseHandler {
        @Generated
        void call_writeAttributeWhitePointXWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("writeAttributeWhitePointYWithValue:responseHandler:")
    public native void writeAttributeWhitePointYWithValueResponseHandler(char value,
            @ObjCBlock(name = "call_writeAttributeWhitePointYWithValueResponseHandler") Block_writeAttributeWhitePointYWithValueResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWhitePointYWithValueResponseHandler {
        @Generated
        void call_writeAttributeWhitePointYWithValueResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}
