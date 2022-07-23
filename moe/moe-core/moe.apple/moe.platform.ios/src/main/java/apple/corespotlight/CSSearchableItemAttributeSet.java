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

package apple.corespotlight;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uniformtypeidentifiers.UTType;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CSSearchableItemAttribute encapsulates a set of properties of an CSSearchableItem.
 * CSSearchableItemAttribute set should only be mutated from one thread at a time. Concurrent access to properties has
 * undefined behavior.
 */
@Generated
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSSearchableItemAttributeSet extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CSSearchableItemAttributeSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSSearchableItemAttributeSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CSSearchableItemAttributeSet allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CSSearchableItemAttributeSet new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * The version of GPSInfoIFD header that was used to generate the metadata
     */
    @Generated
    @Selector("EXIFGPSVersion")
    public native String EXIFGPSVersion();

    /**
     * The verion of the EXIF header that was used to generate the metadata
     */
    @Generated
    @Selector("EXIFVersion")
    public native String EXIFVersion();

    @Generated
    @Selector("GPSAreaInformation")
    public native String GPSAreaInformation();

    @Generated
    @Selector("GPSDOP")
    public native NSNumber GPSDOP();

    @Generated
    @Selector("GPSDateStamp")
    public native NSDate GPSDateStamp();

    @Generated
    @Selector("GPSDestBearing")
    public native NSNumber GPSDestBearing();

    @Generated
    @Selector("GPSDestDistance")
    public native NSNumber GPSDestDistance();

    @Generated
    @Selector("GPSDestLatitude")
    public native NSNumber GPSDestLatitude();

    @Generated
    @Selector("GPSDestLongitude")
    public native NSNumber GPSDestLongitude();

    @Generated
    @Selector("GPSDifferental")
    public native NSNumber GPSDifferental();

    @Generated
    @Selector("GPSMapDatum")
    public native String GPSMapDatum();

    @Generated
    @Selector("GPSMeasureMode")
    public native String GPSMeasureMode();

    @Generated
    @Selector("GPSProcessingMethod")
    public native String GPSProcessingMethod();

    @Generated
    @Selector("GPSStatus")
    public native String GPSStatus();

    /**
     * The direction of travel of the item, in degrees from true north.
     */
    @Generated
    @Selector("GPSTrack")
    public native NSNumber GPSTrack();

    /**
     * Contains the HTML content of the document encoded as NSData of UTF-8 encoded string.
     */
    @Generated
    @Selector("HTMLContentData")
    public native NSData HTMLContentData();

    /**
     * The ISO Speed the camera was set to when the image was taken. Examples are 100, 200, 400, etc.
     */
    @Generated
    @Selector("ISOSpeed")
    public native NSNumber ISOSpeed();

    /**
     * URL of the item
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * Array of the canonical handles of the account the item is associated with
     * (IM handle, e-mail address, phone number...).
     * E.g. in Mail's case, all the email addresses the account receives email on.
     */
    @Generated
    @Selector("accountHandles")
    public native NSArray<String> accountHandles();

    /**
     * Unique identifier for the account the item is associated with, if any
     */
    @Generated
    @Selector("accountIdentifier")
    public native String accountIdentifier();

    /**
     * Device make that was used to acquire this item
     */
    @Generated
    @Selector("acquisitionMake")
    public native String acquisitionMake();

    /**
     * Device model that was used to acquire this item
     */
    @Generated
    @Selector("acquisitionModel")
    public native String acquisitionModel();

    /**
     * This is the date that the item was moved into the current location.
     */
    @Generated
    @Selector("addedDate")
    public native NSDate addedDate();

    /**
     * An array of CSPerson objects representing the content of the Cc: field in an email
     */
    @Generated
    @Selector("additionalRecipients")
    public native NSArray<? extends CSPerson> additionalRecipients();

    /**
     * The title for a collection of media. This is analagous to a record album,
     * or photo album whichs are collections of audio or images.
     */
    @Generated
    @Selector("album")
    public native String album();

    /**
     * Whether this event covers complete days
     */
    @Generated
    @Selector("allDay")
    public native NSNumber allDay();

    /**
     * An array of localized strings of alternate display names for this item.
     */
    @Generated
    @Selector("alternateNames")
    public native NSArray<String> alternateNames();

    /**
     * The altitude of the item in meters above sea level, expressed
     * using the WGS84 datum. Negative values lie below sea level.
     */
    @Generated
    @Selector("altitude")
    public native NSNumber altitude();

    /**
     * The size of the lens aperture as a log-scale APEX value when the image was acquired.
     */
    @Generated
    @Selector("aperture")
    public native NSNumber aperture();

    /**
     * The artist for the media
     */
    @Generated
    @Selector("artist")
    public native String artist();

    /**
     * A class of entity for whom the resource is intended or useful. A
     * class of entity may be determined by the creator or the publisher
     * or by a third party.
     */
    @Generated
    @Selector("audiences")
    public native NSArray<String> audiences();

    /**
     * The audio bit rate
     */
    @Generated
    @Selector("audioBitRate")
    public native NSNumber audioBitRate();

    /**
     * The number of channels in the audio data contained in the file. This item only represents
     * the number of discreet channels of audio data found in the file. It does not indicate
     * any configuration of the data in regards to a user's speaker setup.
     */
    @Generated
    @Selector("audioChannelCount")
    public native NSNumber audioChannelCount();

    /**
     * The name of the application that encoded the data contained in the audio file.
     */
    @Generated
    @Selector("audioEncodingApplication")
    public native String audioEncodingApplication();

    /**
     * The sample rate of the audio data contained in the file. The sample rate is a
     * float value representing hz (audio_frames/second). For example: 44100.0, 22254.54.
     */
    @Generated
    @Selector("audioSampleRate")
    public native NSNumber audioSampleRate();

    /**
     * The track number of a song/composition when it is part of an album
     */
    @Generated
    @Selector("audioTrackNumber")
    public native NSNumber audioTrackNumber();

    /**
     * This attribute indicates the author addresses of the document.
     */
    @Generated
    @Selector("authorAddresses")
    public native NSArray<String> authorAddresses();

    /**
     * This attribute indicates the author of the emails message addresses.
     * (This is always the email address, and not the human readable version)
     */
    @Generated
    @Selector("authorEmailAddresses")
    public native NSArray<String> authorEmailAddresses();

    /**
     * The list of author/authors that have worked on this item.
     * There could be 0 or more authors of a particular item.
     * The order of the authors in the array is preserved, but is not intended to represent
     * the main author or relative importance of the authors.
     */
    @Generated
    @Selector("authorNames")
    public native NSArray<String> authorNames();

    /**
     * An array of CSPerson objects representing the content of the From: field in an email
     */
    @Generated
    @Selector("authors")
    public native NSArray<? extends CSPerson> authors();

    /**
     * Number of bits per sample
     * For example bit depth of an image (8-bit, 16-bit etc..) or bit
     * depth per audio sample of uncompressed audio data (8, 16, 24, 32, 64, etc..)
     */
    @Generated
    @Selector("bitsPerSample")
    public native NSNumber bitsPerSample();

    /**
     * The owner of the camera used to capture this image.
     */
    @Generated
    @Selector("cameraOwner")
    public native String cameraOwner();

    /**
     * Identifies city of item origin according to guidelines established by the provider.
     */
    @Generated
    @Selector("city")
    public native String city();

    /**
     * The codecs used to encode/decode the media
     */
    @Generated
    @Selector("codecs")
    public native NSArray<String> codecs();

    /**
     * What color space model is this item following (For example, "RGB", "CMYK", "YUV", "YCbCr")
     */
    @Generated
    @Selector("colorSpace")
    public native String colorSpace();

    /**
     * This is a comment related to a file.
     */
    @Generated
    @Selector("comment")
    public native String comment();

    /**
     * Date the item was completed
     */
    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    /**
     * The composer of the song/composition contained in the audio file.
     */
    @Generated
    @Selector("composer")
    public native String composer();

    /**
     * A list of contacts that are somehow associated with this document, beyond what is captured as Author.
     */
    @Generated
    @Selector("contactKeywords")
    public native NSArray<String> contactKeywords();

    @Generated
    @Selector("containerDisplayName")
    public native String containerDisplayName();

    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    @Generated
    @Selector("containerOrder")
    public native NSNumber containerOrder();

    @Generated
    @Selector("containerTitle")
    public native String containerTitle();

    /**
     * This is the date that the contents of the item were created
     */
    @Generated
    @Selector("contentCreationDate")
    public native NSDate contentCreationDate();

    /**
     * An account of the content of the resource. Description may include
     * but is not limited to: an abstract, table of contents, reference
     * to a graphical representation of content or a free-text account of
     * the content.
     */
    @Generated
    @Selector("contentDescription")
    public native String contentDescription();

    /**
     * This is the date that the contents of the item were last modified
     */
    @Generated
    @Selector("contentModificationDate")
    public native NSDate contentModificationDate();

    /**
     * Whether or not the item has explicit content. Should be 1 if explicit, 0 for clean.
     */
    @Generated
    @Selector("contentRating")
    public native NSNumber contentRating();

    /**
     * This attribute indicates where the item was obtained from.
     * Examples:
     * - downloaded file may refer to the site they were downloaded from,the refering URL, etc
     * - files received by email may indicate who sent the file, the message subject, etc
     */
    @Generated
    @Selector("contentSources")
    public native NSArray<String> contentSources();

    /**
     * UTI Type pedigree for an item. Common types can be found in UTCoreTypes.h
     */
    @Generated
    @Selector("contentType")
    public native String contentType();

    @Generated
    @Selector("contentTypeTree")
    public native NSArray<String> contentTypeTree();

    /**
     * Optional file URL representing the content to be indexed
     * Applications that are also 'Documents & Data' clients can set this property to allow Spotlight to deduplicate
     * their searchable items against the iCloud Drive's items. When this property is set, Spotlight will not display
     * the iCloud Drive's searchable items that have the same contentURL property.
     */
    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * Used to designate the entity responsible for making contributions
     * to the content of the resource. Examples of a Contributor include
     * a person, an organization or a service. Typically, the name of a
     * Contributor should be used to indicate the entity.
     */
    @Generated
    @Selector("contributors")
    public native NSArray<String> contributors();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * This is the copyright of the content.
     */
    @Generated
    @Selector("copyright")
    public native String copyright();

    /**
     * Provides full, publishable, name of the country/primary location where the
     * intellectual property of the item was created,according to guidelines of the provider.
     */
    @Generated
    @Selector("country")
    public native String country();

    /**
     * Used to designate the extent or scope of the content of the
     * resource. Coverage will typically include spatial location
     * (a place name or geographic co-ordinates), temporal period (a period label, date, or date range)
     * or jurisdiction (such as a named administrative entity).
     * Recommended best practice is to select a value from a controlled vocabulary, and that, where appropriate,
     * named places or time periods be used in preference to numeric identifiers such as sets of co-ordinates or date
     * ranges.
     */
    @Generated
    @Selector("coverage")
    public native NSArray<String> coverage();

    /**
     * Application used to create the document content (e.g. "Word",
     * "Framemaker", etc.).
     */
    @Generated
    @Selector("creator")
    public native String creator();

    /**
     * The delivery type of the item. Should be 0 for fast start and 1 for RTSP.
     */
    @Generated
    @Selector("deliveryType")
    public native NSNumber deliveryType();

    /**
     * Director of the item (e.g. movie director)
     */
    @Generated
    @Selector("director")
    public native String director();

    /**
     * A localized string to be displayed in the UI for this item.
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * This property has the same semantics as -[CSSearchableItem domainIdentifier].
     * It can be set on the contentAttributeSet property of a NSUserActivity instance and then used to delete the user
     * activity
     * by calling [[CSSearchableIndex defaultSearchableIndex] deleteSearchableItemsWithDomainIdentifiers:].
     */
    @Generated
    @Selector("domainIdentifier")
    public native String domainIdentifier();

    /**
     * This is the date that the file was last downloaded / received.
     */
    @Generated
    @Selector("downloadedDate")
    public native NSDate downloadedDate();

    /**
     * Date this item is due.
     */
    @Generated
    @Selector("dueDate")
    public native NSDate dueDate();

    /**
     * This is the duration, in seconds, of the content of the item (if appropriate).
     */
    @Generated
    @Selector("duration")
    public native NSNumber duration();

    /**
     * The list of editor/editors that have worked on this item.
     */
    @Generated
    @Selector("editors")
    public native NSArray<String> editors();

    /**
     * Email addresses for this item.
     */
    @Generated
    @Selector("emailAddresses")
    public native NSArray<String> emailAddresses();

    /**
     * Dictionary with all the headers of the message
     * Keys are header names and values arrays of strings (because a header might be present multiple times in an email)
     */
    @Generated
    @Selector("emailHeaders")
    public native NSDictionary<String, ? extends NSArray<?>> emailHeaders();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Software used to convert the original content into a PDF stream
     * (e.g. "Distiller", etc.).
     */
    @Generated
    @Selector("encodingApplications")
    public native NSArray<String> encodingApplications();

    /**
     * End date for this item.
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * Mode that was used for the exposure. Should be 0 for AutoExposure, 1 for Manual, 2 for AutoBracket.
     */
    @Generated
    @Selector("exposureMode")
    public native NSNumber exposureMode();

    /**
     * The class of the program used by the camera to set exposure when the picture is taken (Manual, Normal, Aperture
     * Priority, ...)
     */
    @Generated
    @Selector("exposureProgram")
    public native String exposureProgram();

    /**
     * Time that the lens was open during exposure in seconds
     */
    @Generated
    @Selector("exposureTime")
    public native NSNumber exposureTime();

    /**
     * The time of the exposure as a string, e.g. "1/250 seconds".
     */
    @Generated
    @Selector("exposureTimeString")
    public native String exposureTimeString();

    /**
     * The focal length of the lens divided by the diameter of the aperture when the image was acquired.
     */
    @Generated
    @Selector("fNumber")
    public native NSNumber fNumber();

    /**
     * Size of the document in MB.
     */
    @Generated
    @Selector("fileSize")
    public native NSNumber fileSize();

    /**
     * The actual focal length of the lens in mm.
     */
    @Generated
    @Selector("focalLength")
    public native NSNumber focalLength();

    /**
     * Array of font names used in the item.
     */
    @Generated
    @Selector("fontNames")
    public native NSArray<String> fontNames();

    /**
     * The fully formatted address of the item (obtained from MapKit)
     */
    @Generated
    @Selector("fullyFormattedAddress")
    public native String fullyFormattedAddress();

    /**
     * Genre of the item (e.g. movie genre)
     */
    @Generated
    @Selector("genre")
    public native String genre();

    /**
     * Indicates if this image file has an alpha channel. Should be 0 for no alpha channel, 1 for alpha channel.
     */
    @Generated
    @Selector("hasAlphaChannel")
    public native NSNumber hasAlphaChannel();

    /**
     * A publishable entry providing a synopsis of the contents of the item.
     */
    @Generated
    @Selector("headline")
    public native String headline();

    /**
     * An array of CSPerson objects representing the content of the Bcc: field in an email
     */
    @Generated
    @Selector("hiddenAdditionalRecipients")
    public native NSArray<? extends CSPerson> hiddenAdditionalRecipients();

    /**
     * Used to reference to the resource within a given
     * context. Recommended best practice is to identify the resource by
     * means of a string or number conforming to a formal identification system.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * The direction of the item's image, in degrees from true north.
     */
    @Generated
    @Selector("imageDirection")
    public native NSNumber imageDirection();

    /**
     * Important dates associated with this item
     */
    @Generated
    @Selector("importantDates")
    public native NSArray<? extends NSDate> importantDates();

    /**
     * Information about the item
     */
    @Generated
    @Selector("information")
    public native String information();

    @Generated
    @Selector("init")
    public native CSSearchableItemAttributeSet init();

    @Generated
    @Selector("initWithCoder:")
    public native CSSearchableItemAttributeSet initWithCoder(NSCoder coder);

    /**
     * Creates an attribute set for the given content type.
     */
    @Generated
    @Selector("initWithItemContentType:")
    public native CSSearchableItemAttributeSet initWithItemContentType(String itemContentType);

    /**
     * Instant message addresses for this item.
     */
    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<String> instantMessageAddresses();

    /**
     * Other editorial instructions concerning the use of the item, such as embargoes and warnings.
     */
    @Generated
    @Selector("instructions")
    public native String instructions();

    /**
     * Indicates if the flash was used to take the picture. Should be 1 if flash is on, 0 otherwise.
     */
    @Generated
    @Selector("isFlashOn")
    public native NSNumber isFlashOn();

    /**
     * Indicates if the focal length is 35mm. Should be 1 if true, 0 otherwise
     */
    @Generated
    @Selector("isFocalLength35mm")
    public native NSNumber isFocalLength35mm();

    /**
     * This attribute indicates whether the MIDI sequence contained in the file is setup for use with a General MIDI
     * device. Should be 1 if true, 0 otherwise.
     */
    @Generated
    @Selector("isGeneralMIDISequence")
    public native NSNumber isGeneralMIDISequence();

    /**
     * This attribute indicates if the document is likely to be considered junk. Should be 1 if true, 0 otherwise
     */
    @Generated
    @Selector("isLikelyJunk")
    public native NSNumber isLikelyJunk();

    /**
     * Whether or not the item is local. Should be 1 if true, 0 otherwise.
     */
    @Generated
    @Selector("isLocal")
    public native NSNumber isLocal();

    /**
     * Indicates if red-eye reduction was used to take the picture. Should be 0 for no red-eye, 1 for red-eye
     */
    @Generated
    @Selector("isRedEyeOn")
    public native NSNumber isRedEyeOn();

    /**
     * Whether the content is prepared for streaming. Should be 0 for not streamable, 1 for streamable.
     */
    @Generated
    @Selector("isStreamable")
    public native NSNumber isStreamable();

    /**
     * The musical key of the song/composition contained in an audio file.
     * For example: C, Dm, F#m, Bb.
     */
    @Generated
    @Selector("keySignature")
    public native String keySignature();

    /**
     * Represents keywords associated with this particular item.
     * Example Keywords might be Birthday,Important etc.
     */
    @Generated
    @Selector("keywords")
    public native NSArray<String> keywords();

    /**
     * Kind that this item represents.
     */
    @Generated
    @Selector("kind")
    public native String kind();

    /**
     * Used to designate the languages of the intellectual content of the
     * resource. Recommended best practice for the values of the Language
     * element is defined by BCP 47.
     */
    @Generated
    @Selector("languages")
    public native NSArray<String> languages();

    /**
     * This is the date that the item was last used
     */
    @Generated
    @Selector("lastUsedDate")
    public native NSDate lastUsedDate();

    /**
     * The latitude of the item in degrees north of the equator, expressed
     * using the WGS84 datum. Negative values lie south of the equator.
     */
    @Generated
    @Selector("latitude")
    public native NSNumber latitude();

    /**
     * The names of the various layers in the file
     */
    @Generated
    @Selector("layerNames")
    public native NSArray<String> layerNames();

    /**
     * The model of the lens used to capture this image.
     */
    @Generated
    @Selector("lensModel")
    public native String lensModel();

    /**
     * The longitude of the item in degrees east of the prime meridian,
     * expressed using the WGS84 datum. Negative values lie west of the prime meridian.
     */
    @Generated
    @Selector("longitude")
    public native NSNumber longitude();

    /**
     * The lyricist/text writer for song/composition contained in the audio file.
     */
    @Generated
    @Selector("lyricist")
    public native String lyricist();

    /**
     * Array of Mailbox identifiers associated with the item. e.g. CSMailboxInbox, CSMailboxDrafts, CSMailboxSent, or a
     * custom identifier etc.
     */
    @Generated
    @Selector("mailboxIdentifiers")
    public native NSArray<String> mailboxIdentifiers();

    /**
     * The smallest F number of the lens. The unit is the APEX
     * value. Ordinarily it is given in the range of 00.00 to 99.99.
     */
    @Generated
    @Selector("maxAperture")
    public native NSNumber maxAperture();

    /**
     * Media types present in the content
     */
    @Generated
    @Selector("mediaTypes")
    public native NSArray<String> mediaTypes();

    /**
     * This is the date that the last metadata attribute was changed.
     */
    @Generated
    @Selector("metadataModificationDate")
    public native NSDate metadataModificationDate();

    /**
     * The metering mode for the image (Average, Partial, Pattern, ...)
     */
    @Generated
    @Selector("meteringMode")
    public native String meteringMode();

    /**
     * The musical genre of the song/composition contained in the audio file.
     * For example: Jazz, Pop, Rock, Classical.
     */
    @Generated
    @Selector("musicalGenre")
    public native String musicalGenre();

    /**
     * Meta data attribute that stores the category of
     * instrument. Files should have an instrument associated with
     * them ("Other Instrument" is provided as a catch-all). For some
     * categories, like "Keyboards" there are instrument names which
     * provide a more detailed instrument definition (e.g., Piano,Organ, etc.)
     */
    @Generated
    @Selector("musicalInstrumentCategory")
    public native String musicalInstrumentCategory();

    /**
     * Meta data attribute that stores the name of instrument
     * (relative to the instrument category) Files can have an
     * instrument name associated with them if they have certain
     * instrument categories (e.g., the category Percussion has
     * multiple instruments, including Conga and Bongo).
     */
    @Generated
    @Selector("musicalInstrumentName")
    public native String musicalInstrumentName();

    /**
     * The name of the location or point of interest associated with the item. The name may be user provided.
     */
    @Generated
    @Selector("namedLocation")
    public native String namedLocation();

    /**
     * Used to indicate company/Organization that created the document.
     */
    @Generated
    @Selector("organizations")
    public native NSArray<String> organizations();

    /**
     * The orientation of the data. Should be 0 for Landscape or 1 for Portrait.
     */
    @Generated
    @Selector("orientation")
    public native NSNumber orientation();

    /**
     * Original format of the movie
     */
    @Generated
    @Selector("originalFormat")
    public native String originalFormat();

    /**
     * Original source of the movie
     */
    @Generated
    @Selector("originalSource")
    public native String originalSource();

    /**
     * Number of pages in the item.
     */
    @Generated
    @Selector("pageCount")
    public native NSNumber pageCount();

    /**
     * Height in points (72 points per inch) of the document page
     * (first page only for PDF's - other pages within the PDF may
     * not be the same height).
     */
    @Generated
    @Selector("pageHeight")
    public native NSNumber pageHeight();

    /**
     * Width in points (72 points per inch) of the document page
     * (first page only for PDF's - other pages within the PDF may
     * not be the same width).
     */
    @Generated
    @Selector("pageWidth")
    public native NSNumber pageWidth();

    /**
     * The list of people who are visible in an image or movie or written about in a document.
     */
    @Generated
    @Selector("participants")
    public native NSArray<String> participants();

    /**
     * This is the complete path to the item.
     */
    @Generated
    @Selector("path")
    public native String path();

    /**
     * Performers in the movie
     */
    @Generated
    @Selector("performers")
    public native NSArray<String> performers();

    /**
     * Phone numbers for this item.
     */
    @Generated
    @Selector("phoneNumbers")
    public native NSArray<String> phoneNumbers();

    /**
     * The total number of pixels in the item.
     */
    @Generated
    @Selector("pixelCount")
    public native NSNumber pixelCount();

    /**
     * The height of the item in pixels (ie Image height or Video frame height)
     */
    @Generated
    @Selector("pixelHeight")
    public native NSNumber pixelHeight();

    /**
     * The width of the item in pixels (ie Image width or Video frame width)
     */
    @Generated
    @Selector("pixelWidth")
    public native NSNumber pixelWidth();

    /**
     * User play count of this item
     */
    @Generated
    @Selector("playCount")
    public native NSNumber playCount();

    /**
     * The postal code for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("postalCode")
    public native String postalCode();

    /**
     * An array of CSPerson objects representing the content of the To: field in an email
     */
    @Generated
    @Selector("primaryRecipients")
    public native NSArray<? extends CSPerson> primaryRecipients();

    /**
     * Producer of the content
     */
    @Generated
    @Selector("producer")
    public native String producer();

    /**
     * Name of the color profile used for the image
     */
    @Generated
    @Selector("profileName")
    public native String profileName();

    /**
     * The list of projects that this item is part of.
     * For example if you were working on a movie, all of the movie files could be marked
     * as belonging to the project "My movie"
     */
    @Generated
    @Selector("projects")
    public native NSArray<String> projects();

    /**
     * Used to designate the entity responsible for making the resource
     * available. Examples of a Publisher include a person, an
     * organization, or a service. Typically, the name of a Publisher
     * should be used to indicate the entity.
     */
    @Generated
    @Selector("publishers")
    public native NSArray<String> publishers();

    /**
     * User rating of this item out of 5 stars
     */
    @Generated
    @Selector("rating")
    public native NSNumber rating();

    /**
     * A description of the rating. E.g. the number of reviewers.
     */
    @Generated
    @Selector("ratingDescription")
    public native String ratingDescription();

    /**
     * This attribute indicates the recipient addresses of the document.
     */
    @Generated
    @Selector("recipientAddresses")
    public native NSArray<String> recipientAddresses();

    /**
     * This attribute indicates the reciepients email addresses.
     * (This is always the email address, and not the human readable version).
     */
    @Generated
    @Selector("recipientEmailAddresses")
    public native NSArray<String> recipientEmailAddresses();

    /**
     * This attribute indicates the recipients of this item.
     */
    @Generated
    @Selector("recipientNames")
    public native NSArray<String> recipientNames();

    /**
     * The recording date of the song/composition. This information differs from
     * the contentCreationDate attribute as it indicates the date that the
     * 'art' was created, in contrast to contentCreationDate which for example, could indicate
     * the creation date of an edited or 'mastered' version of the original art.
     */
    @Generated
    @Selector("recordingDate")
    public native NSDate recordingDate();

    /**
     * For activities, this is the unique identifier for the item this activity is related to. If the item doesn't exist
     * in the index, the activity will not get stored. When the item is deleted, the activity will also be deleted.
     */
    @Generated
    @Selector("relatedUniqueIdentifier")
    public native String relatedUniqueIdentifier();

    /**
     * Resolution height of this image in DPI
     */
    @Generated
    @Selector("resolutionHeightDPI")
    public native NSNumber resolutionHeightDPI();

    /**
     * Resolution width of this image in DPI
     */
    @Generated
    @Selector("resolutionWidthDPI")
    public native NSNumber resolutionWidthDPI();

    /**
     * Used to provide a link to information about rights held in and
     * over the resource. Typically a Rights element will contain a
     * rights management statement for the resource, or reference a
     * service providing such information. Rights information often
     * encompasses Intellectual Property Rights (IPR), Copyright, and
     * various Property Rights. If the rights element is absent, no
     * assumptions can be made about the status of these and other rights
     * with respect to the resource.
     */
    @Generated
    @Selector("rights")
    public native String rights();

    /**
     * Used to indicate the role of the document creator
     */
    @Generated
    @Selector("role")
    public native String role();

    /**
     * Security (encryption) method used in the file
     */
    @Generated
    @Selector("securityMethod")
    public native String securityMethod();

    /**
     * Array of the canonical handles of the account the item is associated with
     * (IM handle, e-mail address, phone number...).
     * E.g. in Mail's case, all the email addresses the account receives email on.
     */
    @Generated
    @Selector("setAccountHandles:")
    public native void setAccountHandles(NSArray<String> value);

    /**
     * Unique identifier for the account the item is associated with, if any
     */
    @Generated
    @Selector("setAccountIdentifier:")
    public native void setAccountIdentifier(String value);

    /**
     * Device make that was used to acquire this item
     */
    @Generated
    @Selector("setAcquisitionMake:")
    public native void setAcquisitionMake(String value);

    /**
     * Device model that was used to acquire this item
     */
    @Generated
    @Selector("setAcquisitionModel:")
    public native void setAcquisitionModel(String value);

    /**
     * This is the date that the item was moved into the current location.
     */
    @Generated
    @Selector("setAddedDate:")
    public native void setAddedDate(NSDate value);

    /**
     * An array of CSPerson objects representing the content of the Cc: field in an email
     */
    @Generated
    @Selector("setAdditionalRecipients:")
    public native void setAdditionalRecipients(NSArray<? extends CSPerson> value);

    /**
     * The title for a collection of media. This is analagous to a record album,
     * or photo album whichs are collections of audio or images.
     */
    @Generated
    @Selector("setAlbum:")
    public native void setAlbum(String value);

    /**
     * Whether this event covers complete days
     */
    @Generated
    @Selector("setAllDay:")
    public native void setAllDay(NSNumber value);

    /**
     * An array of localized strings of alternate display names for this item.
     */
    @Generated
    @Selector("setAlternateNames:")
    public native void setAlternateNames(NSArray<String> value);

    /**
     * The altitude of the item in meters above sea level, expressed
     * using the WGS84 datum. Negative values lie below sea level.
     */
    @Generated
    @Selector("setAltitude:")
    public native void setAltitude(NSNumber value);

    /**
     * The size of the lens aperture as a log-scale APEX value when the image was acquired.
     */
    @Generated
    @Selector("setAperture:")
    public native void setAperture(NSNumber value);

    /**
     * The artist for the media
     */
    @Generated
    @Selector("setArtist:")
    public native void setArtist(String value);

    /**
     * A class of entity for whom the resource is intended or useful. A
     * class of entity may be determined by the creator or the publisher
     * or by a third party.
     */
    @Generated
    @Selector("setAudiences:")
    public native void setAudiences(NSArray<String> value);

    /**
     * The audio bit rate
     */
    @Generated
    @Selector("setAudioBitRate:")
    public native void setAudioBitRate(NSNumber value);

    /**
     * The number of channels in the audio data contained in the file. This item only represents
     * the number of discreet channels of audio data found in the file. It does not indicate
     * any configuration of the data in regards to a user's speaker setup.
     */
    @Generated
    @Selector("setAudioChannelCount:")
    public native void setAudioChannelCount(NSNumber value);

    /**
     * The name of the application that encoded the data contained in the audio file.
     */
    @Generated
    @Selector("setAudioEncodingApplication:")
    public native void setAudioEncodingApplication(String value);

    /**
     * The sample rate of the audio data contained in the file. The sample rate is a
     * float value representing hz (audio_frames/second). For example: 44100.0, 22254.54.
     */
    @Generated
    @Selector("setAudioSampleRate:")
    public native void setAudioSampleRate(NSNumber value);

    /**
     * The track number of a song/composition when it is part of an album
     */
    @Generated
    @Selector("setAudioTrackNumber:")
    public native void setAudioTrackNumber(NSNumber value);

    /**
     * This attribute indicates the author addresses of the document.
     */
    @Generated
    @Selector("setAuthorAddresses:")
    public native void setAuthorAddresses(NSArray<String> value);

    /**
     * This attribute indicates the author of the emails message addresses.
     * (This is always the email address, and not the human readable version)
     */
    @Generated
    @Selector("setAuthorEmailAddresses:")
    public native void setAuthorEmailAddresses(NSArray<String> value);

    /**
     * The list of author/authors that have worked on this item.
     * There could be 0 or more authors of a particular item.
     * The order of the authors in the array is preserved, but is not intended to represent
     * the main author or relative importance of the authors.
     */
    @Generated
    @Selector("setAuthorNames:")
    public native void setAuthorNames(NSArray<String> value);

    /**
     * An array of CSPerson objects representing the content of the From: field in an email
     */
    @Generated
    @Selector("setAuthors:")
    public native void setAuthors(NSArray<? extends CSPerson> value);

    /**
     * Number of bits per sample
     * For example bit depth of an image (8-bit, 16-bit etc..) or bit
     * depth per audio sample of uncompressed audio data (8, 16, 24, 32, 64, etc..)
     */
    @Generated
    @Selector("setBitsPerSample:")
    public native void setBitsPerSample(NSNumber value);

    /**
     * The owner of the camera used to capture this image.
     */
    @Generated
    @Selector("setCameraOwner:")
    public native void setCameraOwner(String value);

    /**
     * Identifies city of item origin according to guidelines established by the provider.
     */
    @Generated
    @Selector("setCity:")
    public native void setCity(String value);

    /**
     * The codecs used to encode/decode the media
     */
    @Generated
    @Selector("setCodecs:")
    public native void setCodecs(NSArray<String> value);

    /**
     * What color space model is this item following (For example, "RGB", "CMYK", "YUV", "YCbCr")
     */
    @Generated
    @Selector("setColorSpace:")
    public native void setColorSpace(String value);

    /**
     * This is a comment related to a file.
     */
    @Generated
    @Selector("setComment:")
    public native void setComment(String value);

    /**
     * Date the item was completed
     */
    @Generated
    @Selector("setCompletionDate:")
    public native void setCompletionDate(NSDate value);

    /**
     * The composer of the song/composition contained in the audio file.
     */
    @Generated
    @Selector("setComposer:")
    public native void setComposer(String value);

    /**
     * A list of contacts that are somehow associated with this document, beyond what is captured as Author.
     */
    @Generated
    @Selector("setContactKeywords:")
    public native void setContactKeywords(NSArray<String> value);

    @Generated
    @Selector("setContainerDisplayName:")
    public native void setContainerDisplayName(String value);

    @Generated
    @Selector("setContainerIdentifier:")
    public native void setContainerIdentifier(String value);

    @Generated
    @Selector("setContainerOrder:")
    public native void setContainerOrder(NSNumber value);

    @Generated
    @Selector("setContainerTitle:")
    public native void setContainerTitle(String value);

    /**
     * This is the date that the contents of the item were created
     */
    @Generated
    @Selector("setContentCreationDate:")
    public native void setContentCreationDate(NSDate value);

    /**
     * An account of the content of the resource. Description may include
     * but is not limited to: an abstract, table of contents, reference
     * to a graphical representation of content or a free-text account of
     * the content.
     */
    @Generated
    @Selector("setContentDescription:")
    public native void setContentDescription(String value);

    /**
     * This is the date that the contents of the item were last modified
     */
    @Generated
    @Selector("setContentModificationDate:")
    public native void setContentModificationDate(NSDate value);

    /**
     * Whether or not the item has explicit content. Should be 1 if explicit, 0 for clean.
     */
    @Generated
    @Selector("setContentRating:")
    public native void setContentRating(NSNumber value);

    /**
     * This attribute indicates where the item was obtained from.
     * Examples:
     * - downloaded file may refer to the site they were downloaded from,the refering URL, etc
     * - files received by email may indicate who sent the file, the message subject, etc
     */
    @Generated
    @Selector("setContentSources:")
    public native void setContentSources(NSArray<String> value);

    /**
     * UTI Type pedigree for an item. Common types can be found in UTCoreTypes.h
     */
    @Generated
    @Selector("setContentType:")
    public native void setContentType(String value);

    @Generated
    @Selector("setContentTypeTree:")
    public native void setContentTypeTree(NSArray<String> value);

    /**
     * Optional file URL representing the content to be indexed
     * Applications that are also 'Documents & Data' clients can set this property to allow Spotlight to deduplicate
     * their searchable items against the iCloud Drive's items. When this property is set, Spotlight will not display
     * the iCloud Drive's searchable items that have the same contentURL property.
     */
    @Generated
    @Selector("setContentURL:")
    public native void setContentURL(NSURL value);

    /**
     * Used to designate the entity responsible for making contributions
     * to the content of the resource. Examples of a Contributor include
     * a person, an organization or a service. Typically, the name of a
     * Contributor should be used to indicate the entity.
     */
    @Generated
    @Selector("setContributors:")
    public native void setContributors(NSArray<String> value);

    /**
     * This is the copyright of the content.
     */
    @Generated
    @Selector("setCopyright:")
    public native void setCopyright(String value);

    /**
     * Provides full, publishable, name of the country/primary location where the
     * intellectual property of the item was created,according to guidelines of the provider.
     */
    @Generated
    @Selector("setCountry:")
    public native void setCountry(String value);

    /**
     * Used to designate the extent or scope of the content of the
     * resource. Coverage will typically include spatial location
     * (a place name or geographic co-ordinates), temporal period (a period label, date, or date range)
     * or jurisdiction (such as a named administrative entity).
     * Recommended best practice is to select a value from a controlled vocabulary, and that, where appropriate,
     * named places or time periods be used in preference to numeric identifiers such as sets of co-ordinates or date
     * ranges.
     */
    @Generated
    @Selector("setCoverage:")
    public native void setCoverage(NSArray<String> value);

    /**
     * Application used to create the document content (e.g. "Word",
     * "Framemaker", etc.).
     */
    @Generated
    @Selector("setCreator:")
    public native void setCreator(String value);

    /**
     * The delivery type of the item. Should be 0 for fast start and 1 for RTSP.
     */
    @Generated
    @Selector("setDeliveryType:")
    public native void setDeliveryType(NSNumber value);

    /**
     * Director of the item (e.g. movie director)
     */
    @Generated
    @Selector("setDirector:")
    public native void setDirector(String value);

    /**
     * A localized string to be displayed in the UI for this item.
     */
    @Generated
    @Selector("setDisplayName:")
    public native void setDisplayName(String value);

    /**
     * This property has the same semantics as -[CSSearchableItem domainIdentifier].
     * It can be set on the contentAttributeSet property of a NSUserActivity instance and then used to delete the user
     * activity
     * by calling [[CSSearchableIndex defaultSearchableIndex] deleteSearchableItemsWithDomainIdentifiers:].
     */
    @Generated
    @Selector("setDomainIdentifier:")
    public native void setDomainIdentifier(String value);

    /**
     * This is the date that the file was last downloaded / received.
     */
    @Generated
    @Selector("setDownloadedDate:")
    public native void setDownloadedDate(NSDate value);

    /**
     * Date this item is due.
     */
    @Generated
    @Selector("setDueDate:")
    public native void setDueDate(NSDate value);

    /**
     * This is the duration, in seconds, of the content of the item (if appropriate).
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(NSNumber value);

    /**
     * The version of GPSInfoIFD header that was used to generate the metadata
     */
    @Generated
    @Selector("setEXIFGPSVersion:")
    public native void setEXIFGPSVersion(String value);

    /**
     * The verion of the EXIF header that was used to generate the metadata
     */
    @Generated
    @Selector("setEXIFVersion:")
    public native void setEXIFVersion(String value);

    /**
     * The list of editor/editors that have worked on this item.
     */
    @Generated
    @Selector("setEditors:")
    public native void setEditors(NSArray<String> value);

    /**
     * Email addresses for this item.
     */
    @Generated
    @Selector("setEmailAddresses:")
    public native void setEmailAddresses(NSArray<String> value);

    /**
     * Dictionary with all the headers of the message
     * Keys are header names and values arrays of strings (because a header might be present multiple times in an email)
     */
    @Generated
    @Selector("setEmailHeaders:")
    public native void setEmailHeaders(NSDictionary<String, ? extends NSArray<?>> value);

    /**
     * Software used to convert the original content into a PDF stream
     * (e.g. "Distiller", etc.).
     */
    @Generated
    @Selector("setEncodingApplications:")
    public native void setEncodingApplications(NSArray<String> value);

    /**
     * End date for this item.
     */
    @Generated
    @Selector("setEndDate:")
    public native void setEndDate(NSDate value);

    /**
     * Mode that was used for the exposure. Should be 0 for AutoExposure, 1 for Manual, 2 for AutoBracket.
     */
    @Generated
    @Selector("setExposureMode:")
    public native void setExposureMode(NSNumber value);

    /**
     * The class of the program used by the camera to set exposure when the picture is taken (Manual, Normal, Aperture
     * Priority, ...)
     */
    @Generated
    @Selector("setExposureProgram:")
    public native void setExposureProgram(String value);

    /**
     * Time that the lens was open during exposure in seconds
     */
    @Generated
    @Selector("setExposureTime:")
    public native void setExposureTime(NSNumber value);

    /**
     * The time of the exposure as a string, e.g. "1/250 seconds".
     */
    @Generated
    @Selector("setExposureTimeString:")
    public native void setExposureTimeString(String value);

    /**
     * The focal length of the lens divided by the diameter of the aperture when the image was acquired.
     */
    @Generated
    @Selector("setFNumber:")
    public native void setFNumber(NSNumber value);

    /**
     * Size of the document in MB.
     */
    @Generated
    @Selector("setFileSize:")
    public native void setFileSize(NSNumber value);

    /**
     * Indicates if the flash was used to take the picture. Should be 1 if flash is on, 0 otherwise.
     */
    @Generated
    @Selector("setFlashOn:")
    public native void setFlashOn(NSNumber value);

    /**
     * Indicates if the focal length is 35mm. Should be 1 if true, 0 otherwise
     */
    @Generated
    @Selector("setFocalLength35mm:")
    public native void setFocalLength35mm(NSNumber value);

    /**
     * The actual focal length of the lens in mm.
     */
    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(NSNumber value);

    /**
     * Array of font names used in the item.
     */
    @Generated
    @Selector("setFontNames:")
    public native void setFontNames(NSArray<String> value);

    /**
     * The fully formatted address of the item (obtained from MapKit)
     */
    @Generated
    @Selector("setFullyFormattedAddress:")
    public native void setFullyFormattedAddress(String value);

    @Generated
    @Selector("setGPSAreaInformation:")
    public native void setGPSAreaInformation(String value);

    @Generated
    @Selector("setGPSDOP:")
    public native void setGPSDOP(NSNumber value);

    @Generated
    @Selector("setGPSDateStamp:")
    public native void setGPSDateStamp(NSDate value);

    @Generated
    @Selector("setGPSDestBearing:")
    public native void setGPSDestBearing(NSNumber value);

    @Generated
    @Selector("setGPSDestDistance:")
    public native void setGPSDestDistance(NSNumber value);

    @Generated
    @Selector("setGPSDestLatitude:")
    public native void setGPSDestLatitude(NSNumber value);

    @Generated
    @Selector("setGPSDestLongitude:")
    public native void setGPSDestLongitude(NSNumber value);

    @Generated
    @Selector("setGPSDifferental:")
    public native void setGPSDifferental(NSNumber value);

    @Generated
    @Selector("setGPSMapDatum:")
    public native void setGPSMapDatum(String value);

    @Generated
    @Selector("setGPSMeasureMode:")
    public native void setGPSMeasureMode(String value);

    @Generated
    @Selector("setGPSProcessingMethod:")
    public native void setGPSProcessingMethod(String value);

    @Generated
    @Selector("setGPSStatus:")
    public native void setGPSStatus(String value);

    /**
     * The direction of travel of the item, in degrees from true north.
     */
    @Generated
    @Selector("setGPSTrack:")
    public native void setGPSTrack(NSNumber value);

    /**
     * This attribute indicates whether the MIDI sequence contained in the file is setup for use with a General MIDI
     * device. Should be 1 if true, 0 otherwise.
     */
    @Generated
    @Selector("setGeneralMIDISequence:")
    public native void setGeneralMIDISequence(NSNumber value);

    /**
     * Genre of the item (e.g. movie genre)
     */
    @Generated
    @Selector("setGenre:")
    public native void setGenre(String value);

    /**
     * Contains the HTML content of the document encoded as NSData of UTF-8 encoded string.
     */
    @Generated
    @Selector("setHTMLContentData:")
    public native void setHTMLContentData(NSData value);

    /**
     * Indicates if this image file has an alpha channel. Should be 0 for no alpha channel, 1 for alpha channel.
     */
    @Generated
    @Selector("setHasAlphaChannel:")
    public native void setHasAlphaChannel(NSNumber value);

    /**
     * A publishable entry providing a synopsis of the contents of the item.
     */
    @Generated
    @Selector("setHeadline:")
    public native void setHeadline(String value);

    /**
     * An array of CSPerson objects representing the content of the Bcc: field in an email
     */
    @Generated
    @Selector("setHiddenAdditionalRecipients:")
    public native void setHiddenAdditionalRecipients(NSArray<? extends CSPerson> value);

    /**
     * The ISO Speed the camera was set to when the image was taken. Examples are 100, 200, 400, etc.
     */
    @Generated
    @Selector("setISOSpeed:")
    public native void setISOSpeed(NSNumber value);

    /**
     * Used to reference to the resource within a given
     * context. Recommended best practice is to identify the resource by
     * means of a string or number conforming to a formal identification system.
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    /**
     * The direction of the item's image, in degrees from true north.
     */
    @Generated
    @Selector("setImageDirection:")
    public native void setImageDirection(NSNumber value);

    /**
     * Important dates associated with this item
     */
    @Generated
    @Selector("setImportantDates:")
    public native void setImportantDates(NSArray<? extends NSDate> value);

    /**
     * Information about the item
     */
    @Generated
    @Selector("setInformation:")
    public native void setInformation(String value);

    /**
     * Instant message addresses for this item.
     */
    @Generated
    @Selector("setInstantMessageAddresses:")
    public native void setInstantMessageAddresses(NSArray<String> value);

    /**
     * Other editorial instructions concerning the use of the item, such as embargoes and warnings.
     */
    @Generated
    @Selector("setInstructions:")
    public native void setInstructions(String value);

    /**
     * The musical key of the song/composition contained in an audio file.
     * For example: C, Dm, F#m, Bb.
     */
    @Generated
    @Selector("setKeySignature:")
    public native void setKeySignature(String value);

    /**
     * Represents keywords associated with this particular item.
     * Example Keywords might be Birthday,Important etc.
     */
    @Generated
    @Selector("setKeywords:")
    public native void setKeywords(NSArray<String> value);

    /**
     * Kind that this item represents.
     */
    @Generated
    @Selector("setKind:")
    public native void setKind(String value);

    /**
     * Used to designate the languages of the intellectual content of the
     * resource. Recommended best practice for the values of the Language
     * element is defined by BCP 47.
     */
    @Generated
    @Selector("setLanguages:")
    public native void setLanguages(NSArray<String> value);

    /**
     * This is the date that the item was last used
     */
    @Generated
    @Selector("setLastUsedDate:")
    public native void setLastUsedDate(NSDate value);

    /**
     * The latitude of the item in degrees north of the equator, expressed
     * using the WGS84 datum. Negative values lie south of the equator.
     */
    @Generated
    @Selector("setLatitude:")
    public native void setLatitude(NSNumber value);

    /**
     * The names of the various layers in the file
     */
    @Generated
    @Selector("setLayerNames:")
    public native void setLayerNames(NSArray<String> value);

    /**
     * The model of the lens used to capture this image.
     */
    @Generated
    @Selector("setLensModel:")
    public native void setLensModel(String value);

    /**
     * This attribute indicates if the document is likely to be considered junk. Should be 1 if true, 0 otherwise
     */
    @Generated
    @Selector("setLikelyJunk:")
    public native void setLikelyJunk(NSNumber value);

    /**
     * Whether or not the item is local. Should be 1 if true, 0 otherwise.
     */
    @Generated
    @Selector("setLocal:")
    public native void setLocal(NSNumber value);

    /**
     * The longitude of the item in degrees east of the prime meridian,
     * expressed using the WGS84 datum. Negative values lie west of the prime meridian.
     */
    @Generated
    @Selector("setLongitude:")
    public native void setLongitude(NSNumber value);

    /**
     * The lyricist/text writer for song/composition contained in the audio file.
     */
    @Generated
    @Selector("setLyricist:")
    public native void setLyricist(String value);

    /**
     * Array of Mailbox identifiers associated with the item. e.g. CSMailboxInbox, CSMailboxDrafts, CSMailboxSent, or a
     * custom identifier etc.
     */
    @Generated
    @Selector("setMailboxIdentifiers:")
    public native void setMailboxIdentifiers(NSArray<String> value);

    /**
     * The smallest F number of the lens. The unit is the APEX
     * value. Ordinarily it is given in the range of 00.00 to 99.99.
     */
    @Generated
    @Selector("setMaxAperture:")
    public native void setMaxAperture(NSNumber value);

    /**
     * Media types present in the content
     */
    @Generated
    @Selector("setMediaTypes:")
    public native void setMediaTypes(NSArray<String> value);

    /**
     * This is the date that the last metadata attribute was changed.
     */
    @Generated
    @Selector("setMetadataModificationDate:")
    public native void setMetadataModificationDate(NSDate value);

    /**
     * The metering mode for the image (Average, Partial, Pattern, ...)
     */
    @Generated
    @Selector("setMeteringMode:")
    public native void setMeteringMode(String value);

    /**
     * The musical genre of the song/composition contained in the audio file.
     * For example: Jazz, Pop, Rock, Classical.
     */
    @Generated
    @Selector("setMusicalGenre:")
    public native void setMusicalGenre(String value);

    /**
     * Meta data attribute that stores the category of
     * instrument. Files should have an instrument associated with
     * them ("Other Instrument" is provided as a catch-all). For some
     * categories, like "Keyboards" there are instrument names which
     * provide a more detailed instrument definition (e.g., Piano,Organ, etc.)
     */
    @Generated
    @Selector("setMusicalInstrumentCategory:")
    public native void setMusicalInstrumentCategory(String value);

    /**
     * Meta data attribute that stores the name of instrument
     * (relative to the instrument category) Files can have an
     * instrument name associated with them if they have certain
     * instrument categories (e.g., the category Percussion has
     * multiple instruments, including Conga and Bongo).
     */
    @Generated
    @Selector("setMusicalInstrumentName:")
    public native void setMusicalInstrumentName(String value);

    /**
     * The name of the location or point of interest associated with the item. The name may be user provided.
     */
    @Generated
    @Selector("setNamedLocation:")
    public native void setNamedLocation(String value);

    /**
     * Used to indicate company/Organization that created the document.
     */
    @Generated
    @Selector("setOrganizations:")
    public native void setOrganizations(NSArray<String> value);

    /**
     * The orientation of the data. Should be 0 for Landscape or 1 for Portrait.
     */
    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(NSNumber value);

    /**
     * Original format of the movie
     */
    @Generated
    @Selector("setOriginalFormat:")
    public native void setOriginalFormat(String value);

    /**
     * Original source of the movie
     */
    @Generated
    @Selector("setOriginalSource:")
    public native void setOriginalSource(String value);

    /**
     * Number of pages in the item.
     */
    @Generated
    @Selector("setPageCount:")
    public native void setPageCount(NSNumber value);

    /**
     * Height in points (72 points per inch) of the document page
     * (first page only for PDF's - other pages within the PDF may
     * not be the same height).
     */
    @Generated
    @Selector("setPageHeight:")
    public native void setPageHeight(NSNumber value);

    /**
     * Width in points (72 points per inch) of the document page
     * (first page only for PDF's - other pages within the PDF may
     * not be the same width).
     */
    @Generated
    @Selector("setPageWidth:")
    public native void setPageWidth(NSNumber value);

    /**
     * The list of people who are visible in an image or movie or written about in a document.
     */
    @Generated
    @Selector("setParticipants:")
    public native void setParticipants(NSArray<String> value);

    /**
     * This is the complete path to the item.
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(String value);

    /**
     * Performers in the movie
     */
    @Generated
    @Selector("setPerformers:")
    public native void setPerformers(NSArray<String> value);

    /**
     * Phone numbers for this item.
     */
    @Generated
    @Selector("setPhoneNumbers:")
    public native void setPhoneNumbers(NSArray<String> value);

    /**
     * The total number of pixels in the item.
     */
    @Generated
    @Selector("setPixelCount:")
    public native void setPixelCount(NSNumber value);

    /**
     * The height of the item in pixels (ie Image height or Video frame height)
     */
    @Generated
    @Selector("setPixelHeight:")
    public native void setPixelHeight(NSNumber value);

    /**
     * The width of the item in pixels (ie Image width or Video frame width)
     */
    @Generated
    @Selector("setPixelWidth:")
    public native void setPixelWidth(NSNumber value);

    /**
     * User play count of this item
     */
    @Generated
    @Selector("setPlayCount:")
    public native void setPlayCount(NSNumber value);

    /**
     * The postal code for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("setPostalCode:")
    public native void setPostalCode(String value);

    /**
     * An array of CSPerson objects representing the content of the To: field in an email
     */
    @Generated
    @Selector("setPrimaryRecipients:")
    public native void setPrimaryRecipients(NSArray<? extends CSPerson> value);

    /**
     * Producer of the content
     */
    @Generated
    @Selector("setProducer:")
    public native void setProducer(String value);

    /**
     * Name of the color profile used for the image
     */
    @Generated
    @Selector("setProfileName:")
    public native void setProfileName(String value);

    /**
     * The list of projects that this item is part of.
     * For example if you were working on a movie, all of the movie files could be marked
     * as belonging to the project "My movie"
     */
    @Generated
    @Selector("setProjects:")
    public native void setProjects(NSArray<String> value);

    /**
     * Used to designate the entity responsible for making the resource
     * available. Examples of a Publisher include a person, an
     * organization, or a service. Typically, the name of a Publisher
     * should be used to indicate the entity.
     */
    @Generated
    @Selector("setPublishers:")
    public native void setPublishers(NSArray<String> value);

    /**
     * User rating of this item out of 5 stars
     */
    @Generated
    @Selector("setRating:")
    public native void setRating(NSNumber value);

    /**
     * A description of the rating. E.g. the number of reviewers.
     */
    @Generated
    @Selector("setRatingDescription:")
    public native void setRatingDescription(String value);

    /**
     * This attribute indicates the recipient addresses of the document.
     */
    @Generated
    @Selector("setRecipientAddresses:")
    public native void setRecipientAddresses(NSArray<String> value);

    /**
     * This attribute indicates the reciepients email addresses.
     * (This is always the email address, and not the human readable version).
     */
    @Generated
    @Selector("setRecipientEmailAddresses:")
    public native void setRecipientEmailAddresses(NSArray<String> value);

    /**
     * This attribute indicates the recipients of this item.
     */
    @Generated
    @Selector("setRecipientNames:")
    public native void setRecipientNames(NSArray<String> value);

    /**
     * The recording date of the song/composition. This information differs from
     * the contentCreationDate attribute as it indicates the date that the
     * 'art' was created, in contrast to contentCreationDate which for example, could indicate
     * the creation date of an edited or 'mastered' version of the original art.
     */
    @Generated
    @Selector("setRecordingDate:")
    public native void setRecordingDate(NSDate value);

    /**
     * Indicates if red-eye reduction was used to take the picture. Should be 0 for no red-eye, 1 for red-eye
     */
    @Generated
    @Selector("setRedEyeOn:")
    public native void setRedEyeOn(NSNumber value);

    /**
     * For activities, this is the unique identifier for the item this activity is related to. If the item doesn't exist
     * in the index, the activity will not get stored. When the item is deleted, the activity will also be deleted.
     */
    @Generated
    @Selector("setRelatedUniqueIdentifier:")
    public native void setRelatedUniqueIdentifier(String value);

    /**
     * Resolution height of this image in DPI
     */
    @Generated
    @Selector("setResolutionHeightDPI:")
    public native void setResolutionHeightDPI(NSNumber value);

    /**
     * Resolution width of this image in DPI
     */
    @Generated
    @Selector("setResolutionWidthDPI:")
    public native void setResolutionWidthDPI(NSNumber value);

    /**
     * Used to provide a link to information about rights held in and
     * over the resource. Typically a Rights element will contain a
     * rights management statement for the resource, or reference a
     * service providing such information. Rights information often
     * encompasses Intellectual Property Rights (IPR), Copyright, and
     * various Property Rights. If the rights element is absent, no
     * assumptions can be made about the status of these and other rights
     * with respect to the resource.
     */
    @Generated
    @Selector("setRights:")
    public native void setRights(String value);

    /**
     * Used to indicate the role of the document creator
     */
    @Generated
    @Selector("setRole:")
    public native void setRole(String value);

    /**
     * Security (encryption) method used in the file
     */
    @Generated
    @Selector("setSecurityMethod:")
    public native void setSecurityMethod(String value);

    /**
     * The speed of the item, in kilometers per hour.
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(NSNumber value);

    /**
     * Start date of this item.
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    /**
     * Identifies Province/State of origin according to guidelines established by the provider.
     */
    @Generated
    @Selector("setStateOrProvince:")
    public native void setStateOrProvince(String value);

    /**
     * Whether the content is prepared for streaming. Should be 0 for not streamable, 1 for streamable.
     */
    @Generated
    @Selector("setStreamable:")
    public native void setStreamable(NSNumber value);

    /**
     * The sub-location (e.g., street number) for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("setSubThoroughfare:")
    public native void setSubThoroughfare(String value);

    /**
     * Subject of the this item.
     */
    @Generated
    @Selector("setSubject:")
    public native void setSubject(String value);

    /**
     * If supportsNavigation is set to 1, and the item has the latitude and longitude properties set, then the latitude
     * and longitude may be used for navigation. For example, supportsNavigation would be set on a restaurant review,
     * but not on a photo.
     */
    @Generated
    @Selector("setSupportsNavigation:")
    public native void setSupportsNavigation(NSNumber value);

    /**
     * If supportsPhoneCall is 1 and the item has the phoneNumbers property, then the phone number may be used to
     * initiate phone calls. This should be used to indicate that using the phone number is appropriate, and a primary
     * action for the user. For example, supportsPhoneCall would be set on a business, but not an academic paper that
     * happens to have phone numbers for the authors or the institution.
     */
    @Generated
    @Selector("setSupportsPhoneCall:")
    public native void setSupportsPhoneCall(NSNumber value);

    /**
     * The tempo of the music contained in the audio file in Beats Per Minute.
     */
    @Generated
    @Selector("setTempo:")
    public native void setTempo(NSNumber value);

    /**
     * Contains the text content of the document.
     */
    @Generated
    @Selector("setTextContent:")
    public native void setTextContent(String value);

    /**
     * Theme of the this item.
     */
    @Generated
    @Selector("setTheme:")
    public native void setTheme(String value);

    /**
     * The location (e.g., street name) for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("setThoroughfare:")
    public native void setThoroughfare(String value);

    /**
     * Optional image data for thumbnail for this item
     */
    @Generated
    @Selector("setThumbnailData:")
    public native void setThumbnailData(NSData value);

    /**
     * Optional file URL pointing to a thumbnail image for this item
     */
    @Generated
    @Selector("setThumbnailURL:")
    public native void setThumbnailURL(NSURL value);

    /**
     * The time signature of the musical composition contained in the audio/MIDI file.
     * For example: "4/4", "7/8".
     */
    @Generated
    @Selector("setTimeSignature:")
    public native void setTimeSignature(String value);

    /**
     * The timestamp on the item. This generally is used to indicate the time at
     * which the event captured by the item took place.
     */
    @Generated
    @Selector("setTimestamp:")
    public native void setTimestamp(NSDate value);

    /**
     * The title of this particular item.
     * Title of the document, or it could be the title of this mp3 or a subject of a mail message.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The total bit rate (audio & video combined) of the media
     */
    @Generated
    @Selector("setTotalBitRate:")
    public native void setTotalBitRate(NSNumber value);

    /**
     * URL of the item
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    @Generated
    @Selector("setValue:forCustomKey:")
    public native void setValueForCustomKey(@Mapped(ObjCObjectMapper.class) NSSecureCoding value,
            CSCustomAttributeKey key);

    /**
     * A version specifier for this item.
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(String value);

    /**
     * The video bit rate
     */
    @Generated
    @Selector("setVideoBitRate:")
    public native void setVideoBitRate(NSNumber value);

    /**
     * For activities, this is the unique identifier for an item this activity is related to. Unlike
     * relatedUniqueIdentifier, this attribute does not link the life time of the items.
     */
    @Generated
    @Selector("setWeakRelatedUniqueIdentifier:")
    public native void setWeakRelatedUniqueIdentifier(String value);

    /**
     * The white balance setting of the camera when the image was acquired. Should be 0 for Auto or 1 for Manual.
     */
    @Generated
    @Selector("setWhiteBalance:")
    public native void setWhiteBalance(NSNumber value);

    /**
     * The speed of the item, in kilometers per hour.
     */
    @Generated
    @Selector("speed")
    public native NSNumber speed();

    /**
     * Start date of this item.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * Identifies Province/State of origin according to guidelines established by the provider.
     */
    @Generated
    @Selector("stateOrProvince")
    public native String stateOrProvince();

    /**
     * The sub-location (e.g., street number) for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("subThoroughfare")
    public native String subThoroughfare();

    /**
     * Subject of the this item.
     */
    @Generated
    @Selector("subject")
    public native String subject();

    /**
     * If supportsNavigation is set to 1, and the item has the latitude and longitude properties set, then the latitude
     * and longitude may be used for navigation. For example, supportsNavigation would be set on a restaurant review,
     * but not on a photo.
     */
    @Generated
    @Selector("supportsNavigation")
    public native NSNumber supportsNavigation();

    /**
     * If supportsPhoneCall is 1 and the item has the phoneNumbers property, then the phone number may be used to
     * initiate phone calls. This should be used to indicate that using the phone number is appropriate, and a primary
     * action for the user. For example, supportsPhoneCall would be set on a business, but not an academic paper that
     * happens to have phone numbers for the authors or the institution.
     */
    @Generated
    @Selector("supportsPhoneCall")
    public native NSNumber supportsPhoneCall();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The tempo of the music contained in the audio file in Beats Per Minute.
     */
    @Generated
    @Selector("tempo")
    public native NSNumber tempo();

    /**
     * Contains the text content of the document.
     */
    @Generated
    @Selector("textContent")
    public native String textContent();

    /**
     * Theme of the this item.
     */
    @Generated
    @Selector("theme")
    public native String theme();

    /**
     * The location (e.g., street name) for the item according to guidelines established by the provider.
     */
    @Generated
    @Selector("thoroughfare")
    public native String thoroughfare();

    /**
     * Optional image data for thumbnail for this item
     */
    @Generated
    @Selector("thumbnailData")
    public native NSData thumbnailData();

    /**
     * Optional file URL pointing to a thumbnail image for this item
     */
    @Generated
    @Selector("thumbnailURL")
    public native NSURL thumbnailURL();

    /**
     * The time signature of the musical composition contained in the audio/MIDI file.
     * For example: "4/4", "7/8".
     */
    @Generated
    @Selector("timeSignature")
    public native String timeSignature();

    /**
     * The timestamp on the item. This generally is used to indicate the time at
     * which the event captured by the item took place.
     */
    @Generated
    @Selector("timestamp")
    public native NSDate timestamp();

    /**
     * The title of this particular item.
     * Title of the document, or it could be the title of this mp3 or a subject of a mail message.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The total bit rate (audio & video combined) of the media
     */
    @Generated
    @Selector("totalBitRate")
    public native NSNumber totalBitRate();

    @Generated
    @Selector("valueForCustomKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSSecureCoding valueForCustomKey(CSCustomAttributeKey key);

    /**
     * A version specifier for this item.
     */
    @Generated
    @Selector("version")
    public native String version();

    /**
     * The video bit rate
     */
    @Generated
    @Selector("videoBitRate")
    public native NSNumber videoBitRate();

    /**
     * For activities, this is the unique identifier for an item this activity is related to. Unlike
     * relatedUniqueIdentifier, this attribute does not link the life time of the items.
     */
    @Generated
    @Selector("weakRelatedUniqueIdentifier")
    public native String weakRelatedUniqueIdentifier();

    /**
     * The white balance setting of the camera when the image was acquired. Should be 0 for Auto or 1 for Manual.
     */
    @Generated
    @Selector("whiteBalance")
    public native NSNumber whiteBalance();

    /**
     * This property is used to indicate if the indexed item was created by the user
     * It is used to distinguish pushed app content from content that required explicit user interaction
     * Example content that may set this field: user created notes, documents
     */
    @Generated
    @Selector("isUserCreated")
    public native NSNumber isUserCreated();

    /**
     * This property is used to indicate if the indexed item was selected by the user
     * It is used to distinguish pushed app content from content that a user has chosen to add to a collection
     * Example content that may set this field: downloaded media content, bookmarked websites/news articles
     */
    @Generated
    @Selector("isUserCurated")
    public native NSNumber isUserCurated();

    /**
     * This property is used to indicate if the indexed item has been purchased or otherwise acquired by the user
     * Example content are songs bought by a user and made searchable
     */
    @Generated
    @Selector("isUserOwned")
    public native NSNumber isUserOwned();

    /**
     * An array of types identifiers that owner can provided a NSData representation.
     */
    @Generated
    @Selector("providerDataTypeIdentifiers")
    public native NSArray<String> providerDataTypeIdentifiers();

    /**
     * An array of types identifiers that owner can provided a NSURL to file representation.
     */
    @Generated
    @Selector("providerFileTypeIdentifiers")
    public native NSArray<String> providerFileTypeIdentifiers();

    /**
     * An array of types identifiers that owner can provided a NSURL to inplace file representation.
     */
    @Generated
    @Selector("providerInPlaceFileTypeIdentifiers")
    public native NSArray<String> providerInPlaceFileTypeIdentifiers();

    /**
     * This property allows content donors to provide a ranking signal to each indexed item
     * It will inform the ranker, allowing it to distinguish more easily between otherwise similar items
     * This is query-independent and should be used to indicate the relative importance of an item w.r.t. all other
     * items for the same application
     * Expected value ∈ [0-100]; preferably integral values
     * Monotonically increasing with larger values being considered better results
     */
    @Generated
    @Selector("rankingHint")
    public native NSNumber rankingHint();

    /**
     * An array of types identifiers that owner can provided a NSData representation.
     */
    @Generated
    @Selector("setProviderDataTypeIdentifiers:")
    public native void setProviderDataTypeIdentifiers(NSArray<String> value);

    /**
     * An array of types identifiers that owner can provided a NSURL to file representation.
     */
    @Generated
    @Selector("setProviderFileTypeIdentifiers:")
    public native void setProviderFileTypeIdentifiers(NSArray<String> value);

    /**
     * An array of types identifiers that owner can provided a NSURL to inplace file representation.
     */
    @Generated
    @Selector("setProviderInPlaceFileTypeIdentifiers:")
    public native void setProviderInPlaceFileTypeIdentifiers(NSArray<String> value);

    /**
     * This property allows content donors to provide a ranking signal to each indexed item
     * It will inform the ranker, allowing it to distinguish more easily between otherwise similar items
     * This is query-independent and should be used to indicate the relative importance of an item w.r.t. all other
     * items for the same application
     * Expected value ∈ [0-100]; preferably integral values
     * Monotonically increasing with larger values being considered better results
     */
    @Generated
    @Selector("setRankingHint:")
    public native void setRankingHint(NSNumber value);

    /**
     * This property is used to indicate if the indexed item was created by the user
     * It is used to distinguish pushed app content from content that required explicit user interaction
     * Example content that may set this field: user created notes, documents
     */
    @Generated
    @Selector("setUserCreated:")
    public native void setUserCreated(NSNumber value);

    /**
     * This property is used to indicate if the indexed item was selected by the user
     * It is used to distinguish pushed app content from content that a user has chosen to add to a collection
     * Example content that may set this field: downloaded media content, bookmarked websites/news articles
     */
    @Generated
    @Selector("setUserCurated:")
    public native void setUserCurated(NSNumber value);

    /**
     * This property is used to indicate if the indexed item has been purchased or otherwise acquired by the user
     * Example content are songs bought by a user and made searchable
     */
    @Generated
    @Selector("setUserOwned:")
    public native void setUserOwned(NSNumber value);

    @Generated
    @Selector("initWithContentType:")
    public native CSSearchableItemAttributeSet initWithContentType(UTType contentType);

    /**
     * An array of strings that are the custom action identifiers.
     */
    @Generated
    @Selector("actionIdentifiers")
    public native NSArray<String> actionIdentifiers();

    /**
     * Optional file URL pointing to a thumbnail image for this item that will be preferred in dark appearances
     */
    @Generated
    @Selector("darkThumbnailURL")
    public native NSURL darkThumbnailURL();

    /**
     * An array of strings that are the custom action identifiers.
     */
    @Generated
    @Selector("setActionIdentifiers:")
    public native void setActionIdentifiers(NSArray<String> value);

    /**
     * Optional file URL pointing to a thumbnail image for this item that will be preferred in dark appearances
     */
    @Generated
    @Selector("setDarkThumbnailURL:")
    public native void setDarkThumbnailURL(NSURL value);

    /**
     * The file type used for the share action.
     */
    @Generated
    @Selector("setSharedItemContentType:")
    public native void setSharedItemContentType(UTType value);

    /**
     * The file type used for the share action.
     */
    @Generated
    @Selector("sharedItemContentType")
    public native UTType sharedItemContentType();
}
