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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
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
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCompoundPredicate extends NSPredicate {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCompoundPredicate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCompoundPredicate alloc();

    /**
     * andPredicateWithSubpredicates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/clm/NSCompoundPredicate/andPredicateWithSubpredicates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("andPredicateWithSubpredicates:")
    public static native NSCompoundPredicate andPredicateWithSubpredicates(
            NSArray<? extends NSPredicate> subpredicates);

    /**
     * notPredicateWithSubpredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/clm/NSCompoundPredicate/notPredicateWithSubpredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("notPredicateWithSubpredicate:")
    public static native NSCompoundPredicate notPredicateWithSubpredicate(NSPredicate predicate);

    /**
     * orPredicateWithSubpredicates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/clm/NSCompoundPredicate/orPredicateWithSubpredicates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("orPredicateWithSubpredicates:")
    public static native NSCompoundPredicate orPredicateWithSubpredicates(NSArray<? extends NSPredicate> subpredicates);

    @Generated
    @Selector("predicateWithBlock:")
    public static native NSPredicate predicateWithBlock(
            @ObjCBlock(name = "call_predicateWithBlock") NSPredicate.Block_predicateWithBlock block);

    @Generated
    @Variadic()
    @Selector("predicateWithFormat:")
    public static native NSPredicate predicateWithFormat(String predicateFormat, Object... varargs);

    @Generated
    @Selector("predicateWithFormat:argumentArray:")
    public static native NSPredicate predicateWithFormatArgumentArray(String predicateFormat, NSArray<?> arguments);

    @Generated
    @Selector("predicateWithFormat:arguments:")
    public static native NSPredicate predicateWithFormatArguments(String predicateFormat, BytePtr argList);

    @Generated
    @Selector("predicateWithValue:")
    public static native NSPredicate predicateWithValue(boolean value);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * compoundPredicateType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/instp/NSCompoundPredicate/compoundPredicateType">iOS Dev Center</a>
     */
    @Generated
    @Selector("compoundPredicateType")
    @NUInt
    public native long compoundPredicateType();

    @Generated
    @Selector("init")
    public native NSCompoundPredicate init();

    /**
     * initWithType:subpredicates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/instm/NSCompoundPredicate/initWithType:subpredicates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithType:subpredicates:")
    public native NSCompoundPredicate initWithTypeSubpredicates(@NUInt long type,
            NSArray<? extends NSPredicate> subpredicates);

    /**
     * subpredicates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSCompoundPredicate_Class/index.html#//apple_ref/occ/instp/NSCompoundPredicate/subpredicates">iOS Dev Center</a>
     */
    @Generated
    @Selector("subpredicates")
    public native NSArray<?> subpredicates();

    @Generated
    @Selector("initWithCoder:")
    public native NSCompoundPredicate initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
