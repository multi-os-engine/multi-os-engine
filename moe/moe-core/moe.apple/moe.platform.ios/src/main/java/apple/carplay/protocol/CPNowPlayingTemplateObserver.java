package apple.carplay.protocol;

import apple.carplay.CPNowPlayingTemplate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPNowPlayingTemplateObserver")
public interface CPNowPlayingTemplateObserver {
    @Generated
    @IsOptional
    @Selector("nowPlayingTemplateAlbumArtistButtonTapped:")
    default void nowPlayingTemplateAlbumArtistButtonTapped(CPNowPlayingTemplate nowPlayingTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("nowPlayingTemplateUpNextButtonTapped:")
    default void nowPlayingTemplateUpNextButtonTapped(CPNowPlayingTemplate nowPlayingTemplate) {
        throw new java.lang.UnsupportedOperationException();
    }
}