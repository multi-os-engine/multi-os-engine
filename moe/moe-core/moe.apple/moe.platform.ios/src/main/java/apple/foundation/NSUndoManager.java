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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUndoManager alloc();

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
    @Selector("beginUndoGrouping")
    public native void beginUndoGrouping();

    @Generated
    @Selector("canRedo")
    public native boolean canRedo();

    @Generated
    @Selector("canUndo")
    public native boolean canUndo();

    @Generated
    @Selector("disableUndoRegistration")
    public native void disableUndoRegistration();

    @Generated
    @Selector("enableUndoRegistration")
    public native void enableUndoRegistration();

    @Generated
    @Selector("endUndoGrouping")
    public native void endUndoGrouping();

    @Generated
    @Selector("groupingLevel")
    @NInt
    public native long groupingLevel();

    @Generated
    @Selector("groupsByEvent")
    public native boolean groupsByEvent();

    @Generated
    @Selector("init")
    public native NSUndoManager init();

    @Generated
    @Selector("isRedoing")
    public native boolean isRedoing();

    @Generated
    @Selector("isUndoRegistrationEnabled")
    public native boolean isUndoRegistrationEnabled();

    @Generated
    @Selector("isUndoing")
    public native boolean isUndoing();

    @Generated
    @Selector("levelsOfUndo")
    @NUInt
    public native long levelsOfUndo();

    @Generated
    @Selector("prepareWithInvocationTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object prepareWithInvocationTarget(@Mapped(ObjCObjectMapper.class) Object target);

    @Generated
    @Selector("redo")
    public native void redo();

    @Generated
    @Selector("redoActionIsDiscardable")
    public native boolean redoActionIsDiscardable();

    @Generated
    @Selector("redoActionName")
    public native String redoActionName();

    @Generated
    @Selector("redoMenuItemTitle")
    public native String redoMenuItemTitle();

    @Generated
    @Selector("redoMenuTitleForUndoActionName:")
    public native String redoMenuTitleForUndoActionName(String actionName);

    @Generated
    @Selector("registerUndoWithTarget:handler:")
    public native void registerUndoWithTargetHandler(@Mapped(ObjCObjectMapper.class) Object target,
            @ObjCBlock(name = "call_registerUndoWithTargetHandler") Block_registerUndoWithTargetHandler undoHandler);

    @Generated
    @Selector("registerUndoWithTarget:selector:object:")
    public native void registerUndoWithTargetSelectorObject(@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
            @Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    @Generated
    @Selector("removeAllActionsWithTarget:")
    public native void removeAllActionsWithTarget(@Mapped(ObjCObjectMapper.class) Object target);

    @Generated
    @Selector("runLoopModes")
    public native NSArray<String> runLoopModes();

    @Generated
    @Selector("setActionIsDiscardable:")
    public native void setActionIsDiscardable(boolean discardable);

    @Generated
    @Selector("setActionName:")
    public native void setActionName(String actionName);

    @Generated
    @Selector("setGroupsByEvent:")
    public native void setGroupsByEvent(boolean value);

    @Generated
    @Selector("setLevelsOfUndo:")
    public native void setLevelsOfUndo(@NUInt long value);

    @Generated
    @Selector("setRunLoopModes:")
    public native void setRunLoopModes(NSArray<String> value);

    @Generated
    @Selector("undo")
    public native void undo();

    @Generated
    @Selector("undoActionIsDiscardable")
    public native boolean undoActionIsDiscardable();

    @Generated
    @Selector("undoActionName")
    public native String undoActionName();

    @Generated
    @Selector("undoMenuItemTitle")
    public native String undoMenuItemTitle();

    @Generated
    @Selector("undoMenuTitleForUndoActionName:")
    public native String undoMenuTitleForUndoActionName(String actionName);

    @Generated
    @Selector("undoNestedGroup")
    public native void undoNestedGroup();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerUndoWithTargetHandler {
        @Generated
        void call_registerUndoWithTargetHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }
}
