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

package apple.scenekit;

import apple.NSObject;
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLObject;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNActionable;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNBoundingVolume;
import apple.scenekit.protocol.SCNNodeRendererDelegate;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
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
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNNode extends NSObject
        implements NSCopying, NSSecureCoding, SCNAnimatable, SCNActionable, SCNBoundingVolume {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNNode alloc();

    @Generated
    @Selector("node")
    public static native SCNNode node();

    @Generated
    @Selector("nodeWithGeometry:")
    public static native SCNNode nodeWithGeometry(SCNGeometry geometry);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("nodeWithMDLObject:")
    public static native SCNNode nodeWithMDLObject(MDLObject mdlObject);

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
    public native SCNAction actionForKey(String key);

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(CAAnimation animation, String key);

    @Generated
    @Selector("addChildNode:")
    public native void addChildNode(SCNNode child);

    @Generated
    @Selector("addParticleSystem:")
    public native void addParticleSystem(SCNParticleSystem system);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("camera")
    public native SCNCamera camera();

    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Selector("childNodeWithName:recursively:")
    public native SCNNode childNodeWithNameRecursively(String name, boolean recursively);

    @Generated
    @Selector("childNodes")
    public native NSArray<? extends SCNNode> childNodes();

    @Generated
    @Selector("childNodesPassingTest:")
    public native NSArray<? extends SCNNode> childNodesPassingTest(
            @ObjCBlock(name = "call_childNodesPassingTest") Block_childNodesPassingTest predicate);

    @Generated
    @Selector("clone")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object clone();

    @Generated
    @Selector("constraints")
    public native NSArray<? extends SCNConstraint> constraints();

    @Generated
    @Selector("convertPosition:fromNode:")
    @ByValue
    public native SCNVector3 convertPositionFromNode(@ByValue SCNVector3 position, SCNNode node);

    @Generated
    @Selector("convertPosition:toNode:")
    @ByValue
    public native SCNVector3 convertPositionToNode(@ByValue SCNVector3 position, SCNNode node);

    @Generated
    @Selector("convertTransform:fromNode:")
    @ByValue
    public native SCNMatrix4 convertTransformFromNode(@ByValue SCNMatrix4 transform, SCNNode node);

    @Generated
    @Selector("convertTransform:toNode:")
    @ByValue
    public native SCNMatrix4 convertTransformToNode(@ByValue SCNMatrix4 transform, SCNNode node);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("enumerateChildNodesUsingBlock:")
    public native void enumerateChildNodesUsingBlock(
            @ObjCBlock(name = "call_enumerateChildNodesUsingBlock") Block_enumerateChildNodesUsingBlock block);

    @Generated
    @Selector("eulerAngles")
    @ByValue
    public native SCNVector3 eulerAngles();

    @Generated
    @Selector("filters")
    public native NSArray<? extends CIFilter> filters();

    @MappedReturn(ObjCObjectMapper.class)
    @Generated
    @Selector("flattenedClone")
    public native Object flattenedClone();

    @Generated
    @Selector("geometry")
    public native SCNGeometry geometry();

    @Generated
    @Selector("getBoundingBoxMin:max:")
    public native boolean getBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    @Generated
    @Selector("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphereCenterRadius(SCNVector3 center, NFloatPtr radius);

    @Generated
    @Selector("hasActions")
    public native boolean hasActions();

    @Generated
    @Selector("hitTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestWithSegmentFromPointToPointOptions(
            @ByValue SCNVector3 pointA, @ByValue SCNVector3 pointB, NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SCNNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("insertChildNode:atIndex:")
    public native void insertChildNodeAtIndex(SCNNode child, @NUInt long index);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

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
    @Selector("light")
    public native SCNLight light();

    @Generated
    @Selector("morpher")
    public native SCNMorpher morpher();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("opacity")
    @NFloat
    public native double opacity();

    @Generated
    @Selector("orientation")
    @ByValue
    public native SCNVector4 orientation();

    @Generated
    @Selector("parentNode")
    public native SCNNode parentNode();

    @Generated
    @Selector("particleSystems")
    public native NSArray<? extends SCNParticleSystem> particleSystems();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("physicsBody")
    public native SCNPhysicsBody physicsBody();

    @Generated
    @Selector("physicsField")
    public native SCNPhysicsField physicsField();

    @Generated
    @Selector("pivot")
    @ByValue
    public native SCNMatrix4 pivot();

    @Generated
    @Selector("position")
    @ByValue
    public native SCNVector3 position();

    @Generated
    @Selector("presentationNode")
    public native SCNNode presentationNode();

    @Generated
    @Selector("removeActionForKey:")
    public native void removeActionForKey(String key);

    @Generated
    @Selector("removeAllActions")
    public native void removeAllActions();

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAllParticleSystems")
    public native void removeAllParticleSystems();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("removeFromParentNode")
    public native void removeFromParentNode();

    @Generated
    @Selector("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);

    @Generated
    @Selector("rendererDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNNodeRendererDelegate rendererDelegate();

    @Generated
    @Selector("renderingOrder")
    @NInt
    public native long renderingOrder();

    @Generated
    @Selector("replaceChildNode:with:")
    public native void replaceChildNodeWith(SCNNode oldChild, SCNNode newChild);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    @Generated
    @Selector("rotation")
    @ByValue
    public native SCNVector4 rotation();

    @Generated
    @Selector("runAction:")
    public native void runAction(SCNAction action);

    @Generated
    @Selector("runAction:completionHandler:")
    public native void runActionCompletionHandler(SCNAction action,
            @ObjCBlock(name = "call_runActionCompletionHandler") SCNActionable.Block_runActionCompletionHandler block);

    @Generated
    @Selector("runAction:forKey:")
    public native void runActionForKey(SCNAction action, String key);

    @Generated
    @Selector("runAction:forKey:completionHandler:")
    public native void runActionForKeyCompletionHandler(SCNAction action, String key,
            @ObjCBlock(name = "call_runActionForKeyCompletionHandler") SCNActionable.Block_runActionForKeyCompletionHandler block);

    @Generated
    @Selector("scale")
    @ByValue
    public native SCNVector3 scale();

    @Generated
    @Selector("setBoundingBoxMin:max:")
    public native void setBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    @Generated
    @Selector("setCamera:")
    public native void setCamera(SCNCamera value);

    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    @Generated
    @Selector("setConstraints:")
    public native void setConstraints(NSArray<? extends SCNConstraint> value);

    @Generated
    @Selector("setEulerAngles:")
    public native void setEulerAngles(@ByValue SCNVector3 value);

    @Generated
    @Selector("setFilters:")
    public native void setFilters(NSArray<? extends CIFilter> value);

    @Generated
    @Selector("setGeometry:")
    public native void setGeometry(SCNGeometry value);

    @Generated
    @Selector("setLight:")
    public native void setLight(SCNLight value);

    @Generated
    @Selector("setMorpher:")
    public native void setMorpher(SCNMorpher value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setOpacity:")
    public native void setOpacity(@NFloat double value);

    @Generated
    @Selector("setOrientation:")
    public native void setOrientation(@ByValue SCNVector4 value);

    @Generated
    @Selector("setPhysicsBody:")
    public native void setPhysicsBody(SCNPhysicsBody value);

    @Generated
    @Selector("setPhysicsField:")
    public native void setPhysicsField(SCNPhysicsField value);

    @Generated
    @Selector("setPivot:")
    public native void setPivot(@ByValue SCNMatrix4 value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue SCNVector3 value);

    @Generated
    @Selector("setRendererDelegate:")
    public native void setRendererDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value);

    @Generated
    public void setRendererDelegate(@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value) {
        Object __old = rendererDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setRendererDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setRenderingOrder:")
    public native void setRenderingOrder(@NInt long value);

    @Generated
    @Selector("setRotation:")
    public native void setRotation(@ByValue SCNVector4 value);

    @Generated
    @Selector("setScale:")
    public native void setScale(@ByValue SCNVector3 value);

    @Generated
    @Selector("setSkinner:")
    public native void setSkinner(SCNSkinner value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue SCNMatrix4 value);

    @Generated
    @Selector("skinner")
    public native SCNSkinner skinner();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("transform")
    @ByValue
    public native SCNMatrix4 transform();

    @Generated
    @Selector("worldTransform")
    @ByValue
    public native SCNMatrix4 worldTransform();

    @Generated
    @Selector("actionKeys")
    public native NSArray<String> actionKeys();

    @Generated
    @Selector("addAudioPlayer:")
    public native void addAudioPlayer(SCNAudioPlayer player);

    @Generated
    @Selector("audioPlayers")
    public native NSArray<? extends SCNAudioPlayer> audioPlayers();

    @Generated
    @Selector("removeAllAudioPlayers")
    public native void removeAllAudioPlayers();

    @Generated
    @Selector("removeAudioPlayer:")
    public native void removeAudioPlayer(SCNAudioPlayer player);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_childNodesPassingTest {
        @Generated
        boolean call_childNodesPassingTest(SCNNode arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateChildNodesUsingBlock {
        @Generated
        void call_enumerateChildNodesUsingBlock(SCNNode arg0, BoolPtr arg1);
    }
}
