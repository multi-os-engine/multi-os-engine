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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.protocol.UIActionSheetDelegate;
import apple.uikit.protocol.UIDocumentInteractionControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentInteractionController extends NSObject implements UIActionSheetDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentInteractionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentInteractionController alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentInteractionController allocWithZone(VoidPtr zone);

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

    /**
     * use file to determine UTI. assumes file is complete
     */
    @Generated
    @Selector("interactionControllerWithURL:")
    public static native UIDocumentInteractionController interactionControllerWithURL(NSURL url);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIDocumentInteractionController new_objc();

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
     * default is nil. if set, updates UTI, icon and name
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * determined from name if set, URL otherwise, override if the name or URL uses a custom scheme and the UTI can't be determined automatically
     */
    @Generated
    @Selector("UTI")
    public native String UTI();

    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:clickedButtonAtIndex:")
    public native void actionSheetClickedButtonAtIndex(UIActionSheet actionSheet, @NInt long buttonIndex);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:didDismissWithButtonIndex:")
    public native void actionSheetDidDismissWithButtonIndex(UIActionSheet actionSheet, @NInt long buttonIndex);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheet:willDismissWithButtonIndex:")
    public native void actionSheetWillDismissWithButtonIndex(UIActionSheet actionSheet, @NInt long buttonIndex);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("actionSheetCancel:")
    public native void actionSheetCancel(UIActionSheet actionSheet);

    /**
     * additional plist information for application to pass to receiver (must be a plist object). default is nil.
     */
    @Generated
    @Selector("annotation")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object annotation();

    /**
     * default is nil
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIDocumentInteractionControllerDelegate delegate();

    @Generated
    @IsOptional
    @Deprecated
    @Selector("didPresentActionSheet:")
    public native void didPresentActionSheet(UIActionSheet actionSheet);

    /**
     * Dismiss any visible menus.
     */
    @Generated
    @Selector("dismissMenuAnimated:")
    public native void dismissMenuAnimated(boolean animated);

    /**
     * Dismiss the full screen quick look window if it is visible.
     */
    @Generated
    @Selector("dismissPreviewAnimated:")
    public native void dismissPreviewAnimated(boolean animated);

    /**
     * Returns an array of gesture recognizers preconfigured to manage the quick look and options menu.
     * These gesture recognizers should only be installed on your view when the file has been copied locally and is present at URL.
     */
    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    /**
     * determined from name if set, URL otherwise. will return a generic document icon if an icon cannot be determined. returns an array of icons sorted from smallest to largest.
     */
    @Generated
    @Selector("icons")
    public native NSArray<? extends UIImage> icons();

    @Generated
    @Selector("init")
    public native UIDocumentInteractionController init();

    /**
     * determined from URL, override if the URL uses a custom scheme and the name can't be determined automatically
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("presentOpenInMenuFromBarButtonItem:animated:")
    public native boolean presentOpenInMenuFromBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    /**
     * Presents a menu allowing the user to open the document in another application.  The menu
     * will contain all applications that can open the item at URL.
     * Returns NO if there are no applications that can open the item at URL.
     */
    @Generated
    @Selector("presentOpenInMenuFromRect:inView:animated:")
    public native boolean presentOpenInMenuFromRectInViewAnimated(@ByValue CGRect rect, UIView view, boolean animated);

    @Generated
    @Selector("presentOptionsMenuFromBarButtonItem:animated:")
    public native boolean presentOptionsMenuFromBarButtonItemAnimated(UIBarButtonItem item, boolean animated);

    /**
     * This is the default method you should call to give your users the option to quick look, open, or copy the document.
     * Presents a menu allowing the user to Quick Look, open, or copy the item specified by URL.
     * This automatically determines the correct application or applications that can open the item at URL.
     * Returns NO if the options menu contained no options and was not opened.
     * Note that you must implement the delegate method documentInteractionControllerViewControllerForPreview: to get the Quick Look menu item.
     */
    @Generated
    @Selector("presentOptionsMenuFromRect:inView:animated:")
    public native boolean presentOptionsMenuFromRectInViewAnimated(@ByValue CGRect rect, UIView view, boolean animated);

    /**
     * Bypasses the menu and opens the full screen preview window for the item at URL.  Returns NO if the item could not be previewed.
     * Note that you must implement the delegate method documentInteractionControllerViewControllerForPreview: to preview the document.
     */
    @Generated
    @Selector("presentPreviewAnimated:")
    public native boolean presentPreviewAnimated(boolean animated);

    /**
     * additional plist information for application to pass to receiver (must be a plist object). default is nil.
     */
    @Generated
    @Selector("setAnnotation:")
    public native void setAnnotation(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) UIDocumentInteractionControllerDelegate value);

    /**
     * default is nil
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIDocumentInteractionControllerDelegate value) {
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
     * determined from URL, override if the URL uses a custom scheme and the name can't be determined automatically
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * default is nil. if set, updates UTI, icon and name
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * determined from name if set, URL otherwise, override if the name or URL uses a custom scheme and the UTI can't be determined automatically
     */
    @Generated
    @Selector("setUTI:")
    public native void setUTI(String value);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("willPresentActionSheet:")
    public native void willPresentActionSheet(UIActionSheet actionSheet);
}
