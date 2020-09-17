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

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyA();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyB();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyC();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyD();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyE();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyF();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyG();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyH();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyI();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyJ();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyK();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyL();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyM();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyN();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyO();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyP();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyQ();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyR();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyS();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyT();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyU();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyV();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyW();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyX();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyY();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeyZ();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOne();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTwo();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeThree();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFour();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeFive();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSix();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSeven();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEight();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNine();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeZero();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeReturnOrEnter();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEscape();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteOrBackspace();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeTab();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSpacebar();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHyphen();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEqualSign();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeOpenBracket();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCloseBracket();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeBackslash();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSPound();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSemicolon();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeQuote();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeGraveAccentAndTilde();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeComma();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePeriod();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeSlash();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeCapsLock();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF1();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF2();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF3();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF4();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF5();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF6();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF7();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF8();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF9();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF10();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF11();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeF12();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePrintScreen();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeScrollLock();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePause();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInsert();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeHome();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageUp();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDeleteForward();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeEnd();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePageDown();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightArrow();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftArrow();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeDownArrow();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeUpArrow();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadNumLock();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadSlash();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadAsterisk();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadHyphen();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPlus();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEnter();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad1();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad2();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad3();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad4();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad5();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad6();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad7();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad8();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad9();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypad0();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadPeriod();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeKeypadEqualSign();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeNonUSBackslash();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeApplication();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodePower();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational1();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational2();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational3();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational4();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational5();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational6();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational7();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational8();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeInternational9();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG1();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG2();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG3();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG4();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG5();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG6();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG7();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG8();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLANG9();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftControl();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftShift();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftAlt();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeLeftGUI();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightControl();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightShift();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightAlt();

    @Generated
    @CVariable()
    @NInt
    public static native long GCKeyCodeRightGUI();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyA();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyB();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyD();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyE();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyG();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyH();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyI();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyJ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyK();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyM();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyN();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyO();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyR();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyS();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyT();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyU();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyV();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyW();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyX();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyY();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZ();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOne();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTwo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyThree();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFour();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyFive();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySeven();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNine();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyZero();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyReturnOrEnter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEscape();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteOrBackspace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyTab();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySpacebar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHyphen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEqualSign();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyOpenBracket();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCloseBracket();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyBackslash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSPound();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySemicolon();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyQuote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyGraveAccentAndTilde();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyComma();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPeriod();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeySlash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyCapsLock();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF10();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF11();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyF12();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPrintScreen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyScrollLock();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPause();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInsert();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyHome();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageUp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDeleteForward();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyEnd();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPageDown();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyDownArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyUpArrow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadNumLock();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadSlash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadAsterisk();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadHyphen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPlus();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEnter();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypad0();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadPeriod();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyKeypadEqualSign();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyNonUSBackslash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyApplication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyPower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyInternational9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG6();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG7();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLANG9();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftShift();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftAlt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyLeftGUI();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightControl();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightShift();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightAlt();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyRightGUI();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidBecomeCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCControllerDidStopBeingCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCKeyboardDidDisconnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidConnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidDisconnectNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidBecomeCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCMouseDidStopBeingCurrentNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String GCHapticsLocalityDefault();

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
}
