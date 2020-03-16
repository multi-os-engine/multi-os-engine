package apple.avfoundation.protocol;

import apple.avfoundation.AVCapturePhoto;
import apple.avfoundation.AVDepthData;
import apple.avfoundation.AVPortraitEffectsMatte;
import apple.avfoundation.AVSemanticSegmentationMatte;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCapturePhotoFileDataRepresentationCustomizer")
public interface AVCapturePhotoFileDataRepresentationCustomizer {
    @Generated
    @IsOptional
    @Selector("replacementDepthDataForPhoto:")
    default AVDepthData replacementDepthDataForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("replacementEmbeddedThumbnailPixelBufferWithPhotoFormat:forPhoto:")
    default CVBufferRef replacementEmbeddedThumbnailPixelBufferWithPhotoFormatForPhoto(
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> replacementEmbeddedThumbnailPhotoFormatOut,
            AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("replacementMetadataForPhoto:")
    default NSDictionary<String, ?> replacementMetadataForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("replacementPortraitEffectsMatteForPhoto:")
    default AVPortraitEffectsMatte replacementPortraitEffectsMatteForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("replacementSemanticSegmentationMatteOfType:forPhoto:")
    default AVSemanticSegmentationMatte replacementSemanticSegmentationMatteOfTypeForPhoto(
            String semanticSegmentationMatteType, AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }
}