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

package apple.safariservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.safariservices.protocol.SFSafariViewControllerDelegate;
import apple.uikit.UIColor;
import apple.uikit.UIViewController;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SFSafariViewController
 * A view controller for displaying web content in a Safari-like interface with some of Safari’s features.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFSafariViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected SFSafariViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFSafariViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFSafariViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native SFSafariViewController new_objc();

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

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SFSafariViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native SFSafariViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native SFSafariViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native SFSafariViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Returns a view controller that loads a URL.
     * 
     * @param URL the initial URL to navigate to. Only supports initial URLs with http:// or https:// schemes.
     */
    @Generated
    @Selector("initWithURL:")
    public native SFSafariViewController initWithURL(@NotNull NSURL URL);

    /**
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("initWithURL:entersReaderIfAvailable:")
    public native SFSafariViewController initWithURLEntersReaderIfAvailable(@NotNull NSURL URL,
            boolean entersReaderIfAvailable);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("preferredBarTintColor")
    public native UIColor preferredBarTintColor();

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("preferredControlTintColor")
    public native UIColor preferredControlTintColor();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) SFSafariViewControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SFSafariViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPreferredBarTintColor:")
    public native void setPreferredBarTintColor(@Nullable UIColor value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPreferredControlTintColor:")
    public native void setPreferredControlTintColor(@Nullable UIColor value);

    /**
     * A copy of the configuration with which the view controller was
     * initialized.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("configuration")
    public native SFSafariViewControllerConfiguration configuration();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("dismissButtonStyle")
    @NInt
    public native long dismissButtonStyle();

    /**
     * Returns a view controller that loads a URL.
     * 
     * This is a designated initializer. You can use
     * [@link] -initWithURL: @/link to initialize an instance with the default configuration. Mutating the configuration
     * after invoking the initializer has no effect on the view controller.
     * 
     * API-Since: 11.0
     * 
     * @param URL           the initial URL to navigate to. Only supports initial URLs with http:// or https:// schemes.
     * @param configuration the configuration for the new view controller.
     */
    @Generated
    @Selector("initWithURL:configuration:")
    public native SFSafariViewController initWithURLConfiguration(@NotNull NSURL URL,
            @NotNull SFSafariViewControllerConfiguration configuration);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDismissButtonStyle:")
    public native void setDismissButtonStyle(@NInt long value);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("prewarmConnectionsToURLs:")
    public static native SFSafariViewControllerPrewarmingToken prewarmConnectionsToURLs(
            @NotNull NSArray<? extends NSURL> URLs);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
