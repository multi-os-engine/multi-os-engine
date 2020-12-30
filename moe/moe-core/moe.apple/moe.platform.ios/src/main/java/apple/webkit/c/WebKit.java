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
     * @constant WKErrorDomain Indicates a WebKit error.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierOpen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierAddToReadingList();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierCopy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKPreviewActionItemIdentifierShare();

    /**
     * @constant WKWebsiteDataTypeDiskCache On-disk caches.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeDiskCache();

    /**
     * @constant WKWebsiteDataTypeMemoryCache In-memory caches.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeMemoryCache();

    /**
     * @constant WKWebsiteDataTypeOfflineWebApplicationCache HTML offline web application caches.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeOfflineWebApplicationCache();

    /**
     * @constant WKWebsiteDataTypeCookies Cookies.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeCookies();

    /**
     * @constant WKWebsiteDataTypeSessionStorage HTML session storage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeSessionStorage();

    /**
     * @constant WKWebsiteDataTypeLocalStorage HTML local storage.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeLocalStorage();

    /**
     * @constant WKWebsiteDataTypeWebSQLDatabases WebSQL databases.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeWebSQLDatabases();

    /**
     * @constant WKWebsiteDataTypeIndexedDBDatabases IndexedDB databases.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeIndexedDBDatabases();

    /**
     * @abstract Indicates which local files WebKit can access when loading content.
     * @discussion If NSReadAccessURLDocumentOption references a single file, only that file may be
     * loaded by WebKit. If NSReadAccessURLDocumentOption references a directory, files inside that
     * directory may be loaded by WebKit.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSReadAccessURLDocumentOption();

    /**
     * @constant WKWebsiteDataTypeFetchCache On-disk Fetch caches.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeFetchCache();

    /**
     * @constant WKWebsiteDataTypeServiceWorkerRegistrations Service worker registrations.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeServiceWorkerRegistrations();
}
