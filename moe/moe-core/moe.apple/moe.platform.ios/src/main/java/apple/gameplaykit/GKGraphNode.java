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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A node in a directed graph. Edges are directed and can have variable costs.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGraphNode extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGraphNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGraphNode alloc();

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

    /**
     * Add a connection to a group of other nodes indicating those nodes can be reached from this node.
     * A new connection is not created if it already exists.
     * 
     * @param nodes The array of nodes that are end points for their respective connections
     * @param bidirectional should a connection also be added connecting the destination node back to this node?
     */
    @Generated
    @Selector("addConnectionsToNodes:bidirectional:")
    public native void addConnectionsToNodesBidirectional(NSArray<? extends GKGraphNode> nodes, boolean bidirectional);

    /**
     * List of other graph nodes that this node has an edge leading to.
     */
    @Generated
    @Selector("connectedNodes")
    public native NSArray<? extends GKGraphNode> connectedNodes();

    /**
     * Returns the actual cost to reach the indicated node from this node
     */
    @Generated
    @Selector("costToNode:")
    public native float costToNode(GKGraphNode node);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Returns the estimated heuristic cost to reach the indicated node from this node
     * 
     * @param node The end point of the edge who's cost is to be estimated
     */
    @Generated
    @Selector("estimatedCostToNode:")
    public native float estimatedCostToNode(GKGraphNode node);

    /**
     * As with findPathToNode: except this node is the goal node and a startNode is specified
     * 
     * @param startNode the start node of the pathfinding attempt
     */
    @Generated
    @Selector("findPathFromNode:")
    public native NSArray<? extends GKGraphNode> findPathFromNode(GKGraphNode startNode);

    /**
     * Attempts to find the optimal path between this node and the indicated goal node.
     * If such a path exists, it is returned in start to end order.
     * If it doesn't exist, the array returned will be empty.
     * 
     * @param goalNode the goal node of the pathfinding attempt
     */
    @Generated
    @Selector("findPathToNode:")
    public native NSArray<? extends GKGraphNode> findPathToNode(GKGraphNode goalNode);

    @Generated
    @Selector("init")
    public native GKGraphNode init();

    @Generated
    @Selector("initWithCoder:")
    public native GKGraphNode initWithCoder(NSCoder coder);

    /**
     * Removes connections to a group of other nodes indicating those nodes can no longer be reached from this node.
     * Nothing happens if a particular connection does not exist.
     * 
     * @param nodes The array of nodes that are end points of the edges to be removed
     * @param bidirectional should the connection also be added the destination node back to this node also be removed if it exists?
     */
    @Generated
    @Selector("removeConnectionsToNodes:bidirectional:")
    public native void removeConnectionsToNodesBidirectional(NSArray<? extends GKGraphNode> nodes,
            boolean bidirectional);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
