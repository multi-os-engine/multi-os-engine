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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperation;
import apple.foundation.NSSet;
import apple.linkpresentation.LPLinkMetadata;
import apple.uikit.protocol.UIActivityItemSource;
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
public class UIActivityItemProvider extends NSOperation implements UIActivityItemSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UIActivityItemProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIActivityItemProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIActivityItemProvider allocWithZone(VoidPtr zone);

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
    public static native UIActivityItemProvider new_objc();

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
     * activity type available when -item is called. nil at other times. use this in your -item method to customize the data to return
     */
    @Generated
    @Selector("activityType")
    public native String activityType();

    @Generated
    @IsOptional
    @Selector("activityViewController:dataTypeIdentifierForActivityType:")
    public native String activityViewControllerDataTypeIdentifierForActivityType(
            UIActivityViewController activityViewController, String activityType);

    @Generated
    @Selector("activityViewController:itemForActivityType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object activityViewControllerItemForActivityType(UIActivityViewController activityViewController,
            String activityType);

    @Generated
    @IsOptional
    @Selector("activityViewController:subjectForActivityType:")
    public native String activityViewControllerSubjectForActivityType(UIActivityViewController activityViewController,
            String activityType);

    @Generated
    @IsOptional
    @Selector("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    public native UIImage activityViewControllerThumbnailImageForActivityTypeSuggestedSize(
            UIActivityViewController activityViewController, String activityType, @ByValue CGSize size);

    @Generated
    @Selector("activityViewControllerPlaceholderItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object activityViewControllerPlaceholderItem(UIActivityViewController activityViewController);

    @Generated
    @Selector("init")
    public native UIActivityItemProvider init();

    /**
     * placeHolder is the return value for -activityViewControllerPlaceholderItem:
     */
    @Generated
    @Selector("initWithPlaceholderItem:")
    public native UIActivityItemProvider initWithPlaceholderItem(
            @Mapped(ObjCObjectMapper.class) Object placeholderItem);

    /**
     * called on secondary thread when user selects an activity. you must subclass and return a non-nil value. The item can use the UIActivityItemSource protocol to return extra information
     */
    @Generated
    @Selector("item")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object item();

    @Generated
    @Selector("placeholderItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object placeholderItem();

    @Generated
    @IsOptional
    @Selector("activityViewControllerLinkMetadata:")
    public native LPLinkMetadata activityViewControllerLinkMetadata(UIActivityViewController activityViewController);
}
