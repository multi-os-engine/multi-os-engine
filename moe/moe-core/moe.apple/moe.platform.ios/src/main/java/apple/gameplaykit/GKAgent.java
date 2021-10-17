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
import apple.gameplaykit.protocol.GKAgentDelegate;
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
 * An agent is a point mass whose local coordinate system is aligned to its velocity.  Agents have a variety of
 * steering functions that can be used to simulate vehicles or entities with agency.
 * The units of mass, velocity and radius are dimensionless but related. The visual representation of these values
 * are specific to each game's own situation.
 * <p>
 * Values close to 1.0 should be canonical and are expected to yield pleasing results. When applied to visuals
 * these values should be scaled and biased into their target coordinate system and a simple filter on top ensures
 * any noise generated from the steering logic doesn't affect the visual represtentation.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKAgent extends GKComponent implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKAgent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKAgent alloc();

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
     * The behavior to apply when updateWithDeltaTime is called.
     * All forces from the goals in the behavior are summed and then applied.
     */
    @Generated
    @Selector("behavior")
    public native GKBehavior behavior();

    /**
     * Object which has agentDidUpdate called on it during this agent's behavior updatekbeha
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKAgentDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native GKAgent init();

    @Generated
    @Selector("initWithCoder:")
    public native GKAgent initWithCoder(NSCoder coder);

    /**
     * Agent's mass. Used for agent impulse application purposes.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("mass")
    public native float mass();

    /**
     * Maximum amount of acceleration that can be applied to this agent.  All applied impulses are clipped to this amount.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("maxAcceleration")
    public native float maxAcceleration();

    /**
     * Maximum speed of this agent. Impulses cannot cause the agents speed to ever be greater than this value.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("maxSpeed")
    public native float maxSpeed();

    /**
     * Radius of the agent's bounding circle.  Used by the agent avoid steering functions.
     * <p>
     * Defaults to 0.5 for a canonical diameter of 1.0
     */
    @Generated
    @Selector("radius")
    public native float radius();

    /**
     * The behavior to apply when updateWithDeltaTime is called.
     * All forces from the goals in the behavior are summed and then applied.
     */
    @Generated
    @Selector("setBehavior:")
    public native void setBehavior(GKBehavior value);

    /**
     * Object which has agentDidUpdate called on it during this agent's behavior updatekbeha
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GKAgentDelegate value);

    /**
     * Object which has agentDidUpdate called on it during this agent's behavior updatekbeha
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) GKAgentDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Agent's mass. Used for agent impulse application purposes.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("setMass:")
    public native void setMass(float value);

    /**
     * Maximum amount of acceleration that can be applied to this agent.  All applied impulses are clipped to this amount.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("setMaxAcceleration:")
    public native void setMaxAcceleration(float value);

    /**
     * Maximum speed of this agent. Impulses cannot cause the agents speed to ever be greater than this value.
     * <p>
     * Defaults to 1.0
     */
    @Generated
    @Selector("setMaxSpeed:")
    public native void setMaxSpeed(float value);

    /**
     * Radius of the agent's bounding circle.  Used by the agent avoid steering functions.
     * <p>
     * Defaults to 0.5 for a canonical diameter of 1.0
     */
    @Generated
    @Selector("setRadius:")
    public native void setRadius(float value);

    /**
     * Current speed of the agent along its foward direction.
     * <p>
     * Defaults to 0.0
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(float value);

    /**
     * Current speed of the agent along its foward direction.
     * <p>
     * Defaults to 0.0
     */
    @Generated
    @Selector("speed")
    public native float speed();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
