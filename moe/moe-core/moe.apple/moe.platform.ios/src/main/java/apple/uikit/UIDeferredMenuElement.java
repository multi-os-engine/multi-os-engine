package apple.uikit;

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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDeferredMenuElement extends UIMenuElement {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDeferredMenuElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDeferredMenuElement alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDeferredMenuElement allocWithZone(VoidPtr zone);

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

    /**
     * Returns a placeholder menu element that is replaced with the result of the block's
     * completion handler. A loading UI takes the place of the element in the menu
     * until it is fulfilled. While the element may be stored and re-used across menus, its block is
     * called only once, when the element is first encountered in a menu.
     * 
     * @param elementProvider Called by the system to request the deferred menu items when the containing menu is
     *                        presented.
     *                        Call this block's completion handler when the menu items are available.
     */
    @Generated
    @Selector("elementWithProvider:")
    public static native UIDeferredMenuElement elementWithProvider(
            @ObjCBlock(name = "call_elementWithProvider") Block_elementWithProvider elementProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_elementWithProvider {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_elementWithProvider {
            @Generated
            void call_Block_elementWithProvider(NSArray<? extends UIMenuElement> arg0);
        }

        @Generated
        void call_elementWithProvider(
                @ObjCBlock(name = "call_Block_elementWithProvider") Block_Block_elementWithProvider completion);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIDeferredMenuElement init();

    @Generated
    @Selector("initWithCoder:")
    public native UIDeferredMenuElement initWithCoder(NSCoder coder);

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
    public static native UIDeferredMenuElement new_objc();

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
     * Returns a placeholder menu element that is replaced with the result of the block's
     * completion handler. A loading UI takes the place of the element in the menu
     * until it is fulfilled. Elements created using this initializer are "uncached",
     * so their @c elementProvider block is called every time the element is displayed.
     * 
     * @param elementProvider Called by the system to request the deferred menu items when the containing menu is
     *                        presented.
     *                        Call this block's completion handler when the menu items are available.
     * 
     *                        API-Since: 15.0
     */
    @Generated
    @Selector("elementWithUncachedProvider:")
    public static native UIDeferredMenuElement elementWithUncachedProvider(
            @ObjCBlock(name = "call_elementWithUncachedProvider") Block_elementWithUncachedProvider elementProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_elementWithUncachedProvider {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_elementWithUncachedProvider {
            @Generated
            void call_Block_elementWithUncachedProvider(NSArray<? extends UIMenuElement> arg0);
        }

        @Generated
        void call_elementWithUncachedProvider(
                @ObjCBlock(name = "call_Block_elementWithUncachedProvider") Block_Block_elementWithUncachedProvider completion);
    }
}
