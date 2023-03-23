package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSDictionary;
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
public class NSTextListElement extends NSTextParagraph {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextListElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextListElement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSTextListElement allocWithZone(VoidPtr zone);

    /**
     * The contents intended to be displayed. Derived from contents/textList configured with the text list element's
     * position inside the tree. It is overriding its superclass implementation, NSTextParagraph.attributedString
     */
    @Generated
    @Selector("attributedString")
    public native NSAttributedString attributedString();

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

    /**
     * NSTextListElement has children of the same type.
     */
    @Generated
    @Selector("childElements")
    public native NSArray<? extends NSTextListElement> childElements();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * The text list element contents without markers and formatting.
     */
    @Generated
    @Selector("contents")
    public native NSAttributedString contents();

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
    public native NSTextListElement init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSTextListElement initWithAttributedString(NSAttributedString attributedString);

    /**
     * Designated initializer. Initializes 2 types of NSTextListElement: a standard list item and nesting parent
     * element. Either of contents, markerAttributes, or childElements must be non-nil. Clients should typically use one
     * of 2 factory methods below for instantiating with a specific type. When markerAttributes!=nil, it will be used to
     * format the marker; otherwise, it is derived from contents.
     */
    @Generated
    @Selector("initWithParentElement:textList:contents:markerAttributes:childElements:")
    public native NSTextListElement initWithParentElementTextListContentsMarkerAttributesChildElements(
            NSTextListElement parent, NSTextList textList, NSAttributedString contents,
            NSDictionary<String, ?> markerAttributes, NSArray<? extends NSTextListElement> children);

    @Generated
    @Selector("initWithTextContentManager:")
    public native NSTextListElement initWithTextContentManager(NSTextContentManager textContentManager);

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
     * Attributes defining the text formatting of marker string inside attributedString.
     */
    @Generated
    @Selector("markerAttributes")
    public native NSDictionary<String, ?> markerAttributes();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextListElement new_objc();

    /**
     * NSTextListElement has the parent of the same type.
     */
    @Generated
    @Selector("parentElement")
    public native NSTextListElement parentElement();

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
    @Selector("textList")
    public native NSTextList textList();

    /**
     * Returns an instance with childElements without contents. Returns nil if childElements.count == 0. nestingLevel
     * specifies the number of shifts represented by the tree elements returned. Raises an exception when nestingLevel <
     * 0. textList specifies NSTextList used by the new instance.
     */
    @Generated
    @Selector("textListElementWithChildElements:textList:nestingLevel:")
    public static native NSTextListElement textListElementWithChildElementsTextListNestingLevel(
            NSArray<? extends NSTextListElement> children, NSTextList textList, @NInt long nestingLevel);

    /**
     * Instantiates a standard text list.
     */
    @Generated
    @Selector("textListElementWithContents:markerAttributes:textList:childElements:")
    public static native NSTextListElement textListElementWithContentsMarkerAttributesTextListChildElements(
            NSAttributedString contents, NSDictionary<String, ?> markerAttributes, NSTextList textList,
            NSArray<? extends NSTextListElement> children);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}