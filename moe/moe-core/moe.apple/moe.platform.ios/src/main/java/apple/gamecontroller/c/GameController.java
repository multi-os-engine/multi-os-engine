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

package apple.gamecontroller.c;

import apple.foundation.NSData;
import apple.gamecontroller.struct.GCExtendedGamepadSnapShotDataV100;
import apple.gamecontroller.struct.GCExtendedGamepadSnapshotData;
import apple.gamecontroller.struct.GCGamepadSnapShotDataV100;
import apple.gamecontroller.struct.GCMicroGamepadSnapShotDataV100;
import apple.gamecontroller.struct.GCMicroGamepadSnapshotData;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("GameController")
@Runtime(CRuntime.class)
public final class GameController {
    static {
        NatJ.register();
    }

    @Generated
    private GameController() {
    }

    @Generated
    @CFunction
    public static native boolean GCGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData,
            NSData data);

    @Generated
    @CFunction
    public static native NSData NSDataFromGCGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData);

    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData,
            NSData data);

    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData);

    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData,
            NSData data);

    @Generated
    @CFunction
    public static native NSData NSDataFromGCMicroGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidDisconnectNotification();

    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapshotDataFromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData,
            NSData data);

    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapshotData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData);

    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapshotDataFromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapshotData snapshotData,
            NSData data);

    @Generated
    @CFunction
    public static native NSData NSDataFromGCMicroGamepadSnapshotData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapshotData snapshotData);

    @Generated
    @CVariable()
    @NInt
    public static native long GCCurrentExtendedGamepadSnapshotDataVersion();

    @Generated
    @CVariable()
    @NInt
    public static native long GCCurrentMicroGamepadSnapshotDataVersion();
}
