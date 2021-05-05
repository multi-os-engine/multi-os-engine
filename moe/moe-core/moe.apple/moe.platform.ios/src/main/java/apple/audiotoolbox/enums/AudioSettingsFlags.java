package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]			AudioSettingsFlags
 * 
 * Constants to be used with kAudioSettings_Hint
 * 				in the kAudioCodecPropertySettings property dictionary.
 * 				Indicates any special characteristics of each parameter within the dictionary, 
 * 
 * [@constant]		kAudioSettingsFlags_ExpertParameter
 * 					If set, then the parameter is an expert parameter.
 * [@constant]		kAudioSettingsFlags_InvisibleParameter
 * 					If set, then the parameter should not be displayed. 
 * [@constant]		kAudioSettingsFlags_MetaParameter
 * 					If set, then changing this parameter may affect the values of other parameters. 
 * 					If not set, then this parameter can be set without affecting the values of other parameters.
 * [@constant]		kAudioSettingsFlags_UserInterfaceParameter
 * 					If set, then this is only a user interface element and not reflected in the codec's bit stream.
 */
@Generated
public final class AudioSettingsFlags {
    @Generated
    private AudioSettingsFlags() {
    }

    @Generated public static final int ExpertParameter = 0x00000001;
    @Generated public static final int InvisibleParameter = 0x00000002;
    @Generated public static final int MetaParameter = 0x00000004;
    @Generated public static final int UserInterfaceParameter = 0x00000008;
}