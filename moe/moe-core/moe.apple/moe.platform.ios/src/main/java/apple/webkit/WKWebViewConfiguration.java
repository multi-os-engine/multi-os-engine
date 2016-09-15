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

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebViewConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebViewConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebViewConfiguration alloc();

    /**
     * allowsInlineMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsInlineMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsInlineMediaPlayback")
    public native boolean allowsInlineMediaPlayback();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native WKWebViewConfiguration init();

    /**
     * mediaPlaybackAllowsAirPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/mediaPlaybackAllowsAirPlay">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("mediaPlaybackAllowsAirPlay")
    public native boolean mediaPlaybackAllowsAirPlay();

    /**
     * mediaPlaybackRequiresUserAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/mediaPlaybackRequiresUserAction">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("mediaPlaybackRequiresUserAction")
    public native boolean mediaPlaybackRequiresUserAction();

    /**
     * preferences</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/preferences">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferences")
    public native WKPreferences preferences();

    /**
     * processPool</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/processPool">iOS Dev Center</a>
     */
    @Generated
    @Selector("processPool")
    public native WKProcessPool processPool();

    /**
     * selectionGranularity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/selectionGranularity">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectionGranularity")
    @NInt
    public native long selectionGranularity();

    /**
     * allowsInlineMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsInlineMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean value);

    /**
     * mediaPlaybackAllowsAirPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/mediaPlaybackAllowsAirPlay">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean value);

    /**
     * mediaPlaybackRequiresUserAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/mediaPlaybackRequiresUserAction">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean value);

    /**
     * preferences</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/preferences">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferences:")
    public native void setPreferences(WKPreferences value);

    /**
     * processPool</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/processPool">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProcessPool:")
    public native void setProcessPool(WKProcessPool value);

    /**
     * selectionGranularity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/selectionGranularity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSelectionGranularity:")
    public native void setSelectionGranularity(@NInt long value);

    /**
     * suppressesIncrementalRendering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/suppressesIncrementalRendering">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean value);

    /**
     * userContentController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/userContentController">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserContentController:")
    public native void setUserContentController(WKUserContentController value);

    /**
     * suppressesIncrementalRendering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/suppressesIncrementalRendering">iOS Dev Center</a>
     */
    @Generated
    @Selector("suppressesIncrementalRendering")
    public native boolean suppressesIncrementalRendering();

    /**
     * userContentController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/userContentController">iOS Dev Center</a>
     */
    @Generated
    @Selector("userContentController")
    public native WKUserContentController userContentController();

    /**
     * allowsAirPlayForMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsAirPlayForMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsAirPlayForMediaPlayback")
    public native boolean allowsAirPlayForMediaPlayback();

    /**
     * allowsPictureInPictureMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsPictureInPictureMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsPictureInPictureMediaPlayback")
    public native boolean allowsPictureInPictureMediaPlayback();

    /**
     * applicationNameForUserAgent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/applicationNameForUserAgent">iOS Dev Center</a>
     */
    @Generated
    @Selector("applicationNameForUserAgent")
    public native String applicationNameForUserAgent();

    /**
     * requiresUserActionForMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/requiresUserActionForMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiresUserActionForMediaPlayback")
    public native boolean requiresUserActionForMediaPlayback();

    /**
     * allowsAirPlayForMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsAirPlayForMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsAirPlayForMediaPlayback:")
    public native void setAllowsAirPlayForMediaPlayback(boolean value);

    /**
     * allowsPictureInPictureMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/allowsPictureInPictureMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsPictureInPictureMediaPlayback:")
    public native void setAllowsPictureInPictureMediaPlayback(boolean value);

    /**
     * applicationNameForUserAgent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/applicationNameForUserAgent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setApplicationNameForUserAgent:")
    public native void setApplicationNameForUserAgent(String value);

    /**
     * requiresUserActionForMediaPlayback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/requiresUserActionForMediaPlayback">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRequiresUserActionForMediaPlayback:")
    public native void setRequiresUserActionForMediaPlayback(boolean value);

    /**
     * websiteDataStore</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/websiteDataStore">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWebsiteDataStore:")
    public native void setWebsiteDataStore(WKWebsiteDataStore value);

    /**
     * websiteDataStore</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebViewConfiguration_Ref/index.html#//apple_ref/occ/instp/WKWebViewConfiguration/websiteDataStore">iOS Dev Center</a>
     */
    @Generated
    @Selector("websiteDataStore")
    public native WKWebsiteDataStore websiteDataStore();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
