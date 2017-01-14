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
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.protocol.UIPrintInteractionControllerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPrintInteractionController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrintInteractionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrintInteractionController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("canPrintData:")
    public static native boolean canPrintData(NSData data);

    @Generated
    @Selector("canPrintURL:")
    public static native boolean canPrintURL(NSURL url);

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
    @Selector("isPrintingAvailable")
    public static native boolean isPrintingAvailable();

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
    @Selector("printableUTIs")
    public static native NSSet<String> printableUTIs();

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
    @Selector("sharedPrintController")
    public static native UIPrintInteractionController sharedPrintController();

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
    public native UIPrintInteractionControllerDelegate delegate();

    @Generated
    @Selector("dismissAnimated:")
    public native void dismissAnimated(boolean animated);

    @Generated
    @Selector("init")
    public native UIPrintInteractionController init();

    @Generated
    @Selector("presentAnimated:completionHandler:")
    public native boolean presentAnimatedCompletionHandler(boolean animated,
            @ObjCBlock(name = "call_presentAnimatedCompletionHandler") Block_presentAnimatedCompletionHandler completion);

    @Generated
    @Selector("presentFromBarButtonItem:animated:completionHandler:")
    public native boolean presentFromBarButtonItemAnimatedCompletionHandler(UIBarButtonItem item, boolean animated,
            @ObjCBlock(name = "call_presentFromBarButtonItemAnimatedCompletionHandler") Block_presentFromBarButtonItemAnimatedCompletionHandler completion);

    @Generated
    @Selector("presentFromRect:inView:animated:completionHandler:")
    public native boolean presentFromRectInViewAnimatedCompletionHandler(@ByValue CGRect rect, UIView view,
            boolean animated,
            @ObjCBlock(name = "call_presentFromRectInViewAnimatedCompletionHandler") Block_presentFromRectInViewAnimatedCompletionHandler completion);

    @Generated
    @Selector("printFormatter")
    public native UIPrintFormatter printFormatter();

    @Generated
    @Selector("printInfo")
    public native UIPrintInfo printInfo();

    @Generated
    @Selector("printPageRenderer")
    public native UIPrintPageRenderer printPageRenderer();

    @Generated
    @Selector("printPaper")
    public native UIPrintPaper printPaper();

    @Generated
    @Selector("printToPrinter:completionHandler:")
    public native boolean printToPrinterCompletionHandler(UIPrinter printer,
            @ObjCBlock(name = "call_printToPrinterCompletionHandler") Block_printToPrinterCompletionHandler completion);

    @Generated
    @Selector("printingItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object printingItem();

    @Generated
    @Selector("printingItems")
    public native NSArray<?> printingItems();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIPrintInteractionControllerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UIPrintInteractionControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setPrintFormatter:")
    public native void setPrintFormatter(UIPrintFormatter value);

    @Generated
    @Selector("setPrintInfo:")
    public native void setPrintInfo(UIPrintInfo value);

    @Generated
    @Selector("setPrintPageRenderer:")
    public native void setPrintPageRenderer(UIPrintPageRenderer value);

    @Generated
    @Selector("setPrintingItem:")
    public native void setPrintingItem(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setPrintingItems:")
    public native void setPrintingItems(NSArray<?> value);

    @Generated
    @Selector("setShowsNumberOfCopies:")
    public native void setShowsNumberOfCopies(boolean value);

    @Generated
    @Selector("setShowsPageRange:")
    public native void setShowsPageRange(boolean value);

    @Generated
    @Selector("setShowsPaperSelectionForLoadedPapers:")
    public native void setShowsPaperSelectionForLoadedPapers(boolean value);

    @Generated
    @Selector("showsNumberOfCopies")
    public native boolean showsNumberOfCopies();

    @Generated
    @Selector("showsPageRange")
    public native boolean showsPageRange();

    @Generated
    @Selector("showsPaperSelectionForLoadedPapers")
    public native boolean showsPaperSelectionForLoadedPapers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentAnimatedCompletionHandler {
        @Generated
        void call_presentAnimatedCompletionHandler(UIPrintInteractionController arg0, boolean arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromBarButtonItemAnimatedCompletionHandler {
        @Generated
        void call_presentFromBarButtonItemAnimatedCompletionHandler(UIPrintInteractionController arg0, boolean arg1,
                NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromRectInViewAnimatedCompletionHandler {
        @Generated
        void call_presentFromRectInViewAnimatedCompletionHandler(UIPrintInteractionController arg0, boolean arg1,
                NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_printToPrinterCompletionHandler {
        @Generated
        void call_printToPrinterCompletionHandler(UIPrintInteractionController arg0, boolean arg1, NSError arg2);
    }
}
