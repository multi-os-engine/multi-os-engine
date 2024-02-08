package apple.colorsync.c;

import apple.colorsync.opaque.ColorSyncMutableProfileRef;
import apple.colorsync.opaque.ColorSyncTransformRef;
import apple.colorsync.struct.ColorSyncMD5;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.ColorSyncProfileRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("ColorSync")
@Runtime(CRuntime.class)
public final class ColorSync {
    static {
        NatJ.register();
    }

    @Generated
    private ColorSync() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long ColorSyncProfileGetTypeID();

    /**
     * returns the CFTypeID for ColorSyncProfiles.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncProfileRef ColorSyncProfileCreate(@NotNull CFDataRef data,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * data - profile data
     * error - (optional) pointer to the error which will be returned in case of failure
     * 
     * returns ColorSyncProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncProfileRef ColorSyncProfileCreateWithURL(@NotNull CFURLRef url,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * url - URL to the profile data.
     * error - (optional) pointer to the error which will be returned in case of failure
     * 
     * returns ColorSyncProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncProfileRef ColorSyncProfileCreateWithName(@NotNull CFStringRef name);

    /**
     * name - predefined profile name
     * 
     * returns ColorSyncProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncMutableProfileRef ColorSyncProfileCreateMutable();

    /**
     * returns empty ColorSyncMutableProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncMutableProfileRef ColorSyncProfileCreateMutableCopy(
            @NotNull ColorSyncProfileRef prof);

    /**
     * prof - profile from which profile data will be copied to the created profile.
     * 
     * returns ColorSyncMutableProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncProfileRef ColorSyncProfileCreateLink(@NotNull CFArrayRef profileInfo,
            @Nullable CFDictionaryRef options);

    /**
     * profileInfo - array of dictionaries, each one containing a profile object and the
     * information on the usage of the profile in the transform.
     * 
     * Required keys:
     * ==============
     * kColorSyncProfile : ColorSyncProfileRef
     * kColorSyncRenderingIntent : CFStringRef defining rendering intent
     * kColorSyncTransformTag : CFStringRef defining which tags to use
     * Optional key:
     * =============
     * kColorSyncBlackPointCompensation : CFBooleanRef to enable/disable BPC
     * 
     * options - dictionary with additional public global options (e.g. preferred CMM, quality,
     * etc... It can also contain custom options that are CMM specific.
     * 
     * returns ColorSyncProfileRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileVerify(@NotNull ColorSyncProfileRef prof,
            @Nullable Ptr<CFErrorRef> errors, @Nullable Ptr<CFErrorRef> warnings);

    /**
     * prof - profile to be verified
     * 
     * errors - returns error strings in case problems are found which
     * would prevent use of the profile.
     * 
     * warnings - returns warning strings indicating problems due to lack of
     * conformance with the ICC specification, but not preventing
     * use of the profile.
     * 
     * returns true if profile can be used or false otherwise
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileIsWideGamut(@NotNull ColorSyncProfileRef arg1);

    /**
     * A utility function estimating gamut of a display profile
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileIsMatrixBased(@NotNull ColorSyncProfileRef arg1);

    /**
     * A utility function verifying if a profile is matrix-based
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileIsPQBased(@NotNull ColorSyncProfileRef arg1);

    /**
     * A utility function verifying if a profile is using ITU BT.2100 PQ transfer functions
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileIsHLGBased(@NotNull ColorSyncProfileRef arg1);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native ColorSyncMD5 ColorSyncProfileGetMD5(@NotNull ColorSyncProfileRef prof);

    /**
     * returns MD5 digest for the profile calculated as defined by
     * ICC specification or a "zero" signature (filled with zeros)
     * in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native CFDataRef ColorSyncProfileCopyData(@NotNull ColorSyncProfileRef prof,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * prof - profile to copy the flattened data from
     * error - (optional) pointer to the error which will be returned in case of failure
     * 
     * returns CFDataRef if success or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native CFURLRef ColorSyncProfileGetURL(@NotNull ColorSyncProfileRef prof,
            @Nullable Ptr<CFErrorRef> error);

    /**
     * prof - profile to get URL from
     * error - (optional) pointer to the error which will be returned in case of failure
     * 
     * returns CFURLRef if success or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native CFDataRef ColorSyncProfileCopyHeader(@NotNull ColorSyncProfileRef prof);

    /**
     * prof - profile from which to copy the header
     * 
     * returns CFDataRef containing profile header (in host endianess) or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void ColorSyncProfileSetHeader(@NotNull ColorSyncMutableProfileRef prof,
            @NotNull CFDataRef header);

    /**
     * prof - profile in which to set the header
     * header - CFDataRef containing the header data (must be in host endianess)
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFStringRef ColorSyncProfileCopyDescriptionString(@NotNull ColorSyncProfileRef prof);

    /**
     * prof - profile from which to copy description string
     * 
     * returns CFStringRef containing profile description localized to current locale
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFArrayRef ColorSyncProfileCopyTagSignatures(@NotNull ColorSyncProfileRef prof);

    /**
     * prof - profile from which to copy tag signatures
     * 
     * returns CFArray with signatures (CFStringRef) of tags in the profile
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncProfileContainsTag(@NotNull ColorSyncProfileRef prof,
            @NotNull CFStringRef signature);

    /**
     * prof - profile in which to search for the tag
     * signature - signature of the tag to be searched for
     * 
     * returns true if tag exists or false if does not
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFDataRef ColorSyncProfileCopyTag(@NotNull ColorSyncProfileRef prof,
            @NotNull CFStringRef signature);

    /**
     * prof - profile from which to copy the tag
     * signature - signature of the tag to be copied
     * 
     * returns CFDataRef containing tag data or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void ColorSyncProfileSetTag(@NotNull ColorSyncMutableProfileRef prof,
            @NotNull CFStringRef signature, @NotNull CFDataRef data);

    /**
     * prof - profile in which to set the tag
     * signature - signature of the tag to be set in the profile
     * data - CFDataRef containing the tag data
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void ColorSyncProfileRemoveTag(@NotNull ColorSyncMutableProfileRef prof,
            @NotNull CFStringRef signature);

    /**
     * Current cache seed (uint32_t) sent along with kColorSyncProfileRepositoryChangeNotification
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void ColorSyncIterateInstalledProfiles(
            @FunctionPtr(name = "call_ColorSyncIterateInstalledProfiles") @Nullable Function_ColorSyncIterateInstalledProfiles callBack,
            @Nullable IntPtr seed, @Nullable VoidPtr userInfo, @Nullable Ptr<CFErrorRef> error);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ColorSyncIterateInstalledProfiles {
        @Generated
        boolean call_ColorSyncIterateInstalledProfiles(@NotNull CFDictionaryRef arg0, @NotNull VoidPtr arg1);
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long ColorSyncTransformGetTypeID();

    /**
     * returns the CFTypeID for ColorSyncTransforms.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ColorSyncTransformRef ColorSyncTransformCreate(@Nullable CFArrayRef profileSequence,
            @Nullable CFDictionaryRef options);

    /**
     * profileSequence - array of dictionaries, each one containing a profile object and the
     * information on the usage of the profile in the transform.
     * 
     * Required keys:
     * ==============
     * kColorSyncProfile : ColorSyncProfileRef
     * kColorSyncRenderingIntent : CFStringRef defining rendering intent
     * kColorSyncTransformTag : CFStringRef defining which tags to use
     * Optional key:
     * =============
     * kColorSyncBlackPointCompensation : CFBooleanRef to enable/disable BPC
     * 
     * options - dictionary with additional public global options (e.g. preferred CMM, quality,
     * etc... It can also contain custom options that are CMM specific.
     * 
     * returns ColorSyncTransformRef or NULL in case of failure
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native ConstVoidPtr ColorSyncTransformCopyProperty(@NotNull ColorSyncTransformRef transform,
            @NotNull ConstVoidPtr key, @Nullable CFDictionaryRef options);

    /**
     * transform - transform from which to copy the property
     * key - CFTypeRef to be used as a key to identify the property
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native void ColorSyncTransformSetProperty(@NotNull ColorSyncTransformRef transform,
            @NotNull ConstVoidPtr key, @Nullable ConstVoidPtr property);

    /**
     * transform - transform in which to set the property
     * key - CFTypeRef to be used as a key to identify the property
     * property - CFTypeRef to be set as the property
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @Nullable
    public static native CFArrayRef ColorSyncTransformGetProfileSequence(@NotNull ColorSyncTransformRef transform);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean ColorSyncTransformConvert(@NotNull ColorSyncTransformRef transform, @NUInt long width,
            @NUInt long height, @NotNull VoidPtr dst, int dstDepth, int dstLayout, @NUInt long dstBytesPerRow,
            @NotNull ConstVoidPtr src, int srcDepth, int srcLayout, @NUInt long srcBytesPerRow,
            @Nullable CFDictionaryRef options);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native ConstVoidPtr ColorSyncCreateCodeFragment(@NotNull CFArrayRef profileSequence,
            @NotNull CFDictionaryRef options);

    @Generated
    @CFunction
    public static native int ColorSyncAPIVersion();

    /**
     * com.apple.ColorSync.GenericGray
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericGrayProfile();

    /**
     * com.apple.ColorSync.GenericGrayGamma2.2
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericGrayGamma22Profile();

    /**
     * com.apple.ColorSync.GenericRGB
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericRGBProfile();

    /**
     * com.apple.ColorSync.GenericCMYK
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericCMYKProfile();

    /**
     * com.apple.ColorSync.DisplayP3
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncDisplayP3Profile();

    /**
     * com.apple.ColorSync.sRGB
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSRGBProfile();

    /**
     * com.apple.ColorSync.AdobeRGB1998
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncAdobeRGB1998Profile();

    /**
     * com.apple.ColorSync.GenericLab
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericLabProfile();

    /**
     * com.apple.ColorSync.GenericXYZ
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncGenericXYZProfile();

    /**
     * com.apple.ColorSync.ACESCGLinear
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncACESCGLinearProfile();

    /**
     * com.apple.ColorSync.DCIP3
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncDCIP3Profile();

    /**
     * com.apple.ColorSync.ITUR709
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncITUR709Profile();

    /**
     * com.apple.ColorSync.ITUR2020
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncITUR2020Profile();

    /**
     * com.apple.ColorSync.ROMMRGB
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncROMMRGBProfile();

    /**
     * com.apple.ColorSync.WebSafeColors
     * 
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncWebSafeColorsProfile();

    /**
     * com.apple.ColorSync.ProfileHeader
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileHeader();

    /**
     * com.apple.ColorSync.ProfileClass
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileClass();

    /**
     * com.apple.ColorSync.ProfileColorSpace
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileColorSpace();

    /**
     * com.apple.ColorSync.PCS
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfilePCS();

    /**
     * com.apple.ColorSync.ProfileURL
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileURL();

    /**
     * com.apple.ColorSync.ProfileDescription
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileDescription();

    /**
     * com.apple.ColorSync.ProfileMD5Digest
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileMD5Digest();

    /**
     * com.apple.ColorSync.ProfileIsValid
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileIsValid();

    /**
     * 0x41324230L => CFSTR("A2B0")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigAToB0Tag();

    /**
     * 0x41324231L => CFSTR("A2B1")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigAToB1Tag();

    /**
     * 0x41324232L => CFSTR("A2B2")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigAToB2Tag();

    /**
     * 0x42324130L => CFSTR("B2A0")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigBToA0Tag();

    /**
     * 0x42324131L => CFSTR("B2A1")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigBToA1Tag();

    /**
     * 0x42324132L => CFSTR("B2A2")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigBToA2Tag();

    /**
     * 0x434D594BL => CFSTR("CMYK")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigCmykData();

    /**
     * 0x47524159L => CFSTR("GRAY")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigGrayData();

    /**
     * 0x4C616220L => CFSTR("Lab ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigLabData();

    /**
     * 0x52474220L => CFSTR("RGB ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigRgbData();

    /**
     * 0x58595A20L => CFSTR("XYZ ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigXYZData();

    /**
     * 0x61627374L => CFSTR("abst")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigAbstractClass();

    /**
     * 0x62545243L => CFSTR("bTRC")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigBlueTRCTag();

    /**
     * 0x6258595AL => CFSTR("bXYZ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigBlueColorantTag();

    /**
     * 0x626B7074L => CFSTR("bkpt")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigMediaBlackPointTag();

    /**
     * 0x63707274L => CFSTR("cprt")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigCopyrightTag();

    /**
     * 0x64657363L => CFSTR("desc")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigProfileDescriptionTag();

    /**
     * 0x646D6464L => CFSTR("dmdd")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigDeviceModelDescTag();

    /**
     * 0x646D6E64L => CFSTR("dmnd")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigDeviceMfgDescTag();

    /**
     * 0x67545243L => CFSTR("gTRC")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigGreenTRCTag();

    /**
     * 0x6758595AL => CFSTR("gXYZ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigGreenColorantTag();

    /**
     * 0x67616D74L => CFSTR("gamt")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigGamutTag();

    /**
     * 0x6B545243L => CFSTR("kTRC")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigGrayTRCTag();

    /**
     * 0x6C696E6BL => CFSTR("link")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigLinkClass();

    /**
     * 0x6D6E7472L => CFSTR("mntr")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigDisplayClass();

    /**
     * 0x6E636C32L => CFSTR("ncl2")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigNamedColor2Tag();

    /**
     * 0x6E6D636CL => CFSTR("nmcl")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigNamedColorClass();

    /**
     * 0x70726530L => CFSTR("pre0")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigPreview0Tag();

    /**
     * 0x70726531L => CFSTR("pre1")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigPreview1Tag();

    /**
     * 0x70726532L => CFSTR("pre2")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigPreview2Tag();

    /**
     * 0x70727472L => CFSTR("prtr")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigOutputClass();

    /**
     * 0x70736571L => CFSTR("pseq")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigProfileSequenceDescTag();

    /**
     * 0x72545243L => CFSTR("rTRC")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigRedTRCTag();

    /**
     * 0x7258595AL => CFSTR("rXYZ")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigRedColorantTag();

    /**
     * 0x73636E72L => CFSTR("scnr")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigInputClass();

    /**
     * 0x73706163L => CFSTR("spac")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigColorSpaceClass();

    /**
     * 0x74656368L => CFSTR("tech")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigTechnologyTag();

    /**
     * 0x76696577L => CFSTR("view")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigViewingConditionsTag();

    /**
     * 0x76756564L => CFSTR("vued")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigViewingCondDescTag();

    /**
     * 0x77747074L => CFSTR("wtpt")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncSigMediaWhitePointTag();

    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfileCacheSeed();

    /**
     * Keys and values for profile specific info and options
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncProfile();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntent();

    /**
     * Legal values for kColorSyncRenderingIntent
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntentPerceptual();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntentRelative();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntentSaturation();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntentAbsolute();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncRenderingIntentUseProfileHeader();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformTag();

    /**
     * Legal values for kColorSyncTransformTag
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformDeviceToPCS();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformPCSToPCS();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformPCSToDevice();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformDeviceToDevice();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformGamutCheck();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncBlackPointCompensation();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncExtendedRange();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncHDRDerivative();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncPQDerivative();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncHLGDerivative();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConvertQuality();

    /**
     * do not coalesce profile transforms (default)
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncBestQuality();

    /**
     * coalesce all transforms
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncNormalQuality();

    /**
     * coalesce all transforms, do not interpolate
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncDraftQuality();

    /**
     * allow float data to exceed [0.0 .. 1.0] range
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConvertUseExtendedRange();

    /**
     * dictionary with the following keys
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformInfo();

    /**
     * name of the CMM that created the transform
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformCreator();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformSrcSpace();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformDstSpace();

    /**
     * CFSTR("com.apple.cmm.CodeFragmentType")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformCodeFragmentType();

    /**
     * CFSTR("com.apple.cmm.CodeFragmentMD5")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformCodeFragmentMD5();

    /**
     * CFSTR("com.apple.cmm.FullConversion")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformFullConversionData();

    /**
     * CFSTR("com.apple.cmm.SimplifiedConversion")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformSimplifiedConversionData();

    /**
     * CFSTR("com.apple.cmm.ParametricConversion")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformParametricConversionData();

    /**
     * CFSTR("com.apple.cmm.ProfileSequnce")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncTransformProfileSequnce();

    /**
     * CFSTR("com.apple.cmm.Matrix")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionMatrix();

    /**
     * CFSTR("com.apple.cmm.ParamCurve0")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionParamCurve0();

    /**
     * CFSTR("com.apple.cmm.ParamCurve1")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionParamCurve1();

    /**
     * CFSTR("com.apple.cmm.ParamCurve2")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionParamCurve2();

    /**
     * CFSTR("com.apple.cmm.ParamCurve3")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionParamCurve3();

    /**
     * CFSTR("com.apple.cmm.ParamCurve4")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionParamCurve4();

    /**
     * CFSTR("com.apple.cmm.1D-LUT")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversion1DLut();

    /**
     * CFSTR("com.apple.cmm.GridPointCount")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionGridPoints();

    /**
     * CFSTR("com.apple.cmm.ChannelID")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionChannelID();

    /**
     * CFSTR("com.apple.cmm.3D-LUT")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversion3DLut();

    /**
     * CFSTR("com.apple.cmm.ND-LUT")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionNDLut();

    /**
     * CFSTR("com.apple.cmm.InputChannels")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionInpChan();

    /**
     * CFSTR("com.apple.cmm.OutputChannels")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionOutChan();

    /**
     * CFSTR("com.apple.cmm.BPC")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncConversionBPC();

    /**
     * CFSTR("com.apple.cmm.FixedPointRange")
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @NotNull
    public static native CFStringRef kColorSyncFixedPointRange();

    @Generated public static final double COLORSYNC_MD5_LENGTH = 16.0;
}