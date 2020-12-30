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

package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVPlayerItemMetadataCollectorPushDelegate;
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

/**
 * AVPlayerItemMetadataCollector
 * 
 * A subclass of AVPlayerItemMediaDataCollector that provides AVMetadataGroups for an AVPlayerItem.
 * 
 * 	This class can be used to inform clients of the current set of AVMetadataGroups on an AVPlayerItem, and when new AVMetadataGroups become available - e.g. in a Live HLS stream.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemMetadataCollector extends AVPlayerItemMediaDataCollector {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemMetadataCollector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemMetadataCollector alloc();

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
     * [@property]		delegate
     * 
     * The receiver's delegate.
     * 
     * 	The delegate is held using a zeroing-weak reference, so this property will have a value of nil after a delegate that was previously set has been deallocated.  This property is not key-value observable.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerItemMetadataCollectorPushDelegate delegate();

    /**
     * [@property]		delegateQueue
     * 
     * The dispatch queue on which messages are sent to the delegate.
     * 
     * 	This property is not key-value observable.
     */
    @Generated
    @Selector("delegateQueue")
    public native NSObject delegateQueue();

    @Generated
    @Selector("init")
    public native AVPlayerItemMetadataCollector init();

    /**
     * initWithIdentifiers:classifyingLabels:
     * 
     * Returns an instance of AVPlayerItemMetadataCollector that can provide all available AVMetadataGroups matching a set of criteria.
     * 
     * 	Some metadata available in some formats - such as timed metadata embedded in HLS segments - is not available for collector output.
     * 	The default init method can be used as an alternative to setting both identifiers and classifyingLabels to nil.
     * 
     * @param			identifiers
     * 				A array of metadata identifiers indicating the metadata items that the output should provide. See AVMetadataIdentifiers.h for publicly defined metadata identifiers. Pass nil to include metadata with any identifier.
     * @param			classifyingLabels
     * 				If the metadata format supports labeling each metadata group with a string, supplying an array of group labels indicates that the output should provide metadata groups that match one of the supplied labels. Pass nil to include metadata with any (or no) classifying label.
     * @return			An instance of AVPlayerItemMetadataCollector.
     */
    @Generated
    @Selector("initWithIdentifiers:classifyingLabels:")
    public native AVPlayerItemMetadataCollector initWithIdentifiersClassifyingLabels(NSArray<String> identifiers,
            NSArray<String> classifyingLabels);

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate and a dispatch queue on which the delegate will be called.
     * 
     * @param			delegate
     * 				An object conforming to AVPlayerItemMetadataCollectorPushDelegate protocol.
     * @param			delegateQueue
     * 				A dispatch queue on which all delegate methods will be called.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Mapped(ObjCObjectMapper.class) AVPlayerItemMetadataCollectorPushDelegate delegate, NSObject delegateQueue);
}
