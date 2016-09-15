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

package apple.assetslibrary.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AssetsLibrary")
@Runtime(CRuntime.class)
public final class AssetsLibrary {
    static {
        NatJ.register();
    }

    @Generated
    private AssetsLibrary() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsLibraryChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryUpdatedAssetsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryInsertedAssetGroupsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryUpdatedAssetGroupsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryDeletedAssetGroupsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsLibraryErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALErrorInvalidProperty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyLocation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyOrientation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyRepresentations();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyURLs();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyAssetURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypePhoto();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypeVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypeUnknown();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyURL();
}
