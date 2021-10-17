package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPListTemplateItem;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@c] CPMessageListItem is a special variant of a list item for use in a @c CPListTemplate.
 * Unlike @c CPListItem, your application will not receive a callback when the user
 * selects a @c CPMessageListItem in your list template. Instead, Siri will be invoked
 * using the parameters you specify in your message item and the user will continue a
 * message compose, read, or reply flow through Siri.
 * <p>
 * There are two modes of operation for @c CPMessageListItem:
 * <p>
 * To represent an existing conversation with one or more recipients, use the @c CPMessageListItem
 * initializer that accepts a conversation identifier. This identifier is not directly displayed
 * to the user; rather, it should be a value meaningful to your app to identify the conversation.
 * <p>
 * To represent a contact or person entity, use the @c CPMessageListItem initializer that
 * accepts a full name and phone/email. When the user selects this item, Siri will perform
 * a message compose flow.
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPMessageListItem extends NSObject implements CPListTemplateItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CPMessageListItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPMessageListItem alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPMessageListItem allocWithZone(VoidPtr zone);

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
    @Selector("conversationIdentifier")
    public native String conversationIdentifier();

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
    @Selector("init")
    public native CPMessageListItem init();

    /**
     * Initialize a @c CPMessageListItem for use in a @c CPListTemplate.
     * <p>
     * [@note] The maximum image size is CPMaximumMessageItemImageSize. If you supply a larger image,
     * it will be scaled down to this size.
     *
     * @param conversationIdentifier A value meaningful to your app to identify this conversation.
     *                               This identifier is not directly displayed to the user; rather, when the user selects this list item,
     *                               SiriKit will pass this identifier back to your app for your own use.
     * @param text                   This is the main text label displayed to the user as well as spoken by
     *                               Siri when the user selects this list item.
     * @param leadingConfiguration   A set of configuration options for the leading side of the list item.
     * @param trailingConfiguration  A set of configuration options for the trailing side of the list item.
     * @param detailText             Any additional text displayed underneath the @c conversationName.
     * @param trailingText           Any additional text displayed along the trailing side of the cell.
     */
    @Generated
    @Selector("initWithConversationIdentifier:text:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    public native CPMessageListItem initWithConversationIdentifierTextLeadingConfigurationTrailingConfigurationDetailTextTrailingText(
            String conversationIdentifier, String text, CPMessageListItemLeadingConfiguration leadingConfiguration,
            CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText);

    /**
     * Initialize a @c CPMessageListItem for use in a @c CPListTemplate.
     * <p>
     * [@note] The maximum image size is CPMaximumMessageItemImageSize. If you supply a larger image,
     * it will be scaled down to this size.
     *
     * @param fullName              The full name of the contact entity represented by this list item. This text
     *                              will be displayed as the main text label in the cell and will be spoken by Siri.
     * @param phoneOrEmailAddress   A phone or email address for this contact entity that can be used
     *                              to compose a message.
     * @param leadingConfiguration  A set of configuration options for the leading side of the list item.
     * @param trailingConfiguration A set of configuration options for the trailing side of the list item.
     * @param detailText            Any additional text displayed underneath the @c conversationName.
     * @param trailingText          Any additional text displayed along the trailing side of the cell.
     */
    @Generated
    @Selector("initWithFullName:phoneOrEmailAddress:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    public native CPMessageListItem initWithFullNamePhoneOrEmailAddressLeadingConfigurationTrailingConfigurationDetailTextTrailingText(
            String fullName, String phoneOrEmailAddress, CPMessageListItemLeadingConfiguration leadingConfiguration,
            CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText);

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
    @Selector("leadingConfiguration")
    public native CPMessageListItemLeadingConfiguration leadingConfiguration();

    @Generated
    @Owned
    @Selector("new")
    public static native CPMessageListItem new_objc();

    @Generated
    @Selector("phoneOrEmailAddress")
    public native String phoneOrEmailAddress();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setConversationIdentifier:")
    public native void setConversationIdentifier(String value);

    @Generated
    @Selector("setDetailText:")
    public native void setDetailText(String value);

    @Generated
    @Selector("setLeadingConfiguration:")
    public native void setLeadingConfiguration(CPMessageListItemLeadingConfiguration value);

    @Generated
    @Selector("setPhoneOrEmailAddress:")
    public native void setPhoneOrEmailAddress(String value);

    /**
     * To update the @c CPMessageListItem, assign to any of these properties. If displayed in a
     * list template, the list item will be automatically reloaded.
     */
    @Generated
    @Selector("setText:")
    public native void setText(String value);

    @Generated
    @Selector("setTrailingConfiguration:")
    public native void setTrailingConfiguration(CPMessageListItemTrailingConfiguration value);

    @Generated
    @Selector("setTrailingText:")
    public native void setTrailingText(String value);

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

    @Generated
    @Selector("trailingConfiguration")
    public native CPMessageListItemTrailingConfiguration trailingConfiguration();

    @Generated
    @Selector("trailingText")
    public native String trailingText();

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
