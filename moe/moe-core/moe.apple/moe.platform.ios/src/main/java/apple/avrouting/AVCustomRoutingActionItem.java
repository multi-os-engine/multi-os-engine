package apple.avrouting;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCustomRoutingActionItem
 * 
 * AVCustomRoutingActionItem objects can be created by 3rd parties to inject custom action items into the route picker.
 * 
 * An item can be any action the app wants to provide as menu items besides the discovered routes.
 * Tapping on the custom items dismisses the picker and invokes a callback to the app telling it which item was tapped.
 * (See -[AVCustomRoutingController customRoutingController:didSelectItem:])
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCustomRoutingActionItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCustomRoutingActionItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCustomRoutingActionItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCustomRoutingActionItem allocWithZone(VoidPtr zone);

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
    public native AVCustomRoutingActionItem init();

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
    public static native AVCustomRoutingActionItem new_objc();

    /**
     * [@property] overrideTitle
     * 
     * A title which overrides the title of the UTType.
     * 
     * Use this to dynamically override the title of the custom item.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("overrideTitle")
    public native String overrideTitle();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] overrideTitle
     * 
     * A title which overrides the title of the UTType.
     * 
     * Use this to dynamically override the title of the custom item.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOverrideTitle:")
    public native void setOverrideTitle(String value);

    /**
     * [@property] type
     * 
     * A UTType with an identifier which matches a UTType in the info.plist.
     * 
     * Provide a UTTypeSymbolName and description in the info.plist.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setType:")
    public native void setType(UTType value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] type
     * 
     * A UTType with an identifier which matches a UTType in the info.plist.
     * 
     * Provide a UTTypeSymbolName and description in the info.plist.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("type")
    public native UTType type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}