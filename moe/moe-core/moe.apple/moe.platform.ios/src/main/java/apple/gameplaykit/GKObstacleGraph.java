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
 * A collection of GKGraphNodes that are governed by a set of extruded GKPolygonObstacles
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKObstacleGraph<_NodeType> extends GKGraph {
    static {
        NatJ.register();
    }

    @Generated
    protected GKObstacleGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKObstacleGraph<?> alloc();

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
    @Selector("graphWithNodes:")
    public static native GKObstacleGraph<?> graphWithNodes(NSArray<? extends GKGraphNode> nodes);

    /**
     * Creates an optimal bidirectional graph based on a list of obstacles.
     * Each vertex of each obstacle is extruded and a connection is made between each vertex that does not intersect an obstacle
     * Guaranteed not to have any edges which intersect obstacles.
     * Same effect as [[GKObstacleGraph alloc] init], setting bufferRadius, and then calling addObstacles.
     *
     * @param obstacles    a list of obstacles to create the graph from
     * @param bufferRadius the circular radius of a potential agent that will navigate this graph.  Obstacles are extruded by this amount to create the graph.  Must be positive.  Negative values are clipped to 0.0f
     */
    @Generated
    @Selector("graphWithObstacles:bufferRadius:")
    public static native <_NodeType> GKObstacleGraph<?> graphWithObstaclesBufferRadius(
            NSArray<? extends GKPolygonObstacle> obstacles, float bufferRadius);

    /**
     * Creates an optimal bidirectional graph based on a list of obstacles.
     * Each vertex of each obstacle is extruded and a connection is made between each vertex that does not intersect an obstacle
     * Guaranteed not to have any edges which intersect obstacles.
     * Same effect as [[GKObstacleGraph alloc] init], setting bufferRadius, and then calling addObstacles.
     *
     * @param obstacles    a list of obstacles to create the graph from
     * @param bufferRadius the circular radius of a potential agent that will navigate this graph.  Obstacles are extruded by this amount to create the graph.  Must be positive.  Negative values are clipped to 0.0f
     * @param nodeClass    the class of the nodes that this graph should create.  Must descend from GKGraphNode2D
     */
    @Generated
    @Selector("graphWithObstacles:bufferRadius:nodeClass:")
    public static native <_NodeType> GKObstacleGraph<?> graphWithObstaclesBufferRadiusNodeClass(
            NSArray<? extends GKPolygonObstacle> obstacles, float bufferRadius, Class nodeClass);

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
     * Adds obstacles to this graph.
     * Obstacle is extruded and graph nodes are generated from its vertices and then connected to this graph
     * Nothing is done if an obstacle is already present in this graph
     * Any existing connections that intersect the new obstacles are destroyed unless they are protected with [GKObstacleGraph lockConnection:]
     *
     * @param obstacles an array of obstacles to be added
     * @see lockConnection
     */
    @Generated
    @Selector("addObstacles:")
    public native void addObstacles(NSArray<? extends GKPolygonObstacle> obstacles);

    /**
     * The distance by which all obstacles are extruded.
     * This is most commonly the spatial bounding radius of a potential traveler on this path
     */
    @Generated
    @Selector("bufferRadius")
    public native float bufferRadius();

    /**
     * Returns the class of the specified generic index
     */
    @Generated
    @Selector("classForGenericArgumentAtIndex:")
    public native Class classForGenericArgumentAtIndex(@NUInt long index);

    /**
     * Connects the node to this graph by testing edge intersection with existing obstacles.
     * Same behavior as if this node had been present during initWithObstacles.
     *
     * @param node the node to connect
     */
    @Generated
    @Selector("connectNodeUsingObstacles:")
    public native void connectNodeUsingObstacles(GKGraphNode2D node);

    /**
     * Same behavior as connectNodeUsingObstacles: except you can optionally ignore the bounding radius of certain obstacles from being tested for intersection
     */
    @Generated
    @Selector("connectNodeUsingObstacles:ignoringBufferRadiusOfObstacles:")
    public native void connectNodeUsingObstaclesIgnoringBufferRadiusOfObstacles(GKGraphNode2D node,
            NSArray<? extends GKPolygonObstacle> obstaclesBufferRadiusToIgnore);

    /**
     * Same behavior as connectNodeUsingObstacles: except you can optionally ignore certain obstacles from being tested for intersection.
     */
    @Generated
    @Selector("connectNodeUsingObstacles:ignoringObstacles:")
    public native void connectNodeUsingObstaclesIgnoringObstacles(GKGraphNode2D node,
            NSArray<? extends GKPolygonObstacle> obstaclesToIgnore);

    @Generated
    @Selector("init")
    public native GKObstacleGraph<?> init();

    @Generated
    @Selector("initWithCoder:")
    public native GKObstacleGraph<?> initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNodes:")
    public native GKObstacleGraph<?> initWithNodes(NSArray<? extends GKGraphNode> nodes);

    @Generated
    @Selector("initWithObstacles:bufferRadius:")
    public native GKObstacleGraph<?> initWithObstaclesBufferRadius(NSArray<? extends GKPolygonObstacle> obstacles,
            float bufferRadius);

    @Generated
    @Selector("initWithObstacles:bufferRadius:nodeClass:")
    public native GKObstacleGraph<?> initWithObstaclesBufferRadiusNodeClass(
            NSArray<? extends GKPolygonObstacle> obstacles, float bufferRadius, Class nodeClass);

    /**
     * Query if a given connection is locked
     *
     * @param startNode startNode of the connection to query
     * @param endNode   endNode of the connection to query
     * @return YES if the connection was locked with lockConnection, NO if it was never locked or was unlocked via unlockConnection
     * @see lockConnection
     * @see unlockConnection
     */
    @Generated
    @Selector("isConnectionLockedFromNode:toNode:")
    public native boolean isConnectionLockedFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

    /**
     * Marks a connection as "locked", preventing this connection from being destroyed when you add obstacles that would intersect it
     *
     * @param startNode startNode of the connection to lock
     * @param endNode   endNode of the connection to lock
     */
    @Generated
    @Selector("lockConnectionFromNode:toNode:")
    public native void lockConnectionFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

    /**
     * Returns an array of the graph nodes associated with a given obstacle
     *
     * @param obstacle the obstacle who's nodes are to be retrieved
     */
    @Generated
    @Selector("nodesForObstacle:")
    public native NSArray<? extends GKGraphNode2D> nodesForObstacle(GKPolygonObstacle obstacle);

    /**
     * Array of the extruded obstacles currently represented by this graph
     */
    @Generated
    @Selector("obstacles")
    public native NSArray<? extends GKPolygonObstacle> obstacles();

    /**
     * Removes all obstacles from this graph.
     */
    @Generated
    @Selector("removeAllObstacles")
    public native void removeAllObstacles();

    /**
     * Removes obstacles from this graph.
     * All associated graph nodes are removed and their connections are bidirectionally removed.
     * Connections between obstacle nodes that were previously invalidated by any of these obstacles are restored.
     * Nothing is done if an obstacle is already present in this graph
     *
     * @param obstacles an array of obstacles to be removed
     */
    @Generated
    @Selector("removeObstacles:")
    public native void removeObstacles(NSArray<? extends GKPolygonObstacle> obstacles);

    /**
     * "Unlocks" a connection, removing its protection from being destroyed when you add obstacles that would intersect it
     *
     * @param startNode startNode of the connection to unlock
     * @param endNode   endNode of the connection to unlock
     * @see lockConnection
     */
    @Generated
    @Selector("unlockConnectionFromNode:toNode:")
    public native void unlockConnectionFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
