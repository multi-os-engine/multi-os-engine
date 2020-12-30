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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.security.opaque.SecIdentityRef;
import apple.security.opaque.SecTrustRef;
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
 * @class NSURLCredential
 * @discussion This class is an immutable object representing an authentication credential.  The actual type of the credential is determined by the constructor called in the categories declared below.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCredential extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLCredential alloc();

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

    /**
     * @method credentialForTrust:
     * @abstract Create a new NSURLCredential which specifies that a handshake has been trusted.
     * @result The new autoreleased NSURLCredential
     */
    @Generated
    @Selector("credentialForTrust:")
    public static native NSURLCredential credentialForTrust(SecTrustRef trust);

    /**
     * @method credentialWithIdentity:certificates:persistence:
     * @abstract Create a new NSURLCredential with an identity and certificate array
     * @param identity a SecIdentityRef object
     * @param certArray an array containing at least one SecCertificateRef objects
     * @param persistence enum that says to store per session, permanently or not at all
     * @result The new autoreleased NSURLCredential
     */
    @Generated
    @Selector("credentialWithIdentity:certificates:persistence:")
    public static native NSURLCredential credentialWithIdentityCertificatesPersistence(SecIdentityRef identity,
            NSArray<?> certArray, @NUInt long persistence);

    /**
     * @method credentialWithUser:password:persistence:
     * @abstract Create a new NSURLCredential with a user and password
     * @param user the username
     * @param password the password
     * @param persistence enum that says to store per session, permanently or not at all
     * @result The new autoreleased NSURLCredential
     */
    @Generated
    @Selector("credentialWithUser:password:persistence:")
    public static native NSURLCredential credentialWithUserPasswordPersistence(String user, String password,
            @NUInt long persistence);

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

    /**
     * @abstract Returns an NSArray of SecCertificateRef objects representing the client certificate for this credential, if this credential was created with an identity and certificate.
     * @result an NSArray of SecCertificateRef or NULL if this is a username/password credential
     */
    @Generated
    @Selector("certificates")
    public native NSArray<?> certificates();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * @abstract Find out if this credential has a password, without trying to get it
     * @result YES if this credential has a password, otherwise NO
     * @discussion If this credential's password is actually kept in an
     * external store, the password method may return nil even if this
     * method returns YES, since getting the password may fail, or the
     * user may refuse access.
     */
    @Generated
    @Selector("hasPassword")
    public native boolean hasPassword();

    /**
     * @abstract Returns the SecIdentityRef of this credential, if it was created with a certificate and identity
     * @result A SecIdentityRef or NULL if this is a username/password credential
     */
    @Generated
    @Selector("identity")
    public native SecIdentityRef identity();

    @Generated
    @Selector("init")
    public native NSURLCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLCredential initWithCoder(NSCoder coder);

    /**
     * @method initWithIdentity:certificates:persistence:
     * @abstract Initialize an NSURLCredential with an identity and array of at least 1 client certificates (SecCertificateRef)
     * @param identity a SecIdentityRef object
     * @param certArray an array containing at least one SecCertificateRef objects
     * @param persistence enum that says to store per session, permanently or not at all
     * @result the Initialized NSURLCredential
     */
    @Generated
    @Selector("initWithIdentity:certificates:persistence:")
    public native NSURLCredential initWithIdentityCertificatesPersistence(SecIdentityRef identity, NSArray<?> certArray,
            @NUInt long persistence);

    /**
     * @method initWithTrust:
     * @abstract Initialize a new NSURLCredential which specifies that the specified trust has been accepted.
     * @result the Initialized NSURLCredential
     */
    @Generated
    @Selector("initWithTrust:")
    public native NSURLCredential initWithTrust(SecTrustRef trust);

    /**
     * @method initWithUser:password:persistence:
     * @abstract Initialize a NSURLCredential with a user and password
     * @param user the username
     * @param password the password
     * @param persistence enum that says to store per session, permanently or not at all
     * @result The initialized NSURLCredential
     */
    @Generated
    @Selector("initWithUser:password:persistence:")
    public native NSURLCredential initWithUserPasswordPersistence(String user, String password,
            @NUInt long persistence);

    /**
     * @abstract Get the password
     * @result The password string
     * @discussion This method might actually attempt to retrieve the
     * password from an external store, possible resulting in prompting,
     * so do not call it unless needed.
     */
    @Generated
    @Selector("password")
    public native String password();

    /**
     * @abstract Determine whether this credential is or should be stored persistently
     * @result A value indicating whether this credential is stored permanently, per session or not at all.
     */
    @Generated
    @Selector("persistence")
    @NUInt
    public native long persistence();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * @abstract Get the username
     * @result The user string
     */
    @Generated
    @Selector("user")
    public native String user();
}
