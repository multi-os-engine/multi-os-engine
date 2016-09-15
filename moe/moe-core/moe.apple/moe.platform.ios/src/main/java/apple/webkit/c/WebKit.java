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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeDiskCache();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeMemoryCache();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeOfflineWebApplicationCache();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeCookies();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeSessionStorage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeLocalStorage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeWebSQLDatabases();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WKWebsiteDataTypeIndexedDBDatabases();
}
