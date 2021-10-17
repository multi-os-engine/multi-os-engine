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
 * [@enum] JSType
 * <p>
 * A constant identifying the type of a JSValue.
 * [@constant]     kJSTypeUndefined  The unique undefined value.
 * [@constant]     kJSTypeNull       The unique null value.
 * [@constant]     kJSTypeBoolean    A primitive boolean value, one of true or false.
 * [@constant]     kJSTypeNumber     A primitive number value.
 * [@constant]     kJSTypeString     A primitive string value.
 * [@constant]     kJSTypeObject     An object value (meaning that this JSValueRef is a JSObjectRef).
 * [@constant]     kJSTypeSymbol     A primitive symbol value.
 */
@Generated
public final class JSType {
    @Generated public static final int kJSTypeUndefined = 0x00000000;
    @Generated public static final int kJSTypeNull = 0x00000001;
    @Generated public static final int kJSTypeBoolean = 0x00000002;
    @Generated public static final int kJSTypeNumber = 0x00000003;
    @Generated public static final int kJSTypeString = 0x00000004;
    @Generated public static final int kJSTypeObject = 0x00000005;

    @Generated
    private JSType() {
    }

    @Generated public static final int kJSTypeSymbol = 0x00000006;
}
