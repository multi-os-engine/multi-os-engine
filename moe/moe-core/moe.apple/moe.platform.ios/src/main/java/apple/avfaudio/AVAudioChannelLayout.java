package apple.avfaudio;

import apple.NSObject;
import apple.coreaudiotypes.struct.AudioChannelLayout;
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
 * AVAudioChannelLayout
 * <p>
 * A description of the roles of a set of audio channels.
 * <p>
 * This object is a thin wrapper for the AudioChannelLayout structure, described
 * in <CoreAudio/CoreAudioTypes.h>.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioChannelLayout extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioChannelLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioChannelLayout alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioChannelLayout allocWithZone(VoidPtr zone);

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

    /**
     * [@property] channelCount
     * <p>
     * The number of channels of audio data.
     */
    @Generated
    @Selector("channelCount")
    public native int channelCount();

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

    @Generated
    @Selector("init")
    public native AVAudioChannelLayout init();

    @Generated
    @Selector("initWithCoder:")
    public native AVAudioChannelLayout initWithCoder(NSCoder coder);

    /**
     * initWithLayout:
     * <p>
     * Initialize from an AudioChannelLayout.
     * <p>
     * If the provided layout's tag is kAudioChannelLayoutTag_UseChannelDescriptions, this
     * initializer attempts to convert it to a more specific tag.
     *
     * @param layout The AudioChannelLayout.
     */
    @Generated
    @Selector("initWithLayout:")
    public native AVAudioChannelLayout initWithLayout(AudioChannelLayout layout);

    /**
     * initWithLayoutTag:
     * <p>
     * Initialize from a layout tag.
     * <p>
     * Returns nil if the tag is either kAudioChannelLayoutTag_UseChannelDescriptions or
     * kAudioChannelLayoutTag_UseChannelBitmap.
     *
     * @param layoutTag The tag.
     */
    @Generated
    @Selector("initWithLayoutTag:")
    public native AVAudioChannelLayout initWithLayoutTag(int layoutTag);

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

    /**
     * isEqual:
     * <p>
     * Determine whether another AVAudioChannelLayout is exactly equal to this layout.
     * <p>
     * The underlying AudioChannelLayoutTag and AudioChannelLayout are compared for equality.
     *
     * @param object The AVAudioChannelLayout to compare against.
     */
    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] layout
     * <p>
     * The underlying AudioChannelLayout.
     */
    @Generated
    @Selector("layout")
    public native AudioChannelLayout layout();

    /**
     * [@property] layoutTag
     * <p>
     * The layout's tag.
     */
    @Generated
    @Selector("layoutTag")
    public native int layoutTag();

    /**
     * layoutWithLayout:
     * <p>
     * Create from an AudioChannelLayout
     */
    @Generated
    @Selector("layoutWithLayout:")
    public static native AVAudioChannelLayout layoutWithLayout(AudioChannelLayout layout);

    /**
     * layoutWithLayoutTag:
     * <p>
     * Create from a layout tag.
     */
    @Generated
    @Selector("layoutWithLayoutTag:")
    public static native AVAudioChannelLayout layoutWithLayoutTag(int layoutTag);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioChannelLayout new_objc();

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
}
