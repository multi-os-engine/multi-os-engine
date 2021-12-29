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

package apple.videosubscriberaccount;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Specifies which information the app wants to obtain about the subscriber's account.
 * You should only request the information you need to fulfill your contractual obligations.
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VSAccountMetadataRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VSAccountMetadataRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VSAccountMetadataRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VSAccountMetadataRequest allocWithZone(VoidPtr zone);

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
    public static native VSAccountMetadataRequest new_objc();

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
     * Attributes to add to a SAML attributeQuery request and sent to the account provider.
     */
    @Generated
    @Selector("attributeNames")
    public native NSArray<String> attributeNames();

    /**
     * Identifies who is making the request.
     * For use by applications using the SAML authentication scheme only.
     */
    @Generated
    @Selector("channelIdentifier")
    public native String channelIdentifier();

    /**
     * Requests that the TV Provider reauthenticate the user if they are already authenticated.
     */
    @Generated
    @Selector("forceAuthentication")
    public native boolean forceAuthentication();

    /**
     * Whether to request information that identifies the account provider.
     */
    @Generated
    @Selector("includeAccountProviderIdentifier")
    public native boolean includeAccountProviderIdentifier();

    /**
     * Whether to request the expiration date of the subscriber's current authentication.
     */
    @Generated
    @Selector("includeAuthenticationExpirationDate")
    public native boolean includeAuthenticationExpirationDate();

    @Generated
    @Selector("init")
    public native VSAccountMetadataRequest init();

    /**
     * Whether the user might expect to be prompted to authenticate in order to complete this request.
     */
    @Generated
    @Selector("isInterruptionAllowed")
    public native boolean isInterruptionAllowed();

    /**
     * Whether the user might expect to be prompted to authenticate in order to complete this request.
     */
    @Generated
    @Selector("setInterruptionAllowed:")
    public native void setInterruptionAllowed(boolean value);

    /**
     * A brief, user-presentable name for the video that the app will play if it receives a successful response.
     * For example, "What's New in Swift" or "Office Space"
     * Do not provide a value if the request will not be used to play a specific video.
     */
    @Generated
    @Selector("localizedVideoTitle")
    public native String localizedVideoTitle();

    /**
     * Attributes to add to a SAML attributeQuery request and sent to the account provider.
     */
    @Generated
    @Selector("setAttributeNames:")
    public native void setAttributeNames(NSArray<String> value);

    /**
     * Identifies who is making the request.
     * For use by applications using the SAML authentication scheme only.
     */
    @Generated
    @Selector("setChannelIdentifier:")
    public native void setChannelIdentifier(String value);

    /**
     * Requests that the TV Provider reauthenticate the user if they are already authenticated.
     */
    @Generated
    @Selector("setForceAuthentication:")
    public native void setForceAuthentication(boolean value);

    /**
     * Whether to request information that identifies the account provider.
     */
    @Generated
    @Selector("setIncludeAccountProviderIdentifier:")
    public native void setIncludeAccountProviderIdentifier(boolean value);

    /**
     * Whether to request the expiration date of the subscriber's current authentication.
     */
    @Generated
    @Selector("setIncludeAuthenticationExpirationDate:")
    public native void setIncludeAuthenticationExpirationDate(boolean value);

    /**
     * A brief, user-presentable name for the video that the app will play if it receives a successful response.
     * For example, "What's New in Swift" or "Office Space"
     * Do not provide a value if the request will not be used to play a specific video.
     */
    @Generated
    @Selector("setLocalizedVideoTitle:")
    public native void setLocalizedVideoTitle(String value);

    /**
     * If non-empty, limits which account providers can respond to the request.
     */
    @Generated
    @Selector("setSupportedAccountProviderIdentifiers:")
    public native void setSupportedAccountProviderIdentifiers(NSArray<String> value);

    /**
     * The collection of authentication schemes that the app supports for this request.
     * This list may be used to determine compatibility of the app with providers.
     * Defaults to SAML.
     */
    @Generated
    @Selector("setSupportedAuthenticationSchemes:")
    public native void setSupportedAuthenticationSchemes(NSArray<String> value);

    /**
     * A value that the account provider may use to verify the identity of the requesting app.
     */
    @Generated
    @Selector("setVerificationToken:")
    public native void setVerificationToken(String value);

    /**
     * If non-empty, limits which account providers can respond to the request.
     */
    @Generated
    @Selector("supportedAccountProviderIdentifiers")
    public native NSArray<String> supportedAccountProviderIdentifiers();

    /**
     * The collection of authentication schemes that the app supports for this request.
     * This list may be used to determine compatibility of the app with providers.
     * Defaults to SAML.
     */
    @Generated
    @Selector("supportedAuthenticationSchemes")
    public native NSArray<String> supportedAuthenticationSchemes();

    /**
     * A value that the account provider may use to verify the identity of the requesting app.
     */
    @Generated
    @Selector("verificationToken")
    public native String verificationToken();

    /**
     * If non-empty, specifies providers which may be given more prominent placement
     * when choosing an account provider during authentication.
     */
    @Generated
    @Selector("featuredAccountProviderIdentifiers")
    public native NSArray<String> featuredAccountProviderIdentifiers();

    /**
     * If non-empty, specifies providers which may be given more prominent placement
     * when choosing an account provider during authentication.
     */
    @Generated
    @Selector("setFeaturedAccountProviderIdentifiers:")
    public native void setFeaturedAccountProviderIdentifiers(NSArray<String> value);

    /**
     * A value that an account provider application may set to pass an existing authentication session.
     * For use by TV Provider applications only.
     */
    @Generated
    @Selector("accountProviderAuthenticationToken")
    public native String accountProviderAuthenticationToken();

    /**
     * A value that an account provider application may set to pass an existing authentication session.
     * For use by TV Provider applications only.
     */
    @Generated
    @Selector("setAccountProviderAuthenticationToken:")
    public native void setAccountProviderAuthenticationToken(String value);

    /**
     * Application-specific providers to be added to the list of account providers.
     */
    @Generated
    @Selector("applicationAccountProviders")
    public native NSArray<? extends VSAccountApplicationProvider> applicationAccountProviders();

    /**
     * Application-specific providers to be added to the list of account providers.
     */
    @Generated
    @Selector("setApplicationAccountProviders:")
    public native void setApplicationAccountProviders(NSArray<? extends VSAccountApplicationProvider> value);
}
