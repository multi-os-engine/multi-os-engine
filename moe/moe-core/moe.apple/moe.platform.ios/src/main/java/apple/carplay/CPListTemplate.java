package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPBarButtonProviding;
import apple.carplay.protocol.CPListTemplateDelegate;
import apple.carplay.protocol.CPListTemplateItem;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSIndexPath;
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
public class CPListTemplate extends CPTemplate implements CPBarButtonProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListTemplate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPListTemplate allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("backButton")
    public native CPBarButton backButton();

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

    /**
     * The list template's delegate is informed of list selection events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPListTemplateDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPListTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPListTemplate initWithCoder(NSCoder coder);

    /**
     * Initialize a list template with one or more sections of items and an optional title.
     */
    @Generated
    @Selector("initWithTitle:sections:")
    public native CPListTemplate initWithTitleSections(String title, NSArray<? extends CPListSection> sections);

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
    @Selector("leadingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    @Generated
    @Owned
    @Selector("new")
    public static native CPListTemplate new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The sections displayed in this list.
     */
    @Generated
    @Selector("sections")
    public native NSArray<? extends CPListSection> sections();

    @Generated
    @Selector("setBackButton:")
    public native void setBackButton(CPBarButton value);

    /**
     * The list template's delegate is informed of list selection events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CPListTemplateDelegate value);

    /**
     * The list template's delegate is informed of list selection events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CPListTemplateDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<? extends CPBarButton> value);

    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(NSArray<? extends CPBarButton> value);

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
     * Title shown in the navigation bar while this template is visible.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("trailingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> trailingNavigationBarButtons();

    /**
     * Update the list of sections displayed in this list template, reloading
     * the table view displaying this list.
     */
    @Generated
    @Selector("updateSections:")
    public native void updateSections(NSArray<? extends CPListSection> sections);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An optional array of strings, ordered from most to least preferred.
     * The variant strings should be provided as localized, displayable content.
     * The system will select the first variant that fits the available space.
     * <p>
     * If the list template does not contain any items (itemCount == 0), then
     * the template will display an empty view with a title and subtitle to indicate
     * that the template has no list items.
     * <p>
     * If the list template is updated to contain items, the empty view will be automatically
     * removed.
     */
    @Generated
    @Selector("emptyViewSubtitleVariants")
    public native NSArray<String> emptyViewSubtitleVariants();

    /**
     * An optional array of strings, ordered from most to least preferred.
     * The variant strings should be provided as localized, displayable content.
     * The system will select the first variant that fits the available space.
     * <p>
     * If the list template does not contain any items (itemCount == 0), then
     * the template will display an empty view with a title and subtitle to indicate
     * that the template has no list items.
     * <p>
     * If the list template is updated to contain items, the empty view will be automatically
     * removed.
     */
    @Generated
    @Selector("emptyViewTitleVariants")
    public native NSArray<String> emptyViewTitleVariants();

    /**
     * Return an @c NSIndexPath for the specified item, if it exists in any section
     * in this list template, or nil if not found.
     */
    @Generated
    @Selector("indexPathForItem:")
    public native NSIndexPath indexPathForItem(@Mapped(ObjCObjectMapper.class) CPListTemplateItem item);

    /**
     * The number of items currently displayed in this list template, across all sections.
     */
    @Generated
    @Selector("itemCount")
    @NUInt
    public native long itemCount();

    /**
     * The maximum number of items, across all sections, that may appear in a @c CPListTemplate.
     * <p>
     * [@note] Your list template will display the first @c maximumItemCount items, across all sections.
     * Any items or sections beyond that limit will be trimmed.
     */
    @Generated
    @Selector("maximumItemCount")
    @NUInt
    public static native long maximumItemCount();

    /**
     * The maximum number of sections that may appear in a @c CPListTemplate.
     * <p>
     * [@note] Your list template will display the first @c maximumSectionCount sections.
     * Any sections beyond that limit will be trimmed.
     */
    @Generated
    @Selector("maximumSectionCount")
    @NUInt
    public static native long maximumSectionCount();

    /**
     * The number of sections currently displayed in this list template.
     */
    @Generated
    @Selector("sectionCount")
    @NUInt
    public native long sectionCount();

    /**
     * An optional array of strings, ordered from most to least preferred.
     * The variant strings should be provided as localized, displayable content.
     * The system will select the first variant that fits the available space.
     * <p>
     * If the list template does not contain any items (itemCount == 0), then
     * the template will display an empty view with a title and subtitle to indicate
     * that the template has no list items.
     * <p>
     * If the list template is updated to contain items, the empty view will be automatically
     * removed.
     */
    @Generated
    @Selector("setEmptyViewSubtitleVariants:")
    public native void setEmptyViewSubtitleVariants(NSArray<String> value);

    /**
     * An optional array of strings, ordered from most to least preferred.
     * The variant strings should be provided as localized, displayable content.
     * The system will select the first variant that fits the available space.
     * <p>
     * If the list template does not contain any items (itemCount == 0), then
     * the template will display an empty view with a title and subtitle to indicate
     * that the template has no list items.
     * <p>
     * If the list template is updated to contain items, the empty view will be automatically
     * removed.
     */
    @Generated
    @Selector("setEmptyViewTitleVariants:")
    public native void setEmptyViewTitleVariants(NSArray<String> value);

    /**
     * The configuration of the Assistant Cell.
     * <p>
     * Assigning to this property will dynamically update the List Template to reflect the visibility, position, and intent identifier of the Assistant Cell.
     * <p>
     * [@note] The Assistant Cell is only supported by CarPlay Audio and Communication Apps.
     * <p>
     * Unlike @c CPListItem, your application will not receive a callback when the user selects the cell.
     * Instead, configure an Intents app extention to receive user requests from SiriKit, in order to turn the requests into an
     * app-specific actions.
     */
    @Generated
    @Selector("assistantCellConfiguration")
    public native CPAssistantCellConfiguration assistantCellConfiguration();

    /**
     * Initialize a list template with one or more sections of items, an optional title, and configuration for the assistant cell via a @c CPAssistantCellConfiguration object.
     * <p>
     * [@note] The Assistant Cell is only supported by CarPlay Audio and Communication Apps.
     * <p>
     * Unlike @c CPListItem, your application will not receive a callback when the user selects the cell.
     * Instead, configure an Intents app extention to receive user requests from SiriKit, in order to turn the requests into an
     * app-specific actions.
     */
    @Generated
    @Selector("initWithTitle:sections:assistantCellConfiguration:")
    public native CPListTemplate initWithTitleSectionsAssistantCellConfiguration(String title,
            NSArray<? extends CPListSection> sections, CPAssistantCellConfiguration assistantCellConfiguration);

    /**
     * The configuration of the Assistant Cell.
     * <p>
     * Assigning to this property will dynamically update the List Template to reflect the visibility, position, and intent identifier of the Assistant Cell.
     * <p>
     * [@note] The Assistant Cell is only supported by CarPlay Audio and Communication Apps.
     * <p>
     * Unlike @c CPListItem, your application will not receive a callback when the user selects the cell.
     * Instead, configure an Intents app extention to receive user requests from SiriKit, in order to turn the requests into an
     * app-specific actions.
     */
    @Generated
    @Selector("setAssistantCellConfiguration:")
    public native void setAssistantCellConfiguration(CPAssistantCellConfiguration value);
}
