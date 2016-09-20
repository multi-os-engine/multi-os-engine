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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAudioSource extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAudioSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAudioSource alloc();

    /**
     * audioSourceNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/clm/SCNAudioSource/audioSourceNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioSourceNamed:")
    public static native SCNAudioSource audioSourceNamed(String fileName);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SCNAudioSource init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAudioSource initWithCoder(NSCoder aDecoder);

    /**
     * initWithFileNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instm/SCNAudioSource/initWithFileNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFileNamed:")
    public native SCNAudioSource initWithFileNamed(String name);

    /**
     * initWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instm/SCNAudioSource/initWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:")
    public native SCNAudioSource initWithURL(NSURL url);

    /**
     * positional</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/positional">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPositional")
    public native boolean isPositional();

    /**
     * positional</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/positional">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPositional:")
    public native void setPositional(boolean value);

    /**
     * load</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instm/SCNAudioSource/load">iOS Dev Center</a>
     */
    @Generated
    @Selector("load")
    public native void load_objc();

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * rate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/rate">iOS Dev Center</a>
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * reverbBlend</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/reverbBlend">iOS Dev Center</a>
     */
    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * rate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/rate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * reverbBlend</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/reverbBlend">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReverbBlend:")
    public native void setReverbBlend(float value);

    /**
     * shouldStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/shouldStream">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldStream:")
    public native void setShouldStream(boolean value);

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/volume">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * shouldStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/shouldStream">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldStream")
    public native boolean shouldStream();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAudioSource_Class/index.html#//apple_ref/occ/instp/SCNAudioSource/volume">iOS Dev Center</a>
     */
    @Generated
    @Selector("volume")
    public native float volume();
}
