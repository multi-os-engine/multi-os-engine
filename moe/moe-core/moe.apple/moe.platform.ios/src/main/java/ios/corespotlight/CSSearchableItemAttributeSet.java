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

package ios.corespotlight;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSNumber;
import ios.foundation.NSURL;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * EXIFGPSVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/EXIFGPSVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("EXIFGPSVersion")
	public native String EXIFGPSVersion();

	/**
	 * EXIFVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/EXIFVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("EXIFVersion")
	public native String EXIFVersion();

	/**
	 * GPSAreaInformation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSAreaInformation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSAreaInformation")
	public native String GPSAreaInformation();

	/**
	 * GPSDOP</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDOP">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDOP")
	public native NSNumber GPSDOP();

	/**
	 * GPSDateStamp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDateStamp">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDateStamp")
	public native NSDate GPSDateStamp();

	/**
	 * GPSDestBearing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestBearing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDestBearing")
	public native NSNumber GPSDestBearing();

	/**
	 * GPSDestDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDestDistance")
	public native NSNumber GPSDestDistance();

	/**
	 * GPSDestLatitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestLatitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDestLatitude")
	public native NSNumber GPSDestLatitude();

	/**
	 * GPSDestLongitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestLongitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDestLongitude")
	public native NSNumber GPSDestLongitude();

	/**
	 * GPSDifferental</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDifferental">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSDifferental")
	public native NSNumber GPSDifferental();

	/**
	 * GPSMapDatum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSMapDatum">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSMapDatum")
	public native String GPSMapDatum();

	/**
	 * GPSMeasureMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSMeasureMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSMeasureMode")
	public native String GPSMeasureMode();

	/**
	 * GPSProcessingMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSProcessingMethod">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSProcessingMethod")
	public native String GPSProcessingMethod();

	/**
	 * GPSStatus</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSStatus">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSStatus")
	public native String GPSStatus();

	/**
	 * GPSTrack</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSTrack">iOS Dev Center</a>
	 */
	@Generated
	@Selector("GPSTrack")
	public native NSNumber GPSTrack();

	/**
	 * HTMLContentData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/HTMLContentData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTMLContentData")
	public native NSData HTMLContentData();

	/**
	 * ISOSpeed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/ISOSpeed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ISOSpeed")
	public native NSNumber ISOSpeed();

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URL")
	public native NSURL URL();

	/**
	 * accountHandles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/accountHandles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accountHandles")
	public native NSArray<String> accountHandles();

	/**
	 * accountIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/accountIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accountIdentifier")
	public native String accountIdentifier();

	/**
	 * acquisitionMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/acquisitionMake">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acquisitionMake")
	public native String acquisitionMake();

	/**
	 * acquisitionModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/acquisitionModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acquisitionModel")
	public native String acquisitionModel();

	/**
	 * addedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/addedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addedDate")
	public native NSDate addedDate();

	/**
	 * additionalRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/additionalRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("additionalRecipients")
	public native NSArray<? extends CSPerson> additionalRecipients();

	/**
	 * album</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/album">iOS Dev Center</a>
	 */
	@Generated
	@Selector("album")
	public native String album();

	/**
	 * allDay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/allDay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allDay")
	public native NSNumber allDay();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CSSearchableItemAttributeSet alloc();

	/**
	 * alternateNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/alternateNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alternateNames")
	public native NSArray<String> alternateNames();

	/**
	 * altitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/altitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("altitude")
	public native NSNumber altitude();

	/**
	 * aperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/aperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("aperture")
	public native NSNumber aperture();

	/**
	 * artist</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/artist">iOS Dev Center</a>
	 */
	@Generated
	@Selector("artist")
	public native String artist();

	/**
	 * audiences</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audiences">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audiences")
	public native NSArray<String> audiences();

	/**
	 * audioBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioBitRate")
	public native NSNumber audioBitRate();

	/**
	 * audioChannelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioChannelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioChannelCount")
	public native NSNumber audioChannelCount();

	/**
	 * audioEncodingApplication</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioEncodingApplication">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioEncodingApplication")
	public native String audioEncodingApplication();

	/**
	 * audioSampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioSampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioSampleRate")
	public native NSNumber audioSampleRate();

	/**
	 * audioTrackNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioTrackNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioTrackNumber")
	public native NSNumber audioTrackNumber();

	/**
	 * authorAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorAddresses")
	public native NSArray<String> authorAddresses();

	/**
	 * authorEmailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorEmailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorEmailAddresses")
	public native NSArray<String> authorEmailAddresses();

	/**
	 * authorNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorNames")
	public native NSArray<String> authorNames();

	/**
	 * authors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authors")
	public native NSArray<? extends CSPerson> authors();

	/**
	 * bitsPerSample</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/bitsPerSample">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bitsPerSample")
	public native NSNumber bitsPerSample();

	/**
	 * cameraOwner</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/cameraOwner">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cameraOwner")
	public native String cameraOwner();

	/**
	 * city</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/city">iOS Dev Center</a>
	 */
	@Generated
	@Selector("city")
	public native String city();

	/**
	 * codecs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/codecs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("codecs")
	public native NSArray<String> codecs();

	/**
	 * colorSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/colorSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorSpace")
	public native String colorSpace();

	/**
	 * comment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/comment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("comment")
	public native String comment();

	/**
	 * completionDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/completionDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completionDate")
	public native NSDate completionDate();

	/**
	 * composer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/composer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("composer")
	public native String composer();

	/**
	 * contactKeywords</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contactKeywords">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactKeywords")
	public native NSArray<String> contactKeywords();

	/**
	 * containerDisplayName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerDisplayName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerDisplayName")
	public native String containerDisplayName();

	/**
	 * containerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerIdentifier")
	public native String containerIdentifier();

	/**
	 * containerOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerOrder")
	public native NSNumber containerOrder();

	/**
	 * containerTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerTitle")
	public native String containerTitle();

	/**
	 * contentCreationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentCreationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentCreationDate")
	public native NSDate contentCreationDate();

	/**
	 * contentDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentDescription")
	public native String contentDescription();

	/**
	 * contentModificationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentModificationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentModificationDate")
	public native NSDate contentModificationDate();

	/**
	 * contentRating</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentRating">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentRating")
	public native NSNumber contentRating();

	/**
	 * contentSources</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentSources">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentSources")
	public native NSArray<String> contentSources();

	/**
	 * contentType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentType")
	public native String contentType();

	/**
	 * contentTypeTree</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentTypeTree">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentTypeTree")
	public native NSArray<String> contentTypeTree();

	/**
	 * contentURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contentURL")
	public native NSURL contentURL();

	/**
	 * contributors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contributors">iOS Dev Center</a>
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
	 * copyright</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/copyright">iOS Dev Center</a>
	 */
	@Generated
	@Selector("copyright")
	public native String copyright();

	/**
	 * country</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/country">iOS Dev Center</a>
	 */
	@Generated
	@Selector("country")
	public native String country();

	/**
	 * coverage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/coverage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("coverage")
	public native NSArray<String> coverage();

	/**
	 * creator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/creator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creator")
	public native String creator();

	/**
	 * deliveryType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/deliveryType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deliveryType")
	public native NSNumber deliveryType();

	/**
	 * director</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/director">iOS Dev Center</a>
	 */
	@Generated
	@Selector("director")
	public native String director();

	/**
	 * displayName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/displayName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayName")
	public native String displayName();

	/**
	 * downloadedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/downloadedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadedDate")
	public native NSDate downloadedDate();

	/**
	 * dueDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/dueDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dueDate")
	public native NSDate dueDate();

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("duration")
	public native NSNumber duration();

	/**
	 * editors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/editors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("editors")
	public native NSArray<String> editors();

	/**
	 * emailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/emailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("emailAddresses")
	public native NSArray<String> emailAddresses();

	/**
	 * emailHeaders</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/emailHeaders">iOS Dev Center</a>
	 */
	@Generated
	@Selector("emailHeaders")
	public native NSDictionary<String, ? extends NSArray<?>> emailHeaders();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * encodingApplications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/encodingApplications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encodingApplications")
	public native NSArray<String> encodingApplications();

	/**
	 * endDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/endDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endDate")
	public native NSDate endDate();

	/**
	 * exposureMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exposureMode")
	public native NSNumber exposureMode();

	/**
	 * exposureProgram</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureProgram">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exposureProgram")
	public native String exposureProgram();

	/**
	 * exposureTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exposureTime")
	public native NSNumber exposureTime();

	/**
	 * exposureTimeString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureTimeString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("exposureTimeString")
	public native String exposureTimeString();

	/**
	 * fNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fNumber")
	public native NSNumber fNumber();

	/**
	 * fileSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fileSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileSize")
	public native NSNumber fileSize();

	/**
	 * focalLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/focalLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("focalLength")
	public native NSNumber focalLength();

	/**
	 * fontNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fontNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fontNames")
	public native NSArray<String> fontNames();

	/**
	 * genre</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/genre">iOS Dev Center</a>
	 */
	@Generated
	@Selector("genre")
	public native String genre();

	/**
	 * hasAlphaChannel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/hasAlphaChannel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasAlphaChannel")
	public native NSNumber hasAlphaChannel();

	/**
	 * headline</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/headline">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headline")
	public native String headline();

	/**
	 * hiddenAdditionalRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/hiddenAdditionalRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hiddenAdditionalRecipients")
	public native NSArray<? extends CSPerson> hiddenAdditionalRecipients();

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identifier")
	public native String identifier();

	/**
	 * imageDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/imageDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageDirection")
	public native NSNumber imageDirection();

	/**
	 * importantDates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/importantDates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("importantDates")
	public native NSArray<? extends NSDate> importantDates();

	/**
	 * information</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/information">iOS Dev Center</a>
	 */
	@Generated
	@Selector("information")
	public native String information();

	@Generated
	@Selector("init")
	public native CSSearchableItemAttributeSet init();

	@Generated
	@Selector("initWithCoder:")
	public native CSSearchableItemAttributeSet initWithCoder(NSCoder aDecoder);

	/**
	 * initWithItemContentType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instm/CSSearchableItemAttributeSet/initWithItemContentType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithItemContentType:")
	public native CSSearchableItemAttributeSet initWithItemContentType(String itemContentType);

	/**
	 * instantMessageAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/instantMessageAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instantMessageAddresses")
	public native NSArray<String> instantMessageAddresses();

	/**
	 * instructions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/instructions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("instructions")
	public native String instructions();

	/**
	 * flashOn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/flashOn">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFlashOn")
	public native NSNumber isFlashOn();

	/**
	 * focalLength35mm</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/focalLength35mm">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFocalLength35mm")
	public native NSNumber isFocalLength35mm();

	/**
	 * generalMIDISequence</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/generalMIDISequence">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isGeneralMIDISequence")
	public native NSNumber isGeneralMIDISequence();

	/**
	 * likelyJunk</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/likelyJunk">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isLikelyJunk")
	public native NSNumber isLikelyJunk();

	/**
	 * local</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/local">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isLocal")
	public native NSNumber isLocal();

	/**
	 * redEyeOn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/redEyeOn">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRedEyeOn")
	public native NSNumber isRedEyeOn();

	/**
	 * streamable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/streamable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStreamable")
	public native NSNumber isStreamable();

	/**
	 * keySignature</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/keySignature">iOS Dev Center</a>
	 */
	@Generated
	@Selector("keySignature")
	public native String keySignature();

	/**
	 * keywords</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/keywords">iOS Dev Center</a>
	 */
	@Generated
	@Selector("keywords")
	public native NSArray<String> keywords();

	/**
	 * kind</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/kind">iOS Dev Center</a>
	 */
	@Generated
	@Selector("kind")
	public native String kind();

	/**
	 * languages</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/languages">iOS Dev Center</a>
	 */
	@Generated
	@Selector("languages")
	public native NSArray<String> languages();

	/**
	 * lastUsedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lastUsedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lastUsedDate")
	public native NSDate lastUsedDate();

	/**
	 * latitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/latitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("latitude")
	public native NSNumber latitude();

	/**
	 * layerNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/layerNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("layerNames")
	public native NSArray<String> layerNames();

	/**
	 * lensModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lensModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lensModel")
	public native String lensModel();

	/**
	 * longitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/longitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("longitude")
	public native NSNumber longitude();

	/**
	 * lyricist</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lyricist">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lyricist")
	public native String lyricist();

	/**
	 * mailboxIdentifiers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/mailboxIdentifiers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mailboxIdentifiers")
	public native NSArray<String> mailboxIdentifiers();

	/**
	 * maxAperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/maxAperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxAperture")
	public native NSNumber maxAperture();

	/**
	 * mediaTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/mediaTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaTypes")
	public native NSArray<String> mediaTypes();

	/**
	 * metadataModificationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/metadataModificationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("metadataModificationDate")
	public native NSDate metadataModificationDate();

	/**
	 * meteringMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/meteringMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("meteringMode")
	public native String meteringMode();

	/**
	 * musicalGenre</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalGenre">iOS Dev Center</a>
	 */
	@Generated
	@Selector("musicalGenre")
	public native String musicalGenre();

	/**
	 * musicalInstrumentCategory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalInstrumentCategory">iOS Dev Center</a>
	 */
	@Generated
	@Selector("musicalInstrumentCategory")
	public native String musicalInstrumentCategory();

	/**
	 * musicalInstrumentName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalInstrumentName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("musicalInstrumentName")
	public native String musicalInstrumentName();

	/**
	 * namedLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/namedLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("namedLocation")
	public native String namedLocation();

	/**
	 * organizations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/organizations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("organizations")
	public native NSArray<String> organizations();

	/**
	 * orientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/orientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientation")
	public native NSNumber orientation();

	/**
	 * originalFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/originalFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("originalFormat")
	public native String originalFormat();

	/**
	 * originalSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/originalSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("originalSource")
	public native String originalSource();

	/**
	 * pageCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pageCount")
	public native NSNumber pageCount();

	/**
	 * pageHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pageHeight")
	public native NSNumber pageHeight();

	/**
	 * pageWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pageWidth")
	public native NSNumber pageWidth();

	/**
	 * participants</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/participants">iOS Dev Center</a>
	 */
	@Generated
	@Selector("participants")
	public native NSArray<String> participants();

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("path")
	public native String path();

	/**
	 * performers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/performers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performers")
	public native NSArray<String> performers();

	/**
	 * phoneNumbers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/phoneNumbers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("phoneNumbers")
	public native NSArray<String> phoneNumbers();

	/**
	 * pixelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelCount")
	public native NSNumber pixelCount();

	/**
	 * pixelHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelHeight")
	public native NSNumber pixelHeight();

	/**
	 * pixelWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelWidth")
	public native NSNumber pixelWidth();

	/**
	 * playCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/playCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playCount")
	public native NSNumber playCount();

	/**
	 * primaryRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/primaryRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("primaryRecipients")
	public native NSArray<? extends CSPerson> primaryRecipients();

	/**
	 * producer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/producer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("producer")
	public native String producer();

	/**
	 * profileName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/profileName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("profileName")
	public native String profileName();

	/**
	 * projects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/projects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("projects")
	public native NSArray<String> projects();

	/**
	 * publishers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/publishers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("publishers")
	public native NSArray<String> publishers();

	/**
	 * rating</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/rating">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rating")
	public native NSNumber rating();

	/**
	 * ratingDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/ratingDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ratingDescription")
	public native String ratingDescription();

	/**
	 * recipientAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recipientAddresses")
	public native NSArray<String> recipientAddresses();

	/**
	 * recipientEmailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientEmailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recipientEmailAddresses")
	public native NSArray<String> recipientEmailAddresses();

	/**
	 * recipientNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recipientNames")
	public native NSArray<String> recipientNames();

	/**
	 * recordingDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recordingDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recordingDate")
	public native NSDate recordingDate();

	/**
	 * relatedUniqueIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/relatedUniqueIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("relatedUniqueIdentifier")
	public native String relatedUniqueIdentifier();

	/**
	 * resolutionHeightDPI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/resolutionHeightDPI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resolutionHeightDPI")
	public native NSNumber resolutionHeightDPI();

	/**
	 * resolutionWidthDPI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/resolutionWidthDPI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resolutionWidthDPI")
	public native NSNumber resolutionWidthDPI();

	/**
	 * rights</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/rights">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rights")
	public native String rights();

	/**
	 * role</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/role">iOS Dev Center</a>
	 */
	@Generated
	@Selector("role")
	public native String role();

	/**
	 * securityMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/securityMethod">iOS Dev Center</a>
	 */
	@Generated
	@Selector("securityMethod")
	public native String securityMethod();

	/**
	 * accountHandles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/accountHandles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAccountHandles:")
	public native void setAccountHandles(NSArray<String> value);

	/**
	 * accountIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/accountIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAccountIdentifier:")
	public native void setAccountIdentifier(String value);

	/**
	 * acquisitionMake</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/acquisitionMake">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAcquisitionMake:")
	public native void setAcquisitionMake(String value);

	/**
	 * acquisitionModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/acquisitionModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAcquisitionModel:")
	public native void setAcquisitionModel(String value);

	/**
	 * addedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/addedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAddedDate:")
	public native void setAddedDate(NSDate value);

	/**
	 * additionalRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/additionalRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAdditionalRecipients:")
	public native void setAdditionalRecipients(NSArray<? extends CSPerson> value);

	/**
	 * album</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/album">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlbum:")
	public native void setAlbum(String value);

	/**
	 * allDay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/allDay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllDay:")
	public native void setAllDay(NSNumber value);

	/**
	 * alternateNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/alternateNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAlternateNames:")
	public native void setAlternateNames(NSArray<String> value);

	/**
	 * altitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/altitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAltitude:")
	public native void setAltitude(NSNumber value);

	/**
	 * aperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/aperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAperture:")
	public native void setAperture(NSNumber value);

	/**
	 * artist</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/artist">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setArtist:")
	public native void setArtist(String value);

	/**
	 * audiences</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audiences">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudiences:")
	public native void setAudiences(NSArray<String> value);

	/**
	 * audioBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioBitRate:")
	public native void setAudioBitRate(NSNumber value);

	/**
	 * audioChannelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioChannelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioChannelCount:")
	public native void setAudioChannelCount(NSNumber value);

	/**
	 * audioEncodingApplication</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioEncodingApplication">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioEncodingApplication:")
	public native void setAudioEncodingApplication(String value);

	/**
	 * audioSampleRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioSampleRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioSampleRate:")
	public native void setAudioSampleRate(NSNumber value);

	/**
	 * audioTrackNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/audioTrackNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioTrackNumber:")
	public native void setAudioTrackNumber(NSNumber value);

	/**
	 * authorAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAuthorAddresses:")
	public native void setAuthorAddresses(NSArray<String> value);

	/**
	 * authorEmailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorEmailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAuthorEmailAddresses:")
	public native void setAuthorEmailAddresses(NSArray<String> value);

	/**
	 * authorNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authorNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAuthorNames:")
	public native void setAuthorNames(NSArray<String> value);

	/**
	 * authors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/authors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAuthors:")
	public native void setAuthors(NSArray<? extends CSPerson> value);

	/**
	 * bitsPerSample</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/bitsPerSample">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBitsPerSample:")
	public native void setBitsPerSample(NSNumber value);

	/**
	 * cameraOwner</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/cameraOwner">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCameraOwner:")
	public native void setCameraOwner(String value);

	/**
	 * city</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/city">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCity:")
	public native void setCity(String value);

	/**
	 * codecs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/codecs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCodecs:")
	public native void setCodecs(NSArray<String> value);

	/**
	 * colorSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/colorSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setColorSpace:")
	public native void setColorSpace(String value);

	/**
	 * comment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/comment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setComment:")
	public native void setComment(String value);

	/**
	 * completionDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/completionDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCompletionDate:")
	public native void setCompletionDate(NSDate value);

	/**
	 * composer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/composer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setComposer:")
	public native void setComposer(String value);

	/**
	 * contactKeywords</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contactKeywords">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactKeywords:")
	public native void setContactKeywords(NSArray<String> value);

	/**
	 * containerDisplayName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerDisplayName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainerDisplayName:")
	public native void setContainerDisplayName(String value);

	/**
	 * containerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainerIdentifier:")
	public native void setContainerIdentifier(String value);

	/**
	 * containerOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainerOrder:")
	public native void setContainerOrder(NSNumber value);

	/**
	 * containerTitle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/containerTitle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainerTitle:")
	public native void setContainerTitle(String value);

	/**
	 * contentCreationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentCreationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentCreationDate:")
	public native void setContentCreationDate(NSDate value);

	/**
	 * contentDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentDescription:")
	public native void setContentDescription(String value);

	/**
	 * contentModificationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentModificationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentModificationDate:")
	public native void setContentModificationDate(NSDate value);

	/**
	 * contentRating</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentRating">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentRating:")
	public native void setContentRating(NSNumber value);

	/**
	 * contentSources</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentSources">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentSources:")
	public native void setContentSources(NSArray<String> value);

	/**
	 * contentType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentType:")
	public native void setContentType(String value);

	/**
	 * contentTypeTree</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentTypeTree">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentTypeTree:")
	public native void setContentTypeTree(NSArray<String> value);

	/**
	 * contentURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contentURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContentURL:")
	public native void setContentURL(NSURL value);

	/**
	 * contributors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/contributors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContributors:")
	public native void setContributors(NSArray<String> value);

	/**
	 * copyright</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/copyright">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCopyright:")
	public native void setCopyright(String value);

	/**
	 * country</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/country">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCountry:")
	public native void setCountry(String value);

	/**
	 * coverage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/coverage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCoverage:")
	public native void setCoverage(NSArray<String> value);

	/**
	 * creator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/creator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCreator:")
	public native void setCreator(String value);

	/**
	 * deliveryType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/deliveryType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDeliveryType:")
	public native void setDeliveryType(NSNumber value);

	/**
	 * director</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/director">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDirector:")
	public native void setDirector(String value);

	/**
	 * displayName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/displayName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDisplayName:")
	public native void setDisplayName(String value);

	/**
	 * downloadedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/downloadedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDownloadedDate:")
	public native void setDownloadedDate(NSDate value);

	/**
	 * dueDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/dueDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDueDate:")
	public native void setDueDate(NSDate value);

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDuration:")
	public native void setDuration(NSNumber value);

	/**
	 * EXIFGPSVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/EXIFGPSVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEXIFGPSVersion:")
	public native void setEXIFGPSVersion(String value);

	/**
	 * EXIFVersion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/EXIFVersion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEXIFVersion:")
	public native void setEXIFVersion(String value);

	/**
	 * editors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/editors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEditors:")
	public native void setEditors(NSArray<String> value);

	/**
	 * emailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/emailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEmailAddresses:")
	public native void setEmailAddresses(NSArray<String> value);

	/**
	 * emailHeaders</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/emailHeaders">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEmailHeaders:")
	public native void setEmailHeaders(NSDictionary<String, ? extends NSArray<?>> value);

	/**
	 * encodingApplications</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/encodingApplications">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEncodingApplications:")
	public native void setEncodingApplications(NSArray<String> value);

	/**
	 * endDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/endDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEndDate:")
	public native void setEndDate(NSDate value);

	/**
	 * exposureMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExposureMode:")
	public native void setExposureMode(NSNumber value);

	/**
	 * exposureProgram</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureProgram">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExposureProgram:")
	public native void setExposureProgram(String value);

	/**
	 * exposureTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExposureTime:")
	public native void setExposureTime(NSNumber value);

	/**
	 * exposureTimeString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/exposureTimeString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExposureTimeString:")
	public native void setExposureTimeString(String value);

	/**
	 * fNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFNumber:")
	public native void setFNumber(NSNumber value);

	/**
	 * fileSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fileSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFileSize:")
	public native void setFileSize(NSNumber value);

	/**
	 * flashOn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/flashOn">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFlashOn:")
	public native void setFlashOn(NSNumber value);

	/**
	 * focalLength35mm</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/focalLength35mm">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFocalLength35mm:")
	public native void setFocalLength35mm(NSNumber value);

	/**
	 * focalLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/focalLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFocalLength:")
	public native void setFocalLength(NSNumber value);

	/**
	 * fontNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/fontNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFontNames:")
	public native void setFontNames(NSArray<String> value);

	/**
	 * GPSAreaInformation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSAreaInformation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSAreaInformation:")
	public native void setGPSAreaInformation(String value);

	/**
	 * GPSDOP</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDOP">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDOP:")
	public native void setGPSDOP(NSNumber value);

	/**
	 * GPSDateStamp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDateStamp">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDateStamp:")
	public native void setGPSDateStamp(NSDate value);

	/**
	 * GPSDestBearing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestBearing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDestBearing:")
	public native void setGPSDestBearing(NSNumber value);

	/**
	 * GPSDestDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDestDistance:")
	public native void setGPSDestDistance(NSNumber value);

	/**
	 * GPSDestLatitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestLatitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDestLatitude:")
	public native void setGPSDestLatitude(NSNumber value);

	/**
	 * GPSDestLongitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDestLongitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDestLongitude:")
	public native void setGPSDestLongitude(NSNumber value);

	/**
	 * GPSDifferental</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSDifferental">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSDifferental:")
	public native void setGPSDifferental(NSNumber value);

	/**
	 * GPSMapDatum</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSMapDatum">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSMapDatum:")
	public native void setGPSMapDatum(String value);

	/**
	 * GPSMeasureMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSMeasureMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSMeasureMode:")
	public native void setGPSMeasureMode(String value);

	/**
	 * GPSProcessingMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSProcessingMethod">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSProcessingMethod:")
	public native void setGPSProcessingMethod(String value);

	/**
	 * GPSStatus</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSStatus">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSStatus:")
	public native void setGPSStatus(String value);

	/**
	 * GPSTrack</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/GPSTrack">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGPSTrack:")
	public native void setGPSTrack(NSNumber value);

	/**
	 * generalMIDISequence</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/generalMIDISequence">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGeneralMIDISequence:")
	public native void setGeneralMIDISequence(NSNumber value);

	/**
	 * genre</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/genre">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGenre:")
	public native void setGenre(String value);

	/**
	 * HTMLContentData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/HTMLContentData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTMLContentData:")
	public native void setHTMLContentData(NSData value);

	/**
	 * hasAlphaChannel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/hasAlphaChannel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHasAlphaChannel:")
	public native void setHasAlphaChannel(NSNumber value);

	/**
	 * headline</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/headline">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeadline:")
	public native void setHeadline(String value);

	/**
	 * hiddenAdditionalRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/hiddenAdditionalRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHiddenAdditionalRecipients:")
	public native void setHiddenAdditionalRecipients(NSArray<? extends CSPerson> value);

	/**
	 * ISOSpeed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/ISOSpeed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setISOSpeed:")
	public native void setISOSpeed(NSNumber value);

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	/**
	 * imageDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/imageDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImageDirection:")
	public native void setImageDirection(NSNumber value);

	/**
	 * importantDates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/importantDates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setImportantDates:")
	public native void setImportantDates(NSArray<? extends NSDate> value);

	/**
	 * information</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/information">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInformation:")
	public native void setInformation(String value);

	/**
	 * instantMessageAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/instantMessageAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstantMessageAddresses:")
	public native void setInstantMessageAddresses(NSArray<String> value);

	/**
	 * instructions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/instructions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInstructions:")
	public native void setInstructions(String value);

	/**
	 * keySignature</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/keySignature">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setKeySignature:")
	public native void setKeySignature(String value);

	/**
	 * keywords</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/keywords">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setKeywords:")
	public native void setKeywords(NSArray<String> value);

	/**
	 * kind</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/kind">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setKind:")
	public native void setKind(String value);

	/**
	 * languages</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/languages">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLanguages:")
	public native void setLanguages(NSArray<String> value);

	/**
	 * lastUsedDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lastUsedDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLastUsedDate:")
	public native void setLastUsedDate(NSDate value);

	/**
	 * latitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/latitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLatitude:")
	public native void setLatitude(NSNumber value);

	/**
	 * layerNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/layerNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLayerNames:")
	public native void setLayerNames(NSArray<String> value);

	/**
	 * lensModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lensModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLensModel:")
	public native void setLensModel(String value);

	/**
	 * likelyJunk</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/likelyJunk">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLikelyJunk:")
	public native void setLikelyJunk(NSNumber value);

	/**
	 * local</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/local">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocal:")
	public native void setLocal(NSNumber value);

	/**
	 * longitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/longitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLongitude:")
	public native void setLongitude(NSNumber value);

	/**
	 * lyricist</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/lyricist">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLyricist:")
	public native void setLyricist(String value);

	/**
	 * mailboxIdentifiers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/mailboxIdentifiers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMailboxIdentifiers:")
	public native void setMailboxIdentifiers(NSArray<String> value);

	/**
	 * maxAperture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/maxAperture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaxAperture:")
	public native void setMaxAperture(NSNumber value);

	/**
	 * mediaTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/mediaTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMediaTypes:")
	public native void setMediaTypes(NSArray<String> value);

	/**
	 * metadataModificationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/metadataModificationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMetadataModificationDate:")
	public native void setMetadataModificationDate(NSDate value);

	/**
	 * meteringMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/meteringMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMeteringMode:")
	public native void setMeteringMode(String value);

	/**
	 * musicalGenre</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalGenre">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMusicalGenre:")
	public native void setMusicalGenre(String value);

	/**
	 * musicalInstrumentCategory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalInstrumentCategory">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMusicalInstrumentCategory:")
	public native void setMusicalInstrumentCategory(String value);

	/**
	 * musicalInstrumentName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/musicalInstrumentName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMusicalInstrumentName:")
	public native void setMusicalInstrumentName(String value);

	/**
	 * namedLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/namedLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNamedLocation:")
	public native void setNamedLocation(String value);

	/**
	 * organizations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/organizations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrganizations:")
	public native void setOrganizations(NSArray<String> value);

	/**
	 * orientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/orientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(NSNumber value);

	/**
	 * originalFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/originalFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOriginalFormat:")
	public native void setOriginalFormat(String value);

	/**
	 * originalSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/originalSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOriginalSource:")
	public native void setOriginalSource(String value);

	/**
	 * pageCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPageCount:")
	public native void setPageCount(NSNumber value);

	/**
	 * pageHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPageHeight:")
	public native void setPageHeight(NSNumber value);

	/**
	 * pageWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pageWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPageWidth:")
	public native void setPageWidth(NSNumber value);

	/**
	 * participants</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/participants">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setParticipants:")
	public native void setParticipants(NSArray<String> value);

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPath:")
	public native void setPath(String value);

	/**
	 * performers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/performers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPerformers:")
	public native void setPerformers(NSArray<String> value);

	/**
	 * phoneNumbers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/phoneNumbers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhoneNumbers:")
	public native void setPhoneNumbers(NSArray<String> value);

	/**
	 * pixelCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPixelCount:")
	public native void setPixelCount(NSNumber value);

	/**
	 * pixelHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPixelHeight:")
	public native void setPixelHeight(NSNumber value);

	/**
	 * pixelWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/pixelWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPixelWidth:")
	public native void setPixelWidth(NSNumber value);

	/**
	 * playCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/playCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlayCount:")
	public native void setPlayCount(NSNumber value);

	/**
	 * primaryRecipients</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/primaryRecipients">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPrimaryRecipients:")
	public native void setPrimaryRecipients(NSArray<? extends CSPerson> value);

	/**
	 * producer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/producer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProducer:")
	public native void setProducer(String value);

	/**
	 * profileName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/profileName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProfileName:")
	public native void setProfileName(String value);

	/**
	 * projects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/projects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProjects:")
	public native void setProjects(NSArray<String> value);

	/**
	 * publishers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/publishers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPublishers:")
	public native void setPublishers(NSArray<String> value);

	/**
	 * rating</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/rating">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRating:")
	public native void setRating(NSNumber value);

	/**
	 * ratingDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/ratingDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRatingDescription:")
	public native void setRatingDescription(String value);

	/**
	 * recipientAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecipientAddresses:")
	public native void setRecipientAddresses(NSArray<String> value);

	/**
	 * recipientEmailAddresses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientEmailAddresses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecipientEmailAddresses:")
	public native void setRecipientEmailAddresses(NSArray<String> value);

	/**
	 * recipientNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recipientNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecipientNames:")
	public native void setRecipientNames(NSArray<String> value);

	/**
	 * recordingDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/recordingDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecordingDate:")
	public native void setRecordingDate(NSDate value);

	/**
	 * redEyeOn</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/redEyeOn">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRedEyeOn:")
	public native void setRedEyeOn(NSNumber value);

	/**
	 * relatedUniqueIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/relatedUniqueIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRelatedUniqueIdentifier:")
	public native void setRelatedUniqueIdentifier(String value);

	/**
	 * resolutionHeightDPI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/resolutionHeightDPI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setResolutionHeightDPI:")
	public native void setResolutionHeightDPI(NSNumber value);

	/**
	 * resolutionWidthDPI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/resolutionWidthDPI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setResolutionWidthDPI:")
	public native void setResolutionWidthDPI(NSNumber value);

	/**
	 * rights</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/rights">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRights:")
	public native void setRights(String value);

	/**
	 * role</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/role">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRole:")
	public native void setRole(String value);

	/**
	 * securityMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/securityMethod">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSecurityMethod:")
	public native void setSecurityMethod(String value);

	/**
	 * speed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/speed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSpeed:")
	public native void setSpeed(NSNumber value);

	/**
	 * startDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/startDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStartDate:")
	public native void setStartDate(NSDate value);

	/**
	 * stateOrProvince</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/stateOrProvince">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStateOrProvince:")
	public native void setStateOrProvince(String value);

	/**
	 * streamable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/streamable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStreamable:")
	public native void setStreamable(NSNumber value);

	/**
	 * subject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/subject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSubject:")
	public native void setSubject(String value);

	/**
	 * supportsNavigation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/supportsNavigation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSupportsNavigation:")
	public native void setSupportsNavigation(NSNumber value);

	/**
	 * supportsPhoneCall</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/supportsPhoneCall">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSupportsPhoneCall:")
	public native void setSupportsPhoneCall(NSNumber value);

	/**
	 * tempo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/tempo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTempo:")
	public native void setTempo(NSNumber value);

	/**
	 * textContent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/textContent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextContent:")
	public native void setTextContent(String value);

	/**
	 * theme</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/theme">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTheme:")
	public native void setTheme(String value);

	/**
	 * thumbnailData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/thumbnailData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setThumbnailData:")
	public native void setThumbnailData(NSData value);

	/**
	 * thumbnailURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/thumbnailURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setThumbnailURL:")
	public native void setThumbnailURL(NSURL value);

	/**
	 * timeSignature</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/timeSignature">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeSignature:")
	public native void setTimeSignature(String value);

	/**
	 * timestamp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/timestamp">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimestamp:")
	public native void setTimestamp(NSDate value);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	/**
	 * totalBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/totalBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTotalBitRate:")
	public native void setTotalBitRate(NSNumber value);

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	/**
	 * setValue:forCustomKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instm/CSSearchableItemAttributeSet/setValue:forCustomKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forCustomKey:")
	public native void setValueForCustomKey(@Mapped(ObjCObjectMapper.class) NSSecureCoding value, CSCustomAttributeKey key);

	/**
	 * version</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/version">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVersion:")
	public native void setVersion(String value);

	/**
	 * videoBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/videoBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVideoBitRate:")
	public native void setVideoBitRate(NSNumber value);

	/**
	 * whiteBalance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/whiteBalance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWhiteBalance:")
	public native void setWhiteBalance(NSNumber value);

	/**
	 * speed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/speed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("speed")
	public native NSNumber speed();

	/**
	 * startDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/startDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startDate")
	public native NSDate startDate();

	/**
	 * stateOrProvince</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/stateOrProvince">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stateOrProvince")
	public native String stateOrProvince();

	/**
	 * subject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/subject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subject")
	public native String subject();

	/**
	 * supportsNavigation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/supportsNavigation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportsNavigation")
	public native NSNumber supportsNavigation();

	/**
	 * supportsPhoneCall</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/supportsPhoneCall">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportsPhoneCall")
	public native NSNumber supportsPhoneCall();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * tempo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/tempo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tempo")
	public native NSNumber tempo();

	/**
	 * textContent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/textContent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("textContent")
	public native String textContent();

	/**
	 * theme</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/theme">iOS Dev Center</a>
	 */
	@Generated
	@Selector("theme")
	public native String theme();

	/**
	 * thumbnailData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/thumbnailData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("thumbnailData")
	public native NSData thumbnailData();

	/**
	 * thumbnailURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/thumbnailURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("thumbnailURL")
	public native NSURL thumbnailURL();

	/**
	 * timeSignature</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/timeSignature">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeSignature")
	public native String timeSignature();

	/**
	 * timestamp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/timestamp">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timestamp")
	public native NSDate timestamp();

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

	/**
	 * totalBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/totalBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("totalBitRate")
	public native NSNumber totalBitRate();

	/**
	 * valueForCustomKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instm/CSSearchableItemAttributeSet/valueForCustomKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForCustomKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native NSSecureCoding valueForCustomKey(CSCustomAttributeKey key);

	/**
	 * version</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/version">iOS Dev Center</a>
	 */
	@Generated
	@Selector("version")
	public native String version();

	/**
	 * videoBitRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/videoBitRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoBitRate")
	public native NSNumber videoBitRate();

	/**
	 * whiteBalance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableItemAttributeSet_Class/index.html#//apple_ref/occ/instp/CSSearchableItemAttributeSet/whiteBalance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("whiteBalance")
	public native NSNumber whiteBalance();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
