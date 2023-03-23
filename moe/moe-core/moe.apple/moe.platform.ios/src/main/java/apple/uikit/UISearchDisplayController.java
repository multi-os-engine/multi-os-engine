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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UISearchDisplayDelegate;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDelegate;
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
 * API-Since: 3.0
 * Deprecated-Since: 8.0
 * Deprecated-Message: UISearchDisplayController has been replaced with UISearchController
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchDisplayController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UISearchDisplayController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISearchDisplayController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISearchDisplayController allocWithZone(VoidPtr zone);

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
    public static native UISearchDisplayController new_objc();

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

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISearchDisplayDelegate delegate();

    /**
     * Displaying the search bar in a navigation bar will override the contentsController's navigationItem if it has
     * one.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("displaysSearchBarInNavigationBar")
    public native boolean displaysSearchBarInNavigationBar();

    @Generated
    @Selector("init")
    public native UISearchDisplayController init();

    @Generated
    @Selector("initWithSearchBar:contentsController:")
    public native UISearchDisplayController initWithSearchBarContentsController(UISearchBar searchBar,
            UIViewController viewController);

    /**
     * configure the view controller for searching. default is NO. animated is NO
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * configure the view controller for searching. default is NO. animated is NO
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("navigationItem")
    public native UINavigationItem navigationItem();

    @Generated
    @Selector("searchBar")
    public native UISearchBar searchBar();

    /**
     * the view we are searching (often a UITableViewController)
     */
    @Generated
    @Selector("searchContentsController")
    public native UIViewController searchContentsController();

    /**
     * default is nil. delegate can provide
     */
    @Generated
    @Selector("searchResultsDataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDataSource searchResultsDataSource();

    /**
     * default is nil. delegate can provide
     */
    @Generated
    @Selector("searchResultsDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITableViewDelegate searchResultsDelegate();

    /**
     * will return non-nil. create if requested
     */
    @Generated
    @Selector("searchResultsTableView")
    public native UITableView searchResultsTableView();

    /**
     * default is nil. If nil, the controller uses the default title string
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("searchResultsTitle")
    public native String searchResultsTitle();

    /**
     * animate the view controller for searching
     */
    @Generated
    @Selector("setActive:animated:")
    public native void setActiveAnimated(boolean visible, boolean animated);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UISearchDisplayDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UISearchDisplayDelegate value) {
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
     * Displaying the search bar in a navigation bar will override the contentsController's navigationItem if it has
     * one.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setDisplaysSearchBarInNavigationBar:")
    public native void setDisplaysSearchBarInNavigationBar(boolean value);

    /**
     * default is nil. delegate can provide
     */
    @Generated
    @Selector("setSearchResultsDataSource:")
    public native void setSearchResultsDataSource_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value);

    /**
     * default is nil. delegate can provide
     */
    @Generated
    public void setSearchResultsDataSource(@Mapped(ObjCObjectMapper.class) UITableViewDataSource value) {
        Object __old = searchResultsDataSource();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setSearchResultsDataSource_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default is nil. delegate can provide
     */
    @Generated
    @Selector("setSearchResultsDelegate:")
    public native void setSearchResultsDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITableViewDelegate value);

    /**
     * default is nil. delegate can provide
     */
    @Generated
    public void setSearchResultsDelegate(@Mapped(ObjCObjectMapper.class) UITableViewDelegate value) {
        Object __old = searchResultsDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setSearchResultsDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default is nil. If nil, the controller uses the default title string
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSearchResultsTitle:")
    public native void setSearchResultsTitle(String value);
}
