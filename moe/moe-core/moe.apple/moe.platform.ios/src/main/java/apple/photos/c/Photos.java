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
    static {
        NatJ.register();
    }

    @Generated
    private Photos() {
    }

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

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize PHImageManagerMaximumSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultIsInCloudKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultIsDegradedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageResultRequestIDKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageCancelledKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHImageErrorKey();

    @Generated public static final int PHInvalidImageRequestID = 0x00000000;
    @Generated public static final int PHInvalidAssetResourceDataRequestID = 0x00000000;
    @Generated public static final int PHLivePhotoRequestIDInvalid = 0x00000000;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoIsDegradedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PHLivePhotoInfoCancelledKey();
}
