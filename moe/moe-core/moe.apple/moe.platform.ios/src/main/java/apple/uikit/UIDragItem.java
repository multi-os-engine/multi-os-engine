package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSItemProvider;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDragItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDragItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDragItem alloc();

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
    public native UIDragItem init();

    @Generated
    @Selector("initWithItemProvider:")
    public native UIDragItem initWithItemProvider(NSItemProvider itemProvider);

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
    @Selector("itemProvider")
    public native NSItemProvider itemProvider();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Use `localObject` to attach additional information to
     * this drag item, visible only inside the app that started the drag.
     */
    @Generated
    @Selector("localObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object localObject();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Use `previewProvider` to change the preview for an item.
     * 
     * Each item is usually given a preview when the drag begins,
     * either by the UIDragInteractionDelegate's `-dragInteraction:previewForLiftingItem:session:`
     * method, or by creating a preview from the dragging view.
     * 
     * During the drag, applications may attempt to change the item's preview,
     * by setting `previewProvider` to a block that returns a preview.
     * It will be called when and if the system requests it.
     * 
     * To use the default preview, set `previewProvider` to nil.
     * To hide the preview, set `previewProvider` to a block that returns nil.
     */
    @Generated
    @Selector("previewProvider")
    @ObjCBlock(name = "call_previewProvider_ret")
    public native Block_previewProvider_ret previewProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previewProvider_ret {
        @Generated
        UIDragPreview call_previewProvider_ret();
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Use `localObject` to attach additional information to
     * this drag item, visible only inside the app that started the drag.
     */
    @Generated
    @Selector("setLocalObject:")
    public native void setLocalObject(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Use `previewProvider` to change the preview for an item.
     * 
     * Each item is usually given a preview when the drag begins,
     * either by the UIDragInteractionDelegate's `-dragInteraction:previewForLiftingItem:session:`
     * method, or by creating a preview from the dragging view.
     * 
     * During the drag, applications may attempt to change the item's preview,
     * by setting `previewProvider` to a block that returns a preview.
     * It will be called when and if the system requests it.
     * 
     * To use the default preview, set `previewProvider` to nil.
     * To hide the preview, set `previewProvider` to a block that returns nil.
     */
    @Generated
    @Selector("setPreviewProvider:")
    public native void setPreviewProvider(@ObjCBlock(name = "call_setPreviewProvider") Block_setPreviewProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPreviewProvider {
        @Generated
        UIDragPreview call_setPreviewProvider();
    }

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