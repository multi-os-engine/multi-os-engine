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

package apple.cloudkit;

import apple.NSObject;
import apple.corelocation.CLLocation;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSSortDescriptor;
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
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKLocationSortDescriptor extends NSSortDescriptor implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CKLocationSortDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKLocationSortDescriptor alloc();

    @Generated
    @Selector("sortDescriptorWithKey:ascending:")
    public static native CKLocationSortDescriptor sortDescriptorWithKeyAscending(String key, boolean ascending);

    @Generated
    @Selector("sortDescriptorWithKey:ascending:comparator:")
    public static native CKLocationSortDescriptor sortDescriptorWithKeyAscendingComparator(String key,
            boolean ascending,
            @ObjCBlock(name = "call_sortDescriptorWithKeyAscendingComparator") NSSortDescriptor.Block_sortDescriptorWithKeyAscendingComparator cmptr);

    @Generated
    @Selector("sortDescriptorWithKey:ascending:selector:")
    public static native CKLocationSortDescriptor sortDescriptorWithKeyAscendingSelector(String key, boolean ascending,
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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native CKLocationSortDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CKLocationSortDescriptor initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithKey:ascending:")
    public native CKLocationSortDescriptor initWithKeyAscending(String key, boolean ascending);

    @Generated
    @Selector("initWithKey:ascending:comparator:")
    public native CKLocationSortDescriptor initWithKeyAscendingComparator(String key, boolean ascending,
            @ObjCBlock(name = "call_initWithKeyAscendingComparator") NSSortDescriptor.Block_initWithKeyAscendingComparator cmptr);

    @Generated
    @Selector("initWithKey:ascending:selector:")
    public native CKLocationSortDescriptor initWithKeyAscendingSelector(String key, boolean ascending, SEL selector);

    /**
     * initWithKey:relativeLocation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKLocationSortDescriptor_class/index.html#//apple_ref/occ/instm/CKLocationSortDescriptor/initWithKey:relativeLocation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithKey:relativeLocation:")
    public native CKLocationSortDescriptor initWithKeyRelativeLocation(String key, CLLocation relativeLocation);

    /**
     * relativeLocation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKLocationSortDescriptor_class/index.html#//apple_ref/occ/instp/CKLocationSortDescriptor/relativeLocation">iOS Dev Center</a>
     */
    @Generated
    @Selector("relativeLocation")
    public native CLLocation relativeLocation();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
