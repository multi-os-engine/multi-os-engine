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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for use with -addObserver:forKeyPath:options:context: and
 * -addObserver:toObjectsAtIndexes:forKeyPath:options:context:.
 */
@Generated
public final class NSKeyValueObservingOptions {
    /**
     * Whether the change dictionaries sent in notifications should contain NSKeyValueChangeNewKey and
     * NSKeyValueChangeOldKey entries, respectively.
     */
    @Generated @NUInt public static final long New = 0x0000000000000001L;
    /**
     * Whether the change dictionaries sent in notifications should contain NSKeyValueChangeNewKey and
     * NSKeyValueChangeOldKey entries, respectively.
     */
    @Generated @NUInt public static final long Old = 0x0000000000000002L;
    /**
     * Whether a notification should be sent to the observer immediately, before the observer registration method even
     * returns. The change dictionary in the notification will always contain an NSKeyValueChangeNewKey entry if
     * NSKeyValueObservingOptionNew is also specified but will never contain an NSKeyValueChangeOldKey entry. (In an
     * initial notification the current value of the observed property may be old, but it's new to the observer.) You
     * can use this option instead of explicitly invoking, at the same time, code that is also invoked by the observer's
     * -observeValueForKeyPath:ofObject:change:context: method. When this option is used with
     * -addObserver:toObjectsAtIndexes:forKeyPath:options:context: a notification will be sent for each indexed object
     * to which the observer is being added.
     */
    @Generated @NUInt public static final long Initial = 0x0000000000000004L;
    /**
     * Whether separate notifications should be sent to the observer before and after each change, instead of a single
     * notification after the change. The change dictionary in a notification sent before a change always contains an
     * NSKeyValueChangeNotificationIsPriorKey entry whose value is [NSNumber numberWithBool:YES], but never contains an
     * NSKeyValueChangeNewKey entry. You can use this option when the observer's own KVO-compliance requires it to
     * invoke one of the -willChange... methods for one of its own properties, and the value of that property depends on
     * the value of the observed object's property. (In that situation it's too late to easily invoke -willChange...
     * properly in response to receiving an -observeValueForKeyPath:ofObject:change:context: message after the change.)
     * <p>
     * When this option is specified, the change dictionary in a notification sent after a change contains the same
     * entries that it would contain if this option were not specified, except for ordered unique to-many relationships
     * represented by NSOrderedSets. For those, for NSKeyValueChangeInsertion and NSKeyValueChangeReplacement changes,
     * the change dictionary for a will-change notification contains an NSKeyValueChangeIndexesKey (and
     * NSKeyValueChangeOldKey in the case of Replacement where the NSKeyValueObservingOptionOld option was specified at
     * registration time) which give the indexes (and objects) which *may* be changed by the operation. The second
     * notification, after the change, contains entries reporting what did actually change. For NSKeyValueChangeRemoval
     * changes, removals by index are precise.
     */
    @Generated @NUInt public static final long Prior = 0x0000000000000008L;

    @Generated
    private NSKeyValueObservingOptions() {
    }
}
