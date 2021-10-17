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
    @Generated
    @Selector("backBarButtonItem")
    public native UIBarButtonItem backBarButtonItem();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

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
    public native UINavigationItem initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithTitle:")
    public native UINavigationItem initWithTitle(String title);

    /**
     * Some navigation items want to display a custom left or right item when they're on top of the stack. A custom left item replaces the regular back button unless you set leftItemsSupplementBackButton to YES
     */
    @Generated
    @Selector("leftBarButtonItem")
    public native UIBarButtonItem leftBarButtonItem();

    /**
     * Use these properties to set multiple items in a navigation bar.
     * The older single properties (leftBarButtonItem and rightBarButtonItem) now refer to
     * the first item in the respective array of items.
     * <p>
     * NOTE: You'll achieve the best results if you use either the singular properties or
     * the plural properties consistently and don't try to mix them.
     * <p>
     * leftBarButtonItems are placed in the navigation bar left to right with the first
     * item in the list at the left outside edge and left aligned.
     * rightBarButtonItems are placed right to left with the first item in the list at
     * the right outside edge and right aligned.
     */
    @Generated
    @Selector("leftBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> leftBarButtonItems();

    /**
     * By default, the leftItemsSupplementBackButton property is NO. In this case,
     * the back button is not drawn and the left item or items replace it. If you
     * would like the left items to appear in addition to the back button (as opposed to instead of it)
     * set leftItemsSupplementBackButton to YES.
     */
    @Generated
    @Selector("leftItemsSupplementBackButton")
    public native boolean leftItemsSupplementBackButton();

    /**
     * Explanatory text to display above the navigation bar buttons.
     */
    @Generated
    @Selector("prompt")
    public native String prompt();

    @Generated
    @Selector("rightBarButtonItem")
    public native UIBarButtonItem rightBarButtonItem();

    @Generated
    @Selector("rightBarButtonItems")
    public native NSArray<? extends UIBarButtonItem> rightBarButtonItems();

    /**
     * Bar button item to use for the back button when this item is the navigation bar's backItem.
     */
    @Generated
    @Selector("setBackBarButtonItem:")
    public native void setBackBarButtonItem(UIBarButtonItem value);

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
     * Some navigation items want to display a custom left or right item when they're on top of the stack. A custom left item replaces the regular back button unless you set leftItemsSupplementBackButton to YES
     */
    @Generated
    @Selector("setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(UIBarButtonItem value);

    @Generated
    @Selector("setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    /**
     * Use these properties to set multiple items in a navigation bar.
     * The older single properties (leftBarButtonItem and rightBarButtonItem) now refer to
     * the first item in the respective array of items.
     * <p>
     * NOTE: You'll achieve the best results if you use either the singular properties or
     * the plural properties consistently and don't try to mix them.
     * <p>
     * leftBarButtonItems are placed in the navigation bar left to right with the first
     * item in the list at the left outside edge and left aligned.
     * rightBarButtonItems are placed right to left with the first item in the list at
     * the right outside edge and right aligned.
     */
    @Generated
    @Selector("setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    @Generated
    @Selector("setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItemsAnimated(NSArray<? extends UIBarButtonItem> items, boolean animated);

    /**
     * By default, the leftItemsSupplementBackButton property is NO. In this case,
     * the back button is not drawn and the left item or items replace it. If you
     * would like the left items to appear in addition to the back button (as opposed to instead of it)
     * set leftItemsSupplementBackButton to YES.
     */
    @Generated
    @Selector("setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean value);

    /**
     * Explanatory text to display above the navigation bar buttons.
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(String value);

    @Generated
    @Selector("setRightBarButtonItem:")
    public native void setRightBarButtonItem(UIBarButtonItem value);

    @Generated
    @Selector("setRightBarButtonItem:animated:")
    public native void setRightBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    @Generated
    @Selector("setRightBarButtonItems:")
    public native void setRightBarButtonItems(NSArray<? extends UIBarButtonItem> value);

    @Generated
    @Selector("setRightBarButtonItems:animated:")
    public native void setRightBarButtonItemsAnimated(NSArray<? extends UIBarButtonItem> items, boolean animated);

    /**
     * Title when topmost on the stack. default is nil
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * Custom view to use in lieu of a title. May be sized horizontally. Only used when item is topmost on the stack.
     */
    @Generated
    @Selector("setTitleView:")
    public native void setTitleView(UIView value);

    /**
     * Title when topmost on the stack. default is nil
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Custom view to use in lieu of a title. May be sized horizontally. Only used when item is topmost on the stack.
     */
    @Generated
    @Selector("titleView")
    public native UIView titleView();

    /**
     * If this property is true (the default), the searchController’s search bar will hide as the user scrolls in the top view controller’s scroll view. If false, the search bar will remain visible and pinned underneath the navigation bar.
     */
    @Generated
    @Selector("hidesSearchBarWhenScrolling")
    public native boolean hidesSearchBarWhenScrolling();

    /**
     * When UINavigationBar.prefersLargeTitles=YES, this property controls when the larger out-of-line title is displayed. If prefersLargeTitles=NO, this property has no effect. The default value is Automatic.
     */
    @Generated
    @Selector("largeTitleDisplayMode")
    @NInt
    public native long largeTitleDisplayMode();

    /**
     * A view controller that will be shown inside of a navigation controller can assign a UISearchController to this property to display the search controller’s search bar in its containing navigation controller’s navigation bar.
     */
    @Generated
    @Selector("searchController")
    public native UISearchController searchController();

    /**
     * If this property is true (the default), the searchController’s search bar will hide as the user scrolls in the top view controller’s scroll view. If false, the search bar will remain visible and pinned underneath the navigation bar.
     */
    @Generated
    @Selector("setHidesSearchBarWhenScrolling:")
    public native void setHidesSearchBarWhenScrolling(boolean value);

    /**
     * When UINavigationBar.prefersLargeTitles=YES, this property controls when the larger out-of-line title is displayed. If prefersLargeTitles=NO, this property has no effect. The default value is Automatic.
     */
    @Generated
    @Selector("setLargeTitleDisplayMode:")
    public native void setLargeTitleDisplayMode(@NInt long value);

    /**
     * A view controller that will be shown inside of a navigation controller can assign a UISearchController to this property to display the search controller’s search bar in its containing navigation controller’s navigation bar.
     */
    @Generated
    @Selector("setSearchController:")
    public native void setSearchController(UISearchController value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactAppearance. See UINavigationBar.compactAppearance for further details.
     */
    @Generated
    @Selector("compactAppearance")
    public native UINavigationBarAppearance compactAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's scrollEdgeAppearance. See UINavigationBar.scrollEdgeAppearance for further details.
     */
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UINavigationBarAppearance scrollEdgeAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactAppearance. See UINavigationBar.compactAppearance for further details.
     */
    @Generated
    @Selector("setCompactAppearance:")
    public native void setCompactAppearance(UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's scrollEdgeAppearance. See UINavigationBar.scrollEdgeAppearance for further details.
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's standardAppearance. See UINavigationBar.standardAppearance for further details.
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(UINavigationBarAppearance value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's standardAppearance. See UINavigationBar.standardAppearance for further details.
     */
    @Generated
    @Selector("standardAppearance")
    public native UINavigationBarAppearance standardAppearance();

    /**
     * Controls how the back button sources its title.
     */
    @Generated
    @Selector("backButtonDisplayMode")
    @NInt
    public native long backButtonDisplayMode();

    /**
     * Title to use when this item is the navigation bar's backItem. Default is nil. backBarButtonItem takes precedence if both are specified.
     */
    @Generated
    @Selector("backButtonTitle")
    public native String backButtonTitle();

    /**
     * Controls how the back button sources its title.
     */
    @Generated
    @Selector("setBackButtonDisplayMode:")
    public native void setBackButtonDisplayMode(@NInt long value);

    /**
     * Title to use when this item is the navigation bar's backItem. Default is nil. backBarButtonItem takes precedence if both are specified.
     */
    @Generated
    @Selector("setBackButtonTitle:")
    public native void setBackButtonTitle(String value);

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactScrollEdgeAppearance. See UINavigationBar.h for further details.
     */
    @Generated
    @Selector("compactScrollEdgeAppearance")
    public native UINavigationBarAppearance compactScrollEdgeAppearance();

    /**
     * When set and this item is topmost, overrides the hosting navigation bar's compactScrollEdgeAppearance. See UINavigationBar.h for further details.
     */
    @Generated
    @Selector("setCompactScrollEdgeAppearance:")
    public native void setCompactScrollEdgeAppearance(UINavigationBarAppearance value);
}
