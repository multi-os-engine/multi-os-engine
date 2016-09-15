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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.NSTextLayoutOrientationProvider;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextContainer extends NSObject implements NSCoding, NSTextLayoutOrientationProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextContainer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextContainer alloc();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * exclusionPaths</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/exclusionPaths">iOS Dev Center</a>
     */
    @Generated
    @Selector("exclusionPaths")
    public native NSArray<? extends UIBezierPath> exclusionPaths();

    /**
     * heightTracksTextView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/heightTracksTextView">iOS Dev Center</a>
     */
    @Generated
    @Selector("heightTracksTextView")
    public native boolean heightTracksTextView();

    @Generated
    @Selector("init")
    public native NSTextContainer init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextContainer initWithCoder(NSCoder coder);

    /**
     * initWithSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instm/NSTextContainer/initWithSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSize:")
    public native NSTextContainer initWithSize(@ByValue CGSize size);

    /**
     * layoutManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/layoutManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutManager")
    public native NSLayoutManager layoutManager();

    @Generated
    @Selector("layoutOrientation")
    @NInt
    public native long layoutOrientation();

    /**
     * lineBreakMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/lineBreakMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * lineFragmentPadding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/lineFragmentPadding">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentPadding")
    @NFloat
    public native double lineFragmentPadding();

    /**
     * lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instm/NSTextContainer/lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
    @ByValue
    public native CGRect lineFragmentRectForProposedRectAtIndexWritingDirectionRemainingRect(
            @ByValue CGRect proposedRect, @NUInt long characterIndex, @NInt long baseWritingDirection,
            CGRect remainingRect);

    /**
     * maximumNumberOfLines</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/maximumNumberOfLines">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumNumberOfLines")
    @NUInt
    public native long maximumNumberOfLines();

    /**
     * exclusionPaths</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/exclusionPaths">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExclusionPaths:")
    public native void setExclusionPaths(NSArray<? extends UIBezierPath> value);

    /**
     * heightTracksTextView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/heightTracksTextView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHeightTracksTextView:")
    public native void setHeightTracksTextView(boolean value);

    /**
     * layoutManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/layoutManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLayoutManager:")
    public native void setLayoutManager_unsafe(NSLayoutManager value);

    /**
     * layoutManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/layoutManager">iOS Dev Center</a>
     */
    @Generated
    public void setLayoutManager(NSLayoutManager value) {
        Object __old = layoutManager();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setLayoutManager_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * lineBreakMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/lineBreakMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * lineFragmentPadding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/lineFragmentPadding">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineFragmentPadding:")
    public native void setLineFragmentPadding(@NFloat double value);

    /**
     * maximumNumberOfLines</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/maximumNumberOfLines">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumNumberOfLines:")
    public native void setMaximumNumberOfLines(@NUInt long value);

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * widthTracksTextView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/widthTracksTextView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWidthTracksTextView:")
    public native void setWidthTracksTextView(boolean value);

    /**
     * size</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/size">iOS Dev Center</a>
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * widthTracksTextView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/widthTracksTextView">iOS Dev Center</a>
     */
    @Generated
    @Selector("widthTracksTextView")
    public native boolean widthTracksTextView();

    /**
     * simpleRectangularTextContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instp/NSTextContainer/simpleRectangularTextContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSimpleRectangularTextContainer")
    public native boolean isSimpleRectangularTextContainer();

    /**
     * replaceLayoutManager:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSTextContainer_Class/index.html#//apple_ref/occ/instm/NSTextContainer/replaceLayoutManager:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceLayoutManager:")
    public native void replaceLayoutManager(NSLayoutManager newLayoutManager);

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
