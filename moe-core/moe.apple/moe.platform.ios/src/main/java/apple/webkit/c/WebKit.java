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

package apple.webkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("WebKit")
@Runtime(CRuntime.class)
public final class WebKit {
    static {
        NatJ.register();
    }

    @Generated
    private WebKit() {
    }

    /**
     * [@constant] WKErrorDomain Indicates a WebKit error.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKErrorDomain();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: This API will be replaced
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierOpen();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: This API will be replaced
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierAddToReadingList();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: This API will be replaced
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierCopy();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: This API will be replaced
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierShare();

    /**
     * [@constant] WKWebsiteDataTypeDiskCache On-disk caches.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeDiskCache();

    /**
     * [@constant] WKWebsiteDataTypeMemoryCache In-memory caches.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeMemoryCache();

    /**
     * [@constant] WKWebsiteDataTypeOfflineWebApplicationCache HTML offline web application caches.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeOfflineWebApplicationCache();

    /**
     * [@constant] WKWebsiteDataTypeCookies Cookies.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeCookies();

    /**
     * [@constant] WKWebsiteDataTypeSessionStorage HTML session storage.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeSessionStorage();

    /**
     * [@constant] WKWebsiteDataTypeLocalStorage HTML local storage.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeLocalStorage();

    /**
     * [@constant] WKWebsiteDataTypeWebSQLDatabases WebSQL databases.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeWebSQLDatabases();

    /**
     * [@constant] WKWebsiteDataTypeIndexedDBDatabases IndexedDB databases.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeIndexedDBDatabases();

    /**
     * Indicates which local files WebKit can access when loading content.
     * 
     * If NSReadAccessURLDocumentOption references a single file, only that file may be
     * loaded by WebKit. If NSReadAccessURLDocumentOption references a directory, files inside that
     * directory may be loaded by WebKit.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSReadAccessURLDocumentOption();

    /**
     * [@constant] WKWebsiteDataTypeFetchCache On-disk Fetch caches.
     * 
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeFetchCache();

    /**
     * [@constant] WKWebsiteDataTypeServiceWorkerRegistrations Service worker registrations.
     * 
     * API-Since: 11.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeServiceWorkerRegistrations();

    /**
     * [@constant] WKWebsiteDataTypeFileSystem File system storage.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeFileSystem();

    /**
     * [@constant] WKWebsiteDataTypeSearchFieldRecentSearches Search field history.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebsiteDataTypeSearchFieldRecentSearches();

    /**
     * [@constant] WKWebsiteDataTypeMediaKeys MediaKeys storage
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebsiteDataTypeMediaKeys();

    /**
     * [@constant] WKWebsiteDataTypeHashSalt Hash salt for deviceId
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebsiteDataTypeHashSalt();

    /**
     * Indicates a ``WKWebExtensionMatchPattern`` error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionMatchPatternErrorDomain();

    /**
     * The `activeTab` permission requests that when the user interacts with the extension, the extension is granted
     * extra permissions for the active tab only.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionActiveTab();

    /**
     * The `alarms` permission requests access to the `browser.alarms` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionAlarms();

    /**
     * The `clipboardWrite` permission requests access to write to the clipboard.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionClipboardWrite();

    /**
     * The `contextMenus` permission requests access to the `browser.contextMenus` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionContextMenus();

    /**
     * The `cookies` permission requests access to the `browser.cookies` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionCookies();

    /**
     * The `declarativeNetRequest` permission requests access to the `browser.declarativeNetRequest` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionDeclarativeNetRequest();

    /**
     * The `declarativeNetRequestFeedback` permission requests access to the `browser.declarativeNetRequest` APIs with
     * extra information on matched rules.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionDeclarativeNetRequestFeedback();

    /**
     * The `declarativeNetRequestWithHostAccess` permission requests access to the `browser.declarativeNetRequest` APIs
     * with the ability to modify or redirect requests.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionDeclarativeNetRequestWithHostAccess();

    /**
     * The `menus` permission requests access to the `browser.menus` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionMenus();

    /**
     * The `nativeMessaging` permission requests access to send messages to the App Extension bundle.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionNativeMessaging();

    /**
     * The `scripting` permission requests access to the `browser.scripting` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionScripting();

    /**
     * The `storage` permission requests access to the `browser.storage` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionStorage();

    /**
     * The `tabs` permission requests access extra information on the `browser.tabs` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionTabs();

    /**
     * The `unlimitedStorage` permission requests access to an unlimited quota on the `browser.storage.local` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionUnlimitedStorage();

    /**
     * The `webNavigation` permission requests access to the `browser.webNavigation` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionWebNavigation();

    /**
     * The `webRequest` permission requests access to the `browser.webRequest` APIs.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionPermissionWebRequest();

    /**
     * Indicates a ``WKWebExtension`` error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionErrorDomain();

    /**
     * Indicates a ``WKWebExtensionContext`` error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextErrorDomain();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has new errors or errors were cleared.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextErrorsDidUpdateNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly granted permissions.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextPermissionsWereGrantedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly denied permissions.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextPermissionsWereDeniedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly removed granted permissions.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextGrantedPermissionsWereRemovedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly removed denied permissions.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextDeniedPermissionsWereRemovedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly granted permission match patterns.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextPermissionMatchPatternsWereGrantedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly denied permission match patterns.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextPermissionMatchPatternsWereDeniedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly removed granted permission match
     * patterns.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextGrantedPermissionMatchPatternsWereRemovedNotification();

    /**
     * This notification is sent whenever a ``WKWebExtensionContext`` has newly removed denied permission match
     * patterns.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextDeniedPermissionMatchPatternsWereRemovedNotification();

    /**
     * The corresponding value represents the affected permissions in ``WKWebExtensionContext`` notifications.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextNotificationUserInfoKeyPermissions();

    /**
     * The corresponding value represents the affected permission match patterns in ``WKWebExtensionContext``
     * notifications.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionContextNotificationUserInfoKeyMatchPatterns();

    /**
     * Specifies local storage, including `browser.storage.local`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionDataTypeLocal();

    /**
     * Specifies session storage, including `browser.storage.session`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionDataTypeSession();

    /**
     * Specifies synchronized storage, including `browser.storage.sync`.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebExtensionDataTypeSynchronized();

    /**
     * Indicates a ``WKWebExtensionDataRecord`` error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionDataRecordErrorDomain();

    /**
     * Indicates a ``WKWebExtensionMessagePort`` error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebExtensionMessagePortErrorDomain();

    /**
     * [@constant] WKWebsiteDataTypeScreenTime Screen Time information
     * 
     * API-Since: 26.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String WKWebsiteDataTypeScreenTime();
}
