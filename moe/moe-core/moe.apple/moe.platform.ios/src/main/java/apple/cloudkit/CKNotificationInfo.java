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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKNotificationInfo extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKNotificationInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKNotificationInfo alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("alertActionLocalizationKey")
    public native String alertActionLocalizationKey();

    @Generated
    @Selector("alertBody")
    public native String alertBody();

    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    @Generated
    @Selector("alertLocalizationArgs")
    public native NSArray<String> alertLocalizationArgs();

    @Generated
    @Selector("alertLocalizationKey")
    public native String alertLocalizationKey();

    @Generated
    @Selector("category")
    public native String category();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native CKNotificationInfo init();

    @Generated
    @Selector("initWithCoder:")
    public native CKNotificationInfo initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("setAlertActionLocalizationKey:")
    public native void setAlertActionLocalizationKey(String value);

    @Generated
    @Selector("setAlertBody:")
    public native void setAlertBody(String value);

    @Generated
    @Selector("setAlertLaunchImage:")
    public native void setAlertLaunchImage(String value);

    @Generated
    @Selector("setAlertLocalizationArgs:")
    public native void setAlertLocalizationArgs(NSArray<String> value);

    @Generated
    @Selector("setAlertLocalizationKey:")
    public native void setAlertLocalizationKey(String value);

    @Generated
    @Selector("setCategory:")
    public native void setCategory(String value);

    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    @Generated
    @Selector("setShouldBadge:")
    public native void setShouldBadge(boolean value);

    @Generated
    @Selector("setShouldSendContentAvailable:")
    public native void setShouldSendContentAvailable(boolean value);

    @Generated
    @Selector("setSoundName:")
    public native void setSoundName(String value);

    @Generated
    @Selector("shouldBadge")
    public native boolean shouldBadge();

    @Generated
    @Selector("shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();

    @Generated
    @Selector("soundName")
    public native String soundName();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("collapseIDKey")
    public native String collapseIDKey();

    @Generated
    @Selector("setCollapseIDKey:")
    public native void setCollapseIDKey(String value);

    @Generated
    @Selector("setShouldSendMutableContent:")
    public native void setShouldSendMutableContent(boolean value);

    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    @Generated
    @Selector("setSubtitleLocalizationArgs:")
    public native void setSubtitleLocalizationArgs(NSArray<String> value);

    @Generated
    @Selector("setSubtitleLocalizationKey:")
    public native void setSubtitleLocalizationKey(String value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setTitleLocalizationArgs:")
    public native void setTitleLocalizationArgs(NSArray<String> value);

    @Generated
    @Selector("setTitleLocalizationKey:")
    public native void setTitleLocalizationKey(String value);

    @Generated
    @Selector("shouldSendMutableContent")
    public native boolean shouldSendMutableContent();

    @Generated
    @Selector("subtitle")
    public native String subtitle();

    @Generated
    @Selector("subtitleLocalizationArgs")
    public native NSArray<String> subtitleLocalizationArgs();

    @Generated
    @Selector("subtitleLocalizationKey")
    public native String subtitleLocalizationKey();

    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("titleLocalizationArgs")
    public native NSArray<String> titleLocalizationArgs();

    @Generated
    @Selector("titleLocalizationKey")
    public native String titleLocalizationKey();
}
