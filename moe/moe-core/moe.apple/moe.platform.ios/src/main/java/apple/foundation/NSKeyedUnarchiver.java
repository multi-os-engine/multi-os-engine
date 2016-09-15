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
import apple.foundation.protocol.NSKeyedUnarchiverDelegate;
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
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSKeyedUnarchiver extends NSCoder {
    static {
        NatJ.register();
    }

    @Generated
    protected NSKeyedUnarchiver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSKeyedUnarchiver alloc();

    /**
     * classForClassName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedUnarchiver/classForClassName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("classForClassName:")
    public static native Class classForClassName_static(String codedName);

    /**
     * classForClassName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/classForClassName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("classForClassName:")
    public native Class classForClassName(String codedName);

    /**
     * containsValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/containsValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsValueForKey:")
    public native boolean containsValueForKey(String key);

    /**
     * decodeBoolForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeBoolForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeBoolForKey:")
    public native boolean decodeBoolForKey(String key);

    /**
     * decodeBytesForKey:returnedLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeBytesForKey:returnedLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeBytesForKey:returnedLength:")
    public native ConstBytePtr decodeBytesForKeyReturnedLength(String key, NUIntPtr lengthp);

    /**
     * decodeDoubleForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeDoubleForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeDoubleForKey:")
    public native double decodeDoubleForKey(String key);

    /**
     * decodeFloatForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeFloatForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeFloatForKey:")
    public native float decodeFloatForKey(String key);

    /**
     * decodeInt32ForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeInt32ForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeInt32ForKey:")
    public native int decodeInt32ForKey(String key);

    /**
     * decodeInt64ForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeInt64ForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeInt64ForKey:")
    public native long decodeInt64ForKey(String key);

    /**
     * decodeIntForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeIntForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeIntForKey:")
    public native int decodeIntForKey(String key);

    /**
     * decodeObjectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/decodeObjectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeObjectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectForKey(String key);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedUnarchiver/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSKeyedUnarchiverDelegate delegate();

    /**
     * finishDecoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/finishDecoding">iOS Dev Center</a>
     */
    @Generated
    @Selector("finishDecoding")
    public native void finishDecoding();

    @Generated
    @Selector("init")
    public native NSKeyedUnarchiver init();

    /**
     * initForReadingWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/initForReadingWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initForReadingWithData:")
    public native NSKeyedUnarchiver initForReadingWithData(NSData data);

    /**
     * setClass:forClassName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedUnarchiver/setClass:forClassName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClass:forClassName:")
    public static native void setClassForClassName_static(Class cls, String codedName);

    /**
     * setClass:forClassName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instm/NSKeyedUnarchiver/setClass:forClassName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClass:forClassName:")
    public native void setClassForClassName(Class cls, String codedName);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedUnarchiver/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSKeyedUnarchiverDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/instp/NSKeyedUnarchiver/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSKeyedUnarchiverDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean value);

    /**
     * unarchiveObjectWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedUnarchiver/unarchiveObjectWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unarchiveObjectWithData:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithData(NSData data);

    /**
     * unarchiveObjectWithFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSKeyedUnarchiver_Class/index.html#//apple_ref/occ/clm/NSKeyedUnarchiver/unarchiveObjectWithFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unarchiveObjectWithFile:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFile(String path);

    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    @Generated
    @Selector("unarchiveTopLevelObjectWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataError(NSData data, Ptr<NSError> error);

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
