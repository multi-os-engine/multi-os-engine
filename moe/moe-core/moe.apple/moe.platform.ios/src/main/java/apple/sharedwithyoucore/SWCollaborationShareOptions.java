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
 * SWCollaborationShareOptions
 * 
 * represents the state of the collaboration options for the document.
 * 
 * SWCollaborationShareOptions contains the SWCollaborationOptionsGorups that are available for the collaboration as
 * well as a string, provided by the client, that summarizes the state of the selected options.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYouCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SWCollaborationShareOptions extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SWCollaborationShareOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SWCollaborationShareOptions alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SWCollaborationShareOptions allocWithZone(VoidPtr zone);

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
    public native SWCollaborationShareOptions init();

    @Generated
    @Selector("initWithCoder:")
    public native SWCollaborationShareOptions initWithCoder(NSCoder coder);

    /**
     * Initializes a shareOptions object to represent the available collaboration options for the document and the
     * default summary string "Share Options"
     * 
     * @param optionsGroups SWCollaborationOptionsGroups to customize how the collaboration will be shared
     */
    @Generated
    @Selector("initWithOptionsGroups:")
    public native SWCollaborationShareOptions initWithOptionsGroups(
            NSArray<? extends SWCollaborationOptionsGroup> optionsGroups);

    /**
     * Initializes a shareOptions object to represent the available collaboration options for the document and a summary
     * of the selected options
     * 
     * @param optionsGroups SWCollaborationOptionsGroups to customize how the collaboration will be shared
     * @param summary       localized string to summarize the selected collaboration options
     */
    @Generated
    @Selector("initWithOptionsGroups:summary:")
    public native SWCollaborationShareOptions initWithOptionsGroupsSummary(
            NSArray<? extends SWCollaborationOptionsGroup> optionsGroups, String summary);

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
    public static native SWCollaborationShareOptions new_objc();

    /**
     * SWCollaborationOptionsGroups to customize how the collaboration will be shared
     */
    @Generated
    @Selector("optionsGroups")
    public native NSArray<? extends SWCollaborationOptionsGroup> optionsGroups();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * SWCollaborationOptionsGroups to customize how the collaboration will be shared
     */
    @Generated
    @Selector("setOptionsGroups:")
    public native void setOptionsGroups(NSArray<? extends SWCollaborationOptionsGroup> value);

    /**
     * Localized string to summarize the selected collaboration options. If nil, "Share Options" will be displayed by
     * default.
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Creates a shareOptions object to represent the available collaboration options for the document and a summary of
     * the selected options
     * 
     * @param optionsGroups SWCollaborationOptionsGroups to customize how the collaboration will be shared
     */
    @Generated
    @Selector("shareOptionsWithOptionsGroups:")
    public static native SWCollaborationShareOptions shareOptionsWithOptionsGroups(
            NSArray<? extends SWCollaborationOptionsGroup> optionsGroups);

    /**
     * Creates a shareOptions object to represent the available collaboration options for the document and a summary of
     * the selected options
     * 
     * @param optionsGroups SWCollaborationOptionsGroups to customize how the collaboration will be shared
     * @param summary       localized string to summarize the selected collaboration options
     */
    @Generated
    @Selector("shareOptionsWithOptionsGroups:summary:")
    public static native SWCollaborationShareOptions shareOptionsWithOptionsGroupsSummary(
            NSArray<? extends SWCollaborationOptionsGroup> optionsGroups, String summary);

    /**
     * Localized string to summarize the selected collaboration options. If nil, "Share Options" will be displayed by
     * default.
     */
    @Generated
    @Selector("summary")
    public native String summary();

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