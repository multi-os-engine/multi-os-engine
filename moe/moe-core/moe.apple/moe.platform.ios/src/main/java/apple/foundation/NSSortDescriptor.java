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
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSortDescriptor extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSortDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSSortDescriptor alloc();

    /**
     * sortDescriptorWithKey:ascending:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/clm/NSSortDescriptor/sortDescriptorWithKey:ascending:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortDescriptorWithKey:ascending:")
    public static native NSSortDescriptor sortDescriptorWithKeyAscending(String key, boolean ascending);

    /**
     * sortDescriptorWithKey:ascending:comparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/clm/NSSortDescriptor/sortDescriptorWithKey:ascending:comparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortDescriptorWithKey:ascending:comparator:")
    public static native NSSortDescriptor sortDescriptorWithKeyAscendingComparator(String key, boolean ascending,
            @ObjCBlock(name = "call_sortDescriptorWithKeyAscendingComparator") Block_sortDescriptorWithKeyAscendingComparator cmptr);

    /**
     * sortDescriptorWithKey:ascending:selector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/clm/NSSortDescriptor/sortDescriptorWithKey:ascending:selector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortDescriptorWithKey:ascending:selector:")
    public static native NSSortDescriptor sortDescriptorWithKeyAscendingSelector(String key, boolean ascending,
            SEL selector);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
     * allowEvaluation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instm/NSSortDescriptor/allowEvaluation">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowEvaluation")
    public native void allowEvaluation();

    /**
     * ascending</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instp/NSSortDescriptor/ascending">iOS Dev Center</a>
     */
    @Generated
    @Selector("ascending")
    public native boolean ascending();

    /**
     * compareObject:toObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instm/NSSortDescriptor/compareObject:toObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compareObject:toObject:")
    @NInt
    public native long compareObjectToObject(@Mapped(ObjCObjectMapper.class) Object object1,
            @Mapped(ObjCObjectMapper.class) Object object2);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native NSSortDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native NSSortDescriptor initWithCoder(NSCoder coder);

    /**
     * initWithKey:ascending:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instm/NSSortDescriptor/initWithKey:ascending:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKey:ascending:")
    public native NSSortDescriptor initWithKeyAscending(String key, boolean ascending);

    /**
     * initWithKey:ascending:comparator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instm/NSSortDescriptor/initWithKey:ascending:comparator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKey:ascending:comparator:")
    public native NSSortDescriptor initWithKeyAscendingComparator(String key, boolean ascending,
            @ObjCBlock(name = "call_initWithKeyAscendingComparator") Block_initWithKeyAscendingComparator cmptr);

    /**
     * initWithKey:ascending:selector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instm/NSSortDescriptor/initWithKey:ascending:selector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKey:ascending:selector:")
    public native NSSortDescriptor initWithKeyAscendingSelector(String key, boolean ascending, SEL selector);

    /**
     * key</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instp/NSSortDescriptor/key">iOS Dev Center</a>
     */
    @Generated
    @Selector("key")
    public native String key();

    /**
     * reversedSortDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instp/NSSortDescriptor/reversedSortDescriptor">iOS Dev Center</a>
     */
    @Generated
    @Selector("reversedSortDescriptor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object reversedSortDescriptor();

    /**
     * selector</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instp/NSSortDescriptor/selector">iOS Dev Center</a>
     */
    @Generated
    @Selector("selector")
    public native SEL selector();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * comparator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSSortDescriptor_Class/index.html#//apple_ref/occ/instp/NSSortDescriptor/comparator">iOS Dev Center</a>
     */
    @Generated
    @Selector("comparator")
    @ObjCBlock(name = "call_comparator_ret")
    public native Block_comparator_ret comparator();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithKeyAscendingComparator {
        @Generated
        @NInt
        long call_initWithKeyAscendingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sortDescriptorWithKeyAscendingComparator {
        @Generated
        @NInt
        long call_sortDescriptorWithKeyAscendingComparator(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_comparator_ret {
        @Generated
        @NInt
        long call_comparator_ret(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }
}
