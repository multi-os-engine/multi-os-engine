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

package apple.imageio.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFMutableDataRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGDataConsumerRef;
import apple.coregraphics.opaque.CGDataProviderRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.imageio.opaque.CGImageDestinationRef;
import apple.imageio.opaque.CGImageMetadataRef;
import apple.imageio.opaque.CGImageMetadataTagRef;
import apple.imageio.opaque.CGImageSourceRef;
import apple.imageio.opaque.CGMutableImageMetadataRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("ImageIO")
@Runtime(CRuntime.class)
public final class ImageIO {
    static {
        NatJ.register();
    }

    @Generated
    private ImageIO() {
    }

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageMetadataGetTypeID();

    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutable();

    @Generated
    @CFunction
    public static native CGMutableImageMetadataRef CGImageMetadataCreateMutableCopy(CGImageMetadataRef metadata);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageMetadataTagGetTypeID();

    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataTagCreate(CFStringRef xmlns, CFStringRef prefix,
            CFStringRef name, int type, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyNamespace(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyPrefix(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataTagCopyName(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native ConstVoidPtr CGImageMetadataTagCopyValue(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native int CGImageMetadataTagGetType(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataTagCopyQualifiers(CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native CFArrayRef CGImageMetadataCopyTags(CGImageMetadataRef metadata);

    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagWithPath(CGImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    @Generated
    @CFunction
    public static native CFStringRef CGImageMetadataCopyStringValueWithPath(CGImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    @Generated
    @CFunction
    public static native boolean CGImageMetadataRegisterNamespaceForPrefix(CGMutableImageMetadataRef metadata,
            CFStringRef xmlns, CFStringRef prefix, Ptr<CFErrorRef> err);

    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetTagWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path, CGImageMetadataTagRef tag);

    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native boolean CGImageMetadataRemoveTagWithPath(CGMutableImageMetadataRef metadata,
            CGImageMetadataTagRef parent, CFStringRef path);

    @Generated
    @CFunction
    public static native void CGImageMetadataEnumerateTagsUsingBlock(CGImageMetadataRef metadata, CFStringRef rootPath,
            CFDictionaryRef options,
            @ObjCBlock(name = "call_CGImageMetadataEnumerateTagsUsingBlock") Block_CGImageMetadataEnumerateTagsUsingBlock block);

    @Generated
    @CFunction
    public static native CGImageMetadataTagRef CGImageMetadataCopyTagMatchingImageProperty(CGImageMetadataRef metadata,
            CFStringRef dictionaryName, CFStringRef propertyName);

    @Generated
    @CFunction
    public static native boolean CGImageMetadataSetValueMatchingImageProperty(CGMutableImageMetadataRef metadata,
            CFStringRef dictionaryName, CFStringRef propertyName, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native CFDataRef CGImageMetadataCreateXMPData(CGImageMetadataRef metadata, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageMetadataCreateFromXMPData(CFDataRef data);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetTypeID();

    @Generated
    @CFunction
    public static native CFArrayRef CGImageSourceCopyTypeIdentifiers();

    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithDataProvider(CGDataProviderRef provider,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithData(CFDataRef data, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateWithURL(CFURLRef url, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CFStringRef CGImageSourceGetType(CGImageSourceRef isrc);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetCount(CGImageSourceRef isrc);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyProperties(CGImageSourceRef isrc, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyPropertiesAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageMetadataRef CGImageSourceCopyMetadataAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateImageAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native void CGImageSourceRemoveCacheAtIndex(CGImageSourceRef isrc, @NUInt long index);

    @Generated
    @CFunction
    public static native CGImageRef CGImageSourceCreateThumbnailAtIndex(CGImageSourceRef isrc, @NUInt long index,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageSourceRef CGImageSourceCreateIncremental(CFDictionaryRef options);

    @Generated
    @CFunction
    public static native void CGImageSourceUpdateData(CGImageSourceRef isrc, CFDataRef data, boolean final_);

    @Generated
    @CFunction
    public static native void CGImageSourceUpdateDataProvider(CGImageSourceRef isrc, CGDataProviderRef provider,
            boolean final_);

    @Generated
    @CFunction
    public static native int CGImageSourceGetStatus(CGImageSourceRef isrc);

    @Generated
    @CFunction
    public static native int CGImageSourceGetStatusAtIndex(CGImageSourceRef isrc, @NUInt long index);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageDestinationGetTypeID();

    @Generated
    @CFunction
    public static native CFArrayRef CGImageDestinationCopyTypeIdentifiers();

    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithDataConsumer(CGDataConsumerRef consumer,
            CFStringRef type, @NUInt long count, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithData(CFMutableDataRef data, CFStringRef type,
            @NUInt long count, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGImageDestinationRef CGImageDestinationCreateWithURL(CFURLRef url, CFStringRef type,
            @NUInt long count, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native void CGImageDestinationSetProperties(CGImageDestinationRef idst, CFDictionaryRef properties);

    @Generated
    @CFunction
    public static native void CGImageDestinationAddImage(CGImageDestinationRef idst, CGImageRef image,
            CFDictionaryRef properties);

    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageFromSource(CGImageDestinationRef idst, CGImageSourceRef isrc,
            @NUInt long index, CFDictionaryRef properties);

    @Generated
    @CFunction
    public static native boolean CGImageDestinationFinalize(CGImageDestinationRef idst);

    @Generated
    @CFunction
    public static native void CGImageDestinationAddImageAndMetadata(CGImageDestinationRef idst, CGImageRef image,
            CGImageMetadataRef metadata, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native boolean CGImageDestinationCopyImageSource(CGImageDestinationRef idst, CGImageSourceRef isrc,
            CFDictionaryRef options, Ptr<CFErrorRef> err);

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExif();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifAux();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceExifEX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceDublinCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespacePhotoshop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceXMPRights();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExif();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifAux();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixExifEX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixDublinCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCCore();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixPhotoshop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixTIFF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixXMPRights();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataEnumerateRecursively();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCGImageMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceTypeIdentifierHint();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCache();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldCacheImmediately();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceShouldAllowFloat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailFromImageIfAbsent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailFromImageAlways();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceThumbnailMaxPixelSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceCreateThumbnailWithTransform();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageSourceSubsampleFactor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationLossyCompressionQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationBackgroundColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationImageMaxPixelSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationEmbedThumbnail();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOptimizeColorForSharing();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationMergeMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeXMP();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataShouldExcludeGPS();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationDateTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageDestinationOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyRawDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerMinoltaDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerFujiDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerOlympusDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerPentaxDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerAppleDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDPIWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDepth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsFloat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIsIndexed();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHasAlpha();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyProfileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelCMYK();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyColorModelLab();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCompression();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPhotometricInterpretation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDocumentName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFMake();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFXResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFYResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFResolutionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFSoftware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTransferFunction();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFDateTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFArtist();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFHostComputer();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFWhitePoint();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFPrimaryChromaticities();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyTIFFTileLength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFXDensity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFYDensity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFDensityUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyJFIFIsProgressive();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureProgram();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpectralSensitivity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedRatings();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOECF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensitivityType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifStandardOutputSensitivity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRecommendedExposureIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeed();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudeyyy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifISOSpeedLatitudezzz();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDateTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifComponentsConfiguration();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompressedBitsPerPixel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifShutterSpeedValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifApertureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBrightnessValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureBiasValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMaxApertureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMeteringMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLightSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlash();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectArea();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifMakerNote();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifUserComment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashPixVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelXDimension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifPixelYDimension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifRelatedSoundFile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFlashEnergy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSpatialFrequencyResponse();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneXResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneYResolution();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalPlaneResolutionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectLocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSensingMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFileSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCFAPattern();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCustomRendered();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifExposureMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifWhiteBalance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDigitalZoomRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifFocalLenIn35mmFilm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSceneCaptureType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGainControl();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifContrast();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSaturation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSharpness();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifDeviceSettingDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubjectDistRange();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifImageUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCameraOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifBodySerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSpecification();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensMake();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifLensSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifGamma();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSubsecTimeOrginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxLensSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxImageNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFlashCompensation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifAuxFirmware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFImageColorMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFHasGlobalColorMap();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGGamma();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGInterlaceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGXPixelsPerMeter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGYPixelsPerMeter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGsRGBIntent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGChromaticities();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGAuthor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCreationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGModificationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSoftware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTimeStamp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSatellites();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMeasureMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDOP();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeedRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSSpeed();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrackRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSTrack();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirectionRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSImgDirection();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSMapDatum();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitudeRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearingRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestBearing();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistanceRef();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDestDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSProcessingMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSAreaInformation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDateStamp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSDifferental();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGPSHPositioningError();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectTypeReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectAttributeReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCEditorialUpdate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCUrgency();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubjectReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCategory();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSupplementalCategory();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCFixtureIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCKeywords();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContentLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReleaseTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExpirationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSpecialInstructions();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCActionAdvised();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceService();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCReferenceNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCTimeCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCDigitalCreationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginatingProgram();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProgramVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCObjectCycle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCByline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCBylineTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSubLocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCOriginalTransmissionReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCHeadline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCredit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCopyrightNotice();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContact();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCaptionAbstract();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCWriterEditor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCImageOrientation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCLanguageIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCStarRating();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCCreatorContactInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCRightsUsageTerms();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCScene();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoCountry();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoAddress();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPostalCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoStateProvince();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoEmails();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoPhones();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCContactInfoWebURLs();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMLayerNames();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageProperty8BIMVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBackwardVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGUniqueCameraModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLocalizedCameraModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWhiteLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCalibrationIlluminant2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibration2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotNeutral();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotWhiteXY();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposure();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineNoise();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineSharpness();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPrivateData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCameraCalibrationSignature();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCalibrationSignature();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpRectilinear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGWarpFisheye();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGFixVignetteRadial();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFirmware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageFileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseMethod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFReleaseTiming();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFRecordID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFSelfTimingTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFImageSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFContinuousDrive();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFocusMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeteringMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFShootingMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMaxMM();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFLensMinMM();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFWhiteBalanceIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyCIFFMeasuredEV();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSetting();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonColorMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonQuality();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonWhiteBalanceMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonSharpenMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashSetting();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonISOSelection();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonImageAdjustment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensAdapter();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonLensInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonFocusDistance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonDigitalZoom();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShootingMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerNikonShutterCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonCameraSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonImageSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFlashExposureComp();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonContinuousDrive();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonLensModel();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonFirmware();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyMakerCanonAspectRatioInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGCompressionFilter();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGImageMetadataEnumerateTagsUsingBlock {
        @Generated
        boolean call_CGImageMetadataEnumerateTagsUsingBlock(CFStringRef path, CGImageMetadataTagRef tag);
    }

    @Generated
    @CFunction
    public static native CFDictionaryRef CGImageSourceCopyAuxiliaryDataInfoAtIndex(CGImageSourceRef isrc,
            @NUInt long index, CFStringRef auxiliaryImageDataType);

    @Generated
    @CFunction
    public static native void CGImageDestinationAddAuxiliaryDataInfo(CGImageDestinationRef idst,
            CFStringRef auxiliaryImageDataType, CFDictionaryRef auxiliaryDataInfoDictionary);

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyFileContentsDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDepth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeDisparity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoDataDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataInfoMetadata();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImageCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyBytesPerRow();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyNamedColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPixelFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyImages();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyThumbnailImages();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAuxiliaryDataType();

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageSourceGetPrimaryImageIndex(CGImageSourceRef isrc);

    @Generated
    @CFunction
    public static native int CGAnimateImageAtURLWithBlock(CFURLRef url, CFDictionaryRef options,
            @ObjCBlock(name = "call_CGAnimateImageAtURLWithBlock") Block_CGAnimateImageAtURLWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageAtURLWithBlock {
        @Generated
        void call_CGAnimateImageAtURLWithBlock(@NUInt long index, CGImageRef image, BoolPtr stop);
    }

    @Generated
    @CFunction
    public static native int CGAnimateImageDataWithBlock(CFDataRef data, CFDictionaryRef options,
            @ObjCBlock(name = "call_CGAnimateImageDataWithBlock") Block_CGAnimateImageDataWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGAnimateImageDataWithBlock {
        @Generated
        void call_CGAnimateImageDataWithBlock(@NUInt long index, CGImageRef image, BoolPtr stop);
    }

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataNamespaceIPTCExtension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageMetadataPrefixIPTCExtension();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRDictionary();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPrimaryImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSLoopCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSUnclampedDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyHEICSFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeOriginal();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifOffsetTimeDigitized();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceImageNumberOfCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyExifSourceExposureTimesOfCompositeImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyGIFFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGComment();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGDisclaimer();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyPNGWarning();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGFrameInfoArray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyAPNGCanvasPixelHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTerm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAboutCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAddlModelInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkOrObject();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCircaDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContentDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkContributionDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightNotice();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCreatorID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkCopyrightOwnerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkLicensorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkPhysicalDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInventoryNo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkSourceInvURL();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkStylePeriod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtArtworkTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioBitrateMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtAudioChannelCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCircaDateCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContainerFormatName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtContributorRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCopyrightYear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtCreatorRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtControlledVocabularyTerm();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreen();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionD();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionH();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionUnit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionW();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionX();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDataOnScreenRegionY();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalImageGUID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceFileType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDigitalSourceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheet();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtDopesheetLinkLinkQualifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbdEncRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprLangID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEpisodeNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtShownEventName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtExternalMetadataLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtFeedIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenre();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtGenreCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtHeadline();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtIPTCLastEdited();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExpr();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLinkedEncodedRightsExprLangID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCreated();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationCountryName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationSublocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationWorldRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtLocationShown();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailHeight();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtMaxAvailWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtModelAge();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtOrganisationInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeard();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonHeardName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageWDetails();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCharacteristic();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPersonInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageGTIN();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtProductInImageName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEvent();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtPublicationEventName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRating();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRatingRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionCountryName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSAltitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLatitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionGPSLongitude();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionLocationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionProvinceState();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionSublocation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingRegionWorldRegion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMaxValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingScaleMinValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingSourceLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRatingValueLogoLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryEntryRole();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryItemID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtRegistryOrganisationID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtReleaseReady();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeason();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeasonNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeries();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSeriesName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStorylineIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStreamReady();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtStylePeriod();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSource();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtSupplyChainSourceName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverage();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageFrom();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTemporalCoverageTo();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscript();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtTranscriptLinkLinkQualifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrate();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoBitrateMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoDisplayAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoEncodingProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotType();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoShotTypeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVideoStreamsCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtVisualColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermId();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyIPTCExtWorkflowTagCvTermRefinedAbout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGActiveArea();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAnalogBalance();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAntiAliasStrength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotPreProfileMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGAsShotProfileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBaselineExposureOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBayerGreenSplit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBestQualityScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaH();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelDeltaV();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGBlackLevelRepeatDim();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFALayout();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCFAPlaneColor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGChromaBlurRadius();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGColorimetricReference();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentICCProfile();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGCurrentPreProfileMatrix();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultBlackRender();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropOrigin();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultCropSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGDefaultUserCrop();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGExtraCameraProfiles();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGForwardMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearizationTable();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGLinearResponseLimit();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMakerNoteSafety();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGMaskedAreas();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNewRawImageDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGNoiseReductionApplied();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOpcodeList3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalBestQualityFinalSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultCropSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalDefaultFinalSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGOriginalRawFileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewApplicationVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewColorSpace();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewDateTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGPreviewSettingsName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileCopyright();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileEmbedPolicy();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapData2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapDims();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileHueSatMapEncoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableData();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableDims();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileLookTableEncoding();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGProfileToneCurve();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawDataUniqueID();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawImageDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRawToPreviewGain();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix1();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGReductionMatrix2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGRowInterleaveFactor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGShadowScale();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyDNGSubTileBlockSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImagePropertyOpenEXRAspectRatio();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypePortraitEffectsMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationSkinMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationHairMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAuxiliaryDataTypeSemanticSegmentationTeethMatte();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationStartIndex();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationDelayTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCGImageAnimationLoopCount();
}
