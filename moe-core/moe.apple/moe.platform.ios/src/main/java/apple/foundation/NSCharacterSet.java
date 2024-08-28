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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCharacterSet extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCharacterSet(Pointer peer) {
        super(peer);
    }

    /**
     * Returns a character set containing the characters allowed in a URL's fragment component.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLFragmentAllowedCharacterSet")
    public static native NSCharacterSet URLFragmentAllowedCharacterSet();

    /**
     * Returns a character set containing the characters allowed in a URL's host subcomponent.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLHostAllowedCharacterSet")
    public static native NSCharacterSet URLHostAllowedCharacterSet();

    /**
     * Returns a character set containing the characters allowed in a URL's password subcomponent.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLPasswordAllowedCharacterSet")
    public static native NSCharacterSet URLPasswordAllowedCharacterSet();

    /**
     * Returns a character set containing the characters allowed in a URL's path component. ';' is a legal path
     * character, but it is recommended that it be percent-encoded for best compatibility with NSURL
     * (-stringByAddingPercentEncodingWithAllowedCharacters: will percent-encode any ';' characters if you pass the
     * URLPathAllowedCharacterSet).
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLPathAllowedCharacterSet")
    public static native NSCharacterSet URLPathAllowedCharacterSet();

    /**
     * Returns a character set containing the characters allowed in a URL's query component.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLQueryAllowedCharacterSet")
    public static native NSCharacterSet URLQueryAllowedCharacterSet();

    /**
     * Returns a character set containing the characters allowed in a URL's user subcomponent.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("URLUserAllowedCharacterSet")
    public static native NSCharacterSet URLUserAllowedCharacterSet();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCharacterSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCharacterSet allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("alphanumericCharacterSet")
    public static native NSCharacterSet alphanumericCharacterSet();

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
    @Selector("capitalizedLetterCharacterSet")
    public static native NSCharacterSet capitalizedLetterCharacterSet();

    @NotNull
    @Generated
    @Selector("characterSetWithBitmapRepresentation:")
    public static native NSCharacterSet characterSetWithBitmapRepresentation(@NotNull NSData data);

    @NotNull
    @Generated
    @Selector("characterSetWithCharactersInString:")
    public static native NSCharacterSet characterSetWithCharactersInString(@NotNull String aString);

    @Nullable
    @Generated
    @Selector("characterSetWithContentsOfFile:")
    public static native NSCharacterSet characterSetWithContentsOfFile(@NotNull String fName);

    @NotNull
    @Generated
    @Selector("characterSetWithRange:")
    public static native NSCharacterSet characterSetWithRange(@ByValue NSRange aRange);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Selector("controlCharacterSet")
    public static native NSCharacterSet controlCharacterSet();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @NotNull
    @Generated
    @Selector("decimalDigitCharacterSet")
    public static native NSCharacterSet decimalDigitCharacterSet();

    @NotNull
    @Generated
    @Selector("decomposableCharacterSet")
    public static native NSCharacterSet decomposableCharacterSet();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @NotNull
    @Generated
    @Selector("illegalCharacterSet")
    public static native NSCharacterSet illegalCharacterSet();

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

    @NotNull
    @Generated
    @Selector("letterCharacterSet")
    public static native NSCharacterSet letterCharacterSet();

    @NotNull
    @Generated
    @Selector("lowercaseLetterCharacterSet")
    public static native NSCharacterSet lowercaseLetterCharacterSet();

    @Generated
    @Owned
    @Selector("new")
    public static native NSCharacterSet new_objc();

    /**
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @Selector("newlineCharacterSet")
    public static native NSCharacterSet newlineCharacterSet();

    @NotNull
    @Generated
    @Selector("nonBaseCharacterSet")
    public static native NSCharacterSet nonBaseCharacterSet();

    @NotNull
    @Generated
    @Selector("punctuationCharacterSet")
    public static native NSCharacterSet punctuationCharacterSet();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @NotNull
    @Generated
    @Selector("symbolCharacterSet")
    public static native NSCharacterSet symbolCharacterSet();

    @NotNull
    @Generated
    @Selector("uppercaseLetterCharacterSet")
    public static native NSCharacterSet uppercaseLetterCharacterSet();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("whitespaceAndNewlineCharacterSet")
    public static native NSCharacterSet whitespaceAndNewlineCharacterSet();

    @NotNull
    @Generated
    @Selector("whitespaceCharacterSet")
    public static native NSCharacterSet whitespaceCharacterSet();

    @NotNull
    @Generated
    @Selector("bitmapRepresentation")
    public native NSData bitmapRepresentation();

    @Generated
    @Selector("characterIsMember:")
    public native boolean characterIsMember(char aCharacter);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hasMemberInPlane:")
    public native boolean hasMemberInPlane(byte thePlane);

    @Generated
    @Selector("init")
    public native NSCharacterSet init();

    @Generated
    @Selector("initWithCoder:")
    public native NSCharacterSet initWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("invertedSet")
    public native NSCharacterSet invertedSet();

    @Generated
    @Selector("isSupersetOfSet:")
    public native boolean isSupersetOfSet(@NotNull NSCharacterSet theOtherSet);

    @Generated
    @Selector("longCharacterIsMember:")
    public native boolean longCharacterIsMember(int theLongChar);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
