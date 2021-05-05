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

package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSPersistentStoreUbiquitousTransitionTypeAccountAdded
 * This value indicates that a new iCloud account is available, and the persistent store in use will / did transition to the new account.
 * It is only possible to discern this state when the application is running, and therefore this transition type will only be posted if the account changes while the application is running or in the background.
 * 
 * NSPersistentStoreUbiquitousTransitionTypeAccountRemoved
 * This value indicates that no iCloud account is available, and the persistent store in use will / did transition to the “local” store.
 * It is only possible to discern this state when the application is running, and therefore this transition type will only be posted if the account is removed while the application is running or in the background.
 * 
 * NSPersistentStoreUbiquitousTransitionTypeContentRemoved
 * This value indicates that the user has wiped the contents of the iCloud account, usually using Delete All from Documents & Data in Settings. The Core Data integration will transition to an empty store file as a result of this event.
 * 
 * NSPersistentStoreUbiquitousTransitionTypeInitialImportCompleted
 * This value indicates that the Core Data integration has finished building a store file that is consistent with the contents of the iCloud account, and is readyto replace the fallback store with that file.
 */
@Generated
public final class NSPersistentStoreUbiquitousTransitionType {
    @Generated @NUInt public static final long AccountAdded = 0x0000000000000001L;
    @Generated @NUInt public static final long AccountRemoved = 0x0000000000000002L;
    @Generated @NUInt public static final long ContentRemoved = 0x0000000000000003L;
    @Generated @NUInt public static final long InitialImportCompleted = 0x0000000000000004L;

    @Generated
    private NSPersistentStoreUbiquitousTransitionType() {
    }
}
