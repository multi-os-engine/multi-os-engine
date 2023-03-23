package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UISearchSuggestion;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A concrete container for search suggestion string and optional image and associated information for providing
 * shortcuts in search experience on tvOS.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchSuggestionItem extends NSObject implements UISearchSuggestion {
    static {
        NatJ.register();
    }

    @Generated
    protected UISearchSuggestionItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISearchSuggestionItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UISearchSuggestionItem allocWithZone(VoidPtr zone);

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
    @Selector("iconImage")
    public native UIImage iconImage();

    @Generated
    @Selector("init")
    public native UISearchSuggestionItem init();

    /**
     * Initializers taking NSAttributedString instead of NSString for the suggestion
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithLocalizedAttributedSuggestion:")
    public native UISearchSuggestionItem initWithLocalizedAttributedSuggestion(NSAttributedString suggestion);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithLocalizedAttributedSuggestion:localizedDescription:")
    public native UISearchSuggestionItem initWithLocalizedAttributedSuggestionLocalizedDescription(
            NSAttributedString suggestion, String description);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithLocalizedAttributedSuggestion:localizedDescription:iconImage:")
    public native UISearchSuggestionItem initWithLocalizedAttributedSuggestionLocalizedDescriptionIconImage(
            NSAttributedString suggestion, String description, UIImage iconImage);

    /**
     * Initializes a search suggestion object with a specified search suggestion string.
     */
    @Generated
    @Selector("initWithLocalizedSuggestion:")
    public native UISearchSuggestionItem initWithLocalizedSuggestion(String suggestion);

    /**
     * Initializes a search suggestion object with a specified search suggestion string and a description string.
     */
    @Generated
    @Selector("initWithLocalizedSuggestion:localizedDescription:")
    public native UISearchSuggestionItem initWithLocalizedSuggestionLocalizedDescription(String suggestion,
            String description);

    /**
     * Initializes a search suggestion object with a specified search suggestion string, a description string, and a
     * search icon image.
     */
    @Generated
    @Selector("initWithLocalizedSuggestion:localizedDescription:iconImage:")
    public native UISearchSuggestionItem initWithLocalizedSuggestionLocalizedDescriptionIconImage(String suggestion,
            String description, UIImage iconImage);

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
    @Selector("localizedAttributedSuggestion")
    public native NSAttributedString localizedAttributedSuggestion();

    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Selector("localizedSuggestion")
    public native String localizedSuggestion();

    @Generated
    @Owned
    @Selector("new")
    public static native UISearchSuggestionItem new_objc();

    @Generated
    @Selector("representedObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object representedObject();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setRepresentedObject:")
    public native void setRepresentedObject(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Factory methods taking NSAttributedString instead of NSString for the suggestion
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("suggestionWithLocalizedAttributedSuggestion:")
    public static native UISearchSuggestionItem suggestionWithLocalizedAttributedSuggestion(
            NSAttributedString suggestion);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("suggestionWithLocalizedAttributedSuggestion:descriptionString:")
    public static native UISearchSuggestionItem suggestionWithLocalizedAttributedSuggestionDescriptionString(
            NSAttributedString suggestion, String description);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("suggestionWithLocalizedAttributedSuggestion:descriptionString:iconImage:")
    public static native UISearchSuggestionItem suggestionWithLocalizedAttributedSuggestionDescriptionStringIconImage(
            NSAttributedString suggestion, String description, UIImage iconImage);

    /**
     * Returns a new search suggestion object with a specified suggestion string.
     */
    @Generated
    @Selector("suggestionWithLocalizedSuggestion:")
    public static native UISearchSuggestionItem suggestionWithLocalizedSuggestion(String suggestion);

    /**
     * Returns a new search suggestion object with a specified suggestion string and a description string.
     */
    @Generated
    @Selector("suggestionWithLocalizedSuggestion:descriptionString:")
    public static native UISearchSuggestionItem suggestionWithLocalizedSuggestionDescriptionString(String suggestion,
            String description);

    /**
     * Returns a new search suggestion object with a specified suggestion string, description string, and a search icon
     * image.
     */
    @Generated
    @Selector("suggestionWithLocalizedSuggestion:descriptionString:iconImage:")
    public static native UISearchSuggestionItem suggestionWithLocalizedSuggestionDescriptionStringIconImage(
            String suggestion, String description, UIImage iconImage);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}