package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPSelectableListItem;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPListImageRowItem extends NSObject implements CPSelectableListItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListImageRowItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListImageRowItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPListImageRowItem allocWithZone(VoidPtr zone);

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
     * Read-only access to the grid images shown in a row in the cell.
     * <p>
     * [@note] The maximum number of images shown is @c CPMaximumNumberOfGridImages.
     * If you supply more images, only the first @c CPMaximumNumberOfGridImages will be used.
     */
    @Generated
    @Selector("gridImages")
    public native NSArray<? extends UIImage> gridImages();

    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    public native CPSelectableListItem.Block_handler_ret handler();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPListImageRowItem init();

    /**
     * Initialize a list image row item with a text string and an array of @c UIImage
     * for the grid of images.
     * <p>
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * <p>
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * <p>
     * [@note] The expected image size is given by +[CPListImageRowItem maximumImageSize]. Images provided
     * will be resized to this size if necessary.
     * <p>
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     */
    @Generated
    @Selector("initWithText:images:")
    public native CPListImageRowItem initWithTextImages(String text, NSArray<? extends UIImage> images);

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
     * The image row item that the user selected.
     */
    @Generated
    @Selector("listImageRowHandler")
    @ObjCBlock(name = "call_listImageRowHandler_ret")
    public native Block_listImageRowHandler_ret listImageRowHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_listImageRowHandler_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_listImageRowHandler_ret {
            @Generated
            void call_Block_listImageRowHandler_ret();
        }

        @Generated
        void call_listImageRowHandler_ret(CPListImageRowItem arg0, @NInt long arg1,
                @ObjCBlock(name = "call_Block_listImageRowHandler_ret") Block_Block_listImageRowHandler_ret arg2);
    }

    /**
     * The expected image size for the grid images in your @c CPListImageRowItem. Images provided
     * will be resized to this size.
     * <p>
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     */
    @Generated
    @Selector("maximumImageSize")
    @ByValue
    public static native CGSize maximumImageSize();

    @Generated
    @Owned
    @Selector("new")
    public static native CPListImageRowItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setHandler:")
    public native void setHandler(@ObjCBlock(name = "call_setHandler") CPSelectableListItem.Block_setHandler value);

    /**
     * The image row item that the user selected.
     */
    @Generated
    @Selector("setListImageRowHandler:")
    public native void setListImageRowHandler(
            @ObjCBlock(name = "call_setListImageRowHandler") Block_setListImageRowHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setListImageRowHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_setListImageRowHandler {
            @Generated
            void call_Block_setListImageRowHandler();
        }

        @Generated
        void call_setListImageRowHandler(CPListImageRowItem arg0, @NInt long arg1,
                @ObjCBlock(name = "call_Block_setListImageRowHandler") Block_Block_setListImageRowHandler arg2);
    }

    /**
     * The primary text shown in a cell displaying this list item.
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("text")
    public native String text();

    /**
     * Update the images displayed in this image row item. If this image row
     * item is already displayed in a list template, this image row item will be
     * automatically reloaded.
     * <p>
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * <p>
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     *
     * @see To update/reload the title of the image row item, assign to
     * the @c text property of the image row item.
     */
    @Generated
    @Selector("updateImages:")
    public native void updateImages(NSArray<? extends UIImage> gridImages);

    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);
}
