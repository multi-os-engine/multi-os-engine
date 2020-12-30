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

package apple.newsstandkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURLConnection;
import apple.foundation.NSURLRequest;
import apple.foundation.protocol.NSURLConnectionDownloadDelegate;
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

/**
 * NKAssetDownload
 * 
 * Represents a downloading asset for an issue.
 * 
 * An NKIssue may have one or more assets that together form the structure
 * of the Newsstand issue. You generate a downloading asset by constructing
 * an NSURLRequest adding the request to the NKIssue using
 * -[NKIssue addAssetWithRequest:]. Begin downloading the asset by calling
 * -[NKAssetDownload downloadWithDelegate:].
 * Upon download completion, you will need to put your uncompressed content
 * in the URL specified by -[NKIssue contentURL].
 */
@Generated
@Library("NewsstandKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NKAssetDownload extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NKAssetDownload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NKAssetDownload alloc();

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
     * [@property]   URLRequest
     * 
     * The NSURLRequest of the download
     */
    @Generated
    @Selector("URLRequest")
    public native NSURLRequest URLRequest();

    /**
     * downloadWithDelegate:
     * 
     * Begins downloading the asset with the specified delegate. Delegate
     * may not be nil.
     */
    @Generated
    @Selector("downloadWithDelegate:")
    public native NSURLConnection downloadWithDelegate(
            @Mapped(ObjCObjectMapper.class) NSURLConnectionDownloadDelegate delegate);

    /**
     * [@property]   identifier
     * 
     * A unique identifier representing the asset.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NKAssetDownload init();

    /**
     * back-pointer to the issue this asset is associated with
     */
    @Generated
    @Selector("issue")
    public native NKIssue issue();

    /**
     * [@property]   userInfo
     * 
     * Application specific information that is saved with the asset. Can be nil.
     * 
     * You may add arbitrary key-value pairs to this dictionary. However, the keys
     * and values must be valid property-list types; if any are not, an exception is raised.
     * Using this property you can save download related information such as file name/paths,
     * encoding mechanisms, custom identifiers, etc.  However, performance concerns dictate
     * that you should make this content as minimal as possible.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * [@property]   userInfo
     * 
     * Application specific information that is saved with the asset. Can be nil.
     * 
     * You may add arbitrary key-value pairs to this dictionary. However, the keys
     * and values must be valid property-list types; if any are not, an exception is raised.
     * Using this property you can save download related information such as file name/paths,
     * encoding mechanisms, custom identifiers, etc.  However, performance concerns dictate
     * that you should make this content as minimal as possible.
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();
}
