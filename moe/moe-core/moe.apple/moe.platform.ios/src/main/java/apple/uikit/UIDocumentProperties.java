package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.linkpresentation.LPLinkMetadata;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentProperties extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentProperties(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * To support sharing, assign a closure to return a UIActivityViewController configured to share the represented
     * document.
     */
    @Generated
    @Selector("activityViewControllerProvider")
    @ObjCBlock(name = "call_activityViewControllerProvider_ret")
    public native Block_activityViewControllerProvider_ret activityViewControllerProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activityViewControllerProvider_ret {
        @Generated
        UIActivityViewController call_activityViewControllerProvider_ret();
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentProperties alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIDocumentProperties allocWithZone(VoidPtr zone);

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
     * To support drag & drop, assign a closure to return an array of drag items corresponding to the represented
     * document.
     */
    @Generated
    @Selector("dragItemsProvider")
    @ObjCBlock(name = "call_dragItemsProvider_ret")
    public native Block_dragItemsProvider_ret dragItemsProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dragItemsProvider_ret {
        @Generated
        NSArray<? extends UIDragItem> call_dragItemsProvider_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIDocumentProperties init();

    /**
     * Initialize with metadata directly when the item is not backed by a url.
     */
    @Generated
    @Selector("initWithMetadata:")
    public native UIDocumentProperties initWithMetadata(LPLinkMetadata metadata);

    /**
     * When initializing with a url, UIKit will automatically lookup metadata based on the data at that url.
     */
    @Generated
    @Selector("initWithURL:")
    public native UIDocumentProperties initWithURL(NSURL url);

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
     * The metadata to use. UIKit will generate this automatically if a url is given at initialization time.
     */
    @Generated
    @Selector("metadata")
    public native LPLinkMetadata metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native UIDocumentProperties new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * To support sharing, assign a closure to return a UIActivityViewController configured to share the represented
     * document.
     */
    @Generated
    @Selector("setActivityViewControllerProvider:")
    public native void setActivityViewControllerProvider(
            @ObjCBlock(name = "call_setActivityViewControllerProvider") Block_setActivityViewControllerProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActivityViewControllerProvider {
        @Generated
        UIActivityViewController call_setActivityViewControllerProvider();
    }

    /**
     * To support drag & drop, assign a closure to return an array of drag items corresponding to the represented
     * document.
     */
    @Generated
    @Selector("setDragItemsProvider:")
    public native void setDragItemsProvider(
            @ObjCBlock(name = "call_setDragItemsProvider") Block_setDragItemsProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDragItemsProvider {
        @Generated
        NSArray<? extends UIDragItem> call_setDragItemsProvider(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * The metadata to use. UIKit will generate this automatically if a url is given at initialization time.
     */
    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(LPLinkMetadata value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * If enabled, shows an icon representation of the document in the navigation bar.
     */
    @Generated
    @Selector("setWantsIconRepresentation:")
    public native void setWantsIconRepresentation(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * If enabled, shows an icon representation of the document in the navigation bar.
     */
    @Generated
    @Selector("wantsIconRepresentation")
    public native boolean wantsIconRepresentation();
}