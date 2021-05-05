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

package apple.photos.c;

import apple.coregraphics.struct.CGSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Photos")
@Runtime(CRuntime.class)
public final class Photos {
    @Generated public static final int PHLivePhotoRequestIDInvalid = 0x00000000;
    @Generated public static final int PHInvalidImageRequestID = 0x00000000;
    @Generated public static final int PHInvalidAssetResourceDataRequestID = 0x00000000;

    static {
        NatJ.register();
    }

    @Generated
    private Photos() {
    }

    /**
     * key : NSError decribing an error that has occurred while creating the live photo
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoErrorKey();

    /**
     * key : NSNumber containing a BOOL, YES whenever the deivered live photo object does not contain all content required for full playback.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoIsDegradedKey();

    /**
     * key : NSNumber containing a BOOL, YES when the result handler is being called after the request has been cancelled.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoCancelledKey();

    /**
     * Completion handler info dictionary keys
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHContentEditingInputResultIsInCloudKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHContentEditingInputCancelledKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHContentEditingInputErrorKey();

    /**
     * Indicates whether processing should happen at playback time
     * If set to NO (the default) the live photo will always be rendered before playback
     * If set to YES, the editing context might still choose to render first for performance reasons
     * This option is ignored by the saveLivePhotoToOutput method
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoShouldRenderAtPlaybackTime();

    /**
     * Size to pass when requesting the original image or the largest rendered image available (resizeMode will be ignored)
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGSize PHImageManagerMaximumSize();

    /**
     * key (NSNumber): result is in iCloud, meaning a new request will need to get issued (with networkAccessAllowed set) to get the result
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultIsInCloudKey();

    /**
     * key (NSNumber): result  is a degraded image (only with async requests), meaning other images will be sent unless the request is cancelled in the meanwhile (note that the other request may fail if, for example, data is not available locally and networkAccessAllowed was not specified)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultIsDegradedKey();

    /**
     * key (NSNumber): Request ID of the request for this result
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultRequestIDKey();

    /**
     * key (NSNumber): result is not available because the request was cancelled
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageCancelledKey();

    /**
     * key (NSError): NSFileManager or iCloud Photo Library errors
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHPhotosErrorDomain();

    /**
     * If the local object cannot be resolved from a global identifier, PHLocalIdentifierNotFound is provided in that array slot.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLocalIdentifierNotFound();
}
