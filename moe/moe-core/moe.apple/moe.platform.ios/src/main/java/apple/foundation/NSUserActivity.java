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
import apple.coreimage.CIBarcodeDescriptor;
import apple.corenfc.NFCNDEFMessage;
import apple.corespotlight.CSSearchableItemAttributeSet;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSUserActivityDelegate;
import apple.intents.INInteraction;
import apple.mapkit.MKMapItem;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSUserActivity encapsulates the state of a user activity in an application on a particular device, in a way that allows the same activity to be continued on another device in a corresponding application from the same developer. Examples of user user activities include editing a document, viewing a web page, or watching a video.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserActivity extends NSObject implements NSItemProviderReading, NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUserActivity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUserActivity alloc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The activityType the user activity was created with.
     */
    @Generated
    @Selector("activityType")
    public native String activityType();

    /**
     * Adds to the userInfo dictionary the entries from otherDictionary.  The keys and values must be of the types allowed in the userInfo
     */
    @Generated
    @Selector("addUserInfoEntriesFromDictionary:")
    public native void addUserInfoEntriesFromDictionary(NSDictionary<?, ?> otherDictionary);

    /**
     * Marks the receiver as the activity currently in use by the user, for example, the activity associated with the active window. A newly created activity is eligible for continuation on another device after the first time it becomes current.
     */
    @Generated
    @Selector("becomeCurrent")
    public native void becomeCurrent();

    @Generated
    @Selector("contentAttributeSet")
    public native CSSearchableItemAttributeSet contentAttributeSet();

    /**
     * The user activity delegate is informed when the activity is being saved or continued (see NSUserActivityDelegate, below)
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSUserActivityDelegate delegate();

    /**
     * If non-nil, then an absolute date after which this activity is no longer eligible to be indexed or handed off.
     */
    @Generated
    @Selector("expirationDate")
    public native NSDate expirationDate();

    /**
     * When an app is launched for a continuation event it can request streams back to the originating side. Streams can only be successfully retrieved from the NSUserActivity in the NS/UIApplication delegate that is called for a continuation event. This functionality is optional and is not expected to be needed in most continuation cases. The streams returned in the completion handler will be in an unopened state. The streams should be opened immediately to start requesting information from the other side.
     */
    @Generated
    @Selector("getContinuationStreamsWithCompletionHandler:")
    public native void getContinuationStreamsWithCompletionHandler(
            @ObjCBlock(name = "call_getContinuationStreamsWithCompletionHandler") Block_getContinuationStreamsWithCompletionHandler completionHandler);

    /**
     * Initializes and returns a newly created NSUserActivity with the first activityType from the NSUserActivityTypes key in the application’s Info.plist.
     */
    @Generated
    @Selector("init")
    public native NSUserActivity init();

    /**
     * Initializes and returns a newly created NSUserActivity with the given activityType. A user activity may be continued only in an application that (1) has the same developer Team ID as the activity's source application and (2) supports the activity's type. Supported activity types are specified in the application's Info.plist under the NSUserActivityTypes key. When receiving a user activity for continuation, the system locates the appropriate application to launch by finding applications with the target Team ID, then filtering on the incoming activity's type identifier.
     */
    @Generated
    @Selector("initWithActivityType:")
    public native NSUserActivity initWithActivityType(String activityType);

    @Generated
    @Selector("interaction")
    public native INInteraction interaction();

    /**
     * Invalidate an activity when it's no longer eligible for continuation, for example, when the window associated with an activity is closed. An invalid activity cannot become current.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * Set to YES if this user activity should be eligible to be handed off to another device
     */
    @Generated
    @Selector("isEligibleForHandoff")
    public native boolean isEligibleForHandoff();

    /**
     * Set to YES if this user activity should be eligible to be handed off to another device
     */
    @Generated
    @Selector("setEligibleForHandoff:")
    public native void setEligibleForHandoff(boolean value);

    /**
     * Set to YES if this user activity should be eligible for indexing for any user of this application, on any device, or NO if the activity contains private or sensitive information or which would not be useful to other users if indexed.  The activity must also have requiredUserActivityKeys or a webpageURL
     */
    @Generated
    @Selector("isEligibleForPublicIndexing")
    public native boolean isEligibleForPublicIndexing();

    /**
     * Set to YES if this user activity should be eligible for indexing for any user of this application, on any device, or NO if the activity contains private or sensitive information or which would not be useful to other users if indexed.  The activity must also have requiredUserActivityKeys or a webpageURL
     */
    @Generated
    @Selector("setEligibleForPublicIndexing:")
    public native void setEligibleForPublicIndexing(boolean value);

    /**
     * Set to YES if this user activity should be indexed by App History
     */
    @Generated
    @Selector("isEligibleForSearch")
    public native boolean isEligibleForSearch();

    /**
     * Set to YES if this user activity should be indexed by App History
     */
    @Generated
    @Selector("setEligibleForSearch:")
    public native void setEligibleForSearch(boolean value);

    /**
     * A set of NSString* keywords, representing words or phrases in the current user's language that might help the user to find this activity in the application history.
     */
    @Generated
    @Selector("keywords")
    public native NSSet<String> keywords();

    @Generated
    @Selector("mapItem")
    public native MKMapItem mapItem();

    /**
     * If set to YES, then the delegate for this user activity will receive a userActivityWillSave: callback before being sent for continuation on another device.
     */
    @Generated
    @Selector("needsSave")
    public native boolean needsSave();

    /**
     * The keys from the userInfo property which represent the minimal information about this user activity that should be stored for later restoration.  A nil value means all keys in .userInfo are required.
     */
    @Generated
    @Selector("requiredUserInfoKeys")
    public native NSSet<String> requiredUserInfoKeys();

    /**
     * If this activity is the current activity, it should stop being so and set the current activity to nothing.
     */
    @Generated
    @Selector("resignCurrent")
    public native void resignCurrent();

    @Generated
    @Selector("setContentAttributeSet:")
    public native void setContentAttributeSet(CSSearchableItemAttributeSet value);

    /**
     * The user activity delegate is informed when the activity is being saved or continued (see NSUserActivityDelegate, below)
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSUserActivityDelegate value);

    /**
     * The user activity delegate is informed when the activity is being saved or continued (see NSUserActivityDelegate, below)
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
     * If non-nil, then an absolute date after which this activity is no longer eligible to be indexed or handed off.
     */
    @Generated
    @Selector("setExpirationDate:")
    public native void setExpirationDate(NSDate value);

    /**
     * A set of NSString* keywords, representing words or phrases in the current user's language that might help the user to find this activity in the application history.
     */
    @Generated
    @Selector("setKeywords:")
    public native void setKeywords(NSSet<String> value);

    @Generated
    @Selector("setMapItem:")
    public native void setMapItem(MKMapItem value);

    /**
     * If set to YES, then the delegate for this user activity will receive a userActivityWillSave: callback before being sent for continuation on another device.
     */
    @Generated
    @Selector("setNeedsSave:")
    public native void setNeedsSave(boolean value);

    /**
     * The keys from the userInfo property which represent the minimal information about this user activity that should be stored for later restoration.  A nil value means all keys in .userInfo are required.
     */
    @Generated
    @Selector("setRequiredUserInfoKeys:")
    public native void setRequiredUserInfoKeys(NSSet<String> value);

    /**
     * When used for continuation, the user activity can allow the continuing side to connect back for more information using streams. This value is set to NO by default. It can be dynamically set to YES to selectively support continuation streams based on the state of the user activity.
     */
    @Generated
    @Selector("setSupportsContinuationStreams:")
    public native void setSupportsContinuationStreams(boolean value);

    /**
     * An optional, user-visible title for this activity, such as a document name or web page title.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The userInfo dictionary contains application-specific state needed to continue an activity on another device. Each key and value must be of the following types: NSArray, NSData, NSDate, NSDictionary, NSNull, NSNumber, NSSet, NSString, NSURL, or NSUUID. File scheme URLs which refer to iCloud documents may be translated to valid file URLs on a receiving device.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * When no suitable application is installed on a resuming device and the webpageURL is set, the user activity will instead be continued in a web browser by loading this resource.
     */
    @Generated
    @Selector("setWebpageURL:")
    public native void setWebpageURL(NSURL value);

    /**
     * When used for continuation, the user activity can allow the continuing side to connect back for more information using streams. This value is set to NO by default. It can be dynamically set to YES to selectively support continuation streams based on the state of the user activity.
     */
    @Generated
    @Selector("supportsContinuationStreams")
    public native boolean supportsContinuationStreams();

    /**
     * An optional, user-visible title for this activity, such as a document name or web page title.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The userInfo dictionary contains application-specific state needed to continue an activity on another device. Each key and value must be of the following types: NSArray, NSData, NSDate, NSDictionary, NSNull, NSNumber, NSSet, NSString, NSURL, or NSUUID. File scheme URLs which refer to iCloud documents may be translated to valid file URLs on a receiving device.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * When no suitable application is installed on a resuming device and the webpageURL is set, the user activity will instead be continued in a web browser by loading this resource.
     */
    @Generated
    @Selector("webpageURL")
    public native NSURL webpageURL();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getContinuationStreamsWithCompletionHandler {
        @Generated
        void call_getContinuationStreamsWithCompletionHandler(NSInputStream inputStream, NSOutputStream outputStream,
                NSError error);
    }

    /**
     * A unique identifier relative to the app's media content catalog for the displayed media item.
     */
    @Generated
    @Selector("externalMediaContentIdentifier")
    public native String externalMediaContentIdentifier();

    /**
     * The URL of the webpage that referred (linked to) webpageURL.
     */
    @Generated
    @Selector("referrerURL")
    public native NSURL referrerURL();

    /**
     * A unique identifier relative to the app's media content catalog for the displayed media item.
     */
    @Generated
    @Selector("setExternalMediaContentIdentifier:")
    public native void setExternalMediaContentIdentifier(String value);

    /**
     * The URL of the webpage that referred (linked to) webpageURL.
     */
    @Generated
    @Selector("setReferrerURL:")
    public native void setReferrerURL(NSURL value);

    @Generated
    @Selector("deleteAllSavedUserActivitiesWithCompletionHandler:")
    public static native void deleteAllSavedUserActivitiesWithCompletionHandler(
            @ObjCBlock(name = "call_deleteAllSavedUserActivitiesWithCompletionHandler") Block_deleteAllSavedUserActivitiesWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteAllSavedUserActivitiesWithCompletionHandler {
        @Generated
        void call_deleteAllSavedUserActivitiesWithCompletionHandler();
    }

    @Generated
    @Selector("deleteSavedUserActivitiesWithPersistentIdentifiers:completionHandler:")
    public static native void deleteSavedUserActivitiesWithPersistentIdentifiersCompletionHandler(
            NSArray<String> persistentIdentifiers,
            @ObjCBlock(name = "call_deleteSavedUserActivitiesWithPersistentIdentifiersCompletionHandler") Block_deleteSavedUserActivitiesWithPersistentIdentifiersCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSavedUserActivitiesWithPersistentIdentifiersCompletionHandler {
        @Generated
        void call_deleteSavedUserActivitiesWithPersistentIdentifiersCompletionHandler();
    }

    /**
     * The scanned code in the user activity passed in by system scanner.
     */
    @Generated
    @Selector("detectedBarcodeDescriptor")
    public native CIBarcodeDescriptor detectedBarcodeDescriptor();

    @Generated
    @Selector("isEligibleForPrediction")
    public native boolean isEligibleForPrediction();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("persistentIdentifier")
    public native String persistentIdentifier();

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("setEligibleForPrediction:")
    public native void setEligibleForPrediction(boolean value);

    @Generated
    @Selector("setPersistentIdentifier:")
    public native void setPersistentIdentifier(String value);

    /**
     * A human-understandable string that can be used to suggest a voice shortcut phrase to the user
     */
    @Generated
    @Selector("setSuggestedInvocationPhrase:")
    public native void setSuggestedInvocationPhrase(String value);

    /**
     * A string that identifies the content of this NSUserActivity, for matching against existing documents when re-opening to see if they are the same.
     * Setting this property is optional and does not automatically set .needsSave to YES.
     */
    @Generated
    @Selector("setTargetContentIdentifier:")
    public native void setTargetContentIdentifier(String value);

    /**
     * A human-understandable string that can be used to suggest a voice shortcut phrase to the user
     */
    @Generated
    @Selector("suggestedInvocationPhrase")
    public native String suggestedInvocationPhrase();

    /**
     * A string that identifies the content of this NSUserActivity, for matching against existing documents when re-opening to see if they are the same.
     * Setting this property is optional and does not automatically set .needsSave to YES.
     */
    @Generated
    @Selector("targetContentIdentifier")
    public native String targetContentIdentifier();

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * Returns the context identifier path you should deep link to.
     * 
     * For example for the context identifier path @c @["swift-programming-book", @c "chapter1"],
     *                your app should direct the user to @em chapter1 in @em swift-programming-book.
     */
    @Generated
    @Selector("contextIdentifierPath")
    public native NSArray<String> contextIdentifierPath();

    /**
     * Returns whether the user activity is a ClassKit deep link.
     */
    @Generated
    @Selector("isClassKitDeepLink")
    public native boolean isClassKitDeepLink();

    /**
     * [@property] ndefMessagePayload
     * 
     * The NFC NDEF message with an Universial Link object that triggers the application launch.
     */
    @Generated
    @Selector("ndefMessagePayload")
    public native NFCNDEFMessage ndefMessagePayload();

    /**
     * Defines additional contexts in which this user activity is relevant to be suggested to the user.
     */
    @Generated
    @Selector("setShortcutAvailability:")
    public native void setShortcutAvailability(@NUInt long value);

    /**
     * Defines additional contexts in which this user activity is relevant to be suggested to the user.
     */
    @Generated
    @Selector("shortcutAvailability")
    @NUInt
    public native long shortcutAvailability();
}
