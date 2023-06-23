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

    /**
     * The identifiers for supported system account types are listed here:
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Twitter SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierTwitter();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierFacebook();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Sina Weibo SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierSinaWeibo();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Tencent Weibo SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountTypeIdentifierTencentWeibo();

    /**
     * Your Facebook App ID, as it appears on the Facebook website.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAppIdKey();

    /**
     * An array of of the permissions you're requesting.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookPermissionsKey();

    /**
     * Only required when posting permissions are requested.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceKey();

    /**
     * Posts from your app are visible to everyone.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceEveryone();

    /**
     * Posts are visible only to friends.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceFriends();

    /**
     * Posts are visible to the user only.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Facebook SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACFacebookAudienceOnlyMe();

    /**
     * Tencent App ID
     * 
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use Tencent Weibo SDK instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACTencentWeiboAppIdKey();

    /**
     * Notification name sent out when the database is changed by an external process, another account store
     * in the same process or by calling saveAccount: or removeAccount: on a store you are managing.
     * You may need to deal with accounts being removed by an external process while you are using them.
     * Note: ensure when you add an observer for this notification, you do so specifying this object specifically.
     * Otherwise, you will receive n notifications, one per active ACAccountStore instance in your process.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Public notification deprecated. Internal clients, see private header for replacement
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACAccountStoreDidChangeNotification();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ACErrorDomain();
}
