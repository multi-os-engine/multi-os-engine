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

package apple.corefoundation.c;

import apple.NSObject;
import apple.corefoundation.opaque.*;
import apple.corefoundation.struct.CFAllocatorContext;
import apple.corefoundation.struct.CFArrayCallBacks;
import apple.corefoundation.struct.CFBagCallBacks;
import apple.corefoundation.struct.CFBinaryHeapCallBacks;
import apple.corefoundation.struct.CFBinaryHeapCompareContext;
import apple.corefoundation.struct.CFDictionaryKeyCallBacks;
import apple.corefoundation.struct.CFDictionaryValueCallBacks;
import apple.corefoundation.struct.CFFileDescriptorContext;
import apple.corefoundation.struct.CFGregorianDate;
import apple.corefoundation.struct.CFGregorianUnits;
import apple.corefoundation.struct.CFMachPortContext;
import apple.corefoundation.struct.CFMessagePortContext;
import apple.corefoundation.struct.CFRange;
import apple.corefoundation.struct.CFRunLoopObserverContext;
import apple.corefoundation.struct.CFRunLoopSourceContext;
import apple.corefoundation.struct.CFRunLoopTimerContext;
import apple.corefoundation.struct.CFSetCallBacks;
import apple.corefoundation.struct.CFSocketContext;
import apple.corefoundation.struct.CFSocketSignature;
import apple.corefoundation.struct.CFStreamClientContext;
import apple.corefoundation.struct.CFStreamError;
import apple.corefoundation.struct.CFStringInlineBuffer;
import apple.corefoundation.struct.CFSwappedFloat32;
import apple.corefoundation.struct.CFSwappedFloat64;
import apple.corefoundation.struct.CFTreeContext;
import apple.corefoundation.struct.CFUUIDBytes;
import apple.opaque.acl_t;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreFoundation")
@Runtime(CRuntime.class)
public final class CoreFoundation {
    /**
     * Constant used by some functions to indicate failed searches.
     */
    @Generated @NInt public static final long kCFNotFound = 0xFFFFFFFFFFFFFFFFL;

    static {
        NatJ.register();
    }

    @Generated
    private CoreFoundation() {
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFRange CFRangeMake(@NInt long loc, @NInt long len);

    /**
     * Private; do not use
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange __CFRangeMake(@NInt long loc, @NInt long len);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNullGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFAllocatorGetTypeID();

    /**
     * CFAllocatorSetDefault() sets the allocator that is used in the current
     * thread whenever NULL is specified as an allocator argument. This means
     * that most, if not all allocations will go through this allocator. It
     * also means that any allocator set as the default needs to be ready to
     * deal with arbitrary memory allocation requests; in addition, the size
     * and number of requests will change between releases.
     * 
     * An allocator set as the default will never be released, even if later
     * another allocator replaces it as the default. Not only is it impractical
     * for it to be released (as there might be caches created under the covers
     * that refer to the allocator), in general it's also safer and more
     * efficient to keep it around.
     * 
     * If you wish to use a custom allocator in a context, it's best to provide
     * it as the argument to the various creation functions rather than setting
     * it as the default. Setting the default allocator is not encouraged.
     * 
     * If you do set an allocator as the default, either do it for all time in
     * your app, or do it in a nested fashion (by restoring the previous allocator
     * when you exit your context). The latter might be appropriate for plug-ins
     * or libraries that wish to set the default allocator.
     */
    @Generated
    @CFunction
    public static native void CFAllocatorSetDefault(CFAllocatorRef allocator);

    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorGetDefault();

    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorAllocate(CFAllocatorRef allocator, @NInt long size, @NUInt long hint);

    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorReallocate(CFAllocatorRef allocator, VoidPtr ptr, @NInt long newsize,
            @NUInt long hint);

    @Generated
    @CFunction
    public static native void CFAllocatorDeallocate(CFAllocatorRef allocator, VoidPtr ptr);

    @Generated
    @CFunction
    @NInt
    public static native long CFAllocatorGetPreferredSizeForSize(CFAllocatorRef allocator, @NInt long size,
            @NUInt long hint);

    @Generated
    @CFunction
    public static native void CFAllocatorGetContext(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    /**
     * Polymorphic CF functions
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFGetTypeID(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFStringRef CFCopyTypeIDDescription(@NUInt long type_id);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFRetain(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native void CFRelease(ConstVoidPtr cf);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFAutorelease(ConstVoidPtr arg);

    @Generated
    @CFunction
    @NInt
    public static native long CFGetRetainCount(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native byte CFEqual(ConstVoidPtr cf1, ConstVoidPtr cf2);

    @Generated
    @CFunction
    @NUInt
    public static native long CFHash(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFStringRef CFCopyDescription(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFAllocatorRef CFGetAllocator(ConstVoidPtr cf);

    /**
     * [@function] CFDictionaryGetTypeID
     * Returns the type identifier of all CFDictionary instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDictionaryGetTypeID();

    /**
     * [@function] CFDictionaryCreate
     * Creates a new immutable dictionary with the given values.
     * 
     * @param allocator      The CFAllocator which should be used to allocate
     *                       memory for the dictionary and its storage for values. This
     *                       parameter may be NULL in which case the current default
     *                       CFAllocator is used. If this reference is not a valid
     *                       CFAllocator, the behavior is undefined.
     * @param keys           A C array of the pointer-sized keys to be used for
     *                       the parallel C array of values to be put into the dictionary.
     *                       This parameter may be NULL if the numValues parameter is 0.
     *                       This C array is not changed or freed by this function. If
     *                       this parameter is not a valid pointer to a C array of at
     *                       least numValues pointers, the behavior is undefined.
     * @param values         A C array of the pointer-sized values to be in the
     *                       dictionary. This parameter may be NULL if the numValues
     *                       parameter is 0. This C array is not changed or freed by
     *                       this function. If this parameter is not a valid pointer to
     *                       a C array of at least numValues pointers, the behavior is
     *                       undefined.
     * @param numValues      The number of values to copy from the keys and
     *                       values C arrays into the CFDictionary. This number will be
     *                       the count of the dictionary. If this parameter is
     *                       negative, or greater than the number of values actually
     *                       in the keys or values C arrays, the behavior is undefined.
     * @param keyCallBacks   A pointer to a CFDictionaryKeyCallBacks structure
     *                       initialized with the callbacks for the dictionary to use on
     *                       each key in the dictionary. The retain callback will be used
     *                       within this function, for example, to retain all of the new
     *                       keys from the keys C array. A copy of the contents of the
     *                       callbacks structure is made, so that a pointer to a structure
     *                       on the stack can be passed in, or can be reused for multiple
     *                       dictionary creations. If the version field of this
     *                       callbacks structure is not one of the defined ones for
     *                       CFDictionary, the behavior is undefined. The retain field may
     *                       be NULL, in which case the CFDictionary will do nothing to add
     *                       a retain to the keys of the contained values. The release field
     *                       may be NULL, in which case the CFDictionary will do nothing
     *                       to remove the dictionary's retain (if any) on the keys when the
     *                       dictionary is destroyed or a key-value pair is removed. If the
     *                       copyDescription field is NULL, the dictionary will create a
     *                       simple description for a key. If the equal field is NULL, the
     *                       dictionary will use pointer equality to test for equality of
     *                       keys. If the hash field is NULL, a key will be converted from
     *                       a pointer to an integer to compute the hash code. This callbacks
     *                       parameter itself may be NULL, which is treated as if a valid
     *                       structure of version 0 with all fields NULL had been passed in.
     *                       Otherwise, if any of the fields are not valid pointers to
     *                       functions of the correct type, or this parameter is not a
     *                       valid pointer to a CFDictionaryKeyCallBacks callbacks structure,
     *                       the behavior is undefined. If any of the keys put into the
     *                       dictionary is not one understood by one of the callback functions
     *                       the behavior when that callback function is used is undefined.
     * @param valueCallBacks A pointer to a CFDictionaryValueCallBacks structure
     *                       initialized with the callbacks for the dictionary to use on
     *                       each value in the dictionary. The retain callback will be used
     *                       within this function, for example, to retain all of the new
     *                       values from the values C array. A copy of the contents of the
     *                       callbacks structure is made, so that a pointer to a structure
     *                       on the stack can be passed in, or can be reused for multiple
     *                       dictionary creations. If the version field of this callbacks
     *                       structure is not one of the defined ones for CFDictionary, the
     *                       behavior is undefined. The retain field may be NULL, in which
     *                       case the CFDictionary will do nothing to add a retain to values
     *                       as they are put into the dictionary. The release field may be
     *                       NULL, in which case the CFDictionary will do nothing to remove
     *                       the dictionary's retain (if any) on the values when the
     *                       dictionary is destroyed or a key-value pair is removed. If the
     *                       copyDescription field is NULL, the dictionary will create a
     *                       simple description for a value. If the equal field is NULL, the
     *                       dictionary will use pointer equality to test for equality of
     *                       values. This callbacks parameter itself may be NULL, which is
     *                       treated as if a valid structure of version 0 with all fields
     *                       NULL had been passed in. Otherwise,
     *                       if any of the fields are not valid pointers to functions
     *                       of the correct type, or this parameter is not a valid
     *                       pointer to a CFDictionaryValueCallBacks callbacks structure,
     *                       the behavior is undefined. If any of the values put into the
     *                       dictionary is not one understood by one of the callback functions
     *                       the behavior when that callback function is used is undefined.
     * @return A reference to the new immutable CFDictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    /**
     * [@function] CFDictionaryCreateCopy
     * Creates a new immutable dictionary with the key-value pairs from
     * the given dictionary.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the dictionary and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param theDict   The dictionary which is to be copied. The keys and values
     *                  from the dictionary are copied as pointers into the new
     *                  dictionary (that is, the values themselves are copied, not
     *                  that which the values point to, if anything). However, the
     *                  keys and values are also retained by the new dictionary using
     *                  the retain function of the original dictionary.
     *                  The count of the new dictionary will be the same as the
     *                  given dictionary. The new dictionary uses the same callbacks
     *                  as the dictionary to be copied. If this parameter is
     *                  not a valid CFDictionary, the behavior is undefined.
     * @return A reference to the new immutable CFDictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreateCopy(CFAllocatorRef allocator, CFDictionaryRef theDict);

    /**
     * [@function] CFDictionaryCreateMutable
     * Creates a new mutable dictionary.
     * 
     * @param allocator      The CFAllocator which should be used to allocate
     *                       memory for the dictionary and its storage for values. This
     *                       parameter may be NULL in which case the current default
     *                       CFAllocator is used. If this reference is not a valid
     *                       CFAllocator, the behavior is undefined.
     * @param capacity       A hint about the number of values that will be held
     *                       by the CFDictionary. Pass 0 for no hint. The implementation may
     *                       ignore this hint, or may use it to optimize various
     *                       operations. A dictionary's actual capacity is only limited by
     *                       address space and available memory constraints). If this
     *                       parameter is negative, the behavior is undefined.
     * @param keyCallBacks   A pointer to a CFDictionaryKeyCallBacks structure
     *                       initialized with the callbacks for the dictionary to use on
     *                       each key in the dictionary. A copy of the contents of the
     *                       callbacks structure is made, so that a pointer to a structure
     *                       on the stack can be passed in, or can be reused for multiple
     *                       dictionary creations. If the version field of this
     *                       callbacks structure is not one of the defined ones for
     *                       CFDictionary, the behavior is undefined. The retain field may
     *                       be NULL, in which case the CFDictionary will do nothing to add
     *                       a retain to the keys of the contained values. The release field
     *                       may be NULL, in which case the CFDictionary will do nothing
     *                       to remove the dictionary's retain (if any) on the keys when the
     *                       dictionary is destroyed or a key-value pair is removed. If the
     *                       copyDescription field is NULL, the dictionary will create a
     *                       simple description for a key. If the equal field is NULL, the
     *                       dictionary will use pointer equality to test for equality of
     *                       keys. If the hash field is NULL, a key will be converted from
     *                       a pointer to an integer to compute the hash code. This callbacks
     *                       parameter itself may be NULL, which is treated as if a valid
     *                       structure of version 0 with all fields NULL had been passed in.
     *                       Otherwise, if any of the fields are not valid pointers to
     *                       functions of the correct type, or this parameter is not a
     *                       valid pointer to a CFDictionaryKeyCallBacks callbacks structure,
     *                       the behavior is undefined. If any of the keys put into the
     *                       dictionary is not one understood by one of the callback functions
     *                       the behavior when that callback function is used is undefined.
     * @param valueCallBacks A pointer to a CFDictionaryValueCallBacks structure
     *                       initialized with the callbacks for the dictionary to use on
     *                       each value in the dictionary. The retain callback will be used
     *                       within this function, for example, to retain all of the new
     *                       values from the values C array. A copy of the contents of the
     *                       callbacks structure is made, so that a pointer to a structure
     *                       on the stack can be passed in, or can be reused for multiple
     *                       dictionary creations. If the version field of this callbacks
     *                       structure is not one of the defined ones for CFDictionary, the
     *                       behavior is undefined. The retain field may be NULL, in which
     *                       case the CFDictionary will do nothing to add a retain to values
     *                       as they are put into the dictionary. The release field may be
     *                       NULL, in which case the CFDictionary will do nothing to remove
     *                       the dictionary's retain (if any) on the values when the
     *                       dictionary is destroyed or a key-value pair is removed. If the
     *                       copyDescription field is NULL, the dictionary will create a
     *                       simple description for a value. If the equal field is NULL, the
     *                       dictionary will use pointer equality to test for equality of
     *                       values. This callbacks parameter itself may be NULL, which is
     *                       treated as if a valid structure of version 0 with all fields
     *                       NULL had been passed in. Otherwise,
     *                       if any of the fields are not valid pointers to functions
     *                       of the correct type, or this parameter is not a valid
     *                       pointer to a CFDictionaryValueCallBacks callbacks structure,
     *                       the behavior is undefined. If any of the values put into the
     *                       dictionary is not one understood by one of the callback functions
     *                       the behavior when that callback function is used is undefined.
     * @return A reference to the new mutable CFDictionary.
     */
    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    /**
     * [@function] CFDictionaryCreateMutableCopy
     * Creates a new mutable dictionary with the key-value pairs from
     * the given dictionary.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the dictionary and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFDictionary. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. A dictionary's actual capacity is only limited by
     *                  address space and available memory constraints).
     *                  This parameter must be greater than or equal
     *                  to the count of the dictionary which is to be copied, or the
     *                  behavior is undefined. If this parameter is negative, the
     *                  behavior is undefined.
     * @param theDict   The dictionary which is to be copied. The keys and values
     *                  from the dictionary are copied as pointers into the new
     *                  dictionary (that is, the values themselves are copied, not
     *                  that which the values point to, if anything). However, the
     *                  keys and values are also retained by the new dictionary using
     *                  the retain function of the original dictionary.
     *                  The count of the new dictionary will be the same as the
     *                  given dictionary. The new dictionary uses the same callbacks
     *                  as the dictionary to be copied. If this parameter is
     *                  not a valid CFDictionary, the behavior is undefined.
     * @return A reference to the new mutable CFDictionary.
     */
    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFDictionaryRef theDict);

    /**
     * [@function] CFDictionaryGetCount
     * Returns the number of values currently in the dictionary.
     * 
     * @param theDict The dictionary to be queried. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @return The number of values in the dictionary.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCount(CFDictionaryRef theDict);

    /**
     * [@function] CFDictionaryGetCountOfKey
     * Counts the number of times the given key occurs in the dictionary.
     * 
     * @param theDict The dictionary to be searched. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param key     The key for which to find matches in the dictionary. The
     *                hash() and equal() key callbacks provided when the dictionary
     *                was created are used to compare. If the hash() key callback
     *                was NULL, the key is treated as a pointer and converted to
     *                an integer. If the equal() key callback was NULL, pointer
     *                equality (in C, ==) is used. If key, or any of the keys in
     *                the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @return Returns 1 if a matching key is used by the dictionary,
     *         0 otherwise.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfKey(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * [@function] CFDictionaryGetCountOfValue
     * Counts the number of times the given value occurs in the dictionary.
     * 
     * @param theDict The dictionary to be searched. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param value   The value for which to find matches in the dictionary. The
     *                equal() callback provided when the dictionary was created is
     *                used to compare. If the equal() value callback was NULL, pointer
     *                equality (in C, ==) is used. If value, or any of the values in
     *                the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @return The number of times the given value occurs in the dictionary.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfValue(CFDictionaryRef theDict, ConstVoidPtr value);

    /**
     * [@function] CFDictionaryContainsKey
     * Reports whether or not the key is in the dictionary.
     * 
     * @param theDict The dictionary to be searched. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param key     The key for which to find matches in the dictionary. The
     *                hash() and equal() key callbacks provided when the dictionary
     *                was created are used to compare. If the hash() key callback
     *                was NULL, the key is treated as a pointer and converted to
     *                an integer. If the equal() key callback was NULL, pointer
     *                equality (in C, ==) is used. If key, or any of the keys in
     *                the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @return true, if the key is in the dictionary, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryContainsKey(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * [@function] CFDictionaryContainsValue
     * Reports whether or not the value is in the dictionary.
     * 
     * @param theDict The dictionary to be searched. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param value   The value for which to find matches in the dictionary. The
     *                equal() callback provided when the dictionary was created is
     *                used to compare. If the equal() callback was NULL, pointer
     *                equality (in C, ==) is used. If value, or any of the values
     *                in the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @return true, if the value is in the dictionary, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryContainsValue(CFDictionaryRef theDict, ConstVoidPtr value);

    /**
     * [@function] CFDictionaryGetValue
     * Retrieves the value associated with the given key.
     * 
     * @param theDict The dictionary to be queried. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param key     The key for which to find a match in the dictionary. The
     *                hash() and equal() key callbacks provided when the dictionary
     *                was created are used to compare. If the hash() key callback
     *                was NULL, the key is treated as a pointer and converted to
     *                an integer. If the equal() key callback was NULL, pointer
     *                equality (in C, ==) is used. If key, or any of the keys in
     *                the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @return The value with the given key in the dictionary, or NULL if
     *         no key-value pair with a matching key exists. Since NULL
     *         can be a valid value in some dictionaries, the function
     *         CFDictionaryGetValueIfPresent() must be used to distinguish
     *         NULL-no-found from NULL-is-the-value.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFDictionaryGetValue(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * [@function] CFDictionaryGetValueIfPresent
     * Retrieves the value associated with the given key.
     * 
     * @param theDict The dictionary to be queried. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param key     The key for which to find a match in the dictionary. The
     *                hash() and equal() key callbacks provided when the dictionary
     *                was created are used to compare. If the hash() key callback
     *                was NULL, the key is treated as a pointer and converted to
     *                an integer. If the equal() key callback was NULL, pointer
     *                equality (in C, ==) is used. If key, or any of the keys in
     *                the dictionary, are not understood by the equal() callback,
     *                the behavior is undefined.
     * @param value   A pointer to memory which should be filled with the
     *                pointer-sized value if a matching key is found. If no key
     *                match is found, the contents of the storage pointed to by
     *                this parameter are undefined. This parameter may be NULL,
     *                in which case the value from the dictionary is not returned
     *                (but the return value of this function still indicates
     *                whether or not the key-value pair was present).
     * @return true, if a matching key was found, false otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryGetValueIfPresent(CFDictionaryRef theDict, ConstVoidPtr key,
            Ptr<ConstVoidPtr> value);

    /**
     * [@function] CFDictionaryGetKeysAndValues
     * Fills the two buffers with the keys and values from the dictionary.
     * 
     * @param theDict The dictionary to be queried. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param keys    A C array of pointer-sized values to be filled with keys
     *                from the dictionary. The keys and values C arrays are parallel
     *                to each other (that is, the items at the same indices form a
     *                key-value pair from the dictionary). This parameter may be NULL
     *                if the keys are not desired. If this parameter is not a valid
     *                pointer to a C array of at least CFDictionaryGetCount() pointers,
     *                or NULL, the behavior is undefined.
     * @param values  A C array of pointer-sized values to be filled with values
     *                from the dictionary. The keys and values C arrays are parallel
     *                to each other (that is, the items at the same indices form a
     *                key-value pair from the dictionary). This parameter may be NULL
     *                if the values are not desired. If this parameter is not a valid
     *                pointer to a C array of at least CFDictionaryGetCount() pointers,
     *                or NULL, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionaryGetKeysAndValues(CFDictionaryRef theDict, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values);

    /**
     * [@function] CFDictionaryApplyFunction
     * Calls a function once for each value in the dictionary.
     * 
     * @param theDict The dictionary to be queried. If this parameter is
     *                not a valid CFDictionary, the behavior is undefined.
     * @param applier The callback function to call once for each value in
     *                the dictionary. If this parameter is not a
     *                pointer to a function of the correct prototype, the behavior
     *                is undefined. If there are keys or values which the
     *                applier function does not expect or cannot properly apply
     *                to, the behavior is undefined.
     * @param context A pointer-sized user-defined value, which is passed
     *                as the third parameter to the applier function, but is
     *                otherwise unused by this function. If the context is not
     *                what is expected by the applier function, the behavior is
     *                undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionaryApplyFunction(CFDictionaryRef theDict,
            @FunctionPtr(name = "call_CFDictionaryApplyFunction") Function_CFDictionaryApplyFunction applier,
            VoidPtr context);

    /**
     * [@function] CFDictionaryAddValue
     * Adds the key-value pair to the dictionary if no such key already exists.
     * 
     * @param theDict The dictionary to which the value is to be added. If this
     *                parameter is not a valid mutable CFDictionary, the behavior is
     *                undefined.
     * @param key     The key of the value to add to the dictionary. The key is
     *                retained by the dictionary using the retain callback provided
     *                when the dictionary was created. If the key is not of the sort
     *                expected by the retain callback, the behavior is undefined. If
     *                a key which matches this key is already present in the dictionary,
     *                this function does nothing ("add if absent").
     * @param value   The value to add to the dictionary. The value is retained
     *                by the dictionary using the retain callback provided when the
     *                dictionary was created. If the value is not of the sort expected
     *                by the retain callback, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionaryAddValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * [@function] CFDictionarySetValue
     * Sets the value of the key in the dictionary.
     * 
     * @param theDict The dictionary to which the value is to be set. If this
     *                parameter is not a valid mutable CFDictionary, the behavior is
     *                undefined.
     * @param key     The key of the value to set into the dictionary. If a key
     *                which matches this key is already present in the dictionary, only
     *                the value is changed ("add if absent, replace if present"). If
     *                no key matches the given key, the key-value pair is added to the
     *                dictionary. If added, the key is retained by the dictionary,
     *                using the retain callback provided
     *                when the dictionary was created. If the key is not of the sort
     *                expected by the key retain callback, the behavior is undefined.
     * @param value   The value to add to or replace into the dictionary. The value
     *                is retained by the dictionary using the retain callback provided
     *                when the dictionary was created, and the previous value if any is
     *                released. If the value is not of the sort expected by the
     *                retain or release callbacks, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionarySetValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * [@function] CFDictionaryReplaceValue
     * Replaces the value of the key in the dictionary.
     * 
     * @param theDict The dictionary to which the value is to be replaced. If this
     *                parameter is not a valid mutable CFDictionary, the behavior is
     *                undefined.
     * @param key     The key of the value to replace in the dictionary. If a key
     *                which matches this key is present in the dictionary, the value
     *                is changed to the given value, otherwise this function does
     *                nothing ("replace if present").
     * @param value   The value to replace into the dictionary. The value
     *                is retained by the dictionary using the retain callback provided
     *                when the dictionary was created, and the previous value is
     *                released. If the value is not of the sort expected by the
     *                retain or release callbacks, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionaryReplaceValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * [@function] CFDictionaryRemoveValue
     * Removes the value of the key from the dictionary.
     * 
     * @param theDict The dictionary from which the value is to be removed. If this
     *                parameter is not a valid mutable CFDictionary, the behavior is
     *                undefined.
     * @param key     The key of the value to remove from the dictionary. If a key
     *                which matches this key is present in the dictionary, the key-value
     *                pair is removed from the dictionary, otherwise this function does
     *                nothing ("remove if present").
     */
    @Generated
    @CFunction
    public static native void CFDictionaryRemoveValue(CFMutableDictionaryRef theDict, ConstVoidPtr key);

    /**
     * [@function] CFDictionaryRemoveAllValues
     * Removes all the values from the dictionary, making it empty.
     * 
     * @param theDict The dictionary from which all of the values are to be
     *                removed. If this parameter is not a valid mutable
     *                CFDictionary, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFDictionaryRemoveAllValues(CFMutableDictionaryRef theDict);

    @Generated
    @CFunction
    @NUInt
    public static native long CFDataGetTypeID();

    @Generated
    @CFunction
    public static native CFDataRef CFDataCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateWithBytesNoCopy(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    /**
     * Pass kCFAllocatorNull as bytesDeallocator to assure the bytes aren't freed
     */
    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateCopy(CFAllocatorRef allocator, CFDataRef theData);

    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFDataRef theData);

    @Generated
    @CFunction
    @NInt
    public static native long CFDataGetLength(CFDataRef theData);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFDataGetBytePtr(CFDataRef theData);

    @Generated
    @CFunction
    public static native BytePtr CFDataGetMutableBytePtr(CFMutableDataRef theData);

    @Generated
    @CFunction
    public static native void CFDataGetBytes(CFDataRef theData, @ByValue CFRange range, BytePtr buffer);

    @Generated
    @CFunction
    public static native void CFDataSetLength(CFMutableDataRef theData, @NInt long length);

    @Generated
    @CFunction
    public static native void CFDataIncreaseLength(CFMutableDataRef theData, @NInt long extraLength);

    @Generated
    @CFunction
    public static native void CFDataAppendBytes(CFMutableDataRef theData,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    @Generated
    @CFunction
    public static native void CFDataReplaceBytes(CFMutableDataRef theData, @ByValue CFRange range,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
            @NInt long newLength);

    @Generated
    @CFunction
    public static native void CFDataDeleteBytes(CFMutableDataRef theData, @ByValue CFRange range);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFDataFind(CFDataRef theData, CFDataRef dataToFind, @ByValue CFRange searchRange,
            @NUInt long compareOptions);

    /**
     * [@function] CFArrayGetTypeID
     * Returns the type identifier of all CFArray instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFArrayGetTypeID();

    /**
     * [@function] CFArrayCreate
     * Creates a new immutable array with the given values.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the array and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param values    A C array of the pointer-sized values to be in the
     *                  array. The values in the array are ordered in the same order
     *                  in which they appear in this C array. This parameter may be
     *                  NULL if the numValues parameter is 0. This C array is not
     *                  changed or freed by this function. If this parameter is not
     *                  a valid pointer to a C array of at least numValues pointers,
     *                  the behavior is undefined.
     * @param numValues The number of values to copy from the values C
     *                  array into the CFArray. This number will be the count of the
     *                  array.
     *                  If this parameter is negative, or greater than the number of
     *                  values actually in the value's C array, the behavior is
     *                  undefined.
     * @param callBacks A pointer to a CFArrayCallBacks structure
     *                  initialized with the callbacks for the array to use on each
     *                  value in the array. The retain callback will be used within
     *                  this function, for example, to retain all of the new values
     *                  from the values C array. A copy of the contents of the
     *                  callbacks structure is made, so that a pointer to a
     *                  structure on the stack can be passed in, or can be reused
     *                  for multiple array creations. If the version field of this
     *                  callbacks structure is not one of the defined ones for
     *                  CFArray, the behavior is undefined. The retain field may be
     *                  NULL, in which case the CFArray will do nothing to add a
     *                  retain to the contained values for the array. The release
     *                  field may be NULL, in which case the CFArray will do nothing
     *                  to remove the array's retain (if any) on the values when the
     *                  array is destroyed. If the copyDescription field is NULL,
     *                  the array will create a simple description for the value. If
     *                  the equal field is NULL, the array will use pointer equality
     *                  to test for equality of values. This callbacks parameter
     *                  itself may be NULL, which is treated as if a valid structure
     *                  of version 0 with all fields NULL had been passed in.
     *                  Otherwise, if any of the fields are not valid pointers to
     *                  functions of the correct type, or this parameter is not a
     *                  valid pointer to a CFArrayCallBacks callbacks structure,
     *                  the behavior is undefined. If any of the values put into the
     *                  array is not one understood by one of the callback functions
     *                  the behavior when that callback function is used is
     *                  undefined.
     * @return A reference to the new immutable CFArray.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values,
            @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    /**
     * [@function] CFArrayCreateCopy
     * Creates a new immutable array with the values from the given array.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the array and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param theArray  The array which is to be copied. The values from the
     *                  array are copied as pointers into the new array (that is,
     *                  the values themselves are copied, not that which the values
     *                  point to, if anything). However, the values are also
     *                  retained by the new array. The count of the new array will
     *                  be the same as the given array. The new array uses the same
     *                  callbacks as the array to be copied. If this parameter is
     *                  not a valid CFArray, the behavior is undefined.
     * @return A reference to the new immutable CFArray.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreateCopy(CFAllocatorRef allocator, CFArrayRef theArray);

    /**
     * [@function] CFArrayCreateMutable
     * Creates a new empty mutable array.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the array and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFArray. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. An array's actual capacity is only limited by
     *                  address space and available memory constraints). If this
     *                  parameter is negative, the behavior is undefined.
     * @param callBacks A pointer to a CFArrayCallBacks structure
     *                  initialized with the callbacks for the array to use on each
     *                  value in the array. A copy of the contents of the
     *                  callbacks structure is made, so that a pointer to a
     *                  structure on the stack can be passed in, or can be reused
     *                  for multiple array creations. If the version field of this
     *                  callbacks structure is not one of the defined ones for
     *                  CFArray, the behavior is undefined. The retain field may be
     *                  NULL, in which case the CFArray will do nothing to add a
     *                  retain to the contained values for the array. The release
     *                  field may be NULL, in which case the CFArray will do nothing
     *                  to remove the array's retain (if any) on the values when the
     *                  array is destroyed. If the copyDescription field is NULL,
     *                  the array will create a simple description for the value. If
     *                  the equal field is NULL, the array will use pointer equality
     *                  to test for equality of values. This callbacks parameter
     *                  itself may be NULL, which is treated as if a valid structure
     *                  of version 0 with all fields NULL had been passed in.
     *                  Otherwise, if any of the fields are not valid pointers to
     *                  functions of the correct type, or this parameter is not a
     *                  valid pointer to a CFArrayCallBacks callbacks structure,
     *                  the behavior is undefined. If any of the values put into the
     *                  array is not one understood by one of the callback functions
     *                  the behavior when that callback function is used is
     *                  undefined.
     * @return A reference to the new mutable CFArray.
     */
    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    /**
     * [@function] CFArrayCreateMutableCopy
     * Creates a new mutable array with the values from the given array.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the array and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFArray. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. An array's actual capacity is only limited by
     *                  address space and available memory constraints).
     *                  This parameter must be greater than or equal
     *                  to the count of the array which is to be copied, or the
     *                  behavior is undefined. If this parameter is negative, the
     *                  behavior is undefined.
     * @param theArray  The array which is to be copied. The values from the
     *                  array are copied as pointers into the new array (that is,
     *                  the values themselves are copied, not that which the values
     *                  point to, if anything). However, the values are also
     *                  retained by the new array. The count of the new array will
     *                  be the same as the given array. The new array uses the same
     *                  callbacks as the array to be copied. If this parameter is
     *                  not a valid CFArray, the behavior is undefined.
     * @return A reference to the new mutable CFArray.
     */
    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFArrayRef theArray);

