package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVAudioSessionErrorCode {
    @Generated
    private AVAudioSessionErrorCode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long MediaServicesFailed = 0x000000006D737276L;
    @Generated @NInt public static final long IsBusy = 0x0000000021616374L;
    @Generated @NInt public static final long IncompatibleCategory = 0x0000000021636174L;
    @Generated @NInt public static final long CannotInterruptOthers = 0x0000000021696E74L;
    @Generated @NInt public static final long MissingEntitlement = 0x00000000656E743FL;
    @Generated @NInt public static final long SiriIsRecording = 0x0000000073697269L;
    @Generated @NInt public static final long CannotStartPlaying = 0x0000000021706C61L;
    @Generated @NInt public static final long CannotStartRecording = 0x0000000021726563L;
    @Generated @NInt public static final long BadParam = 0xFFFFFFFFFFFFFFCEL;
    @Generated @NInt public static final long InsufficientPriority = 0x0000000021707269L;
    @Generated @NInt public static final long ResourceNotAvailable = 0x0000000021726573L;
    @Generated @NInt public static final long Unspecified = 0x0000000077686174L;
    @Generated @NInt public static final long ExpiredSession = 0x0000000021736573L;
    @Generated @NInt public static final long SessionNotActive = 0x00000000696E6163L;
}