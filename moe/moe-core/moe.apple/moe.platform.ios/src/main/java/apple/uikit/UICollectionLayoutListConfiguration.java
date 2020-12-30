package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A list configuration can be used to layout a section inside a UICollectionViewCompositionalLayout as a list.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionLayoutListConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionLayoutListConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionLayoutListConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * The overall appearance of the section.
     */
    @Generated
    @Selector("appearance")
    @NInt
    public native long appearance();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The background color of the section.
     * Defaults to nil, indicating the system background color for the specified appearance is used.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

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

    /**
     * Definies whether the section has a footer. Defaults to UICollectionLayoutListFooterModeNone.
     */
    @Generated
    @Selector("footerMode")
    @NInt
    public native long footerMode();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Definies whether the section has a header. Defaults to UICollectionLayoutListHeaderModeNone.
     */
    @Generated
    @Selector("headerMode")
    @NInt
    public native long headerMode();

    @Generated
    @Selector("init")
    public native UICollectionLayoutListConfiguration init();

    @Generated
    @Selector("initWithAppearance:")
    public native UICollectionLayoutListConfiguration initWithAppearance(@NInt long appearance);

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
     * Called when list is about to show leading swipe actions for a particular index path.
     * Return either a UISwipeActionsConfiguration object or nil if this index path does not show swipe actions.
     */
    @Generated
    @Selector("leadingSwipeActionsConfigurationProvider")
    @ObjCBlock(name = "call_leadingSwipeActionsConfigurationProvider_ret")
    public native Block_leadingSwipeActionsConfigurationProvider_ret leadingSwipeActionsConfigurationProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_leadingSwipeActionsConfigurationProvider_ret {
        @Generated
        UISwipeActionsConfiguration call_leadingSwipeActionsConfigurationProvider_ret(NSIndexPath indexPath);
    }

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
     * The background color of the section.
     * Defaults to nil, indicating the system background color for the specified appearance is used.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * Definies whether the section has a footer. Defaults to UICollectionLayoutListFooterModeNone.
     */
    @Generated
    @Selector("setFooterMode:")
    public native void setFooterMode(@NInt long value);

    /**
     * Definies whether the section has a header. Defaults to UICollectionLayoutListHeaderModeNone.
     */
    @Generated
    @Selector("setHeaderMode:")
    public native void setHeaderMode(@NInt long value);

    /**
     * Called when list is about to show leading swipe actions for a particular index path.
     * Return either a UISwipeActionsConfiguration object or nil if this index path does not show swipe actions.
     */
    @Generated
    @Selector("setLeadingSwipeActionsConfigurationProvider:")
    public native void setLeadingSwipeActionsConfigurationProvider(
            @ObjCBlock(name = "call_setLeadingSwipeActionsConfigurationProvider") Block_setLeadingSwipeActionsConfigurationProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setLeadingSwipeActionsConfigurationProvider {
        @Generated
        UISwipeActionsConfiguration call_setLeadingSwipeActionsConfigurationProvider(NSIndexPath indexPath);
    }

    /**
     * Whether this section shows separators or not.
     */
    @Generated
    @Selector("setShowsSeparators:")
    public native void setShowsSeparators(boolean value);

    /**
     * Called when list is about to show trailing swipe actions for a particular index path.
     * Return either a UISwipeActionsConfiguration object or nil if this index path does not show swipe actions.
     */
    @Generated
    @Selector("setTrailingSwipeActionsConfigurationProvider:")
    public native void setTrailingSwipeActionsConfigurationProvider(
            @ObjCBlock(name = "call_setTrailingSwipeActionsConfigurationProvider") Block_setTrailingSwipeActionsConfigurationProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTrailingSwipeActionsConfigurationProvider {
        @Generated
        UISwipeActionsConfiguration call_setTrailingSwipeActionsConfigurationProvider(NSIndexPath indexPath);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Whether this section shows separators or not.
     */
    @Generated
    @Selector("showsSeparators")
    public native boolean showsSeparators();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Called when list is about to show trailing swipe actions for a particular index path.
     * Return either a UISwipeActionsConfiguration object or nil if this index path does not show swipe actions.
     */
    @Generated
    @Selector("trailingSwipeActionsConfigurationProvider")
    @ObjCBlock(name = "call_trailingSwipeActionsConfigurationProvider_ret")
    public native Block_trailingSwipeActionsConfigurationProvider_ret trailingSwipeActionsConfigurationProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_trailingSwipeActionsConfigurationProvider_ret {
        @Generated
        UISwipeActionsConfiguration call_trailingSwipeActionsConfigurationProvider_ret(NSIndexPath indexPath);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}