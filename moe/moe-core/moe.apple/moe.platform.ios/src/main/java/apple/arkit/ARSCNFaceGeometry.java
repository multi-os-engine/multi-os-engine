package apple.arkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.modelio.MDLMesh;
import apple.scenekit.SCNGeometry;
import apple.scenekit.SCNGeometryElement;
import apple.scenekit.SCNGeometrySource;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A SceneKit geometry representing a face.
 */
@Generated
@Library("ARKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ARSCNFaceGeometry extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected ARSCNFaceGeometry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ARSCNFaceGeometry alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ARSCNFaceGeometry allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Creates a new face geometry using a Metal device.
     *
     * @param device A Metal device.
     * @return A new face geometry.
     */
    @Generated
    @Selector("faceGeometryWithDevice:")
    public static native ARSCNFaceGeometry faceGeometryWithDevice(@Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * Creates a new face geometry using a Metal device.
     * <p>
     * By default the regions between the eye lids as well as the region
     * between the lips are not covered by geometry. For using the face geometry as an
     * occlusion geometry set \p fillMesh to YES. This will fill
     * in additional geometry into the gaps between the eye lids as well as into the
     * gap between the lips.
     *
     * @param fillMesh Whether to fill in additional geometry into the
     *                 gaps between the eye lids as well as into the gap between the lips.
     * @return A new face geometry.
     */
    @Generated
    @Selector("faceGeometryWithDevice:fillMesh:")
    public static native ARSCNFaceGeometry faceGeometryWithDeviceFillMesh(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean fillMesh);

    @Generated
    @Selector("geometry")
    public static native ARSCNFaceGeometry geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native ARSCNFaceGeometry geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native ARSCNFaceGeometry geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
            NSArray<? extends SCNGeometryElement> elements);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ARSCNFaceGeometry init();

    @Generated
    @Selector("initWithCoder:")
    public native ARSCNFaceGeometry initWithCoder(NSCoder coder);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native ARSCNFaceGeometry new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Updates the geometry with the vertices of a face geometry.
     *
     * @param faceGeometry A face geometry.
     */
    @Generated
    @Selector("updateFromFaceGeometry:")
    public native void updateFromFaceGeometry(ARFaceGeometry faceGeometry);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
