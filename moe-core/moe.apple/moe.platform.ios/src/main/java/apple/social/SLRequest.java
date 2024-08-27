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

package apple.social;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Social")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SLRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SLRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SLRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SLRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SLRequest new_objc();

    @Generated
    @Selector("requestForServiceType:requestMethod:URL:parameters:")
    public static native SLRequest requestForServiceTypeRequestMethodURLParameters(String serviceType,
            @NInt long requestMethod, NSURL url, NSDictionary<?, ?> parameters);

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
     * The request URL
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * Specify a named MIME multi-part value. If you set parameters,
     * the parameters will automatically be added as form data in the multi-part data.
     */
    @Generated
    @Selector("addMultipartData:withName:type:filename:")
    public native void addMultipartDataWithNameTypeFilename(NSData data, String name, String type, String filename);

    @Generated
    @Selector("init")
    public native SLRequest init();

    /**
     * The parameters
     */
    @Generated
    @Selector("parameters")
    public native NSDictionary<?, ?> parameters();

    /**
     * Issue the request. This block is not guaranteed to be called on any particular thread.
     */
    @Generated
    @Selector("performRequestWithHandler:")
    public native void performRequestWithHandler(
            @ObjCBlock(name = "call_performRequestWithHandler") Block_performRequestWithHandler handler);

    /**
     * Returns a NSURLRequest for use with NSURLConnection.
     * If an account has been set the returned request is either signed (OAuth1),
     * or has the appropriate token set (OAuth2)
     */
    @Generated
    @Selector("preparedURLRequest")
    public native NSURLRequest preparedURLRequest();

    /**
     * The request method
     */
    @Generated
    @Selector("requestMethod")
    @NInt
    public native long requestMethod();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performRequestWithHandler {
        @Generated
        void call_performRequestWithHandler(NSData responseData, NSHTTPURLResponse urlResponse, NSError error);
    }

    /**
     * Optional account information used to authenticate the request. Defaults to nil.
     */
    @Generated
    @Selector("account")
    public native ACAccount account();

    /**
     * Optional account information used to authenticate the request. Defaults to nil.
     */
    @Generated
    @Selector("setAccount:")
    public native void setAccount(ACAccount value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
