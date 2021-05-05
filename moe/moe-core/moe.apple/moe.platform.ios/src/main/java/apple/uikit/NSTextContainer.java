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
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextContainer extends NSObject implements NSSecureCoding, NSTextLayoutOrientationProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextContainer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextContainer alloc();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Default value : empty array  An array of UIBezierPath representing the exclusion paths inside the receiver's bounding rect.
     */
    @Generated
    @Selector("exclusionPaths")
    public native NSArray<? extends UIBezierPath> exclusionPaths();

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
     * Initialization ***************************
     */
    @Generated
    @Selector("initWithSize:")
    public native NSTextContainer initWithSize(@ByValue CGSize size);

    /**
     * Returns YES if the receiver is a rectangular shape defined simply by -size. TextKit utilizes this information for enabling various layout optimizations. NSLayoutManager disables non-contiguous layout when this property is NO. The default implementation returns NO when -exclusionPaths has 1 or more items, -maximumNumberOfLines is not 0, or -lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect: is overridden. It's recommended to override this property when -lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect: is overridden.
     */
    @Generated
    @Selector("isSimpleRectangularTextContainer")
    public native boolean isSimpleRectangularTextContainer();

    /**
     * Accessor for the NSLayoutManager object owning the receiver.
     * Avoid assigning a layout manager directly through this property.  Adding a text container to a layout manager through -[NSLayoutManager addTextContainer:] will use the property for assigning the new layout manager.
     */
    @Generated
    @Selector("layoutManager")
    public native NSLayoutManager layoutManager();

    @Generated
    @Selector("layoutOrientation")
    @NInt
    public native long layoutOrientation();

    /**
     * Default value: NSLineBreakByWordWrapping  The line break mode defines the behavior of the last line inside the text container.
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * Default value: 5.0  The layout padding at the beginning and end of the line fragment rects insetting the layout width available for the contents.  This value is utilized by NSLayoutManager for determining the layout width.
     */
    @Generated
    @Selector("lineFragmentPadding")
    @NFloat
    public native double lineFragmentPadding();

    /**
     * Returns the bounds of a line fragment rect inside the receiver for proposedRect.  This is the intersection of proposedRect and the receiver's bounding rect defined by -size property.  The regions defined by -exclusionPaths property are excluded from the return value.  charIndex is the character location inside the text storage for the line fragment being processed.  It is possible that proposedRect can be divided into multiple line fragments due to exclusion paths.  In that case, remainingRect returns the remainder that can be passed in as the proposed rect for the next iteration.  baseWritingDirection determines the direction of advancement for line fragments inside a visual horizontal line.  The values passed into the method are either NSWritingDirectionLeftToRight or NSWritingDirectionRightToLeft.  This method can be overridden by subclasses for further text container region customization.
     */
    @Generated
    @Selector("lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
    @ByValue
    public native CGRect lineFragmentRectForProposedRectAtIndexWritingDirectionRemainingRect(
            @ByValue CGRect proposedRect, @NUInt long characterIndex, @NInt long baseWritingDirection,
            CGRect remainingRect);

    /**
     * Default value: 0 (no limit)  The maximum number of lines that can be stored in the receiver.  This value is utilized by NSLayoutManager for determining the maximum number of lines associated with the text container.
     */
    @Generated
    @Selector("maximumNumberOfLines")
    @NUInt
    public native long maximumNumberOfLines();

    /**
     * This method should be used instead of the primitive -setLayoutManager: if you need to replace a container's layoutManager with a new one leaving the rest of the web intact.  All the NSTextContainers on the old NSLayoutManager get transferred to the new one.  This method deals with all the work of making sure the containers don't get deallocated and removing the old layoutManager from the text storage and replacing it with the new one.
     */
    @Generated
    @Selector("replaceLayoutManager:")
    public native void replaceLayoutManager(NSLayoutManager newLayoutManager);

    /**
     * Default value : empty array  An array of UIBezierPath representing the exclusion paths inside the receiver's bounding rect.
     */
    @Generated
    @Selector("setExclusionPaths:")
    public native void setExclusionPaths(NSArray<? extends UIBezierPath> value);

    @Generated
    @Selector("setHeightTracksTextView:")
    public native void setHeightTracksTextView(boolean value);

    /**
     * Accessor for the NSLayoutManager object owning the receiver.
     * Avoid assigning a layout manager directly through this property.  Adding a text container to a layout manager through -[NSLayoutManager addTextContainer:] will use the property for assigning the new layout manager.
     */
    @Generated
    @Selector("setLayoutManager:")
    public native void setLayoutManager_unsafe(NSLayoutManager value);

    /**
     * Accessor for the NSLayoutManager object owning the receiver.
     * Avoid assigning a layout manager directly through this property.  Adding a text container to a layout manager through -[NSLayoutManager addTextContainer:] will use the property for assigning the new layout manager.
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
     * Default value: NSLineBreakByWordWrapping  The line break mode defines the behavior of the last line inside the text container.
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * Default value: 5.0  The layout padding at the beginning and end of the line fragment rects insetting the layout width available for the contents.  This value is utilized by NSLayoutManager for determining the layout width.
     */
    @Generated
    @Selector("setLineFragmentPadding:")
    public native void setLineFragmentPadding(@NFloat double value);

    /**
     * Default value: 0 (no limit)  The maximum number of lines that can be stored in the receiver.  This value is utilized by NSLayoutManager for determining the maximum number of lines associated with the text container.
     */
    @Generated
    @Selector("setMaximumNumberOfLines:")
    public native void setMaximumNumberOfLines(@NUInt long value);

    /**
     * Default value: CGSizeZero  Defines the maximum size for the layout area returned from -lineFragmentRectForProposedRect:writingDirection:remainingRect:.  0.0 and less means no limitation.
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * Default value: NO  Define whether the text container view bounds changes can affect the text container size.
     */
    @Generated
    @Selector("setWidthTracksTextView:")
    public native void setWidthTracksTextView(boolean value);

    /**
     * Default value: CGSizeZero  Defines the maximum size for the layout area returned from -lineFragmentRectForProposedRect:writingDirection:remainingRect:.  0.0 and less means no limitation.
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * Default value: NO  Define whether the text container view bounds changes can affect the text container size.
     */
    @Generated
    @Selector("widthTracksTextView")
    public native boolean widthTracksTextView();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
