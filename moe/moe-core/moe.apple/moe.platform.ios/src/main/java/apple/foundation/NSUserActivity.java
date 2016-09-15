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

package apple.foundation;

import apple.NSObject;
import apple.corespotlight.CSSearchableItemAttributeSet;
import apple.foundation.protocol.NSUserActivityDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserActivity extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUserActivity(Pointer peer) {
        super(peer);
    }

    /**
     * activityType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/activityType">iOS Dev Center</a>
     */
    @Generated
    @Selector("activityType")
    public native String activityType();

    /**
     * addUserInfoEntriesFromDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/addUserInfoEntriesFromDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addUserInfoEntriesFromDictionary:")
    public native void addUserInfoEntriesFromDictionary(NSDictionary<?, ?> otherDictionary);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUserActivity alloc();

    /**
     * becomeCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/becomeCurrent">iOS Dev Center</a>
     */
    @Generated
    @Selector("becomeCurrent")
    public native void becomeCurrent();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSUserActivityDelegate delegate();

    /**
     * getContinuationStreamsWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/getContinuationStreamsWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getContinuationStreamsWithCompletionHandler:")
    public native void getContinuationStreamsWithCompletionHandler(
            @ObjCBlock(name = "call_getContinuationStreamsWithCompletionHandler") Block_getContinuationStreamsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getContinuationStreamsWithCompletionHandler {
        @Generated
        void call_getContinuationStreamsWithCompletionHandler(NSInputStream arg0, NSOutputStream arg1, NSError arg2);
    }

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSUserActivity init();

    /**
     * initWithActivityType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/initWithActivityType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithActivityType:")
    public native NSUserActivity initWithActivityType(String activityType);

    /**
     * invalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/invalidate">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * needsSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/needsSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("needsSave")
    public native boolean needsSave();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSUserActivityDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSUserActivityDelegate value) {
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
     * needsSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/needsSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsSave:")
    public native void setNeedsSave(boolean value);

    /**
     * supportsContinuationStreams</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/supportsContinuationStreams">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSupportsContinuationStreams:")
    public native void setSupportsContinuationStreams(boolean value);

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * webpageURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/webpageURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWebpageURL:")
    public native void setWebpageURL(NSURL value);

    /**
     * supportsContinuationStreams</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/supportsContinuationStreams">iOS Dev Center</a>
     */
    @Generated
    @Selector("supportsContinuationStreams")
    public native boolean supportsContinuationStreams();

    /**
     * title</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/title">iOS Dev Center</a>
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * userInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/userInfo">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * webpageURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/webpageURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("webpageURL")
    public native NSURL webpageURL();

    /**
     * contentAttributeSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/contentAttributeSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentAttributeSet")
    public native CSSearchableItemAttributeSet contentAttributeSet();

    /**
     * expirationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/expirationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("expirationDate")
    public native NSDate expirationDate();

    /**
     * eligibleForHandoff</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForHandoff">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEligibleForHandoff")
    public native boolean isEligibleForHandoff();

    /**
     * eligibleForPublicIndexing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForPublicIndexing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEligibleForPublicIndexing")
    public native boolean isEligibleForPublicIndexing();

    /**
     * eligibleForSearch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForSearch">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEligibleForSearch")
    public native boolean isEligibleForSearch();

    /**
     * keywords</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/keywords">iOS Dev Center</a>
     */
    @Generated
    @Selector("keywords")
    public native NSSet<String> keywords();

    /**
     * requiredUserInfoKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/requiredUserInfoKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiredUserInfoKeys")
    public native NSSet<String> requiredUserInfoKeys();

    /**
     * resignCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instm/NSUserActivity/resignCurrent">iOS Dev Center</a>
     */
    @Generated
    @Selector("resignCurrent")
    public native void resignCurrent();

    /**
     * contentAttributeSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/contentAttributeSet">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentAttributeSet:")
    public native void setContentAttributeSet(CSSearchableItemAttributeSet value);

    /**
     * eligibleForHandoff</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForHandoff">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEligibleForHandoff:")
    public native void setEligibleForHandoff(boolean value);

    /**
     * eligibleForPublicIndexing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForPublicIndexing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEligibleForPublicIndexing:")
    public native void setEligibleForPublicIndexing(boolean value);

    /**
     * eligibleForSearch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/eligibleForSearch">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEligibleForSearch:")
    public native void setEligibleForSearch(boolean value);

    /**
     * expirationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/expirationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExpirationDate:")
    public native void setExpirationDate(NSDate value);

    /**
     * keywords</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/keywords">iOS Dev Center</a>
     */
    @Generated
    @Selector("setKeywords:")
    public native void setKeywords(NSSet<String> value);

    /**
     * requiredUserInfoKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUserActivity_Class/index.html#//apple_ref/occ/instp/NSUserActivity/requiredUserInfoKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRequiredUserInfoKeys:")
    public native void setRequiredUserInfoKeys(NSSet<String> value);

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
}