    /**
     * [@function] CFArrayGetCount
     * Returns the number of values currently in the array.
     * 
     * @param theArray The array to be queried. If this parameter is not a valid
     *                 CFArray, the behavior is undefined.
     * @return The number of values in the array.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCount(CFArrayRef theArray);

    /**
     * [@function] CFArrayGetCountOfValue
     * Counts the number of times the given value occurs in the array.
     * 
     * @param theArray The array to be searched. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param range    The range within the array to search. If the range
     *                 location or end point (defined by the location plus length
     *                 minus 1) is outside the index space of the array (0 to
     *                 N-1 inclusive, where N is the count of the array), the
     *                 behavior is undefined. If the range length is negative, the
     *                 behavior is undefined. The range may be empty (length 0).
     * @param value    The value for which to find matches in the array. The
     *                 equal() callback provided when the array was created is
     *                 used to compare. If the equal() callback was NULL, pointer
     *                 equality (in C, ==) is used. If value, or any of the values
     *                 in the array, are not understood by the equal() callback,
     *                 the behavior is undefined.
     * @return The number of times the given value occurs in the array,
     *         within the specified range.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCountOfValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    /**
     * [@function] CFArrayContainsValue
     * Reports whether or not the value is in the array.
     * 
     * @param theArray The array to be searched. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param range    The range within the array to search. If the range
     *                 location or end point (defined by the location plus length
     *                 minus 1) is outside the index space of the array (0 to
     *                 N-1 inclusive, where N is the count of the array), the
     *                 behavior is undefined. If the range length is negative, the
     *                 behavior is undefined. The range may be empty (length 0).
     * @param value    The value for which to find matches in the array. The
     *                 equal() callback provided when the array was created is
     *                 used to compare. If the equal() callback was NULL, pointer
     *                 equality (in C, ==) is used. If value, or any of the values
     *                 in the array, are not understood by the equal() callback,
     *                 the behavior is undefined.
     * @return true, if the value is in the specified range of the array,
     *         otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFArrayContainsValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    /**
     * [@function] CFArrayGetValueAtIndex
     * Retrieves the value at the given index.
     * 
     * @param theArray The array to be queried. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param idx      The index of the value to retrieve. If the index is
     *                 outside the index space of the array (0 to N-1 inclusive,
     *                 where N is the count of the array), the behavior is
     *                 undefined.
     * @return The value with the given index in the array.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFArrayGetValueAtIndex(CFArrayRef theArray, @NInt long idx);

    /**
     * [@function] CFArrayGetValues
     * Fills the buffer with values from the array.
     * 
     * @param theArray The array to be queried. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param range    The range of values within the array to retrieve. If
     *                 the range location or end point (defined by the location
     *                 plus length minus 1) is outside the index space of the
     *                 array (0 to N-1 inclusive, where N is the count of the
     *                 array), the behavior is undefined. If the range length is
     *                 negative, the behavior is undefined. The range may be empty
     *                 (length 0), in which case no values are put into the buffer.
     * @param values   A C array of pointer-sized values to be filled with
     *                 values from the array. The values in the C array are ordered
     *                 in the same order in which they appear in the array. If this
     *                 parameter is not a valid pointer to a C array of at least
     *                 range.length pointers, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayGetValues(CFArrayRef theArray, @ByValue CFRange range, Ptr<ConstVoidPtr> values);

    /**
     * [@function] CFArrayApplyFunction
     * Calls a function once for each value in the array.
     * 
     * @param theArray The array to be operated upon. If this parameter is not
     *                 a valid CFArray, the behavior is undefined.
     * @param range    The range of values within the array to which to apply
     *                 the function. If the range location or end point (defined by
     *                 the location plus length minus 1) is outside the index
     *                 space of the array (0 to N-1 inclusive, where N is the count
     *                 of the array), the behavior is undefined. If the range
     *                 length is negative, the behavior is undefined. The range may
     *                 be empty (length 0).
     * @param applier  The callback function to call once for each value in
     *                 the given range in the array. If this parameter is not a
     *                 pointer to a function of the correct prototype, the behavior
     *                 is undefined. If there are values in the range which the
     *                 applier function does not expect or cannot properly apply
     *                 to, the behavior is undefined.
     * @param context  A pointer-sized user-defined value, which is passed
     *                 as the second parameter to the applier function, but is
     *                 otherwise unused by this function. If the context is not
     *                 what is expected by the applier function, the behavior is
     *                 undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayApplyFunction(CFArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArrayApplyFunction") Function_CFArrayApplyFunction applier, VoidPtr context);

    /**
     * [@function] CFArrayGetFirstIndexOfValue
     * Searches the array for the value.
     * 
     * @param theArray The array to be searched. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param range    The range within the array to search. If the range
     *                 location or end point (defined by the location plus length
     *                 minus 1) is outside the index space of the array (0 to
     *                 N-1 inclusive, where N is the count of the array), the
     *                 behavior is undefined. If the range length is negative, the
     *                 behavior is undefined. The range may be empty (length 0).
     *                 The search progresses from the smallest index defined by
     *                 the range to the largest.
     * @param value    The value for which to find a match in the array. The
     *                 equal() callback provided when the array was created is
     *                 used to compare. If the equal() callback was NULL, pointer
     *                 equality (in C, ==) is used. If value, or any of the values
     *                 in the array, are not understood by the equal() callback,
     *                 the behavior is undefined.
     * @return The lowest index of the matching values in the range, or
     *         kCFNotFound if no value in the range matched.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetFirstIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    /**
     * [@function] CFArrayGetLastIndexOfValue
     * Searches the array for the value.
     * 
     * @param theArray The array to be searched. If this parameter is not a
     *                 valid CFArray, the behavior is undefined.
     * @param range    The range within the array to search. If the range
     *                 location or end point (defined by the location plus length
     *                 minus 1) is outside the index space of the array (0 to
     *                 N-1 inclusive, where N is the count of the array), the
     *                 behavior is undefined. If the range length is negative, the
     *                 behavior is undefined. The range may be empty (length 0).
     *                 The search progresses from the largest index defined by the
     *                 range to the smallest.
     * @param value    The value for which to find a match in the array. The
     *                 equal() callback provided when the array was created is
     *                 used to compare. If the equal() callback was NULL, pointer
     *                 equality (in C, ==) is used. If value, or any of the values
     *                 in the array, are not understood by the equal() callback,
     *                 the behavior is undefined.
     * @return The highest index of the matching values in the range, or
     *         kCFNotFound if no value in the range matched.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetLastIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    /**
     * [@function] CFArrayBSearchValues
     * Searches the array for the value using a binary search algorithm.
     * 
     * @param theArray   The array to be searched. If this parameter is not a
     *                   valid CFArray, the behavior is undefined. If the array is
     *                   not sorted from least to greatest according to the
     *                   comparator function, the behavior is undefined.
     * @param range      The range within the array to search. If the range
     *                   location or end point (defined by the location plus length
     *                   minus 1) is outside the index space of the array (0 to
     *                   N-1 inclusive, where N is the count of the array), the
     *                   behavior is undefined. If the range length is negative, the
     *                   behavior is undefined. The range may be empty (length 0).
     * @param value      The value for which to find a match in the array. If
     *                   value, or any of the values in the array, are not understood
     *                   by the comparator callback, the behavior is undefined.
     * @param comparator The function with the comparator function type
     *                   signature which is used in the binary search operation to
     *                   compare values in the array with the given value. If this
     *                   parameter is not a pointer to a function of the correct
     *                   prototype, the behavior is undefined. If there are values
     *                   in the range which the comparator function does not expect
     *                   or cannot properly compare, the behavior is undefined.
     * @param context    A pointer-sized user-defined value, which is passed
     *                   as the third parameter to the comparator function, but is
     *                   otherwise unused by this function. If the context is not
     *                   what is expected by the comparator function, the behavior is
     *                   undefined.
     * @return The return value is either 1) the index of a value that
     *         matched, if the target value matches one or more in the
     *         range, 2) greater than or equal to the end point of the
     *         range, if the value is greater than all the values in the
     *         range, or 3) the index of the value greater than the target
     *         value, if the value lies between two of (or less than all
     *         of) the values in the range.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayBSearchValues(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value,
            @FunctionPtr(name = "call_CFArrayBSearchValues") Function_CFArrayBSearchValues comparator, VoidPtr context);

    /**
     * [@function] CFArrayAppendValue
     * Adds the value to the array giving it a new largest index.
     * 
     * @param theArray The array to which the value is to be added. If this
     *                 parameter is not a valid mutable CFArray, the behavior is
     *                 undefined.
     * @param value    The value to add to the array. The value is retained by
     *                 the array using the retain callback provided when the array
     *                 was created. If the value is not of the sort expected by the
     *                 retain callback, the behavior is undefined. The value is
     *                 assigned to the index one larger than the previous largest
     *                 index, and the count of the array is increased by one.
     */
    @Generated
    @CFunction
    public static native void CFArrayAppendValue(CFMutableArrayRef theArray, ConstVoidPtr value);

    /**
     * [@function] CFArrayInsertValueAtIndex
     * Adds the value to the array, giving it the given index.
     * 
     * @param theArray The array to which the value is to be added. If this
     *                 parameter is not a valid mutable CFArray, the behavior is
     *                 undefined.
     * @param idx      The index to which to add the new value. If the index is
     *                 outside the index space of the array (0 to N inclusive,
     *                 where N is the count of the array before the operation), the
     *                 behavior is undefined. If the index is the same as N, this
     *                 function has the same effect as CFArrayAppendValue().
     * @param value    The value to add to the array. The value is retained by
     *                 the array using the retain callback provided when the array
     *                 was created. If the value is not of the sort expected by the
     *                 retain callback, the behavior is undefined. The value is
     *                 assigned to the given index, and all values with equal and
     *                 larger indices have their indexes increased by one.
     */
    @Generated
    @CFunction
    public static native void CFArrayInsertValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    /**
     * [@function] CFArraySetValueAtIndex
     * Changes the value with the given index in the array.
     * 
     * @param theArray The array in which the value is to be changed. If this
     *                 parameter is not a valid mutable CFArray, the behavior is
     *                 undefined.
     * @param idx      The index to which to set the new value. If the index is
     *                 outside the index space of the array (0 to N inclusive,
     *                 where N is the count of the array before the operation), the
     *                 behavior is undefined. If the index is the same as N, this
     *                 function has the same effect as CFArrayAppendValue().
     * @param value    The value to set in the array. The value is retained by
     *                 the array using the retain callback provided when the array
     *                 was created, and the previous value with that index is
     *                 released. If the value is not of the sort expected by the
     *                 retain callback, the behavior is undefined. The indices of
     *                 other values is not affected.
     */
    @Generated
    @CFunction
    public static native void CFArraySetValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    /**
     * [@function] CFArrayRemoveValueAtIndex
     * Removes the value with the given index from the array.
     * 
     * @param theArray The array from which the value is to be removed. If
     *                 this parameter is not a valid mutable CFArray, the behavior
     *                 is undefined.
     * @param idx      The index from which to remove the value. If the index is
     *                 outside the index space of the array (0 to N-1 inclusive,
     *                 where N is the count of the array before the operation), the
     *                 behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayRemoveValueAtIndex(CFMutableArrayRef theArray, @NInt long idx);

    /**
     * [@function] CFArrayRemoveAllValues
     * Removes all the values from the array, making it empty.
     * 
     * @param theArray The array from which all of the values are to be
     *                 removed. If this parameter is not a valid mutable CFArray,
     *                 the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayRemoveAllValues(CFMutableArrayRef theArray);

    /**
     * [@function] CFArrayReplaceValues
     * Replaces a range of values in the array.
     * 
     * @param theArray  The array from which all of the values are to be
     *                  removed. If this parameter is not a valid mutable CFArray,
     *                  the behavior is undefined.
     * @param range     The range of values within the array to replace. If the
     *                  range location or end point (defined by the location plus
     *                  length minus 1) is outside the index space of the array (0
     *                  to N inclusive, where N is the count of the array), the
     *                  behavior is undefined. If the range length is negative, the
     *                  behavior is undefined. The range may be empty (length 0),
     *                  in which case the new values are merely inserted at the
     *                  range location.
     * @param newValues A C array of the pointer-sized values to be placed
     *                  into the array. The new values in the array are ordered in
     *                  the same order in which they appear in this C array. This
     *                  parameter may be NULL if the newCount parameter is 0. This
     *                  C array is not changed or freed by this function. If this
     *                  parameter is not a valid pointer to a C array of at least
     *                  newCount pointers, the behavior is undefined.
     * @param newCount  The number of values to copy from the values C
     *                  array into the CFArray. If this parameter is different than
     *                  the range length, the excess newCount values will be
     *                  inserted after the range, or the excess range values will be
     *                  deleted. This parameter may be 0, in which case no new
     *                  values are replaced into the array and the values in the
     *                  range are simply removed. If this parameter is negative, or
     *                  greater than the number of values actually in the newValues
     *                  C array, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayReplaceValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            Ptr<ConstVoidPtr> newValues, @NInt long newCount);

    /**
     * [@function] CFArrayExchangeValuesAtIndices
     * Exchanges the values at two indices of the array.
     * 
     * @param theArray The array of which the values are to be swapped. If
     *                 this parameter is not a valid mutable CFArray, the behavior
     *                 is undefined.
     * @param idx1     The first index whose values should be swapped. If the
     *                 index is outside the index space of the array (0 to N-1
     *                 inclusive, where N is the count of the array before the
     *                 operation), the behavior is undefined.
     * @param idx2     The second index whose values should be swapped. If the
     *                 index is outside the index space of the array (0 to N-1
     *                 inclusive, where N is the count of the array before the
     *                 operation), the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFArrayExchangeValuesAtIndices(CFMutableArrayRef theArray, @NInt long idx1,
            @NInt long idx2);

    /**
     * [@function] CFArraySortValues
     * Sorts the values in the array using the given comparison function.
     * 
     * @param theArray   The array whose values are to be sorted. If this
     *                   parameter is not a valid mutable CFArray, the behavior is
     *                   undefined.
     * @param range      The range of values within the array to sort. If the
     *                   range location or end point (defined by the location plus
     *                   length minus 1) is outside the index space of the array (0
     *                   to N-1 inclusive, where N is the count of the array), the
     *                   behavior is undefined. If the range length is negative, the
     *                   behavior is undefined. The range may be empty (length 0).
     * @param comparator The function with the comparator function type
     *                   signature which is used in the sort operation to compare
     *                   values in the array with the given value. If this parameter
     *                   is not a pointer to a function of the correct prototype, the
     *                   the behavior is undefined. If there are values in the array
     *                   which the comparator function does not expect or cannot
     *                   properly compare, the behavior is undefined. The values in
     *                   the range are sorted from least to greatest according to
     *                   this function.
     * @param context    A pointer-sized user-defined value, which is passed
     *                   as the third parameter to the comparator function, but is
     *                   otherwise unused by this function. If the context is not
     *                   what is expected by the comparator function, the behavior is
     *                   undefined.
     */
    @Generated
    @CFunction
    public static native void CFArraySortValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArraySortValues") Function_CFArraySortValues comparator, VoidPtr context);

    /**
     * [@function] CFArrayAppendArray
     * Adds the values from an array to another array.
     * 
     * @param theArray   The array to which values from the otherArray are to
     *                   be added. If this parameter is not a valid mutable CFArray,
     *                   the behavior is undefined.
     * @param otherArray The array providing the values to be added to the
     *                   array. If this parameter is not a valid CFArray, the
     *                   behavior is undefined.
     * @param otherRange The range within the otherArray from which to add
     *                   the values to the array. If the range location or end point
     *                   (defined by the location plus length minus 1) is outside
     *                   the index space of the otherArray (0 to N-1 inclusive, where
     *                   N is the count of the otherArray), the behavior is
     *                   undefined. The new values are retained by the array using
     *                   the retain callback provided when the array was created. If
     *                   the values are not of the sort expected by the retain
     *                   callback, the behavior is undefined. The values are assigned
     *                   to the indices one larger than the previous largest index
     *                   in the array, and beyond, and the count of the array is
     *                   increased by range.length. The values are assigned new
     *                   indices in the array from smallest to largest index in the
     *                   order in which they appear in the otherArray.
     */
    @Generated
    @CFunction
    public static native void CFArrayAppendArray(CFMutableArrayRef theArray, CFArrayRef otherArray,
            @ByValue CFRange otherRange);

