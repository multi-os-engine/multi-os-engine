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

package apple.coreimage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Information about a Quick Response code detected in a still or video image.
 * 
 * > Note: In macOS 10.13, iOS 11, and tvOS 11 or later, the Vision framework replaces these classes
 * for identifying and analyzing image features.
 * See <doc://com.apple.documentation/documentation/vision/vndetectbarcodesrequest>)
 * 
 * A QR code is a two-dimensional barcode using the ISO/IEC 18004:2006 standard. The properties of
 * a CIQRCodeFeature object identify the corners of the barcode in the image perspective and provide
 * the decoded message.
 * 
 * To detect QR codes in an image or video, choose ``CIDetectorTypeQRCode`` type when initializing a
 * ``CIDetector`` object.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIQRCodeFeature extends CIFeature implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CIQRCodeFeature(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIQRCodeFeature alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIQRCodeFeature allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIQRCodeFeature new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The image coordinate of the lower-left corner of the detected QR code.
     */
    @Generated
    @Selector("bottomLeft")
    @ByValue
    public native CGPoint bottomLeft();

    /**
     * The image coordinate of the lower-right corner of the detected QR code.
     */
    @Generated
    @Selector("bottomRight")
    @ByValue
    public native CGPoint bottomRight();

    /**
     * A rectangle that indicates the position and extent of the QR code feature in image coordinates.
     * 
     * This property identifies the rectangular region of the image containing the detected QR code,
     * not necessarily the shape of the QR code. A detected feature is square in space, but may
     * appear as a four-sided polygon in the image. Use the properties listed in `CIQRCodeFeature` to find the
     * corners of the QR code as it appears in perspective.
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("init")
    public native CIQRCodeFeature init();

    /**
     * The string decoded from the detected barcode.
     */
    @Nullable
    @Generated
    @Selector("messageString")
    public native String messageString();

    /**
     * The image coordinate of the upper-left corner of the detected QR code.
     */
    @Generated
    @Selector("topLeft")
    @ByValue
    public native CGPoint topLeft();

    /**
     * The image coordinate of the upper-right corner of the detected QR code.
     */
    @Generated
    @Selector("topRight")
    @ByValue
    public native CGPoint topRight();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native CIQRCodeFeature initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * An abstract representation of a QR Code symbol.
     * 
     * The property is a ``CIQRCodeDescriptor`` instance that contains the payload, symbol version,
     * mask pattern, and error correction level, so the QR Code can be reproduced.
     * 
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("symbolDescriptor")
    public native CIQRCodeDescriptor symbolDescriptor();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
