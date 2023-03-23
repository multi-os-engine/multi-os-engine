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

package apple.gamekit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("GameKit")
@Runtime(CRuntime.class)
public final class GameKit {
    static {
        NatJ.register();
    }

    @Generated
    private GameKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKErrorDomain();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKGameSessionErrorDomain();

    /**
     * Notification will be posted whenever the player details changes. The object of the notification will be the
     * player.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKPlayerDidChangeNotificationName();

    /**
     * use a default timeout of one week
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native double GKTurnTimeoutDefault();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native double GKTurnTimeoutNone();

    /**
     * use a default timeout of one day
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native double GKExchangeTimeoutDefault();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native double GKExchangeTimeoutNone();

    /**
     * Notification will be posted whenever authentication status changes.
     * 
     * API-Since: 4.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKPlayerAuthenticationDidChangeNotificationName();

    /**
     * domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKSessionErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKVoiceChatServiceErrorDomain();

    /**
     * Deprecated methods that previously returned player IDs will return GKPlayerIDNoLongerAvailable instead.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GKPlayerIDNoLongerAvailable();
}
