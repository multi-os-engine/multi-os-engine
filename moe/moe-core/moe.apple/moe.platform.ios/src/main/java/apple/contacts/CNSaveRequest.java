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

package apple.contacts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNSaveRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNSaveRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNSaveRequest alloc();

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
     * addContact:toContainerWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/addContact:toContainerWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addContact:toContainerWithIdentifier:")
    public native void addContactToContainerWithIdentifier(CNMutableContact contact, String identifier);

    /**
     * addGroup:toContainerWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/addGroup:toContainerWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addGroup:toContainerWithIdentifier:")
    public native void addGroupToContainerWithIdentifier(CNMutableGroup group, String identifier);

    /**
     * addMember:toGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/addMember:toGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMember:toGroup:")
    public native void addMemberToGroup(CNContact contact, CNGroup group);

    /**
     * deleteContact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/deleteContact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteContact:")
    public native void deleteContact(CNMutableContact contact);

    /**
     * deleteGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/deleteGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteGroup:")
    public native void deleteGroup(CNMutableGroup group);

    @Generated
    @Selector("init")
    public native CNSaveRequest init();

    /**
     * removeMember:fromGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/removeMember:fromGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeMember:fromGroup:")
    public native void removeMemberFromGroup(CNContact contact, CNGroup group);

    /**
     * updateContact:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/updateContact:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateContact:")
    public native void updateContact(CNMutableContact contact);

    /**
     * updateGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNSaveRequest_Class/index.html#//apple_ref/occ/instm/CNSaveRequest/updateGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateGroup:")
    public native void updateGroup(CNMutableGroup group);
}
