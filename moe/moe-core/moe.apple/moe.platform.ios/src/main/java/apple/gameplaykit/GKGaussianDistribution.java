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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.protocol.GKRandom;
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

/**
 * A gaussian distribution is biased towards the mean value, the possible outcomes are spread out from the mean
 * with decreasing probability. Values within 1 deviation of the mean make up 68.27% of the distribution, values
 * within 2 deviations make up 95% and values within 3 deviations make up 99.7%.
 * <p>
 * Note that a gaussian distribution's unbounded behavior beyond 3 deviations is undesired,
 * thus this distribution deviates nominally by modifying the bounds to 3 deviations.
 * Thus values within 3 deviations actually make up 100% of the distribution.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGaussianDistribution extends GKRandomDistribution {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGaussianDistribution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGaussianDistribution alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKGaussianDistribution allocWithZone(VoidPtr zone);

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
    @Selector("d20")
    public static native GKGaussianDistribution d20();

    @Generated
    @Selector("d6")
    public static native GKGaussianDistribution d6();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("distributionForDieWithSideCount:")
    public static native GKGaussianDistribution distributionForDieWithSideCount(@NInt long sideCount);

    @Generated
    @Selector("distributionWithLowestValue:highestValue:")
    public static native GKGaussianDistribution distributionWithLowestValueHighestValue(@NInt long lowestInclusive,
            @NInt long highestInclusive);

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
    public static native GKGaussianDistribution new_objc();

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
     * The deviation, often called 'sigma', is the deviation from the mean that would include roughly 68% of the distribution.
     * The range of the distribution is [mean - 3 * deviation, mean + 3 * deviation]. Values beyond 3 deviations
     * are considered so improbable that they are removed from the output set.
     */
    @Generated
    @Selector("deviation")
    public native float deviation();

    @Generated
    @Selector("init")
    public native GKGaussianDistribution init();

    /**
     * Initializes a Gaussian random distribution within the range [lowest, highest] using a source to grab input values from.
     * This sets the gaussian parameters to:
     * <p>
     * mean = (highest + lowest) / 2
     * deviation = (highest - lowest) / 6
     * <p>
     * The mean and deviation will be floating point numbers even if the distribution is meant to produce integer values.
     *
     * @see mean
     * @see deviation
     */
    @Generated
    @Selector("initWithRandomSource:lowestValue:highestValue:")
    public native GKGaussianDistribution initWithRandomSourceLowestValueHighestValue(
            @Mapped(ObjCObjectMapper.class) GKRandom source, @NInt long lowestInclusive, @NInt long highestInclusive);

    /**
     * Initializes a Gaussian random distribution within the range [mean - 3 * deviation, mean + 3 * deviation]
     * using a source to grab input values from.
     */
    @Generated
    @Selector("initWithRandomSource:mean:deviation:")
    public native GKGaussianDistribution initWithRandomSourceMeanDeviation(
            @Mapped(ObjCObjectMapper.class) GKRandom source, float mean, float deviation);

    /**
     * The mean, or expected, value of the distribution. Values are more probable the closer to the mean they are.
     */
    @Generated
    @Selector("mean")
    public native float mean();
}
