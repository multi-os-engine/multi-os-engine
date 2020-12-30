package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @abstract Lets you provide relevant shortcut to Siri, for display on the Siri Watch Face.
 * @discussion Including relevance information allows Siri to make suggestions for shortcuts that the user might be interested in but has not previously performed.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRelevantShortcut extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INRelevantShortcut(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRelevantShortcut alloc();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INRelevantShortcut init();

    @Generated
    @Selector("initWithCoder:")
    public native INRelevantShortcut initWithCoder(NSCoder coder);

    /**
     * @abstract Creates a relevant shortcut for the given shortcut.
     */
    @Generated
    @Selector("initWithShortcut:")
    public native INRelevantShortcut initWithShortcut(INShortcut shortcut);

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

    /**
     * @abstract A collection of relevance information that is attached to the relevant shortcuts.
     * @discussion Providing additional relevance information allows Siri to suggest a shortcut that the user is interested in but has not previously performed.
     * @seealso INRelevanceProvider
     */
    @Generated
    @Selector("relevanceProviders")
    public native NSArray<? extends INRelevanceProvider> relevanceProviders();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @abstract A collection of relevance information that is attached to the relevant shortcuts.
     * @discussion Providing additional relevance information allows Siri to suggest a shortcut that the user is interested in but has not previously performed.
     * @seealso INRelevanceProvider
     */
    @Generated
    @Selector("setRelevanceProviders:")
    public native void setRelevanceProviders(NSArray<? extends INRelevanceProvider> value);

    /**
     * @abstract The role of the relevant shortcut.
     * @discussion Provides a hint to Siri about the expected user experience. The default is @c INRelevantShortcutRoleAction.
     * @seealso INRelevantShortcutRole
     */
    @Generated
    @Selector("setShortcutRole:")
    public native void setShortcutRole(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @abstract Customizes the display of the relevant shortcut on the Siri watch face.
     * @discussion By default, the UI for the relevant shortcut can be derivied from the information provided in the @c INShortcut. In certain situations, it may be desirable to override this behavior and provide a custom template.
     * @seealso INDefaultCardTemplate
     */
    @Generated
    @Selector("setWatchTemplate:")
    public native void setWatchTemplate(INDefaultCardTemplate value);

    /**
     * @abstract The shortcut that will be performed when this relevant shortcut is invoked.
     * @seealso INShortcut
     */
    @Generated
    @Selector("shortcut")
    public native INShortcut shortcut();

    /**
     * @abstract The role of the relevant shortcut.
     * @discussion Provides a hint to Siri about the expected user experience. The default is @c INRelevantShortcutRoleAction.
     * @seealso INRelevantShortcutRole
     */
    @Generated
    @Selector("shortcutRole")
    @NInt
    public native long shortcutRole();

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
     * @abstract Customizes the display of the relevant shortcut on the Siri watch face.
     * @discussion By default, the UI for the relevant shortcut can be derivied from the information provided in the @c INShortcut. In certain situations, it may be desirable to override this behavior and provide a custom template.
     * @seealso INDefaultCardTemplate
     */
    @Generated
    @Selector("watchTemplate")
    public native INDefaultCardTemplate watchTemplate();
}