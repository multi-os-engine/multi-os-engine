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

/**
 * NSURLCredentialStorage
 * 
 * NSURLCredentialStorage implements a singleton object (shared instance) which manages the shared credentials cache. Note: Whereas in Mac OS X any application can access any credential with a persistence of NSURLCredentialPersistencePermanent provided the user gives permission, in iPhone OS an application can access only its own credentials.
 */
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

    /**
     * [@property] sharedCredentialStorage
     * 
     * Get the shared singleton authentication storage
     * 
     * @return the shared authentication storage
     */
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

    /**
     * Get a dictionary mapping NSURLProtectionSpaces to dictionaries which map usernames to NSURLCredentials
     * 
     * @return an NSDictionary where the keys are NSURLProtectionSpaces
     * and the values are dictionaries, in which the keys are usernames
     * and the values are NSURLCredentials
     */
    @Generated
    @Selector("allCredentials")
    public native NSDictionary<? extends NSURLProtectionSpace, ? extends NSDictionary<String, ? extends NSURLCredential>> allCredentials();

    /**
     * credentialsForProtectionSpace:
     * 
     * Get a dictionary mapping usernames to credentials for the specified protection space.
     * 
     * @param space An NSURLProtectionSpace indicating the protection space for which to get credentials
     * @return A dictionary where the keys are usernames and the values are the corresponding NSURLCredentials.
     */
    @Generated
    @Selector("credentialsForProtectionSpace:")
    public native NSDictionary<String, ? extends NSURLCredential> credentialsForProtectionSpace(
            NSURLProtectionSpace space);

    /**
     * defaultCredentialForProtectionSpace:
     * 
     * Get the default credential for the specified protection space.
     * 
     * @param space The protection space for which to get the default credential.
     */
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

    /**
     * removeCredential:forProtectionSpace:
     * 
     * Remove the credential from the set for the specified protection space.
     * 
     * The credential is removed from both persistent and temporary storage. A credential that
     * has a persistence policy of NSURLCredentialPersistenceSynchronizable will fail.  
     * See removeCredential:forProtectionSpace:options.
     * 
     * @param credential The credential to remove.
     * @param space The protection space for which a credential should be removed
     */
    @Generated
    @Selector("removeCredential:forProtectionSpace:")
    public native void removeCredentialForProtectionSpace(NSURLCredential credential, NSURLProtectionSpace space);

    /**
     * removeCredential:forProtectionSpace:options
     * 
     * Remove the credential from the set for the specified protection space based on options.
     * 
     * The credential is removed from both persistent and temporary storage.
     * 
     * @param credential The credential to remove.
     * @param space The protection space for which a credential should be removed
     * @param options A dictionary containing options to consider when removing the credential.  This should
     * be used when trying to delete a credential that has the NSURLCredentialPersistenceSynchronizable policy.
     * Please note that when NSURLCredential objects that have a NSURLCredentialPersistenceSynchronizable policy
     * are removed, the credential will be removed on all devices that contain this credential.
     */
    @Generated
    @Selector("removeCredential:forProtectionSpace:options:")
    public native void removeCredentialForProtectionSpaceOptions(NSURLCredential credential, NSURLProtectionSpace space,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("removeCredential:forProtectionSpace:options:task:")
    public native void removeCredentialForProtectionSpaceOptionsTask(NSURLCredential credential,
            NSURLProtectionSpace protectionSpace, NSDictionary<String, ?> options, NSURLSessionTask task);

    /**
     * setCredential:forProtectionSpace:
     * 
     * Add a new credential to the set for the specified protection space or replace an existing one.
     * 
     * Multiple credentials may be set for a given protection space, but each must have
     * a distinct user. If a credential with the same user is already set for the protection space,
     * the new one will replace it.
     * 
     * @param credential The credential to set.
     * @param space The protection space for which to add it. 
     */
    @Generated
    @Selector("setCredential:forProtectionSpace:")
    public native void setCredentialForProtectionSpace(NSURLCredential credential, NSURLProtectionSpace space);

    @Generated
    @Selector("setCredential:forProtectionSpace:task:")
    public native void setCredentialForProtectionSpaceTask(NSURLCredential credential,
            NSURLProtectionSpace protectionSpace, NSURLSessionTask task);

    /**
     * setDefaultCredential:forProtectionSpace:
     * 
     * Set the default credential for the specified protection space.
     * 
     * If the credential is not yet in the set for the protection space, it will be added to it.
     * 
     * @param credential The credential to set as default.
     * @param space The protection space for which the credential should be set as default.
     */
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
                NSDictionary<String, ? extends NSURLCredential> credentials);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDefaultCredentialForProtectionSpaceTaskCompletionHandler {
        @Generated
        void call_getDefaultCredentialForProtectionSpaceTaskCompletionHandler(NSURLCredential credential);
    }
}
