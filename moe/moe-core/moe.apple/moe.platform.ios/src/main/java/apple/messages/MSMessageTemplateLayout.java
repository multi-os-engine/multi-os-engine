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

package apple.messages;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MSMessageTemplateLayout
 * 
 * The MSMessageTemplateLayout encapsulates properties used in the construction of UI
 * representing a message using the default message layout template.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Messages")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MSMessageTemplateLayout extends MSMessageLayout {
    static {
        NatJ.register();
    }

    @Generated
    protected MSMessageTemplateLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MSMessageTemplateLayout alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MSMessageTemplateLayout allocWithZone(VoidPtr zone);

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
    public static native MSMessageTemplateLayout new_objc();

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
     * [@property] caption
     * 
     * Text to be used as a caption related to the message content.
     */
    @Nullable
    @Generated
    @Selector("caption")
    public native String caption();

    /**
     * [@property] image
     * 
     * A UIImage object used to construct the message representation in the conversation transcript.
     * 
     * When this property and the mediaURL property are both set, the mediaURL
     * property will be ignored.
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * [@property] imageSubtitle
     * 
     * Subtitle text associated with the image or media .
     */
    @Nullable
    @Generated
    @Selector("imageSubtitle")
    public native String imageSubtitle();

    /**
     * [@property] imageTitle
     * 
     * Title text associated with the image or media .
     */
    @Nullable
    @Generated
    @Selector("imageTitle")
    public native String imageTitle();

    @Generated
    @Selector("init")
    public native MSMessageTemplateLayout init();

    /**
     * [@property] mediaFileURL
     * 
     * The URL to a media file used to construct the message representation in the conversation transcript.
     * 
     * This must be a file URL, the data contained in the file must conform to
     * kUTTypeImage or kUTTypeMovie. When image property and
     * this property are both set, then this property will be ignored.
     */
    @Nullable
    @Generated
    @Selector("mediaFileURL")
    public native NSURL mediaFileURL();

    /**
     * [@property] caption
     * 
     * Text to be used as a caption related to the message content.
     */
    @Generated
    @Selector("setCaption:")
    public native void setCaption(@Nullable String value);

    /**
     * [@property] image
     * 
     * A UIImage object used to construct the message representation in the conversation transcript.
     * 
     * When this property and the mediaURL property are both set, the mediaURL
     * property will be ignored.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * [@property] imageSubtitle
     * 
     * Subtitle text associated with the image or media .
     */
    @Generated
    @Selector("setImageSubtitle:")
    public native void setImageSubtitle(@Nullable String value);

    /**
     * [@property] imageTitle
     * 
     * Title text associated with the image or media .
     */
    @Generated
    @Selector("setImageTitle:")
    public native void setImageTitle(@Nullable String value);

    /**
     * [@property] mediaFileURL
     * 
     * The URL to a media file used to construct the message representation in the conversation transcript.
     * 
     * This must be a file URL, the data contained in the file must conform to
     * kUTTypeImage or kUTTypeMovie. When image property and
     * this property are both set, then this property will be ignored.
     */
    @Generated
    @Selector("setMediaFileURL:")
    public native void setMediaFileURL(@Nullable NSURL value);

    /**
     * [@property] subcaption
     * 
     * Text to be used as a subcaption related to the message content.
     */
    @Generated
    @Selector("setSubcaption:")
    public native void setSubcaption(@Nullable String value);

    /**
     * [@property] trailingCaption
     * 
     * Text to be drawn right aligned on the same line as the caption text.
     */
    @Generated
    @Selector("setTrailingCaption:")
    public native void setTrailingCaption(@Nullable String value);

    /**
     * [@property] trailingSubcaption
     * 
     * Text to be drawn right aligned on the same line as the subcaption text.
     */
    @Generated
    @Selector("setTrailingSubcaption:")
    public native void setTrailingSubcaption(@Nullable String value);

    /**
     * [@property] subcaption
     * 
     * Text to be used as a subcaption related to the message content.
     */
    @Nullable
    @Generated
    @Selector("subcaption")
    public native String subcaption();

    /**
     * [@property] trailingCaption
     * 
     * Text to be drawn right aligned on the same line as the caption text.
     */
    @Nullable
    @Generated
    @Selector("trailingCaption")
    public native String trailingCaption();

    /**
     * [@property] trailingSubcaption
     * 
     * Text to be drawn right aligned on the same line as the subcaption text.
     */
    @Nullable
    @Generated
    @Selector("trailingSubcaption")
    public native String trailingSubcaption();
}
