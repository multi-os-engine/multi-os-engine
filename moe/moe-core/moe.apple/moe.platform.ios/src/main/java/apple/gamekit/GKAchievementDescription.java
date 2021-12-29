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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * GKAchievementDescription is a full description of the achievement as defined before app submission in App Store Connect.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKAchievementDescription extends NSObject implements NSCoding, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKAchievementDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKAchievementDescription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKAchievementDescription allocWithZone(VoidPtr zone);

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

    /**
     * The default image for any incomplete achievement
     */
    @Generated
    @Selector("incompleteAchievementImage")
    public static native UIImage incompleteAchievementImage();

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

    /**
     * Asynchronously load all achievement descriptions
     */
    @Generated
    @Selector("loadAchievementDescriptionsWithCompletionHandler:")
    public static native void loadAchievementDescriptionsWithCompletionHandler(
            @ObjCBlock(name = "call_loadAchievementDescriptionsWithCompletionHandler") Block_loadAchievementDescriptionsWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native GKAchievementDescription new_objc();

    /**
     * A placeholder image to be used for any completed achievement until the description image has loaded.
     */
    @Generated
    @Selector("placeholderCompletedAchievementImage")
    public static native UIImage placeholderCompletedAchievementImage();

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
     * The description for an unachieved achievement.
     */
    @Generated
    @Selector("achievedDescription")
    public native String achievedDescription();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The group identifier for the achievement, if one exists.
     */
    @Generated
    @Selector("groupIdentifier")
    public native String groupIdentifier();

    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * Image for completed achievement. Not valid until loadImage: has completed. Deprecated -- use loadImageWithCompletionHandler: instead.
     */
    @Generated
    @Deprecated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native GKAchievementDescription init();

    @Generated
    @Selector("initWithCoder:")
    public native GKAchievementDescription initWithCoder(NSCoder coder);

    /**
     * Whether or not the achievement should be listed or displayed if not yet unhidden by the game.
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * Whether or not the achievement will be reported by the game when the user earns it again. This allows the achievement to be used for challenges when the recipient has previously earned it.
     */
    @Generated
    @Selector("isReplayable")
    public native boolean isReplayable();

    /**
     * Asynchronously load the image. Error will be nil on success.
     */
    @Generated
    @Selector("loadImageWithCompletionHandler:")
    public native void loadImageWithCompletionHandler(
            @ObjCBlock(name = "call_loadImageWithCompletionHandler") Block_loadImageWithCompletionHandler completionHandler);

    /**
     * Maximum points available for completing this achievement.
     */
    @Generated
    @Selector("maximumPoints")
    @NInt
    public native long maximumPoints();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The title of the achievement.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The description for an achieved achievement.
     */
    @Generated
    @Selector("unachievedDescription")
    public native String unachievedDescription();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAchievementDescriptionsWithCompletionHandler {
        @Generated
        void call_loadAchievementDescriptionsWithCompletionHandler(
                NSArray<? extends GKAchievementDescription> descriptions, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadImageWithCompletionHandler {
        @Generated
        void call_loadImageWithCompletionHandler(UIImage image, NSError error);
    }
}
