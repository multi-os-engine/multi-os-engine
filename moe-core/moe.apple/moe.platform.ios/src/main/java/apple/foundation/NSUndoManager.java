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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUndoManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSUndoManager new_objc();

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
     * Marks the beginning of an undo group.
     * 
     * All individual undo operations before a subsequent ``endUndoGrouping`` message are grouped together and reversed
     * by a later ``undo`` message. By default undo groups are begun automatically at the start of the event loop, but
     * you can begin your own undo groups with this method, and nest them within other groups.
     * 
     * This method posts an ``NSUndoManagerCheckpointNotification`` unless a top-level undo is in progress. It posts an
     * ``NSUndoManagerDidOpenUndoGroupNotification`` if a new group was successfully created.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("beginUndoGrouping")
    public native void beginUndoGrouping();

    /**
     * Whether the receiver has any actions to redo.
     * 
     * Because any undo operation registered clears the redo stack, this method posts an
     * NSUndoManagerCheckpointNotification to allow clients to apply their pending operations before testing the redo
     * stack.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("canRedo")
    public native boolean canRedo();

    /**
     * Whether the receiver has any actions to undo.
     * 
     * The return value does not mean you can safely invoke ``undo`` or ``undoNestedGroup`` — you may have to close open
     * undo groups first.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("canUndo")
    public native boolean canUndo();

    /**
     * Disables the recording of undo operations, whether by ``registerUndoWithTarget:selector:object:`` or by
     * invocation-based undo.
     * 
     * This method can be invoked multiple times by multiple clients. The ``enableUndoRegistration`` method must be
     * invoked an equal number of times to re-enable undo registration.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("disableUndoRegistration")
    public native void disableUndoRegistration();

    /**
     * Enables the recording of undo operations.
     * 
     * Because undo registration is enabled by default, this is used to balance a prior ``disableUndoRegistration``.
     * Undo registration isn’t actually re-enabled until an enable message balances the last disable message in effect.
     * Raises an NSInternalInconsistencyException if invoked while no disableUndoRegistration() message is in effect.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("enableUndoRegistration")
    public native void enableUndoRegistration();

    /**
     * Marks the end of an undo group.
     * 
     * All individual undo operations back to the matching ``beginUndoGrouping`` message are grouped together and
     * reversed by a later ``undo`` or ``undoNestedGroup`` message. Undo groups can be nested, thus providing
     * functionality similar to nested transactions. Raises an ``NSInternalInconsistencyException`` if there’s no
     * ``beginUndoGrouping`` message in effect.
     * 
     * This method posts an ``NSUndoManagerCheckpointNotification`` and an
     * ``NSUndoManagerDidCloseUndoGroupNotification`` just before the group is closed.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("endUndoGrouping")
    public native void endUndoGrouping();

    /**
     * The number of nested undo groups (or redo groups, if Redo was invoked last) in the current event loop.
     * 
     * An integer indicating the number of nested groups. If `0` is returned, there is no open undo or redo group.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("groupingLevel")
    @NInt
    public native long groupingLevel();

    /**
     * A Boolean value that indicates whether the receiver automatically creates undo groups around each pass of the run
     * loop.
     * 
     * If `true`, the receiver automatically creates undo groups around each pass of the run loop.
     * The default is `true`. If you turn automatic grouping off, you must close groups explicitly before invoking
     * either ``undo`` or ``undoNestedGroup``.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("groupsByEvent")
    public native boolean groupsByEvent();

    @Generated
    @Selector("init")
    public native NSUndoManager init();

    /**
     * Whether the receiver is in the process of performing its ``redo`` method.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isRedoing")
    public native boolean isRedoing();

    /**
     * Whether the recording of undo operations is enabled.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isUndoRegistrationEnabled")
    public native boolean isUndoRegistrationEnabled();

    /**
     * Whether the receiver is in the process of performing its ``undo`` or ``undoNestedGroup`` method.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isUndoing")
    public native boolean isUndoing();

    /**
     * The maximum number of top-level undo groups the receiver holds.
     * 
     * An integer specifying the number of undo groups. A limit of 0 indicates no limit, so old undo groups are never
     * dropped.
     * When ending an undo group results in the number of groups exceeding this limit, the oldest groups are dropped
     * from the stack. The default is 0.
     * If you change the limit to a level below the prior limit, old undo groups are immediately dropped.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("levelsOfUndo")
    @NUInt
    public native long levelsOfUndo();

    /**
     * Prepares the undo manager for invocation-based undo with the given target as the subject of the next undo
     * operation.
     * 
     * For example, when called as:
     * 
     * [[undoManager prepareWithInvocationTarget:target] setFont:oldFont color:oldColor]
     * 
     * When undo is called, the specified target will be called with
     * 
     * [target setFont:oldFont color:oldColor]
     * 
     * - Parameter target: The target of the undo operation. The undo manager maintains a weak reference to `target`.
     * - Returns: A proxy object that forwards messages to the undo manager for recording as undo actions.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("prepareWithInvocationTarget:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object prepareWithInvocationTarget(@NotNull @Mapped(ObjCObjectMapper.class) Object target);

    /**
     * Performs the operations in the last group on the redo stack, if there are any, recording them on the undo stack
     * as a single group.
     * 
     * Raises an ``NSInternalInconsistencyException`` if the method is invoked during an undo operation.
     * This method posts an ``NSUndoManagerCheckpointNotification`` and ``NSUndoManagerWillRedoChangeNotification``
     * before it performs the redo operation, and it posts the ``NSUndoManagerDidRedoChangeNotification`` after it
     * performs the redo operation.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("redo")
    public native void redo();

    /**
     * Whether the next redo action is discardable.
     * 
     * Specifies that the latest redo action may be safely discarded when a document can not be saved for any reason.
     * These are typically actions that don’t affect persistent state.
     * An example might be an redo action that changes the viewable area of a document.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("redoActionIsDiscardable")
    public native boolean redoActionIsDiscardable();

    /**
     * The name identifying the redo action.
     * 
     * The redo action name. Returns an empty string if no action name has been assigned or if there is nothing to redo.
     * For example, if the menu title is “Redo Delete,” the string returned is “Delete.”
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("redoActionName")
    public native String redoActionName();

    /**
     * The complete title of the Redo menu command, for example, “Redo Paste.”
     * 
     * Returns “Redo” if no action name has been assigned or nil if there is nothing to redo.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("redoMenuItemTitle")
    public native String redoMenuItemTitle();

    /**
     * Returns the complete, localized title of the Redo menu command for the action identified by the given name.
     * 
     * Override this method if you want to customize the localization behaviour. This method is invoked by
     * ``redoMenuItemTitle``.
     * 
     * - Parameter actionName: The name of the redo action.
     * - Returns: The localized title of the redo menu item.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("redoMenuTitleForUndoActionName:")
    public native String redoMenuTitleForUndoActionName(@NotNull String actionName);

    /**
     * Records a single undo operation for a given target so that when an undo is performed, it executes the specified
     * block.
     * 
     * As with other undo operations, this does not strongly retain target. Care should be taken to avoid introducing
     * retain cycles by other references captured by the block.
     * 
     * - Parameter target: The target of the undo operation.
     * - Parameter undoHandler: The block to be executed when an operation is undone. The block takes a single argument,
     * the target of the undo operation.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("registerUndoWithTarget:handler:")
    public native void registerUndoWithTargetHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @NotNull @ObjCBlock(name = "call_registerUndoWithTargetHandler") Block_registerUndoWithTargetHandler undoHandler);

    /**
     * Registers the selector of the specified target to implement a single undo operation that the target receives.
     * 
     * - Parameter target: The target of the undo operation. The undo manager maintains an unowned reference to `target`
     * to prevent retain cycles.
     * - Parameter selector: The selector for the undo operation.
     * - Parameter object: The argument sent with the selector. The undo manager maintains a strong reference to
     * `object`
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("registerUndoWithTarget:selector:object:")
    public native void registerUndoWithTargetSelectorObject(@NotNull @Mapped(ObjCObjectMapper.class) Object target,
            @NotNull SEL selector, @Nullable @Mapped(ObjCObjectMapper.class) Object object);

    /**
     * Clears the undo and redo stacks and re-enables the receiver.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    /**
     * Clears the undo and redo stacks of all operations involving the specified target as the recipient of the undo
     * message.
     * 
     * Doesn't re-enable the receiver if it's disabled.
     * 
     * - Parameter target: The recepient of the undo mesages to be removed.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("removeAllActionsWithTarget:")
    public native void removeAllActionsWithTarget(@NotNull @Mapped(ObjCObjectMapper.class) Object target);

    /**
     * The modes governing the types of input handled during a cycle of the run loop.
     * 
     * An array of string constants specifying the current run-loop modes.
     * By default, the sole run-loop mode is ``NSDefaultRunLoopMode`` (which excludes data from ``NSConnection``
     * objects). Some examples of other uses are to limit the input to data received during a mouse-tracking session by
     * setting the mode to ``NSEventTrackingRunLoopMode``, or limit it to data received from a modal panel with
     * ``NSModalPanelRunLoopMode``.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("runLoopModes")
    public native NSArray<String> runLoopModes();

    /**
     * Sets whether the next undo or redo action is discardable.
     * 
     * Specifies that the latest undo action may be safely discarded when a document can not be saved for any reason.
     * An example might be an undo action that changes the viewable area of a document.
     * To find out if an undo group contains only discardable actions, look for the
     * ``NSUndoManagerGroupIsDiscardableKey`` in the `userInfo` dictionary of the
     * ``NSUndoManagerWillCloseUndoGroupNotification``.
     * 
     * - Parameter discardable: Specifies if the action is discardable. YES if the next undo or redo action can be
     * discarded; NO otherwise.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setActionIsDiscardable:")
    public native void setActionIsDiscardable(boolean discardable);

    /**
     * Sets the name of the action associated with the Undo or Redo command.
     * 
     * If actionName is an empty string, the action name currently associated with the menu command is removed. There is
     * no effect if actionName is nil.
     * 
     * - Parameter actionName: The name of the action.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setActionName:")
    public native void setActionName(@NotNull String actionName);

    /**
     * A Boolean value that indicates whether the receiver automatically creates undo groups around each pass of the run
     * loop.
     * 
     * If `true`, the receiver automatically creates undo groups around each pass of the run loop.
     * The default is `true`. If you turn automatic grouping off, you must close groups explicitly before invoking
     * either ``undo`` or ``undoNestedGroup``.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setGroupsByEvent:")
    public native void setGroupsByEvent(boolean value);

    /**
     * The maximum number of top-level undo groups the receiver holds.
     * 
     * An integer specifying the number of undo groups. A limit of 0 indicates no limit, so old undo groups are never
     * dropped.
     * When ending an undo group results in the number of groups exceeding this limit, the oldest groups are dropped
     * from the stack. The default is 0.
     * If you change the limit to a level below the prior limit, old undo groups are immediately dropped.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setLevelsOfUndo:")
    public native void setLevelsOfUndo(@NUInt long value);

    /**
     * The modes governing the types of input handled during a cycle of the run loop.
     * 
     * An array of string constants specifying the current run-loop modes.
     * By default, the sole run-loop mode is ``NSDefaultRunLoopMode`` (which excludes data from ``NSConnection``
     * objects). Some examples of other uses are to limit the input to data received during a mouse-tracking session by
     * setting the mode to ``NSEventTrackingRunLoopMode``, or limit it to data received from a modal panel with
     * ``NSModalPanelRunLoopMode``.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setRunLoopModes:")
    public native void setRunLoopModes(@NotNull NSArray<String> value);

    /**
     * Closes the top-level undo group if necessary and invokes ``undoNestedGroup``.
     * 
     * This method also invokes ``endUndoGrouping`` if the nesting level is 1. Raises an
     * ``NSInternalInconsistencyException`` if more than one undo group is open (that is, if the last group isn’t at the
     * top level).
     * This method posts an ``NSUndoManagerCheckpointNotification``.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("undo")
    public native void undo();

    /**
     * Whether the next undo action is discardable.
     * 
     * Specifies that the latest undo action may be safely discarded when a document can not be saved for any reason.
     * These are typically actions that don’t affect persistent state.
     * An example might be an undo action that changes the viewable area of a document.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("undoActionIsDiscardable")
    public native boolean undoActionIsDiscardable();

    /**
     * The name identifying the undo action.
     * 
     * The undo action name. Returns an empty string if no action name has been assigned or if there is nothing to undo.
     * For example, if the menu title is “Undo Delete,” the string returned is “Delete.”
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("undoActionName")
    public native String undoActionName();

    /**
     * The complete title of the Undo menu command, for example, “Undo Paste.”
     * 
     * Returns “Undo” if no action name has been assigned or nil if there is nothing to undo.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("undoMenuItemTitle")
    public native String undoMenuItemTitle();

    /**
     * Returns the complete, localized title of the Undo menu command for the action identified by the given name.
     * 
     * Override this method if you want to customize the localization behaviour. This method is invoked by
     * ``undoMenuItemTitle``.
     * 
     * - Parameter actionName: The name of the undo action.
     * - Returns: The localized title of the undo menu item.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("undoMenuTitleForUndoActionName:")
    public native String undoMenuTitleForUndoActionName(@NotNull String actionName);

    /**
     * Performs the undo operations in the last undo group (whether top-level or nested), recording the operations on
     * the redo stack as a single group.
     * 
     * Raises an ``NSInternalInconsistencyException`` if any undo operations have been registered since the last
     * ``enableUndoRegistration`` message.
     * This method posts an ``NSUndoManagerCheckpointNotification`` and ``NSUndoManagerWillUndoChangeNotification``
     * before it performs the undo operation, and it posts an ``NSUndoManagerDidUndoChangeNotification`` after it
     * performs the undo operation.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("undoNestedGroup")
    public native void undoNestedGroup();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerUndoWithTargetHandler {
        @Generated
        void call_registerUndoWithTargetHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object target);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Get a value from the redo action's user info
     * 
     * - Parameter key: Which value should be retrieved
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("redoActionUserInfoValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object redoActionUserInfoValueForKey(@NotNull String key);

    /**
     * How many times `redo` can be invoked before there are no more actions left to
     * be redone
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("redoCount")
    @NUInt
    public native long redoCount();

    /**
     * Set user info for the Undo or Redo command.
     * - Parameter info: Value to be saved in the user info
     * - Parameter key: Key at which the object should be saved
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setActionUserInfoValue:forKey:")
    public native void setActionUserInfoValueForKey(@Mapped(ObjCObjectMapper.class) @Nullable Object info,
            @NotNull String key);

    /**
     * Get a value from the undo action's user info
     * 
     * - Parameter key: Which value should be retrieved
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("undoActionUserInfoValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object undoActionUserInfoValueForKey(@NotNull String key);

    /**
     * How many times `undo` can be invoked before there are no more actions left to
     * be undone
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("undoCount")
    @NUInt
    public native long undoCount();
}
