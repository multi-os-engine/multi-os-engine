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

package ios.coreimage.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreImage")
@Runtime(CRuntime.class)
public final class CoreImage {
	static {
		NatJ.register();
	}

	@Generated
	private CoreImage() {
	}

	@Generated
	@CVariable()
	public static native int kCIFormatARGB8();

	@Generated
	@CVariable()
	public static native int kCIFormatBGRA8();

	@Generated
	@CVariable()
	public static native int kCIFormatRGBA8();

	@Generated
	@CVariable()
	public static native int kCIFormatRGBAf();

	@Generated
	@CVariable()
	public static native int kCIFormatRGBAh();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageProperties();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustEnhance();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustRedEye();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustFeatures();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustCrop();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustLevel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextOutputColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextWorkingColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextWorkingFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextUseSoftwareRenderer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextPriorityRequestLow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeFilterName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeFilterDisplayName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeFilterCategories();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeClass();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeMin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeMax();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeSliderMin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeSliderMax();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeDefault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeIdentity();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeDisplayName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeScalar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeDistance();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeAngle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeBoolean();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeInteger();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeCount();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypePosition();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeOffset();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypePosition3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeRectangle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeTransform();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryDistortionEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryGeometryAdjustment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryCompositeOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryHalftoneEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryColorAdjustment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryColorEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryTransition();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryTileEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryGenerator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryReduction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryGradient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryStylize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategorySharpen();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryBlur();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryVideo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryStillImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryInterlaced();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryNonSquarePixels();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryHighDynamicRange();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryBuiltIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIOutputImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputBackgroundImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputTimeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputTransformKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputScaleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputAspectRatioKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputCenterKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputRadiusKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputAngleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputWidthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputSharpnessKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputIntensityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputEVKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputSaturationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputColorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputBrightnessKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputContrastKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputMaskImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputTargetImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputExtentKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorTypeFace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorTypeRectangle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorTypeQRCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorAccuracy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorAccuracyLow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorAccuracyHigh();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorTracking();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorMinFeatureSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorImageOrientation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorEyeBlink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorSmile();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorFocalLength();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorAspectRatio();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIFeatureTypeFace();

	@Generated
	@CVariable()
	public static native int kCIFormatABGR8();

	@Generated
	@CVariable()
	public static native int kCIFormatA8();

	@Generated
	@CVariable()
	public static native int kCIFormatA16();

	@Generated
	@CVariable()
	public static native int kCIFormatAh();

	@Generated
	@CVariable()
	public static native int kCIFormatAf();

	@Generated
	@CVariable()
	public static native int kCIFormatR8();

	@Generated
	@CVariable()
	public static native int kCIFormatR16();

	@Generated
	@CVariable()
	public static native int kCIFormatRh();

	@Generated
	@CVariable()
	public static native int kCIFormatRf();

	@Generated
	@CVariable()
	public static native int kCIFormatRG8();

	@Generated
	@CVariable()
	public static native int kCIFormatRG16();

	@Generated
	@CVariable()
	public static native int kCIFormatRGh();

	@Generated
	@CVariable()
	public static native int kCIFormatRGf();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIContextHighQualityDownsample();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeFilterAvailable_Mac();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeFilterAvailable_iOS();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeReferenceDocumentation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIUIParameterSet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIUISetBasic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIUISetIntermediate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIUISetAdvanced();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIUISetDevelopment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeOpaqueColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIAttributeTypeGradient();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCICategoryFilterGenerator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputRefractionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputBiasKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputWeightsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputGradientImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIInputShadingImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorTypeText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorNumberOfAngles();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIDetectorReturnSubFeatures();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIFeatureTypeRectangle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIFeatureTypeQRCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String CIFeatureTypeText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageProviderTileSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageProviderUserInfo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerAffineMatrix();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerWrapMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerFilterMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerWrapBlack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerWrapClamp();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerFilterNearest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerFilterLinear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCISamplerColorSpace();
}
