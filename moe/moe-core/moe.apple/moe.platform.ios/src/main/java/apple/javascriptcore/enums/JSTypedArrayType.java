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

package apple.javascriptcore.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] JSTypedArrayType
 * <p>
 * A constant identifying the Typed Array type of a JSObjectRef.
 * [@constant] kJSTypedArrayTypeInt8Array Int8Array
 * [@constant] kJSTypedArrayTypeInt16Array Int16Array
 * [@constant] kJSTypedArrayTypeInt32Array Int32Array
 * [@constant] kJSTypedArrayTypeUint8Array Uint8Array
 * [@constant] kJSTypedArrayTypeUint8ClampedArray Uint8ClampedArray
 * [@constant] kJSTypedArrayTypeUint16Array Uint16Array
 * [@constant] kJSTypedArrayTypeUint32Array Uint32Array
 * [@constant] kJSTypedArrayTypeFloat32Array Float32Array
 * [@constant] kJSTypedArrayTypeFloat64Array Float64Array
 * [@constant] kJSTypedArrayTypeBigInt64Array BigInt64Array
 * [@constant] kJSTypedArrayTypeBigUint64Array BigUint64Array
 * [@constant] kJSTypedArrayTypeArrayBuffer ArrayBuffer
 * [@constant] kJSTypedArrayTypeNone Not a Typed Array
 */
@Generated
public final class JSTypedArrayType {
    @Generated public static final int kJSTypedArrayTypeInt8Array = 0x00000000;
    @Generated public static final int kJSTypedArrayTypeInt16Array = 0x00000001;
    @Generated public static final int kJSTypedArrayTypeInt32Array = 0x00000002;
    @Generated public static final int kJSTypedArrayTypeUint8Array = 0x00000003;
    @Generated public static final int kJSTypedArrayTypeUint8ClampedArray = 0x00000004;
    @Generated public static final int kJSTypedArrayTypeUint16Array = 0x00000005;
    @Generated public static final int kJSTypedArrayTypeUint32Array = 0x00000006;
    @Generated public static final int kJSTypedArrayTypeFloat32Array = 0x00000007;
    @Generated public static final int kJSTypedArrayTypeFloat64Array = 0x00000008;
    @Generated public static final int kJSTypedArrayTypeArrayBuffer = 0x00000009;
    @Generated public static final int kJSTypedArrayTypeNone = 0x0000000A;

    @Generated
    private JSTypedArrayType() {
    }

    @Generated public static final int kJSTypedArrayTypeBigInt64Array = 0x0000000B;
    @Generated public static final int kJSTypedArrayTypeBigUint64Array = 0x0000000C;
}
