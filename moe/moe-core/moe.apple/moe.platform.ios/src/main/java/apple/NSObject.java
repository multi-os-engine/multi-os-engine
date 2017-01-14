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
import apple.uikit.UIAccessibilityCustomAction;
import apple.uikit.UIAccessibilityCustomRotor;
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
import org.moe.natj.general.ann.ReferenceInfo;
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSObject alloc();

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
    public static native Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

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
    @Selector("accessibilityActivate")
    public native boolean accessibilityActivate();

    @Generated
    @Selector("accessibilityActivationPoint")
    @ByValue
    public native CGPoint accessibilityActivationPoint();

    @Generated
    @Selector("accessibilityAssistiveTechnologyFocusedIdentifiers")
    public native NSSet<String> accessibilityAssistiveTechnologyFocusedIdentifiers();

    @Generated
    @Selector("accessibilityCustomActions")
    public native NSArray<? extends UIAccessibilityCustomAction> accessibilityCustomActions();

    @Generated
    @Selector("accessibilityCustomRotors")
    public native NSArray<? extends UIAccessibilityCustomRotor> accessibilityCustomRotors();

    @Generated
    @Selector("accessibilityDecrement")
    public native void accessibilityDecrement();

    @Generated
    @Selector("accessibilityElementAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object accessibilityElementAtIndex(@NInt long index);

    @Generated
    @Selector("accessibilityElementCount")
    @NInt
    public native long accessibilityElementCount();

    @Generated
    @Selector("accessibilityElementDidBecomeFocused")
    public native void accessibilityElementDidBecomeFocused();

    @Generated
    @Selector("accessibilityElementDidLoseFocus")
    public native void accessibilityElementDidLoseFocus();

    @Generated
    @Selector("accessibilityElementIsFocused")
    public native boolean accessibilityElementIsFocused();

    @Generated
    @Selector("accessibilityElements")
    public native NSArray<?> accessibilityElements();

    @Generated
    @Selector("accessibilityElementsHidden")
    public native boolean accessibilityElementsHidden();

    @Generated
    @Selector("accessibilityFrame")
    @ByValue
    public native CGRect accessibilityFrame();

    @Generated
    @Selector("accessibilityHint")
    public native String accessibilityHint();

    @Generated
    @Selector("accessibilityIncrement")
    public native void accessibilityIncrement();

    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    @Generated
    @Selector("accessibilityLanguage")
    public native String accessibilityLanguage();

    @Generated
    @Selector("accessibilityNavigationStyle")
    @NInt
    public native long accessibilityNavigationStyle();

    @Generated
    @Selector("accessibilityPath")
    public native UIBezierPath accessibilityPath();

    @Generated
    @Selector("accessibilityPerformEscape")
    public native boolean accessibilityPerformEscape();

    @Generated
    @Selector("accessibilityPerformMagicTap")
    public native boolean accessibilityPerformMagicTap();

    @Generated
    @Selector("accessibilityScroll:")
    public native boolean accessibilityScroll(@NInt long direction);

    @Generated
    @Selector("accessibilityTraits")
    public native long accessibilityTraits();

    @Generated
    @Selector("accessibilityValue")
    public native String accessibilityValue();

    @Generated
    @Selector("accessibilityViewIsModal")
    public native boolean accessibilityViewIsModal();

    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    @Generated
    @Selector("attemptRecoveryFromError:optionIndex:")
    public native boolean attemptRecoveryFromErrorOptionIndex(NSError error, @NUInt long recoveryOptionIndex);

    @Generated
    @Selector("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    public native void attemptRecoveryFromErrorOptionIndexDelegateDidRecoverSelectorContextInfo(NSError error,
            @NUInt long recoveryOptionIndex, @Mapped(ObjCObjectMapper.class) Object delegate, SEL didRecoverSelector,
            VoidPtr contextInfo);

    @Generated
    @Selector("autoContentAccessingProxy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object autoContentAccessingProxy();

    @Generated
    @Selector("awakeAfterUsingCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object awakeAfterUsingCoder(NSCoder aDecoder);

    @Generated
    @Selector("awakeFromNib")
    public native void awakeFromNib();

    @Generated
    @Selector("class")
    public native Class class_objc();

    @Generated
    @Selector("classForCoder")
    public native Class classForCoder();

    @Generated
    @Selector("classForKeyedArchiver")
    public native Class classForKeyedArchiver();

    @Generated
    @Owned
    @Selector("copy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copy();

    public final void dealloc() {
        System.err.println("Calling dealloc is a no-op. Use ObjCRuntime.dispose(...) instead.");
        new RuntimeException().printStackTrace(System.err);
    }

    @Generated
    @IsOptional
    @Selector("debugDescription")
    public native String debugDescription();

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("dictionaryWithValuesForKeys:")
    public native NSDictionary<String, ?> dictionaryWithValuesForKeys(NSArray<String> keys);

    @Generated
    @Selector("didChange:valuesAtIndexes:forKey:")
    public native void didChangeValuesAtIndexesForKey(@NUInt long changeKind, NSIndexSet indexes, String key);

    @Generated
    @Selector("didChangeValueForKey:")
    public native void didChangeValueForKey(String key);

    @Generated
    @Selector("didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValueForKeyWithSetMutationUsingObjects(String key, @NUInt long mutationKind,
            NSSet<?> objects);

    @Generated
    @Selector("doesNotRecognizeSelector:")
    public native void doesNotRecognizeSelector(SEL aSelector);

    @Generated
    @Deprecated
    @Selector("fileManager:shouldProceedAfterError:")
    public native boolean fileManagerShouldProceedAfterError(NSFileManager fm, NSDictionary<?, ?> errorInfo);

    @Generated
    @Deprecated
    @Selector("fileManager:willProcessPath:")
    public native void fileManagerWillProcessPath(NSFileManager fm, String path);

    @Generated
    @Deprecated
    @Selector("finalize")
    public native void finalize_objc();

    @Generated
    @Selector("forwardInvocation:")
    public native void forwardInvocation(NSInvocation anInvocation);

    @Generated
    @Selector("forwardingTargetForSelector:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object forwardingTargetForSelector(SEL aSelector);

    @Generated
    @Selector("hash")
    @NUInt
    public native long hash();

    @Generated
    @Selector("indexOfAccessibilityElement:")
    @NInt
    public native long indexOfAccessibilityElement(@Mapped(ObjCObjectMapper.class) Object element);

    @Generated
    @Selector("init")
    public native NSObject init();

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

    @Generated
    @Selector("methodForSelector:")
    @FunctionPtr(name = "call_methodForSelector_ret")
    public native Function_methodForSelector_ret methodForSelector(SEL aSelector);

    @Generated
    @Selector("methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("mutableArrayValueForKey:")
    public native NSMutableArray<?> mutableArrayValueForKey(String key);

    @Generated
    @Selector("mutableArrayValueForKeyPath:")
    public native NSMutableArray<?> mutableArrayValueForKeyPath(String keyPath);

    @Generated
    @Selector("mutableCopy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopy();

    @Generated
    @Selector("mutableOrderedSetValueForKey:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKey(String key);

    @Generated
    @Selector("mutableOrderedSetValueForKeyPath:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKeyPath(String keyPath);

    @Generated
    @Selector("mutableSetValueForKey:")
    public native NSMutableSet<?> mutableSetValueForKey(String key);

    @Generated
    @Selector("mutableSetValueForKeyPath:")
    public native NSMutableSet<?> mutableSetValueForKeyPath(String keyPath);

    @Generated
    @Selector("observationInfo")
    public native VoidPtr observationInfo();

    @Generated
    @Selector("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPathOfObjectChangeContext(String keyPath,
            @Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> change, VoidPtr context);

    @Generated
    @Selector("performSelector:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelector(SEL aSelector);

    @Generated
    @Selector("performSelector:onThread:withObject:waitUntilDone:")
    public native void performSelectorOnThreadWithObjectWaitUntilDone(SEL aSelector, NSThread thr,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_);

    @Generated
    @Selector("performSelector:onThread:withObject:waitUntilDone:modes:")
    public native void performSelectorOnThreadWithObjectWaitUntilDoneModes(SEL aSelector, NSThread thr,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_, NSArray<String> array);

    @Generated
    @Selector("performSelector:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObject(SEL aSelector, @Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("performSelector:withObject:afterDelay:")
    public native void performSelectorWithObjectAfterDelay(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument, double delay);

    @Generated
    @Selector("performSelector:withObject:afterDelay:inModes:")
    public native void performSelectorWithObjectAfterDelayInModes(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument, double delay, NSArray<String> modes);

    @Generated
    @Selector("performSelector:withObject:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObjectWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object object1, @Mapped(ObjCObjectMapper.class) Object object2);

    @Generated
    @Selector("performSelectorInBackground:withObject:")
    public native void performSelectorInBackgroundWithObject(SEL aSelector, @Mapped(ObjCObjectMapper.class) Object arg);

    @Generated
    @Selector("performSelectorOnMainThread:withObject:waitUntilDone:")
    public native void performSelectorOnMainThreadWithObjectWaitUntilDone(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_);

    @Generated
    @Selector("performSelectorOnMainThread:withObject:waitUntilDone:modes:")
    public native void performSelectorOnMainThreadWithObjectWaitUntilDoneModes(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object arg, boolean wait_, NSArray<String> array);

    @Generated
    @Selector("prepareForInterfaceBuilder")
    public native void prepareForInterfaceBuilder();

    @Generated
    @Selector("provideImageData:bytesPerRow:origin::size::userInfo:")
    public native void provideImageDataBytesPerRowOrigin_Size_UserInfo(VoidPtr data, @NUInt long rowbytes,
            @NUInt long x, @NUInt long y, @NUInt long width, @NUInt long height,
            @Mapped(ObjCObjectMapper.class) Object info);

    @Generated
    @Selector("removeObserver:forKeyPath:")
    public native void removeObserverForKeyPath(NSObject observer, String keyPath);

    @Generated
    @Selector("removeObserver:forKeyPath:context:")
    public native void removeObserverForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    @Generated
    @Selector("replacementObjectForCoder:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object replacementObjectForCoder(NSCoder aCoder);

    @Generated
    @Selector("replacementObjectForKeyedArchiver:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object replacementObjectForKeyedArchiver(NSKeyedArchiver archiver);

    @Generated
    @Selector("respondsToSelector:")
    public native boolean respondsToSelector(SEL aSelector);

    @Generated
    @Selector("self")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object self();

    @Generated
    @Selector("setAccessibilityActivationPoint:")
    public native void setAccessibilityActivationPoint(@ByValue CGPoint value);

    @Generated
    @Selector("setAccessibilityCustomActions:")
    public native void setAccessibilityCustomActions(NSArray<? extends UIAccessibilityCustomAction> value);

    @Generated
    @Selector("setAccessibilityCustomRotors:")
    public native void setAccessibilityCustomRotors(NSArray<? extends UIAccessibilityCustomRotor> value);

    @Generated
    @Selector("setAccessibilityElements:")
    public native void setAccessibilityElements(NSArray<?> value);

    @Generated
    @Selector("setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean value);

    @Generated
    @Selector("setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByValue CGRect value);

    @Generated
    @Selector("setAccessibilityHint:")
    public native void setAccessibilityHint(String value);

    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    @Generated
    @Selector("setAccessibilityLanguage:")
    public native void setAccessibilityLanguage(String value);

    @Generated
    @Selector("setAccessibilityNavigationStyle:")
    public native void setAccessibilityNavigationStyle(@NInt long value);

    @Generated
    @Selector("setAccessibilityPath:")
    public native void setAccessibilityPath(UIBezierPath value);

    @Generated
    @Selector("setAccessibilityTraits:")
    public native void setAccessibilityTraits(long value);

    @Generated
    @Selector("setAccessibilityValue:")
    public native void setAccessibilityValue(String value);

    @Generated
    @Selector("setAccessibilityViewIsModal:")
    public native void setAccessibilityViewIsModal(boolean value);

    @Generated
    @Selector("setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean value);

    @Generated
    @Selector("setNilValueForKey:")
    public native void setNilValueForKey(String key);

    @Generated
    @Selector("setObservationInfo:")
    public native void setObservationInfo(VoidPtr value);

    @Generated
    @Selector("setShouldGroupAccessibilityChildren:")
    public native void setShouldGroupAccessibilityChildren(boolean value);

    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setValue:forKeyPath:")
    public native void setValueForKeyPath(@Mapped(ObjCObjectMapper.class) Object value, String keyPath);

    @Generated
    @Selector("setValue:forUndefinedKey:")
    public native void setValueForUndefinedKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setValuesForKeysWithDictionary:")
    public native void setValuesForKeysWithDictionary(NSDictionary<String, ?> keyedValues);

    @Generated
    @Selector("shouldGroupAccessibilityChildren")
    public native boolean shouldGroupAccessibilityChildren();

    @Generated
    @Selector("superclass")
    public native Class superclass();

    @Generated
    @Selector("validateValue:forKey:error:")
    public native boolean validateValueForKeyError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> ioValue,
            String inKey, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("validateValue:forKeyPath:error:")
    public native boolean validateValueForKeyPathError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> ioValue,
            String inKeyPath, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    @Generated
    @Selector("valueForKeyPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKeyPath(String keyPath);

    @Generated
    @Selector("valueForUndefinedKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForUndefinedKey(String key);

    @Generated
    @Selector("willChange:valuesAtIndexes:forKey:")
    public native void willChangeValuesAtIndexesForKey(@NUInt long changeKind, NSIndexSet indexes, String key);

    @Generated
    @Selector("willChangeValueForKey:")
    public native void willChangeValueForKey(String key);

    @Generated
    @Selector("willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValueForKeyWithSetMutationUsingObjects(String key, @NUInt long mutationKind,
            NSSet<?> objects);

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
