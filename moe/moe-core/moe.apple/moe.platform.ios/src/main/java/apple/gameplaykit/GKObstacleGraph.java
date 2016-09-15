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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKObstacleGraph extends GKGraph {
    static {
        NatJ.register();
    }

    @Generated
    protected GKObstacleGraph(Pointer peer) {
        super(peer);
    }

    /**
     * addObstacles:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/addObstacles:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObstacles:")
    public native void addObstacles(NSArray<? extends GKPolygonObstacle> obstacles);

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKObstacleGraph alloc();

    /**
     * bufferRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instp/GKObstacleGraph/bufferRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("bufferRadius")
    public native float bufferRadius();

    /**
     * connectNodeUsingObstacles:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/connectNodeUsingObstacles:">iOS Dev Center</a>
     */
    @Generated
    @Selector("connectNodeUsingObstacles:")
    public native void connectNodeUsingObstacles(GKGraphNode2D node);

    /**
     * connectNodeUsingObstacles:ignoringBufferRadiusOfObstacles:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/connectNodeUsingObstacles:ignoringBufferRadiusOfObstacles:">iOS Dev Center</a>
     */
    @Generated
    @Selector("connectNodeUsingObstacles:ignoringBufferRadiusOfObstacles:")
    public native void connectNodeUsingObstaclesIgnoringBufferRadiusOfObstacles(GKGraphNode2D node,
            NSArray<? extends GKPolygonObstacle> obstaclesBufferRadiusToIgnore);

    /**
     * connectNodeUsingObstacles:ignoringObstacles:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/connectNodeUsingObstacles:ignoringObstacles:">iOS Dev Center</a>
     */
    @Generated
    @Selector("connectNodeUsingObstacles:ignoringObstacles:")
    public native void connectNodeUsingObstaclesIgnoringObstacles(GKGraphNode2D node,
            NSArray<? extends GKPolygonObstacle> obstaclesToIgnore);

    @Generated
    @Selector("graphWithNodes:")
    public static native GKObstacleGraph graphWithNodes(NSArray<? extends GKGraphNode> nodes);

    /**
     * graphWithObstacles:bufferRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/clm/GKObstacleGraph/graphWithObstacles:bufferRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("graphWithObstacles:bufferRadius:")
    public static native GKObstacleGraph graphWithObstaclesBufferRadius(NSArray<? extends GKPolygonObstacle> obstacles,
            float bufferRadius);

    @Generated
    @Selector("init")
    public native GKObstacleGraph init();

    @Generated
    @Selector("initWithNodes:")
    public native GKObstacleGraph initWithNodes(NSArray<? extends GKGraphNode> nodes);

    /**
     * initWithObstacles:bufferRadius:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/initWithObstacles:bufferRadius:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithObstacles:bufferRadius:")
    public native GKObstacleGraph initWithObstaclesBufferRadius(NSArray<? extends GKPolygonObstacle> obstacles,
            float bufferRadius);

    /**
     * isConnectionLockedFromNode:toNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/isConnectionLockedFromNode:toNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isConnectionLockedFromNode:toNode:")
    public native boolean isConnectionLockedFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

    /**
     * lockConnectionFromNode:toNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/lockConnectionFromNode:toNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lockConnectionFromNode:toNode:")
    public native void lockConnectionFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

    /**
     * nodesForObstacle:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/nodesForObstacle:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nodesForObstacle:")
    public native NSArray<? extends GKGraphNode2D> nodesForObstacle(GKPolygonObstacle obstacle);

    /**
     * obstacles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instp/GKObstacleGraph/obstacles">iOS Dev Center</a>
     */
    @Generated
    @Selector("obstacles")
    public native NSArray<? extends GKPolygonObstacle> obstacles();

    /**
     * removeAllObstacles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/removeAllObstacles">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllObstacles")
    public native void removeAllObstacles();

    /**
     * removeObstacles:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/removeObstacles:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObstacles:")
    public native void removeObstacles(NSArray<? extends GKPolygonObstacle> obstacles);

    /**
     * unlockConnectionFromNode:toNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameplayKit/Reference/GKObstacleGraph_Class/index.html#//apple_ref/occ/instm/GKObstacleGraph/unlockConnectionFromNode:toNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unlockConnectionFromNode:toNode:")
    public native void unlockConnectionFromNodeToNode(GKGraphNode2D startNode, GKGraphNode2D endNode);

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
