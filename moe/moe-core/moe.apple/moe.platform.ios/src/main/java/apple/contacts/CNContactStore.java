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

package apple.contacts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSEnumerator;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Provides methods to fetch and save contacts.
 * <p>
 * The CNContactStore is a thread safe class that can fetch and save contacts, fetch and save groups, and fetch containers.
 * <p>
 * [@note] Some good practices are:
 * 1) Only fetch contact properties that will be used.
 * 2) When fetching all contacts and caching the results, first fetch all contact identifiers only. Then fetch batches of detailed contacts by identifiers as you need them.
 * 3) To aggregate several contact fetches collect a set of unique contact identifiers from the fetches. Then fetch batches of detailed contacts by identifiers.
 * 4) When CNContactStoreDidChangeNotification is posted, if you cache any fetched contacts/groups/containers then they must be refetched and the old cached objects released.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContactStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContactStore alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Indicates the current authorization status to access contact data.
     * <p>
     * Based upon the access, the application could display or hide its UI elements that would access any Contacts API. This method is thread safe.
     *
     * @return Returns the authorization status for the given entityType.
     */
    @Generated
    @Selector("authorizationStatusForEntityType:")
    @NInt
    public static native long authorizationStatusForEntityType(@NInt long entityType);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Fetch all containers matching a given predicate.
     * <p>
     * Use only predicates from CNContainer+Predicates.h. Compound predicates are not supported.
     *
     * @param predicate The predicate to match against. Set to nil to match all containers.
     * @param error     If an error occurs, contains error information.
     * @return An array of CNContainer objects matching the predicate. If no matches are found, an empty array is returned. If an error occurs, nil is returned.
     */
    @Generated
    @Selector("containersMatchingPredicate:error:")
    public native NSArray<? extends CNContainer> containersMatchingPredicateError(NSPredicate predicate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The identifier of the default container.
     * <p>
     * This identifier can be used to fetch the default container.
     *
     * @return The identifier of the default container. If the caller lacks Contacts authorization or an error occurs, nil is returned.
     */
    @Generated
    @Selector("defaultContainerIdentifier")
    public native String defaultContainerIdentifier();

    /**
     * Enumerates all contacts matching a contact fetch request.
     * <p>
     * This method will wait until the enumeration is finished. If there are no results, the block is not called and YES is returned.
     *
     * @param fetchRequest The contact fetch request that specifies the search criteria.
     * @param error        If an error occurs, contains error information.
     * @param block        Called for each matching contact. Set *stop to YES to stop the enumeration.
     * @return YES if successful, otherwise NO.
     */
    @Generated
    @Selector("enumerateContactsWithFetchRequest:error:usingBlock:")
    public native boolean enumerateContactsWithFetchRequestErrorUsingBlock(CNContactFetchRequest fetchRequest,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            @ObjCBlock(name = "call_enumerateContactsWithFetchRequestErrorUsingBlock") Block_enumerateContactsWithFetchRequestErrorUsingBlock block);

    /**
     * Executes a save request.
     * <p>
     * Do not access objects when save request is executing. A save request with contacts may modify the contacts while executing. A save request only applies the changes to the objects. If there are overlapping changes with multiple, concurrent CNSaveRequests then the last saved change wins.
     *
     * @param saveRequest Save request to execute.
     * @param error       If an error occurs, contains error information.
     * @return YES if successful, otherwise NO.
     */
    @Generated
    @Selector("executeSaveRequest:error:")
    public native boolean executeSaveRequestError(CNSaveRequest saveRequest,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Fetch all groups matching a given predicate.
     * <p>
     * Use only predicates from CNGroup+Predicates.h. Compound predicates are not supported.
     *
     * @param predicate The predicate to match against. Set to nil to match all groups.
     * @param error     If an error occurs, contains error information.
     * @return An array of CNGroup objects matching the predicate. If no matches are found, an empty array is returned. If an error occurs, nil is returned.
     */
    @Generated
    @Selector("groupsMatchingPredicate:error:")
    public native NSArray<? extends CNGroup> groupsMatchingPredicateError(NSPredicate predicate,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native CNContactStore init();

    /**
     * Request access to the user's contacts.
     * <p>
     * Users are able to grant or deny access to contact data on a per-application basis. To request access to contact data, call requestAccessForEntityType:completionHandler:. This will not block the application while the user is being asked to grant or deny access. The user will only be prompted the first time access is requested; any subsequent CNContactStore calls will use the existing permissions. The completion handler is called on an arbitrary queue.
     * <p>
     * [@note] Recommended to use CNContactStore instance methods in this completion handler instead of the UI main thread. This method is optional when CNContactStore is used on a background thread. If it is not used in that case, CNContactStore will block if the user is asked to grant or deny access.
     *
     * @param entityType        Set to CNEntityTypeContacts.
     * @param completionHandler This block is called upon completion. If the user grants access then granted is YES and error is nil. Otherwise granted is NO with an error.
     */
    @Generated
    @Selector("requestAccessForEntityType:completionHandler:")
    public native void requestAccessForEntityTypeCompletionHandler(@NInt long entityType,
            @ObjCBlock(name = "call_requestAccessForEntityTypeCompletionHandler") Block_requestAccessForEntityTypeCompletionHandler completionHandler);

    /**
     * Fetch a unified contact with a given identifier.
     * <p>
     * Due to unification the returned contact may have a different identifier. To fetch a batch of contacts by identifiers use [CNContact predicateForContactsWithIdentifiers:].
     *
     * @param identifier The identifier of the contact to fetch.
     * @param keys       The properties to fetch into the returned CNContact object. Should only fetch the properties that will be used. Can combine contact keys and contact key descriptors.
     * @param error      If an error occurs, contains error information.
     * @return The unified contact matching or linked to the identifier. If no contact with the given identifier is found, nil is returned and error is set to CNErrorCodeRecordDoesNotExist.
     */
    @Generated
    @Selector("unifiedContactWithIdentifier:keysToFetch:error:")
    public native CNContact unifiedContactWithIdentifierKeysToFetchError(String identifier, NSArray<?> keys,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Fetch all unified contacts matching a given predicate.
     * <p>
     * Use only predicates from CNContact+Predicates.h. Compound predicates are not supported. Due to unification the returned contacts may have a different identifier.
     * <p>
     * [@note] To fetch all contacts use enumerateContactsWithFetchRequest:error:usingBlock:.
     *
     * @param predicate The predicate to match against.
     * @param keys      The properties to fetch into the returned CNContact objects. Should only fetch the properties that will be used. Can combine contact keys and contact key descriptors.
     * @param error     If an error occurs, contains error information.
     * @return An array of CNContact objects matching the predicate. If no matches are found, an empty array is returned. If an error occurs, nil is returned.
     */
    @Generated
    @Selector("unifiedContactsMatchingPredicate:keysToFetch:error:")
    public native NSArray<? extends CNContact> unifiedContactsMatchingPredicateKeysToFetchError(NSPredicate predicate,
            NSArray<?> keys, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateContactsWithFetchRequestErrorUsingBlock {
        @Generated
        void call_enumerateContactsWithFetchRequestErrorUsingBlock(CNContact contact, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessForEntityTypeCompletionHandler {
        @Generated
        void call_requestAccessForEntityTypeCompletionHandler(boolean granted, NSError error);
    }

    /**
     * The current history token.
     * <p>
     * Retrieve the current history token. If you are fetching contacts or change history events, you should use the token on the @c CNFetchResult instead.
     */
    @Generated
    @Selector("currentHistoryToken")
    public native NSData currentHistoryToken();

    /**
     * Enumerate a change history fetch request.
     * <p>
     * Executes the given fetch request and returns an enumerator for the results.
     * This may prevent all events from being loaded into memory at once.
     * <p>
     * An exception may be thrown if an error occurs during enumeration.
     *
     * @param request A description of the events to fetch.
     * @param error   If the fetch fails, contains an @c NSError object with more information.
     * @return An enumerator of the events matching the result, or @c nil if there was an error.
     */
    @Generated
    @Selector("enumeratorForChangeHistoryFetchRequest:error:")
    public native CNFetchResult<NSEnumerator<CNChangeHistoryEvent>> enumeratorForChangeHistoryFetchRequestError(
            CNChangeHistoryFetchRequest request, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Enumerate a contact fetch request.
     * <p>
     * Executes the given fetch request and returns an enumerator for the results.
     * This may prevent all records from being loaded into memory at once.
     * <p>
     * An exception may be thrown if an error occurs during enumeration.
     *
     * @param request A description of the records to fetch.
     * @param error   If the fetch fails, contains an @c NSError object with more information.
     * @return An enumerator of the records matching the result, or @c nil if there was an error.
     */
    @Generated
    @Selector("enumeratorForContactFetchRequest:error:")
    public native CNFetchResult<NSEnumerator<CNContact>> enumeratorForContactFetchRequestError(
            CNContactFetchRequest request, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
