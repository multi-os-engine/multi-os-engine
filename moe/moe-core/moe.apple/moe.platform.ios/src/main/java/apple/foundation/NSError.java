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
import apple.fileprovider.protocol.NSFileProviderItem;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSError extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSError(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSError alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSError allocWithZone(VoidPtr zone);

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
    @Selector("errorWithDomain:code:userInfo:")
    public static native NSError errorWithDomainCodeUserInfo(String domain, @NInt long code,
            NSDictionary<String, ?> dict);

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
    public static native NSError new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specify a block which will be called from the implementations of localizedDescription, localizedFailureReason,
     * localizedRecoverySuggestion, localizedRecoveryOptions, recoveryAttempter, helpAnchor, and debugDescription when
     * the underlying value for these is not present in the userInfo dictionary of NSError instances with the specified
     * domain. The provider will be called with the userInfo key corresponding to the queried property: For instance,
     * NSLocalizedDescriptionKey for localizedDescription. The provider should return nil for any keys it is not able to
     * provide and, very importantly, any keys it does not recognize (since we may extend the list of keys in future
     * releases).
     * 
     * The specified block will be called synchronously at the time when the above properties are queried. The results
     * are not cached.
     * 
     * This provider is optional. It enables localization and formatting of error messages to be done lazily; rather
     * than populating the userInfo at NSError creation time, these keys will be fetched on-demand when asked for.
     * 
     * It is expected that only the “owner” of an NSError domain specifies the provider for the domain, and this is done
     * once. This facility is not meant for consumers of errors to customize the userInfo entries. This facility should
     * not be used to customize the behaviors of error domains provided by the system.
     * 
     * If an appropriate result for the requested key cannot be provided, return nil rather than choosing to manufacture
     * a generic fallback response such as "Operation could not be completed, error 42." NSError will take care of the
     * fallback cases.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setUserInfoValueProviderForDomain:provider:")
    public static native void setUserInfoValueProviderForDomainProvider(String errorDomain,
            @ObjCBlock(name = "call_setUserInfoValueProviderForDomainProvider") Block_setUserInfoValueProviderForDomainProvider provider);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("userInfoValueProviderForDomain:")
    @ObjCBlock(name = "call_userInfoValueProviderForDomain_ret")
    public static native Block_userInfoValueProviderForDomain_ret userInfoValueProviderForDomain(String errorDomain);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("code")
    @NInt
    public native long code();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * These define the error. Domains are described by names that are arbitrary strings used to differentiate groups of
     * codes; for custom domain using reverse-DNS naming will help avoid conflicts. Codes are domain-specific.
     */
    @Generated
    @Selector("domain")
    public native String domain();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Return the help anchor that can be used to create a help button to accompany the error when it's displayed to the
     * user. This is done automatically by +[NSAlert alertWithError:], which the presentError: variants in NSApplication
     * go through. The default implementation of this picks up the value of the NSHelpAnchorErrorKey from the userInfo
     * dictionary. If not present, it consults the userInfoValueProvider for the domain. If that returns nil, this also
     * returns nil.
     */
    @Generated
    @Selector("helpAnchor")
    public native String helpAnchor();

    @Generated
    @Selector("init")
    public native NSError init();

    @Generated
    @Selector("initWithCoder:")
    public native NSError initWithCoder(NSCoder coder);

    /**
     * Domain cannot be nil; dict may be nil if no userInfo desired.
     */
    @Generated
    @Selector("initWithDomain:code:userInfo:")
    public native NSError initWithDomainCodeUserInfo(String domain, @NInt long code, NSDictionary<String, ?> dict);

    /**
     * The primary user-presentable message for the error, for instance for NSFileReadNoPermissionError: "The file "File
     * Name" couldn't be opened because you don't have permission to view it.". This message should ideally indicate
     * what failed and why it failed. This value either comes from NSLocalizedDescriptionKey, or
     * NSLocalizedFailureErrorKey+NSLocalizedFailureReasonErrorKey, or NSLocalizedFailureErrorKey. The steps this takes
     * to construct the description include:
     * 1. Look for NSLocalizedDescriptionKey in userInfo, use value as-is if present.
     * 2. Look for NSLocalizedFailureErrorKey in userInfo. If present, use, combining with value for
     * NSLocalizedFailureReasonErrorKey if available.
     * 3. Fetch NSLocalizedDescriptionKey from userInfoValueProvider, use value as-is if present.
     * 4. Fetch NSLocalizedFailureErrorKey from userInfoValueProvider. If present, use, combining with value for
     * NSLocalizedFailureReasonErrorKey if available.
     * 5. Look for NSLocalizedFailureReasonErrorKey in userInfo or from userInfoValueProvider; combine with generic
     * "Operation failed" message.
     * 6. Last resort localized but barely-presentable string manufactured from domain and code. The result is never
     * nil.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * Return a complete sentence which describes why the operation failed. For instance, for
     * NSFileReadNoPermissionError: "You don't have permission.". In many cases this will be just the "because" part of
     * the error message (but as a complete sentence, which makes localization easier). Default implementation of this
     * picks up the value of NSLocalizedFailureReasonErrorKey from the userInfo dictionary. If not present, it consults
     * the userInfoValueProvider for the domain, and if that returns nil, this also returns nil.
     */
    @Generated
    @Selector("localizedFailureReason")
    public native String localizedFailureReason();

    /**
     * Return titles of buttons that are appropriate for displaying in an alert. These should match the string provided
     * as a part of localizedRecoverySuggestion. The first string would be the title of the right-most and default
     * button, the second one next to it, and so on. If used in an alert the corresponding default return values are
     * NSAlertFirstButtonReturn + n. Default implementation of this picks up the value of
     * NSLocalizedRecoveryOptionsErrorKey from the userInfo dictionary. If not present, it consults the
     * userInfoValueProvider for the domain, and if that returns nil, this also returns nil. nil return usually implies
     * no special suggestion, which would imply a single "OK" button.
     */
    @Generated
    @Selector("localizedRecoveryOptions")
    public native NSArray<String> localizedRecoveryOptions();

    /**
     * Return the string that can be displayed as the "informative" (aka "secondary") message on an alert panel. For
     * instance, for NSFileReadNoPermissionError: "To view or change permissions, select the item in the Finder and
     * choose File > Get Info.". Default implementation of this picks up the value of
     * NSLocalizedRecoverySuggestionErrorKey from the userInfo dictionary. If not present, it consults the
     * userInfoValueProvider for the domain, and if that returns nil, this also returns nil.
     */
    @Generated
    @Selector("localizedRecoverySuggestion")
    public native String localizedRecoverySuggestion();

    /**
     * Return an object that conforms to the NSErrorRecoveryAttempting informal protocol. The recovery attempter must be
     * an object that can correctly interpret an index into the array returned by localizedRecoveryOptions. The default
     * implementation of this picks up the value of NSRecoveryAttempterErrorKey from the userInfo dictionary. If not
     * present, it consults the userInfoValueProvider for the domain. If that returns nil, this also returns nil.
     */
    @Generated
    @Selector("recoveryAttempter")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object recoveryAttempter();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Additional info which may be used to describe the error further. Examples of keys that might be included in here
     * are "Line Number", "Failed URL", etc. Embedding other errors in here can also be used as a way to communicate
     * underlying reasons for failures; for instance "File System Error" embedded in the userInfo of an NSError returned
     * from a higher level document object. If the embedded error information is itself NSError, the standard key
     * NSUnderlyingErrorKey can be used.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserInfoValueProviderForDomainProvider {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_setUserInfoValueProviderForDomainProvider(NSError err, String userInfoKey);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_userInfoValueProviderForDomain_ret {
        @Generated
        @MappedReturn(ObjCObjectMapper.class)
        Object call_userInfoValueProviderForDomain_ret(NSError arg0, String arg1);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("fileProviderErrorForCollisionWithItem:")
    public static native NSError fileProviderErrorForCollisionWithItem(
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem existingItem);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("fileProviderErrorForNonExistentItemWithIdentifier:")
    public static native NSError fileProviderErrorForNonExistentItemWithIdentifier(String itemIdentifier);

    /**
     * Return a list of underlying errors, if any. It includes the values of both NSUnderlyingErrorKey and
     * NSMultipleUnderlyingErrorsKey. If there are no underlying errors, returns an empty array.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("underlyingErrors")
    public native NSArray<? extends NSError> underlyingErrors();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("fileProviderErrorForRejectedDeletionOfItem:")
    public static native NSError fileProviderErrorForRejectedDeletionOfItem(
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem updatedVersion);
}
