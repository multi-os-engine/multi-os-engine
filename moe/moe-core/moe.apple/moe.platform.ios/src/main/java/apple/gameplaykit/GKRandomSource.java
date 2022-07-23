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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A concrete random source that can generate random numbers. The implementation details are up to the system and
 * if a particular algorithm is needed then use one of the provided subclasses.
 * <p>
 * For certain specialized applications a shared system source may be needed and for those instances there is
 * a wrapped interface over arc4random_*, accessible via +[GKRandomSource sharedRandom].
 *
 * @see GKARC4RandomSource
 * @see GKLinearCongruentialRandomSource
 * @see GKMersenneTwisterRandomSource
 * @see GKRandomSource.systemRandom
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKRandomSource extends NSObject implements GKRandom, NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected GKRandomSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKRandomSource alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKRandomSource allocWithZone(VoidPtr zone);

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
    public static native GKRandomSource new_objc();

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
     * Returns a shared instance of a random source that uses the system's underlying random source.
     * Using this instance modifies the outcome of future calls to the arc4random family of C calls. It is
     * also affected by calls to the C apis and should not be used for sources that are intended to
     * be deterministic.
     * <p>
     * Note that while it may seem semantically similar to a GKARC4RandomSource, this is not a drop in replacement.
     */
    @Generated
    @Selector("sharedRandom")
    public static native GKRandomSource sharedRandom();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns a shuffled instance of the given array. The objects in the array are shuffled based on a Fisher-Yates
     * shuffle.
     * <p>
     * Any random, be it custom, source or a distribution, that can provide a number with an upper bound of at least the
     * array.count is suitable for this shuffle.
     */
    @Generated
    @Selector("arrayByShufflingObjectsInArray:")
    public native NSArray<?> arrayByShufflingObjectsInArray(NSArray<?> array);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Creates a new random source initialized using bits from an entropy source like SecRandomCopyBytes.
     * When used directly from the base class; this source is deterministic and performant but the underlying
     * implementation
     * details are not specified. Use a subclass with a specific algorithm implementation guaranteed if your application
     * requires
     * very stringent random source charateristics.
     *
     * @see GKARC4RandomSource
     * @see GKLinearCongruentialRandomSource
     * @see GKMersenneTwisterRandomSource
     */
    @Generated
    @Selector("init")
    public native GKRandomSource init();

    @Generated
    @Selector("initWithCoder:")
    public native GKRandomSource initWithCoder(NSCoder aDecoder);

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

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
