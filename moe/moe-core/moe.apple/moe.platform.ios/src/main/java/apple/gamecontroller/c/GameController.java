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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     * 
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     * 
     *         API-Since: 7.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCGamepad has been deprecated, use GCExtendedGamepad instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean GCGamepadSnapShotDataV100FromNSData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData,
            @Nullable NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCGamepadSnapShotDataV100) set as the values implicitly.
     * 
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     * 
     *         API-Since: 7.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCGamepad has been deprecated, use GCExtendedGamepad instead
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native NSData NSDataFromGCGamepadSnapShotDataV100(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData);

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     * 
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCExtendedGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithExtendedGamepad] instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapShotDataV100FromNSData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData,
            @Nullable NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCExtendedGamepadSnapShotDataV100) set as the values implicitly.
     * 
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with
     *         GCExtendedGamepadSnapshot.snapshotData
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCExtendedGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithExtendedGamepad] instead
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapShotDataV100(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData);

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     * 
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCMicroGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithMicroGamepad] instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapShotDataV100FromNSData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData,
            @Nullable NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCMicroGamepadSnapShotDataV100) set as the values implicitly.
     * 
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCMicroGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithMicroGamepad] instead
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native NSData NSDataFromGCMicroGamepadSnapShotDataV100(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData);

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events.
     * 
     * Use GCControllerDidConnectNotification for observing connections of controllers.
     * Use GCControllerDidDisconnectNotification for observing disconnections of controllers.
     * 
     * Connections and disconnections of controllers will also be reflected in the controllers array
     * of the GCController class.
     * 
     * The 'object' property of the notification will contain the GCController that was connected or disconnected.
     * For example:
     * 
     * - (void)controllerDidConnect:(NSNotification *)note {
     * 
     * GCController *controller = note.object;
     * 
     * ....
     * }
     * 
     * @see NSNotificationCenter
     * @see GCController.controllers
     * 
     *      API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidConnectNotification();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidDisconnectNotification();

    /**
     * Fills out a snapshot from any compatible NSData source
     * 
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCExtendedGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithExtendedGamepad] instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapshotDataFromNSData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData,
            @Nullable NSData data);

    /**
     * Creates an NSData object from a snapshot.
     * If the version and size is not set in the snapshot the data will automatically have the version
     * GCCurrentExtendedGamepadSnapshotDataVersion and sizeof(GCExtendedGamepadSnapshotData) set as the values
     * implicitly.
     * 
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with
     *         GCExtendedGamepadSnapshot.snapshotData
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCExtendedGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithExtendedGamepad] instead
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapshotData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData);

    /**
     * Fills out a snapshot from any compatible NSData source
     * 
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCMicroGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithMicroGamepad] instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapshotDataFromNSData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapshotData snapshotData,
            @Nullable NSData data);

    /**
     * Creates an NSData object from a snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version
     * GCCurrentMicroGamepadSnapshotDataVersion and sizeof(GCMicroGamepadSnapshotData) set as the values implicitly.
     * 
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: GCMicroGamepadSnapshot has been deprecated, use [GCController
     *         controllerWithMicroGamepad] instead
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native NSData NSDataFromGCMicroGamepadSnapshotData(
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapshotData snapshotData);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: GCExtendedGamepadSnapshot has been deprecated, use [GCController
     * controllerWithExtendedGamepad] instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @NInt
    public static native long GCCurrentExtendedGamepadSnapshotDataVersion();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: GCMicroGamepadSnapshot has been deprecated, use [GCController controllerWithMicroGamepad]
     * instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @NInt
    public static native long GCCurrentMicroGamepadSnapshotDataVersion();

    /**
     * A set of commonly used strings that can be used to access controller buttons
     * 
     * [@example] controller.physicalInputProfile.buttons[GCInputButtonA]
     * 
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     * 
     *      API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonA();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonB();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonX();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonY();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionPad();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftThumbstick();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightThumbstick();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftShoulder();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightShoulder();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftTrigger();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightTrigger();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftThumbstickButton();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightThumbstickButton();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonHome();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonMenu();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonOptions();

    /**
     * A set of strings commonly used to access Xbox buttons
     * 
     * [@example] controller.physicalInputProfile.buttons[GCInputButtonPaddleOne]
     * 
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     * 
     *      API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleOne();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleTwo();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleThree();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleFour();

    /**
     * A set of strings commonly used to access DualShock buttons
     * 
     * [@example] controller.physicalInputProfile.dpads[GCInputDualShockTouchpadOne]
     * 
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     * 
     *      API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadOne();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadTwo();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadButton();

    /**
     * a or A
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyA();

    /**
     * b or B
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyB();

    /**
     * c or C
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyC();

    /**
     * d or D
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyD();

    /**
     * e or E
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyE();

    /**
     * f or F
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyF();

    /**
     * g or G
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyG();

    /**
     * h or H
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyH();

    /**
     * i or I
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyI();

    /**
     * j or J
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyJ();

    /**
     * k or K
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyK();

    /**
     * l or L
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyL();

    /**
     * m or M
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyM();

    /**
     * n or N
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyN();

    /**
     * o or O
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyO();

    /**
     * p or P
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyP();

    /**
     * q or Q
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyQ();

    /**
     * r or R
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyR();

    /**
     * s or S
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyS();

    /**
     * t or T
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyT();

    /**
     * u or U
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyU();

    /**
     * v or V
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyV();

    /**
     * w or W
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyW();

    /**
     * x or X
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyX();

    /**
     * y or Y
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyY();

    /**
     * z or Z
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyZ();

    /**
     * 1 or !
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOne();

    /**
     * 2 or @
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTwo();

    /**
     * 3 or #
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeThree();

    /**
     * 4 or $
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFour();

    /**
     * 5 or %
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFive();

    /**
     * 6 or ^
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSix();

    /**
     * 7 or &
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSeven();

    /**
     * 8 or *
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEight();

    /**
     * 9 or (
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNine();

    /**
     * 0 or )
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeZero();

    /**
     * Return (Enter)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeReturnOrEnter();

    /**
     * Escape
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEscape();

    /**
     * Delete (Backspace)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteOrBackspace();

    /**
     * Tab
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTab();

    /**
     * Spacebar
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSpacebar();

    /**
     * - or _
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHyphen();

    /**
     * = or +
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEqualSign();

    /**
     * [ or {
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOpenBracket();

    /**
     * ] or }
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCloseBracket();

    /**
     * \ or |
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeBackslash();

    /**
     * Non-US # or _
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSPound();

    /**
     * ; or :
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSemicolon();

    /**
     * ' or "
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeQuote();

    /**
     * Grave Accent and Tilde
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeGraveAccentAndTilde();

    /**
     * , or <
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeComma();

    /**
     * . or >
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePeriod();

    /**
     * / or ?
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSlash();

    /**
     * Caps Lock
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCapsLock();

    /**
     * F1
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF1();

    /**
     * F2
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF2();

    /**
     * F3
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF3();

    /**
     * F4
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF4();

    /**
     * F5
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF5();

    /**
     * F6
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF6();

    /**
     * F7
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF7();

    /**
     * F8
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF8();

    /**
     * F9
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF9();

    /**
     * F10
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF10();

    /**
     * F11
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF11();

    /**
     * F12
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF12();

    /**
     * Print Screen
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePrintScreen();

    /**
     * Scroll Lock
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeScrollLock();

    /**
     * Pause
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePause();

    /**
     * Insert
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInsert();

    /**
     * Home
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHome();

    /**
     * Page Up
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageUp();

    /**
     * Delete Forward
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteForward();

    /**
     * End
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEnd();

    /**
     * Page Down
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageDown();

    /**
     * Right Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightArrow();

    /**
     * Left Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftArrow();

    /**
     * Down Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDownArrow();

    /**
     * Up Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeUpArrow();

    /**
     * Keypad NumLock or Clear
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadNumLock();

    /**
     * Keypad /
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadSlash();

    /**
     * Keypad *
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadAsterisk();

    /**
     * Keypad -
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadHyphen();

    /**
     * Keypad +
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPlus();

    /**
     * Keypad Enter
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEnter();

    /**
     * Keypad 1 or End
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad1();

    /**
     * Keypad 2 or Down Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad2();

    /**
     * Keypad 3 or Page Down
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad3();

    /**
     * Keypad 4 or Left Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad4();

    /**
     * Keypad 5
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad5();

    /**
     * Keypad 6 or Right Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad6();

    /**
     * Keypad 7 or Home
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad7();

    /**
     * Keypad 8 or Up Arrow
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad8();

    /**
     * Keypad 9 or Page Up
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad9();

    /**
     * Keypad 0 or Insert
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad0();

    /**
     * Keypad . or Delete
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPeriod();

    /**
     * Keypad =
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEqualSign();

    /**
     * Non-US \ or |
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSBackslash();

    /**
     * Application
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeApplication();

    /**
     * Power
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePower();

    /**
     * International1
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational1();

    /**
     * International2
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational2();

    /**
     * International3
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational3();

    /**
     * International4
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational4();

    /**
     * International5
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational5();

    /**
     * International6
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational6();

    /**
     * International7
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational7();

    /**
     * International8
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational8();

    /**
     * International9
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational9();

    /**
     * LANG1
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG1();

    /**
     * LANG2
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG2();

    /**
     * LANG3
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG3();

    /**
     * LANG4
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG4();

    /**
     * LANG5
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG5();

    /**
     * LANG6
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG6();

    /**
     * LANG7
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG7();

    /**
     * LANG8
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG8();

    /**
     * LANG9
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG9();

    /**
     * Left Control
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftControl();

    /**
     * Left Shift
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftShift();

    /**
     * Left Alt
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftAlt();

    /**
     * Left GUI
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftGUI();

    /**
     * Right Control
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightControl();

    /**
     * Right Shift
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightShift();

    /**
     * Right Alt
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightAlt();

    /**
     * Right GUI
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightGUI();

    /**
     * a or A
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyA();

    /**
     * b or B
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyB();

    /**
     * c or C
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyC();

    /**
     * d or D
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyD();

    /**
     * e or E
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyE();

    /**
     * f or F
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF();

    /**
     * g or G
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyG();

    /**
     * h or H
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyH();

    /**
     * i or I
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyI();

    /**
     * j or J
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyJ();

    /**
     * k or K
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyK();

    /**
     * l or L
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyL();

    /**
     * m or M
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyM();

    /**
     * n or N
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyN();

    /**
     * o or O
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyO();

    /**
     * p or P
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyP();

    /**
     * q or Q
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQ();

    /**
     * r or R
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyR();

    /**
     * s or S
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyS();

    /**
     * t or T
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyT();

    /**
     * u or U
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyU();

    /**
     * v or V
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyV();

    /**
     * w or W
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyW();

    /**
     * x or X
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyX();

    /**
     * y or Y
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyY();

    /**
     * z or Z
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZ();

    /**
     * 1 or !
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOne();

    /**
     * 2 or @
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTwo();

    /**
     * 3 or #
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyThree();

    /**
     * 4 or $
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFour();

    /**
     * 5 or %
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFive();

    /**
     * 6 or ^
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySix();

    /**
     * 7 or &
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySeven();

    /**
     * 8 or *
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEight();

    /**
     * 9 or (
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNine();

    /**
     * 0 or )
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZero();

    /**
     * Return (Enter)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyReturnOrEnter();

    /**
     * Escape
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEscape();

    /**
     * Delete (Backspace)
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteOrBackspace();

    /**
     * Tab
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTab();

    /**
     * Spacebar
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySpacebar();

    /**
     * - or _
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHyphen();

    /**
     * = or +
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEqualSign();

    /**
     * [ or {
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOpenBracket();

    /**
     * ] or }
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCloseBracket();

    /**
     * \ or |
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyBackslash();

    /**
     * Non-US # or _
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSPound();

    /**
     * ; or :
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySemicolon();

    /**
     * ' or "
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQuote();

    /**
     * Grave Accent and Tilde
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyGraveAccentAndTilde();

    /**
     * , or <
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyComma();

    /**
     * . or >
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPeriod();

    /**
     * / or ?
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySlash();

    /**
     * Caps Lock
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCapsLock();

    /**
     * F1
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF1();

    /**
     * F2
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF2();

    /**
     * F3
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF3();

    /**
     * F4
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF4();

    /**
     * F5
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF5();

    /**
     * F6
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF6();

    /**
     * F7
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF7();

    /**
     * F8
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF8();

    /**
     * F9
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF9();

    /**
     * F10
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF10();

    /**
     * F11
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF11();

    /**
     * F12
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF12();

    /**
     * Print Screen
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPrintScreen();

    /**
     * Scroll Lock
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyScrollLock();

    /**
     * Pause
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPause();

    /**
     * Insert
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInsert();

    /**
     * Home
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHome();

    /**
     * Page Up
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageUp();

    /**
     * Delete Forward
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteForward();

    /**
     * End
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEnd();

    /**
     * Page Down
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageDown();

    /**
     * Right Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightArrow();

    /**
     * Left Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftArrow();

    /**
     * Down Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDownArrow();

    /**
     * Up Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyUpArrow();

    /**
     * Keypad NumLock or Clear
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadNumLock();

    /**
     * Keypad /
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadSlash();

    /**
     * Keypad *
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadAsterisk();

    /**
     * Keypad -
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadHyphen();

    /**
     * Keypad +
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPlus();

    /**
     * Keypad Enter
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEnter();

    /**
     * Keypad 1 or End
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad1();

    /**
     * Keypad 2 or Down Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad2();

    /**
     * Keypad 3 or Page Down
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad3();

    /**
     * Keypad 4 or Left Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad4();

    /**
     * Keypad 5
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad5();

    /**
     * Keypad 6 or Right Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad6();

    /**
     * Keypad 7 or Home
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad7();

    /**
     * Keypad 8 or Up Arrow
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad8();

    /**
     * Keypad 9 or Page Up
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad9();

    /**
     * Keypad 0 or Insert
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad0();

    /**
     * Keypad . or Delete
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPeriod();

    /**
     * Keypad =
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEqualSign();

    /**
     * Non-US \ or |
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSBackslash();

    /**
     * Application
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyApplication();

    /**
     * Power
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPower();

    /**
     * International1
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational1();

    /**
     * International2
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational2();

    /**
     * International3
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational3();

    /**
     * International4
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational4();

    /**
     * International5
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational5();

    /**
     * International6
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational6();

    /**
     * International7
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational7();

    /**
     * International8
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational8();

    /**
     * International9
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational9();

    /**
     * LANG1
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG1();

    /**
     * LANG2
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG2();

    /**
     * LANG3
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG3();

    /**
     * LANG4
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG4();

    /**
     * LANG5
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG5();

    /**
     * LANG6
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG6();

    /**
     * LANG7
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG7();

    /**
     * LANG8
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG8();

    /**
     * LANG9
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG9();

    /**
     * Left Control
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftControl();

    /**
     * Left Shift
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftShift();

    /**
     * Left Alt
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftAlt();

    /**
     * Left GUI
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftGUI();

    /**
     * Right Control
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightControl();

    /**
     * Right Shift
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightShift();

    /**
     * Right Alt
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightAlt();

    /**
     * Right GUI
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightGUI();

    /**
     * Use these constants with NSNotificationCenter to listen to a controller becoming the most recently used
     * controller.
     * This is a good time to swap out UI to match the new current controller, and unregister any handlers with
     * the old current controller.
     * 
     * The 'object' property of the notification will contain the GCController that became the current controller.
     * For example:
     * 
     * - (void)controllerDidBecomeCurrent:(NSNotification *)note {
     * 
     * GCController *controller = note.object;
     * 
     * ...
     * }
     * 
     * @see NSNotificationCenter
     * @see GCController.controllers
     * 
     *      API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidBecomeCurrentNotification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidStopBeingCurrentNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events
     * 
     * Use GCKeyboardDidConnectNotification for observing keyboard connection
     * Use GCKeyboardDidDisconnectNotification for observing keyboard disconnection
     * 
     * The 'object' property of the notification will contain the GCKeyboard that was connected or disconnected.
     * 
     * [@note] All connected keyboards are coalesced into one keyboard object, so notification about
     * connection/disconnection will only be delivered once until last keyboard disconnects.
     * 
     * API-Since: 14.0
     * 
     * @see NSNotificationCetner
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidConnectNotification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidDisconnectNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events.
     * 
     * Use GCMouseDidConnectNotification for observing connections of mice.
     * Use GCMouserDidDisconnectNotification for observing disconnections of mice.
     * 
     * Connections and disconnections of mice will also be reflected in the mice array
     * of the GCMouse class.
     * 
     * The 'object' property of the notification will contain the GCMouse that was connected or disconnected.
     * For example:
     * 
     * - (void)controllerDidConnect:(NSNotification *)note {
     * 
     * GCMouse *mouse = note.object;
     * 
     * ....
     * }
     * 
     * @see NSNotificationCenter
     * @see GCMouse.mice
     * 
     *      API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidConnectNotification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidDisconnectNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to a controller becoming the most recently used mouse.
     * This is a good time to swap out UI to match the new current mouse, and unregister any handlers with
     * the old current controller.
     * 
     * The 'object' property of the notification will contain the GCMouse that became the current one.
     * For example:
     * 
     * - (void)mouseDidBecomeCurrent:(NSNotification *)note {
     * 
     * GCMouse *mouse = note.object;
     * 
     * ...
     * }
     * 
     * @see NSNotificationCenter
     * @see GCMouse.mice
     * @see GCMouse.current
     * 
     *      API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidBecomeCurrentNotification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidStopBeingCurrentNotification();

    /**
     * guaranteed to be supported
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityDefault();

    /**
     * guaranteed to be supported
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityAll();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityHandles();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityLeftHandle();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityRightHandle();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityTriggers();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityLeftTrigger();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityRightTrigger();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native float GCHapticDurationInfinite();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonShare();

    /**
     * F13
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF13();

    /**
     * F14
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF14();

    /**
     * F15
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF15();

    /**
     * F16
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF16();

    /**
     * F17
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF17();

    /**
     * F18
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF18();

    /**
     * F19
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF19();

    /**
     * F20
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF20();

    /**
     * F13
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF13();

    /**
     * F14
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF14();

    /**
     * F15
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF15();

    /**
     * F16
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF16();

    /**
     * F17
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF17();

    /**
     * F18
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF18();

    /**
     * F19
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF19();

    /**
     * F20
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF20();

    /**
     * The primary directional input surface for the directional gamepad
     * 
     * [@note] Equivalent to microgamepad.dpad
     * 
     * [@note] For the 1st generation and 2nd generation Siri Remotes, this represents touching anywhere on the entire
     * touch surface.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadDpad();

    /**
     * The primary button for the microgamepad
     * 
     * [@note] For the 1st generation and 2nd generation Siri Remotes, this represents pressing anywhere on the touch
     * surface.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonA();

    /**
     * The secondary button for the microgamepad
     * 
     * [@note] Equivalent to microgamepad.buttonX
     * 
     * [@note] For the 1st and 2nd generation Siri Remotes, this represents pressing the play/pause button.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonX();

    /**
     * The primary menu button for the microgamepad
     * 
     * [@note] Equivalent to microgamepad.buttonMenu
     * 
     * [@note] For the 1st generation Siri Remote, this represents pressing the play/pause button. For the 2nd
     * generation Siri Remote, this represents pressing the back button.
     * 
     * [@note] You should avoid polling this button every frame. tvOS will run a gesture recognizer on events before
     * forwarding them to your application that can reduce the window
     * to poll button changes. Instead, register a pressedChangedHandler or a valueChangedHandler.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonMenu();

    /**
     * The primary directional input surface for the directional gamepad
     * 
     * [@note] Equivalent to microgamepad.dpad
     * 
     * [@note] For the 2021 2nd generation Siri Remote, this represents touching anywhere on the entire touch surface -
     * including the inner and outer rings.
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalDpad();

    /**
     * The button corresponding to pressing anywhere on the primary directional input surface for the directional
     * gamepad
     * 
     * [@note] Equivalent to microgamepad.buttonA
     * 
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing anywhere the entire touch surface -
     * including the inner and outer rings.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalTouchSurfaceButton();

    /**
     * An optional secondary directional input surface for the directional gamepad. This input is guaranteed to be an
     * 8-way digital dpad with physical Up, Down, Left, Right butttons.
     * 
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing on the outer ring of the touch surface.
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalCardinalDpad();

    /**
     * An optional button for the directional gamepad. This input represents the center button of the cardinal dpad.
     * 
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing anywhere on the inner ring of the touch
     * surface.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalCenterButton();

    /**
     * Game Controller Product Categories
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryDualSense();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryDualShock4();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryMFi();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryXboxOne();

    /**
     * The Siri Remote (1st generation), or Apple TV Remote (1st generation), was first introduced in 2015. It features
     * a Touch surface for touch navigation, and supports device motion.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategorySiriRemote1stGen();

    /**
     * The Siri Remote (2nd generation), or Apple TV Remote (2nd generation), was first introduced in 2021. It features
     * a touch-enabled clickpad for navigation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategorySiriRemote2ndGen();

    /**
     * Users can use Apple TV Remote controls in Control Center on an iOS or iPadOS device.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryControlCenterRemote();

    /**
     * The Universal Electronics remote is an infrared and Bluetooth Low Energy remote designed to work with the Apple
     * TV.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryUniversalElectronicsRemote();

    /**
     * If multiple remotes have been combined into one, the device will have the GCProductCategoryCoalescedRemote
     * product category.
     * 
     * By default, the Game Controller framework will try to coalesce, or combine, the physical Apple TV Remote and the
     * virtual Control Center remote and treat them as a single GCDevice instance. By setting
     * GCSupportsMultipleMicroGamepads in your
     * app's plist to true, you can disable this behavior.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryCoalescedRemote();

    /**
     * Keyboards and Mice Product Categories
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryMouse();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryKeyboard();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryHID();

    /**
     * Use this constant with NSNotificationCenter to listen to controller user customization events.
     * 
     * When a user customizes the button mappings or other settings of a controller this notification will be
     * posted. This is a good time to swap out UI to match the new user settings. Users can modify game
     * controller settings through the Settings app on iOS, tvOS, and macOS.
     * 
     * The 'object' property of the notification will contain the GCController that was customized.
     * For example:
     * 
     * - (void)controllerDidConnect:(NSNotification *)note {
     * 
     * GCController *controller = note.object;
     * 
     * ....
     * }
     * 
     * @see NSNotificationCenter
     * @see GCController.controllers
     * 
     *      API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerUserCustomizationsDidChangeNotification();
}
