package apple.threadnetwork;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class that supports safely sharing Thread credentials between multiple
 * clients.
 * 
 * Request credentials for either a specific Thread network or for the
 * _preferred network_ using `THClient`. The preferred network is the default
 * Thread network chosen by the framework for a home.
 * 
 * The ThreadNetwork framework maintains a database of network credentials. The
 * class allows clients to store, list, and delete credentials for a given
 * network from the database.
 * 
 * Some methods in `THClient` use the _team ID_, a string that you store in
 * your application’s `Info.plist`. The ThreadNetwork framework uses the team
 * ID to preserve the privacy of the Thread network credentials across
 * different clients. For example, credentials stored by one client can’t be
 * deleted or modified by another client.
 * 
 * - Important: Thread credentials give you the ability to add any device into
 * the Thread network. Use this information responsibly.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ThreadNetwork")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class THClient extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected THClient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native THClient alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native THClient allocWithZone(VoidPtr zone);

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

    /**
     * Deletes Thread network credentials from the framework database for a Border
     * Agent.
     * 
     * The Border Agent is the software component running in the Border Router
     * responsible for advertising itself in the Wi-Fi or Ethernet network.
     * 
     * - Parameters:
     * - borderAgentID: The identifer of a Thread network Border Agent.
     * - completion: The completion handler the framework calls after deleting
     * the credentials.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func deleteCredentials(forBorderAgent borderAgentID: Data) async throws
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("deleteCredentialsForBorderAgent:completion:")
    public native void deleteCredentialsForBorderAgentCompletion(@NotNull NSData borderAgentID,
            @NotNull @ObjCBlock(name = "call_deleteCredentialsForBorderAgentCompletion") Block_deleteCredentialsForBorderAgentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteCredentialsForBorderAgentCompletion {
        @Generated
        void call_deleteCredentialsForBorderAgentCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates the client object.
     * 
     * - Returns: An instance of the client object.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("init")
    public native THClient init();

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
    public static native THClient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Requests all Thread credentials from the framework.
     * 
     * The framework identifies the developer by the team ID. When calling this
     * method, you receive credentials for your team ID only.
     * 
     * - Parameters:
     * - completion: The completion handler the framework calls when the
     * credentials become available.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func allCredentials() async throws -> Set<THCredentials>
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveAllCredentials:")
    public native void retrieveAllCredentials(
            @NotNull @ObjCBlock(name = "call_retrieveAllCredentials") Block_retrieveAllCredentials completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveAllCredentials {
        @Generated
        void call_retrieveAllCredentials(@Nullable NSSet<? extends THCredentials> credentials, @Nullable NSError error);
    }

    /**
     * Requests Thread credentials for a Border Agent.
     * 
     * The framework identifies the developer by the team ID. When calling this
     * method, you receive credentials for your team ID only.
     * 
     * - Parameters:
     * - borderAgentID: The identifer of a Thread network Border Agent.
     * - completion: The completion handler the framework calls when the
     * credentials become available.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func credentials(forBorderAgentID borderAgentID: Data) async throws -> THCredentials
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveCredentialsForBorderAgent:completion:")
    public native void retrieveCredentialsForBorderAgentCompletion(@NotNull NSData borderAgentID,
            @NotNull @ObjCBlock(name = "call_retrieveCredentialsForBorderAgentCompletion") Block_retrieveCredentialsForBorderAgentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveCredentialsForBorderAgentCompletion {
        @Generated
        void call_retrieveCredentialsForBorderAgentCompletion(@Nullable THCredentials credentials,
                @Nullable NSError error);
    }

    /**
     * Requests Thread credentials for an extended Personal Area Network (PAN) ID.
     * 
     * When calling this method, an alert appears asking for user permission to
     * access credentials.
     * 
     * - Parameters:
     * - extendedPANID: The extended PAN identifier.
     * - completion: The completion handler the framework calls when the
     * credentials become available.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func credentials(forExtendedPANID extendedPANID: Data) async throws -> THCredentials
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveCredentialsForExtendedPANID:completion:")
    public native void retrieveCredentialsForExtendedPANIDCompletion(@NotNull NSData extendedPANID,
            @NotNull @ObjCBlock(name = "call_retrieveCredentialsForExtendedPANIDCompletion") Block_retrieveCredentialsForExtendedPANIDCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveCredentialsForExtendedPANIDCompletion {
        @Generated
        void call_retrieveCredentialsForExtendedPANIDCompletion(@Nullable THCredentials credentials,
                @Nullable NSError error);
    }

    /**
     * Requests Thread credentials for the preferred network.
     * 
     * When you call this method, an alert appears asking for user permission to
     * access credentials.
     * 
     * - Parameters:
     * - completion: The completion handler the framework calls when the
     * credentials become available.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func preferredCredentials() async throws -> THCredentials
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrievePreferredCredentials:")
    public native void retrievePreferredCredentials(
            @NotNull @ObjCBlock(name = "call_retrievePreferredCredentials") Block_retrievePreferredCredentials completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrievePreferredCredentials {
        @Generated
        void call_retrievePreferredCredentials(@Nullable THCredentials credentials, @Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Stores Thread network credentials into the framework database
     * that a Border Agent provides.
     * 
     * The Border Agent is the software component running in the
     * Border Router responsible for advertising itself in the Wi-Fi
     * or Ethernet network.
     * 
     * The framework only stores credentials if it can find an mDNS
     * record for the Border Agent that contains the specified Border
     * Agent identifier.
     * 
     * - Parameters:
     * - borderAgentID: The identifer of an active Thread network Border Agent.
     * - activeOperationalDataSet: The essential operational parameters for the
     * Thread network.
     * - completion: The completion handler the framework calls after
     * storing the credentials.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func storeCredentials(forBorderAgent borderAgentID: Data, activeOperationalDataSet: Data) async throws
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("storeCredentialsForBorderAgent:activeOperationalDataSet:completion:")
    public native void storeCredentialsForBorderAgentActiveOperationalDataSetCompletion(@NotNull NSData borderAgentID,
            @NotNull NSData activeOperationalDataSet,
            @NotNull @ObjCBlock(name = "call_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion") Block_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion {
        @Generated
        void call_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines if the essential operating parameters match the preferred
     * network’s parameters.
     * 
     * - Parameters:
     * - activeOperationalDataSet: The essential operating parameters to compare
     * against the preferred network’s parameters.
     * - completion: The completion handler that returns the result of the
     * comparison.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func isPreferred(forActiveOperationalDataset activeOperationalDataSet: Data) async -> Bool
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 15.5
     */
    @Generated
    @Selector("checkPreferredNetworkForActiveOperationalDataset:completion:")
    public native void checkPreferredNetworkForActiveOperationalDatasetCompletion(
            @NotNull NSData activeOperationalDataSet,
            @NotNull @ObjCBlock(name = "call_checkPreferredNetworkForActiveOperationalDatasetCompletion") Block_checkPreferredNetworkForActiveOperationalDatasetCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkPreferredNetworkForActiveOperationalDatasetCompletion {
        @Generated
        void call_checkPreferredNetworkForActiveOperationalDatasetCompletion(boolean isPreferred);
    }

    /**
     * Determines if the preferred network is available or not
     * 
     * - Parameters:
     * - completion: The completion handler that returns the result of the
     * preferred network availability.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func isPreferredAvailable() async -> Bool
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("isPreferredNetworkAvailableWithCompletion:")
    public native void isPreferredNetworkAvailableWithCompletion(
            @ObjCBlock(name = "call_isPreferredNetworkAvailableWithCompletion") @NotNull Block_isPreferredNetworkAvailableWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_isPreferredNetworkAvailableWithCompletion {
        @Generated
        void call_isPreferredNetworkAvailableWithCompletion(boolean isPreferredAvailable);
    }

    /**
     * Requests all Thread credentials with active border routers around from the framework.
     * 
     * The framework identifies the developer by the team ID. When calling this
     * method, you will receive credentials for active border routers around.
     * You receive credentials for your team ID only.
     * 
     * - Parameters:
     * - completion: The completion handler the framework calls when the
     * credentials become available.
     * 
     * > Concurrency Note: You can call this method from synchronous code using a completion handler,
     * > as shown on this page, or you can call it as an asynchronous method that has the
     * > following declaration:
     * >
     * > ```swift
     * > func allActiveCredentials() async throws -> Set<THCredentials>
     * > ```
     * >
     * > For information about concurrency and asynchronous code in Swift, see
     * <doc://com.apple.documentation/documentation/swift/calling-objective-c-apis-asynchronously>.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("retrieveAllActiveCredentials:")
    public native void retrieveAllActiveCredentials(
            @ObjCBlock(name = "call_retrieveAllActiveCredentials") @NotNull Block_retrieveAllActiveCredentials completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveAllActiveCredentials {
        @Generated
        void call_retrieveAllActiveCredentials(@Nullable NSSet<? extends THCredentials> credentials,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
