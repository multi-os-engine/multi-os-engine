package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPInformationTemplate extends CPTemplate {
    static {
        NatJ.register();
    }

    @Generated
    protected CPInformationTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * An array of actions that appear at the bottom of the template.
     * <p>
     * To update the actions appearing in this information template, assign a new array to this property.
     * <p>
     * [@note] The maximum number of actions is 3. If you specify more than 3, only the first 3 will be used.
     */
    @Generated
    @Selector("actions")
    public native NSArray<? extends CPTextButton> actions();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPInformationTemplate alloc();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPInformationTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPInformationTemplate initWithCoder(NSCoder coder);

    /**
     * Initialize a CPInformationTemplate with a title, optional labels, and optional action buttons.
     * <p>
     * [@note] The maximum number of @c CPInformationItem is 10. If you specify more than 10 items, only the first 10 will be used.
     * The maximum number of @c CPTextButton is 3. If you specify more than 3, only the first 3 will be used.
     *
     * @param layout  Information template layout, either leading aligned or two columns
     * @param title   Information template title, appears at the top of the template
     * @param items   Information items that will appear in the template
     * @param actions Optional actions that appear at the bottom of the template
     */
    @Generated
    @Selector("initWithTitle:layout:items:actions:")
    public native CPInformationTemplate initWithTitleLayoutItemsActions(String title, @NInt long layout,
            NSArray<? extends CPInformationItem> items, NSArray<? extends CPTextButton> actions);

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

    /**
     * An array of @c CPInformationItem.
     * <p>
     * To update the items appearing in this information template, assign a new array to this property.
     * <p>
     * [@note] The maximum number of items is 10. If you specify more than 10 items, only the first 10 will be used.
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends CPInformationItem> items();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Information template layout, either leading aligned or two columns.
     */
    @Generated
    @Selector("layout")
    @NInt
    public native long layout();

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
     * An array of actions that appear at the bottom of the template.
     * <p>
     * To update the actions appearing in this information template, assign a new array to this property.
     * <p>
     * [@note] The maximum number of actions is 3. If you specify more than 3, only the first 3 will be used.
     */
    @Generated
    @Selector("setActions:")
    public native void setActions(NSArray<? extends CPTextButton> value);

    /**
     * An array of @c CPInformationItem.
     * <p>
     * To update the items appearing in this information template, assign a new array to this property.
     * <p>
     * [@note] The maximum number of items is 10. If you specify more than 10 items, only the first 10 will be used.
     */
    @Generated
    @Selector("setItems:")
    public native void setItems(NSArray<? extends CPInformationItem> value);

    /**
     * Title that will appear at the top of the template.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

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

    /**
     * Title that will appear at the top of the template.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
