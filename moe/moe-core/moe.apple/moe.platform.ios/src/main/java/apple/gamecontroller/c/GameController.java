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

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     *
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     */
    @Generated
    @CFunction
    public static native boolean GCGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData,
            NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCGamepadSnapShotDataV100) set as the values implicitly.
     *
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     */
    @Generated
    @CFunction
    public static native NSData NSDataFromGCGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCGamepadSnapShotDataV100 snapshotData);

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     *
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     */
    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData,
            NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCExtendedGamepadSnapShotDataV100) set as the values implicitly.
     *
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with
     *         GCExtendedGamepadSnapshot.snapshotData
     */
    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapShotDataV100 snapshotData);

    /**
     * Fills out a v100 snapshot from any compatible NSData source
     *
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     */
    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapShotDataV100FromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData,
            NSData data);

    /**
     * Creates an NSData object from a v100 snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version 0x100 and
     * sizeof(GCMicroGamepadSnapShotDataV100) set as the values implicitly.
     *
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     */
    @Generated
    @CFunction
    public static native NSData NSDataFromGCMicroGamepadSnapShotDataV100(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapShotDataV100 snapshotData);

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events.
     * <p>
     * Use GCControllerDidConnectNotification for observing connections of controllers.
     * Use GCControllerDidDisconnectNotification for observing disconnections of controllers.
     * <p>
     * Connections and disconnections of controllers will also be reflected in the controllers array
     * of the GCController class.
     * <p>
     * The 'object' property of the notification will contain the GCController that was connected or disconnected.
     * For example:
     * <p>
     * - (void)controllerDidConnect:(NSNotification *)note {
     * <p>
     * GCController *controller = note.object;
     * <p>
     * ....
     * }
     *
     * @see NSNotificationCenter
     * @see GCController.controllers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidDisconnectNotification();

    /**
     * Fills out a snapshot from any compatible NSData source
     *
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     */
    @Generated
    @CFunction
    public static native boolean GCExtendedGamepadSnapshotDataFromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData,
            NSData data);

    /**
     * Creates an NSData object from a snapshot.
     * If the version and size is not set in the snapshot the data will automatically have the version
     * GCCurrentExtendedGamepadSnapshotDataVersion and sizeof(GCExtendedGamepadSnapshotData) set as the values
     * implicitly.
     *
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with
     *         GCExtendedGamepadSnapshot.snapshotData
     */
    @Generated
    @CFunction
    public static native NSData NSDataFromGCExtendedGamepadSnapshotData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCExtendedGamepadSnapshotData snapshotData);

    /**
     * Fills out a snapshot from any compatible NSData source
     *
     * @return NO if data is nil, snapshotData is nil or the contents of data does not contain a compatible snapshot.
     *         YES for all other cases.
     */
    @Generated
    @CFunction
    public static native boolean GCMicroGamepadSnapshotDataFromNSData(
            @UncertainArgument("Options: reference, array Fallback: reference") GCMicroGamepadSnapshotData snapshotData,
            NSData data);

    /**
     * Creates an NSData object from a snapshot.
     * If the version and size is not set in the snapshot the data will automatically have version
     * GCCurrentMicroGamepadSnapshotDataVersion and sizeof(GCMicroGamepadSnapshotData) set as the values implicitly.
     *
     * @return nil if the snapshot is NULL, otherwise an NSData instance compatible with GCGamepadSnapshot.snapshotData
     */
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

    /**
     * A set of commonly used strings that can be used to access controller buttons
     * <p>
     * [@example] controller.physicalInputProfile.buttons[GCInputButtonA]
     *
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonB();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonX();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonY();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionPad();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftThumbstick();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightThumbstick();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftTrigger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightTrigger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputLeftThumbstickButton();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputRightThumbstickButton();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonHome();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonMenu();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonOptions();

    /**
     * A set of strings commonly used to access Xbox buttons
     * <p>
     * [@example] controller.physicalInputProfile.buttons[GCInputButtonPaddleOne]
     *
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleOne();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleTwo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleThree();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputXboxPaddleFour();

    /**
     * A set of strings commonly used to access DualShock buttons
     * <p>
     * [@example] controller.physicalInputProfile.dpads[GCInputDualShockTouchpadOne]
     *
     * @see GCController.h
     * @see GCPhysicalInputProfile.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadOne();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadTwo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDualShockTouchpadButton();

    /**
     * a or A
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyA();

    /**
     * b or B
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyB();

    /**
     * c or C
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyC();

    /**
     * d or D
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyD();

    /**
     * e or E
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyE();

    /**
     * f or F
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyF();

    /**
     * g or G
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyG();

    /**
     * h or H
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyH();

    /**
     * i or I
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyI();

    /**
     * j or J
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyJ();

    /**
     * k or K
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyK();

    /**
     * l or L
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyL();

    /**
     * m or M
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyM();

    /**
     * n or N
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyN();

    /**
     * o or O
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyO();

    /**
     * p or P
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyP();

    /**
     * q or Q
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyQ();

    /**
     * r or R
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyR();

    /**
     * s or S
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyS();

    /**
     * t or T
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyT();

    /**
     * u or U
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyU();

    /**
     * v or V
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyV();

    /**
     * w or W
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyW();

    /**
     * x or X
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyX();

    /**
     * y or Y
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyY();

    /**
     * z or Z
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyZ();

    /**
     * 1 or !
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOne();

    /**
     * 2 or @
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTwo();

    /**
     * 3 or #
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeThree();

    /**
     * 4 or $
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFour();

    /**
     * 5 or %
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFive();

    /**
     * 6 or ^
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSix();

    /**
     * 7 or &
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSeven();

    /**
     * 8 or *
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEight();

    /**
     * 9 or (
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNine();

    /**
     * 0 or )
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeZero();

    /**
     * Return (Enter)
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeReturnOrEnter();

    /**
     * Escape
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEscape();

    /**
     * Delete (Backspace)
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteOrBackspace();

    /**
     * Tab
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTab();

    /**
     * Spacebar
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSpacebar();

    /**
     * - or _
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHyphen();

    /**
     * = or +
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEqualSign();

    /**
     * [ or {
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOpenBracket();

    /**
     * ] or }
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCloseBracket();

    /**
     * \ or |
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeBackslash();

    /**
     * Non-US # or _
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSPound();

    /**
     * ; or :
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSemicolon();

    /**
     * ' or "
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeQuote();

    /**
     * Grave Accent and Tilde
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeGraveAccentAndTilde();

    /**
     * , or <
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeComma();

    /**
     * . or >
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePeriod();

    /**
     * / or ?
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSlash();

    /**
     * Caps Lock
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCapsLock();

    /**
     * F1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF1();

    /**
     * F2
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF2();

    /**
     * F3
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF3();

    /**
     * F4
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF4();

    /**
     * F5
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF5();

    /**
     * F6
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF6();

    /**
     * F7
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF7();

    /**
     * F8
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF8();

    /**
     * F9
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF9();

    /**
     * F10
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF10();

    /**
     * F11
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF11();

    /**
     * F12
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF12();

    /**
     * Print Screen
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePrintScreen();

    /**
     * Scroll Lock
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeScrollLock();

    /**
     * Pause
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePause();

    /**
     * Insert
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInsert();

    /**
     * Home
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHome();

    /**
     * Page Up
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageUp();

    /**
     * Delete Forward
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteForward();

    /**
     * End
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEnd();

    /**
     * Page Down
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageDown();

    /**
     * Right Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightArrow();

    /**
     * Left Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftArrow();

    /**
     * Down Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDownArrow();

    /**
     * Up Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeUpArrow();

    /**
     * Keypad NumLock or Clear
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadNumLock();

    /**
     * Keypad /
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadSlash();

    /**
     * Keypad *
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadAsterisk();

    /**
     * Keypad -
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadHyphen();

    /**
     * Keypad +
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPlus();

    /**
     * Keypad Enter
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEnter();

    /**
     * Keypad 1 or End
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad1();

    /**
     * Keypad 2 or Down Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad2();

    /**
     * Keypad 3 or Page Down
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad3();

    /**
     * Keypad 4 or Left Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad4();

    /**
     * Keypad 5
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad5();

    /**
     * Keypad 6 or Right Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad6();

    /**
     * Keypad 7 or Home
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad7();

    /**
     * Keypad 8 or Up Arrow
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad8();

    /**
     * Keypad 9 or Page Up
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad9();

    /**
     * Keypad 0 or Insert
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad0();

    /**
     * Keypad . or Delete
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPeriod();

    /**
     * Keypad =
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEqualSign();

    /**
     * Non-US \ or |
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSBackslash();

    /**
     * Application
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeApplication();

    /**
     * Power
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePower();

    /**
     * International1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational1();

    /**
     * International2
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational2();

    /**
     * International3
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational3();

    /**
     * International4
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational4();

    /**
     * International5
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational5();

    /**
     * International6
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational6();

    /**
     * International7
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational7();

    /**
     * International8
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational8();

    /**
     * International9
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational9();

    /**
     * LANG1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG1();

    /**
     * LANG2
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG2();

    /**
     * LANG3
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG3();

    /**
     * LANG4
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG4();

    /**
     * LANG5
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG5();

    /**
     * LANG6
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG6();

    /**
     * LANG7
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG7();

    /**
     * LANG8
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG8();

    /**
     * LANG9
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG9();

    /**
     * Left Control
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftControl();

    /**
     * Left Shift
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftShift();

    /**
     * Left Alt
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftAlt();

    /**
     * Left GUI
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftGUI();

    /**
     * Right Control
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightControl();

    /**
     * Right Shift
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightShift();

    /**
     * Right Alt
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightAlt();

    /**
     * Right GUI
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightGUI();

    /**
     * a or A
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyA();

    /**
     * b or B
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyB();

    /**
     * c or C
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyC();

    /**
     * d or D
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyD();

    /**
     * e or E
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyE();

    /**
     * f or F
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF();

    /**
     * g or G
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyG();

    /**
     * h or H
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyH();

    /**
     * i or I
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyI();

    /**
     * j or J
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyJ();

    /**
     * k or K
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyK();

    /**
     * l or L
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyL();

    /**
     * m or M
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyM();

    /**
     * n or N
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyN();

    /**
     * o or O
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyO();

    /**
     * p or P
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyP();

    /**
     * q or Q
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQ();

    /**
     * r or R
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyR();

    /**
     * s or S
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyS();

    /**
     * t or T
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyT();

    /**
     * u or U
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyU();

    /**
     * v or V
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyV();

    /**
     * w or W
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyW();

    /**
     * x or X
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyX();

    /**
     * y or Y
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyY();

    /**
     * z or Z
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZ();

    /**
     * 1 or !
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOne();

    /**
     * 2 or @
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTwo();

    /**
     * 3 or #
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyThree();

    /**
     * 4 or $
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFour();

    /**
     * 5 or %
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFive();

    /**
     * 6 or ^
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySix();

    /**
     * 7 or &
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySeven();

    /**
     * 8 or *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEight();

    /**
     * 9 or (
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNine();

    /**
     * 0 or )
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZero();

    /**
     * Return (Enter)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyReturnOrEnter();

    /**
     * Escape
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEscape();

    /**
     * Delete (Backspace)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteOrBackspace();

    /**
     * Tab
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTab();

    /**
     * Spacebar
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySpacebar();

    /**
     * - or _
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHyphen();

    /**
     * = or +
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEqualSign();

    /**
     * [ or {
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOpenBracket();

    /**
     * ] or }
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCloseBracket();

    /**
     * \ or |
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyBackslash();

    /**
     * Non-US # or _
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSPound();

    /**
     * ; or :
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySemicolon();

    /**
     * ' or "
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQuote();

    /**
     * Grave Accent and Tilde
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyGraveAccentAndTilde();

    /**
     * , or <
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyComma();

    /**
     * . or >
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPeriod();

    /**
     * / or ?
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySlash();

    /**
     * Caps Lock
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCapsLock();

    /**
     * F1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF1();

    /**
     * F2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF2();

    /**
     * F3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF3();

    /**
     * F4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF4();

    /**
     * F5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF5();

    /**
     * F6
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF6();

    /**
     * F7
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF7();

    /**
     * F8
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF8();

    /**
     * F9
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF9();

    /**
     * F10
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF10();

    /**
     * F11
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF11();

    /**
     * F12
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF12();

    /**
     * Print Screen
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPrintScreen();

    /**
     * Scroll Lock
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyScrollLock();

    /**
     * Pause
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPause();

    /**
     * Insert
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInsert();

    /**
     * Home
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHome();

    /**
     * Page Up
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageUp();

    /**
     * Delete Forward
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteForward();

    /**
     * End
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEnd();

    /**
     * Page Down
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageDown();

    /**
     * Right Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightArrow();

    /**
     * Left Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftArrow();

    /**
     * Down Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDownArrow();

    /**
     * Up Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyUpArrow();

    /**
     * Keypad NumLock or Clear
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadNumLock();

    /**
     * Keypad /
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadSlash();

    /**
     * Keypad *
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadAsterisk();

    /**
     * Keypad -
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadHyphen();

    /**
     * Keypad +
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPlus();

    /**
     * Keypad Enter
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEnter();

    /**
     * Keypad 1 or End
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad1();

    /**
     * Keypad 2 or Down Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad2();

    /**
     * Keypad 3 or Page Down
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad3();

    /**
     * Keypad 4 or Left Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad4();

    /**
     * Keypad 5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad5();

    /**
     * Keypad 6 or Right Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad6();

    /**
     * Keypad 7 or Home
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad7();

    /**
     * Keypad 8 or Up Arrow
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad8();

    /**
     * Keypad 9 or Page Up
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad9();

    /**
     * Keypad 0 or Insert
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad0();

    /**
     * Keypad . or Delete
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPeriod();

    /**
     * Keypad =
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEqualSign();

    /**
     * Non-US \ or |
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSBackslash();

    /**
     * Application
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyApplication();

    /**
     * Power
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPower();

    /**
     * International1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational1();

    /**
     * International2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational2();

    /**
     * International3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational3();

    /**
     * International4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational4();

    /**
     * International5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational5();

    /**
     * International6
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational6();

    /**
     * International7
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational7();

    /**
     * International8
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational8();

    /**
     * International9
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational9();

    /**
     * LANG1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG1();

    /**
     * LANG2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG2();

    /**
     * LANG3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG3();

    /**
     * LANG4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG4();

    /**
     * LANG5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG5();

    /**
     * LANG6
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG6();

    /**
     * LANG7
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG7();

    /**
     * LANG8
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG8();

    /**
     * LANG9
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG9();

    /**
     * Left Control
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftControl();

    /**
     * Left Shift
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftShift();

    /**
     * Left Alt
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftAlt();

    /**
     * Left GUI
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftGUI();

    /**
     * Right Control
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightControl();

    /**
     * Right Shift
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightShift();

    /**
     * Right Alt
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightAlt();

    /**
     * Right GUI
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightGUI();

    /**
     * Use these constants with NSNotificationCenter to listen to a controller becoming the most recently used
     * controller.
     * This is a good time to swap out UI to match the new current controller, and unregister any handlers with
     * the old current controller.
     * <p>
     * The 'object' property of the notification will contain the GCController that became the current controller.
     * For example:
     * <p>
     * - (void)controllerDidBecomeCurrent:(NSNotification *)note {
     * <p>
     * GCController *controller = note.object;
     * <p>
     * ...
     * }
     *
     * @see NSNotificationCenter
     * @see GCController.controllers
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidBecomeCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidStopBeingCurrentNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events
     * <p>
     * Use GCKeyboardDidConnectNotification for observing keyboard connection
     * Use GCKeyboardDidDisconnectNotification for observing keyboard disconnection
     * <p>
     * The 'object' property of the notification will contain the GCKeyboard that was connected or disconnected.
     * <p>
     * [@note] All connected keyboards are coalesced into one keyboard object, so notification about
     * connection/disconnection will only be delivered once until last keyboard disconnects.
     *
     * @see NSNotificationCetner
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidDisconnectNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to connection and disconnection events.
     * <p>
     * Use GCMouseDidConnectNotification for observing connections of mice.
     * Use GCMouserDidDisconnectNotification for observing disconnections of mice.
     * <p>
     * Connections and disconnections of mice will also be reflected in the mice array
     * of the GCMouse class.
     * <p>
     * The 'object' property of the notification will contain the GCMouse that was connected or disconnected.
     * For example:
     * <p>
     * - (void)controllerDidConnect:(NSNotification *)note {
     * <p>
     * GCMouse *mouse = note.object;
     * <p>
     * ....
     * }
     *
     * @see NSNotificationCenter
     * @see GCMouse.mice
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidDisconnectNotification();

    /**
     * Use these constants with NSNotificationCenter to listen to a controller becoming the most recently used mouse.
     * This is a good time to swap out UI to match the new current mouse, and unregister any handlers with
     * the old current controller.
     * <p>
     * The 'object' property of the notification will contain the GCMouse that became the current one.
     * For example:
     * <p>
     * - (void)mouseDidBecomeCurrent:(NSNotification *)note {
     * <p>
     * GCMouse *mouse = note.object;
     * <p>
     * ...
     * }
     *
     * @see NSNotificationCenter
     * @see GCMouse.mice
     * @see GCMouse.current
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidBecomeCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidStopBeingCurrentNotification();

    /**
     * guaranteed to be supported
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityDefault();

    /**
     * guaranteed to be supported
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityAll();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityHandles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityLeftHandle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityRightHandle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityTriggers();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityLeftTrigger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityRightTrigger();

    @Generated
    @CVariable()
    public static native float GCHapticDurationInfinite();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputButtonShare();

    /**
     * F13
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF13();

    /**
     * F14
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF14();

    /**
     * F15
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF15();

    /**
     * F16
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF16();

    /**
     * F17
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF17();

    /**
     * F18
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF18();

    /**
     * F19
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF19();

    /**
     * F20
     */
    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF20();

    /**
     * F13
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF13();

    /**
     * F14
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF14();

    /**
     * F15
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF15();

    /**
     * F16
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF16();

    /**
     * F17
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF17();

    /**
     * F18
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF18();

    /**
     * F19
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF19();

    /**
     * F20
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF20();

    /**
     * The primary directional input surface for the directional gamepad
     * <p>
     * [@note] Equivalent to microgamepad.dpad
     * <p>
     * [@note] For the 1st generation and 2nd generation Siri Remotes, this represents touching anywhere on the entire
     * touch surface.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadDpad();

    /**
     * The primary button for the microgamepad
     * <p>
     * [@note] For the 1st generation and 2nd generation Siri Remotes, this represents pressing anywhere on the touch
     * surface.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonA();

    /**
     * The secondary button for the microgamepad
     * <p>
     * [@note] Equivalent to microgamepad.buttonX
     * <p>
     * [@note] For the 1st and 2nd generation Siri Remotes, this represents pressing the play/pause button.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonX();

    /**
     * The primary menu button for the microgamepad
     * <p>
     * [@note] Equivalent to microgamepad.buttonMenu
     * <p>
     * [@note] For the 1st generation Siri Remote, this represents pressing the play/pause button. For the 2nd
     * generation Siri Remote, this represents pressing the back button.
     * <p>
     * [@note] You should avoid polling this button every frame. tvOS will run a gesture recognizer on events before
     * forwarding them to your application that can reduce the window
     * to poll button changes. Instead, register a pressedChangedHandler or a valueChangedHandler.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputMicroGamepadButtonMenu();

    /**
     * The primary directional input surface for the directional gamepad
     * <p>
     * [@note] Equivalent to microgamepad.dpad
     * <p>
     * [@note] For the 2021 2nd generation Siri Remote, this represents touching anywhere on the entire touch surface -
     * including the inner and outer rings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalDpad();

    /**
     * The button corresponding to pressing anywhere on the primary directional input surface for the directional
     * gamepad
     * <p>
     * [@note] Equivalent to microgamepad.buttonA
     * <p>
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing anywhere the entire touch surface -
     * including the inner and outer rings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalTouchSurfaceButton();

    /**
     * An optional secondary directional input surface for the directional gamepad. This input is guaranteed to be an
     * 8-way digital dpad with physical Up, Down, Left, Right butttons.
     * <p>
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing on the outer ring of the touch surface.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalCardinalDpad();

    /**
     * An optional button for the directional gamepad. This input represents the center button of the cardinal dpad.
     * <p>
     * [@note] For the 2021 2nd generation Siri Remote, this represents pressing anywhere on the inner ring of the touch
     * surface.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCInputDirectionalCenterButton();

    /**
     * Game Controller Product Categories
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryDualSense();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryDualShock4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryMFi();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryXboxOne();

    /**
     * The Siri Remote (1st generation), or Apple TV Remote (1st generation), was first introduced in 2015. It features
     * a Touch surface for touch navigation, and supports device motion.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategorySiriRemote1stGen();

    /**
     * The Siri Remote (2nd generation), or Apple TV Remote (2nd generation), was first introduced in 2021. It features
     * a touch-enabled clickpad for navigation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategorySiriRemote2ndGen();

    /**
     * Users can use Apple TV Remote controls in Control Center on an iOS or iPadOS device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryControlCenterRemote();

    /**
     * The Universal Electronics remote is an infrared and Bluetooth Low Energy remote designed to work with the Apple
     * TV.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryUniversalElectronicsRemote();

    /**
     * If multiple remotes have been combined into one, the device will have the GCProductCategoryCoalescedRemote
     * product category.
     * <p>
     * By default, the Game Controller framework will try to coalesce, or combine, the physical Apple TV Remote and the
     * virtual Control Center remote and treat them as a single GCDevice instance. By setting
     * GCSupportsMultipleMicroGamepads in your
     * app's plist to true, you can disable this behavior.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryCoalescedRemote();

    /**
     * Keyboards and Mice Product Categories
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryMouse();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCProductCategoryKeyboard();
}
