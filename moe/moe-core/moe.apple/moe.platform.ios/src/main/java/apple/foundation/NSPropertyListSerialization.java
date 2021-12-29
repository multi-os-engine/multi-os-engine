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
import org.moe.natj.general.ann.ReferenceInfo;
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPropertyListSerialization alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPropertyListSerialization allocWithZone(VoidPtr zone);

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

    /**
     * This method is deprecated. Use dataWithPropertyList:format:options:error: instead.
     */
    @Generated
    @Deprecated
    @Selector("dataFromPropertyList:format:errorDescription:")
    public static native NSData dataFromPropertyListFormatErrorDescription(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format, @ReferenceInfo(type = NSString.class) Ptr<NSString> errorString);

    /**
     * Create an NSData from a property list. The format can be either NSPropertyListXMLFormat_v1_0 or NSPropertyListBinaryFormat_v1_0. The options parameter is currently unused and should be set to 0. If an error occurs the return value will be nil and the error parameter (if non-NULL) set to an autoreleased NSError describing the problem.
     */
    @Generated
    @Selector("dataWithPropertyList:format:options:error:")
    public static native NSData dataWithPropertyListFormatOptionsError(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format, @NUInt long opt, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native NSPropertyListSerialization new_objc();

    /**
     * Verify that a specified property list is valid for a given format. Returns YES if the property list is valid.
     */
    @Generated
    @Selector("propertyList:isValidForFormat:")
    public static native boolean propertyListIsValidForFormat(@Mapped(ObjCObjectMapper.class) Object plist,
            @NUInt long format);

    /**
     * This method is deprecated. Use propertyListWithData:options:format:error: instead.
     */
    @Generated
    @Deprecated
    @Selector("propertyListFromData:mutabilityOption:format:errorDescription:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListFromDataMutabilityOptionFormatErrorDescription(NSData data, @NUInt long opt,
            NUIntPtr format, @ReferenceInfo(type = NSString.class) Ptr<NSString> errorString);

    /**
     * Create a property list from an NSData. The options can be any of NSPropertyListMutabilityOptions. If the format parameter is non-NULL, it will be filled out with the format that the property list was stored in. If an error occurs the return value will be nil and the error parameter (if non-NULL) set to an autoreleased NSError describing the problem.
     */
    @Generated
    @Selector("propertyListWithData:options:format:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListWithDataOptionsFormatError(NSData data, @NUInt long opt, NUIntPtr format,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Create a property list by reading from an NSInputStream. The options can be any of NSPropertyListMutabilityOptions. If the format parameter is non-NULL, it will be filled out with the format that the property list was stored in. If an error occurs the return value will be nil and the error parameter (if non-NULL) set to an autoreleased NSError describing the problem.
     */
    @Generated
    @Selector("propertyListWithStream:options:format:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyListWithStreamOptionsFormatError(NSInputStream stream, @NUInt long opt,
            NUIntPtr format, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    /**
     * Write a property list to an output stream. The stream should be opened and configured. The format can be either NSPropertyListXMLFormat_v1_0 or NSPropertyListBinaryFormat_v1_0. The options parameter is currently unused and should be set to 0. If an error occurs the return value will be 0 and the error parameter (if non-NULL) set to an autoreleased NSError describing the problem. In a successful case, the return value is the number of bytes written to the stream.
     */
    @Generated
    @Selector("writePropertyList:toStream:format:options:error:")
    @NInt
    public static native long writePropertyListToStreamFormatOptionsError(@Mapped(ObjCObjectMapper.class) Object plist,
            NSOutputStream stream, @NUInt long format, @NUInt long opt,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSPropertyListSerialization init();
}
