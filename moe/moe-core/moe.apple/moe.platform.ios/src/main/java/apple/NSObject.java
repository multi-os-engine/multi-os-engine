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

package apple;

import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSFileManager;
import apple.foundation.NSIndexSet;
import apple.foundation.NSInvocation;
import apple.foundation.NSKeyedArchiver;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSMutableOrderedSet;
import apple.foundation.NSMutableSet;
import apple.foundation.NSSet;
import apple.foundation.NSThread;
import apple.quartzcore.CAAnimation;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import apple.uikit.UIAccessibilityCustomAction;
import apple.uikit.UIBezierPath;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSObject extends ObjCObject implements apple.protocol.NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSObject(Pointer peer) {
        super(peer);
    }

    /**
     * accessInstanceVariablesDirectly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/clm/NSObject/accessInstanceVariablesDirectly">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * alloc</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/alloc">iOS Dev Center</a>
     */
    @Generated
    @Owned
    @Selector("alloc")
    public static native NSObject alloc();

    /**
     * allocWithZone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/allocWithZone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * automaticallyNotifiesObserversForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/clm/NSObject/automaticallyNotifiesObserversForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * cancelPreviousPerformRequestsWithTarget:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/cancelPreviousPerformRequestsWithTarget:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    /**
     * cancelPreviousPerformRequestsWithTarget:selector:object:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/cancelPreviousPerformRequestsWithTarget:selector:object:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * classFallbacksForKeyedArchiver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/classFallbacksForKeyedArchiver">iOS Dev Center</a>
     */
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    /**
     * classForKeyedUnarchiver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/classForKeyedUnarchiver">iOS Dev Center</a>
     */
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * initialize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/initialize">iOS Dev Center</a>
     */
    @Generated
    @Selector("initialize")
    public static native void initialize();

    /**
     * instanceMethodSignatureForSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/instanceMethodSignatureForSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    /**
     * instancesRespondToSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/instancesRespondToSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * isSubclassOfClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/isSubclassOfClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * keyPathsForValuesAffectingValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/clm/NSObject/keyPathsForValuesAffectingValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * load</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/load">iOS Dev Center</a>
     */
    @Generated
    @Selector("load")
    public static native void load_objc_static();

    /**
     * new</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/new">iOS Dev Center</a>
     */
    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * resolveClassMethod:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/resolveClassMethod:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    /**
     * resolveInstanceMethod:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/resolveInstanceMethod:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setVersion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/setVersion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * superclass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/superclass">iOS Dev Center</a>
     */
    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * version</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/version">iOS Dev Center</a>
     */
    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * instanceMethodForSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/instanceMethodForSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    /**
     * accessibilityActivate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityActivate">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityActivate")
    public native boolean accessibilityActivate();

    /**
     * accessibilityActivationPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityActivationPoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityActivationPoint")
    @ByValue
    public native CGPoint accessibilityActivationPoint();

    /**
     * accessibilityCustomActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityCustomActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityCustomActions")
    public native NSArray<? extends UIAccessibilityCustomAction> accessibilityCustomActions();

    /**
     * accessibilityDecrement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityDecrement">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityDecrement")
    public native void accessibilityDecrement();

    /**
     * accessibilityElementAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityContainer_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityElementAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object accessibilityElementAtIndex(@NInt long index);

    /**
     * accessibilityElementCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityContainer_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityElementCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementCount")
    @NInt
    public native long accessibilityElementCount();

    /**
     * accessibilityElementDidBecomeFocused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityFocus_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityElementDidBecomeFocused">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementDidBecomeFocused")
    public native void accessibilityElementDidBecomeFocused();

    /**
     * accessibilityElementDidLoseFocus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityFocus_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityElementDidLoseFocus">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementDidLoseFocus")
    public native void accessibilityElementDidLoseFocus();

    /**
     * accessibilityElementIsFocused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityFocus_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityElementIsFocused">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementIsFocused")
    public native boolean accessibilityElementIsFocused();

    /**
     * accessibilityElements</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityContainer_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityElements">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElements")
    public native NSArray<?> accessibilityElements();

    /**
     * accessibilityElementsHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityElementsHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityElementsHidden")
    public native boolean accessibilityElementsHidden();

    /**
     * accessibilityFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityFrame")
    @ByValue
    public native CGRect accessibilityFrame();

    /**
     * accessibilityHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityHint")
    public native String accessibilityHint();

    /**
     * accessibilityIncrement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityIncrement">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityIncrement")
    public native void accessibilityIncrement();

    /**
     * accessibilityLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    /**
     * accessibilityLanguage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityLanguage">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityLanguage")
    public native String accessibilityLanguage();

    /**
     * accessibilityNavigationStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityNavigationStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityNavigationStyle")
    @NInt
    public native long accessibilityNavigationStyle();

    /**
     * accessibilityPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityPath")
    public native UIBezierPath accessibilityPath();

    /**
     * accessibilityPerformEscape</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityPerformEscape">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityPerformEscape")
    public native boolean accessibilityPerformEscape();

    /**
     * accessibilityPerformMagicTap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityPerformMagicTap">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityPerformMagicTap")
    public native boolean accessibilityPerformMagicTap();

    /**
     * accessibilityScroll:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instm/NSObject/accessibilityScroll:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityScroll:")
    public native boolean accessibilityScroll(@NInt long direction);

    /**
     * accessibilityTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityTraits">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityTraits")
    public native long accessibilityTraits();

    /**
     * accessibilityValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityValue")
    public native String accessibilityValue();

    /**
     * accessibilityViewIsModal</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityViewIsModal">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessibilityViewIsModal")
    public native boolean accessibilityViewIsModal();

    /**
     * actionForLayer:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CALayerDelegate_protocol/index.html#//apple_ref/occ/instm/NSObject/actionForLayer:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionForLayer:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAAction actionForLayerForKey(CALayer layer, String event);

    /**
     * addObserver:forKeyPath:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/addObserver:forKeyPath:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    /**
     * animationDidStart:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instm/NSObject/animationDidStart:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animationDidStart:")
    public native void animationDidStart(CAAnimation anim);

    /**
     * animationDidStop:finished:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CAAnimation_class/index.html#//apple_ref/occ/instm/NSObject/animationDidStop:finished:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animationDidStop:finished:")
    public native void animationDidStopFinished(CAAnimation anim, boolean flag);

    /**
     * attemptRecoveryFromError:optionIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSErrorRecoveryAttempting_Protocol/index.html#//apple_ref/occ/instm/NSObject/attemptRecoveryFromError:optionIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attemptRecoveryFromError:optionIndex:")
    public native boolean attemptRecoveryFromErrorOptionIndex(NSError error, @NUInt long recoveryOptionIndex);

    /**
     * attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSErrorRecoveryAttempting_Protocol/index.html#//apple_ref/occ/instm/NSObject/attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    public native void attemptRecoveryFromErrorOptionIndexDelegateDidRecoverSelectorContextInfo(NSError error,
            @NUInt long recoveryOptionIndex, @Mapped(ObjCObjectMapper.class) Object delegate, SEL didRecoverSelector,
            VoidPtr contextInfo);

    /**
     * autoContentAccessingProxy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instp/NSObject/autoContentAccessingProxy">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoContentAccessingProxy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object autoContentAccessingProxy();

    /**
     * awakeAfterUsingCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/awakeAfterUsingCoder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("awakeAfterUsingCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object awakeAfterUsingCoder(NSCoder aDecoder);

    /**
     * awakeFromNib</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSObject_UIKitAdditions/index.html#//apple_ref/occ/instm/NSObject/awakeFromNib">iOS Dev Center</a>
     */
    @Generated
    @Selector("awakeFromNib")
    public native void awakeFromNib();

    @Generated
    @Selector("class")
    public native Class class_objc();

    /**
     * classForCoder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instp/NSObject/classForCoder">iOS Dev Center</a>
     */
    @Generated
    @Selector("classForCoder")
    public native Class classForCoder();

    /**
     * classForKeyedArchiver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instp/NSObject/classForKeyedArchiver">iOS Dev Center</a>
     */
    @Generated
    @Selector("classForKeyedArchiver")
    public native Class classForKeyedArchiver();

    /**
     * copy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/copy">iOS Dev Center</a>
     */
    @Generated
    @Owned
    @Selector("copy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copy();

    /**
     * copy:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/copy:">iOS Dev Center</a>
     */
    @Generated
    @Selector("copy:")
    public native void copy(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * cut:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/cut:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cut:")
    public native void cut(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * dealloc</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/dealloc">iOS Dev Center</a>
     */
    @Generated
    @Selector("dealloc")
    public native void dealloc();

    @Generated
    @IsOptional
    @Selector("debugDescription")
    public native String debugDescription();

    /**
     * decreaseSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSObject_UIKitAdditions/index.html#//apple_ref/occ/instm/NSObject/decreaseSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decreaseSize:")
    public native void decreaseSize(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * delete:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/delete:">iOS Dev Center</a>
     */
    @Generated
    @Selector("delete:")
    public native void delete(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("description")
    public native String description();

    /**
     * dictionaryWithValuesForKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/dictionaryWithValuesForKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dictionaryWithValuesForKeys:")
    public native NSDictionary<String, ?> dictionaryWithValuesForKeys(NSArray<String> keys);

    /**
     * didChange:valuesAtIndexes:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/didChange:valuesAtIndexes:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didChange:valuesAtIndexes:forKey:")
    public native void didChangeValuesAtIndexesForKey(@NUInt long changeKind, NSIndexSet indexes, String key);

    /**
     * didChangeValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/didChangeValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didChangeValueForKey:")
    public native void didChangeValueForKey(String key);

    /**
     * didChangeValueForKey:withSetMutation:usingObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/didChangeValueForKey:withSetMutation:usingObjects:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValueForKeyWithSetMutationUsingObjects(String key, @NUInt long mutationKind,
            NSSet<?> objects);

    /**
     * displayLayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CALayerDelegate_protocol/index.html#//apple_ref/occ/instm/NSObject/displayLayer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("displayLayer:")
    public native void displayLayer(CALayer layer);

    /**
     * doesNotRecognizeSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/doesNotRecognizeSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("doesNotRecognizeSelector:")
    public native void doesNotRecognizeSelector(SEL aSelector);

    /**
     * drawLayer:inContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CALayerDelegate_protocol/index.html#//apple_ref/occ/instm/NSObject/drawLayer:inContext:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawLayer:inContext:")
    public native void drawLayerInContext(CALayer layer, CGContextRef ctx);

    /**
     * fileManager:shouldProceedAfterError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSObject/fileManager:shouldProceedAfterError:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("fileManager:shouldProceedAfterError:")
    public native boolean fileManagerShouldProceedAfterError(NSFileManager fm, NSDictionary<?, ?> errorInfo);

    /**
     * fileManager:willProcessPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileManager_Class/index.html#//apple_ref/occ/instm/NSObject/fileManager:willProcessPath:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("fileManager:willProcessPath:")
    public native void fileManagerWillProcessPath(NSFileManager fm, String path);

    /**
     * finalize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/finalize">iOS Dev Center</a>
     */
    @Generated
    @Selector("finalize")
    public native void finalize_objc();

    /**
     * forwardInvocation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/forwardInvocation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("forwardInvocation:")
    public native void forwardInvocation(NSInvocation anInvocation);

    /**
     * forwardingTargetForSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/forwardingTargetForSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("forwardingTargetForSelector:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object forwardingTargetForSelector(SEL aSelector);

    @Generated
    @Selector("hash")
    @NUInt
    public native long hash();

    /**
     * increaseSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSObject_UIKitAdditions/index.html#//apple_ref/occ/instm/NSObject/increaseSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("increaseSize:")
    public native void increaseSize(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * indexOfAccessibilityElement:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityContainer_Protocol/index.html#//apple_ref/occ/instm/NSObject/indexOfAccessibilityElement:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfAccessibilityElement:")
    @NInt
    public native long indexOfAccessibilityElement(@Mapped(ObjCObjectMapper.class) Object element);

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSObject init();

    /**
     * isAccessibilityElement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/isAccessibilityElement">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAccessibilityElement")
    public native boolean isAccessibilityElement();

    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("isKindOfClass:")
    public native boolean isKindOfClass(Class aClass);

    @Generated
    @Selector("isMemberOfClass:")
    public native boolean isMemberOfClass(Class aClass);

    @Generated
    @Selector("isProxy")
    public native boolean isProxy();

    /**
     * layoutSublayersOfLayer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/QuartzCore/Reference/CALayerDelegate_protocol/index.html#//apple_ref/occ/instm/NSObject/layoutSublayersOfLayer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutSublayersOfLayer:")
    public native void layoutSublayersOfLayer(CALayer layer);

    /**
     * makeTextWritingDirectionLeftToRight:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/makeTextWritingDirectionLeftToRight:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeTextWritingDirectionLeftToRight:")
    public native void makeTextWritingDirectionLeftToRight(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * makeTextWritingDirectionRightToLeft:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/makeTextWritingDirectionRightToLeft:">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeTextWritingDirectionRightToLeft:")
    public native void makeTextWritingDirectionRightToLeft(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * methodSignatureForSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/methodSignatureForSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector(SEL aSelector);

    /**
     * mutableArrayValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableArrayValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableArrayValueForKey:")
    public native NSMutableArray<?> mutableArrayValueForKey(String key);

    /**
     * mutableArrayValueForKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableArrayValueForKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableArrayValueForKeyPath:")
    public native NSMutableArray<?> mutableArrayValueForKeyPath(String keyPath);

    /**
     * mutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/mutableCopy">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableCopy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopy();

    /**
     * mutableOrderedSetValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableOrderedSetValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableOrderedSetValueForKey:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKey(String key);

    /**
     * mutableOrderedSetValueForKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableOrderedSetValueForKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableOrderedSetValueForKeyPath:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKeyPath(String keyPath);

    /**
     * mutableSetValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableSetValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableSetValueForKey:")
    public native NSMutableSet<?> mutableSetValueForKey(String key);

    /**
     * mutableSetValueForKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/mutableSetValueForKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableSetValueForKeyPath:")
    public native NSMutableSet<?> mutableSetValueForKeyPath(String keyPath);

    @Generated
    @Selector("observationInfo")
    public native VoidPtr observationInfo();

    /**
     * observeValueForKeyPath:ofObject:change:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/observeValueForKeyPath:ofObject:change:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPathOfObjectChangeContext(String keyPath,
            @Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> change, VoidPtr context);

    /**
     * paste:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/paste:">iOS Dev Center</a>
     */
    @Generated
    @Selector("paste:")
    public native void paste(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("performSelector:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelector(SEL aSelector);

    /**
     * performSelector:onThread:withObject:waitUntilDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelector:onThread:withObject:waitUntilDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelector:onThread:withObject:waitUntilDone:")
    public native void performSelectorOnThreadWithObjectWaitUntilDone(SEL aSelector, NSThread thr,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_);

    /**
     * performSelector:onThread:withObject:waitUntilDone:modes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelector:onThread:withObject:waitUntilDone:modes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelector:onThread:withObject:waitUntilDone:modes:")
    public native void performSelectorOnThreadWithObjectWaitUntilDoneModes(SEL aSelector, NSThread thr,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_, NSArray<String> array);

    @Generated
    @Selector("performSelector:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObject(SEL aSelector, @Mapped(ObjCObjectMapper.class) Object object);

    /**
     * performSelector:withObject:afterDelay:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelector:withObject:afterDelay:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelector:withObject:afterDelay:")
    public native void performSelectorWithObjectAfterDelay(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument, double delay);

    /**
     * performSelector:withObject:afterDelay:inModes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelector:withObject:afterDelay:inModes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelector:withObject:afterDelay:inModes:")
    public native void performSelectorWithObjectAfterDelayInModes(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument, double delay, NSArray<String> modes);

    @Generated
    @Selector("performSelector:withObject:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObjectWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object object1, @Mapped(ObjCObjectMapper.class) Object object2);

    /**
     * performSelectorInBackground:withObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelectorInBackground:withObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelectorInBackground:withObject:")
    public native void performSelectorInBackgroundWithObject(SEL aSelector, @Mapped(ObjCObjectMapper.class) Object arg);

    /**
     * performSelectorOnMainThread:withObject:waitUntilDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelectorOnMainThread:withObject:waitUntilDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelectorOnMainThread:withObject:waitUntilDone:")
    public native void performSelectorOnMainThreadWithObjectWaitUntilDone(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_);

    /**
     * performSelectorOnMainThread:withObject:waitUntilDone:modes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/performSelectorOnMainThread:withObject:waitUntilDone:modes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSelectorOnMainThread:withObject:waitUntilDone:modes:")
    public native void performSelectorOnMainThreadWithObjectWaitUntilDoneModes(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_, NSArray<String> array);

    /**
     * prepareForInterfaceBuilder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSObject_UIKitAdditions/index.html#//apple_ref/occ/instm/NSObject/prepareForInterfaceBuilder">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareForInterfaceBuilder")
    public native void prepareForInterfaceBuilder();

    /**
     * removeObserver:forKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/removeObserver:forKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(NSObject observer, String keyPath);

    /**
     * removeObserver:forKeyPath:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/removeObserver:forKeyPath:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    /**
     * replacementObjectForCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/replacementObjectForCoder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replacementObjectForCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object replacementObjectForCoder(NSCoder aCoder);

    /**
     * replacementObjectForKeyedArchiver:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/replacementObjectForKeyedArchiver:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replacementObjectForKeyedArchiver:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object replacementObjectForKeyedArchiver(NSKeyedArchiver archiver);

    @Generated
    @Selector("respondsToSelector:")
    public native boolean respondsToSelector(SEL aSelector);

    /**
     * select:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/select:">iOS Dev Center</a>
     */
    @Generated
    @Selector("select:")
    public native void select(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * selectAll:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/selectAll:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectAll:")
    public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("self")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object self();

    /**
     * accessibilityActivationPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityActivationPoint">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityActivationPoint:")
    public native void setAccessibilityActivationPoint(@ByValue CGPoint value);

    /**
     * accessibilityCustomActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityAction_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityCustomActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityCustomActions:")
    public native void setAccessibilityCustomActions(NSArray<? extends UIAccessibilityCustomAction> value);

    /**
     * accessibilityElements</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibilityContainer_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityElements">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityElements:")
    public native void setAccessibilityElements(NSArray<?> value);

    /**
     * accessibilityElementsHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityElementsHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean value);

    /**
     * accessibilityFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByValue CGRect value);

    /**
     * accessibilityHint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityHint">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityHint:")
    public native void setAccessibilityHint(String value);

    /**
     * accessibilityLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityLabel">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    /**
     * accessibilityLanguage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityLanguage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityLanguage:")
    public native void setAccessibilityLanguage(String value);

    /**
     * accessibilityNavigationStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityNavigationStyle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityNavigationStyle:")
    public native void setAccessibilityNavigationStyle(@NInt long value);

    /**
     * accessibilityPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityPath:")
    public native void setAccessibilityPath(UIBezierPath value);

    /**
     * accessibilityTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityTraits">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityTraits:")
    public native void setAccessibilityTraits(long value);

    /**
     * accessibilityValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityValue">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityValue:")
    public native void setAccessibilityValue(String value);

    /**
     * accessibilityViewIsModal</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/accessibilityViewIsModal">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAccessibilityViewIsModal:")
    public native void setAccessibilityViewIsModal(boolean value);

    /**
     * isAccessibilityElement</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/isAccessibilityElement">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean value);

    /**
     * setNilValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/setNilValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNilValueForKey:")
    public native void setNilValueForKey(String key);

    @Generated
    @Selector("setObservationInfo:")
    public native void setObservationInfo(VoidPtr value);

    /**
     * shouldGroupAccessibilityChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/shouldGroupAccessibilityChildren">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldGroupAccessibilityChildren:")
    public native void setShouldGroupAccessibilityChildren(boolean value);

    /**
     * setValue:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/setValue:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * setValue:forKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/setValue:forKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forKeyPath:")
    public native void setValueForKeyPath(@Mapped(ObjCObjectMapper.class) Object value, String keyPath);

    /**
     * setValue:forUndefinedKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/setValue:forUndefinedKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValue:forUndefinedKey:")
    public native void setValueForUndefinedKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * setValuesForKeysWithDictionary:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/setValuesForKeysWithDictionary:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setValuesForKeysWithDictionary:")
    public native void setValuesForKeysWithDictionary(NSDictionary<String, ?> keyedValues);

    /**
     * shouldGroupAccessibilityChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIAccessibility_Protocol/index.html#//apple_ref/occ/instp/NSObject/shouldGroupAccessibilityChildren">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldGroupAccessibilityChildren")
    public native boolean shouldGroupAccessibilityChildren();

    @Generated
    @Selector("superclass")
    public native Class superclass();

    /**
     * toggleBoldface:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/toggleBoldface:">iOS Dev Center</a>
     */
    @Generated
    @Selector("toggleBoldface:")
    public native void toggleBoldface(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * toggleItalics:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/toggleItalics:">iOS Dev Center</a>
     */
    @Generated
    @Selector("toggleItalics:")
    public native void toggleItalics(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * toggleUnderline:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIResponderStandardEditActions_Protocol/index.html#//apple_ref/occ/instm/NSObject/toggleUnderline:">iOS Dev Center</a>
     */
    @Generated
    @Selector("toggleUnderline:")
    public native void toggleUnderline(@Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * validateValue:forKey:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/validateValue:forKey:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("validateValue:forKey:error:")
    public native boolean validateValueForKeyError(Ptr<ObjCObject> ioValue, String inKey, Ptr<NSError> outError);

    /**
     * validateValue:forKeyPath:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/validateValue:forKeyPath:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("validateValue:forKeyPath:error:")
    public native boolean validateValueForKeyPathError(Ptr<ObjCObject> ioValue, String inKeyPath,
            Ptr<NSError> outError);

    /**
     * valueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/valueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    /**
     * valueForKeyPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/valueForKeyPath:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForKeyPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKeyPath(String keyPath);

    /**
     * valueForUndefinedKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueCoding_Protocol/index.html#//apple_ref/occ/instm/NSObject/valueForUndefinedKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("valueForUndefinedKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForUndefinedKey(String key);

    /**
     * willChange:valuesAtIndexes:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/willChange:valuesAtIndexes:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willChange:valuesAtIndexes:forKey:")
    public native void willChangeValuesAtIndexesForKey(@NUInt long changeKind, NSIndexSet indexes, String key);

    /**
     * willChangeValueForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/willChangeValueForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willChangeValueForKey:")
    public native void willChangeValueForKey(String key);

    /**
     * willChangeValueForKey:withSetMutation:usingObjects:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSKeyValueObserving_Protocol/index.html#//apple_ref/occ/instm/NSObject/willChangeValueForKey:withSetMutation:usingObjects:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValueForKeyWithSetMutationUsingObjects(String key, @NUInt long mutationKind,
            NSSet<?> objects);

    @Generated
    @Selector("accessibilityAssistiveTechnologyFocusedIdentifiers")
    public native NSSet<String> accessibilityAssistiveTechnologyFocusedIdentifiers();

    /**
     * methodForSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/methodForSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("methodForSelector:")
    @FunctionPtr(name = "call_methodForSelector_ret")
    public native Function_methodForSelector_ret methodForSelector(SEL aSelector);

    /**
     * provideImageData:bytesPerRow:origin::size::userInfo:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Protocols/CIImageProvider_Protocol/index.html#//apple_ref/occ/instm/NSObject/provideImageData:bytesPerRow:origin::size::userInfo:">iOS Dev Center</a>
     */
    @Generated
    @Selector("provideImageData:bytesPerRow:origin::size::userInfo:")
    public native void provideImageDataBytesPerRowOrigin_Size_UserInfo(VoidPtr data, @NUInt long rowbytes,
            @NUInt long x, @NUInt long y, @NUInt long width, @NUInt long height,
            @Mapped(ObjCObjectMapper.class) Object info);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_instanceMethodForSelector_ret {
        @Generated
        void call_instanceMethodForSelector_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Function_methodForSelector_ret {
        @Generated
        void call_methodForSelector_ret();
    }
}
