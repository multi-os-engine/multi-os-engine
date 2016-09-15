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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKDownload extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKDownload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKDownload alloc();

    /**
     * contentIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/contentIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentIdentifier")
    public native String contentIdentifier();

    /**
     * contentLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/contentLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentLength")
    public native long contentLength();

    /**
     * contentURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/contentURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * contentVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/contentVersion">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentVersion")
    public native String contentVersion();

    /**
     * downloadState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/downloadState">iOS Dev Center</a>
     */
    @Generated
    @Selector("downloadState")
    @NInt
    public native long downloadState();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native SKDownload init();

    /**
     * progress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/progress">iOS Dev Center</a>
     */
    @Generated
    @Selector("progress")
    public native float progress();

    /**
     * timeRemaining</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/timeRemaining">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeRemaining")
    public native double timeRemaining();

    /**
     * transaction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/StoreKit/Reference/SKDownload_Ref/index.html#//apple_ref/occ/instp/SKDownload/transaction">iOS Dev Center</a>
     */
    @Generated
    @Selector("transaction")
    public native SKPaymentTransaction transaction();

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
}
