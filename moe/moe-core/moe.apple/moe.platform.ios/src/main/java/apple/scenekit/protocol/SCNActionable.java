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

package apple.scenekit.protocol;

import apple.foundation.NSArray;
import apple.scenekit.SCNAction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNActionable")
public interface SCNActionable {
    /**
     * actionForKey:
     * <p>
     * Returns an action associated with a specific key.
     */
    @Generated
    @Selector("actionForKey:")
    SCNAction actionForKey(String key);

    /**
     * [@property] actionKeys
     * <p>
     * Returns an array containing the keys of all actions currently attached to the receiver.
     */
    @Generated
    @Selector("actionKeys")
    NSArray<String> actionKeys();

    /**
     * [@property] hasActions
     * <p>
     * Returns a Boolean value that indicates whether the node is executing actions.
     */
    @Generated
    @Selector("hasActions")
    boolean hasActions();

    /**
     * removeActionForKey:
     * <p>
     * Removes an action associated with a specific key.
     */
    @Generated
    @Selector("removeActionForKey:")
    void removeActionForKey(String key);

    /**
     * removeAllActions
     * <p>
     * Ends and removes all actions from the node.
     */
    @Generated
    @Selector("removeAllActions")
    void removeAllActions();

    /**
     * runAction:
     * <p>
     * Adds an action to the list of actions executed by the node.
     */
    @Generated
    @Selector("runAction:")
    void runAction(SCNAction action);

    /**
     * runAction:completionHandler:
     * <p>
     * Adds an action to the list of actions executed by the node. Your block is called when the action completes.
     */
    @Generated
    @Selector("runAction:completionHandler:")
    void runActionCompletionHandler(SCNAction action,
            @ObjCBlock(name = "call_runActionCompletionHandler") Block_runActionCompletionHandler block);

    /**
     * runAction:forKey:
     * <p>
     * Adds an identifiable action to the list of actions executed by the node.
     */
    @Generated
    @Selector("runAction:forKey:")
    void runActionForKey(SCNAction action, String key);

    /**
     * runAction:forKey:completionHandler:
     * <p>
     * Adds an identifiable action to the list of actions executed by the node. Your block is called when the action completes.
     */
    @Generated
    @Selector("runAction:forKey:completionHandler:")
    void runActionForKeyCompletionHandler(SCNAction action, String key,
            @ObjCBlock(name = "call_runActionForKeyCompletionHandler") Block_runActionForKeyCompletionHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runActionCompletionHandler {
        @Generated
        void call_runActionCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runActionForKeyCompletionHandler {
        @Generated
        void call_runActionForKeyCompletionHandler();
    }
}
