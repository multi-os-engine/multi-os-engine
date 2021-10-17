package apple.shazamkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

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
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemShazamID();

    /**
     * Title
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemTitle();

    /**
     * Subtitle
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemSubtitle();

    /**
     * Artist
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemArtist();

    /**
     * A web URL representing this result
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemWebURL();

    /**
     * The AppleMusic ID
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemAppleMusicID();

    /**
     * A link to this media on Apple Music
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemAppleMusicURL();

    /**
     * A URL to the artwork
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemArtworkURL();

    /**
     * A URL for a Video associated with the media
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemVideoURL();

    /**
     * Is this content explicit
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemExplicitContent();

    /**
     * An array of strings representing the genres of the media item
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemGenres();

    /**
     * The International Standard Recording Code
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemISRC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHErrorDomain();

    /**
     * How far in seconds is this match from the start of the reference audio
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemMatchOffset();

    /**
     * How much the match differs in frequency from reference material
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SHMediaItemFrequencySkew();
}
