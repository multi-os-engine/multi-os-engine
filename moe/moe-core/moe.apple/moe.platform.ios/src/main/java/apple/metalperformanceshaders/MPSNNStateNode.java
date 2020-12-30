package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSHandle;
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
 * @class      MPSNNStateNode
 * @abstract   A placeholder node denoting the position in the graph of a MPSState object
 * @discussion Some filters need additional information about an image in order to function. For example
 *             a max-pooling gradient filter needs to know which position the max result came from in the
 *             original pooling filter in order to select the right data for gradient computation.  In other cases,
 *             state may be moved into a MPSState object in order to keep the filter itself immutable.
 *             The MPSState object typically encapsulates one or more MTLResource objects.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNStateNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNStateNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNStateNode alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * @abstract   MPS resource identification
     * @discussion See MPSHandle protocol reference.  Default: nil
     */
    @Generated
    @Selector("handle")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSHandle handle();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNStateNode init();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @abstract   MPS resource identification
     * @discussion See MPSHandle protocol reference.  Default: nil
     */
    @Generated
    @Selector("setHandle:")
    public native void setHandle(@Mapped(ObjCObjectMapper.class) MPSHandle value);

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
     * @abstract   Tag a state node for view later
     * @discussion Most state nodes are private to the graph. These alias memory heavily and
     *             consequently generally have invalid state when the graph exits.  When
     *             exportFromGraph = YES, the image is preserved and made available through
     *             the [MPSNNGraph encode... resultStates:... list.
     * 
     *             CAUTION: exporting an state from a graph prevents MPS from
     *                      recycling memory. It will nearly always cause the
     *                      amount of memory used by the graph to increase by the size
     *                      of the state. There will probably be a performance
     *                      regression accordingly.  This feature should generally
     *                      be used only when the node is needed as an input for
     *                      further work and recomputing it is prohibitively costly.
     * 
     *             Default: NO
     */
    @Generated
    @Selector("exportFromGraph")
    public native boolean exportFromGraph();

    /**
     * @abstract   Tag a state node for view later
     * @discussion Most state nodes are private to the graph. These alias memory heavily and
     *             consequently generally have invalid state when the graph exits.  When
     *             exportFromGraph = YES, the image is preserved and made available through
     *             the [MPSNNGraph encode... resultStates:... list.
     * 
     *             CAUTION: exporting an state from a graph prevents MPS from
     *                      recycling memory. It will nearly always cause the
     *                      amount of memory used by the graph to increase by the size
     *                      of the state. There will probably be a performance
     *                      regression accordingly.  This feature should generally
     *                      be used only when the node is needed as an input for
     *                      further work and recomputing it is prohibitively costly.
     * 
     *             Default: NO
     */
    @Generated
    @Selector("setExportFromGraph:")
    public native void setExportFromGraph(boolean value);

    /**
     * @abstract   Set to true to cause the resource to be synchronized with the CPU
     * @discussion Ignored on non-MacOS.
     */
    @Generated
    @Selector("setSynchronizeResource:")
    public native void setSynchronizeResource(boolean value);

    /**
     * @abstract   Set to true to cause the resource to be synchronized with the CPU
     * @discussion Ignored on non-MacOS.
     */
    @Generated
    @Selector("synchronizeResource")
    public native boolean synchronizeResource();
}