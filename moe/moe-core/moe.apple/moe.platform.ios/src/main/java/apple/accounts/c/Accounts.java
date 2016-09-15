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

package apple.accounts.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Accounts")
@Runtime(CRuntime.class)
public final class Accounts {
    static {
        NatJ.register();
    }

    @Generated
    private Accounts() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierTwitter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierFacebook();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierSinaWeibo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierTencentWeibo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAppIdKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookPermissionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceEveryone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceFriends();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceOnlyMe();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACTencentWeiboAppIdKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountStoreDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACErrorDomain();
}
