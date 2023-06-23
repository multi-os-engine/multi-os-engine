package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This file defines a table of standardized key codes, called "HID usages" used by USB keyboards to identify individual
 * keys.
 * 
 * A general note on Usages and languages: Due to the variation of keyboards from language to language, it is not
 * feasible
 * to specify exact key mappings for every language. Where this list is not specific for a key function in a language,
 * the
 * closest equivalent key position should be used, so that a keyboard may be modified for a different language by simply
 * printing
 * different keycaps. One example is the Y key on a North American keyboard. In Germany this is typically Z. Rather than
 * changing
 * the keyboard firmware to put the Z Usage into that place in the descriptor list, the vendor uses the Y Usage on both
 * the North
 * American and German keyboards. This continues to be the existing practice in the industry, in order to minimize the
 * number of
 * changes to the electronics to accommodate other languages.
 * 
 * The following constants are from the USB 'HID Usage Tables' specification, revision 1.1rc3.
 */
@Generated
public final class UIKeyboardHIDUsage {
    @Generated
    private UIKeyboardHIDUsage() {
    }

    /**
     * ErrorRollOver
     */
    @Generated @NInt public static final long KeyboardErrorRollOver = 0x0000000000000001L;
    /**
     * POSTFail
     */
    @Generated @NInt public static final long KeyboardPOSTFail = 0x0000000000000002L;
    /**
     * ErrorUndefined
     */
    @Generated @NInt public static final long KeyboardErrorUndefined = 0x0000000000000003L;
    /**
     * a or A
     */
    @Generated @NInt public static final long KeyboardA = 0x0000000000000004L;
    /**
     * b or B
     */
    @Generated @NInt public static final long KeyboardB = 0x0000000000000005L;
    /**
     * c or C
     */
    @Generated @NInt public static final long KeyboardC = 0x0000000000000006L;
    /**
     * d or D
     */
    @Generated @NInt public static final long KeyboardD = 0x0000000000000007L;
    /**
     * e or E
     */
    @Generated @NInt public static final long KeyboardE = 0x0000000000000008L;
    /**
     * f or F
     */
    @Generated @NInt public static final long KeyboardF = 0x0000000000000009L;
    /**
     * g or G
     */
    @Generated @NInt public static final long KeyboardG = 0x000000000000000AL;
    /**
     * h or H
     */
    @Generated @NInt public static final long KeyboardH = 0x000000000000000BL;
    /**
     * i or I
     */
    @Generated @NInt public static final long KeyboardI = 0x000000000000000CL;
    /**
     * j or J
     */
    @Generated @NInt public static final long KeyboardJ = 0x000000000000000DL;
    /**
     * k or K
     */
    @Generated @NInt public static final long KeyboardK = 0x000000000000000EL;
    /**
     * l or L
     */
    @Generated @NInt public static final long KeyboardL = 0x000000000000000FL;
    /**
     * m or M
     */
    @Generated @NInt public static final long KeyboardM = 0x0000000000000010L;
    /**
     * n or N
     */
    @Generated @NInt public static final long KeyboardN = 0x0000000000000011L;
    /**
     * o or O
     */
    @Generated @NInt public static final long KeyboardO = 0x0000000000000012L;
    /**
     * p or P
     */
    @Generated @NInt public static final long KeyboardP = 0x0000000000000013L;
    /**
     * q or Q
     */
    @Generated @NInt public static final long KeyboardQ = 0x0000000000000014L;
    /**
     * r or R
     */
    @Generated @NInt public static final long KeyboardR = 0x0000000000000015L;
    /**
     * s or S
     */
    @Generated @NInt public static final long KeyboardS = 0x0000000000000016L;
    /**
     * t or T
     */
    @Generated @NInt public static final long KeyboardT = 0x0000000000000017L;
    /**
     * u or U
     */
    @Generated @NInt public static final long KeyboardU = 0x0000000000000018L;
    /**
     * v or V
     */
    @Generated @NInt public static final long KeyboardV = 0x0000000000000019L;
    /**
     * w or W
     */
    @Generated @NInt public static final long KeyboardW = 0x000000000000001AL;
    /**
     * x or X
     */
    @Generated @NInt public static final long KeyboardX = 0x000000000000001BL;
    /**
     * y or Y
     */
    @Generated @NInt public static final long KeyboardY = 0x000000000000001CL;
    /**
     * z or Z
     */
    @Generated @NInt public static final long KeyboardZ = 0x000000000000001DL;
    /**
     * 1 or !
     */
    @Generated @NInt public static final long Keyboard1 = 0x000000000000001EL;
    /**
     * 2 or @
     */
    @Generated @NInt public static final long Keyboard2 = 0x000000000000001FL;
    /**
     * 3 or #
     */
    @Generated @NInt public static final long Keyboard3 = 0x0000000000000020L;
    /**
     * 4 or $
     */
    @Generated @NInt public static final long Keyboard4 = 0x0000000000000021L;
    /**
     * 5 or %
     */
    @Generated @NInt public static final long Keyboard5 = 0x0000000000000022L;
    /**
     * 6 or ^
     */
    @Generated @NInt public static final long Keyboard6 = 0x0000000000000023L;
    /**
     * 7 or &
     */
    @Generated @NInt public static final long Keyboard7 = 0x0000000000000024L;
    /**
     * 8 or *
     */
    @Generated @NInt public static final long Keyboard8 = 0x0000000000000025L;
    /**
     * 9 or (
     */
    @Generated @NInt public static final long Keyboard9 = 0x0000000000000026L;
    /**
     * 0 or )
     */
    @Generated @NInt public static final long Keyboard0 = 0x0000000000000027L;
    /**
     * Return (Enter)
     */
    @Generated @NInt public static final long KeyboardReturnOrEnter = 0x0000000000000028L;
    /**
     * Escape
     */
    @Generated @NInt public static final long KeyboardEscape = 0x0000000000000029L;
    /**
     * Delete (Backspace)
     */
    @Generated @NInt public static final long KeyboardDeleteOrBackspace = 0x000000000000002AL;
    /**
     * Tab
     */
    @Generated @NInt public static final long KeyboardTab = 0x000000000000002BL;
    /**
     * Spacebar
     */
    @Generated @NInt public static final long KeyboardSpacebar = 0x000000000000002CL;
    /**
     * - or _
     */
    @Generated @NInt public static final long KeyboardHyphen = 0x000000000000002DL;
    /**
     * = or +
     */
    @Generated @NInt public static final long KeyboardEqualSign = 0x000000000000002EL;
    /**
     * [ or {
     */
    @Generated @NInt public static final long KeyboardOpenBracket = 0x000000000000002FL;
    /**
     * ] or }
     */
    @Generated @NInt public static final long KeyboardCloseBracket = 0x0000000000000030L;
    /**
     * \ or |
     */
    @Generated @NInt public static final long KeyboardBackslash = 0x0000000000000031L;
    /**
     * Non-US # or _
     * Typical language mappings: US: \| Belg: μ`£ FrCa: <}> Dan:’* Dutch: <> Fren:*μ
     * Ger: #’ Ital: ù§ LatAm: }`] Nor:,* Span: }Ç Swed: ,*
     * Swiss: $£ UK: #~.
     */
    @Generated @NInt public static final long KeyboardNonUSPound = 0x0000000000000032L;
    /**
     * ; or :
     */
    @Generated @NInt public static final long KeyboardSemicolon = 0x0000000000000033L;
    /**
     * ' or "
     */
    @Generated @NInt public static final long KeyboardQuote = 0x0000000000000034L;
    /**
     * Grave Accent and Tilde
     */
    @Generated @NInt public static final long KeyboardGraveAccentAndTilde = 0x0000000000000035L;
    /**
     * , or <
     */
    @Generated @NInt public static final long KeyboardComma = 0x0000000000000036L;
    /**
     * . or >
     */
    @Generated @NInt public static final long KeyboardPeriod = 0x0000000000000037L;
    /**
     * / or ?
     */
    @Generated @NInt public static final long KeyboardSlash = 0x0000000000000038L;
    /**
     * Caps Lock
     */
    @Generated @NInt public static final long KeyboardCapsLock = 0x0000000000000039L;
    /**
     * F1
     */
    @Generated @NInt public static final long KeyboardF1 = 0x000000000000003AL;
    /**
     * F2
     */
    @Generated @NInt public static final long KeyboardF2 = 0x000000000000003BL;
    /**
     * F3
     */
    @Generated @NInt public static final long KeyboardF3 = 0x000000000000003CL;
    /**
     * F4
     */
    @Generated @NInt public static final long KeyboardF4 = 0x000000000000003DL;
    /**
     * F5
     */
    @Generated @NInt public static final long KeyboardF5 = 0x000000000000003EL;
    /**
     * F6
     */
    @Generated @NInt public static final long KeyboardF6 = 0x000000000000003FL;
    /**
     * F7
     */
    @Generated @NInt public static final long KeyboardF7 = 0x0000000000000040L;
    /**
     * F8
     */
    @Generated @NInt public static final long KeyboardF8 = 0x0000000000000041L;
    /**
     * F9
     */
    @Generated @NInt public static final long KeyboardF9 = 0x0000000000000042L;
    /**
     * F10
     */
    @Generated @NInt public static final long KeyboardF10 = 0x0000000000000043L;
    /**
     * F11
     */
    @Generated @NInt public static final long KeyboardF11 = 0x0000000000000044L;
    /**
     * F12
     */
    @Generated @NInt public static final long KeyboardF12 = 0x0000000000000045L;
    /**
     * Print Screen
     */
    @Generated @NInt public static final long KeyboardPrintScreen = 0x0000000000000046L;
    /**
     * Scroll Lock
     */
    @Generated @NInt public static final long KeyboardScrollLock = 0x0000000000000047L;
    /**
     * Pause
     */
    @Generated @NInt public static final long KeyboardPause = 0x0000000000000048L;
    /**
     * Insert
     */
    @Generated @NInt public static final long KeyboardInsert = 0x0000000000000049L;
    /**
     * Home
     */
    @Generated @NInt public static final long KeyboardHome = 0x000000000000004AL;
    /**
     * Page Up
     */
    @Generated @NInt public static final long KeyboardPageUp = 0x000000000000004BL;
    /**
     * Delete Forward
     */
    @Generated @NInt public static final long KeyboardDeleteForward = 0x000000000000004CL;
    /**
     * End
     */
    @Generated @NInt public static final long KeyboardEnd = 0x000000000000004DL;
    /**
     * Page Down
     */
    @Generated @NInt public static final long KeyboardPageDown = 0x000000000000004EL;
    /**
     * Right Arrow
     */
    @Generated @NInt public static final long KeyboardRightArrow = 0x000000000000004FL;
    /**
     * Left Arrow
     */
    @Generated @NInt public static final long KeyboardLeftArrow = 0x0000000000000050L;
    /**
     * Down Arrow
     */
    @Generated @NInt public static final long KeyboardDownArrow = 0x0000000000000051L;
    /**
     * Up Arrow
     */
    @Generated @NInt public static final long KeyboardUpArrow = 0x0000000000000052L;
    /**
     * Keypad NumLock or Clear
     */
    @Generated @NInt public static final long KeypadNumLock = 0x0000000000000053L;
    /**
     * Keypad /
     */
    @Generated @NInt public static final long KeypadSlash = 0x0000000000000054L;
    /**
     * Keypad *
     */
    @Generated @NInt public static final long KeypadAsterisk = 0x0000000000000055L;
    /**
     * Keypad -
     */
    @Generated @NInt public static final long KeypadHyphen = 0x0000000000000056L;
    /**
     * Keypad +
     */
    @Generated @NInt public static final long KeypadPlus = 0x0000000000000057L;
    /**
     * Keypad Enter
     */
    @Generated @NInt public static final long KeypadEnter = 0x0000000000000058L;
    /**
     * Keypad 1 or End
     */
    @Generated @NInt public static final long Keypad1 = 0x0000000000000059L;
    /**
     * Keypad 2 or Down Arrow
     */
    @Generated @NInt public static final long Keypad2 = 0x000000000000005AL;
    /**
     * Keypad 3 or Page Down
     */
    @Generated @NInt public static final long Keypad3 = 0x000000000000005BL;
    /**
     * Keypad 4 or Left Arrow
     */
    @Generated @NInt public static final long Keypad4 = 0x000000000000005CL;
    /**
     * Keypad 5
     */
    @Generated @NInt public static final long Keypad5 = 0x000000000000005DL;
    /**
     * Keypad 6 or Right Arrow
     */
    @Generated @NInt public static final long Keypad6 = 0x000000000000005EL;
    /**
     * Keypad 7 or Home
     */
    @Generated @NInt public static final long Keypad7 = 0x000000000000005FL;
    /**
     * Keypad 8 or Up Arrow
     */
    @Generated @NInt public static final long Keypad8 = 0x0000000000000060L;
    /**
     * Keypad 9 or Page Up
     */
    @Generated @NInt public static final long Keypad9 = 0x0000000000000061L;
    /**
     * Keypad 0 or Insert
     */
    @Generated @NInt public static final long Keypad0 = 0x0000000000000062L;
    /**
     * Keypad . or Delete
     */
    @Generated @NInt public static final long KeypadPeriod = 0x0000000000000063L;
    /**
     * Non-US \ or |
     * On Apple ISO keyboards, this is the section symbol (§/±)
     * Typical language mappings: Belg:<\> FrCa:«°» Dan:<\> Dutch:]|[ Fren:<> Ger:<|>
     * Ital:<> LatAm:<> Nor:<> Span:<> Swed:<|> Swiss:<\>
     * UK:\| Brazil: \|.
     */
    @Generated @NInt public static final long KeyboardNonUSBackslash = 0x0000000000000064L;
    /**
     * Application
     */
    @Generated @NInt public static final long KeyboardApplication = 0x0000000000000065L;
    /**
     * Power
     */
    @Generated @NInt public static final long KeyboardPower = 0x0000000000000066L;
    /**
     * Keypad =
     */
    @Generated @NInt public static final long KeypadEqualSign = 0x0000000000000067L;
    /**
     * F13
     */
    @Generated @NInt public static final long KeyboardF13 = 0x0000000000000068L;
    /**
     * F14
     */
    @Generated @NInt public static final long KeyboardF14 = 0x0000000000000069L;
    /**
     * F15
     */
    @Generated @NInt public static final long KeyboardF15 = 0x000000000000006AL;
    /**
     * F16
     */
    @Generated @NInt public static final long KeyboardF16 = 0x000000000000006BL;
    /**
     * F17
     */
    @Generated @NInt public static final long KeyboardF17 = 0x000000000000006CL;
    /**
     * F18
     */
    @Generated @NInt public static final long KeyboardF18 = 0x000000000000006DL;
    /**
     * F19
     */
    @Generated @NInt public static final long KeyboardF19 = 0x000000000000006EL;
    /**
     * F20
     */
    @Generated @NInt public static final long KeyboardF20 = 0x000000000000006FL;
    /**
     * F21
     */
    @Generated @NInt public static final long KeyboardF21 = 0x0000000000000070L;
    /**
     * F22
     */
    @Generated @NInt public static final long KeyboardF22 = 0x0000000000000071L;
    /**
     * F23
     */
    @Generated @NInt public static final long KeyboardF23 = 0x0000000000000072L;
    /**
     * F24
     */
    @Generated @NInt public static final long KeyboardF24 = 0x0000000000000073L;
    /**
     * Execute
     */
    @Generated @NInt public static final long KeyboardExecute = 0x0000000000000074L;
    /**
     * Help
     */
    @Generated @NInt public static final long KeyboardHelp = 0x0000000000000075L;
    /**
     * Menu
     */
    @Generated @NInt public static final long KeyboardMenu = 0x0000000000000076L;
    /**
     * Select
     */
    @Generated @NInt public static final long KeyboardSelect = 0x0000000000000077L;
    /**
     * Stop
     */
    @Generated @NInt public static final long KeyboardStop = 0x0000000000000078L;
    /**
     * Again
     */
    @Generated @NInt public static final long KeyboardAgain = 0x0000000000000079L;
    /**
     * Undo
     */
    @Generated @NInt public static final long KeyboardUndo = 0x000000000000007AL;
    /**
     * Cut
     */
    @Generated @NInt public static final long KeyboardCut = 0x000000000000007BL;
    /**
     * Copy
     */
    @Generated @NInt public static final long KeyboardCopy = 0x000000000000007CL;
    /**
     * Paste
     */
    @Generated @NInt public static final long KeyboardPaste = 0x000000000000007DL;
    /**
     * Find
     */
    @Generated @NInt public static final long KeyboardFind = 0x000000000000007EL;
    /**
     * Mute
     */
    @Generated @NInt public static final long KeyboardMute = 0x000000000000007FL;
    /**
     * Volume Up
     */
    @Generated @NInt public static final long KeyboardVolumeUp = 0x0000000000000080L;
    /**
     * Volume Down
     */
    @Generated @NInt public static final long KeyboardVolumeDown = 0x0000000000000081L;
    /**
     * Locking Caps Lock
     */
    @Generated @NInt public static final long KeyboardLockingCapsLock = 0x0000000000000082L;
    /**
     * Locking Num Lock
     * Implemented as a locking key; sent as a toggle button. Available for legacy support;
     * however, most systems should use the non-locking version of this key.
     */
    @Generated @NInt public static final long KeyboardLockingNumLock = 0x0000000000000083L;
    /**
     * Locking Scroll Lock
     */
    @Generated @NInt public static final long KeyboardLockingScrollLock = 0x0000000000000084L;
    /**
     * Keypad Comma
     */
    @Generated @NInt public static final long KeypadComma = 0x0000000000000085L;
    /**
     * Keypad Equal Sign for AS/400
     */
    @Generated @NInt public static final long KeypadEqualSignAS400 = 0x0000000000000086L;
    /**
     * International1
     */
    @Generated @NInt public static final long KeyboardInternational1 = 0x0000000000000087L;
    /**
     * International2
     */
    @Generated @NInt public static final long KeyboardInternational2 = 0x0000000000000088L;
    /**
     * International3
     */
    @Generated @NInt public static final long KeyboardInternational3 = 0x0000000000000089L;
    /**
     * International4
     */
    @Generated @NInt public static final long KeyboardInternational4 = 0x000000000000008AL;
    /**
     * International5
     */
    @Generated @NInt public static final long KeyboardInternational5 = 0x000000000000008BL;
    /**
     * International6
     */
    @Generated @NInt public static final long KeyboardInternational6 = 0x000000000000008CL;
    /**
     * International7
     */
    @Generated @NInt public static final long KeyboardInternational7 = 0x000000000000008DL;
    /**
     * International8
     */
    @Generated @NInt public static final long KeyboardInternational8 = 0x000000000000008EL;
    /**
     * International9
     */
    @Generated @NInt public static final long KeyboardInternational9 = 0x000000000000008FL;
    /**
     * LANG1
     */
    @Generated @NInt public static final long KeyboardLANG1 = 0x0000000000000090L;
    /**
     * LANG2
     */
    @Generated @NInt public static final long KeyboardLANG2 = 0x0000000000000091L;
    /**
     * LANG3
     */
    @Generated @NInt public static final long KeyboardLANG3 = 0x0000000000000092L;
    /**
     * LANG4
     */
    @Generated @NInt public static final long KeyboardLANG4 = 0x0000000000000093L;
    /**
     * LANG5
     */
    @Generated @NInt public static final long KeyboardLANG5 = 0x0000000000000094L;
    /**
     * LANG6
     */
    @Generated @NInt public static final long KeyboardLANG6 = 0x0000000000000095L;
    /**
     * LANG7
     */
    @Generated @NInt public static final long KeyboardLANG7 = 0x0000000000000096L;
    /**
     * LANG8
     */
    @Generated @NInt public static final long KeyboardLANG8 = 0x0000000000000097L;
    /**
     * LANG9
     */
    @Generated @NInt public static final long KeyboardLANG9 = 0x0000000000000098L;
    /**
     * AlternateErase
     */
    @Generated @NInt public static final long KeyboardAlternateErase = 0x0000000000000099L;
    /**
     * SysReq/Attention
     */
    @Generated @NInt public static final long KeyboardSysReqOrAttention = 0x000000000000009AL;
    /**
     * Cancel
     */
    @Generated @NInt public static final long KeyboardCancel = 0x000000000000009BL;
    /**
     * Clear
     */
    @Generated @NInt public static final long KeyboardClear = 0x000000000000009CL;
    /**
     * Prior
     */
    @Generated @NInt public static final long KeyboardPrior = 0x000000000000009DL;
    /**
     * Return
     */
    @Generated @NInt public static final long KeyboardReturn = 0x000000000000009EL;
    /**
     * Separator
     */
    @Generated @NInt public static final long KeyboardSeparator = 0x000000000000009FL;
    /**
     * Out
     */
    @Generated @NInt public static final long KeyboardOut = 0x00000000000000A0L;
    /**
     * Oper
     */
    @Generated @NInt public static final long KeyboardOper = 0x00000000000000A1L;
    /**
     * Clear/Again
     */
    @Generated @NInt public static final long KeyboardClearOrAgain = 0x00000000000000A2L;
    /**
     * CrSel/Props
     */
    @Generated @NInt public static final long KeyboardCrSelOrProps = 0x00000000000000A3L;
    /**
     * ExSel
     */
    @Generated @NInt public static final long KeyboardExSel = 0x00000000000000A4L;
    /**
     * Left Control
     */
    @Generated @NInt public static final long KeyboardLeftControl = 0x00000000000000E0L;
    /**
     * Left Shift
     */
    @Generated @NInt public static final long KeyboardLeftShift = 0x00000000000000E1L;
    /**
     * Left Alt
     */
    @Generated @NInt public static final long KeyboardLeftAlt = 0x00000000000000E2L;
    /**
     * Left GUI
     */
    @Generated @NInt public static final long KeyboardLeftGUI = 0x00000000000000E3L;
    /**
     * Right Control
     */
    @Generated @NInt public static final long KeyboardRightControl = 0x00000000000000E4L;
    /**
     * Right Shift
     */
    @Generated @NInt public static final long KeyboardRightShift = 0x00000000000000E5L;
    /**
     * Right Alt
     */
    @Generated @NInt public static final long KeyboardRightAlt = 0x00000000000000E6L;
    /**
     * Right GUI
     */
    @Generated @NInt public static final long KeyboardRightGUI = 0x00000000000000E7L;
    /**
     * 0xE8-0xFFFF: Reserved
     */
    @Generated @NInt public static final long Keyboard_Reserved = 0x000000000000FFFFL;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardHangul = 0x0000000000000090L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardHanja = 0x0000000000000091L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardKanaSwitch = 0x0000000000000090L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardAlphanumericSwitch = 0x0000000000000091L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardKatakana = 0x0000000000000092L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardHiragana = 0x0000000000000093L;
    /**
     * Helpful aliases
     */
    @Generated @NInt public static final long KeyboardZenkakuHankakuKanji = 0x0000000000000094L;
}
