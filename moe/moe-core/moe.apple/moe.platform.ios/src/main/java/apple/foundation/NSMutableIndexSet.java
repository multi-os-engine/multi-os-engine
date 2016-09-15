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
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableIndexSet extends NSIndexSet {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableIndexSet(Pointer peer) {
        super(peer);
    }

    /**
     * addIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/addIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addIndex:")
    public native void addIndex(@NUInt long value);

    /**
     * addIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/addIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addIndexes:")
    public native void addIndexes(NSIndexSet indexSet);

    /**
     * addIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/addIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addIndexesInRange:")
    public native void addIndexesInRange(@ByValue NSRange range);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableIndexSet alloc();

    @Generated
    @Selector("indexSet")
    public static native NSMutableIndexSet indexSet();

    @Generated
    @Selector("indexSetWithIndex:")
    public static native NSMutableIndexSet indexSetWithIndex(@NUInt long value);

    @Generated
    @Selector("indexSetWithIndexesInRange:")
    public static native NSMutableIndexSet indexSetWithIndexesInRange(@ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSMutableIndexSet init();

    @Generated
    @Selector("initWithIndex:")
    public native NSMutableIndexSet initWithIndex(@NUInt long value);

    @Generated
    @Selector("initWithIndexSet:")
    public native NSMutableIndexSet initWithIndexSet(NSIndexSet indexSet);

    @Generated
    @Selector("initWithIndexesInRange:")
    public native NSMutableIndexSet initWithIndexesInRange(@ByValue NSRange range);

    /**
     * removeAllIndexes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/removeAllIndexes">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllIndexes")
    public native void removeAllIndexes();

    /**
     * removeIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/removeIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeIndex:")
    public native void removeIndex(@NUInt long value);

    /**
     * removeIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/removeIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeIndexes:")
    public native void removeIndexes(NSIndexSet indexSet);

    /**
     * removeIndexesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/removeIndexesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeIndexesInRange:")
    public native void removeIndexesInRange(@ByValue NSRange range);

    /**
     * shiftIndexesStartingAtIndex:by:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableIndexSet_Class/index.html#//apple_ref/occ/instm/NSMutableIndexSet/shiftIndexesStartingAtIndex:by:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shiftIndexesStartingAtIndex:by:")
    public native void shiftIndexesStartingAtIndexBy(@NUInt long index, @NInt long delta);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableIndexSet initWithCoder(NSCoder aDecoder);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
