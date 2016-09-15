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

package apple.twitter;

import apple.NSObject;
import apple.accounts.ACAccount;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSHTTPURLResponse;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Twitter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TWRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TWRequest(Pointer peer) {
        super(peer);
    }

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instp/TWRequest/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * account</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instp/TWRequest/account">iOS Dev Center</a>
     */
    @Generated
    @Selector("account")
    public native ACAccount account();

    /**
     * addMultiPartData:withName:type:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instm/TWRequest/addMultiPartData:withName:type:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMultiPartData:withName:type:")
    public native void addMultiPartDataWithNameType(NSData data, String name, String type);

    @Generated
    @Owned
    @Selector("alloc")
    public static native TWRequest alloc();

    @Generated
    @Selector("init")
    public native TWRequest init();

    /**
     * initWithURL:parameters:requestMethod:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instm/TWRequest/initWithURL:parameters:requestMethod:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:parameters:requestMethod:")
    public native TWRequest initWithURLParametersRequestMethod(NSURL url, NSDictionary<?, ?> parameters,
            @NInt long requestMethod);

    /**
     * parameters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instp/TWRequest/parameters">iOS Dev Center</a>
     */
    @Generated
    @Selector("parameters")
    public native NSDictionary<?, ?> parameters();

    /**
     * performRequestWithHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instm/TWRequest/performRequestWithHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performRequestWithHandler:")
    public native void performRequestWithHandler(
            @ObjCBlock(name = "call_performRequestWithHandler") Block_performRequestWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performRequestWithHandler {
        @Generated
        void call_performRequestWithHandler(NSData arg0, NSHTTPURLResponse arg1, NSError arg2);
    }

    /**
     * requestMethod</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instp/TWRequest/requestMethod">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestMethod")
    @NInt
    public native long requestMethod();

    /**
     * account</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instp/TWRequest/account">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccount:")
    public native void setAccount(ACAccount value);

    /**
     * signedURLRequest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Twitter/Reference/TWRequestClassRef/index.html#//apple_ref/occ/instm/TWRequest/signedURLRequest">iOS Dev Center</a>
     */
    @Generated
    @Selector("signedURLRequest")
    public native NSURLRequest signedURLRequest();

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
