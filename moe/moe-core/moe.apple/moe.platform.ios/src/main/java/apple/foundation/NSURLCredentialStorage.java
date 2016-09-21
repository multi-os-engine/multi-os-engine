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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCredentialStorage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLCredentialStorage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLCredentialStorage alloc();

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
    @Selector("sharedCredentialStorage")
    public static native NSURLCredentialStorage sharedCredentialStorage();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("allCredentials")
    public native NSDictionary<? extends NSURLProtectionSpace, ? extends NSDictionary<String, ? extends NSURLCredential>> allCredentials();

    @Generated
    @Selector("credentialsForProtectionSpace:")
    public native NSDictionary<String, ? extends NSURLCredential> credentialsForProtectionSpace(
            NSURLProtectionSpace space);

    @Generated
    @Selector("defaultCredentialForProtectionSpace:")
    public native NSURLCredential defaultCredentialForProtectionSpace(NSURLProtectionSpace space);

    @Generated
    @Selector("getCredentialsForProtectionSpace:task:completionHandler:")
    public native void getCredentialsForProtectionSpaceTaskCompletionHandler(NSURLProtectionSpace protectionSpace,
            NSURLSessionTask task,
            @ObjCBlock(name = "call_getCredentialsForProtectionSpaceTaskCompletionHandler") Block_getCredentialsForProtectionSpaceTaskCompletionHandler completionHandler);

    @Generated
    @Selector("getDefaultCredentialForProtectionSpace:task:completionHandler:")
    public native void getDefaultCredentialForProtectionSpaceTaskCompletionHandler(NSURLProtectionSpace space,
            NSURLSessionTask task,
            @ObjCBlock(name = "call_getDefaultCredentialForProtectionSpaceTaskCompletionHandler") Block_getDefaultCredentialForProtectionSpaceTaskCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NSURLCredentialStorage init();

    @Generated
    @Selector("removeCredential:forProtectionSpace:")
    public native void removeCredentialForProtectionSpace(NSURLCredential credential, NSURLProtectionSpace space);

    @Generated
    @Selector("removeCredential:forProtectionSpace:options:")
    public native void removeCredentialForProtectionSpaceOptions(NSURLCredential credential, NSURLProtectionSpace space,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("removeCredential:forProtectionSpace:options:task:")
    public native void removeCredentialForProtectionSpaceOptionsTask(NSURLCredential credential,
            NSURLProtectionSpace protectionSpace, NSDictionary<String, ?> options, NSURLSessionTask task);

    @Generated
    @Selector("setCredential:forProtectionSpace:")
    public native void setCredentialForProtectionSpace(NSURLCredential credential, NSURLProtectionSpace space);

    @Generated
    @Selector("setCredential:forProtectionSpace:task:")
    public native void setCredentialForProtectionSpaceTask(NSURLCredential credential,
            NSURLProtectionSpace protectionSpace, NSURLSessionTask task);

    @Generated
    @Selector("setDefaultCredential:forProtectionSpace:")
    public native void setDefaultCredentialForProtectionSpace(NSURLCredential credential, NSURLProtectionSpace space);

    @Generated
    @Selector("setDefaultCredential:forProtectionSpace:task:")
    public native void setDefaultCredentialForProtectionSpaceTask(NSURLCredential credential,
            NSURLProtectionSpace protectionSpace, NSURLSessionTask task);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialsForProtectionSpaceTaskCompletionHandler {
        @Generated
        void call_getCredentialsForProtectionSpaceTaskCompletionHandler(
                NSDictionary<String, ? extends NSURLCredential> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDefaultCredentialForProtectionSpaceTaskCompletionHandler {
        @Generated
        void call_getDefaultCredentialForProtectionSpaceTaskCompletionHandler(NSURLCredential arg0);
    }
}
