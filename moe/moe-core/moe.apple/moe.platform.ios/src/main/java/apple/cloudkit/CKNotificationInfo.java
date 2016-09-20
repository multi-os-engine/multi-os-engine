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
    @Owned
    @Selector("alloc")
    public static native CKNotificationInfo alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * alertActionLocalizationKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertActionLocalizationKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("alertActionLocalizationKey")
    public native String alertActionLocalizationKey();

    /**
     * alertBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("alertBody")
    public native String alertBody();

    /**
     * alertLaunchImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLaunchImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    /**
     * alertLocalizationArgs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLocalizationArgs">iOS Dev Center</a>
     */
    @Generated
    @Selector("alertLocalizationArgs")
    public native NSArray<String> alertLocalizationArgs();

    /**
     * alertLocalizationKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLocalizationKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("alertLocalizationKey")
    public native String alertLocalizationKey();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/desiredKeys">iOS Dev Center</a>
     */
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

    /**
     * alertActionLocalizationKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertActionLocalizationKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlertActionLocalizationKey:")
    public native void setAlertActionLocalizationKey(String value);

    /**
     * alertBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlertBody:")
    public native void setAlertBody(String value);

    /**
     * alertLaunchImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLaunchImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlertLaunchImage:")
    public native void setAlertLaunchImage(String value);

    /**
     * alertLocalizationArgs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLocalizationArgs">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlertLocalizationArgs:")
    public native void setAlertLocalizationArgs(NSArray<String> value);

    /**
     * alertLocalizationKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/alertLocalizationKey">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlertLocalizationKey:")
    public native void setAlertLocalizationKey(String value);

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/desiredKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    /**
     * shouldBadge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/shouldBadge">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldBadge:")
    public native void setShouldBadge(boolean value);

    /**
     * shouldSendContentAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/shouldSendContentAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldSendContentAvailable:")
    public native void setShouldSendContentAvailable(boolean value);

    /**
     * soundName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/soundName">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSoundName:")
    public native void setSoundName(String value);

    /**
     * shouldBadge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/shouldBadge">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldBadge")
    public native boolean shouldBadge();

    /**
     * shouldSendContentAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/shouldSendContentAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldSendContentAvailable")
    public native boolean shouldSendContentAvailable();

    /**
     * soundName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/soundName">iOS Dev Center</a>
     */
    @Generated
    @Selector("soundName")
    public native String soundName();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * category</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/category">iOS Dev Center</a>
     */
    @Generated
    @Selector("category")
    public native String category();

    /**
     * category</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKNotificationInfo_class/index.html#//apple_ref/occ/instp/CKNotificationInfo/category">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCategory:")
    public native void setCategory(String value);
}
