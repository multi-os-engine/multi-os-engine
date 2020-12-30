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
import apple.foundation.NSAttributedString;
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
import apple.uikit.UIAccessibilityLocationDescriptor;
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

    /**
     * Return YES if -valueForKey:, -setValue:forKey:, -mutableArrayValueForKey:, -storedValueForKey:, -takeStoredValue:forKey:, and -takeValue:forKey: may directly manipulate instance variables when sent to instances of the receiving class, NO otherwise. The default implementation of this property returns YES.
     */
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

    /**
     * Return YES if the key-value observing machinery should automatically invoke -willChangeValueForKey:/-didChangeValueForKey:, -willChange:valuesAtIndexes:forKey:/-didChange:valuesAtIndexes:forKey:, or -willChangeValueForKey:withSetMutation:usingObjects:/-didChangeValueForKey:withSetMutation:usingObjects: whenever instances of the class receive key-value coding messages for the key, or mutating key-value coding-compliant methods for the key are invoked. Return NO otherwise. Starting in Mac OS 10.5, the default implementation of this method searches the receiving class for a method whose name matches the pattern +automaticallyNotifiesObserversOf<Key>, and returns the result of invoking that method if it is found. So, any such method must return BOOL too. If no such method is found YES is returned.
     */
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

    /**
     * Implemented by classes to substitute new instances for the receiving
     * instance during encoding.  The returned object will be encoded instead
     * of the receiver (if different).  This method is called only if no
     * replacement mapping for the object has been set up in the archiver yet
     * (for example, due to a previous call of replacementObjectForKeyedArchiver:
     * to that object).  This method returns the result of
     * [self replacementObjectForArchiver:nil] by default, NOT
     * -replacementObjectForCoder: as might be expected.  This is a concession
     * to source compatibility.
     */
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

    /**
     * Return a set of key paths for properties whose values affect the value of the keyed property. When an observer for the key is registered with an instance of the receiving class, KVO itself automatically observes all of the key paths for the same instance, and sends change notifications for the key to the observer when the value for any of those key paths changes. The default implementation of this method searches the receiving class for a method whose name matches the pattern +keyPathsForValuesAffecting<Key>, and returns the result of invoking that method if it is found. So, any such method must return an NSSet too. If no such method is found, an NSSet that is computed from information provided by previous invocations of the now-deprecated +setKeys:triggerChangeNotificationsForDependentKey: method is returned, for backward binary compatibility.
     * 
     * This method and KVO's automatic use of it comprise a dependency mechanism that you can use instead of sending -willChangeValueForKey:/-didChangeValueForKey: messages for dependent, computed, properties.
     * 
     * You can override this method when the getter method of one of your properties computes a value to return using the values of other properties, including those that are located by key paths. Your override should typically invoke super and return a set that includes any members in the set that result from doing that (so as not to interfere with overrides of this method in superclasses).
     * 
     * You can't really override this method when you add a computed property to an existing class using a category, because you're not supposed to override methods in categories. In that case, implement a matching +keyPathsForValuesAffecting<Key> to take advantage of this mechanism.
     */
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

    /**
     * Implement accessibilityActivate on an element in order to handle the default action.
     * For example, if a native control requires a swipe gesture, you may implement this method so that a
     * VoiceOver user will perform a double-tap to activate the item.
     * If your implementation successfully handles activate, return YES, otherwise return NO.
     * default == NO
     */
    @Generated
    @Selector("accessibilityActivate")
    public native boolean accessibilityActivate();

    /**
     * Returns the activation point for an accessible element in screen coordinates.
     * default == Mid-point of the accessibilityFrame.
     */
    @Generated
    @Selector("accessibilityActivationPoint")
    @ByValue
    public native CGPoint accessibilityActivationPoint();

    /**
     * Returns a set of identifier keys indicating which technology is focused on this object
     */
    @Generated
    @Selector("accessibilityAssistiveTechnologyFocusedIdentifiers")
    public native NSSet<String> accessibilityAssistiveTechnologyFocusedIdentifiers();

    /**
     * Return an array of UIAccessibilityCustomAction objects to make custom actions for an element accessible to an assistive technology.
     * For example, a photo app might have a view that deletes its corresponding photo in response to a flick gesture.
     * If the view returns a delete action from this property, VoiceOver and Switch Control users will be able to delete photos without performing the flick gesture.
     * default == nil
     */
    @Generated
    @Selector("accessibilityCustomActions")
    public native NSArray<? extends UIAccessibilityCustomAction> accessibilityCustomActions();

    @Generated
    @Selector("accessibilityCustomRotors")
    public native NSArray<? extends UIAccessibilityCustomRotor> accessibilityCustomRotors();

    @Generated
    @Selector("accessibilityDecrement")
    public native void accessibilityDecrement();

    /**
     * Returns the accessibility element in order, based on index.
     * default == nil
     */
    @Generated
    @Selector("accessibilityElementAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object accessibilityElementAtIndex(@NInt long index);

    /**
     * Returns the number of accessibility elements in the container.
     */
    @Generated
    @Selector("accessibilityElementCount")
    @NInt
    public native long accessibilityElementCount();

    /**
     * Override the following methods to know when an assistive technology has set or unset its virtual focus on the element.
     */
    @Generated
    @Selector("accessibilityElementDidBecomeFocused")
    public native void accessibilityElementDidBecomeFocused();

    @Generated
    @Selector("accessibilityElementDidLoseFocus")
    public native void accessibilityElementDidLoseFocus();

    /**
     * Returns whether an assistive technology is focused on the element.
     */
    @Generated
    @Selector("accessibilityElementIsFocused")
    public native boolean accessibilityElementIsFocused();

    /**
     * A list of container elements managed by the receiver.
     * This can be used as an alternative to implementing the dynamic methods.
     * default == nil
     */
    @Generated
    @Selector("accessibilityElements")
    public native NSArray<?> accessibilityElements();

    /**
     * Marks all the accessible elements contained within as hidden.
     * default == NO
     */
    @Generated
    @Selector("accessibilityElementsHidden")
    public native boolean accessibilityElementsHidden();

    /**
     * Returns the frame of the element in screen coordinates.
     * default == CGRectZero
     * default on UIViews == the frame of the view
     * Setting the property will change the frame that is returned to the accessibility client. 
     */
    @Generated
    @Selector("accessibilityFrame")
    @ByValue
    public native CGRect accessibilityFrame();

    /**
     * Returns a localized string that describes the result of performing an action on the element, when the result is non-obvious.
     * The hint should be a brief phrase.
     * For example: "Purchases the item." or "Downloads the attachment."
     * default == nil
     * Setting the property will change the hint that is returned to the accessibility client. 
     */
    @Generated
    @Selector("accessibilityHint")
    public native String accessibilityHint();

    /**
     * If an element has the UIAccessibilityTraitAdjustable trait, it must also implement
     * the following methods. Incrementing will adjust the element so that it increases its content,
     * while decrementing decreases its content. For example, accessibilityIncrement will increase the value
     * of a UISlider, and accessibilityDecrement will decrease the value.
     */
    @Generated
    @Selector("accessibilityIncrement")
    public native void accessibilityIncrement();

    /**
     * Returns the localized label that represents the element. 
     * If the element does not display text (an icon for example), this method
     * should return text that best labels the element. For example: "Play" could be used for
     * a button that is used to play music. "Play button" should not be used, since there is a trait
     * that identifies the control is a button.
     * default == nil
     * default on UIKit controls == derived from the title
     * Setting the property will change the label that is returned to the accessibility client. 
     */
    @Generated
    @Selector("accessibilityLabel")
    public native String accessibilityLabel();

    /**
     * Returns the language code that the element's label, value and hint should be spoken in. 
     * If no language is set, the user's language is used.
     * The format for the language code should follow Internet BCP 47 for language tags.
     * For example, en-US specifies U.S. English.
     * default == nil
     */
    @Generated
    @Selector("accessibilityLanguage")
    public native String accessibilityLanguage();

    /**
     * Some assistive technologies allow the user to select a parent view or container to navigate its elements.
     * This property allows an app to specify whether that behavior should apply to the receiver.
     * Currently, this property only affects Switch Control, not VoiceOver or other assistive technologies.
     * See UIAccessibilityConstants.h for the list of supported values.
     * default == UIAccessibilityNavigationStyleAutomatic
     */
    @Generated
    @Selector("accessibilityNavigationStyle")
    @NInt
    public native long accessibilityNavigationStyle();

    /**
     * Returns the path of the element in screen coordinates.
     * default == nil
     * Setting the property, or overriding the method, will cause the assistive technology to prefer the path over the accessibility.
     * frame when highlighting the element.
     */
    @Generated
    @Selector("accessibilityPath")
    public native UIBezierPath accessibilityPath();

    /**
     * Implement accessibilityPerformEscape on an element or containing view to exit a modal or hierarchical interface view.
     * For example, UIPopoverController implements accessibilityPerformEscape on it's root view, so that when
     * called (as a result of a VoiceOver user action), it dismisses the popover.
     * If your implementation successfully dismisses the current UI, return YES, otherwise return NO.
     * default == NO
     */
    @Generated
    @Selector("accessibilityPerformEscape")
    public native boolean accessibilityPerformEscape();

    /**
     * Implement accessibilityPerformMagicTap on an element, or the application, in order to provide a context-sensitive action.
     * For example, a music player can implement this to start and stop playback, or a recording app could start and stop recording.
     * Return YES to indicate that the action was handled.
     * default == NO
     */
    @Generated
    @Selector("accessibilityPerformMagicTap")
    public native boolean accessibilityPerformMagicTap();

    @Generated
    @Selector("accessibilityScroll:")
    public native boolean accessibilityScroll(@NInt long direction);

    /**
     * Returns a UIAccessibilityTraits mask that is the OR combination of
     * all accessibility traits that best characterize the element.
     * See UIAccessibilityConstants.h for a list of traits.
     * When overriding this method, remember to combine your custom traits
     * with [super accessibilityTraits].
     * default == UIAccessibilityTraitNone
     * default on UIKit controls == traits that best characterize individual controls. 
     * Setting the property will change the traits that are returned to the accessibility client. 
     */
    @Generated
    @Selector("accessibilityTraits")
    public native long accessibilityTraits();

    /**
     * Returns a localized string that represents the value of the element, such as the value 
     * of a slider or the text in a text field. Use only when the label of the element
     * differs from a value. For example: A volume slider has a label of "Volume", but a value of "60%".
     * default == nil
     * default on UIKit controls == values for appropriate controls 
     * Setting the property will change the value that is returned to the accessibility client.  
     */
    @Generated
    @Selector("accessibilityValue")
    public native String accessibilityValue();

    /**
     * Informs whether the receiving view should be considered modal by accessibility. If YES, then 
     * elements outside this view will be ignored. Only elements inside this view will be exposed.
     * default == NO
     */
    @Generated
    @Selector("accessibilityViewIsModal")
    public native boolean accessibilityViewIsModal();

    /**
     * Register or deregister as an observer of the value at a key path relative to the receiver. The options determine what is included in observer notifications and when they're sent, as described above, and the context is passed in observer notifications as described above. You should use -removeObserver:forKeyPath:context: instead of -removeObserver:forKeyPath: whenever possible because it allows you to more precisely specify your intent. When the same observer is registered for the same key path multiple times, but with different context pointers each time, -removeObserver:forKeyPath: has to guess at the context pointer when deciding what exactly to remove, and it can guess wrong.
     */
    @Generated
    @Selector("addObserver:forKeyPath:options:context:")
    public native void addObserverForKeyPathOptionsContext(NSObject observer, String keyPath, @NUInt long options,
            VoidPtr context);

    /**
     * Given that an error alert has been presented applicaton-modally to the user, and the user has chosen one of the error's recovery options, attempt recovery from the error, and return YES if error recovery was completely successful, NO otherwise. The recovery option index is an index into the error's array of localized recovery options.
     */
    @Generated
    @Selector("attemptRecoveryFromError:optionIndex:")
    public native boolean attemptRecoveryFromErrorOptionIndex(NSError error, @NUInt long recoveryOptionIndex);

    /**
     * Given that an error alert has been presented document-modally to the user, and the user has chosen one of the error's recovery options, attempt recovery from the error, and send the selected message to the specified delegate. The option index is an index into the error's array of localized recovery options. The method selected by didRecoverSelector must have the same signature as:
     * 
     *     - (void)didPresentErrorWithRecovery:(BOOL)didRecover contextInfo:(void *)contextInfo;
     * 
     * The value passed for didRecover must be YES if error recovery was completely successful, NO otherwise.
     */
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
    public native Object awakeAfterUsingCoder(NSCoder coder);

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

    /**
     * Given an array of keys, return a dictionary containing the keyed attribute values, to-one-related objects, and/or collections of to-many-related objects. Entries for which -valueForKey: returns nil have NSNull as their value in the returned dictionary.
     */
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

    /**
     * Returns the ordered index for an accessibility element
     * default == NSNotFound
     */
    @Generated
    @Selector("indexOfAccessibilityElement:")
    @NInt
    public native long indexOfAccessibilityElement(@Mapped(ObjCObjectMapper.class) Object element);

    @Generated
    @Selector("init")
    public native NSObject init();

    /**
     * Return YES if the receiver should be exposed as an accessibility element. 
     * default == NO
     * default on UIKit controls == YES 
     * Setting the property to YES will cause the receiver to be visible to assistive applications. 
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

    @Generated
    @Selector("methodForSelector:")
    @FunctionPtr(name = "call_methodForSelector_ret")
    public native Function_methodForSelector_ret methodForSelector(SEL aSelector);

    @Generated
    @Selector("methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector(SEL aSelector);

    /**
     * Given a key that identifies an _ordered_ to-many relationship, return a mutable array that provides read-write access to the related objects. Objects added to the mutable array will become related to the receiver, and objects removed from the mutable array will become unrelated.
     * 
     * The default implementation of this method recognizes the same simple accessor methods and array accessor methods as -valueForKey:'s, and follows the same direct instance variable access policies, but always returns a mutable collection proxy object instead of the immutable collection that -valueForKey: would return. It also:
     *     1. Searches the class of the receiver for methods whose names match the patterns -insertObject:in<Key>AtIndex: and -removeObjectFrom<Key>AtIndex: (corresponding to the two most primitive methods defined by the NSMutableArray class), and (introduced in Mac OS 10.4) also -insert<Key>:atIndexes: and -remove<Key>AtIndexes: (corresponding to -[NSMutableArray insertObjects:atIndexes:] and -[NSMutableArray removeObjectsAtIndexes:). If at least one insertion method and at least one removal method are found each NSMutableArray message sent to the collection proxy object will result in some combination of -insertObject:in<Key>AtIndex:, -removeObjectFrom<Key>AtIndex:, -insert<Key>:atIndexes:, and -remove<Key>AtIndexes: messages being sent to the original receiver of -mutableArrayValueForKey:. If the class of the receiver also implements an optional method whose name matches the pattern -replaceObjectIn<Key>AtIndex:withObject: or (introduced in Mac OS 10.4) -replace<Key>AtIndexes:with<Key>: that method will be used when appropriate for best performance.
     *     2. Otherwise (no set of array mutation methods is found), searches the class of the receiver for an accessor method whose name matches the pattern -set<Key>:. If such a method is found each NSMutableArray message sent to the collection proxy object will result in a -set<Key>: message being sent to the original receiver of -mutableArrayValueForKey:.
     *     3. Otherwise (no set of array mutation methods or simple accessor method is found), if the receiver's class' +accessInstanceVariablesDirectly property returns YES, searches the class of the receiver for an instance variable whose name matches the pattern _<key> or <key>, in that order. If such an instance variable is found, each NSMutableArray message sent to the collection proxy object will be forwarded to the instance variable's value, which therefore must typically be an instance of NSMutableArray or a subclass of NSMutableArray.
     *     4. Otherwise (no set of array mutation methods, simple accessor method, or instance variable is found), returns a mutable collection proxy object anyway. Each NSMutableArray message sent to the collection proxy object will result in a -setValue:forUndefinedKey: message being sent to the original receiver of -mutableArrayValueForKey:. The default implementation of -setValue:forUndefinedKey: raises an NSUndefinedKeyException, but you can override it in your application.
     * 
     * Performance note: the repetitive -set<Key>: messages implied by step 2's description are a potential performance problem. For better performance implement insertion and removal methods that fulfill the requirements for step 1 in your KVC-compliant class. For best performance implement a replacement method too.
     */
    @Generated
    @Selector("mutableArrayValueForKey:")
    public native NSMutableArray<?> mutableArrayValueForKey(String key);

    @Generated
    @Selector("mutableArrayValueForKeyPath:")
    public native NSMutableArray<?> mutableArrayValueForKeyPath(String keyPath);

    @Owned
    @Generated
    @Selector("mutableCopy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopy();

    /**
     * Given a key that identifies an _ordered_ and uniquing to-many relationship, return a mutable ordered set that provides read-write access to the related objects. Objects added to the mutable ordered set will become related to the receiver, and objects removed from the mutable ordered set will become unrelated.
     * 
     * The default implementation of this method recognizes the same simple accessor methods and ordered set accessor methods as -valueForKey:'s, and follows the same direct instance variable access policies, but always returns a mutable collection proxy object instead of the immutable collection that -valueForKey: would return. It also:
     *     1. Searches the class of the receiver for methods whose names match the patterns -insertObject:in<Key>AtIndex: and -removeObjectFrom<Key>AtIndex: (corresponding to the two most primitive methods defined by the NSMutableOrderedSet class), and also -insert<Key>:atIndexes: and -remove<Key>AtIndexes: (corresponding to -[NSMutableOrderedSet insertObjects:atIndexes:] and -[NSMutableOrderedSet removeObjectsAtIndexes:). If at least one insertion method and at least one removal method are found each NSMutableOrderedSet message sent to the collection proxy object will result in some combination of -insertObject:in<Key>AtIndex:, -removeObjectFrom<Key>AtIndex:, -insert<Key>:atIndexes:, and -remove<Key>AtIndexes: messages being sent to the original receiver of -mutableOrderedSetValueForKey:. If the class of the receiver also implements an optional method whose name matches the pattern -replaceObjectIn<Key>AtIndex:withObject: or -replace<Key>AtIndexes:with<Key>: that method will be used when appropriate for best performance.
     *     2. Otherwise (no set of ordered set mutation methods is found), searches the class of the receiver for an accessor method whose name matches the pattern -set<Key>:. If such a method is found each NSMutableOrderedSet message sent to the collection proxy object will result in a -set<Key>: message being sent to the original receiver of -mutableOrderedSetValueForKey:.
     *     3. Otherwise (no set of ordered set mutation methods or simple accessor method is found), if the receiver's class' +accessInstanceVariablesDirectly property returns YES, searches the class of the receiver for an instance variable whose name matches the pattern _<key> or <key>, in that order. If such an instance variable is found, each NSMutableOrderedSet message sent to the collection proxy object will be forwarded to the instance variable's value, which therefore must typically be an instance of NSMutableOrderedSet or a subclass of NSMutableOrderedSet.
     *     4. Otherwise (no set of ordered set mutation methods, simple accessor method, or instance variable is found), returns a mutable collection proxy object anyway. Each NSMutableOrderedSet message sent to the collection proxy object will result in a -setValue:forUndefinedKey: message being sent to the original receiver of -mutableOrderedSetValueForKey:. The default implementation of -setValue:forUndefinedKey: raises an NSUndefinedKeyException, but you can override it in your application.
     * 
     * Performance note: the repetitive -set<Key>: messages implied by step 2's description are a potential performance problem. For better performance implement insertion and removal methods that fulfill the requirements for step 1 in your KVC-compliant class. For best performance implement a replacement method too.
     */
    @Generated
    @Selector("mutableOrderedSetValueForKey:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKey(String key);

    @Generated
    @Selector("mutableOrderedSetValueForKeyPath:")
    public native NSMutableOrderedSet<?> mutableOrderedSetValueForKeyPath(String keyPath);

    /**
     * Given a key that identifies an _unordered_ and uniquing to-many relationship, return a mutable set that provides read-write access to the related objects. Objects added to the mutable set will become related to the receiver, and objects removed from the mutable set will become unrelated.
     * 
     * The default implementation of this method recognizes the same simple accessor methods and set accessor methods as -valueForKey:'s, and follows the same direct instance variable access policies, but always returns a mutable collection proxy object instead of the immutable collection that -valueForKey: would return. It also:
     *     1. Searches the class of the receiver for methods whose names match the patterns -add<Key>Object: and -remove<Key>Object: (corresponding to the two primitive methods defined by the NSMutableSet class) and also -add<Key>: and -remove<Key>: (corresponding to -[NSMutableSet unionSet:] and -[NSMutableSet minusSet:]). If at least one addition method and at least one removal method are found each NSMutableSet message sent to the collection proxy object will result in some combination of -add<Key>Object:, -remove<Key>Object:, -add<Key>:, and -remove<Key>: messages being sent to the original receiver of -mutableSetValueForKey:. If the class of the receiver also implements an optional method whose name matches the pattern -intersect<Key>: or -set<Key>: that method will be used when appropriate for best performance.
     *     2. Otherwise (no set of set mutation methods is found), searches the class of the receiver for an accessor method whose name matches the pattern -set<Key>:. If such a method is found each NSMutableSet message sent to the collection proxy object will result in a -set<Key>: message being sent to the original receiver of -mutableSetValueForKey:.
     *     3. Otherwise (no set of set mutation methods or simple accessor method is found), if the receiver's class' +accessInstanceVariablesDirectly property returns YES, searches the class of the receiver for an instance variable whose name matches the pattern _<key> or <key>, in that order. If such an instance variable is found, each NSMutableSet message sent to the collection proxy object will be forwarded to the instance variable's value, which therefore must typically be an instance of NSMutableSet or a subclass of NSMutableSet.
     *     4. Otherwise (no set of set mutation methods, simple accessor method, or instance variable is found), returns a mutable collection proxy object anyway. Each NSMutableSet message sent to the collection proxy object will result in a -setValue:forUndefinedKey: message being sent to the original receiver of -mutableSetValueForKey:. The default implementation of -setValue:forUndefinedKey: raises an NSUndefinedKeyException, but you can override it in your application.
     * 
     * Performance note: the repetitive -set<Key>: messages implied by step 2's description are a potential performance problem. For better performance implement methods that fulfill the requirements for step 1 in your KVC-compliant class.
     */
    @Generated
    @Selector("mutableSetValueForKey:")
    public native NSMutableSet<?> mutableSetValueForKey(String key);

    @Generated
    @Selector("mutableSetValueForKeyPath:")
    public native NSMutableSet<?> mutableSetValueForKeyPath(String keyPath);

    /**
     * Take or return a pointer that identifies information about all of the observers that are registered with the receiver, the options that were used at registration-time, etc. The default implementation of these methods store observation info in a global dictionary keyed by the receivers' pointers. For improved performance, you can override these methods to store the opaque data pointer in an instance variable. Overrides of these methods must not attempt to send Objective-C messages to the passed-in observation info, including -retain and -release.
     */
    @Generated
    @Selector("observationInfo")
    public native VoidPtr observationInfo();

    /**
     * Given that the receiver has been registered as an observer of the value at a key path relative to an object, be notified of a change to that value.
     * 
     * The change dictionary always contains an NSKeyValueChangeKindKey entry whose value is an NSNumber wrapping an NSKeyValueChange (use -[NSNumber unsignedIntegerValue]). The meaning of NSKeyValueChange depends on what sort of property is identified by the key path:
     *     - For any sort of property (attribute, to-one relationship, or ordered or unordered to-many relationship) NSKeyValueChangeSetting indicates that the observed object has received a -setValue:forKey: message, or that the key-value coding-compliant set method for the key has been invoked, or that a -willChangeValueForKey:/-didChangeValueForKey: pair has otherwise been invoked.
     *     - For an _ordered_ to-many relationship, NSKeyValueChangeInsertion, NSKeyValueChangeRemoval, and NSKeyValueChangeReplacement indicate that a mutating message has been sent to the array returned by a -mutableArrayValueForKey: message sent to the object, or sent to the ordered set returned by a -mutableOrderedSetValueForKey: message sent to the object, or that one of the key-value coding-compliant array or ordered set mutation methods for the key has been invoked, or that a -willChange:valuesAtIndexes:forKey:/-didChange:valuesAtIndexes:forKey: pair has otherwise been invoked.
     *     - For an _unordered_ to-many relationship (introduced in Mac OS 10.4), NSKeyValueChangeInsertion, NSKeyValueChangeRemoval, and NSKeyValueChangeReplacement indicate that a mutating message has been sent to the set returned by a -mutableSetValueForKey: message sent to the object, or that one of the key-value coding-compliant set mutation methods for the key has been invoked, or that a -willChangeValueForKey:withSetMutation:usingObjects:/-didChangeValueForKey:withSetMutation:usingObjects: pair has otherwise been invoked.
     * 
     * For any sort of property, the change dictionary contains an NSKeyValueChangeNewKey entry if NSKeyValueObservingOptionNew was specified at observer registration time, it's the right kind of change, and this isn't a prior notification. The change dictionary contains an NSKeyValueChangeOldKey if NSKeyValueObservingOptionOld was specified and it's the right kind of change. See the comments for the NSKeyValueObserverNotification informal protocol methods for what the values of those entries can be.
     * 
     * For an _ordered_ to-many relationship, the change dictionary always contains an NSKeyValueChangeIndexesKey entry whose value is an NSIndexSet containing the indexes of the inserted, removed, or replaced objects, unless the change is an NSKeyValueChangeSetting.
     * 
     * If NSKeyValueObservingOptionPrior (introduced in Mac OS 10.5) was specified at observer registration time, and this notification is one being sent prior to a change as a result, the change dictionary contains an NSKeyValueChangeNotificationIsPriorKey entry whose value is an NSNumber wrapping YES (use -[NSNumber boolValue]).
     * 
     * context is always the same pointer that was passed in at observer registration time.
     */
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

    /**
     * equivalent to the first method with kCFRunLoopCommonModes
     */
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

    /**
     * equivalent to the first method with kCFRunLoopCommonModes
     */
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

    /**
     * Callee should initialize the given bitmap with the subregion x,y
     * width,height of the image. (this subregion is defined in the image's
     * local coordinate space, i.e. the origin is the top left corner of
     * the image).
     * 
     * By default, this method will be called to requests the full image
     * data regardless of what subregion is needed for the current render.
     * All of the image is loaded or none of it is.
     * 
     * If the kCIImageProviderTileSize option is specified, then only the
     * tiles that are needed are requested.
     * 
     * Changing the virtual memory mapping of the supplied buffer (e.g. using
     * vm_copy () to modify it) will give undefined behavior.
     */
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
    public native Object replacementObjectForCoder(NSCoder coder);

    /**
     * Implemented by classes to substitute a new class for instances during
     * encoding.  The object will be encoded as if it were a member of the
     * returned class.  The results of this method are overridden by the archiver
     * class and instance name<->class encoding tables.  If nil is returned,
     * the result of this method is ignored.  This method returns the result of
     * [self classForArchiver] by default, NOT -classForCoder as might be
     * expected.  This is a concession to source compatibility.
     */
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

    /**
     * Returns the activation point for an accessible element in screen coordinates.
     * default == Mid-point of the accessibilityFrame.
     */
    @Generated
    @Selector("setAccessibilityActivationPoint:")
    public native void setAccessibilityActivationPoint(@ByValue CGPoint value);

    /**
     * Return an array of UIAccessibilityCustomAction objects to make custom actions for an element accessible to an assistive technology.
     * For example, a photo app might have a view that deletes its corresponding photo in response to a flick gesture.
     * If the view returns a delete action from this property, VoiceOver and Switch Control users will be able to delete photos without performing the flick gesture.
     * default == nil
     */
    @Generated
    @Selector("setAccessibilityCustomActions:")
    public native void setAccessibilityCustomActions(NSArray<? extends UIAccessibilityCustomAction> value);

    @Generated
    @Selector("setAccessibilityCustomRotors:")
    public native void setAccessibilityCustomRotors(NSArray<? extends UIAccessibilityCustomRotor> value);

    /**
     * A list of container elements managed by the receiver.
     * This can be used as an alternative to implementing the dynamic methods.
     * default == nil
     */
    @Generated
    @Selector("setAccessibilityElements:")
    public native void setAccessibilityElements(NSArray<?> value);

    /**
     * Marks all the accessible elements contained within as hidden.
     * default == NO
     */
    @Generated
    @Selector("setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean value);

    /**
     * Returns the frame of the element in screen coordinates.
     * default == CGRectZero
     * default on UIViews == the frame of the view
     * Setting the property will change the frame that is returned to the accessibility client. 
     */
    @Generated
    @Selector("setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ByValue CGRect value);

    /**
     * Returns a localized string that describes the result of performing an action on the element, when the result is non-obvious.
     * The hint should be a brief phrase.
     * For example: "Purchases the item." or "Downloads the attachment."
     * default == nil
     * Setting the property will change the hint that is returned to the accessibility client. 
     */
    @Generated
    @Selector("setAccessibilityHint:")
    public native void setAccessibilityHint(String value);

    /**
     * Returns the localized label that represents the element. 
     * If the element does not display text (an icon for example), this method
     * should return text that best labels the element. For example: "Play" could be used for
     * a button that is used to play music. "Play button" should not be used, since there is a trait
     * that identifies the control is a button.
     * default == nil
     * default on UIKit controls == derived from the title
     * Setting the property will change the label that is returned to the accessibility client. 
     */
    @Generated
    @Selector("setAccessibilityLabel:")
    public native void setAccessibilityLabel(String value);

    /**
     * Returns the language code that the element's label, value and hint should be spoken in. 
     * If no language is set, the user's language is used.
     * The format for the language code should follow Internet BCP 47 for language tags.
     * For example, en-US specifies U.S. English.
     * default == nil
     */
    @Generated
    @Selector("setAccessibilityLanguage:")
    public native void setAccessibilityLanguage(String value);

    /**
     * Some assistive technologies allow the user to select a parent view or container to navigate its elements.
     * This property allows an app to specify whether that behavior should apply to the receiver.
     * Currently, this property only affects Switch Control, not VoiceOver or other assistive technologies.
     * See UIAccessibilityConstants.h for the list of supported values.
     * default == UIAccessibilityNavigationStyleAutomatic
     */
    @Generated
    @Selector("setAccessibilityNavigationStyle:")
    public native void setAccessibilityNavigationStyle(@NInt long value);

    /**
     * Returns the path of the element in screen coordinates.
     * default == nil
     * Setting the property, or overriding the method, will cause the assistive technology to prefer the path over the accessibility.
     * frame when highlighting the element.
     */
    @Generated
    @Selector("setAccessibilityPath:")
    public native void setAccessibilityPath(UIBezierPath value);

    /**
     * Returns a UIAccessibilityTraits mask that is the OR combination of
     * all accessibility traits that best characterize the element.
     * See UIAccessibilityConstants.h for a list of traits.
     * When overriding this method, remember to combine your custom traits
     * with [super accessibilityTraits].
     * default == UIAccessibilityTraitNone
     * default on UIKit controls == traits that best characterize individual controls. 
     * Setting the property will change the traits that are returned to the accessibility client. 
     */
    @Generated
    @Selector("setAccessibilityTraits:")
    public native void setAccessibilityTraits(long value);

    /**
     * Returns a localized string that represents the value of the element, such as the value 
     * of a slider or the text in a text field. Use only when the label of the element
     * differs from a value. For example: A volume slider has a label of "Volume", but a value of "60%".
     * default == nil
     * default on UIKit controls == values for appropriate controls 
     * Setting the property will change the value that is returned to the accessibility client.  
     */
    @Generated
    @Selector("setAccessibilityValue:")
    public native void setAccessibilityValue(String value);

    /**
     * Informs whether the receiving view should be considered modal by accessibility. If YES, then 
     * elements outside this view will be ignored. Only elements inside this view will be exposed.
     * default == NO
     */
    @Generated
    @Selector("setAccessibilityViewIsModal:")
    public native void setAccessibilityViewIsModal(boolean value);

    /**
     * Return YES if the receiver should be exposed as an accessibility element. 
     * default == NO
     * default on UIKit controls == YES 
     * Setting the property to YES will cause the receiver to be visible to assistive applications. 
     */
    @Generated
    @Selector("setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean value);

    /**
     * Given that an invocation of -setValue:forKey: would be unable to set the keyed value because the type of the parameter of the corresponding accessor method is an NSNumber scalar type or NSValue structure type but the value is nil, set the keyed value using some other mechanism. The default implementation of this method raises an NSInvalidArgumentException. You can override it to map nil values to something meaningful in the context of your application.
     */
    @Generated
    @Selector("setNilValueForKey:")
    public native void setNilValueForKey(String key);

    /**
     * Take or return a pointer that identifies information about all of the observers that are registered with the receiver, the options that were used at registration-time, etc. The default implementation of these methods store observation info in a global dictionary keyed by the receivers' pointers. For improved performance, you can override these methods to store the opaque data pointer in an instance variable. Overrides of these methods must not attempt to send Objective-C messages to the passed-in observation info, including -retain and -release.
     */
    @Generated
    @Selector("setObservationInfo:")
    public native void setObservationInfo(VoidPtr value);

    /**
     * Forces children elements to be grouped together regardless of their position on screen.
     * For example, your app may show items that are meant to be grouped together in vertical columns. 
     * By default, VoiceOver will navigate those items in horizontal rows. If shouldGroupAccessibilityChildren is set on
     * a parent view of the items in the vertical column, VoiceOver will navigate the order correctly.
     * default == NO
     */
    @Generated
    @Selector("setShouldGroupAccessibilityChildren:")
    public native void setShouldGroupAccessibilityChildren(boolean value);

    /**
     * Given a value and a key that identifies an attribute, set the value of the attribute. Given an object and a key that identifies a to-one relationship, relate the object to the receiver, unrelating the previously related object if there was one. Given a collection object and a key that identifies a to-many relationship, relate the objects contained in the collection to the receiver, unrelating previously related objects if there were any.
     * 
     * The default implementation of this method does the following:
     *     1. Searches the class of the receiver for an accessor method whose name matches the pattern -set<Key>:. If such a method is found the type of its parameter is checked. If the parameter type is not an object pointer type but the value is nil -setNilValueForKey: is invoked. The default implementation of -setNilValueForKey: raises an NSInvalidArgumentException, but you can override it in your application. Otherwise, if the type of the method's parameter is an object pointer type the method is simply invoked with the value as the argument. If the type of the method's parameter is some other type the inverse of the NSNumber/NSValue conversion done by -valueForKey: is performed before the method is invoked.
     *     2. Otherwise (no accessor method is found), if the receiver's class' +accessInstanceVariablesDirectly property returns YES, searches the class of the receiver for an instance variable whose name matches the pattern _<key>, _is<Key>, <key>, or is<Key>, in that order. If such an instance variable is found and its type is an object pointer type the value is retained and the result is set in the instance variable, after the instance variable's old value is first released. If the instance variable's type is some other type its value is set after the same sort of conversion from NSNumber or NSValue as in step 1.
     *     3. Otherwise (no accessor method or instance variable is found), invokes -setValue:forUndefinedKey:. The default implementation of -setValue:forUndefinedKey: raises an NSUndefinedKeyException, but you can override it in your application.
     * 
     * Compatibility notes:
     *     - For backward binary compatibility with -takeValue:forKey:'s behavior, a method whose name matches the pattern -_set<Key>: is also recognized in step 1. KVC accessor methods whose names start with underscores were deprecated as of Mac OS 10.3 though.
     *     - For backward binary compatibility, -unableToSetNilForKey: will be invoked instead of -setNilValueForKey: in step 1, if the implementation of -unableToSetNilForKey: in the receiver's class is not NSObject's.
     *     - The behavior described in step 2 is different from -takeValue:forKey:'s, in which the instance variable search order is <key>, _<key>.
     *     - For backward binary compatibility with -takeValue:forKey:'s behavior, -handleTakeValue:forUnboundKey: will be invoked instead of -setValue:forUndefinedKey: in step 3, if the implementation of -handleTakeValue:forUnboundKey: in the receiver's class is not NSObject's.
     */
    @Generated
    @Selector("setValue:forKey:")
    public native void setValueForKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setValue:forKeyPath:")
    public native void setValueForKeyPath(@Mapped(ObjCObjectMapper.class) Object value, String keyPath);

    /**
     * Given that an invocation of -setValue:forKey: would be unable to set the keyed value using its default mechanism, set the keyed value using some other mechanism. The default implementation of this method raises an NSUndefinedKeyException. You can override it to handle properties that are dynamically defined at run-time.
     */
    @Generated
    @Selector("setValue:forUndefinedKey:")
    public native void setValueForUndefinedKey(@Mapped(ObjCObjectMapper.class) Object value, String key);

    /**
     * Given a dictionary containing keyed attribute values, to-one-related objects, and/or collections of to-many-related objects, set the keyed values. Dictionary entries whose values are NSNull result in -setValue:nil forKey:key messages being sent to the receiver.
     */
    @Generated
    @Selector("setValuesForKeysWithDictionary:")
    public native void setValuesForKeysWithDictionary(NSDictionary<String, ?> keyedValues);

    /**
     * Forces children elements to be grouped together regardless of their position on screen.
     * For example, your app may show items that are meant to be grouped together in vertical columns. 
     * By default, VoiceOver will navigate those items in horizontal rows. If shouldGroupAccessibilityChildren is set on
     * a parent view of the items in the vertical column, VoiceOver will navigate the order correctly.
     * default == NO
     */
    @Generated
    @Selector("shouldGroupAccessibilityChildren")
    public native boolean shouldGroupAccessibilityChildren();

    @Generated
    @Selector("superclass")
    public native Class superclass();

    /**
     * Given a pointer to a value pointer, a key that identifies an attribute or to-one relationship, and a pointer to an NSError pointer, return a value that is suitable for use in subsequent -setValue:forKey: messages sent to the same receiver. If no validation is necessary, return YES without altering *ioValue or *outError. If validation is necessary and possible, return YES after setting *ioValue to an object that is the validated version of the original value, but without altering *outError. If validation is necessary but not possible, return NO after setting *outError to an NSError that encapsulates the reason that validation was not possible, but without altering *ioValue. The sender of the message is never given responsibility for releasing ioValue or outError.
     * 
     * The default implementation of this method searches the class of the receiver for a validator method whose name matches the pattern -validate<Key>:error:. If such a method is found it is invoked and the result is returned. If no such method is found, YES is returned.
     */
    @Generated
    @Selector("validateValue:forKey:error:")
    public native boolean validateValueForKeyError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> ioValue,
            String inKey, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("validateValue:forKeyPath:error:")
    public native boolean validateValueForKeyPathError(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> ioValue,
            String inKeyPath, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Given a key that identifies an attribute or to-one relationship, return the attribute value or the related object. Given a key that identifies a to-many relationship, return an immutable array or an immutable set that contains all of the related objects.
     * 
     * The default implementation of this method does the following:
     *     1. Searches the class of the receiver for an accessor method whose name matches the pattern -get<Key>, -<key>, or -is<Key>, in that order. If such a method is found it is invoked. If the type of the method's result is an object pointer type the result is simply returned. If the type of the result is one of the scalar types supported by NSNumber conversion is done and an NSNumber is returned. Otherwise, conversion is done and an NSValue is returned (new in Mac OS 10.5: results of arbitrary type are converted to NSValues, not just NSPoint, NRange, NSRect, and NSSize).
     *     2 (introduced in Mac OS 10.7). Otherwise (no simple accessor method is found), searches the class of the receiver for methods whose names match the patterns -countOf<Key> and -indexIn<Key>OfObject: and -objectIn<Key>AtIndex: (corresponding to the primitive methods defined by the NSOrderedSet class) and also -<key>AtIndexes: (corresponding to -[NSOrderedSet objectsAtIndexes:]). If a count method and an indexOf method and at least one of the other two possible methods are found, a collection proxy object that responds to all NSOrderedSet methods is returned. Each NSOrderedSet message sent to the collection proxy object will result in some combination of -countOf<Key>, -indexIn<Key>OfObject:, -objectIn<Key>AtIndex:, and -<key>AtIndexes: messages being sent to the original receiver of -valueForKey:. If the class of the receiver also implements an optional method whose name matches the pattern -get<Key>:range: that method will be used when appropriate for best performance.
     *     3. Otherwise (no simple accessor method or set of ordered set access methods is found), searches the class of the receiver for methods whose names match the patterns -countOf<Key> and -objectIn<Key>AtIndex: (corresponding to the primitive methods defined by the NSArray class) and (introduced in Mac OS 10.4) also -<key>AtIndexes: (corresponding to -[NSArray objectsAtIndexes:]). If a count method and at least one of the other two possible methods are found, a collection proxy object that responds to all NSArray methods is returned. Each NSArray message sent to the collection proxy object will result in some combination of -countOf<Key>, -objectIn<Key>AtIndex:, and -<key>AtIndexes: messages being sent to the original receiver of -valueForKey:. If the class of the receiver also implements an optional method whose name matches the pattern -get<Key>:range: that method will be used when appropriate for best performance.
     *     4 (introduced in Mac OS 10.4). Otherwise (no simple accessor method or set of ordered set or array access methods is found), searches the class of the receiver for a threesome of methods whose names match the patterns -countOf<Key>, -enumeratorOf<Key>, and -memberOf<Key>: (corresponding to the primitive methods defined by the NSSet class). If all three such methods are found a collection proxy object that responds to all NSSet methods is returned. Each NSSet message sent to the collection proxy object will result in some combination of -countOf<Key>, -enumeratorOf<Key>, and -memberOf<Key>: messages being sent to the original receiver of -valueForKey:.
     *     5. Otherwise (no simple accessor method or set of collection access methods is found), if the receiver's class' +accessInstanceVariablesDirectly property returns YES, searches the class of the receiver for an instance variable whose name matches the pattern _<key>, _is<Key>, <key>, or is<Key>, in that order. If such an instance variable is found, the value of the instance variable in the receiver is returned, with the same sort of conversion to NSNumber or NSValue as in step 1.
     *     6. Otherwise (no simple accessor method, set of collection access methods, or instance variable is found), invokes -valueForUndefinedKey: and returns the result. The default implementation of -valueForUndefinedKey: raises an NSUndefinedKeyException, but you can override it in your application.
     * 
     * Compatibility notes:
     *     - For backward binary compatibility, an accessor method whose name matches the pattern -_get<Key>, or -_<key> is searched for between steps 1 and 3. If such a method is found it is invoked, with the same sort of conversion to NSNumber or NSValue as in step 1. KVC accessor methods whose names start with underscores were deprecated as of Mac OS 10.3 though.
     *     - The behavior described in step 5 is a change from Mac OS 10.2, in which the instance variable search order was <key>, _<key>.
     *     - For backward binary compatibility, -handleQueryWithUnboundKey: will be invoked instead of -valueForUndefinedKey: in step 6, if the implementation of -handleQueryWithUnboundKey: in the receiver's class is not NSObject's.
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKey(String key);

    /**
     * Key-path-taking variants of like-named methods. The default implementation of each parses the key path enough to determine whether or not it has more than one component (key path components are separated by periods). If so, -valueForKey: is invoked with the first key path component as the argument, and the method being invoked is invoked recursively on the result, with the remainder of the key path passed as an argument. If not, the like-named non-key-path-taking method is invoked.
     */
    @Generated
    @Selector("valueForKeyPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForKeyPath(String keyPath);

    /**
     * Given that an invocation of -valueForKey: would be unable to get a keyed value using its default access mechanism, return the keyed value using some other mechanism. The default implementation of this method raises an NSUndefinedKeyException. You can override it to handle properties that are dynamically defined at run-time.
     */
    @Generated
    @Selector("valueForUndefinedKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForUndefinedKey(String key);

    /**
     * Given a key that identifies an _ordered_ to-many relationship, send -observeValueForKeyPath:ofObject:change:context: notification messages of the passed-in change kind to each observer registered for the key, including those that are registered with other objects using key paths that locate the keyed value in this object. The passed-in kind must be NSKeyValueChangeInsertion, NSKeyValueChangeRemoval, or NSKeyValueChangeReplacement. The passed-in index set must be the indexes of the objects being inserted, removed, or replaced. Invocations of these methods must always be paired, with identical arguments.
     * 
     * The change dictionaries in notifications resulting from use of these methods contain optional entries if requested at observer registration time:
     *     - The NSKeyValueChangeOldKey entry, if present (only for NSKeyValueChangeRemoval and NSKeyValueChangeReplacement), contains an array of the indexed objects from the array returned by -valueForKey: at the instant that -willChangeValueForKey:valuesAtIndexes:forKey: is invoked.
     *     - The NSKeyValueChangeNewKey entry, if present (only for NSKeyValueChangeInsertion and NSKeyValueChangeReplacement), contains an array of the indexed objects from the array returned by -valueForKey: at the instant that -didChangeValueForKey:valuesAtIndexes:forKey: is invoked.
     */
    @Generated
    @Selector("willChange:valuesAtIndexes:forKey:")
    public native void willChangeValuesAtIndexesForKey(@NUInt long changeKind, NSIndexSet indexes, String key);

    /**
     * Given a key that identifies a property (attribute, to-one relationship, or ordered or unordered to-many relationship), send -observeValueForKeyPath:ofObject:change:context: notification messages of kind NSKeyValueChangeSetting to each observer registered for the key, including those that are registered with other objects using key paths that locate the keyed value in this object. Invocations of these methods must always be paired.
     * 
     * The change dictionaries in notifications resulting from use of these methods contain optional entries if requested at observer registration time:
     *     - The NSKeyValueChangeOldKey entry, if present, contains the value returned by -valueForKey: at the instant that -willChangeValueForKey: is invoked (or an NSNull if -valueForKey: returns nil).
     *     - The NSKeyValueChangeNewKey entry, if present, contains the value returned by -valueForKey: at the instant that -didChangeValueForKey: is invoked (or an NSNull if -valueForKey: returns nil).
     */
    @Generated
    @Selector("willChangeValueForKey:")
    public native void willChangeValueForKey(String key);

    /**
     * Given a key that identifies an _unordered_ to-many relationship, send -observeValueForKeyPath:ofObject:change:context: notification messages to each observer registered for the key, including those that are registered with other objects using key paths that locate the keyed value in this object. The passed-in mutation kind corresponds to an NSMutableSet method. The passed-in set must contain the set that would be passed to the corresponding NSMutableSet method. Invocations of these methods must always be paired, with identical arguments.
     * 
     * The value of the NSKeyValueChangeKindKey entry in change dictionaries in notifications resulting from use of these methods depends on the passed-in mutationKind value:
     *     - NSKeyValueUnionSetMutation -> NSKeyValueChangeInsertion
     *     - NSKeyValueMinusSetMutation -> NSKeyValueChangeRemoval
     *     - NSKeyValueIntersectSetMutation -> NSKeyValueChangeRemoval
     *     - NSKeyValueSetSetMutation -> NSKeyValueChangeReplacement
     * 
     * The change dictionaries may also contain optional entries:
     *     - The NSKeyValueChangeOldKey entry, if present (only for for NSKeyValueChangeRemoval and NSKeyValueChangeReplacement), contains the set of objects that were removed.
     *     - The NSKeyValueChangeNewKey entry, if present (only for NSKeyValueChangeInsertion and NSKeyValueChangeReplacement), contains the set of objects that were added.
     */
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

    /**
     * The underlying attributed version of the accessibility hint. Setting this property will change the
     * value of the accessibilityHint property and vice-versa.
     */
    @Generated
    @Selector("accessibilityAttributedHint")
    public native NSAttributedString accessibilityAttributedHint();

    /**
     * The underlying attributed version of the accessibility label. Setting this property will change the
     * value of the accessibilityLabel property and vice-versa.
     */
    @Generated
    @Selector("accessibilityAttributedLabel")
    public native NSAttributedString accessibilityAttributedLabel();

    /**
     * The underlying attributed version of the accessibility value. Setting this property will change the
     * value of the accessibilityValue property and vice-versa.
     */
    @Generated
    @Selector("accessibilityAttributedValue")
    public native NSAttributedString accessibilityAttributedValue();

    /**
     * Some containers provide more context for accessibility elements, such as tables or lists.
     * Set this property so that assistive technologies can output more information.
     * default == UIAccessibilityContainerTypeNone
     */
    @Generated
    @Selector("accessibilityContainerType")
    @NInt
    public native long accessibilityContainerType();

    /**
     * By default, if an accessible view or its subtree has drag and/or drop interactions, they will be
     * automatically exposed by assistive technologies. However, if there is more than one such
     * interaction, each drag or drop should have a name to disambiguate it and give a good user
     * experience. Also, there may be situations in which you want to expose drags or drops from an
     * element, and those interactions are installed on views that are not part of that element's view
     * hierarchy subtree.
     * 
     * This is trivially the case when the element is not a view at all, but an instance of
     * UIAccessibilityElement.
     * 
     * Another example is when a container view maintains interactions that are logically
     * associated with subviews. For instance, UITableView has associated drag interactions that allow
     * for dragging its rows; to make the rows draggable by assistive technologies, UITableViewCell has
     * drag descriptors that describe where in the table view to start a drag to activate dragging of
     * the cell.
     * (Note that this implementation detail is noted here for expository purposes only and may change
     * at any time without warning.)
     * 
     * Properties defined here allow you to fine-tune how drags and drops are exposed to assistive
     * technologies. Both of their getter methods can be overridden to provide information on-demand.
     * For each location descriptor, the associated view should be the UIView with the appropriate
     * UIInteraction object for that drag or drop.
     * 
     * `accessibilityDragSourceDescriptors` is an array of UIAccessibilityLocationDescriptor
     * objects and is used to define and describe what drags are available from an element.
     * 
     * `accessibilityDropPointDescriptors` is similarly an array of
     * UIAccessibilityLocationDescriptor objects and is used to define and describe where
     * drops are possible on this element.
     * 
     * To restore the default automatic behavior for these properties, assign (or return) the default
     * value of nil. Note that nil does not describe the same behavior as the empty array, which
     * specifies that there are no relevant interactions for this element.
     */
    @Generated
    @Selector("accessibilityDragSourceDescriptors")
    public native NSArray<? extends UIAccessibilityLocationDescriptor> accessibilityDragSourceDescriptors();

    @Generated
    @Selector("accessibilityDropPointDescriptors")
    public native NSArray<? extends UIAccessibilityLocationDescriptor> accessibilityDropPointDescriptors();

    /**
     * The underlying attributed version of the accessibility hint. Setting this property will change the
     * value of the accessibilityHint property and vice-versa.
     */
    @Generated
    @Selector("setAccessibilityAttributedHint:")
    public native void setAccessibilityAttributedHint(NSAttributedString value);

    /**
     * The underlying attributed version of the accessibility label. Setting this property will change the
     * value of the accessibilityLabel property and vice-versa.
     */
    @Generated
    @Selector("setAccessibilityAttributedLabel:")
    public native void setAccessibilityAttributedLabel(NSAttributedString value);

    /**
     * The underlying attributed version of the accessibility value. Setting this property will change the
     * value of the accessibilityValue property and vice-versa.
     */
    @Generated
    @Selector("setAccessibilityAttributedValue:")
    public native void setAccessibilityAttributedValue(NSAttributedString value);

    /**
     * Some containers provide more context for accessibility elements, such as tables or lists.
     * Set this property so that assistive technologies can output more information.
     * default == UIAccessibilityContainerTypeNone
     */
    @Generated
    @Selector("setAccessibilityContainerType:")
    public native void setAccessibilityContainerType(@NInt long value);

    /**
     * By default, if an accessible view or its subtree has drag and/or drop interactions, they will be
     * automatically exposed by assistive technologies. However, if there is more than one such
     * interaction, each drag or drop should have a name to disambiguate it and give a good user
     * experience. Also, there may be situations in which you want to expose drags or drops from an
     * element, and those interactions are installed on views that are not part of that element's view
     * hierarchy subtree.
     * 
     * This is trivially the case when the element is not a view at all, but an instance of
     * UIAccessibilityElement.
     * 
     * Another example is when a container view maintains interactions that are logically
     * associated with subviews. For instance, UITableView has associated drag interactions that allow
     * for dragging its rows; to make the rows draggable by assistive technologies, UITableViewCell has
     * drag descriptors that describe where in the table view to start a drag to activate dragging of
     * the cell.
     * (Note that this implementation detail is noted here for expository purposes only and may change
     * at any time without warning.)
     * 
     * Properties defined here allow you to fine-tune how drags and drops are exposed to assistive
     * technologies. Both of their getter methods can be overridden to provide information on-demand.
     * For each location descriptor, the associated view should be the UIView with the appropriate
     * UIInteraction object for that drag or drop.
     * 
     * `accessibilityDragSourceDescriptors` is an array of UIAccessibilityLocationDescriptor
     * objects and is used to define and describe what drags are available from an element.
     * 
     * `accessibilityDropPointDescriptors` is similarly an array of
     * UIAccessibilityLocationDescriptor objects and is used to define and describe where
     * drops are possible on this element.
     * 
     * To restore the default automatic behavior for these properties, assign (or return) the default
     * value of nil. Note that nil does not describe the same behavior as the empty array, which
     * specifies that there are no relevant interactions for this element.
     */
    @Generated
    @Selector("setAccessibilityDragSourceDescriptors:")
    public native void setAccessibilityDragSourceDescriptors(
            NSArray<? extends UIAccessibilityLocationDescriptor> value);

    @Generated
    @Selector("setAccessibilityDropPointDescriptors:")
    public native void setAccessibilityDropPointDescriptors(NSArray<? extends UIAccessibilityLocationDescriptor> value);

    /**
     * The underlying attributed versions of the accessibility user input label(s).
     * Setting this property will change the value of the accessibilityUserInputLabels property and vice versa.
     */
    @Generated
    @Selector("accessibilityAttributedUserInputLabels")
    public native NSArray<? extends NSAttributedString> accessibilityAttributedUserInputLabels();

    /**
     * Returns whether the element performs an action based on user interaction.
     * For example, a button that causes UI to update when it is tapped should return YES.
     * A label whose only purpose is to display information should return NO.
     * default == derived from other accessibility properties (for example, an element with UIAccessibilityTraitNotEnabled returns NO)
     */
    @Generated
    @Selector("accessibilityRespondsToUserInteraction")
    public native boolean accessibilityRespondsToUserInteraction();

    /**
     * Returns an appropriate, named context to help identify and classify the type of text inside this element.
     * This can be used by assistive technologies to choose an appropriate way to output the text.
     * For example, when encountering a source coding context, VoiceOver could choose to speak all punctuation.
     * To specify a substring within the textual context, use the UIAccessibilityTextAttributeContext attributed key.
     * default == nil
     */
    @Generated
    @Selector("accessibilityTextualContext")
    public native String accessibilityTextualContext();

    /**
     * Returns the localized label(s) that should be provided by the user to refer to this element.
     * Use this property when the accessibilityLabel is not appropriate for dictated or typed input.
     * For example, an element that contains additional descriptive information in its accessibilityLabel can return a more concise label.
     * The primary label should be first in the array, optionally followed by alternative labels in descending order of importance.
     * If this property returns an empty or invalid value, the accessibilityLabel will be used instead.
     * default == an empty array
     * default on UIKit controls == an array with an appropriate label, if different from accessibilityLabel
     */
    @Generated
    @Selector("accessibilityUserInputLabels")
    public native NSArray<String> accessibilityUserInputLabels();

    /**
     * The underlying attributed versions of the accessibility user input label(s).
     * Setting this property will change the value of the accessibilityUserInputLabels property and vice versa.
     */
    @Generated
    @Selector("setAccessibilityAttributedUserInputLabels:")
    public native void setAccessibilityAttributedUserInputLabels(NSArray<? extends NSAttributedString> value);

    /**
     * Returns whether the element performs an action based on user interaction.
     * For example, a button that causes UI to update when it is tapped should return YES.
     * A label whose only purpose is to display information should return NO.
     * default == derived from other accessibility properties (for example, an element with UIAccessibilityTraitNotEnabled returns NO)
     */
    @Generated
    @Selector("setAccessibilityRespondsToUserInteraction:")
    public native void setAccessibilityRespondsToUserInteraction(boolean value);

    /**
     * Returns an appropriate, named context to help identify and classify the type of text inside this element.
     * This can be used by assistive technologies to choose an appropriate way to output the text.
     * For example, when encountering a source coding context, VoiceOver could choose to speak all punctuation.
     * To specify a substring within the textual context, use the UIAccessibilityTextAttributeContext attributed key.
     * default == nil
     */
    @Generated
    @Selector("setAccessibilityTextualContext:")
    public native void setAccessibilityTextualContext(String value);

    /**
     * Returns the localized label(s) that should be provided by the user to refer to this element.
     * Use this property when the accessibilityLabel is not appropriate for dictated or typed input.
     * For example, an element that contains additional descriptive information in its accessibilityLabel can return a more concise label.
     * The primary label should be first in the array, optionally followed by alternative labels in descending order of importance.
     * If this property returns an empty or invalid value, the accessibilityLabel will be used instead.
     * default == an empty array
     * default on UIKit controls == an array with an appropriate label, if different from accessibilityLabel
     */
    @Generated
    @Selector("setAccessibilityUserInputLabels:")
    public native void setAccessibilityUserInputLabels(NSArray<String> value);
}
