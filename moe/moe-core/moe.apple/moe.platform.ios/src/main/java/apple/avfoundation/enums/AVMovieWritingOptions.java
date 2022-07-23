package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVMovieWritingOptions
 * <p>
 * These options can be passed into writeMovieHeaderToURL:fileType:options:error: to control the writing of a movie
 * header to a destination URL.
 * [@constant] AVMovieWritingAddMovieHeaderToDestination
 * Writing the movie header will remove any existing movie header in the destination file and add a new movie header,
 * preserving any other data in the file. If the destination file was empty, a file type box will be written at the
 * beginning of the file.
 * [@constant] AVMovieWritingTruncateDestinationToMovieHeaderOnly
 * If set, writing the movie header will truncate all existing data in the destination file and write a new movie
 * header, thereby creating a pure reference movie file. A file type box will be written at the beginning of the file.
 * <p>
 * You would not want to use the AVMovieWritingTruncateDestinationToMovieHeaderOnly option if you had written sample
 * data to the destination file using (for example) -[AVMutableMovie
 * insertTimeRange:ofAsset:atTime:copySampleData:error:] with copySampleData set to YES, since that data would be lost.
 */
@Generated
public final class AVMovieWritingOptions {
    @Generated
    private AVMovieWritingOptions() {
    }

    @Generated @NUInt public static final long AddMovieHeaderToDestination = 0x0000000000000000L;
    @Generated @NUInt public static final long TruncateDestinationToMovieHeaderOnly = 0x0000000000000001L;
}
