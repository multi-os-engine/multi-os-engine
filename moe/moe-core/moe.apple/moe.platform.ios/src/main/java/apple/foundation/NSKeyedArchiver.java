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
import apple.foundation.protocol.NSKeyedArchiverDelegate;
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
import org.moe.natj.general.ptr.Ptr;
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
public class NSKeyedArchiver extends NSCoder {
    static {
        NatJ.register();
    }

    @Generated
    protected NSKeyedArchiver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSKeyedArchiver alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSKeyedArchiver allocWithZone(VoidPtr zone);

    @Generated
    @Selector("archiveRootObject:toFile:")
    public static native boolean archiveRootObjectToFile(@Mapped(ObjCObjectMapper.class) Object rootObject,
            String path);

    @Generated
    @Selector("archivedDataWithRootObject:")
    public static native NSData archivedDataWithRootObject(@Mapped(ObjCObjectMapper.class) Object rootObject);

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

    /**
     * During encoding, the coder first checks with the coder's
     * own table, then if there was no mapping there, the class's.
     */
    @Generated
    @Selector("classNameForClass:")
    public static native String classNameForClass_static(Class cls);

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
    public static native NSKeyedArchiver new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setClassName:forClass:")
    public static native void setClassNameForClass_static(String codedName, Class cls);

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
    @Selector("classNameForClass:")
    public native String classNameForClass(Class cls);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSKeyedArchiverDelegate delegate();

    @Generated
    @Selector("encodeBool:forKey:")
    public native void encodeBoolForKey(boolean value, String key);

    @Generated
    @Selector("encodeBytes:length:forKey:")
    public native void encodeBytesLengthForKey(ConstBytePtr bytes, @NUInt long length, String key);

    @Generated
    @Selector("encodeConditionalObject:forKey:")
    public native void encodeConditionalObjectForKey(@Mapped(ObjCObjectMapper.class) Object object, String key);

    @Generated
    @Selector("encodeDouble:forKey:")
    public native void encodeDoubleForKey(double value, String key);

    @Generated
    @Selector("encodeFloat:forKey:")
    public native void encodeFloatForKey(float value, String key);

    @Generated
    @Selector("encodeInt32:forKey:")
    public native void encodeInt32ForKey(int value, String key);

    @Generated
    @Selector("encodeInt64:forKey:")
    public native void encodeInt64ForKey(long value, String key);

    /**
     * native int
     */
    @Generated
    @Selector("encodeInt:forKey:")
    public native void encodeIntForKey(int value, String key);

    @Generated
    @Selector("encodeObject:forKey:")
    public native void encodeObjectForKey(@Mapped(ObjCObjectMapper.class) Object object, String key);

    /**
     * If encoding has not yet finished, then invoking this property will call finishEncoding and return the data. If you initialized the keyed archiver with a specific mutable data instance, then it will be returned from this property after finishEncoding is called.
     */
    @Generated
    @Selector("encodedData")
    public native NSData encodedData();

    @Generated
    @Selector("finishEncoding")
    public native void finishEncoding();

    /**
     * Initialize the archiver with empty data, ready for writing.
     */
    @Generated
    @Selector("init")
    public native NSKeyedArchiver init();

    @Generated
    @Selector("initForWritingWithMutableData:")
    public native NSKeyedArchiver initForWritingWithMutableData(NSMutableData data);

    @Generated
    @Selector("outputFormat")
    @NUInt
    public native long outputFormat();

    /**
     * Enables secure coding support on this keyed archiver. You do not need to enable secure coding on the archiver to enable secure coding on the unarchiver. Enabling secure coding on the archiver is a way for you to be sure that all classes that are encoded conform with NSSecureCoding (it will throw an exception if a class which does not NSSecureCoding is archived). Note that the getter is on the superclass, NSCoder. See NSCoder for more information about secure coding.
     */
    @Generated
    @Selector("requiresSecureCoding")
    public native boolean requiresSecureCoding();

    @Generated
    @Selector("setClassName:forClass:")
    public native void setClassNameForClass(String codedName, Class cls);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSKeyedArchiverDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSKeyedArchiverDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setOutputFormat:")
    public native void setOutputFormat(@NUInt long value);

    /**
     * Enables secure coding support on this keyed archiver. You do not need to enable secure coding on the archiver to enable secure coding on the unarchiver. Enabling secure coding on the archiver is a way for you to be sure that all classes that are encoded conform with NSSecureCoding (it will throw an exception if a class which does not NSSecureCoding is archived). Note that the getter is on the superclass, NSCoder. See NSCoder for more information about secure coding.
     */
    @Generated
    @Selector("setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean value);

    /**
     * Returns an \c NSData object containing the encoded form of the object graph whose root object is given, optionally disabling secure coding.
     * <p>
     * If \c NSSecureCoding cannot be used, \c requiresSecureCoding may be turned off here; for improved security, however, \c requiresSecureCoding should be left enabled whenever possible. \c requiresSecureCoding ensures that all encoded objects conform to \c NSSecureCoding, preventing the possibility of encoding objects which cannot be decoded later.
     * <p>
     * If the object graph cannot be encoded, returns \c nil and sets the \c error out parameter.
     */
    @Generated
    @Selector("archivedDataWithRootObject:requiringSecureCoding:error:")
    public static native NSData archivedDataWithRootObjectRequiringSecureCodingError(
            @Mapped(ObjCObjectMapper.class) Object object, boolean requiresSecureCoding,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Initializes the receiver for encoding an archive, optionally disabling secure coding.
     * <p>
     * If \c NSSecureCoding cannot be used, \c requiresSecureCoding may be turned off here; for improved security, however, \c requiresSecureCoding should be left enabled whenever possible. \c requiresSecureCoding ensures that all encoded objects conform to \c NSSecureCoding, preventing the possibility of encoding objects which cannot be decoded later.
     * <p>
     * To produce archives whose structure matches those previously encoded using \c +archivedDataWithRootObject, encode the top-level object in your archive for the \c NSKeyedArchiveRootObjectKey.
     */
    @Generated
    @Selector("initRequiringSecureCoding:")
    public native NSKeyedArchiver initRequiringSecureCoding(boolean requiresSecureCoding);
}
