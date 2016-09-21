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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("EXIFGPSVersion")
    public native String EXIFGPSVersion();

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

    @Generated
    @Selector("GPSTrack")
    public native NSNumber GPSTrack();

    @Generated
    @Selector("HTMLContentData")
    public native NSData HTMLContentData();

    @Generated
    @Selector("ISOSpeed")
    public native NSNumber ISOSpeed();

    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Selector("accountHandles")
    public native NSArray<String> accountHandles();

    @Generated
    @Selector("accountIdentifier")
    public native String accountIdentifier();

    @Generated
    @Selector("acquisitionMake")
    public native String acquisitionMake();

    @Generated
    @Selector("acquisitionModel")
    public native String acquisitionModel();

    @Generated
    @Selector("addedDate")
    public native NSDate addedDate();

    @Generated
    @Selector("additionalRecipients")
    public native NSArray<? extends CSPerson> additionalRecipients();

    @Generated
    @Selector("album")
    public native String album();

    @Generated
    @Selector("allDay")
    public native NSNumber allDay();

    @Generated
    @Selector("alternateNames")
    public native NSArray<String> alternateNames();

    @Generated
    @Selector("altitude")
    public native NSNumber altitude();

    @Generated
    @Selector("aperture")
    public native NSNumber aperture();

    @Generated
    @Selector("artist")
    public native String artist();

    @Generated
    @Selector("audiences")
    public native NSArray<String> audiences();

    @Generated
    @Selector("audioBitRate")
    public native NSNumber audioBitRate();

    @Generated
    @Selector("audioChannelCount")
    public native NSNumber audioChannelCount();

    @Generated
    @Selector("audioEncodingApplication")
    public native String audioEncodingApplication();

    @Generated
    @Selector("audioSampleRate")
    public native NSNumber audioSampleRate();

    @Generated
    @Selector("audioTrackNumber")
    public native NSNumber audioTrackNumber();

    @Generated
    @Selector("authorAddresses")
    public native NSArray<String> authorAddresses();

    @Generated
    @Selector("authorEmailAddresses")
    public native NSArray<String> authorEmailAddresses();

    @Generated
    @Selector("authorNames")
    public native NSArray<String> authorNames();

    @Generated
    @Selector("authors")
    public native NSArray<? extends CSPerson> authors();

    @Generated
    @Selector("bitsPerSample")
    public native NSNumber bitsPerSample();

    @Generated
    @Selector("cameraOwner")
    public native String cameraOwner();

    @Generated
    @Selector("city")
    public native String city();

    @Generated
    @Selector("codecs")
    public native NSArray<String> codecs();

    @Generated
    @Selector("colorSpace")
    public native String colorSpace();

    @Generated
    @Selector("comment")
    public native String comment();

    @Generated
    @Selector("completionDate")
    public native NSDate completionDate();

    @Generated
    @Selector("composer")
    public native String composer();

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

    @Generated
    @Selector("contentCreationDate")
    public native NSDate contentCreationDate();

    @Generated
    @Selector("contentDescription")
    public native String contentDescription();

    @Generated
    @Selector("contentModificationDate")
    public native NSDate contentModificationDate();

    @Generated
    @Selector("contentRating")
    public native NSNumber contentRating();

    @Generated
    @Selector("contentSources")
    public native NSArray<String> contentSources();

    @Generated
    @Selector("contentType")
    public native String contentType();

    @Generated
    @Selector("contentTypeTree")
    public native NSArray<String> contentTypeTree();

    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    @Generated
    @Selector("contributors")
    public native NSArray<String> contributors();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("copyright")
    public native String copyright();

    @Generated
    @Selector("country")
    public native String country();

    @Generated
    @Selector("coverage")
    public native NSArray<String> coverage();

    @Generated
    @Selector("creator")
    public native String creator();

    @Generated
    @Selector("deliveryType")
    public native NSNumber deliveryType();

    @Generated
    @Selector("director")
    public native String director();

    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("domainIdentifier")
    public native String domainIdentifier();

    @Generated
    @Selector("downloadedDate")
    public native NSDate downloadedDate();

    @Generated
    @Selector("dueDate")
    public native NSDate dueDate();

    @Generated
    @Selector("duration")
    public native NSNumber duration();

    @Generated
    @Selector("editors")
    public native NSArray<String> editors();

    @Generated
    @Selector("emailAddresses")
    public native NSArray<String> emailAddresses();

    @Generated
    @Selector("emailHeaders")
    public native NSDictionary<String, ? extends NSArray<?>> emailHeaders();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("encodingApplications")
    public native NSArray<String> encodingApplications();

    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("exposureMode")
    public native NSNumber exposureMode();

    @Generated
    @Selector("exposureProgram")
    public native String exposureProgram();

    @Generated
    @Selector("exposureTime")
    public native NSNumber exposureTime();

    @Generated
    @Selector("exposureTimeString")
    public native String exposureTimeString();

    @Generated
    @Selector("fNumber")
    public native NSNumber fNumber();

    @Generated
    @Selector("fileSize")
    public native NSNumber fileSize();

    @Generated
    @Selector("focalLength")
    public native NSNumber focalLength();

    @Generated
    @Selector("fontNames")
    public native NSArray<String> fontNames();

    @Generated
    @Selector("fullyFormattedAddress")
    public native String fullyFormattedAddress();

    @Generated
    @Selector("genre")
    public native String genre();

    @Generated
    @Selector("hasAlphaChannel")
    public native NSNumber hasAlphaChannel();

    @Generated
    @Selector("headline")
    public native String headline();

    @Generated
    @Selector("hiddenAdditionalRecipients")
    public native NSArray<? extends CSPerson> hiddenAdditionalRecipients();

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("imageDirection")
    public native NSNumber imageDirection();

    @Generated
    @Selector("importantDates")
    public native NSArray<? extends NSDate> importantDates();

    @Generated
    @Selector("information")
    public native String information();

    @Generated
    @Selector("init")
    public native CSSearchableItemAttributeSet init();

    @Generated
    @Selector("initWithCoder:")
    public native CSSearchableItemAttributeSet initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithItemContentType:")
    public native CSSearchableItemAttributeSet initWithItemContentType(String itemContentType);

    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<String> instantMessageAddresses();

    @Generated
    @Selector("instructions")
    public native String instructions();

    @Generated
    @Selector("isFlashOn")
    public native NSNumber isFlashOn();

    @Generated
    @Selector("isFocalLength35mm")
    public native NSNumber isFocalLength35mm();

    @Generated
    @Selector("isGeneralMIDISequence")
    public native NSNumber isGeneralMIDISequence();

    @Generated
    @Selector("isLikelyJunk")
    public native NSNumber isLikelyJunk();

    @Generated
    @Selector("isLocal")
    public native NSNumber isLocal();

    @Generated
    @Selector("isRedEyeOn")
    public native NSNumber isRedEyeOn();

    @Generated
    @Selector("isStreamable")
    public native NSNumber isStreamable();

    @Generated
    @Selector("keySignature")
    public native String keySignature();

    @Generated
    @Selector("keywords")
    public native NSArray<String> keywords();

    @Generated
    @Selector("kind")
    public native String kind();

    @Generated
    @Selector("languages")
    public native NSArray<String> languages();

    @Generated
    @Selector("lastUsedDate")
    public native NSDate lastUsedDate();

    @Generated
    @Selector("latitude")
    public native NSNumber latitude();

    @Generated
    @Selector("layerNames")
    public native NSArray<String> layerNames();

    @Generated
    @Selector("lensModel")
    public native String lensModel();

    @Generated
    @Selector("longitude")
    public native NSNumber longitude();

    @Generated
    @Selector("lyricist")
    public native String lyricist();

    @Generated
    @Selector("mailboxIdentifiers")
    public native NSArray<String> mailboxIdentifiers();

    @Generated
    @Selector("maxAperture")
    public native NSNumber maxAperture();

    @Generated
    @Selector("mediaTypes")
    public native NSArray<String> mediaTypes();

    @Generated
    @Selector("metadataModificationDate")
    public native NSDate metadataModificationDate();

    @Generated
    @Selector("meteringMode")
    public native String meteringMode();

    @Generated
    @Selector("musicalGenre")
    public native String musicalGenre();

    @Generated
    @Selector("musicalInstrumentCategory")
    public native String musicalInstrumentCategory();

    @Generated
    @Selector("musicalInstrumentName")
    public native String musicalInstrumentName();

    @Generated
    @Selector("namedLocation")
    public native String namedLocation();

    @Generated
    @Selector("organizations")
    public native NSArray<String> organizations();

    @Generated
    @Selector("orientation")
    public native NSNumber orientation();

    @Generated
    @Selector("originalFormat")
    public native String originalFormat();

    @Generated
    @Selector("originalSource")
    public native String originalSource();

    @Generated
    @Selector("pageCount")
    public native NSNumber pageCount();

    @Generated
    @Selector("pageHeight")
    public native NSNumber pageHeight();

    @Generated
    @Selector("pageWidth")
    public native NSNumber pageWidth();

    @Generated
    @Selector("participants")
    public native NSArray<String> participants();

    @Generated
    @Selector("path")
    public native String path();

    @Generated
    @Selector("performers")
    public native NSArray<String> performers();

    @Generated
    @Selector("phoneNumbers")
    public native NSArray<String> phoneNumbers();

    @Generated
    @Selector("pixelCount")
    public native NSNumber pixelCount();

    @Generated
    @Selector("pixelHeight")
    public native NSNumber pixelHeight();

    @Generated
    @Selector("pixelWidth")
    public native NSNumber pixelWidth();

    @Generated
    @Selector("playCount")
    public native NSNumber playCount();

    @Generated
    @Selector("postalCode")
    public native String postalCode();

    @Generated
    @Selector("primaryRecipients")
    public native NSArray<? extends CSPerson> primaryRecipients();

    @Generated
    @Selector("producer")
    public native String producer();

    @Generated
    @Selector("profileName")
    public native String profileName();

    @Generated
    @Selector("projects")
    public native NSArray<String> projects();

    @Generated
    @Selector("publishers")
    public native NSArray<String> publishers();

    @Generated
    @Selector("rating")
    public native NSNumber rating();

    @Generated
    @Selector("ratingDescription")
    public native String ratingDescription();

    @Generated
    @Selector("recipientAddresses")
    public native NSArray<String> recipientAddresses();

    @Generated
    @Selector("recipientEmailAddresses")
    public native NSArray<String> recipientEmailAddresses();

    @Generated
    @Selector("recipientNames")
    public native NSArray<String> recipientNames();

    @Generated
    @Selector("recordingDate")
    public native NSDate recordingDate();

    @Generated
    @Selector("relatedUniqueIdentifier")
    public native String relatedUniqueIdentifier();

    @Generated
    @Selector("resolutionHeightDPI")
    public native NSNumber resolutionHeightDPI();

    @Generated
    @Selector("resolutionWidthDPI")
    public native NSNumber resolutionWidthDPI();

    @Generated
    @Selector("rights")
    public native String rights();

    @Generated
    @Selector("role")
    public native String role();

    @Generated
    @Selector("securityMethod")
    public native String securityMethod();

    @Generated
    @Selector("setAccountHandles:")
    public native void setAccountHandles(NSArray<String> value);

    @Generated
    @Selector("setAccountIdentifier:")
    public native void setAccountIdentifier(String value);

    @Generated
    @Selector("setAcquisitionMake:")
    public native void setAcquisitionMake(String value);

    @Generated
    @Selector("setAcquisitionModel:")
    public native void setAcquisitionModel(String value);

    @Generated
    @Selector("setAddedDate:")
    public native void setAddedDate(NSDate value);

    @Generated
    @Selector("setAdditionalRecipients:")
    public native void setAdditionalRecipients(NSArray<? extends CSPerson> value);

    @Generated
    @Selector("setAlbum:")
    public native void setAlbum(String value);

    @Generated
    @Selector("setAllDay:")
    public native void setAllDay(NSNumber value);

    @Generated
    @Selector("setAlternateNames:")
    public native void setAlternateNames(NSArray<String> value);

    @Generated
    @Selector("setAltitude:")
    public native void setAltitude(NSNumber value);

    @Generated
    @Selector("setAperture:")
    public native void setAperture(NSNumber value);

    @Generated
    @Selector("setArtist:")
    public native void setArtist(String value);

    @Generated
    @Selector("setAudiences:")
    public native void setAudiences(NSArray<String> value);

    @Generated
    @Selector("setAudioBitRate:")
    public native void setAudioBitRate(NSNumber value);

    @Generated
    @Selector("setAudioChannelCount:")
    public native void setAudioChannelCount(NSNumber value);

    @Generated
    @Selector("setAudioEncodingApplication:")
    public native void setAudioEncodingApplication(String value);

    @Generated
    @Selector("setAudioSampleRate:")
    public native void setAudioSampleRate(NSNumber value);

    @Generated
    @Selector("setAudioTrackNumber:")
    public native void setAudioTrackNumber(NSNumber value);

    @Generated
    @Selector("setAuthorAddresses:")
    public native void setAuthorAddresses(NSArray<String> value);

    @Generated
    @Selector("setAuthorEmailAddresses:")
    public native void setAuthorEmailAddresses(NSArray<String> value);

    @Generated
    @Selector("setAuthorNames:")
    public native void setAuthorNames(NSArray<String> value);

    @Generated
    @Selector("setAuthors:")
    public native void setAuthors(NSArray<? extends CSPerson> value);

    @Generated
    @Selector("setBitsPerSample:")
    public native void setBitsPerSample(NSNumber value);

    @Generated
    @Selector("setCameraOwner:")
    public native void setCameraOwner(String value);

    @Generated
    @Selector("setCity:")
    public native void setCity(String value);

    @Generated
    @Selector("setCodecs:")
    public native void setCodecs(NSArray<String> value);

    @Generated
    @Selector("setColorSpace:")
    public native void setColorSpace(String value);

    @Generated
    @Selector("setComment:")
    public native void setComment(String value);

    @Generated
    @Selector("setCompletionDate:")
    public native void setCompletionDate(NSDate value);

    @Generated
    @Selector("setComposer:")
    public native void setComposer(String value);

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

    @Generated
    @Selector("setContentCreationDate:")
    public native void setContentCreationDate(NSDate value);

    @Generated
    @Selector("setContentDescription:")
    public native void setContentDescription(String value);

    @Generated
    @Selector("setContentModificationDate:")
    public native void setContentModificationDate(NSDate value);

    @Generated
    @Selector("setContentRating:")
    public native void setContentRating(NSNumber value);

    @Generated
    @Selector("setContentSources:")
    public native void setContentSources(NSArray<String> value);

    @Generated
    @Selector("setContentType:")
    public native void setContentType(String value);

    @Generated
    @Selector("setContentTypeTree:")
    public native void setContentTypeTree(NSArray<String> value);

    @Generated
    @Selector("setContentURL:")
    public native void setContentURL(NSURL value);

    @Generated
    @Selector("setContributors:")
    public native void setContributors(NSArray<String> value);

    @Generated
    @Selector("setCopyright:")
    public native void setCopyright(String value);

    @Generated
    @Selector("setCountry:")
    public native void setCountry(String value);

    @Generated
    @Selector("setCoverage:")
    public native void setCoverage(NSArray<String> value);

    @Generated
    @Selector("setCreator:")
    public native void setCreator(String value);

    @Generated
    @Selector("setDeliveryType:")
    public native void setDeliveryType(NSNumber value);

    @Generated
    @Selector("setDirector:")
    public native void setDirector(String value);

    @Generated
    @Selector("setDisplayName:")
    public native void setDisplayName(String value);

    @Generated
    @Selector("setDomainIdentifier:")
    public native void setDomainIdentifier(String value);

    @Generated
    @Selector("setDownloadedDate:")
    public native void setDownloadedDate(NSDate value);

    @Generated
    @Selector("setDueDate:")
    public native void setDueDate(NSDate value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(NSNumber value);

    @Generated
    @Selector("setEXIFGPSVersion:")
    public native void setEXIFGPSVersion(String value);

    @Generated
    @Selector("setEXIFVersion:")
    public native void setEXIFVersion(String value);

    @Generated
    @Selector("setEditors:")
    public native void setEditors(NSArray<String> value);

    @Generated
    @Selector("setEmailAddresses:")
    public native void setEmailAddresses(NSArray<String> value);

    @Generated
    @Selector("setEmailHeaders:")
    public native void setEmailHeaders(NSDictionary<String, ? extends NSArray<?>> value);

    @Generated
    @Selector("setEncodingApplications:")
    public native void setEncodingApplications(NSArray<String> value);

    @Generated
    @Selector("setEndDate:")
    public native void setEndDate(NSDate value);

    @Generated
    @Selector("setExposureMode:")
    public native void setExposureMode(NSNumber value);

    @Generated
    @Selector("setExposureProgram:")
    public native void setExposureProgram(String value);

    @Generated
    @Selector("setExposureTime:")
    public native void setExposureTime(NSNumber value);

    @Generated
    @Selector("setExposureTimeString:")
    public native void setExposureTimeString(String value);

    @Generated
    @Selector("setFNumber:")
    public native void setFNumber(NSNumber value);

    @Generated
    @Selector("setFileSize:")
    public native void setFileSize(NSNumber value);

    @Generated
    @Selector("setFlashOn:")
    public native void setFlashOn(NSNumber value);

    @Generated
    @Selector("setFocalLength35mm:")
    public native void setFocalLength35mm(NSNumber value);

    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(NSNumber value);

    @Generated
    @Selector("setFontNames:")
    public native void setFontNames(NSArray<String> value);

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

    @Generated
    @Selector("setGPSTrack:")
    public native void setGPSTrack(NSNumber value);

    @Generated
    @Selector("setGeneralMIDISequence:")
    public native void setGeneralMIDISequence(NSNumber value);

    @Generated
    @Selector("setGenre:")
    public native void setGenre(String value);

    @Generated
    @Selector("setHTMLContentData:")
    public native void setHTMLContentData(NSData value);

    @Generated
    @Selector("setHasAlphaChannel:")
    public native void setHasAlphaChannel(NSNumber value);

    @Generated
    @Selector("setHeadline:")
    public native void setHeadline(String value);

    @Generated
    @Selector("setHiddenAdditionalRecipients:")
    public native void setHiddenAdditionalRecipients(NSArray<? extends CSPerson> value);

    @Generated
    @Selector("setISOSpeed:")
    public native void setISOSpeed(NSNumber value);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(String value);

    @Generated
    @Selector("setImageDirection:")
    public native void setImageDirection(NSNumber value);

    @Generated
    @Selector("setImportantDates:")
    public native void setImportantDates(NSArray<? extends NSDate> value);

    @Generated
    @Selector("setInformation:")
    public native void setInformation(String value);

    @Generated
    @Selector("setInstantMessageAddresses:")
    public native void setInstantMessageAddresses(NSArray<String> value);

    @Generated
    @Selector("setInstructions:")
    public native void setInstructions(String value);

    @Generated
    @Selector("setKeySignature:")
    public native void setKeySignature(String value);

    @Generated
    @Selector("setKeywords:")
    public native void setKeywords(NSArray<String> value);

    @Generated
    @Selector("setKind:")
    public native void setKind(String value);

    @Generated
    @Selector("setLanguages:")
    public native void setLanguages(NSArray<String> value);

    @Generated
    @Selector("setLastUsedDate:")
    public native void setLastUsedDate(NSDate value);

    @Generated
    @Selector("setLatitude:")
    public native void setLatitude(NSNumber value);

    @Generated
    @Selector("setLayerNames:")
    public native void setLayerNames(NSArray<String> value);

    @Generated
    @Selector("setLensModel:")
    public native void setLensModel(String value);

    @Generated
    @Selector("setLikelyJunk:")
    public native void setLikelyJunk(NSNumber value);

    @Generated
    @Selector("setLocal:")
    public native void setLocal(NSNumber value);

    @Generated
    @Selector("setLongitude:")
    public native void setLongitude(NSNumber value);

    @Generated
    @Selector("setLyricist:")
    public native void setLyricist(String value);

    @Generated
    @Selector("setMailboxIdentifiers:")
    public native void setMailboxIdentifiers(NSArray<String> value);

    @Generated
    @Selector("setMaxAperture:")
    public native void setMaxAperture(NSNumber value);

    @Generated
    @Selector("setMediaTypes:")
    public native void setMediaTypes(NSArray<String> value);

    @Generated
    @Selector("setMetadataModificationDate:")
    public native void setMetadataModificationDate(NSDate value);

    @Generated
    @Selector("setMeteringMode:")
    public native void setMeteringMode(String value);

    @Generated
    @Selector("setMusicalGenre:")
    public native void setMusicalGenre(String value);

    @Generated
    @Selector("setMusicalInstrumentCategory:")
    public native void setMusicalInstrumentCategory(String value);

    @Generated
    @Selector("setMusicalInstrumentName:")
    public native void setMusicalInstrumentName(String value);

    @Generated
    @Selector("setNamedLocation:")
    public native void setNamedLocation(String value);

    @Generated
    @Selector("setOrganizations:")
    public native void setOrganizations(NSArray<String> value);

    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(NSNumber value);

    @Generated
    @Selector("setOriginalFormat:")
    public native void setOriginalFormat(String value);

    @Generated
    @Selector("setOriginalSource:")
    public native void setOriginalSource(String value);

    @Generated
    @Selector("setPageCount:")
    public native void setPageCount(NSNumber value);

    @Generated
    @Selector("setPageHeight:")
    public native void setPageHeight(NSNumber value);

    @Generated
    @Selector("setPageWidth:")
    public native void setPageWidth(NSNumber value);

    @Generated
    @Selector("setParticipants:")
    public native void setParticipants(NSArray<String> value);

    @Generated
    @Selector("setPath:")
    public native void setPath(String value);

    @Generated
    @Selector("setPerformers:")
    public native void setPerformers(NSArray<String> value);

    @Generated
    @Selector("setPhoneNumbers:")
    public native void setPhoneNumbers(NSArray<String> value);

    @Generated
    @Selector("setPixelCount:")
    public native void setPixelCount(NSNumber value);

    @Generated
    @Selector("setPixelHeight:")
    public native void setPixelHeight(NSNumber value);

    @Generated
    @Selector("setPixelWidth:")
    public native void setPixelWidth(NSNumber value);

    @Generated
    @Selector("setPlayCount:")
    public native void setPlayCount(NSNumber value);

    @Generated
    @Selector("setPostalCode:")
    public native void setPostalCode(String value);

    @Generated
    @Selector("setPrimaryRecipients:")
    public native void setPrimaryRecipients(NSArray<? extends CSPerson> value);

    @Generated
    @Selector("setProducer:")
    public native void setProducer(String value);

    @Generated
    @Selector("setProfileName:")
    public native void setProfileName(String value);

    @Generated
    @Selector("setProjects:")
    public native void setProjects(NSArray<String> value);

    @Generated
    @Selector("setPublishers:")
    public native void setPublishers(NSArray<String> value);

    @Generated
    @Selector("setRating:")
    public native void setRating(NSNumber value);

    @Generated
    @Selector("setRatingDescription:")
    public native void setRatingDescription(String value);

    @Generated
    @Selector("setRecipientAddresses:")
    public native void setRecipientAddresses(NSArray<String> value);

    @Generated
    @Selector("setRecipientEmailAddresses:")
    public native void setRecipientEmailAddresses(NSArray<String> value);

    @Generated
    @Selector("setRecipientNames:")
    public native void setRecipientNames(NSArray<String> value);

    @Generated
    @Selector("setRecordingDate:")
    public native void setRecordingDate(NSDate value);

    @Generated
    @Selector("setRedEyeOn:")
    public native void setRedEyeOn(NSNumber value);

    @Generated
    @Selector("setRelatedUniqueIdentifier:")
    public native void setRelatedUniqueIdentifier(String value);

    @Generated
    @Selector("setResolutionHeightDPI:")
    public native void setResolutionHeightDPI(NSNumber value);

    @Generated
    @Selector("setResolutionWidthDPI:")
    public native void setResolutionWidthDPI(NSNumber value);

    @Generated
    @Selector("setRights:")
    public native void setRights(String value);

    @Generated
    @Selector("setRole:")
    public native void setRole(String value);

    @Generated
    @Selector("setSecurityMethod:")
    public native void setSecurityMethod(String value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(NSNumber value);

    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    @Generated
    @Selector("setStateOrProvince:")
    public native void setStateOrProvince(String value);

    @Generated
    @Selector("setStreamable:")
    public native void setStreamable(NSNumber value);

    @Generated
    @Selector("setSubThoroughfare:")
    public native void setSubThoroughfare(String value);

    @Generated
    @Selector("setSubject:")
    public native void setSubject(String value);

    @Generated
    @Selector("setSupportsNavigation:")
    public native void setSupportsNavigation(NSNumber value);

    @Generated
    @Selector("setSupportsPhoneCall:")
    public native void setSupportsPhoneCall(NSNumber value);

    @Generated
    @Selector("setTempo:")
    public native void setTempo(NSNumber value);

    @Generated
    @Selector("setTextContent:")
    public native void setTextContent(String value);

    @Generated
    @Selector("setTheme:")
    public native void setTheme(String value);

    @Generated
    @Selector("setThoroughfare:")
    public native void setThoroughfare(String value);

    @Generated
    @Selector("setThumbnailData:")
    public native void setThumbnailData(NSData value);

    @Generated
    @Selector("setThumbnailURL:")
    public native void setThumbnailURL(NSURL value);

    @Generated
    @Selector("setTimeSignature:")
    public native void setTimeSignature(String value);

    @Generated
    @Selector("setTimestamp:")
    public native void setTimestamp(NSDate value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setTotalBitRate:")
    public native void setTotalBitRate(NSNumber value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    @Generated
    @Selector("setValue:forCustomKey:")
    public native void setValueForCustomKey(@Mapped(ObjCObjectMapper.class) NSSecureCoding value,
            CSCustomAttributeKey key);

    @Generated
    @Selector("setVersion:")
    public native void setVersion(String value);

    @Generated
    @Selector("setVideoBitRate:")
    public native void setVideoBitRate(NSNumber value);

    @Generated
    @Selector("setWeakRelatedUniqueIdentifier:")
    public native void setWeakRelatedUniqueIdentifier(String value);

    @Generated
    @Selector("setWhiteBalance:")
    public native void setWhiteBalance(NSNumber value);

    @Generated
    @Selector("speed")
    public native NSNumber speed();

    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Selector("stateOrProvince")
    public native String stateOrProvince();

    @Generated
    @Selector("subThoroughfare")
    public native String subThoroughfare();

    @Generated
    @Selector("subject")
    public native String subject();

    @Generated
    @Selector("supportsNavigation")
    public native NSNumber supportsNavigation();

    @Generated
    @Selector("supportsPhoneCall")
    public native NSNumber supportsPhoneCall();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("tempo")
    public native NSNumber tempo();

    @Generated
    @Selector("textContent")
    public native String textContent();

    @Generated
    @Selector("theme")
    public native String theme();

    @Generated
    @Selector("thoroughfare")
    public native String thoroughfare();

    @Generated
    @Selector("thumbnailData")
    public native NSData thumbnailData();

    @Generated
    @Selector("thumbnailURL")
    public native NSURL thumbnailURL();

    @Generated
    @Selector("timeSignature")
    public native String timeSignature();

    @Generated
    @Selector("timestamp")
    public native NSDate timestamp();

    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("totalBitRate")
    public native NSNumber totalBitRate();

    @Generated
    @Selector("valueForCustomKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSSecureCoding valueForCustomKey(CSCustomAttributeKey key);

    @Generated
    @Selector("version")
    public native String version();

    @Generated
    @Selector("videoBitRate")
    public native NSNumber videoBitRate();

    @Generated
    @Selector("weakRelatedUniqueIdentifier")
    public native String weakRelatedUniqueIdentifier();

    @Generated
    @Selector("whiteBalance")
    public native NSNumber whiteBalance();
}
