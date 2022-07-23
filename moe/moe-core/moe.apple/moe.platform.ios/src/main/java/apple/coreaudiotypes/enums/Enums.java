package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class Enums {
    @Generated
    private Enums() {
    }

    /**
     * < use the array of AudioChannelDescriptions to define the mapping.
     */
    @Generated public static final int kAudioChannelLayoutTag_UseChannelDescriptions = 0x00000000;
    /**
     * < use the bitmap to define the mapping.
     */
    @Generated public static final int kAudioChannelLayoutTag_UseChannelBitmap = 0x00010000;
    /**
     * < a standard mono stream
     */
    @Generated public static final int kAudioChannelLayoutTag_Mono = 0x00640001;
    /**
     * < a standard stereo stream (L R) - implied playback
     */
    @Generated public static final int kAudioChannelLayoutTag_Stereo = 0x00650002;
    /**
     * < a standard stereo stream (L R) - implied headphone playback
     */
    @Generated public static final int kAudioChannelLayoutTag_StereoHeadphones = 0x00660002;
    /**
     * < a matrix encoded stereo stream (Lt, Rt)
     */
    @Generated public static final int kAudioChannelLayoutTag_MatrixStereo = 0x00670002;
    /**
     * < mid/side recording
     */
    @Generated public static final int kAudioChannelLayoutTag_MidSide = 0x00680002;
    /**
     * < coincident mic pair (often 2 figure 8's)
     */
    @Generated public static final int kAudioChannelLayoutTag_XY = 0x00690002;
    /**
     * < binaural stereo (left, right)
     */
    @Generated public static final int kAudioChannelLayoutTag_Binaural = 0x006A0002;
    /**
     * < W, X, Y, Z
     */
    @Generated public static final int kAudioChannelLayoutTag_Ambisonic_B_Format = 0x006B0004;
    /**
     * < L R Ls Rs -- 90 degree speaker separation
     */
    @Generated public static final int kAudioChannelLayoutTag_Quadraphonic = 0x006C0004;
    /**
     * < L R Ls Rs C -- 72 degree speaker separation
     */
    @Generated public static final int kAudioChannelLayoutTag_Pentagonal = 0x006D0005;
    /**
     * < L R Ls Rs C Cs -- 60 degree speaker separation
     */
    @Generated public static final int kAudioChannelLayoutTag_Hexagonal = 0x006E0006;
    /**
     * < L R Ls Rs C Cs Lw Rw -- 45 degree speaker separation
     */
    @Generated public static final int kAudioChannelLayoutTag_Octagonal = 0x006F0008;
    /**
     * < left, right, rear left, rear right
     * < top left, top right, top rear left, top rear right
     */
    @Generated public static final int kAudioChannelLayoutTag_Cube = 0x00700008;
    /**
     * < C
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_1_0 = 0x00640001;
    /**
     * < L R
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_2_0 = 0x00650002;
    /**
     * < L R C
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_3_0_A = 0x00710003;
    /**
     * < C L R
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_3_0_B = 0x00720003;
    /**
     * < L R C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_4_0_A = 0x00730004;
    /**
     * < C L R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_4_0_B = 0x00740004;
    /**
     * < L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_0_A = 0x00750005;
    /**
     * < L R Ls Rs C
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_0_B = 0x00760005;
    /**
     * < L C R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_0_C = 0x00770005;
    /**
     * < C L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_0_D = 0x00780005;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_1_A = 0x00790006;
    /**
     * < L R Ls Rs C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_1_B = 0x007A0006;
    /**
     * < L C R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_1_C = 0x007B0006;
    /**
     * < C L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_5_1_D = 0x007C0006;
    /**
     * < L R C LFE Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_6_1_A = 0x007D0007;
    /**
     * < L R C LFE Ls Rs Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_7_1_A = 0x007E0008;
    /**
     * < C Lc Rc L R Ls Rs LFE (doc: IS-13818-7 MPEG2-AAC Table 3.1)
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_7_1_B = 0x007F0008;
    /**
     * < L R C LFE Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_MPEG_7_1_C = 0x00800008;
    /**
     * < L R Ls Rs C LFE Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_Emagic_Default_7_1 = 0x00810008;
    /**
     * < L R C LFE Ls Rs Lt Rt
     * < (kAudioChannelLayoutTag_ITU_5_1 plus a matrix encoded stereo mix)
     */
    @Generated public static final int kAudioChannelLayoutTag_SMPTE_DTV = 0x00820008;
    /**
     * < C
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_1_0 = 0x00640001;
    /**
     * < L R
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_2_0 = 0x00650002;
    /**
     * < L R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_2_1 = 0x00830003;
    /**
     * < L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_2_2 = 0x00840004;
    /**
     * < L R C
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_3_0 = 0x00710003;
    /**
     * < L R C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_3_1 = 0x00730004;
    /**
     * < L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_3_2 = 0x00750005;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_3_2_1 = 0x00790006;
    /**
     * < L R C LFE Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_ITU_3_4_1 = 0x00800008;
    /**
     * < C (mono)
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_0 = 0x00640001;
    /**
     * < L R
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_1 = 0x00650002;
    /**
     * < L R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_2 = 0x00830003;
    /**
     * < L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_3 = 0x00840004;
    /**
     * < L R LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_4 = 0x00850003;
    /**
     * < L R LFE Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_5 = 0x00860004;
    /**
     * < L R LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_6 = 0x00870005;
    /**
     * < L R C
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_7 = 0x00710003;
    /**
     * < L R C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_8 = 0x00730004;
    /**
     * < L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_9 = 0x00750005;
    /**
     * < L R C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_10 = 0x00880004;
    /**
     * < L R C LFE Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_11 = 0x00890005;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_12 = 0x00790006;
    /**
     * < L R C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_13 = 0x00730004;
    /**
     * < L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_14 = 0x00750005;
    /**
     * < L R C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_15 = 0x00880004;
    /**
     * < L R C LFE Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_16 = 0x00890005;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_17 = 0x00790006;
    /**
     * < L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_18 = 0x008A0005;
    /**
     * < L R Ls Rs C
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_19 = 0x00760005;
    /**
     * < L R Ls Rs C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DVD_20 = 0x007A0006;
    /**
     * These layouts are recommended for AudioUnit usage
     * These are the symmetrical layouts
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_4 = 0x006C0004;
    /**
     * These layouts are recommended for AudioUnit usage
     * These are the symmetrical layouts
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_5 = 0x006D0005;
    /**
     * These layouts are recommended for AudioUnit usage
     * These are the symmetrical layouts
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_6 = 0x006E0006;
    /**
     * These layouts are recommended for AudioUnit usage
     * These are the symmetrical layouts
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_8 = 0x006F0008;
    /**
     * < L R Ls Rs C
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_5_0 = 0x00760005;
    /**
     * < L R Ls Rs C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_6_0 = 0x008B0006;
    /**
     * < L R Ls Rs C Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_7_0 = 0x008C0007;
    /**
     * < L R Ls Rs C Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_7_0_Front = 0x00940007;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_5_1 = 0x00790006;
    /**
     * < L R C LFE Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_6_1 = 0x007D0007;
    /**
     * < L R C LFE Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_7_1 = 0x00800008;
    /**
     * < L R C LFE Ls Rs Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_AudioUnit_7_1_Front = 0x007E0008;
    /**
     * < C L R
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_3_0 = 0x00720003;
    /**
     * < L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_Quadraphonic = 0x006C0004;
    /**
     * < C L R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_4_0 = 0x00740004;
    /**
     * < C L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_5_0 = 0x00780005;
    /**
     * < C L R Ls Rs Lfe
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_5_1 = 0x007C0006;
    /**
     * < C L R Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_6_0 = 0x008D0006;
    /**
     * < C L R Ls Rs Cs Lfe
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_6_1 = 0x008E0007;
    /**
     * < C L R Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_7_0 = 0x008F0007;
    /**
     * < C Lc Rc L R Ls Rs Lfe
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_7_1 = 0x007F0008;
    /**
     * < C L R Ls Rs Rls Rrs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_7_1_B = 0x00B70008;
    /**
     * < C L R Ls Rs LFE Vhl Vhr
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_7_1_C = 0x00B80008;
    /**
     * < C L R Ls Rs Rls Rrs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AAC_Octagonal = 0x00900008;
    /**
     * < L R C Vhc Lsd Rsd Ls Rs Vhl Vhr Lw Rw Csd Cs LFE1 LFE2
     */
    @Generated public static final int kAudioChannelLayoutTag_TMH_10_2_std = 0x00910010;
    /**
     * < TMH_10_2_std plus: Lc Rc HI VI Haptic
     */
    @Generated public static final int kAudioChannelLayoutTag_TMH_10_2_full = 0x00920015;
    /**
     * < C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_1_0_1 = 0x00950002;
    /**
     * < L C R
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_3_0 = 0x00960003;
    /**
     * < L C R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_3_1 = 0x00970004;
    /**
     * < L C R LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_3_0_1 = 0x00980004;
    /**
     * < L R Cs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_2_1_1 = 0x00990004;
    /**
     * < L C R Cs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_AC3_3_1_1 = 0x009A0005;
    /**
     * < L C R Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC_6_0_A = 0x009B0006;
    /**
     * < L C R Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC_7_0_A = 0x009C0007;
    /**
     * < L C R Ls Rs LFE Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_6_1_A = 0x009D0007;
    /**
     * < L C R Ls Rs LFE Ts
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_6_1_B = 0x009E0007;
    /**
     * < L C R Ls Rs LFE Vhc
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_6_1_C = 0x009F0007;
    /**
     * < L C R Ls Rs LFE Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_A = 0x00A00008;
    /**
     * < L C R Ls Rs LFE Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_B = 0x00A10008;
    /**
     * < L C R Ls Rs LFE Lsd Rsd
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_C = 0x00A20008;
    /**
     * < L C R Ls Rs LFE Lw Rw
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_D = 0x00A30008;
    /**
     * < L C R Ls Rs LFE Vhl Vhr
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_E = 0x00A40008;
    /**
     * < L C R Ls Rs LFE Cs Ts
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_F = 0x00A50008;
    /**
     * < L C R Ls Rs LFE Cs Vhc
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_G = 0x00A60008;
    /**
     * < L C R Ls Rs LFE Ts Vhc
     */
    @Generated public static final int kAudioChannelLayoutTag_EAC3_7_1_H = 0x00A70008;
    /**
     * < C L R LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_3_1 = 0x00A80004;
    /**
     * < C L R Cs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_4_1 = 0x00A90005;
    /**
     * < Lc Rc L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_0_A = 0x00AA0006;
    /**
     * < C L R Rls Rrs Ts
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_0_B = 0x00AB0006;
    /**
     * < C Cs L R Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_0_C = 0x00AC0006;
    /**
     * < Lc Rc L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_1_A = 0x00AD0007;
    /**
     * < C L R Rls Rrs Ts LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_1_B = 0x00AE0007;
    /**
     * < C Cs L R Rls Rrs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_1_C = 0x00AF0007;
    /**
     * < Lc C Rc L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_7_0 = 0x00B00007;
    /**
     * < Lc C Rc L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_7_1 = 0x00B10008;
    /**
     * < Lc Rc L R Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_8_0_A = 0x00B20008;
    /**
     * < Lc C Rc L R Ls Cs Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_8_0_B = 0x00B30008;
    /**
     * < Lc Rc L R Ls Rs Rls Rrs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_8_1_A = 0x00B40009;
    /**
     * < Lc C Rc L R Ls Cs Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_8_1_B = 0x00B50009;
    /**
     * < C L R Ls Rs LFE Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_DTS_6_1_D = 0x00B60007;
    /**
     * < 3 channels, L R LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_2_1 = 0x00850003;
    /**
     * < 3 channels, L R C
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_3_0 = 0x00710003;
    /**
     * < 4 channels, L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_4_0_A = 0x00840004;
    /**
     * < 4 channels, L R Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_4_0_B = 0x00B90004;
    /**
     * < 5 channels, L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_5_0_A = 0x00750005;
    /**
     * < 5 channels, L R C Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_5_0_B = 0x00BA0005;
    /**
     * < 6 channels, L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_5_1_A = 0x00790006;
    /**
     * < 6 channels, L R C LFE Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_5_1_B = 0x00BB0006;
    /**
     * < 7 channels, L R C LFE Cs Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_6_1 = 0x00BC0007;
    /**
     * < 8 channels, L R C LFE Rls Rrs Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_WAVE_7_1 = 0x00BD0008;
    /**
     * < Higher Order Ambisonics, Ambisonics Channel Number, SN3D normalization
     * < needs to be ORed with the actual number of channels (not the HOA order)
     */
    @Generated public static final int kAudioChannelLayoutTag_HOA_ACN_SN3D = 0x00BE0000;
    /**
     * < Higher Order Ambisonics, Ambisonics Channel Number, N3D normalization
     * < needs to be ORed with the actual number of channels (not the HOA order)
     */
    @Generated public static final int kAudioChannelLayoutTag_HOA_ACN_N3D = 0x00BF0000;
    /**
     * < L R C LFE Ls Rs Rls Rrs Vhl Vhr Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Atmos_7_1_4 = 0x00C0000C;
    /**
     * < L R C LFE Ls Rs Rls Rrs Lw Rw Vhl Vhr Ltm Rtm Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Atmos_9_1_6 = 0x00C10010;
    /**
     * < L R C LFE Ls Rs Ltm Rtm
     */
    @Generated public static final int kAudioChannelLayoutTag_Atmos_5_1_2 = 0x00C20008;
    /**
     * < needs to be ORed with the actual number of channels
     */
    @Generated public static final int kAudioChannelLayoutTag_DiscreteInOrder = 0x00930000;
    /**
     * < Channel layout tag values in this range are reserved for internal use
     */
    @Generated public static final int kAudioChannelLayoutTag_BeginReserved = 0xF0000000;
    @Generated public static final int kAudioChannelLayoutTag_EndReserved = 0xFFFEFFFF;
    /**
     * < needs to be ORed with the actual number of channels
     */
    @Generated public static final int kAudioChannelLayoutTag_Unknown = 0xFFFF0000;
    @Generated public static final int AVAudioSessionErrorInsufficientPriority = 0x21707269;
    @Generated public static final int kAudioFormatLinearPCM = 0x6C70636D;
    @Generated public static final int kAudioFormatAC3 = 0x61632D33;
    @Generated public static final int kAudioFormat60958AC3 = 0x63616333;
    @Generated public static final int kAudioFormatAppleIMA4 = 0x696D6134;
    @Generated public static final int kAudioFormatMPEG4AAC = 0x61616320;
    @Generated public static final int kAudioFormatMPEG4CELP = 0x63656C70;
    @Generated public static final int kAudioFormatMPEG4HVXC = 0x68767863;
    @Generated public static final int kAudioFormatMPEG4TwinVQ = 0x74777671;
    @Generated public static final int kAudioFormatMACE3 = 0x4D414333;
    @Generated public static final int kAudioFormatMACE6 = 0x4D414336;
    @Generated public static final int kAudioFormatULaw = 0x756C6177;
    @Generated public static final int kAudioFormatALaw = 0x616C6177;
    @Generated public static final int kAudioFormatQDesign = 0x51444D43;
    @Generated public static final int kAudioFormatQDesign2 = 0x51444D32;
    @Generated public static final int kAudioFormatQUALCOMM = 0x51636C70;
    @Generated public static final int kAudioFormatMPEGLayer1 = 0x2E6D7031;
    @Generated public static final int kAudioFormatMPEGLayer2 = 0x2E6D7032;
    @Generated public static final int kAudioFormatMPEGLayer3 = 0x2E6D7033;
    @Generated public static final int kAudioFormatTimeCode = 0x74696D65;
    @Generated public static final int kAudioFormatMIDIStream = 0x6D696469;
    @Generated public static final int kAudioFormatParameterValueStream = 0x61707673;
    @Generated public static final int kAudioFormatAppleLossless = 0x616C6163;
    @Generated public static final int kAudioFormatMPEG4AAC_HE = 0x61616368;
    @Generated public static final int kAudioFormatMPEG4AAC_LD = 0x6161636C;
    @Generated public static final int kAudioFormatMPEG4AAC_ELD = 0x61616365;
    @Generated public static final int kAudioFormatMPEG4AAC_ELD_SBR = 0x61616366;
    @Generated public static final int kAudioFormatMPEG4AAC_ELD_V2 = 0x61616367;
    @Generated public static final int kAudioFormatMPEG4AAC_HE_V2 = 0x61616370;
    @Generated public static final int kAudioFormatMPEG4AAC_Spatial = 0x61616373;
    @Generated public static final int kAudioFormatMPEGD_USAC = 0x75736163;
    @Generated public static final int kAudioFormatAMR = 0x73616D72;
    @Generated public static final int kAudioFormatAMR_WB = 0x73617762;
    @Generated public static final int kAudioFormatAudible = 0x41554442;
    @Generated public static final int kAudioFormatiLBC = 0x696C6263;
    @Generated public static final int kAudioFormatDVIIntelIMA = 0x6D730011;
    @Generated public static final int kAudioFormatMicrosoftGSM = 0x6D730031;
    @Generated public static final int kAudioFormatAES3 = 0x61657333;
    @Generated public static final int kAudioFormatEnhancedAC3 = 0x65632D33;
    @Generated public static final int kAudioFormatFLAC = 0x666C6163;
    @Generated public static final int kAudioFormatOpus = 0x6F707573;
    @Generated public static final int kAudioFormatFlagsNativeEndian = 0x00000000;
    @Deprecated @Generated public static final int kAudioFormatFlagsCanonical = 0x0000000C;
    @Deprecated @Generated public static final int kAudioFormatFlagsAudioUnitCanonical = 0x00000C2C;
    @Generated public static final int kAudioFormatFlagsNativeFloatPacked = 0x00000009;
    @Generated public static final int kAudio_UnimplementedError = 0xFFFFFFFC;
    @Generated public static final int kAudio_FileNotFoundError = 0xFFFFFFD5;
    @Generated public static final int kAudio_FilePermissionError = 0xFFFFFFCA;
    @Generated public static final int kAudio_TooManyFilesOpenError = 0xFFFFFFD6;
    /**
     * 0x21707468, 561017960
     */
    @Generated public static final int kAudio_BadFilePathError = 0x21707468;
    @Generated public static final int kAudio_ParamError = 0xFFFFFFCE;
    @Generated public static final int kAudio_MemFullError = 0xFFFFFF94;
    /**
     * < unknown or unspecified other use
     */
    @Generated public static final int kAudioChannelLabel_Unknown = 0xFFFFFFFF;
    /**
     * < channel is present, but has no intended use or destination
     */
    @Generated public static final int kAudioChannelLabel_Unused = 0x00000000;
    /**
     * < channel is described by the mCoordinates fields.
     */
    @Generated public static final int kAudioChannelLabel_UseCoordinates = 0x00000064;
    @Generated public static final int kAudioChannelLabel_Left = 0x00000001;
    @Generated public static final int kAudioChannelLabel_Right = 0x00000002;
    @Generated public static final int kAudioChannelLabel_Center = 0x00000003;
    @Generated public static final int kAudioChannelLabel_LFEScreen = 0x00000004;
    @Generated public static final int kAudioChannelLabel_LeftSurround = 0x00000005;
    @Generated public static final int kAudioChannelLabel_RightSurround = 0x00000006;
    @Generated public static final int kAudioChannelLabel_LeftCenter = 0x00000007;
    @Generated public static final int kAudioChannelLabel_RightCenter = 0x00000008;
    /**
     * < WAVE: "Back Center" or plain "Rear Surround"
     */
    @Generated public static final int kAudioChannelLabel_CenterSurround = 0x00000009;
    @Generated public static final int kAudioChannelLabel_LeftSurroundDirect = 0x0000000A;
    @Generated public static final int kAudioChannelLabel_RightSurroundDirect = 0x0000000B;
    @Generated public static final int kAudioChannelLabel_TopCenterSurround = 0x0000000C;
    /**
     * < WAVE: "Top Front Left"
     */
    @Generated public static final int kAudioChannelLabel_VerticalHeightLeft = 0x0000000D;
    /**
     * < WAVE: "Top Front Center"
     */
    @Generated public static final int kAudioChannelLabel_VerticalHeightCenter = 0x0000000E;
    /**
     * < WAVE: "Top Front Right"
     */
    @Generated public static final int kAudioChannelLabel_VerticalHeightRight = 0x0000000F;
    @Generated public static final int kAudioChannelLabel_TopBackLeft = 0x00000010;
    @Generated public static final int kAudioChannelLabel_TopBackCenter = 0x00000011;
    @Generated public static final int kAudioChannelLabel_TopBackRight = 0x00000012;
    @Generated public static final int kAudioChannelLabel_RearSurroundLeft = 0x00000021;
    @Generated public static final int kAudioChannelLabel_RearSurroundRight = 0x00000022;
    @Generated public static final int kAudioChannelLabel_LeftWide = 0x00000023;
    @Generated public static final int kAudioChannelLabel_RightWide = 0x00000024;
    @Generated public static final int kAudioChannelLabel_LFE2 = 0x00000025;
    /**
     * < matrix encoded 4 channels
     */
    @Generated public static final int kAudioChannelLabel_LeftTotal = 0x00000026;
    /**
     * < matrix encoded 4 channels
     */
    @Generated public static final int kAudioChannelLabel_RightTotal = 0x00000027;
    @Generated public static final int kAudioChannelLabel_HearingImpaired = 0x00000028;
    @Generated public static final int kAudioChannelLabel_Narration = 0x00000029;
    @Generated public static final int kAudioChannelLabel_Mono = 0x0000002A;
    @Generated public static final int kAudioChannelLabel_DialogCentricMix = 0x0000002B;
    /**
     * < back center, non diffuse
     */
    @Generated public static final int kAudioChannelLabel_CenterSurroundDirect = 0x0000002C;
    @Generated public static final int kAudioChannelLabel_Haptic = 0x0000002D;
    @Generated public static final int kAudioChannelLabel_LeftTopFront = 0x0000000D;
    @Generated public static final int kAudioChannelLabel_CenterTopFront = 0x0000000E;
    @Generated public static final int kAudioChannelLabel_RightTopFront = 0x0000000F;
    @Generated public static final int kAudioChannelLabel_LeftTopMiddle = 0x00000031;
    @Generated public static final int kAudioChannelLabel_CenterTopMiddle = 0x0000000C;
    @Generated public static final int kAudioChannelLabel_RightTopMiddle = 0x00000033;
    @Generated public static final int kAudioChannelLabel_LeftTopRear = 0x00000034;
    @Generated public static final int kAudioChannelLabel_CenterTopRear = 0x00000035;
    @Generated public static final int kAudioChannelLabel_RightTopRear = 0x00000036;
    /**
     * first order ambisonic channels
     */
    @Generated public static final int kAudioChannelLabel_Ambisonic_W = 0x000000C8;
    /**
     * first order ambisonic channels
     */
    @Generated public static final int kAudioChannelLabel_Ambisonic_X = 0x000000C9;
    /**
     * first order ambisonic channels
     */
    @Generated public static final int kAudioChannelLabel_Ambisonic_Y = 0x000000CA;
    /**
     * first order ambisonic channels
     */
    @Generated public static final int kAudioChannelLabel_Ambisonic_Z = 0x000000CB;
    /**
     * Mid/Side Recording
     */
    @Generated public static final int kAudioChannelLabel_MS_Mid = 0x000000CC;
    /**
     * Mid/Side Recording
     */
    @Generated public static final int kAudioChannelLabel_MS_Side = 0x000000CD;
    /**
     * X-Y Recording
     */
    @Generated public static final int kAudioChannelLabel_XY_X = 0x000000CE;
    /**
     * X-Y Recording
     */
    @Generated public static final int kAudioChannelLabel_XY_Y = 0x000000CF;
    /**
     * Binaural Recording
     */
    @Generated public static final int kAudioChannelLabel_BinauralLeft = 0x000000D0;
    /**
     * Binaural Recording
     */
    @Generated public static final int kAudioChannelLabel_BinauralRight = 0x000000D1;
    /**
     * other
     */
    @Generated public static final int kAudioChannelLabel_HeadphonesLeft = 0x0000012D;
    /**
     * other
     */
    @Generated public static final int kAudioChannelLabel_HeadphonesRight = 0x0000012E;
    /**
     * other
     */
    @Generated public static final int kAudioChannelLabel_ClickTrack = 0x00000130;
    /**
     * other
     */
    @Generated public static final int kAudioChannelLabel_ForeignLanguage = 0x00000131;
    /**
     * generic discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete = 0x00000190;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_0 = 0x00010000;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_1 = 0x00010001;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_2 = 0x00010002;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_3 = 0x00010003;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_4 = 0x00010004;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_5 = 0x00010005;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_6 = 0x00010006;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_7 = 0x00010007;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_8 = 0x00010008;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_9 = 0x00010009;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_10 = 0x0001000A;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_11 = 0x0001000B;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_12 = 0x0001000C;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_13 = 0x0001000D;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_14 = 0x0001000E;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_15 = 0x0001000F;
    /**
     * numbered discrete channel
     */
    @Generated public static final int kAudioChannelLabel_Discrete_65535 = 0x0001FFFF;
    /**
     * generic HOA ACN channel
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN = 0x000001F4;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_0 = 0x00020000;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_1 = 0x00020001;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_2 = 0x00020002;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_3 = 0x00020003;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_4 = 0x00020004;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_5 = 0x00020005;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_6 = 0x00020006;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_7 = 0x00020007;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_8 = 0x00020008;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_9 = 0x00020009;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_10 = 0x0002000A;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_11 = 0x0002000B;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_12 = 0x0002000C;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_13 = 0x0002000D;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_14 = 0x0002000E;
    /**
     * numbered HOA ACN channels, SN3D normalization
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_15 = 0x0002000F;
    /**
     * 254th order uses 65025 channels
     */
    @Generated public static final int kAudioChannelLabel_HOA_ACN_65024 = 0x0002FE00;
    /**
     * Channel label values in this range are reserved for internal use
     */
    @Generated public static final int kAudioChannelLabel_BeginReserved = 0xF0000000;
    @Generated public static final int kAudioChannelLabel_EndReserved = 0xFFFFFFFE;
    /**
     * 0x1
     */
    @Generated public static final int kAudioFormatFlagIsFloat = 0x00000001;
    /**
     * 0x2
     */
    @Generated public static final int kAudioFormatFlagIsBigEndian = 0x00000002;
    /**
     * 0x4
     */
    @Generated public static final int kAudioFormatFlagIsSignedInteger = 0x00000004;
    /**
     * 0x8
     */
    @Generated public static final int kAudioFormatFlagIsPacked = 0x00000008;
    /**
     * 0x10
     */
    @Generated public static final int kAudioFormatFlagIsAlignedHigh = 0x00000010;
    /**
     * 0x20
     */
    @Generated public static final int kAudioFormatFlagIsNonInterleaved = 0x00000020;
    /**
     * 0x40
     */
    @Generated public static final int kAudioFormatFlagIsNonMixable = 0x00000040;
    @Generated public static final int kAudioFormatFlagsAreAllClear = 0x80000000;
    @Generated public static final int kLinearPCMFormatFlagIsFloat = 0x00000001;
    @Generated public static final int kLinearPCMFormatFlagIsBigEndian = 0x00000002;
    @Generated public static final int kLinearPCMFormatFlagIsSignedInteger = 0x00000004;
    @Generated public static final int kLinearPCMFormatFlagIsPacked = 0x00000008;
    @Generated public static final int kLinearPCMFormatFlagIsAlignedHigh = 0x00000010;
    @Generated public static final int kLinearPCMFormatFlagIsNonInterleaved = 0x00000020;
    @Generated public static final int kLinearPCMFormatFlagIsNonMixable = 0x00000040;
    @Generated public static final int kLinearPCMFormatFlagsSampleFractionShift = 0x00000007;
    @Generated public static final int kLinearPCMFormatFlagsSampleFractionMask = 0x00001F80;
    @Generated public static final int kLinearPCMFormatFlagsAreAllClear = 0x80000000;
    @Generated public static final int kAppleLosslessFormatFlag_16BitSourceData = 0x00000001;
    @Generated public static final int kAppleLosslessFormatFlag_20BitSourceData = 0x00000002;
    @Generated public static final int kAppleLosslessFormatFlag_24BitSourceData = 0x00000003;
    @Generated public static final int kAppleLosslessFormatFlag_32BitSourceData = 0x00000004;
    /**
     * < L R C LFE Ls Rs Vhl Vhr Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Atmos_5_1_4 = 0x00C3000A;
    /**
     * < L R C LFE Ls Rs Rls Rrs Ltm Rtm
     */
    @Generated public static final int kAudioChannelLayoutTag_Atmos_7_1_2 = 0x00C4000A;
    /**
     * Needs to be ORed with the channel index, not HOA order
     */
    @Generated public static final int kAudioChannelLabel_HOA_SN3D = 0x00020000;
    /**
     * Needs to be ORed with the channel index, not HOA order
     */
    @Generated public static final int kAudioChannelLabel_HOA_N3D = 0x00030000;
    /**
     * < C
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Mono = 0x00640001;
    /**
     * < L R
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Stereo = 0x00650002;
    /**
     * < L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Quadraphonic = 0x006C0004;
    /**
     * < L R C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_4_0_A = 0x00730004;
    /**
     * < C L R Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_4_0_B = 0x00740004;
    /**
     * < L R Cs C
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_4_0_C = 0x00C50004;
    /**
     * < L R C Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_0_A = 0x00750005;
    /**
     * < L R Ls Rs C
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_0_B = 0x00760005;
    /**
     * < L C R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_0_C = 0x00770005;
    /**
     * < C L R Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_0_D = 0x00780005;
    /**
     * < L R C LFE Ls Rs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_1_A = 0x00790006;
    /**
     * < L R Ls Rs C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_1_B = 0x007A0006;
    /**
     * < L C R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_1_C = 0x007B0006;
    /**
     * < C L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_5_1_D = 0x007C0006;
    /**
     * < C L R Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_0_A = 0x008D0006;
    /**
     * < L R Ls Rs Cs C
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_0_B = 0x00C60006;
    /**
     * < L R Ls Rs C Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_0_C = 0x008B0006;
    /**
     * < C L R Ls Rs Cs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_1_A = 0x008E0007;
    /**
     * < L R Ls Rs Cs C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_1_B = 0x00C70007;
    /**
     * < L R C LFE Ls Rs Cs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_1_C = 0x007D0007;
    /**
     * < L C R Ls Cs Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_6_1_D = 0x00C80007;
    /**
     * < L R C LFE Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_A = 0x00800008;
    /**
     * < L R Ls Rs Rls Rrs C LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_B = 0x00C90008;
    /**
     * < L R C LFE Ls Rs Rls Rrs
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_C = 0x00800008;
    /**
     * < L R C LFE Ls Rs Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_SDDS_A = 0x007E0008;
    /**
     * < C Lc Rc L R Ls Rs LFE
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_SDDS_B = 0x007F0008;
    /**
     * < L R Ls Rs C LFE Lc Rc
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_7_1_SDDS_C = 0x00810008;
    /**
     * < L R C LFE Ls Rs Ltm Rtm
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_5_1_2 = 0x00C20008;
    /**
     * < L R C LFE Ls Rs Vhl Vhr Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_5_1_4 = 0x00C3000A;
    /**
     * < L R C LFE Ls Rs Rls Rrs Ltm Rtm
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_7_1_2 = 0x00C4000A;
    /**
     * < L R C LFE Ls Rs Rls Rrs Vhl Vhr Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_7_1_4_A = 0x00C0000C;
    /**
     * < L R Rls Rrs Ls Rs C LFE Vhl Vhr Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_7_1_4_B = 0x00CA000C;
    /**
     * < L R Rls Rrs Ls Rs C LFE Vhl Vhr Ltm Rtm Ltr Rtr
     */
    @Generated public static final int kAudioChannelLayoutTag_Logic_Atmos_7_1_6 = 0x00CB000E;
}
