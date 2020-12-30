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

package apple.eventkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * @class       EKEventStore
 * @abstract    The EKEventStore class provides an interface for accessing and manipulating calendar events and reminders.
 * @discussion  The EKEventStore class is the main point of contact for accessing Calendar data. You must
 *              create a EKEventStore object in order to retrieve/add/delete events or reminders from the Calendar database.
 * 
 *              Events, Reminders, and Calendar objects retrieved from an event store cannot be used with any other event
 *              store. It is generally best to hold onto a long-lived instance of an event store, most
 *              likely as a singleton instance in your application.
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEventStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEventStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEventStore alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @method     authorizationStatusForEntityType:
     * @discussion Returns the authorization status for the given entity type
     */
    @Generated
    @Selector("authorizationStatusForEntityType:")
    @NInt
    public static native long authorizationStatusForEntityType(@NUInt long entityType);

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
     * @method     calendarItemWithIdentifier:
     * @abstract   Returns either a reminder or the first occurrence of an event.
     */
    @Generated
    @Selector("calendarItemWithIdentifier:")
    public native EKCalendarItem calendarItemWithIdentifier(String identifier);

    /**
     * @method     calendarItemsWithExternalIdentifier:
     * @abstract   Returns either matching reminders or the first occurrences of any events matching
     *             the given external identifier.
     * @discussion This method returns a set of EKEvents or EKReminders with the given external identifier.
     *             Due to reasons discussed in -[EKCalendarItem calendarItemExternalIdentifier], there may be
     *             more than one matching calendar item.
     * 
     * @param      externalIdentifier  The value obtained from EKCalendarItem's
     *             calendarItemExternalIdentifier property
     * @result     An unsorted array of EKCalendarItem instances
     */
    @Generated
    @Selector("calendarItemsWithExternalIdentifier:")
    public native NSArray<? extends EKCalendarItem> calendarItemsWithExternalIdentifier(String externalIdentifier);

    /**
     * @method     calendarWithIdentifier:
     * @abstract   Returns a calendar with a specified identifier.
     */
    @Generated
    @Selector("calendarWithIdentifier:")
    public native EKCalendar calendarWithIdentifier(String identifier);

    /**
     * @method     calendars
     * @abstract   While this returns an array, the calendars are unordered. This call is deprecated
     *              and only returns calendars that support events. If you want reminder calendars
     *              you should use calendarsForEntityType:
     */
    @Generated
    @Deprecated
    @Selector("calendars")
    public native NSArray<? extends EKCalendar> calendars();

    /**
     * @method     calendarsForEntityType
     * @abstract   Returns calendars that support a given entity type (reminders, events)
     */
    @Generated
    @Selector("calendarsForEntityType:")
    public native NSArray<? extends EKCalendar> calendarsForEntityType(@NUInt long entityType);

    /**
     * @method     cancelFetchRequest:
     * @discussion Given a value returned from fetchRemindersMatchingPredicate, this method can be used to
     *             cancel the request. Once called, the completion block specified in fetchReminders... will
     *             not be called.
     */
    @Generated
    @Selector("cancelFetchRequest:")
    public native void cancelFetchRequest(@Mapped(ObjCObjectMapper.class) Object fetchIdentifier);

    /**
     * @method     commit:
     * @abstract   Commits pending changes to the database.
     * @discussion If you use saveCalendar/saveEvent/removeCalendar/removeEvent, etc. and you pass NO to their
     *             parameter, you are batching changes for a later commit. This method does that commit. This
     *             allows you to save the database only once for many additions or changes.  If you pass
     *             YES to methods' commit parameter, then you don't need to call this method.
     * 
     *             This method will return YES as long as nothing went awry, even if nothing was actually
     *             committed. If it returns NO, error should contain the reason it became unhappy.
     * 
     *             On WatchOS, modifying the database is not supported.
     */
    @Generated
    @Selector("commit:")
    public native boolean commit(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @property   defaultCalendarForNewEvents
     * @abstract   Returns the calendar that events should be added to by default.
     * @discussion This may be nil if there is no default calendar for new events.
     */
    @Generated
    @Selector("defaultCalendarForNewEvents")
    public native EKCalendar defaultCalendarForNewEvents();

    /**
     * @method     defaultCalendarForNewReminders
     * @abstract   Returns the calendar that reminders should be added to by default.
     * @discussion This may be nil if there is no default calendar for new reminders.
     */
    @Generated
    @Selector("defaultCalendarForNewReminders")
    public native EKCalendar defaultCalendarForNewReminders();

    /**
     * @method     enumerateEventsMatchingPredicate:usingBlock:
     * @abstract   Searches for events that match the given predicate.
     * @discussion This call executes a search for the events indicated by the predicate passed to it, calling
     *             the block specified in the callback parameter for each event. It only includes events which 
     *             have been committed (e.g. those saved using saveEvent:commit:NO are not included until commit: is called.)
     * 
     *             This method is synchronous. If you want async behavior, you should either use dispatch_async or
     *             NSOperation to run the query someplace other than the main thread.
     * 
     * @param      predicate   The predicate to invoke. If this predicate was not created with the predicate
     *                         creation functions in this class, an exception is raised.
     * @param      block       The block to call for each event. Your block should return YES in the stop
     *                         parameter to stop iterating.
     */
    @Generated
    @Selector("enumerateEventsMatchingPredicate:usingBlock:")
    public native void enumerateEventsMatchingPredicateUsingBlock(NSPredicate predicate,
            @ObjCBlock(name = "call_enumerateEventsMatchingPredicateUsingBlock") Block_enumerateEventsMatchingPredicateUsingBlock block);

    /**
     * @property   eventStoreIdentifier
     * @abstract   Returns a unique identifier string representing this calendar store.
     */
    @Generated
    @Selector("eventStoreIdentifier")
    public native String eventStoreIdentifier();

    /**
     * @method     eventWithIdentifier:
     * @abstract   Returns the first occurrence of an event matching the given event identifier.
     * 
     * @param      identifier   The eventIdentifier to search for.
     * @result     An EKEvent object, or nil if not found.
     */
    @Generated
    @Selector("eventWithIdentifier:")
    public native EKEvent eventWithIdentifier(String identifier);

    /**
     * @method     eventsMatchingPredicate:
     * @abstract   Searches for events that match the given predicate.
     * @discussion This call executes a search for the events indicated by the predicate passed to it.
     *             It only includes events which have been committed (e.g. those saved using 
     *             saveEvent:commit:NO are not included until commit: is called.)
     * 
     *             It is synchronous. If you want async behavior, you should either use dispatch_async or
     *             NSOperation to run the query someplace other than the main thread, and then funnel the
     *             array back to the main thread.
     * 
     * @param      predicate   The predicate to invoke. If this predicate was not created with the predicate
     *                         creation functions in this class, an exception is raised.
     * @result     An array of EKEvent objects, or nil. There is no guaranteed order to the events.
     */
    @Generated
    @Selector("eventsMatchingPredicate:")
    public native NSArray<? extends EKEvent> eventsMatchingPredicate(NSPredicate predicate);

    /**
     * @method     fetchRemindersMatchingPredicate:completion:
     * @abstract   Fetches reminders asynchronously.
     * @discussion This method fetches reminders asynchronously and returns a value which can be
     *             used in cancelFetchRequest: to cancel the request later if desired. The completion
     *             block is called with an array of reminders that match the given predicate (or potentially nil).
     *             This only includes reminders which have been committed (e.g. those saved using 
     *             saveReminder:commit:NO are not included until commit: is called.)
     */
    @Generated
    @Selector("fetchRemindersMatchingPredicate:completion:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fetchRemindersMatchingPredicateCompletion(NSPredicate predicate,
            @ObjCBlock(name = "call_fetchRemindersMatchingPredicateCompletion") Block_fetchRemindersMatchingPredicateCompletion completion);

    /**
     * @method     init
     */
    @Generated
    @Selector("init")
    public native EKEventStore init();

    /**
     * @method     predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:
     * @abstract   Fetch completed reminders in a set of calendars.
     * @discussion You can use this method to search for reminders completed between a range of dates.
     *             You can pass nil for start date to find all reminders completed before endDate.
     *             You can pass nil for both start and end date to get all completed reminders
     *             in the specified calendars.
     *             You can pass nil for calendars to fetch from all available calendars.
     */
    @Generated
    @Selector("predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
    public native NSPredicate predicateForCompletedRemindersWithCompletionDateStartingEndingCalendars(NSDate startDate,
            NSDate endDate, NSArray<? extends EKCalendar> calendars);

    /**
     * @method     predicateForEventsWithStartDate:endDate:calendars:
     * @abstract   Creates a predicate for use with eventsMatchingPredicate or enumerateEventsMatchingPredicate:usingBlock:.
     * @discussion Creates a simple query predicate to search for events within a certain date range. At present,
     *             this will return events in the default time zone ([NSTimeZone defaultTimeZone]).
     * 
     *             For performance reasons, this method will only return events within a four year timespan.
     *             If the date range between the startDate and endDate is greater than four years, then it will be shortened 
     *             to the first four years.
     * 
     * @param      startDate   The start date.
     * @param      endDate     The end date.
     * @param      calendars   The calendars to search for events in, or nil to search all calendars.
     */
    @Generated
    @Selector("predicateForEventsWithStartDate:endDate:calendars:")
    public native NSPredicate predicateForEventsWithStartDateEndDateCalendars(NSDate startDate, NSDate endDate,
            NSArray<? extends EKCalendar> calendars);

    /**
     * @method     predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:
     * @abstract   Fetch incomplete reminders in a set of calendars.
     * @discussion You can use this method to search for incomplete reminders due in a range.
     *             You can pass nil for start date to find all reminders due before endDate.
     *             You can pass nil for both start and end date to get all incomplete reminders
     *             in the specified calendars.
     *             You can pass nil for calendars to fetch from all available calendars.
     */
    @Generated
    @Selector("predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
    public native NSPredicate predicateForIncompleteRemindersWithDueDateStartingEndingCalendars(NSDate startDate,
            NSDate endDate, NSArray<? extends EKCalendar> calendars);

    /**
     * @method     predicateForRemindersInCalendars:
     * @abstract   Fetch all reminders in a set of calendars.
     * @discussion You can pass nil for calendars to fetch from all available calendars.
     */
    @Generated
    @Selector("predicateForRemindersInCalendars:")
    public native NSPredicate predicateForRemindersInCalendars(NSArray<? extends EKCalendar> calendars);

    /**
     * @method     refreshSourcesIfNecessary
     * @abstract   Cause a sync to potentially occur taking into account the necessity of it.
     * @discussion You can call this method to pull new data from remote sources.  
     *             This only updates the event store's data.  If you want to update your objects after 
     *             refreshing the sources, you should call refresh on each of them afterwards.
     *             On iOS, this sync only occurs if deemed necessary.  
     *             On OS X, this will occur regardless of necessity, but may change in a future release to match the iOS behavior.
     *             On WatchOS, initiating sync is not available. Sync will occur automatically with the paired iOS device.
     */
    @Generated
    @Selector("refreshSourcesIfNecessary")
    public native void refreshSourcesIfNecessary();

    /**
     * @method     removeCalendar:commit:error:
     * @abstract   Removes a calendar from the database.
     * @discussion This method attempts to delete the given calendar from the calendar database. It
     *             returns YES if successful and NO otherwise. Passing a calendar fetched from
     *             another EKEventStore instance into this function will raise an exception.
     * 
     *             If the calendar supports multiple entity types (allowedEntityTypes), but the user has 
     *             not granted you access to all those entity types, then we will delete all of the entity types 
     *             for which you have access and remove that entity type from the allowedEntityTypes.
     *             For example: If a calendar supports both events and reminders, but you only have access to reminders,
     *             we will delete all the reminders and make the calendar only support events.
     * 
     *             If you have access to all of its allowedEntityTypes, then it will delete the calendar and
     *             all of the events and reminders in the calendar.
     * 
     *             On WatchOS, modifying the database is not supported.
     * 
     * @param      calendar    The calendar to delete.
     * @param      commit      Pass YES to cause the database to save. You can pass NO to batch multiple
     *                         changes and then call commit: to save them all at once.
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("removeCalendar:commit:error:")
    public native boolean removeCalendarCommitError(EKCalendar calendar, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeEvent:span:commit:error:")
    public native boolean removeEventSpanCommitError(EKEvent event, @NInt long span, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     removeEvent:span:error:
     * @abstract   Removes an event from the calendar store.
     * @discussion This method attempts to remove the event from the calendar database. It returns YES if
     *             successful and NO otherwise. It's possible for this method to return NO, and error
     *             will be set to nil. This occurs if the event wasn't ever added and didn't need removing. This
     *             means the correct way to detect failure is a result of NO and a non-nil error parameter.
     *             Passing an event from another CalendarStore into this function will raise an exception. After
     *             an event is removed, it is no longer tied to this calendar store, and all data in the event
     *             is cleared except for the eventIdentifier.
     * 
     *             On WatchOS, modifying the database is not supported.
     * 
     * @param      event       The event to save.
     * @param      span        The span to use (this event, or this and future events).
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("removeEvent:span:error:")
    public native boolean removeEventSpanError(EKEvent event, @NInt long span,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     removeReminder:commit:error:
     * @abstract   Removes a reminder from the event store.
     * @discussion This method attempts to remove the reminder from the event store database. It returns YES if
     *             successful and NO otherwise. Passing a reminder from another EKEventStore into this function
     *             will raise an exception. After a reminder is removed, it is no longer tied to this event store.
     * 
     *             On WatchOS, modifying the database is not supported.
     * 
     * @param      reminder    The reminder to save.
     * @param      commit      Whether to save to the database or not. Pass NO to batch changes together and
     *                         commit with [EKEventStore commit:].
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("removeReminder:commit:error:")
    public native boolean removeReminderCommitError(EKReminder reminder, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     requestAccessToEntityType:completion:
     * @discussion Users are able to grant or deny access to event and reminder data on a per-app basis. To request access to
     *             event and/or reminder data, call -requestAccessToEntityType:completion:. This will not block the app while
     *             the user is being asked to grant or deny access.
     * 
     *             Until access has been granted for an entity type, the event store will not contain any calendars for that
     *             entity type, and any attempt to save will fail. The user will only be prompted the first time access is
     *             requested; any subsequent instantiations of EKEventStore will use the existing permissions. When the user
     *             taps to grant or deny access, the completion handler will be called on an arbitrary queue.
     */
    @Generated
    @Selector("requestAccessToEntityType:completion:")
    public native void requestAccessToEntityTypeCompletion(@NUInt long entityType,
            @ObjCBlock(name = "call_requestAccessToEntityTypeCompletion") Block_requestAccessToEntityTypeCompletion completion);

    /**
     * @method     reset
     * @abstract   Resets the event store.
     * @discussion You can use this method to forget ALL changes made to the event store (all additions, all
     *             fetched objects, etc.). It essentially is as if you released the store and then created a
     *             new one. It brings it back to its initial state. All objects ever created/fetched, etc.
     *             using this store are no longer connected to it and are considered invalid.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * @method     saveCalendar:commit:error:
     * @abstract   Saves changes to a calendar, or adds a new calendar to the database.
     * @discussion This method attempts to save the given calendar to the calendar database. It
     *             returns YES if successful and NO otherwise. Passing a calendar fetched from
     *             another EKEventStore instance into this function will raise an exception.
     *             On WatchOS, saving changes is not supported.
     * 
     * @param      calendar    The calendar to save.
     * @param      commit      Pass YES to cause the database to save. You can pass NO to save multiple
     *                         calendars and then call commit: to save them all at once.
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("saveCalendar:commit:error:")
    public native boolean saveCalendarCommitError(EKCalendar calendar, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These variants of the above allow you to batch changes by passing NO to commit. You can commit
     * all changes later with [EKEventStore commit:]
     */
    @Generated
    @Selector("saveEvent:span:commit:error:")
    public native boolean saveEventSpanCommitError(EKEvent event, @NInt long span, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     saveEvent:span:error:
     * @abstract   Saves changes to an event permanently.
     * @discussion This method attempts to save the event to the calendar database. It returns YES if
     *             successful and NO otherwise. It's possible for this method to return NO, and error
     *             will be set to nil. This occurs if the event wasn't dirty and didn't need saving. This
     *             means the correct way to detect failure is a result of NO and a non-nil error parameter.
     *             Passing an event fetched from another EKEventStore instance into this function will
     *             raise an exception.
     * 
     *             After an event is successfully saved, it is also put into sync with the database, meaning
     *             that all fields you did not change will be updated to the latest values. If you save the
     *             event, but it was deleted by a different store/process, you will effectively recreate the
     *             event as a new event.
     * 
     *             On WatchOS, saving changes is not supported.
     * 
     * @param      event       The event to save.
     * @param      span        The span to use (this event, or this and future events).
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("saveEvent:span:error:")
    public native boolean saveEventSpanError(EKEvent event, @NInt long span,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     saveReminder:commit:error:
     * @abstract   Saves changes to a reminder.
     * @discussion This method attempts to save the reminder to the event store database. It returns YES if
     *             successful and NO otherwise. Passing a reminder fetched from another EKEventStore instance
     *             into this function will raise an exception.
     * 
     *             After a reminder is successfully saved, its fields are updated to the latest values in
     *             the database.
     * 
     *             On WatchOS, saving changes is not supported.
     * 
     * @param      reminder    The reminder to save.
     * @param      commit      Whether to save to the database or not. Pass NO to batch changes together and
     *                         commit with [EKEventStore commit:].
     * @param      error       If an error occurs, this will contain a valid NSError object on exit.
     */
    @Generated
    @Selector("saveReminder:commit:error:")
    public native boolean saveReminderCommitError(EKReminder reminder, boolean commit,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @method     sourceWithIdentifier:
     * @abstract   Returns a source with a specified identifier.
     */
    @Generated
    @Selector("sourceWithIdentifier:")
    public native EKSource sourceWithIdentifier(String identifier);

    /**
     * @property   sources
     * @abstract   Returns an unordered array of sources.
     */
    @Generated
    @Selector("sources")
    public native NSArray<? extends EKSource> sources();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEventsMatchingPredicateUsingBlock {
        @Generated
        void call_enumerateEventsMatchingPredicateUsingBlock(EKEvent event, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRemindersMatchingPredicateCompletion {
        @Generated
        void call_fetchRemindersMatchingPredicateCompletion(NSArray<? extends EKReminder> reminders);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessToEntityTypeCompletion {
        @Generated
        void call_requestAccessToEntityTypeCompletion(boolean granted, NSError error);
    }

    /**
     * @property   delegateSources
     * @abstract   Returns an unordered array of sources for all available delegates.
     * @discussion By default, delegates are not included in an event store's sources. To work with delegates,
     *             you can create a new event store and pass in the sources, including sources returned from this
     *             method, that you're interested in.
     * @see        initWithSources:
     */
    @Generated
    @Selector("delegateSources")
    public native NSArray<? extends EKSource> delegateSources();
}
