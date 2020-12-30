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

/**
 * The system has heuristics to improve battery life, performance, and responsiveness of applications for the benefit of the user. This API can be used to give hints to the system that your application has special requirements. In response to creating one of these activities, the system will disable some or all of the heuristics so your application can finish quickly while still providing responsive behavior if the user needs it.
 * 
 * These activities can be used when your application is performing a long-running operation. If the activity can take different amounts of time (for example, calculating the next move in a chess game), it should use this API. This will ensure correct behavior when the amount of data or the capabilities of the user's computer varies. You should put your activity into one of two major categories:
 * 
 * User initiated: These are finite length activities that the user has explicitly started. Examples include exporting or downloading a user specified file.
 * 
 * Background: These are finite length activities that are part of the normal operation of your application but are not explicitly started by the user. Examples include autosaving, indexing, and automatic downloading of files.
 * 
 * In addition, if your application requires high priority IO, you can include the 'NSActivityLatencyCritical' flag (using a bitwise or). This should be reserved for activities like audio or video recording.
 * 
 * If your activity takes place synchronously inside an event callback on the main thread, you do not need to use this API.
 * 
 * Be aware that failing to end these activities for an extended period of time can have significant negative impacts to the performance of your user's computer, so be sure to use only the minimum amount of time required. User preferences may override your application’s request.
 * 
 * This API can also be used to control auto termination or sudden termination. 
 * 
 *    id activity = [NSProcessInfo.processInfo beginActivityWithOptions:NSActivityAutomaticTerminationDisabled reason:@"Good Reason"];
 *    // work
 *    [NSProcessInfo.processInfo endActivity:activity];
 * 
 * is equivalent to:
 * 
 *    [NSProcessInfo.processInfo disableAutomaticTermination:@"Good Reason"];
 *    // work
 *    [NSProcessInfo.processInfo enableAutomaticTermination:@"Good Reason"]
 * 
 * Since this API returns an object, it may be easier to pair begins and ends. If the object is deallocated before the -endActivity: call, the activity will be automatically ended.
 * 
 * This API also provides a mechanism to disable system-wide idle sleep and display idle sleep. These can have a large impact on the user experience, so be sure not to forget to end activities that disable sleep (including NSActivityUserInitiated).
 */
@Generated
public final class NSActivityOptions {
    /**
     * Used for activities that require the screen to stay powered on.
     */
    @Generated public static final long IdleDisplaySleepDisabled = 0x0000010000000000L;
    /**
     * Used for activities that require the computer to not idle sleep. This is included in NSActivityUserInitiated.
     */
    @Generated public static final long IdleSystemSleepDisabled = 0x0000000000100000L;
    /**
     * Prevents sudden termination. This is included in NSActivityUserInitiated.
     */
    @Generated public static final long SuddenTerminationDisabled = 0x0000000000004000L;
    /**
     * Prevents automatic termination. This is included in NSActivityUserInitiated.
     */
    @Generated public static final long AutomaticTerminationDisabled = 0x0000000000008000L;
    /**
     * App is performing a user-requested action.
     */
    @Generated public static final long UserInitiated = 0x0000000000FFFFFFL;
    /**
     * App is performing a user-requested action.
     */
    @Generated public static final long UserInitiatedAllowingIdleSystemSleep = 0x0000000000EFFFFFL;
    /**
     * App has initiated some kind of work, but not as the direct result of user request.
     */
    @Generated public static final long Background = 0x00000000000000FFL;
    /**
     * Used for activities that require the highest amount of timer and I/O precision available. Very few applications should need to use this constant.
     */
    @Generated public static final long LatencyCritical = 0x000000FF00000000L;

    @Generated
    private NSActivityOptions() {
    }
}
