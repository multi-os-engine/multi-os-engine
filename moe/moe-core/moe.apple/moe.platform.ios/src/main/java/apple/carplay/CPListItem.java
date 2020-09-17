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
import org.moe.natj.general.ann.NFloat;
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
public class CPListItem extends NSObject implements CPSelectableListItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListItem alloc();

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
    @Selector("detailText")
    public native String detailText();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native CPListItem init();

    @Generated
    @Selector("initWithText:detailText:")
    public native CPListItem initWithTextDetailText(String text, String detailText);

    @Generated
    @Selector("initWithText:detailText:image:")
    public native CPListItem initWithTextDetailTextImage(String text, String detailText, UIImage image);

    @Generated
    @Selector("initWithText:detailText:image:showsDisclosureIndicator:")
    public native CPListItem initWithTextDetailTextImageShowsDisclosureIndicator(String text, String detailText,
            UIImage image, boolean showsDisclosureIndicator);

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

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("showsDisclosureIndicator")
    public native boolean showsDisclosureIndicator();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("text")
    public native String text();

    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("accessoryImage")
    public native UIImage accessoryImage();

    @Generated
    @Selector("accessoryType")
    @NInt
    public native long accessoryType();

    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    public native CPSelectableListItem.Block_handler_ret handler();

    @Generated
    @Selector("initWithText:detailText:image:accessoryImage:accessoryType:")
    public native CPListItem initWithTextDetailTextImageAccessoryImageAccessoryType(String text, String detailText,
            UIImage image, UIImage accessoryImage, @NInt long accessoryType);

    @Generated
    @Selector("isExplicitContent")
    public native boolean isExplicitContent();

    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("maximumImageSize")
    @ByValue
    public static native CGSize maximumImageSize();

    @Generated
    @Selector("playbackProgress")
    @NFloat
    public native double playbackProgress();

    @Generated
    @Selector("playingIndicatorLocation")
    @NInt
    public native long playingIndicatorLocation();

    @Generated
    @Selector("setAccessoryImage:")
    public native void setAccessoryImage(UIImage accessoryImage);

    @Generated
    @Selector("setAccessoryType:")
    public native void setAccessoryType(@NInt long value);

    @Generated
    @Selector("setDetailText:")
    public native void setDetailText(String detailText);

    @Generated
    @Selector("setExplicitContent:")
    public native void setExplicitContent(boolean value);

    @Generated
    @Selector("setHandler:")
    public native void setHandler(@ObjCBlock(name = "call_setHandler") CPSelectableListItem.Block_setHandler value);

    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage image);

    @Generated
    @Selector("setPlaybackProgress:")
    public native void setPlaybackProgress(@NFloat double value);

    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    @Generated
    @Selector("setPlayingIndicatorLocation:")
    public native void setPlayingIndicatorLocation(@NInt long value);

    @Generated
    @Selector("setShowsExplicitLabel:")
    public native void setShowsExplicitLabel(boolean value);

    @Generated
    @Selector("setText:")
    public native void setText(String text);

    @Generated
    @Selector("showsExplicitLabel")
    public native boolean showsExplicitLabel();
}