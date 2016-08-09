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

package ios.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSXMLParser;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXMLParserDelegate")
public interface NSXMLParserDelegate {
	/**
	 * parser:didEndElement:namespaceURI:qualifiedName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:didEndElement:namespaceURI:qualifiedName:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:didEndElement:namespaceURI:qualifiedName:")
	default void parserDidEndElementNamespaceURIQualifiedName(
			NSXMLParser parser, String elementName, String namespaceURI,
			String qName) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:didEndMappingPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:didEndMappingPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:didEndMappingPrefix:")
	default void parserDidEndMappingPrefix(NSXMLParser parser,
			String prefix) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:didStartElement:namespaceURI:qualifiedName:attributes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:didStartElement:namespaceURI:qualifiedName:attributes:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:didStartElement:namespaceURI:qualifiedName:attributes:")
	default void parserDidStartElementNamespaceURIQualifiedNameAttributes(
			NSXMLParser parser, String elementName, String namespaceURI,
			String qName, NSDictionary<String, String> attributeDict) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:didStartMappingPrefix:toURI:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:didStartMappingPrefix:toURI:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:didStartMappingPrefix:toURI:")
	default void parserDidStartMappingPrefixToURI(NSXMLParser parser,
			String prefix, String namespaceURI) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
	default void parserFoundAttributeDeclarationWithNameForElementTypeDefaultValue(
			NSXMLParser parser, String attributeName, String elementName,
			String type, String defaultValue) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundCDATA:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundCDATA:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundCDATA:")
	default void parserFoundCDATA(NSXMLParser parser, NSData CDATABlock) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundCharacters:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundCharacters:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundCharacters:")
	default void parserFoundCharacters(NSXMLParser parser, String string) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundComment:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundComment:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundComment:")
	default void parserFoundComment(NSXMLParser parser, String comment) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundElementDeclarationWithName:model:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundElementDeclarationWithName:model:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundElementDeclarationWithName:model:")
	default void parserFoundElementDeclarationWithNameModel(
			NSXMLParser parser, String elementName, String model) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundExternalEntityDeclarationWithName:publicID:systemID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundExternalEntityDeclarationWithName:publicID:systemID:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
	default void parserFoundExternalEntityDeclarationWithNamePublicIDSystemID(
			NSXMLParser parser, String name, String publicID, String systemID) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundIgnorableWhitespace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundIgnorableWhitespace:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundIgnorableWhitespace:")
	default void parserFoundIgnorableWhitespace(NSXMLParser parser,
			String whitespaceString) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundInternalEntityDeclarationWithName:value:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundInternalEntityDeclarationWithName:value:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundInternalEntityDeclarationWithName:value:")
	default void parserFoundInternalEntityDeclarationWithNameValue(
			NSXMLParser parser, String name, String value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundNotationDeclarationWithName:publicID:systemID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundNotationDeclarationWithName:publicID:systemID:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundNotationDeclarationWithName:publicID:systemID:")
	default void parserFoundNotationDeclarationWithNamePublicIDSystemID(
			NSXMLParser parser, String name, String publicID, String systemID) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundProcessingInstructionWithTarget:data:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundProcessingInstructionWithTarget:data:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundProcessingInstructionWithTarget:data:")
	default void parserFoundProcessingInstructionWithTargetData(
			NSXMLParser parser, String target, String data) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
	default void parserFoundUnparsedEntityDeclarationWithNamePublicIDSystemIDNotationName(
			NSXMLParser parser, String name, String publicID, String systemID,
			String notationName) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:parseErrorOccurred:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:parseErrorOccurred:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:parseErrorOccurred:")
	default void parserParseErrorOccurred(NSXMLParser parser,
			NSError parseError) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:resolveExternalEntityName:systemID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:resolveExternalEntityName:systemID:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:resolveExternalEntityName:systemID:")
	default NSData parserResolveExternalEntityNameSystemID(
			NSXMLParser parser, String name, String systemID) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parser:validationErrorOccurred:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parser:validationErrorOccurred:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parser:validationErrorOccurred:")
	default void parserValidationErrorOccurred(NSXMLParser parser,
			NSError validationError) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parserDidEndDocument:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parserDidEndDocument:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parserDidEndDocument:")
	default void parserDidEndDocument(NSXMLParser parser) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * parserDidStartDocument:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSXMLParserDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSXMLParserDelegate/parserDidStartDocument:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("parserDidStartDocument:")
	default void parserDidStartDocument(NSXMLParser parser) {
		throw new java.lang.UnsupportedOperationException();
	}
}
