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
}
