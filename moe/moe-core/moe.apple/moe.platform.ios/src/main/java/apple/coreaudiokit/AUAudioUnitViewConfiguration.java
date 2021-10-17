package apple.coreaudiokit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * AUAudioUnitViewConfiguration
 * <p>
 * Properties of the configuration that a host uses to embed the view of an audio unit.
 * <p>
 * Hosts may support embedding the view of an audio unit in different configurations. These
 * configurations may vary in the size reserved for the audio unit's view and the additional
 * control surfaces that are displayed along with it. The host can propose several view
 * configurations and the audio unit should report the ones which it supports.
 * <p>
 * See the documentation for supportedViewConfigurations.
 */
@Generated
@Library("CoreAudioKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnitViewConfiguration extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AUAudioUnitViewConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnitViewConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AUAudioUnitViewConfiguration allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property]	height
     * <p>
     * The height of the view, measured in points.
     * <p>
     * Setting the height to 0 will match any height.
     */
    @Generated
    @Selector("height")
    @NFloat
    public native double height();

    /**
     * [@property]	hostHasController
     * <p>
     * Boolean property specifying whether the host displays its own control surface
     * when showing the view of the audio unit.
     */
    @Generated
    @Selector("hostHasController")
    public native boolean hostHasController();

    @Generated
    @Selector("init")
    public native AUAudioUnitViewConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native AUAudioUnitViewConfiguration initWithCoder(NSCoder coder);

    /**
     * initWithWidth
     * <p>
     * Designated initializer.
     *
     * @param        width The width associated with this view configuration.
     * @param        height The height associated with this view configuration.
     * @param        hostHasController This property controls whether the host shows its own control surface in this view
     * configuration.
     * @return Returns the newly created view configuration object.
     */
    @Generated
    @Selector("initWithWidth:height:hostHasController:")
    public native AUAudioUnitViewConfiguration initWithWidthHeightHostHasController(@NFloat double width,
            @NFloat double height, boolean hostHasController);

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
    public static native AUAudioUnitViewConfiguration new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]	width
     * <p>
     * The width of the view, measured in points.
     * <p>
     * Setting the width to 0 will match any width.
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();
}
