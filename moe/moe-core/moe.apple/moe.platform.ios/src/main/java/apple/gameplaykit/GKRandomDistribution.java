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

/**
 * A random distribution is a random source itself with a specific mapping from the input source to the output values.
 * The distribution is uniform, meaning there is no bias towards any of the possible outcomes.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKRandomDistribution extends NSObject implements GKRandom {
    static {
        NatJ.register();
    }

    @Generated
    protected GKRandomDistribution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKRandomDistribution alloc();

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

    /**
     * Convenience creation for the very common d20 range [1, 20] with an isolated random source
     * shielded from outside sources.
     */
    @Generated
    @Selector("d20")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object d20();

    /**
     * Convenience creation for the very common d6 range [1, 6] with an isolated random source
     * shielded from outside sources.
     */
    @Generated
    @Selector("d6")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object d6();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Convenience creation of random distribution with the die like range [1, sideCount] using an isolated source to grab input values from.
     * This is equivalent to calling alloc followed by initWithSource:lowest:highest:, where source is [[GKRandomSource alloc] init].
     *
     * @see initWithRandomSource:lowestValue:highestValue:
     */
    @Generated
    @Selector("distributionForDieWithSideCount:")
    public static native GKRandomDistribution distributionForDieWithSideCount(@NInt long sideCount);

    /**
     * Convenience creation of random distribution within the range [lowest, highest] using an isolated source to grab input values from.
     * This is equivalent to calling alloc followed by initWithSource:lowest:highest:, where source is [[GKRandomSource alloc] init].
     *
     * @see initWithRandomSource:lowestValue:highestValue:
     */
    @Generated
    @Selector("distributionWithLowestValue:highestValue:")
    public static native GKRandomDistribution distributionWithLowestValueHighestValue(@NInt long lowestInclusive,
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

    /**
     * The highest value the distribution will output.
     */
    @Generated
    @Selector("highestValue")
    @NInt
    public native long highestValue();

    @Generated
    @Selector("init")
    public native GKRandomDistribution init();

    /**
     * Initializes a random distribution within the range [lowest, highest] using a source to grab input values from.
     */
    @Generated
    @Selector("initWithRandomSource:lowestValue:highestValue:")
    public native GKRandomDistribution initWithRandomSourceLowestValueHighestValue(
            @Mapped(ObjCObjectMapper.class) GKRandom source, @NInt long lowestInclusive, @NInt long highestInclusive);

    /**
     * The lowest value the distribution will output.
     */
    @Generated
    @Selector("lowestValue")
    @NInt
    public native long lowestValue();

    @Generated
    @Selector("nextBool")
    public native boolean nextBool();

    @Generated
    @Selector("nextInt")
    @NInt
    public native long nextInt();

    @Generated
    @Selector("nextIntWithUpperBound:")
    @NUInt
    public native long nextIntWithUpperBound(@NUInt long upperBound);

    @Generated
    @Selector("nextUniform")
    public native float nextUniform();

    /**
     * The number of unique possible outcomes, depending on the distribution type this is not always highest - lowest + 1.
     */
    @Generated
    @Selector("numberOfPossibleOutcomes")
    @NUInt
    public native long numberOfPossibleOutcomes();
}
