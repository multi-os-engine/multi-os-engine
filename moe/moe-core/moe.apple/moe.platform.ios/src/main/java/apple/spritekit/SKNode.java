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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.GKEntity;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UIFocusMovementHint;
import apple.uikit.UIFocusUpdateContext;
import apple.uikit.UIResponder;
import apple.uikit.UIView;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItem;
import apple.uikit.protocol.UIFocusItemContainer;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKNode extends UIResponder implements NSCopying, NSSecureCoding, UIFocusItem {
    static {
        NatJ.register();
    }

    @Generated
    protected SKNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKNode alloc();

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
    @Selector("node")
    public static native SKNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
    @Selector("actionForKey:")
    public native SKAction actionForKey(String key);

    @Generated
    @Selector("addChild:")
    public native void addChild(SKNode node);

    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

    @Generated
    @Selector("calculateAccumulatedFrame")
    @ByValue
    public native CGRect calculateAccumulatedFrame();

    @Generated
    @Selector("canBecomeFocused")
    public native boolean canBecomeFocused();

    @Generated
    @Selector("childNodeWithName:")
    public native SKNode childNodeWithName(String name);

    @Generated
    @Selector("children")
    public native NSArray<? extends SKNode> children();

    @Generated
    @Selector("constraints")
    public native NSArray<? extends SKConstraint> constraints();

    @Generated
    @Selector("containsPoint:")
    public native boolean containsPoint(@ByValue CGPoint p);

    @Generated
    @Selector("convertPoint:fromNode:")
    @ByValue
    public native CGPoint convertPointFromNode(@ByValue CGPoint point, SKNode node);

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
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("entity")
    public native GKEntity entity();

    @Generated
    @Selector("enumerateChildNodesWithName:usingBlock:")
    public native void enumerateChildNodesWithNameUsingBlock(String name,
            @ObjCBlock(name = "call_enumerateChildNodesWithNameUsingBlock") Block_enumerateChildNodesWithNameUsingBlock block);

    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    @Generated
    @Selector("hasActions")
    public native boolean hasActions();

    @Generated
    @Selector("inParentHierarchy:")
    public native boolean inParentHierarchy(SKNode parent);

    @Generated
    @Selector("init")
    public native SKNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("insertChild:atIndex:")
    public native void insertChildAtIndex(SKNode node, @NInt long index);

    @Generated
    @Selector("intersectsNode:")
    public native boolean intersectsNode(SKNode node);

    @Generated
    @Selector("isEqualToNode:")
    public native boolean isEqualToNode(SKNode node);

    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    @Generated
    @Selector("moveToParent:")
    public native void moveToParent(SKNode parent);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("nodeAtPoint:")
    public native SKNode nodeAtPoint(@ByValue CGPoint p);

    @Generated
    @Selector("nodesAtPoint:")
    public native NSArray<? extends SKNode> nodesAtPoint(@ByValue CGPoint p);

    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSArray<? extends SKNode> objectForKeyedSubscript(String name);

    @Generated
    @Selector("parent")
    public native SKNode parent();

    @Generated
    @Selector("physicsBody")
    public native SKPhysicsBody physicsBody();

    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("reachConstraints")
    public native SKReachConstraints reachConstraints();

    @Generated
    @Selector("removeActionForKey:")
    public native void removeActionForKey(String key);

    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    @Generated
    @Selector("removeAllChildren")
    public native void removeAllChildren();

    @Generated
    @Selector("removeChildrenInArray:")
    public native void removeChildrenInArray(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("removeFromParent")
    public native void removeFromParent();

    @Generated
    @Selector("runAction:")
    public native void runAction(SKAction action);

    @Generated
    @Selector("runAction:completion:")
    public native void runActionCompletion(SKAction action,
            @ObjCBlock(name = "call_runActionCompletion") Block_runActionCompletion block);

    @Generated
    @Selector("runAction:withKey:")
    public native void runActionWithKey(SKAction action, String key);

    @Generated
    @Selector("scene")
    public native SKScene scene();

    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    @Generated
    @Selector("setConstraints:")
    public native void setConstraints(NSArray<? extends SKConstraint> value);

    @Generated
    @Selector("setEntity:")
    public native void setEntity_unsafe(GKEntity value);

    @Generated
    public void setEntity(GKEntity value) {
        Object __old = entity();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setEntity_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    @Generated
    @Selector("setPhysicsBody:")
    public native void setPhysicsBody(SKPhysicsBody value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue CGPoint value);

    @Generated
    @Selector("setReachConstraints:")
    public native void setReachConstraints(SKReachConstraints value);

    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double scale);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    @Generated
    @Selector("setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> value);

    @Generated
    @Selector("setXScale:")
    public native void setXScale(@NFloat double value);

    @Generated
    @Selector("setYScale:")
    public native void setYScale(@NFloat double value);

    @Generated
    @Selector("setZPosition:")
    public native void setZPosition(@NFloat double value);

    @Generated
    @Selector("setZRotation:")
    public native void setZRotation(@NFloat double value);

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    @Generated
    @Selector("userData")
    public native NSMutableDictionary<?, ?> userData();

    @Generated
    @Selector("xScale")
    @NFloat
    public native double xScale();

    @Generated
    @Selector("yScale")
    @NFloat
    public native double yScale();

    @Generated
    @Selector("zPosition")
    @NFloat
    public native double zPosition();

    @Generated
    @Selector("zRotation")
    @NFloat
    public native double zRotation();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildNodesWithNameUsingBlock {
        @Generated
        void call_enumerateChildNodesWithNameUsingBlock(SKNode node, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runActionCompletion {
        @Generated
        void call_runActionCompletion();
    }

    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    @Generated
    @Selector("focusBehavior")
    @NInt
    public native long focusBehavior();

    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    @Generated
    @Selector("setFocusBehavior:")
    public native void setFocusBehavior(@NInt long value);

    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(SKAttributeValue value, String key);

    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);

    @Generated
    @IsOptional
    @Selector("didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItemContainer focusItemContainer();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKNode nodeWithFileNamedSecurelyWithClassesAndError(String filename,
            NSSet<? extends Class> classes, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusEnvironment parentFocusEnvironment();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
