package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVContentKeySpecifier extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVContentKeySpecifier(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeySpecifier alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVContentKeySpecifier allocWithZone(VoidPtr zone);

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

    /**
     * contentKeySpecifierForKeySystem:identifier:options:
     * <p>
     * Creates a new instance of AVContentKeySpecifier.
     * <p>
     * This method returns an AVContentKeySpecifier instance that represents a content key in a specific content key system.
     *
     * @param keySystem            A valid key system for content keys.
     * @param contentKeyIdentifier Container and protocol-specific key identifier.
     * @param options              Additional information necessary to obtain the key, can be empty if none needed.
     * @return A new AVContentKeySpecifier
     */
    @Generated
    @Selector("contentKeySpecifierForKeySystem:identifier:options:")
    public static native AVContentKeySpecifier contentKeySpecifierForKeySystemIdentifierOptions(String keySystem,
            @Mapped(ObjCObjectMapper.class) Object contentKeyIdentifier, NSDictionary<String, ?> options);

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

    /**
     * [@property]      identifier
     * <p>
     * Container and protocol-specific key identifier.
     */
    @Generated
    @Selector("identifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object identifier();

    @Generated
    @Selector("init")
    public native AVContentKeySpecifier init();

    /**
     * initForKeySystem:identifier:options:
     * <p>
     * Initialize an instance of AVContentKeySpecifier.
     * <p>
     * This method returns an AVContentKeySpecifier instance that represents a content key in a specific content key system.
     *
     * @param keySystem            A valid key system for content keys.
     * @param contentKeyIdentifier Container and protocol-specific key identifier.
     * @param options              Additional information necessary to obtain the key, can be empty if none needed.
     * @return An instance of AVContentKeySpecifier
     */
    @Generated
    @Selector("initForKeySystem:identifier:options:")
    public native AVContentKeySpecifier initForKeySystemIdentifierOptions(String keySystem,
            @Mapped(ObjCObjectMapper.class) Object contentKeyIdentifier, NSDictionary<String, ?> options);

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
     * [@property]      keySystem
     * <p>
     * A valid key system for content keys.
     */
    @Generated
    @Selector("keySystem")
    public native String keySystem();

    @Generated
    @Owned
    @Selector("new")
    public static native AVContentKeySpecifier new_objc();

    /**
     * [@property]      options
     * <p>
     * Additional information necessary to obtain the key, can be empty if none needed.
     */
    @Generated
    @Selector("options")
    public native NSDictionary<String, ?> options();

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
