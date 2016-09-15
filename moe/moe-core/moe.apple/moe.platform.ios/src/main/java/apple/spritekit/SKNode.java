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

package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIResponder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKNode extends UIResponder implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKNode(Pointer peer) {
        super(peer);
    }

    /**
     * actionForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/actionForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("actionForKey:")
    public native SKAction actionForKey(String key);

    /**
     * addChild:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/addChild:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addChild:")
    public native void addChild(SKNode node);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKNode alloc();

    /**
     * alpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/alpha">iOS Dev Center</a>
     */
    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

    /**
     * calculateAccumulatedFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/calculateAccumulatedFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("calculateAccumulatedFrame")
    @ByValue
    public native CGRect calculateAccumulatedFrame();

    /**
     * childNodeWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/childNodeWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("childNodeWithName:")
    public native SKNode childNodeWithName(String name);

    /**
     * children</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/children">iOS Dev Center</a>
     */
    @Generated
    @Selector("children")
    public native NSArray<? extends SKNode> children();

    /**
     * constraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/constraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraints")
    public native NSArray<? extends SKConstraint> constraints();

    /**
     * containsPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/containsPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsPoint:")
    public native boolean containsPoint(@ByValue CGPoint p);

    /**
     * convertPoint:fromNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/convertPoint:fromNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:fromNode:")
    @ByValue
    public native CGPoint convertPointFromNode(@ByValue CGPoint point, SKNode node);

    /**
     * convertPoint:toNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/convertPoint:toNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:toNode:")
    @ByValue
    public native CGPoint convertPointToNode(@ByValue CGPoint point, SKNode node);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateChildNodesWithName:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/enumerateChildNodesWithName:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateChildNodesWithName:usingBlock:")
    public native void enumerateChildNodesWithNameUsingBlock(String name,
            @ObjCBlock(name = "call_enumerateChildNodesWithNameUsingBlock") Block_enumerateChildNodesWithNameUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildNodesWithNameUsingBlock {
        @Generated
        void call_enumerateChildNodesWithNameUsingBlock(SKNode arg0, BoolPtr arg1);
    }

    /**
     * frame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/frame">iOS Dev Center</a>
     */
    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    /**
     * hasActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/hasActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasActions")
    public native boolean hasActions();

    /**
     * inParentHierarchy:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/inParentHierarchy:">iOS Dev Center</a>
     */
    @Generated
    @Selector("inParentHierarchy:")
    public native boolean inParentHierarchy(SKNode parent);

    @Generated
    @Selector("init")
    public native SKNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKNode initWithCoder(NSCoder aDecoder);

    /**
     * insertChild:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/insertChild:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertChild:atIndex:")
    public native void insertChildAtIndex(SKNode node, @NInt long index);

    /**
     * intersectsNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/intersectsNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("intersectsNode:")
    public native boolean intersectsNode(SKNode node);

    /**
     * isEqualToNode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/isEqualToNode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToNode:")
    public native boolean isEqualToNode(SKNode node);

    /**
     * hidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/hidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * userInteractionEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/userInteractionEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * node</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/clm/SKNode/node">iOS Dev Center</a>
     */
    @Generated
    @Selector("node")
    public static native SKNode node();

    /**
     * nodeAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/nodeAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nodeAtPoint:")
    public native SKNode nodeAtPoint(@ByValue CGPoint p);

    /**
     * nodeWithFileNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/clm/SKNode/nodeWithFileNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKNode nodeWithFileNamed(String filename);

    /**
     * nodesAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/nodesAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("nodesAtPoint:")
    public native NSArray<? extends SKNode> nodesAtPoint(@ByValue CGPoint p);

    /**
     * objectForKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/objectForKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSArray<? extends SKNode> objectForKeyedSubscript(String name);

    /**
     * parent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/parent">iOS Dev Center</a>
     */
    @Generated
    @Selector("parent")
    public native SKNode parent();

    /**
     * physicsBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/physicsBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("physicsBody")
    public native SKPhysicsBody physicsBody();

    /**
     * position</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/position">iOS Dev Center</a>
     */
    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    /**
     * reachConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/reachConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("reachConstraints")
    public native SKReachConstraints reachConstraints();

    /**
     * removeActionForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/removeActionForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeActionForKey:")
    public native void removeActionForKey(String key);

    /**
     * removeAllActions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/removeAllActions">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    /**
     * removeAllChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/removeAllChildren">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllChildren")
    public native void removeAllChildren();

    /**
     * removeChildrenInArray:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/removeChildrenInArray:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeChildrenInArray:")
    public native void removeChildrenInArray(NSArray<? extends SKNode> nodes);

    /**
     * removeFromParent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/removeFromParent">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromParent")
    public native void removeFromParent();

    /**
     * runAction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/runAction:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runAction:")
    public native void runAction(SKAction action);

    /**
     * runAction:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/runAction:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runAction:completion:")
    public native void runActionCompletion(SKAction action,
            @ObjCBlock(name = "call_runActionCompletion") Block_runActionCompletion block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runActionCompletion {
        @Generated
        void call_runActionCompletion();
    }

    /**
     * runAction:withKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/runAction:withKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("runAction:withKey:")
    public native void runActionWithKey(SKAction action, String key);

    /**
     * scene</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/scene">iOS Dev Center</a>
     */
    @Generated
    @Selector("scene")
    public native SKScene scene();

    /**
     * alpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/alpha">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    /**
     * constraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/constraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("setConstraints:")
    public native void setConstraints(NSArray<? extends SKConstraint> value);

    /**
     * hidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/hidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * paused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/paused">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * physicsBody</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/physicsBody">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPhysicsBody:")
    public native void setPhysicsBody(SKPhysicsBody value);

    /**
     * position</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/position">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue CGPoint value);

    /**
     * reachConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/reachConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReachConstraints:")
    public native void setReachConstraints(SKReachConstraints value);

    /**
     * setScale:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/setScale:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double scale);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * userData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/userData">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> value);

    /**
     * userInteractionEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/userInteractionEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    /**
     * xScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/xScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setXScale:")
    public native void setXScale(@NFloat double value);

    /**
     * yScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/yScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setYScale:")
    public native void setYScale(@NFloat double value);

    /**
     * zPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/zPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZPosition:")
    public native void setZPosition(@NFloat double value);

    /**
     * zRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/zRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZRotation:")
    public native void setZRotation(@NFloat double value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    /**
     * userData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/userData">iOS Dev Center</a>
     */
    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    /**
     * xScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/xScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("xScale")
    @NFloat
    public native double xScale();

    /**
     * yScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/yScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("yScale")
    @NFloat
    public native double yScale();

    /**
     * zPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/zPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("zPosition")
    @NFloat
    public native double zPosition();

    /**
     * zRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instp/SKNode/zRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("zRotation")
    @NFloat
    public native double zRotation();

    /**
     * moveToParent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/instm/SKNode/moveToParent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("moveToParent:")
    public native void moveToParent(SKNode parent);

    /**
     * obstaclesFromNodeBounds:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/clm/SKNode/obstaclesFromNodeBounds:">iOS Dev Center</a>
     */
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    /**
     * obstaclesFromNodePhysicsBodies:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/clm/SKNode/obstaclesFromNodePhysicsBodies:">iOS Dev Center</a>
     */
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    /**
     * obstaclesFromSpriteTextures:accuracy:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKNode_Ref/index.html#//apple_ref/occ/clm/SKNode/obstaclesFromSpriteTextures:accuracy:">iOS Dev Center</a>
     */
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    public static native void load_objc();

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
    public static native long version();
}
