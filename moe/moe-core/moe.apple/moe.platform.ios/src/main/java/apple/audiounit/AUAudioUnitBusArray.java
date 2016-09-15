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

package apple.audiounit;

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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
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

@Generated
@Library("AudioUnit")
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

    /**
     * addObserverToAllBusses:forKeyPath:options:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/addObserverToAllBusses:forKeyPath:options:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addObserverToAllBusses:forKeyPath:options:context:")
    public native void addObserverToAllBussesForKeyPathOptionsContext(NSObject observer, String keyPath,
            @NUInt long options, VoidPtr context);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AUAudioUnitBusArray alloc();

    /**
     * busType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBusArray/busType">iOS Dev Center</a>
     */
    @Generated
    @Selector("busType")
    @NInt
    public native long busType();

    /**
     * count</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBusArray/count">iOS Dev Center</a>
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(VoidPtr state, Ptr<ObjCObject> buffer, @NUInt long len);

    @Generated
    @Selector("init")
    public native AUAudioUnitBusArray init();

    /**
     * initWithAudioUnit:busType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/initWithAudioUnit:busType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAudioUnit:busType:")
    public native AUAudioUnitBusArray initWithAudioUnitBusType(AUAudioUnit owner, @NInt long busType);

    /**
     * initWithAudioUnit:busType:busses:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/initWithAudioUnit:busType:busses:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAudioUnit:busType:busses:")
    public native AUAudioUnitBusArray initWithAudioUnitBusTypeBusses(AUAudioUnit owner, @NInt long busType,
            NSArray<? extends AUAudioUnitBus> busArray);

    /**
     * countChangeable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBusArray/countChangeable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isCountChangeable")
    public native boolean isCountChangeable();

    /**
     * objectAtIndexedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/objectAtIndexedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native AUAudioUnitBus objectAtIndexedSubscript(@NUInt long index);

    /**
     * ownerAudioUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instp/AUAudioUnitBusArray/ownerAudioUnit">iOS Dev Center</a>
     */
    @Generated
    @Selector("ownerAudioUnit")
    public native AUAudioUnit ownerAudioUnit();

    /**
     * removeObserverFromAllBusses:forKeyPath:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/removeObserverFromAllBusses:forKeyPath:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeObserverFromAllBusses:forKeyPath:context:")
    public native void removeObserverFromAllBussesForKeyPathContext(NSObject observer, String keyPath, VoidPtr context);

    /**
     * replaceBusses:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/replaceBusses:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceBusses:")
    public native void replaceBusses(NSArray<? extends AUAudioUnitBus> busArray);

    /**
     * setBusCount:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AudioUnit/Reference/AUAudioUnitBusArray_ClassReference/index.html#//apple_ref/occ/instm/AUAudioUnitBusArray/setBusCount:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBusCount:error:")
    public native boolean setBusCountError(@NUInt long count, Ptr<NSError> outError);

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
}
