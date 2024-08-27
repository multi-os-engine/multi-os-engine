/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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
import apple.uikit.protocol.UINavigationItemRenameDelegate;
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UINavigationItem extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UINavigationItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UINavigationItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UINavigationItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UINavigationItem new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Bar button item to use for the back button when this item is the navigation bar's backItem.
     */
    @Nullable
    @Generated
    @Selector("backBarButtonItem")
    public native UIBarButtonItem backBarButtonItem();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * If YES, this navigation item will hide the back button when it's on top of the stack.
     */
    @Generated
    @Selector("hidesBackButton")
    public native boolean hidesBackButton();

    @Generated
    @Selector("init")
    public native UINavigationItem init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationItem initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTitle:")
    public native UINavigationItem initWithTitle(@NotNull String title);

    /**
     * Some navigation items want to display a custom left or right item when they're on top of the stack. A custom left
     * item replaces the regular back button unless you set leftItemsSupplementBackButton to YES
     */
    @Nullable
    @Generated
    @Selector("leftBarButtonItem")
    public native UIBarButtonItem leftBarButtonItem();

    /**
     * Use these properties to set multiple items in a navigation bar.
     * The older single properties (leftBarButtonItem and rightBarButtonItem) now refer to
     * the first item in the respective array of items.
     * 
     * NOTE: You'll achieve the best results if you use either the singular properties or
     * the plural properties consistently and don't try to mix them.
     * 
     * leftBarButtonItems are placed in the navigation bar left to right with the first
     * item in the list at the left outside edge and left aligned.
     * rightBarButtonItems are placed right to left with the first item in the list at
     * the right outside edge and right aligned.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("leftBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> leftBarButtonItems();

    /**
     * By default, the leftItemsSupplementBackButton property is NO. In this case,
     * the back button is not drawn and the left item or items replace it. If you
     * would like the left items to appear in addition to the back button (as opposed to instead of it)
     * set leftItemsSupplementBackButton to YES.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("leftItemsSupplementBackButton")
    public native boolean leftItemsSupplementBackButton();

    /**
     * Explanatory text to display above the navigation bar buttons.
     */
    @Nullable
    @Generated
    @Selector("prompt")
    public native String prompt();

    @Nullable
    @Generated
    @Selector("rightBarButtonItem")
    public native UIBarButtonItem rightBarButtonItem();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("rightBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> rightBarButtonItems();

    /**
     * Bar button item to use for the back button when this item is the navigation bar's backItem.
     */
    @Generated
    @Selector("setBackBarButtonItem:")
    public native void setBackBarButtonItem(@Nullable UIBarButtonItem value);

    /**
     * If YES, this navigation item will hide the back button when it's on top of the stack.
     */
    @Generated
    @Selector("setHidesBackButton:")
    public native void setHidesBackButton(boolean value);

    @Generated
    @Selector("setHidesBackButton:animated:")
    public native void setHidesBackButtonAnimated(boolean hidesBackButton, boolean animated);

    /**
     * Some navigation items want to display a custom left or right item when they're on top of the stack. A custom left
     * item replaces the regular back button unless you set leftItemsSupplementBackButton to YES
     */
    @Generated
    @Selector("setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(@Nullable UIBarButtonItem value);

    @Generated
    @Selector("setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItemAnimated(@Nullable UIBarButtonItem item, boolean animated);

    /**
     * Use these properties to set multiple items in a navigation bar.
     * The older single properties (leftBarButtonItem and rightBarButtonItem) now refer to
     * the first item in the respective array of items.
     * 
     * NOTE: You'll achieve the best results if you use either the singular properties or
     * the plural properties consistently and don't try to mix them.
     * 
     * leftBarButtonItems are placed in the navigation bar left to right with the first
     * item in the list at the left outside edge and left aligned.
     * rightBarButtonItems are placed right to left with the first item in the list at
     * the right outside edge and right aligned.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(@Nullable NSArray<? extends UIBarButtonItem> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItemsAnimated(@Nullable NSArray<? extends UIBarButtonItem> items,
            boolean animated);

    /**
     * By default, the leftItemsSupplementBackButton property is NO. In this case,
     * the back button is not drawn and the left item or items replace it. If you
     * would like the left items to appear in addition to the back button (as opposed to instead of it)
     * set leftItemsSupplementBackButton to YES.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean value);

    /**
     * Explanatory text to display above the navigation bar buttons.
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(@Nullable String value);

    @Generated
    @Selector("setRightBarButtonItem:")
    public native void setRightBarButtonItem(@Nullable UIBarButtonItem value);

    @Generated
    @Selector("setRightBarButtonItem:animated:")
    public native void setRightBarButtonItemAnimated(@Nullable UIBarButtonItem item, boolean animated);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setRightBarButtonItems:")
    public native void setRightBarButtonItems(@Nullable NSArray<? extends UIBarButtonItem> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setRightBarButtonItems:animated:")
    public native void setRightBarButtonItemsAnimated(@Nullable NSArray<? extends UIBarButtonItem> items,
            boolean animated);

    /**
     * Title when topmost on the stack. default is nil
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    /**
     * Custom view to use in lieu of a title. May be sized horizontally. Only used when item is topmost on the stack.
     */
    @Generated
    @Selector("setTitleView:")
    public native void setTitleView(@Nullable UIView value);

    /**
     * Title when topmost on the stack. default is nil
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Custom view to use in lieu of a title. May be sized horizontally. Only used when item is topmost on the stack.
     */
    @Nullable
    @Generated
    @Selector("titleView")
    public native UIView titleView();

    /**
     * If this property is true (the default), the searchController’s search bar will hide as the user scrolls in the
     * top view controller’s scroll view. If false, the search bar will remain visible and pinned underneath the
     * navigation bar.
     * Not appicable and ignored for UINavigationItemSearchBarPlacementInline
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("hidesSearchBarWhenScrolling")
    public native boolean hidesSearchBarWhenScrolling();

    /**
     * When UINavigationBar.prefersLargeTitles=YES, this property controls when the larger out-of-line title is
     * displayed. If prefersLargeTitles=NO, this property has no effect. The default value is Automatic.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("largeTitleDisplayMode")
    @NInt
    public native long largeTitleDisplayMode();

    /**
     * A view controller that will be shown inside of a navigation controller can assign a UISearchController to this
     * property to display the search controller’s search bar in its containing navigation controller’s navigation bar.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("searchController")
    public native UISearchController searchController();

    /**
     * If this property is true (the default), the searchController’s search bar will hide as the user scrolls in the
     * top view controller’s scroll view. If false, the search bar will remain visible and pinned underneath the
     * navigation bar.
     * Not appicable and ignored for UINavigationItemSearchBarPlacementInline
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setHidesSearchBarWhenScrolling:")
    public native void setHidesSearchBarWhenScrolling(boolean value);

    /**
     * When UINavigationBar.prefersLargeTitles=YES, this property controls when the larger out-of-line title is
     * displayed. If prefersLargeTitles=NO, this property has no effect. The default value is Automatic.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLargeTitleDisplayMode:")
    public native void setLargeTitleDisplayMode(@NInt long value);

    /**
     * A view controller that will be shown inside of a navigation controller can assign a UISearchController to this
     * property to display the search controller’s search bar in its containing navigation controller’s navigation bar.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSearchController:")
    public native void setSearchController(@Nullable UISearchController value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactAppearance. See
     * UINavigationBar.compactAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("compactAppearance")
    public native UINavigationBarAppearance compactAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's scrollEdgeAppearance. See
     * UINavigationBar.scrollEdgeAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UINavigationBarAppearance scrollEdgeAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactAppearance. See
     * UINavigationBar.compactAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCompactAppearance:")
    public native void setCompactAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's scrollEdgeAppearance. See
     * UINavigationBar.scrollEdgeAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's standardAppearance. See
     * UINavigationBar.standardAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's standardAppearance. See
     * UINavigationBar.standardAppearance for further details.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("standardAppearance")
    public native UINavigationBarAppearance standardAppearance();

    /**
     * Controls how the back button sources its title.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("backButtonDisplayMode")
    @NInt
    public native long backButtonDisplayMode();

    /**
     * Title to use when this item is the navigation bar's backItem. Default is nil. backBarButtonItem takes precedence
     * if both are specified.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("backButtonTitle")
    public native String backButtonTitle();

    /**
     * Controls how the back button sources its title.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackButtonDisplayMode:")
    public native void setBackButtonDisplayMode(@NInt long value);

    /**
     * Title to use when this item is the navigation bar's backItem. Default is nil. backBarButtonItem takes precedence
     * if both are specified.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setBackButtonTitle:")
    public native void setBackButtonTitle(@Nullable String value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactScrollEdgeAppearance. See
     * UINavigationBar.h for further details.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("compactScrollEdgeAppearance")
    public native UINavigationBarAppearance compactScrollEdgeAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactScrollEdgeAppearance. See
     * UINavigationBar.h for further details.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCompactScrollEdgeAppearance:")
    public native void setCompactScrollEdgeAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * Additional items to add to the overflow menu. Setting this property to a non-nil value will force the overflow
     * button to appear, regardless of if you provide any content in the element's callback. Items returned are
     * displayed directly in the presented menu.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("additionalOverflowItems")
    public native UIDeferredMenuElement additionalOverflowItems();

    /**
     * Replaces the back action for the navigation bar. if a back button is naturally present, this replaces only its
     * action, otherwise a back button will be synthesized with the image or title from the action.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("backAction")
    public native UIAction backAction();

    /**
     * Customizable UIBarButtonItemGroups that will be placed in the center region when the navigation bar is the
     * browser or editor modes. In navigation mode, these items will be placed in the overflow.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("centerItemGroups")
    public native NSArray<? extends UIBarButtonItemGroup> centerItemGroups();

    /**
     * Setting a non-nil customizationIdentifier enables customization and UIKit will automatically save & restore
     * customizations based on this identifier. The identifier must be unique within the scope of the application.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("customizationIdentifier")
    public native String customizationIdentifier();

    /**
     * When non-nil, UIKit will use the metadata provided to generate additional controls displayed from the title.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("documentProperties")
    public native UIDocumentProperties documentProperties();

    /**
     * UIBarButtonItemGroups to be displayed in the leading section of the navigation bar. Items set via this method
     * will replace items set via .leftBarButtonItem or .leftBarButtonItems.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("leadingItemGroups")
    public native NSArray<? extends UIBarButtonItemGroup> leadingItemGroups();

    /**
     * If the overflow button for this item is currently present, then this will return a non-nil item that can be used
     * as a presentation source (e.g. for popovers). Otherwise it will return nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("overflowPresentationSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPopoverPresentationControllerSourceItem overflowPresentationSource();

    /**
     * Set a group of items to be placed on the trailing edge of the bar, past the overflow & search items (if present).
     * If you wish to have more than 1 item, it is HIGHLY recommended to assign a representative item to the group to
     * avoid overflowing the bar as this group cannot move to the overflow.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("pinnedTrailingGroup")
    public native UIBarButtonItemGroup pinnedTrailingGroup();

    /**
     * The preferred search bar placement, when a search controller is assigned to this item.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preferredSearchBarPlacement")
    @NInt
    public native long preferredSearchBarPlacement();

    /**
     * When non-nil, enables the UINavigationBar to respond to the rename: action by providing an inline UI.
     * Setting this property to nil while a rename operation is in progress will cancel the operation immediately.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("renameDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UINavigationItemRenameDelegate renameDelegate();

    /**
     * The realized placement. Only valid if a search controller has been assigned to this item.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("searchBarPlacement")
    @NInt
    public native long searchBarPlacement();

    /**
     * Additional items to add to the overflow menu. Setting this property to a non-nil value will force the overflow
     * button to appear, regardless of if you provide any content in the element's callback. Items returned are
     * displayed directly in the presented menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAdditionalOverflowItems:")
    public native void setAdditionalOverflowItems(@Nullable UIDeferredMenuElement value);

    /**
     * Replaces the back action for the navigation bar. if a back button is naturally present, this replaces only its
     * action, otherwise a back button will be synthesized with the image or title from the action.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setBackAction:")
    public native void setBackAction(@Nullable UIAction value);

    /**
     * Customizable UIBarButtonItemGroups that will be placed in the center region when the navigation bar is the
     * browser or editor modes. In navigation mode, these items will be placed in the overflow.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCenterItemGroups:")
    public native void setCenterItemGroups(@NotNull NSArray<? extends UIBarButtonItemGroup> value);

    /**
     * Setting a non-nil customizationIdentifier enables customization and UIKit will automatically save & restore
     * customizations based on this identifier. The identifier must be unique within the scope of the application.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCustomizationIdentifier:")
    public native void setCustomizationIdentifier(@Nullable String value);

    /**
     * When non-nil, UIKit will use the metadata provided to generate additional controls displayed from the title.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDocumentProperties:")
    public native void setDocumentProperties(@Nullable UIDocumentProperties value);

    /**
     * UIBarButtonItemGroups to be displayed in the leading section of the navigation bar. Items set via this method
     * will replace items set via .leftBarButtonItem or .leftBarButtonItems.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setLeadingItemGroups:")
    public native void setLeadingItemGroups(@NotNull NSArray<? extends UIBarButtonItemGroup> value);

    /**
     * Set a group of items to be placed on the trailing edge of the bar, past the overflow & search items (if present).
     * If you wish to have more than 1 item, it is HIGHLY recommended to assign a representative item to the group to
     * avoid overflowing the bar as this group cannot move to the overflow.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPinnedTrailingGroup:")
    public native void setPinnedTrailingGroup(@Nullable UIBarButtonItemGroup value);

    /**
     * The preferred search bar placement, when a search controller is assigned to this item.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredSearchBarPlacement:")
    public native void setPreferredSearchBarPlacement(@NInt long value);

    /**
     * When non-nil, enables the UINavigationBar to respond to the rename: action by providing an inline UI.
     * Setting this property to nil while a rename operation is in progress will cancel the operation immediately.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRenameDelegate:")
    public native void setRenameDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UINavigationItemRenameDelegate value);

    /**
     * When non-nil, enables the UINavigationBar to respond to the rename: action by providing an inline UI.
     * Setting this property to nil while a rename operation is in progress will cancel the operation immediately.
     * 
     * API-Since: 16.0
     */
    @Generated
    public void setRenameDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UINavigationItemRenameDelegate value) {
        Object __old = renameDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setRenameDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Controls how content defined by this item is laid out in the navigation bar.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * When non-nil, UIKit will generate suggestedActions and call this block to generate a menu that is displayed from
     * the title.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTitleMenuProvider:")
    public native void setTitleMenuProvider(
            @Nullable @ObjCBlock(name = "call_setTitleMenuProvider") Block_setTitleMenuProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTitleMenuProvider {
        @Nullable
        @Generated
        UIMenu call_setTitleMenuProvider(@NotNull NSArray<? extends UIMenuElement> arg0);
    }

    /**
     * UIBarButtonItemGroups to be displayed in the trailing section of the navigation bar. Items set via this method
     * will replace items set via .rightBarButtonItem or .rightBarButtonItems.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTrailingItemGroups:")
    public native void setTrailingItemGroups(@NotNull NSArray<? extends UIBarButtonItemGroup> value);

    /**
     * Controls how content defined by this item is laid out in the navigation bar.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * When non-nil, UIKit will generate suggestedActions and call this block to generate a menu that is displayed from
     * the title.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("titleMenuProvider")
    @ObjCBlock(name = "call_titleMenuProvider_ret")
    public native Block_titleMenuProvider_ret titleMenuProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_titleMenuProvider_ret {
        @Nullable
        @Generated
        UIMenu call_titleMenuProvider_ret(@NotNull NSArray<? extends UIMenuElement> arg0);
    }

    /**
     * UIBarButtonItemGroups to be displayed in the trailing section of the navigation bar. Items set via this method
     * will replace items set via .rightBarButtonItem or .rightBarButtonItems.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("trailingItemGroups")
    public native NSArray<? extends UIBarButtonItemGroup> trailingItemGroups();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
