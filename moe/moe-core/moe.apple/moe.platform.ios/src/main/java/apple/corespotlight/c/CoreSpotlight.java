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

package apple.corespotlight.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreSpotlight")
@Runtime(CRuntime.class)
public final class CoreSpotlight {
    static {
        NatJ.register();
    }

    @Generated
    private CoreSpotlight() {
    }

    /**
     * When opening a document from Spotlight, the application's application:willContinueUserActivityWithType:
     * method will get called with CSSearchableItemActionType, followed by  application:continueUserActivity:restorationHandler:
     * with an NSUserActivity where the userInfo dictionary has a key value pair where CSSearchableItemActivityIdentifier is the key
     * and the value is the uniqueIdentifier used when creating the item.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSSearchableItemActionType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSSearchableItemActivityIdentifier();

    /**
     * When continuing a query from Spotlight, the application's -application:willContinueUserActivityWithType:
     * method will get called with CSQueryContinuationActionType, followed by -application:continueUserActivity:restorationHandler:
     * with an NSUserActivity where the userInfo dictionary has a key value pair with CSSearchQueryString as the key
     * and the value is the string the application should use when performing its query.
     * The application should declare that it supports the query continuation by adding the CoreSpotlightContinuation key to its Info.plist:
     *
     * <key>CoreSpotlightContinuation</key>
     * <true/>
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSQueryContinuationActionType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSSearchQueryString();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSIndexErrorDomain();

    /**
     * Well-known mailbox identifiers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxInbox();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxDrafts();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxSent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxJunk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxTrash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSMailboxArchive();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSSearchQueryErrorDomain();

    /**
     * ! Project version number for CoreSpotlight.
     */
    @Generated
    @CVariable()
    public static native double CoreSpotlightVersionNumber();

    /**
     * ! Project version string for CoreSpotlight.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr CoreSpotlightVersionString();

    /**
     * For custom actions on iOS, the userInfo dictionary also has another key value pair where CSActionIdentifier is the key
     * and the value is the action tapped in the UI based on what was indexed by the app.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String CSActionIdentifier();
}
