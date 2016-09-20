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
public class NSPropertyListSerialization extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPropertyListSerialization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPropertyListSerialization alloc();

    /**
     * dataFromPropertyList:format:errorDescription:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/dataFromPropertyList:format:errorDescription:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("dataFromPropertyList:format:errorDescription:")
    public static native NSData dataFromPropertyListFormatErrorDescription(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format, Ptr<NSString> errorString);

    /**
     * dataWithPropertyList:format:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/dataWithPropertyList:format:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithPropertyList:format:options:error:")
    public static native NSData dataWithPropertyListFormatOptionsError(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format, @NUInt long opt, Ptr<NSError> error);

    /**
     * propertyList:isValidForFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/propertyList:isValidForFormat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyList:isValidForFormat:")
    public static native boolean propertyListIsValidForFormat(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format);

    /**
     * propertyListFromData:mutabilityOption:format:errorDescription:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/propertyListFromData:mutabilityOption:format:errorDescription:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("propertyListFromData:mutabilityOption:format:errorDescription:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListFromDataMutabilityOptionFormatErrorDescription(NSData data, @NUInt long opt,
            NUIntPtr format, Ptr<NSString> errorString);

    /**
     * propertyListWithData:options:format:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/propertyListWithData:options:format:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyListWithData:options:format:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListWithDataOptionsFormatError(NSData data, @NUInt long opt, NUIntPtr format,
            Ptr<NSError> error);

    /**
     * propertyListWithStream:options:format:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/propertyListWithStream:options:format:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyListWithStream:options:format:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListWithStreamOptionsFormatError(NSInputStream stream, @NUInt long opt,
            NUIntPtr format, Ptr<NSError> error);

    /**
     * writePropertyList:toStream:format:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPropertyListSerialization_Class/index.html#//apple_ref/occ/clm/NSPropertyListSerialization/writePropertyList:toStream:format:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writePropertyList:toStream:format:options:error:")
    @NInt
    public static native long writePropertyListToStreamFormatOptionsError(@Mapped(ObjCObjectMapper.class) Object plist,
            NSOutputStream stream, @NUInt long format, @NUInt long opt, Ptr<NSError> error);

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

    @Generated
    @Selector("init")
    public native NSPropertyListSerialization init();
}
