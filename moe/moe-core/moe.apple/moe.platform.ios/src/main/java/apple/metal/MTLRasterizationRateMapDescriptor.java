package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.struct.MTLSize;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] MTLRasterizationRateMapDescriptor
 * <p>
 * Describes a MTLRasterizationRateMap containing an arbitrary number of MTLRasterizationRateLayerDescriptor instances.
 * <p>
 * An MTLRasterizationRateMapDescriptor is compiled into an MTLRasterizationRateMap using MTLDevice.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRasterizationRateMapDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRasterizationRateMapDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRasterizationRateMapDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRasterizationRateMapDescriptor allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLRasterizationRateMapDescriptor init();

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

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * layerAtIndex:
     * <p>
     * Use setLayer:atIndex: to add or set the layer.
     * Identical to "layers[layerIndex]".
     *
     * @return The MTLRasterizationRateLayerDescriptor instance for the given layerIndex, or nil if no instance hasn't been set for this index.
     */
    @Generated
    @Selector("layerAtIndex:")
    public native MTLRasterizationRateLayerDescriptor layerAtIndex(@NUInt long layerIndex);

    /**
     * [@property] layerCount
     * <p>
     * This property is modified by setting new layer instances using setLayer:atIndex: or assigning to layers[X]
     *
     * @return The number of subsequent non-nil layer instances stored in the descriptor, starting at index 0.
     */
    @Generated
    @Selector("layerCount")
    @NUInt
    public native long layerCount();

    /**
     * [@property] layers
     * <p>
     * Accesses the layers currently stored in the descriptor.
     * Syntactic sugar around "layerAtIndex:" and "setLayer:atIndex:"
     *
     * @return A modifiable array of layers
     */
    @Generated
    @Selector("layers")
    public native MTLRasterizationRateLayerArray layers();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLRasterizationRateMapDescriptor new_objc();

    /**
     * rasterizationRateMapDescriptorWithScreenSize:
     * <p>
     * Convenience descriptor creation function without layers
     *
     * @param screenSize The dimensions, in screen space pixels, of the region where variable rasterization is applied. The depth component of MTLSize is ignored.
     * @return A descriptor containing no layers. Add or remove layers using setObject:atIndexedSubscript:.
     */
    @Generated
    @Selector("rasterizationRateMapDescriptorWithScreenSize:")
    public static native MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSize(
            @ByValue MTLSize screenSize);

    /**
     * rasterizationRateMapDescriptorWithScreenSize:layer:
     * <p>
     * Convenience descriptor creation function for a single layer.
     *
     * @param screenSize The dimensions, in screen space pixels, of the region where variable rasterization is applied. The depth component of MTLSize is ignored.
     * @param layer      The single layer describing how the rasterization rate varies in screen space
     * @return A descriptor containing a single layer. Add or remove layers using setObject:atIndexedSubscript:.
     */
    @Generated
    @Selector("rasterizationRateMapDescriptorWithScreenSize:layer:")
    public static native MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSizeLayer(
            @ByValue MTLSize screenSize, MTLRasterizationRateLayerDescriptor layer);

    /**
     * rasterizationRateMapDescriptorWithScreenSize:layerCount:layers:
     * <p>
     * Convenience descriptor creation function for an arbitrary amount of layers stored in a C-array.
     * <p>
     * The function copies the array of pointers internally, the caller need not keep the array alive after creating the descriptor.
     *
     * @param screenSize The dimensions, in screen space pixels, of the region where variable rasterization is applied. The depth component of MTLSize is ignored.
     * @param layerCount The number of layers in the descriptor.
     * @param layers     An array of pointers to layer descriptors. The array must contain layerCount non-null pointers to MTLRasterizationRateLayerDescriptor instances.
     * @return A descriptor containing all the specified layers. Add or remove layers using setObject:atIndexedSubscript:.
     */
    @Generated
    @Selector("rasterizationRateMapDescriptorWithScreenSize:layerCount:layers:")
    public static native MTLRasterizationRateMapDescriptor rasterizationRateMapDescriptorWithScreenSizeLayerCountLayers(
            @ByValue MTLSize screenSize, @NUInt long layerCount,
            @ReferenceInfo(type = MTLRasterizationRateLayerDescriptor.class) ConstPtr<MTLRasterizationRateLayerDescriptor> layers);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] screenSize
     * <p>
     * The region always has its origin at [0, 0].
     * The depth component of MTLSize is ignored.
     *
     * @return The dimensions, in screen space pixels, of the region where variable rasterization is applied.
     */
    @Generated
    @Selector("screenSize")
    @ByValue
    public native MTLSize screenSize();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     * <p>
     * The default value is nil.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * setLayer:atIndex:
     * <p>
     * Sets the MTLRasterizationRateLayerDescriptor instance for the given layerIndex.
     * <p>
     * The previous instance at the index, if any, will be overwritten.
     * Set nil to an index to remove the layer at that index from the descriptor.
     * Identical to "layers[layerIndex] = layer".
     */
    @Generated
    @Selector("setLayer:atIndex:")
    public native void setLayerAtIndex(MTLRasterizationRateLayerDescriptor layer, @NUInt long layerIndex);

    /**
     * [@property] screenSize
     * <p>
     * The region always has its origin at [0, 0].
     * The depth component of MTLSize is ignored.
     *
     * @return The dimensions, in screen space pixels, of the region where variable rasterization is applied.
     */
    @Generated
    @Selector("setScreenSize:")
    public native void setScreenSize(@ByValue MTLSize value);

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
