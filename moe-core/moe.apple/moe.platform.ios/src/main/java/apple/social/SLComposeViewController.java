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

package apple.social;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Although you may perform requests on behalf of the user, you cannot append
 * text, images, or URLs without the user's knowledge. Hence, you can set the
 * initial text and other content before presenting the view to the user, but
 * cannot change the content after the user views it. All of the methods used
 * to set the content return a Boolean value. The methods return NO if the
 * content doesn't fit or if the view was already presented to the user and the
 * content can no longer be changed.
 */
@Generated
@Library("Social")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SLComposeViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected SLComposeViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SLComposeViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SLComposeViewController allocWithZone(VoidPtr zone);

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
    @Selector("composeViewControllerForServiceType:")
    public static native SLComposeViewController composeViewControllerForServiceType(String serviceType);

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
    @Selector("isAvailableForServiceType:")
    public static native boolean isAvailableForServiceType(String serviceType);

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
    public static native SLComposeViewController new_objc();

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
     * Adds an image to the post. Returns NO if the additional image will not fit
     * within the character space currently available, or if the sheet has already
     * been presented to the user.
     */
    @Generated
    @Selector("addImage:")
    public native boolean addImage(UIImage image);

    /**
     * Adds a URL to the post. Returns NO if the additional URL will not fit
     * within the character space currently available, or if the sheet has already
     * been presented to the user.
     */
    @Generated
    @Selector("addURL:")
    public native boolean addURL(NSURL url);

    /**
     * Specify a block to be called when the user is finished. This block is not guaranteed
     * to be called on any particular thread. It is cleared after being called.
     */
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    @Generated
    @Selector("init")
    public native SLComposeViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native SLComposeViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native SLComposeViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Removes all images from the post. Returns NO and does not perform an operation
     * if the sheet has already been presented to the user.
     */
    @Generated
    @Selector("removeAllImages")
    public native boolean removeAllImages();

    /**
     * Removes all URLs from the post. Returns NO and does not perform an operation
     * if the sheet has already been presented to the user.
     */
    @Generated
    @Selector("removeAllURLs")
    public native boolean removeAllURLs();

    @Generated
    @Selector("serviceType")
    public native String serviceType();

    /**
     * Specify a block to be called when the user is finished. This block is not guaranteed
     * to be called on any particular thread. It is cleared after being called.
     */
    @Generated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    /**
     * Sets the initial text to be posted. Returns NO if the sheet has already been
     * presented to the user. On iOS 6.x, this returns NO if the specified text
     * will not fit within the character space currently available; on iOS 7.0 and
     * later, you may supply text with a length greater than the service supports,
     * and the sheet will allow the user to edit it accordingly.
     */
    @Generated
    @Selector("setInitialText:")
    public native boolean setInitialText(String text);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(@NInt long result);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(@NInt long result);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
