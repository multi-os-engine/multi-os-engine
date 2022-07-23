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

package apple.audiotoolbox;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AUAudioUnitBusArray
 * <p>
 * Container for an audio unit's input or output busses.
 * <p>
 * Hosts can observe a bus property across all busses by using KVO on this object, without
 * having to observe it on each individual bus. (One could add listeners to individual busses,
 * but that means one has to observe bus count changes and add/remove listeners in response.
 * Also, NSArray's addObserver:toObjectsAtIndexes:forKeyPath:options:context: is problematic;
 * it does not let the individual objects override the observation request, and so a bus which
 * is proxying a bus in an extension process does not get the message.)
 * <p>
 * Some audio units (e.g. mixers) support variable numbers of busses, via subclassing. When the
 * bus count changes, a KVO notification is sent on "inputBusses" or "outputBusses," as
 * appropriate.
 * <p>
 * Subclassers should see also the AUAudioUnitBusImplementation category.
 * <p>
 * The bus array is bridged to the v2 property kAudioUnitProperty_ElementCount.
 */
@Generated
@Library("AudioToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AUAudioUnitBusArray extends NSObject implements NSFastEnumeration {
    static {
        NatJ.register();
    }

    @Generated
    protected AUAudioUnitBusArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnitBusArray alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AUAudioUnitBusArray allocWithZone(VoidPtr zone);

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
    public static native AUAudioUnitBusArray new_objc();

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
     * addObserverToAllBusses:forKeyPath:options:context:
     * <p>
     * Add a KVO observer for a property on all busses in the array.
     */
    @Generated
    @Selector("addObserverToAllBusses:forKeyPath:options:context:")
    public native void addObserverToAllBussesForKeyPathOptionsContext(NSObject observer, String keyPath,
            @NUInt long options, VoidPtr context);

    /**
     * Which bus array this is (input or output).
     */
    @Generated
    @Selector("busType")
    @NInt
    public native long busType();

    /**
     * [@property] count
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("init")
    public native AUAudioUnitBusArray init();

    /**
     * initWithAudioUnit:busType:
     * <p>
     * Initializes an empty bus array.
     */
    @Generated
    @Selector("initWithAudioUnit:busType:")
    public native AUAudioUnitBusArray initWithAudioUnitBusType(AUAudioUnit owner, @NInt long busType);

    /**
     * initWithAudioUnit:busType:busses:
     * <p>
     * Initializes by making a copy of the supplied bus array.
     */
    @Generated
    @Selector("initWithAudioUnit:busType:busses:")
    public native AUAudioUnitBusArray initWithAudioUnitBusTypeBusses(AUAudioUnit owner, @NInt long busType,
            NSArray<? extends AUAudioUnitBus> busArray);

    /**
     * [@property] countChangeable
     * <p>
     * Whether the array can have a variable number of busses.
     * <p>
     * The base implementation returns false.
     */
    @Generated
    @Selector("isCountChangeable")
    public native boolean isCountChangeable();

    /**
     * objectAtIndexedSubscript:
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native AUAudioUnitBus objectAtIndexedSubscript(@NUInt long index);

    /**
     * The audio unit that owns the bus.
     */
    @Generated
    @Selector("ownerAudioUnit")
    public native AUAudioUnit ownerAudioUnit();

    /**
     * removeObserverFromAllBusses:forKeyPath:context:
     * <p>
     * Remove a KVO observer for a property on all busses in the array.
     */
    @Generated
    @Selector("removeObserverFromAllBusses:forKeyPath:context:")
    public native void removeObserverFromAllBussesForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    /**
     * Sets the bus array to be a copy of the supplied array. The base class issues KVO notifications.
     */
    @Generated
    @Selector("replaceBusses:")
    public native void replaceBusses(NSArray<? extends AUAudioUnitBus> busArray);

    /**
     * [@property] setBusCount:error:
     * <p>
     * Change the number of busses in the array.
     */
    @Generated
    @Selector("setBusCount:error:")
    public native boolean setBusCountError(@NUInt long count,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}
