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
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.protocol.NSURLAuthenticationChallengeSender;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSURLAuthenticationChallenge
 * <p>
 * This class represents an authentication challenge. It
 * provides all the information about the challenge, and has a method
 * to indicate when it's done.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLAuthenticationChallenge extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLAuthenticationChallenge(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLAuthenticationChallenge alloc();

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

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Get the error representing authentication failure.
     * <p>
     * If there was a previous authentication failure, and
     * this protocol uses errors to indicate authentication failure,
     * then this method will return the error. Otherwise it will
     * return nil.
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * Get the response representing authentication failure.
     * <p>
     * If there was a previous authentication failure, and
     * this protocol uses responses to indicate authentication failure,
     * then this method will return the response. Otherwise it will
     * return nil.
     *
     * @return The failure response or nil
     */
    @Generated
    @Selector("failureResponse")
    public native NSURLResponse failureResponse();

    @Generated
    @Selector("init")
    public native NSURLAuthenticationChallenge init();

    /**
     * initWithAuthenticationChallenge:
     * <p>
     * Initialize an authentication challenge copying all parameters from another one.
     * <p>
     * This initializer may be useful to subclassers that want to proxy
     * one type of authentication challenge to look like another type.
     *
     * @return A new challenge initialized with the parameters from the passed in challenge
     */
    @Generated
    @Selector("initWithAuthenticationChallenge:sender:")
    public native NSURLAuthenticationChallenge initWithAuthenticationChallengeSender(
            NSURLAuthenticationChallenge challenge,
            @Mapped(ObjCObjectMapper.class) NSURLAuthenticationChallengeSender sender);

    @Generated
    @Selector("initWithCoder:")
    public native NSURLAuthenticationChallenge initWithCoder(NSCoder coder);

    /**
     * initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:
     * <p>
     * Initialize an authentication challenge
     *
     * @param space                The NSURLProtectionSpace to use
     * @param credential           The proposed NSURLCredential for this challenge, or nil
     * @param previousFailureCount A count of previous failures attempting access.
     * @param response             The NSURLResponse for the authentication failure, if applicable, else nil
     * @param error                The NSError for the authentication failure, if applicable, else nil
     * @return An authentication challenge initialized with the specified parameters
     */
    @Generated
    @Selector("initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:")
    public native NSURLAuthenticationChallenge initWithProtectionSpaceProposedCredentialPreviousFailureCountFailureResponseErrorSender(
            NSURLProtectionSpace space, NSURLCredential credential, @NInt long previousFailureCount,
            NSURLResponse response, NSError error,
            @Mapped(ObjCObjectMapper.class) NSURLAuthenticationChallengeSender sender);

    /**
     * Get count of previous failed authentication attempts
     *
     * @return The count of previous failures
     */
    @Generated
    @Selector("previousFailureCount")
    @NInt
    public native long previousFailureCount();

    /**
     * Get the proposed credential for this challenge
     * <p>
     * proposedCredential may be nil, if there is no default
     * credential to use for this challenge (either stored or in the
     * URL). If the credential is not nil and returns YES for
     * hasPassword, this means the NSURLConnection thinks the credential
     * is ready to use as-is. If it returns NO for hasPassword, then the
     * credential is not ready to use as-is, but provides a default
     * username the client could use when prompting.
     *
     * @return The proposed credential
     */
    @Generated
    @Selector("proposedCredential")
    public native NSURLCredential proposedCredential();

    /**
     * Get a description of the protection space that requires authentication
     *
     * @return The protection space that needs authentication
     */
    @Generated
    @Selector("protectionSpace")
    public native NSURLProtectionSpace protectionSpace();

    /**
     * Get the sender of this challenge
     * <p>
     * The sender is the object you should reply to when done processing the challenge.
     *
     * @return The sender of the challenge
     */
    @Generated
    @Selector("sender")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLAuthenticationChallengeSender sender();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
