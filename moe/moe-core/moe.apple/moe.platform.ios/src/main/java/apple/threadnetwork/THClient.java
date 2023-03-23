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

/**
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

    /**
     * [@function] deleteActiveDataSetRecordForBorderAgent
     * 
     * Delete Credentials For The given Border Agent identifier, stored by the client
     * 
     * [@parameter]
     * borderAgentID : Thread Network Border Agent Identifier
     * [@parameter]
     * completion : Callback function to return the status of the delete operation
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("deleteCredentialsForBorderAgent:completion:")
    public native void deleteCredentialsForBorderAgentCompletion(NSData borderAgentID,
            @ObjCBlock(name = "call_deleteCredentialsForBorderAgentCompletion") Block_deleteCredentialsForBorderAgentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteCredentialsForBorderAgentCompletion {
        @Generated
        void call_deleteCredentialsForBorderAgentCompletion(NSError error);
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@function] init
     * 
     * Initialize instance of THClient
     * 
     * [@parameter]
     * no parameters
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     * [@function] retrieveAllCredentials
     * 
     * Retrieve All Credentials, stored by the client
     * 
     * [@parameter]
     * completion : Callback function to receive all credentials
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveAllCredentials:")
    public native void retrieveAllCredentials(
            @ObjCBlock(name = "call_retrieveAllCredentials") Block_retrieveAllCredentials completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveAllCredentials {
        @Generated
        void call_retrieveAllCredentials(NSSet<? extends THCredentials> credentials, NSError error);
    }

    /**
     * [@function] retrieveCredentialsForBorderAgent
     * 
     * Retrieve Credentials For The given Thread Border Agent identifier, stored by the client
     * 
     * [@parameter]
     * completion : Callback function to receive the matching active dataset record
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveCredentialsForBorderAgent:completion:")
    public native void retrieveCredentialsForBorderAgentCompletion(NSData borderAgentID,
            @ObjCBlock(name = "call_retrieveCredentialsForBorderAgentCompletion") Block_retrieveCredentialsForBorderAgentCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveCredentialsForBorderAgentCompletion {
        @Generated
        void call_retrieveCredentialsForBorderAgentCompletion(THCredentials credentials, NSError error);
    }

    /**
     * [@function] retrieveActiveDataSetRecordForExtendedPANID
     * 
     * Retrieve Credentials For The given Extended-PAN Id
     * Invoking this API will result into UI Alert prompt seeking user's permission to access the credentials
     * 
     * [@parameter]
     * extendedPANID : Extended PAN Id identifying the thread network
     * completion : Callback function to receive the matching active dataset record
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrieveCredentialsForExtendedPANID:completion:")
    public native void retrieveCredentialsForExtendedPANIDCompletion(NSData extendedPANID,
            @ObjCBlock(name = "call_retrieveCredentialsForExtendedPANIDCompletion") Block_retrieveCredentialsForExtendedPANIDCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrieveCredentialsForExtendedPANIDCompletion {
        @Generated
        void call_retrieveCredentialsForExtendedPANIDCompletion(THCredentials credentials, NSError error);
    }

    /**
     * [@function] retrievePreferredCredentials
     * 
     * Retrieve Preferred Thread Network Credentials.
     * Invoking this API will result into UI Alert prompt seeking user's permission to access the credentials
     * 
     * [@parameter]
     * completion : Callback function to receive preferred network active dataset record
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("retrievePreferredCredentials:")
    public native void retrievePreferredCredentials(
            @ObjCBlock(name = "call_retrievePreferredCredentials") Block_retrievePreferredCredentials completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_retrievePreferredCredentials {
        @Generated
        void call_retrievePreferredCredentials(THCredentials credentials, NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@function] storeCredentialsForBorderAgent
     * 
     * Store the Credentials Record
     * 
     * [@parameters]
     * borderAgent : Border Agent Identifier
     * activeOperationalDataSet : byte array of active operational dataset
     * completion : Callback function to return the status of the store operation
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("storeCredentialsForBorderAgent:activeOperationalDataSet:completion:")
    public native void storeCredentialsForBorderAgentActiveOperationalDataSetCompletion(NSData borderAgentID,
            NSData activeOperationalDataSet,
            @ObjCBlock(name = "call_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion") Block_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion {
        @Generated
        void call_storeCredentialsForBorderAgentActiveOperationalDataSetCompletion(NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@function] checkPreferredNetworkForActiveOperationalDataset
     * 
     * Returns true if the dataset matches to the preferred network
     * 
     * [@parameters]
     * activeOperationalDataSet : byte array of active operational dataset
     * completion : Callback function gives true if dataset matches to preferred network, else false
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("checkPreferredNetworkForActiveOperationalDataset:completion:")
    public native void checkPreferredNetworkForActiveOperationalDatasetCompletion(NSData activeOperationalDataSet,
            @ObjCBlock(name = "call_checkPreferredNetworkForActiveOperationalDatasetCompletion") Block_checkPreferredNetworkForActiveOperationalDatasetCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkPreferredNetworkForActiveOperationalDatasetCompletion {
        @Generated
        void call_checkPreferredNetworkForActiveOperationalDatasetCompletion(boolean isPreferred);
    }
}
