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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * EKEventStore
 * 
 * The EKEventStore class provides an interface for accessing and manipulating calendar events and reminders.
 * 
 * The EKEventStore class is the main point of contact for accessing Calendar data. You must
 * create a EKEventStore object in order to retrieve/add/delete events or reminders from the Calendar database.
 * 
 * Events, Reminders, and Calendar objects retrieved from an event store cannot be used with any other event
 * store. It is generally best to hold onto a long-lived instance of an event store, most
 * likely as a singleton instance in your application.
 * 
 * API-Since: 4.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKEventStore allocWithZone(VoidPtr zone);

    /**
     * authorizationStatusForEntityType:
     * 
     * Returns the authorization status for the given entity type
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("authorizationStatusForEntityType:")
    @NInt
    public static native long authorizationStatusForEntityType(@NUInt long entityType);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native EKEventStore new_objc();

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
     * calendarItemWithIdentifier:
     * 
     * Returns either a reminder or the first occurrence of an event.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("calendarItemWithIdentifier:")
    public native EKCalendarItem calendarItemWithIdentifier(@NotNull String identifier);

    /**
     * calendarItemsWithExternalIdentifier:
     * 
     * Returns either matching reminders or the first occurrences of any events matching
     * the given external identifier.
     * 
     * This method returns a set of EKEvents or EKReminders with the given external identifier.
     * Due to reasons discussed in -[EKCalendarItem calendarItemExternalIdentifier], there may be
     * more than one matching calendar item.
     * 
     * @param externalIdentifier The value obtained from EKCalendarItem's
     *                           calendarItemExternalIdentifier property
     * @return An unsorted array of EKCalendarItem instances
     * 
     *         API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("calendarItemsWithExternalIdentifier:")
    public native NSArray<? extends EKCalendarItem> calendarItemsWithExternalIdentifier(
            @NotNull String externalIdentifier);

    /**
     * calendarWithIdentifier:
     * 
     * Returns a calendar with a specified identifier.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("calendarWithIdentifier:")
    public native EKCalendar calendarWithIdentifier(@NotNull String identifier);

    /**
     * calendars
     * 
     * While this returns an array, the calendars are unordered. This call is deprecated
     * and only returns calendars that support events. If you want reminder calendars
     * you should use calendarsForEntityType:
     * 
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("calendars")
    public native NSArray<? extends EKCalendar> calendars();

    /**
     * calendarsForEntityType
     * 
     * Returns calendars that support a given entity type (reminders, events)
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("calendarsForEntityType:")
    public native NSArray<? extends EKCalendar> calendarsForEntityType(@NUInt long entityType);

    /**
     * cancelFetchRequest:
     * 
     * Given a value returned from fetchRemindersMatchingPredicate, this method can be used to
     * cancel the request. Once called, the completion block specified in fetchReminders... will
     * not be called.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("cancelFetchRequest:")
    public native void cancelFetchRequest(@NotNull @Mapped(ObjCObjectMapper.class) Object fetchIdentifier);

    /**
     * commit:
     * 
     * Commits pending changes to the database.
     * 
     * If you use saveCalendar/saveEvent/removeCalendar/removeEvent, etc. and you pass NO to their
     * parameter, you are batching changes for a later commit. This method does that commit. This
     * allows you to save the database only once for many additions or changes. If you pass
     * YES to methods' commit parameter, then you don't need to call this method.
     * 
     * This method will return YES as long as nothing went awry, even if nothing was actually
     * committed. If it returns NO, error should contain the reason it became unhappy.
     * 
     * On WatchOS, modifying the database is not supported.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("commit:")
    public native boolean commit(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] defaultCalendarForNewEvents
     * 
     * Returns the calendar that events should be added to by default.
     * 
     * This may be nil if there is no default calendar for new events.
     */
    @Nullable
    @Generated
    @Selector("defaultCalendarForNewEvents")
    public native EKCalendar defaultCalendarForNewEvents();

    /**
     * defaultCalendarForNewReminders
     * 
     * Returns the calendar that reminders should be added to by default.
     * 
     * This may be nil if there is no default calendar for new reminders.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("defaultCalendarForNewReminders")
    public native EKCalendar defaultCalendarForNewReminders();

    /**
     * enumerateEventsMatchingPredicate:usingBlock:
     * 
     * Searches for events that match the given predicate.
     * 
     * This call executes a search for the events indicated by the predicate passed to it, calling
     * the block specified in the callback parameter for each event.
     * 
     * This method is synchronous. If you want async behavior, you should either use dispatch_async or
     * NSOperation to run the query someplace other than the main thread.
     * 
     * @param predicate The predicate to invoke. If this predicate was not created with the predicate
     *                  creation functions in this class, an exception is raised.
     * @param block     The block to call for each event. Your block should return YES in the stop
     *                  parameter to stop iterating.
     */
    @Generated
    @Selector("enumerateEventsMatchingPredicate:usingBlock:")
    public native void enumerateEventsMatchingPredicateUsingBlock(@NotNull NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_enumerateEventsMatchingPredicateUsingBlock") Block_enumerateEventsMatchingPredicateUsingBlock block);

    /**
     * [@property] eventStoreIdentifier
     * 
     * Returns a unique identifier string representing this calendar store.
     */
    @NotNull
    @Generated
    @Selector("eventStoreIdentifier")
    public native String eventStoreIdentifier();

    /**
     * eventWithIdentifier:
     * 
     * Returns the first occurrence of an event matching the given event identifier.
     * 
     * @param identifier The eventIdentifier to search for.
     * @return An EKEvent object, or nil if not found.
     */
    @Nullable
    @Generated
    @Selector("eventWithIdentifier:")
    public native EKEvent eventWithIdentifier(@NotNull String identifier);

    /**
     * eventsMatchingPredicate:
     * 
     * Searches for events that match the given predicate.
     * 
     * This call executes a search for the events indicated by the predicate passed to it.
     * 
     * It is synchronous. If you want async behavior, you should either use dispatch_async or
     * NSOperation to run the query someplace other than the main thread, and then funnel the
     * array back to the main thread.
     * 
     * @param predicate The predicate to invoke. If this predicate was not created with the predicate
     *                  creation functions in this class, an exception is raised.
     * @return An array of EKEvent objects, or nil. There is no guaranteed order to the events.
     */
    @NotNull
    @Generated
    @Selector("eventsMatchingPredicate:")
    public native NSArray<? extends EKEvent> eventsMatchingPredicate(@NotNull NSPredicate predicate);

    /**
     * fetchRemindersMatchingPredicate:completion:
     * 
     * Fetches reminders asynchronously.
     * 
     * This method fetches reminders asynchronously and returns a value which can be
     * used in cancelFetchRequest: to cancel the request later if desired. The completion
     * block is called with an array of reminders that match the given predicate (or potentially nil).
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("fetchRemindersMatchingPredicate:completion:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object fetchRemindersMatchingPredicateCompletion(@NotNull NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_fetchRemindersMatchingPredicateCompletion") Block_fetchRemindersMatchingPredicateCompletion completion);

    /**
     * init
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("init")
    public native EKEventStore init();

    /**
     * predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:
     * 
     * Fetch completed reminders in a set of calendars.
     * 
     * You can use this method to search for reminders completed between a range of dates.
     * You can pass nil for start date to find all reminders completed before endDate.
     * You can pass nil for both start and end date to get all completed reminders
     * in the specified calendars.
     * You can pass nil for calendars to fetch from all available calendars.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
    public native NSPredicate predicateForCompletedRemindersWithCompletionDateStartingEndingCalendars(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @Nullable NSArray<? extends EKCalendar> calendars);

    /**
     * predicateForEventsWithStartDate:endDate:calendars:
     * 
     * Creates a predicate for use with eventsMatchingPredicate or enumerateEventsMatchingPredicate:usingBlock:.
     * 
     * Creates a simple query predicate to search for events within a certain date range. At present,
     * this will return events in the default time zone ([NSTimeZone defaultTimeZone]).
     * 
     * For performance reasons, this method will only return events within a four year timespan.
     * If the date range between the startDate and endDate is greater than four years, then it will be shortened
     * to the first four years.
     * 
     * @param startDate The start date.
     * @param endDate   The end date.
     * @param calendars The calendars to search for events in, or nil to search all calendars.
     */
    @NotNull
    @Generated
    @Selector("predicateForEventsWithStartDate:endDate:calendars:")
    public native NSPredicate predicateForEventsWithStartDateEndDateCalendars(@NotNull NSDate startDate,
            @NotNull NSDate endDate, @Nullable NSArray<? extends EKCalendar> calendars);

    /**
     * predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:
     * 
     * Fetch incomplete reminders in a set of calendars.
     * 
     * You can use this method to search for incomplete reminders due in a range.
     * You can pass nil for start date to find all reminders due before endDate.
     * You can pass nil for both start and end date to get all incomplete reminders
     * in the specified calendars.
     * You can pass nil for calendars to fetch from all available calendars.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
    public native NSPredicate predicateForIncompleteRemindersWithDueDateStartingEndingCalendars(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @Nullable NSArray<? extends EKCalendar> calendars);

    /**
     * predicateForRemindersInCalendars:
     * 
     * Fetch all reminders in a set of calendars.
     * 
     * You can pass nil for calendars to fetch from all available calendars.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("predicateForRemindersInCalendars:")
    public native NSPredicate predicateForRemindersInCalendars(@Nullable NSArray<? extends EKCalendar> calendars);

    /**
     * refreshSourcesIfNecessary
     * 
     * Cause a sync to potentially occur taking into account the necessity of it.
     * 
     * You can call this method to pull new data from remote sources.
     * This only updates the event store's data. If you want to update your objects after
     * refreshing the sources, you should call refresh on each of them afterwards.
     * On iOS and macOS, this sync only occurs if deemed necessary.
     * On WatchOS, initiating sync is not available. Sync will occur automatically with the paired iOS device.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("refreshSourcesIfNecessary")
    public native void refreshSourcesIfNecessary();

    /**
     * removeCalendar:commit:error:
     * 
     * Removes a calendar from the database.
     * 
     * This method attempts to delete the given calendar from the calendar database. It
     * returns YES if successful and NO otherwise. Passing a calendar fetched from
     * another EKEventStore instance into this function will raise an exception.
     * 
     * If the calendar supports multiple entity types (allowedEntityTypes), but the user has
     * not granted you access to all those entity types, then we will delete all of the entity types
     * for which you have access and remove that entity type from the allowedEntityTypes.
     * For example: If a calendar supports both events and reminders, but you only have access to reminders,
     * we will delete all the reminders and make the calendar only support events.
     * 
     * If you have access to all of its allowedEntityTypes, then it will delete the calendar and
     * all of the events and reminders in the calendar.
     * 
     * On WatchOS, modifying the database is not supported.
     * 
     * @param calendar The calendar to delete.
     * @param commit   Pass YES to cause the database to save. You can pass NO to batch multiple
     *                 changes and then call commit: to save them all at once.
     * @param error    If an error occurs, this will contain a valid NSError object on exit.
     * 
     *                 API-Since: 5.0
     */
    @Generated
    @Selector("removeCalendar:commit:error:")
    public native boolean removeCalendarCommitError(@NotNull EKCalendar calendar, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("removeEvent:span:commit:error:")
    public native boolean removeEventSpanCommitError(@NotNull EKEvent event, @NInt long span, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * removeEvent:span:error:
     * 
     * Removes an event from the calendar store.
     * 
     * This method attempts to remove the event from the calendar database. It returns YES if
     * successful and NO otherwise. It's possible for this method to return NO, and error
     * will be set to nil. This occurs if the event wasn't ever added and didn't need removing. This
     * means the correct way to detect failure is a result of NO and a non-nil error parameter.
     * Passing an event from another CalendarStore into this function will raise an exception. After
     * an event is removed, it is no longer tied to this calendar store, and all data in the event
     * is cleared except for the eventIdentifier.
     * 
     * On WatchOS, modifying the database is not supported.
     * 
     * @param event The event to save.
     * @param span  The span to use (this event, or this and future events).
     * @param error If an error occurs, this will contain a valid NSError object on exit.
     * 
     *              API-Since: 4.0
     */
    @Generated
    @Selector("removeEvent:span:error:")
    public native boolean removeEventSpanError(@NotNull EKEvent event, @NInt long span,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * removeReminder:commit:error:
     * 
     * Removes a reminder from the event store.
     * 
     * This method attempts to remove the reminder from the event store database. It returns YES if
     * successful and NO otherwise. Passing a reminder from another EKEventStore into this function
     * will raise an exception. After a reminder is removed, it is no longer tied to this event store.
     * 
     * On WatchOS, modifying the database is not supported.
     * 
     * @param reminder The reminder to save.
     * @param commit   Whether to save to the database or not. Pass NO to batch changes together and
     *                 commit with [EKEventStore commit:].
     * @param error    If an error occurs, this will contain a valid NSError object on exit.
     * 
     *                 API-Since: 6.0
     */
    @Generated
    @Selector("removeReminder:commit:error:")
    public native boolean removeReminderCommitError(@NotNull EKReminder reminder, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * requestAccessToEntityType:completion:
     * 
     * Users are able to grant or deny access to event and reminder data on a per-app basis. To request access to
     * event and/or reminder data, call -requestAccessToEntityType:completion:. This will not block the app while
     * the user is being asked to grant or deny access.
     * 
     * Until access has been granted for an entity type, the event store will not contain any calendars for that
     * entity type, and any attempt to save will fail. The user will only be prompted the first time access is
     * requested; any subsequent instantiations of EKEventStore will use the existing permissions. When the user
     * taps to grant or deny access, the completion handler will be called on an arbitrary queue.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("requestAccessToEntityType:completion:")
    public native void requestAccessToEntityTypeCompletion(@NUInt long entityType,
            @NotNull @ObjCBlock(name = "call_requestAccessToEntityTypeCompletion") Block_requestAccessToEntityTypeCompletion completion);

    /**
     * reset
     * 
     * Resets the event store.
     * 
     * You can use this method to forget ALL changes made to the event store (all additions, all
     * fetched objects, etc.). It essentially is as if you released the store and then created a
     * new one. It brings it back to its initial state. All objects ever created/fetched, etc.
     * using this store are no longer connected to it and are considered invalid.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * saveCalendar:commit:error:
     * 
     * Saves changes to a calendar, or adds a new calendar to the database.
     * 
     * This method attempts to save the given calendar to the calendar database. It
     * returns YES if successful and NO otherwise. Passing a calendar fetched from
     * another EKEventStore instance into this function will raise an exception.
     * On WatchOS, saving changes is not supported.
     * 
     * @param calendar The calendar to save.
     * @param commit   Pass YES to cause the database to save. You can pass NO to save multiple
     *                 calendars and then call commit: to save them all at once.
     * @param error    If an error occurs, this will contain a valid NSError object on exit.
     * 
     *                 API-Since: 5.0
     */
    @Generated
    @Selector("saveCalendar:commit:error:")
    public native boolean saveCalendarCommitError(@NotNull EKCalendar calendar, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These variants of the above allow you to batch changes by passing NO to commit. You can commit
     * all changes later with [EKEventStore commit:]
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("saveEvent:span:commit:error:")
    public native boolean saveEventSpanCommitError(@NotNull EKEvent event, @NInt long span, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * saveEvent:span:error:
     * 
     * Saves changes to an event permanently.
     * 
     * This method attempts to save the event to the calendar database. It returns YES if
     * successful and NO otherwise. It's possible for this method to return NO, and error
     * will be set to nil. This occurs if the event wasn't dirty and didn't need saving. This
     * means the correct way to detect failure is a result of NO and a non-nil error parameter.
     * Passing an event fetched from another EKEventStore instance into this function will
     * raise an exception.
     * 
     * After an event is successfully saved, it is also put into sync with the database, meaning
     * that all fields you did not change will be updated to the latest values. If you save the
     * event, but it was deleted by a different store/process, you will effectively recreate the
     * event as a new event.
     * 
     * On WatchOS, saving changes is not supported.
     * 
     * @param event The event to save.
     * @param span  The span to use (this event, or this and future events).
     * @param error If an error occurs, this will contain a valid NSError object on exit.
     * 
     *              API-Since: 4.0
     */
    @Generated
    @Selector("saveEvent:span:error:")
    public native boolean saveEventSpanError(@NotNull EKEvent event, @NInt long span,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * saveReminder:commit:error:
     * 
     * Saves changes to a reminder.
     * 
     * This method attempts to save the reminder to the event store database. It returns YES if
     * successful and NO otherwise. Passing a reminder fetched from another EKEventStore instance
     * into this function will raise an exception.
     * 
     * After a reminder is successfully saved, its fields are updated to the latest values in
     * the database.
     * 
     * On WatchOS, saving changes is not supported.
     * 
     * @param reminder The reminder to save.
     * @param commit   Whether to save to the database or not. Pass NO to batch changes together and
     *                 commit with [EKEventStore commit:].
     * @param error    If an error occurs, this will contain a valid NSError object on exit.
     * 
     *                 API-Since: 6.0
     */
    @Generated
    @Selector("saveReminder:commit:error:")
    public native boolean saveReminderCommitError(@NotNull EKReminder reminder, boolean commit,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * sourceWithIdentifier:
     * 
     * Returns a source with a specified identifier.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("sourceWithIdentifier:")
    public native EKSource sourceWithIdentifier(@NotNull String identifier);

    /**
     * [@property] sources
     * 
     * Returns an unordered array of sources.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("sources")
    public native NSArray<? extends EKSource> sources();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEventsMatchingPredicateUsingBlock {
        @Generated
        void call_enumerateEventsMatchingPredicateUsingBlock(@NotNull EKEvent event, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRemindersMatchingPredicateCompletion {
        @Generated
        void call_fetchRemindersMatchingPredicateCompletion(@Nullable NSArray<? extends EKReminder> reminders);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessToEntityTypeCompletion {
        @Generated
        void call_requestAccessToEntityTypeCompletion(boolean granted, @Nullable NSError error);
    }

    /**
     * [@property] delegateSources
     * 
     * Returns an unordered array of sources for all available delegates.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("delegateSources")
    public native NSArray<? extends EKSource> delegateSources();

    /**
     * initWithSources:
     * 
     * Creates a new event store that only includes items and calendars for a subset of sources.
     * 
     * @param sources The sources you want this event store to recognize. This may include delegate sources.
     * 
     *                API-Since: 16.0
     */
    @Generated
    @Selector("initWithSources:")
    public native EKEventStore initWithSources(@NotNull NSArray<? extends EKSource> sources);
}
