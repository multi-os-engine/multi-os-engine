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

package apple.foundation;

import apple.NSObject;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUndoManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUndoManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUndoManager alloc();

    /**
     * beginUndoGrouping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/beginUndoGrouping">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginUndoGrouping")
    public native void beginUndoGrouping();

    /**
     * canRedo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/canRedo">iOS Dev Center</a>
     */
    @Generated
    @Selector("canRedo")
    public native boolean canRedo();

    /**
     * canUndo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/canUndo">iOS Dev Center</a>
     */
    @Generated
    @Selector("canUndo")
    public native boolean canUndo();

    /**
     * disableUndoRegistration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/disableUndoRegistration">iOS Dev Center</a>
     */
    @Generated
    @Selector("disableUndoRegistration")
    public native void disableUndoRegistration();

    /**
     * enableUndoRegistration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/enableUndoRegistration">iOS Dev Center</a>
     */
    @Generated
    @Selector("enableUndoRegistration")
    public native void enableUndoRegistration();

    /**
     * endUndoGrouping</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/endUndoGrouping">iOS Dev Center</a>
     */
    @Generated
    @Selector("endUndoGrouping")
    public native void endUndoGrouping();

    /**
     * groupingLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/groupingLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("groupingLevel")
    @NInt
    public native long groupingLevel();

    /**
     * groupsByEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/groupsByEvent">iOS Dev Center</a>
     */
    @Generated
    @Selector("groupsByEvent")
    public native boolean groupsByEvent();

    @Generated
    @Selector("init")
    public native NSUndoManager init();

    /**
     * redoing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/redoing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRedoing")
    public native boolean isRedoing();

    /**
     * undoRegistrationEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/undoRegistrationEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isUndoRegistrationEnabled")
    public native boolean isUndoRegistrationEnabled();

    /**
     * undoing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/undoing">iOS Dev Center</a>
     */
    @Generated
    @Selector("isUndoing")
    public native boolean isUndoing();

    /**
     * levelsOfUndo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/levelsOfUndo">iOS Dev Center</a>
     */
    @Generated
    @Selector("levelsOfUndo")
    @NUInt
    public native long levelsOfUndo();

    /**
     * prepareWithInvocationTarget:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/prepareWithInvocationTarget:">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareWithInvocationTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object prepareWithInvocationTarget(@Mapped(ObjCObjectMapper.class) Object target);

    /**
     * redo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/redo">iOS Dev Center</a>
     */
    @Generated
    @Selector("redo")
    public native void redo();

    /**
     * redoActionIsDiscardable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/redoActionIsDiscardable">iOS Dev Center</a>
     */
    @Generated
    @Selector("redoActionIsDiscardable")
    public native boolean redoActionIsDiscardable();

    /**
     * redoActionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/redoActionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("redoActionName")
    public native String redoActionName();

    /**
     * redoMenuItemTitle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/redoMenuItemTitle">iOS Dev Center</a>
     */
    @Generated
    @Selector("redoMenuItemTitle")
    public native String redoMenuItemTitle();

    /**
     * redoMenuTitleForUndoActionName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/redoMenuTitleForUndoActionName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("redoMenuTitleForUndoActionName:")
    public native String redoMenuTitleForUndoActionName(String actionName);

    /**
     * registerUndoWithTarget:selector:object:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/registerUndoWithTarget:selector:object:">iOS Dev Center</a>
     */
    @Generated
    @Selector("registerUndoWithTarget:selector:object:")
    public native void registerUndoWithTargetSelectorObject(@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
            @Mapped(ObjCObjectMapper.class) Object anObject);

    /**
     * removeAllActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/removeAllActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    /**
     * removeAllActionsWithTarget:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/removeAllActionsWithTarget:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllActionsWithTarget:")
    public native void removeAllActionsWithTarget(@Mapped(ObjCObjectMapper.class) Object target);

    /**
     * runLoopModes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/runLoopModes">iOS Dev Center</a>
     */
    @Generated
    @Selector("runLoopModes")
    public native NSArray<String> runLoopModes();

    /**
     * setActionIsDiscardable:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/setActionIsDiscardable:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActionIsDiscardable:")
    public native void setActionIsDiscardable(boolean discardable);

    /**
     * setActionName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/setActionName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActionName:")
    public native void setActionName(String actionName);

    /**
     * groupsByEvent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/groupsByEvent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGroupsByEvent:")
    public native void setGroupsByEvent(boolean value);

    /**
     * levelsOfUndo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/levelsOfUndo">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLevelsOfUndo:")
    public native void setLevelsOfUndo(@NUInt long value);

    /**
     * runLoopModes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/runLoopModes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRunLoopModes:")
    public native void setRunLoopModes(NSArray<String> value);

    /**
     * undo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/undo">iOS Dev Center</a>
     */
    @Generated
    @Selector("undo")
    public native void undo();

    /**
     * undoActionIsDiscardable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/undoActionIsDiscardable">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoActionIsDiscardable")
    public native boolean undoActionIsDiscardable();

    /**
     * undoActionName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/undoActionName">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoActionName")
    public native String undoActionName();

    /**
     * undoMenuItemTitle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instp/NSUndoManager/undoMenuItemTitle">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoMenuItemTitle")
    public native String undoMenuItemTitle();

    /**
     * undoMenuTitleForUndoActionName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/undoMenuTitleForUndoActionName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoMenuTitleForUndoActionName:")
    public native String undoMenuTitleForUndoActionName(String actionName);

    /**
     * undoNestedGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSUndoManager_Class/index.html#//apple_ref/occ/instm/NSUndoManager/undoNestedGroup">iOS Dev Center</a>
     */
    @Generated
    @Selector("undoNestedGroup")
    public native void undoNestedGroup();

    @Generated
    @Selector("registerUndoWithTarget:handler:")
    public native void registerUndoWithTargetHandler(@Mapped(ObjCObjectMapper.class) Object target,
            @ObjCBlock(name = "call_registerUndoWithTargetHandler") Block_registerUndoWithTargetHandler undoHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerUndoWithTargetHandler {
        @Generated
        void call_registerUndoWithTargetHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

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
