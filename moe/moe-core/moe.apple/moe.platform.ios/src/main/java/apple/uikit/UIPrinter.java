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
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPrinter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrinter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrinter alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIPrinter allocWithZone(VoidPtr zone);

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
    public static native UIPrinter new_objc();

    /**
     * printerWithURL:
     * <p>
     * Create a printer from its URL
     * <p>
     * This method creates a new printer object from the printer's URL.
     * A UIPrinter object is returned even if the printer is not available
     * on the network.
     */
    @Generated
    @Selector("printerWithURL:")
    public static native UIPrinter printerWithURL(NSURL url);

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
     * Return the URL of the printer.
     * <p>
     * This method returns the full URL of the printer which can be
     * used in future calls to printerWithURL to access the same
     * printer.
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * contactPrinter:
     * <p>
     * Check if printer is reachable, and update printer information.
     * <p>
     * This method checks to see if this printer is available on the network,
     * and sets the displayName, displayLocation, supportedJobTypes, makeAndModel,
     * supportsColor, and supportsDuplex for the printer.
     * The operation can take up to 30 seconds.
     */
    @Generated
    @Selector("contactPrinter:")
    public native void contactPrinter(@ObjCBlock(name = "call_contactPrinter") Block_contactPrinter completionHandler);

    /**
     * Return a human-readable location.
     * <p>
     * This method returns the printer's location. This is human-readable text that
     * usually appears in the UI below the printer's name (such as "Front Office").
     * Returns nil if the printer doesn't have a location string.
     * This property's value is undefined until contactPrinter: has been called and
     * completed successfully.
     */
    @Generated
    @Selector("displayLocation")
    public native String displayLocation();

    /**
     * Return a human-readable printer name.
     * <p>
     * This method returns the printer name suitable for displaying in the UI.
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("init")
    public native UIPrinter init();

    /**
     * Return make (manufacturer) and model of the printer.
     * <p>
     * This method returns the make and model of the printer, which
     * is usually the manufacturer, model, and model number.
     * This property's value is undefined until contactPrinter: has been called and
     * completed successfully.
     */
    @Generated
    @Selector("makeAndModel")
    public native String makeAndModel();

    /**
     * Returns the supported job types of this printer.
     * <p>
     * This method returns a mask with all the UIPrinterJobTypes values that
     * the printer supports.
     * This property's value is undefined until contactPrinter: has been called and
     * completed successfully.
     */
    @Generated
    @Selector("supportedJobTypes")
    @NInt
    public native long supportedJobTypes();

    /**
     * Return whether this printer supports color printing.
     * <p>
     * This method returns YES if the printer supports full color printing, NO
     * otherwise.
     * This property's value is undefined until contactPrinter: has been called and
     * completed successfully.
     */
    @Generated
    @Selector("supportsColor")
    public native boolean supportsColor();

    /**
     * Return whether this printer supports duplex (double-sided) printing.
     * <p>
     * This method returns YES if the printer supports duplex (double-sided)
     * printing, NO otherwise.
     * This property's value is undefined until contactPrinter: has been called and
     * completed successfully.
     */
    @Generated
    @Selector("supportsDuplex")
    public native boolean supportsDuplex();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_contactPrinter {
        @Generated
        void call_contactPrinter(boolean available);
    }
}
