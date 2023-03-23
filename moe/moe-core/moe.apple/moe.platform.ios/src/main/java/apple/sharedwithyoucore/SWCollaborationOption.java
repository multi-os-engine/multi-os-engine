package apple.sharedwithyoucore;

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
 * SWCollaborationOption
 * 
 * A user-facing option for configuring a shareable collaborative item
 * 
 * SWCollaborationOptions represent the available settings (such as permissions) a user can configure on a collaborative
 * item
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYouCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SWCollaborationOption extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SWCollaborationOption(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SWCollaborationOption alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SWCollaborationOption allocWithZone(VoidPtr zone);

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

    /**
     * Unique identifier
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native SWCollaborationOption init();

    @Generated
    @Selector("initWithCoder:")
    public native SWCollaborationOption initWithCoder(NSCoder coder);

    /**
     * Initializes a collaboration option object with a title and unique identifier
     * 
     * @param title      A localized title string to be used when displaying the option
     * @param identifier The unique identifier for the option
     */
    @Generated
    @Selector("initWithTitle:identifier:")
    public native SWCollaborationOption initWithTitleIdentifier(String title, String identifier);

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
     * A flag that indicates whether the option is selected.
     * 
     * This property should only be set directly when the option represents an individual switch. Defaults to NO
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SWCollaborationOption new_objc();

    /**
     * Initializes a collaboration option with a title and unique identifier
     * 
     * @param title      A localized title string to be used when displaying the option
     * @param identifier The unique identifier for the option
     */
    @Generated
    @Selector("optionWithTitle:identifier:")
    public static native SWCollaborationOption optionWithTitleIdentifier(String title, String identifier);

    /**
     * An array of option identifiers that must already be selected in order to be interacted with
     */
    @Generated
    @Selector("requiredOptionsIdentifiers")
    public native NSArray<String> requiredOptionsIdentifiers();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An array of option identifiers that must already be selected in order to be interacted with
     */
    @Generated
    @Selector("setRequiredOptionsIdentifiers:")
    public native void setRequiredOptionsIdentifiers(NSArray<String> value);

    /**
     * A flag that indicates whether the option is selected.
     * 
     * This property should only be set directly when the option represents an individual switch. Defaults to NO
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    /**
     * A localized subtitle string to be used when displaying the option
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * A localized title string to be used when displaying the option
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A localized subtitle string to be used when displaying the option
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

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
     * A localized title string to be used when displaying the option
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}