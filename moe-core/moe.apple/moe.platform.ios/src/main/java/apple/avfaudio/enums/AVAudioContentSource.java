package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants to be used with AVAudioContentSource to indicate the content type
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVAudioContentSource {
    @Generated
    private AVAudioContentSource() {
    }

    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Reserved = 0x0000000000000000L;
    /**
     * Traditional Apple device capture
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleCapture_Traditional = 0x0000000000000001L;
    /**
     * Spatial Apple device capture
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleCapture_Spatial = 0x0000000000000002L;
    /**
     * Reserved for Apple use
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleCapture_Spatial_Enhanced = 0x0000000000000003L;
    /**
     * Traditional Apple music and music video content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleMusic_Traditional = 0x0000000000000004L;
    /**
     * Spatial Apple music and music video content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleMusic_Spatial = 0x0000000000000005L;
    /**
     * Traditional Apple professional AV offline encoded content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleAV_Traditional_Offline = 0x0000000000000006L;
    /**
     * Spatial Apple professional AV offline encoded content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleAV_Spatial_Offline = 0x0000000000000007L;
    /**
     * Traditional Apple professional AV live content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleAV_Traditional_Live = 0x0000000000000008L;
    /**
     * Spatial Apple professional AV live content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AppleAV_Spatial_Live = 0x0000000000000009L;
    /**
     * Apple passthrough content (use only if source information is not available)
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long ApplePassthrough = 0x000000000000000AL;
    /**
     * Traditional device capture
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Capture_Traditional = 0x0000000000000021L;
    /**
     * Spatial device capture
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Capture_Spatial = 0x0000000000000022L;
    /**
     * Reserved for future use
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Capture_Spatial_Enhanced = 0x0000000000000023L;
    /**
     * Traditional music and music video content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Music_Traditional = 0x0000000000000024L;
    /**
     * Spatial music and music video content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Music_Spatial = 0x0000000000000025L;
    /**
     * Traditional professional AV offline encoded content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AV_Traditional_Offline = 0x0000000000000026L;
    /**
     * Spatial professional AV offline encoded content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AV_Spatial_Offline = 0x0000000000000027L;
    /**
     * Traditional professional AV live content such as stereo and multichannel
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AV_Traditional_Live = 0x0000000000000028L;
    /**
     * Spatial professional AV live content
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AV_Spatial_Live = 0x0000000000000029L;
    /**
     * Passthrough content (use only if source information is not available)
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Passthrough = 0x000000000000002AL;
}