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
import org.moe.natj.general.ptr.BytePtr;
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
public class NSInputStream extends NSStream {
    static {
        NatJ.register();
    }

    @Generated
    protected NSInputStream(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSInputStream alloc();

    /**
     * inputStreamWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/clm/NSInputStream/inputStreamWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputStreamWithData:")
    public static native NSInputStream inputStreamWithData(NSData data);

    /**
     * inputStreamWithFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/clm/NSInputStream/inputStreamWithFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputStreamWithFileAtPath:")
    public static native NSInputStream inputStreamWithFileAtPath(String path);

    /**
     * inputStreamWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/clm/NSInputStream/inputStreamWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputStreamWithURL:")
    public static native NSInputStream inputStreamWithURL(NSURL url);

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
    @Selector("getBoundStreamsWithBufferSize:inputStream:outputStream:")
    public static native void getBoundStreamsWithBufferSizeInputStreamOutputStream(@NUInt long bufferSize,
            Ptr<NSInputStream> inputStream, Ptr<NSOutputStream> outputStream);

    @Generated
    @Selector("getStreamsToHostWithName:port:inputStream:outputStream:")
    public static native void getStreamsToHostWithNamePortInputStreamOutputStream(String hostname, @NInt long port,
            Ptr<NSInputStream> inputStream, Ptr<NSOutputStream> outputStream);

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

    /**
     * getBuffer:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instm/NSInputStream/getBuffer:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBuffer:length:")
    public native boolean getBufferLength(Ptr<BytePtr> buffer, NUIntPtr len);

    /**
     * hasBytesAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instp/NSInputStream/hasBytesAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasBytesAvailable")
    public native boolean hasBytesAvailable();

    @Generated
    @Selector("init")
    public native NSInputStream init();

    /**
     * initWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instm/NSInputStream/initWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:")
    public native NSInputStream initWithData(NSData data);

    /**
     * initWithFileAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instm/NSInputStream/initWithFileAtPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFileAtPath:")
    public native NSInputStream initWithFileAtPath(String path);

    /**
     * initWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instm/NSInputStream/initWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:")
    public native NSInputStream initWithURL(NSURL url);

    /**
     * read:maxLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSInputStream_Class/index.html#//apple_ref/occ/instm/NSInputStream/read:maxLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("read:maxLength:")
    @NInt
    public native long readMaxLength(BytePtr buffer, @NUInt long len);
}
