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
import apple.foundation.NSMutableDictionary;
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
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKRuleSystem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKRuleSystem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKRuleSystem alloc();

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

    /**
     * addRule:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/addRule:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addRule:")
    public native void addRule(GKRule rule);

    /**
     * addRulesFromArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/addRulesFromArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addRulesFromArray:")
    public native void addRulesFromArray(NSArray<? extends GKRule> rules);

    /**
     * agenda</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instp/GKRuleSystem/agenda">iOS Dev Center</a>
     */
    @Generated
    @Selector("agenda")
    public native NSArray<? extends GKRule> agenda();

    /**
     * assertFact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/assertFact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assertFact:")
    public native void assertFact(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * assertFact:grade:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/assertFact:grade:">iOS Dev Center</a>
     */
    @Generated
    @Selector("assertFact:grade:")
    public native void assertFactGrade(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

    /**
     * evaluate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/evaluate">iOS Dev Center</a>
     */
    @Generated
    @Selector("evaluate")
    public native void evaluate();

    /**
     * executed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instp/GKRuleSystem/executed">iOS Dev Center</a>
     */
    @Generated
    @Selector("executed")
    public native NSArray<? extends GKRule> executed();

    /**
     * facts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instp/GKRuleSystem/facts">iOS Dev Center</a>
     */
    @Generated
    @Selector("facts")
    public native NSArray<?> facts();

    /**
     * gradeForFact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/gradeForFact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("gradeForFact:")
    public native float gradeForFact(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native GKRuleSystem init();

    /**
     * maximumGradeForFacts:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/maximumGradeForFacts:">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumGradeForFacts:")
    public native float maximumGradeForFacts(NSArray<?> facts);

    /**
     * minimumGradeForFacts:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/minimumGradeForFacts:">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumGradeForFacts:")
    public native float minimumGradeForFacts(NSArray<?> facts);

    /**
     * removeAllRules</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/removeAllRules">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllRules")
    public native void removeAllRules();

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * retractFact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/retractFact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("retractFact:")
    public native void retractFact(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact);

    /**
     * retractFact:grade:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instm/GKRuleSystem/retractFact:grade:">iOS Dev Center</a>
     */
    @Generated
    @Selector("retractFact:grade:")
    public native void retractFactGrade(@Mapped(ObjCObjectMapper.class) apple.protocol.NSObject fact, float grade);

    /**
     * rules</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instp/GKRuleSystem/rules">iOS Dev Center</a>
     */
    @Generated
    @Selector("rules")
    public native NSArray<? extends GKRule> rules();

    /**
     * state</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKRuleSystem_Class/index.html#//apple_ref/occ/instp/GKRuleSystem/state">iOS Dev Center</a>
     */
    @Generated
    @Selector("state")
    public native NSMutableDictionary<?, ?> state();
}
