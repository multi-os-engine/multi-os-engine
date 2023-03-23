package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] PHASEShape
 * 
 * The physical representation of an object within the simulated acoustic scene.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEShape extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEShape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEShape alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEShape allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] elements
     * 
     * List of all the shape elements associated with this shape.
     */
    @Generated
    @Selector("elements")
    public native NSArray<? extends PHASEShapeElement> elements();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEShape init();

    /**
     * initWithEngine:mesh
     * 
     * Initialize a shape from a mesh.
     * 
     * One PHASEShapeElement will be created for every submesh within the mesh.
     * [@note]
     * A single shape can be used to create multiple instances of sources and occluders.
     * For example, a client could create a single shape for a window, then create multiple occluders from it.
     * The same can be done with with sources.
     * 
     * @param engine
     *               The engine this shape will be used with.
     * @param mesh
     *               A Model I/O mesh object.
     * @return
     *         A new shape object
     */
    @Generated
    @Selector("initWithEngine:mesh:")
    public native PHASEShape initWithEngineMesh(PHASEEngine engine, MDLMesh mesh);

    /**
     * initWithEngine:mesh
     * 
     * Initialize a shape from an MDLMesh and a list of materials
     * 
     * The materials array cannot be empty and cannot contain nil entries, otherwise an exception is thrown.
     * If the number of submeshes within the mesh are less than or equal to the size of the material array, the material
     * will be assigned
     * to the corresponding element. If the number of submeshes within the mesh is greater than the size of the material
     * array, the material
     * assigned to the element will be the index of the element modulo the number of materials. IE: given a mesh with 6
     * submeshes and an array
     * of 3 materials, the element at index 5 will be assigned the material at index: 5 % 3 = 2.
     * 
     * @param engine
     *                  The engine this shape will be used with
     * @param mesh
     *                  A Model I/O mesh object.
     * @param materials
     *                  An array of PHASEMaterial objects that overrides any acoustical materials within the mesh object
     * @return
     *         A new shape object
     */
    @Generated
    @Selector("initWithEngine:mesh:materials:")
    public native PHASEShape initWithEngineMeshMaterials(PHASEEngine engine, MDLMesh mesh,
            NSArray<? extends PHASEMaterial> materials);

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
    public static native PHASEShape new_objc();

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
}
