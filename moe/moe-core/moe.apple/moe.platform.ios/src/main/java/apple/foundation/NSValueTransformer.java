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

package apple.foundation;

import apple.NSObject;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSValueTransformer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSValueTransformer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSValueTransformer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSValueTransformer allocWithZone(VoidPtr zone);

    /**
     * flag indicating whether transformation is read-only or not
     */
    @Generated
    @Selector("allowsReverseTransformation")
    public static native boolean allowsReverseTransformation();

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
    public static native NSValueTransformer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * name-based registry for shared objects (especially used when loading nib files with transformers specified by
     * name in Interface Builder) - also useful for localization (developers can register different kind of transformers
     * or differently configured transformers at application startup and refer to them by name from within nib files or
     * other code)
     * if valueTransformerForName: does not find a registered transformer instance, it will fall back to looking up a
     * class with the specified name - if one is found, it will instantiate a transformer with the default -init method
     * and automatically register it
     */
    @Generated
    @Selector("setValueTransformer:forName:")
    public static native void setValueTransformerForName(NSValueTransformer transformer, String name);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * class of the "output" objects, as returned by transformedValue:
     */
    @Generated
    @Selector("transformedValueClass")
    public static native Class transformedValueClass();

    @Generated
    @Selector("valueTransformerForName:")
    public static native NSValueTransformer valueTransformerForName(String name);

    @Generated
    @Selector("valueTransformerNames")
    public static native NSArray<String> valueTransformerNames();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native NSValueTransformer init();

    /**
     * by default raises an exception if +allowsReverseTransformation returns NO and otherwise invokes transformedValue:
     */
    @Generated
    @Selector("reverseTransformedValue:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object reverseTransformedValue(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * by default returns value
     */
    @Generated
    @Selector("transformedValue:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object transformedValue(@Mapped(ObjCObjectMapper.class) Object value);
}
