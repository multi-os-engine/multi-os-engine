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
import apple.usernotifications.UNNotification;
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKInterfaceController alloc();

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
    @Selector("openParentApplication:reply:")
    public static native boolean openParentApplicationReply(NSDictionary<?, ?> userInfo,
            @ObjCBlock(name = "call_openParentApplicationReply") Block_openParentApplicationReply reply);

    @Generated
    @Selector("reloadRootControllersWithNames:contexts:")
    public static native void reloadRootControllersWithNamesContexts(NSArray<String> names, NSArray<?> contexts);

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

    @Generated
    @Selector("addMenuItemWithImage:title:action:")
    public native void addMenuItemWithImageTitleAction(UIImage image, String title, SEL action);

    @Generated
    @Selector("addMenuItemWithImageNamed:title:action:")
    public native void addMenuItemWithImageNamedTitleAction(String imageName, String title, SEL action);

    @Generated
    @Selector("addMenuItemWithItemIcon:title:action:")
    public native void addMenuItemWithItemIconTitleAction(@NInt long itemIcon, String title, SEL action);

    @Generated
    @Selector("awakeWithContext:")
    public native void awakeWithContext(@Mapped(ObjCObjectMapper.class) Object context);

    @Generated
    @Selector("becomeCurrentPage")
    public native void becomeCurrentPage();

    @Generated
    @Selector("clearAllMenuItems")
    public native void clearAllMenuItems();

    @Generated
    @Selector("contentFrame")
    @ByValue
    public native CGRect contentFrame();

    @Generated
    @Selector("contextForSegueWithIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contextForSegueWithIdentifier(String segueIdentifier);

    @Generated
    @Selector("contextForSegueWithIdentifier:inTable:rowIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contextForSegueWithIdentifierInTableRowIndex(String segueIdentifier, WKInterfaceTable table,
            @NInt long rowIndex);

    @Generated
    @Selector("contextsForSegueWithIdentifier:")
    public native NSArray<?> contextsForSegueWithIdentifier(String segueIdentifier);

    @Generated
    @Selector("contextsForSegueWithIdentifier:inTable:rowIndex:")
    public native NSArray<?> contextsForSegueWithIdentifierInTableRowIndex(String segueIdentifier,
            WKInterfaceTable table, @NInt long rowIndex);

    @Generated
    @Selector("didDeactivate")
    public native void didDeactivate();

    @Generated
    @Selector("dismissController")
    public native void dismissController();

    @Generated
    @Selector("dismissTextInputController")
    public native void dismissTextInputController();

    @Generated
    @Selector("handleActionWithIdentifier:forLocalNotification:")
    public native void handleActionWithIdentifierForLocalNotification(String identifier,
            UILocalNotification localNotification);

    @Generated
    @Selector("handleActionWithIdentifier:forNotification:")
    public native void handleActionWithIdentifierForNotification(String identifier, UNNotification notification);

    @Generated
    @Selector("handleActionWithIdentifier:forRemoteNotification:")
    public native void handleActionWithIdentifierForRemoteNotification(String identifier,
            NSDictionary<?, ?> remoteNotification);

    @Generated
    @Selector("handleUserActivity:")
    public native void handleUserActivity(NSDictionary<?, ?> userInfo);

    @Generated
    @Selector("init")
    public native WKInterfaceController init();

    @Generated
    @Selector("invalidateUserActivity")
    public native void invalidateUserActivity();

    @Generated
    @Selector("popController")
    public native void popController();

    @Generated
    @Selector("popToRootController")
    public native void popToRootController();

    @Generated
    @Selector("presentControllerWithName:context:")
    public native void presentControllerWithNameContext(String name, @Mapped(ObjCObjectMapper.class) Object context);

    @Generated
    @Selector("presentControllerWithNames:contexts:")
    public native void presentControllerWithNamesContexts(NSArray<String> names, NSArray<?> contexts);

    @Generated
    @Selector("presentTextInputControllerWithSuggestions:allowedInputMode:completion:")
    public native void presentTextInputControllerWithSuggestionsAllowedInputModeCompletion(NSArray<String> suggestions,
            @NInt long inputMode,
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion") Block_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion completion);

    @Generated
    @Selector("presentTextInputControllerWithSuggestionsForLanguage:allowedInputMode:completion:")
    public native void presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion(
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0") Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_0 suggestionsHandler,
            @NInt long inputMode,
            @ObjCBlock(name = "call_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2") Block_presentTextInputControllerWithSuggestionsForLanguageAllowedInputModeCompletion_2 completion);

    @Generated
    @Selector("pushControllerWithName:context:")
    public native void pushControllerWithNameContext(String name, @Mapped(ObjCObjectMapper.class) Object context);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String title);

    @Generated
    @Selector("table:didSelectRowAtIndex:")
    public native void tableDidSelectRowAtIndex(WKInterfaceTable table, @NInt long rowIndex);

    @Generated
    @Selector("updateUserActivity:userInfo:webpageURL:")
    public native void updateUserActivityUserInfoWebpageURL(String type, NSDictionary<?, ?> userInfo, NSURL webpageURL);

    @Generated
    @Selector("willActivate")
    public native void willActivate();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openParentApplicationReply {
        @Generated
        void call_openParentApplicationReply(NSDictionary<?, ?> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion {
        @Generated
        void call_presentTextInputControllerWithSuggestionsAllowedInputModeCompletion(NSArray<?> arg0);
    }

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
    @Selector("beginGlanceUpdates")
    public native void beginGlanceUpdates();

    @Generated
    @Selector("endGlanceUpdates")
    public native void endGlanceUpdates();
}
