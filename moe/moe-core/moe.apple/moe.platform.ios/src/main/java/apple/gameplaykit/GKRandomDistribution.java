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
    @Owned
    @Selector("alloc")
    public static native GKRandomDistribution alloc();

    /**
     * d20</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/clm/GKRandomDistribution/d20">iOS Dev Center</a>
     */
    @Generated
    @Selector("d20")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object d20();

    /**
     * d6</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/clm/GKRandomDistribution/d6">iOS Dev Center</a>
     */
    @Generated
    @Selector("d6")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object d6();

    /**
     * distributionForDieWithSideCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/clm/GKRandomDistribution/distributionForDieWithSideCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("distributionForDieWithSideCount:")
    public static native GKRandomDistribution distributionForDieWithSideCount(@NInt long sideCount);

    /**
     * distributionWithLowestValue:highestValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/clm/GKRandomDistribution/distributionWithLowestValue:highestValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("distributionWithLowestValue:highestValue:")
    public static native GKRandomDistribution distributionWithLowestValueHighestValue(@NInt long lowestInclusive,
            @NInt long highestInclusive);

    /**
     * highestValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/instp/GKRandomDistribution/highestValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("highestValue")
    @NInt
    public native long highestValue();

    @Generated
    @Selector("init")
    public native GKRandomDistribution init();

    /**
     * initWithRandomSource:lowestValue:highestValue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/instm/GKRandomDistribution/initWithRandomSource:lowestValue:highestValue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRandomSource:lowestValue:highestValue:")
    public native GKRandomDistribution initWithRandomSourceLowestValueHighestValue(
            @Mapped(ObjCObjectMapper.class) GKRandom source, @NInt long lowestInclusive, @NInt long highestInclusive);

    /**
     * lowestValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/instp/GKRandomDistribution/lowestValue">iOS Dev Center</a>
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
     * numberOfPossibleOutcomes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRandomDistribution_Class/index.html#//apple_ref/occ/instp/GKRandomDistribution/numberOfPossibleOutcomes">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfPossibleOutcomes")
    @NUInt
    public native long numberOfPossibleOutcomes();

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
    @Selector("description")
    public static native String description_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
