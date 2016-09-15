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

package apple.watchkit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
import apple.uikit.UILocalNotification;
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
@Library("WatchKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKInterfaceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKInterfaceController(Pointer peer) {
        super(peer);
    }

    /**
     * addMenuItemWithImage:title:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/addMenuItemWithImage:title:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMenuItemWithImage:title:action:")
    public native void addMenuItemWithImageTitleAction(UIImage image, String title, SEL action);

    /**
     * addMenuItemWithImageNamed:title:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/addMenuItemWithImageNamed:title:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMenuItemWithImageNamed:title:action:")
    public native void addMenuItemWithImageNamedTitleAction(String imageName, String title, SEL action);

    /**
     * addMenuItemWithItemIcon:title:action:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/addMenuItemWithItemIcon:title:action:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMenuItemWithItemIcon:title:action:")
    public native void addMenuItemWithItemIconTitleAction(@NInt long itemIcon, String title, SEL action);

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKInterfaceController alloc();

    /**
     * awakeWithContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/awakeWithContext:">iOS Dev Center</a>
     */
    @Generated
    @Selector("awakeWithContext:")
    public native void awakeWithContext(@Mapped(ObjCObjectMapper.class) Object context);

    /**
     * becomeCurrentPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/becomeCurrentPage">iOS Dev Center</a>
     */
    @Generated
    @Selector("becomeCurrentPage")
    public native void becomeCurrentPage();

    /**
     * clearAllMenuItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/clearAllMenuItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearAllMenuItems")
    public native void clearAllMenuItems();

    /**
     * contentFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instp/WKInterfaceController/contentFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentFrame")
    @ByValue
    public native CGRect contentFrame();

    /**
     * contextForSegueWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/contextForSegueWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextForSegueWithIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contextForSegueWithIdentifier(String segueIdentifier);

    /**
     * contextForSegueWithIdentifier:inTable:rowIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/contextForSegueWithIdentifier:inTable:rowIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextForSegueWithIdentifier:inTable:rowIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contextForSegueWithIdentifierInTableRowIndex(String segueIdentifier, WKInterfaceTable table,
            @NInt long rowIndex);

    /**
     * contextsForSegueWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/contextsForSegueWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextsForSegueWithIdentifier:")
    public native NSArray<?> contextsForSegueWithIdentifier(String segueIdentifier);

    /**
     * contextsForSegueWithIdentifier:inTable:rowIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/contextsForSegueWithIdentifier:inTable:rowIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contextsForSegueWithIdentifier:inTable:rowIndex:")
    public native NSArray<?> contextsForSegueWithIdentifierInTableRowIndex(String segueIdentifier,
            WKInterfaceTable table, @NInt long rowIndex);

    /**
     * didDeactivate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/didDeactivate">iOS Dev Center</a>
     */
    @Generated
    @Selector("didDeactivate")
    public native void didDeactivate();

    /**
     * dismissController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/dismissController">iOS Dev Center</a>
     */
    @Generated
    @Selector("dismissController")
    public native void dismissController();

    /**
     * dismissTextInputController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/dismissTextInputController">iOS Dev Center</a>
     */
    @Generated
    @Selector("dismissTextInputController")
    public native void dismissTextInputController();

    /**
     * handleActionWithIdentifier:forLocalNotification:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/handleActionWithIdentifier:forLocalNotification:">iOS Dev Center</a>
     */
    @Generated
    @Selector("handleActionWithIdentifier:forLocalNotification:")
    public native void handleActionWithIdentifierForLocalNotification(String identifier,
            UILocalNotification localNotification);

    /**
     * handleActionWithIdentifier:forRemoteNotification:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/handleActionWithIdentifier:forRemoteNotification:">iOS Dev Center</a>
     */
    @Generated
    @Selector("handleActionWithIdentifier:forRemoteNotification:")
    public native void handleActionWithIdentifierForRemoteNotification(String identifier,
            NSDictionary<?, ?> remoteNotification);

    /**
     * handleUserActivity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/handleUserActivity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("handleUserActivity:")
    public native void handleUserActivity(NSDictionary<?, ?> userInfo);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native WKInterfaceController init();

    /**
     * invalidateUserActivity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/invalidateUserActivity">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateUserActivity")
    public native void invalidateUserActivity();

    /**
     * openParentApplication:reply:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/clm/WKInterfaceController/openParentApplication:reply:">iOS Dev Center</a>
     */
    @Generated
    @Selector("openParentApplication:reply:")
    public static native boolean openParentApplicationReply(NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_openParentApplicationReply") Block_openParentApplicationReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openParentApplicationReply {
        @Generated
        void call_openParentApplicationReply(NSDictionary<?, ?> arg0, NSError arg1);
    }

    /**
     * popController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/popController">iOS Dev Center</a>
     */
    @Generated
    @Selector("popController")
    public native void popController();

    /**
     * popToRootController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/popToRootController">iOS Dev Center</a>
     */
    @Generated
    @Selector("popToRootController")
    public native void popToRootController();

    /**
     * presentControllerWithName:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/presentControllerWithName:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentControllerWithName:context:")
    public native void presentControllerWithNameContext(String name, @Mapped(ObjCObjectMapper.class) Object context);

    /**
     * presentControllerWithNames:contexts:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/presentControllerWithNames:contexts:">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentControllerWithNames:contexts:")
    public native void presentControllerWithNamesContexts(NSArray<String> names, NSArray<?> contexts);

    /**
     * presentTextInputControllerWithSuggestions:allowedInputMode:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/presentTextInputControllerWithSuggestions:allowedInputMode:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentTextInputControllerWithSuggestions:allowedInputMode:completion:")
    public native void presentTextInputControllerWithSuggestionsAllowedInputModeCompletion(NSArray<String> suggestions,
            @NInt long inputMode,
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion") Block_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion {
        @Generated
        void call_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion(NSArray<?> arg0);
    }

    /**
     * pushControllerWithName:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/pushControllerWithName:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pushControllerWithName:context:")
    public native void pushControllerWithNameContext(String name, @Mapped(ObjCObjectMapper.class) Object context);

    /**
     * reloadRootControllersWithNames:contexts:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/clm/WKInterfaceController/reloadRootControllersWithNames:contexts:">iOS Dev Center</a>
     */
    @Generated
    @Selector("reloadRootControllersWithNames:contexts:")
    public static native void reloadRootControllersWithNamesContexts(NSArray<String> names, NSArray<?> contexts);

    /**
     * setTitle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/setTitle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String title);

    /**
     * table:didSelectRowAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/table:didSelectRowAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("table:didSelectRowAtIndex:")
    public native void tableDidSelectRowAtIndex(WKInterfaceTable table, @NInt long rowIndex);

    /**
     * updateUserActivity:userInfo:webpageURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/updateUserActivity:userInfo:webpageURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateUserActivity:userInfo:webpageURL:")
    public native void updateUserActivityUserInfoWebpageURL(String type, NSDictionary<?, ?> userInfo, NSURL webpageURL);

    /**
     * willActivate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchKit/Reference/WKInterfaceController_class/index.html#//apple_ref/occ/instm/WKInterfaceController/willActivate">iOS Dev Center</a>
     */
    @Generated
    @Selector("willActivate")
    public native void willActivate();

    @Generated
    @Selector("presentTextInputControllerWithSuggestionsForLanguage:allowedInputMode:completion:")
    public native void presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion(
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0") Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0 suggestionsHandler,
            @NInt long inputMode,
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2") Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0 {
        @Generated
        NSArray<?> call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0(String arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2 {
        @Generated
        void call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2(NSArray<?> arg0);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
}
