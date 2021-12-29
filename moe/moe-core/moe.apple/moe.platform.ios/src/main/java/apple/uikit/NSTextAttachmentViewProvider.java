package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.NSTextLocation;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextAttachmentViewProvider extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextAttachmentViewProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextAttachmentViewProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextAttachmentViewProvider allocWithZone(VoidPtr zone);

    /**
     * Invoked from -[NSTextAttachment attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:]
     */
    @Generated
    @Selector("attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:")
    @ByValue
    public native CGRect attachmentBoundsForAttributesLocationTextContainerProposedLineFragmentPosition(
            NSDictionary<String, ?> attributes, @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            NSTextContainer textContainer, @ByValue CGRect proposedLineFragment, @ByValue CGPoint position);

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
    public native NSTextAttachmentViewProvider init();

    @Generated
    @Selector("initWithTextAttachment:parentView:textLayoutManager:location:")
    public native NSTextAttachmentViewProvider initWithTextAttachmentParentViewTextLayoutManagerLocation(
            NSTextAttachment textAttachment, UIView parentView, NSTextLayoutManager textLayoutManager,
            @Mapped(ObjCObjectMapper.class) NSTextLocation location);

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
     * This is where subclasses should create their custom view hierarchy. Should never be called directly.
     */
    @Generated
    @Selector("loadView")
    public native void loadView();

    @Generated
    @Selector("location")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextLocation location();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextAttachmentViewProvider new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This property determines the text attachment bounds policy. If YES, -[NSTextAttachment attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:] consults the text attachment view provider for determining the bounds instead of using -bounds. NO by default
     */
    @Generated
    @Selector("setTracksTextAttachmentViewBounds:")
    public native void setTracksTextAttachmentViewBounds(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * View instantiation
     * The getter first invokes loadView if the view hasn't been set yet. Subclasses must call super if they override the setter or getter.
     */
    @Generated
    @Selector("setView:")
    public native void setView(UIView value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("textAttachment")
    public native NSTextAttachment textAttachment();

    @Generated
    @Selector("textLayoutManager")
    public native NSTextLayoutManager textLayoutManager();

    /**
     * This property determines the text attachment bounds policy. If YES, -[NSTextAttachment attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:] consults the text attachment view provider for determining the bounds instead of using -bounds. NO by default
     */
    @Generated
    @Selector("tracksTextAttachmentViewBounds")
    public native boolean tracksTextAttachmentViewBounds();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * View instantiation
     * The getter first invokes loadView if the view hasn't been set yet. Subclasses must call super if they override the setter or getter.
     */
    @Generated
    @Selector("view")
    public native UIView view();
}
