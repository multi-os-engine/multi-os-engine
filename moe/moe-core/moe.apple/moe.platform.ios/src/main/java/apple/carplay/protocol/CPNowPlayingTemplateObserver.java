package apple.carplay.protocol;

import apple.carplay.CPNowPlayingTemplate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPNowPlayingTemplateObserver")
public interface CPNowPlayingTemplateObserver {
    /**
     * The user has selected the album/artist button on the now playing template. Your application
     * should push a new template displaying the content appearing in this container (album, playlist, or show).
     */
    @Generated
    @IsOptional
    @Selector("nowPlayingTemplateAlbumArtistButtonTapped:")
    default void nowPlayingTemplateAlbumArtistButtonTapped(CPNowPlayingTemplate nowPlayingTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The user has selected the Up Next button on the now playing template. Your application
     * should push a new template displaying the list of upcoming or queued content.
     */
    @Generated
    @IsOptional
    @Selector("nowPlayingTemplateUpNextButtonTapped:")
    default void nowPlayingTemplateUpNextButtonTapped(CPNowPlayingTemplate nowPlayingTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}