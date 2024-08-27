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
import apple.foundation.protocol.NSKeyedUnarchiverDelegate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
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
public class NSKeyedUnarchiver extends NSCoder {
    static {
        NatJ.register();
    }

    @Generated
    protected NSKeyedUnarchiver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSKeyedUnarchiver alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSKeyedUnarchiver allocWithZone(VoidPtr zone);

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

    /**
     * During decoding, the coder first checks with the coder's
     * own table, then if there was no mapping there, the class's.
     */
    @Nullable
    @Generated
    @Selector("classForClassName:")
    public static native Class classForClassName_static(@NotNull String codedName);

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
    public static native NSKeyedUnarchiver new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setClass:forClassName:")
    public static native void setClassForClassName_static(@Nullable Class cls, @NotNull String codedName);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithData:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithData(@NotNull NSData data);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveObjectWithFile:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveObjectWithFile(@NotNull String path);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("unarchiveTopLevelObjectWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchiveTopLevelObjectWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("classForClassName:")
    public native Class classForClassName(@NotNull String codedName);

    @Generated
    @Selector("containsValueForKey:")
    public native boolean containsValueForKey(@NotNull String key);

    @Generated
    @Selector("decodeBoolForKey:")
    public native boolean decodeBoolForKey(@NotNull String key);

    /**
     * returned bytes immutable, and they go away with the unarchiver, not the containing autorelease pool
     */
    @Nullable
    @Generated
    @Selector("decodeBytesForKey:returnedLength:")
    public native ConstBytePtr decodeBytesForKeyReturnedLength(@NotNull String key, @Nullable NUIntPtr lengthp);

    @Generated
    @Selector("decodeDoubleForKey:")
    public native double decodeDoubleForKey(@NotNull String key);

    @Generated
    @Selector("decodeFloatForKey:")
    public native float decodeFloatForKey(@NotNull String key);

    @Generated
    @Selector("decodeInt32ForKey:")
    public native int decodeInt32ForKey(@NotNull String key);

    @Generated
    @Selector("decodeInt64ForKey:")
    public native long decodeInt64ForKey(@NotNull String key);

    /**
     * may raise a range exception
     */
    @Generated
    @Selector("decodeIntForKey:")
    public native int decodeIntForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("decodeObjectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object decodeObjectForKey(@NotNull String key);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("decodingFailurePolicy")
    @NInt
    public native long decodingFailurePolicy();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSKeyedUnarchiverDelegate delegate();

    @Generated
    @Selector("finishDecoding")
    public native void finishDecoding();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use -initForReadingFromData:error: instead
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native NSKeyedUnarchiver init();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use -initForReadingFromData:error: instead
     */
    @Deprecated
    @Generated
    @Selector("initForReadingWithData:")
    public native NSKeyedUnarchiver initForReadingWithData(@NotNull NSData data);

    /**
     * Enables secure coding support on this keyed unarchiver. When enabled, unarchiving a disallowed class throws an
     * exception. Once enabled, attempting to set requiresSecureCoding to NO will throw an exception. This is to prevent
     * classes from selectively turning secure coding off. This is designed to be set once at the top level and remain
     * on. Note that the getter is on the superclass, NSCoder. See NSCoder for more information about secure coding.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    @Generated
    @Selector("setClass:forClassName:")
    public native void setClassForClassName(@Nullable Class cls, @NotNull String codedName);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDecodingFailurePolicy:")
    public native void setDecodingFailurePolicy(@NInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSKeyedUnarchiverDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSKeyedUnarchiverDelegate value) {
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
     * Enables secure coding support on this keyed unarchiver. When enabled, unarchiving a disallowed class throws an
     * exception. Once enabled, attempting to set requiresSecureCoding to NO will throw an exception. This is to prevent
     * classes from selectively turning secure coding off. This is designed to be set once at the top level and remain
     * on. Note that the getter is on the superclass, NSCoder. See NSCoder for more information about secure coding.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean value);

    /**
     * Initializes the receiver for decoding an archive previously encoded by \c NSKeyedUnarchiver.
     * 
     * Enables \c requiresSecureCoding by default. If \c NSSecureCoding cannot be used, \c requiresSecureCoding may be
     * turned off manually; for improved security, \c requiresSecureCoding should be left enabled whenever possible.
     * 
     * Sets the unarchiver's \c decodingFailurePolicy to \c NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid, and sets the \c error out parameter.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initForReadingFromData:error:")
    public native NSKeyedUnarchiver initForReadingFromDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the root object of the given class from the given archive, previously encoded by \c NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClass:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassFromDataError(@NotNull Class cls, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the root object of one of the given classes from the given archive, previously encoded by \c
     * NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedObjectOfClasses:fromData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object unarchivedObjectOfClassesFromDataError(@NotNull NSSet<? extends Class> classes,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the \c NSArray root object from \c data which should be an \c NSArray<cls> containing the given
     * non-collection class (no nested arrays or arrays of dictionaries, etc) from the given archive, previously encoded
     * by \c NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedArrayOfObjectsOfClass:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassFromDataError(@NotNull Class cls,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the \c NSArray root object from \c data which should be an \c NSArray, containing the given
     * non-collection classes in \c classes (no nested arrays or arrays of dictionaries, etc) from the given archive,
     * previously encoded by \c NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedArrayOfObjectsOfClasses:fromData:error:")
    public static native NSArray<?> unarchivedArrayOfObjectsOfClassesFromDataError(
            @NotNull NSSet<? extends Class> classes, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the \c NSDictionary root object from \c data which should be an \c NSDictionary<keyCls,objectCls> with
     * keys of type given in \c keyCls and objects of the given non-collection class \c objectCls (no nested
     * dictionaries or other dictionaries contained in the dictionary, etc) from the given archive, previously encoded
     * by \c NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClass:objectsOfClass:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassObjectsOfClassFromDataError(
            @NotNull Class keyCls, @NotNull Class valueCls, @NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Decodes the \c NSDictionary root object from \c data which should be an \c NSDictionary, with keys of the types
     * given in \c keyClasses and objects of the given non-collection classes in \c objectClasses (no nested
     * dictionaries or other dictionaries contained in the dictionary, etc) from the given archive, previously encoded
     * by \c NSKeyedArchiver.
     * 
     * Enables \c requiresSecureCoding and sets the \c decodingFailurePolicy to \c
     * NSDecodingFailurePolicySetErrorAndReturn.
     * 
     * Returns \c nil if the given data is not valid or cannot be decoded, and sets the \c error out parameter.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("unarchivedDictionaryWithKeysOfClasses:objectsOfClasses:fromData:error:")
    public static native NSDictionary<?, ?> unarchivedDictionaryWithKeysOfClassesObjectsOfClassesFromDataError(
            @NotNull NSSet<? extends Class> keyClasses, @NotNull NSSet<? extends Class> valueClasses,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
