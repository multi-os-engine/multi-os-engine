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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKDecisionTree extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKDecisionTree(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKDecisionTree alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKDecisionTree allocWithZone(VoidPtr zone);

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
    public static native GKDecisionTree new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Will branch down from the root node to find the correct action attribute for the given collection of results and
     * their respective attributes
     * 
     * @param answers The dictionary of attributes (keys) and their answers (values)
     * @return The attribute found by traversing the tree given the provided answers
     */
    @Nullable
    @Generated
    @Selector("findActionForAnswers:")
    @MappedReturn(ObjCObjectMapper.class)
    public native apple.protocol.NSObject findActionForAnswers(@NotNull NSDictionary<?, ?> answers);

    @Generated
    @Selector("init")
    public native GKDecisionTree init();

    /**
     * Initializes the decision tree with a root node containing the provided attribute
     * 
     * @param attribute The attribute to be contained at the root of the tree
     * @return GKDecisionTree with the set root
     */
    @Generated
    @Selector("initWithAttribute:")
    public native GKDecisionTree initWithAttribute(
            @NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject attribute);

    @Generated
    @Selector("initWithCoder:")
    public native GKDecisionTree initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes and constructs a decision tree by learning from the provided examples & attributes
     * 
     * @param examples   Must be an array of examples (with each example being a collection of the various attributes at
     *                   a given state)
     * @param actions    An array of the corresponding actions for each example. Ordered such that the first action
     *                   matches with the first example in examples.
     * @param attributes The list of attributes. Ordered such that the first attribute matches with the first result in
     *                   each example.
     *                   So if we have two attributes: [distance, jump height], and two examples: [[20, 8], [15, 14]],
     *                   and the resulting actions here: [Roll, Jump], we can think of this as a matrix:
     * 
     *                   distance| height <- Attributes
     *                   _______|_______
     *                   | | |
     *                   | 20 | 8 | jump
     *                   |-------|-------|------- <- Results
     *                   | 15 | 14 | roll
     *                   |_______|_______|
     *                   ^
     *                   |
     *                   Examples
     * 
     * @return GKDecisionTree created by learning from the provided examples for the provided attributes
     */
    @Generated
    @Selector("initWithExamples:actions:attributes:")
    public native GKDecisionTree initWithExamplesActionsAttributes(@NotNull NSArray<? extends NSArray<?>> examples,
            @NotNull NSArray<?> actions, @NotNull NSArray<?> attributes);

    /**
     * The random source used by the decision tree when descending on a random branch
     * This must be set before creating any weighted branches
     * 
     * @see GKDecisionNode
     */
    @NotNull
    @Generated
    @Selector("randomSource")
    public native GKRandomSource randomSource();

    /**
     * The node for the decision tree that all other nodes descend from
     */
    @Nullable
    @Generated
    @Selector("rootNode")
    public native GKDecisionNode rootNode();

    /**
     * The random source used by the decision tree when descending on a random branch
     * This must be set before creating any weighted branches
     * 
     * @see GKDecisionNode
     */
    @Generated
    @Selector("setRandomSource:")
    public native void setRandomSource(@NotNull GKRandomSource value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Exports a decision tree to the given URL
     * 
     * @param url The URL to which the contents will be exported
     * @return The response indicating the status of the decision tree being successfully exported
     */
    @Generated
    @Selector("exportToURL:error:")
    public native boolean exportToURLError(@NotNull NSURL url, @Nullable NSError error);

    /**
     * Initializes a decision tree from the contents of a file
     * 
     * @param url The URL from which the contents will be loaded
     * @return The instance of the decision tree constructed
     */
    @Generated
    @Selector("initWithURL:error:")
    public native GKDecisionTree initWithURLError(@NotNull NSURL url, @Nullable NSError error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
