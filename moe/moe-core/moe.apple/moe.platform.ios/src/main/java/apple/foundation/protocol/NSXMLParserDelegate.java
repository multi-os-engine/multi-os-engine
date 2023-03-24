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

package apple.foundation.protocol;

import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSXMLParser;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The parser's delegate is informed of events through the methods in the NSXMLParserDelegateEventAdditions category.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXMLParserDelegate")
public interface NSXMLParserDelegate {
    /**
     * sent when the parser finds an element start tag.
     * In the case of the cvslog tag, the following is what the delegate receives:
     * elementName == cvslog, namespaceURI == http://xml.apple.com/cvslog, qualifiedName == cvslog
     * In the case of the radar tag, the following is what's passed in:
     * elementName == radar, namespaceURI == http://xml.apple.com/radar, qualifiedName == radar:radar
     * If namespace processing >isn't< on, the xmlns:radar="http://xml.apple.com/radar" is returned as an attribute
     * pair, the elementName is 'radar:radar' and there is no qualifiedName.
     */
    @Generated
    @IsOptional
    @Selector("parser:didEndElement:namespaceURI:qualifiedName:")
    default void parserDidEndElementNamespaceURIQualifiedName(@NotNull NSXMLParser parser, @NotNull String elementName,
            @Nullable String namespaceURI, @Nullable String qName) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * sent when the parser first sees a namespace attribute.
     * In the case of the cvslog tag, before the didStartElement:, you'd get one of these with prefix == @"" and
     * namespaceURI == @"http://xml.apple.com/cvslog" (i.e. the default namespace)
     * In the case of the radar:radar tag, before the didStartElement: you'd get one of these with prefix == @"radar"
     * and namespaceURI == @"http://xml.apple.com/radar"
     */
    @Generated
    @IsOptional
    @Selector("parser:didEndMappingPrefix:")
    default void parserDidEndMappingPrefix(@NotNull NSXMLParser parser, @NotNull String prefix) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:didStartElement:namespaceURI:qualifiedName:attributes:")
    default void parserDidStartElementNamespaceURIQualifiedNameAttributes(@NotNull NSXMLParser parser,
            @NotNull String elementName, @Nullable String namespaceURI, @Nullable String qName,
            @NotNull NSDictionary<String, String> attributeDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * sent when an end tag is encountered. The various parameters are supplied as above.
     */
    @Generated
    @IsOptional
    @Selector("parser:didStartMappingPrefix:toURI:")
    default void parserDidStartMappingPrefixToURI(@NotNull NSXMLParser parser, @NotNull String prefix,
            @NotNull String namespaceURI) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
    default void parserFoundAttributeDeclarationWithNameForElementTypeDefaultValue(@NotNull NSXMLParser parser,
            @NotNull String attributeName, @NotNull String elementName, @Nullable String type,
            @Nullable String defaultValue) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A comment (Text in a <!-- --> block) is reported to the delegate as a single string
     */
    @Generated
    @IsOptional
    @Selector("parser:foundCDATA:")
    default void parserFoundCDATA(@NotNull NSXMLParser parser, @NotNull NSData CDATABlock) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * sent when the namespace prefix in question goes out of scope.
     */
    @Generated
    @IsOptional
    @Selector("parser:foundCharacters:")
    default void parserFoundCharacters(@NotNull NSXMLParser parser, @NotNull String string) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The parser reports a processing instruction to you using this method. In the case above, target
     * == @"xml-stylesheet" and data == @"type='text/css' href='cvslog.css'"
     */
    @Generated
    @IsOptional
    @Selector("parser:foundComment:")
    default void parserFoundComment(@NotNull NSXMLParser parser, @NotNull String comment) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:foundElementDeclarationWithName:model:")
    default void parserFoundElementDeclarationWithNameModel(@NotNull NSXMLParser parser, @NotNull String elementName,
            @NotNull String model) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
    default void parserFoundExternalEntityDeclarationWithNamePublicIDSystemID(@NotNull NSXMLParser parser,
            @NotNull String name, @Nullable String publicID, @Nullable String systemID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This returns the string of the characters encountered thus far. You may not necessarily get the longest character
     * run. The parser reserves the right to hand these to the delegate as potentially many calls in a row to
     * -parser:foundCharacters:
     */
    @Generated
    @IsOptional
    @Selector("parser:foundIgnorableWhitespace:")
    default void parserFoundIgnorableWhitespace(@NotNull NSXMLParser parser, @NotNull String whitespaceString) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:foundInternalEntityDeclarationWithName:value:")
    default void parserFoundInternalEntityDeclarationWithNameValue(@NotNull NSXMLParser parser, @NotNull String name,
            @Nullable String value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * DTD handling methods for various declarations.
     */
    @Generated
    @IsOptional
    @Selector("parser:foundNotationDeclarationWithName:publicID:systemID:")
    default void parserFoundNotationDeclarationWithNamePublicIDSystemID(@NotNull NSXMLParser parser,
            @NotNull String name, @Nullable String publicID, @Nullable String systemID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The parser reports ignorable whitespace in the same way as characters it's found.
     */
    @Generated
    @IsOptional
    @Selector("parser:foundProcessingInstructionWithTarget:data:")
    default void parserFoundProcessingInstructionWithTargetData(@NotNull NSXMLParser parser, @NotNull String target,
            @Nullable String data) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
    default void parserFoundUnparsedEntityDeclarationWithNamePublicIDSystemIDNotationName(@NotNull NSXMLParser parser,
            @NotNull String name, @Nullable String publicID, @Nullable String systemID, @Nullable String notationName) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * this gives the delegate an opportunity to resolve an external entity itself and reply with the resulting data.
     */
    @Generated
    @IsOptional
    @Selector("parser:parseErrorOccurred:")
    default void parserParseErrorOccurred(@NotNull NSXMLParser parser, @NotNull NSError parseError) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * this reports a CDATA block to the delegate as an NSData.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("parser:resolveExternalEntityName:systemID:")
    default NSData parserResolveExternalEntityNameSystemID(@NotNull NSXMLParser parser, @NotNull String name,
            @Nullable String systemID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * ...and this reports a fatal error to the delegate. The parser will stop parsing.
     */
    @Generated
    @IsOptional
    @Selector("parser:validationErrorOccurred:")
    default void parserValidationErrorOccurred(@NotNull NSXMLParser parser, @NotNull NSError validationError) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * sent when the parser begins parsing of the document.
     */
    @Generated
    @IsOptional
    @Selector("parserDidEndDocument:")
    default void parserDidEndDocument(@NotNull NSXMLParser parser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Document handling methods
     */
    @Generated
    @IsOptional
    @Selector("parserDidStartDocument:")
    default void parserDidStartDocument(@NotNull NSXMLParser parser) {
        throw new java.lang.UnsupportedOperationException();
    }
}
