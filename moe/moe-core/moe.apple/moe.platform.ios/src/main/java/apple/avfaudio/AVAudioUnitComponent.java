package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.opaque.AudioComponent;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSDictionary;
import apple.uikit.UIImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioUnitComponent
 * 
 * Provides details about an audio unit such as type, subtype, manufacturer, location etc. User
 * tags can be added to the AVAudioUnitComponent which can be queried later for display.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitComponent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitComponent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] allTagNames
     * 
     * represent the tags from the current user and the system tags defined by AudioComponent.
     */
    @NotNull
    @Generated
    @Selector("allTagNames")
    public native NSArray<String> allTagNames();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitComponent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitComponent allocWithZone(VoidPtr zone);

    /**
     * [@property] audioComponent
     * 
     * the audioComponent that can be used in AudioComponent APIs.
     */
    @NotNull
    @Generated
    @Selector("audioComponent")
    public native AudioComponent audioComponent();

    /**
     * [@property] audioComponentDescription
     * 
     * description of the audio component that can be used in AudioComponent APIs.
     */
    @Generated
    @Selector("audioComponentDescription")
    @ByValue
    public native AudioComponentDescription audioComponentDescription();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
     * [@property] hasMIDIInput
     * 
     * YES if AudioComponent has midi input, otherwise NO
     */
    @Generated
    @Selector("hasMIDIInput")
    public native boolean hasMIDIInput();

    /**
     * [@property] hasMIDIOutput
     * 
     * YES if AudioComponent has midi output, otherwise NO
     */
    @Generated
    @Selector("hasMIDIOutput")
    public native boolean hasMIDIOutput();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioUnitComponent init();

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
     * [@property] sandboxSafe
     * 
     * On OSX, YES if the AudioComponent can be loaded into a sandboxed process otherwise NO.
     * On iOS, this is always YES.
     */
    @Generated
    @Selector("isSandboxSafe")
    public native boolean isSandboxSafe();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] localizedTypeName
     * 
     * localized string of typeName for display
     */
    @NotNull
    @Generated
    @Selector("localizedTypeName")
    public native String localizedTypeName();

    /**
     * [@property] manufacturerName
     * 
     * the manufacturer name, extracted from the manufacturer key defined in Info.plist dictionary
     */
    @NotNull
    @Generated
    @Selector("manufacturerName")
    public native String manufacturerName();

    /**
     * [@property] name
     * 
     * the name of an audio component
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioUnitComponent new_objc();

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

    /**
     * [@property] typeName
     * 
     * standard audio component types returned as strings
     */
    @NotNull
    @Generated
    @Selector("typeName")
    public native String typeName();

    /**
     * [@property] version
     * 
     * version number comprised of a hexadecimal number with major, minor, dot-release format: 0xMMMMmmDD
     */
    @Generated
    @Selector("version")
    @NUInt
    public native long version();

    /**
     * [@property] versionString
     * 
     * version number as string
     */
    @NotNull
    @Generated
    @Selector("versionString")
    public native String versionString();

    /**
     * [@property] configurationDictionary
     * 
     * A NSDictionary that contains information describing the capabilities of the AudioComponent.
     * The specific information depends on the type and the keys are defined in AudioUnitProperties.h
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("configurationDictionary")
    public native NSDictionary<String, ?> configurationDictionary();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("icon")
    public native UIImage icon();

    /**
     * [@property] passesAUVal
     * 
     * YES if the AudioComponent has passed the AU validation tests, otherwise NO
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("passesAUVal")
    public native boolean passesAUVal();
}
