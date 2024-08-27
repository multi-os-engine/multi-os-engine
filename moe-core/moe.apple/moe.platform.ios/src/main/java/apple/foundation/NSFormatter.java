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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFormatter extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFormatter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFormatter allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFormatter new_objc();

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

    @Nullable
    @Generated
    @Selector("attributedStringForObjectValue:withDefaultAttributes:")
    public native NSAttributedString attributedStringForObjectValueWithDefaultAttributes(
            @NotNull @Mapped(ObjCObjectMapper.class) Object obj, @Nullable NSDictionary<String, ?> attrs);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("editingStringForObjectValue:")
    public native String editingStringForObjectValue(@NotNull @Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("getObjectValue:forString:errorDescription:")
    public native boolean getObjectValueForStringErrorDescription(
            @Nullable @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, @NotNull String string,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    @Generated
    @Selector("init")
    public native NSFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFormatter initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("isPartialStringValid:newEditingString:errorDescription:")
    public native boolean isPartialStringValidNewEditingStringErrorDescription(@NotNull String partialString,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> newString,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    /**
     * Compatibility method. If a subclass overrides this and does not override the new method below, this will be
     * called as before (the new method just calls this one by default). The selection range will always be set to the
     * end of the text with this method if replacement occurs.
     */
    @Generated
    @Selector("isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:")
    public native boolean isPartialStringValidProposedSelectedRangeOriginalStringOriginalSelectedRangeErrorDescription(
            @NotNull @ReferenceInfo(type = NSString.class) Ptr<NSString> partialStringPtr,
            @Nullable NSRange proposedSelRangePtr, @NotNull String origString, @ByValue NSRange origSelRange,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    @Nullable
    @Generated
    @Selector("stringForObjectValue:")
    public native String stringForObjectValue(@Nullable @Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
