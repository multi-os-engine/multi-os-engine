package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTROTAHeader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROTAHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROTAHeader alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROTAHeader allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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

    /**
     * A digest of the payload that follows the header. Can be used to verify that
     * the payload is not truncated or corrupted.
     */
    @Generated
    @Selector("imageDigest")
    @NotNull
    public native NSData imageDigest();

    /**
     * The specific algorithm that was used to compute imageDigest.
     */
    @Generated
    @Selector("imageDigestType")
    @NUInt
    public native long imageDigestType();

    @Generated
    @Selector("init")
    public native MTROTAHeader init();

    /**
     * Initialize the MTROTAHeader with the given Matter OTA software image data (as defined in the
     * "Over-the-Air (OTA) Software Update File Format" section of the Matter specification). The
     * provided data is expected to point to a large enough initial chunk of an OTA software image that
     * it includes the entire header (e.g. the entire image).
     * 
     * If the passed-in data is too small and does not contain the entire OTA image header, initWithData
     * will return nil and the caller should try creating a new MTROTAHeader object and initializing it
     * with a larger chunk of the image.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithData:")
    public native MTROTAHeader initWithData(@NotNull NSData data);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * If not nil, specifies the largest software version that this update can be
     * applied on top of. In that case, this value must be compared to the
     * SoftwareVersion in the QueryImage command to check whether this image is
     * valid for the OTA requestor.
     */
    @Generated
    @Selector("maxApplicableVersion")
    @Nullable
    public native NSNumber maxApplicableVersion();

    /**
     * If not nil, specifies the smallest software version that this update can be
     * applied on top of. In that case, this value must be compared to the
     * SoftwareVersion in the QueryImage command to check whether this image is
     * valid for the OTA requestor.
     */
    @Generated
    @Selector("minApplicableVersion")
    @Nullable
    public native NSNumber minApplicableVersion();

    @Generated
    @Owned
    @Selector("new")
    public static native MTROTAHeader new_objc();

    /**
     * The size of the actual image payload, which follows the header in the OTA
     * file.
     */
    @Generated
    @Selector("payloadSize")
    @NotNull
    public native NSNumber payloadSize();

    /**
     * The identifier of the specific product the image is meant for. May be 0, if
     * the image might apply to more than one product. This is allowed, but not
     * required, to be matched against the product id received in Query Image.
     */
    @Generated
    @Selector("productID")
    @NotNull
    public native NSNumber productID();

    /**
     * If not nil a URL pointing to release notes for the software update
     * represented by the image.
     */
    @Generated
    @Selector("releaseNotesURL")
    @Nullable
    public native String releaseNotesURL();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A digest of the payload that follows the header. Can be used to verify that
     * the payload is not truncated or corrupted.
     */
    @Generated
    @Selector("setImageDigest:")
    public native void setImageDigest(@NotNull NSData value);

    /**
     * The specific algorithm that was used to compute imageDigest.
     */
    @Generated
    @Selector("setImageDigestType:")
    public native void setImageDigestType(@NUInt long value);

    /**
     * If not nil, specifies the largest software version that this update can be
     * applied on top of. In that case, this value must be compared to the
     * SoftwareVersion in the QueryImage command to check whether this image is
     * valid for the OTA requestor.
     */
    @Generated
    @Selector("setMaxApplicableVersion:")
    public native void setMaxApplicableVersion(@Nullable NSNumber value);

    /**
     * If not nil, specifies the smallest software version that this update can be
     * applied on top of. In that case, this value must be compared to the
     * SoftwareVersion in the QueryImage command to check whether this image is
     * valid for the OTA requestor.
     */
    @Generated
    @Selector("setMinApplicableVersion:")
    public native void setMinApplicableVersion(@Nullable NSNumber value);

    /**
     * The size of the actual image payload, which follows the header in the OTA
     * file.
     */
    @Generated
    @Selector("setPayloadSize:")
    public native void setPayloadSize(@NotNull NSNumber value);

    /**
     * The identifier of the specific product the image is meant for. May be 0, if
     * the image might apply to more than one product. This is allowed, but not
     * required, to be matched against the product id received in Query Image.
     */
    @Generated
    @Selector("setProductID:")
    public native void setProductID(@NotNull NSNumber value);

    /**
     * If not nil a URL pointing to release notes for the software update
     * represented by the image.
     */
    @Generated
    @Selector("setReleaseNotesURL:")
    public native void setReleaseNotesURL(@Nullable String value);

    /**
     * The version of the software contained in this image. This is the version the
     * OTA requestor will be updated to if this image is installed. This can be
     * used to determine whether this image is newer than what the requestor is
     * currently running, by comparing it to the SoftwareVersion in the Query Image
     * command.
     */
    @Generated
    @Selector("setSoftwareVersion:")
    public native void setSoftwareVersion(@NotNull NSNumber value);

    /**
     * Human-readable version of softwareVersion. This must not be used for
     * deciding which versions are newer or older; use softwareVersion for that.
     */
    @Generated
    @Selector("setSoftwareVersionString:")
    public native void setSoftwareVersionString(@NotNull String value);

    /**
     * The identifier of the vendor whose product this image is meant for.
     * 
     * This field can be compared to the vendor id received in the Query Image
     * command to determine whether an image matches.
     * 
     * This field may be 0, in which case the image might apply to products from
     * more than one vendor. If it's nonzero, it must match the vendor id in Query
     * Image for this image to be considered.
     */
    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@NotNull NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The version of the software contained in this image. This is the version the
     * OTA requestor will be updated to if this image is installed. This can be
     * used to determine whether this image is newer than what the requestor is
     * currently running, by comparing it to the SoftwareVersion in the Query Image
     * command.
     */
    @Generated
    @Selector("softwareVersion")
    @NotNull
    public native NSNumber softwareVersion();

    /**
     * Human-readable version of softwareVersion. This must not be used for
     * deciding which versions are newer or older; use softwareVersion for that.
     */
    @Generated
    @Selector("softwareVersionString")
    @NotNull
    public native String softwareVersionString();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The identifier of the vendor whose product this image is meant for.
     * 
     * This field can be compared to the vendor id received in the Query Image
     * command to determine whether an image matches.
     * 
     * This field may be 0, in which case the image might apply to products from
     * more than one vendor. If it's nonzero, it must match the vendor id in Query
     * Image for this image to be considered.
     */
    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}