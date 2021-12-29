package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNLossDataDescriptor
 * [@dependency] This depends on Metal.framework.
 * <p>
 * The MPSCNNLossDataDescriptor specifies a loss data descriptor.
 * The same descriptor can be used to initialize both the
 * labels and the optional weights data.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLossDataDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLossDataDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLossDataDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLossDataDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   bytesPerImage
     * <p>
     * Slice bytes of loss data.
     * <p>
     * This parameter specifies the slice bytes of loss data.
     */
    @Generated
    @Selector("bytesPerImage")
    @NUInt
    public native long bytesPerImage();

    /**
     * [@property]   bytesPerRow
     * <p>
     * Row bytes of loss data.
     * <p>
     * This parameter specifies the row bytes of loss data.
     */
    @Generated
    @Selector("bytesPerRow")
    @NUInt
    public native long bytesPerRow();

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

    /**
     * Make a descriptor loss data. The bytesPerRow and bytesPerImage
     * are automatically calculated assuming a dense array. If it is
     * not a dense array, adjust bytesPerRow and bytesPerImage to the
     * right value by changing properties.
     *
     * @param data   The per-element loss data. The data must be in floating point format.
     * @param layout The data layout of loss data.
     * @param size   The size of loss data.
     * @return A valid MPSCNNLossDataDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("cnnLossDataDescriptorWithData:layout:size:")
    public static native MPSCNNLossDataDescriptor cnnLossDataDescriptorWithDataLayoutSize(NSData data,
            @NUInt long layout, @ByValue MTLSize size);

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
    public native MPSCNNLossDataDescriptor init();

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
     * [@property]   layout
     * <p>
     * Data layout of loss data. See MPSImage.h for more information.
     * <p>
     * This parameter specifies the layout of loss data.
     */
    @Generated
    @Selector("layout")
    @NUInt
    public native long layout();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLossDataDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   bytesPerImage
     * <p>
     * Slice bytes of loss data.
     * <p>
     * This parameter specifies the slice bytes of loss data.
     */
    @Generated
    @Selector("setBytesPerImage:")
    public native void setBytesPerImage(@NUInt long value);

    /**
     * [@property]   bytesPerRow
     * <p>
     * Row bytes of loss data.
     * <p>
     * This parameter specifies the row bytes of loss data.
     */
    @Generated
    @Selector("setBytesPerRow:")
    public native void setBytesPerRow(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   size
     * <p>
     * Size of loss data: (width, height, feature channels}.
     * <p>
     * This parameter specifies the size of loss data.
     */
    @Generated
    @Selector("size")
    @ByValue
    public native MTLSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
