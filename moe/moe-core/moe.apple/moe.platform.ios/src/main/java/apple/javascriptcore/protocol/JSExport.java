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

package apple.javascriptcore.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * [@protocol]
 * <p>
 * JSExport provides a declarative way to export Objective-C objects and
 * classes -- including properties, instance methods, class methods, and
 * initializers -- to JavaScript.
 * <p>
 * When an Objective-C object is exported to JavaScript, a JavaScript
 * wrapper object is created.
 * <p>
 * In JavaScript, inheritance works via a chain of prototype objects.
 * For each Objective-C class in each JSContext, an object appropriate for use
 * as a prototype will be provided. For the class NSObject the prototype
 * will be the Object prototype. For all other Objective-C
 * classes a prototype will be created. The prototype for a given
 * Objective-C class will have its internal [Prototype] property set to point to
 * the prototype created for the Objective-C class's superclass. As such the
 * prototype chain for a JavaScript wrapper object will reflect the wrapped
 * Objective-C type's inheritance hierarchy.
 * <p>
 * JavaScriptCore also produces a constructor for each Objective-C class. The
 * constructor has a property named 'prototype' that references the prototype,
 * and the prototype has a property named 'constructor' that references the
 * constructor.
 * <p>
 * By default JavaScriptCore does not export any methods or properties from an
 * Objective-C class to JavaScript; however methods and properties may be exported
 * explicitly using JSExport. For each protocol that a class conforms to, if the
 * protocol incorporates the protocol JSExport, JavaScriptCore exports the methods
 * and properties in that protocol to JavaScript
 * <p>
 * For each exported instance method JavaScriptCore will assign a corresponding
 * JavaScript function to the prototype. For each exported Objective-C property
 * JavaScriptCore will assign a corresponding JavaScript accessor to the prototype.
 * For each exported class method JavaScriptCore will assign a corresponding
 * JavaScript function to the constructor. For example:
 *
 * <pre>
 * @textblock
 *     [@protocol] MyClassJavaScriptMethods <JSExport>
 *     - (void)foo;
 *     [@end]
 *
 *     [@interface] MyClass : NSObject <MyClassJavaScriptMethods>
 *     - (void)foo;
 *     - (void)bar;
 *     [@end]
 * @/textblock
 * </pre>
 * <p>
 * Data properties that are created on the prototype or constructor objects have
 * the attributes: <code>writable:true</code>, <code>enumerable:false</code>, <code>configurable:true</code>.
 * Accessor properties have the attributes: <code>enumerable:false</code> and <code>configurable:true</code>.
 * <p>
 * If an instance of <code>MyClass</code> is converted to a JavaScript value, the resulting
 * wrapper object will (via its prototype) export the method <code>foo</code> to JavaScript,
 * since the class conforms to the <code>MyClassJavaScriptMethods</code> protocol, and this
 * protocol incorporates <code>JSExport</code>. <code>bar</code> will not be exported.
 * <p>
 * JSExport supports properties, arguments, and return values of the following types:
 * <p>
 * Primitive numbers: signed values up to 32-bits convert using JSValue's
 * valueWithInt32/toInt32. Unsigned values up to 32-bits convert using JSValue's
 * valueWithUInt32/toUInt32. All other numeric values convert using JSValue's
 * valueWithDouble/toDouble.
 * <p>
 * BOOL: values convert using JSValue's valueWithBool/toBool.
 * <p>
 * id: values convert using JSValue's valueWithObject/toObject.
 * <p>
 * Objective-C instance pointers: Pointers convert using JSValue's
 * valueWithObjectOfClass/toObject.
 * <p>
 * C structs: C structs for CGPoint, NSRange, CGRect, and CGSize convert using
 * JSValue's appropriate methods. Other C structs are not supported.
 * <p>
 * Blocks: Blocks convert using JSValue's valueWithObject/toObject.
 * <p>
 * All objects that conform to JSExport convert to JavaScript wrapper objects,
 * even if they subclass classes that would otherwise behave differently. For
 * example, if a subclass of NSString conforms to JSExport, it converts to
 * JavaScript as a wrapper object rather than a JavaScript string.
 */
@Generated
@Library("JavaScriptCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("JSExport")
public interface JSExport {
}