    /**
     * [@function] CFCharacterSetGetTypeID
     * Returns the type identifier of all CFCharacterSet instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFCharacterSetGetTypeID();

    /**
     * [@function] CFCharacterSetGetPredefined
     * Returns a predefined CFCharacterSet instance.
     * 
     * @param theSetIdentifier The CFCharacterSetPredefinedSet selector
     *                         which specifies the predefined character set. If the
     *                         value is not in CFCharacterSetPredefinedSet, the behavior
     *                         is undefined.
     * @return A reference to the predefined immutable CFCharacterSet.
     *         This instance is owned by CF.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetGetPredefined(@NInt long theSetIdentifier);

    /**
     * [@function] CFCharacterSetCreateWithCharactersInRange
     * Creates a new immutable character set with the values from the given range.
     * 
     * @param alloc    The CFAllocator which should be used to allocate
     *                 memory for the array and its storage for values. This
     *                 parameter may be NULL in which case the current default
     *                 CFAllocator is used. If this reference is not a valid
     *                 CFAllocator, the behavior is undefined.
     * @param theRange The CFRange which should be used to specify the
     *                 Unicode range the character set is filled with. It
     *                 accepts the range in 32-bit in the UTF-32 format. The
     *                 valid character point range is from 0x00000 to 0x10FFFF.
     *                 If the range is outside of the valid Unicode character
     *                 point, the behavior is undefined.
     * @return A reference to the new immutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInRange(CFAllocatorRef alloc,
            @ByValue CFRange theRange);

    /**
     * [@function] CFCharacterSetCreateWithCharactersInString
     * Creates a new immutable character set with the values in the given string.
     * 
     * @param alloc     The CFAllocator which should be used to allocate
     *                  memory for the array and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param theString The CFString which should be used to specify
     *                  the Unicode characters the character set is filled with.
     *                  If this parameter is not a valid CFString, the behavior
     *                  is undefined.
     * @return A reference to the new immutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInString(CFAllocatorRef alloc,
            CFStringRef theString);

    /**
     * [@function] CFCharacterSetCreateWithBitmapRepresentation
     * Creates a new immutable character set with the bitmap representtion in the given data.
     * 
     * @param alloc   The CFAllocator which should be used to allocate
     *                memory for the array and its storage for values. This
     *                parameter may be NULL in which case the current default
     *                CFAllocator is used. If this reference is not a valid
     *                CFAllocator, the behavior is undefined.
     * @param theData The CFData which should be used to specify the
     *                bitmap representation of the Unicode character points
     *                the character set is filled with. The bitmap
     *                representation could contain all the Unicode character
     *                range starting from BMP to Plane 16. The first 8192 bytes
     *                of the data represent the BMP range. The BMP range 8192
     *                bytes can be followed by zero to sixteen 8192 byte
     *                bitmaps, each one with the plane index byte prepended.
     *                For example, the bitmap representing the BMP and Plane 2
     *                has the size of 16385 bytes (8192 bytes for BMP, 1 byte
     *                index + 8192 bytes bitmap for Plane 2). The plane index
     *                byte, in this case, contains the integer value two. If
     *                this parameter is not a valid CFData or it contains a
     *                Plane index byte outside of the valid Plane range
     *                (1 to 16), the behavior is undefined.
     * @return A reference to the new immutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithBitmapRepresentation(CFAllocatorRef alloc,
            CFDataRef theData);

    /**
     * [@function] CFCharacterSetCreateInvertedSet
     * Creates a new immutable character set that is the invert of the specified character set.
     * 
     * @param alloc  The CFAllocator which should be used to allocate
     *               memory for the array and its storage for values. This
     *               parameter may be NULL in which case the current default
     *               CFAllocator is used. If this reference is not a valid
     *               CFAllocator, the behavior is undefined.
     * @param theSet The CFCharacterSet which is to be inverted. If this
     *               parameter is not a valid CFCharacterSet, the behavior is
     *               undefined.
     * @return A reference to the new immutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateInvertedSet(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * [@function] CFCharacterSetIsSupersetOfSet
     * Reports whether or not the character set is a superset of the character set specified as the second parameter.
     * 
     * @param theSet      The character set to be checked for the membership of theOtherSet.
     *                    If this parameter is not a valid CFCharacterSet, the behavior is undefined.
     * @param theOtherset The character set to be checked whether or not it is a subset of theSet.
     *                    If this parameter is not a valid CFCharacterSet, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsSupersetOfSet(CFCharacterSetRef theSet, CFCharacterSetRef theOtherset);

    /**
     * [@function] CFCharacterSetHasMemberInPlane
     * Reports whether or not the character set contains at least one member character in the specified plane.
     * 
     * @param theSet   The character set to be checked for the membership. If this
     *                 parameter is not a valid CFCharacterSet, the behavior is undefined.
     * @param thePlane The plane number to be checked for the membership.
     *                 The valid value range is from 0 to 16. If the value is outside of the valid
     *                 plane number range, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetHasMemberInPlane(CFCharacterSetRef theSet, @NInt long thePlane);

    /**
     * [@function] CFCharacterSetCreateMutable
     * Creates a new empty mutable character set.
     * 
     * @param alloc The CFAllocator which should be used to allocate
     *              memory for the array and its storage for values. This
     *              parameter may be NULL in which case the current default
     *              CFAllocator is used. If this reference is not a valid
     *              CFAllocator, the behavior is undefined.
     * @return A reference to the new mutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutable(CFAllocatorRef alloc);

    /**
     * [@function] CFCharacterSetCreateCopy
     * Creates a new character set with the values from the given character set. This function tries to compact the
     * backing store where applicable.
     * 
     * @param alloc  The CFAllocator which should be used to allocate
     *               memory for the array and its storage for values. This
     *               parameter may be NULL in which case the current default
     *               CFAllocator is used. If this reference is not a valid
     *               CFAllocator, the behavior is undefined.
     * @param theSet The CFCharacterSet which is to be copied. If this
     *               parameter is not a valid CFCharacterSet, the behavior is
     *               undefined.
     * @return A reference to the new CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateCopy(CFAllocatorRef alloc, CFCharacterSetRef theSet);

    /**
     * [@function] CFCharacterSetCreateMutableCopy
     * Creates a new mutable character set with the values from the given character set.
     * 
     * @param alloc  The CFAllocator which should be used to allocate
     *               memory for the array and its storage for values. This
     *               parameter may be NULL in which case the current default
     *               CFAllocator is used. If this reference is not a valid
     *               CFAllocator, the behavior is undefined.
     * @param theSet The CFCharacterSet which is to be copied. If this
     *               parameter is not a valid CFCharacterSet, the behavior is
     *               undefined.
     * @return A reference to the new mutable CFCharacterSet.
     */
    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutableCopy(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * [@function] CFCharacterSetIsCharacterMember
     * Reports whether or not the Unicode character is in the character set.
     * 
     * @param theSet  The character set to be searched. If this parameter
     *                is not a valid CFCharacterSet, the behavior is undefined.
     * @param theChar The Unicode character for which to test against the
     *                character set. Note that this function takes 16-bit Unicode
     *                character value; hence, it does not support access to the
     *                non-BMP planes.
     * @return true, if the value is in the character set, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsCharacterMember(CFCharacterSetRef theSet, char theChar);

    /**
     * [@function] CFCharacterSetIsLongCharacterMember
     * Reports whether or not the UTF-32 character is in the character set.
     * 
     * @param theSet  The character set to be searched. If this parameter
     *                is not a valid CFCharacterSet, the behavior is undefined.
     * @param theChar The UTF-32 character for which to test against the
     *                character set.
     * @return true, if the value is in the character set, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsLongCharacterMember(CFCharacterSetRef theSet, int theChar);

    /**
     * [@function] CFCharacterSetCreateBitmapRepresentation
     * Creates a new immutable data with the bitmap representation from the given character set.
     * 
     * @param alloc  The CFAllocator which should be used to allocate
     *               memory for the array and its storage for values. This
     *               parameter may be NULL in which case the current default
     *               CFAllocator is used. If this reference is not a valid
     *               CFAllocator, the behavior is undefined.
     * @param theSet The CFCharacterSet which is to be used create the
     *               bitmap representation from. Refer to the comments for
     *               CFCharacterSetCreateWithBitmapRepresentation for the
     *               detailed discussion of the bitmap representation format.
     *               If this parameter is not a valid CFCharacterSet, the
     *               behavior is undefined.
     * @return A reference to the new immutable CFData.
     */
    @Generated
    @CFunction
    public static native CFDataRef CFCharacterSetCreateBitmapRepresentation(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * [@function] CFCharacterSetAddCharactersInRange
     * Adds the given range to the charaacter set.
     * 
     * @param theSet   The character set to which the range is to be added.
     *                 If this parameter is not a valid mutable CFCharacterSet,
     *                 the behavior is undefined.
     * @param theRange The range to add to the character set. It accepts
     *                 the range in 32-bit in the UTF-32 format. The valid
     *                 character point range is from 0x00000 to 0x10FFFF. If the
     *                 range is outside of the valid Unicode character point,
     *                 the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    /**
     * [@function] CFCharacterSetRemoveCharactersInRange
     * Removes the given range from the charaacter set.
     * 
     * @param theSet   The character set from which the range is to be
     *                 removed. If this parameter is not a valid mutable
     *                 CFCharacterSet, the behavior is undefined.
     * @param theRange The range to remove from the character set.
     *                 It accepts the range in 32-bit in the UTF-32 format.
     *                 The valid character point range is from 0x00000 to 0x10FFFF.
     *                 If the range is outside of the valid Unicode character point,
     *                 the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    /**
     * [@function] CFCharacterSetAddCharactersInString
     * Adds the characters in the given string to the charaacter set.
     * 
     * @param theSet    The character set to which the characters in the
     *                  string are to be added. If this parameter is not a
     *                  valid mutable CFCharacterSet, the behavior is undefined.
     * @param theString The string to add to the character set.
     *                  If this parameter is not a valid CFString, the behavior
     *                  is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    /**
     * [@function] CFCharacterSetRemoveCharactersInString
     * Removes the characters in the given string from the charaacter set.
     * 
     * @param theSet    The character set from which the characters in the
     *                  string are to be remove. If this parameter is not a
     *                  valid mutable CFCharacterSet, the behavior is undefined.
     * @param theString The string to remove from the character set.
     *                  If this parameter is not a valid CFString, the behavior
     *                  is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    /**
     * [@function] CFCharacterSetUnion
     * Forms the union with the given character set.
     * 
     * @param theSet      The destination character set into which the
     *                    union of the two character sets is stored. If this
     *                    parameter is not a valid mutable CFCharacterSet, the
     *                    behavior is undefined.
     * @param theOtherSet The character set with which the union is
     *                    formed. If this parameter is not a valid CFCharacterSet,
     *                    the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetUnion(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    /**
     * [@function] CFCharacterSetIntersect
     * Forms the intersection with the given character set.
     * 
     * @param theSet      The destination character set into which the
     *                    intersection of the two character sets is stored.
     *                    If this parameter is not a valid mutable CFCharacterSet,
     *                    the behavior is undefined.
     * @param theOtherSet The character set with which the intersection
     *                    is formed. If this parameter is not a valid CFCharacterSet,
     *                    the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetIntersect(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    /**
     * [@function] CFCharacterSetInvert
     * Inverts the content of the given character set.
     * 
     * @param theSet The character set to be inverted.
     *               If this parameter is not a valid mutable CFCharacterSet,
     *               the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetInvert(CFMutableCharacterSetRef theSet);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNotificationCenterGetTypeID();

    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetLocalCenter();

    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetDarwinNotifyCenter();

    /**
     * The Darwin Notify Center is based on the <notify.h> API.
     * For this center, there are limitations in the API. There are no notification "objects",
     * "userInfo" cannot be passed in the notification, and there are no suspension behaviors
     * (always "deliver immediately"). Other limitations in the <notify.h> API as described in
     * that header will also apply.
     * - In the CFNotificationCallback, the 'object' and 'userInfo' parameters must be ignored.
     * - CFNotificationCenterAddObserver(): the 'object' and 'suspensionBehavior' arguments are ignored.
     * - CFNotificationCenterAddObserver(): the 'name' argument may not be NULL (for this center).
     * - CFNotificationCenterRemoveObserver(): the 'object' argument is ignored.
     * - CFNotificationCenterPostNotification(): the 'object', 'userInfo', and 'deliverImmediately' arguments are
     * ignored.
     * - CFNotificationCenterPostNotificationWithOptions(): the 'object', 'userInfo', and 'options' arguments are
     * ignored.
     * The Darwin Notify Center has no notion of per-user sessions, all notifications are system-wide.
     * As with distributed notifications, the main thread's run loop must be running in one of the
     * common modes (usually kCFRunLoopDefaultMode) for Darwin-style notifications to be delivered.
     * NOTE: NULL or 0 should be passed for all ignored arguments to ensure future compatibility.
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterAddObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            @FunctionPtr(name = "call_CFNotificationCenterAddObserver") Function_CFNotificationCenterAddObserver callBack,
            CFStringRef name, ConstVoidPtr object, @NInt long suspensionBehavior);

    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            CFStringRef name, ConstVoidPtr object);

    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveEveryObserver(CFNotificationCenterRef center,
            ConstVoidPtr observer);

    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotification(CFNotificationCenterRef center, CFStringRef name,
            ConstVoidPtr object, CFDictionaryRef userInfo, byte deliverImmediately);

    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotificationWithOptions(CFNotificationCenterRef center,
            CFStringRef name, ConstVoidPtr object, CFDictionaryRef userInfo, @NUInt long options);

    @Generated
    @CFunction
    @NUInt
    public static native long CFLocaleGetTypeID();

    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleGetSystem();

    /**
     * Returns the "root", canonical locale. Contains fixed "backstop" settings.
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCopyCurrent();

    /**
     * Returns the logical "user" locale for the current user.
     * [This is Copy in the sense that you get a retain you have to release,
     * but we may return the same cached object over and over.] Settings
     * you get from this locale do not change under you as CFPreferences
     * are changed (for safety and correctness). Generally you would not
     * grab this and hold onto it forever, but use it to do the operations
     * you need to do at the moment, then throw it away. (The non-changing
     * ensures that all the results of your operations are consistent.)
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyAvailableLocaleIdentifiers();

    /**
     * Returns an array of CFStrings that represents all locales for
     * which locale data is available.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOLanguageCodes();

    /**
     * Returns an array of CFStrings that represents all known legal ISO
     * language codes. Note: many of these will not have any supporting
     * locale data in Mac OS X.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCountryCodes();

    /**
     * Returns an array of CFStrings that represents all known legal ISO
     * country codes. Note: many of these will not have any supporting
     * locale data in Mac OS X.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCurrencyCodes();

    /**
     * Returns an array of CFStrings that represents all known legal ISO
     * currency codes. Note: some of these currencies may be obsolete, or
     * represent other financial instruments.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyCommonISOCurrencyCodes();

    /**
     * Returns an array of CFStrings that represents ISO currency codes for
     * currencies in common use.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyPreferredLanguages();

    /**
     * Returns the array of canonicalized CFString locale IDs that the user prefers.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLanguageIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    /**
     * Map an arbitrary language identification string (something close at
     * least) to a canonical language identifier.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    /**
     * Map an arbitrary locale identification string (something close at
     * least) to the canonical identifier.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes(
            CFAllocatorRef allocator, short lcode, short rcode);

    /**
     * Map a Mac OS LangCode and RegionCode to the canonical locale identifier.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode(CFAllocatorRef allocator,
            int lcid);

    /**
     * Map a Windows LCID to the canonical locale identifier.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native int CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier(CFStringRef localeIdentifier);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageCharacterDirection(CFStringRef isoLangCode);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageLineDirection(CFStringRef isoLangCode);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFLocaleCreateComponentsFromLocaleIdentifier(CFAllocatorRef allocator,
            CFStringRef localeID);

    /**
     * Parses a locale ID consisting of language, script, country, variant,
     * and keyword/value pairs into a dictionary. The keys are the constant
     * CFStrings corresponding to the locale ID components, and the values
     * will correspond to constants where available.
     * Example: "en_US@calendar=japanese" yields a dictionary with three
     * entries: kCFLocaleLanguageCode=en, kCFLocaleCountryCode=US, and
     * kCFLocaleCalendarIdentifier=kCFJapaneseCalendar.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromComponents(CFAllocatorRef allocator,
            CFDictionaryRef dictionary);

    /**
     * Reverses the actions of CFLocaleCreateDictionaryFromLocaleIdentifier,
     * creating a single string from the data in the dictionary. The
     * dictionary {kCFLocaleLanguageCode=en, kCFLocaleCountryCode=US,
     * kCFLocaleCalendarIdentifier=kCFJapaneseCalendar} becomes
     * "en_US@calendar=japanese".
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreate(CFAllocatorRef allocator, CFStringRef localeIdentifier);

    /**
     * Returns a CFLocaleRef for the locale named by the "arbitrary" locale identifier.
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreateCopy(CFAllocatorRef allocator, CFLocaleRef locale);

    /**
     * Having gotten a CFLocale from somebody, code should make a copy
     * if it is going to use it for several operations
     * or hold onto it. In the future, there may be mutable locales.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleGetIdentifier(CFLocaleRef locale);

    /**
     * Returns the locale's identifier. This may not be the same string
     * that the locale was created with (CFLocale may canonicalize it).
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFLocaleGetValue(CFLocaleRef locale, CFStringRef key);

    /**
     * Returns the value for the given key. This is how settings and state
     * are accessed via a CFLocale. Values might be of any CF type.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCopyDisplayNameForPropertyValue(CFLocaleRef displayLocale, CFStringRef key,
            CFStringRef value);

    /**
     * CFString type ID
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringGetTypeID();

    /**
     * The following four functions copy the provided buffer into CFString's internal storage.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    /**
     * The following takes an explicit length, and allows you to specify whether the data is an external format --- that
     * is, whether to pay attention to the BOM character (if any) and do byte swapping if necessary
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars);

    /**
     * These functions try not to copy the provided buffer. The buffer will be deallocated
     * with the provided contentsDeallocator when it's no longer needed; to not free
     * the buffer, specify kCFAllocatorNull here. As usual, NULL means default allocator.
     * 
     * NOTE: Do not count on these buffers as being used by the string;
     * in some cases the CFString might free the buffer and use something else
     * (for instance if it decides to always use Unicode encoding internally).
     * 
     * NOTE: If you are not transferring ownership of the buffer to the CFString
     * (for instance, you supplied contentsDeallocator = kCFAllocatorNull), it is your
     * responsibility to assure the buffer does not go away during the lifetime of the string.
     * If the string is retained or copied, its lifetime might extend in ways you cannot
     * predict. So, for strings created with buffers whose lifetimes you cannot
     * guarantee, you need to be extremely careful --- do not hand it out to any
     * APIs which might retain or copy the strings.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    /**
     * The following takes an explicit length, and allows you to specify whether the data is an external format --- that
     * is, whether to pay attention to the BOM character (if any) and do byte swapping if necessary
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharactersNoCopy(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars, CFAllocatorRef contentsDeallocator);

    /**
     * Create copies of part or all of the string.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithSubstring(CFAllocatorRef alloc, CFStringRef str,
            @ByValue CFRange range);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateCopy(CFAllocatorRef alloc, CFStringRef theString);

    /**
     * These functions create a CFString from the provided printf-like format string and arguments.
     */
    @Generated
    @Variadic()
    @CFunction
    public static native CFStringRef CFStringCreateWithFormat(CFAllocatorRef alloc, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFormatAndArguments(CFAllocatorRef alloc,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    /**
     * Functions to create mutable strings. "maxLength", if not 0, is a hard bound on the length of the string. If 0,
     * there is no limit on the length.
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutable(CFAllocatorRef alloc, @NInt long maxLength);

    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableCopy(CFAllocatorRef alloc, @NInt long maxLength,
            CFStringRef theString);

    /**
     * This function creates a mutable string that has a developer supplied and directly editable backing store.
     * The string will be manipulated within the provided buffer (if any) until it outgrows capacity; then the
     * externalCharactersAllocator will be consulted for more memory. When the CFString is deallocated, the
     * buffer will be freed with the externalCharactersAllocator. If you provide kCFAllocatorNull here, and the buffer
     * needs to grow, then CFString will switch to using the default allocator. See comments at top of this file for
     * more info.
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableWithExternalCharactersNoCopy(CFAllocatorRef alloc,
            CharPtr chars, @NInt long numChars, @NInt long capacity, CFAllocatorRef externalCharactersAllocator);

    /**
     * Number of 16-bit Unicode characters in the string.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetLength(CFStringRef theString);

    /**
     * Extracting the contents of the string. For obtaining multiple characters, calling
     * CFStringGetCharacters() is more efficient than multiple calls to CFStringGetCharacterAtIndex().
     * If the length of the string is not known (so you can't use a fixed size buffer for CFStringGetCharacters()),
     * another method is to use is CFStringGetCharacterFromInlineBuffer() (see further below).
     */
    @Generated
    @CFunction
    public static native char CFStringGetCharacterAtIndex(CFStringRef theString, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFStringGetCharacters(CFStringRef theString, @ByValue CFRange range, CharPtr buffer);

    /**
     * These two convert into the provided buffer; they return false if conversion isn't possible
     * (due to conversion error, or not enough space in the provided buffer).
     * These functions do zero-terminate or put the length byte; the provided bufferSize should include
     * space for this (so pass 256 for Str255). More sophisticated usages can go through CFStringGetBytes().
     * These functions are equivalent to calling CFStringGetBytes() with
     * the range of the string; lossByte = 0; and isExternalRepresentation = false;
     * if successful, they then insert the leading length or terminating zero, as desired.
     */
    @Generated
    @CFunction
    public static native byte CFStringGetPascalString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    @Generated
    @CFunction
    public static native byte CFStringGetCString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    /**
     * These functions attempt to return in O(1) time the desired format for the string.
     * Note that although this means a pointer to the internal structure is being returned,
     * this can't always be counted on. Please see note at the top of the file for more
     * details.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetPascalStringPtr(CFStringRef theString, int encoding);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetCStringPtr(CFStringRef theString, int encoding);

    @Generated
    @CFunction
    public static native ConstCharPtr CFStringGetCharactersPtr(CFStringRef theString);

    /**
     * The primitive conversion routine; allows you to convert a string piece at a time
     * into a fixed size buffer. Returns number of characters converted.
     * Characters that cannot be converted to the specified encoding are represented
     * with the byte specified by lossByte; if lossByte is 0, then lossy conversion
     * is not allowed and conversion stops, returning partial results.
     * Pass buffer==NULL if you don't care about the converted string (but just the convertability,
     * or number of bytes required).
     * maxBufLength indicates the maximum number of bytes to generate. It is ignored when buffer==NULL.
     * Does not zero-terminate. If you want to create Pascal or C string, allow one extra byte at start or end.
     * Setting isExternalRepresentation causes any extra bytes that would allow
     * the data to be made persistent to be included; for instance, the Unicode BOM. Note that
     * CFString prepends UTF encoded data with the Unicode BOM <http://www.unicode.org/faq/utf_bom.html>
     * when generating external representation if the target encoding allows. It's important to note that
     * only UTF-8, UTF-16, and UTF-32 define the handling of the byte order mark character, and the "LE"
     * and "BE" variants of UTF-16 and UTF-32 don't.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetBytes(CFStringRef theString, @ByValue CFRange range, int encoding,
            byte lossByte, byte isExternalRepresentation, BytePtr buffer, @NInt long maxBufLen, NIntPtr usedBufLen);

    /**
     * Convenience functions String <-> Data. These generate "external" formats, that is, formats that
     * can be written out to disk. For instance, if the encoding is Unicode,
     * CFStringCreateFromExternalRepresentation() pays attention to the BOM character (if any)
     * and does byte swapping if necessary. Similarly CFStringCreateExternalRepresentation() will
     * include a BOM character if appropriate. See CFStringGetBytes() for more on this and lossByte.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateFromExternalRepresentation(CFAllocatorRef alloc, CFDataRef data,
            int encoding);

    @Generated
    @CFunction
    public static native CFDataRef CFStringCreateExternalRepresentation(CFAllocatorRef alloc, CFStringRef theString,
            int encoding, byte lossByte);

    /**
     * Hints about the contents of a string
     */
    @Generated
    @CFunction
    public static native int CFStringGetSmallestEncoding(CFStringRef theString);

    @Generated
    @CFunction
    public static native int CFStringGetFastestEncoding(CFStringRef theString);

    /**
     * General encoding info
     */
    @Generated
    @CFunction
    public static native int CFStringGetSystemEncoding();

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeForEncoding(@NInt long length, int encoding);

    /**
     * Extract the contents of the string as a NULL-terminated 8-bit string appropriate for passing to POSIX APIs (for
     * example, normalized for HFS+). The string is zero-terminated. false will be returned if the conversion results
     * don't fit into the buffer. Use CFStringGetMaximumSizeOfFileSystemRepresentation() if you want to make sure the
     * buffer is of sufficient length.
     */
    @Generated
    @CFunction
    public static native byte CFStringGetFileSystemRepresentation(CFStringRef string, BytePtr buffer,
            @NInt long maxBufLen);

    /**
     * Get the upper bound on the number of bytes required to hold the file system representation for the string. This
     * result is returned quickly as a very rough approximation, and could be much larger than the actual space
     * required. The result includes space for the zero termination. If you are allocating a buffer for long-term
     * keeping, it's recommended that you reallocate it smaller (to be the right size) after calling
     * CFStringGetFileSystemRepresentation().
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeOfFileSystemRepresentation(CFStringRef string);

    /**
     * Create a CFString from the specified zero-terminated POSIX file system representation. If the conversion fails
     * (possible due to bytes in the buffer not being a valid sequence of bytes for the appropriate character encoding),
     * NULL is returned.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFileSystemRepresentation(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer);

    /**
     * The main comparison routine; compares specified range of the first string to (the full range of) the second
     * string.
     * locale == NULL indicates canonical locale (the return value from CFLocaleGetSystem()).
     * kCFCompareNumerically, added in 10.2, does not work if kCFCompareLocalized is specified on systems before 10.3
     * kCFCompareBackwards and kCFCompareAnchored are not applicable.
     * rangeToCompare applies to the first string; that is, only the substring of theString1 specified by rangeToCompare
     * is compared against all of theString2.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptionsAndLocale(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions, CFLocaleRef locale);

    /**
     * Comparison convenience. Uses the current user locale (the return value from CFLocaleCopyCurrent()) if
     * kCFCompareLocalized. Refer to CFStringCompareWithOptionsAndLocale() for more info.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptions(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions);

    /**
     * Comparison convenience suitable for passing as sorting functions.
     * kCFCompareNumerically, added in 10.2, does not work if kCFCompareLocalized is specified on systems before 10.3
     * kCFCompareBackwards and kCFCompareAnchored are not applicable.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompare(CFStringRef theString1, CFStringRef theString2,
            @NUInt long compareOptions);

    /**
     * CFStringFindWithOptionsAndLocale() returns the found range in the CFRange * argument; you can pass NULL for
     * simple discovery check.
     * locale == NULL indicates canonical locale (the return value from CFLocaleGetSystem()).
     * If stringToFind is the empty string (zero length), nothing is found.
     * Ignores the kCFCompareNumerically option.
     * Only the substring of theString specified by rangeToSearch is searched for stringToFind.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte CFStringFindWithOptionsAndLocale(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions, CFLocaleRef locale,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * Find convenience. Uses the current user locale (the return value from CFLocaleCopyCurrent()) if
     * kCFCompareLocalized. Refer to CFStringFindWithOptionsAndLocale() for more info.
     */
    @Generated
    @CFunction
    public static native byte CFStringFindWithOptions(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * CFStringCreateArrayWithFindResults() returns an array of CFRange pointers, or NULL if there are no matches.
     * Overlapping instances are not found; so looking for "AA" in "AAA" finds just one range.
     * Post 10.1: If kCFCompareBackwards is provided, the scan is done from the end (which can give a different result),
     * and
     * the results are stored in the array backwards (last found range in slot 0).
     * If stringToFind is the empty string (zero length), nothing is found.
     * kCFCompareAnchored causes just the consecutive instances at start (or end, if kCFCompareBackwards) to be
     * reported. So, searching for "AB" in "ABABXAB..." you just get the first two occurrences.
     * Ignores the kCFCompareNumerically option.
     * Only the substring of theString specified by rangeToSearch is searched for stringToFind.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayWithFindResults(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef stringToFind, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    /**
     * Find conveniences; see comments above concerning empty string and options.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringFind(CFStringRef theString, CFStringRef stringToFind,
            @NUInt long compareOptions);

    @Generated
    @CFunction
    public static native byte CFStringHasPrefix(CFStringRef theString, CFStringRef prefix);

    @Generated
    @CFunction
    public static native byte CFStringHasSuffix(CFStringRef theString, CFStringRef suffix);

    /**
     * [@function] CFStringGetRangeOfComposedCharactersAtIndex
     * Returns the range of the composed character sequence at the specified index.
     * 
     * @param theString The CFString which is to be searched. If this
     *                  parameter is not a valid CFString, the behavior is
     *                  undefined.
     * @param theIndex  The index of the character contained in the
     *                  composed character sequence. If the index is
     *                  outside the index space of the string (0 to N-1 inclusive,
     *                  where N is the length of the string), the behavior is
     *                  undefined.
     * @return The range of the composed character sequence.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringGetRangeOfComposedCharactersAtIndex(CFStringRef theString,
            @NInt long theIndex);

    /**
     * [@function] CFStringFindCharacterFromSet
     * Query the range of the first character contained in the specified character set.
     * 
     * @param theString     The CFString which is to be searched. If this
     *                      parameter is not a valid CFString, the behavior is
     *                      undefined.
     * @param theSet        The CFCharacterSet against which the membership
     *                      of characters is checked. If this parameter is not a valid
     *                      CFCharacterSet, the behavior is undefined.
     * @param rangeToSearch The range of characters within the string to search. If
     *                      the range location or end point (defined by the location
     *                      plus length minus 1) are outside the index space of the
     *                      string (0 to N-1 inclusive, where N is the length of the
     *                      string), the behavior is undefined. If the range length is
     *                      negative, the behavior is undefined. The range may be empty
     *                      (length 0), in which case no search is performed.
     * @param searchOptions The bitwise-or'ed option flags to control
     *                      the search behavior. The supported options are
     *                      kCFCompareBackwards andkCFCompareAnchored.
     *                      If other option flags are specified, the behavior
     *                      is undefined.
     * @param result        The pointer to a CFRange supplied by the caller in
     *                      which the search result is stored. Note that the length
     *                      of this range can be more than 1, if for instance the
     *                      result is a composed character. If a pointer to an invalid
     *                      memory is specified, the behavior is undefined.
     * @return true, if at least a character which is a member of the character
     *         set is found and result is filled, otherwise, false.
     */
    @Generated
    @CFunction
    public static native byte CFStringFindCharacterFromSet(CFStringRef theString, CFCharacterSetRef theSet,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * Find range of bounds of the line(s) that span the indicated range (startIndex, numChars),
     * taking into account various possible line separator sequences (CR, CRLF, LF, and Unicode NextLine, LineSeparator,
     * ParagraphSeparator).
     * All return values are "optional" (provide NULL if you don't want them)
     * lineBeginIndex: index of first character in line
     * lineEndIndex: index of first character of the next line (including terminating line separator characters)
     * contentsEndIndex: index of the first line separator character
     * Thus, lineEndIndex - lineBeginIndex is the number of chars in the line, including the line separators
     * contentsEndIndex - lineBeginIndex is the number of chars in the line w/out the line separators
     */
    @Generated
    @CFunction
    public static native void CFStringGetLineBounds(CFStringRef theString, @ByValue CFRange range,
            NIntPtr lineBeginIndex, NIntPtr lineEndIndex, NIntPtr contentsEndIndex);

    /**
     * Same as CFStringGetLineBounds(), however, will only look for paragraphs. Won't stop at Unicode NextLine or
     * LineSeparator characters.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFStringGetParagraphBounds(CFStringRef string, @ByValue CFRange range,
            NIntPtr parBeginIndex, NIntPtr parEndIndex, NIntPtr contentsEndIndex);

    /**
     * [@function] CFStringGetHyphenationLocationBeforeIndex
     * Retrieve the first potential hyphenation location found before the specified location.
     * 
     * @param string     The CFString which is to be hyphenated. If this
     *                   parameter is not a valid CFString, the behavior is
     *                   undefined.
     * @param location   An index in the string. If a valid hyphen index is returned, it
     *                   will be before this index.
     * @param limitRange The range of characters within the string to search. If
     *                   the range location or end point (defined by the location
     *                   plus length minus 1) are outside the index space of the
     *                   string (0 to N-1 inclusive, where N is the length of the
     *                   string), the behavior is undefined. If the range length is
     *                   negative, the behavior is undefined. The range may be empty
     *                   (length 0), in which case no hyphen location is generated.
     * @param options    Reserved for future use.
     * @param locale     Specifies which language's hyphenation conventions to use.
     *                   This must be a valid locale. Hyphenation data is not available
     *                   for all locales. You can use CFStringIsHyphenationAvailableForLocale
     *                   to test for availability of hyphenation data.
     * @param character  The suggested hyphen character to insert. Pass NULL if you
     *                   do not need this information.
     * @return an index in the string where it is appropriate to insert a hyphen, if
     *         one exists; else kCFNotFound
     * 
     *         API-Since: 4.2
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetHyphenationLocationBeforeIndex(CFStringRef string, @NInt long location,
            @ByValue CFRange limitRange, @NUInt long options, CFLocaleRef locale, IntPtr character);

    /**
     * API-Since: 4.3
     */
    @Generated
    @CFunction
    public static native byte CFStringIsHyphenationAvailableForLocale(CFLocaleRef locale);

    /**
     * Exploding and joining strings with a separator string **
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateByCombiningStrings(CFAllocatorRef alloc, CFArrayRef theArray,
            CFStringRef separatorString);

    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayBySeparatingStrings(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef separatorString);

    /**
     * Parsing non-localized numbers from strings **
     */
    @Generated
    @CFunction
    public static native int CFStringGetIntValue(CFStringRef str);

    @Generated
    @CFunction
    public static native double CFStringGetDoubleValue(CFStringRef str);

    /**
     * CFStringAppend("abcdef", "xxxxx") -> "abcdefxxxxx"
     * CFStringDelete("abcdef", CFRangeMake(2, 3)) -> "abf"
     * CFStringReplace("abcdef", CFRangeMake(2, 3), "xxxxx") -> "abxxxxxf"
     * CFStringReplaceAll("abcdef", "xxxxx") -> "xxxxx"
     */
    @Generated
    @CFunction
    public static native void CFStringAppend(CFMutableStringRef theString, CFStringRef appendedString);

    @Generated
    @CFunction
    public static native void CFStringAppendCharacters(CFMutableStringRef theString, ConstCharPtr chars,
            @NInt long numChars);

    @Generated
    @CFunction
    public static native void CFStringAppendPascalString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    @Generated
    @CFunction
    public static native void CFStringAppendCString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    @Generated
    @Variadic()
    @CFunction
    public static native void CFStringAppendFormat(CFMutableStringRef theString, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    @Generated
    @CFunction
    public static native void CFStringAppendFormatAndArguments(CFMutableStringRef theString,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    @Generated
    @CFunction
    public static native void CFStringInsert(CFMutableStringRef str, @NInt long idx, CFStringRef insertedStr);

    @Generated
    @CFunction
    public static native void CFStringDelete(CFMutableStringRef theString, @ByValue CFRange range);

    @Generated
    @CFunction
    public static native void CFStringReplace(CFMutableStringRef theString, @ByValue CFRange range,
            CFStringRef replacement);

    @Generated
    @CFunction
    public static native void CFStringReplaceAll(CFMutableStringRef theString, CFStringRef replacement);

    /**
     * Replace all occurrences of target in rangeToSearch of theString with replacement.
     * Pays attention to kCFCompareCaseInsensitive, kCFCompareBackwards, kCFCompareNonliteral, and kCFCompareAnchored.
     * kCFCompareBackwards can be used to do the replacement starting from the end, which could give a different result.
     * ex. AAAAA, replace AA with B -> BBA or ABB; latter if kCFCompareBackwards
     * kCFCompareAnchored assures only anchored but multiple instances are found (the instances must be consecutive at
     * start or end)
     * ex. AAXAA, replace A with B -> BBXBB or BBXAA; latter if kCFCompareAnchored
     * Returns number of replacements performed.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringFindAndReplace(CFMutableStringRef theString, CFStringRef stringToFind,
            CFStringRef replacementString, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    /**
     * This function will make the contents of a mutable CFString point directly at the specified UniChar array.
     * It works only with CFStrings created with CFStringCreateMutableWithExternalCharactersNoCopy().
     * This function does not free the previous buffer.
     * The string will be manipulated within the provided buffer (if any) until it outgrows capacity; then the
     * externalCharactersAllocator will be consulted for more memory.
     * See comments at the top of this file for more info.
     */
    @Generated
    @CFunction
    public static native void CFStringSetExternalCharactersNoCopy(CFMutableStringRef theString, CharPtr chars,
            @NInt long length, @NInt long capacity);

    /**
     * CFStringPad() will pad or cut down a string to the specified size.
     * The pad string is used as the fill string; indexIntoPad specifies which character to start with.
     * CFStringPad("abc", " ", 9, 0) -> "abc "
     * CFStringPad("abc", ". ", 9, 1) -> "abc . . ."
     * CFStringPad("abcdef", ?, 3, ?) -> "abc"
     * 
     * CFStringTrim() will trim the specified string from both ends of the string.
     * CFStringTrimWhitespace() will do the same with white space characters (tab, newline, etc)
     * CFStringTrim(" abc ", " ") -> "abc"
     * CFStringTrim("* * * *abc * ", "* ") -> "*abc "
     */
    @Generated
    @CFunction
    public static native void CFStringPad(CFMutableStringRef theString, CFStringRef padString, @NInt long length,
            @NInt long indexIntoPad);

    @Generated
    @CFunction
    public static native void CFStringTrim(CFMutableStringRef theString, CFStringRef trimString);

    @Generated
    @CFunction
    public static native void CFStringTrimWhitespace(CFMutableStringRef theString);

    @Generated
    @CFunction
    public static native void CFStringLowercase(CFMutableStringRef theString, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringUppercase(CFMutableStringRef theString, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringCapitalize(CFMutableStringRef theString, CFLocaleRef locale);

    /**
     * [@function] CFStringNormalize
     * Normalizes the string into the specified form as described in
     * Unicode Technical Report #15.
     * 
     * @param theString The string which is to be normalized. If this
     *                  parameter is not a valid mutable CFString, the behavior is
     *                  undefined.
     * @param theForm   The form into which the string is to be normalized.
     *                  If this parameter is not a valid CFStringNormalizationForm value,
     *                  the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFStringNormalize(CFMutableStringRef theString, @NInt long theForm);

    /**
     * [@function] CFStringFold
     * Folds the string into the form specified by the flags.
     * Character foldings are operations that convert any of a set of characters
     * sharing similar semantics into a single representative from that set.
     * This function can be used to preprocess strings that are to be compared,
     * searched, or indexed.
     * Note that folding does not include normalization, so it is necessary
     * to use CFStringNormalize in addition to CFStringFold in order to obtain
     * the effect of kCFCompareNonliteral.
     * 
     * @param theString The string which is to be folded. If this parameter is not
     *                  a valid mutable CFString, the behavior is undefined.
     * @param theFlags  The equivalency flags which describes the character folding form.
     *                  Only those flags containing the word "insensitive" are recognized here; other flags are ignored.
     *                  Folding with kCFCompareCaseInsensitive removes case distinctions in accordance with the mapping
     *                  specified by ftp://ftp.unicode.org/Public/UNIDATA/CaseFolding.txt. Folding with
     *                  kCFCompareDiacriticInsensitive removes distinctions of accents and other diacritics. Folding
     *                  with kCFCompareWidthInsensitive removes character width distinctions by mapping characters in
     *                  the range U+FF00-U+FFEF to their ordinary equivalents.
     * @param theLocale The locale tailoring the character folding behavior. If NULL,
     *                  it's considered to be the system locale returned from CFLocaleGetSystem().
     *                  If non-NULL and not a valid CFLocale object, the behavior is undefined.
     * 
     *                  API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFStringFold(CFMutableStringRef theString, @NUInt long theFlags, CFLocaleRef theLocale);

    /**
     * Perform string transliteration. The transformation represented by transform is applied to the given range of
     * string, modifying it in place. Only the specified range will be modified, but the transform may look at portions
     * of the string outside that range for context. NULL range pointer causes the whole string to be transformed. On
     * return, range is modified to reflect the new range corresponding to the original range. reverse indicates that
     * the inverse transform should be used instead, if it exists. If the transform is successful, true is returned; if
     * unsuccessful, false. Reasons for the transform being unsuccessful include an invalid transform identifier, or
     * attempting to reverse an irreversible transform.
     * 
     * You can pass one of the predefined transforms below, or any valid ICU transform ID as defined in the ICU User
     * Guide. Note that we do not support arbitrary set of ICU transform rules.
     */
    @Generated
    @CFunction
    public static native byte CFStringTransform(CFMutableStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange range, CFStringRef transform,
            byte reverse);

    /**
     * This returns availability of the encoding on the system
     */
    @Generated
    @CFunction
    public static native byte CFStringIsEncodingAvailable(int encoding);

    /**
     * This function returns list of available encodings. The returned list is terminated with
     * kCFStringEncodingInvalidId and owned by the system.
     */
    @Generated
    @CFunction
    public static native ConstIntPtr CFStringGetListOfAvailableEncodings();

    /**
     * Returns name of the encoding; non-localized.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringGetNameOfEncoding(int encoding);

    /**
     * ID mapping functions from/to Cocoa NSStringEncoding. Returns kCFStringEncodingInvalidId if no mapping exists.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringConvertEncodingToNSStringEncoding(int encoding);

    @Generated
    @CFunction
    public static native int CFStringConvertNSStringEncodingToEncoding(@NUInt long encoding);

    /**
     * ID mapping functions from/to Microsoft Windows codepage (covers both OEM & ANSI). Returns
     * kCFStringEncodingInvalidId if no mapping exists.
     */
    @Generated
    @CFunction
    public static native int CFStringConvertEncodingToWindowsCodepage(int encoding);

    @Generated
    @CFunction
    public static native int CFStringConvertWindowsCodepageToEncoding(int codepage);

    /**
     * ID mapping functions from/to IANA registery charset names. Returns kCFStringEncodingInvalidId if no mapping
     * exists.
     */
    @Generated
    @CFunction
    public static native int CFStringConvertIANACharSetNameToEncoding(CFStringRef theString);

    @Generated
    @CFunction
    public static native CFStringRef CFStringConvertEncodingToIANACharSetName(int encoding);

    /**
     * Returns the most compatible MacOS script value for the input encoding
     * i.e. kCFStringEncodingMacRoman -> kCFStringEncodingMacRoman
     * kCFStringEncodingWindowsLatin1 -> kCFStringEncodingMacRoman
     * kCFStringEncodingISO_2022_JP -> kCFStringEncodingMacJapanese
     */
    @Generated
    @CFunction
    public static native int CFStringGetMostCompatibleMacStringEncoding(int encoding);

    @Generated
    @Inline
    @CFunction
    public static native void CFStringInitInlineBuffer(CFStringRef str,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @ByValue CFRange range);

    @Generated
    @Inline
    @CFunction
    public static native char CFStringGetCharacterFromInlineBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @NInt long idx);

    /**
     * UTF-16 surrogate support
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateHighCharacter(char character);

    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateLowCharacter(char character);

    @Generated
    @Inline
    @CFunction
    public static native int CFStringGetLongCharacterForSurrogatePair(char surrogateHigh, char surrogateLow);

    /**
     * Maps a UTF-32 character to a pair of UTF-16 surrogate characters. The buffer pointed by surrogates has to have
     * space for at least 2 UTF-16 characters. Returns true if mapped to a surrogate pair.
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CFStringGetSurrogatePairForLongCharacter(int character, CharPtr surrogates);

    /**
     * Rest of the stuff in this file is private and should not be used directly
     * For debugging only; output goes to stderr
     * Use CFShow() to printf the description of any CFType;
     * Use CFShowStr() to printf detailed info about a CFString
     */
    @Generated
    @CFunction
    public static native void CFShow(ConstVoidPtr obj);

    @Generated
    @CFunction
    public static native void CFShowStr(CFStringRef str);

    /**
     * This function is private and should not be used directly
     */
    @Generated
    @CFunction
    public static native CFStringRef __CFStringMakeConstantString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr);

    /**
     * [@function] CFErrorGetTypeID
     * Returns the type identifier of all CFError instances.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFErrorGetTypeID();

    /**
     * [@function] CFErrorCreate
     * 
     * Creates a new CFError.
     * 
     * @param allocator The CFAllocator which should be used to allocate memory for the error. This parameter may be
     *                  NULL in which case the
     *                  current default CFAllocator is used. If this reference is not a valid CFAllocator, the behavior
     *                  is undefined.
     * @param domain    A CFString identifying the error domain. If this reference is NULL or is otherwise not a valid
     *                  CFString, the behavior is undefined.
     * @param code      A CFIndex identifying the error code. The code is interpreted within the context of the error
     *                  domain.
     * @param userInfo  A CFDictionary created with kCFCopyStringDictionaryKeyCallBacks and
     *                  kCFTypeDictionaryValueCallBacks. It will be copied with CFDictionaryCreateCopy().
     *                  If no userInfo dictionary is desired, NULL may be passed in as a convenience, in which case an
     *                  empty userInfo dictionary will be assigned.
     * @return A reference to the new CFError.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreate(CFAllocatorRef allocator, CFStringRef domain, @NInt long code,
            CFDictionaryRef userInfo);

    /**
     * [@function] CFErrorCreateWithUserInfoKeysAndValues
     * 
     * Creates a new CFError without having to create an intermediate userInfo dictionary.
     * 
     * @param allocator         The CFAllocator which should be used to allocate memory for the error. This parameter
     *                          may be NULL in which case the
     *                          current default CFAllocator is used. If this reference is not a valid CFAllocator, the
     *                          behavior is undefined.
     * @param domain            A CFString identifying the error domain. If this reference is NULL or is otherwise not a
     *                          valid CFString, the behavior is undefined.
     * @param code              A CFIndex identifying the error code. The code is interpreted within the context of the
     *                          error domain.
     * @param userInfoKeys      An array of numUserInfoValues CFStrings used as keys in creating the userInfo
     *                          dictionary. NULL is valid only if numUserInfoValues is 0.
     * @param userInfoValues    An array of numUserInfoValues CF types used as values in creating the userInfo
     *                          dictionary. NULL is valid only if numUserInfoValues is 0.
     * @param numUserInfoValues CFIndex representing the number of keys and values in the userInfoKeys and
     *                          userInfoValues arrays.
     * @return A reference to the new CFError. numUserInfoValues CF types are gathered from each of userInfoKeys and
     *         userInfoValues to create the userInfo dictionary.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreateWithUserInfoKeysAndValues(CFAllocatorRef allocator, CFStringRef domain,
            @NInt long code, ConstPtr<ConstVoidPtr> userInfoKeys, ConstPtr<ConstVoidPtr> userInfoValues,
            @NInt long numUserInfoValues);

    /**
     * [@function] CFErrorGetDomain
     * 
     * Returns the error domain the CFError was created with.
     * 
     * @param err The CFError whose error domain is to be returned. If this reference is not a valid CFError, the
     *            behavior is undefined.
     * @return The error domain of the CFError. Since this is a "Get" function, the caller shouldn't CFRelease the
     *         return value.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorGetDomain(CFErrorRef err);

    /**
     * [@function] CFErrorGetCode
     * 
     * Returns the error code the CFError was created with.
     * 
     * @param err The CFError whose error code is to be returned. If this reference is not a valid CFError, the behavior
     *            is undefined.
     * @return The error code of the CFError (not an error return for the current call).
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFErrorGetCode(CFErrorRef err);

    /**
     * [@function] CFErrorCopyUserInfo
     * 
     * Returns CFError userInfo dictionary.
     * 
     * Returns a dictionary containing the same keys and values as in the userInfo dictionary the CFError was created
     * with. Returns an empty dictionary if NULL was supplied to CFErrorCreate().
     * 
     * @param err The CFError whose error user info is to be returned. If this reference is not a valid CFError, the
     *            behavior is undefined.
     * @return The user info of the CFError.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFErrorCopyUserInfo(CFErrorRef err);

    /**
     * [@function] CFErrorCopyDescription
     * 
     * Returns a human-presentable description for the error. CFError creators should strive to make sure the return
     * value is human-presentable and localized by providing a value for kCFErrorLocalizedDescriptionKey at the time of
     * CFError creation.
     * 
     * This is a complete sentence or two which says what failed and why it failed. Please refer to header comments for
     * -[NSError localizedDescription] for details on the steps used to compute this; but roughly:
     * - Use value of kCFErrorLocalizedDescriptionKey as-is if provided.
     * - Use value of kCFErrorLocalizedFailureKey if provided, optionally followed by kCFErrorLocalizedFailureReasonKey
     * if available.
     * - Use value of kCFErrorLocalizedFailureReasonKey, combining with a generic failure message such as: "Operation
     * code not be completed. " + kCFErrorLocalizedFailureReasonKey.
     * - If all of the above fail, generate a semi-user presentable string from kCFErrorDescriptionKey, the domain, and
     * code. Something like: "Operation could not be completed. Error domain/code occurred. " or "Operation could not be
     * completed. " + kCFErrorDescriptionKey + " (Error domain/code)"
     * Toll-free bridged NSError instances might provide additional behaviors for manufacturing a description string. Do
     * not count on the exact contents or format of the returned string, it might change.
     * 
     * @param err The CFError whose description is to be returned. If this reference is not a valid CFError, the
     *            behavior is undefined.
     * @return A CFString with human-presentable description of the CFError. Never NULL.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyDescription(CFErrorRef err);

    /**
     * [@function] CFErrorCopyFailureReason
     * 
     * Returns a human-presentable failure reason for the error. May return NULL. CFError creators should strive to make
     * sure the return value is human-presentable and localized by providing a value for
     * kCFErrorLocalizedFailureReasonKey at the time of CFError creation.
     * 
     * This is a complete sentence which describes why the operation failed. In many cases this will be just the
     * "because" part of the description (but as a complete sentence, which makes localization easier). By default this
     * looks for kCFErrorLocalizedFailureReasonKey in the user info. Toll-free bridged NSError instances might provide
     * additional behaviors for manufacturing this value. If no user-presentable string is available, returns NULL.
     * Example Description: "Could not save file 'Letter' in folder 'Documents' because the volume 'MyDisk' doesn't have
     * enough space."
     * Corresponding FailureReason: "The volume 'MyDisk' doesn't have enough space."
     * 
     * @param err The CFError whose failure reason is to be returned. If this reference is not a valid CFError, the
     *            behavior is undefined.
     * @return A CFString with the localized, end-user presentable failure reason of the CFError, or NULL.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyFailureReason(CFErrorRef err);

    /**
     * [@function] CFErrorCopyRecoverySuggestion
     * 
     * Returns a human presentable recovery suggestion for the error. May return NULL. CFError creators should strive to
     * make sure the return value is human-presentable and localized by providing a value for
     * kCFErrorLocalizedRecoverySuggestionKey at the time of CFError creation.
     * 
     * This is the string that can be displayed as the "informative" (aka "secondary") message on an alert panel. By
     * default this looks for kCFErrorLocalizedRecoverySuggestionKey in the user info. Toll-free bridged NSError
     * instances might provide additional behaviors for manufacturing this value. If no user-presentable string is
     * available, returns NULL.
     * Example Description: "Could not save file 'Letter' in folder 'Documents' because the volume 'MyDisk' doesn't have
     * enough space."
     * Corresponding RecoverySuggestion: "Remove some files from the volume and try again."
     * 
     * @param err The CFError whose recovery suggestion is to be returned. If this reference is not a valid CFError, the
     *            behavior is undefined.
     * @return A CFString with the localized, end-user presentable recovery suggestion of the CFError, or NULL.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyRecoverySuggestion(CFErrorRef err);

    /**
     * CFURLs are composed of two fundamental pieces - their string, and a
     * (possibly NULL) base URL. A relative URL is one in which the string
     * by itself does not fully specify the URL (for instance "myDir/image.tiff");
     * an absolute URL is one in which the string does fully specify the URL
     * ("file://localhost/myDir/image.tiff"). Absolute URLs always have NULL
     * base URLs; however, it is possible for a URL to have a NULL base, and still
     * not be absolute. Such a URL has only a relative string, and cannot be
     * resolved. Two CFURLs are considered equal if and only if their strings
     * are equal and their bases are equal. In other words,
     * "file://localhost/myDir/image.tiff" is NOT equal to the URL with relative
     * string "myDir/image.tiff" and base URL "file://localhost/". Clients that
     * need these less strict form of equality should convert all URLs to their
     * absolute form via CFURLCopyAbsoluteURL(), then compare the absolute forms.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFURLGetTypeID();

    /**
     * encoding will be used both to interpret the bytes of URLBytes, and to
     * interpret any percent-escapes within the bytes.
     * Using a string encoding which isn't a superset of ASCII encoding is not
     * supported because CFURLGetBytes and CFURLGetByteRangeForComponent require
     * 7-bit ASCII characters to be stored in a single 8-bit byte.
     * CFStringEncodings which are a superset of ASCII encoding include MacRoman,
     * WindowsLatin1, ISOLatin1, NextStepLatin, ASCII, and UTF8.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithBytes(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String URLBytes,
            @NInt long length, int encoding, CFURLRef baseURL);

    /**
     * Escapes any character that is not 7-bit ASCII with the byte-code
     * for the given encoding. If escapeWhitespace is true, whitespace
     * characters (' ', '\t', '\r', '\n') will be escaped also (desirable
     * if embedding the URL into a larger text stream like HTML)
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateData(CFAllocatorRef allocator, CFURLRef url, int encoding,
            byte escapeWhitespace);

    /**
     * Any percent-escape sequences in URLString will be interpreted via UTF-8. URLString must be a valid URL string.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithString(CFAllocatorRef allocator, CFStringRef URLString,
            CFURLRef baseURL);

    /**
     * Create an absolute URL directly, without requiring the extra step
     * of calling CFURLCopyAbsoluteURL(). If useCompatibilityMode is
     * true, the rules historically used on the web are used to resolve
     * relativeString against baseURL - these rules are generally listed
     * in the RFC as optional or alternate interpretations. Otherwise,
     * the strict rules from the RFC are used. The major differences are
     * that in compatibility mode, we are lenient of the scheme appearing
     * in relative portion, leading "../" components are removed from the
     * final URL's path, and if the relative portion contains only
     * resource specifier pieces (query, parameters, and fragment), then
     * the last path component of the base URL will not be deleted.
     * Using a string encoding which isn't a superset of ASCII encoding is not
     * supported because CFURLGetBytes and CFURLGetByteRangeForComponent require
     * 7-bit ASCII characters to be stored in a single 8-bit byte.
     * CFStringEncodings which are a superset of ASCII encoding include MacRoman,
     * WindowsLatin1, ISOLatin1, NextStepLatin, ASCII, and UTF8.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateAbsoluteURLWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String relativeURLBytes,
            @NInt long length, int encoding, CFURLRef baseURL, byte useCompatibilityMode);

    /**
     * filePath should be the URL's path expressed as a path of the type
     * fsType. If filePath is not absolute, the resulting URL will be
     * considered relative to the current working directory (evaluated
     * at creation time). isDirectory determines whether filePath is
     * treated as a directory path when resolving against relative path
     * components
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPath(CFAllocatorRef allocator, CFStringRef filePath,
            @NInt long pathStyle, byte isDirectory);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentation(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory);

    /**
     * The path style of the baseURL must match the path style of the relative
     * url or the results are undefined. If the provided filePath looks like an
     * absolute path ( starting with '/' if pathStyle is kCFURLPosixPathStyle,
     * not starting with ':' for kCFURLHFSPathStyle, or starting with what looks
     * like a drive letter and colon for kCFURLWindowsPathStyle ) then the baseURL
     * is ignored.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPathRelativeToBase(CFAllocatorRef allocator,
            CFStringRef filePath, @NInt long pathStyle, byte isDirectory, CFURLRef baseURL);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentationRelativeToBase(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory, CFURLRef baseURL);

    /**
     * Fills buffer with the file system's native representation of
     * url's path. No more than maxBufLen bytes are written to buffer.
     * The buffer should be at least the maximum path length for
     * the file system in question to avoid failures for insufficiently
     * large buffers. If resolveAgainstBase is true, the url's relative
     * portion is resolved against its base before the path is computed.
     * Returns success or failure.
     */
    @Generated
    @CFunction
    public static native byte CFURLGetFileSystemRepresentation(CFURLRef url, byte resolveAgainstBase, BytePtr buffer,
            @NInt long maxBufLen);

    /**
     * Creates a new URL by resolving the relative portion of relativeURL against its base.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCopyAbsoluteURL(CFURLRef relativeURL);

    /**
     * Returns the URL's string. Percent-escape sequences are not removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLGetString(CFURLRef anURL);

    /**
     * Returns the base URL if it exists
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLGetBaseURL(CFURLRef anURL);

    /**
     * Returns true if anURL conforms to RFC 1808
     */
    @Generated
    @CFunction
    public static native byte CFURLCanBeDecomposed(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyScheme(CFURLRef anURL);

    /**
     * Percent-escape sequences are not removed. NULL if CFURLCanBeDecomposed(anURL) is false
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyNetLocation(CFURLRef anURL);

    /**
     * Percent-escape sequences are not removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPath(CFURLRef anURL);

    /**
     * Percent-escape sequences are not removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyStrictPath(CFURLRef anURL, BytePtr isAbsolute);

    /**
     * CFURLCopyFileSystemPath() returns the URL's path as a file system path for the
     * given path style. All percent-escape sequences are removed. The URL is not
     * resolved against its base before computing the path.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFileSystemPath(CFURLRef anURL, @NInt long pathStyle);

    /**
     * Returns whether anURL's path represents a directory
     * (true returned) or a simple file (false returned)
     */
    @Generated
    @CFunction
    public static native byte CFURLHasDirectoryPath(CFURLRef anURL);

    /**
     * Any additional resource specifiers after the path. For URLs
     * that cannot be decomposed, this is everything except the scheme itself.
     * Percent-escape sequences are not removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyResourceSpecifier(CFURLRef anURL);

    /**
     * Percent-escape sequences are removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyHostName(CFURLRef anURL);

    @Generated
    @CFunction
    public static native int CFURLGetPortNumber(CFURLRef anURL);

    /**
     * Percent-escape sequences are removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyUserName(CFURLRef anURL);

    /**
     * Percent-escape sequences are removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPassword(CFURLRef anURL);

    /**
     * CFURLCopyParameterString, CFURLCopyQueryString, and CFURLCopyFragment
     * remove all percent-escape sequences except those for
     * characters in charactersToLeaveEscaped. If charactersToLeaveEscaped
     * is empty (""), all percent-escape sequences are replaced by their
     * corresponding characters. If charactersToLeaveEscaped is NULL,
     * then no escape sequences are removed at all
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: The CFURLCopyParameterString function is deprecated. Post deprecation for applications linked
     * with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, CFURLCopyParameterString will
     * always return NULL, and the CFURLCopyPath(), CFURLCopyStrictPath(), and CFURLCopyFileSystemPath() functions will
     * return the complete path including the semicolon separator and params component if the URL string contains them.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyParameterString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyQueryString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFragment(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    /**
     * Percent-escape sequences are removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyLastPathComponent(CFURLRef url);

    /**
     * Percent-escape sequences are removed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPathExtension(CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathComponent(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef pathComponent, byte isDirectory);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingLastPathComponent(CFAllocatorRef allocator, CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathExtension(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef extension);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingPathExtension(CFAllocatorRef allocator, CFURLRef url);

    /**
     * Fills buffer with the bytes for url, returning the number of bytes
     * filled. If buffer is of insufficient size, returns -1 and no bytes
     * are placed in buffer. If buffer is NULL, the needed length is
     * computed and returned. The returned bytes are the original bytes
     * from which the URL was created; if the URL was created from a
     * string, the bytes will be the bytes of the string encoded via UTF-8.
     * Note: Due to incompatibilities between encodings, it might be impossible to
     * generate bytes from the base URL in the encoding of the relative URL or relative bytes,
     * which will cause this method to fail and return -1, even if a NULL buffer is passed.
     * To avoid this scenario, use UTF-8, UTF-16, or UTF-32 encodings exclusively, or
     * use one non-Unicode encoding exclusively.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFURLGetBytes(CFURLRef url, BytePtr buffer, @NInt long bufferLength);

    /**
     * Gets the range of the requested component in the bytes of url, as
     * returned by CFURLGetBytes(). This range is only good for use in the
     * bytes returned by CFURLGetBytes!
     * 
     * If non-NULL, rangeIncludingSeparators gives the range of component
     * including the sequences that separate component from the previous and
     * next components. If there is no previous or next component, that end of
     * rangeIncludingSeparators will match the range of the component itself.
     * If url does not contain the given component type, (kCFNotFound, 0) is
     * returned, and rangeIncludingSeparators is set to the location where the
     * component would be inserted. Some examples -
     * 
     * For the URL http://www.apple.com/hotnews/
     * 
     * Component returned range rangeIncludingSeparators
     * scheme (0, 4) (0, 7)
     * net location (7, 13) (4, 16)
     * path (20, 9) (20, 9)
     * resource specifier (kCFNotFound, 0) (29, 0)
     * user (kCFNotFound, 0) (7, 0)
     * password (kCFNotFound, 0) (7, 0)
     * user info (kCFNotFound, 0) (7, 0)
     * host (7, 13) (4, 16)
     * port (kCFNotFound, 0) (20, 0)
     * parameter (kCFNotFound, 0) (29, 0)
     * query (kCFNotFound, 0) (29, 0)
     * fragment (kCFNotFound, 0) (29, 0)
     * 
     * 
     * For the URL ./relPath/file.html#fragment
     * 
     * Component returned range rangeIncludingSeparators
     * scheme (kCFNotFound, 0) (0, 0)
     * net location (kCFNotFound, 0) (0, 0)
     * path (0, 19) (0, 20)
     * resource specifier (20, 8) (19, 9)
     * user (kCFNotFound, 0) (0, 0)
     * password (kCFNotFound, 0) (0, 0)
     * user info (kCFNotFound, 0) (0, 0)
     * host (kCFNotFound, 0) (0, 0)
     * port (kCFNotFound, 0) (0, 0)
     * parameter (kCFNotFound, 0) (19, 0)
     * query (kCFNotFound, 0) (19, 0)
     * fragment (20, 8) (19, 9)
     * 
     * 
     * For the URL scheme://user:pass@host:1/path/path2/file.html;params?query#fragment
     * 
     * Component returned range rangeIncludingSeparators
     * scheme (0, 6) (0, 9)
     * net location (9, 16) (6, 19)
     * path (25, 21) (25, 22)
     * resource specifier (47, 21) (46, 22)
     * user (9, 4) (6, 8)
     * password (14, 4) (13, 6)
     * user info (9, 9) (6, 13)
     * host (19, 4) (18, 6)
     * port (24, 1) (23, 2)
     * parameter (47, 6) (46, 8)
     * query (54, 5) (53, 7)
     * fragment (60, 8) (59, 9)
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFURLGetByteRangeForComponent(CFURLRef url, @NInt long component,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangeIncludingSeparators);

    /**
     * Returns a string with any percent-escape sequences that do NOT
     * correspond to characters in charactersToLeaveEscaped with their
     * equivalent. Returns NULL on failure (if an invalid percent-escape sequence
     * is encountered), or the original string (retained) if no characters
     * need to be replaced. Pass NULL to request that no percent-escapes be
     * replaced, or the empty string (CFSTR("")) to request that all percent-
     * escapes be replaced. Uses UTF8 to interpret percent-escapes.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveEscaped);

    /**
     * As above, but allows you to specify the encoding to use when interpreting percent-escapes
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use [NSString stringByRemovingPercentEncoding] or
     * CFURLCreateStringByReplacingPercentEscapes() instead, which always uses the recommended UTF-8 encoding.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapesUsingEncoding(CFAllocatorRef allocator,
            CFStringRef origString, CFStringRef charsToLeaveEscaped, int encoding);

    /**
     * Creates a copy or originalString, replacing certain characters with
     * the equivalent percent-escape sequence based on the encoding specified.
     * If the originalString does not need to be modified (no percent-escape
     * sequences are missing), may retain and return originalString.
     * If you are uncertain of the correct encoding, you should use UTF-8,
     * which is the encoding designated by RFC 2396 as the correct encoding
     * for use in URLs. The characters so escaped are all characters that
     * are not legal URL characters (based on RFC 2396), plus any characters
     * in legalURLCharactersToBeEscaped, less any characters in
     * charactersToLeaveUnescaped. To simply correct any non-URL characters
     * in an otherwise correct URL string, do:
     * newString = CFURLCreateStringByAddingPercentEscapes(kCFAllocatorDefault, origString, NULL, NULL,
     * kCFStringEncodingUTF8);
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use [NSString stringByAddingPercentEncodingWithAllowedCharacters:] instead, which always uses
     * the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent (since each URL
     * component or subcomponent has different rules for what characters are valid).
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef CFURLCreateStringByAddingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveUnescaped,
            CFStringRef legalURLCharactersToBeEscaped, int encoding);

    /**
     * CFURLIsFileReferenceURL
     * 
     * Returns whether the URL is a file reference URL.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native byte CFURLIsFileReferenceURL(CFURLRef url);

    /**
     * CFURLCreateFileReferenceURL
     * 
     * Returns a new file reference URL that refers to the same resource as a specified URL.
     * 
     * Parameters
     * allocator
     * The memory allocator for creating the new URL.
     * url
     * The file URL specifying the resource.
     * error
     * On output when the result is NULL, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * The new file reference URL, or NULL if an error occurs.
     * 
     * Discussion
     * File reference URLs use a URL path syntax that identifies a file system object by reference, not by path. This
     * form of file URL remains valid when the file system path of the URL’s underlying resource changes. An error will
     * occur if the url parameter is not a file URL. File reference URLs cannot be created to file system objects which
     * do not exist or are not reachable. In some areas of the file system hierarchy, file reference URLs cannot be
     * generated to the leaf node of the URL path. A file reference URL's path should never be persistently stored
     * because is not valid across system restarts, and across remounts of volumes -- if you want to create a persistent
     * reference to a file system object, use a bookmark (see CFURLCreateBookmarkData). If this function returns NULL,
     * the optional error is populated. This function is currently applicable only to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFileReferenceURL(CFAllocatorRef allocator, CFURLRef url,
            Ptr<CFErrorRef> error);

    /**
     * CFURLCreateFilePathURL
     * 
     * Returns a new file path URL that refers to the same resource as a specified URL.
     * 
     * Parameters
     * allocator
     * The memory allocator for creating the new URL.
     * url
     * The file URL specifying the resource.
     * error
     * On output when the result is NULL, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * The new file path URL, or NULL if an error occurs.
     * 
     * Discussion
     * File path URLs use a file system style path. An error will occur if the url parameter is not a file URL. A file
     * reference URL's resource must exist and be reachable to be converted to a file path URL. If this function returns
     * NULL, the optional error is populated. This function is currently applicable only to URLs for file system
     * resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFilePathURL(CFAllocatorRef allocator, CFURLRef url, Ptr<CFErrorRef> error);

    /**
     * Note: CFURLCreateFromFSRef and CFURLGetFSRef have never been functional on iOS because the Carbon File Manager is
     * not on iOS.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Not supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFURLRef CFURLCreateFromFSRef(CFAllocatorRef allocator, VoidPtr fsRef);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Not supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLGetFSRef(CFURLRef url, VoidPtr fsRef);

    /**
     * CFURLCopyResourcePropertyForKey
     * 
     * Returns the resource value identified by a given resource key.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * key
     * The resource key that identifies the resource property.
     * propertyValueTypeRefPtr
     * On output when the result is true, the resource value or NULL.
     * error
     * On output when the result is false, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * true if propertyValueTypeRefPtr is successfully populated; false if an error occurs.
     * 
     * Discussion
     * CFURLCopyResourcePropertyForKey first checks if the URL object already caches the resource value. If so, it
     * returns the cached resource value to the caller. If not, then CFURLCopyResourcePropertyForKey synchronously
     * obtains the resource value from the backing store, adds the resource value to the URL object's cache, and returns
     * the resource value to the caller. The type of the resource value varies by resource property (see resource key
     * definitions). If this function returns true and propertyValueTypeRefPtr is populated with NULL, it means the
     * resource property is not available for the specified resource and no errors occurred when determining the
     * resource property was not available. If this function returns false, the optional error is populated. This
     * function is currently applicable only to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CFURLCopyResourcePropertyForKey(CFURLRef url, CFStringRef key,
            VoidPtr propertyValueTypeRefPtr, Ptr<CFErrorRef> error);

    /**
     * CFURLCopyResourcePropertiesForKeys
     * 
     * Returns the resource values identified by specified array of resource keys.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * keys
     * An array of resource keys that identify the resource properties.
     * error
     * On output when the result is NULL, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * A dictionary of resource values indexed by resource key; NULL if an error occurs.
     * 
     * Discussion
     * CFURLCopyResourcePropertiesForKeys first checks if the URL object already caches the resource values. If so, it
     * returns the cached resource values to the caller. If not, then CFURLCopyResourcePropertyForKey synchronously
     * obtains the resource values from the backing store, adds the resource values to the URL object's cache, and
     * returns the resource values to the caller. The type of the resource values vary by property (see resource key
     * definitions). If the result dictionary does not contain a resource value for one or more of the requested
     * resource keys, it means those resource properties are not available for the specified resource and no errors
     * occurred when determining those resource properties were not available. If this function returns NULL, the
     * optional error is populated. This function is currently applicable only to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCopyResourcePropertiesForKeys(CFURLRef url, CFArrayRef keys,
            Ptr<CFErrorRef> error);

    /**
     * CFURLSetResourcePropertyForKey
     * 
     * Sets the resource value identified by a given resource key.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * key
     * The resource key that identifies the resource property.
     * propertyValue
     * The resource value.
     * error
     * On output when the result is false, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * true if the attempt to set the resource value completed with no errors; otherwise, false.
     * 
     * Discussion
     * CFURLSetResourcePropertyForKey writes the new resource value out to the backing store. Attempts to set a
     * read-only resource property or to set a resource property not supported by the resource are ignored and are not
     * considered errors. If this function returns false, the optional error is populated. This function is currently
     * applicable only to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertyForKey(CFURLRef url, CFStringRef key, ConstVoidPtr propertyValue,
            Ptr<CFErrorRef> error);

    /**
     * CFURLSetResourcePropertiesForKeys
     * 
     * Sets any number of resource values of a URL's resource.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * keyedPropertyValues
     * A dictionary of resource values indexed by resource keys.
     * error
     * On output when the result is false, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * true if the attempt to set the resource values completed with no errors; otherwise, false.
     * 
     * Discussion
     * CFURLSetResourcePropertiesForKeys writes the new resource values out to the backing store. Attempts to set
     * read-only resource properties or to set resource properties not supported by the resource are ignored and are not
     * considered errors. If an error occurs after some resource properties have been successfully changed, the userInfo
     * dictionary in the returned error contains an array of resource keys that were not set with the key
     * kCFURLKeysOfUnsetValuesKey. The order in which the resource values are set is not defined. If you need to
     * guarantee the order resource values are set, you should make multiple requests to
     * CFURLSetResourcePropertiesForKeys or CFURLSetResourcePropertyForKey to guarantee the order. If this function
     * returns false, the optional error is populated. This function is currently applicable only to URLs for file
     * system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertiesForKeys(CFURLRef url, CFDictionaryRef keyedPropertyValues,
            Ptr<CFErrorRef> error);

    /**
     * CFURLClearResourcePropertyCacheForKey
     * 
     * Discards a cached resource value of a URL.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * key
     * The resource key that identifies the resource property.
     * 
     * Discussion
     * Discarding a cached resource value may discard other cached resource values, because some resource values are
     * cached as a set of values and because some resource values depend on other resource values (temporary properties
     * have no dependencies). This function is currently applicable only to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCacheForKey(CFURLRef url, CFStringRef key);

    /**
     * CFURLClearResourcePropertyCache
     * 
     * Discards all cached resource values of a URL.
     * 
     * Parameters
     * url
     * The URL specifying the resource.
     * 
     * Discussion
     * All temporary properties are also cleared from the URL object's cache. This function is currently applicable only
     * to URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCache(CFURLRef url);

    /**
     * CFURLSetTemporaryResourcePropertyForKey
     * 
     * Sets a temporary resource value on the URL object.
     * 
     * Parameters
     * url
     * The URL object.
     * key
     * The resource key that identifies the temporary resource property.
     * propertyValue
     * The resource value.
     * 
     * Discussion
     * Temporary properties are for client use. Temporary properties exist only in memory and are never written to the
     * resource's backing store. Once set, a temporary value can be copied from the URL object with
     * CFURLCopyResourcePropertyForKey and CFURLCopyResourcePropertiesForKeys. To remove a temporary value from the URL
     * object, use CFURLClearResourcePropertyCacheForKey. Temporary values must be valid Core Foundation types, and will
     * be retained by CFURLSetTemporaryResourcePropertyForKey. Care should be taken to ensure the key that identifies a
     * temporary resource property is unique and does not conflict with system defined keys (using reverse domain name
     * notation in your temporary resource property keys is recommended). This function is currently applicable only to
     * URLs for file system resources.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFURLSetTemporaryResourcePropertyForKey(CFURLRef url, CFStringRef key,
            ConstVoidPtr propertyValue);

    /**
     * CFURLResourceIsReachable
     * 
     * Returns whether the URL's resource exists and is reachable.
     * 
     * Parameters
     * url
     * The URL object.
     * error
     * On output when the result is false, the error that occurred. This parameter is optional; if you do not wish the
     * error returned, pass NULL here. The caller is responsible for releasing a valid output error.
     * 
     * Return Value
     * true if the resource is reachable; otherwise, false.
     * 
     * Discussion
     * CFURLResourceIsReachable synchronously checks if the resource's backing store is reachable. Checking reachability
     * is appropriate when making decisions that do not require other immediate operations on the resource, e.g.
     * periodic maintenance of UI state that depends on the existence of a specific document. When performing operations
     * such as opening a file or copying resource properties, it is more efficient to simply try the operation and
     * handle failures. This function is currently applicable only to URLs for file system resources. If this function
     * returns false, the optional error is populated. For other URL types, false is returned.
     * Symbol is present in iOS 4, but performs no operation.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte CFURLResourceIsReachable(CFURLRef url, Ptr<CFErrorRef> error);

    /**
     * Returns bookmark data for the URL, created with specified options and resource properties. If this function
     * returns NULL, the optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkData(CFAllocatorRef allocator, CFURLRef url, @NUInt long options,
            CFArrayRef resourcePropertiesToInclude, CFURLRef relativeToURL, Ptr<CFErrorRef> error);

    /**
     * Return a URL that refers to a location specified by resolving bookmark data. If this function returns NULL, the
     * optional error is populated.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateByResolvingBookmarkData(CFAllocatorRef allocator, CFDataRef bookmark,
            @NUInt long options, CFURLRef relativeToURL, CFArrayRef resourcePropertiesToInclude, BytePtr isStale,
            Ptr<CFErrorRef> error);

    /**
     * Returns the resource propertyies identified by a specified array of keys contained in specified bookmark data. If
     * the result dictionary does not contain a resource value for one or more of the requested resource keys, it means
     * those resource properties are not available in the bookmark data.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCreateResourcePropertiesForKeysFromBookmarkData(CFAllocatorRef allocator,
            CFArrayRef resourcePropertiesToReturn, CFDataRef bookmark);

    /**
     * Returns the resource property identified by a given resource key contained in specified bookmark data. If this
     * function returns NULL, it means the resource property is not available in the bookmark data.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFURLCreateResourcePropertyForKeyFromBookmarkData(CFAllocatorRef allocator,
            CFStringRef resourcePropertyKey, CFDataRef bookmark);

    /**
     * Returns bookmark data derived from an alias file referred to by fileURL. If fileURL refers to an alias file
     * created prior to OS X v10.6 that contains Alias Manager information but no bookmark data, this method synthesizes
     * bookmark data for the file. If this method returns NULL, the optional error is populated.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkDataFromFile(CFAllocatorRef allocator, CFURLRef fileURL,
            Ptr<CFErrorRef> errorRef);

    /**
     * Creates an alias file on disk at a specified location with specified bookmark data. The bookmark data must have
     * been created with the kCFURLBookmarkCreationSuitableForBookmarkFile option. fileURL must either refer to an
     * existing file (which will be overwritten), or to location in an existing directory. If this method returns FALSE,
     * the optional error is populated.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFURLWriteBookmarkDataToFile(CFDataRef bookmarkRef, CFURLRef fileURL, @NUInt long options,
            Ptr<CFErrorRef> errorRef);

    /**
     * Given a CFURLRef created by resolving a bookmark data created with security scope, make the resource referenced
     * by the url accessible to the process. When access to this resource is no longer needed the client must call
     * CFURLStopAccessingSecurityScopedResource(). Each call to CFURLStartAccessingSecurityScopedResource() must be
     * balanced with a call to CFURLStopAccessingSecurityScopedResource() (Note: this is not reference counted).
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native byte CFURLStartAccessingSecurityScopedResource(CFURLRef url);

    /**
     * Revokes the access granted to the url by a prior successful call to CFURLStartAccessingSecurityScopedResource().
     * 
     * API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native void CFURLStopAccessingSecurityScopedResource(CFURLRef url);

    /**
     * absolute time is the time interval since the reference date
     * the reference date (epoch) is 00:00:00 1 January 2001.
     */
    @Generated
    @CFunction
    public static native double CFAbsoluteTimeGetCurrent();

    @Generated
    @CFunction
    @NUInt
    public static native long CFDateGetTypeID();

    @Generated
    @CFunction
    public static native CFDateRef CFDateCreate(CFAllocatorRef allocator, double at);

    @Generated
    @CFunction
    public static native double CFDateGetAbsoluteTime(CFDateRef theDate);

    @Generated
    @CFunction
    public static native double CFDateGetTimeIntervalSinceDate(CFDateRef theDate, CFDateRef otherDate);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateCompare(CFDateRef theDate, CFDateRef otherDate, VoidPtr context);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFGregorianDateIsValid(@ByValue CFGregorianDate gdate, @NUInt long unitFlags);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native double CFGregorianDateGetAbsoluteTime(@ByValue CFGregorianDate gdate, CFTimeZoneRef tz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianDate CFAbsoluteTimeGetGregorianDate(double at, CFTimeZoneRef tz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native double CFAbsoluteTimeAddGregorianUnits(double at, CFTimeZoneRef tz,
            @ByValue CFGregorianUnits units);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianUnits CFAbsoluteTimeGetDifferenceAsGregorianUnits(double at1, double at2,
            CFTimeZoneRef tz, @NUInt long unitFlags);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfWeek(double at, CFTimeZoneRef tz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfYear(double at, CFTimeZoneRef tz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFCalendar or NSCalendar API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetWeekOfYear(double at, CFTimeZoneRef tz);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBagGetTypeID();

    @Generated
    @CFunction
    public static native CFBagRef CFBagCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFBagRef CFBagCreateCopy(CFAllocatorRef allocator, CFBagRef theBag);

    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBagRef theBag);

    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCount(CFBagRef theBag);

    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCountOfValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFBagContainsValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFBagGetValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFBagGetValueIfPresent(CFBagRef theBag, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    @Generated
    @CFunction
    public static native void CFBagGetValues(CFBagRef theBag, Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFBagApplyFunction(CFBagRef theBag,
            @FunctionPtr(name = "call_CFBagApplyFunction") Function_CFBagApplyFunction applier, VoidPtr context);

    @Generated
    @CFunction
    public static native void CFBagAddValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagReplaceValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagSetValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagRemoveValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagRemoveAllValues(CFMutableBagRef theBag);

    /**
     * [@function] CFBinaryHeapGetTypeID
     * Returns the type identifier of all CFBinaryHeap instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBinaryHeapGetTypeID();

    /**
     * [@function] CFBinaryHeapCreate
     * Creates a new mutable binary heap with the given values.
     * 
     * @param allocator      The CFAllocator which should be used to allocate
     *                       memory for the binary heap and its storage for values. This
     *                       parameter may be NULL in which case the current default
     *                       CFAllocator is used. If this reference is not a valid
     *                       CFAllocator, the behavior is undefined.
     * @param capacity       A hint about the number of values that will be held
     *                       by the CFBinaryHeap. Pass 0 for no hint. The implementation may
     *                       ignore this hint, or may use it to optimize various
     *                       operations. A heap's actual capacity is only limited by
     *                       address space and available memory constraints). If this
     *                       parameter is negative, the behavior is undefined.
     * @param callBacks      A pointer to a CFBinaryHeapCallBacks structure
     *                       initialized with the callbacks for the binary heap to use on
     *                       each value in the binary heap. A copy of the contents of the
     *                       callbacks structure is made, so that a pointer to a structure
     *                       on the stack can be passed in, or can be reused for multiple
     *                       binary heap creations. If the version field of this callbacks
     *                       structure is not one of the defined ones for CFBinaryHeap, the
     *                       behavior is undefined. The retain field may be NULL, in which
     *                       case the CFBinaryHeap will do nothing to add a retain to values
     *                       as they are put into the binary heap. The release field may be
     *                       NULL, in which case the CFBinaryHeap will do nothing to remove
     *                       the binary heap's retain (if any) on the values when the
     *                       heap is destroyed or a key-value pair is removed. If the
     *                       copyDescription field is NULL, the binary heap will create a
     *                       simple description for a value. If the equal field is NULL, the
     *                       binary heap will use pointer equality to test for equality of
     *                       values. This callbacks parameter itself may be NULL, which is
     *                       treated as if a valid structure of version 0 with all fields
     *                       NULL had been passed in. Otherwise,
     *                       if any of the fields are not valid pointers to functions
     *                       of the correct type, or this parameter is not a valid
     *                       pointer to a CFBinaryHeapCallBacks callbacks structure,
     *                       the behavior is undefined. If any of the values put into the
     *                       binary heap is not one understood by one of the callback functions
     *                       the behavior when that callback function is used is undefined.
     * @param compareContext A pointer to a CFBinaryHeapCompareContext structure.
     * @return A reference to the new CFBinaryHeap.
     */
    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCallBacks callBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCompareContext compareContext);

    /**
     * [@function] CFBinaryHeapCreateCopy
     * Creates a new mutable binary heap with the values from the given binary heap.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the binary heap and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFBinaryHeap. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. A heap's actual capacity is only limited by
     *                  address space and available memory constraints).
     *                  This parameter must be greater than or equal
     *                  to the count of the heap which is to be copied, or the
     *                  behavior is undefined. If this parameter is negative, the
     *                  behavior is undefined.
     * @param heap      The binary heap which is to be copied. The values from the
     *                  binary heap are copied as pointers into the new binary heap (that is,
     *                  the values themselves are copied, not that which the values
     *                  point to, if anything). However, the values are also
     *                  retained by the new binary heap. The count of the new binary will
     *                  be the same as the given binary heap. The new binary heap uses the same
     *                  callbacks as the binary heap to be copied. If this parameter is
     *                  not a valid CFBinaryHeap, the behavior is undefined.
     * @return A reference to the new mutable binary heap.
     */
    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreateCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBinaryHeapRef heap);

    /**
     * [@function] CFBinaryHeapGetCount
     * Returns the number of values currently in the binary heap.
     * 
     * @param heap The binary heap to be queried. If this parameter is not a valid
     *             CFBinaryHeap, the behavior is undefined.
     * @return The number of values in the binary heap.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCount(CFBinaryHeapRef heap);

    /**
     * [@function] CFBinaryHeapGetCountOfValue
     * Counts the number of times the given value occurs in the binary heap.
     * 
     * @param heap  The binary heap to be searched. If this parameter is not a
     *              valid CFBinaryHeap, the behavior is undefined.
     * @param value The value for which to find matches in the binary heap. The
     *              compare() callback provided when the binary heap was created is
     *              used to compare. If the compare() callback was NULL, pointer
     *              equality (in C, ==) is used. If value, or any of the values
     *              in the binary heap, are not understood by the compare() callback,
     *              the behavior is undefined.
     * @return The number of times the given value occurs in the binary heap.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCountOfValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * [@function] CFBinaryHeapContainsValue
     * Reports whether or not the value is in the binary heap.
     * 
     * @param heap  The binary heap to be searched. If this parameter is not a
     *              valid CFBinaryHeap, the behavior is undefined.
     * @param value The value for which to find matches in the binary heap. The
     *              compare() callback provided when the binary heap was created is
     *              used to compare. If the compare() callback was NULL, pointer
     *              equality (in C, ==) is used. If value, or any of the values
     *              in the binary heap, are not understood by the compare() callback,
     *              the behavior is undefined.
     * @return true, if the value is in the specified binary heap, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFBinaryHeapContainsValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * [@function] CFBinaryHeapGetMinimum
     * Returns the minimum value is in the binary heap. If the heap contains several equal
     * minimum values, any one may be returned.
     * 
     * @param heap The binary heap to be searched. If this parameter is not a
     *             valid CFBinaryHeap, the behavior is undefined.
     * @return A reference to the minimum value in the binary heap, or NULL if the
     *         binary heap contains no values.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFBinaryHeapGetMinimum(CFBinaryHeapRef heap);

    /**
     * [@function] CFBinaryHeapGetMinimumIfPresent
     * Returns the minimum value is in the binary heap, if present. If the heap contains several equal
     * minimum values, any one may be returned.
     * 
     * @param heap  The binary heap to be searched. If this parameter is not a
     *              valid CFBinaryHeap, the behavior is undefined.
     * @param value A C pointer to pointer-sized storage to be filled with the minimum value in
     *              the binary heap. If this value is not a valid C pointer to a pointer-sized block
     *              of storage, the result is undefined. If the result of the function is false, the value
     *              stored at this address is undefined.
     * @return true, if a minimum value was found in the specified binary heap, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFBinaryHeapGetMinimumIfPresent(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> value);

    /**
     * [@function] CFBinaryHeapGetValues
     * Fills the buffer with values from the binary heap.
     * 
     * @param heap   The binary heap to be queried. If this parameter is not a
     *               valid CFBinaryHeap, the behavior is undefined.
     * @param values A C array of pointer-sized values to be filled with
     *               values from the binary heap. The values in the C array are ordered
     *               from least to greatest. If this parameter is not a valid pointer to a
     *               C array of at least CFBinaryHeapGetCount() pointers, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapGetValues(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> values);

    /**
     * [@function] CFBinaryHeapApplyFunction
     * Calls a function once for each value in the binary heap.
     * 
     * @param heap    The binary heap to be operated upon. If this parameter is not a
     *                valid CFBinaryHeap, the behavior is undefined.
     * @param applier The callback function to call once for each value in
     *                the given binary heap. If this parameter is not a
     *                pointer to a function of the correct prototype, the behavior
     *                is undefined. If there are values in the binary heap which the
     *                applier function does not expect or cannot properly apply
     *                to, the behavior is undefined.
     * @param context A pointer-sized user-defined value, which is passed
     *                as the second parameter to the applier function, but is
     *                otherwise unused by this function. If the context is not
     *                what is expected by the applier function, the behavior is
     *                undefined.
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapApplyFunction(CFBinaryHeapRef heap,
            @FunctionPtr(name = "call_CFBinaryHeapApplyFunction") Function_CFBinaryHeapApplyFunction applier,
            VoidPtr context);

    /**
     * [@function] CFBinaryHeapAddValue
     * Adds the value to the binary heap.
     * 
     * @param heap  The binary heap to which the value is to be added. If this parameter is not a
     *              valid mutable CFBinaryHeap, the behavior is undefined.
     * @param value The value to add to the binary heap. The value is retained by
     *              the binary heap using the retain callback provided when the binary heap
     *              was created. If the value is not of the sort expected by the
     *              retain callback, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapAddValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * [@function] CFBinaryHeapRemoveMinimumValue
     * Removes the minimum value from the binary heap.
     * 
     * @param heap The binary heap from which the minimum value is to be removed. If this
     *             parameter is not a valid mutable CFBinaryHeap, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveMinimumValue(CFBinaryHeapRef heap);

    /**
     * [@function] CFBinaryHeapRemoveAllValues
     * Removes all the values from the binary heap, making it empty.
     * 
     * @param heap The binary heap from which all of the values are to be
     *             removed. If this parameter is not a valid mutable CFBinaryHeap,
     *             the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveAllValues(CFBinaryHeapRef heap);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBitVectorGetTypeID();

    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBits);

    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreateCopy(CFAllocatorRef allocator, CFBitVectorRef bv);

    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFBitVectorRef bv);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCount(CFBitVectorRef bv);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCountOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native byte CFBitVectorContainsBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native int CFBitVectorGetBitAtIndex(CFBitVectorRef bv, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFBitVectorGetBits(CFBitVectorRef bv, @ByValue CFRange range, BytePtr bytes);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetFirstIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetLastIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetCount(CFMutableBitVectorRef bv, @NInt long count);

    @Generated
    @CFunction
    public static native void CFBitVectorFlipBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFBitVectorFlipBits(CFMutableBitVectorRef bv, @ByValue CFRange range);

    @Generated
    @CFunction
    public static native void CFBitVectorSetBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetBits(CFMutableBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetAllBits(CFMutableBitVectorRef bv, int value);

    @Generated
    @Inline
    @CFunction
    @NInt
    public static native long CFByteOrderGetCurrent();

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16BigToHost(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32BigToHost(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64BigToHost(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToBig(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToBig(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToBig(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16LittleToHost(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32LittleToHost(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64LittleToHost(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToLittle(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToLittle(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToLittle(long arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloat32HostToSwapped(float arg);

    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloat32SwappedToHost(@ByValue CFSwappedFloat32 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertFloat64HostToSwapped(double arg);

    @Generated
    @Inline
    @CFunction
    public static native double CFConvertFloat64SwappedToHost(@ByValue CFSwappedFloat64 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloatHostToSwapped(float arg);

    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloatSwappedToHost(@ByValue CFSwappedFloat32 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertDoubleHostToSwapped(double arg);

    @Generated
    @Inline
    @CFunction
    public static native double CFConvertDoubleSwappedToHost(@ByValue CFSwappedFloat64 arg);

    @Generated
    @CFunction
    @NUInt
    public static native long CFTimeZoneGetTypeID();

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopySystem();

    @Generated
    @CFunction
    public static native void CFTimeZoneResetSystem();

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopyDefault();

    @Generated
    @CFunction
    public static native void CFTimeZoneSetDefault(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native CFArrayRef CFTimeZoneCopyKnownNames();

    @Generated
    @CFunction
    public static native CFDictionaryRef CFTimeZoneCopyAbbreviationDictionary();

    @Generated
    @CFunction
    public static native void CFTimeZoneSetAbbreviationDictionary(CFDictionaryRef dict);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreate(CFAllocatorRef allocator, CFStringRef name, CFDataRef data);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithTimeIntervalFromGMT(CFAllocatorRef allocator, double ti);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithName(CFAllocatorRef allocator, CFStringRef name,
            byte tryAbbrev);

    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneGetName(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native CFDataRef CFTimeZoneGetData(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native double CFTimeZoneGetSecondsFromGMT(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyAbbreviation(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native byte CFTimeZoneIsDaylightSavingTime(CFTimeZoneRef tz, double at);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native double CFTimeZoneGetDaylightSavingTimeOffset(CFTimeZoneRef tz, double at);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native double CFTimeZoneGetNextDaylightSavingTimeTransition(CFTimeZoneRef tz, double at);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyLocalizedName(CFTimeZoneRef tz, @NInt long style,
            CFLocaleRef locale);

    @Generated
    @CFunction
    @NUInt
    public static native long CFCalendarGetTypeID();

    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCopyCurrent();

    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCreateWithIdentifier(CFAllocatorRef allocator, CFStringRef identifier);

    /**
     * Create a calendar. The identifiers are the kCF*Calendar
     * constants in CFLocale.h.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFCalendarGetIdentifier(CFCalendarRef calendar);

    /**
     * Returns the calendar's identifier.
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFCalendarCopyLocale(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetLocale(CFCalendarRef calendar, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFCalendarCopyTimeZone(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetTimeZone(CFCalendarRef calendar, CFTimeZoneRef tz);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetFirstWeekday(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetFirstWeekday(CFCalendarRef calendar, @NInt long wkdy);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetMinimumDaysInFirstWeek(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetMinimumDaysInFirstWeek(CFCalendarRef calendar, @NInt long mwd);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMinimumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMaximumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetRangeOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetOrdinalityOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte CFCalendarGetTimeRangeOfUnit(CFCalendarRef calendar, @NUInt long unit, double at,
            DoublePtr startp, DoublePtr tip);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarComposeAbsoluteTime(CFCalendarRef calendar, DoublePtr at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarDecomposeAbsoluteTime(CFCalendarRef calendar, double at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarAddComponents(CFCalendarRef calendar, DoublePtr at, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarGetComponentDifference(CFCalendarRef calendar, double startingAT,
            double resultAT, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    /**
     * CFDateFormatters are not thread-safe. Do not use one from multiple threads!
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateDateFormatFromTemplate(CFAllocatorRef allocator,
            CFStringRef tmplate, @NUInt long options, CFLocaleRef locale);

    /**
     * no options defined, pass 0 for now
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDateFormatterGetTypeID();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native CFDateFormatterRef CFDateFormatterCreateISO8601Formatter(CFAllocatorRef allocator,
            @NUInt long formatOptions);

    @Generated
    @CFunction
    public static native CFDateFormatterRef CFDateFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long dateStyle, @NInt long timeStyle);

    /**
     * Returns a CFDateFormatter, localized to the given locale, which
     * will format dates to the given date and time styles.
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFDateFormatterGetLocale(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetDateStyle(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetTimeStyle(CFDateFormatterRef formatter);

    /**
     * Get the properties with which the date formatter was created.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterGetFormat(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    public static native void CFDateFormatterSetFormat(CFDateFormatterRef formatter, CFStringRef formatString);

    /**
     * Set the format description string of the date formatter. This
     * overrides the style settings. The format of the format string
     * is as defined by the ICU library. The date formatter starts with a
     * default format string defined by the style arguments with
     * which it was created.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithDate(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFDateRef date);

    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithAbsoluteTime(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, double at);

    /**
     * Create a string representation of the given date or CFAbsoluteTime
     * using the current state of the date formatter.
     */
    @Generated
    @CFunction
    public static native CFDateRef CFDateFormatterCreateDateFromString(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep);

    @Generated
    @CFunction
    public static native byte CFDateFormatterGetAbsoluteTimeFromString(CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, DoublePtr atp);

    /**
     * Parse a string representation of a date using the current state
     * of the date formatter. The range parameter specifies the range
     * of the string in which the parsing should occur in input, and on
     * output indicates the extent that was used; this parameter can
     * be NULL, in which case the whole string may be used. The
     * return value indicates whether some date was computed and
     * (if atp is not NULL) stored at the location specified by atp.
     */
    @Generated
    @CFunction
    public static native void CFDateFormatterSetProperty(CFDateFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFDateFormatterCopyProperty(CFDateFormatterRef formatter, CFStringRef key);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBooleanGetTypeID();

    @Generated
    @CFunction
    public static native byte CFBooleanGetValue(CFBooleanRef boolean_);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberGetTypeID();

    /**
     * Creates a CFNumber with the given value. The type of number pointed
     * to by the valuePtr is specified by type. If type is a floating point
     * type and the value represents one of the infinities or NaN, the
     * well-defined CFNumber for that value is returned. If either of
     * valuePtr or type is an invalid value, the result is undefined.
     */
    @Generated
    @CFunction
    public static native CFNumberRef CFNumberCreate(CFAllocatorRef allocator, @NInt long theType,
            ConstVoidPtr valuePtr);

    /**
     * Returns the storage format of the CFNumber's value. Note that
     * this is not necessarily the type provided in CFNumberCreate().
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetType(CFNumberRef number);

    /**
     * Returns the size in bytes of the type of the number.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetByteSize(CFNumberRef number);

    /**
     * Returns true if the type of the CFNumber's value is one of
     * the defined floating point types.
     */
    @Generated
    @CFunction
    public static native byte CFNumberIsFloatType(CFNumberRef number);

    /**
     * Copies the CFNumber's value into the space pointed to by
     * valuePtr, as the specified type. If conversion needs to take
     * place, the conversion rules follow human expectation and not
     * C's promotion and truncation rules. If the conversion is
     * lossy, or the value is out of range, false is returned. Best
     * attempt at conversion will still be in *valuePtr.
     */
    @Generated
    @CFunction
    public static native byte CFNumberGetValue(CFNumberRef number, @NInt long theType, VoidPtr valuePtr);

    /**
     * Compares the two CFNumber instances. If conversion of the
     * types of the values is needed, the conversion and comparison
     * follow human expectations and not C's promotion and comparison
     * rules. Negative zero compares less than positive zero.
     * Positive infinity compares greater than everything except
     * itself, to which it compares equal. Negative infinity compares
     * less than everything except itself, to which it compares equal.
     * Unlike standard practice, if both numbers are NaN, then they
     * compare equal; if only one of the numbers is NaN, then the NaN
     * compares greater than the other number if it is negative, and
     * smaller than the other number if it is positive. (Note that in
     * CFEqual() with two CFNumbers, if either or both of the numbers
     * is NaN, true is returned.)
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberCompare(CFNumberRef number, CFNumberRef otherNumber, VoidPtr context);

    /**
     * CFNumberFormatters are not thread-safe. Do not use one from multiple threads!
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberFormatterGetTypeID();

    @Generated
    @CFunction
    public static native CFNumberFormatterRef CFNumberFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long style);

    /**
     * Returns a CFNumberFormatter, localized to the given locale, which
     * will format numbers to the given style.
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFNumberFormatterGetLocale(CFNumberFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFNumberFormatterGetStyle(CFNumberFormatterRef formatter);

    /**
     * Get the properties with which the number formatter was created.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterGetFormat(CFNumberFormatterRef formatter);

    @Generated
    @CFunction
    public static native void CFNumberFormatterSetFormat(CFNumberFormatterRef formatter, CFStringRef formatString);

    /**
     * Set the format description string of the number formatter. This
     * overrides the style settings. The format of the format string
     * is as defined by the ICU library, and is similar to that found
     * in Microsoft Excel and NSNumberFormatter.
     * The number formatter starts with a default format string defined
     * by the style argument with which it was created.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithNumber(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFNumberRef number);

    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithValue(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, @NInt long numberType, ConstVoidPtr valuePtr);

    @Generated
    @CFunction
    public static native CFNumberRef CFNumberFormatterCreateNumberFromString(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NUInt long options);

    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetValueFromString(CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NInt long numberType,
            VoidPtr valuePtr);

    /**
     * Parse a string representation of a number using the current state
     * of the number formatter. The range parameter specifies the range
     * of the string in which the parsing should occur in input, and on
     * output indicates the extent that was used; this parameter can
     * be NULL, in which case the whole string may be used. The
     * return value indicates whether some number was computed and
     * (if valuePtr is not NULL) stored at the location specified by
     * valuePtr. The numberType indicates the type of value pointed
     * to by valuePtr.
     */
    @Generated
    @CFunction
    public static native void CFNumberFormatterSetProperty(CFNumberFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFNumberFormatterCopyProperty(CFNumberFormatterRef formatter, CFStringRef key);

    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetDecimalInfoForCurrencyCode(CFStringRef currencyCode,
            IntPtr defaultFractionDigits, DoublePtr roundingIncrement);

    /**
     * Searches the various sources of application defaults to find the
     * value for the given key. key must not be NULL. If a value is found,
     * it returns it; otherwise returns NULL. Caller must release the
     * returned value
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyAppValue(@NotNull CFStringRef key,
            @NotNull CFStringRef applicationID);

    /**
     * Convenience to interpret a preferences value as a boolean directly.
     * Returns false if the key doesn't exist, or has an improper format; under
     * those conditions, keyExistsAndHasValidFormat (if non-NULL) is set to false
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesGetAppBooleanValue(@NotNull CFStringRef key,
            @NotNull CFStringRef applicationID, @Nullable BytePtr keyExistsAndHasValidFormat);

    /**
     * Convenience to interpret a preferences value as an integer directly.
     * Returns 0 if the key doesn't exist, or has an improper format; under
     * those conditions, keyExistsAndHasValidFormat (if non-NULL) is set to false
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFPreferencesGetAppIntegerValue(@NotNull CFStringRef key,
            @NotNull CFStringRef applicationID, @Nullable BytePtr keyExistsAndHasValidFormat);

    /**
     * Sets the given value for the given key in the "normal" place for
     * application preferences. key must not be NULL. If value is NULL,
     * key is removed instead.
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetAppValue(@NotNull CFStringRef key, @Nullable ConstVoidPtr value,
            @NotNull CFStringRef applicationID);

    /**
     * Adds the preferences for the given suite to the app preferences for
     * the specified application. To write to the suite domain, use
     * CFPreferencesSetValue(), below, using the suiteName in place
     * of the appName
     */
    @Generated
    @CFunction
    public static native void CFPreferencesAddSuitePreferencesToApp(@NotNull CFStringRef applicationID,
            @NotNull CFStringRef suiteID);

    @Generated
    @CFunction
    public static native void CFPreferencesRemoveSuitePreferencesFromApp(@NotNull CFStringRef applicationID,
            @NotNull CFStringRef suiteID);

    /**
     * Writes all changes in all sources of application defaults.
     * Returns success or failure.
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesAppSynchronize(@NotNull CFStringRef applicationID);

    /**
     * The primitive get mechanism; all arguments must be non-NULL
     * (use the constants above for common values). Only the exact
     * location specified by app-user-host is searched. The returned
     * CFType must be released by the caller when it is finished with it.
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyValue(@NotNull CFStringRef key,
            @NotNull CFStringRef applicationID, @NotNull CFStringRef userName, @NotNull CFStringRef hostName);

    /**
     * Convenience to fetch multiple keys at once. Keys in
     * keysToFetch that are not present in the returned dictionary
     * are not present in the domain. If keysToFetch is NULL, all
     * keys are fetched.
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFDictionaryRef CFPreferencesCopyMultiple(@Nullable CFArrayRef keysToFetch,
            @NotNull CFStringRef applicationID, @NotNull CFStringRef userName, @NotNull CFStringRef hostName);

    /**
     * The primitive set function; all arguments except value must be
     * non-NULL. If value is NULL, the given key is removed
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetValue(@NotNull CFStringRef key, @Nullable ConstVoidPtr value,
            @NotNull CFStringRef applicationID, @NotNull CFStringRef userName, @NotNull CFStringRef hostName);

    /**
     * Convenience to set multiple values at once. Behavior is undefined
     * if a key is in both keysToSet and keysToRemove
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetMultiple(@Nullable CFDictionaryRef keysToSet,
            @Nullable CFArrayRef keysToRemove, @NotNull CFStringRef applicationID, @NotNull CFStringRef userName,
            @NotNull CFStringRef hostName);

    @Generated
    @CFunction
    public static native byte CFPreferencesSynchronize(@NotNull CFStringRef applicationID,
            @NotNull CFStringRef userName, @NotNull CFStringRef hostName);

    /**
     * Constructs and returns the list of the name of all applications
     * which have preferences in the scope of the given user and host, or NULL if no applications are there.
     * The returned value must be released by the caller; neither argument
     * may be NULL. Does not supported sandboxed applications.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Unsupported API
     */
    @Nullable
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyApplicationList(@NotNull CFStringRef userName,
            @NotNull CFStringRef hostName);

    /**
     * Constructs and returns the list of all keys set in the given
     * location, or NULL if no keys are set. The returned value must be released by the caller;
     * all arguments must be non-NULL
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyKeyList(@NotNull CFStringRef applicationID,
            @NotNull CFStringRef userName, @NotNull CFStringRef hostName);

    /**
     * Function to determine whether or not a given key has been imposed on the
     * user - In cases where machines and/or users are under some kind of management,
     * callers should use this function to determine whether or not to disable UI elements
     * corresponding to those preference keys.
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesAppValueIsForced(@NotNull CFStringRef key,
            @NotNull CFStringRef applicationID);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetCurrent();

    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetMain();

    @Generated
    @CFunction
    public static native CFStringRef CFRunLoopCopyCurrentMode(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native CFArrayRef CFRunLoopCopyAllModes(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopAddCommonMode(CFRunLoopRef rl, CFStringRef mode);

    @Generated
    @CFunction
    public static native double CFRunLoopGetNextTimerFireDate(CFRunLoopRef rl, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRun();

    @Generated
    @CFunction
    public static native int CFRunLoopRunInMode(CFStringRef mode, double seconds, byte returnAfterSourceHandled);

    @Generated
    @CFunction
    public static native byte CFRunLoopIsWaiting(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopWakeUp(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopStop(CFRunLoopRef rl);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFRunLoopPerformBlock(CFRunLoopRef rl, ConstVoidPtr mode,
            @ObjCBlock(name = "call_CFRunLoopPerformBlock") Block_CFRunLoopPerformBlock block);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer,
            CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopSourceGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFRunLoopSourceCreate(CFAllocatorRef allocator, @NInt long order,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopSourceGetOrder(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceInvalidate(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native byte CFRunLoopSourceIsValid(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceGetContext(CFRunLoopSourceRef source,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceSignal(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreate(CFAllocatorRef allocator, @NUInt long activities,
            byte repeats, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopObserverCreate") Function_CFRunLoopObserverCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreateWithHandler(CFAllocatorRef allocator,
            @NUInt long activities, byte repeats, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopObserverCreateWithHandler") Block_CFRunLoopObserverCreateWithHandler block);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetActivities(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native byte CFRunLoopObserverDoesRepeat(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopObserverGetOrder(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native void CFRunLoopObserverInvalidate(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native byte CFRunLoopObserverIsValid(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native void CFRunLoopObserverGetContext(CFRunLoopObserverRef observer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopTimerGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreate(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopTimerCreate") Function_CFRunLoopTimerCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopTimerContext context);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreateWithHandler(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopTimerCreateWithHandler") Block_CFRunLoopTimerCreateWithHandler block);

    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetNextFireDate(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerSetNextFireDate(CFRunLoopTimerRef timer, double fireDate);

    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetInterval(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native byte CFRunLoopTimerDoesRepeat(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopTimerGetOrder(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerInvalidate(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native byte CFRunLoopTimerIsValid(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerGetContext(CFRunLoopTimerRef timer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopTimerContext context);

    /**
     * Setting a tolerance for a timer allows it to fire later than the scheduled fire date, improving the ability of
     * the system to optimize for increased power savings and responsiveness. The timer may fire at any time between its
     * scheduled fire date and the scheduled fire date plus the tolerance. The timer will not fire before the scheduled
     * fire date. For repeating timers, the next fire date is calculated from the original fire date regardless of
     * tolerance applied at individual fire times, to avoid drift. The default value is zero, which means no additional
     * tolerance is applied. The system reserves the right to apply a small amount of tolerance to certain timers
     * regardless of the value of this property.
     * As the user of the timer, you will have the best idea of what an appropriate tolerance for a timer may be. A
     * general rule of thumb, though, is to set the tolerance to at least 10% of the interval, for a repeating timer.
     * Even a small amount of tolerance will have a significant positive impact on the power usage of your application.
     * The system may put a maximum value of the tolerance.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetTolerance(CFRunLoopTimerRef timer);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CFRunLoopTimerSetTolerance(CFRunLoopTimerRef timer, double tolerance);

    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetTypeID();

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreate(CFAllocatorRef allocator, int protocolFamily, int socketType,
            int protocol, @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreate") Function_CFSocketCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithNative(CFAllocatorRef allocator, int sock,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithNative") Function_CFSocketCreateWithNative callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithSocketSignature") Function_CFSocketCreateWithSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    /**
     * CFSocketCreateWithSocketSignature() creates a socket of the requested type and binds its address (using
     * CFSocketSetAddress()) to the requested address. If this fails, it returns NULL.
     */
    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateConnectedToSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateConnectedToSocketSignature") Function_CFSocketCreateConnectedToSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context,
            double timeout);

    /**
     * CFSocketCreateConnectedToSocketSignature() creates a socket suitable for connecting to the requested type and
     * address, and connects it (using CFSocketConnectToAddress()). If this fails, it returns NULL.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSetAddress(CFSocketRef s, CFDataRef address);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketConnectToAddress(CFSocketRef s, CFDataRef address, double timeout);

    @Generated
    @CFunction
    public static native void CFSocketInvalidate(CFSocketRef s);

    @Generated
    @CFunction
    public static native byte CFSocketIsValid(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyAddress(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyPeerAddress(CFSocketRef s);

    @Generated
    @CFunction
    public static native void CFSocketGetContext(CFSocketRef s,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native int CFSocketGetNative(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFSocketCreateRunLoopSource(CFAllocatorRef allocator, CFSocketRef s,
            @NInt long order);

    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetSocketFlags(CFSocketRef s);

    @Generated
    @CFunction
    public static native void CFSocketSetSocketFlags(CFSocketRef s, @NUInt long flags);

    @Generated
    @CFunction
    public static native void CFSocketDisableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    @Generated
    @CFunction
    public static native void CFSocketEnableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    /**
     * For convenience, a function is provided to send data using the socket with a timeout. The timeout will be used
     * only if the specified value is positive. The address should be left NULL if the socket is already connected.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSendData(CFSocketRef s, CFDataRef address, CFDataRef data, double timeout);

    /**
     * Generic name registry functionality (CFSocketRegisterValue,
     * CFSocketCopyRegisteredValue) allows the registration of any property
     * list type. Functions specific to CFSockets (CFSocketRegisterSocketData,
     * CFSocketCopyRegisteredSocketData) register a CFData containing the
     * components of a socket signature (protocol family, socket type,
     * protocol, and address). In each function the nameServerSignature
     * may be NULL, or any component of it may be 0, to use default values
     * (TCP, INADDR_LOOPBACK, port as set). Name registration servers might
     * not allow registration with other than TCP and INADDR_LOOPBACK.
     * The actual address of the server responding to a query may be obtained
     * by using the nameServerAddress argument. This address, the address
     * returned by CFSocketCopyRegisteredSocketSignature, and the value
     * returned by CFSocketCopyRegisteredValue must (if non-null) be released
     * by the caller. CFSocketUnregister removes any registration associated
     * with the specified name.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, ConstVoidPtr value);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, Ptr<ConstVoidPtr> value, Ptr<CFDataRef> nameServerAddress);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFDataRef> nameServerAddress);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketUnregister(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name);

    @Generated
    @CFunction
    public static native void CFSocketSetDefaultNameRegistryPortNumber(char port);

    @Generated
    @CFunction
    public static native char CFSocketGetDefaultNameRegistryPortNumber();

    @Generated
    @CFunction
    @NUInt
    public static native long CFReadStreamGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFWriteStreamGetTypeID();

    /**
     * Pass kCFAllocatorNull for bytesDeallocator to prevent CFReadStream from deallocating bytes; otherwise,
     * CFReadStream will deallocate bytes when the stream is destroyed
     */
    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    /**
     * The stream writes into the buffer given; when bufferCapacity is exhausted, the stream is exhausted (status
     * becomes kCFStreamStatusAtEnd)
     */
    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithBuffer(CFAllocatorRef alloc, BytePtr buffer,
            @NInt long bufferCapacity);

    /**
     * New buffers are allocated from bufferAllocator as bytes are written to the stream. At any point, you can recover
     * the bytes thusfar written by asking for the property kCFStreamPropertyDataWritten, above
     */
    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithAllocatedBuffers(CFAllocatorRef alloc,
            CFAllocatorRef bufferAllocator);

    /**
     * File streams
     */
    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    @Generated
    @CFunction
    public static native void CFStreamCreateBoundPair(CFAllocatorRef alloc, Ptr<CFReadStreamRef> readStream,
            Ptr<CFWriteStreamRef> writeStream, @NInt long transferBufferSize);

    /**
     * Socket streams; the returned streams are paired such that they use the same socket; pass NULL if you want only
     * the read stream or the write stream
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use nw_connection_t in Network framework instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocket(CFAllocatorRef alloc, int sock,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use nw_connection_t in Network framework instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToHost(CFAllocatorRef alloc, CFStringRef host, int port,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use nw_connection_t in Network framework instead
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithPeerSocketSignature(CFAllocatorRef alloc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * Returns the current state of the stream
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamGetStatus(CFReadStreamRef stream);

    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamGetStatus(CFWriteStreamRef stream);

    /**
     * Returns NULL if no error has occurred; otherwise returns the error.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFReadStreamCopyError(CFReadStreamRef stream);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFWriteStreamCopyError(CFWriteStreamRef stream);

    /**
     * Returns success/failure. Opening a stream causes it to reserve all the system
     * resources it requires. If the stream can open non-blocking, this will always
     * return TRUE; listen to the run loop source to find out when the open completes
     * and whether it was successful, or poll using CFRead/WriteStreamGetStatus(), waiting
     * for a status of kCFStreamStatusOpen or kCFStreamStatusError.
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamOpen(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native byte CFWriteStreamOpen(CFWriteStreamRef stream);

    /**
     * Terminates the flow of bytes; releases any system resources required by the
     * stream. The stream may not fail to close. You may call CFStreamClose() to
     * effectively abort a stream.
     */
    @Generated
    @CFunction
    public static native void CFReadStreamClose(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native void CFWriteStreamClose(CFWriteStreamRef stream);

    /**
     * Whether there is data currently available for reading; returns TRUE if it's
     * impossible to tell without trying
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamHasBytesAvailable(CFReadStreamRef stream);

    /**
     * Returns the number of bytes read, or -1 if an error occurs preventing any
     * bytes from being read, or 0 if the stream's end was encountered.
     * It is an error to try and read from a stream that hasn't been opened first.
     * This call will block until at least one byte is available; it will NOT block
     * until the entire buffer can be filled. To avoid blocking, either poll using
     * CFReadStreamHasBytesAvailable() or use the run loop and listen for the
     * kCFStreamEventHasBytesAvailable event for notification of data available.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamRead(CFReadStreamRef stream, BytePtr buffer, @NInt long bufferLength);

    /**
     * Returns a pointer to an internal buffer if possible (setting *numBytesRead
     * to the length of the returned buffer), otherwise returns NULL; guaranteed
     * to return in O(1). Bytes returned in the buffer are considered read from
     * the stream; if maxBytesToRead is greater than 0, not more than maxBytesToRead
     * will be returned. If maxBytesToRead is less than or equal to zero, as many bytes
     * as are readily available will be returned. The returned buffer is good only
     * until the next stream operation called on the stream. Caller should neither
     * change the contents of the returned buffer nor attempt to deallocate the buffer;
     * it is still owned by the stream.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFReadStreamGetBuffer(CFReadStreamRef stream, @NInt long maxBytesToRead,
            NIntPtr numBytesRead);

    /**
     * Whether the stream can currently be written to without blocking;
     * returns TRUE if it's impossible to tell without trying
     */
    @Generated
    @CFunction
    public static native byte CFWriteStreamCanAcceptBytes(CFWriteStreamRef stream);

    /**
     * Returns the number of bytes successfully written, -1 if an error has
     * occurred, or 0 if the stream has been filled to capacity (for fixed-length
     * streams). If the stream is not full, this call will block until at least
     * one byte is written. To avoid blocking, either poll via CFWriteStreamCanAcceptBytes
     * or use the run loop and listen for the kCFStreamEventCanAcceptBytes event.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamWrite(CFWriteStreamRef stream,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufferLength);

    /**
     * Particular streams can name properties and assign meanings to them; you
     * access these properties through the following calls. A property is any interesting
     * information about the stream other than the data being transmitted itself.
     * Examples include the headers from an HTTP transmission, or the expected
     * number of bytes, or permission information, etc. Properties that can be set
     * configure the behavior of the stream, and may only be settable at particular times
     * (like before the stream has been opened). See the documentation for particular
     * properties to determine their get- and set-ability.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFReadStreamCopyProperty(CFReadStreamRef stream, CFStringRef propertyName);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFWriteStreamCopyProperty(CFWriteStreamRef stream, CFStringRef propertyName);

    /**
     * Returns TRUE if the stream recognizes and accepts the given property-value pair;
     * FALSE otherwise.
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamSetProperty(CFReadStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    @Generated
    @CFunction
    public static native byte CFWriteStreamSetProperty(CFWriteStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    /**
     * Asynchronous processing - If you wish to neither poll nor block, you may register
     * a client to hear about interesting events that occur on a stream. Only one client
     * per stream is allowed; registering a new client replaces the previous one.
     * 
     * Once you have set a client, the stream must be scheduled to provide the context in
     * which the client will be called. Streams may be scheduled on a single dispatch queue
     * or on one or more run loops. If scheduled on a run loop, it is the caller's responsibility
     * to ensure that at least one of the scheduled run loops is being run.
     * 
     * NOTE: Unlike other CoreFoundation APIs, pasing a NULL clientContext here will remove
     * the client. If you do not care about the client context (i.e. your only concern
     * is that your callback be called), you should pass in a valid context where every
     * entry is 0 or NULL.
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamSetClient(CFReadStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFReadStreamSetClient") Function_CFReadStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CFunction
    public static native byte CFWriteStreamSetClient(CFWriteStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFWriteStreamSetClient") Function_CFWriteStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFReadStreamScheduleWithRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFWriteStreamScheduleWithRunLoop(CFWriteStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFReadStreamUnscheduleFromRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFWriteStreamUnscheduleFromRunLoop(CFWriteStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     * Specify the dispatch queue upon which the client callbacks will be invoked.
     * Passing NULL for the queue will prevent future callbacks from being invoked.
     * Specifying a dispatch queue using this API will unschedule the stream from
     * any run loops it had previously been scheduled upon - similarly, scheduling
     * with a runloop will disassociate the stream from any existing dispatch queue.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CFReadStreamSetDispatchQueue(CFReadStreamRef stream, NSObject q);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CFWriteStreamSetDispatchQueue(CFWriteStreamRef stream, NSObject q);

    /**
     * Returns the previously set dispatch queue with an incremented retain count.
     * Note that the stream's queue may have been set to NULL if the stream was
     * scheduled on a runloop subsequent to it having had a dispatch queue set.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native NSObject CFReadStreamCopyDispatchQueue(CFReadStreamRef stream);

    /**
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native NSObject CFWriteStreamCopyDispatchQueue(CFWriteStreamRef stream);

    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFReadStreamGetError(CFReadStreamRef stream);

    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFWriteStreamGetError(CFWriteStreamRef stream);

    /**
     * Creates a property list object from its XML description; xmlData should
     * be the raw bytes of that description, possibly the contents of an XML
     * file. Returns NULL if the data cannot be parsed; if the parse fails
     * and errorString is non-NULL, a human-readable description of the failure
     * is returned in errorString. It is the caller's responsibility to release
     * either the returned object or the error string, whichever is applicable.
     * 
     * This function is deprecated. See CFPropertyListCreateWithData() for a replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFPropertyListCreateWithData instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromXMLData(CFAllocatorRef allocator, CFDataRef xmlData,
            @NUInt long mutabilityOption, Ptr<CFStringRef> errorString);

    /**
     * Returns the XML description of the given object; propertyList must
     * be one of the supported property list types, and (for composite types
     * like CFArray and CFDictionary) must not contain any elements that
     * are not themselves of a property list type. If a non-property list
     * type is encountered, NULL is returned. The returned data is
     * appropriate for writing out to an XML file. Note that a data, not a
     * string, is returned because the bytes contain in them a description
     * of the string encoding used.
     * 
     * This function is deprecated. See CFPropertyListCreateData() for a replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFPropertyListCreateData instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef CFPropertyListCreateXMLData(CFAllocatorRef allocator, ConstVoidPtr propertyList);

    /**
     * Recursively creates a copy of the given property list (so nested arrays
     * and dictionaries are copied as well as the top-most container). The
     * resulting property list has the mutability characteristics determined
     * by mutabilityOption.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateDeepCopy(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NUInt long mutabilityOption);

    /**
     * Returns true if the object graph rooted at plist is a valid property list
     * graph -- that is, no cycles, containing only plist objects, and dictionary
     * keys are strings. The debugging library version spits out some messages
     * to be helpful. The plist structure which is to be allowed is given by
     * the format parameter.
     */
    @Generated
    @CFunction
    public static native byte CFPropertyListIsValid(ConstVoidPtr plist, @NInt long format);

    /**
     * Writes the bytes of a plist serialization out to the stream. The
     * stream must be opened and configured -- the function simply writes
     * a bunch of bytes to the stream. The output plist format can be chosen.
     * Leaves the stream open, but note that reading a plist expects the
     * reading stream to end wherever the writing ended, so that the
     * end of the plist data can be identified. Returns the number of bytes
     * written, or 0 on error. Error messages are not currently localized, but
     * may be in the future, so they are not suitable for comparison.
     * 
     * This function is deprecated. See CFPropertyListWrite() for a replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFPropertyListWrite instead.
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long CFPropertyListWriteToStream(ConstVoidPtr propertyList, CFWriteStreamRef stream,
            @NInt long format, Ptr<CFStringRef> errorString);

    /**
     * Same as current function CFPropertyListCreateFromXMLData()
     * but takes a stream instead of data, and works on any plist file format.
     * CFPropertyListCreateFromXMLData() also works on any plist file format.
     * The stream must be open and configured -- the function simply reads a bunch
     * of bytes from it starting at the current location in the stream, to the END
     * of the stream, which is expected to be the end of the plist, or up to the
     * number of bytes given by the length parameter if it is not 0. Error messages
     * are not currently localized, but may be in the future, so they are not
     * suitable for comparison.
     * 
     * This function is deprecated. See CFPropertyListCreateWithStream() for a replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use CFPropertyListCreateWithStream instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long mutabilityOption, NIntPtr format, Ptr<CFStringRef> errorString);

    /**
     * Create a property list with a CFData input. If the format parameter is non-NULL, it will be set to the format of
     * the data after parsing is complete. The options parameter is used to specify CFPropertyListMutabilityOptions. If
     * an error occurs while parsing the data, the return value will be NULL. Additionally, if an error occurs and the
     * error parameter is non-NULL, the error parameter will be set to a CFError describing the problem, which the
     * caller must release. If the parse succeeds, the returned value is a reference to the new property list. It is the
     * responsibility of the caller to release this value.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithData(CFAllocatorRef allocator, CFDataRef data,
            @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    /**
     * Create and return a property list with a CFReadStream input. If the format parameter is non-NULL, it will be set
     * to the format of the data after parsing is complete. The options parameter is used to specify
     * CFPropertyListMutabilityOptions. The streamLength parameter specifies the number of bytes to read from the
     * stream. Set streamLength to 0 to read until the end of the stream is detected. If an error occurs while parsing
     * the data, the return value will be NULL. Additionally, if an error occurs and the error parameter is non-NULL,
     * the error parameter will be set to a CFError describing the problem, which the caller must release. If the parse
     * succeeds, the returned value is a reference to the new property list. It is the responsibility of the caller to
     * release this value.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    /**
     * Write the bytes of a serialized property list out to a stream. The stream must be opened and configured. The
     * format of the property list can be chosen with the format parameter. The options parameter is currently unused
     * and should be set to 0. The return value is the number of bytes written or 0 in the case of an error. If an error
     * occurs and the error parameter is non-NULL, the error parameter will be set to a CFError describing the problem,
     * which the caller must release.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFPropertyListWrite(ConstVoidPtr propertyList, CFWriteStreamRef stream, @NInt long format,
            @NUInt long options, Ptr<CFErrorRef> error);

    /**
     * Create a CFData with the bytes of a serialized property list. The format of the property list can be chosen with
     * the format parameter. The options parameter is currently unused and should be set to 0. If an error occurs while
     * parsing the data, the return value will be NULL. Additionally, if an error occurs and the error parameter is
     * non-NULL, the error parameter will be set to a CFError describing the problem, which the caller must release. If
     * the conversion succeeds, the returned value is a reference to the created data. It is the responsibility of the
     * caller to release this value.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFDataRef CFPropertyListCreateData(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NInt long format, @NUInt long options, Ptr<CFErrorRef> error);

    /**
     * [@function] CFSetGetTypeID
     * Returns the type identifier of all CFSet instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFSetGetTypeID();

    /**
     * [@function] CFSetCreate
     * Creates a new immutable set with the given values.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the set and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param values    A C array of the pointer-sized values to be in the
     *                  set. This C array is not changed or freed by this function.
     *                  If this parameter is not a valid pointer to a C array of at
     *                  least numValues pointers, the behavior is undefined.
     * @param numValues The number of values to copy from the values C
     *                  array into the CFSet. This number will be the count of the
     *                  set. If this parameter is zero, negative, or greater than
     *                  the number of values actually in the values C array, the
     *                  behavior is undefined.
     * @param callBacks A C pointer to a CFSetCallBacks structure
     *                  initialized with the callbacks for the set to use on each
     *                  value in the set. A copy of the contents of the
     *                  callbacks structure is made, so that a pointer to a
     *                  structure on the stack can be passed in, or can be reused
     *                  for multiple set creations. If the version field of this
     *                  callbacks structure is not one of the defined ones for
     *                  CFSet, the behavior is undefined. The retain field may be
     *                  NULL, in which case the CFSet will do nothing to add a
     *                  retain to the contained values for the set. The release
     *                  field may be NULL, in which case the CFSet will do nothing
     *                  to remove the set's retain (if any) on the values when the
     *                  set is destroyed. If the copyDescription field is NULL,
     *                  the set will create a simple description for the value. If
     *                  the equal field is NULL, the set will use pointer equality
     *                  to test for equality of values. The hash field may be NULL,
     *                  in which case the CFSet will determine uniqueness by pointer
     *                  equality. This callbacks parameter
     *                  itself may be NULL, which is treated as if a valid structure
     *                  of version 0 with all fields NULL had been passed in.
     *                  Otherwise, if any of the fields are not valid pointers to
     *                  functions of the correct type, or this parameter is not a
     *                  valid pointer to a CFSetCallBacks callbacks structure,
     *                  the behavior is undefined. If any of the values put into the
     *                  set is not one understood by one of the callback functions
     *                  the behavior when that callback function is used is
     *                  undefined.
     * @return A reference to the new immutable CFSet.
     */
    @Generated
    @CFunction
    public static native CFSetRef CFSetCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    /**
     * [@function] CFSetCreateCopy
     * Creates a new immutable set with the values from the given set.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the set and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param theSet    The set which is to be copied. The values from the
     *                  set are copied as pointers into the new set (that is,
     *                  the values themselves are copied, not that which the values
     *                  point to, if anything). However, the values are also
     *                  retained by the new set. The count of the new set will
     *                  be the same as the copied set. The new set uses the same
     *                  callbacks as the set to be copied. If this parameter is
     *                  not a valid CFSet, the behavior is undefined.
     * @return A reference to the new immutable CFSet.
     */
    @Generated
    @CFunction
    public static native CFSetRef CFSetCreateCopy(CFAllocatorRef allocator, CFSetRef theSet);

    /**
     * [@function] CFSetCreateMutable
     * Creates a new empty mutable set.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the set and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFSet. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. A set's actual capacity is only limited by
     *                  address space and available memory constraints). If this
     *                  parameter is negative, the behavior is undefined.
     * @param callBacks A C pointer to a CFSetCallBacks structure
     *                  initialized with the callbacks for the set to use on each
     *                  value in the set. A copy of the contents of the
     *                  callbacks structure is made, so that a pointer to a
     *                  structure on the stack can be passed in, or can be reused
     *                  for multiple set creations. If the version field of this
     *                  callbacks structure is not one of the defined ones for
     *                  CFSet, the behavior is undefined. The retain field may be
     *                  NULL, in which case the CFSet will do nothing to add a
     *                  retain to the contained values for the set. The release
     *                  field may be NULL, in which case the CFSet will do nothing
     *                  to remove the set's retain (if any) on the values when the
     *                  set is destroyed. If the copyDescription field is NULL,
     *                  the set will create a simple description for the value. If
     *                  the equal field is NULL, the set will use pointer equality
     *                  to test for equality of values. The hash field may be NULL,
     *                  in which case the CFSet will determine uniqueness by pointer
     *                  equality. This callbacks parameter
     *                  itself may be NULL, which is treated as if a valid structure
     *                  of version 0 with all fields NULL had been passed in.
     *                  Otherwise, if any of the fields are not valid pointers to
     *                  functions of the correct type, or this parameter is not a
     *                  valid pointer to a CFSetCallBacks callbacks structure,
     *                  the behavior is undefined. If any of the values put into the
     *                  set is not one understood by one of the callback functions
     *                  the behavior when that callback function is used is
     *                  undefined.
     * @return A reference to the new mutable CFSet.
     */
    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    /**
     * [@function] CFSetCreateMutableCopy
     * Creates a new immutable set with the values from the given set.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the set and its storage for values. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param capacity  A hint about the number of values that will be held
     *                  by the CFSet. Pass 0 for no hint. The implementation may
     *                  ignore this hint, or may use it to optimize various
     *                  operations. A set's actual capacity is only limited by
     *                  address space and available memory constraints).
     *                  This parameter must be greater than or equal
     *                  to the count of the set which is to be copied, or the
     *                  behavior is undefined. If this parameter is negative, the
     *                  behavior is undefined.
     * @param theSet    The set which is to be copied. The values from the
     *                  set are copied as pointers into the new set (that is,
     *                  the values themselves are copied, not that which the values
     *                  point to, if anything). However, the values are also
     *                  retained by the new set. The count of the new set will
     *                  be the same as the copied set. The new set uses the same
     *                  callbacks as the set to be copied. If this parameter is
     *                  not a valid CFSet, the behavior is undefined.
     * @return A reference to the new mutable CFSet.
     */
    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFSetRef theSet);

    /**
     * [@function] CFSetGetCount
     * Returns the number of values currently in the set.
     * 
     * @param theSet The set to be queried. If this parameter is not a valid
     *               CFSet, the behavior is undefined.
     * @return The number of values in the set.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCount(CFSetRef theSet);

    /**
     * [@function] CFSetGetCountOfValue
     * Counts the number of times the given value occurs in the set. Since
     * sets by definition contain only one instance of a value, this function
     * is synonymous to CFSetContainsValue.
     * 
     * @param theSet The set to be searched. If this parameter is not a
     *               valid CFSet, the behavior is undefined.
     * @param value  The value for which to find matches in the set. The
     *               equal() callback provided when the set was created is
     *               used to compare. If the equal() callback was NULL, pointer
     *               equality (in C, ==) is used. If value, or any of the values
     *               in the set, are not understood by the equal() callback,
     *               the behavior is undefined.
     * @return The number of times the given value occurs in the set.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCountOfValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetContainsValue
     * Reports whether or not the value is in the set.
     * 
     * @param theSet The set to be searched. If this parameter is not a
     *               valid CFSet, the behavior is undefined.
     * @param value  The value for which to find matches in the set. The
     *               equal() callback provided when the set was created is
     *               used to compare. If the equal() callback was NULL, pointer
     *               equality (in C, ==) is used. If value, or any of the values
     *               in the set, are not understood by the equal() callback,
     *               the behavior is undefined.
     * @return true, if the value is in the set, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFSetContainsValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetGetValue
     * Retrieves a value in the set which hashes the same as the specified value.
     * 
     * @param theSet The set to be queried. If this parameter is not a
     *               valid CFSet, the behavior is undefined.
     * @param value  The value to retrieve. The equal() callback provided when
     *               the set was created is used to compare. If the equal() callback
     *               was NULL, pointer equality (in C, ==) is used. If a value, or
     *               any of the values in the set, are not understood by the equal()
     *               callback, the behavior is undefined.
     * @return The value in the set with the given hash.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFSetGetValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetGetValueIfPresent
     * Retrieves a value in the set which hashes the same as the specified value,
     * if present.
     * 
     * @param theSet    The set to be queried. If this parameter is not a
     *                  valid CFSet, the behavior is undefined.
     * @param candidate This value is hashed and compared with values in the
     *                  set to determine which value to retrieve. The equal() callback provided when
     *                  the set was created is used to compare. If the equal() callback
     *                  was NULL, pointer equality (in C, ==) is used. If a value, or
     *                  any of the values in the set, are not understood by the equal()
     *                  callback, the behavior is undefined.
     * @param value     A pointer to memory which should be filled with the
     *                  pointer-sized value if a matching value is found. If no
     *                  match is found, the contents of the storage pointed to by
     *                  this parameter are undefined. This parameter may be NULL,
     *                  in which case the value from the dictionary is not returned
     *                  (but the return value of this function still indicates
     *                  whether or not the value was present).
     * @return True if the value was present in the set, otherwise false.
     */
    @Generated
    @CFunction
    public static native byte CFSetGetValueIfPresent(CFSetRef theSet, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    /**
     * [@function] CFSetGetValues
     * Fills the buffer with values from the set.
     * 
     * @param theSet The set to be queried. If this parameter is not a
     *               valid CFSet, the behavior is undefined.
     * @param values A C array of pointer-sized values to be filled with
     *               values from the set. The values in the C array are ordered
     *               in the same order in which they appear in the set. If this
     *               parameter is not a valid pointer to a C array of at least
     *               CFSetGetCount() pointers, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFSetGetValues(CFSetRef theSet, Ptr<ConstVoidPtr> values);

    /**
     * [@function] CFSetApplyFunction
     * Calls a function once for each value in the set.
     * 
     * @param theSet  The set to be operated upon. If this parameter is not
     *                a valid CFSet, the behavior is undefined.
     * @param applier The callback function to call once for each value in
     *                the given set. If this parameter is not a
     *                pointer to a function of the correct prototype, the behavior
     *                is undefined. If there are values in the set which the
     *                applier function does not expect or cannot properly apply
     *                to, the behavior is undefined.
     * @param context A pointer-sized user-defined value, which is passed
     *                as the second parameter to the applier function, but is
     *                otherwise unused by this function. If the context is not
     *                what is expected by the applier function, the behavior is
     *                undefined.
     */
    @Generated
    @CFunction
    public static native void CFSetApplyFunction(CFSetRef theSet,
            @FunctionPtr(name = "call_CFSetApplyFunction") Function_CFSetApplyFunction applier, VoidPtr context);

    /**
     * [@function] CFSetAddValue
     * Adds the value to the set if it is not already present.
     * 
     * @param theSet The set to which the value is to be added. If this
     *               parameter is not a valid mutable CFSet, the behavior is
     *               undefined.
     * @param value  The value to add to the set. The value is retained by
     *               the set using the retain callback provided when the set
     *               was created. If the value is not of the sort expected by the
     *               retain callback, the behavior is undefined. The count of the
     *               set is increased by one.
     */
    @Generated
    @CFunction
    public static native void CFSetAddValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetReplaceValue
     * Replaces the value in the set if it is present.
     * 
     * @param theSet The set to which the value is to be replaced. If this
     *               parameter is not a valid mutable CFSet, the behavior is
     *               undefined.
     * @param value  The value to replace in the set. The equal() callback provided when
     *               the set was created is used to compare. If the equal() callback
     *               was NULL, pointer equality (in C, ==) is used. If a value, or
     *               any of the values in the set, are not understood by the equal()
     *               callback, the behavior is undefined. The value is retained by
     *               the set using the retain callback provided when the set
     *               was created. If the value is not of the sort expected by the
     *               retain callback, the behavior is undefined. The count of the
     *               set is increased by one.
     */
    @Generated
    @CFunction
    public static native void CFSetReplaceValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetSetValue
     * Replaces the value in the set if it is present, or adds the value to
     * the set if it is absent.
     * 
     * @param theSet The set to which the value is to be replaced. If this
     *               parameter is not a valid mutable CFSet, the behavior is
     *               undefined.
     * @param value  The value to set in the CFSet. The equal() callback provided when
     *               the set was created is used to compare. If the equal() callback
     *               was NULL, pointer equality (in C, ==) is used. If a value, or
     *               any of the values in the set, are not understood by the equal()
     *               callback, the behavior is undefined. The value is retained by
     *               the set using the retain callback provided when the set
     *               was created. If the value is not of the sort expected by the
     *               retain callback, the behavior is undefined. The count of the
     *               set is increased by one.
     */
    @Generated
    @CFunction
    public static native void CFSetSetValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetRemoveValue
     * Removes the specified value from the set.
     * 
     * @param theSet The set from which the value is to be removed.
     *               If this parameter is not a valid mutable CFSet,
     *               the behavior is undefined.
     * @param value  The value to remove. The equal() callback provided when
     *               the set was created is used to compare. If the equal() callback
     *               was NULL, pointer equality (in C, ==) is used. If a value, or
     *               any of the values in the set, are not understood by the equal()
     *               callback, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFSetRemoveValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * [@function] CFSetRemoveAllValues
     * Removes all the values from the set, making it empty.
     * 
     * @param theSet The set from which all of the values are to be
     *               removed. If this parameter is not a valid mutable CFSet,
     *               the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFSetRemoveAllValues(CFMutableSetRef theSet);

    /**
     * [@function] CFTreeGetTypeID
     * Returns the type identifier of all CFTree instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFTreeGetTypeID();

    /**
     * [@function] CFTreeCreate
     * Creates a new mutable tree.
     * 
     * @param allocator The CFAllocator which should be used to allocate
     *                  memory for the tree and storage for its children. This
     *                  parameter may be NULL in which case the current default
     *                  CFAllocator is used. If this reference is not a valid
     *                  CFAllocator, the behavior is undefined.
     * @param context   A C pointer to a CFTreeContext structure to be copied
     *                  and used as the context of the new tree. The info parameter
     *                  will be retained by the tree if a retain function is provided.
     *                  If this value is not a valid C pointer to a CFTreeContext
     *                  structure-sized block of storage, the result is undefined.
     *                  If the version number of the storage is not a valid CFTreeContext
     *                  version number, the result is undefined.
     * @return A reference to the new CFTree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * [@function] CFTreeGetParent
     * Returns the parent of the specified tree.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @return The parent of the tree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetParent(CFTreeRef tree);

    /**
     * [@function] CFTreeGetNextSibling
     * Returns the sibling after the specified tree in the parent tree's list.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @return The next sibling of the tree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetNextSibling(CFTreeRef tree);

    /**
     * [@function] CFTreeGetFirstChild
     * Returns the first child of the tree.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @return The first child of the tree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetFirstChild(CFTreeRef tree);

    /**
     * [@function] CFTreeGetContext
     * Returns the context of the specified tree.
     * 
     * @param tree    The tree to be queried. If this parameter is not a valid
     *                CFTree, the behavior is undefined.
     * @param context A C pointer to a CFTreeContext structure to be filled in with
     *                the context of the specified tree. If this value is not a valid C
     *                pointer to a CFTreeContext structure-sized block of storage, the
     *                result is undefined. If the version number of the storage is not
     *                a valid CFTreeContext version number, the result is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeGetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * [@function] CFTreeGetChildCount
     * Returns the number of children of the specified tree.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @return The number of children.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFTreeGetChildCount(CFTreeRef tree);

    /**
     * [@function] CFTreeGetChildAtIndex
     * Returns the nth child of the specified tree.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @param idx  The index of the child tree to be returned. If this parameter
     *             is less than zero or greater than the number of children of the
     *             tree, the result is undefined.
     * @return A reference to the specified child tree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetChildAtIndex(CFTreeRef tree, @NInt long idx);

    /**
     * [@function] CFTreeGetChildren
     * Fills the buffer with children from the tree.
     * 
     * @param tree     The tree to be queried. If this parameter is not a valid
     *                 CFTree, the behavior is undefined.
     * @param children A C array of pointer-sized values to be filled with
     *                 children from the tree. If this parameter is not a valid pointer to a
     *                 C array of at least CFTreeGetChildCount() pointers, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeGetChildren(CFTreeRef tree, Ptr<CFTreeRef> children);

    /**
     * [@function] CFTreeApplyFunctionToChildren
     * Calls a function once for each child of the tree. Note that the applier
     * only operates one level deep, and does not operate on descendents further
     * removed than the immediate children of the tree.
     * 
     * @param tree    The tree to be operated upon. If this parameter is not a
     *                valid CFTree, the behavior is undefined.
     * @param applier The callback function to call once for each child of
     *                the given tree. If this parameter is not a pointer to a
     *                function of the correct prototype, the behavior is undefined.
     *                If there are values in the tree which the applier function does
     *                not expect or cannot properly apply to, the behavior is undefined.
     * @param context A pointer-sized user-defined value, which is passed
     *                as the second parameter to the applier function, but is
     *                otherwise unused by this function. If the context is not
     *                what is expected by the applier function, the behavior is
     *                undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeApplyFunctionToChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeApplyFunctionToChildren") Function_CFTreeApplyFunctionToChildren applier,
            VoidPtr context);

    /**
     * [@function] CFTreeFindRoot
     * Returns the root tree of which the specified tree is a descendent.
     * 
     * @param tree The tree to be queried. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     * @return A reference to the root of the tree.
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeFindRoot(CFTreeRef tree);

    /**
     * [@function] CFTreeSetContext
     * Replaces the context of a tree. The tree releases its retain on the
     * info of the previous context, and retains the info of the new context.
     * 
     * @param tree    The tree to be operated on. If this parameter is not a valid
     *                CFTree, the behavior is undefined.
     * @param context A C pointer to a CFTreeContext structure to be copied
     *                and used as the context of the new tree. The info parameter
     *                will be retained by the tree if a retain function is provided.
     *                If this value is not a valid C pointer to a CFTreeContext
     *                structure-sized block of storage, the result is undefined.
     *                If the version number of the storage is not a valid CFTreeContext
     *                version number, the result is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeSetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * [@function] CFTreePrependChild
     * Adds the newChild to the specified tree as the first in its list of children.
     * 
     * @param tree     The tree to be operated on. If this parameter is not a valid
     *                 CFTree, the behavior is undefined.
     * @param newChild The child to be added.
     *                 If this parameter is not a valid CFTree, the behavior is undefined.
     *                 If this parameter is a tree which is already a child of any tree,
     *                 the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreePrependChild(CFTreeRef tree, CFTreeRef newChild);

    /**
     * [@function] CFTreeAppendChild
     * Adds the newChild to the specified tree as the last in its list of children.
     * 
     * @param tree     The tree to be operated on. If this parameter is not a valid
     *                 CFTree, the behavior is undefined.
     * @param newChild The child to be added.
     *                 If this parameter is not a valid CFTree, the behavior is undefined.
     *                 If this parameter is a tree which is already a child of any tree,
     *                 the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeAppendChild(CFTreeRef tree, CFTreeRef newChild);

    /**
     * [@function] CFTreeInsertSibling
     * Inserts newSibling into the the parent tree's linked list of children after
     * tree. The newSibling will have the same parent as tree.
     * 
     * @param tree       The tree to insert newSibling after. If this parameter is not a valid
     *                   CFTree, the behavior is undefined. If the tree does not have a
     *                   parent, the behavior is undefined.
     * @param newSibling The sibling to be added.
     *                   If this parameter is not a valid CFTree, the behavior is undefined.
     *                   If this parameter is a tree which is already a child of any tree,
     *                   the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeInsertSibling(CFTreeRef tree, CFTreeRef newSibling);

    /**
     * [@function] CFTreeRemove
     * Removes the tree from its parent.
     * 
     * @param tree The tree to be removed. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeRemove(CFTreeRef tree);

    /**
     * [@function] CFTreeRemoveAllChildren
     * Removes all the children of the tree.
     * 
     * @param tree The tree to remove all children from. If this parameter is not a valid
     *             CFTree, the behavior is undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeRemoveAllChildren(CFTreeRef tree);

    /**
     * [@function] CFTreeSortChildren
     * Sorts the children of the specified tree using the specified comparator function.
     * 
     * @param tree       The tree to be operated on. If this parameter is not a valid
     *                   CFTree, the behavior is undefined.
     * @param comparator The function with the comparator function type
     *                   signature which is used in the sort operation to compare
     *                   children of the tree with the given value. If this parameter
     *                   is not a pointer to a function of the correct prototype, the
     *                   the behavior is undefined. The children of the tree are sorted
     *                   from least to greatest according to this function.
     * @param context    A pointer-sized user-defined value, which is passed
     *                   as the third parameter to the comparator function, but is
     *                   otherwise unused by this function. If the context is not
     *                   what is expected by the comparator function, the behavior is
     *                   undefined.
     */
    @Generated
    @CFunction
    public static native void CFTreeSortChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeSortChildren") Function_CFTreeSortChildren comparator, VoidPtr context);

    /**
     * Attempts to read the data and properties for the given URL. If
     * only interested in one of the resourceData and properties, pass NULL
     * for the other. If properties is non-NULL and desiredProperties is
     * NULL, then all properties are fetched. Returns success or failure;
     * note that as much work as possible is done even if false is returned.
     * So for instance if one property is not available, the others are
     * fetched anyway. errorCode is set to 0 on success, and some other
     * value on failure. If non-NULL, it is the caller 's responsibility
     * to release resourceData and properties.
     * 
     * Apple reserves for its use all negative error code values; these
     * values represent errors common to any scheme. Scheme-specific error
     * codes should be positive, non-zero, and should be used only if one of
     * the predefined Apple error codes does not apply. Error codes should
     * be publicized and documented with the scheme-specific properties.
     * 
     * NOTE: When asking for the resource data, this call will allocate the entire
     * resource in memory. This can be very expensive, depending on the size of the
     * resource (file). Please use CFStream or other techniques if you are downloading
     * large files.
     * 
     * Deprecated -- see top of this file for suggested replacement classes
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: For resource data, use the CFReadStream API. For file resource properties, use
     * CFURLCopyResourcePropertiesForKeys.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLCreateDataAndPropertiesFromResource(CFAllocatorRef alloc, CFURLRef url,
            Ptr<CFDataRef> resourceData, Ptr<CFDictionaryRef> properties, CFArrayRef desiredProperties,
            IntPtr errorCode);

    /**
     * Attempts to write the given data and properties to the given URL.
     * If dataToWrite is NULL, only properties are written out (use
     * CFURLDestroyResource() to delete a resource). Properties not present
     * in propertiesToWrite are left unchanged, hence if propertiesToWrite
     * is NULL or empty, the URL's properties are not changed at all.
     * Returns success or failure; errorCode is set as for
     * CFURLCreateDataAndPropertiesFromResource(), above.
     * Deprecated -- see top of this file for suggested replacement classes
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: For resource data, use the CFWriteStream API. For file resource properties, use
     * CFURLSetResourcePropertiesForKeys.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLWriteDataAndPropertiesToResource(CFURLRef url, CFDataRef dataToWrite,
            CFDictionaryRef propertiesToWrite, IntPtr errorCode);

    /**
     * Destroys the resource indicated by url.
     * Returns success or failure; errorCode set as above.
     * Deprecated -- see top of this file for suggested replacement classes
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLGetFileSystemRepresentation and removefile(3) instead.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLDestroyResource(CFURLRef url, IntPtr errorCode);

    /**
     * Convenience method which calls through to CFURLCreateDataAndPropertiesFromResource().
     * Returns NULL on error and sets errorCode accordingly.
     * Deprecated -- see top of this file for suggested replacement classes
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: For file resource properties, use CFURLCopyResourcePropertyForKey.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFURLCreatePropertyFromResource(CFAllocatorRef alloc, CFURLRef url,
            CFStringRef property, IntPtr errorCode);

    /**
     * The CFUUIDBytes struct is a 128-bit struct that contains the
     * raw UUID. A CFUUIDRef can provide such a struct from the
     * CFUUIDGetUUIDBytes() function. This struct is suitable for
     * passing to APIs that expect a raw UUID.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFUUIDGetTypeID();

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreate(CFAllocatorRef alloc);

    /**
     * Create and return a brand new unique identifier
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1, byte byte2,
            byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    /**
     * Create and return an identifier with the given contents. This may return an existing instance with its ref count
     * bumped because of uniquing.
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromString(CFAllocatorRef alloc, CFStringRef uuidStr);

    /**
     * Converts from a string representation to the UUID. This may return an existing instance with its ref count bumped
     * because of uniquing.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFUUIDCreateString(CFAllocatorRef alloc, CFUUIDRef uuid);

    /**
     * Converts from a UUID to its string representation.
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDGetConstantUUIDWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1,
            byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    /**
     * This returns an immortal CFUUIDRef that should not be released. It can be used in headers to declare UUID
     * constants with #define.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid);

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, @ByValue CFUUIDBytes bytes);

    /**
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFURLRef CFCopyHomeDirectoryURL();

    /**
     * ===================== Finding Bundles =====================
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetMainBundle();

    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetBundleWithIdentifier(CFStringRef bundleID);

    /**
     * A bundle can name itself by providing a key in the info dictionary.
     * This facility is meant to allow bundle-writers to get hold of their
     * bundle from their code without having to know where it was on the disk.
     * This is meant to be a replacement mechanism for +bundleForClass: users.
     * Note that this does not search for bundles on the disk; it will locate
     * only bundles already loaded or otherwise known to the current process.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleGetAllBundles();

    /**
     * ===================== Creating Bundles =====================
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBundleGetTypeID();

    @Generated
    @CFunction
    public static native CFBundleRef CFBundleCreate(CFAllocatorRef allocator, CFURLRef bundleURL);

    /**
     * Might return an existing instance with the ref-count bumped.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCreateBundlesFromDirectory(CFAllocatorRef allocator, CFURLRef directoryURL,
            CFStringRef bundleType);

    /**
     * ==================== Basic Bundle Info ====================
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBundleURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFBundleGetValueForInfoDictionaryKey(CFBundleRef bundle, CFStringRef key);

    /**
     * Returns a localized value if available, otherwise the global value.
     * This is the recommended function for examining the info dictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetInfoDictionary(CFBundleRef bundle);

    /**
     * This is the global info dictionary. Note that CFBundle may add
     * extra keys to the dictionary for its own use.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetLocalInfoDictionary(CFBundleRef bundle);

    /**
     * This is the localized info dictionary.
     */
    @Generated
    @CFunction
    public static native void CFBundleGetPackageInfo(CFBundleRef bundle, IntPtr packageType, IntPtr packageCreator);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetIdentifier(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native int CFBundleGetVersionNumber(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetDevelopmentRegion(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySupportFilesDirectoryURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourcesDirectoryURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyPrivateFrameworksURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedFrameworksURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedSupportURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBuiltInPlugInsURL(CFBundleRef bundle);

    /**
     * ------------- Basic Bundle Info without a CFBundle instance -------------
     * This API is provided to enable developers to retrieve basic information
     * about a bundle without having to create an instance of CFBundle.
     * Because of caching behavior when a CFBundle instance exists, it will be faster
     * to actually create a CFBundle if you need to retrieve multiple pieces of info.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryInDirectory(CFURLRef bundleURL);

    @Generated
    @CFunction
    public static native byte CFBundleGetPackageInfoInDirectory(CFURLRef url, IntPtr packageType,
            IntPtr packageCreator);

    /**
     * ==================== Resource Handling API ====================
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURL(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfType(CFBundleRef bundle, CFStringRef resourceType,
            CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleCopyLocalizedString(CFBundleRef bundle, CFStringRef key, CFStringRef value,
            CFStringRef tableName);

    /**
     * ------------- Resource Handling without a CFBundle instance -------------
     * This API is provided to enable developers to use the CFBundle resource
     * searching policy without having to create an instance of CFBundle.
     * Because of caching behavior when a CFBundle instance exists, it will be faster
     * to actually create a CFBundle if you need to access several resources.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLInDirectory(CFURLRef bundleURL, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeInDirectory(CFURLRef bundleURL,
            CFStringRef resourceType, CFStringRef subDirName);

    /**
     * =========== Localization-specific Resource Handling API ===========
     * This API allows finer-grained control over specific localizations,
     * as distinguished from the above API, which always uses the user's
     * preferred localizations for the bundle in the current app context.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyBundleLocalizations(CFBundleRef bundle);

    /**
     * Lists the localizations that a bundle contains.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyPreferredLocalizationsFromArray(CFArrayRef locArray);

    /**
     * Given an array of possible localizations, returns the one or more
     * of them that CFBundle would use in the current application context.
     * To determine the localizations that would be used for a particular
     * bundle in the current application context, apply this function to the
     * result of CFBundleCopyBundleLocalizations().
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForPreferences(CFArrayRef locArray, CFArrayRef prefArray);

    /**
     * Given an array of possible localizations, returns the one or more of
     * them that CFBundle would use, without reference to the current application
     * context, if the user's preferred localizations were given by prefArray.
     * If prefArray is NULL, the current user's actual preferred localizations will
     * be used. This is not the same as CFBundleCopyPreferredLocalizationsFromArray(),
     * because that function takes the current application context into account.
     * To determine the localizations that another application would use, apply
     * this function to the result of CFBundleCopyBundleLocalizations().
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLForLocalization(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeForLocalization(CFBundleRef bundle,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    /**
     * =================== Unbundled application info =====================
     * This API is provided to enable developers to retrieve bundle-related
     * information about an application that may be bundled or unbundled.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryForURL(CFURLRef url);

    /**
     * For a directory URL, this is equivalent to CFBundleCopyInfoDictionaryInDirectory().
     * For a plain file URL representing an unbundled executable, this will attempt to read
     * an info dictionary from the (__TEXT, __info_plist) section, if it is a Mach-o file.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForURL(CFURLRef url);

    /**
     * For a directory URL, this is equivalent to calling CFBundleCopyBundleLocalizations()
     * on the corresponding bundle. For a plain file URL representing an unbundled executable,
     * this will attempt to determine its localizations using the CFBundleLocalizations and
     * CFBundleDevelopmentRegion keys in the dictionary returned by CFBundleCopyInfoDictionaryForURL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitecturesForURL(CFURLRef url);

    /**
     * ==================== Primitive Code Loading API ====================
     * This API abstracts the various different executable formats supported on
     * various platforms. It can load DYLD, CFM, or DLL shared libraries (on their
     * appropriate platforms) and gives a uniform API for looking up functions.
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyExecutableURL(CFBundleRef bundle);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitectures(CFBundleRef bundle);

    /**
     * If the bundle's executable exists and is a Mach-o file, this function will return an array
     * of CFNumbers whose values are integers representing the architectures the file provides.
     * The values currently in use are those listed in the enum above, but others may be added
     * in the future. If the executable is not a Mach-o file, this function returns NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte CFBundlePreflightExecutable(CFBundleRef bundle, Ptr<CFErrorRef> error);

    /**
     * This function will return true if the bundle is loaded, or if the bundle appears to be
     * loadable upon inspection. This does not mean that the bundle is definitively loadable,
     * since it may fail to load due to link errors or other problems not readily detectable.
     * If this function detects problems, it will return false, and return a CFError by reference.
     * It is the responsibility of the caller to release the CFError.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutableAndReturnError(CFBundleRef bundle, Ptr<CFErrorRef> error);

    /**
     * If the bundle is already loaded, this function will return true. Otherwise, it will attempt
     * to load the bundle, and it will return true if that attempt succeeds. If the bundle fails
     * to load, this function will return false, and it will return a CFError by reference.
     * It is the responsibility of the caller to release the CFError.
     */
    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutable(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native byte CFBundleIsExecutableLoaded(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native void CFBundleUnloadExecutable(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetFunctionPointerForName(CFBundleRef bundle, CFStringRef functionName);

    @Generated
    @CFunction
    public static native void CFBundleGetFunctionPointersForNames(CFBundleRef bundle, CFArrayRef functionNames,
            Ptr<VoidPtr> ftbl);

    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetDataPointerForName(CFBundleRef bundle, CFStringRef symbolName);

    @Generated
    @CFunction
    public static native void CFBundleGetDataPointersForNames(CFBundleRef bundle, CFArrayRef symbolNames,
            Ptr<VoidPtr> stbl);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyAuxiliaryExecutableURL(CFBundleRef bundle, CFStringRef executableName);

    /**
     * ==================== Getting a bundle's plugIn ====================
     */
    @Generated
    @CFunction
    public static native CFPlugInRef CFBundleGetPlugIn(CFBundleRef bundle);

    @Generated
    @CFunction
    @NUInt
    public static native long CFMessagePortGetTypeID();

    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateLocal(CFAllocatorRef allocator, CFStringRef name,
            @FunctionPtr(name = "call_CFMessagePortCreateLocal") Function_CFMessagePortCreateLocal callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateRemote(CFAllocatorRef allocator, CFStringRef name);

    @Generated
    @CFunction
    public static native byte CFMessagePortIsRemote(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native CFStringRef CFMessagePortGetName(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native byte CFMessagePortSetName(CFMessagePortRef ms, CFStringRef newName);

    @Generated
    @CFunction
    public static native void CFMessagePortGetContext(CFMessagePortRef ms,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context);

    @Generated
    @CFunction
    public static native void CFMessagePortInvalidate(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native byte CFMessagePortIsValid(CFMessagePortRef ms);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMessagePortGetInvalidationCallBack_ret")
    public static native Function_CFMessagePortGetInvalidationCallBack_ret CFMessagePortGetInvalidationCallBack(
            CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native void CFMessagePortSetInvalidationCallBack(CFMessagePortRef ms,
            @FunctionPtr(name = "call_CFMessagePortSetInvalidationCallBack") Function_CFMessagePortSetInvalidationCallBack callout);

    /**
     * NULL replyMode argument means no return value expected, don't wait for it
     */
    @Generated
    @CFunction
    public static native int CFMessagePortSendRequest(CFMessagePortRef remote, int msgid, CFDataRef data,
            double sendTimeout, double rcvTimeout, CFStringRef replyMode, Ptr<CFDataRef> returnData);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMessagePortCreateRunLoopSource(CFAllocatorRef allocator,
            CFMessagePortRef local, @NInt long order);

    /**
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFMessagePortSetDispatchQueue(CFMessagePortRef ms, NSObject queue);

    /**
     * ================= Creating PlugIns =================
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInGetTypeID();

    @Generated
    @CFunction
    public static native CFPlugInRef CFPlugInCreate(CFAllocatorRef allocator, CFURLRef plugInURL);

    /**
     * Might return an existing instance with the ref-count bumped.
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFPlugInGetBundle(CFPlugInRef plugIn);

    /**
     * ================= Controlling load on demand =================
     * For plugIns.
     * PlugIns that do static registration are load on demand by default.
     * PlugIns that do dynamic registration are not load on demand by default.
     * A dynamic registration function can call CFPlugInSetLoadOnDemand().
     */
    @Generated
    @CFunction
    public static native void CFPlugInSetLoadOnDemand(CFPlugInRef plugIn, byte flag);

    @Generated
    @CFunction
    public static native byte CFPlugInIsLoadOnDemand(CFPlugInRef plugIn);

    /**
     * This function finds all the factories from any plugin for the given type. Returns an array that the caller must
     * release.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInType(CFUUIDRef typeUUID);

    /**
     * This function restricts the result to factories from the given plug-in that can create the given type. Returns an
     * array that the caller must release.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInTypeInPlugIn(CFUUIDRef typeUUID, CFPlugInRef plugIn);

    /**
     * This function returns the IUnknown interface for the new instance.
     */
    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceCreate(CFAllocatorRef allocator, CFUUIDRef factoryUUID,
            CFUUIDRef typeUUID);

    /**
     * ================= Registering factories and types =================
     * For plugIn writers who must dynamically register things.
     * Functions to register factory functions and to associate factories with types.
     */
    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunction(CFUUIDRef factoryUUID,
            @FunctionPtr(name = "call_CFPlugInRegisterFactoryFunction") Function_CFPlugInRegisterFactoryFunction func);

    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunctionByName(CFUUIDRef factoryUUID, CFPlugInRef plugIn,
            CFStringRef functionName);

    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterFactory(CFUUIDRef factoryUUID);

    @Generated
    @CFunction
    public static native byte CFPlugInRegisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    /**
     * ================= Registering instances =================
     * When a new instance of a type is created, the instance is responsible for registering itself with the factory
     * that created it and unregistering when it deallocates.
     * This means that an instance must keep track of the CFUUIDRef of the factory that created it so it can unregister
     * when it goes away.
     */
    @Generated
    @CFunction
    public static native void CFPlugInAddInstanceForFactory(CFUUIDRef factoryID);

    @Generated
    @CFunction
    public static native void CFPlugInRemoveInstanceForFactory(CFUUIDRef factoryID);

    @Generated
    @CFunction
    public static native byte CFPlugInInstanceGetInterfaceFunctionTable(CFPlugInInstanceRef instance,
            CFStringRef interfaceName, Ptr<VoidPtr> ftbl);

    /**
     * This function returns a retained object on 10.8 or later.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFPlugInInstanceGetFactoryName(CFPlugInInstanceRef instance);

    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceGetInstanceData(CFPlugInInstanceRef instance);

    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInInstanceGetTypeID();

    @Generated
    @CFunction
    public static native CFPlugInInstanceRef CFPlugInInstanceCreateWithInstanceDataSize(CFAllocatorRef allocator,
            @NInt long instanceDataSize,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_2") Function_CFPlugInInstanceCreateWithInstanceDataSize_2 deallocateInstanceFunction,
            CFStringRef factoryName,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_4") Function_CFPlugInInstanceCreateWithInstanceDataSize_4 getInterfaceFunction);

    @Generated
    @CFunction
    @NUInt
    public static native long CFMachPortGetTypeID();

    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreate(CFAllocatorRef allocator,
            @FunctionPtr(name = "call_CFMachPortCreate") Function_CFMachPortCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreateWithPort(CFAllocatorRef allocator, int portNum,
            @FunctionPtr(name = "call_CFMachPortCreateWithPort") Function_CFMachPortCreateWithPort callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native int CFMachPortGetPort(CFMachPortRef port);

    @Generated
    @CFunction
    public static native void CFMachPortGetContext(CFMachPortRef port,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context);

    @Generated
    @CFunction
    public static native void CFMachPortInvalidate(CFMachPortRef port);

    @Generated
    @CFunction
    public static native byte CFMachPortIsValid(CFMachPortRef port);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMachPortGetInvalidationCallBack_ret")
    public static native Function_CFMachPortGetInvalidationCallBack_ret CFMachPortGetInvalidationCallBack(
            CFMachPortRef port);

    @Generated
    @CFunction
    public static native void CFMachPortSetInvalidationCallBack(CFMachPortRef port,
            @FunctionPtr(name = "call_CFMachPortSetInvalidationCallBack") Function_CFMachPortSetInvalidationCallBack callout);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMachPortCreateRunLoopSource(CFAllocatorRef allocator, CFMachPortRef port,
            @NInt long order);

    /**
     * [@function] CFAttributedStringGetTypeID
     * Returns the type identifier of all CFAttributedString instances.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFAttributedStringGetTypeID();

    /**
     * [@function] CFAttributedStringCreate
     * Creates an attributed string with the specified string and attributes (both copied).
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreate(CFAllocatorRef alloc, CFStringRef str,
            CFDictionaryRef attributes);

    /**
     * [@function] CFAttributedStringCreateWithSubstring
     * Creates a sub-attributed string from the specified range. It's a programming error for range to specify
     * characters outside the bounds of aStr.
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateWithSubstring(CFAllocatorRef alloc,
            CFAttributedStringRef aStr, @ByValue CFRange range);

    /**
     * [@function] CFAttributedStringCreateCopy
     * Creates an immutable attributed string copy.
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateCopy(CFAllocatorRef alloc,
            CFAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringGetString
     * Returns the string for the attributed string. For performance reasons, this will often point at the backing store
     * of the attributed string, and it might change if the attributed string is edited. However, this is an
     * implementation detail, and definitely not something that should be counted on.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFAttributedStringGetString(CFAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringGetLength
     * Returns the length of the attributed string in characters; same as
     * CFStringGetLength(CFAttributedStringGetString(aStr))
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFAttributedStringGetLength(CFAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringGetAttributes
     * Returns the attributes at the specified location. If effectiveRange is not NULL, upon return *effectiveRange
     * contains a range over which the exact same set of attributes apply. Note that for performance reasons, the
     * returned effectiveRange is not necessarily the maximal range - for that, use
     * CFAttributedStringGetAttributesAndLongestEffectiveRange(). It's a programming error for loc to specify a location
     * outside the bounds of the attributed string.
     * 
     * Note that the returned attribute dictionary might change in unpredictable ways from under the caller if the
     * attributed string is edited after this call. If you wish to hang on to the dictionary long-term, you should make
     * an actual copy of it rather than just retaining it. Also, no assumptions should be made about the relationship of
     * the actual CFDictionaryRef returned by this call and the dictionary originally used to set the attributes, other
     * than the fact that the values stored in the dictionary will be identical (that is, ==) to those originally
     * specified.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributes(CFAttributedStringRef aStr, @NInt long loc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    /**
     * [@function] CFAttributedStringGetAttribute
     * Returns the value of a single attribute at the specified location. If the specified attribute doesn't exist at
     * the location, returns NULL. If effectiveRange is not NULL, upon return *effectiveRange contains a range over
     * which the exact same attribute value applies. Note that for performance reasons, the returned effectiveRange is
     * not necessarily the maximal range - for that, use CFAttributedStringGetAttributeAndLongestEffectiveRange(). It's
     * a programming error for loc to specify a location outside the bounds of the attributed string.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttribute(CFAttributedStringRef aStr, @NInt long loc,
            CFStringRef attrName,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    /**
     * [@function] CFAttributedStringGetAttributesAndLongestEffectiveRange
     * Returns the attributes at the specified location. If longestEffectiveRange is not NULL, upon return
     * *longestEffectiveRange contains the maximal range within inRange over which the exact same set of attributes
     * apply. The returned range is clipped to inRange. It's a programming error for loc or inRange to specify locations
     * outside the bounds of the attributed string.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributesAndLongestEffectiveRange(
            CFAttributedStringRef aStr, @NInt long loc, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    /**
     * [@function] CFAttributedStringGetAttributeAndLongestEffectiveRange
     * Returns the value of a single attribute at the specified location. If longestEffectiveRange is not NULL, upon
     * return *longestEffectiveRange contains the maximal range within inRange over which the exact same attribute value
     * applies. The returned range is clipped to inRange. It's a programming error for loc or inRange to specify
     * locations outside the bounds of the attributed string.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttributeAndLongestEffectiveRange(CFAttributedStringRef aStr,
            @NInt long loc, CFStringRef attrName, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    /**
     * [@function] CFAttributedStringCreateMutableCopy
     * Creates a mutable attributed string copy. maxLength, if not 0, is a hard bound on the length of the attributed
     * string; exceeding this size limit during any editing operation is a programming error. If 0, there is no limit on
     * the length.
     */
    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutableCopy(CFAllocatorRef alloc,
            @NInt long maxLength, CFAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringCreateMutable
     * Creates a mutable empty attributed string. maxLength, if not 0, is a hard bound on the length of the attributed
     * string; exceeding this size limit during any editing operation is a programming error. If 0, there is no limit on
     * the length.
     */
    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutable(CFAllocatorRef alloc,
            @NInt long maxLength);

    /**
     * [@function] CFAttributedStringReplaceString
     * Modifies the string for the attributed string, much like CFStringReplace(). It's an error for range to specify
     * characters outside the bounds of aStr.
     * 
     * (Note: This function is a convenience on CFAttributedStringGetMutableString(); however, until
     * CFAttributedStringGetMutableString() is implemented, it remains the only way to edit the string of the attributed
     * string.)
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceString(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef replacement);

    /**
     * [@function] CFAttributedStringGetMutableString
     * Gets the string for the attributed string as a mutable string, allowing editing the character contents of the
     * string as if it were an CFMutableString. Attributes corresponding to the edited range are appropriately modified.
     * If, as a result of the edit, new characters are introduced into the string, they inherit the attributes of the
     * first replaced character from range. If no existing characters are replaced by the edit, the new characters
     * inherit the attributes of the character preceding range if it has any, otherwise of the character following
     * range. If the initial string is empty, the attributes for the new characters are also empty.
     * 
     * (Note: This function is not yet implemented and will return NULL except for toll-free bridged instances.)
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFAttributedStringGetMutableString(CFMutableAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringSetAttributes
     * Sets the value of multiple attributes over the specified range, which should be valid. If clearOtherAttributes is
     * false, existing attributes (which aren't being replaced) are left alone; otherwise they are cleared. The
     * dictionary should be setup for "usual" CF type usage --- CFString keys, and arbitrary CFType values. Note that
     * after this call, further mutations to the replacement dictionary argument by the caller will not affect the
     * contents of the attributed string.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttributes(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFDictionaryRef replacement, byte clearOtherAttributes);

    /**
     * [@function] CFAttributedStringSetAttribute
     * Sets the value of a single attribute over the specified range, which should be valid. value should not be NULL.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttribute(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef attrName, ConstVoidPtr value);

    /**
     * [@function] CFAttributedStringRemoveAttribute
     * Removes the value of a single attribute over the specified range, which should be valid. It's OK for the
     * attribute not the exist over the specified range.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringRemoveAttribute(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFStringRef attrName);

    /**
     * [@function] CFAttributedStringReplaceAttributedString
     * Replaces the attributed substring over the specified range with the attributed string specified in replacement.
     * range should be valid. To delete a range of the attributed string, call CFAttributedStringReplaceString() with
     * empty string and specified range.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceAttributedString(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFAttributedStringRef replacement);

    /**
     * [@function] CFAttributedStringBeginEditing
     * In cases where attributed string might do a bunch of work to assure self-consistency,
     * CFAttributedStringBeginEditing/CFAttributedStringEndEditing allow disabling that to allow deferring and
     * coalescing any work. It's a good idea to call these around a set of related mutation calls which don't require
     * the string to be in consistent state in between. These calls can be nested.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringBeginEditing(CFMutableAttributedStringRef aStr);

    /**
     * [@function] CFAttributedStringEndEditing
     * In cases where attributed string might do a bunch of work to assure self-consistency,
     * CFAttributedStringBeginEditing/CFAttributedStringEndEditing allow disabling that to allow deferring and
     * coalescing any work. It's a good idea to call these around a set of related mutation calls which don't require
     * the string to be in consistent state in between. These calls can be nested.
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringEndEditing(CFMutableAttributedStringRef aStr);

    /**
     * CFURLEnumeratorGetTypeID - Returns the CFURLEnumerator CFTypeID.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFURLEnumeratorGetTypeID();

    /**
     * CFURLEnumeratorCreateForDirectoryURL - Creates a directory enumerator, flat or recursive. Client specifies the
     * directory URL to enumerate, a bit array of options, and an optional array of property keys to pre-fetch for the
     * found URLs. Specifying pre-fetch properties allows the implementation to optimize device access by using bulk
     * operations when available. Pre-fetching more properties than are actually needed may degrade performance.
     * 
     * A directory enumerator generates URLs with the same type as the directory URL being enumerated. If the
     * directoryURL input parameter is a file reference URL, then generated URLs will be file reference URLs. If the
     * directoryURL input parameter is a file path URL, then generated URLs will be file path URLs.
     * 
     * The kCFURLEnumeratorGenerateFileReferenceURLs option is ignored by CFURLEnumeratorCreateForDirectoryURL.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFURLEnumeratorRef CFURLEnumeratorCreateForDirectoryURL(CFAllocatorRef alloc,
            CFURLRef directoryURL, @NUInt long option, CFArrayRef propertyKeys);

    /**
     * CFURLEnumeratorCreateForMountedVolumes - Creates an enumerator for mounted filesystem volumes. Client specifies
     * an allocator, a bit array of options, and an optional array of property keys to pre-fetch for the volume URLs.
     * Specifying pre-fetch properties allows the implementation to optimize device access by using bulk operations when
     * available. Pre-fetching more properties than are actually needed may degrade performance.
     * 
     * A volume enumerator generates file path URLs. If you want a volume enumerator to generate file reference URLs,
     * pass the kCFURLEnumeratorGenerateFileReferenceURLs option.
     * 
     * The kCFURLEnumeratorDescendRecursively and kCFURLEnumeratorSkipPackageContents options are ignored by
     * CFURLEnumeratorCreateForMountedVolumes.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native CFURLEnumeratorRef CFURLEnumeratorCreateForMountedVolumes(CFAllocatorRef alloc,
            @NUInt long option, CFArrayRef propertyKeys);

    /**
     * CFURLEnumeratorGetNextURL - Advances the enumerator. If kCFURLEnumeratorSuccess is returned, the url output
     * parameter returns the next URL found. If kCFURLEnumeratorError is returned, an error has occured and the error
     * output parameter describes the error. If kCFURLEnumeratorEnd, the enumeration is finished.
     * 
     * The url output parameter, if returned, is not retained. The error output parameter, if returned, is retained and
     * must be released.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFURLEnumeratorGetNextURL(CFURLEnumeratorRef enumerator, Ptr<CFURLRef> url,
            Ptr<CFErrorRef> error);

    /**
     * CFURLEnumeratorSkipDescendents - Tells a recursive CFURLEnumerator not to descend into the directory of the last
     * CFURLRef returned by CFURLEnumeratorGetNextURL.
     * 
     * Calls to CFURLEnumeratorSkipDescendents are ignored if:
     * * CFURLEnumeratorGetNextURL has never been called with the CFURLEnumerator.
     * * The last CFURL returned by CFURLEnumeratorGetNextURL is not a directory.
     * * The CFURLEnumerator was not created with CFURLEnumeratorCreateForDirectoryURL using the
     * kCFURLEnumeratorDescendRecursively option.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CFURLEnumeratorSkipDescendents(CFURLEnumeratorRef enumerator);

    /**
     * CFURLEnumeratorGetDescendentLevel - Returns the number of levels a directory enumerator has descended down into
     * the directory hierarchy from the starting directory. The children of the starting directory are at level 1. Each
     * time a recursive enumerator descends into a subdirectory, it adds one to the descendent level. It then subtracts
     * one from the level when it finishes a subdirectory and continues enumerating the parent directory.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFURLEnumeratorGetDescendentLevel(CFURLEnumeratorRef enumerator);

    /**
     * CFURLEnumeratorGetSourceDidChange is deprecated. If your program is interested in directory hierarchy changes
     * during enumeration (and most programs are not interested), you should use the File System Events API.
     * 
     * CFURLEnumeratorGetSourceDidChange does nothing and always returns false.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 5.0
     * Deprecated-Message: Use File System Events API instead
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLEnumeratorGetSourceDidChange(CFURLEnumeratorRef enumerator);

    /**
     * Returns the type identifier for the CFFileSecurity opaque type.
     * 
     * Return Value
     * The type identifier for the CFFileSecurity opaque type.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFFileSecurityGetTypeID();

    /**
     * Creates an CFFileSecurity object.
     * 
     * Parameters
     * allocator
     * The allocator to use to allocate memory for the new object. Pass
     * NULL or kCFAllocatorDefault to use the current default allocator.
     * Return Value
     * A new CFFileSecurity object, or NULL if there was a problem creating the
     * object. Ownership follows the Create Rule.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreate(CFAllocatorRef allocator);

    /**
     * Creates a copy of a CFFileSecurity object.
     * 
     * Parameters
     * allocator
     * The allocator to use to allocate memory for the new object. Pass
     * NULL or kCFAllocatorDefault to use the current default allocator.
     * fileSec
     * The CFFileSecurity object to copy.
     * Return Value
     * A copy of fileSec, or NULL if there was a problem creating the object.
     * Ownership follows the Create Rule.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreateCopy(CFAllocatorRef allocator,
            CFFileSecurityRef fileSec);

    /**
     * This routine copies the owner UUID associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * ownerUUID
     * A pointer to storage for the owner UUID.
     * Return Value
     * true if ownerUUID is successfully returned; false if there is no owner
     * UUID property associated with an CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyOwnerUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> ownerUUID);

    /**
     * This routine sets the owner UUID associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * ownerUUID
     * The owner UUID.
     * Return Value
     * true if the owner UUID was successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwnerUUID(CFFileSecurityRef fileSec, CFUUIDRef ownerUUID);

    /**
     * This routine copies the group UUID associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * groupUUID
     * A pointer to storage for the group UUID.
     * Return Value
     * true if groupUUID is successfully returned; false if there is no group
     * UUID property associated with an CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyGroupUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> groupUUID);

    /**
     * This routine sets the group UUID associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * groupUUID
     * The group UUID.
     * Return Value
     * true if the group UUID was successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroupUUID(CFFileSecurityRef fileSec, CFUUIDRef groupUUID);

    /**
     * This routine copies the access control list (acl_t) associated with an
     * CFFileSecurity object. The acl_t returned by this routine is a copy and must
     * be released using acl_free(3). The acl_t is meant to be manipulated using
     * the acl calls defined in <sys/acl.h>.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * accessControlList
     * A pointer to storage for an acl_t. The acl_t be released using
     * acl_free(3)
     * Return Value
     * true if the access control list is successfully copied; false if there is
     * no access control list property associated with the CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyAccessControlList(CFFileSecurityRef fileSec,
            Ptr<acl_t> accessControlList);

    /**
     * This routine will set the access control list (acl_t) associated with an
     * CFFileSecurityRef. To request removal of an access control list from a
     * filesystem object, pass in kCFFileSecurityRemoveACL as the acl_t and set
     * the fileSec on the target object using CFURLSetResourcePropertyForKey and
     * the kCFURLFileSecurityKey. Setting the accessControlList to NULL will result
     * in the property being unset.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * accessControlList
     * The acl_t to set, or kCFFileSecurityRemoveACL to remove the access
     * control list, or NULL to unset the accessControlList.
     * Return Value
     * true if the access control list is successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetAccessControlList(CFFileSecurityRef fileSec, acl_t accessControlList);

    /**
     * This routine gets the owner uid_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * A pointer to where the owner uid_t will be put.
     * Return Value
     * true if owner uid_t is successfully obtained; false if there is no owner
     * property associated with an CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetOwner(CFFileSecurityRef fileSec, IntPtr owner);

    /**
     * This routine sets the owner uid_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * The owner uid_t.
     * Return Value
     * true if the owner uid_t was successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwner(CFFileSecurityRef fileSec, int owner);

    /**
     * This routine gets the group gid_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * A pointer to where the group gid_t will be put.
     * Return Value
     * true if group gid_t is successfully obtained; false if there is no group
     * property associated with an CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetGroup(CFFileSecurityRef fileSec, IntPtr group);

    /**
     * This routine sets the group gid_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * The group gid_t.
     * Return Value
     * true if the group gid_t was successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroup(CFFileSecurityRef fileSec, int group);

    /**
     * This routine gets the mode_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * A pointer to where the mode_t will be put.
     * Return Value
     * true if mode_t is successfully obtained; false if there is no mode
     * property associated with an CFFileSecurity object.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetMode(CFFileSecurityRef fileSec, CharPtr mode);

    /**
     * This routine sets the mode_t associated with an CFFileSecurity object.
     * 
     * Parameters
     * fileSec
     * The CFFileSecurity object.
     * owner
     * The mode_t.
     * Return Value
     * true if the mode_t was successfully set; otherwise, false.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetMode(CFFileSecurityRef fileSec, char mode);

    /**
     * This routine clears file security properties in the CFFileSecurity object.
     * 
     * Parameters
     * clearPropertyMask
     * The file security properties to clear.
     * Return Value
     * true if the file security properties were successfully cleared; otherwise, false.
     * 
     * API-Since: 6.0
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityClearProperties(CFFileSecurityRef fileSec, @NUInt long clearPropertyMask);

    /**
     * [@function] CFStringTokenizerCopyBestStringLanguage
     * 
     * Guesses the language of a string and returns the BCP 47 string of the
     * language.
     * 
     * The result is not guaranteed to be accurate. Typically 200-400
     * characters are required to reliably guess the language of a string.
     * 
     * API-Since: 3.0
     * 
     * @param string The string whose language is to be guessed.
     * @param range  The range of characters in string whose language to be
     *               guessed. The specified range must not exceed the bounds of the string.
     * @return A language represented in BCP 47 string. NULL is returned either if
     *         string is NULL, the location of range is negative, the length of range
     *         is 0, or the language of the string cannot be guessed.
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringTokenizerCopyBestStringLanguage(CFStringRef string,
            @ByValue CFRange range);

    /**
     * [@function] CFStringTokenizerGetTypeID
     * 
     * Get the type identifier.
     * 
     * @return the type identifier of all CFStringTokenizer instances.
     * 
     *         API-Since: 3.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGetTypeID();

    /**
     * [@function] CFStringTokenizerCreate
     * 
     * Creates a tokenizer instance.
     * 
     * @param alloc   The CFAllocator which should be used to allocate memory for the
     *                tokenizer and its storage for values. This parameter may be NULL in which
     *                case the current default CFAllocator is used.
     * @param string  The string to tokenize.
     * @param range   The range of characters within the string to be tokenized. The
     *                specified range must not exceed the length of the string.
     * @param options Use one of the Tokenization Unit options to specify how the
     *                string should be tokenized. Optionally specify one or more attribute
     *                specifiers to tell the tokenizer to prepare specified attributes when it
     *                tokenizes the string.
     * @param locale  The locale to specify language or region specific behavior. Pass
     *                NULL if you want tokenizer to identify the locale automatically.
     * @return A reference to the new CFStringTokenizer.
     * 
     *         API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native CFStringTokenizerRef CFStringTokenizerCreate(CFAllocatorRef alloc, CFStringRef string,
            @ByValue CFRange range, @NUInt long options, CFLocaleRef locale);

    /**
     * [@function] CFStringTokenizerSetString
     * 
     * Set the string to tokenize.
     * 
     * @param tokenizer The reference to CFStringTokenizer returned by
     *                  CFStringTokenizerCreate.
     * @param string    The string to tokenize.
     * @param range     The range of characters within the string to be tokenized. The
     *                  specified range must not exceed the length of the string.
     * 
     *                  API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native void CFStringTokenizerSetString(CFStringTokenizerRef tokenizer, CFStringRef string,
            @ByValue CFRange range);

    /**
     * [@function] CFStringTokenizerGoToTokenAtIndex
     * 
     * Random access to a token. Find a token that includes the character specified
     * by character index, and set it as the current token.
     * 
     * The range and attribute of the token can be obtained by calling
     * CFStringTokenizerGetCurrentTokenRange and CFStringTokenizerCopyCurrentTokenAttribute.
     * If the token is a compound (with type kCFStringTokenizerTokenHasSubTokensMask or
     * kCFStringTokenizerTokenHasDerivedSubTokensMask), its subtokens and
     * (or) derived subtokens can be obtained by calling CFStringTokenizerGetCurrentSubTokens.
     * 
     * API-Since: 3.0
     * 
     * @param tokenizer The reference to CFStringTokenizer returned by
     *                  CFStringTokenizerCreate.
     * @param index     The index of the Unicode character in the CFString.
     * @return Type of the token if succeeded in finding a token and setting it as
     *         current token. kCFStringTokenizerTokenNone if failed in finding a token.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGoToTokenAtIndex(CFStringTokenizerRef tokenizer, @NInt long index);

    /**
     * [@function] CFStringTokenizerAdvanceToNextToken
     * 
     * Token enumerator.
     * 
     * If there is no preceding call to CFStringTokenizerGoToTokenAtIndex
     * or CFStringTokenizerAdvanceToNextToken, it finds the first token in the range
     * specified to CFStringTokenizerCreate. If there is a current token after successful
     * call to CFStringTokenizerGoToTokenAtIndex or CFStringTokenizerAdvanceToNextToken,
     * it proceeds to the next token. If succeeded in finding a token, set it as current
     * token and return its token type. Otherwise invalidate current token and return
     * kCFStringTokenizerTokenNone.
     * The range and attribute of the token can be obtained by calling
     * CFStringTokenizerGetCurrentTokenRange and
     * CFStringTokenizerCopyCurrentTokenAttribute. If the token is a compound
     * (with type kCFStringTokenizerTokenHasSubTokensMask or
     * kCFStringTokenizerTokenHasDerivedSubTokensMask), its subtokens and
     * (or) derived subtokens can be obtained by calling CFStringTokenizerGetCurrentSubTokens.
     * 
     * API-Since: 3.0
     * 
     * @param tokenizer The reference to CFStringTokenizer returned by
     *                  CFStringTokenizerCreate.
     * @return Type of the token if succeeded in finding a token and setting it as
     *         current token. kCFStringTokenizerTokenNone if failed in finding a token.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerAdvanceToNextToken(CFStringTokenizerRef tokenizer);

    /**
     * [@function] CFStringTokenizerGetCurrentTokenRange
     * 
     * Returns the range of current token.
     * 
     * @param tokenizer The reference to CFStringTokenizer returned by
     *                  CFStringTokenizerCreate.
     * @return Range of current token, or {kCFNotFound,0} if there is no current token.
     * 
     *         API-Since: 3.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringTokenizerGetCurrentTokenRange(CFStringTokenizerRef tokenizer);

    /**
     * [@function] CFStringTokenizerCopyCurrentTokenAttribute
     * 
     * Copies the specified attribute of current token.
     * 
     * @param tokenizer The reference to CFStringTokenizer returned by
     *                  CFStringTokenizerCreate.
     * @param attribute Specify a token attribute you want to obtain. The value is
     *                  one of kCFStringTokenizerAttributeLatinTranscription or
     *                  kCFStringTokenizerAttributeLanguage.
     * @return Token attribute, or NULL if current token does not have the specified
     *         attribute or if there is no current token.
     * 
     *         API-Since: 3.0
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFStringTokenizerCopyCurrentTokenAttribute(CFStringTokenizerRef tokenizer,
            @NUInt long attribute);

    /**
     * [@function] CFStringTokenizerGetCurrentSubTokens
     * 
     * Retrieves the subtokens or derived subtokens contained in the compound token.
     * 
     * If token type is kCFStringTokenizerTokenNone, the ranges array and
     * derivedSubTokens array are untouched and the return value is 0.
     * If token type is kCFStringTokenizerTokenNormal, the ranges array has one item
     * filled in with the entire range of the token (if maxRangeLength >= 1) and a string
     * taken from the entire token range is added to the derivedSubTokens array and the
     * return value is 1.
     * If token type is kCFStringTokenizerTokenHasSubTokensMask or
     * kCFStringTokenizerTokenHasDerivedSubTokensMask, the ranges array is filled
     * in with as many items as there are subtokens (up to a limit of maxRangeLength).
     * The derivedSubTokens array will have sub tokens added even when the sub token is a
     * substring of the token. If token type is kCFStringTokenizerTokenHasSubTokensMask,
     * the ordinary non-derived subtokens are added to the derivedSubTokens array.
     * 
     * API-Since: 3.0
     * 
     * @param tokenizer        The reference to CFStringTokenizer returned by CFStringTokenizerCreate.
     * @param ranges           An array of CFRange to fill in with the ranges of subtokens. The filled in
     *                         ranges are relative to the string specified to CFStringTokenizerCreate. This parameter
     *                         can be NULL.
     * @param maxRangeLength   The maximum number of ranges to return.
     * @param derivedSubTokens An array of CFMutableArray to which the derived subtokens are to
     *                         be added. This parameter can be NULL.
     * @return number of subtokens.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringTokenizerGetCurrentSubTokens(CFStringTokenizerRef tokenizer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange ranges,
            @NInt long maxRangeLength, CFMutableArrayRef derivedSubTokens);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFFileDescriptorGetTypeID();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFFileDescriptorRef CFFileDescriptorCreate(CFAllocatorRef allocator, int fd,
            byte closeOnInvalidate,
            @FunctionPtr(name = "call_CFFileDescriptorCreate") Function_CFFileDescriptorCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CFFileDescriptorGetNativeDescriptor(CFFileDescriptorRef f);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorGetContext(CFFileDescriptorRef f,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorEnableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorDisableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorInvalidate(CFFileDescriptorRef f);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte CFFileDescriptorIsValid(CFFileDescriptorRef f);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFFileDescriptorCreateRunLoopSource(CFAllocatorRef allocator,
            CFFileDescriptorRef f, @NInt long order);

    @Generated
    @CVariable()
    public static native double kCFCoreFoundationVersionNumber();

    /**
     * the singleton null instance
     */
    @Generated
    @CVariable()
    public static native CFNullRef kCFNull();

    /**
     * This is a synonym for NULL, if you'd rather use a named constant.
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorDefault();

    /**
     * Default system allocator; you rarely need to use this.
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorSystemDefault();

    /**
     * This allocator uses malloc(), realloc(), and free(). This should not be
     * generally used; stick to kCFAllocatorDefault whenever possible. This
     * allocator is useful as the "bytesDeallocator" in CFData or
     * "contentsDeallocator" in CFString where the memory was obtained as a
     * result of malloc() type functions.
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorMalloc();

    /**
     * This allocator explicitly uses the default malloc zone, returned by
     * malloc_default_zone(). It should only be used when an object is
     * safe to be allocated in non-scanned memory.
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorMallocZone();

    /**
     * Null allocator which does nothing and allocates no memory. This allocator
     * is useful as the "bytesDeallocator" in CFData or "contentsDeallocator"
     * in CFString where the memory should not be freed.
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorNull();

    /**
     * Special allocator argument to CFAllocatorCreate() which means
     * "use the functions given in the context to allocate the allocator
     * itself as well".
     */
    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorUseContext();

    /**
     * [@constant] kCFTypeDictionaryKeyCallBacks
     * Predefined CFDictionaryKeyCallBacks structure containing a
     * set of callbacks appropriate for use when the keys of a
     * CFDictionary are all CFTypes.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryKeyCallBacks kCFTypeDictionaryKeyCallBacks();

    /**
     * [@constant] kCFCopyStringDictionaryKeyCallBacks
     * Predefined CFDictionaryKeyCallBacks structure containing a
     * set of callbacks appropriate for use when the keys of a
     * CFDictionary are all CFStrings, which may be mutable and
     * need to be copied in order to serve as constant keys for
     * the values in the dictionary.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryKeyCallBacks kCFCopyStringDictionaryKeyCallBacks();

    /**
     * [@constant] kCFTypeDictionaryValueCallBacks
     * Predefined CFDictionaryValueCallBacks structure containing a set
     * of callbacks appropriate for use when the values in a CFDictionary
     * are all CFTypes.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryValueCallBacks kCFTypeDictionaryValueCallBacks();

    /**
     * [@constant] kCFTypeArrayCallBacks
     * Predefined CFArrayCallBacks structure containing a set of callbacks
     * appropriate for use when the values in a CFArray are all CFTypes.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFArrayCallBacks kCFTypeArrayCallBacks();

    /**
     * Returns the display name for the given value. The key tells what
     * the value is, and is one of the usual locale property keys, though
     * not all locale property keys have values with display name values.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrentLocaleDidChangeNotification();

    /**
     * Locale Keys
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleLanguageCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleScriptCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleVariantCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleExemplarCharacterSet();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCalendarIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCollationIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleUsesMetricSystem();

    /**
     * "Metric", "U.S." or "U.K."
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleMeasurementSystem();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleDecimalSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleGroupingSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrencySymbol();

    /**
     * ISO 3-letter currency code
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrencyCode();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCollatorIdentifier();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleQuotationBeginDelimiterKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleQuotationEndDelimiterKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleAlternateQuotationBeginDelimiterKey();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleAlternateQuotationEndDelimiterKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFGregorianCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBuddhistCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFChineseCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHebrewCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicCivilCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFJapaneseCalendar();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFRepublicOfChinaCalendar();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFPersianCalendar();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFIndianCalendar();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFISO8601Calendar();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicTabularCalendar();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicUmmAlQuraCalendar();

    /**
     * Transform identifiers for CFStringTransform()
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformStripCombiningMarks();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToLatin();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformFullwidthHalfwidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinKatakana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHiragana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformHiraganaKatakana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformMandarinLatin();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHangul();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinArabic();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHebrew();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinThai();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinCyrillic();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinGreek();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToXMLHex();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToUnicodeName();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformStripDiacritics();

    /**
     * Predefined domains; value of "code" will correspond to preexisting values in these domains.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainPOSIX();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainOSStatus();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainMach();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCocoa();

    /**
     * Key to identify the end user-presentable description in userInfo. Should be one or more complete sentence(s)
     * describing both what failed and why. For instance 'You can't save the file "To Do List" because the volume
     * "Macintosh HD" is out of space.'
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedDescriptionKey();

    /**
     * Key to identify the end user-presentable failure reason ("why it failed") description in userInfo. Should be one
     * or more complete sentence(s), for instance 'The volume "Macintosh HD" is out of space.'
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedFailureReasonKey();

    /**
     * Key to identify the end user-presentable recovery suggestion in userInfo. Should be one or more complete
     * sentence(s), for instance 'Remove some files from the volume, and then try again.'
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedRecoverySuggestionKey();

    /**
     * Key to identify the description in the userInfo dictionary. Should be a complete sentence if possible. Should not
     * contain domain name or error code.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDescriptionKey();

    /**
     * Key to identify the underlying error in userInfo.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorUnderlyingErrorKey();

    /**
     * Key to identify associated URL in userInfo. Typically one of this or kCFErrorFilePathKey is provided.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorURLKey();

    /**
     * Key to identify associated file path in userInfo. Typically one of this or kCFErrorURLKey is provided.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorFilePathKey();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLKeysOfUnsetValuesKey();

    /**
     * Properties of File System Resources
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLNameKey();

    /**
     * The resource name provided by the file system (Read-write, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedNameKey();

    /**
     * Localized or extension-hidden name as displayed to users (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsRegularFileKey();

    /**
     * True for regular files (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsDirectoryKey();

    /**
     * True for directories (Read-only, CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsSymbolicLinkKey();

    /**
     * True for symlinks (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsVolumeKey();

    /**
     * True for the root directory of a volume (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsPackageKey();

    /**
     * True for packaged directories (Read-only 10_6 and 10_7, read-write 10_8, value type CFBoolean). Note: You can
     * only set or clear this property on directories; if you try to set this property on non-directory objects, the
     * property is ignored. If the directory is a package for some other reason (extension type, etc), setting this
     * property to false will have no effect.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsApplicationKey();

    /**
     * True if the resource is scriptable. Only applies to applications. (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsSystemImmutableKey();

    /**
     * True for system-immutable resources (Read-write, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsUserImmutableKey();

    /**
     * True for user-immutable resources (Read-write, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsHiddenKey();

    /**
     * True for resources normally not displayed to users (Read-write, value type CFBoolean). Note: If the resource is a
     * hidden because its name starts with a period, setting this property to false will not change the property.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHasHiddenExtensionKey();

    /**
     * True for resources whose filename extension is removed from the localized name property (Read-write, value type
     * CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLCreationDateKey();

    /**
     * The date the resource was created (Read-write, value type CFDate)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLContentAccessDateKey();

    /**
     * The date the resource was last accessed (Read-write, value type CFDate)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLContentModificationDateKey();

    /**
     * The time the resource content was last modified (Read-write, value type CFDate)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLAttributeModificationDateKey();

    /**
     * True if the file has sparse regions. (CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLinkCountKey();

    /**
     * Number of hard links to the resource (Read-only, value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLParentDirectoryURLKey();

    /**
     * The resource's parent directory, if any (Read-only, value type CFURL)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeURLKey();

    /**
     * URL of the volume on which the resource is stored (Read-only, value type CFURL)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use NSURLContentTypeKey instead
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTypeIdentifierKey();

    /**
     * Uniform type identifier (UTI) for the resource (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedTypeDescriptionKey();

    /**
     * User-visible type or "kind" description (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLabelNumberKey();

    /**
     * The label number assigned to the resource (Read-write, value type CFNumber)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use NSURLLabelColorKey
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLabelColorKey();

    /**
     * not implemented
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedLabelKey();

    /**
     * The user-visible label text (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use NSURLEffectiveIconKey
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLEffectiveIconKey();

    /**
     * not implemented
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use NSURLCustomIconKey
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLCustomIconKey();

    /**
     * not implemented
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceIdentifierKey();

    /**
     * An identifier which can be used to compare two file system objects for equality using CFEqual (i.e, two object
     * identifiers are equal if they have the same file system path or if the paths are linked to same inode on the same
     * file system). This identifier is not persistent across system restarts. (Read-only, value type CFType)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIdentifierKey();

    /**
     * An identifier that can be used to identify the volume the file system object is on. Other objects on the same
     * volume will have the same volume identifier and can be compared using for equality using CFEqual. This identifier
     * is not persistent across system restarts. (Read-only, value type CFType)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLPreferredIOBlockSizeKey();

    /**
     * The optimal block size when reading or writing this file's data, or NULL if not available. (Read-only, value type
     * CFNumber)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsReadableKey();

    /**
     * true if this process (as determined by EUID) can read the resource. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsWritableKey();

    /**
     * true if this process (as determined by EUID) can write to the resource. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsExecutableKey();

    /**
     * true if this process (as determined by EUID) can execute a file resource or search a directory resource.
     * (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileSecurityKey();

    /**
     * The file system object's security information encapsulated in a CFFileSecurity object. (Read-write, value type
     * CFFileSecurity)
     * 
     * API-Since: 5.1
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsExcludedFromBackupKey();

    /**
     * The array of Tag names (Read-write, value type CFArray of CFString)
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLPathKey();

    /**
     * the URL's path as a file system path (Read-only, value type CFString)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLCanonicalPathKey();

    /**
     * the URL's path as a canonical absolute file system path (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsMountTriggerKey();

    /**
     * true if this URL is a file system trigger directory. Traversing or opening a file system trigger will cause an
     * attempt to mount a file system on the trigger directory. (Read-only, value type CFBoolean)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLGenerationIdentifierKey();

    /**
     * An opaque generation identifier which can be compared using CFEqual() to determine if the data in a document has
     * been modified. For URLs which refer to the same file inode, the generation identifier will change when the data
     * in the file's data fork is changed (changes to extended attributes or other file system metadata do not change
     * the generation identifier). For URLs which refer to the same directory inode, the generation identifier will
     * change when direct children of that directory are added, removed or renamed (changes to the data of the direct
     * children of that directory will not change the generation identifier). The generation identifier is persistent
     * across system restarts. The generation identifier is tied to a specific document on a specific volume and is not
     * transferred when the document is copied to another volume. This property is not supported by all volumes.
     * (Read-only, value type CFType)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLDocumentIdentifierKey();

    /**
     * The document identifier -- a value assigned by the kernel to a document (which can be either a file or directory)
     * and is used to identify the document regardless of where it gets moved on a volume. The document identifier
     * survives "safe save” operations; i.e it is sticky to the path it was assigned to
     * (-replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error: is the preferred safe-save API).
     * The document identifier is persistent across system restarts. The document identifier is not transferred when the
     * file is copied. Document identifiers are only unique within a single volume. This property is not supported by
     * all volumes. (Read-only, value type CFNumber)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLAddedToDirectoryDateKey();

    /**
     * The quarantine properties as defined in LSQuarantine.h. To remove quarantine information from a file, pass
     * kCFNull as the value when setting this property. (Read-write, value type CFDictionary)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeKey();

    /**
     * The file system object type values returned for the kCFURLFileResourceTypeKey
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeNamedPipe();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeCharacterSpecial();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeDirectory();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeBlockSpecial();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeRegular();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeSymbolicLink();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeSocket();

    /**
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeUnknown();

    /**
     * File Properties
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileSizeKey();

    /**
     * Total file size in bytes (Read-only, value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileAllocatedSizeKey();

    /**
     * Total size allocated on disk for the file in bytes (number of blocks times block size) (Read-only, value type
     * CFNumber)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTotalFileSizeKey();

    /**
     * Total displayable size of the file in bytes (this may include space used by metadata), or NULL if not available.
     * (Read-only, value type CFNumber)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTotalFileAllocatedSizeKey();

    /**
     * Total allocated size of the file in bytes (this may include space used by metadata), or NULL if not available.
     * This can be less than the value returned by kCFURLTotalFileSizeKey if the resource is compressed. (Read-only,
     * value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsAliasFileKey();

    /**
     * true if the resource is a Finder alias file or a symlink, false otherwise ( Read-only, value type CFBooleanRef)
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionKey();

    /**
     * The file has no special protections associated with it. It can be read from or written to at any time.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionNone();

    /**
     * The file is stored in an encrypted format on disk and cannot be read from or written to while the device is
     * locked or booting. Transient data files with this protection type should be excluded from backups using
     * kCFURLIsExcludedFromBackupKey.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionComplete();

    /**
     * The file is stored in an encrypted format on disk. Files can be created while the device is locked, but once
     * closed, cannot be opened again until the device is unlocked. If the file is opened when unlocked, you may
     * continue to access the file normally, even if the user locks the device. There is a small performance penalty
     * when the file is created and opened, though not when being written to or read from. This can be mitigated by
     * changing the file protection to kCFURLFileProtectionComplete when the device is unlocked. Transient data files
     * with this protection type should be excluded from backups using kCFURLIsExcludedFromBackupKey.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionCompleteUnlessOpen();

    /**
     * The file is stored in an encrypted format on disk and cannot be accessed until after the device has booted. After
     * the user unlocks the device for the first time, your app can access the file and continue to access it even if
     * the user subsequently locks the device.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionCompleteUntilFirstUserAuthentication();

    /**
     * As a convenience, volume properties can be requested from any file system URL. The value returned will reflect
     * the property value for the volume on which the resource is located.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeLocalizedFormatDescriptionKey();

    /**
     * The user-visible volume format (Read-only, value type CFString)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeTotalCapacityKey();

    /**
     * Total volume capacity in bytes (Read-only, value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityKey();

    /**
     * Total available capacity in bytes for "Opportunistic" resources, including space expected to be cleared by
     * purging non-essential and cached resources. "Opportunistic" means something that the user is likely to want but
     * does not expect to be present on the local system, but is ultimately non-essential and replaceable. This would
     * include items that will be created or downloaded without an explicit request from the user on the current device.
     * 
     * Examples: A background download of a newly available episode of a TV series that a user has been recently
     * watching, a piece of content explicitly requested on another device, or a new document saved to a network server
     * by the current user from another device. (Read-only, value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeResourceCountKey();

    /**
     * Total number of resources on the volume (Read-only, value type CFNumber)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsPersistentIDsKey();

    /**
     * true if the volume format supports persistent object identifiers and can look up file system objects by their IDs
     * (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSymbolicLinksKey();

    /**
     * true if the volume format supports symbolic links (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsHardLinksKey();

    /**
     * true if the volume format supports hard links (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsJournalingKey();

    /**
     * true if the volume format supports a journal used to speed recovery in case of unplanned restart (such as a power
     * outage or crash). This does not necessarily mean the volume is actively using a journal. (Read-only, value type
     * CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsJournalingKey();

    /**
     * true if the volume is currently using a journal for speedy recovery after an unplanned restart. (Read-only, value
     * type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSparseFilesKey();

    /**
     * true if the volume format supports sparse files, that is, files which can have 'holes' that have never been
     * written to, and thus do not consume space on disk. A sparse file may have an allocated size on disk that is less
     * than its logical length. (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsZeroRunsKey();

    /**
     * For security reasons, parts of a file (runs) that have never been written to must appear to contain zeroes. true
     * if the volume keeps track of allocated but unwritten runs of a file so that it can substitute zeroes without
     * actually writing zeroes to the media. (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCaseSensitiveNamesKey();

    /**
     * true if the volume format treats upper and lower case characters in file and directory names as different.
     * Otherwise an upper case character is equivalent to a lower case character, and you can't have two names that
     * differ solely in the case of the characters. (Read-only, value type CFBoolean)
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCasePreservedNamesKey();

    /**
     * true if the volume format preserves the case of file and directory names. Otherwise the volume may change the
     * case of some characters (typically making them all upper or all lower case). (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsRootDirectoryDatesKey();

    /**
     * true if the volume supports reliable storage of times for the root directory. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsVolumeSizesKey();

    /**
     * true if the volume supports returning volume size values (kCFURLVolumeTotalCapacityKey and
     * kCFURLVolumeAvailableCapacityKey). (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsRenamingKey();

    /**
     * true if the volume can be renamed. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsAdvisoryFileLockingKey();

    /**
     * true if the volume implements whole-file flock(2) style advisory locks, and the O_EXLOCK and O_SHLOCK flags of
     * the open(2) call. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsExtendedSecurityKey();

    /**
     * true if the volume implements extended security (ACLs). (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsBrowsableKey();

    /**
     * true if the volume should be visible via the GUI (i.e., appear on the Desktop as a separate volume). (Read-only,
     * value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeMaximumFileSizeKey();

    /**
     * The largest file size (in bytes) supported by this file system, or NULL if this cannot be determined. (Read-only,
     * value type CFNumber)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsEjectableKey();

    /**
     * true if the volume's media is ejectable from the drive mechanism under software control. (Read-only, value type
     * CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsRemovableKey();

    /**
     * true if the volume's media is removable from the drive mechanism. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsInternalKey();

    /**
     * true if the volume's device is connected to an internal bus, false if connected to an external bus, or NULL if
     * not available. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsAutomountedKey();

    /**
     * true if the volume is automounted. Note: do not mistake this with the functionality provided by
     * kCFURLVolumeSupportsBrowsingKey. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsLocalKey();

    /**
     * true if the volume is stored on a local device. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsReadOnlyKey();

    /**
     * true if the volume is read-only. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeCreationDateKey();

    /**
     * The volume's creation date, or NULL if this cannot be determined. (Read-only, value type CFDate)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeURLForRemountingKey();

    /**
     * The CFURL needed to remount a network volume, or NULL if not available. (Read-only, value type CFURL)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeUUIDStringKey();

    /**
     * The volume's persistent UUID as a string, or NULL if a persistent UUID is not available for the volume.
     * (Read-only, value type CFString)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeNameKey();

    /**
     * The name of the volume (Read-write, settable if kCFURLVolumeSupportsRenamingKey is true and permissions allow,
     * value type CFString)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeLocalizedNameKey();

    /**
     * The user-presentable name of the volume (Read-only, value type CFString)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsEncryptedKey();

    /**
     * true if the volume is encrypted. (Read-only, value type CFBoolean)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsRootFileSystemKey();

    /**
     * true if the volume is the root filesystem. (Read-only, value type CFBoolean)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCompressionKey();

    /**
     * true if the volume supports transparent decompression of compressed files using decmpfs. (Read-only, value type
     * CFBoolean)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsFileCloningKey();

    /**
     * true if the volume supports clonefile(2) (Read-only, value type CFBoolean)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSwapRenamingKey();

    /**
     * true if the volume supports renamex_np(2)'s RENAME_SWAP option (Read-only, value type CFBoolean)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsExclusiveRenamingKey();

    /**
     * UbiquitousItem Properties
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsUbiquitousItemKey();

    /**
     * true if this item is synced to the cloud, false if it is only a local file. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemHasUnresolvedConflictsKey();

    /**
     * true if this item has conflicts outstanding. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use kCFURLUbiquitousItemDownloadingStatusKey instead
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsDownloadedKey();

    /**
     * Equivalent to NSURLUbiquitousItemDownloadingStatusKey == NSURLUbiquitousItemDownloadingStatusCurrent. Has never
     * behaved as documented in earlier releases, hence deprecated. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsDownloadingKey();

    /**
     * true if data is being downloaded for this item. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsUploadedKey();

    /**
     * true if there is data present in the cloud for this item. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsUploadingKey();

    /**
     * true if data is being uploaded for this item. (Read-only, value type CFBoolean)
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem
     * instead
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemPercentDownloadedKey();

    /**
     * Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemPercentUploadedKey();

    /**
     * Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusKey();

    /**
     * Returns the download status of this item. (Read-only, value type CFString). Possible values below.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingErrorKey();

    /**
     * returns the error when downloading the item from iCloud failed. See the NSUbiquitousFile section in
     * FoundationErrors.h. (Read-only, value type CFError)
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemUploadingErrorKey();

    /**
     * The values returned for kCFURLUbiquitousItemDownloadingStatusKey
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusNotDownloaded();

    /**
     * this item has not been downloaded yet. Use NSFileManager's startDownloadingUbiquitousItemAtURL:error: to download
     * it
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusDownloaded();

    /**
     * there is a local version of this item available. The most current version will get downloaded as soon as
     * possible.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusCurrent();

    @Generated
    @CVariable()
    public static native double kCFAbsoluteTimeIntervalSince1970();

    @Generated
    @CVariable()
    public static native double kCFAbsoluteTimeIntervalSince1904();

    @Generated
    @CVariable()
    @ByValue
    public static native CFBagCallBacks kCFTypeBagCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFBagCallBacks kCFCopyStringBagCallBacks();

    /**
     * [@constant] kCFStringBinaryHeapCallBacks
     * Predefined CFBinaryHeapCallBacks structure containing a set
     * of callbacks appropriate for use when the values in a CFBinaryHeap
     * are all CFString types.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFBinaryHeapCallBacks kCFStringBinaryHeapCallBacks();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFTimeZoneSystemTimeZoneDidChangeNotification();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterIsLenient();

    /**
     * CFTimeZone
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterTimeZone();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterCalendarName();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDefaultFormat();

    /**
     * CFDate
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterTwoDigitStartDate();

    /**
     * CFDate
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDefaultDate();

    /**
     * CFCalendar
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterCalendar();

    /**
     * CFArray of CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterEraSymbols();

    /**
     * CFArray of CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterMonthSymbols();

    /**
     * CFArray of CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortMonthSymbols();

    /**
     * CFArray of CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterWeekdaySymbols();

    /**
     * CFArray of CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortWeekdaySymbols();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterAMSymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterPMSymbol();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterLongEraSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortMonthSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneMonthSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneMonthSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortStandaloneMonthSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortWeekdaySymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneWeekdaySymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneWeekdaySymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortStandaloneWeekdaySymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterQuarterSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortQuarterSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneQuarterSymbols();

    /**
     * CFArray of CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneQuarterSymbols();

    /**
     * CFDate
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterGregorianStartDate();

    /**
     * CFBoolean
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDoesRelativeDateFormattingKey();

    @Generated
    @CVariable()
    public static native CFBooleanRef kCFBooleanTrue();

    @Generated
    @CVariable()
    public static native CFBooleanRef kCFBooleanFalse();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberPositiveInfinity();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberNegativeInfinity();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberNaN();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyCode();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterDecimalSeparator();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyDecimalSeparator();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterAlwaysShowDecimalSeparator();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterGroupingSeparator();

    /**
     * CFBoolean
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterUseGroupingSeparator();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPercentSymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterZeroSymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNaNSymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterInfinitySymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinusSign();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPlusSign();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencySymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterExponentSymbol();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinIntegerDigits();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxIntegerDigits();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinFractionDigits();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxFractionDigits();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterGroupingSize();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterSecondaryGroupingSize();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterRoundingMode();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterRoundingIncrement();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterFormatWidth();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPaddingPosition();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPaddingCharacter();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterDefaultFormat();

    /**
     * CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMultiplier();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPositivePrefix();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPositiveSuffix();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNegativePrefix();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNegativeSuffix();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPerMillSymbol();

    /**
     * CFString
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterInternationalCurrencySymbol();

    /**
     * CFString
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyGroupingSeparator();

    /**
     * CFBoolean
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterIsLenient();

    /**
     * CFBoolean
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterUseSignificantDigits();

    /**
     * CFNumber
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinSignificantDigits();

    /**
     * CFNumber
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxSignificantDigits();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyApplication();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentApplication();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyHost();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentHost();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyUser();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentUser();

    @Generated
    @CVariable()
    public static native CFStringRef kCFRunLoopDefaultMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFRunLoopCommonModes();

    /**
     * Constants used in name registry server communications
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketCommandKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketResultKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketRegisterCommand();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketRetrieveCommand();

    /**
     * Value will be a CFData containing all bytes thusfar written; used to recover the data written to a memory write
     * stream.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyDataWritten();

    /**
     * Property for file write streams; value should be a CFBoolean. Set to TRUE to append to a file, rather than to
     * replace its contents
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyAppendToFile();

    /**
     * Value is a CFNumber
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFileCurrentOffset();

    /**
     * Value will be a CFData containing the native handle
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketNativeHandle();

    /**
     * Value will be a CFString, or NULL if unknown
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteHostName();

    /**
     * Value will be a CFNumber, or NULL if unknown
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemotePortNumber();

    /**
     * [@constant] kCFTypeSetCallBacks
     * Predefined CFSetCallBacks structure containing a set of callbacks
     * appropriate for use when the values in a CFSet are all CFTypes.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFSetCallBacks kCFTypeSetCallBacks();

    /**
     * [@constant] kCFCopyStringSetCallBacks
     * Predefined CFSetCallBacks structure containing a set of callbacks
     * appropriate for use when the values in a CFSet should be copies
     * of a CFString.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CFSetCallBacks kCFCopyStringSetCallBacks();

    /**
     * Older property keys
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLResourceIsReachable instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileExists();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use the CFURLEnumerator API instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileDirectoryContents();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLCopyResourcePropertyForKey with kCFURLFileSizeKey instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileLength();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLCopyResourcePropertyForKey with kCFURLContentModificationDateKey instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileLastModificationTime();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity
     * API instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFilePOSIXMode();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity
     * API instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileOwnerID();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use NSHTTPURLResponse methods instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHTTPStatusCode();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use NSHTTPURLResponse methods instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHTTPStatusLine();

    /**
     * ===================== Standard Info.plist keys =====================
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleInfoDictionaryVersionKey();

    /**
     * The version of the Info.plist format
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleExecutableKey();

    /**
     * The name of the executable in this bundle, if any
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleIdentifierKey();

    /**
     * The bundle identifier (for CFBundleGetBundleWithIdentifier())
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleVersionKey();

    /**
     * The version number of the bundle. For Mac OS 9 style version numbers (for example "2.5.3d5"),
     * clients can use CFBundleGetVersionNumber() instead of accessing this key directly since that
     * function will properly convert the version string into its compact integer representation.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleDevelopmentRegionKey();

    /**
     * The name of the development language of the bundle.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleNameKey();

    /**
     * The human-readable name of the bundle. This key is often found in the InfoPlist.strings since it is usually
     * localized.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleLocalizationsKey();

    /**
     * ================ Standard Info.plist keys for plugIns ================
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInDynamicRegistrationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInDynamicRegisterFunctionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInUnloadFunctionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInFactoriesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInTypesKey();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFDictionaryApplyFunction {
        @Generated
        void call_CFDictionaryApplyFunction(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayApplyFunction {
        @Generated
        void call_CFArrayApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayBSearchValues {
        @Generated
        @NInt
        long call_CFArrayBSearchValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArraySortValues {
        @Generated
        @NInt
        long call_CFArraySortValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNotificationCenterAddObserver {
        @Generated
        void call_CFNotificationCenterAddObserver(CFNotificationCenterRef arg0, VoidPtr arg1, CFStringRef arg2,
                ConstVoidPtr arg3, CFDictionaryRef arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBagApplyFunction {
        @Generated
        void call_CFBagApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBinaryHeapApplyFunction {
        @Generated
        void call_CFBinaryHeapApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopPerformBlock {
        @Generated
        void call_CFRunLoopPerformBlock();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopObserverCreate {
        @Generated
        void call_CFRunLoopObserverCreate(CFRunLoopObserverRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopObserverCreateWithHandler {
        @Generated
        void call_CFRunLoopObserverCreateWithHandler(CFRunLoopObserverRef observer, @NUInt long activity);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopTimerCreate {
        @Generated
        void call_CFRunLoopTimerCreate(CFRunLoopTimerRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopTimerCreateWithHandler {
        @Generated
        void call_CFRunLoopTimerCreateWithHandler(CFRunLoopTimerRef timer);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreate {
        @Generated
        void call_CFSocketCreate(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2, ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithNative {
        @Generated
        void call_CFSocketCreateWithNative(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2, ConstVoidPtr arg3,
                VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithSocketSignature {
        @Generated
        void call_CFSocketCreateWithSocketSignature(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2,
                ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateConnectedToSocketSignature {
        @Generated
        void call_CFSocketCreateConnectedToSocketSignature(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2,
                ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFReadStreamSetClient {
        @Generated
        void call_CFReadStreamSetClient(CFReadStreamRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFWriteStreamSetClient {
        @Generated
        void call_CFWriteStreamSetClient(CFWriteStreamRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSetApplyFunction {
        @Generated
        void call_CFSetApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeApplyFunctionToChildren {
        @Generated
        void call_CFTreeApplyFunctionToChildren(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeSortChildren {
        @Generated
        @NInt
        long call_CFTreeSortChildren(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortCreateLocal {
        @Generated
        CFDataRef call_CFMessagePortCreateLocal(CFMessagePortRef arg0, int arg1, CFDataRef arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMessagePortGetInvalidationCallBack_ret(CFMessagePortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortSetInvalidationCallBack {
        @Generated
        void call_CFMessagePortSetInvalidationCallBack(CFMessagePortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInRegisterFactoryFunction {
        @Generated
        VoidPtr call_CFPlugInRegisterFactoryFunction(CFAllocatorRef arg0, CFUUIDRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInInstanceCreateWithInstanceDataSize_2 {
        @Generated
        void call_CFPlugInInstanceCreateWithInstanceDataSize_2(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInInstanceCreateWithInstanceDataSize_4 {
        @Generated
        byte call_CFPlugInInstanceCreateWithInstanceDataSize_4(CFPlugInInstanceRef arg0, CFStringRef arg1,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreate {
        @Generated
        void call_CFMachPortCreate(CFMachPortRef arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreateWithPort {
        @Generated
        void call_CFMachPortCreateWithPort(CFMachPortRef arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMachPortGetInvalidationCallBack_ret(CFMachPortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortSetInvalidationCallBack {
        @Generated
        void call_CFMachPortSetInvalidationCallBack(CFMachPortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFFileDescriptorCreate {
        @Generated
        void call_CFFileDescriptorCreate(CFFileDescriptorRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    /**
     * Key to identify the end user-presentable failing operation ("what failed") description in userInfo. Should be one
     * or more complete sentence(s), for instance 'The file "To Do List" couldn't be saved.'
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedFailureKey();

    /**
     * Total free space in bytes (Read-only, value type CFNumber)
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityForImportantUsageKey();

    /**
     * Total available capacity in bytes for "Important" resources, including space expected to be cleared by purging
     * non-essential and cached resources. "Important" means something that the user or application clearly expects to
     * be present on the local system, but is ultimately replaceable. This would include items that the user has
     * explicitly requested via the UI, and resources that an application requires in order to provide functionality.
     * 
     * Examples: A video that the user has explicitly requested to watch but has not yet finished watching or an audio
     * file that the user has requested to download.
     * 
     * This value should not be used in determining if there is room for an irreplaceable resource. In the case of
     * irreplaceable resources, always attempt to save the resource regardless of available capacity and handle failure
     * as gracefully as possible. (Read-only, value type CFNumber)
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityForOpportunisticUsageKey();

    /**
     * true if the volume supports renamex_np(2)'s RENAME_EXCL option (Read-only, value type CFBoolean)
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsImmutableFilesKey();

    /**
     * true if the volume supports making files immutable with the kCFURLIsUserImmutableKey or
     * kCFURLIsSystemImmutableKey properties (Read-only, value type CFBoolean)
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsAccessPermissionsKey();

    /**
     * kCFStreamErrorDomainSOCKS
     * 
     * Discussion:
     * SOCKS proxy error domain. Errors formulated using inlines below.
     * 
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSOCKS();

    /**
     * kCFStreamPropertySOCKSProxy
     * 
     * Discussion:
     * Stream property key, for both set and copy operations. To set a
     * stream to use a SOCKS proxy, call CFReadStreamSetProperty or
     * CFWriteStreamSetProperty with the property name set to
     * kCFStreamPropertySOCKSProxy and the value being a dictionary with
     * at least the following two keys: kCFStreamPropertySOCKSProxyHost
     * and kCFStreamPropertySOCKSProxyPort. The dictionary returned by
     * SystemConfiguration for SOCKS proxies will work without
     * alteration.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxy();

    /**
     * kCFStreamPropertySOCKSProxyHost
     * 
     * Discussion:
     * CFDictionary key for SOCKS proxy information. The key
     * kCFStreamPropertySOCKSProxyHost should contain a CFStringRef
     * value representing the SOCKS proxy host. Defined to match
     * kSCPropNetProxiesSOCKSProxy
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxyHost();

    /**
     * kCFStreamPropertySOCKSProxyPort
     * 
     * Discussion:
     * CFDictionary key for SOCKS proxy information. The key
     * kCFStreamPropertySOCKSProxyPort should contain a CFNumberRef
     * which itself is of type kCFNumberSInt32Type. This value should
     * represent the port on which the proxy is listening. Defined to
     * match kSCPropNetProxiesSOCKSPort
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxyPort();

    /**
     * kCFStreamPropertySOCKSVersion
     * 
     * Discussion:
     * CFDictionary key for SOCKS proxy information. By default, SOCKS5
     * will be used unless there is a kCFStreamPropertySOCKSVersion key
     * in the dictionary. Its value must be
     * kCFStreamSocketSOCKSVersion4 or kCFStreamSocketSOCKSVersion5 to
     * set SOCKS4 or SOCKS5, respectively.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSVersion();

    /**
     * kCFStreamSocketSOCKSVersion4
     * 
     * Discussion:
     * CFDictionary value for SOCKS proxy information. Indcates that
     * SOCKS will or is using version 4 of the SOCKS protocol.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSOCKSVersion4();

    /**
     * kCFStreamSocketSOCKSVersion5
     * 
     * Discussion:
     * CFDictionary value for SOCKS proxy information. Indcates that
     * SOCKS will or is using version 5 of the SOCKS protocol.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSOCKSVersion5();

    /**
     * kCFStreamPropertySOCKSUser
     * 
     * Discussion:
     * CFDictionary key for SOCKS proxy information. To set a user name
     * and/or password, if required, the dictionary must contain the
     * key(s) kCFStreamPropertySOCKSUser and/or
     * kCFStreamPropertySOCKSPassword with the value being the user's
     * name as a CFStringRef and/or the user's password as a
     * CFStringRef, respectively.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSUser();

    /**
     * kCFStreamPropertySOCKSPassword
     * 
     * Discussion:
     * CFDictionary key for SOCKS proxy information. To set a user name
     * and/or password, if required, the dictionary must contain the
     * key(s) kCFStreamPropertySOCKSUser and/or
     * kCFStreamPropertySOCKSPassword with the value being the user's
     * name as a CFStringRef and/or the user's password as a
     * CFStringRef, respectively.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSPassword();

    /**
     * kCFStreamErrorDomainSSL
     * 
     * Discussion:
     * Errors located in Security/SecureTransport.h
     * 
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSSL();

    /**
     * kCFStreamPropertySocketSecurityLevel
     * 
     * Discussion:
     * Stream property key, for both set and copy operations. To set a
     * stream to be secure, call CFReadStreamSetProperty or
     * CFWriteStreamSetPropertywith the property name set to
     * kCFStreamPropertySocketSecurityLevel and the value being one of
     * the following values. Streams may set a security level after
     * open in order to allow on-the-fly securing of a stream.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketSecurityLevel();

    /**
     * kCFStreamSocketSecurityLevelNone
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * Indicates to use no security (default setting).
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelNone();

    /**
     * kCFStreamSocketSecurityLevelSSLv2
     * 
     * Note: SSLv2 is DEPRECATED starting in OS X 10.12 and iOS 10.0.
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * Indicates to use SSLv2 security.
     * 
     * 
     * API-Since: 2.0
     * Deprecated-Since: 10.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelSSLv2();

    /**
     * kCFStreamSocketSecurityLevelSSLv3
     * 
     * Note: SSLv3 is DEPRECATED starting in OS X 10.12 and iOS 10.0.
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * Indicates to use SSLv3 security.
     * 
     * 
     * API-Since: 2.0
     * Deprecated-Since: 10.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelSSLv3();

    /**
     * kCFStreamSocketSecurityLevelTLSv1
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * Indicates to use TLSv1 security.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelTLSv1();

    /**
     * kCFStreamSocketSecurityLevelNegotiatedSSL
     * 
     * Discussion:
     * Stream property value, for both set and copy operations.
     * Indicates to use TLS or SSL with fallback to lower versions. This
     * is what HTTPS does, for instance.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelNegotiatedSSL();

    /**
     * kCFStreamPropertyShouldCloseNativeSocket
     * 
     * Discussion:
     * Set the value to kCFBooleanTrue if the stream should close and
     * release the underlying native socket when the stream is released.
     * Set the value to kCFBooleanFalse to keep the native socket from
     * closing and releasing when the stream is released. If the stream
     * was created with a native socket, the default property setting on
     * the stream is kCFBooleanFalse. The
     * kCFStreamPropertyShouldCloseNativeSocket can be set through
     * CFReadStreamSetProperty or CFWriteStreamSetProperty. The
     * property can be copied through CFReadStreamCopyProperty or
     * CFWriteStreamCopyProperty.
     * 
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyShouldCloseNativeSocket();

    /**
     * The time the resource's attributes were last modified (Read-only, value type CFDate)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileContentIdentifierKey();

    /**
     * A 64-bit value assigned by APFS that identifies a file's content data stream. Only cloned files and their
     * originals can have the same identifier. (CFNumber)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLMayShareFileContentKey();

    /**
     * True for cloned files and their originals that may share all, some, or no data blocks. (CFBoolean)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLMayHaveExtendedAttributesKey();

    /**
     * True if the file has extended attributes. False guarantees there are none. (CFBoolean)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsPurgeableKey();

    /**
     * True if the file can be deleted by the file system when asked to free space. (CFBoolean)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsSparseKey();

    /**
     * true if the volume supports setting POSIX access permissions with the kCFURLFileSecurityKey property (Read-only,
     * value type CFBoolean)
     * 
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsFileProtectionKey();

    /**
     * returns the error when uploading the item to iCloud failed. See the NSUbiquitousFile section in
     * FoundationErrors.h. (Read-only, value type CFError)
     * 
     * API-Since: 14.5
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsExcludedFromSyncKey();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Variadic()
    @CFunction
    public static native CFStringRef CFStringCreateStringWithValidatedFormat(CFAllocatorRef alloc,
            CFDictionaryRef formatOptions, CFStringRef validFormatSpecifiers, CFStringRef format,
            Ptr<CFErrorRef> errorPtr, Object... varargs);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateStringWithValidatedFormatAndArguments(CFAllocatorRef alloc,
            CFDictionaryRef formatOptions, CFStringRef validFormatSpecifiers, CFStringRef format, BytePtr arguments,
            Ptr<CFErrorRef> errorPtr);

    @Generated public static final double __COREFOUNDATION_COREFOUNDATION__ = 1.0;
    @Generated public static final double __COREFOUNDATION__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBASE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFAVAILABILITY__ = 1.0;
    @Generated public static final double TRUE = 1.0;
    @Generated public static final double FALSE = 0.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_0 = 196.4;
    @Generated public static final double kCFCoreFoundationVersionNumber10_0_3 = 196.5;
    @Generated public static final double kCFCoreFoundationVersionNumber10_1 = 226.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_1_1 = 226.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_1_2 = 227.2;
    @Generated public static final double kCFCoreFoundationVersionNumber10_1_3 = 227.2;
    @Generated public static final double kCFCoreFoundationVersionNumber10_1_4 = 227.3;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2 = 263.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_1 = 263.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_2 = 263.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_3 = 263.3;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_4 = 263.3;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_5 = 263.5;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_6 = 263.5;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_7 = 263.5;
    @Generated public static final double kCFCoreFoundationVersionNumber10_2_8 = 263.5;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3 = 299.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_1 = 299.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_2 = 299.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_3 = 299.3;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_4 = 299.31;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_5 = 299.31;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_6 = 299.32;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_7 = 299.33;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_8 = 299.33;
    @Generated public static final double kCFCoreFoundationVersionNumber10_3_9 = 299.35;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4 = 368.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_1 = 368.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_2 = 368.11;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_3 = 368.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_4_Intel = 368.26;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_4_PowerPC = 368.25;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_5_Intel = 368.26;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_5_PowerPC = 368.25;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_6_Intel = 368.26;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_6_PowerPC = 368.25;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_7 = 368.27;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_8 = 368.27;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_9 = 368.28;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_10 = 368.28;
    @Generated public static final double kCFCoreFoundationVersionNumber10_4_11 = 368.31;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5 = 476.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_1 = 476.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_2 = 476.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_3 = 476.13;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_4 = 476.14;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_5 = 476.15;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_6 = 476.17;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_7 = 476.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_5_8 = 476.19;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6 = 550.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_1 = 550.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_2 = 550.13;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_3 = 550.19;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_4 = 550.29;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_5 = 550.42;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_6 = 550.42;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_7 = 550.42;
    @Generated public static final double kCFCoreFoundationVersionNumber10_6_8 = 550.43;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7 = 635.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7_1 = 635.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7_2 = 635.15;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7_3 = 635.19;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7_4 = 635.21;
    @Generated public static final double kCFCoreFoundationVersionNumber10_7_5 = 635.21;
    @Generated public static final double kCFCoreFoundationVersionNumber10_8 = 744.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_8_1 = 744.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_8_2 = 744.12;
    @Generated public static final double kCFCoreFoundationVersionNumber10_8_3 = 744.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_8_4 = 744.19;
    @Generated public static final double kCFCoreFoundationVersionNumber10_9 = 855.11;
    @Generated public static final double kCFCoreFoundationVersionNumber10_9_1 = 855.11;
    @Generated public static final double kCFCoreFoundationVersionNumber10_9_2 = 855.14;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10 = 1151.16;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_1 = 1151.16;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_2 = 1152.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_3 = 1153.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_4 = 1153.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_5 = 1153.18;
    @Generated public static final double kCFCoreFoundationVersionNumber10_10_Max = 1199.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11 = 1253.0;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11_1 = 1255.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11_2 = 1256.14;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11_3 = 1256.14;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11_4 = 1258.1;
    @Generated public static final double kCFCoreFoundationVersionNumber10_11_Max = 1299.0;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_2_0 = 478.23;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_2_1 = 478.26;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_2_2 = 478.29;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_3_0 = 478.47;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_3_1 = 478.52;
    @Generated public static final double kCFCoreFoundationVersionNumber_iPhoneOS_3_2 = 478.61;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_4_0 = 550.32;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_4_1 = 550.38;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_4_2 = 550.52;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_4_3 = 550.52;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_5_0 = 675.0;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_5_1 = 690.1;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_6_0 = 793.0;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_6_1 = 793.0;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_7_0 = 847.2;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_7_1 = 847.24;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_0 = 1140.1;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_1 = 1141.14;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_2 = 1142.16;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_3 = 1144.17;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_4 = 1145.15;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_8_x_Max = 1199.0;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_0 = 1240.1;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_1 = 1241.11;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_2 = 1242.13;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_3 = 1242.13;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_4 = 1280.38;
    @Generated public static final double kCFCoreFoundationVersionNumber_iOS_9_x_Max = 1299.0;
    @Generated public static final double ISA_PTRAUTH_DISCRIMINATOR = 27361.0;
    @Generated public static final double __COREFOUNDATION_CFARRAY__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBAG__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBINARYHEAP__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBITVECTOR__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBYTEORDER__ = 1.0;
    @Generated public static final double CF_USE_OSBYTEORDER_H = 1.0;
    @Generated public static final double __COREFOUNDATION_CFCALENDAR__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFLOCALE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFDICTIONARY__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFNOTIFICATIONCENTER__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFDATE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFTIMEZONE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFDATA__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSTRING__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFCHARACTERSET__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFERROR__ = 1.0;
    @Generated public static final double __kCFStringInlineBufferLength = 64.0;
    @Generated public static final double __COREFOUNDATION_CFCGTYPES__ = 1.0;
    @Generated public static final double CGFLOAT_IS_DOUBLE = 1.0;
    @Generated public static final double CGFLOAT_DEFINED = 1.0;
    @Generated public static final double CGVECTOR_DEFINED = 1.0;
    @Generated public static final double __COREFOUNDATION_CFDATEFORMATTER__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFNUMBER__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFNUMBERFORMATTER__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFPREFERENCES__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFPROPERTYLIST__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSTREAM__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFURL__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFRUNLOOP__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSOCKET__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSET__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSTRINGENCODINGEXT__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFTREE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFURLACCESS__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFUUID__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFUTILITIES__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFBUNDLE__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFMESSAGEPORT__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFPLUGIN__ = 1.0;
    @Generated public static final double COREFOUNDATION_CFPLUGINCOM_SEPARATE = 1.0;
    @Generated public static final double __COREFOUNDATION_CFMACHPORT__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFATTRIBUTEDSTRING__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFURLENUMERATOR__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFFILESECURITY__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFSTRINGTOKENIZER__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFFILEDESCRIPTOR__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFUSERNOTIFICATION__ = 1.0;
    @Generated public static final double __COREFOUNDATION_CFPLUGINCOM__ = 1.0;
    @Generated public static final double SEVERITY_SUCCESS = 0.0;
    @Generated public static final double SEVERITY_ERROR = 1.0;
}
