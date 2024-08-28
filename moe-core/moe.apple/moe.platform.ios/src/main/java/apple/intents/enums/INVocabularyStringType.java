/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class INVocabularyStringType {
    /**
     * The name of a contact as a person will say it, for example “Jon Smith”, “Apple”.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ContactName = 0x0000000000000001L;
    /**
     * The name of a group of contacts as a person will say it, for example "Tahoe Trip".
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ContactGroupName = 0x0000000000000002L;
    /**
     * A keyword associated with an image or images, for example "food", "Vacation".
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PhotoTag = 0x0000000000000064L;
    /**
     * The name for a photograph album, for example "WWDC 2015 Karaoke".
     * You may find that INVocabularyStringTypePhotoTag is a better match for concepts that are similar to, but not
     * exactly, albums.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PhotoAlbumName = 0x0000000000000065L;
    /**
     * The name a user has created for a workout, for example “Half Marathon”, “Kettlebell exercise”
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long WorkoutActivityName = 0x00000000000000C8L;
    /**
     * The name of a vehicle configuration profile, for example "Roadtrip", "Rally", "Good Weather".
     * For use by automaker apps that are enabled to work with CarPlay <https://developer.apple.com/carplay/>.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long CarProfileName = 0x000000000000012CL;

    @Generated
    private INVocabularyStringType() {
    }

    /**
     * The name of a vehicle as a person will say it, for example “BMW”, “My Convertible”.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long CarName = 0x000000000000012DL;
    /**
     * The name of an organization to pay as a person will say it, for example “PG&E”, “Comcast”.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long PaymentsOrganizationName = 0x0000000000000190L;
    /**
     * The name of an account nick name as a person will say it, for example “Checking”, “Rainy day savings”.
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long PaymentsAccountNickname = 0x0000000000000191L;
    /**
     * The title of a note, task, or task list as a person will say it; for example, "Grocery list" or "Weekly meeting
     * minutes".
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NotebookItemTitle = 0x00000000000001F4L;
    /**
     * The name of the note or task list's group (folder, directory, account); for example, "iCloud" or "Shopping"
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NotebookItemGroupName = 0x00000000000001F5L;
    /**
     * The title of a playlist as a person will say it, for example "Today's Hits".
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MediaPlaylistTitle = 0x00000000000002BCL;
    /**
     * The name of a music artist as a person will say it, for example "The Beatles".
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MediaMusicArtistName = 0x00000000000002BDL;
    /**
     * The title of an audiobook as a person will say it, for example "The Time Machine".
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MediaAudiobookTitle = 0x00000000000002BEL;
    /**
     * The name of an audiobook author as a person will say it, for example "Mary Shelley".
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MediaAudiobookAuthorName = 0x00000000000002BFL;
    /**
     * The name of a Podcast or Radio show title as a person will say it, for example "Fresh Air".
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MediaShowTitle = 0x00000000000002C0L;
}
