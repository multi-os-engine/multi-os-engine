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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIKeyCommand extends UICommand {
    static {
        NatJ.register();
    }

    @Generated
    protected UIKeyCommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIKeyCommand alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIKeyCommand allocWithZone(VoidPtr zone);

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

    /**
     * Creates an key command that will _not_ be discoverable in the UI.
     */
    @Generated
    @Selector("keyCommandWithInput:modifierFlags:action:")
    public static native UIKeyCommand keyCommandWithInputModifierFlagsAction(@NotNull String input,
            @NInt long modifierFlags, @NotNull SEL action);

    /**
     * Key Commands with a discoverabilityTitle _will_ be discoverable in the UI.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("keyCommandWithInput:modifierFlags:action:discoverabilityTitle:")
    public static native UIKeyCommand keyCommandWithInputModifierFlagsActionDiscoverabilityTitle(@NotNull String input,
            @NInt long modifierFlags, @NotNull SEL action, @NotNull String discoverabilityTitle);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIKeyCommand new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Elaborated title, if any.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("discoverabilityTitle")
    public native String discoverabilityTitle();

    @Generated
    @Selector("init")
    public native UIKeyCommand init();

    @Generated
    @Selector("initWithCoder:")
    public native UIKeyCommand initWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("input")
    public native String input();

    @Generated
    @Selector("modifierFlags")
    @NInt
    public native long modifierFlags();

    /**
     * Elaborated title, if any.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDiscoverabilityTitle:")
    public native void setDiscoverabilityTitle(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Action to take on choosing this command.
     */
    @Nullable
    @Generated
    @Selector("action")
    public native SEL action();

    /**
     * Alternates that differ in modifier flags, if any.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("alternates")
    public native NSArray<? extends UICommandAlternate> alternates();

    /**
     * Command attributes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("attributes")
    @NUInt
    public native long attributes();

    /**
     * Initializes a key command.
     * 
     * @param title         Short display title. This should be localized.
     * @param image         Image that can appear next to this command, if needed.
     * @param action        Action to take on choosing this command.
     * @param input         Keys that must be pressed to choose this command.
     * @param modifierFlags Bit mask of key modifier flags to choose this command.
     * @param propertyList  Property list object to distinguish commands, if needed.
     * @return A new key command.
     */
    @Generated
    @Selector("commandWithTitle:image:action:input:modifierFlags:propertyList:")
    public static native UIKeyCommand commandWithTitleImageActionInputModifierFlagsPropertyList(@NotNull String title,
            @Nullable UIImage image, @NotNull SEL action, @NotNull String input, @NInt long modifierFlags,
            @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList);

    /**
     * Initializes a key command with alternates.
     * 
     * @param title         Short display title. This should be localized.
     * @param image         Image that can appear next to this command, if needed.
     * @param action        Action to take on choosing this command.
     * @param input         Keys that must be pressed to choose this command.
     * @param modifierFlags Bit mask of key modifier flags to choose this command.
     * @param propertyList  Property list object to distinguish commands, if needed.
     * @param alternates    Alternates that differ in modifier flags.
     * @return A new key command.
     */
    @Generated
    @Selector("commandWithTitle:image:action:input:modifierFlags:propertyList:alternates:")
    public static native UIKeyCommand commandWithTitleImageActionInputModifierFlagsPropertyListAlternates(
            @NotNull String title, @Nullable UIImage image, @NotNull SEL action, @NotNull String input,
            @NInt long modifierFlags, @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList,
            @NotNull NSArray<? extends UICommandAlternate> alternates);

    @Generated
    @Selector("commandWithTitle:image:action:propertyList:")
    public static native UIKeyCommand commandWithTitleImageActionPropertyList(@NotNull String title,
            @Nullable UIImage image, @NotNull SEL action,
            @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList);

    @Generated
    @Selector("commandWithTitle:image:action:propertyList:alternates:")
    public static native UIKeyCommand commandWithTitleImageActionPropertyListAlternates(@NotNull String title,
            @Nullable UIImage image, @NotNull SEL action, @Nullable @Mapped(ObjCObjectMapper.class) Object propertyList,
            @NotNull NSArray<? extends UICommandAlternate> alternates);

    /**
     * Image that can appear next to this command.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * Property list object to distinguish commands, if needed.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();

    /**
     * Command attributes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(@NUInt long value);

    /**
     * Image that can appear next to this command.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * State that can appear next to this command.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setState:")
    public native void setState(@NInt long value);

    /**
     * Short display title.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    /**
     * State that can appear next to this command.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * Short display title.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Suppose the system detects a given key command that is not reachable in the current keyboard layout; it will
     * localize the key command to something reachable. By setting this property to NO, you will opt-out this menu item
     * from the system-provided localization. YES by default for apps linked against 15.0 and later SDK.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsAutomaticLocalization")
    public native boolean allowsAutomaticLocalization();

    /**
     * Suppose the system detects a given key command with the following input string [ ] { } ( ) < > ← → in a
     * right-to-left user interface environment (UIUserInterfaceLayoutDirectionRightToLeft); in that case, the system
     * will automatically mirror the key command. For example, a pair of key commands with input { and } will be
     * localized to } and { in a right-to-left user interface. By setting this property to NO, you will opt-out this key
     * command of automatically mirroring in RTL. It would be best only to do this if your action will result in some
     * sort of directional change in the UI, e.g. a segmented control for text alignment or a D-pad in a game. YES by
     * default for apps linked against 15.0 and later SDK.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsAutomaticMirroring")
    public native boolean allowsAutomaticMirroring();

    /**
     * Suppose the system detects a given key command that is not reachable in the current keyboard layout; it will
     * localize the key command to something reachable. By setting this property to NO, you will opt-out this menu item
     * from the system-provided localization. YES by default for apps linked against 15.0 and later SDK.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsAutomaticLocalization:")
    public native void setAllowsAutomaticLocalization(boolean value);

    /**
     * Suppose the system detects a given key command with the following input string [ ] { } ( ) < > ← → in a
     * right-to-left user interface environment (UIUserInterfaceLayoutDirectionRightToLeft); in that case, the system
     * will automatically mirror the key command. For example, a pair of key commands with input { and } will be
     * localized to } and { in a right-to-left user interface. By setting this property to NO, you will opt-out this key
     * command of automatically mirroring in RTL. It would be best only to do this if your action will result in some
     * sort of directional change in the UI, e.g. a segmented control for text alignment or a D-pad in a game. YES by
     * default for apps linked against 15.0 and later SDK.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsAutomaticMirroring:")
    public native void setAllowsAutomaticMirroring(boolean value);

    /**
     * Indicates whether the key command should execute if it conflicts with focus or text-editing system commands,
     * defaults to @c NO
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setWantsPriorityOverSystemBehavior:")
    public native void setWantsPriorityOverSystemBehavior(boolean value);

    /**
     * Indicates whether the key command should execute if it conflicts with focus or text-editing system commands,
     * defaults to @c NO
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("wantsPriorityOverSystemBehavior")
    public native boolean wantsPriorityOverSystemBehavior();
}
