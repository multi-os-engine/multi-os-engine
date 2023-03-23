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
import apple.foundation.protocol.NSCopying;
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
 * Representation of a directed graph of GKGraphNodes
 * 
 * API-Since: 9.0
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKGraph extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKGraph allocWithZone(VoidPtr zone);

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

    /**
     * Creates a graph with the provided array of nodes.
     * [@params] nodes the nodes to create the graph with
     */
    @Generated
    @Selector("graphWithNodes:")
    public static native GKGraph graphWithNodes(NSArray<? extends GKGraphNode> nodes);

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
    public static native GKGraph new_objc();

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
     * Adds nodes to this graph. No new connections are added.
     * If the node already exists in this graph this does nothing.
     * 
     * @param nodes and array of nodes to be added
     */
    @Generated
    @Selector("addNodes:")
    public native void addNodes(NSArray<? extends GKGraphNode> nodes);

    /**
     * Connects the node to this graph via the lowest cost node to reach in this graph
     * 
     * @param node          the node to connect
     * @param bidirectional should the connection be bidirectional? Otherwise it is one way connected into the graph
     */
    @Generated
    @Selector("connectNodeToLowestCostNode:bidirectional:")
    public native void connectNodeToLowestCostNodeBidirectional(GKGraphNode node, boolean bidirectional);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Attempts to find the optimal path between the two nodes indicated.
     * If such a path exists, it is returned in start to end order.
     * If it doesn't exist, the array returned will be empty.
     * Asserts if neither of these nodes are in this graph. Use [GKGraphNode findPathFromNode:] instead.
     * 
     * @param startNode node to start pathing from
     * @param endNode   goal node of the pathfinding attempt
     */
    @Generated
    @Selector("findPathFromNode:toNode:")
    public native NSArray<? extends GKGraphNode> findPathFromNodeToNode(GKGraphNode startNode, GKGraphNode endNode);

    @Generated
    @Selector("init")
    public native GKGraph init();

    @Generated
    @Selector("initWithCoder:")
    public native GKGraph initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNodes:")
    public native GKGraph initWithNodes(NSArray<? extends GKGraphNode> nodes);

    /**
     * The list of nodes in this graph
     */
    @Generated
    @Selector("nodes")
    public native NSArray<? extends GKGraphNode> nodes();

    /**
     * Removes nodes from this graph.
     * All connections starting and/or ending with this node are removed.
     * 
     * @param nodes an array of nodes to be removed
     */
    @Generated
    @Selector("removeNodes:")
    public native void removeNodes(NSArray<? extends GKGraphNode> nodes);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
