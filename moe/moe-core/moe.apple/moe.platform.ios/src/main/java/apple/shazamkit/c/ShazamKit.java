package apple.shazamkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("ShazamKit")
@Runtime(CRuntime.class)
public final class ShazamKit {
    static {
        NatJ.register();
    }

    @Generated
    private ShazamKit() {
    }

    /**
     * The Shazam media ID
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemShazamID();

    /**
     * Title
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemTitle();

    /**
     * Subtitle
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemSubtitle();

    /**
     * Artist
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemArtist();

    /**
     * A web URL representing this result
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemWebURL();

    /**
     * The AppleMusic ID
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemAppleMusicID();

    /**
     * A link to this media on Apple Music
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemAppleMusicURL();

    /**
     * A URL to the artwork
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemArtworkURL();

    /**
     * A URL for a Video associated with the media
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemVideoURL();

    /**
     * Is this content explicit
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemExplicitContent();

    /**
     * An array of strings representing the genres of the media item
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemGenres();

    /**
     * The International Standard Recording Code
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemISRC();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHErrorDomain();

    /**
     * How far in seconds is this match from the start of the reference audio
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemMatchOffset();

    /**
     * How much the match differs in frequency from reference material
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemFrequencySkew();

    /**
     * The time ranges in the represented media that are described by this @c SHMediaItem
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemTimeRanges();

    /**
     * The frequency skew ranges that are described by this @c SHMediaItem
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemFrequencySkewRanges();
}
