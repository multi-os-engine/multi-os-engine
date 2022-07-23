package apple.coreml.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("CoreML")
@Runtime(CRuntime.class)
public final class CoreML {
    static {
        NatJ.register();
    }

    @Generated
    private CoreML() {
    }

    /**
     * A short description of what the model does and/or its purpose
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelDescriptionKey();

    /**
     * A version number encoded as a string
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelVersionStringKey();

    /**
     * The author of this model
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelAuthorKey();

    /**
     * License information for the model
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelLicenseKey();

    /**
     * Any additional pertinent information specified by the model creator
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelCreatorDefinedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelErrorDomain();

    /**
     * Key for CGRect describing a crop region of interest of image source in normalized coordinates
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLFeatureValueImageOptionCropRect();

    /**
     * Key for VNImageCropAndScaleOption describing how to crop and scale the image (or region of interest) to the
     * desired size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLFeatureValueImageOptionCropAndScale();

    /**
     * Notification posted when the model collection has changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelCollectionDidChangeNotification();
}